package ltd.kaizo.realestatemanager.controller.ui.list

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.list_activity.*
import ltd.kaizo.realestatemanager.R
import ltd.kaizo.realestatemanager.controller.ui.base.BaseActivity

class ListActivity : BaseActivity(), NavigationView.OnNavigationItemSelectedListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null) {
           this.configureAndShowFragment()
        }
    }

    /****************************
    *********   DESIGN   ********
    *****************************/

    override fun getFragmentLayout(): Int {
        return R.layout.list_activity
    }

    override fun configureDesign() {
        this.configureNavigationDrawer()
    }

    private fun configureAndShowFragment() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, ListFragment.newInstance())
            .commit()
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
                Toast.makeText(this, "wip for add button", Toast.LENGTH_SHORT).show()
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
