package ltd.kaizo.realestatemanager.utils


import android.content.Context
import android.content.Intent
import android.net.Uri
import android.net.wifi.WifiManager
import android.view.View
import androidx.core.content.ContextCompat.startActivity
import com.google.android.material.snackbar.Snackbar
import ltd.kaizo.realestatemanager.model.Photo
import java.security.MessageDigest

import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.Date

object Utils {

    /**
     * Conversion de la date d'aujourd'hui en un format plus approprié
     * NOTE : NE PAS SUPPRIMER, A MONTRER DURANT LA SOUTENANCE
     * @return
     */
    val todayDate: String
        get() {
            val dateFormat = SimpleDateFormat("dd/MM/yyyy")
            return dateFormat.format(Date())
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

    fun showSnackBar(view : View, message :String) {
        Snackbar.make(view, message, Snackbar.LENGTH_SHORT).show()
    }
    fun hash(): String {
        val bytes = this.toString().toByteArray()
        val md = MessageDigest.getInstance("SHA-256")
        val digest = md.digest(bytes)
        return digest.fold("") { str, it -> str + "%02x".format(it) }
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
    fun getStaticMapUrlFromAddress(location:String) :String{
        val zoom=13
        val size=200
        val type="roadmap"
        val apiKey="AIzaSyCBcjFQJr7i9K22a9ulsTQ_WntkQHX35qc"

        return "https://maps.googleapis.com/maps/api/staticmap?center=${location}&zoom=$zoom&size=${size}x$size&maptype=$type&key=$apiKey"

    }
}
