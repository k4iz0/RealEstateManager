package ltd.kaizo.realestatemanager.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import java.lang.Deprecated;
import java.lang.Object;
import ltd.kaizo.realestatemanager.controller.ui.loan.LoanSimViewModel;

public abstract class ActivityLoanSimBinding extends ViewDataBinding {
  @NonNull
  public final EditText activityLoanAmount;

  @NonNull
  public final MaterialButton activityLoanCalculateBtn;

  @NonNull
  public final ConstraintLayout activityLoanConstraintLayout;

  @NonNull
  public final EditText activityLoanContribution;

  @NonNull
  public final CoordinatorLayout activityLoanCoordinatorLayout;

  @NonNull
  public final TextView activityLoanMonthlyPayments;

  @NonNull
  public final TextView activityLoanMonthlyPaymentsTitle;

  @NonNull
  public final EditText activityLoanRate;

  @NonNull
  public final EditText activityLoanTerm;

  @NonNull
  public final Toolbar activityLoanToolbar;

  @NonNull
  public final TextView activityLoanTotalInterest;

  @NonNull
  public final TextView activityLoanTotalInterestTitle;

  @Nullable
  public final Guideline guideline5;

  @Bindable
  protected LoanSimViewModel mLoanSimViewModel;

  protected ActivityLoanSimBinding(Object _bindingComponent, View _root, int _localFieldCount,
      EditText activityLoanAmount, MaterialButton activityLoanCalculateBtn,
      ConstraintLayout activityLoanConstraintLayout, EditText activityLoanContribution,
      CoordinatorLayout activityLoanCoordinatorLayout, TextView activityLoanMonthlyPayments,
      TextView activityLoanMonthlyPaymentsTitle, EditText activityLoanRate,
      EditText activityLoanTerm, Toolbar activityLoanToolbar, TextView activityLoanTotalInterest,
      TextView activityLoanTotalInterestTitle, Guideline guideline5) {
    super(_bindingComponent, _root, _localFieldCount);
    this.activityLoanAmount = activityLoanAmount;
    this.activityLoanCalculateBtn = activityLoanCalculateBtn;
    this.activityLoanConstraintLayout = activityLoanConstraintLayout;
    this.activityLoanContribution = activityLoanContribution;
    this.activityLoanCoordinatorLayout = activityLoanCoordinatorLayout;
    this.activityLoanMonthlyPayments = activityLoanMonthlyPayments;
    this.activityLoanMonthlyPaymentsTitle = activityLoanMonthlyPaymentsTitle;
    this.activityLoanRate = activityLoanRate;
    this.activityLoanTerm = activityLoanTerm;
    this.activityLoanToolbar = activityLoanToolbar;
    this.activityLoanTotalInterest = activityLoanTotalInterest;
    this.activityLoanTotalInterestTitle = activityLoanTotalInterestTitle;
    this.guideline5 = guideline5;
  }

  public abstract void setLoanSimViewModel(@Nullable LoanSimViewModel loanSimViewModel);

  @Nullable
  public LoanSimViewModel getLoanSimViewModel() {
    return mLoanSimViewModel;
  }

  @NonNull
  public static ActivityLoanSimBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_loan_sim, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityLoanSimBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityLoanSimBinding>inflateInternal(inflater, ltd.kaizo.realestatemanager.R.layout.activity_loan_sim, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityLoanSimBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_loan_sim, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityLoanSimBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityLoanSimBinding>inflateInternal(inflater, ltd.kaizo.realestatemanager.R.layout.activity_loan_sim, null, false, component);
  }

  public static ActivityLoanSimBinding bind(@NonNull View view) {
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
  public static ActivityLoanSimBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityLoanSimBinding)bind(component, view, ltd.kaizo.realestatemanager.R.layout.activity_loan_sim);
  }
}
