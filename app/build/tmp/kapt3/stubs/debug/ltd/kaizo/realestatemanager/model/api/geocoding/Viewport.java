package ltd.kaizo.realestatemanager.model.api.geocoding;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lltd/kaizo/realestatemanager/model/api/geocoding/Viewport;", "", "()V", "northeast", "Lltd/kaizo/realestatemanager/model/api/geocoding/Northeast;", "getNortheast", "()Lltd/kaizo/realestatemanager/model/api/geocoding/Northeast;", "setNortheast", "(Lltd/kaizo/realestatemanager/model/api/geocoding/Northeast;)V", "southwest", "Lltd/kaizo/realestatemanager/model/api/geocoding/Southwest;", "getSouthwest", "()Lltd/kaizo/realestatemanager/model/api/geocoding/Southwest;", "setSouthwest", "(Lltd/kaizo/realestatemanager/model/api/geocoding/Southwest;)V", "app_debug"})
public final class Viewport {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "northeast")
    private ltd.kaizo.realestatemanager.model.api.geocoding.Northeast northeast;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "southwest")
    private ltd.kaizo.realestatemanager.model.api.geocoding.Southwest southwest;
    
    @org.jetbrains.annotations.Nullable()
    public final ltd.kaizo.realestatemanager.model.api.geocoding.Northeast getNortheast() {
        return null;
    }
    
    public final void setNortheast(@org.jetbrains.annotations.Nullable()
    ltd.kaizo.realestatemanager.model.api.geocoding.Northeast p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ltd.kaizo.realestatemanager.model.api.geocoding.Southwest getSouthwest() {
        return null;
    }
    
    public final void setSouthwest(@org.jetbrains.annotations.Nullable()
    ltd.kaizo.realestatemanager.model.api.geocoding.Southwest p0) {
    }
    
    public Viewport() {
        super();
    }
}