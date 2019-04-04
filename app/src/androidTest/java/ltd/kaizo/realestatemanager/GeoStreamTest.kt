package ltd.kaizo.realestatemanager

import io.reactivex.Observable
import io.reactivex.observers.TestObserver
import junit.framework.Assert.assertEquals
import ltd.kaizo.realestatemanager.model.api.geocoding.GeoData
import ltd.kaizo.realestatemanager.model.api.stream.GeoStream
import org.junit.Test

class GeoStreamTest {
    @Test
    fun streamFetchGeoDataResponseShouldBeOK() {
        val apidata :Observable<GeoData> =
            GeoStream.streamFetchGeoDataFromAddress("rue de la paix, paris")
        val testObserver = TestObserver<GeoData>()
        apidata.subscribeWith(testObserver)
            .assertNoErrors()
            .assertNoTimeout()
            .awaitTerminalEvent()
        val apiResponseStatus = testObserver.values()[0].status


        assertEquals("OK", apiResponseStatus)

    }
}