package ltd.kaizo.realestatemanager.model.api.geocoding;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR&\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\t\u00a8\u0006\u001c"}, d2 = {"Lltd/kaizo/realestatemanager/model/api/geocoding/Result;", "", "()V", "addressComponents", "", "Lltd/kaizo/realestatemanager/model/api/geocoding/AddressComponent;", "getAddressComponents", "()Ljava/util/List;", "setAddressComponents", "(Ljava/util/List;)V", "formattedAddress", "", "getFormattedAddress", "()Ljava/lang/String;", "setFormattedAddress", "(Ljava/lang/String;)V", "geometry", "Lltd/kaizo/realestatemanager/model/api/geocoding/Geometry;", "getGeometry", "()Lltd/kaizo/realestatemanager/model/api/geocoding/Geometry;", "setGeometry", "(Lltd/kaizo/realestatemanager/model/api/geocoding/Geometry;)V", "placeId", "getPlaceId", "setPlaceId", "types", "getTypes", "setTypes", "app_debug"})
public final class Result {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "address_components")
    private java.util.List<ltd.kaizo.realestatemanager.model.api.geocoding.AddressComponent> addressComponents;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "formatted_address")
    private java.lang.String formattedAddress;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "geometry")
    private ltd.kaizo.realestatemanager.model.api.geocoding.Geometry geometry;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "place_id")
    private java.lang.String placeId;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "types")
    private java.util.List<java.lang.String> types;
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<ltd.kaizo.realestatemanager.model.api.geocoding.AddressComponent> getAddressComponents() {
        return null;
    }
    
    public final void setAddressComponents(@org.jetbrains.annotations.Nullable()
    java.util.List<ltd.kaizo.realestatemanager.model.api.geocoding.AddressComponent> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFormattedAddress() {
        return null;
    }
    
    public final void setFormattedAddress(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ltd.kaizo.realestatemanager.model.api.geocoding.Geometry getGeometry() {
        return null;
    }
    
    public final void setGeometry(@org.jetbrains.annotations.Nullable()
    ltd.kaizo.realestatemanager.model.api.geocoding.Geometry p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPlaceId() {
        return null;
    }
    
    public final void setPlaceId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getTypes() {
        return null;
    }
    
    public final void setTypes(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> p0) {
    }
    
    public Result() {
        super();
    }
}