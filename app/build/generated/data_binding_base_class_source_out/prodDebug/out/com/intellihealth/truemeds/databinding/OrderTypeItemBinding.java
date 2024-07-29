// Generated by data binding compiler. Do not edit!
package com.intellihealth.truemeds.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.intellihealth.salt.views.radiofield.RadioFieldLayout;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.presentation.viewmodel.OrdersTabViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class OrderTypeItemBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout constraitMain;

  @NonNull
  public final RadioFieldLayout customRadioOrder;

  @Bindable
  protected OrdersTabViewModel mViewModel;

  @Bindable
  protected Integer mItemPosition;

  protected OrderTypeItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout constraitMain, RadioFieldLayout customRadioOrder) {
    super(_bindingComponent, _root, _localFieldCount);
    this.constraitMain = constraitMain;
    this.customRadioOrder = customRadioOrder;
  }

  public abstract void setViewModel(@Nullable OrdersTabViewModel viewModel);

  @Nullable
  public OrdersTabViewModel getViewModel() {
    return mViewModel;
  }

  public abstract void setItemPosition(@Nullable Integer itemPosition);

  @Nullable
  public Integer getItemPosition() {
    return mItemPosition;
  }

  @NonNull
  public static OrderTypeItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.order_type_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static OrderTypeItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<OrderTypeItemBinding>inflateInternal(inflater, R.layout.order_type_item, root, attachToRoot, component);
  }

  @NonNull
  public static OrderTypeItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.order_type_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static OrderTypeItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<OrderTypeItemBinding>inflateInternal(inflater, R.layout.order_type_item, null, false, component);
  }

  public static OrderTypeItemBinding bind(@NonNull View view) {
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
  public static OrderTypeItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (OrderTypeItemBinding)bind(component, view, R.layout.order_type_item);
  }
}
