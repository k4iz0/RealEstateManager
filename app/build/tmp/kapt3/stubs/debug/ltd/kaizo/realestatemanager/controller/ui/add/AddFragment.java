package ltd.kaizo.realestatemanager.controller.ui.add;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 :2\u00020\u0001:\u0001:B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\u0016\u0010\u0017\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002J\b\u0010\u001b\u001a\u00020\u0015H\u0002J\b\u0010\u001c\u001a\u00020\u0015H\u0002J\u0010\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u000eH\u0002J\b\u0010\u001f\u001a\u00020\u0015H\u0014J\b\u0010 \u001a\u00020\u0015H\u0002J\b\u0010!\u001a\u00020\u0015H\u0002J\u0010\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u001aH\u0002J\b\u0010$\u001a\u00020\u0015H\u0002J\b\u0010%\u001a\u00020\u0015H\u0002J\u0010\u0010&\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u001aH\u0002J\b\u0010\'\u001a\u00020\u0015H\u0002J\b\u0010(\u001a\u00020\u0015H\u0002J\b\u0010)\u001a\u00020\u0015H\u0002J&\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\u0016\u00102\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002J\b\u00103\u001a\u00020\u0015H\u0002J\b\u00104\u001a\u00020\u0015H\u0014J\u0016\u00105\u001a\u00020\u00152\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002J\u0010\u00107\u001a\u00020\u00152\u0006\u00108\u001a\u000209H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000e8TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006;"}, d2 = {"Lltd/kaizo/realestatemanager/controller/ui/add/AddFragment;", "Lltd/kaizo/realestatemanager/controller/ui/base/BaseFragment;", "()V", "adapter", "Lltd/kaizo/realestatemanager/adapter/PictureListAdapter;", "binding", "Lltd/kaizo/realestatemanager/databinding/FragmentAddBinding;", "datePickerDialog", "Landroid/app/DatePickerDialog;", "estateId", "", "estateViewModel", "Lltd/kaizo/realestatemanager/controller/ui/add/EstateViewModel;", "fragmentLayout", "", "getFragmentLayout", "()I", "parentActivity", "Lltd/kaizo/realestatemanager/controller/ui/add/EstateActivity;", "sourceTag", "clearMainPictureInList", "", "configureAddPoiBtn", "configureAndLaunchPictureDetailFragment", "estatePhotoList", "", "Lltd/kaizo/realestatemanager/model/EstatePhoto;", "configureButtonAndEvent", "configureDateInOnClickListener", "configureDatePicker", "source", "configureDesign", "configureEstate", "configureFab", "configureMainPictureButton", "estatePhoto", "configureObserver", "configureRecycleView", "configureRemovePictureButton", "configureSpinner", "configureViewModel", "launchNotification", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onPictureItemClicked", "showAddPictureAlertDialog", "updateDesign", "updateList", "list", "updateUi", "estate", "Lltd/kaizo/realestatemanager/model/Estate;", "Companion", "app_debug"})
public final class AddFragment extends ltd.kaizo.realestatemanager.controller.ui.base.BaseFragment {
    private ltd.kaizo.realestatemanager.controller.ui.add.EstateViewModel estateViewModel;
    private ltd.kaizo.realestatemanager.controller.ui.add.EstateActivity parentActivity;
    private ltd.kaizo.realestatemanager.databinding.FragmentAddBinding binding;
    private ltd.kaizo.realestatemanager.adapter.PictureListAdapter adapter;
    private android.app.DatePickerDialog datePickerDialog;
    private int sourceTag;
    private long estateId;
    public static final ltd.kaizo.realestatemanager.controller.ui.add.AddFragment.Companion Companion = null;
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
    protected int getFragmentLayout() {
        return 0;
    }
    
    @java.lang.Override()
    protected void configureDesign() {
    }
    
    @java.lang.Override()
    protected void updateDesign() {
    }
    
    private final void configureButtonAndEvent() {
    }
    
    private final void configureMainPictureButton(ltd.kaizo.realestatemanager.model.EstatePhoto estatePhoto) {
    }
    
    private final void clearMainPictureInList() {
    }
    
    private final void configureRemovePictureButton(ltd.kaizo.realestatemanager.model.EstatePhoto estatePhoto) {
    }
    
    private final void configureRecycleView() {
    }
    
    private final void updateList(java.util.List<ltd.kaizo.realestatemanager.model.EstatePhoto> list) {
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
    
    private final void configureDateInOnClickListener() {
    }
    
    private final void configureFab() {
    }
    
    private final void configureAddPoiBtn() {
    }
    
    private final void configureSpinner() {
    }
    
    private final void configureViewModel() {
    }
    
    /**
     * **************************
     *     *******   OBSERVERS  ********
     */
    private final void configureObserver() {
    }
    
    private final void launchNotification() {
    }
    
    /**
     * **************************
     *     *********   EDIT   ********
     */
    private final void configureEstate() {
    }
    
    private final void updateUi(ltd.kaizo.realestatemanager.model.Estate estate) {
    }
    
    /**
     * **************************
     *     *********   DIALOG   ********
     */
    private final void configureDatePicker(int source) {
    }
    
    private final void showAddPictureAlertDialog() {
    }
    
    public AddFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lltd/kaizo/realestatemanager/controller/ui/add/AddFragment$Companion;", "", "()V", "newInstance", "Lltd/kaizo/realestatemanager/controller/ui/add/AddFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final ltd.kaizo.realestatemanager.controller.ui.add.AddFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}