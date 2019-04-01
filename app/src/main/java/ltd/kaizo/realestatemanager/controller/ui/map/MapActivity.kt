package ltd.kaizo.realestatemanager.controller.ui.map

import android.content.Context
import androidx.lifecycle.ViewModelProviders
import com.google.android.gms.common.ConnectionResult
import com.google.android.gms.common.GoogleApiAvailability
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.livinglifetechway.quickpermissions_kotlin.runWithPermissions
import kotlinx.android.synthetic.main.activity_map.*
import ltd.kaizo.realestatemanager.R
import ltd.kaizo.realestatemanager.controller.ui.base.BaseActivity
import ltd.kaizo.realestatemanager.injection.Injection
import ltd.kaizo.realestatemanager.utils.RC_ERROR_DIALOG_REQUEST
import ltd.kaizo.realestatemanager.utils.Utils.showSnackBar
import timber.log.Timber

class MapActivity : BaseActivity() {
    private lateinit var fusedLocationProviderClient: FusedLocationProviderClient
    lateinit var mapViewModel: MapViewModel

    override fun getFragmentLayout(): Int {
        return R.layout.activity_map
    }

    override fun configureDesign() {
        this.configureViewModel()
        this.getCurrentLocation()
    }
    private fun configureViewModel() {
        val viewModelFactory = Injection.provideViewModelFactory(this)
        this.mapViewModel = ViewModelProviders.of(this, viewModelFactory).get(MapViewModel::class.java)
    }

    private fun getCurrentLocation() {
        if (isServiceOK()) {
            runWithPermissions(Context.LOCATION_SERVICE) {
                this.fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this)
                try {
                    val location = this.fusedLocationProviderClient.lastLocation
                    location.addOnCompleteListener { task ->
                        if (task.isSuccessful && task.result != null) {
                           mapViewModel.currentLocation.value = task.result
                            this.configureAndShowMapFragment()
                        } else {
                            showSnackBar(activity_map_coordinator_layout, getString(R.string.unable_get_location))
                        }
                    }
                } catch (e: SecurityException) {
                    Timber.e("security exception : %s", e.message)
                    showSnackBar(activity_map_coordinator_layout, getString(R.string.unable_get_location))
                }
            }
        }
    }

    private fun configureAndShowMapFragment() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_detail_map_container, MapFragment())
            .commit()
    }

    /**
     * check if the Google Play services are available to make map request
     *
     * @return Boolean boolean
     */
    private fun isServiceOK(): Boolean {
        val available = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this)
        if (available == ConnectionResult.SUCCESS) {
            return true
        } else if (GoogleApiAvailability.getInstance().isUserResolvableError(available)) {
            val dialog = GoogleApiAvailability.getInstance().getErrorDialog(this, available, RC_ERROR_DIALOG_REQUEST)
        } else {
            showSnackBar(activity_map_coordinator_layout, getString(R.string.map_request_error))
        }
        return false
    }


}
