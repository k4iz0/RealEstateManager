package ltd.kaizo.realestatemanager.controller.ui.base

import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.annotation.Nullable
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import kotlinx.android.synthetic.main.list_activity.*
import timber.log.Timber

abstract class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        this.setContentView(this.getFragmentLayout())
        Timber.plant(Timber.DebugTree())
        setSupportActionBar(activity_list_toolbar)
        this.configureDesign()
    }

    abstract fun getFragmentLayout(): Int

    abstract fun configureDesign()
    /**
     * Gets current user.
     *
     * @return the current user
     */
    @Nullable
    protected fun getCurrentUser(): FirebaseUser? {
        return FirebaseAuth.getInstance().currentUser
    }

    /**
     * Is current user logged boolean.
     *
     * @return the boolean
     */
    protected fun isCurrentUserLogged(): Boolean {
        return this.getCurrentUser() != null
    }

    override fun onBackPressed() {
        val sfm = supportFragmentManager
        if (sfm.backStackEntryCount > 0) {
            sfm.popBackStack()
        } else {
            super.onBackPressed()
        }
    }

}