package ltd.kaizo.realestatemanager.databinding;
import ltd.kaizo.realestatemanager.R;
import ltd.kaizo.realestatemanager.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAddPictureDialogBindingImpl extends FragmentAddPictureDialogBinding implements ltd.kaizo.realestatemanager.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener pictureNameDialogEdittextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of AddPictureDialogFragment.pictureName.getValue()
            //         is AddPictureDialogFragment.pictureName.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(pictureNameDialogEdittext);
            // localize variables for thread safety
            // AddPictureDialogFragment.pictureName.getValue()
            java.lang.String addPictureDialogFragmentPictureNameGetValue = null;
            // AddPictureDialogFragment.pictureName != null
            boolean addPictureDialogFragmentPictureNameJavaLangObjectNull = false;
            // AddPictureDialogFragment
            ltd.kaizo.realestatemanager.controller.ui.add.AddPictureDialogFragment addPictureDialogFragment = mAddPictureDialogFragment;
            // AddPictureDialogFragment != null
            boolean addPictureDialogFragmentJavaLangObjectNull = false;
            // AddPictureDialogFragment.pictureName
            androidx.lifecycle.MutableLiveData<java.lang.String> addPictureDialogFragmentPictureName = null;



            addPictureDialogFragmentJavaLangObjectNull = (addPictureDialogFragment) != (null);
            if (addPictureDialogFragmentJavaLangObjectNull) {


                addPictureDialogFragmentPictureName = addPictureDialogFragment.getPictureName();

                addPictureDialogFragmentPictureNameJavaLangObjectNull = (addPictureDialogFragmentPictureName) != (null);
                if (addPictureDialogFragmentPictureNameJavaLangObjectNull) {




                    addPictureDialogFragmentPictureName.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentAddPictureDialogBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FragmentAddPictureDialogBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0]
            , (com.google.android.material.button.MaterialButton) bindings[4]
            , (android.widget.EditText) bindings[2]
            , (com.google.android.material.button.MaterialButton) bindings[5]
            , (android.widget.ImageButton) bindings[1]
            , (android.widget.ImageButton) bindings[3]
            );
        this.addDialogFragmentCoordinatorLayout.setTag(null);
        this.pictureNameDialogCancelButton.setTag(null);
        this.pictureNameDialogEdittext.setTag(null);
        this.pictureNameDialogSaveButton.setTag(null);
        this.picturePickDialogCameraBtn.setTag(null);
        this.picturePickDialogGalleryBtn.setTag(null);
        setRootTag(root);
        // listeners
        mCallback10 = new ltd.kaizo.realestatemanager.generated.callback.OnClickListener(this, 4);
        mCallback9 = new ltd.kaizo.realestatemanager.generated.callback.OnClickListener(this, 3);
        mCallback7 = new ltd.kaizo.realestatemanager.generated.callback.OnClickListener(this, 1);
        mCallback8 = new ltd.kaizo.realestatemanager.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.AddPictureDialogFragment == variableId) {
            setAddPictureDialogFragment((ltd.kaizo.realestatemanager.controller.ui.add.AddPictureDialogFragment) variable);
        }
        else if (BR.estateViewModel == variableId) {
            setEstateViewModel((ltd.kaizo.realestatemanager.controller.ui.add.EstateViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAddPictureDialogFragment(@Nullable ltd.kaizo.realestatemanager.controller.ui.add.AddPictureDialogFragment AddPictureDialogFragment) {
        this.mAddPictureDialogFragment = AddPictureDialogFragment;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.AddPictureDialogFragment);
        super.requestRebind();
    }
    public void setEstateViewModel(@Nullable ltd.kaizo.realestatemanager.controller.ui.add.EstateViewModel EstateViewModel) {
        this.mEstateViewModel = EstateViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeAddPictureDialogFragmentPictureName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeAddPictureDialogFragmentPictureName(androidx.lifecycle.MutableLiveData<java.lang.String> AddPictureDialogFragmentPictureName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        java.lang.String addPictureDialogFragmentPictureNameGetValue = null;
        ltd.kaizo.realestatemanager.controller.ui.add.AddPictureDialogFragment addPictureDialogFragment = mAddPictureDialogFragment;
        androidx.lifecycle.MutableLiveData<java.lang.String> addPictureDialogFragmentPictureName = null;

        if ((dirtyFlags & 0xbL) != 0) {



                if (addPictureDialogFragment != null) {
                    // read AddPictureDialogFragment.pictureName
                    addPictureDialogFragmentPictureName = addPictureDialogFragment.getPictureName();
                }
                updateLiveDataRegistration(0, addPictureDialogFragmentPictureName);


                if (addPictureDialogFragmentPictureName != null) {
                    // read AddPictureDialogFragment.pictureName.getValue()
                    addPictureDialogFragmentPictureNameGetValue = addPictureDialogFragmentPictureName.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.pictureNameDialogCancelButton.setOnClickListener(mCallback9);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.pictureNameDialogEdittext, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, pictureNameDialogEdittextandroidTextAttrChanged);
            this.pictureNameDialogSaveButton.setOnClickListener(mCallback10);
            this.picturePickDialogCameraBtn.setOnClickListener(mCallback7);
            this.picturePickDialogGalleryBtn.setOnClickListener(mCallback8);
        }
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.pictureNameDialogEdittext, addPictureDialogFragmentPictureNameGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // AddPictureDialogFragment
                ltd.kaizo.realestatemanager.controller.ui.add.AddPictureDialogFragment addPictureDialogFragment = mAddPictureDialogFragment;
                // AddPictureDialogFragment != null
                boolean addPictureDialogFragmentJavaLangObjectNull = false;



                addPictureDialogFragmentJavaLangObjectNull = (addPictureDialogFragment) != (null);
                if (addPictureDialogFragmentJavaLangObjectNull) {


                    addPictureDialogFragment.savePicture();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // AddPictureDialogFragment
                ltd.kaizo.realestatemanager.controller.ui.add.AddPictureDialogFragment addPictureDialogFragment = mAddPictureDialogFragment;
                // AddPictureDialogFragment != null
                boolean addPictureDialogFragmentJavaLangObjectNull = false;



                addPictureDialogFragmentJavaLangObjectNull = (addPictureDialogFragment) != (null);
                if (addPictureDialogFragmentJavaLangObjectNull) {


                    addPictureDialogFragment.closeDialog();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // AddPictureDialogFragment
                ltd.kaizo.realestatemanager.controller.ui.add.AddPictureDialogFragment addPictureDialogFragment = mAddPictureDialogFragment;
                // AddPictureDialogFragment != null
                boolean addPictureDialogFragmentJavaLangObjectNull = false;



                addPictureDialogFragmentJavaLangObjectNull = (addPictureDialogFragment) != (null);
                if (addPictureDialogFragmentJavaLangObjectNull) {


                    addPictureDialogFragment.selectPictureFromCamera();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // AddPictureDialogFragment
                ltd.kaizo.realestatemanager.controller.ui.add.AddPictureDialogFragment addPictureDialogFragment = mAddPictureDialogFragment;
                // AddPictureDialogFragment != null
                boolean addPictureDialogFragmentJavaLangObjectNull = false;



                addPictureDialogFragmentJavaLangObjectNull = (addPictureDialogFragment) != (null);
                if (addPictureDialogFragmentJavaLangObjectNull) {


                    addPictureDialogFragment.selectPictureFromDevice();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): AddPictureDialogFragment.pictureName
        flag 1 (0x2L): AddPictureDialogFragment
        flag 2 (0x3L): estateViewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}