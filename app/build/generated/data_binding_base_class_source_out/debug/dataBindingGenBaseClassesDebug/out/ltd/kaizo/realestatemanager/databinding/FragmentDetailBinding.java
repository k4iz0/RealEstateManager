package ltd.kaizo.realestatemanager.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Deprecated;
import java.lang.Object;
import ltd.kaizo.realestatemanager.controller.ui.list.ListViewModel;

public abstract class FragmentDetailBinding extends ViewDataBinding {
  @NonNull
  public final ImageView fragmentAddBathroomIc;

  @NonNull
  public final ImageView fragmentAddBedroomIc;

  @NonNull
  public final TextView fragmentAddDateInTextview;

  @NonNull
  public final TextView fragmentAddDateTextviewTitle;

  @NonNull
  public final ImageView fragmentAddHouseIc;

  @NonNull
  public final ImageView fragmentAddLocationIc;

  @NonNull
  public final TextView fragmentAddLocationTitleTextview;

  @NonNull
  public final TextView fragmentAddManagerNameTextview;

  @NonNull
  public final TextView fragmentAddManagerTitleTextview;

  @NonNull
  public final ImageView fragmentAddSurfaceIc;

  @NonNull
  public final TextView fragmentDetailAddressTextview;

  @NonNull
  public final TextView fragmentDetailCityTextview;

  @NonNull
  public final TextView fragmentDetailDateOutTextview;

  @NonNull
  public final TextView fragmentDetailDescriptionTextview;

  @NonNull
  public final TextView fragmentDetailDescriptionTitleTextview;

  @NonNull
  public final ImageView fragmentDetailMapContainer;

  @NonNull
  public final TextView fragmentDetailNbBathroomTextview;

  @NonNull
  public final TextView fragmentDetailNbBathroomTitleTextview;

  @NonNull
  public final TextView fragmentDetailNbBedroomTextview;

  @NonNull
  public final TextView fragmentDetailNbBedroomTitleTextview;

  @NonNull
  public final TextView fragmentDetailNbRoomTextview;

  @NonNull
  public final TextView fragmentDetailNbRoomTitleTextview;

  @NonNull
  public final RecyclerView fragmentDetailPictureListRecycleView;

  @NonNull
  public final RecyclerView fragmentDetailPoiListRecycleView;

  @NonNull
  public final TextView fragmentDetailPostalCodeTextview;

  @NonNull
  public final TextView fragmentDetailPrice;

  @NonNull
  public final TextView fragmentDetailSoldOnTextview;

  @NonNull
  public final TextView fragmentDetailSurfaceTextview;

  @NonNull
  public final TextView fragmentDetailSurfaceTitleTextview;

  @NonNull
  public final Guideline guideline;

  @Bindable
  protected ListViewModel mListViewModel;

  protected FragmentDetailBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView fragmentAddBathroomIc, ImageView fragmentAddBedroomIc,
      TextView fragmentAddDateInTextview, TextView fragmentAddDateTextviewTitle,
      ImageView fragmentAddHouseIc, ImageView fragmentAddLocationIc,
      TextView fragmentAddLocationTitleTextview, TextView fragmentAddManagerNameTextview,
      TextView fragmentAddManagerTitleTextview, ImageView fragmentAddSurfaceIc,
      TextView fragmentDetailAddressTextview, TextView fragmentDetailCityTextview,
      TextView fragmentDetailDateOutTextview, TextView fragmentDetailDescriptionTextview,
      TextView fragmentDetailDescriptionTitleTextview, ImageView fragmentDetailMapContainer,
      TextView fragmentDetailNbBathroomTextview, TextView fragmentDetailNbBathroomTitleTextview,
      TextView fragmentDetailNbBedroomTextview, TextView fragmentDetailNbBedroomTitleTextview,
      TextView fragmentDetailNbRoomTextview, TextView fragmentDetailNbRoomTitleTextview,
      RecyclerView fragmentDetailPictureListRecycleView,
      RecyclerView fragmentDetailPoiListRecycleView, TextView fragmentDetailPostalCodeTextview,
      TextView fragmentDetailPrice, TextView fragmentDetailSoldOnTextview,
      TextView fragmentDetailSurfaceTextview, TextView fragmentDetailSurfaceTitleTextview,
      Guideline guideline) {
    super(_bindingComponent, _root, _localFieldCount);
    this.fragmentAddBathroomIc = fragmentAddBathroomIc;
    this.fragmentAddBedroomIc = fragmentAddBedroomIc;
    this.fragmentAddDateInTextview = fragmentAddDateInTextview;
    this.fragmentAddDateTextviewTitle = fragmentAddDateTextviewTitle;
    this.fragmentAddHouseIc = fragmentAddHouseIc;
    this.fragmentAddLocationIc = fragmentAddLocationIc;
    this.fragmentAddLocationTitleTextview = fragmentAddLocationTitleTextview;
    this.fragmentAddManagerNameTextview = fragmentAddManagerNameTextview;
    this.fragmentAddManagerTitleTextview = fragmentAddManagerTitleTextview;
    this.fragmentAddSurfaceIc = fragmentAddSurfaceIc;
    this.fragmentDetailAddressTextview = fragmentDetailAddressTextview;
    this.fragmentDetailCityTextview = fragmentDetailCityTextview;
    this.fragmentDetailDateOutTextview = fragmentDetailDateOutTextview;
    this.fragmentDetailDescriptionTextview = fragmentDetailDescriptionTextview;
    this.fragmentDetailDescriptionTitleTextview = fragmentDetailDescriptionTitleTextview;
    this.fragmentDetailMapContainer = fragmentDetailMapContainer;
    this.fragmentDetailNbBathroomTextview = fragmentDetailNbBathroomTextview;
    this.fragmentDetailNbBathroomTitleTextview = fragmentDetailNbBathroomTitleTextview;
    this.fragmentDetailNbBedroomTextview = fragmentDetailNbBedroomTextview;
    this.fragmentDetailNbBedroomTitleTextview = fragmentDetailNbBedroomTitleTextview;
    this.fragmentDetailNbRoomTextview = fragmentDetailNbRoomTextview;
    this.fragmentDetailNbRoomTitleTextview = fragmentDetailNbRoomTitleTextview;
    this.fragmentDetailPictureListRecycleView = fragmentDetailPictureListRecycleView;
    this.fragmentDetailPoiListRecycleView = fragmentDetailPoiListRecycleView;
    this.fragmentDetailPostalCodeTextview = fragmentDetailPostalCodeTextview;
    this.fragmentDetailPrice = fragmentDetailPrice;
    this.fragmentDetailSoldOnTextview = fragmentDetailSoldOnTextview;
    this.fragmentDetailSurfaceTextview = fragmentDetailSurfaceTextview;
    this.fragmentDetailSurfaceTitleTextview = fragmentDetailSurfaceTitleTextview;
    this.guideline = guideline;
  }

  public abstract void setListViewModel(@Nullable ListViewModel listViewModel);

  @Nullable
  public ListViewModel getListViewModel() {
    return mListViewModel;
  }

  @NonNull
  public static FragmentDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_detail, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentDetailBinding>inflateInternal(inflater, ltd.kaizo.realestatemanager.R.layout.fragment_detail, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_detail, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentDetailBinding>inflateInternal(inflater, ltd.kaizo.realestatemanager.R.layout.fragment_detail, null, false, component);
  }

  public static FragmentDetailBinding bind(@NonNull View view) {
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
  public static FragmentDetailBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentDetailBinding)bind(component, view, ltd.kaizo.realestatemanager.R.layout.fragment_detail);
  }
}
