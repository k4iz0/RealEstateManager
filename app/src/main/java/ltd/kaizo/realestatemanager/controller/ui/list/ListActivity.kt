package ltd.kaizo.realestatemanager.controller.ui.list

import android.content.Intent
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.lifecycle.ViewModelProviders
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.list_activity.*
import ltd.kaizo.realestatemanager.R
import ltd.kaizo.realestatemanager.controller.ui.add.EstateActivity
import ltd.kaizo.realestatemanager.controller.ui.base.BaseActivity
import ltd.kaizo.realestatemanager.controller.ui.detail.DetailFragment
import ltd.kaizo.realestatemanager.injection.Injection

class ListActivity : BaseActivity(), NavigationView.OnNavigationItemSelectedListener {
    private lateinit var listViewModel: ListViewModel
    /****************************
     *********   DESIGN   ********
     *****************************/

    override fun getFragmentLayout(): Int {
        return R.layout.list_activity
    }

    override fun configureDesign() {
        this.configureViewModel()
        this.configureAndShowListFragment()
        this.configureAndShowDetailFragment()
        this.configureNavigationDrawer()
    }

    private fun configureViewModel() {
        val viewModelFactory = Injection.provideViewModelFactory(this)
        listViewModel = ViewModelProviders.of(this, viewModelFactory).get(ListViewModel::class.java)
    }

    private fun configureAndShowListFragment() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, ListFragment.newInstance())
            .commit()
    }

    private fun configureAndShowDetailFragment() {
        var detailFragment = supportFragmentManager.findFragmentById(R.id.fragment_container_detail)
        if (detailFragment != null && fragment_container_detail != null) {
            detailFragment = DetailFragment.newInstance()
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
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                activity_List_drawer_layout.openDrawer(GravityCompat.START)
                true
            }
            else -> super.onOptionsItemSelected(item)
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
                startActivity(addActivity)
                true
            }
            R.id.menu_activity_list_edit -> {
                Toast.makeText(this, "wip for edit button", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.menu_activity_list_search -> {
                Toast.makeText(this, "wip for search button", Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }

    }

}
