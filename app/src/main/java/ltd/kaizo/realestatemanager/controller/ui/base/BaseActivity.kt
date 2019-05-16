package ltd.kaizo.realestatemanager.controller.ui.base

import android.content.Context
import android.os.Bundle
import android.view.WindowManager
import androidx.annotation.Nullable
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import ltd.kaizo.realestatemanager.utils.DataRecordHelper
import net.danlew.android.joda.JodaTimeAndroid
import timber.log.Timber
import android.content.Context.INPUT_METHOD_SERVICE
import android.graphics.Rect
import androidx.core.content.ContextCompat.getSystemService
import android.widget.EditText
import android.view.MotionEvent
import android.view.inputmethod.InputMethodManager


abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        this.setContentView(this.getFragmentLayout())
        Timber.plant(Timber.DebugTree())
        DataRecordHelper.init(applicationContext)
        JodaTimeAndroid.init(this)
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