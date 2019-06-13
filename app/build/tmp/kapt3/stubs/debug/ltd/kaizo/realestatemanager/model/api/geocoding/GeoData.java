package ltd.kaizo.realestatemanager.model.api.geocoding;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lltd/kaizo/realestatemanager/model/api/geocoding/GeoData;", "", "()V", "results", "", "Lltd/kaizo/realestatemanager/model/api/geocoding/Result;", "getResults", "()Ljava/util/List;", "setResults", "(Ljava/util/List;)V", "status", "", "getStatus", "()Ljava/lang/String;", "setStatus", "(Ljava/lang/String;)V", "app_debug"})
public final class GeoData {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "results")
    private java.util.List<ltd.kaizo.realestatemanager.model.api.geocoding.Result> results;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "status")
    private java.lang.String status;
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<ltd.kaizo.realestatemanager.model.api.geocoding.Result> getResults() {
        return null;
    }
    
    public final void setResults(@org.jetbrains.annotations.Nullable()
    java.util.List<ltd.kaizo.realestatemanager.model.api.geocoding.Result> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public GeoData() {
        super();
    }
}