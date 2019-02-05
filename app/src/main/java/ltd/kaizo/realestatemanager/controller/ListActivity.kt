package ltd.kaizo.realestatemanager.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ltd.kaizo.realestatemanager.R
import ltd.kaizo.realestatemanager.controller.ui.list.ListFragment
import timber.log.Timber

class ListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_activity)
        Timber.plant(Timber.DebugTree())
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, ListFragment.newInstance())
                .commitNow()
        }
    }

}
