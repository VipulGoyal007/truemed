// Generated by data binding compiler. Do not edit!
package com.intellihealth.truemeds.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.intellihealth.salt.views.TextView;
import com.intellihealth.salt.views.buttons.Button;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.presentation.viewmodel.PaymentOptionsViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class BottomsheetPaymentUnsuccessfulBinding extends ViewDataBinding {
  @NonNull
  public final Button btnTryAgain;

  @NonNull
  public final AppCompatImageView imgClose;

  @NonNull
  public final AppCompatImageView ivCouponSuccess;

  @NonNull
  public final ConstraintLayout parentPaymentModeCouponAppliedBottomSheet;

  @NonNull
  public final TextView tvCouponCodeSuccess;

  @NonNull
  public final TextView tvPaymentModeChanged;

  @Bindable
  protected PaymentOptionsViewModel mViewModel;

  protected BottomsheetPaymentUnsuccessfulBinding(Object _bindingComponent, View _root,
      int _localFieldCount, Button btnTryAgain, AppCompatImageView imgClose,
      AppCompatImageView ivCouponSuccess,
      ConstraintLayout parentPaymentModeCouponAppliedBottomSheet, TextView tvCouponCodeSuccess,
      TextView tvPaymentModeChanged) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnTryAgain = btnTryAgain;
    this.imgClose = imgClose;
    this.ivCouponSuccess = ivCouponSuccess;
    this.parentPaymentModeCouponAppliedBottomSheet = parentPaymentModeCouponAppliedBottomSheet;
    this.tvCouponCodeSuccess = tvCouponCodeSuccess;
    this.tvPaymentModeChanged = tvPaymentModeChanged;
  }

  public abstract void setViewModel(@Nullable PaymentOptionsViewModel viewModel);

  @Nullable
  public PaymentOptionsViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static BottomsheetPaymentUnsuccessfulBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.bottomsheet_payment_unsuccessful, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static BottomsheetPaymentUnsuccessfulBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<BottomsheetPaymentUnsuccessfulBinding>inflateInternal(inflater, R.layout.bottomsheet_payment_unsuccessful, root, attachToRoot, component);
  }

  @NonNull
  public static BottomsheetPaymentUnsuccessfulBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.bottomsheet_payment_unsuccessful, null, false, component)
   */
  @NonNull
  @Deprecated
  public static BottomsheetPaymentUnsuccessfulBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<BottomsheetPaymentUnsuccessfulBinding>inflateInternal(inflater, R.layout.bottomsheet_payment_unsuccessful, null, false, component);
  }

  public static BottomsheetPaymentUnsuccessfulBinding bind(@NonNull View view) {
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
  public static BottomsheetPaymentUnsuccessfulBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (BottomsheetPaymentUnsuccessfulBinding)bind(component, view, R.layout.bottomsheet_payment_unsuccessful);
  }
}
