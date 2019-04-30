package ltd.kaizo.realestatemanager.utils

import android.content.Context
import android.content.SharedPreferences
import ltd.kaizo.realestatemanager.utils.DataRecordHelper.read
import ltd.kaizo.realestatemanager.utils.Utils.convertDollarToEuro
import ltd.kaizo.realestatemanager.utils.Utils.convertEuroToDollar
import ltd.kaizo.realestatemanager.utils.Utils.formatNumberFromCurrency
import ltd.kaizo.realestatemanager.utils.Utils.todayDate
import ltd.kaizo.realestatemanager.utils.Utils.validateEmail
import org.junit.Assert.assertEquals
import org.junit.Test
import org.mockito.ArgumentMatchers.anyInt
import org.mockito.ArgumentMatchers.anyString
import org.mockito.Mockito
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
        val dateOfTheDay = dateFormat.format(Date())
        val result = todayDate
        assertEquals(dateOfTheDay, result)
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
    fun givenANumberShouldReturnAFormatedString() {
        val sharedPrefs = Mockito.mock(SharedPreferences::class.java)
        val context = Mockito.mock(Context::class.java)
        Mockito.`when`(context.getSharedPreferences(anyString(), anyInt())).thenReturn(sharedPrefs)
        DataRecordHelper.init(context)
        Mockito.`when`(read(anyString(), anyString())).thenReturn(CURRENCY_EURO)
        val number = 1000000
        val str = "1 000 000"
        assertEquals(str, formatNumberFromCurrency(number))
    }

}