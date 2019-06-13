package ltd.kaizo.realestatemanager.databinding;
import ltd.kaizo.realestatemanager.R;
import ltd.kaizo.realestatemanager.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSearchBindingLandImpl extends FragmentSearchBinding implements ltd.kaizo.realestatemanager.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.fragment_search_surface_title_textview, 19);
        sViewsWithIds.put(R.id.fragment_search_room_title_textview, 20);
        sViewsWithIds.put(R.id.fragment_search_bedroom_title_textview, 21);
        sViewsWithIds.put(R.id.fragment_search_bathroom_title_textview, 22);
        sViewsWithIds.put(R.id.fragment_search_price_title_textview, 23);
        sViewsWithIds.put(R.id.fragment_search_area_textview, 24);
        sViewsWithIds.put(R.id.fragment_search_type_textview, 25);
        sViewsWithIds.put(R.id.fragment_search_picture_textview, 26);
        sViewsWithIds.put(R.id.fragment_search_poi_btn, 27);
        sViewsWithIds.put(R.id.fragment_search_date_in_textview_title, 28);
        sViewsWithIds.put(R.id.fragment_search_date_out_textview_title, 29);
        sViewsWithIds.put(R.id.guideline2, 30);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener fragmentAddTypeSpinnerandroidSelectedItemPositionAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of searchViewModel.type.getValue()
            //         is searchViewModel.type.setValue((java.lang.Integer) callbackArg_0)
            int callbackArg_0 = fragmentAddTypeSpinner.getSelectedItemPosition();
            // localize variables for thread safety
            // searchViewModel
            ltd.kaizo.realestatemanager.controller.ui.search.SearchViewModel searchViewModel = mSearchViewModel;
            // searchViewModel != null
            boolean searchViewModelJavaLangObjectNull = false;
            // searchViewModel.type != null
            boolean searchViewModelTypeJavaLangObjectNull = false;
            // searchViewModel.type.getValue()
            java.lang.Integer searchViewModelTypeGetValue = null;
            // searchViewModel.type
            androidx.lifecycle.MutableLiveData<java.lang.Integer> searchViewModelType = null;



            searchViewModelJavaLangObjectNull = (searchViewModel) != (null);
            if (searchViewModelJavaLangObjectNull) {


                searchViewModelType = searchViewModel.getType();

                searchViewModelTypeJavaLangObjectNull = (searchViewModelType) != (null);
                if (searchViewModelTypeJavaLangObjectNull) {




                    searchViewModelType.setValue(((java.lang.Integer) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener fragmentSearchAreaEdittextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of searchViewModel.area.getValue()
            //         is searchViewModel.area.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(fragmentSearchAreaEdittext);
            // localize variables for thread safety
            // searchViewModel
            ltd.kaizo.realestatemanager.controller.ui.search.SearchViewModel searchViewModel = mSearchViewModel;
            // searchViewModel.area.getValue()
            java.lang.String searchViewModelAreaGetValue = null;
            // searchViewModel.area != null
            boolean searchViewModelAreaJavaLangObjectNull = false;
            // searchViewModel != null
            boolean searchViewModelJavaLangObjectNull = false;
            // searchViewModel.area
            androidx.lifecycle.MutableLiveData<java.lang.String> searchViewModelArea = null;



            searchViewModelJavaLangObjectNull = (searchViewModel) != (null);
            if (searchViewModelJavaLangObjectNull) {


                searchViewModelArea = searchViewModel.getArea();

                searchViewModelAreaJavaLangObjectNull = (searchViewModelArea) != (null);
                if (searchViewModelAreaJavaLangObjectNull) {




                    searchViewModelArea.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener fragmentSearchBathroomMaxiEdittextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of searchViewModel.nbBathroomMaxi.getValue()
            //         is searchViewModel.nbBathroomMaxi.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(fragmentSearchBathroomMaxiEdittext);
            // localize variables for thread safety
            // searchViewModel
            ltd.kaizo.realestatemanager.controller.ui.search.SearchViewModel searchViewModel = mSearchViewModel;
            // searchViewModel.nbBathroomMaxi
            androidx.lifecycle.MutableLiveData<java.lang.String> searchViewModelNbBathroomMaxi = null;
            // searchViewModel.nbBathroomMaxi.getValue()
            java.lang.String searchViewModelNbBathroomMaxiGetValue = null;
            // searchViewModel.nbBathroomMaxi != null
            boolean searchViewModelNbBathroomMaxiJavaLangObjectNull = false;
            // searchViewModel != null
            boolean searchViewModelJavaLangObjectNull = false;



            searchViewModelJavaLangObjectNull = (searchViewModel) != (null);
            if (searchViewModelJavaLangObjectNull) {


                searchViewModelNbBathroomMaxi = searchViewModel.getNbBathroomMaxi();

                searchViewModelNbBathroomMaxiJavaLangObjectNull = (searchViewModelNbBathroomMaxi) != (null);
                if (searchViewModelNbBathroomMaxiJavaLangObjectNull) {




                    searchViewModelNbBathroomMaxi.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener fragmentSearchBathroomMiniEdittextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of searchViewModel.nbBathroomMini.getValue()
            //         is searchViewModel.nbBathroomMini.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(fragmentSearchBathroomMiniEdittext);
            // localize variables for thread safety
            // searchViewModel
            ltd.kaizo.realestatemanager.controller.ui.search.SearchViewModel searchViewModel = mSearchViewModel;
            // searchViewModel.nbBathroomMini != null
            boolean searchViewModelNbBathroomMiniJavaLangObjectNull = false;
            // searchViewModel != null
            boolean searchViewModelJavaLangObjectNull = false;
            // searchViewModel.nbBathroomMini.getValue()
            java.lang.String searchViewModelNbBathroomMiniGetValue = null;
            // searchViewModel.nbBathroomMini
            androidx.lifecycle.MutableLiveData<java.lang.String> searchViewModelNbBathroomMini = null;



            searchViewModelJavaLangObjectNull = (searchViewModel) != (null);
            if (searchViewModelJavaLangObjectNull) {


                searchViewModelNbBathroomMini = searchViewModel.getNbBathroomMini();

                searchViewModelNbBathroomMiniJavaLangObjectNull = (searchViewModelNbBathroomMini) != (null);
                if (searchViewModelNbBathroomMiniJavaLangObjectNull) {




                    searchViewModelNbBathroomMini.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener fragmentSearchBedroomMaxiEdittextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of searchViewModel.nbBedroomMaxi.getValue()
            //         is searchViewModel.nbBedroomMaxi.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(fragmentSearchBedroomMaxiEdittext);
            // localize variables for thread safety
            // searchViewModel
            ltd.kaizo.realestatemanager.controller.ui.search.SearchViewModel searchViewModel = mSearchViewModel;
            // searchViewModel.nbBedroomMaxi
            androidx.lifecycle.MutableLiveData<java.lang.String> searchViewModelNbBedroomMaxi = null;
            // searchViewModel != null
            boolean searchViewModelJavaLangObjectNull = false;
            // searchViewModel.nbBedroomMaxi != null
            boolean searchViewModelNbBedroomMaxiJavaLangObjectNull = false;
            // searchViewModel.nbBedroomMaxi.getValue()
            java.lang.String searchViewModelNbBedroomMaxiGetValue = null;



            searchViewModelJavaLangObjectNull = (searchViewModel) != (null);
            if (searchViewModelJavaLangObjectNull) {


                searchViewModelNbBedroomMaxi = searchViewModel.getNbBedroomMaxi();

                searchViewModelNbBedroomMaxiJavaLangObjectNull = (searchViewModelNbBedroomMaxi) != (null);
                if (searchViewModelNbBedroomMaxiJavaLangObjectNull) {




                    searchViewModelNbBedroomMaxi.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener fragmentSearchBedroomMiniEdittextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of searchViewModel.nbBedroomMini.getValue()
            //         is searchViewModel.nbBedroomMini.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(fragmentSearchBedroomMiniEdittext);
            // localize variables for thread safety
            // searchViewModel
            ltd.kaizo.realestatemanager.controller.ui.search.SearchViewModel searchViewModel = mSearchViewModel;
            // searchViewModel.nbBedroomMini
            androidx.lifecycle.MutableLiveData<java.lang.String> searchViewModelNbBedroomMini = null;
            // searchViewModel.nbBedroomMini.getValue()
            java.lang.String searchViewModelNbBedroomMiniGetValue = null;
            // searchViewModel.nbBedroomMini != null
            boolean searchViewModelNbBedroomMiniJavaLangObjectNull = false;
            // searchViewModel != null
            boolean searchViewModelJavaLangObjectNull = false;



            searchViewModelJavaLangObjectNull = (searchViewModel) != (null);
            if (searchViewModelJavaLangObjectNull) {


                searchViewModelNbBedroomMini = searchViewModel.getNbBedroomMini();

                searchViewModelNbBedroomMiniJavaLangObjectNull = (searchViewModelNbBedroomMini) != (null);
                if (searchViewModelNbBedroomMiniJavaLangObjectNull) {




                    searchViewModelNbBedroomMini.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener fragmentSearchDateInMaxiTextviewandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of searchViewModel.dateInMaxi.getValue()
            //         is searchViewModel.dateInMaxi.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(fragmentSearchDateInMaxiTextview);
            // localize variables for thread safety
            // searchViewModel
            ltd.kaizo.realestatemanager.controller.ui.search.SearchViewModel searchViewModel = mSearchViewModel;
            // searchViewModel.dateInMaxi.getValue()
            java.lang.String searchViewModelDateInMaxiGetValue = null;
            // searchViewModel.dateInMaxi != null
            boolean searchViewModelDateInMaxiJavaLangObjectNull = false;
            // searchViewModel.dateInMaxi
            androidx.lifecycle.MutableLiveData<java.lang.String> searchViewModelDateInMaxi = null;
            // searchViewModel != null
            boolean searchViewModelJavaLangObjectNull = false;



            searchViewModelJavaLangObjectNull = (searchViewModel) != (null);
            if (searchViewModelJavaLangObjectNull) {


                searchViewModelDateInMaxi = searchViewModel.getDateInMaxi();

                searchViewModelDateInMaxiJavaLangObjectNull = (searchViewModelDateInMaxi) != (null);
                if (searchViewModelDateInMaxiJavaLangObjectNull) {




                    searchViewModelDateInMaxi.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener fragmentSearchDateInMiniTextviewandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of searchViewModel.dateInMini.getValue()
            //         is searchViewModel.dateInMini.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(fragmentSearchDateInMiniTextview);
            // localize variables for thread safety
            // searchViewModel
            ltd.kaizo.realestatemanager.controller.ui.search.SearchViewModel searchViewModel = mSearchViewModel;
            // searchViewModel.dateInMini.getValue()
            java.lang.String searchViewModelDateInMiniGetValue = null;
            // searchViewModel.dateInMini
            androidx.lifecycle.MutableLiveData<java.lang.String> searchViewModelDateInMini = null;
            // searchViewModel.dateInMini != null
            boolean searchViewModelDateInMiniJavaLangObjectNull = false;
            // searchViewModel != null
            boolean searchViewModelJavaLangObjectNull = false;



            searchViewModelJavaLangObjectNull = (searchViewModel) != (null);
            if (searchViewModelJavaLangObjectNull) {


                searchViewModelDateInMini = searchViewModel.getDateInMini();

                searchViewModelDateInMiniJavaLangObjectNull = (searchViewModelDateInMini) != (null);
                if (searchViewModelDateInMiniJavaLangObjectNull) {




                    searchViewModelDateInMini.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener fragmentSearchDateOutMaxiTextviewandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of searchViewModel.dateOutMaxi.getValue()
            //         is searchViewModel.dateOutMaxi.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(fragmentSearchDateOutMaxiTextview);
            // localize variables for thread safety
            // searchViewModel
            ltd.kaizo.realestatemanager.controller.ui.search.SearchViewModel searchViewModel = mSearchViewModel;
            // searchViewModel.dateOutMaxi.getValue()
            java.lang.String searchViewModelDateOutMaxiGetValue = null;
            // searchViewModel.dateOutMaxi
            androidx.lifecycle.MutableLiveData<java.lang.String> searchViewModelDateOutMaxi = null;
            // searchViewModel.dateOutMaxi != null
            boolean searchViewModelDateOutMaxiJavaLangObjectNull = false;
            // searchViewModel != null
            boolean searchViewModelJavaLangObjectNull = false;



            searchViewModelJavaLangObjectNull = (searchViewModel) != (null);
            if (searchViewModelJavaLangObjectNull) {


                searchViewModelDateOutMaxi = searchViewModel.getDateOutMaxi();

                searchViewModelDateOutMaxiJavaLangObjectNull = (searchViewModelDateOutMaxi) != (null);
                if (searchViewModelDateOutMaxiJavaLangObjectNull) {




                    searchViewModelDateOutMaxi.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener fragmentSearchDateOutMiniTextviewandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of searchViewModel.dateOutMini.getValue()
            //         is searchViewModel.dateOutMini.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(fragmentSearchDateOutMiniTextview);
            // localize variables for thread safety
            // searchViewModel
            ltd.kaizo.realestatemanager.controller.ui.search.SearchViewModel searchViewModel = mSearchViewModel;
            // searchViewModel.dateOutMini
            androidx.lifecycle.MutableLiveData<java.lang.String> searchViewModelDateOutMini = null;
            // searchViewModel.dateOutMini != null
            boolean searchViewModelDateOutMiniJavaLangObjectNull = false;
            // searchViewModel.dateOutMini.getValue()
            java.lang.String searchViewModelDateOutMiniGetValue = null;
            // searchViewModel != null
            boolean searchViewModelJavaLangObjectNull = false;



            searchViewModelJavaLangObjectNull = (searchViewModel) != (null);
            if (searchViewModelJavaLangObjectNull) {


                searchViewModelDateOutMini = searchViewModel.getDateOutMini();

                searchViewModelDateOutMiniJavaLangObjectNull = (searchViewModelDateOutMini) != (null);
                if (searchViewModelDateOutMiniJavaLangObjectNull) {




                    searchViewModelDateOutMini.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener fragmentSearchPictureMiniEditextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of searchViewModel.pictureMini.getValue()
            //         is searchViewModel.pictureMini.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(fragmentSearchPictureMiniEditext);
            // localize variables for thread safety
            // searchViewModel
            ltd.kaizo.realestatemanager.controller.ui.search.SearchViewModel searchViewModel = mSearchViewModel;
            // searchViewModel.pictureMini.getValue()
            java.lang.String searchViewModelPictureMiniGetValue = null;
            // searchViewModel.pictureMini
            androidx.lifecycle.MutableLiveData<java.lang.String> searchViewModelPictureMini = null;
            // searchViewModel != null
            boolean searchViewModelJavaLangObjectNull = false;
            // searchViewModel.pictureMini != null
            boolean searchViewModelPictureMiniJavaLangObjectNull = false;



            searchViewModelJavaLangObjectNull = (searchViewModel) != (null);
            if (searchViewModelJavaLangObjectNull) {


                searchViewModelPictureMini = searchViewModel.getPictureMini();

                searchViewModelPictureMiniJavaLangObjectNull = (searchViewModelPictureMini) != (null);
                if (searchViewModelPictureMiniJavaLangObjectNull) {




                    searchViewModelPictureMini.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener fragmentSearchPriceMaxiEdittextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of searchViewModel.priceMaxi.getValue()
            //         is searchViewModel.priceMaxi.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(fragmentSearchPriceMaxiEdittext);
            // localize variables for thread safety
            // searchViewModel
            ltd.kaizo.realestatemanager.controller.ui.search.SearchViewModel searchViewModel = mSearchViewModel;
            // searchViewModel.priceMaxi.getValue()
            java.lang.String searchViewModelPriceMaxiGetValue = null;
            // searchViewModel.priceMaxi != null
            boolean searchViewModelPriceMaxiJavaLangObjectNull = false;
            // searchViewModel.priceMaxi
            androidx.lifecycle.MutableLiveData<java.lang.String> searchViewModelPriceMaxi = null;
            // searchViewModel != null
            boolean searchViewModelJavaLangObjectNull = false;



            searchViewModelJavaLangObjectNull = (searchViewModel) != (null);
            if (searchViewModelJavaLangObjectNull) {


                searchViewModelPriceMaxi = searchViewModel.getPriceMaxi();

                searchViewModelPriceMaxiJavaLangObjectNull = (searchViewModelPriceMaxi) != (null);
                if (searchViewModelPriceMaxiJavaLangObjectNull) {




                    searchViewModelPriceMaxi.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener fragmentSearchPriceMiniEdittextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of searchViewModel.priceMini.getValue()
            //         is searchViewModel.priceMini.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(fragmentSearchPriceMiniEdittext);
            // localize variables for thread safety
            // searchViewModel
            ltd.kaizo.realestatemanager.controller.ui.search.SearchViewModel searchViewModel = mSearchViewModel;
            // searchViewModel.priceMini.getValue()
            java.lang.String searchViewModelPriceMiniGetValue = null;
            // searchViewModel.priceMini != null
            boolean searchViewModelPriceMiniJavaLangObjectNull = false;
            // searchViewModel.priceMini
            androidx.lifecycle.MutableLiveData<java.lang.String> searchViewModelPriceMini = null;
            // searchViewModel != null
            boolean searchViewModelJavaLangObjectNull = false;



            searchViewModelJavaLangObjectNull = (searchViewModel) != (null);
            if (searchViewModelJavaLangObjectNull) {


                searchViewModelPriceMini = searchViewModel.getPriceMini();

                searchViewModelPriceMiniJavaLangObjectNull = (searchViewModelPriceMini) != (null);
                if (searchViewModelPriceMiniJavaLangObjectNull) {




                    searchViewModelPriceMini.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener fragmentSearchRoomMaxiEdittextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of searchViewModel.nbRoomMaxi.getValue()
            //         is searchViewModel.nbRoomMaxi.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(fragmentSearchRoomMaxiEdittext);
            // localize variables for thread safety
            // searchViewModel
            ltd.kaizo.realestatemanager.controller.ui.search.SearchViewModel searchViewModel = mSearchViewModel;
            // searchViewModel.nbRoomMaxi != null
            boolean searchViewModelNbRoomMaxiJavaLangObjectNull = false;
            // searchViewModel.nbRoomMaxi.getValue()
            java.lang.String searchViewModelNbRoomMaxiGetValue = null;
            // searchViewModel.nbRoomMaxi
            androidx.lifecycle.MutableLiveData<java.lang.String> searchViewModelNbRoomMaxi = null;
            // searchViewModel != null
            boolean searchViewModelJavaLangObjectNull = false;



            searchViewModelJavaLangObjectNull = (searchViewModel) != (null);
            if (searchViewModelJavaLangObjectNull) {


                searchViewModelNbRoomMaxi = searchViewModel.getNbRoomMaxi();

                searchViewModelNbRoomMaxiJavaLangObjectNull = (searchViewModelNbRoomMaxi) != (null);
                if (searchViewModelNbRoomMaxiJavaLangObjectNull) {




                    searchViewModelNbRoomMaxi.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener fragmentSearchRoomMiniEdittextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of searchViewModel.nbRoomMini.getValue()
            //         is searchViewModel.nbRoomMini.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(fragmentSearchRoomMiniEdittext);
            // localize variables for thread safety
            // searchViewModel
            ltd.kaizo.realestatemanager.controller.ui.search.SearchViewModel searchViewModel = mSearchViewModel;
            // searchViewModel.nbRoomMini != null
            boolean searchViewModelNbRoomMiniJavaLangObjectNull = false;
            // searchViewModel.nbRoomMini.getValue()
            java.lang.String searchViewModelNbRoomMiniGetValue = null;
            // searchViewModel.nbRoomMini
            androidx.lifecycle.MutableLiveData<java.lang.String> searchViewModelNbRoomMini = null;
            // searchViewModel != null
            boolean searchViewModelJavaLangObjectNull = false;



            searchViewModelJavaLangObjectNull = (searchViewModel) != (null);
            if (searchViewModelJavaLangObjectNull) {


                searchViewModelNbRoomMini = searchViewModel.getNbRoomMini();

                searchViewModelNbRoomMiniJavaLangObjectNull = (searchViewModelNbRoomMini) != (null);
                if (searchViewModelNbRoomMiniJavaLangObjectNull) {




                    searchViewModelNbRoomMini.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener fragmentSearchSurfaceMaxiEdittextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of searchViewModel.surfaceMaxi.getValue()
            //         is searchViewModel.surfaceMaxi.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(fragmentSearchSurfaceMaxiEdittext);
            // localize variables for thread safety
            // searchViewModel
            ltd.kaizo.realestatemanager.controller.ui.search.SearchViewModel searchViewModel = mSearchViewModel;
            // searchViewModel.surfaceMaxi.getValue()
            java.lang.String searchViewModelSurfaceMaxiGetValue = null;
            // searchViewModel != null
            boolean searchViewModelJavaLangObjectNull = false;
            // searchViewModel.surfaceMaxi != null
            boolean searchViewModelSurfaceMaxiJavaLangObjectNull = false;
            // searchViewModel.surfaceMaxi
            androidx.lifecycle.MutableLiveData<java.lang.String> searchViewModelSurfaceMaxi = null;



            searchViewModelJavaLangObjectNull = (searchViewModel) != (null);
            if (searchViewModelJavaLangObjectNull) {


                searchViewModelSurfaceMaxi = searchViewModel.getSurfaceMaxi();

                searchViewModelSurfaceMaxiJavaLangObjectNull = (searchViewModelSurfaceMaxi) != (null);
                if (searchViewModelSurfaceMaxiJavaLangObjectNull) {




                    searchViewModelSurfaceMaxi.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener fragmentSearchSurfaceMiniEdittextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of searchViewModel.surfaceMini.getValue()
            //         is searchViewModel.surfaceMini.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(fragmentSearchSurfaceMiniEdittext);
            // localize variables for thread safety
            // searchViewModel
            ltd.kaizo.realestatemanager.controller.ui.search.SearchViewModel searchViewModel = mSearchViewModel;
            // searchViewModel.surfaceMini
            androidx.lifecycle.MutableLiveData<java.lang.String> searchViewModelSurfaceMini = null;
            // searchViewModel != null
            boolean searchViewModelJavaLangObjectNull = false;
            // searchViewModel.surfaceMini.getValue()
            java.lang.String searchViewModelSurfaceMiniGetValue = null;
            // searchViewModel.surfaceMini != null
            boolean searchViewModelSurfaceMiniJavaLangObjectNull = false;



            searchViewModelJavaLangObjectNull = (searchViewModel) != (null);
            if (searchViewModelJavaLangObjectNull) {


                searchViewModelSurfaceMini = searchViewModel.getSurfaceMini();

                searchViewModelSurfaceMiniJavaLangObjectNull = (searchViewModelSurfaceMini) != (null);
                if (searchViewModelSurfaceMiniJavaLangObjectNull) {




                    searchViewModelSurfaceMini.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentSearchBindingLandImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 31, sIncludes, sViewsWithIds));
    }
    private FragmentSearchBindingLandImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 17
            , (android.widget.Spinner) bindings[12]
            , (android.widget.EditText) bindings[11]
            , (android.widget.TextView) bindings[24]
            , (android.widget.EditText) bindings[8]
            , (android.widget.EditText) bindings[7]
            , (android.widget.TextView) bindings[22]
            , (android.widget.EditText) bindings[6]
            , (android.widget.EditText) bindings[5]
            , (android.widget.TextView) bindings[21]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[28]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[29]
            , (android.widget.EditText) bindings[13]
            , (android.widget.TextView) bindings[26]
            , (com.google.android.material.button.MaterialButton) bindings[27]
            , (android.widget.EditText) bindings[10]
            , (android.widget.EditText) bindings[9]
            , (android.widget.TextView) bindings[23]
            , (android.widget.EditText) bindings[4]
            , (android.widget.EditText) bindings[3]
            , (android.widget.TextView) bindings[20]
            , (com.google.android.material.button.MaterialButton) bindings[14]
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[1]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[25]
            , (androidx.constraintlayout.widget.Guideline) bindings[30]
            );
        this.fragmentAddTypeSpinner.setTag(null);
        this.fragmentSearchAreaEdittext.setTag(null);
        this.fragmentSearchBathroomMaxiEdittext.setTag(null);
        this.fragmentSearchBathroomMiniEdittext.setTag(null);
        this.fragmentSearchBedroomMaxiEdittext.setTag(null);
        this.fragmentSearchBedroomMiniEdittext.setTag(null);
        this.fragmentSearchCoordinatorLayout.setTag(null);
        this.fragmentSearchDateInMaxiTextview.setTag(null);
        this.fragmentSearchDateInMiniTextview.setTag(null);
        this.fragmentSearchDateOutMaxiTextview.setTag(null);
        this.fragmentSearchDateOutMiniTextview.setTag(null);
        this.fragmentSearchPictureMiniEditext.setTag(null);
        this.fragmentSearchPriceMaxiEdittext.setTag(null);
        this.fragmentSearchPriceMiniEdittext.setTag(null);
        this.fragmentSearchRoomMaxiEdittext.setTag(null);
        this.fragmentSearchRoomMiniEdittext.setTag(null);
        this.fragmentSearchSearchBtn.setTag(null);
        this.fragmentSearchSurfaceMaxiEdittext.setTag(null);
        this.fragmentSearchSurfaceMiniEdittext.setTag(null);
        setRootTag(root);
        // listeners
        mCallback5 = new ltd.kaizo.realestatemanager.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40000L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.searchViewModel == variableId) {
            setSearchViewModel((ltd.kaizo.realestatemanager.controller.ui.search.SearchViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSearchViewModel(@Nullable ltd.kaizo.realestatemanager.controller.ui.search.SearchViewModel SearchViewModel) {
        this.mSearchViewModel = SearchViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x20000L;
        }
        notifyPropertyChanged(BR.searchViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeSearchViewModelDateInMaxi((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeSearchViewModelNbRoomMaxi((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeSearchViewModelNbBedroomMini((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeSearchViewModelPriceMini((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeSearchViewModelDateOutMini((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeSearchViewModelDateOutMaxi((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeSearchViewModelPriceMaxi((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 7 :
                return onChangeSearchViewModelNbBedroomMaxi((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 8 :
                return onChangeSearchViewModelNbBathroomMini((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 9 :
                return onChangeSearchViewModelNbRoomMini((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 10 :
                return onChangeSearchViewModelArea((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 11 :
                return onChangeSearchViewModelSurfaceMaxi((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 12 :
                return onChangeSearchViewModelNbBathroomMaxi((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 13 :
                return onChangeSearchViewModelDateInMini((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 14 :
                return onChangeSearchViewModelPictureMini((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 15 :
                return onChangeSearchViewModelType((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 16 :
                return onChangeSearchViewModelSurfaceMini((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeSearchViewModelDateInMaxi(androidx.lifecycle.MutableLiveData<java.lang.String> SearchViewModelDateInMaxi, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSearchViewModelNbRoomMaxi(androidx.lifecycle.MutableLiveData<java.lang.String> SearchViewModelNbRoomMaxi, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSearchViewModelNbBedroomMini(androidx.lifecycle.MutableLiveData<java.lang.String> SearchViewModelNbBedroomMini, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSearchViewModelPriceMini(androidx.lifecycle.MutableLiveData<java.lang.String> SearchViewModelPriceMini, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSearchViewModelDateOutMini(androidx.lifecycle.MutableLiveData<java.lang.String> SearchViewModelDateOutMini, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSearchViewModelDateOutMaxi(androidx.lifecycle.MutableLiveData<java.lang.String> SearchViewModelDateOutMaxi, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSearchViewModelPriceMaxi(androidx.lifecycle.MutableLiveData<java.lang.String> SearchViewModelPriceMaxi, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSearchViewModelNbBedroomMaxi(androidx.lifecycle.MutableLiveData<java.lang.String> SearchViewModelNbBedroomMaxi, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSearchViewModelNbBathroomMini(androidx.lifecycle.MutableLiveData<java.lang.String> SearchViewModelNbBathroomMini, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSearchViewModelNbRoomMini(androidx.lifecycle.MutableLiveData<java.lang.String> SearchViewModelNbRoomMini, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSearchViewModelArea(androidx.lifecycle.MutableLiveData<java.lang.String> SearchViewModelArea, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSearchViewModelSurfaceMaxi(androidx.lifecycle.MutableLiveData<java.lang.String> SearchViewModelSurfaceMaxi, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSearchViewModelNbBathroomMaxi(androidx.lifecycle.MutableLiveData<java.lang.String> SearchViewModelNbBathroomMaxi, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSearchViewModelDateInMini(androidx.lifecycle.MutableLiveData<java.lang.String> SearchViewModelDateInMini, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSearchViewModelPictureMini(androidx.lifecycle.MutableLiveData<java.lang.String> SearchViewModelPictureMini, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSearchViewModelType(androidx.lifecycle.MutableLiveData<java.lang.Integer> SearchViewModelType, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSearchViewModelSurfaceMini(androidx.lifecycle.MutableLiveData<java.lang.String> SearchViewModelSurfaceMini, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10000L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.lifecycle.MutableLiveData<java.lang.String> searchViewModelDateInMaxi = null;
        java.lang.String searchViewModelNbBedroomMaxiGetValue = null;
        int androidxDatabindingViewDataBindingSafeUnboxSearchViewModelTypeGetValue = 0;
        java.lang.String searchViewModelDateOutMaxiGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> searchViewModelNbRoomMaxi = null;
        java.lang.Integer searchViewModelTypeGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> searchViewModelNbBedroomMini = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> searchViewModelPriceMini = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> searchViewModelDateOutMini = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> searchViewModelDateOutMaxi = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> searchViewModelPriceMaxi = null;
        java.lang.String searchViewModelSurfaceMaxiGetValue = null;
        java.lang.String searchViewModelAreaGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> searchViewModelNbBedroomMaxi = null;
        java.lang.String searchViewModelNbRoomMiniGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> searchViewModelNbBathroomMini = null;
        java.lang.String searchViewModelDateInMiniGetValue = null;
        java.lang.String searchViewModelPriceMaxiGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> searchViewModelNbRoomMini = null;
        java.lang.String searchViewModelNbBathroomMaxiGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> searchViewModelArea = null;
        java.lang.String searchViewModelNbBedroomMiniGetValue = null;
        java.lang.String searchViewModelDateOutMiniGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> searchViewModelSurfaceMaxi = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> searchViewModelNbBathroomMaxi = null;
        java.lang.String searchViewModelPictureMiniGetValue = null;
        java.lang.String searchViewModelNbBathroomMiniGetValue = null;
        java.lang.String searchViewModelPriceMiniGetValue = null;
        java.lang.String searchViewModelDateInMaxiGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> searchViewModelDateInMini = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> searchViewModelPictureMini = null;
        java.lang.String searchViewModelSurfaceMiniGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> searchViewModelType = null;
        ltd.kaizo.realestatemanager.controller.ui.search.SearchViewModel searchViewModel = mSearchViewModel;
        androidx.lifecycle.MutableLiveData<java.lang.String> searchViewModelSurfaceMini = null;
        java.lang.String searchViewModelNbRoomMaxiGetValue = null;

        if ((dirtyFlags & 0x7ffffL) != 0) {


            if ((dirtyFlags & 0x60001L) != 0) {

                    if (searchViewModel != null) {
                        // read searchViewModel.dateInMaxi
                        searchViewModelDateInMaxi = searchViewModel.getDateInMaxi();
                    }
                    updateLiveDataRegistration(0, searchViewModelDateInMaxi);


                    if (searchViewModelDateInMaxi != null) {
                        // read searchViewModel.dateInMaxi.getValue()
                        searchViewModelDateInMaxiGetValue = searchViewModelDateInMaxi.getValue();
                    }
            }
            if ((dirtyFlags & 0x60002L) != 0) {

                    if (searchViewModel != null) {
                        // read searchViewModel.nbRoomMaxi
                        searchViewModelNbRoomMaxi = searchViewModel.getNbRoomMaxi();
                    }
                    updateLiveDataRegistration(1, searchViewModelNbRoomMaxi);


                    if (searchViewModelNbRoomMaxi != null) {
                        // read searchViewModel.nbRoomMaxi.getValue()
                        searchViewModelNbRoomMaxiGetValue = searchViewModelNbRoomMaxi.getValue();
                    }
            }
            if ((dirtyFlags & 0x60004L) != 0) {

                    if (searchViewModel != null) {
                        // read searchViewModel.nbBedroomMini
                        searchViewModelNbBedroomMini = searchViewModel.getNbBedroomMini();
                    }
                    updateLiveDataRegistration(2, searchViewModelNbBedroomMini);


                    if (searchViewModelNbBedroomMini != null) {
                        // read searchViewModel.nbBedroomMini.getValue()
                        searchViewModelNbBedroomMiniGetValue = searchViewModelNbBedroomMini.getValue();
                    }
            }
            if ((dirtyFlags & 0x60008L) != 0) {

                    if (searchViewModel != null) {
                        // read searchViewModel.priceMini
                        searchViewModelPriceMini = searchViewModel.getPriceMini();
                    }
                    updateLiveDataRegistration(3, searchViewModelPriceMini);


                    if (searchViewModelPriceMini != null) {
                        // read searchViewModel.priceMini.getValue()
                        searchViewModelPriceMiniGetValue = searchViewModelPriceMini.getValue();
                    }
            }
            if ((dirtyFlags & 0x60010L) != 0) {

                    if (searchViewModel != null) {
                        // read searchViewModel.dateOutMini
                        searchViewModelDateOutMini = searchViewModel.getDateOutMini();
                    }
                    updateLiveDataRegistration(4, searchViewModelDateOutMini);


                    if (searchViewModelDateOutMini != null) {
                        // read searchViewModel.dateOutMini.getValue()
                        searchViewModelDateOutMiniGetValue = searchViewModelDateOutMini.getValue();
                    }
            }
            if ((dirtyFlags & 0x60020L) != 0) {

                    if (searchViewModel != null) {
                        // read searchViewModel.dateOutMaxi
                        searchViewModelDateOutMaxi = searchViewModel.getDateOutMaxi();
                    }
                    updateLiveDataRegistration(5, searchViewModelDateOutMaxi);


                    if (searchViewModelDateOutMaxi != null) {
                        // read searchViewModel.dateOutMaxi.getValue()
                        searchViewModelDateOutMaxiGetValue = searchViewModelDateOutMaxi.getValue();
                    }
            }
            if ((dirtyFlags & 0x60040L) != 0) {

                    if (searchViewModel != null) {
                        // read searchViewModel.priceMaxi
                        searchViewModelPriceMaxi = searchViewModel.getPriceMaxi();
                    }
                    updateLiveDataRegistration(6, searchViewModelPriceMaxi);


                    if (searchViewModelPriceMaxi != null) {
                        // read searchViewModel.priceMaxi.getValue()
                        searchViewModelPriceMaxiGetValue = searchViewModelPriceMaxi.getValue();
                    }
            }
            if ((dirtyFlags & 0x60080L) != 0) {

                    if (searchViewModel != null) {
                        // read searchViewModel.nbBedroomMaxi
                        searchViewModelNbBedroomMaxi = searchViewModel.getNbBedroomMaxi();
                    }
                    updateLiveDataRegistration(7, searchViewModelNbBedroomMaxi);


                    if (searchViewModelNbBedroomMaxi != null) {
                        // read searchViewModel.nbBedroomMaxi.getValue()
                        searchViewModelNbBedroomMaxiGetValue = searchViewModelNbBedroomMaxi.getValue();
                    }
            }
            if ((dirtyFlags & 0x60100L) != 0) {

                    if (searchViewModel != null) {
                        // read searchViewModel.nbBathroomMini
                        searchViewModelNbBathroomMini = searchViewModel.getNbBathroomMini();
                    }
                    updateLiveDataRegistration(8, searchViewModelNbBathroomMini);


                    if (searchViewModelNbBathroomMini != null) {
                        // read searchViewModel.nbBathroomMini.getValue()
                        searchViewModelNbBathroomMiniGetValue = searchViewModelNbBathroomMini.getValue();
                    }
            }
            if ((dirtyFlags & 0x60200L) != 0) {

                    if (searchViewModel != null) {
                        // read searchViewModel.nbRoomMini
                        searchViewModelNbRoomMini = searchViewModel.getNbRoomMini();
                    }
                    updateLiveDataRegistration(9, searchViewModelNbRoomMini);


                    if (searchViewModelNbRoomMini != null) {
                        // read searchViewModel.nbRoomMini.getValue()
                        searchViewModelNbRoomMiniGetValue = searchViewModelNbRoomMini.getValue();
                    }
            }
            if ((dirtyFlags & 0x60400L) != 0) {

                    if (searchViewModel != null) {
                        // read searchViewModel.area
                        searchViewModelArea = searchViewModel.getArea();
                    }
                    updateLiveDataRegistration(10, searchViewModelArea);


                    if (searchViewModelArea != null) {
                        // read searchViewModel.area.getValue()
                        searchViewModelAreaGetValue = searchViewModelArea.getValue();
                    }
            }
            if ((dirtyFlags & 0x60800L) != 0) {

                    if (searchViewModel != null) {
                        // read searchViewModel.surfaceMaxi
                        searchViewModelSurfaceMaxi = searchViewModel.getSurfaceMaxi();
                    }
                    updateLiveDataRegistration(11, searchViewModelSurfaceMaxi);


                    if (searchViewModelSurfaceMaxi != null) {
                        // read searchViewModel.surfaceMaxi.getValue()
                        searchViewModelSurfaceMaxiGetValue = searchViewModelSurfaceMaxi.getValue();
                    }
            }
            if ((dirtyFlags & 0x61000L) != 0) {

                    if (searchViewModel != null) {
                        // read searchViewModel.nbBathroomMaxi
                        searchViewModelNbBathroomMaxi = searchViewModel.getNbBathroomMaxi();
                    }
                    updateLiveDataRegistration(12, searchViewModelNbBathroomMaxi);


                    if (searchViewModelNbBathroomMaxi != null) {
                        // read searchViewModel.nbBathroomMaxi.getValue()
                        searchViewModelNbBathroomMaxiGetValue = searchViewModelNbBathroomMaxi.getValue();
                    }
            }
            if ((dirtyFlags & 0x62000L) != 0) {

                    if (searchViewModel != null) {
                        // read searchViewModel.dateInMini
                        searchViewModelDateInMini = searchViewModel.getDateInMini();
                    }
                    updateLiveDataRegistration(13, searchViewModelDateInMini);


                    if (searchViewModelDateInMini != null) {
                        // read searchViewModel.dateInMini.getValue()
                        searchViewModelDateInMiniGetValue = searchViewModelDateInMini.getValue();
                    }
            }
            if ((dirtyFlags & 0x64000L) != 0) {

                    if (searchViewModel != null) {
                        // read searchViewModel.pictureMini
                        searchViewModelPictureMini = searchViewModel.getPictureMini();
                    }
                    updateLiveDataRegistration(14, searchViewModelPictureMini);


                    if (searchViewModelPictureMini != null) {
                        // read searchViewModel.pictureMini.getValue()
                        searchViewModelPictureMiniGetValue = searchViewModelPictureMini.getValue();
                    }
            }
            if ((dirtyFlags & 0x68000L) != 0) {

                    if (searchViewModel != null) {
                        // read searchViewModel.type
                        searchViewModelType = searchViewModel.getType();
                    }
                    updateLiveDataRegistration(15, searchViewModelType);


                    if (searchViewModelType != null) {
                        // read searchViewModel.type.getValue()
                        searchViewModelTypeGetValue = searchViewModelType.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(searchViewModel.type.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxSearchViewModelTypeGetValue = androidx.databinding.ViewDataBinding.safeUnbox(searchViewModelTypeGetValue);
            }
            if ((dirtyFlags & 0x70000L) != 0) {

                    if (searchViewModel != null) {
                        // read searchViewModel.surfaceMini
                        searchViewModelSurfaceMini = searchViewModel.getSurfaceMini();
                    }
                    updateLiveDataRegistration(16, searchViewModelSurfaceMini);


                    if (searchViewModelSurfaceMini != null) {
                        // read searchViewModel.surfaceMini.getValue()
                        searchViewModelSurfaceMiniGetValue = searchViewModelSurfaceMini.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x68000L) != 0) {
            // api target 1

            androidx.databinding.adapters.AdapterViewBindingAdapter.setSelectedItemPosition(this.fragmentAddTypeSpinner, androidxDatabindingViewDataBindingSafeUnboxSearchViewModelTypeGetValue);
        }
        if ((dirtyFlags & 0x40000L) != 0) {
            // api target 1

            androidx.databinding.adapters.AdapterViewBindingAdapter.setOnItemSelectedListener(this.fragmentAddTypeSpinner, (androidx.databinding.adapters.AdapterViewBindingAdapter.OnItemSelected)null, (androidx.databinding.adapters.AdapterViewBindingAdapter.OnNothingSelected)null, fragmentAddTypeSpinnerandroidSelectedItemPositionAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.fragmentSearchAreaEdittext, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, fragmentSearchAreaEdittextandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.fragmentSearchBathroomMaxiEdittext, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, fragmentSearchBathroomMaxiEdittextandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.fragmentSearchBathroomMiniEdittext, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, fragmentSearchBathroomMiniEdittextandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.fragmentSearchBedroomMaxiEdittext, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, fragmentSearchBedroomMaxiEdittextandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.fragmentSearchBedroomMiniEdittext, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, fragmentSearchBedroomMiniEdittextandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.fragmentSearchDateInMaxiTextview, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, fragmentSearchDateInMaxiTextviewandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.fragmentSearchDateInMiniTextview, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, fragmentSearchDateInMiniTextviewandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.fragmentSearchDateOutMaxiTextview, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, fragmentSearchDateOutMaxiTextviewandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.fragmentSearchDateOutMiniTextview, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, fragmentSearchDateOutMiniTextviewandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.fragmentSearchPictureMiniEditext, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, fragmentSearchPictureMiniEditextandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.fragmentSearchPriceMaxiEdittext, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, fragmentSearchPriceMaxiEdittextandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.fragmentSearchPriceMiniEdittext, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, fragmentSearchPriceMiniEdittextandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.fragmentSearchRoomMaxiEdittext, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, fragmentSearchRoomMaxiEdittextandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.fragmentSearchRoomMiniEdittext, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, fragmentSearchRoomMiniEdittextandroidTextAttrChanged);
            this.fragmentSearchSearchBtn.setOnClickListener(mCallback5);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.fragmentSearchSurfaceMaxiEdittext, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, fragmentSearchSurfaceMaxiEdittextandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.fragmentSearchSurfaceMiniEdittext, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, fragmentSearchSurfaceMiniEdittextandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x60400L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fragmentSearchAreaEdittext, searchViewModelAreaGetValue);
        }
        if ((dirtyFlags & 0x61000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fragmentSearchBathroomMaxiEdittext, searchViewModelNbBathroomMaxiGetValue);
        }
        if ((dirtyFlags & 0x60100L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fragmentSearchBathroomMiniEdittext, searchViewModelNbBathroomMiniGetValue);
        }
        if ((dirtyFlags & 0x60080L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fragmentSearchBedroomMaxiEdittext, searchViewModelNbBedroomMaxiGetValue);
        }
        if ((dirtyFlags & 0x60004L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fragmentSearchBedroomMiniEdittext, searchViewModelNbBedroomMiniGetValue);
        }
        if ((dirtyFlags & 0x60001L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fragmentSearchDateInMaxiTextview, searchViewModelDateInMaxiGetValue);
        }
        if ((dirtyFlags & 0x62000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fragmentSearchDateInMiniTextview, searchViewModelDateInMiniGetValue);
        }
        if ((dirtyFlags & 0x60020L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fragmentSearchDateOutMaxiTextview, searchViewModelDateOutMaxiGetValue);
        }
        if ((dirtyFlags & 0x60010L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fragmentSearchDateOutMiniTextview, searchViewModelDateOutMiniGetValue);
        }
        if ((dirtyFlags & 0x64000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fragmentSearchPictureMiniEditext, searchViewModelPictureMiniGetValue);
        }
        if ((dirtyFlags & 0x60040L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fragmentSearchPriceMaxiEdittext, searchViewModelPriceMaxiGetValue);
        }
        if ((dirtyFlags & 0x60008L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fragmentSearchPriceMiniEdittext, searchViewModelPriceMiniGetValue);
        }
        if ((dirtyFlags & 0x60002L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fragmentSearchRoomMaxiEdittext, searchViewModelNbRoomMaxiGetValue);
        }
        if ((dirtyFlags & 0x60200L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fragmentSearchRoomMiniEdittext, searchViewModelNbRoomMiniGetValue);
        }
        if ((dirtyFlags & 0x60800L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fragmentSearchSurfaceMaxiEdittext, searchViewModelSurfaceMaxiGetValue);
        }
        if ((dirtyFlags & 0x70000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fragmentSearchSurfaceMiniEdittext, searchViewModelSurfaceMiniGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // searchViewModel
        ltd.kaizo.realestatemanager.controller.ui.search.SearchViewModel searchViewModel = mSearchViewModel;
        // searchViewModel != null
        boolean searchViewModelJavaLangObjectNull = false;



        searchViewModelJavaLangObjectNull = (searchViewModel) != (null);
        if (searchViewModelJavaLangObjectNull) {


            searchViewModel.launchSearchRequest();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): searchViewModel.dateInMaxi
        flag 1 (0x2L): searchViewModel.nbRoomMaxi
        flag 2 (0x3L): searchViewModel.nbBedroomMini
        flag 3 (0x4L): searchViewModel.priceMini
        flag 4 (0x5L): searchViewModel.dateOutMini
        flag 5 (0x6L): searchViewModel.dateOutMaxi
        flag 6 (0x7L): searchViewModel.priceMaxi
        flag 7 (0x8L): searchViewModel.nbBedroomMaxi
        flag 8 (0x9L): searchViewModel.nbBathroomMini
        flag 9 (0xaL): searchViewModel.nbRoomMini
        flag 10 (0xbL): searchViewModel.area
        flag 11 (0xcL): searchViewModel.surfaceMaxi
        flag 12 (0xdL): searchViewModel.nbBathroomMaxi
        flag 13 (0xeL): searchViewModel.dateInMini
        flag 14 (0xfL): searchViewModel.pictureMini
        flag 15 (0x10L): searchViewModel.type
        flag 16 (0x11L): searchViewModel.surfaceMini
        flag 17 (0x12L): searchViewModel
        flag 18 (0x13L): null
    flag mapping end*/
    //end
}