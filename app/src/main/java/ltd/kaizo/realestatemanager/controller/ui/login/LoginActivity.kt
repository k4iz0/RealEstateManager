package ltd.kaizo.realestatemanager.controller.ui.login

import android.app.Activity
import android.content.Intent
import com.firebase.ui.auth.AuthUI
import com.firebase.ui.auth.ErrorCodes
import com.firebase.ui.auth.IdpResponse
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_login.*
import ltd.kaizo.realestatemanager.controller.ui.base.BaseActivity
import ltd.kaizo.realestatemanager.model.UserHelper
import timber.log.Timber
import java.util.*


class LoginActivity : BaseActivity() {

    private val RC_SIGN_IN = 123

    /****************************
     *********   DESIGN   ********
     *****************************/

    override fun getFragmentLayout(): Int {
        return ltd.kaizo.realestatemanager.R.layout.activity_login
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
        listActivity.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(listActivity)
    }

    private fun handleResponseAfterSignIn(requestCode: Int, resultCode: Int, data: Intent?) {

        val response = IdpResponse.fromResultIntent(data)

        if (RC_SIGN_IN == requestCode) {
            if (resultCode == Activity.RESULT_OK) { // SUCCESS
                if (this.getCurrentUser() != null) {
                    UserHelper.createUser(
                        getCurrentUser()!!.uid,
                        getCurrentUser()?.displayName!!,
                        getCurrentUser()?.photoUrl.toString(),
                        getCurrentUser()?.email!!
                    )
                    Snackbar.make(
                        activity_login_coordinator_layout,
                        getString(ltd.kaizo.realestatemanager.R.string.connection_succeed),
                        Snackbar.LENGTH_SHORT
                    ).show()
                    startListActivity()
                } else { // ERRORS
                    when {
                        response == null -> {
                            Snackbar.make(
                                activity_login_coordinator_layout,
                                getString(ltd.kaizo.realestatemanager.R.string.error_authentication_canceled),
                                Snackbar.LENGTH_SHORT
                            ).show()
                        }
                        response.error!!.equals(ErrorCodes.NO_NETWORK) -> Snackbar.make(
                            activity_login_coordinator_layout,
                            getString(ltd.kaizo.realestatemanager.R.string.error_no_internet),
                            Snackbar.LENGTH_SHORT
                        ).show()
                        response.error!!.equals(ErrorCodes.UNKNOWN_ERROR) -> {
                            Snackbar.make(
                                activity_login_coordinator_layout,
                                getString(ltd.kaizo.realestatemanager.R.string.error_unknown_error),
                                Snackbar.LENGTH_SHORT
                            ).show()
                        }
                    }
                    Timber.i("response code  = $response")
                }
            }
        }
    }

    private fun startSignInActivity() {
        val intent = AuthUI.getInstance()
            .createSignInIntentBuilder()
            .setTheme(ltd.kaizo.realestatemanager.R.style.LoginTheme)
            .setAvailableProviders(
                Arrays.asList(
                    AuthUI.IdpConfig.EmailBuilder().build(),
                    AuthUI.IdpConfig.GoogleBuilder().build()
                )
            )
            .setIsSmartLockEnabled(false, true)
            .build()
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivityForResult(intent, RC_SIGN_IN)
    }
}
