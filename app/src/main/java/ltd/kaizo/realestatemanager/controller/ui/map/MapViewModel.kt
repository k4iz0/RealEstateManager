package ltd.kaizo.realestatemanager.controller.ui.map

import android.location.Location
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ltd.kaizo.realestatemanager.repositories.EstateRepository
import java.util.concurrent.Executor

class MapViewModel(val estateDataSource: EstateRepository, val executor: Executor) : ViewModel() {
    val currentLocation = MutableLiveData<Location>()
}