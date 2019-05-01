package ltd.kaizo.realestatemanager.utils


import android.app.Activity
import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import androidx.fragment.app.FragmentManager
import com.google.android.material.snackbar.Snackbar
import ltd.kaizo.realestatemanager.R
import ltd.kaizo.realestatemanager.controller.ui.add.AddPoiDialogFragment
import ltd.kaizo.realestatemanager.utils.DataRecordHelper.read
import org.joda.time.format.DateTimeFormat
import java.text.NumberFormat
import java.text.SimpleDateFormat
import java.util.*
import java.util.regex.Pattern


object Utils {
    /**
     * Vérification de la connexion réseau
     * NOTE : NE PAS SUPPRIMER, A MONTRER DURANT LA SOUTENANCE
     * @param context
     * @return
     */
    fun isInternetAvailable(context: Context): Boolean {
        val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager?
        val networkInfo: NetworkInfo? = connectivityManager?.activeNetworkInfo
        return networkInfo?.isConnected ?: false
    }

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

    fun checkDateDifference(date1: String, date2: String): Boolean {
        val dtf = DateTimeFormat.forPattern("dd/MM/yyyy")
        val d1 = dtf.parseDateTime(date1)
        val d2 = dtf.parseDateTime(date2)
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

    fun convertEuroToDollar(euros: Double): Double {
        return Math.round(euros / 0.812).toDouble()
    }

    fun formatNumberFromCurrency(number: Int): String {
        var nb = number
        val currentLocale = if (read(CURRENT_CURRENCY, CURRENCY_EURO) == CURRENCY_EURO) {
            Locale.FRANCE
        } else {
            nb = convertEuroToDollar(number)
            Locale.US
        }
        val result = NumberFormat.getCurrencyInstance(currentLocale)
        result.maximumFractionDigits = 0
        return result.format(nb)
    }

    fun formatNumberFromCurrency(number: Double): String {
        var nb = number
        val currentLocale = if (read(CURRENT_CURRENCY, CURRENCY_EURO) == CURRENCY_EURO) {
            Locale.FRANCE
        } else {
            nb = convertEuroToDollar(number)
            Locale.US
        }
        val result = NumberFormat.getCurrencyInstance(currentLocale)
        result.maximumFractionDigits = 2
        return result.format(nb)
    }

    fun configureMessage(message: String, context: Context): String {
        return when (message) {
            STR_ERROR_INSERT_DATA -> context.getString(R.string.data_insert_error)
            STR_ESTATE_SUCCESS -> context.getString(R.string.notificationText)
            STR_VERIFY_PICTURE -> context.getString(R.string.add_picture_error)
            STR_VERIFY_MAIN_PICTURE -> context.getString(R.string.main_picture_error)
            STR_VERIFY_DATA -> context.getString(R.string.verify_data)
            else -> message
        }

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
    fun validateEmail(emailStr: String): Boolean {
        val matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr)
        return matcher.find()
    }

    /**
     * Is email valid boolean.
     *
     * @return the boolean
     */
    fun isEmailValid(emailEditText: EditText): Boolean {
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
    fun isUsernameValid(usernameEditText: EditText): Boolean {
        return usernameEditText.text.length > 2
    }

    /****************************
     *******   google map   ******
     *****************************/

    //geocoding address
    //https://maps.googleapis.com/maps/api/geocode/json?address=avenue%20de%20la%20resistance,%20lannion&sensor=false&key=AIzaSyCBcjFQJr7i9K22a9ulsTQ_WntkQHX35qc
    fun getStaticMapUrlFromAddress(address: String, postalCode: String, city: String): String {
        val zoom = 15
        val size = 250
        val type = "roadmap"
        val apiKey = "AIzaSyCBcjFQJr7i9K22a9ulsTQ_WntkQHX35qc"
        return "https://maps.googleapis.com/maps/api/staticmap?center=${getLocation(
            address,
            postalCode,
            city
        )}&zoom=$zoom&size=${size}x$size&maptype=$type&key=$apiKey"

    }

    fun getLocation(address: String, postalCode: String, city: String): String {
        return "$address, $postalCode, $city"
    }

    /****************************
     *********    POI     ********
     *****************************/

    fun showAddPoiAlertDialog(fragmentManager: FragmentManager?, source: Int) {
        val args = Bundle()
        args.putInt(ESTATE_SOURCE, source)
        val dialog = AddPoiDialogFragment()
        dialog.arguments = args
        fragmentManager?.let { dialog.show(it, TAG_ADD_POI_DIALOG) }
    }

    fun getPoiSourceList(context: Context): Array<String> =
        context.resources.getStringArray(R.array.poiArray)

    fun hideKeyboard(activity: Activity) {
        val view = activity.findViewById<View>(android.R.id.content)
        if (view != null) {
            val imm = activity.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view.windowToken, 0)
        }
    }
}
