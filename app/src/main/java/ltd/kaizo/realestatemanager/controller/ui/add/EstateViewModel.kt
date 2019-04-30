package ltd.kaizo.realestatemanager.controller.ui.add

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ltd.kaizo.realestatemanager.model.Estate
import ltd.kaizo.realestatemanager.model.EstatePhoto
import ltd.kaizo.realestatemanager.repositories.EstateRepository
import ltd.kaizo.realestatemanager.utils.*
import ltd.kaizo.realestatemanager.utils.DataRecordHelper.getListFromGson
import ltd.kaizo.realestatemanager.utils.DataRecordHelper.read
import ltd.kaizo.realestatemanager.utils.Utils.convertDollarToEuro
import java.security.AccessController.getContext
import java.util.concurrent.Executor

class EstateViewModel(private val estateDataSource: EstateRepository, private val executor: Executor) : ViewModel() {
    val message = MutableLiveData<String>()
    val description = MutableLiveData<String>()
    val address = MutableLiveData<String>()
    val postalCode = MutableLiveData<String>()
    val city = MutableLiveData<String>()
    val surface = MutableLiveData<String>()
    val nbRoom = MutableLiveData<Int>()
    val nbBedroom = MutableLiveData<Int>()
    val nbBathroom = MutableLiveData<Int>()
    val price = MutableLiveData<String>()
    val type = MutableLiveData<Int>()
    val poiList = MutableLiveData<String>()
    val managerName = MutableLiveData<String>()
    val isSold = MutableLiveData<Boolean>()
    val dateIn = MutableLiveData<String>()
    val dateOut = MutableLiveData<String>()
    val isFinish = MutableLiveData<Boolean>()
    val pictureList: MutableList<EstatePhoto> = mutableListOf()
    val pictureListTmp: MutableList<EstatePhoto> = mutableListOf()
    val pictureTmp = MutableLiveData<EstatePhoto>()
    val poiListTmp = MutableLiveData<MutableList<String>>()
    var estateId: Long = 0
    val typeArray = MutableLiveData<Array<String>>()
    private var mainPicture = ""

    init {
        dateIn.value = Utils.todayDate
    }

    fun getEstateById(id: Long): LiveData<Estate> {
        return estateDataSource.getEstateById(id)
    }

    fun getPictureListFromId(id: Long): LiveData<List<EstatePhoto>> {
        return estateDataSource.getPhotoListById(id)
    }

    private fun insertPhoto(estatePhoto: EstatePhoto) {
        executor.execute { estateDataSource.insertPhoto(estatePhoto) }
    }

    fun checkFieldView() = (
                     !description.value.isNullOrBlank()
                    && !address.value.isNullOrBlank()
                    && !postalCode.value.isNullOrBlank()
                    && !city.value.isNullOrBlank()
                    && !surface.value.isNullOrBlank()
                    && nbRoom.value != null
                    && nbBathroom.value != null
                    && nbBedroom.value != null
                    && type.value != null
                    && !price.value.isNullOrBlank()
    )
    private fun insertPhotoFromList(pictureList: List<EstatePhoto>, id: Long) {
        for (photo in pictureList) {
            photo.estateId = id
            insertPhoto(photo)
        }
    }

    fun createEstate() {

        if (checkFieldView()) {
            when {
                (pictureList.size == 0) -> message.value = "You must add at least 1 picture"
                !checkMainPicture() -> message.value = "You must choose a main picture"
                else -> {
                    this.configureDefaultValue()
                    val estateToCreate = Estate(
                        estateId,
                        "",
                        typeArray.value!![type.value!!],
                        price.value?.toInt()!!,
                        surface.value?.toInt()!!,
                        nbRoom.value!!,
                        nbBathroom.value!!,
                        nbBedroom.value!!,
                        description.value!!,
                        address.value!!,
                        postalCode.value!!,
                        city.value!!,
                        poiList.value!!,
                        isSold.value!!,
                        dateIn.value!!,
                        dateOut.value,
                        managerName.value!!,
                        95.0,
                        195.0
                    )
                    //ALL GREEN -> Insert Estate
                    insertEstate(estateToCreate)
                }
            }
        } else {
            message.value = "verify your data"
        }

    }

    private fun configureDefaultValue() {
        if (isSold.value == null) {
            isSold.value = false
        }
        if (poiList.value == null) poiList.value = ""
        if (read(CURRENT_CURRENCY, CURRENCY_EURO) == CURRENCY_DOLLAR) {
            price.value = convertDollarToEuro(price.value!!.toInt()).toString()
        }
    }

    private fun checkMainPicture(): Boolean {
        var valid = false
        for (picture in pictureListTmp) {
            if (picture.mainPicture)
                valid = true
            mainPicture = picture.uri
        }
        return valid
    }

    private fun insertEstate(estateToCreate: Estate) {
        executor.execute {
            val estateId = estateDataSource.insertEstate(estateToCreate)
            if (estateId.toInt() != -1) {
                insertPhotoFromList(pictureList, estateId)
                setMainPicture(estateId)
                message.postValue("estate successfully created")
                isFinish.postValue(true)
            } else {
                message.postValue("error inserting data")
            }
        }
    }

    private fun setMainPicture(estateId: Long) {
        executor.execute {
            estateDataSource.setMainPicture(estateId, mainPicture)
        }
    }

    fun updateUiWithData(estate: Estate) {
        description.value = estate.description
        surface.value = estate.surface.toString()
        address.value = estate.address
        postalCode.value = estate.postalCode
        city.value = estate.city
        price.value = estate.price.toString()
        dateIn.value = estate.dateIn
        dateOut.value = estate.dateOut
        if (estate.poi != "") {
            poiListTmp.value = getListFromGson(estate.poi).toMutableList()
        }
    }
}