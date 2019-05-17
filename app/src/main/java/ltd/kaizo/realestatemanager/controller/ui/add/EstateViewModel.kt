package ltd.kaizo.realestatemanager.controller.ui.add

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ltd.kaizo.realestatemanager.model.Estate
import ltd.kaizo.realestatemanager.model.EstatePhoto
import ltd.kaizo.realestatemanager.repositories.EstateRepository
import ltd.kaizo.realestatemanager.utils.*
import ltd.kaizo.realestatemanager.utils.CurrencyUtils.convertDollarToEuro
import ltd.kaizo.realestatemanager.utils.DataRecordHelper.getListFromGson
import ltd.kaizo.realestatemanager.utils.DataRecordHelper.read
import ltd.kaizo.realestatemanager.utils.DateUtils.getDateFromString
import ltd.kaizo.realestatemanager.utils.DateUtils.getStringFromDate
import ltd.kaizo.realestatemanager.utils.DateUtils.todayDate
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
        dateIn.value = todayDate
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

    /**
     * check if all fields are not empty or null
     */
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

    /**
     * insert all photo in database with the appropriate id
     * @param pictureList
     * @param id of the estate
     */
    private fun insertPhotoFromList(pictureList: List<EstatePhoto>, id: Long) {
        for (photo in pictureList) {
            photo.estateId = id
            insertPhoto(photo)
        }
    }

    /**
     * check all fields, set default value and create an estate
     */
    fun createEstate() {

        if (checkFieldView()) {
            when {
                (pictureList.size == 0) -> message.value = STR_VERIFY_PICTURE
                !checkMainPicture() -> message.value = STR_VERIFY_MAIN_PICTURE
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
                        getDateFromString(dateIn.value)!!,
                        getDateFromString(dateOut.value),
                        managerName.value!!,
                        95.0,
                        195.0
                    )
                    //ALL GREEN -> Insert Estate
                    insertEstate(estateToCreate)
                }
            }
        } else {
            message.value = STR_VERIFY_DATA
        }

    }

    /**
     * configure the default value to prevent null value in database
     * and convert price to euro
     */
    private fun configureDefaultValue() {
        if (isSold.value == null) isSold.value = false
        if (poiList.value == null) poiList.value = ""
        if (dateOut.value.equals("")) dateOut.value = null
        if (read(CURRENT_CURRENCY, CURRENCY_EURO) == CURRENCY_DOLLAR) {
            price.value = convertDollarToEuro(price.value!!.toInt()).toString()
        }
    }

    /**
     * check if mainPicture is set
     *
     * @return
     */
    private fun checkMainPicture(): Boolean {
        var valid = false
        for (picture in pictureListTmp) {
            if (picture.mainPicture) {
                valid = true
                mainPicture = picture.uri
            }
        }
        return valid
    }

    /**
     * insert an estate in database
     *
     * @param estateToCreate
     */
    private fun insertEstate(estateToCreate: Estate) {
        executor.execute {
            val estateId = estateDataSource.insertEstate(estateToCreate)
            if (estateId.toInt() != -1) {
                insertPhotoFromList(pictureList, estateId)
                setMainPicture(estateId)
                message.postValue(STR_ESTATE_SUCCESS)
                isFinish.postValue(true)
            } else {
                message.postValue(STR_ERROR_INSERT_DATA)
            }
        }
    }

    private fun setMainPicture(estateId: Long) {
        executor.execute {
            estateDataSource.setMainPicture(estateId, mainPicture)
        }
    }

    /**
     * update the ui with the data of an estate
     *
     * @param estate
     */
    fun updateUiWithData(estate: Estate) {
        description.value = estate.description
        surface.value = estate.surface.toString()
        address.value = estate.address
        postalCode.value = estate.postalCode
        city.value = estate.city
        price.value = estate.price.toString()
        dateOut.value = getStringFromDate(estate.dateOut)
        dateIn.value = getStringFromDate(estate.dateIn)
        if (estate.poi != "") {
            poiListTmp.value = getListFromGson(estate.poi).toMutableList()
        }
    }
}