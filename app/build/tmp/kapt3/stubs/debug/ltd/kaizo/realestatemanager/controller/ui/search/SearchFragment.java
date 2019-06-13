package ltd.kaizo.realestatemanager.controller.ui.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\bH\u0002J\b\u0010\u0017\u001a\u00020\u0013H\u0014J\b\u0010\u0018\u001a\u00020\u0013H\u0002J\b\u0010\u0019\u001a\u00020\u0013H\u0002J\b\u0010\u001a\u001a\u00020\u0013H\u0002J\b\u0010\u001b\u001a\u00020\u0013H\u0002J$\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010 \u001a\u00020\bH\u0002J\u0016\u0010!\u001a\u00020\u00132\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000eH\u0002J&\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010+\u001a\u00020\u0013H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lltd/kaizo/realestatemanager/controller/ui/search/SearchFragment;", "Lltd/kaizo/realestatemanager/controller/ui/base/BaseFragment;", "()V", "binding", "Lltd/kaizo/realestatemanager/databinding/FragmentSearchBinding;", "datePickerDialog", "Landroid/app/DatePickerDialog;", "fragmentLayout", "", "getFragmentLayout", "()I", "parentActivity", "Lltd/kaizo/realestatemanager/controller/ui/search/SearchActivity;", "pictureFilteredList", "", "Lltd/kaizo/realestatemanager/model/EstatePhoto;", "searchViewModel", "Lltd/kaizo/realestatemanager/controller/ui/search/SearchViewModel;", "configureAddPoiBtn", "", "configureDateButton", "configureDatePicker", "source", "configureDesign", "configureEvents", "configureObserver", "configureSpinner", "configureViewModel", "getFilteredPictureList", "", "Lltd/kaizo/realestatemanager/model/Estate;", "tmpList", "limit", "launchListActivity", "resultList", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "updateDesign", "app_debug"})
public final class SearchFragment extends ltd.kaizo.realestatemanager.controller.ui.base.BaseFragment {
    private ltd.kaizo.realestatemanager.controller.ui.search.SearchViewModel searchViewModel;
    private ltd.kaizo.realestatemanager.databinding.FragmentSearchBinding binding;
    private ltd.kaizo.realestatemanager.controller.ui.search.SearchActivity parentActivity;
    private android.app.DatePickerDialog datePickerDialog;
    private java.util.List<ltd.kaizo.realestatemanager.model.EstatePhoto> pictureFilteredList;
    private final int fragmentLayout = 2131492923;
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
    
    @java.lang.Override()
    protected void configureDesign() {
    }
    
    @java.lang.Override()
    protected void updateDesign() {
    }
    
    private final void configureViewModel() {
    }
    
    private final void configureObserver() {
    }
    
    private final java.util.List<ltd.kaizo.realestatemanager.model.Estate> getFilteredPictureList(java.util.List<ltd.kaizo.realestatemanager.model.Estate> tmpList, int limit) {
        return null;
    }
    
    private final void launchListActivity(java.util.List<ltd.kaizo.realestatemanager.model.Estate> resultList) {
    }
    
    private final void configureEvents() {
    }
    
    private final void configureSpinner() {
    }
    
    private final void configureDateButton() {
    }
    
    private final void configureAddPoiBtn() {
    }
    
    private final void configureDatePicker(int source) {
    }
    
    public SearchFragment() {
        super();
    }
}