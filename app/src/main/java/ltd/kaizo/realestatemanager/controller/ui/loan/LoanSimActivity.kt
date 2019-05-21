package ltd.kaizo.realestatemanager.controller.ui.loan

import android.content.Context
import android.graphics.Rect
import android.os.Bundle
import android.view.MotionEvent
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_loan_sim.*
import ltd.kaizo.realestatemanager.R
import ltd.kaizo.realestatemanager.databinding.ActivityLoanSimBinding
import ltd.kaizo.realestatemanager.injection.Injection
import ltd.kaizo.realestatemanager.utils.Utils.configureMessage
import ltd.kaizo.realestatemanager.utils.Utils.showSnackBar

class LoanSimActivity : AppCompatActivity() {
    private lateinit var loanSimViewModel: LoanSimViewModel
    private lateinit var binding: ActivityLoanSimBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_loan_sim)
        this.configureDesign()
    }


    fun configureDesign() {
        this.configureToolbar()
        this.configureViewModel()
        this.configureObserver()
    }

    private fun configureObserver() {
        //message for snackbar
        loanSimViewModel.message.observe(
            this,
            Observer { message ->
                if (message != "" && message != null) {
                    showSnackBar(activity_loan_coordinator_layout, configureMessage(message, this))
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
    /**
     * method to remove the focus of an ediText
     *
     * @param event
     * @return
     */
    override fun dispatchTouchEvent(event: MotionEvent): Boolean {
        if (event.action == MotionEvent.ACTION_DOWN) {
            val v = currentFocus
            if (v is EditText) {
                val outRect = Rect()
                v.getGlobalVisibleRect(outRect)
                if (!outRect.contains(event.rawX.toInt(), event.rawY.toInt())) {
                    v.clearFocus()
                    val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                    imm.hideSoftInputFromWindow(v.windowToken, 0)
                }
            }
        }
        return super.dispatchTouchEvent(event)
    }
}
