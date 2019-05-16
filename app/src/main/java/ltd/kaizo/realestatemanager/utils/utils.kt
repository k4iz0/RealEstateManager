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
     * get the correct string for displaying a message
     * @param message the id of the message
     * @param context
     * @return the resource's string according to the id
     */
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

    /**
     * return the position to set spinner according to the type
     *
     * @param typeDescription type name
     * @param typeArray array of type name
     * @return index of array
     */

    fun getTypePositionForSpinner(typeDescription: String, typeArray: Array<String>): Int {
        var position = 0
        for (type in typeArray) {
            if (type == typeDescription) {
                position = typeArray.indexOf(type)
            }
        }
        return position
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

    /**
     * return true if the username is bigger than 2 characters
     * and different from previous username
     *
     * @return Boolean boolean
     */
    fun isUsernameValid(usernameEditText: EditText): Boolean {
        return usernameEditText.text.length > 2
    }

    /*****************************
     *******   google map   ******
     *****************************/

    //geocoding address
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
}
