package ltd.kaizo.realestatemanager.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.lang.Deprecated;
import java.lang.Object;
import ltd.kaizo.realestatemanager.controller.ui.add.AddPoiDialogFragment;
import ltd.kaizo.realestatemanager.controller.ui.add.EstateViewModel;

public abstract class FragmentAddPoiDialogBinding extends ViewDataBinding {
  @NonNull
  public final MaterialButton addPoiDialogFragmentButton;

  @NonNull
  public final CoordinatorLayout addPoiDialogFragmentCoordinatorLayout;

  @NonNull
  public final RecyclerView addPoiDialogFragmentRecycleview;

  @Bindable
  protected EstateViewModel mEstateViewModel;

  @Bindable
  protected AddPoiDialogFragment mAddPoiDialogFragment;

  protected FragmentAddPoiDialogBinding(Object _bindingComponent, View _root, int _localFieldCount,
      MaterialButton addPoiDialogFragmentButton,
      CoordinatorLayout addPoiDialogFragmentCoordinatorLayout,
      RecyclerView addPoiDialogFragmentRecycleview) {
    super(_bindingComponent, _root, _localFieldCount);
    this.addPoiDialogFragmentButton = addPoiDialogFragmentButton;
    this.addPoiDialogFragmentCoordinatorLayout = addPoiDialogFragmentCoordinatorLayout;
    this.addPoiDialogFragmentRecycleview = addPoiDialogFragmentRecycleview;
  }

  public abstract void setEstateViewModel(@Nullable EstateViewModel estateViewModel);

  @Nullable
  public EstateViewModel getEstateViewModel() {
    return mEstateViewModel;
  }

  public abstract void setAddPoiDialogFragment(@Nullable AddPoiDialogFragment AddPoiDialogFragment);

  @Nullable
  public AddPoiDialogFragment getAddPoiDialogFragment() {
    return mAddPoiDialogFragment;
  }

  @NonNull
  public static FragmentAddPoiDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_add_poi_dialog, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentAddPoiDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentAddPoiDialogBinding>inflateInternal(inflater, ltd.kaizo.realestatemanager.R.layout.fragment_add_poi_dialog, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentAddPoiDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_add_poi_dialog, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentAddPoiDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentAddPoiDialogBinding>inflateInternal(inflater, ltd.kaizo.realestatemanager.R.layout.fragment_add_poi_dialog, null, false, component);
  }

  public static FragmentAddPoiDialogBinding bind(@NonNull View view) {
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
  public static FragmentAddPoiDialogBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentAddPoiDialogBinding)bind(component, view, ltd.kaizo.realestatemanager.R.layout.fragment_add_poi_dialog);
  }
}
