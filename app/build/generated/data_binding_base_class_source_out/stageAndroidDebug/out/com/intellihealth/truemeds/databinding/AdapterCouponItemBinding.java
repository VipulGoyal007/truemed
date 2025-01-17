// Generated by data binding compiler. Do not edit!
package com.intellihealth.truemeds.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.intellihealth.salt.views.cards.CouponCtaCards;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse;
import com.intellihealth.truemeds.presentation.viewmodel.CouponViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class AdapterCouponItemBinding extends ViewDataBinding {
  @NonNull
  public final CouponCtaCards couponCard;

  @Bindable
  protected CouponViewModel mViewModel;

  @Bindable
  protected CouponCodeResponse.Coupon mCouponModel;

  protected AdapterCouponItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CouponCtaCards couponCard) {
    super(_bindingComponent, _root, _localFieldCount);
    this.couponCard = couponCard;
  }

  public abstract void setViewModel(@Nullable CouponViewModel viewModel);

  @Nullable
  public CouponViewModel getViewModel() {
    return mViewModel;
  }

  public abstract void setCouponModel(@Nullable CouponCodeResponse.Coupon couponModel);

  @Nullable
  public CouponCodeResponse.Coupon getCouponModel() {
    return mCouponModel;
  }

  @NonNull
  public static AdapterCouponItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.adapter_coupon_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static AdapterCouponItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<AdapterCouponItemBinding>inflateInternal(inflater, R.layout.adapter_coupon_item, root, attachToRoot, component);
  }

  @NonNull
  public static AdapterCouponItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.adapter_coupon_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static AdapterCouponItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<AdapterCouponItemBinding>inflateInternal(inflater, R.layout.adapter_coupon_item, null, false, component);
  }

  public static AdapterCouponItemBinding bind(@NonNull View view) {
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
  public static AdapterCouponItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (AdapterCouponItemBinding)bind(component, view, R.layout.adapter_coupon_item);
  }
}
