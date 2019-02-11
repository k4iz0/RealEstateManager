package ltd.kaizo.realestatemanager.controller.ui.list

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.list_activity.*
import ltd.kaizo.realestatemanager.R
import timber.log.Timber

class ListActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_activity)
        Timber.plant(Timber.DebugTree())
        setSupportActionBar(activity_list_toolbar)
        this.configureNavigationDrawer()
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, ListFragment.newInstance())
                .commit()
        }
    }

    /****************************
     ***   NAVIGATION DRAWER   ***
     *****************************/
    private fun configureNavigationView() {
//        activity_list_nav_view.setOnClickListener(this)
    }
    private fun configureNavigationDrawer() {
        val toggle = ActionBarDrawerToggle(this, activity_List_drawer_layout, R.string.open_drawer,R.string.close_drawer)
        activity_List_drawer_layout.addDrawerListener(toggle)
        toggle.syncState()
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

    override fun onBackPressed() {
        val sfm = supportFragmentManager
        if (sfm.backStackEntryCount > 0) {
            sfm.popBackStack()
        } else {
            super.onBackPressed()
        }
    }
}
