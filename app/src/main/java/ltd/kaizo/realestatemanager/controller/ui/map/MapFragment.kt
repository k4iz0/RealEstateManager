package ltd.kaizo.realestatemanager.controller.ui.map

import android.annotation.SuppressLint
import android.content.res.Resources
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.MapView
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MapStyleOptions
import com.google.android.gms.maps.model.MarkerOptions
import ltd.kaizo.realestatemanager.controller.ui.base.BaseFragment
import ltd.kaizo.realestatemanager.model.Estate
import timber.log.Timber


class MapFragment : BaseFragment(), OnMapReadyCallback {

    private lateinit var parentActivity: MapActivity
    private lateinit var mapViewModel: MapViewModel
    private lateinit var googleMap: GoogleMap
    private lateinit var mapView: MapView
    private var currentLatitude: Double = 0.0
    private var currentLongitude: Double = 0.0
    override val fragmentLayout: Int
        get() = ltd.kaizo.realestatemanager.R.layout.fragment_map

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(ltd.kaizo.realestatemanager.R.layout.fragment_map, container, false)
        mapView = rootView.findViewById(ltd.kaizo.realestatemanager.R.id.fragment_map_mapview) as MapView
        mapView.onCreate(savedInstanceState)
        this.initMap()
        mapView.onResume()
        return rootView
    }

    private fun configureViewModel() {
        parentActivity = activity as MapActivity
        mapViewModel = parentActivity.mapViewModel
    }

    override fun configureDesign() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun updateDesign() {
        this.configureViewModel()
        this.configureObserver()
    }

    private fun configureObserver() {
        //currentLocation
        mapViewModel.currentLocation.observe(this, Observer { currentLocation ->
            currentLatitude = currentLocation.latitude
            currentLongitude = currentLocation.longitude
        })
    }

    private fun initMap() {
        mapView.getMapAsync(this)
    }

    @SuppressLint("MissingPermission")
    override fun onMapReady(googleMap: GoogleMap?) {
        this.googleMap = googleMap!!
        with(this.googleMap) {
            isMyLocationEnabled = true
            moveCameraToLocation()
//        this.setMapViewStyle()
        }


//        this.configureGoogleMap()
    }

    private fun GoogleMap.moveCameraToLocation() {
        moveCamera(
            CameraUpdateFactory.newLatLngZoom(
                LatLng(currentLatitude, currentLongitude), 14.0f
            )
        )
    }

    fun setMarker(estate:Estate) {
        val markerOptions = MarkerOptions()
        val latLng = LatLng(currentLatitude, currentLongitude)
        // Position of Marker on Map
        markerOptions.position(latLng)

    }

    /**
     * Sets map view style.
     */
    private fun setMapViewStyle() {
        try {
            // Customise the styling of the base map using a JSON object defined
            // in a raw resource file.
            if (context != null) {
                val success = googleMap.setMapStyle(
                    MapStyleOptions.loadRawResourceStyle(
                        this.context, ltd.kaizo.realestatemanager.R.raw.style_json
                    )
                )
                if (!success) {
                    Timber.e("Style parsing failed.")
                }
            }
        } catch (e: Resources.NotFoundException) {
            Timber.e(e, "Can't find style. Error: ")
        }

    }


}
