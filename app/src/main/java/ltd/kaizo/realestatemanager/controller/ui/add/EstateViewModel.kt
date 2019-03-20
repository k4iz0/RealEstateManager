package ltd.kaizo.realestatemanager.controller.ui.add

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ltd.kaizo.realestatemanager.model.Estate
import ltd.kaizo.realestatemanager.model.Photo
import ltd.kaizo.realestatemanager.repositories.EstateRepository
import timber.log.Timber
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
    val isFinish = MutableLiveData<Boolean>()
    val pictureList: MutableList<Photo> = mutableListOf()
    val pictureTmp = MutableLiveData<Photo>()


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
                    && postalCode.value != ""
                    && city.value != ""
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
            if (pictureList.size == 0) {
                message.value = "You must add at least 1 picture"
            } else {
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
                    "",
                    managerName.value!!
                )
                executor.execute {
                    val estateId = estateDataSource.insertEstate(estateToCreate)
                    if (estateId.toInt() != -1) {
                        setMainPicture(estateId, pictureList[0].uri)
                        insertPhotoFromList(pictureList, estateId)
                        message.postValue("estate successfully created")
                        isFinish.postValue(true)
                    } else {
                        message.postValue("error inserting data")
                    }
                }
            }
        } else {
            message.value = "verify your data"
        }

    }

    private fun setMainPicture(estateId: Long, uri: String) {
        executor.execute {
            estateDataSource.setMainPicture(estateId, uri)
        }
    }
}