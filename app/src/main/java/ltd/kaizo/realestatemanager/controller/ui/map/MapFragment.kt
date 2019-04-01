package ltd.kaizo.realestatemanager.controller.ui.map

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.MapView
import com.google.android.gms.maps.OnMapReadyCallback
import ltd.kaizo.realestatemanager.R
import ltd.kaizo.realestatemanager.controller.ui.base.BaseFragment

class MapFragment : BaseFragment(), OnMapReadyCallback {

    private lateinit var parentActivity: MapActivity
    private lateinit var mapViewModel: MapViewModel
    private lateinit var  googleMap :GoogleMap
    private lateinit var mapView:MapView
    override val fragmentLayout: Int
        get() = R.layout.fragment_map

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_map, container, false)
        mapView = rootView.findViewById(R.id.fragment_map_mapview) as MapView
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
//        this.setMapViewStyle()
//        this.configureGoogleMap()
    }
    override fun configureDesign() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    override fun updateDesign() {
       this.configureViewModel()
    }


    private fun configureViewModel() {
        parentActivity = activity as MapActivity
        mapViewModel = parentActivity.mapViewModel
    }



}
