package ltd.kaizo.realestatemanager.controller.ui.loan

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_loan_sim.*
import ltd.kaizo.realestatemanager.R
import ltd.kaizo.realestatemanager.databinding.ActivityLoanSimBinding
import ltd.kaizo.realestatemanager.injection.Injection
import ltd.kaizo.realestatemanager.utils.Utils
import ltd.kaizo.realestatemanager.utils.Utils.hideKeyboard

class LoanSimActivity : AppCompatActivity() {
    private lateinit var loanSimViewModel: LoanSimViewModel
    private lateinit var binding:ActivityLoanSimBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_loan_sim)
        this.configureDesign()
    }


     fun configureDesign() {
        this.configureToolbar()
        this.configureViewModel()
        this.configureObserver()
        activity_loan_constraint_layout.setOnClickListener { hideKeyboard(this) }
    }

    private fun configureObserver() {
        //message for snackbar
        loanSimViewModel.message.observe(
            this,
            Observer { message ->
                if (message != "" && message != null) {
                    hideKeyboard(this)
                    Utils.showSnackBar(activity_loan_coordinator_layout, message)
                    loanSimViewModel.message.value = ""
                }

            })
    }

    private fun configureViewModel() {
        val viewModelFactory = Injection.provideViewModelFactory(this)
        loanSimViewModel = ViewModelProviders.of(this, viewModelFactory).get(LoanSimViewModel::class.java)
        binding.lifecycleOwner = this
        binding.loanSimViewModel = loanSimViewModel
    }

    private fun configureToolbar() {
        val toolbar = findViewById<Toolbar>(R.id.activity_loan_toolbar)
        setSupportActionBar(toolbar)
        supportActionBar!!.setHomeButtonEnabled(true)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }

}
