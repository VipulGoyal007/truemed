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
import com.intellihealth.salt.models.BillDetailsModel;
import com.intellihealth.salt.views.TextView;
import com.intellihealth.truemeds.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class BottomsheetViewBillBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout helpTopHeader;

  @NonNull
  public final AppCompatImageView ivClose;

  @NonNull
  public final TextView tvHeader;

  @Bindable
  protected BillDetailsModel mCardData;

  protected BottomsheetViewBillBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout helpTopHeader, AppCompatImageView ivClose, TextView tvHeader) {
    super(_bindingComponent, _root, _localFieldCount);
    this.helpTopHeader = helpTopHeader;
    this.ivClose = ivClose;
    this.tvHeader = tvHeader;
  }

  public abstract void setCardData(@Nullable BillDetailsModel cardData);

  @Nullable
  public BillDetailsModel getCardData() {
    return mCardData;
  }

  @NonNull
  public static BottomsheetViewBillBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.bottomsheet_view_bill, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static BottomsheetViewBillBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<BottomsheetViewBillBinding>inflateInternal(inflater, R.layout.bottomsheet_view_bill, root, attachToRoot, component);
  }

  @NonNull
  public static BottomsheetViewBillBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.bottomsheet_view_bill, null, false, component)
   */
  @NonNull
  @Deprecated
  public static BottomsheetViewBillBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<BottomsheetViewBillBinding>inflateInternal(inflater, R.layout.bottomsheet_view_bill, null, false, component);
  }

  public static BottomsheetViewBillBinding bind(@NonNull View view) {
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
  public static BottomsheetViewBillBinding bind(@NonNull View view, @Nullable Object component) {
    return (BottomsheetViewBillBinding)bind(component, view, R.layout.bottomsheet_view_bill);
  }
}
