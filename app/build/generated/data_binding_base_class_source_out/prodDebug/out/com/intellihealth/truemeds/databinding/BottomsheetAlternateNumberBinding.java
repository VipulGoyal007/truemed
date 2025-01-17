// Generated by data binding compiler. Do not edit!
package com.intellihealth.truemeds.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.intellihealth.salt.views.TextView;
import com.intellihealth.salt.views.buttons.Button;
import com.intellihealth.salt.views.buttons.ButtonLite;
import com.intellihealth.salt.views.edittext.InputFieldLayout;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.presentation.viewmodel.OrderStatusViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class BottomsheetAlternateNumberBinding extends ViewDataBinding {
  @NonNull
  public final Button btnAdd;

  @NonNull
  public final ButtonLite btnDeleteNum;

  @NonNull
  public final ConstraintLayout clHeader;

  @NonNull
  public final InputFieldLayout etAlternateNumber;

  @NonNull
  public final AppCompatImageView imageClose;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final TextView tvHeader;

  @Bindable
  protected OrderStatusViewModel mViewModel;

  protected BottomsheetAlternateNumberBinding(Object _bindingComponent, View _root,
      int _localFieldCount, Button btnAdd, ButtonLite btnDeleteNum, ConstraintLayout clHeader,
      InputFieldLayout etAlternateNumber, AppCompatImageView imageClose, ProgressBar progressBar,
      TextView tvHeader) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnAdd = btnAdd;
    this.btnDeleteNum = btnDeleteNum;
    this.clHeader = clHeader;
    this.etAlternateNumber = etAlternateNumber;
    this.imageClose = imageClose;
    this.progressBar = progressBar;
    this.tvHeader = tvHeader;
  }

  public abstract void setViewModel(@Nullable OrderStatusViewModel viewModel);

  @Nullable
  public OrderStatusViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static BottomsheetAlternateNumberBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.bottomsheet_alternate_number, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static BottomsheetAlternateNumberBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<BottomsheetAlternateNumberBinding>inflateInternal(inflater, R.layout.bottomsheet_alternate_number, root, attachToRoot, component);
  }

  @NonNull
  public static BottomsheetAlternateNumberBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.bottomsheet_alternate_number, null, false, component)
   */
  @NonNull
  @Deprecated
  public static BottomsheetAlternateNumberBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<BottomsheetAlternateNumberBinding>inflateInternal(inflater, R.layout.bottomsheet_alternate_number, null, false, component);
  }

  public static BottomsheetAlternateNumberBinding bind(@NonNull View view) {
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
  public static BottomsheetAlternateNumberBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (BottomsheetAlternateNumberBinding)bind(component, view, R.layout.bottomsheet_alternate_number);
  }
}
