package ltd.kaizo.realestatemanager.utils


import android.app.Activity
import android.content.Context
import android.net.wifi.WifiManager
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar
import org.joda.time.format.DateTimeFormat
import java.text.SimpleDateFormat
import java.util.*
import java.util.regex.Pattern


object Utils {

    /**
     * Conversion de la date d'aujourd'hui en un format plus approprié
     * NOTE : NE PAS SUPPRIMER, A MONTRER DURANT LA SOUTENANCE
     * @return
     */
    val todayDate: String = SimpleDateFormat("dd/MM/yyyy").format(Date())

    fun add0ToDate(nb: Int) =
        if (nb < 10) {
            "0$nb"
    } else {
        "" + nb
    }

    fun checkDateDifference(date1 :String, date2 :String):Boolean{
        val dtf = DateTimeFormat.forPattern("dd/MM/yyyy")
        val d1  = dtf.parseDateTime(date1)
        val d2  = dtf.parseDateTime(date2)
        return d2.isAfter(d1)
    }

    /**
     * Conversion d'un prix d'un bien immobilier (Dollars vers Euros)
     * NOTE : NE PAS SUPPRIMER, A MONTRER DURANT LA SOUTENANCE
     * @param dollars
     * @return
     */
    fun convertDollarToEuro(dollars: Int): Int {
        return Math.round(dollars * 0.812).toInt()
    }

    fun convertEuroToDollar(euros: Int): Int {
        return Math.round(euros / 0.812).toInt()
    }

    /**
     * Vérification de la connexion réseau
     * NOTE : NE PAS SUPPRIMER, A MONTRER DURANT LA SOUTENANCE
     * @param context
     * @return
     */
    fun isInternetAvailable(context: Context): Boolean {
        val wifi = context.applicationContext.getSystemService(Context.WIFI_SERVICE) as WifiManager
        return wifi.isWifiEnabled
    }

    fun showSnackBar(view: View, message: String) {
        Snackbar.make(view, message, Snackbar.LENGTH_SHORT).show()
    }

    /****************************
    ******* email check  ********
    *****************************/
    private val VALID_EMAIL_ADDRESS_REGEX =
        Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE)
    /**
     * Validate email boolean.
     *
     * @param emailStr the email str
     * @return the boolean
     */
    private fun validateEmail(emailStr: String): Boolean {
        val matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr)
        return matcher.find()
    }
    /**
     * Is email valid boolean.
     *
     * @return the boolean
     */
     fun isEmailValid(emailEditText:EditText): Boolean {
        return emailEditText.text.toString() != "" && validateEmail(emailEditText.text.toString())
    }
        /****************************
        *****   username check   *****
        *****************************/

    /**
     * return true if the username is bigger than 2 characters
     * and different from previous username
     *
     * @return Boolean boolean
     */
     fun isUsernameValid(usernameEditText:EditText): Boolean {
        return usernameEditText.text.length > 2
    }

    /****************************
     *******   google map   ******
     *****************************/


    //https://maps.googleapis.com/maps/api/staticmap?
    // center=avenue+de+la+resistance,lannion,
    // &zoom=13
    // &size=600x300
    // &maptype=roadmap
    // &markers=color:green%7Clabel:G%7C40.711614,-74.012318
    // &key=AIzaSyCBcjFQJr7i9K22a9ulsTQ_WntkQHX35qc

    //geocoding address
    //https://maps.googleapis.com/maps/api/geocode/json?address=avenue%20de%20la%20resistance,%20lannion&sensor=false&key=AIzaSyCBcjFQJr7i9K22a9ulsTQ_WntkQHX35qc
    fun getStaticMapUrlFromAddress(address: String, postalCode: String, city: String): String {
        val zoom = 15
        val size = 200
        val type = "roadmap"
        val apiKey = "AIzaSyCBcjFQJr7i9K22a9ulsTQ_WntkQHX35qc"
        val location = "$address, $postalCode, $city"
        return "https://maps.googleapis.com/maps/api/staticmap?center=$location&zoom=$zoom&size=${size}x$size&maptype=$type&key=$apiKey"

    }

    fun hideKeyboard(activity: Activity) {
        val view = activity.findViewById<View>(android.R.id.content)
        if (view != null) {
            val imm = activity.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view.windowToken, 0)
        }
    }
}
