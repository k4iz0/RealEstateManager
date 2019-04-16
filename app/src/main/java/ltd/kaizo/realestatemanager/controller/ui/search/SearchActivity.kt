package ltd.kaizo.realestatemanager.controller.ui.search

import androidx.appcompat.widget.Toolbar
import androidx.lifecycle.ViewModelProviders
import ltd.kaizo.realestatemanager.R
import ltd.kaizo.realestatemanager.controller.ui.base.BaseActivity
import ltd.kaizo.realestatemanager.injection.Injection

class SearchActivity : BaseActivity() {
    private lateinit var searchViewModel: SearchViewModel
    override fun getFragmentLayout(): Int {
        return R.layout.activity_search
    }

    override fun configureDesign() {
        this.configureToolbar()
        this.configureViewModel()
    }

    private fun configureViewModel() {
        val viewModelFactory = Injection.provideViewModelFactory(this)
        searchViewModel = ViewModelProviders.of(this,viewModelFactory).get(SearchViewModel::class.java)

    }

    private fun configureToolbar() {
        val toolbar = findViewById<Toolbar>(R.id.activity_estate_toolbar)
        setSupportActionBar(toolbar)
        supportActionBar!!.setHomeButtonEnabled(true)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }

}
