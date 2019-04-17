package ltd.kaizo.realestatemanager.controller.ui.search

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ltd.kaizo.realestatemanager.repositories.EstateRepository
import java.util.concurrent.Executor

class SearchViewModel(private val estateDataSource: EstateRepository, private val executor: Executor) : ViewModel() {
    val message = MutableLiveData<String>()
    val area = MutableLiveData<String>()
    val surfaceMini = MutableLiveData<String>()
    val surfaceMaxi = MutableLiveData<String>()
    val nbRoomMini = MutableLiveData<String>()
    val nbRoomMaxi = MutableLiveData<String>()
    val nbBedroomMini = MutableLiveData<String>()
    val nbBedroomMaxi = MutableLiveData<String>()
    val nbBathroomMini = MutableLiveData<String>()
    val nbBathroomMaxi = MutableLiveData<String>()
    val priceMini = MutableLiveData<String>()
    val priceMaxi = MutableLiveData<String>()
    val poiList = MutableLiveData<String>()
    val type = MutableLiveData<Int>()
    val dateInMini = MutableLiveData<String>()
    val dateInMaxi = MutableLiveData<String>()
    val dateOutMini = MutableLiveData<String>()
    val dateOutMaxi = MutableLiveData<String>()
    val poiListTmp = MutableLiveData<MutableList<String>>()


}