package ltd.kaizo.realestatemanager.utils

import ltd.kaizo.realestatemanager.utils.Utils.convertDollarToEuro
import ltd.kaizo.realestatemanager.utils.Utils.convertEuroToDollar
import ltd.kaizo.realestatemanager.utils.Utils.todayDate
import org.junit.Assert.assertEquals
import org.junit.Test
import java.text.SimpleDateFormat
import java.util.*

class UtilsTest {

    @Test
    fun givenAPriceInDollarShouldReturnAPriceInEuro() {
        val result = convertEuroToDollar(200)
        assertEquals(246, result)
    }

    @Test
    fun givenAPriceInEuroShouldReturnAPriceInDollar() {
        val result = convertDollarToEuro(246)
        assertEquals(200, result)
    }

    @Test
    fun shouldReturnAFormattedDate() {
        val dateFormat = SimpleDateFormat("dd/MM/yyyy")
        val dateOfTheday=  dateFormat.format(Date())
        val result = todayDate
        assertEquals(dateOfTheday,result)
    }
}