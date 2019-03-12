package ltd.kaizo.realestatemanager.controller.ui.add

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ltd.kaizo.realestatemanager.model.Estate
import ltd.kaizo.realestatemanager.model.Photo
import ltd.kaizo.realestatemanager.repositories.EstateRepository
import java.util.concurrent.Executor

class EstateViewModel(private val estateDataSource: EstateRepository, private val executor: Executor) : ViewModel() {
    val message = MutableLiveData<String>()

    val description = MutableLiveData<String>()
    val location = MutableLiveData<String>()
    val surface = MutableLiveData<Int>()
    val nbRoom = MutableLiveData<Int>()
    val nbBedroom = MutableLiveData<Int>()
    val nbBathroom = MutableLiveData<Int>()
    val price = MutableLiveData<String>()
    val type = MutableLiveData<Int>()

    var managerName = MutableLiveData<String>()

    init {
        this.configureValues()
    }

    fun getPhotoListById(id: Int): LiveData<List<Photo>> {
        return estateDataSource.getPhotoListById(id)
    }

    private fun configureValues() {
        if (surface.value == null) {
            surface.value = 0
        }
        if (nbRoom.value == null) {
            nbRoom.value = 0
        }
        if (nbBedroom.value == null) {
            nbBedroom.value = 0
        }
        if (nbBathroom.value == null) {
            nbBathroom.value = 0
        }
    }

    fun insertPhoto(photo: Photo) {
        executor.execute { estateDataSource.insertPhoto(photo) }
    }

    fun createEstate(estate: Estate) {
        executor.execute { estateDataSource.insertEstate(estate) }
    }

    fun checkFieldView(): Boolean =
        (description.value != ""
                && location.value != ""
                && surface.value != null
                && nbRoom.value != null
                && nbBathroom.value != null
                && nbBedroom.value != null
                && type.value != null
                && price.value != null
                && price.value != "")


}