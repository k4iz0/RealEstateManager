package ltd.kaizo.realestatemanager.model.api.stream

import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import ltd.kaizo.realestatemanager.model.api.geocoding.GeoData
import java.util.concurrent.TimeUnit

object GeoStream{
    fun streamFetchGeoDataFromAddress(address: String): Observable<GeoData> {
        val geoService = GeoService.retrofit.create(GeoService::class.java)
        return geoService.getGeoCodingInfo(address)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .timeout(10, TimeUnit.SECONDS)
    }
}