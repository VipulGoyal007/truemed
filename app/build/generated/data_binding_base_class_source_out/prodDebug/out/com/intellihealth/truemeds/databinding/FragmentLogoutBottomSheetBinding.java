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

public abstract class FragmentLogoutBottomSheetBinding extends ViewDataBinding {
  @NonNull
  public final ButtonLite btnDoNotLogout;

  @NonNull
  public final ButtonLite btnLogout;

  @NonNull
  public final AppCompatImageView imClose;

  @NonNull
  public final TextView tvTitle;

  protected FragmentLogoutBottomSheetBinding(Object _bindingComponent, View _root,
      int _localFieldCount, ButtonLite btnDoNotLogout, ButtonLite btnLogout,
      AppCompatImageView imClose, TextView tvTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnDoNotLogout = btnDoNotLogout;
    this.btnLogout = btnLogout;
    this.imClose = imClose;
    this.tvTitle = tvTitle;
  }

  @NonNull
  public static FragmentLogoutBottomSheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_logout_bottom_sheet, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentLogoutBottomSheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentLogoutBottomSheetBinding>inflateInternal(inflater, R.layout.fragment_logout_bottom_sheet, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentLogoutBottomSheetBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_logout_bottom_sheet, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentLogoutBottomSheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentLogoutBottomSheetBinding>inflateInternal(inflater, R.layout.fragment_logout_bottom_sheet, null, false, component);
  }

  public static FragmentLogoutBottomSheetBinding bind(@NonNull View view) {
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
  public static FragmentLogoutBottomSheetBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (FragmentLogoutBottomSheetBinding)bind(component, view, R.layout.fragment_logout_bottom_sheet);
  }
}
