package ltd.kaizo.realestatemanager.model.api.geocoding;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0015"}, d2 = {"Lltd/kaizo/realestatemanager/model/api/geocoding/Geometry;", "", "()V", "location", "Lltd/kaizo/realestatemanager/model/api/geocoding/Location;", "getLocation", "()Lltd/kaizo/realestatemanager/model/api/geocoding/Location;", "setLocation", "(Lltd/kaizo/realestatemanager/model/api/geocoding/Location;)V", "locationType", "", "getLocationType", "()Ljava/lang/String;", "setLocationType", "(Ljava/lang/String;)V", "viewport", "Lltd/kaizo/realestatemanager/model/api/geocoding/Viewport;", "getViewport", "()Lltd/kaizo/realestatemanager/model/api/geocoding/Viewport;", "setViewport", "(Lltd/kaizo/realestatemanager/model/api/geocoding/Viewport;)V", "app_debug"})
public final class Geometry {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "location")
    private ltd.kaizo.realestatemanager.model.api.geocoding.Location location;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "location_type")
    private java.lang.String locationType;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "viewport")
    private ltd.kaizo.realestatemanager.model.api.geocoding.Viewport viewport;
    
    @org.jetbrains.annotations.Nullable()
    public final ltd.kaizo.realestatemanager.model.api.geocoding.Location getLocation() {
        return null;
    }
    
    public final void setLocation(@org.jetbrains.annotations.Nullable()
    ltd.kaizo.realestatemanager.model.api.geocoding.Location p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLocationType() {
        return null;
    }
    
    public final void setLocationType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ltd.kaizo.realestatemanager.model.api.geocoding.Viewport getViewport() {
        return null;
    }
    
    public final void setViewport(@org.jetbrains.annotations.Nullable()
    ltd.kaizo.realestatemanager.model.api.geocoding.Viewport p0) {
    }
    
    public Geometry() {
        super();
    }
}