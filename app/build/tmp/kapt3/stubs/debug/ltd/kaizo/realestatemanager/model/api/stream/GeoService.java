package ltd.kaizo.realestatemanager.model.api.stream;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\b"}, d2 = {"Lltd/kaizo/realestatemanager/model/api/stream/GeoService;", "", "getGeoCodingInfo", "Lio/reactivex/Observable;", "Lltd/kaizo/realestatemanager/model/api/geocoding/GeoData;", "address", "", "Companion", "app_debug"})
public abstract interface GeoService {
    public static final ltd.kaizo.realestatemanager.model.api.stream.GeoService.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "geocode/json?&key=AIzaSyAG3j9kLkZrAMW2Y0b4458-wlgUuSDcEsY")
    public abstract io.reactivex.Observable<ltd.kaizo.realestatemanager.model.api.geocoding.GeoData> getGeoCodingInfo(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "address")
    java.lang.String address);
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lltd/kaizo/realestatemanager/model/api/stream/GeoService$Companion;", "", "()V", "interceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "okHttpClient", "Lokhttp3/OkHttpClient$Builder;", "retrofit", "Lretrofit2/Retrofit;", "kotlin.jvm.PlatformType", "getRetrofit", "()Lretrofit2/Retrofit;", "url", "", "app_debug"})
    public static final class Companion {
        private static final java.lang.String url = "https://maps.googleapis.com/maps/api/";
        
        /**
         * * The constant interceptor.
         */
        private static final okhttp3.logging.HttpLoggingInterceptor interceptor = null;
        
        /**
         * * The constant okHttpClient.
         */
        private static final okhttp3.OkHttpClient.Builder okHttpClient = null;
        
        /**
         * * The constant retrofit builder
         */
        private static final retrofit2.Retrofit retrofit = null;
        
        public final retrofit2.Retrofit getRetrofit() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}