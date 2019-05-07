package ltd.kaizo.realestatemanager.model.api.stream

import io.reactivex.Observable
import ltd.kaizo.realestatemanager.model.api.geocoding.GeoData
import ltd.kaizo.realestatemanager.utils.API_KEY
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.Query

interface GeoService {

    @GET("geocode/json?&key=$API_KEY")
 fun getGeoCodingInfo(@Query("address") address:String): Observable<GeoData>

companion object {
/*
 * The constant url.
 */
    //https://maps.googleapis.com/maps/api/geocode/json?address=1600+Amphitheatre+Parkway,
//+Mountain+View,+CA&key=AIzaSyCBcjFQJr7i9K22a9ulsTQ_WntkQHX35qc
    private const val url = "https://maps.googleapis.com/maps/api/"
/**
 * The constant interceptor.
 */
private val interceptor = HttpLoggingInterceptor()
/**
 * The constant okHttpClient.
 */
private val okHttpClient: OkHttpClient.Builder = OkHttpClient.Builder().addInterceptor(interceptor.setLevel(HttpLoggingInterceptor.Level.BASIC))
/**
 * The constant retrofit builder
 */
     val retrofit = Retrofit.Builder()

.baseUrl(url)

.addConverterFactory(GsonConverterFactory.create())

.addCallAdapterFactory(RxJava2CallAdapterFactory.create())
.client(okHttpClient.build())
.build()
}

}
