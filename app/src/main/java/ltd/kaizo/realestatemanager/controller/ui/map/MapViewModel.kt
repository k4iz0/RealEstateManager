package ltd.kaizo.realestatemanager.controller.ui.map

import android.location.Location
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import io.reactivex.observers.DisposableObserver
import ltd.kaizo.realestatemanager.model.Estate
import ltd.kaizo.realestatemanager.model.api.geocoding.GeoData
import ltd.kaizo.realestatemanager.model.api.stream.GeoStream
import ltd.kaizo.realestatemanager.repositories.EstateRepository
import ltd.kaizo.realestatemanager.utils.Utils.getLocation
import timber.log.Timber
import java.util.concurrent.Executor

class MapViewModel(val estateDataSource: EstateRepository, val executor: Executor) : ViewModel() {

    val currentLocation = MutableLiveData<Location>()
    val estateList = estateDataSource.getAllEstate()
    val marker = MutableLiveData<MarkerOptions>()


    fun setGeoData(estateList: List<Estate>) {
        for (estate in estateList) {
            if (estate.latitude == 0.0 || estate.longitude == 0.0) {
                streamFetchGeoDataFromAddress(estate)
            } else {
                setMarker(estate)
            }
        }
    }

    private fun streamFetchGeoDataFromAddress(estate: Estate) {
        val disposable =
            GeoStream.streamFetchGeoDataFromAddress(getLocation(estate.address, estate.postalCode, estate.city))
                .subscribeWith(object : DisposableObserver<GeoData>() {

                    override fun onNext(geoData: GeoData) {
                        if (geoData.results != null) {
                            for (result in geoData.results!!) {
                                val lat = result.geometry?.location?.lat
                                val lng = result.geometry?.location?.lng
                                if (lat != null && lng != null) {
                                    executor.execute { estateDataSource.estateDao.updateLatLng(estate.id, lat, lng) }
                                }
                            }
                        }
                    }

                    override fun onError(e: Throwable) {
                        Timber.i("error retrieving data : $e")
                    }

                    override fun onComplete() {
                        setMarker(estate)
                    }
                }
                )
    }

    fun setMarker(estate: Estate) {
        val markerOptions = MarkerOptions()
        val latLng = LatLng(estate.latitude, estate.longitude)
        markerOptions.position(latLng)
        markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN))
        markerOptions.title(estate.id.toString())
        markerOptions.snippet("${estate.type}\n${estate.price}")
        marker.value = markerOptions
    }

}