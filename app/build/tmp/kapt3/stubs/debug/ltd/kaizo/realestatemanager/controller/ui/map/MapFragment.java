package ltd.kaizo.realestatemanager.controller.ui.map;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0014H\u0014J\b\u0010\u0018\u001a\u00020\u0014H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0002J\b\u0010\u001a\u001a\u00020\u0014H\u0002J\b\u0010\u001b\u001a\u00020\u0014H\u0002J\b\u0010\u001c\u001a\u00020\u0014H\u0002J&\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0012\u0010%\u001a\u00020\u00142\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0017J\b\u0010&\u001a\u00020\u0014H\u0014J\f\u0010\'\u001a\u00020\u0014*\u00020\fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lltd/kaizo/realestatemanager/controller/ui/map/MapFragment;", "Lltd/kaizo/realestatemanager/controller/ui/base/BaseFragment;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "()V", "currentLatitude", "", "currentLongitude", "fragmentLayout", "", "getFragmentLayout", "()I", "googleMap", "Lcom/google/android/gms/maps/GoogleMap;", "mapView", "Lcom/google/android/gms/maps/MapView;", "mapViewModel", "Lltd/kaizo/realestatemanager/controller/ui/map/MapViewModel;", "parentActivity", "Lltd/kaizo/realestatemanager/controller/ui/map/MapActivity;", "configureAndShowDetailFragment", "", "estateId", "", "configureDesign", "configureObserver", "configureOnMarkerClick", "configureOnMarkerInfoListener", "configureViewModel", "initMap", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onMapReady", "updateDesign", "moveCameraToLocation", "app_debug"})
public final class MapFragment extends ltd.kaizo.realestatemanager.controller.ui.base.BaseFragment implements com.google.android.gms.maps.OnMapReadyCallback {
    private ltd.kaizo.realestatemanager.controller.ui.map.MapActivity parentActivity;
    private ltd.kaizo.realestatemanager.controller.ui.map.MapViewModel mapViewModel;
    private com.google.android.gms.maps.GoogleMap googleMap;
    private com.google.android.gms.maps.MapView mapView;
    private double currentLatitude;
    private double currentLongitude;
    private final int fragmentLayout = 2131492921;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected int getFragmentLayout() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void configureViewModel() {
    }
    
    @java.lang.Override()
    protected void configureDesign() {
    }
    
    @java.lang.Override()
    protected void updateDesign() {
    }
    
    private final void configureObserver() {
    }
    
    private final void initMap() {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.GoogleMap googleMap) {
    }
    
    private final void configureOnMarkerClick() {
    }
    
    private final void configureOnMarkerInfoListener() {
    }
    
    /**
     * * launch the DetailFragment if the infoWindow is clicked
     *     *
     *     * @param estateId
     */
    private final void configureAndShowDetailFragment(java.lang.String estateId) {
    }
    
    private final void moveCameraToLocation(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap $receiver) {
    }
    
    public MapFragment() {
        super();
    }
}