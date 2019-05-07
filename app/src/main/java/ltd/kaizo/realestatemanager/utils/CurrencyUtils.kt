package ltd.kaizo.realestatemanager.utils

import java.text.NumberFormat
import java.util.*

object CurrencyUtils {

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

    /**
     * take a number and return a formatted string
     * with currency
     * € = 1 000 €      $ = $1,000
     * @param number to convert
     * @return string
     */
    fun formatNumberFromCurrency(number: Int): String {
        var nb = number
        val currentLocale = if (DataRecordHelper.read(CURRENT_CURRENCY, CURRENCY_EURO) == CURRENCY_EURO) {
            Locale.FRANCE
        } else {
            nb = convertEuroToDollar(number)
            Locale.US
        }
        val result = NumberFormat.getCurrencyInstance(currentLocale)
        result.maximumFractionDigits = 0
        return result.format(nb)
    }

    /**
     * take a number and return a formatted string
     * with currency
     * € = 1 000,00 €      $ = $1,000.00
     * @param number to convert
     * @return string
     */
    fun formatNumberFromCurrency(number: Double): String {
        var nb = number
        val currentLocale = if (DataRecordHelper.read(CURRENT_CURRENCY, CURRENCY_EURO) == CURRENCY_EURO) {
            Locale.FRANCE
        } else {
            nb = convertEuroToDollar(number)
            Locale.US
        }
        val result = NumberFormat.getCurrencyInstance(currentLocale)
        result.maximumFractionDigits = 2
        return result.format(nb)
    }
}