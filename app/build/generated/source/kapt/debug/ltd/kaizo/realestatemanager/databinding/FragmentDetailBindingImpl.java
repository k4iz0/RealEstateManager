package ltd.kaizo.realestatemanager.databinding;
import ltd.kaizo.realestatemanager.R;
import ltd.kaizo.realestatemanager.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentDetailBindingImpl extends FragmentDetailBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.guideline, 14);
        sViewsWithIds.put(R.id.fragment_add_date_textview_title, 15);
        sViewsWithIds.put(R.id.fragment_add_manager_title_textview, 16);
        sViewsWithIds.put(R.id.fragment_detail_picture_list_recycle_view, 17);
        sViewsWithIds.put(R.id.fragment_detail_poi_list_recycle_view, 18);
        sViewsWithIds.put(R.id.fragment_detail_description_title_textview, 19);
        sViewsWithIds.put(R.id.fragment_detail_surface_title_textview, 20);
        sViewsWithIds.put(R.id.fragment_detail_nb_room_title_textview, 21);
        sViewsWithIds.put(R.id.fragment_detail_nb_bathroom_title_textview, 22);
        sViewsWithIds.put(R.id.fragment_detail_nb_bedroom_title_textview, 23);
        sViewsWithIds.put(R.id.fragment_add_surface_ic, 24);
        sViewsWithIds.put(R.id.fragment_add_house_ic, 25);
        sViewsWithIds.put(R.id.fragment_add_bedroom_ic, 26);
        sViewsWithIds.put(R.id.fragment_detail_map_container, 27);
        sViewsWithIds.put(R.id.fragment_add_location_ic, 28);
        sViewsWithIds.put(R.id.fragment_add_location_title_textview, 29);
        sViewsWithIds.put(R.id.fragment_add_bathroom_ic, 30);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener fragmentAddManagerNameTextviewandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of listViewModel.managerName.getValue()
            //         is listViewModel.managerName.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(fragmentAddManagerNameTextview);
            // localize variables for thread safety
            // listViewModel.managerName.getValue()
            java.lang.String listViewModelManagerNameGetValue = null;
            // listViewModel
            ltd.kaizo.realestatemanager.controller.ui.list.ListViewModel listViewModel = mListViewModel;
            // listViewModel.managerName
            androidx.lifecycle.MutableLiveData<java.lang.String> listViewModelManagerName = null;
            // listViewModel.managerName != null
            boolean listViewModelManagerNameJavaLangObjectNull = false;
            // listViewModel != null
            boolean listViewModelJavaLangObjectNull = false;



            listViewModelJavaLangObjectNull = (listViewModel) != (null);
            if (listViewModelJavaLangObjectNull) {


                listViewModelManagerName = listViewModel.getManagerName();

                listViewModelManagerNameJavaLangObjectNull = (listViewModelManagerName) != (null);
                if (listViewModelManagerNameJavaLangObjectNull) {




                    listViewModelManagerName.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener fragmentDetailAddressTextviewandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of listViewModel.address.getValue()
            //         is listViewModel.address.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(fragmentDetailAddressTextview);
            // localize variables for thread safety
            // listViewModel.address
            androidx.lifecycle.MutableLiveData<java.lang.String> listViewModelAddress = null;
            // listViewModel.address.getValue()
            java.lang.String listViewModelAddressGetValue = null;
            // listViewModel
            ltd.kaizo.realestatemanager.controller.ui.list.ListViewModel listViewModel = mListViewModel;
            // listViewModel.address != null
            boolean listViewModelAddressJavaLangObjectNull = false;
            // listViewModel != null
            boolean listViewModelJavaLangObjectNull = false;



            listViewModelJavaLangObjectNull = (listViewModel) != (null);
            if (listViewModelJavaLangObjectNull) {


                listViewModelAddress = listViewModel.getAddress();

                listViewModelAddressJavaLangObjectNull = (listViewModelAddress) != (null);
                if (listViewModelAddressJavaLangObjectNull) {




                    listViewModelAddress.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener fragmentDetailCityTextviewandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of listViewModel.city.getValue()
            //         is listViewModel.city.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(fragmentDetailCityTextview);
            // localize variables for thread safety
            // listViewModel.city.getValue()
            java.lang.String listViewModelCityGetValue = null;
            // listViewModel.city != null
            boolean listViewModelCityJavaLangObjectNull = false;
            // listViewModel
            ltd.kaizo.realestatemanager.controller.ui.list.ListViewModel listViewModel = mListViewModel;
            // listViewModel.city
            androidx.lifecycle.MutableLiveData<java.lang.String> listViewModelCity = null;
            // listViewModel != null
            boolean listViewModelJavaLangObjectNull = false;



            listViewModelJavaLangObjectNull = (listViewModel) != (null);
            if (listViewModelJavaLangObjectNull) {


                listViewModelCity = listViewModel.getCity();

                listViewModelCityJavaLangObjectNull = (listViewModelCity) != (null);
                if (listViewModelCityJavaLangObjectNull) {




                    listViewModelCity.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener fragmentDetailDescriptionTextviewandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of listViewModel.description.getValue()
            //         is listViewModel.description.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(fragmentDetailDescriptionTextview);
            // localize variables for thread safety
            // listViewModel.description
            androidx.lifecycle.MutableLiveData<java.lang.String> listViewModelDescription = null;
            // listViewModel.description.getValue()
            java.lang.String listViewModelDescriptionGetValue = null;
            // listViewModel
            ltd.kaizo.realestatemanager.controller.ui.list.ListViewModel listViewModel = mListViewModel;
            // listViewModel.description != null
            boolean listViewModelDescriptionJavaLangObjectNull = false;
            // listViewModel != null
            boolean listViewModelJavaLangObjectNull = false;



            listViewModelJavaLangObjectNull = (listViewModel) != (null);
            if (listViewModelJavaLangObjectNull) {


                listViewModelDescription = listViewModel.getDescription();

                listViewModelDescriptionJavaLangObjectNull = (listViewModelDescription) != (null);
                if (listViewModelDescriptionJavaLangObjectNull) {




                    listViewModelDescription.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener fragmentDetailNbBathroomTextviewandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of listViewModel.nbBathroom.getValue()
            //         is listViewModel.nbBathroom.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(fragmentDetailNbBathroomTextview);
            // localize variables for thread safety
            // listViewModel.nbBathroom != null
            boolean listViewModelNbBathroomJavaLangObjectNull = false;
            // listViewModel.nbBathroom.getValue()
            java.lang.String listViewModelNbBathroomGetValue = null;
            // listViewModel
            ltd.kaizo.realestatemanager.controller.ui.list.ListViewModel listViewModel = mListViewModel;
            // listViewModel.nbBathroom
            androidx.lifecycle.MutableLiveData<java.lang.String> listViewModelNbBathroom = null;
            // listViewModel != null
            boolean listViewModelJavaLangObjectNull = false;



            listViewModelJavaLangObjectNull = (listViewModel) != (null);
            if (listViewModelJavaLangObjectNull) {


                listViewModelNbBathroom = listViewModel.getNbBathroom();

                listViewModelNbBathroomJavaLangObjectNull = (listViewModelNbBathroom) != (null);
                if (listViewModelNbBathroomJavaLangObjectNull) {




                    listViewModelNbBathroom.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener fragmentDetailNbBedroomTextviewandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of listViewModel.nbBedroom.getValue()
            //         is listViewModel.nbBedroom.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(fragmentDetailNbBedroomTextview);
            // localize variables for thread safety
            // listViewModel.nbBedroom.getValue()
            java.lang.String listViewModelNbBedroomGetValue = null;
            // listViewModel.nbBedroom
            androidx.lifecycle.MutableLiveData<java.lang.String> listViewModelNbBedroom = null;
            // listViewModel.nbBedroom != null
            boolean listViewModelNbBedroomJavaLangObjectNull = false;
            // listViewModel
            ltd.kaizo.realestatemanager.controller.ui.list.ListViewModel listViewModel = mListViewModel;
            // listViewModel != null
            boolean listViewModelJavaLangObjectNull = false;



            listViewModelJavaLangObjectNull = (listViewModel) != (null);
            if (listViewModelJavaLangObjectNull) {


                listViewModelNbBedroom = listViewModel.getNbBedroom();

                listViewModelNbBedroomJavaLangObjectNull = (listViewModelNbBedroom) != (null);
                if (listViewModelNbBedroomJavaLangObjectNull) {




                    listViewModelNbBedroom.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener fragmentDetailNbRoomTextviewandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of listViewModel.nbRoom.getValue()
            //         is listViewModel.nbRoom.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(fragmentDetailNbRoomTextview);
            // localize variables for thread safety
            // listViewModel.nbRoom
            androidx.lifecycle.MutableLiveData<java.lang.String> listViewModelNbRoom = null;
            // listViewModel
            ltd.kaizo.realestatemanager.controller.ui.list.ListViewModel listViewModel = mListViewModel;
            // listViewModel.nbRoom.getValue()
            java.lang.String listViewModelNbRoomGetValue = null;
            // listViewModel != null
            boolean listViewModelJavaLangObjectNull = false;
            // listViewModel.nbRoom != null
            boolean listViewModelNbRoomJavaLangObjectNull = false;



            listViewModelJavaLangObjectNull = (listViewModel) != (null);
            if (listViewModelJavaLangObjectNull) {


                listViewModelNbRoom = listViewModel.getNbRoom();

                listViewModelNbRoomJavaLangObjectNull = (listViewModelNbRoom) != (null);
                if (listViewModelNbRoomJavaLangObjectNull) {




                    listViewModelNbRoom.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener fragmentDetailPostalCodeTextviewandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of listViewModel.postalCode.getValue()
            //         is listViewModel.postalCode.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(fragmentDetailPostalCodeTextview);
            // localize variables for thread safety
            // listViewModel.postalCode.getValue()
            java.lang.String listViewModelPostalCodeGetValue = null;
            // listViewModel
            ltd.kaizo.realestatemanager.controller.ui.list.ListViewModel listViewModel = mListViewModel;
            // listViewModel.postalCode
            androidx.lifecycle.MutableLiveData<java.lang.String> listViewModelPostalCode = null;
            // listViewModel.postalCode != null
            boolean listViewModelPostalCodeJavaLangObjectNull = false;
            // listViewModel != null
            boolean listViewModelJavaLangObjectNull = false;



            listViewModelJavaLangObjectNull = (listViewModel) != (null);
            if (listViewModelJavaLangObjectNull) {


                listViewModelPostalCode = listViewModel.getPostalCode();

                listViewModelPostalCodeJavaLangObjectNull = (listViewModelPostalCode) != (null);
                if (listViewModelPostalCodeJavaLangObjectNull) {




                    listViewModelPostalCode.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener fragmentDetailPriceandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of listViewModel.price.getValue()
            //         is listViewModel.price.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(fragmentDetailPrice);
            // localize variables for thread safety
            // listViewModel.price.getValue()
            java.lang.String listViewModelPriceGetValue = null;
            // listViewModel.price
            androidx.lifecycle.MutableLiveData<java.lang.String> listViewModelPrice = null;
            // listViewModel.price != null
            boolean listViewModelPriceJavaLangObjectNull = false;
            // listViewModel
            ltd.kaizo.realestatemanager.controller.ui.list.ListViewModel listViewModel = mListViewModel;
            // listViewModel != null
            boolean listViewModelJavaLangObjectNull = false;



            listViewModelJavaLangObjectNull = (listViewModel) != (null);
            if (listViewModelJavaLangObjectNull) {


                listViewModelPrice = listViewModel.getPrice();

                listViewModelPriceJavaLangObjectNull = (listViewModelPrice) != (null);
                if (listViewModelPriceJavaLangObjectNull) {




                    listViewModelPrice.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener fragmentDetailSurfaceTextviewandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of listViewModel.surface.getValue()
            //         is listViewModel.surface.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(fragmentDetailSurfaceTextview);
            // localize variables for thread safety
            // listViewModel.surface.getValue()
            java.lang.String listViewModelSurfaceGetValue = null;
            // listViewModel.surface != null
            boolean listViewModelSurfaceJavaLangObjectNull = false;
            // listViewModel.surface
            androidx.lifecycle.MutableLiveData<java.lang.String> listViewModelSurface = null;
            // listViewModel
            ltd.kaizo.realestatemanager.controller.ui.list.ListViewModel listViewModel = mListViewModel;
            // listViewModel != null
            boolean listViewModelJavaLangObjectNull = false;



            listViewModelJavaLangObjectNull = (listViewModel) != (null);
            if (listViewModelJavaLangObjectNull) {


                listViewModelSurface = listViewModel.getSurface();

                listViewModelSurfaceJavaLangObjectNull = (listViewModelSurface) != (null);
                if (listViewModelSurfaceJavaLangObjectNull) {




                    listViewModelSurface.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 31, sIncludes, sViewsWithIds));
    }
    private FragmentDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 13
            , (android.widget.ImageView) bindings[30]
            , (android.widget.ImageView) bindings[26]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[15]
            , (android.widget.ImageView) bindings[25]
            , (android.widget.ImageView) bindings[28]
            , (android.widget.TextView) bindings[29]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[16]
            , (android.widget.ImageView) bindings[24]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[19]
            , (android.widget.ImageView) bindings[27]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[22]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[23]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[21]
            , (androidx.recyclerview.widget.RecyclerView) bindings[17]
            , (androidx.recyclerview.widget.RecyclerView) bindings[18]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[20]
            , (androidx.constraintlayout.widget.Guideline) bindings[14]
            );
        this.fragmentAddDateInTextview.setTag(null);
        this.fragmentAddManagerNameTextview.setTag(null);
        this.fragmentDetailAddressTextview.setTag(null);
        this.fragmentDetailCityTextview.setTag(null);
        this.fragmentDetailDateOutTextview.setTag(null);
        this.fragmentDetailDescriptionTextview.setTag(null);
        this.fragmentDetailNbBathroomTextview.setTag(null);
        this.fragmentDetailNbBedroomTextview.setTag(null);
        this.fragmentDetailNbRoomTextview.setTag(null);
        this.fragmentDetailPostalCodeTextview.setTag(null);
        this.fragmentDetailPrice.setTag(null);
        this.fragmentDetailSoldOnTextview.setTag(null);
        this.fragmentDetailSurfaceTextview.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4000L;
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
        if (BR.listViewModel == variableId) {
            setListViewModel((ltd.kaizo.realestatemanager.controller.ui.list.ListViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setListViewModel(@Nullable ltd.kaizo.realestatemanager.controller.ui.list.ListViewModel ListViewModel) {
        this.mListViewModel = ListViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2000L;
        }
        notifyPropertyChanged(BR.listViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeListViewModelDateOut((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeListViewModelDescription((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeListViewModelManagerName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeListViewModelPostalCode((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeListViewModelNbBathroom((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeListViewModelSurface((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeListViewModelPrice((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 7 :
                return onChangeListViewModelIsSold((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 8 :
                return onChangeListViewModelDateIn((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 9 :
                return onChangeListViewModelAddress((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 10 :
                return onChangeListViewModelNbRoom((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 11 :
                return onChangeListViewModelCity((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 12 :
                return onChangeListViewModelNbBedroom((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeListViewModelDateOut(androidx.lifecycle.MutableLiveData<java.lang.String> ListViewModelDateOut, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeListViewModelDescription(androidx.lifecycle.MutableLiveData<java.lang.String> ListViewModelDescription, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeListViewModelManagerName(androidx.lifecycle.MutableLiveData<java.lang.String> ListViewModelManagerName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeListViewModelPostalCode(androidx.lifecycle.MutableLiveData<java.lang.String> ListViewModelPostalCode, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeListViewModelNbBathroom(androidx.lifecycle.MutableLiveData<java.lang.String> ListViewModelNbBathroom, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeListViewModelSurface(androidx.lifecycle.MutableLiveData<java.lang.String> ListViewModelSurface, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeListViewModelPrice(androidx.lifecycle.MutableLiveData<java.lang.String> ListViewModelPrice, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeListViewModelIsSold(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ListViewModelIsSold, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeListViewModelDateIn(androidx.lifecycle.MutableLiveData<java.lang.String> ListViewModelDateIn, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeListViewModelAddress(androidx.lifecycle.MutableLiveData<java.lang.String> ListViewModelAddress, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeListViewModelNbRoom(androidx.lifecycle.MutableLiveData<java.lang.String> ListViewModelNbRoom, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeListViewModelCity(androidx.lifecycle.MutableLiveData<java.lang.String> ListViewModelCity, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeListViewModelNbBedroom(androidx.lifecycle.MutableLiveData<java.lang.String> ListViewModelNbBedroom, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1000L;
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
        java.lang.String listViewModelDateOutGetValue = null;
        java.lang.String listViewModelNbBathroomGetValue = null;
        java.lang.String listViewModelManagerNameGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> listViewModelDateOut = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> listViewModelDescription = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxListViewModelIsSoldGetValue = false;
        java.lang.String listViewModelPostalCodeGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> listViewModelManagerName = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> listViewModelPostalCode = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> listViewModelNbBathroom = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> listViewModelSurface = null;
        java.lang.Boolean listViewModelIsSoldGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> listViewModelPrice = null;
        java.lang.String listViewModelAddressGetValue = null;
        java.lang.String listViewModelNbRoomGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> listViewModelIsSold = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> listViewModelDateIn = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> listViewModelAddress = null;
        java.lang.String listViewModelCityGetValue = null;
        java.lang.String listViewModelDescriptionGetValue = null;
        java.lang.String listViewModelPriceGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> listViewModelNbRoom = null;
        java.lang.String listViewModelNbBedroomGetValue = null;
        java.lang.String listViewModelSurfaceGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> listViewModelCity = null;
        int listViewModelIsSoldViewVISIBLEViewINVISIBLE = 0;
        java.lang.String listViewModelDateInGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> listViewModelNbBedroom = null;
        ltd.kaizo.realestatemanager.controller.ui.list.ListViewModel listViewModel = mListViewModel;

        if ((dirtyFlags & 0x7fffL) != 0) {


            if ((dirtyFlags & 0x6001L) != 0) {

                    if (listViewModel != null) {
                        // read listViewModel.dateOut
                        listViewModelDateOut = listViewModel.getDateOut();
                    }
                    updateLiveDataRegistration(0, listViewModelDateOut);


                    if (listViewModelDateOut != null) {
                        // read listViewModel.dateOut.getValue()
                        listViewModelDateOutGetValue = listViewModelDateOut.getValue();
                    }
            }
            if ((dirtyFlags & 0x6002L) != 0) {

                    if (listViewModel != null) {
                        // read listViewModel.description
                        listViewModelDescription = listViewModel.getDescription();
                    }
                    updateLiveDataRegistration(1, listViewModelDescription);


                    if (listViewModelDescription != null) {
                        // read listViewModel.description.getValue()
                        listViewModelDescriptionGetValue = listViewModelDescription.getValue();
                    }
            }
            if ((dirtyFlags & 0x6004L) != 0) {

                    if (listViewModel != null) {
                        // read listViewModel.managerName
                        listViewModelManagerName = listViewModel.getManagerName();
                    }
                    updateLiveDataRegistration(2, listViewModelManagerName);


                    if (listViewModelManagerName != null) {
                        // read listViewModel.managerName.getValue()
                        listViewModelManagerNameGetValue = listViewModelManagerName.getValue();
                    }
            }
            if ((dirtyFlags & 0x6008L) != 0) {

                    if (listViewModel != null) {
                        // read listViewModel.postalCode
                        listViewModelPostalCode = listViewModel.getPostalCode();
                    }
                    updateLiveDataRegistration(3, listViewModelPostalCode);


                    if (listViewModelPostalCode != null) {
                        // read listViewModel.postalCode.getValue()
                        listViewModelPostalCodeGetValue = listViewModelPostalCode.getValue();
                    }
            }
            if ((dirtyFlags & 0x6010L) != 0) {

                    if (listViewModel != null) {
                        // read listViewModel.nbBathroom
                        listViewModelNbBathroom = listViewModel.getNbBathroom();
                    }
                    updateLiveDataRegistration(4, listViewModelNbBathroom);


                    if (listViewModelNbBathroom != null) {
                        // read listViewModel.nbBathroom.getValue()
                        listViewModelNbBathroomGetValue = listViewModelNbBathroom.getValue();
                    }
            }
            if ((dirtyFlags & 0x6020L) != 0) {

                    if (listViewModel != null) {
                        // read listViewModel.surface
                        listViewModelSurface = listViewModel.getSurface();
                    }
                    updateLiveDataRegistration(5, listViewModelSurface);


                    if (listViewModelSurface != null) {
                        // read listViewModel.surface.getValue()
                        listViewModelSurfaceGetValue = listViewModelSurface.getValue();
                    }
            }
            if ((dirtyFlags & 0x6040L) != 0) {

                    if (listViewModel != null) {
                        // read listViewModel.price
                        listViewModelPrice = listViewModel.getPrice();
                    }
                    updateLiveDataRegistration(6, listViewModelPrice);


                    if (listViewModelPrice != null) {
                        // read listViewModel.price.getValue()
                        listViewModelPriceGetValue = listViewModelPrice.getValue();
                    }
            }
            if ((dirtyFlags & 0x6080L) != 0) {

                    if (listViewModel != null) {
                        // read listViewModel.isSold
                        listViewModelIsSold = listViewModel.isSold();
                    }
                    updateLiveDataRegistration(7, listViewModelIsSold);


                    if (listViewModelIsSold != null) {
                        // read listViewModel.isSold.getValue()
                        listViewModelIsSoldGetValue = listViewModelIsSold.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(listViewModel.isSold.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxListViewModelIsSoldGetValue = androidx.databinding.ViewDataBinding.safeUnbox(listViewModelIsSoldGetValue);
                if((dirtyFlags & 0x6080L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxListViewModelIsSoldGetValue) {
                            dirtyFlags |= 0x10000L;
                    }
                    else {
                            dirtyFlags |= 0x8000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(listViewModel.isSold.getValue()) ? View.VISIBLE : View.INVISIBLE
                    listViewModelIsSoldViewVISIBLEViewINVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxListViewModelIsSoldGetValue) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
            }
            if ((dirtyFlags & 0x6100L) != 0) {

                    if (listViewModel != null) {
                        // read listViewModel.dateIn
                        listViewModelDateIn = listViewModel.getDateIn();
                    }
                    updateLiveDataRegistration(8, listViewModelDateIn);


                    if (listViewModelDateIn != null) {
                        // read listViewModel.dateIn.getValue()
                        listViewModelDateInGetValue = listViewModelDateIn.getValue();
                    }
            }
            if ((dirtyFlags & 0x6200L) != 0) {

                    if (listViewModel != null) {
                        // read listViewModel.address
                        listViewModelAddress = listViewModel.getAddress();
                    }
                    updateLiveDataRegistration(9, listViewModelAddress);


                    if (listViewModelAddress != null) {
                        // read listViewModel.address.getValue()
                        listViewModelAddressGetValue = listViewModelAddress.getValue();
                    }
            }
            if ((dirtyFlags & 0x6400L) != 0) {

                    if (listViewModel != null) {
                        // read listViewModel.nbRoom
                        listViewModelNbRoom = listViewModel.getNbRoom();
                    }
                    updateLiveDataRegistration(10, listViewModelNbRoom);


                    if (listViewModelNbRoom != null) {
                        // read listViewModel.nbRoom.getValue()
                        listViewModelNbRoomGetValue = listViewModelNbRoom.getValue();
                    }
            }
            if ((dirtyFlags & 0x6800L) != 0) {

                    if (listViewModel != null) {
                        // read listViewModel.city
                        listViewModelCity = listViewModel.getCity();
                    }
                    updateLiveDataRegistration(11, listViewModelCity);


                    if (listViewModelCity != null) {
                        // read listViewModel.city.getValue()
                        listViewModelCityGetValue = listViewModelCity.getValue();
                    }
            }
            if ((dirtyFlags & 0x7000L) != 0) {

                    if (listViewModel != null) {
                        // read listViewModel.nbBedroom
                        listViewModelNbBedroom = listViewModel.getNbBedroom();
                    }
                    updateLiveDataRegistration(12, listViewModelNbBedroom);


                    if (listViewModelNbBedroom != null) {
                        // read listViewModel.nbBedroom.getValue()
                        listViewModelNbBedroomGetValue = listViewModelNbBedroom.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x6100L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fragmentAddDateInTextview, listViewModelDateInGetValue);
        }
        if ((dirtyFlags & 0x6004L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fragmentAddManagerNameTextview, listViewModelManagerNameGetValue);
        }
        if ((dirtyFlags & 0x4000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.fragmentAddManagerNameTextview, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, fragmentAddManagerNameTextviewandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.fragmentDetailAddressTextview, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, fragmentDetailAddressTextviewandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.fragmentDetailCityTextview, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, fragmentDetailCityTextviewandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.fragmentDetailDescriptionTextview, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, fragmentDetailDescriptionTextviewandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.fragmentDetailNbBathroomTextview, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, fragmentDetailNbBathroomTextviewandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.fragmentDetailNbBedroomTextview, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, fragmentDetailNbBedroomTextviewandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.fragmentDetailNbRoomTextview, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, fragmentDetailNbRoomTextviewandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.fragmentDetailPostalCodeTextview, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, fragmentDetailPostalCodeTextviewandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.fragmentDetailPrice, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, fragmentDetailPriceandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.fragmentDetailSurfaceTextview, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, fragmentDetailSurfaceTextviewandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x6200L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fragmentDetailAddressTextview, listViewModelAddressGetValue);
        }
        if ((dirtyFlags & 0x6800L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fragmentDetailCityTextview, listViewModelCityGetValue);
        }
        if ((dirtyFlags & 0x6001L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fragmentDetailDateOutTextview, listViewModelDateOutGetValue);
        }
        if ((dirtyFlags & 0x6002L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fragmentDetailDescriptionTextview, listViewModelDescriptionGetValue);
        }
        if ((dirtyFlags & 0x6010L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fragmentDetailNbBathroomTextview, listViewModelNbBathroomGetValue);
        }
        if ((dirtyFlags & 0x7000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fragmentDetailNbBedroomTextview, listViewModelNbBedroomGetValue);
        }
        if ((dirtyFlags & 0x6400L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fragmentDetailNbRoomTextview, listViewModelNbRoomGetValue);
        }
        if ((dirtyFlags & 0x6008L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fragmentDetailPostalCodeTextview, listViewModelPostalCodeGetValue);
        }
        if ((dirtyFlags & 0x6040L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fragmentDetailPrice, listViewModelPriceGetValue);
        }
        if ((dirtyFlags & 0x6080L) != 0) {
            // api target 1

            this.fragmentDetailSoldOnTextview.setVisibility(listViewModelIsSoldViewVISIBLEViewINVISIBLE);
        }
        if ((dirtyFlags & 0x6020L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fragmentDetailSurfaceTextview, listViewModelSurfaceGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): listViewModel.dateOut
        flag 1 (0x2L): listViewModel.description
        flag 2 (0x3L): listViewModel.managerName
        flag 3 (0x4L): listViewModel.postalCode
        flag 4 (0x5L): listViewModel.nbBathroom
        flag 5 (0x6L): listViewModel.surface
        flag 6 (0x7L): listViewModel.price
        flag 7 (0x8L): listViewModel.isSold
        flag 8 (0x9L): listViewModel.dateIn
        flag 9 (0xaL): listViewModel.address
        flag 10 (0xbL): listViewModel.nbRoom
        flag 11 (0xcL): listViewModel.city
        flag 12 (0xdL): listViewModel.nbBedroom
        flag 13 (0xeL): listViewModel
        flag 14 (0xfL): null
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(listViewModel.isSold.getValue()) ? View.VISIBLE : View.INVISIBLE
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(listViewModel.isSold.getValue()) ? View.VISIBLE : View.INVISIBLE
    flag mapping end*/
    //end
}