package ltd.kaizo.realestatemanager.controller.ui.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001aH\u0014J\b\u0010\u001e\u001a\u00020\u001aH\u0002J\b\u0010\u001f\u001a\u00020\u001aH\u0002J\b\u0010 \u001a\u00020\u001aH\u0002J\b\u0010!\u001a\u00020\u001aH\u0002J\b\u0010\"\u001a\u00020\u001aH\u0002J&\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0016\u0010+\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\u001cH\u0002J\b\u0010,\u001a\u00020\u001aH\u0014J\u0016\u0010-\u001a\u00020\u001a2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00110\u001cH\u0002J\u0016\u0010/\u001a\u00020\u001a2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00150\u001cH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00060"}, d2 = {"Lltd/kaizo/realestatemanager/controller/ui/list/DetailFragment;", "Lltd/kaizo/realestatemanager/controller/ui/base/BaseFragment;", "()V", "binding", "Lltd/kaizo/realestatemanager/databinding/FragmentDetailBinding;", "estateId", "", "fragmentLayout", "", "getFragmentLayout", "()I", "listViewModel", "Lltd/kaizo/realestatemanager/controller/ui/list/ListViewModel;", "parentActivity", "Landroid/app/Activity;", "pictureList", "", "Lltd/kaizo/realestatemanager/model/EstatePhoto;", "pictureListAdapter", "Lltd/kaizo/realestatemanager/adapter/PictureListAdapter;", "poiList", "", "poiListAdapter", "Lltd/kaizo/realestatemanager/adapter/PoiListAdapter;", "sourceTag", "configureAndLaunchPictureDetailFragment", "", "estatePhotoList", "", "configureDesign", "configureObserver", "configureOnMapClicked", "configurePictureListRecycleView", "configurePoiListRecycleView", "configureViewModel", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onPictureItemClicked", "updateDesign", "updatePictureList", "list", "updatePoiList", "app_debug"})
public final class DetailFragment extends ltd.kaizo.realestatemanager.controller.ui.base.BaseFragment {
    private ltd.kaizo.realestatemanager.adapter.PictureListAdapter pictureListAdapter;
    private ltd.kaizo.realestatemanager.adapter.PoiListAdapter poiListAdapter;
    private ltd.kaizo.realestatemanager.controller.ui.list.ListViewModel listViewModel;
    private java.util.List<ltd.kaizo.realestatemanager.model.EstatePhoto> pictureList;
    private java.util.List<java.lang.String> poiList;
    private android.app.Activity parentActivity;
    private ltd.kaizo.realestatemanager.databinding.FragmentDetailBinding binding;
    private int sourceTag;
    private long estateId;
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
    
    /**
     * * launch the mapActivity if the static map is clicked
     */
    private final void configureOnMapClicked() {
    }
    
    /**
     * * configure the viewModel according to the activity's source
     */
    private final void configureViewModel() {
    }
    
    /**
     * * configure the recycle view for the estate's pictures
     */
    private final void configurePictureListRecycleView() {
    }
    
    /**
     * * configure the recycle view for the point of interest
     */
    private final void configurePoiListRecycleView() {
    }
    
    /**
     * * send the picture list to the detail picture fragment
     *     * to be seen in full screen
     *     * @param estatePhotoList
     */
    private final void onPictureItemClicked(java.util.List<ltd.kaizo.realestatemanager.model.EstatePhoto> estatePhotoList) {
    }
    
    private final void configureAndLaunchPictureDetailFragment(java.util.List<ltd.kaizo.realestatemanager.model.EstatePhoto> estatePhotoList) {
    }
    
    private final void configureObserver() {
    }
    
    private final void updatePictureList(java.util.List<ltd.kaizo.realestatemanager.model.EstatePhoto> list) {
    }
    
    private final void updatePoiList(java.util.List<java.lang.String> list) {
    }
    
    public DetailFragment() {
        super();
    }
}