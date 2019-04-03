package ltd.kaizo.realestatemanager.controller.ui.map

import android.annotation.SuppressLint
import android.content.res.Resources
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.MapView
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MapStyleOptions
import ltd.kaizo.realestatemanager.controller.ui.base.BaseFragment
import timber.log.Timber


class MapFragment : BaseFragment(), OnMapReadyCallback {

    private lateinit var parentActivity: MapActivity
    private lateinit var mapViewModel: MapViewModel
    private lateinit var  googleMap :GoogleMap
    private lateinit var mapView:MapView
    override val fragmentLayout: Int
        get() = ltd.kaizo.realestatemanager.R.layout.fragment_map

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(ltd.kaizo.realestatemanager.R.layout.fragment_map, container, false)
        mapView = rootView.findViewById(ltd.kaizo.realestatemanager.R.id.fragment_map_mapview) as MapView
        mapView.onCreate(savedInstanceState)
        this.initMap()
        mapView.onResume()
        return rootView    }

    private fun initMap() {
        mapView.getMapAsync(this)
    }

    @SuppressLint("MissingPermission")
    override fun onMapReady(googleMap: GoogleMap?) {
        this.googleMap = googleMap!!
        with(this.googleMap){
           isMyLocationEnabled = true
            moveCamera(CameraUpdateFactory.newLatLngZoom(
                LatLng(mapViewModel.currentLocation.value!!.latitude,
                mapViewModel.currentLocation.value!!.longitude),
                14.0f))
//        this.setMapViewStyle()
        }


//        this.configureGoogleMap()
    }
    override fun configureDesign() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    override fun updateDesign() {
       this.configureViewModel()
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

    private fun configureViewModel() {
        parentActivity = activity as MapActivity
        mapViewModel = parentActivity.mapViewModel
    }



}
