package ltd.kaizo.realestatemanager.controller.ui.map;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\fH\u0002J\b\u0010\u0010\u001a\u00020\fH\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lltd/kaizo/realestatemanager/controller/ui/map/MapActivity;", "Lltd/kaizo/realestatemanager/controller/ui/base/BaseActivity;", "()V", "fusedLocationProviderClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "mapViewModel", "Lltd/kaizo/realestatemanager/controller/ui/map/MapViewModel;", "getMapViewModel", "()Lltd/kaizo/realestatemanager/controller/ui/map/MapViewModel;", "setMapViewModel", "(Lltd/kaizo/realestatemanager/controller/ui/map/MapViewModel;)V", "configureAndShowMapFragment", "", "configureDesign", "configureToolbar", "configureViewModel", "getCurrentLocation", "getFragmentLayout", "", "isServiceOK", "", "app_debug"})
public final class MapActivity extends ltd.kaizo.realestatemanager.controller.ui.base.BaseActivity {
    private com.google.android.gms.location.FusedLocationProviderClient fusedLocationProviderClient;
    @org.jetbrains.annotations.NotNull()
    public ltd.kaizo.realestatemanager.controller.ui.map.MapViewModel mapViewModel;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.kaizo.realestatemanager.controller.ui.map.MapViewModel getMapViewModel() {
        return null;
    }
    
    public final void setMapViewModel(@org.jetbrains.annotations.NotNull()
    ltd.kaizo.realestatemanager.controller.ui.map.MapViewModel p0) {
    }
    
    @java.lang.Override()
    public int getFragmentLayout() {
        return 0;
    }
    
    @java.lang.Override()
    public void configureDesign() {
    }
    
    private final void configureToolbar() {
    }
    
    private final void configureViewModel() {
    }
    
    private final void getCurrentLocation() {
    }
    
    private final void configureAndShowMapFragment() {
    }
    
    /**
     * * check if the Google Play services are available to make map request
     *     *
     *     * @return Boolean boolean
     */
    private final boolean isServiceOK() {
        return false;
    }
    
    public MapActivity() {
        super();
    }
}