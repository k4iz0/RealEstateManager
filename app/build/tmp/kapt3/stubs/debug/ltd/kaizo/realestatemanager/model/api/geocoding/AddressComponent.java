package ltd.kaizo.realestatemanager.model.api.geocoding;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR&\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lltd/kaizo/realestatemanager/model/api/geocoding/AddressComponent;", "", "()V", "longName", "", "getLongName", "()Ljava/lang/String;", "setLongName", "(Ljava/lang/String;)V", "shortName", "getShortName", "setShortName", "types", "", "getTypes", "()Ljava/util/List;", "setTypes", "(Ljava/util/List;)V", "app_debug"})
public final class AddressComponent {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "long_name")
    private java.lang.String longName;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "short_name")
    private java.lang.String shortName;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "types")
    private java.util.List<java.lang.String> types;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLongName() {
        return null;
    }
    
    public final void setLongName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getShortName() {
        return null;
    }
    
    public final void setShortName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getTypes() {
        return null;
    }
    
    public final void setTypes(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> p0) {
    }
    
    public AddressComponent() {
        super();
    }
}