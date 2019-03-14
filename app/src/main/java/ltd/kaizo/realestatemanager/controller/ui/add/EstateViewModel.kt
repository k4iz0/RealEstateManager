package ltd.kaizo.realestatemanager.controller.ui.add

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ltd.kaizo.realestatemanager.model.Estate
import ltd.kaizo.realestatemanager.model.Photo
import ltd.kaizo.realestatemanager.repositories.EstateRepository
import ltd.kaizo.realestatemanager.utils.Utils
import timber.log.Timber
import java.util.concurrent.Executor

class EstateViewModel(private val estateDataSource: EstateRepository, private val executor: Executor) : ViewModel() {
    val message = MutableLiveData<String>()
    val description = MutableLiveData<String>()
    val location = MutableLiveData<String>()
    val surface = MutableLiveData<String>()
    val nbRoom = MutableLiveData<Int>()
    val nbBedroom = MutableLiveData<Int>()
    val nbBathroom = MutableLiveData<Int>()
    val price = MutableLiveData<String>()
    val type = MutableLiveData<Int>()
    var managerName = MutableLiveData<String>()
    val isFinish = MutableLiveData<Boolean>()
    val pictureList :MutableList<Photo> = mutableListOf()

    val typeArray = listOf(
        "Apt",
        "Loft",
        "House",
        "Flat",
        "Studio",
        "Other"
    )

//    fun getPhotoListById(id: Int): LiveData<List<Photo>> {
//        return estateDataSource.getPhotoListById(id)
//    }

    fun insertPhoto(photo: Photo) {
        executor.execute { estateDataSource.insertPhoto(photo) }
    }

    private fun checkFieldView(): Boolean =(description.value != ""
                && location.value != ""
                && surface.value != null
                && surface.value != ""
                && nbRoom.value != null
                && nbBathroom.value != null
                && nbBedroom.value != null
                && type.value != null
                && price.value != null
                && price.value != "")

    fun insertPhotoFromList(pictureList :List<Photo>, id : Long) {
        for (photo in pictureList) {
            photo.estateId=id
            insertPhoto(photo)
        }
    }
    fun createEstate() {

        if (checkFieldView()) {
            val estateToCreate = Estate(
                0,
                typeArray[type.value!!],
                price.value?.toInt()!!,
                surface.value?.toInt()!!,
                nbRoom.value!!,
                nbBathroom.value!!,
                nbBedroom.value!!,
                description.value!!,
                location.value!!,
                Utils.getStaticMapUrlFromAddress(location.value!!),
                true,
                "18/02/2019",
                "",
                managerName.value!!
            )
            executor.execute {
               val estateId = estateDataSource.insertEstate(estateToCreate)

            if (estateId.toInt() != -1) {
                insertPhotoFromList(pictureList,estateId)
                message.postValue("estate successfully created")
                isFinish.postValue(true)
            } else {
                message.postValue("error inserting data")
            }
        }

        } else {
            message.value = "verify your data"
        }

    }
}