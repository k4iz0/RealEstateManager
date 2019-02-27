package ltd.kaizo.realestatemanager.utils

import android.widget.EditText
import androidx.databinding.InverseMethod

object Converter {
    @InverseMethod("stringToInt")
    fun intToString(
        value: Int
    ): String {
       return value.toString()
    }

    fun stringToInt(
        value: String
    ): Int {
       return value.toInt()
    }
}