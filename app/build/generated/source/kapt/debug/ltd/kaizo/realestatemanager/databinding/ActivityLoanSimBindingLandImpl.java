package ltd.kaizo.realestatemanager.databinding;
import ltd.kaizo.realestatemanager.R;
import ltd.kaizo.realestatemanager.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityLoanSimBindingLandImpl extends ActivityLoanSimBinding implements ltd.kaizo.realestatemanager.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.activity_loan_constraint_layout, 8);
        sViewsWithIds.put(R.id.activity_loan_toolbar, 9);
        sViewsWithIds.put(R.id.guideline5, 10);
        sViewsWithIds.put(R.id.activity_loan_monthly_payments_title, 11);
        sViewsWithIds.put(R.id.activity_loan_total_interest_title, 12);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener activityLoanAmountandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of loanSimViewModel.totalAmount.getValue()
            //         is loanSimViewModel.totalAmount.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(activityLoanAmount);
            // localize variables for thread safety
            // loanSimViewModel.totalAmount.getValue()
            java.lang.String loanSimViewModelTotalAmountGetValue = null;
            // loanSimViewModel.totalAmount != null
            boolean loanSimViewModelTotalAmountJavaLangObjectNull = false;
            // loanSimViewModel != null
            boolean loanSimViewModelJavaLangObjectNull = false;
            // loanSimViewModel
            ltd.kaizo.realestatemanager.controller.ui.loan.LoanSimViewModel loanSimViewModel = mLoanSimViewModel;
            // loanSimViewModel.totalAmount
            androidx.lifecycle.MutableLiveData<java.lang.String> loanSimViewModelTotalAmount = null;



            loanSimViewModelJavaLangObjectNull = (loanSimViewModel) != (null);
            if (loanSimViewModelJavaLangObjectNull) {


                loanSimViewModelTotalAmount = loanSimViewModel.getTotalAmount();

                loanSimViewModelTotalAmountJavaLangObjectNull = (loanSimViewModelTotalAmount) != (null);
                if (loanSimViewModelTotalAmountJavaLangObjectNull) {




                    loanSimViewModelTotalAmount.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener activityLoanContributionandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of loanSimViewModel.contribution.getValue()
            //         is loanSimViewModel.contribution.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(activityLoanContribution);
            // localize variables for thread safety
            // loanSimViewModel.contribution
            androidx.lifecycle.MutableLiveData<java.lang.String> loanSimViewModelContribution = null;
            // loanSimViewModel.contribution.getValue()
            java.lang.String loanSimViewModelContributionGetValue = null;
            // loanSimViewModel != null
            boolean loanSimViewModelJavaLangObjectNull = false;
            // loanSimViewModel
            ltd.kaizo.realestatemanager.controller.ui.loan.LoanSimViewModel loanSimViewModel = mLoanSimViewModel;
            // loanSimViewModel.contribution != null
            boolean loanSimViewModelContributionJavaLangObjectNull = false;



            loanSimViewModelJavaLangObjectNull = (loanSimViewModel) != (null);
            if (loanSimViewModelJavaLangObjectNull) {


                loanSimViewModelContribution = loanSimViewModel.getContribution();

                loanSimViewModelContributionJavaLangObjectNull = (loanSimViewModelContribution) != (null);
                if (loanSimViewModelContributionJavaLangObjectNull) {




                    loanSimViewModelContribution.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener activityLoanMonthlyPaymentsandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of loanSimViewModel.monthlyPayment.getValue()
            //         is loanSimViewModel.monthlyPayment.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(activityLoanMonthlyPayments);
            // localize variables for thread safety
            // loanSimViewModel.monthlyPayment
            androidx.lifecycle.MutableLiveData<java.lang.String> loanSimViewModelMonthlyPayment = null;
            // loanSimViewModel != null
            boolean loanSimViewModelJavaLangObjectNull = false;
            // loanSimViewModel
            ltd.kaizo.realestatemanager.controller.ui.loan.LoanSimViewModel loanSimViewModel = mLoanSimViewModel;
            // loanSimViewModel.monthlyPayment.getValue()
            java.lang.String loanSimViewModelMonthlyPaymentGetValue = null;
            // loanSimViewModel.monthlyPayment != null
            boolean loanSimViewModelMonthlyPaymentJavaLangObjectNull = false;



            loanSimViewModelJavaLangObjectNull = (loanSimViewModel) != (null);
            if (loanSimViewModelJavaLangObjectNull) {


                loanSimViewModelMonthlyPayment = loanSimViewModel.getMonthlyPayment();

                loanSimViewModelMonthlyPaymentJavaLangObjectNull = (loanSimViewModelMonthlyPayment) != (null);
                if (loanSimViewModelMonthlyPaymentJavaLangObjectNull) {




                    loanSimViewModelMonthlyPayment.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener activityLoanRateandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of loanSimViewModel.rate.getValue()
            //         is loanSimViewModel.rate.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(activityLoanRate);
            // localize variables for thread safety
            // loanSimViewModel != null
            boolean loanSimViewModelJavaLangObjectNull = false;
            // loanSimViewModel
            ltd.kaizo.realestatemanager.controller.ui.loan.LoanSimViewModel loanSimViewModel = mLoanSimViewModel;
            // loanSimViewModel.rate.getValue()
            java.lang.String loanSimViewModelRateGetValue = null;
            // loanSimViewModel.rate
            androidx.lifecycle.MutableLiveData<java.lang.String> loanSimViewModelRate = null;
            // loanSimViewModel.rate != null
            boolean loanSimViewModelRateJavaLangObjectNull = false;



            loanSimViewModelJavaLangObjectNull = (loanSimViewModel) != (null);
            if (loanSimViewModelJavaLangObjectNull) {


                loanSimViewModelRate = loanSimViewModel.getRate();

                loanSimViewModelRateJavaLangObjectNull = (loanSimViewModelRate) != (null);
                if (loanSimViewModelRateJavaLangObjectNull) {




                    loanSimViewModelRate.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener activityLoanTermandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of loanSimViewModel.duration.getValue()
            //         is loanSimViewModel.duration.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(activityLoanTerm);
            // localize variables for thread safety
            // loanSimViewModel.duration.getValue()
            java.lang.String loanSimViewModelDurationGetValue = null;
            // loanSimViewModel != null
            boolean loanSimViewModelJavaLangObjectNull = false;
            // loanSimViewModel
            ltd.kaizo.realestatemanager.controller.ui.loan.LoanSimViewModel loanSimViewModel = mLoanSimViewModel;
            // loanSimViewModel.duration != null
            boolean loanSimViewModelDurationJavaLangObjectNull = false;
            // loanSimViewModel.duration
            androidx.lifecycle.MutableLiveData<java.lang.String> loanSimViewModelDuration = null;



            loanSimViewModelJavaLangObjectNull = (loanSimViewModel) != (null);
            if (loanSimViewModelJavaLangObjectNull) {


                loanSimViewModelDuration = loanSimViewModel.getDuration();

                loanSimViewModelDurationJavaLangObjectNull = (loanSimViewModelDuration) != (null);
                if (loanSimViewModelDurationJavaLangObjectNull) {




                    loanSimViewModelDuration.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener activityLoanTotalInterestandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of loanSimViewModel.totalInvestment.getValue()
            //         is loanSimViewModel.totalInvestment.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(activityLoanTotalInterest);
            // localize variables for thread safety
            // loanSimViewModel != null
            boolean loanSimViewModelJavaLangObjectNull = false;
            // loanSimViewModel
            ltd.kaizo.realestatemanager.controller.ui.loan.LoanSimViewModel loanSimViewModel = mLoanSimViewModel;
            // loanSimViewModel.totalInvestment.getValue()
            java.lang.String loanSimViewModelTotalInvestmentGetValue = null;
            // loanSimViewModel.totalInvestment != null
            boolean loanSimViewModelTotalInvestmentJavaLangObjectNull = false;
            // loanSimViewModel.totalInvestment
            androidx.lifecycle.MutableLiveData<java.lang.String> loanSimViewModelTotalInvestment = null;



            loanSimViewModelJavaLangObjectNull = (loanSimViewModel) != (null);
            if (loanSimViewModelJavaLangObjectNull) {


                loanSimViewModelTotalInvestment = loanSimViewModel.getTotalInvestment();

                loanSimViewModelTotalInvestmentJavaLangObjectNull = (loanSimViewModelTotalInvestment) != (null);
                if (loanSimViewModelTotalInvestmentJavaLangObjectNull) {




                    loanSimViewModelTotalInvestment.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityLoanSimBindingLandImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private ActivityLoanSimBindingLandImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 6
            , (android.widget.EditText) bindings[1]
            , (com.google.android.material.button.MaterialButton) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[8]
            , (android.widget.EditText) bindings[2]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[11]
            , (android.widget.EditText) bindings[3]
            , (android.widget.EditText) bindings[4]
            , (androidx.appcompat.widget.Toolbar) bindings[9]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[12]
            , (androidx.constraintlayout.widget.Guideline) bindings[10]
            );
        this.activityLoanAmount.setTag(null);
        this.activityLoanCalculateBtn.setTag(null);
        this.activityLoanContribution.setTag(null);
        this.activityLoanCoordinatorLayout.setTag(null);
        this.activityLoanMonthlyPayments.setTag(null);
        this.activityLoanRate.setTag(null);
        this.activityLoanTerm.setTag(null);
        this.activityLoanTotalInterest.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new ltd.kaizo.realestatemanager.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
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
        if (BR.loanSimViewModel == variableId) {
            setLoanSimViewModel((ltd.kaizo.realestatemanager.controller.ui.loan.LoanSimViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setLoanSimViewModel(@Nullable ltd.kaizo.realestatemanager.controller.ui.loan.LoanSimViewModel LoanSimViewModel) {
        this.mLoanSimViewModel = LoanSimViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.loanSimViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeLoanSimViewModelMonthlyPayment((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeLoanSimViewModelTotalAmount((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeLoanSimViewModelRate((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeLoanSimViewModelTotalInvestment((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeLoanSimViewModelDuration((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeLoanSimViewModelContribution((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeLoanSimViewModelMonthlyPayment(androidx.lifecycle.MutableLiveData<java.lang.String> LoanSimViewModelMonthlyPayment, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLoanSimViewModelTotalAmount(androidx.lifecycle.MutableLiveData<java.lang.String> LoanSimViewModelTotalAmount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLoanSimViewModelRate(androidx.lifecycle.MutableLiveData<java.lang.String> LoanSimViewModelRate, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLoanSimViewModelTotalInvestment(androidx.lifecycle.MutableLiveData<java.lang.String> LoanSimViewModelTotalInvestment, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLoanSimViewModelDuration(androidx.lifecycle.MutableLiveData<java.lang.String> LoanSimViewModelDuration, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLoanSimViewModelContribution(androidx.lifecycle.MutableLiveData<java.lang.String> LoanSimViewModelContribution, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
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
        androidx.lifecycle.MutableLiveData<java.lang.String> loanSimViewModelMonthlyPayment = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> loanSimViewModelTotalAmount = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> loanSimViewModelRate = null;
        java.lang.String loanSimViewModelContributionGetValue = null;
        java.lang.String loanSimViewModelDurationGetValue = null;
        ltd.kaizo.realestatemanager.controller.ui.loan.LoanSimViewModel loanSimViewModel = mLoanSimViewModel;
        androidx.lifecycle.MutableLiveData<java.lang.String> loanSimViewModelTotalInvestment = null;
        java.lang.String loanSimViewModelTotalAmountGetValue = null;
        java.lang.String loanSimViewModelTotalInvestmentGetValue = null;
        java.lang.String loanSimViewModelMonthlyPaymentGetValue = null;
        java.lang.String loanSimViewModelRateGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> loanSimViewModelDuration = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> loanSimViewModelContribution = null;

        if ((dirtyFlags & 0xffL) != 0) {


            if ((dirtyFlags & 0xc1L) != 0) {

                    if (loanSimViewModel != null) {
                        // read loanSimViewModel.monthlyPayment
                        loanSimViewModelMonthlyPayment = loanSimViewModel.getMonthlyPayment();
                    }
                    updateLiveDataRegistration(0, loanSimViewModelMonthlyPayment);


                    if (loanSimViewModelMonthlyPayment != null) {
                        // read loanSimViewModel.monthlyPayment.getValue()
                        loanSimViewModelMonthlyPaymentGetValue = loanSimViewModelMonthlyPayment.getValue();
                    }
            }
            if ((dirtyFlags & 0xc2L) != 0) {

                    if (loanSimViewModel != null) {
                        // read loanSimViewModel.totalAmount
                        loanSimViewModelTotalAmount = loanSimViewModel.getTotalAmount();
                    }
                    updateLiveDataRegistration(1, loanSimViewModelTotalAmount);


                    if (loanSimViewModelTotalAmount != null) {
                        // read loanSimViewModel.totalAmount.getValue()
                        loanSimViewModelTotalAmountGetValue = loanSimViewModelTotalAmount.getValue();
                    }
            }
            if ((dirtyFlags & 0xc4L) != 0) {

                    if (loanSimViewModel != null) {
                        // read loanSimViewModel.rate
                        loanSimViewModelRate = loanSimViewModel.getRate();
                    }
                    updateLiveDataRegistration(2, loanSimViewModelRate);


                    if (loanSimViewModelRate != null) {
                        // read loanSimViewModel.rate.getValue()
                        loanSimViewModelRateGetValue = loanSimViewModelRate.getValue();
                    }
            }
            if ((dirtyFlags & 0xc8L) != 0) {

                    if (loanSimViewModel != null) {
                        // read loanSimViewModel.totalInvestment
                        loanSimViewModelTotalInvestment = loanSimViewModel.getTotalInvestment();
                    }
                    updateLiveDataRegistration(3, loanSimViewModelTotalInvestment);


                    if (loanSimViewModelTotalInvestment != null) {
                        // read loanSimViewModel.totalInvestment.getValue()
                        loanSimViewModelTotalInvestmentGetValue = loanSimViewModelTotalInvestment.getValue();
                    }
            }
            if ((dirtyFlags & 0xd0L) != 0) {

                    if (loanSimViewModel != null) {
                        // read loanSimViewModel.duration
                        loanSimViewModelDuration = loanSimViewModel.getDuration();
                    }
                    updateLiveDataRegistration(4, loanSimViewModelDuration);


                    if (loanSimViewModelDuration != null) {
                        // read loanSimViewModel.duration.getValue()
                        loanSimViewModelDurationGetValue = loanSimViewModelDuration.getValue();
                    }
            }
            if ((dirtyFlags & 0xe0L) != 0) {

                    if (loanSimViewModel != null) {
                        // read loanSimViewModel.contribution
                        loanSimViewModelContribution = loanSimViewModel.getContribution();
                    }
                    updateLiveDataRegistration(5, loanSimViewModelContribution);


                    if (loanSimViewModelContribution != null) {
                        // read loanSimViewModel.contribution.getValue()
                        loanSimViewModelContributionGetValue = loanSimViewModelContribution.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xc2L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.activityLoanAmount, loanSimViewModelTotalAmountGetValue);
        }
        if ((dirtyFlags & 0x80L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.activityLoanAmount, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, activityLoanAmountandroidTextAttrChanged);
            this.activityLoanCalculateBtn.setOnClickListener(mCallback1);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.activityLoanContribution, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, activityLoanContributionandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.activityLoanMonthlyPayments, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, activityLoanMonthlyPaymentsandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.activityLoanRate, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, activityLoanRateandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.activityLoanTerm, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, activityLoanTermandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.activityLoanTotalInterest, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, activityLoanTotalInterestandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0xe0L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.activityLoanContribution, loanSimViewModelContributionGetValue);
        }
        if ((dirtyFlags & 0xc1L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.activityLoanMonthlyPayments, loanSimViewModelMonthlyPaymentGetValue);
        }
        if ((dirtyFlags & 0xc4L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.activityLoanRate, loanSimViewModelRateGetValue);
        }
        if ((dirtyFlags & 0xd0L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.activityLoanTerm, loanSimViewModelDurationGetValue);
        }
        if ((dirtyFlags & 0xc8L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.activityLoanTotalInterest, loanSimViewModelTotalInvestmentGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // loanSimViewModel != null
        boolean loanSimViewModelJavaLangObjectNull = false;
        // loanSimViewModel
        ltd.kaizo.realestatemanager.controller.ui.loan.LoanSimViewModel loanSimViewModel = mLoanSimViewModel;



        loanSimViewModelJavaLangObjectNull = (loanSimViewModel) != (null);
        if (loanSimViewModelJavaLangObjectNull) {


            loanSimViewModel.calculate();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): loanSimViewModel.monthlyPayment
        flag 1 (0x2L): loanSimViewModel.totalAmount
        flag 2 (0x3L): loanSimViewModel.rate
        flag 3 (0x4L): loanSimViewModel.totalInvestment
        flag 4 (0x5L): loanSimViewModel.duration
        flag 5 (0x6L): loanSimViewModel.contribution
        flag 6 (0x7L): loanSimViewModel
        flag 7 (0x8L): null
    flag mapping end*/
    //end
}