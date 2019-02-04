package ltd.kaizo.realestatemanager.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ltd.kaizo.realestatemanager.R
import ltd.kaizo.realestatemanager.controller.ui.list.ListFragment

class ListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, ListFragment.newInstance())
                .commitNow()
        }
    }

}
