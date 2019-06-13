package ltd.kaizo.realestatemanager.controller.ui.add;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0016\u001a\u00020\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0014H\u0002J\u0012\u0010\u0018\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\"\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J&\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0006\u0010\'\u001a\u00020\u0014J\u0006\u0010(\u001a\u00020\u0014J\u0006\u0010)\u001a\u00020\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lltd/kaizo/realestatemanager/controller/ui/add/AddPictureDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "()V", "binding", "Lltd/kaizo/realestatemanager/databinding/FragmentAddPictureDialogBinding;", "estateViewModel", "Lltd/kaizo/realestatemanager/controller/ui/add/EstateViewModel;", "imageUri", "Landroid/net/Uri;", "parent", "Lltd/kaizo/realestatemanager/controller/ui/add/EstateActivity;", "pictureName", "Landroidx/lifecycle/MutableLiveData;", "", "getPictureName", "()Landroidx/lifecycle/MutableLiveData;", "pictureTmp", "Lltd/kaizo/realestatemanager/model/EstatePhoto;", "uriImageSelected", "closeDialog", "", "configureDesign", "configureObserver", "configureViewModel", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savePicture", "selectPictureFromCamera", "selectPictureFromDevice", "app_debug"})
public final class AddPictureDialogFragment extends androidx.fragment.app.DialogFragment {
    private ltd.kaizo.realestatemanager.databinding.FragmentAddPictureDialogBinding binding;
    private android.net.Uri imageUri;
    private android.net.Uri uriImageSelected;
    private ltd.kaizo.realestatemanager.controller.ui.add.EstateActivity parent;
    private ltd.kaizo.realestatemanager.controller.ui.add.EstateViewModel estateViewModel;
    private ltd.kaizo.realestatemanager.model.EstatePhoto pictureTmp;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> pictureName = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPictureName() {
        return null;
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
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void configureDesign() {
    }
    
    private final void configureViewModel() {
    }
    
    /**
     * **************************
     *     *******   OBSERVERS  ********
     */
    private final void configureObserver() {
    }
    
    public final void selectPictureFromDevice() {
    }
    
    public final void selectPictureFromCamera() {
    }
    
    public final void savePicture() {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    public final void closeDialog() {
    }
    
    public AddPictureDialogFragment() {
        super();
    }
}