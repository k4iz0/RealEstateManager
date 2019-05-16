package ltd.kaizo.realestatemanager.controller.ui.add

import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.lifecycle.ViewModelProviders
import com.livinglifetechway.quickpermissions_kotlin.runWithPermissions
import ltd.kaizo.realestatemanager.R
import ltd.kaizo.realestatemanager.controller.ui.base.BaseActivity
import ltd.kaizo.realestatemanager.injection.Injection
import ltd.kaizo.realestatemanager.utils.*

class EstateActivity : BaseActivity() {
    lateinit var estateViewModel: EstateViewModel
    private var sourceTag = 0
    private var estateId :Long= 0
    override fun getFragmentLayout(): Int {
        return R.layout.activity_estate
    }

    override fun configureDesign() {
        this.configureToolbar()
        this.getDataFromIntent()
        this.configureViewModel()
        runWithPermissions(WRITE_EXT_PERM, CAMERA_PERM, READ_EXT_PERM) {
            this.configureAndShowAddFragment()
        }
    }

    private fun getDataFromIntent() {
        this.sourceTag = intent.getIntExtra(ESTATE_SOURCE,0)
        this.estateId = intent.getLongExtra(ESTATE_ID,0)
    }

    private fun configureToolbar() {
        val toolbar = findViewById<Toolbar>(R.id.activity_estate_toolbar)
        setSupportActionBar(toolbar)
        supportActionBar!!.setHomeButtonEnabled(true)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }

    private fun configureAndShowAddFragment() {
        val args = Bundle()
        args.putInt(ESTATE_SOURCE, this.sourceTag)
        args.putLong(ESTATE_ID, this.estateId)
        val addFragment = AddFragment.newInstance()
        addFragment.arguments = args
        supportFragmentManager.beginTransaction()
            .replace(R.id.activity_estate_container, addFragment)
            .commit()
    }

    private fun configureViewModel() {
        val viewModelFactory = Injection.provideViewModelFactory(this)
        estateViewModel = ViewModelProviders.of(this, viewModelFactory).get(EstateViewModel::class.java)
        estateViewModel.managerName.value = getCurrentUser()!!.displayName.toString()
        estateViewModel.typeArray.value = resources.getStringArray(R.array.typeArray)
    }

}
