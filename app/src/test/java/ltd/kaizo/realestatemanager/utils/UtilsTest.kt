package ltd.kaizo.realestatemanager.utils

import ltd.kaizo.realestatemanager.utils.Utils.convertDollarToEuro
import ltd.kaizo.realestatemanager.utils.Utils.convertEuroToDollar
import ltd.kaizo.realestatemanager.utils.Utils.getPoiListFromString
import ltd.kaizo.realestatemanager.utils.Utils.todayDate
import ltd.kaizo.realestatemanager.utils.Utils.validateEmail
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
        val dateOfTheDay=  dateFormat.format(Date())
        val result = todayDate
        assertEquals(dateOfTheDay,result)
    }

    @Test
    fun givenAnBadEmailShouldReturnFalse() {
        val email = "testemailtest.fr"
        assertEquals(false, validateEmail(email))
    }
     @Test
    fun givenAnGoodEmailShouldReturnTrue() {
        val email = "testemail@test.fr"
        assertEquals(true, validateEmail(email))
    }

    @Test
    fun givenAnBadUsernameShouldReturnFalse() {
        val username = "to"
        assertEquals(false, validateEmail(username))
    }

    @Test
    fun givenAStringWithComaShouldReturnListOfString() {
        val str = "toto,tata,titi,tutu"
        val strList = getPoiListFromString(str)
        assertEquals("titi", strList[2])
    }
}