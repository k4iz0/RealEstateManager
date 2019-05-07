package ltd.kaizo.realestatemanager.utils

import org.joda.time.DateTime
import org.joda.time.format.DateTimeFormat
import java.text.SimpleDateFormat
import java.util.*

object DateUtils {
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

    fun getDateFromString(date: String?): Date? {
        if (date != null) {
            val dtf = DateTimeFormat.forPattern("dd/MM/yyyy")
            return dtf.parseDateTime(date).toDate()
        }
        return null
    }

    fun getStringFromDate(date: Date?): String {
        return if (date != null) {
            val dtf = DateTimeFormat.forPattern("dd/MM/yyyy")
            DateTime(date).toString(dtf)
        } else {
            ""
        }
    }

    /**
     * check if date2 is after date 1
     * @return  Boolean
     */
    fun checkDateDifference(date1: String, date2: String): Boolean {
        val dtf = DateTimeFormat.forPattern("dd/MM/yyyy")
        val d1 = dtf.parseDateTime(date1)
        val d2 = dtf.parseDateTime(date2)
        return d2.isAfter(d1)
    }

}