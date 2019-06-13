package ltd.kaizo.realestatemanager.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import java.lang.Deprecated;
import java.lang.Object;
import ltd.kaizo.realestatemanager.controller.ui.search.SearchViewModel;

public abstract class FragmentSearchBinding extends ViewDataBinding {
  @NonNull
  public final Spinner fragmentAddTypeSpinner;

  @NonNull
  public final EditText fragmentSearchAreaEdittext;

  @NonNull
  public final TextView fragmentSearchAreaTextview;

  @NonNull
  public final EditText fragmentSearchBathroomMaxiEdittext;

  @NonNull
  public final EditText fragmentSearchBathroomMiniEdittext;

  @NonNull
  public final TextView fragmentSearchBathroomTitleTextview;

  @NonNull
  public final EditText fragmentSearchBedroomMaxiEdittext;

  @NonNull
  public final EditText fragmentSearchBedroomMiniEdittext;

  @NonNull
  public final TextView fragmentSearchBedroomTitleTextview;

  @NonNull
  public final CoordinatorLayout fragmentSearchCoordinatorLayout;

  @NonNull
  public final TextView fragmentSearchDateInMaxiTextview;

  @NonNull
  public final TextView fragmentSearchDateInMiniTextview;

  @NonNull
  public final TextView fragmentSearchDateInTextviewTitle;

  @NonNull
  public final TextView fragmentSearchDateOutMaxiTextview;

  @NonNull
  public final TextView fragmentSearchDateOutMiniTextview;

  @NonNull
  public final TextView fragmentSearchDateOutTextviewTitle;

  @NonNull
  public final EditText fragmentSearchPictureMiniEditext;

  @NonNull
  public final TextView fragmentSearchPictureTextview;

  @NonNull
  public final MaterialButton fragmentSearchPoiBtn;

  @NonNull
  public final EditText fragmentSearchPriceMaxiEdittext;

  @NonNull
  public final EditText fragmentSearchPriceMiniEdittext;

  @NonNull
  public final TextView fragmentSearchPriceTitleTextview;

  @NonNull
  public final EditText fragmentSearchRoomMaxiEdittext;

  @NonNull
  public final EditText fragmentSearchRoomMiniEdittext;

  @NonNull
  public final TextView fragmentSearchRoomTitleTextview;

  @NonNull
  public final MaterialButton fragmentSearchSearchBtn;

  @NonNull
  public final EditText fragmentSearchSurfaceMaxiEdittext;

  @NonNull
  public final EditText fragmentSearchSurfaceMiniEdittext;

  @NonNull
  public final TextView fragmentSearchSurfaceTitleTextview;

  @NonNull
  public final TextView fragmentSearchTypeTextview;

  @Nullable
  public final Guideline guideline2;

  @Bindable
  protected SearchViewModel mSearchViewModel;

  protected FragmentSearchBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Spinner fragmentAddTypeSpinner, EditText fragmentSearchAreaEdittext,
      TextView fragmentSearchAreaTextview, EditText fragmentSearchBathroomMaxiEdittext,
      EditText fragmentSearchBathroomMiniEdittext, TextView fragmentSearchBathroomTitleTextview,
      EditText fragmentSearchBedroomMaxiEdittext, EditText fragmentSearchBedroomMiniEdittext,
      TextView fragmentSearchBedroomTitleTextview,
      CoordinatorLayout fragmentSearchCoordinatorLayout, TextView fragmentSearchDateInMaxiTextview,
      TextView fragmentSearchDateInMiniTextview, TextView fragmentSearchDateInTextviewTitle,
      TextView fragmentSearchDateOutMaxiTextview, TextView fragmentSearchDateOutMiniTextview,
      TextView fragmentSearchDateOutTextviewTitle, EditText fragmentSearchPictureMiniEditext,
      TextView fragmentSearchPictureTextview, MaterialButton fragmentSearchPoiBtn,
      EditText fragmentSearchPriceMaxiEdittext, EditText fragmentSearchPriceMiniEdittext,
      TextView fragmentSearchPriceTitleTextview, EditText fragmentSearchRoomMaxiEdittext,
      EditText fragmentSearchRoomMiniEdittext, TextView fragmentSearchRoomTitleTextview,
      MaterialButton fragmentSearchSearchBtn, EditText fragmentSearchSurfaceMaxiEdittext,
      EditText fragmentSearchSurfaceMiniEdittext, TextView fragmentSearchSurfaceTitleTextview,
      TextView fragmentSearchTypeTextview, Guideline guideline2) {
    super(_bindingComponent, _root, _localFieldCount);
    this.fragmentAddTypeSpinner = fragmentAddTypeSpinner;
    this.fragmentSearchAreaEdittext = fragmentSearchAreaEdittext;
    this.fragmentSearchAreaTextview = fragmentSearchAreaTextview;
    this.fragmentSearchBathroomMaxiEdittext = fragmentSearchBathroomMaxiEdittext;
    this.fragmentSearchBathroomMiniEdittext = fragmentSearchBathroomMiniEdittext;
    this.fragmentSearchBathroomTitleTextview = fragmentSearchBathroomTitleTextview;
    this.fragmentSearchBedroomMaxiEdittext = fragmentSearchBedroomMaxiEdittext;
    this.fragmentSearchBedroomMiniEdittext = fragmentSearchBedroomMiniEdittext;
    this.fragmentSearchBedroomTitleTextview = fragmentSearchBedroomTitleTextview;
    this.fragmentSearchCoordinatorLayout = fragmentSearchCoordinatorLayout;
    this.fragmentSearchDateInMaxiTextview = fragmentSearchDateInMaxiTextview;
    this.fragmentSearchDateInMiniTextview = fragmentSearchDateInMiniTextview;
    this.fragmentSearchDateInTextviewTitle = fragmentSearchDateInTextviewTitle;
    this.fragmentSearchDateOutMaxiTextview = fragmentSearchDateOutMaxiTextview;
    this.fragmentSearchDateOutMiniTextview = fragmentSearchDateOutMiniTextview;
    this.fragmentSearchDateOutTextviewTitle = fragmentSearchDateOutTextviewTitle;
    this.fragmentSearchPictureMiniEditext = fragmentSearchPictureMiniEditext;
    this.fragmentSearchPictureTextview = fragmentSearchPictureTextview;
    this.fragmentSearchPoiBtn = fragmentSearchPoiBtn;
    this.fragmentSearchPriceMaxiEdittext = fragmentSearchPriceMaxiEdittext;
    this.fragmentSearchPriceMiniEdittext = fragmentSearchPriceMiniEdittext;
    this.fragmentSearchPriceTitleTextview = fragmentSearchPriceTitleTextview;
    this.fragmentSearchRoomMaxiEdittext = fragmentSearchRoomMaxiEdittext;
    this.fragmentSearchRoomMiniEdittext = fragmentSearchRoomMiniEdittext;
    this.fragmentSearchRoomTitleTextview = fragmentSearchRoomTitleTextview;
    this.fragmentSearchSearchBtn = fragmentSearchSearchBtn;
    this.fragmentSearchSurfaceMaxiEdittext = fragmentSearchSurfaceMaxiEdittext;
    this.fragmentSearchSurfaceMiniEdittext = fragmentSearchSurfaceMiniEdittext;
    this.fragmentSearchSurfaceTitleTextview = fragmentSearchSurfaceTitleTextview;
    this.fragmentSearchTypeTextview = fragmentSearchTypeTextview;
    this.guideline2 = guideline2;
  }

  public abstract void setSearchViewModel(@Nullable SearchViewModel searchViewModel);

  @Nullable
  public SearchViewModel getSearchViewModel() {
    return mSearchViewModel;
  }

  @NonNull
  public static FragmentSearchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_search, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSearchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentSearchBinding>inflateInternal(inflater, ltd.kaizo.realestatemanager.R.layout.fragment_search, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentSearchBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_search, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSearchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentSearchBinding>inflateInternal(inflater, ltd.kaizo.realestatemanager.R.layout.fragment_search, null, false, component);
  }

  public static FragmentSearchBinding bind(@NonNull View view) {
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
  public static FragmentSearchBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentSearchBinding)bind(component, view, ltd.kaizo.realestatemanager.R.layout.fragment_search);
  }
}
