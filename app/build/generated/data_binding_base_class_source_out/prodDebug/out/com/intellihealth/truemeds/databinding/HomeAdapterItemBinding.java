// Generated by data binding compiler. Do not edit!
package com.intellihealth.truemeds.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.intellihealth.salt.views.TextView;
import com.intellihealth.truemeds.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class HomeAdapterItemBinding extends ViewDataBinding {
  @NonNull
  public final TextView txTextView;

  protected HomeAdapterItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView txTextView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.txTextView = txTextView;
  }

  @NonNull
  public static HomeAdapterItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.home_adapter_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static HomeAdapterItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<HomeAdapterItemBinding>inflateInternal(inflater, R.layout.home_adapter_item, root, attachToRoot, component);
  }

  @NonNull
  public static HomeAdapterItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.home_adapter_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static HomeAdapterItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<HomeAdapterItemBinding>inflateInternal(inflater, R.layout.home_adapter_item, null, false, component);
  }

  public static HomeAdapterItemBinding bind(@NonNull View view) {
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
  public static HomeAdapterItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (HomeAdapterItemBinding)bind(component, view, R.layout.home_adapter_item);
  }
}
