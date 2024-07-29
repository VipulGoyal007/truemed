// Generated by data binding compiler. Do not edit!
package com.intellihealth.truemeds.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.intellihealth.salt.views.TextView;
import com.intellihealth.salt.views.buttons.ButtonLite;
import com.intellihealth.truemeds.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class CancelOrderBottomsheetBinding extends ViewDataBinding {
  @NonNull
  public final ButtonLite deleteBtn;

  @NonNull
  public final ButtonLite goBack;

  @NonNull
  public final AppCompatImageView ivClose;

  @NonNull
  public final TextView tvSubTitle;

  @NonNull
  public final TextView tvTitle;

  protected CancelOrderBottomsheetBinding(Object _bindingComponent, View _root,
      int _localFieldCount, ButtonLite deleteBtn, ButtonLite goBack, AppCompatImageView ivClose,
      TextView tvSubTitle, TextView tvTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.deleteBtn = deleteBtn;
    this.goBack = goBack;
    this.ivClose = ivClose;
    this.tvSubTitle = tvSubTitle;
    this.tvTitle = tvTitle;
  }

  @NonNull
  public static CancelOrderBottomsheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.cancel_order_bottomsheet, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static CancelOrderBottomsheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<CancelOrderBottomsheetBinding>inflateInternal(inflater, R.layout.cancel_order_bottomsheet, root, attachToRoot, component);
  }

  @NonNull
  public static CancelOrderBottomsheetBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.cancel_order_bottomsheet, null, false, component)
   */
  @NonNull
  @Deprecated
  public static CancelOrderBottomsheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<CancelOrderBottomsheetBinding>inflateInternal(inflater, R.layout.cancel_order_bottomsheet, null, false, component);
  }

  public static CancelOrderBottomsheetBinding bind(@NonNull View view) {
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
  public static CancelOrderBottomsheetBinding bind(@NonNull View view, @Nullable Object component) {
    return (CancelOrderBottomsheetBinding)bind(component, view, R.layout.cancel_order_bottomsheet);
  }
}
