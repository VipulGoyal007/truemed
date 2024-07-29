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
import com.intellihealth.salt.views.TextView;
import com.intellihealth.salt.views.buttons.Button;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class BottomsheetSaveNumberBinding extends ViewDataBinding {
  @NonNull
  public final Button btnSaveContact;

  @NonNull
  public final ConstraintLayout clSaveCall;

  @NonNull
  public final AppCompatImageView imgCall;

  @NonNull
  public final AppCompatImageView imgClose;

  @NonNull
  public final TextView textBestExperience;

  @NonNull
  public final TextView textClickSave;

  @Bindable
  protected HomeViewModel mViewmodel;

  protected BottomsheetSaveNumberBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button btnSaveContact, ConstraintLayout clSaveCall, AppCompatImageView imgCall,
      AppCompatImageView imgClose, TextView textBestExperience, TextView textClickSave) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnSaveContact = btnSaveContact;
    this.clSaveCall = clSaveCall;
    this.imgCall = imgCall;
    this.imgClose = imgClose;
    this.textBestExperience = textBestExperience;
    this.textClickSave = textClickSave;
  }

  public abstract void setViewmodel(@Nullable HomeViewModel viewmodel);

  @Nullable
  public HomeViewModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static BottomsheetSaveNumberBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.bottomsheet_save_number, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static BottomsheetSaveNumberBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<BottomsheetSaveNumberBinding>inflateInternal(inflater, R.layout.bottomsheet_save_number, root, attachToRoot, component);
  }

  @NonNull
  public static BottomsheetSaveNumberBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.bottomsheet_save_number, null, false, component)
   */
  @NonNull
  @Deprecated
  public static BottomsheetSaveNumberBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<BottomsheetSaveNumberBinding>inflateInternal(inflater, R.layout.bottomsheet_save_number, null, false, component);
  }

  public static BottomsheetSaveNumberBinding bind(@NonNull View view) {
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
  public static BottomsheetSaveNumberBinding bind(@NonNull View view, @Nullable Object component) {
    return (BottomsheetSaveNumberBinding)bind(component, view, R.layout.bottomsheet_save_number);
  }
}