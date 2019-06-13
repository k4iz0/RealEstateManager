package ltd.kaizo.realestatemanager.databinding;
import ltd.kaizo.realestatemanager.R;
import ltd.kaizo.realestatemanager.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAddPoiDialogBindingImpl extends FragmentAddPoiDialogBinding implements ltd.kaizo.realestatemanager.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.add_poi_dialog_fragment_recycleview, 2);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback15;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentAddPoiDialogBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private FragmentAddPoiDialogBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.button.MaterialButton) bindings[1]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            );
        this.addPoiDialogFragmentButton.setTag(null);
        this.addPoiDialogFragmentCoordinatorLayout.setTag(null);
        setRootTag(root);
        // listeners
        mCallback15 = new ltd.kaizo.realestatemanager.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        else if (BR.AddPoiDialogFragment == variableId) {
            setAddPoiDialogFragment((ltd.kaizo.realestatemanager.controller.ui.add.AddPoiDialogFragment) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setEstateViewModel(@Nullable ltd.kaizo.realestatemanager.controller.ui.add.EstateViewModel EstateViewModel) {
        this.mEstateViewModel = EstateViewModel;
    }
    public void setAddPoiDialogFragment(@Nullable ltd.kaizo.realestatemanager.controller.ui.add.AddPoiDialogFragment AddPoiDialogFragment) {
        this.mAddPoiDialogFragment = AddPoiDialogFragment;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.AddPoiDialogFragment);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        ltd.kaizo.realestatemanager.controller.ui.add.AddPoiDialogFragment addPoiDialogFragment = mAddPoiDialogFragment;
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.addPoiDialogFragmentButton.setOnClickListener(mCallback15);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // AddPoiDialogFragment != null
        boolean addPoiDialogFragmentJavaLangObjectNull = false;
        // AddPoiDialogFragment
        ltd.kaizo.realestatemanager.controller.ui.add.AddPoiDialogFragment addPoiDialogFragment = mAddPoiDialogFragment;



        addPoiDialogFragmentJavaLangObjectNull = (addPoiDialogFragment) != (null);
        if (addPoiDialogFragmentJavaLangObjectNull) {


            addPoiDialogFragment.saveData();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): estateViewModel
        flag 1 (0x2L): AddPoiDialogFragment
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}