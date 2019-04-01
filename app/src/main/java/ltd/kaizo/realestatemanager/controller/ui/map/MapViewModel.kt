package ltd.kaizo.realestatemanager.controller.ui.map

import android.location.Location
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MapViewModel : ViewModel() {
    val currentLocation = MutableLiveData<Location>()
}