package ltd.kaizo.realestatemanager.controller.ui.add

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ltd.kaizo.realestatemanager.model.Estate
import ltd.kaizo.realestatemanager.repositories.EstateRepository
import java.util.concurrent.Executor

class EstateViewModel(val estateDataSource: EstateRepository, val executor: Executor) : ViewModel() {

    private val _description = MutableLiveData<String>()
    private val _location = MutableLiveData<String>()
    private val _surface = MutableLiveData<Int>()
    private val _nbRoom = MutableLiveData<Int>()
    private val _nbBedroom = MutableLiveData<Int>()
    private val _nbBathroom = MutableLiveData<Int>()

    val description: LiveData<String>
        get() = _description
    val location: LiveData<String>
        get() = _location
    val surface: LiveData<Int>
        get() = _surface
    val nbRoom: LiveData<Int>
        get() = _nbRoom
    val nbBedroom: LiveData<Int>
        get() = _nbBedroom
    val nbBathroom: LiveData<Int>
        get() = _nbBathroom


    fun createEstate(estate: Estate) {
        executor.execute { estateDataSource.insertEstate(estate) }
    }

    fun checkFieldView(): Boolean {

//        if (!fragment_add_description_edittext.text.isNullOrBlank()
//            && !fragment_add_location_edittext.text.isNullOrBlank()
//            && !fragment_add_surface_edittext.text.isNullOrEmpty() && fragment_add_surface_edittext.text.isDigitsOnly()
//            && !fragment_add_nb_room_edittext.text.isNullOrEmpty() && fragment_add_nb_room_edittext.text.isDigitsOnly()
//            && !fragment_add_nb_bedroom_edittext.text.isNullOrEmpty() && fragment_add_nb_bedroom_edittext.text.isDigitsOnly()
//            && !fragment_add_nb_bathroom_edittext.text.isNullOrEmpty() && fragment_add_nb_bathroom_edittext.text.isDigitsOnly()
//        ) {
//            description = fragment_add_description_edittext.text.toString()
//            location = fragment_add_location_edittext.text.toString()
//            surface = fragment_add_surface_edittext.text.toString().toInt()
//            nbRoom = fragment_add_surface_edittext.text.toString().toInt()
//            nbBedroom = fragment_add_nb_bedroom_edittext.text.toString().toInt()
//            nbBathroom = fragment_add_nb_bathroom_edittext.text.toString().toInt()
        return (description.value != ""
                && location.value != ""
                && surface.value != 0
                && nbRoom.value != 0
                && nbBathroom.value != 0
                && nbBedroom.value != 0)
    }
}