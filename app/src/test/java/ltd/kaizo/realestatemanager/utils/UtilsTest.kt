package ltd.kaizo.realestatemanager.utils

import ltd.kaizo.realestatemanager.utils.Utils.convertDollarToEuro
import ltd.kaizo.realestatemanager.utils.Utils.convertEuroToDollar
import org.junit.Assert.assertEquals
import org.junit.Test

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
}