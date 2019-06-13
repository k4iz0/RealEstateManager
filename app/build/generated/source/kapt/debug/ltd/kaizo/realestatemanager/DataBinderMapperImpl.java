package ltd.kaizo.realestatemanager;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import ltd.kaizo.realestatemanager.databinding.ActivityLoanSimBindingImpl;
import ltd.kaizo.realestatemanager.databinding.ActivityLoanSimBindingLandImpl;
import ltd.kaizo.realestatemanager.databinding.ActivityLoanSimBindingSw600dpImpl;
import ltd.kaizo.realestatemanager.databinding.ActivityLoanSimBindingSw600dpLandImpl;
import ltd.kaizo.realestatemanager.databinding.FragmentAddBindingImpl;
import ltd.kaizo.realestatemanager.databinding.FragmentAddBindingLandImpl;
import ltd.kaizo.realestatemanager.databinding.FragmentAddBindingSw600dpImpl;
import ltd.kaizo.realestatemanager.databinding.FragmentAddBindingSw600dpLandImpl;
import ltd.kaizo.realestatemanager.databinding.FragmentAddPictureDialogBindingImpl;
import ltd.kaizo.realestatemanager.databinding.FragmentAddPoiDialogBindingImpl;
import ltd.kaizo.realestatemanager.databinding.FragmentDetailBindingImpl;
import ltd.kaizo.realestatemanager.databinding.FragmentSearchBindingImpl;
import ltd.kaizo.realestatemanager.databinding.FragmentSearchBindingLandImpl;
import ltd.kaizo.realestatemanager.databinding.FragmentSearchBindingSw600dpLandImpl;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYLOANSIM = 1;

  private static final int LAYOUT_FRAGMENTADD = 2;

  private static final int LAYOUT_FRAGMENTADDPICTUREDIALOG = 3;

  private static final int LAYOUT_FRAGMENTADDPOIDIALOG = 4;

  private static final int LAYOUT_FRAGMENTDETAIL = 5;

  private static final int LAYOUT_FRAGMENTSEARCH = 6;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(6);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(ltd.kaizo.realestatemanager.R.layout.activity_loan_sim, LAYOUT_ACTIVITYLOANSIM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ltd.kaizo.realestatemanager.R.layout.fragment_add, LAYOUT_FRAGMENTADD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ltd.kaizo.realestatemanager.R.layout.fragment_add_picture_dialog, LAYOUT_FRAGMENTADDPICTUREDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ltd.kaizo.realestatemanager.R.layout.fragment_add_poi_dialog, LAYOUT_FRAGMENTADDPOIDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ltd.kaizo.realestatemanager.R.layout.fragment_detail, LAYOUT_FRAGMENTDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(ltd.kaizo.realestatemanager.R.layout.fragment_search, LAYOUT_FRAGMENTSEARCH);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYLOANSIM: {
          if ("layout-land/activity_loan_sim_0".equals(tag)) {
            return new ActivityLoanSimBindingLandImpl(component, view);
          }
          if ("layout-sw600dp-land/activity_loan_sim_0".equals(tag)) {
            return new ActivityLoanSimBindingSw600dpLandImpl(component, view);
          }
          if ("layout-sw600dp/activity_loan_sim_0".equals(tag)) {
            return new ActivityLoanSimBindingSw600dpImpl(component, view);
          }
          if ("layout/activity_loan_sim_0".equals(tag)) {
            return new ActivityLoanSimBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_loan_sim is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTADD: {
          if ("layout-sw600dp-land/fragment_add_0".equals(tag)) {
            return new FragmentAddBindingSw600dpLandImpl(component, view);
          }
          if ("layout-land/fragment_add_0".equals(tag)) {
            return new FragmentAddBindingLandImpl(component, view);
          }
          if ("layout/fragment_add_0".equals(tag)) {
            return new FragmentAddBindingImpl(component, view);
          }
          if ("layout-sw600dp/fragment_add_0".equals(tag)) {
            return new FragmentAddBindingSw600dpImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_add is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTADDPICTUREDIALOG: {
          if ("layout/fragment_add_picture_dialog_0".equals(tag)) {
            return new FragmentAddPictureDialogBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_add_picture_dialog is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTADDPOIDIALOG: {
          if ("layout/fragment_add_poi_dialog_0".equals(tag)) {
            return new FragmentAddPoiDialogBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_add_poi_dialog is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDETAIL: {
          if ("layout/fragment_detail_0".equals(tag)) {
            return new FragmentDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSEARCH: {
          if ("layout/fragment_search_0".equals(tag)) {
            return new FragmentSearchBindingImpl(component, view);
          }
          if ("layout-land/fragment_search_0".equals(tag)) {
            return new FragmentSearchBindingLandImpl(component, view);
          }
          if ("layout-sw600dp-land/fragment_search_0".equals(tag)) {
            return new FragmentSearchBindingSw600dpLandImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_search is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(10);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "loanSimViewModel");
      sKeys.put(2, "listViewModel");
      sKeys.put(3, "addPoiDialogFragment");
      sKeys.put(4, "estateViewModel");
      sKeys.put(5, "AddPictureDialogFragment");
      sKeys.put(6, "AddPoiDialogFragment");
      sKeys.put(7, "searchViewModel");
      sKeys.put(8, "addPictureDialogFragment");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(14);

    static {
      sKeys.put("layout-land/activity_loan_sim_0", ltd.kaizo.realestatemanager.R.layout.activity_loan_sim);
      sKeys.put("layout-sw600dp-land/activity_loan_sim_0", ltd.kaizo.realestatemanager.R.layout.activity_loan_sim);
      sKeys.put("layout-sw600dp/activity_loan_sim_0", ltd.kaizo.realestatemanager.R.layout.activity_loan_sim);
      sKeys.put("layout/activity_loan_sim_0", ltd.kaizo.realestatemanager.R.layout.activity_loan_sim);
      sKeys.put("layout-sw600dp-land/fragment_add_0", ltd.kaizo.realestatemanager.R.layout.fragment_add);
      sKeys.put("layout-land/fragment_add_0", ltd.kaizo.realestatemanager.R.layout.fragment_add);
      sKeys.put("layout/fragment_add_0", ltd.kaizo.realestatemanager.R.layout.fragment_add);
      sKeys.put("layout-sw600dp/fragment_add_0", ltd.kaizo.realestatemanager.R.layout.fragment_add);
      sKeys.put("layout/fragment_add_picture_dialog_0", ltd.kaizo.realestatemanager.R.layout.fragment_add_picture_dialog);
      sKeys.put("layout/fragment_add_poi_dialog_0", ltd.kaizo.realestatemanager.R.layout.fragment_add_poi_dialog);
      sKeys.put("layout/fragment_detail_0", ltd.kaizo.realestatemanager.R.layout.fragment_detail);
      sKeys.put("layout/fragment_search_0", ltd.kaizo.realestatemanager.R.layout.fragment_search);
      sKeys.put("layout-land/fragment_search_0", ltd.kaizo.realestatemanager.R.layout.fragment_search);
      sKeys.put("layout-sw600dp-land/fragment_search_0", ltd.kaizo.realestatemanager.R.layout.fragment_search);
    }
  }
}
