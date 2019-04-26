package ltd.kaizo.realestatemanager.controller.ui.loan

import androidx.appcompat.widget.Toolbar
import androidx.lifecycle.ViewModelProviders
import ltd.kaizo.realestatemanager.R
import ltd.kaizo.realestatemanager.controller.ui.base.BaseActivity
import ltd.kaizo.realestatemanager.injection.Injection

class LoanSimActivity : BaseActivity() {
    private lateinit var loanSimViewModel: LoanSimViewModel

    override fun getFragmentLayout(): Int {
        return R.layout.activity_loan_sim
    }

    override fun configureDesign() {
        this.configureToolbar()
        this.configureViewModel()
    }

    private fun configureViewModel() {
        val viewModelFactory = Injection.provideViewModelFactory(this)
        loanSimViewModel = ViewModelProviders.of(this, viewModelFactory).get(LoanSimViewModel::class.java)
    }

    private fun configureToolbar() {
        val toolbar = findViewById<Toolbar>(R.id.activity_loan_toolbar)
        setSupportActionBar(toolbar)
        supportActionBar!!.setHomeButtonEnabled(true)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }

}
