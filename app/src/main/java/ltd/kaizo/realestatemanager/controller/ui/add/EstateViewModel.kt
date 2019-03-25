package ltd.kaizo.realestatemanager.controller.ui.add

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ltd.kaizo.realestatemanager.model.Estate
import ltd.kaizo.realestatemanager.model.Photo
import ltd.kaizo.realestatemanager.repositories.EstateRepository
import ltd.kaizo.realestatemanager.utils.Utils
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
    val managerName = MutableLiveData<String>()
    val isSold = MutableLiveData<Boolean>()
    val dateIn = MutableLiveData<String>()
    val dateOut = MutableLiveData<String>()
    val isFinish = MutableLiveData<Boolean>()
    val pictureList: MutableList<Photo> = mutableListOf()
    val pictureListTmp: MutableList<Photo> = mutableListOf()
    val pictureTmp = MutableLiveData<Photo>()
    private var mainPicture = ""

    init {
        dateIn.value = Utils.todayDate
    }

    val typeArray = listOf(
        "Apt",
        "Loft",
        "House",
        "Flat",
        "Studio",
        "Other"
    )


    private fun insertPhoto(photo: Photo) {
        executor.execute { estateDataSource.insertPhoto(photo) }
    }

    private fun checkFieldView() = (
            description.value != ""
                    && description.value != null
                    && address.value != ""
                    && address.value != null
                    && postalCode.value != ""
                    && postalCode.value != null
                    && city.value != ""
                    && city.value != null
                    && surface.value != null
                    && surface.value != ""
                    && nbRoom.value != null
                    && nbBathroom.value != null
                    && nbBedroom.value != null
                    && type.value != null
                    && price.value != null
                    && price.value != "")

    private fun insertPhotoFromList(pictureList: List<Photo>, id: Long) {
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
                    if (isSold.value == null) {
                        isSold.value = false
                    }
                    val estateToCreate = Estate(
                        0,
                        "",
                        typeArray[type.value!!],
                        price.value?.toInt()!!,
                        surface.value?.toInt()!!,
                        nbRoom.value!!,
                        nbBathroom.value!!,
                        nbBedroom.value!!,
                        description.value!!,
                        address.value!!,
                        postalCode.value!!,
                        city.value!!,
                        isSold.value!!,
                        dateIn.value!!,
                        dateOut.value,
                        managerName.value!!
                    )
                    //ALL GREEN -> Insert Estate
                    insertEstate(estateToCreate)
                }
            }
        } else {
            message.value = "verify your data"
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
}