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
import com.intellihealth.salt.views.RoundedImageView;
import com.intellihealth.salt.views.TextView;
import com.intellihealth.salt.views.buttons.Button;
import com.intellihealth.salt.views.cards.Divider;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.presentation.callbacks.PaymentPendingCallback;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class BottomsheetPaymentPendingBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout clHeader;

  @NonNull
  public final AppCompatImageView imageClose;

  @NonNull
  public final AppCompatImageView imgLeft;

  @NonNull
  public final RoundedImageView ivUpiLogo;

  @NonNull
  public final Divider tmDivider;

  @NonNull
  public final Button tvChange;

  @NonNull
  public final TextView tvHeader;

  @NonNull
  public final Button tvPay;

  @NonNull
  public final TextView tvPayUsingPayment;

  @NonNull
  public final TextView tvSubHeader;

  @NonNull
  public final TextView tvUPIPayment;

  @NonNull
  public final View viewDragHandle;

  @Bindable
  protected Double mSellingPrice;

  @Bindable
  protected PaymentPendingCallback mCallback;

  protected BottomsheetPaymentPendingBinding(Object _bindingComponent, View _root,
      int _localFieldCount, ConstraintLayout clHeader, AppCompatImageView imageClose,
      AppCompatImageView imgLeft, RoundedImageView ivUpiLogo, Divider tmDivider, Button tvChange,
      TextView tvHeader, Button tvPay, TextView tvPayUsingPayment, TextView tvSubHeader,
      TextView tvUPIPayment, View viewDragHandle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.clHeader = clHeader;
    this.imageClose = imageClose;
    this.imgLeft = imgLeft;
    this.ivUpiLogo = ivUpiLogo;
    this.tmDivider = tmDivider;
    this.tvChange = tvChange;
    this.tvHeader = tvHeader;
    this.tvPay = tvPay;
    this.tvPayUsingPayment = tvPayUsingPayment;
    this.tvSubHeader = tvSubHeader;
    this.tvUPIPayment = tvUPIPayment;
    this.viewDragHandle = viewDragHandle;
  }

  public abstract void setSellingPrice(@Nullable Double sellingPrice);

  @Nullable
  public Double getSellingPrice() {
    return mSellingPrice;
  }

  public abstract void setCallback(@Nullable PaymentPendingCallback callback);

  @Nullable
  public PaymentPendingCallback getCallback() {
    return mCallback;
  }

  @NonNull
  public static BottomsheetPaymentPendingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.bottomsheet_payment_pending, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static BottomsheetPaymentPendingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<BottomsheetPaymentPendingBinding>inflateInternal(inflater, R.layout.bottomsheet_payment_pending, root, attachToRoot, component);
  }

  @NonNull
  public static BottomsheetPaymentPendingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.bottomsheet_payment_pending, null, false, component)
   */
  @NonNull
  @Deprecated
  public static BottomsheetPaymentPendingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<BottomsheetPaymentPendingBinding>inflateInternal(inflater, R.layout.bottomsheet_payment_pending, null, false, component);
  }

  public static BottomsheetPaymentPendingBinding bind(@NonNull View view) {
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
  public static BottomsheetPaymentPendingBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (BottomsheetPaymentPendingBinding)bind(component, view, R.layout.bottomsheet_payment_pending);
  }
}
