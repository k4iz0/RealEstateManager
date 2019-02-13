package ltd.kaizo.realestatemanager.controller.ui.login

import android.app.Activity
import android.content.Intent
import com.firebase.ui.auth.AuthUI
import com.firebase.ui.auth.ErrorCodes
import com.firebase.ui.auth.IdpResponse
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_login.*
import ltd.kaizo.realestatemanager.R
import ltd.kaizo.realestatemanager.controller.ui.base.BaseActivity
import java.util.*


class LoginActivity : BaseActivity() {

    private val RC_SIGN_IN = 123

    /****************************
     *********   DESIGN   ********
     *****************************/

    override fun getFragmentLayout(): Int {
        return R.layout.activity_login
    }

    override fun configureDesign() {
        if (isCurrentUserLogged()) {
            startListActivity()
        } else {
            this.startSignInActivity()
        }
    }

    /****************************
     ********   FIREBASE   *******
     *****************************/

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        this.handleResponseAfterSignIn(requestCode, resultCode, data)
    }

    private fun startListActivity() {
        val listActivity = Intent(this, ltd.kaizo.realestatemanager.controller.ui.list.ListActivity::class.java)
        startActivity(listActivity)
    }

    private fun handleResponseAfterSignIn(requestCode: Int, resultCode: Int, data: Intent?) {

        val response = IdpResponse.fromResultIntent(data)

        if (RC_SIGN_IN == requestCode) {
            if (resultCode == Activity.RESULT_OK) { // SUCCESS
                Snackbar.make(
                    activity_login_coordinator_layout,
                    getString(ltd.kaizo.realestatemanager.R.string.connection_succeed),
                    Snackbar.LENGTH_SHORT
                ).show()
                startListActivity()
            } else { // ERRORS
                when {
                    response == null -> Snackbar.make(
                        activity_login_coordinator_layout,
                        getString(ltd.kaizo.realestatemanager.R.string.error_authentication_canceled),
                        Snackbar.LENGTH_SHORT
                    ).show()
                    response.error!!.equals(ErrorCodes.NO_NETWORK) -> Snackbar.make(
                        activity_login_coordinator_layout,
                        getString(ltd.kaizo.realestatemanager.R.string.error_no_internet),
                        Snackbar.LENGTH_SHORT
                    ).show()
                    response.error!!.equals(ErrorCodes.UNKNOWN_ERROR) -> Snackbar.make(
                        activity_login_coordinator_layout,
                        getString(ltd.kaizo.realestatemanager.R.string.error_unknown_error),
                        Snackbar.LENGTH_SHORT
                    ).show()
                }
            }
        }
    }

    private fun startSignInActivity() {
        startActivityForResult(
            AuthUI.getInstance()
                .createSignInIntentBuilder()
                .setTheme(ltd.kaizo.realestatemanager.R.style.LoginTheme)
                .setAvailableProviders(
                    Arrays.asList(
                        AuthUI.IdpConfig.EmailBuilder().build(),
                        AuthUI.IdpConfig.GoogleBuilder().build()
                    )
                )
                .setIsSmartLockEnabled(false, true)
                .build(),
            RC_SIGN_IN
        )
    }
}