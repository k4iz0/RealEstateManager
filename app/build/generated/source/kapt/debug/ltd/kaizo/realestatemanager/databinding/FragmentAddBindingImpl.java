package ltd.kaizo.realestatemanager.databinding;
import ltd.kaizo.realestatemanager.R;
import ltd.kaizo.realestatemanager.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAddBindingImpl extends FragmentAddBinding implements ltd.kaizo.realestatemanager.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.fragment_add_constraint_layout, 16);
        sViewsWithIds.put(R.id.fragment_add_date_textview_title, 17);
        sViewsWithIds.put(R.id.fragment_add_manager_title_textview, 18);
        sViewsWithIds.put(R.id.fragment_add_picture_list_recycle_view, 19);
        sViewsWithIds.put(R.id.fragment_add_fab, 20);
        sViewsWithIds.put(R.id.fragment_add_surface_title_textview, 21);
        sViewsWithIds.put(R.id.fragment_add_nb_room_title_textview, 22);
        sViewsWithIds.put(R.id.fragment_add_nb_bathroom_title_textview, 23);
        sViewsWithIds.put(R.id.fragment_add_nb_bedroom_title_textview, 24);
        sViewsWithIds.put(R.id.fragment_add_price_textview, 25);
        sViewsWithIds.put(R.id.fragment_add_add_poi_btn, 26);
        sViewsWithIds.put(R.id.fragment_add_sold_textview, 27);
        sViewsWithIds.put(R.id.fragment_add_type_textview, 28);
        sViewsWithIds.put(R.id.guideline3, 29);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback14;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener fragmentAddAddressEdittextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of estateViewModel.address.getValue()
            //         is estateViewModel.address.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(fragmentAddAddressEdittext);
            // localize variables for thread safety
            // estateViewModel.address != null
            boolean estateViewModelAddressJavaLangObjectNull = false;
            // estateViewModel
            ltd.kaizo.realestatemanager.controller.ui.add.EstateViewModel estateViewModel = mEstateViewModel;
            // estateViewModel.address.getValue()
            java.lang.String estateViewModelAddressGetValue = null;
            // estateViewModel != null
            boolean estateViewModelJavaLangObjectNull = false;
            // estateViewModel.address
            androidx.lifecycle.MutableLiveData<java.lang.String> estateViewModelAddress = null;



            estateViewModelJavaLangObjectNull = (estateViewModel) != (null);
            if (estateViewModelJavaLangObjectNull) {


                estateViewModelAddress = estateViewModel.getAddress();

                estateViewModelAddressJavaLangObjectNull = (estateViewModelAddress) != (null);
                if (estateViewModelAddressJavaLangObjectNull) {




                    estateViewModelAddress.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener fragmentAddCityEdittextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of estateViewModel.city.getValue()
            //         is estateViewModel.city.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(fragmentAddCityEdittext);
            // localize variables for thread safety
            // estateViewModel
            ltd.kaizo.realestatemanager.controller.ui.add.EstateViewModel estateViewModel = mEstateViewModel;
            // estateViewModel != null
            boolean estateViewModelJavaLangObjectNull = false;
            // estateViewModel.city.getValue()
            java.lang.String estateViewModelCityGetValue = null;
            // estateViewModel.city != null
            boolean estateViewModelCityJavaLangObjectNull = false;
            // estateViewModel.city
            androidx.lifecycle.MutableLiveData<java.lang.String> estateViewModelCity = null;



            estateViewModelJavaLangObjectNull = (estateViewModel) != (null);
            if (estateViewModelJavaLangObjectNull) {


                estateViewModelCity = estateViewModel.getCity();

                estateViewModelCityJavaLangObjectNull = (estateViewModelCity) != (null);
                if (estateViewModelCityJavaLangObjectNull) {




                    estateViewModelCity.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener fragmentAddDescriptionEdittextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of estateViewModel.description.getValue()
            //         is estateViewModel.description.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(fragmentAddDescriptionEdittext);
            // localize variables for thread safety
            // estateViewModel.description
            androidx.lifecycle.MutableLiveData<java.lang.String> estateViewModelDescription = null;
            // estateViewModel
            ltd.kaizo.realestatemanager.controller.ui.add.EstateViewModel estateViewModel = mEstateViewModel;
            // estateViewModel != null
            boolean estateViewModelJavaLangObjectNull = false;
            // estateViewModel.description != null
            boolean estateViewModelDescriptionJavaLangObjectNull = false;
            // estateViewModel.description.getValue()
            java.lang.String estateViewModelDescriptionGetValue = null;



            estateViewModelJavaLangObjectNull = (estateViewModel) != (null);
            if (estateViewModelJavaLangObjectNull) {


                estateViewModelDescription = estateViewModel.getDescription();

                estateViewModelDescriptionJavaLangObjectNull = (estateViewModelDescription) != (null);
                if (estateViewModelDescriptionJavaLangObjectNull) {




                    estateViewModelDescription.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener fragmentAddManagerNameTextviewandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of estateViewModel.managerName.getValue()
            //         is estateViewModel.managerName.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(fragmentAddManagerNameTextview);
            // localize variables for thread safety
            // estateViewModel.managerName.getValue()
            java.lang.String estateViewModelManagerNameGetValue = null;
            // estateViewModel.managerName != null
            boolean estateViewModelManagerNameJavaLangObjectNull = false;
            // estateViewModel.managerName
            androidx.lifecycle.MutableLiveData<java.lang.String> estateViewModelManagerName = null;
            // estateViewModel
            ltd.kaizo.realestatemanager.controller.ui.add.EstateViewModel estateViewModel = mEstateViewModel;
            // estateViewModel != null
            boolean estateViewModelJavaLangObjectNull = false;



            estateViewModelJavaLangObjectNull = (estateViewModel) != (null);
            if (estateViewModelJavaLangObjectNull) {


                estateViewModelManagerName = estateViewModel.getManagerName();

                estateViewModelManagerNameJavaLangObjectNull = (estateViewModelManagerName) != (null);
                if (estateViewModelManagerNameJavaLangObjectNull) {




                    estateViewModelManagerName.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener fragmentAddNbBathroomSpinnerandroidSelectedItemPositionAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of estateViewModel.nbBathroom.getValue()
            //         is estateViewModel.nbBathroom.setValue((java.lang.Integer) callbackArg_0)
            int callbackArg_0 = fragmentAddNbBathroomSpinner.getSelectedItemPosition();
            // localize variables for thread safety
            // estateViewModel.nbBathroom.getValue()
            java.lang.Integer estateViewModelNbBathroomGetValue = null;
            // estateViewModel
            ltd.kaizo.realestatemanager.controller.ui.add.EstateViewModel estateViewModel = mEstateViewModel;
            // estateViewModel != null
            boolean estateViewModelJavaLangObjectNull = false;
            // estateViewModel.nbBathroom != null
            boolean estateViewModelNbBathroomJavaLangObjectNull = false;
            // estateViewModel.nbBathroom
            androidx.lifecycle.MutableLiveData<java.lang.Integer> estateViewModelNbBathroom = null;



            estateViewModelJavaLangObjectNull = (estateViewModel) != (null);
            if (estateViewModelJavaLangObjectNull) {


                estateViewModelNbBathroom = estateViewModel.getNbBathroom();

                estateViewModelNbBathroomJavaLangObjectNull = (estateViewModelNbBathroom) != (null);
                if (estateViewModelNbBathroomJavaLangObjectNull) {




                    estateViewModelNbBathroom.setValue(((java.lang.Integer) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener fragmentAddNbBedroomSpinnerandroidSelectedItemPositionAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of estateViewModel.nbBedroom.getValue()
            //         is estateViewModel.nbBedroom.setValue((java.lang.Integer) callbackArg_0)
            int callbackArg_0 = fragmentAddNbBedroomSpinner.getSelectedItemPosition();
            // localize variables for thread safety
            // estateViewModel.nbBedroom.getValue()
            java.lang.Integer estateViewModelNbBedroomGetValue = null;
            // estateViewModel.nbBedroom != null
            boolean estateViewModelNbBedroomJavaLangObjectNull = false;
            // estateViewModel
            ltd.kaizo.realestatemanager.controller.ui.add.EstateViewModel estateViewModel = mEstateViewModel;
            // estateViewModel.nbBedroom
            androidx.lifecycle.MutableLiveData<java.lang.Integer> estateViewModelNbBedroom = null;
            // estateViewModel != null
            boolean estateViewModelJavaLangObjectNull = false;



            estateViewModelJavaLangObjectNull = (estateViewModel) != (null);
            if (estateViewModelJavaLangObjectNull) {


                estateViewModelNbBedroom = estateViewModel.getNbBedroom();

                estateViewModelNbBedroomJavaLangObjectNull = (estateViewModelNbBedroom) != (null);
                if (estateViewModelNbBedroomJavaLangObjectNull) {




                    estateViewModelNbBedroom.setValue(((java.lang.Integer) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener fragmentAddNbRoomSpinnerandroidSelectedItemPositionAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of estateViewModel.nbRoom.getValue()
            //         is estateViewModel.nbRoom.setValue((java.lang.Integer) callbackArg_0)
            int callbackArg_0 = fragmentAddNbRoomSpinner.getSelectedItemPosition();
            // localize variables for thread safety
            // estateViewModel.nbRoom
            androidx.lifecycle.MutableLiveData<java.lang.Integer> estateViewModelNbRoom = null;
            // estateViewModel.nbRoom != null
            boolean estateViewModelNbRoomJavaLangObjectNull = false;
            // estateViewModel
            ltd.kaizo.realestatemanager.controller.ui.add.EstateViewModel estateViewModel = mEstateViewModel;
            // estateViewModel != null
            boolean estateViewModelJavaLangObjectNull = false;
            // estateViewModel.nbRoom.getValue()
            java.lang.Integer estateViewModelNbRoomGetValue = null;



            estateViewModelJavaLangObjectNull = (estateViewModel) != (null);
            if (estateViewModelJavaLangObjectNull) {


                estateViewModelNbRoom = estateViewModel.getNbRoom();

                estateViewModelNbRoomJavaLangObjectNull = (estateViewModelNbRoom) != (null);
                if (estateViewModelNbRoomJavaLangObjectNull) {




                    estateViewModelNbRoom.setValue(((java.lang.Integer) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener fragmentAddPostalCodeEdittextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of estateViewModel.postalCode.getValue()
            //         is estateViewModel.postalCode.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(fragmentAddPostalCodeEdittext);
            // localize variables for thread safety
            // estateViewModel
            ltd.kaizo.realestatemanager.controller.ui.add.EstateViewModel estateViewModel = mEstateViewModel;
            // estateViewModel != null
            boolean estateViewModelJavaLangObjectNull = false;
            // estateViewModel.postalCode
            androidx.lifecycle.MutableLiveData<java.lang.String> estateViewModelPostalCode = null;
            // estateViewModel.postalCode != null
            boolean estateViewModelPostalCodeJavaLangObjectNull = false;
            // estateViewModel.postalCode.getValue()
            java.lang.String estateViewModelPostalCodeGetValue = null;



            estateViewModelJavaLangObjectNull = (estateViewModel) != (null);
            if (estateViewModelJavaLangObjectNull) {


                estateViewModelPostalCode = estateViewModel.getPostalCode();

                estateViewModelPostalCodeJavaLangObjectNull = (estateViewModelPostalCode) != (null);
                if (estateViewModelPostalCodeJavaLangObjectNull) {




                    estateViewModelPostalCode.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener fragmentAddPriceEdittextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of estateViewModel.price.getValue()
            //         is estateViewModel.price.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(fragmentAddPriceEdittext);
            // localize variables for thread safety
            // estateViewModel.price
            androidx.lifecycle.MutableLiveData<java.lang.String> estateViewModelPrice = null;
            // estateViewModel.price != null
            boolean estateViewModelPriceJavaLangObjectNull = false;
            // estateViewModel
            ltd.kaizo.realestatemanager.controller.ui.add.EstateViewModel estateViewModel = mEstateViewModel;
            // estateViewModel != null
            boolean estateViewModelJavaLangObjectNull = false;
            // estateViewModel.price.getValue()
            java.lang.String estateViewModelPriceGetValue = null;



            estateViewModelJavaLangObjectNull = (estateViewModel) != (null);
            if (estateViewModelJavaLangObjectNull) {


                estateViewModelPrice = estateViewModel.getPrice();

                estateViewModelPriceJavaLangObjectNull = (estateViewModelPrice) != (null);
                if (estateViewModelPriceJavaLangObjectNull) {




                    estateViewModelPrice.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener fragmentAddSoldSwitchandroidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of estateViewModel.isSold.getValue()
            //         is estateViewModel.isSold.setValue((java.lang.Boolean) callbackArg_0)
            boolean callbackArg_0 = fragmentAddSoldSwitch.isChecked();
            // localize variables for thread safety
            // estateViewModel
            ltd.kaizo.realestatemanager.controller.ui.add.EstateViewModel estateViewModel = mEstateViewModel;
            // estateViewModel != null
            boolean estateViewModelJavaLangObjectNull = false;
            // estateViewModel.isSold.getValue()
            java.lang.Boolean estateViewModelIsSoldGetValue = null;
            // estateViewModel.isSold
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> estateViewModelIsSold = null;
            // estateViewModel.isSold != null
            boolean estateViewModelIsSoldJavaLangObjectNull = false;



            estateViewModelJavaLangObjectNull = (estateViewModel) != (null);
            if (estateViewModelJavaLangObjectNull) {


                estateViewModelIsSold = estateViewModel.isSold();

                estateViewModelIsSoldJavaLangObjectNull = (estateViewModelIsSold) != (null);
                if (estateViewModelIsSoldJavaLangObjectNull) {




                    estateViewModelIsSold.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener fragmentAddSurfaceEdittextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of estateViewModel.surface.getValue()
            //         is estateViewModel.surface.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(fragmentAddSurfaceEdittext);
            // localize variables for thread safety
            // estateViewModel.surface.getValue()
            java.lang.String estateViewModelSurfaceGetValue = null;
            // estateViewModel.surface
            androidx.lifecycle.MutableLiveData<java.lang.String> estateViewModelSurface = null;
            // estateViewModel
            ltd.kaizo.realestatemanager.controller.ui.add.EstateViewModel estateViewModel = mEstateViewModel;
            // estateViewModel != null
            boolean estateViewModelJavaLangObjectNull = false;
            // estateViewModel.surface != null
            boolean estateViewModelSurfaceJavaLangObjectNull = false;



            estateViewModelJavaLangObjectNull = (estateViewModel) != (null);
            if (estateViewModelJavaLangObjectNull) {


                estateViewModelSurface = estateViewModel.getSurface();

                estateViewModelSurfaceJavaLangObjectNull = (estateViewModelSurface) != (null);
                if (estateViewModelSurfaceJavaLangObjectNull) {




                    estateViewModelSurface.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener fragmentAddTypeSpinnerandroidSelectedItemPositionAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of estateViewModel.type.getValue()
            //         is estateViewModel.type.setValue((java.lang.Integer) callbackArg_0)
            int callbackArg_0 = fragmentAddTypeSpinner.getSelectedItemPosition();
            // localize variables for thread safety
            // estateViewModel.type
            androidx.lifecycle.MutableLiveData<java.lang.Integer> estateViewModelType = null;
            // estateViewModel.type.getValue()
            java.lang.Integer estateViewModelTypeGetValue = null;
            // estateViewModel
            ltd.kaizo.realestatemanager.controller.ui.add.EstateViewModel estateViewModel = mEstateViewModel;
            // estateViewModel != null
            boolean estateViewModelJavaLangObjectNull = false;
            // estateViewModel.type != null
            boolean estateViewModelTypeJavaLangObjectNull = false;



            estateViewModelJavaLangObjectNull = (estateViewModel) != (null);
            if (estateViewModelJavaLangObjectNull) {


                estateViewModelType = estateViewModel.getType();

                estateViewModelTypeJavaLangObjectNull = (estateViewModelType) != (null);
                if (estateViewModelTypeJavaLangObjectNull) {




                    estateViewModelType.setValue(((java.lang.Integer) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentAddBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 30, sIncludes, sViewsWithIds));
    }
    private FragmentAddBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 14
            , (com.google.android.material.button.MaterialButton) bindings[26]
            , (android.widget.EditText) bindings[13]
            , (android.widget.EditText) bindings[15]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[16]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0]
            , (com.google.android.material.button.MaterialButton) bindings[9]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[17]
            , (android.widget.EditText) bindings[3]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[20]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[18]
            , (android.widget.Spinner) bindings[6]
            , (android.widget.TextView) bindings[23]
            , (android.widget.Spinner) bindings[7]
            , (android.widget.TextView) bindings[24]
            , (android.widget.Spinner) bindings[5]
            , (android.widget.TextView) bindings[22]
            , (androidx.recyclerview.widget.RecyclerView) bindings[19]
            , (android.widget.EditText) bindings[14]
            , (android.widget.EditText) bindings[8]
            , (android.widget.TextView) bindings[25]
            , (androidx.appcompat.widget.SwitchCompat) bindings[10]
            , (android.widget.TextView) bindings[27]
            , (android.widget.EditText) bindings[4]
            , (android.widget.TextView) bindings[21]
            , (android.widget.Spinner) bindings[12]
            , (android.widget.TextView) bindings[28]
            , (androidx.constraintlayout.widget.Guideline) bindings[29]
            , null
            );
        this.fragmentAddAddressEdittext.setTag(null);
        this.fragmentAddCityEdittext.setTag(null);
        this.fragmentAddCoordinatorLayout.setTag(null);
        this.fragmentAddCreateButton.setTag(null);
        this.fragmentAddDateEdittext.setTag(null);
        this.fragmentAddDateOutTextview.setTag(null);
        this.fragmentAddDescriptionEdittext.setTag(null);
        this.fragmentAddManagerNameTextview.setTag(null);
        this.fragmentAddNbBathroomSpinner.setTag(null);
        this.fragmentAddNbBedroomSpinner.setTag(null);
        this.fragmentAddNbRoomSpinner.setTag(null);
        this.fragmentAddPostalCodeEdittext.setTag(null);
        this.fragmentAddPriceEdittext.setTag(null);
        this.fragmentAddSoldSwitch.setTag(null);
        this.fragmentAddSurfaceEdittext.setTag(null);
        this.fragmentAddTypeSpinner.setTag(null);
        setRootTag(root);
        // listeners
        mCallback14 = new ltd.kaizo.realestatemanager.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8000L;
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
        if (BR.estateViewModel == variableId) {
            setEstateViewModel((ltd.kaizo.realestatemanager.controller.ui.add.EstateViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setEstateViewModel(@Nullable ltd.kaizo.realestatemanager.controller.ui.add.EstateViewModel EstateViewModel) {
        this.mEstateViewModel = EstateViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4000L;
        }
        notifyPropertyChanged(BR.estateViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeEstateViewModelAddress((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeEstateViewModelType((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 2 :
                return onChangeEstateViewModelNbBedroom((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 3 :
                return onChangeEstateViewModelDateOut((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeEstateViewModelDescription((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeEstateViewModelManagerName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeEstateViewModelIsSold((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 7 :
                return onChangeEstateViewModelSurface((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 8 :
                return onChangeEstateViewModelCity((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 9 :
                return onChangeEstateViewModelPrice((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 10 :
                return onChangeEstateViewModelNbRoom((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 11 :
                return onChangeEstateViewModelDateIn((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 12 :
                return onChangeEstateViewModelPostalCode((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 13 :
                return onChangeEstateViewModelNbBathroom((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeEstateViewModelAddress(androidx.lifecycle.MutableLiveData<java.lang.String> EstateViewModelAddress, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeEstateViewModelType(androidx.lifecycle.MutableLiveData<java.lang.Integer> EstateViewModelType, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeEstateViewModelNbBedroom(androidx.lifecycle.MutableLiveData<java.lang.Integer> EstateViewModelNbBedroom, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeEstateViewModelDateOut(androidx.lifecycle.MutableLiveData<java.lang.String> EstateViewModelDateOut, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeEstateViewModelDescription(androidx.lifecycle.MutableLiveData<java.lang.String> EstateViewModelDescription, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeEstateViewModelManagerName(androidx.lifecycle.MutableLiveData<java.lang.String> EstateViewModelManagerName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeEstateViewModelIsSold(androidx.lifecycle.MutableLiveData<java.lang.Boolean> EstateViewModelIsSold, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeEstateViewModelSurface(androidx.lifecycle.MutableLiveData<java.lang.String> EstateViewModelSurface, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeEstateViewModelCity(androidx.lifecycle.MutableLiveData<java.lang.String> EstateViewModelCity, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeEstateViewModelPrice(androidx.lifecycle.MutableLiveData<java.lang.String> EstateViewModelPrice, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeEstateViewModelNbRoom(androidx.lifecycle.MutableLiveData<java.lang.Integer> EstateViewModelNbRoom, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeEstateViewModelDateIn(androidx.lifecycle.MutableLiveData<java.lang.String> EstateViewModelDateIn, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeEstateViewModelPostalCode(androidx.lifecycle.MutableLiveData<java.lang.String> EstateViewModelPostalCode, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeEstateViewModelNbBathroom(androidx.lifecycle.MutableLiveData<java.lang.Integer> EstateViewModelNbBathroom, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2000L;
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
        java.lang.String estateViewModelManagerNameGetValue = null;
        java.lang.Integer estateViewModelNbBathroomGetValue = null;
        java.lang.String estateViewModelDateOutGetValue = null;
        int androidxDatabindingViewDataBindingSafeUnboxEstateViewModelNbBedroomGetValue = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxEstateViewModelIsSoldGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.String> estateViewModelAddress = null;
        java.lang.Integer estateViewModelTypeGetValue = null;
        java.lang.Integer estateViewModelNbRoomGetValue = null;
        java.lang.Integer estateViewModelNbBedroomGetValue = null;
        int androidxDatabindingViewDataBindingSafeUnboxEstateViewModelTypeGetValue = 0;
        java.lang.Boolean estateViewModelIsSoldGetValue = null;
        java.lang.String estateViewModelCityGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> estateViewModelType = null;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> estateViewModelNbBedroom = null;
        java.lang.String estateViewModelDescriptionGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> estateViewModelDateOut = null;
        java.lang.String estateViewModelPostalCodeGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> estateViewModelDescription = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> estateViewModelManagerName = null;
        java.lang.String estateViewModelAddressGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> estateViewModelIsSold = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> estateViewModelSurface = null;
        java.lang.String estateViewModelDateInGetValue = null;
        int androidxDatabindingViewDataBindingSafeUnboxEstateViewModelNbRoomGetValue = 0;
        androidx.lifecycle.MutableLiveData<java.lang.String> estateViewModelCity = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> estateViewModelPrice = null;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> estateViewModelNbRoom = null;
        java.lang.String estateViewModelSurfaceGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> estateViewModelDateIn = null;
        int androidxDatabindingViewDataBindingSafeUnboxEstateViewModelNbBathroomGetValue = 0;
        ltd.kaizo.realestatemanager.controller.ui.add.EstateViewModel estateViewModel = mEstateViewModel;
        java.lang.String estateViewModelPriceGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> estateViewModelPostalCode = null;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> estateViewModelNbBathroom = null;

        if ((dirtyFlags & 0xffffL) != 0) {


            if ((dirtyFlags & 0xc001L) != 0) {

                    if (estateViewModel != null) {
                        // read estateViewModel.address
                        estateViewModelAddress = estateViewModel.getAddress();
                    }
                    updateLiveDataRegistration(0, estateViewModelAddress);


                    if (estateViewModelAddress != null) {
                        // read estateViewModel.address.getValue()
                        estateViewModelAddressGetValue = estateViewModelAddress.getValue();
                    }
            }
            if ((dirtyFlags & 0xc002L) != 0) {

                    if (estateViewModel != null) {
                        // read estateViewModel.type
                        estateViewModelType = estateViewModel.getType();
                    }
                    updateLiveDataRegistration(1, estateViewModelType);


                    if (estateViewModelType != null) {
                        // read estateViewModel.type.getValue()
                        estateViewModelTypeGetValue = estateViewModelType.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(estateViewModel.type.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxEstateViewModelTypeGetValue = androidx.databinding.ViewDataBinding.safeUnbox(estateViewModelTypeGetValue);
            }
            if ((dirtyFlags & 0xc004L) != 0) {

                    if (estateViewModel != null) {
                        // read estateViewModel.nbBedroom
                        estateViewModelNbBedroom = estateViewModel.getNbBedroom();
                    }
                    updateLiveDataRegistration(2, estateViewModelNbBedroom);


                    if (estateViewModelNbBedroom != null) {
                        // read estateViewModel.nbBedroom.getValue()
                        estateViewModelNbBedroomGetValue = estateViewModelNbBedroom.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(estateViewModel.nbBedroom.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxEstateViewModelNbBedroomGetValue = androidx.databinding.ViewDataBinding.safeUnbox(estateViewModelNbBedroomGetValue);
            }
            if ((dirtyFlags & 0xc008L) != 0) {

                    if (estateViewModel != null) {
                        // read estateViewModel.dateOut
                        estateViewModelDateOut = estateViewModel.getDateOut();
                    }
                    updateLiveDataRegistration(3, estateViewModelDateOut);


                    if (estateViewModelDateOut != null) {
                        // read estateViewModel.dateOut.getValue()
                        estateViewModelDateOutGetValue = estateViewModelDateOut.getValue();
                    }
            }
            if ((dirtyFlags & 0xc010L) != 0) {

                    if (estateViewModel != null) {
                        // read estateViewModel.description
                        estateViewModelDescription = estateViewModel.getDescription();
                    }
                    updateLiveDataRegistration(4, estateViewModelDescription);


                    if (estateViewModelDescription != null) {
                        // read estateViewModel.description.getValue()
                        estateViewModelDescriptionGetValue = estateViewModelDescription.getValue();
                    }
            }
            if ((dirtyFlags & 0xc020L) != 0) {

                    if (estateViewModel != null) {
                        // read estateViewModel.managerName
                        estateViewModelManagerName = estateViewModel.getManagerName();
                    }
                    updateLiveDataRegistration(5, estateViewModelManagerName);


                    if (estateViewModelManagerName != null) {
                        // read estateViewModel.managerName.getValue()
                        estateViewModelManagerNameGetValue = estateViewModelManagerName.getValue();
                    }
            }
            if ((dirtyFlags & 0xc040L) != 0) {

                    if (estateViewModel != null) {
                        // read estateViewModel.isSold
                        estateViewModelIsSold = estateViewModel.isSold();
                    }
                    updateLiveDataRegistration(6, estateViewModelIsSold);


                    if (estateViewModelIsSold != null) {
                        // read estateViewModel.isSold.getValue()
                        estateViewModelIsSoldGetValue = estateViewModelIsSold.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(estateViewModel.isSold.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxEstateViewModelIsSoldGetValue = androidx.databinding.ViewDataBinding.safeUnbox(estateViewModelIsSoldGetValue);
            }
            if ((dirtyFlags & 0xc080L) != 0) {

                    if (estateViewModel != null) {
                        // read estateViewModel.surface
                        estateViewModelSurface = estateViewModel.getSurface();
                    }
                    updateLiveDataRegistration(7, estateViewModelSurface);


                    if (estateViewModelSurface != null) {
                        // read estateViewModel.surface.getValue()
                        estateViewModelSurfaceGetValue = estateViewModelSurface.getValue();
                    }
            }
            if ((dirtyFlags & 0xc100L) != 0) {

                    if (estateViewModel != null) {
                        // read estateViewModel.city
                        estateViewModelCity = estateViewModel.getCity();
                    }
                    updateLiveDataRegistration(8, estateViewModelCity);


                    if (estateViewModelCity != null) {
                        // read estateViewModel.city.getValue()
                        estateViewModelCityGetValue = estateViewModelCity.getValue();
                    }
            }
            if ((dirtyFlags & 0xc200L) != 0) {

                    if (estateViewModel != null) {
                        // read estateViewModel.price
                        estateViewModelPrice = estateViewModel.getPrice();
                    }
                    updateLiveDataRegistration(9, estateViewModelPrice);


                    if (estateViewModelPrice != null) {
                        // read estateViewModel.price.getValue()
                        estateViewModelPriceGetValue = estateViewModelPrice.getValue();
                    }
            }
            if ((dirtyFlags & 0xc400L) != 0) {

                    if (estateViewModel != null) {
                        // read estateViewModel.nbRoom
                        estateViewModelNbRoom = estateViewModel.getNbRoom();
                    }
                    updateLiveDataRegistration(10, estateViewModelNbRoom);


                    if (estateViewModelNbRoom != null) {
                        // read estateViewModel.nbRoom.getValue()
                        estateViewModelNbRoomGetValue = estateViewModelNbRoom.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(estateViewModel.nbRoom.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxEstateViewModelNbRoomGetValue = androidx.databinding.ViewDataBinding.safeUnbox(estateViewModelNbRoomGetValue);
            }
            if ((dirtyFlags & 0xc800L) != 0) {

                    if (estateViewModel != null) {
                        // read estateViewModel.dateIn
                        estateViewModelDateIn = estateViewModel.getDateIn();
                    }
                    updateLiveDataRegistration(11, estateViewModelDateIn);


                    if (estateViewModelDateIn != null) {
                        // read estateViewModel.dateIn.getValue()
                        estateViewModelDateInGetValue = estateViewModelDateIn.getValue();
                    }
            }
            if ((dirtyFlags & 0xd000L) != 0) {

                    if (estateViewModel != null) {
                        // read estateViewModel.postalCode
                        estateViewModelPostalCode = estateViewModel.getPostalCode();
                    }
                    updateLiveDataRegistration(12, estateViewModelPostalCode);


                    if (estateViewModelPostalCode != null) {
                        // read estateViewModel.postalCode.getValue()
                        estateViewModelPostalCodeGetValue = estateViewModelPostalCode.getValue();
                    }
            }
            if ((dirtyFlags & 0xe000L) != 0) {

                    if (estateViewModel != null) {
                        // read estateViewModel.nbBathroom
                        estateViewModelNbBathroom = estateViewModel.getNbBathroom();
                    }
                    updateLiveDataRegistration(13, estateViewModelNbBathroom);


                    if (estateViewModelNbBathroom != null) {
                        // read estateViewModel.nbBathroom.getValue()
                        estateViewModelNbBathroomGetValue = estateViewModelNbBathroom.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(estateViewModel.nbBathroom.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxEstateViewModelNbBathroomGetValue = androidx.databinding.ViewDataBinding.safeUnbox(estateViewModelNbBathroomGetValue);
            }
        }
        // batch finished
        if ((dirtyFlags & 0xc001L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fragmentAddAddressEdittext, estateViewModelAddressGetValue);
        }
        if ((dirtyFlags & 0x8000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.fragmentAddAddressEdittext, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, fragmentAddAddressEdittextandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.fragmentAddCityEdittext, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, fragmentAddCityEdittextandroidTextAttrChanged);
            this.fragmentAddCreateButton.setOnClickListener(mCallback14);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.fragmentAddDescriptionEdittext, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, fragmentAddDescriptionEdittextandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.fragmentAddManagerNameTextview, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, fragmentAddManagerNameTextviewandroidTextAttrChanged);
            androidx.databinding.adapters.AdapterViewBindingAdapter.setOnItemSelectedListener(this.fragmentAddNbBathroomSpinner, (androidx.databinding.adapters.AdapterViewBindingAdapter.OnItemSelected)null, (androidx.databinding.adapters.AdapterViewBindingAdapter.OnNothingSelected)null, fragmentAddNbBathroomSpinnerandroidSelectedItemPositionAttrChanged);
            androidx.databinding.adapters.AdapterViewBindingAdapter.setOnItemSelectedListener(this.fragmentAddNbBedroomSpinner, (androidx.databinding.adapters.AdapterViewBindingAdapter.OnItemSelected)null, (androidx.databinding.adapters.AdapterViewBindingAdapter.OnNothingSelected)null, fragmentAddNbBedroomSpinnerandroidSelectedItemPositionAttrChanged);
            androidx.databinding.adapters.AdapterViewBindingAdapter.setOnItemSelectedListener(this.fragmentAddNbRoomSpinner, (androidx.databinding.adapters.AdapterViewBindingAdapter.OnItemSelected)null, (androidx.databinding.adapters.AdapterViewBindingAdapter.OnNothingSelected)null, fragmentAddNbRoomSpinnerandroidSelectedItemPositionAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.fragmentAddPostalCodeEdittext, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, fragmentAddPostalCodeEdittextandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.fragmentAddPriceEdittext, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, fragmentAddPriceEdittextandroidTextAttrChanged);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.fragmentAddSoldSwitch, (android.widget.CompoundButton.OnCheckedChangeListener)null, fragmentAddSoldSwitchandroidCheckedAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.fragmentAddSurfaceEdittext, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, fragmentAddSurfaceEdittextandroidTextAttrChanged);
            androidx.databinding.adapters.AdapterViewBindingAdapter.setOnItemSelectedListener(this.fragmentAddTypeSpinner, (androidx.databinding.adapters.AdapterViewBindingAdapter.OnItemSelected)null, (androidx.databinding.adapters.AdapterViewBindingAdapter.OnNothingSelected)null, fragmentAddTypeSpinnerandroidSelectedItemPositionAttrChanged);
        }
        if ((dirtyFlags & 0xc100L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fragmentAddCityEdittext, estateViewModelCityGetValue);
        }
        if ((dirtyFlags & 0xc800L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fragmentAddDateEdittext, estateViewModelDateInGetValue);
        }
        if ((dirtyFlags & 0xc008L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fragmentAddDateOutTextview, estateViewModelDateOutGetValue);
        }
        if ((dirtyFlags & 0xc010L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fragmentAddDescriptionEdittext, estateViewModelDescriptionGetValue);
        }
        if ((dirtyFlags & 0xc020L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fragmentAddManagerNameTextview, estateViewModelManagerNameGetValue);
        }
        if ((dirtyFlags & 0xe000L) != 0) {
            // api target 1

            androidx.databinding.adapters.AdapterViewBindingAdapter.setSelectedItemPosition(this.fragmentAddNbBathroomSpinner, androidxDatabindingViewDataBindingSafeUnboxEstateViewModelNbBathroomGetValue);
        }
        if ((dirtyFlags & 0xc004L) != 0) {
            // api target 1

            androidx.databinding.adapters.AdapterViewBindingAdapter.setSelectedItemPosition(this.fragmentAddNbBedroomSpinner, androidxDatabindingViewDataBindingSafeUnboxEstateViewModelNbBedroomGetValue);
        }
        if ((dirtyFlags & 0xc400L) != 0) {
            // api target 1

            androidx.databinding.adapters.AdapterViewBindingAdapter.setSelectedItemPosition(this.fragmentAddNbRoomSpinner, androidxDatabindingViewDataBindingSafeUnboxEstateViewModelNbRoomGetValue);
        }
        if ((dirtyFlags & 0xd000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fragmentAddPostalCodeEdittext, estateViewModelPostalCodeGetValue);
        }
        if ((dirtyFlags & 0xc200L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fragmentAddPriceEdittext, estateViewModelPriceGetValue);
        }
        if ((dirtyFlags & 0xc040L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.fragmentAddSoldSwitch, androidxDatabindingViewDataBindingSafeUnboxEstateViewModelIsSoldGetValue);
        }
        if ((dirtyFlags & 0xc080L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fragmentAddSurfaceEdittext, estateViewModelSurfaceGetValue);
        }
        if ((dirtyFlags & 0xc002L) != 0) {
            // api target 1

            androidx.databinding.adapters.AdapterViewBindingAdapter.setSelectedItemPosition(this.fragmentAddTypeSpinner, androidxDatabindingViewDataBindingSafeUnboxEstateViewModelTypeGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // estateViewModel
        ltd.kaizo.realestatemanager.controller.ui.add.EstateViewModel estateViewModel = mEstateViewModel;
        // estateViewModel != null
        boolean estateViewModelJavaLangObjectNull = false;



        estateViewModelJavaLangObjectNull = (estateViewModel) != (null);
        if (estateViewModelJavaLangObjectNull) {


            estateViewModel.createEstate();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): estateViewModel.address
        flag 1 (0x2L): estateViewModel.type
        flag 2 (0x3L): estateViewModel.nbBedroom
        flag 3 (0x4L): estateViewModel.dateOut
        flag 4 (0x5L): estateViewModel.description
        flag 5 (0x6L): estateViewModel.managerName
        flag 6 (0x7L): estateViewModel.isSold
        flag 7 (0x8L): estateViewModel.surface
        flag 8 (0x9L): estateViewModel.city
        flag 9 (0xaL): estateViewModel.price
        flag 10 (0xbL): estateViewModel.nbRoom
        flag 11 (0xcL): estateViewModel.dateIn
        flag 12 (0xdL): estateViewModel.postalCode
        flag 13 (0xeL): estateViewModel.nbBathroom
        flag 14 (0xfL): estateViewModel
        flag 15 (0x10L): null
    flag mapping end*/
    //end
}