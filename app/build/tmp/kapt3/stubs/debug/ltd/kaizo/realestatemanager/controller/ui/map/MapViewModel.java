package ltd.kaizo.realestatemanager.controller.ui.map;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0019\u001a\u00020\u001a2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\u000e\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011J\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011H\u0002R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000b\u00a8\u0006\u001e"}, d2 = {"Lltd/kaizo/realestatemanager/controller/ui/map/MapViewModel;", "Landroidx/lifecycle/ViewModel;", "estateDataSource", "Lltd/kaizo/realestatemanager/repositories/EstateRepository;", "executor", "Ljava/util/concurrent/Executor;", "(Lltd/kaizo/realestatemanager/repositories/EstateRepository;Ljava/util/concurrent/Executor;)V", "currentLocation", "Landroidx/lifecycle/MutableLiveData;", "Landroid/location/Location;", "getCurrentLocation", "()Landroidx/lifecycle/MutableLiveData;", "getEstateDataSource", "()Lltd/kaizo/realestatemanager/repositories/EstateRepository;", "estateList", "Landroidx/lifecycle/LiveData;", "", "Lltd/kaizo/realestatemanager/model/Estate;", "getEstateList", "()Landroidx/lifecycle/LiveData;", "getExecutor", "()Ljava/util/concurrent/Executor;", "marker", "Lcom/google/android/gms/maps/model/MarkerOptions;", "getMarker", "setGeoData", "", "setMarker", "estate", "streamFetchGeoDataFromAddress", "app_debug"})
public final class MapViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<android.location.Location> currentLocation = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<ltd.kaizo.realestatemanager.model.Estate>> estateList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.google.android.gms.maps.model.MarkerOptions> marker = null;
    @org.jetbrains.annotations.NotNull()
    private final ltd.kaizo.realestatemanager.repositories.EstateRepository estateDataSource = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.concurrent.Executor executor = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<android.location.Location> getCurrentLocation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<ltd.kaizo.realestatemanager.model.Estate>> getEstateList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.google.android.gms.maps.model.MarkerOptions> getMarker() {
        return null;
    }
    
    public final void setGeoData(@org.jetbrains.annotations.NotNull()
    java.util.List<ltd.kaizo.realestatemanager.model.Estate> estateList) {
    }
    
    /**
     * * get the latitude and longitude from an address
     *     * thanks to the geoApiLocation from google
     *     * and set up a marker accordingly
     *     * @param estate
     */
    private final void streamFetchGeoDataFromAddress(ltd.kaizo.realestatemanager.model.Estate estate) {
    }
    
    public final void setMarker(@org.jetbrains.annotations.NotNull()
    ltd.kaizo.realestatemanager.model.Estate estate) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.kaizo.realestatemanager.repositories.EstateRepository getEstateDataSource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.Executor getExecutor() {
        return null;
    }
    
    public MapViewModel(@org.jetbrains.annotations.NotNull()
    ltd.kaizo.realestatemanager.repositories.EstateRepository estateDataSource, @org.jetbrains.annotations.NotNull()
    java.util.concurrent.Executor executor) {
        super();
    }
}