package ltd.kaizo.realestatemanager.controller.ui.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u000f\u001a\u00020\rH\u0002J\b\u0010\u0010\u001a\u00020\rH\u0016J\b\u0010\u0011\u001a\u00020\rH\u0002J\b\u0010\u0012\u001a\u00020\rH\u0002J\b\u0010\u0013\u001a\u00020\rH\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001e\u001a\u00020\rH\u0002J\b\u0010\u001f\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006 "}, d2 = {"Lltd/kaizo/realestatemanager/controller/ui/list/ListActivity;", "Lltd/kaizo/realestatemanager/controller/ui/base/BaseActivity;", "Lcom/google/android/material/navigation/NavigationView$OnNavigationItemSelectedListener;", "()V", "currentUser", "Lltd/kaizo/realestatemanager/model/User;", "listViewModel", "Lltd/kaizo/realestatemanager/controller/ui/list/ListViewModel;", "getListViewModel", "()Lltd/kaizo/realestatemanager/controller/ui/list/ListViewModel;", "setListViewModel", "(Lltd/kaizo/realestatemanager/controller/ui/list/ListViewModel;)V", "configureAndShowDetailFragment", "", "configureAndShowListFragment", "configureCurrentUser", "configureDesign", "configureNavigationDrawer", "configureViewModel", "getDataFromIntent", "getFragmentLayout", "", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onNavigationItemSelected", "item", "Landroid/view/MenuItem;", "onOptionsItemSelected", "signOutUserFromFirebase", "updateNavHeaderDesign", "app_debug"})
public final class ListActivity extends ltd.kaizo.realestatemanager.controller.ui.base.BaseActivity implements com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener {
    @org.jetbrains.annotations.NotNull()
    public ltd.kaizo.realestatemanager.controller.ui.list.ListViewModel listViewModel;
    private ltd.kaizo.realestatemanager.model.User currentUser;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.kaizo.realestatemanager.controller.ui.list.ListViewModel getListViewModel() {
        return null;
    }
    
    public final void setListViewModel(@org.jetbrains.annotations.NotNull()
    ltd.kaizo.realestatemanager.controller.ui.list.ListViewModel p0) {
    }
    
    /**
     * **************************
     *     *********   DESIGN   ********
     */
    @java.lang.Override()
    public int getFragmentLayout() {
        return 0;
    }
    
    @java.lang.Override()
    public void configureDesign() {
    }
    
    private final void getDataFromIntent() {
    }
    
    private final void configureViewModel() {
    }
    
    private final void configureAndShowListFragment() {
    }
    
    /**
     * * show the detailFragment next to the list if the device is in landscape mode
     */
    private final void configureAndShowDetailFragment() {
    }
    
    /**
     * **************************
     *     ***  NAVIGATION DRAWER   ***
     */
    private final void configureNavigationDrawer() {
    }
    
    @java.lang.Override()
    public boolean onNavigationItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void configureCurrentUser() {
    }
    
    private final void updateNavHeaderDesign() {
    }
    
    private final void signOutUserFromFirebase() {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    public ListActivity() {
        super();
    }
}