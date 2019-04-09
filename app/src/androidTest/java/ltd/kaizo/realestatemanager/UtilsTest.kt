package ltd.kaizo.realestatemanager

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo
import androidx.test.platform.app.InstrumentationRegistry
import junit.framework.Assert.assertEquals
import ltd.kaizo.realestatemanager.utils.Utils.isInternetAvailable
import org.junit.Test
import timber.log.Timber

class UtilsTest {

    @Test
    fun givenAnInternetStateShouldReturnCorrectStatus() {
        val context = InstrumentationRegistry.getInstrumentation().context
        val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkInfo: NetworkInfo? = connectivityManager.activeNetworkInfo
        val status = networkInfo?.isConnected ?: false
        val result = isInternetAvailable(context)
        Timber.i("status = $status et result $$result")
        assertEquals(status, result)
    }

}