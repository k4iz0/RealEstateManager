package ltd.kaizo.realestatemanager.controller.ui.list

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.lifecycle.ViewModelProviders
import com.firebase.ui.auth.AuthUI
import com.google.android.material.navigation.NavigationView
import com.livinglifetechway.quickpermissions_kotlin.runWithPermissions
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_list_nav_header.*
import kotlinx.android.synthetic.main.list_activity.*
import ltd.kaizo.realestatemanager.R
import ltd.kaizo.realestatemanager.controller.ui.add.EstateActivity
import ltd.kaizo.realestatemanager.controller.ui.base.BaseActivity
import ltd.kaizo.realestatemanager.controller.ui.loan.LoanSimActivity
import ltd.kaizo.realestatemanager.controller.ui.login.LoginActivity
import ltd.kaizo.realestatemanager.controller.ui.map.MapActivity
import ltd.kaizo.realestatemanager.controller.ui.search.SearchActivity
import ltd.kaizo.realestatemanager.controller.ui.settings.SettingActivity
import ltd.kaizo.realestatemanager.injection.Injection
import ltd.kaizo.realestatemanager.model.User
import ltd.kaizo.realestatemanager.model.UserHelper
import ltd.kaizo.realestatemanager.utils.*
import ltd.kaizo.realestatemanager.utils.DataRecordHelper.getEstateListFromGson
import ltd.kaizo.realestatemanager.utils.Utils.showSnackBar

class ListActivity : BaseActivity(), NavigationView.OnNavigationItemSelectedListener {
    lateinit var listViewModel: ListViewModel
    private lateinit var currentUser: User
    /****************************
     *********   DESIGN   ********
     *****************************/

    override fun getFragmentLayout(): Int {
        return R.layout.list_activity
    }

    override fun configureDesign() {
        setSupportActionBar(activity_list_toolbar)
        this.configureViewModel()
        this.getDataFromIntent()
        this.configureCurrentUser()
        this.configureAndShowListFragment()
        this.configureAndShowDetailFragment()
        this.configureNavigationDrawer()
    }

    private fun getDataFromIntent() {
        if (intent.getStringExtra(ESTATE_LIST) != null) {
            listViewModel.searchResultList = getEstateListFromGson(intent.getStringExtra(ESTATE_LIST)).toMutableList()
        }
    }

    private fun configureViewModel() {
        val viewModelFactory = Injection.provideViewModelFactory(this)
        this.listViewModel = ViewModelProviders.of(this, viewModelFactory).get(ListViewModel::class.java)
    }

    private fun configureAndShowListFragment() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, ListFragment())
            .commit()
    }

    /**
     * show the detailFragment next to the list if the device is in landscape mode
     */
    private fun configureAndShowDetailFragment() {
        var detailFragment = DetailFragment()
        if (fragment_container_detail != null) {
            val args = Bundle()
            val id = if(listViewModel.estateId.value != null)listViewModel.estateId.value else -1
            args.putLong(ESTATE_ID, id!!)
            detailFragment.arguments = args
            detailFragment = DetailFragment()
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container_detail, detailFragment)
                .commit()
        }
    }

    /****************************
     ***  NAVIGATION DRAWER   ***
     ****************************/

    private fun configureNavigationDrawer() {
        val toggle = ActionBarDrawerToggle(
            this,
            activity_List_drawer_layout,
            activity_list_toolbar,
            R.string.open_drawer,
            R.string.close_drawer
        )
        activity_List_drawer_layout.addDrawerListener(toggle)
        toggle.syncState()
        activity_list_navigation_view.setNavigationItemSelectedListener(this)
        activity_list_navigation_view.itemIconTintList = null
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                activity_List_drawer_layout.openDrawer(GravityCompat.START)
                true
            }
            R.id.activity_main_drawer_settings -> {
                startActivity(Intent(this, SettingActivity::class.java))
                true
            }
            R.id.activity_main_drawer_map -> {
                runWithPermissions(FINE_LOCATION, COARSE_LOCATION) {
                    startActivity(Intent(this, MapActivity::class.java))
                }
                true
            }
             R.id.activity_main_drawer_loan -> {
                    startActivity(Intent(this, LoanSimActivity::class.java))
                true
            }
            R.id.activity_main_drawer_logout -> {
                this.signOutUserFromFirebase()
                showSnackBar(activity_list_coordinator_layout, getString(R.string.user_logout))
                true
            }
            else -> super.onOptionsItemSelected(item)
        }

    }

    private fun configureCurrentUser() {
        UserHelper.getUser(getCurrentUser()!!.uid)
            .addOnCompleteListener { task ->
                if (task.isSuccessful && task.result != null) {
                    currentUser = task.result!!.toObject<User>(User::class.java)!!
                    updateNavHeaderDesign()
                }
            }
    }

    private fun updateNavHeaderDesign() {
        nav_header_username.text = currentUser.username
        nav_header_email.text = currentUser.email
        Picasso.get().load(currentUser.urlPicture).into(nav_header_avatar)
    }

    private fun signOutUserFromFirebase() {
        AuthUI.getInstance()
            .signOut(this)
            .addOnSuccessListener {
                startActivity(Intent(this, LoginActivity::class.java))
            }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.menu_activity_list_add -> {
                val addActivity = Intent(this, EstateActivity::class.java)
                addActivity.putExtra(ESTATE_SOURCE, ESTATE_SOURCE_ADD)
                startActivity(addActivity)
                true
            }
            R.id.menu_activity_list_edit -> {
                if (listViewModel.estateId.value != null) {

                    val addActivity = Intent(this, EstateActivity::class.java)
                    addActivity.putExtra(ESTATE_ID, listViewModel.estateId.value!!)
                    addActivity.putExtra(ESTATE_SOURCE, ESTATE_SOURCE_EDIT)
                    startActivity(addActivity)
                    return true
                }
                showSnackBar(activity_list_coordinator_layout, getString(R.string.select_estate_edit))
                false
            }
            R.id.menu_activity_list_search -> {
                val searchActivity = Intent(this, SearchActivity::class.java)
                startActivity(searchActivity)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }

    }

}
