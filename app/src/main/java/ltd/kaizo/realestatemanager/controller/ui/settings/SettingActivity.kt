package ltd.kaizo.realestatemanager.controller.ui.settings

import androidx.appcompat.widget.Toolbar
import kotlinx.android.synthetic.main.activity_setting.*
import ltd.kaizo.realestatemanager.R
import ltd.kaizo.realestatemanager.controller.ui.base.BaseActivity
import ltd.kaizo.realestatemanager.model.UserHelper
import ltd.kaizo.realestatemanager.utils.CURRENCY_DOLLAR
import ltd.kaizo.realestatemanager.utils.CURRENCY_EURO
import ltd.kaizo.realestatemanager.utils.CURRENT_CURRENCY
import ltd.kaizo.realestatemanager.utils.DataRecordHelper.read
import ltd.kaizo.realestatemanager.utils.DataRecordHelper.write
import ltd.kaizo.realestatemanager.utils.Utils.isEmailValid
import ltd.kaizo.realestatemanager.utils.Utils.isUsernameValid
import ltd.kaizo.realestatemanager.utils.Utils.showSnackBar

class SettingActivity : BaseActivity() {
    override fun getFragmentLayout(): Int {
        return R.layout.activity_setting
    }

    override fun configureDesign() {
        this.configureToolbar()
        this.configureUpdateEmail()
        this.configureUpdateUsername()
        this.configureRadioGroup()
        this.onRadioButtonClicked()
    }

    private fun configureUpdateUsername() {
        activity_setting_update_username_btn.setOnClickListener {
            if (isUsernameValid(activity_setting_username_edit_text)) {
                UserHelper.updateUsername(activity_setting_username_edit_text.text.toString(), getCurrentUser()!!.uid)
                    .addOnCompleteListener { task ->
                        if (task.isSuccessful) {
                            showSnackBar(
                                activity_setting_coordinator_layout,
                                getString(R.string.update_username_success) + " : " + activity_setting_username_edit_text.text.toString()
                            )
                        }
                    }.addOnFailureListener {
                        showSnackBar(activity_setting_coordinator_layout, getString(R.string.error_unknown_error))
                    }
            } else {
                showSnackBar(activity_setting_coordinator_layout, getString(R.string.updateUsernameError))
            }
        }
    }

    private fun configureUpdateEmail() {
        activity_setting_update_email_btn.setOnClickListener {
            if (isEmailValid(activity_setting_email_edittext)) {
                UserHelper.updateEmail(activity_setting_email_edittext.text.toString(), getCurrentUser()!!.uid)
                    .addOnCompleteListener { task ->
                        if (task.isSuccessful) {
                            showSnackBar(activity_setting_coordinator_layout, getString(R.string.update_email_success))
                        }
                    }.addOnFailureListener {
                        showSnackBar(activity_setting_coordinator_layout, getString(R.string.error_unknown_error))
                    }
            } else {
                showSnackBar(activity_setting_coordinator_layout, getString(R.string.updateEmailError))
            }
        }
    }

    private fun configureToolbar() {
        val toolbar = findViewById<Toolbar>(R.id.setting_activity_toolbar)
        setSupportActionBar(toolbar)
        supportActionBar!!.setHomeButtonEnabled(true)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }

    private fun configureRadioGroup() {
        when (read(CURRENT_CURRENCY, CURRENCY_EURO)) {
            CURRENCY_EURO -> activity_setting_euro_radioButton.toggle()
            CURRENCY_DOLLAR -> activity_setting_dollar_radioButton.toggle()
        }
    }

    /**
     * configure the onClick event for the radio buttons
     */
    private fun onRadioButtonClicked() {
        activity_setting_radioGroup.setOnCheckedChangeListener { _, checkedId ->
            when (checkedId) {
                R.id.activity_setting_euro_radioButton -> write(CURRENT_CURRENCY, CURRENCY_EURO)
                R.id.activity_setting_dollar_radioButton -> write(CURRENT_CURRENCY, CURRENCY_DOLLAR)
            }
        }
    }
}
