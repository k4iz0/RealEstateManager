package ltd.kaizo.realestatemanager.controller.ui.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ltd.kaizo.realestatemanager.model.Estate
import ltd.kaizo.realestatemanager.model.EstatePhoto
import ltd.kaizo.realestatemanager.repositories.EstateRepository
import ltd.kaizo.realestatemanager.utils.CurrencyUtils.formatNumberFromCurrency
import ltd.kaizo.realestatemanager.utils.DateUtils.getStringFromDate

class ListViewModel(private val estateDataSource: EstateRepository) : ViewModel() {
    val estateList = estateDataSource.getAllEstate()
    var searchResultList = mutableListOf<Estate>()
    val estateId = MutableLiveData<Long>()
    val description = MutableLiveData<String>()
    val address = MutableLiveData<String>()
    val postalCode = MutableLiveData<String>()
    val city = MutableLiveData<String>()
    val surface = MutableLiveData<String>()
    val nbRoom = MutableLiveData<String>()
    val nbBedroom = MutableLiveData<String>()
    val nbBathroom = MutableLiveData<String>()
    val price = MutableLiveData<String>()
    val managerName = MutableLiveData<String>()
    val dateIn = MutableLiveData<String>()
    val dateOut = MutableLiveData<String>()
    val isSold = MutableLiveData<Boolean>()

    fun getEstateById(id: Long): LiveData<Estate> {
        return estateDataSource.getEstateById(id)
    }

    fun getPictureListFromId(id: Long): LiveData<List<EstatePhoto>> {
        return estateDataSource.getPhotoListById(id)
    }

    fun updateUiWithData(estate: Estate) {
        description.value = estate.description
        surface.value = estate.surface.toString()
        nbRoom.value = estate.nbRoom.toString()
        nbBedroom.value = estate.nbBedroom.toString()
        nbBathroom.value = estate.nbBathroom.toString()
        address.value = estate.address
        postalCode.value = estate.postalCode
        city.value = estate.city
        price.value = formatNumberFromCurrency(estate.price)
        managerName.value = estate.estateManager
        dateOut.value = getStringFromDate(estate.dateOut)
        dateIn.value = getStringFromDate(estate.dateIn)
        isSold.value = estate.isSold
    }


}
