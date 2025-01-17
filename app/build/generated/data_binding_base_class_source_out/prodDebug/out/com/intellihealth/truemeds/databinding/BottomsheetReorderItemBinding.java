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
import com.intellihealth.salt.models.ProductInfoModel;
import com.intellihealth.salt.views.TextView;
import com.intellihealth.truemeds.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class BottomsheetReorderItemBinding extends ViewDataBinding {
  @NonNull
  public final TextView tvItemText;

  @NonNull
  public final TextView tvPriceText;

  @NonNull
  public final TextView tvQtyText;

  @Bindable
  protected ProductInfoModel mReorderData;

  protected BottomsheetReorderItemBinding(Object _bindingComponent, View _root,
      int _localFieldCount, TextView tvItemText, TextView tvPriceText, TextView tvQtyText) {
    super(_bindingComponent, _root, _localFieldCount);
    this.tvItemText = tvItemText;
    this.tvPriceText = tvPriceText;
    this.tvQtyText = tvQtyText;
  }

  public abstract void setReorderData(@Nullable ProductInfoModel reorderData);

  @Nullable
  public ProductInfoModel getReorderData() {
    return mReorderData;
  }

  @NonNull
  public static BottomsheetReorderItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.bottomsheet_reorder_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static BottomsheetReorderItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<BottomsheetReorderItemBinding>inflateInternal(inflater, R.layout.bottomsheet_reorder_item, root, attachToRoot, component);
  }

  @NonNull
  public static BottomsheetReorderItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.bottomsheet_reorder_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static BottomsheetReorderItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<BottomsheetReorderItemBinding>inflateInternal(inflater, R.layout.bottomsheet_reorder_item, null, false, component);
  }

  public static BottomsheetReorderItemBinding bind(@NonNull View view) {
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
  public static BottomsheetReorderItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (BottomsheetReorderItemBinding)bind(component, view, R.layout.bottomsheet_reorder_item);
  }
}
