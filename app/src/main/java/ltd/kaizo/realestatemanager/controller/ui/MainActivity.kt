package ltd.kaizo.realestatemanager.controller.ui

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.list_activity.*
import ltd.kaizo.realestatemanager.R
import ltd.kaizo.realestatemanager.controller.ui.list.ListFragment
import timber.log.Timber

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_activity)
        Timber.plant(Timber.DebugTree())
        setSupportActionBar(activity_list_toolbar)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, ListFragment.newInstance())
                .commit()
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

    override fun onBackPressed() {
        val sfm = supportFragmentManager
        if (sfm.backStackEntryCount > 0) {
            sfm.popBackStack()
        } else {
            super.onBackPressed()
        }
    }
}
