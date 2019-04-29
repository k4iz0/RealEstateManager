package ltd.kaizo.realestatemanager.controller.ui.search

import androidx.appcompat.widget.Toolbar
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.fragment_search.*
import ltd.kaizo.realestatemanager.R
import ltd.kaizo.realestatemanager.controller.ui.base.BaseActivity
import ltd.kaizo.realestatemanager.injection.Injection
import ltd.kaizo.realestatemanager.utils.Utils.showSnackBar

class SearchActivity : BaseActivity() {
    lateinit var searchViewModel: SearchViewModel
    override fun getFragmentLayout(): Int {
        return R.layout.activity_search
    }

    override fun configureDesign() {
        this.configureToolbar()
        this.configureViewModel()
        this.configureAndShowSearchFragment()
        this.configureObserver()
    }

    private fun configureViewModel() {
        val viewModelFactory = Injection.provideViewModelFactory(this)
        searchViewModel = ViewModelProviders.of(this,viewModelFactory).get(SearchViewModel::class.java)
    }
    private fun configureObserver() {
        searchViewModel.message.observe(
            this,
            Observer { message ->
                if (message != "" && message != null) {
                    showSnackBar(fragment_search_coordinator_layout, message)
                    searchViewModel.message.value = ""
                }

            })
    }
    private fun configureToolbar() {
        val toolbar = findViewById<Toolbar>(R.id.activity_search_toolbar)
        setSupportActionBar(toolbar)
        supportActionBar!!.setHomeButtonEnabled(true)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }
    private fun configureAndShowSearchFragment() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.activity_search_container, SearchFragment())
            .commit()
    }
}
