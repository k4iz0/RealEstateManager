package ltd.kaizo.realestatemanager.controller.ui.add;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\b\u0010\u0019\u001a\u00020\u0017H\u0002J\b\u0010\u001a\u001a\u00020\u0017H\u0002J\b\u0010\u001b\u001a\u00020\u0017H\u0002J\b\u0010\u001c\u001a\u00020\u0017H\u0002J\u0012\u0010\u001d\u001a\u00020\u00172\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J&\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0006\u0010&\u001a\u00020\u0017J\u0010\u0010\'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u000bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010X\u0082.\u00a2\u0006\u0004\n\u0002\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lltd/kaizo/realestatemanager/controller/ui/add/AddPoiDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "()V", "binding", "Lltd/kaizo/realestatemanager/databinding/FragmentAddPoiDialogBinding;", "estateViewModel", "Lltd/kaizo/realestatemanager/controller/ui/add/EstateViewModel;", "parent", "Landroid/app/Activity;", "poiList", "", "", "poiListAdapter", "Lltd/kaizo/realestatemanager/adapter/PoiListAdapter;", "poiListTmp", "poiSourceList", "", "[Ljava/lang/String;", "searchViewModel", "Lltd/kaizo/realestatemanager/controller/ui/search/SearchViewModel;", "sourceTag", "", "closeDialog", "", "configureDesign", "configureObserver", "configurePoiListTmp", "configureRecycleView", "configureViewModel", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "saveData", "updatePoiToList", "poi", "app_debug"})
public final class AddPoiDialogFragment extends androidx.fragment.app.DialogFragment {
    private ltd.kaizo.realestatemanager.databinding.FragmentAddPoiDialogBinding binding;
    private android.app.Activity parent;
    private ltd.kaizo.realestatemanager.controller.ui.add.EstateViewModel estateViewModel;
    private ltd.kaizo.realestatemanager.controller.ui.search.SearchViewModel searchViewModel;
    private ltd.kaizo.realestatemanager.adapter.PoiListAdapter poiListAdapter;
    private int sourceTag;
    private java.util.List<java.lang.String> poiList;
    private java.util.List<java.lang.String> poiListTmp;
    private java.lang.String[] poiSourceList;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void configureDesign() {
    }
    
    private final void configureRecycleView() {
    }
    
    private final void configurePoiListTmp() {
    }
    
    private final void updatePoiToList(java.lang.String poi) {
    }
    
    private final void configureViewModel() {
    }
    
    public final void saveData() {
    }
    
    /**
     * **************************
     *     *******   OBSERVERS  ********
     */
    private final void configureObserver() {
    }
    
    private final void closeDialog() {
    }
    
    public AddPoiDialogFragment() {
        super();
    }
}