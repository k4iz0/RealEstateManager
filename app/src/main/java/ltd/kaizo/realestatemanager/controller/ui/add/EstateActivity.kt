package ltd.kaizo.realestatemanager.controller.ui.add

import android.content.Intent
import android.net.Uri
import android.provider.MediaStore
import androidx.appcompat.widget.Toolbar
import androidx.lifecycle.ViewModelProviders
import ltd.kaizo.realestatemanager.R
import ltd.kaizo.realestatemanager.controller.ui.base.BaseActivity
import ltd.kaizo.realestatemanager.injection.Injection
import ltd.kaizo.realestatemanager.utils.PERMS
import ltd.kaizo.realestatemanager.utils.RC_IMAGE_PERMS
import pub.devrel.easypermissions.EasyPermissions

class EstateActivity : BaseActivity() {
    lateinit var estateViewModel: EstateViewModel
    override fun getFragmentLayout(): Int {
        return R.layout.activity_estate
    }

    override fun configureDesign() {
        this.configureToolbar()
        this.configureViewModel()
        this.configureAndShowAddFragment()
    }

    private fun configureToolbar() {
        val toolbar = findViewById<Toolbar>(R.id.activity_estate_toolbar)
        setSupportActionBar(toolbar)
        supportActionBar!!.setHomeButtonEnabled(true)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }

    private fun configureAndShowAddFragment() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.activity_estate_container, AddFragment.newInstance())
            .commit()
    }

    private fun configureViewModel() {
        val viewModelFactory = Injection.provideViewModelFactory(this)
        estateViewModel = ViewModelProviders.of(this, viewModelFactory).get(EstateViewModel::class.java)
    }



}
