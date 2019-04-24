package ltd.kaizo.realestatemanager.utils

import android.app.Activity
import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import ltd.kaizo.realestatemanager.model.Estate

object DataRecordHelper {
    /**
     * The constant sharedPreferences.
     */
    private var sharedPreferences: SharedPreferences? = null

    /**
     * Init.
     *
     * @param context the context
     */
    fun init(context: Context) {
        if (sharedPreferences == null) {
            sharedPreferences = context.getSharedPreferences(context.packageName, Activity.MODE_PRIVATE)
        }
    }

    /**
     * Read string.
     *
     * @param key      the key
     * @param defValue the def value
     * @return the string
     */
    fun read(key: String, defValue: String): String? {
        return sharedPreferences!!.getString(key, defValue)
    }

    /**
     * Write String value
     *
     * @param key   the key
     * @param value the value
     */
    fun write(key: String, value: String) {
        val prefsEditor = sharedPreferences!!.edit()
        prefsEditor.putString(key, value)
        prefsEditor.apply()
    }

    /**
     * Read boolean.
     *
     * @param key      the key
     * @param defValue the def value
     * @return the boolean
     */
    fun read(key: String, defValue: Boolean): Boolean {
        return sharedPreferences!!.getBoolean(key, defValue)
    }

    /**
     * Write boolean value
     *
     * @param key   the key
     * @param value the value
     */
    fun write(key: String, value: Boolean) {
        val prefsEditor = sharedPreferences!!.edit()
        prefsEditor.putBoolean(key, value)
        prefsEditor.apply()
    }

    /**
     * Read integer.
     *
     * @param key      the key
     * @param defValue the def value
     * @return the integer
     */
    fun read(key: String, defValue: Int): Int {
        return sharedPreferences!!.getInt(key, defValue)
    }

    /**
     * Write int value
     *
     * @param key   the key
     * @param value the value
     */
    fun write(key: String, value: Int?) {
        val prefsEditor = sharedPreferences!!.edit()
        prefsEditor.putInt(key, value!!).apply()
    }

    /**
     * Read double.
     *
     * @param key      the key
     * @param defValue the def value
     * @return the double
     */
    fun read(key: String, defValue: Double): Double {
        return java.lang.Double.longBitsToDouble(sharedPreferences!!.getLong(key, defValue.toLong()))
    }

    /**
     * Write double value in sharedPreferences
     * by converting it to LongBits
     *
     * @param key   the key
     * @param value the value
     */
    fun write(key: String, value: Double) {
        val prefsEditor = sharedPreferences!!.edit()
        prefsEditor.putLong(key, java.lang.Double.doubleToLongBits(value)).apply()
    }

    fun getListFromGson(gsonStr: String): List<String> {
        return Gson().fromJson(gsonStr, object : TypeToken<List<String>>() {}.type)
    }

    fun getGsonFromList(list: List<String>): String {
        return Gson().toJson(list)
    }

    fun getEstateListFromGson(gsonStr: String): List<Estate> {
        return Gson().fromJson(gsonStr, object : TypeToken<List<Estate>>() {}.type)
    }

    fun getGsonFromEstateList(list: List<Estate>): String {
        return Gson().toJson(list)
    }

}