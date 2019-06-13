package ltd.kaizo.realestatemanager.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.Deprecated;
import java.lang.Object;
import ltd.kaizo.realestatemanager.controller.ui.add.EstateViewModel;

public abstract class FragmentAddBinding extends ViewDataBinding {
  @NonNull
  public final MaterialButton fragmentAddAddPoiBtn;

  @NonNull
  public final EditText fragmentAddAddressEdittext;

  @NonNull
  public final EditText fragmentAddCityEdittext;

  @NonNull
  public final ConstraintLayout fragmentAddConstraintLayout;

  @NonNull
  public final CoordinatorLayout fragmentAddCoordinatorLayout;

  @NonNull
  public final MaterialButton fragmentAddCreateButton;

  @NonNull
  public final TextView fragmentAddDateEdittext;

  @NonNull
  public final TextView fragmentAddDateOutTextview;

  @NonNull
  public final TextView fragmentAddDateTextviewTitle;

  @NonNull
  public final EditText fragmentAddDescriptionEdittext;

  @NonNull
  public final FloatingActionButton fragmentAddFab;

  @NonNull
  public final TextView fragmentAddManagerNameTextview;

  @NonNull
  public final TextView fragmentAddManagerTitleTextview;

  @NonNull
  public final Spinner fragmentAddNbBathroomSpinner;

  @NonNull
  public final TextView fragmentAddNbBathroomTitleTextview;

  @NonNull
  public final Spinner fragmentAddNbBedroomSpinner;

  @NonNull
  public final TextView fragmentAddNbBedroomTitleTextview;

  @NonNull
  public final Spinner fragmentAddNbRoomSpinner;

  @NonNull
  public final TextView fragmentAddNbRoomTitleTextview;

  @NonNull
  public final RecyclerView fragmentAddPictureListRecycleView;

  @NonNull
  public final EditText fragmentAddPostalCodeEdittext;

  @NonNull
  public final EditText fragmentAddPriceEdittext;

  @NonNull
  public final TextView fragmentAddPriceTextview;

  @NonNull
  public final SwitchCompat fragmentAddSoldSwitch;

  @NonNull
  public final TextView fragmentAddSoldTextview;

  @NonNull
  public final EditText fragmentAddSurfaceEdittext;

  @NonNull
  public final TextView fragmentAddSurfaceTitleTextview;

  @NonNull
  public final Spinner fragmentAddTypeSpinner;

  @NonNull
  public final TextView fragmentAddTypeTextview;

  @NonNull
  public final Guideline guideline3;

  @Nullable
  public final Guideline guideline4;

  @Bindable
  protected EstateViewModel mEstateViewModel;

  protected FragmentAddBinding(Object _bindingComponent, View _root, int _localFieldCount,
      MaterialButton fragmentAddAddPoiBtn, EditText fragmentAddAddressEdittext,
      EditText fragmentAddCityEdittext, ConstraintLayout fragmentAddConstraintLayout,
      CoordinatorLayout fragmentAddCoordinatorLayout, MaterialButton fragmentAddCreateButton,
      TextView fragmentAddDateEdittext, TextView fragmentAddDateOutTextview,
      TextView fragmentAddDateTextviewTitle, EditText fragmentAddDescriptionEdittext,
      FloatingActionButton fragmentAddFab, TextView fragmentAddManagerNameTextview,
      TextView fragmentAddManagerTitleTextview, Spinner fragmentAddNbBathroomSpinner,
      TextView fragmentAddNbBathroomTitleTextview, Spinner fragmentAddNbBedroomSpinner,
      TextView fragmentAddNbBedroomTitleTextview, Spinner fragmentAddNbRoomSpinner,
      TextView fragmentAddNbRoomTitleTextview, RecyclerView fragmentAddPictureListRecycleView,
      EditText fragmentAddPostalCodeEdittext, EditText fragmentAddPriceEdittext,
      TextView fragmentAddPriceTextview, SwitchCompat fragmentAddSoldSwitch,
      TextView fragmentAddSoldTextview, EditText fragmentAddSurfaceEdittext,
      TextView fragmentAddSurfaceTitleTextview, Spinner fragmentAddTypeSpinner,
      TextView fragmentAddTypeTextview, Guideline guideline3, Guideline guideline4) {
    super(_bindingComponent, _root, _localFieldCount);
    this.fragmentAddAddPoiBtn = fragmentAddAddPoiBtn;
    this.fragmentAddAddressEdittext = fragmentAddAddressEdittext;
    this.fragmentAddCityEdittext = fragmentAddCityEdittext;
    this.fragmentAddConstraintLayout = fragmentAddConstraintLayout;
    this.fragmentAddCoordinatorLayout = fragmentAddCoordinatorLayout;
    this.fragmentAddCreateButton = fragmentAddCreateButton;
    this.fragmentAddDateEdittext = fragmentAddDateEdittext;
    this.fragmentAddDateOutTextview = fragmentAddDateOutTextview;
    this.fragmentAddDateTextviewTitle = fragmentAddDateTextviewTitle;
    this.fragmentAddDescriptionEdittext = fragmentAddDescriptionEdittext;
    this.fragmentAddFab = fragmentAddFab;
    this.fragmentAddManagerNameTextview = fragmentAddManagerNameTextview;
    this.fragmentAddManagerTitleTextview = fragmentAddManagerTitleTextview;
    this.fragmentAddNbBathroomSpinner = fragmentAddNbBathroomSpinner;
    this.fragmentAddNbBathroomTitleTextview = fragmentAddNbBathroomTitleTextview;
    this.fragmentAddNbBedroomSpinner = fragmentAddNbBedroomSpinner;
    this.fragmentAddNbBedroomTitleTextview = fragmentAddNbBedroomTitleTextview;
    this.fragmentAddNbRoomSpinner = fragmentAddNbRoomSpinner;
    this.fragmentAddNbRoomTitleTextview = fragmentAddNbRoomTitleTextview;
    this.fragmentAddPictureListRecycleView = fragmentAddPictureListRecycleView;
    this.fragmentAddPostalCodeEdittext = fragmentAddPostalCodeEdittext;
    this.fragmentAddPriceEdittext = fragmentAddPriceEdittext;
    this.fragmentAddPriceTextview = fragmentAddPriceTextview;
    this.fragmentAddSoldSwitch = fragmentAddSoldSwitch;
    this.fragmentAddSoldTextview = fragmentAddSoldTextview;
    this.fragmentAddSurfaceEdittext = fragmentAddSurfaceEdittext;
    this.fragmentAddSurfaceTitleTextview = fragmentAddSurfaceTitleTextview;
    this.fragmentAddTypeSpinner = fragmentAddTypeSpinner;
    this.fragmentAddTypeTextview = fragmentAddTypeTextview;
    this.guideline3 = guideline3;
    this.guideline4 = guideline4;
  }

  public abstract void setEstateViewModel(@Nullable EstateViewModel estateViewModel);

  @Nullable
  public EstateViewModel getEstateViewModel() {
    return mEstateViewModel;
  }

  @NonNull
  public static FragmentAddBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_add, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentAddBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentAddBinding>inflateInternal(inflater, ltd.kaizo.realestatemanager.R.layout.fragment_add, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentAddBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_add, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentAddBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentAddBinding>inflateInternal(inflater, ltd.kaizo.realestatemanager.R.layout.fragment_add, null, false, component);
  }

  public static FragmentAddBinding bind(@NonNull View view) {
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
  public static FragmentAddBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentAddBinding)bind(component, view, ltd.kaizo.realestatemanager.R.layout.fragment_add);
  }
}
