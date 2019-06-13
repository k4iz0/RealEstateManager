package ltd.kaizo.realestatemanager.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import java.lang.Deprecated;
import java.lang.Object;
import ltd.kaizo.realestatemanager.controller.ui.add.AddPictureDialogFragment;
import ltd.kaizo.realestatemanager.controller.ui.add.EstateViewModel;

public abstract class FragmentAddPictureDialogBinding extends ViewDataBinding {
  @NonNull
  public final CoordinatorLayout addDialogFragmentCoordinatorLayout;

  @NonNull
  public final MaterialButton pictureNameDialogCancelButton;

  @NonNull
  public final EditText pictureNameDialogEdittext;

  @NonNull
  public final MaterialButton pictureNameDialogSaveButton;

  @NonNull
  public final ImageButton picturePickDialogCameraBtn;

  @NonNull
  public final ImageButton picturePickDialogGalleryBtn;

  @Bindable
  protected EstateViewModel mEstateViewModel;

  @Bindable
  protected AddPictureDialogFragment mAddPictureDialogFragment;

  protected FragmentAddPictureDialogBinding(Object _bindingComponent, View _root,
      int _localFieldCount, CoordinatorLayout addDialogFragmentCoordinatorLayout,
      MaterialButton pictureNameDialogCancelButton, EditText pictureNameDialogEdittext,
      MaterialButton pictureNameDialogSaveButton, ImageButton picturePickDialogCameraBtn,
      ImageButton picturePickDialogGalleryBtn) {
    super(_bindingComponent, _root, _localFieldCount);
    this.addDialogFragmentCoordinatorLayout = addDialogFragmentCoordinatorLayout;
    this.pictureNameDialogCancelButton = pictureNameDialogCancelButton;
    this.pictureNameDialogEdittext = pictureNameDialogEdittext;
    this.pictureNameDialogSaveButton = pictureNameDialogSaveButton;
    this.picturePickDialogCameraBtn = picturePickDialogCameraBtn;
    this.picturePickDialogGalleryBtn = picturePickDialogGalleryBtn;
  }

  public abstract void setEstateViewModel(@Nullable EstateViewModel estateViewModel);

  @Nullable
  public EstateViewModel getEstateViewModel() {
    return mEstateViewModel;
  }

  public abstract void setAddPictureDialogFragment(@Nullable AddPictureDialogFragment AddPictureDialogFragment);

  @Nullable
  public AddPictureDialogFragment getAddPictureDialogFragment() {
    return mAddPictureDialogFragment;
  }

  @NonNull
  public static FragmentAddPictureDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_add_picture_dialog, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentAddPictureDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentAddPictureDialogBinding>inflateInternal(inflater, ltd.kaizo.realestatemanager.R.layout.fragment_add_picture_dialog, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentAddPictureDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_add_picture_dialog, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentAddPictureDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentAddPictureDialogBinding>inflateInternal(inflater, ltd.kaizo.realestatemanager.R.layout.fragment_add_picture_dialog, null, false, component);
  }

  public static FragmentAddPictureDialogBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentAddPictureDialogBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (FragmentAddPictureDialogBinding)bind(component, view, ltd.kaizo.realestatemanager.R.layout.fragment_add_picture_dialog);
  }
}
