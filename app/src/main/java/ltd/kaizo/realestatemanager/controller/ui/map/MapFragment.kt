package ltd.kaizo.realestatemanager.controller.ui.map

import android.annotation.SuppressLint
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
import ltd.kaizo.realestatemanager.R
import ltd.kaizo.realestatemanager.adapter.CustomInfoWindowAdapter
import ltd.kaizo.realestatemanager.controller.ui.base.BaseFragment
import ltd.kaizo.realestatemanager.controller.ui.list.DetailFragment
import ltd.kaizo.realestatemanager.utils.ESTATE_ID
import ltd.kaizo.realestatemanager.utils.ESTATE_SOURCE
import ltd.kaizo.realestatemanager.utils.ESTATE_SOURCE_MAP


class MapFragment : BaseFragment(), OnMapReadyCallback {

    private lateinit var parentActivity: MapActivity
    private lateinit var mapViewModel: MapViewModel
    private lateinit var googleMap: GoogleMap
    private lateinit var mapView: MapView
    private var currentLatitude: Double = 0.0
    private var currentLongitude: Double = 0.0
    override val fragmentLayout: Int
        get() = R.layout.fragment_map

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_map, container, false)
        mapView = rootView.findViewById(R.id.fragment_map_mapview) as MapView
        mapView.onCreate(savedInstanceState)
        this.initMap()
        mapView.onResume()
        return rootView
    }

    private fun configureViewModel() {
        parentActivity = activity as MapActivity
        mapViewModel = parentActivity.mapViewModel
    }

    override fun configureDesign() {}

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
        //estate list
        mapViewModel.estateList.observe(this, Observer { estateList ->
            mapViewModel.setGeoData(estateList)
        })
        // marker list
        mapViewModel.marker.observe(this, Observer { marker ->
            if (::googleMap.isInitialized) {
                this.googleMap.addMarker(marker)
                this.configureOnMarkerClick()
                this.configureOnMarkerInfoListener()
            }
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
            setInfoWindowAdapter(CustomInfoWindowAdapter(parentActivity))
        }

    }

    private fun configureOnMarkerClick() {
        this.googleMap.setOnMarkerClickListener { marker ->
            if (marker.isInfoWindowShown) {
                marker.hideInfoWindow()
                false
            } else {
                marker.showInfoWindow()
                false
            }

        }
    }

    private fun configureOnMarkerInfoListener() {
        this.googleMap.setOnInfoWindowClickListener { marker ->
            this.configureAndShowDetailFragment(marker.title)
        }
    }

    private fun configureAndShowDetailFragment(title: String) {
        val detailFragment = DetailFragment.newInstance()
        val args = Bundle()
        args.putLong(ESTATE_ID, title.toLong())
        args.putInt(ESTATE_SOURCE, ESTATE_SOURCE_MAP)
        detailFragment.arguments = args
        parentActivity.supportFragmentManager.beginTransaction()
            .replace(R.id.activity_map_fragment_container, detailFragment)
            .commit()

    }

    private fun GoogleMap.moveCameraToLocation() {
        moveCamera(
            CameraUpdateFactory.newLatLngZoom(
                LatLng(currentLatitude, currentLongitude), 14.0f
            )
        )
    }

}
