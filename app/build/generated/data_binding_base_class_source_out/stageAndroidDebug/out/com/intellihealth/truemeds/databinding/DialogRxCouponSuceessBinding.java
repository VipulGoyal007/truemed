// Generated by data binding compiler. Do not edit!
package com.intellihealth.truemeds.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.intellihealth.salt.views.TextView;
import com.intellihealth.salt.views.buttons.Button;
import com.intellihealth.salt.views.chip.Chip;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.presentation.callbacks.PopUpDialogCallback;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class DialogRxCouponSuceessBinding extends ViewDataBinding {
  @NonNull
  public final Button btnOk;

  @NonNull
  public final AppCompatImageView ivClose;

  @NonNull
  public final AppCompatImageView ivCouponSuccess;

  @NonNull
  public final TextView tvCouponCodeSuccess;

  @NonNull
  public final TextView tvCouponSuccessSavings;

  @NonNull
  public final TextView tvSaving;

  @NonNull
  public final Chip tvTimer;

  @Bindable
  protected String mCouponCode;

  @Bindable
  protected Double mSaving;

  @Bindable
  protected PopUpDialogCallback mCallback;

  protected DialogRxCouponSuceessBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button btnOk, AppCompatImageView ivClose, AppCompatImageView ivCouponSuccess,
      TextView tvCouponCodeSuccess, TextView tvCouponSuccessSavings, TextView tvSaving,
      Chip tvTimer) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnOk = btnOk;
    this.ivClose = ivClose;
    this.ivCouponSuccess = ivCouponSuccess;
    this.tvCouponCodeSuccess = tvCouponCodeSuccess;
    this.tvCouponSuccessSavings = tvCouponSuccessSavings;
    this.tvSaving = tvSaving;
    this.tvTimer = tvTimer;
  }

  public abstract void setCouponCode(@Nullable String couponCode);

  @Nullable
  public String getCouponCode() {
    return mCouponCode;
  }

  public abstract void setSaving(@Nullable Double saving);

  @Nullable
  public Double getSaving() {
    return mSaving;
  }

  public abstract void setCallback(@Nullable PopUpDialogCallback callback);

  @Nullable
  public PopUpDialogCallback getCallback() {
    return mCallback;
  }

  @NonNull
  public static DialogRxCouponSuceessBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_rx_coupon_suceess, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static DialogRxCouponSuceessBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<DialogRxCouponSuceessBinding>inflateInternal(inflater, R.layout.dialog_rx_coupon_suceess, root, attachToRoot, component);
  }

  @NonNull
  public static DialogRxCouponSuceessBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_rx_coupon_suceess, null, false, component)
   */
  @NonNull
  @Deprecated
  public static DialogRxCouponSuceessBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<DialogRxCouponSuceessBinding>inflateInternal(inflater, R.layout.dialog_rx_coupon_suceess, null, false, component);
  }

  public static DialogRxCouponSuceessBinding bind(@NonNull View view) {
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
  public static DialogRxCouponSuceessBinding bind(@NonNull View view, @Nullable Object component) {
    return (DialogRxCouponSuceessBinding)bind(component, view, R.layout.dialog_rx_coupon_suceess);
  }
}
