// Generated by data binding compiler. Do not edit!
package com.intellihealth.truemeds.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.intellihealth.salt.views.TextView;
import com.intellihealth.salt.views.buttons.Button;
import com.intellihealth.salt.views.dropdown.DropDownHeader;
import com.intellihealth.truemeds.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class BottomsheetChooseTimeIntervalBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout clCustomDate;

  @NonNull
  public final ConstraintLayout clFromSection;

  @NonNull
  public final ConstraintLayout clHeader;

  @NonNull
  public final ConstraintLayout clToSection;

  @NonNull
  public final DropDownHeader dropDownTimeIntervalFrom;

  @NonNull
  public final DropDownHeader dropDownTimeIntervalTo;

  @NonNull
  public final AppCompatImageView imageBack;

  @NonNull
  public final AppCompatImageView imageClose;

  @NonNull
  public final RecyclerView rvTimeIntervalList;

  @NonNull
  public final TextView textFrom;

  @NonNull
  public final TextView textTo;

  @NonNull
  public final Button tvApplyTimeInterval;

  @NonNull
  public final TextView tvHeader;

  protected BottomsheetChooseTimeIntervalBinding(Object _bindingComponent, View _root,
      int _localFieldCount, ConstraintLayout clCustomDate, ConstraintLayout clFromSection,
      ConstraintLayout clHeader, ConstraintLayout clToSection,
      DropDownHeader dropDownTimeIntervalFrom, DropDownHeader dropDownTimeIntervalTo,
      AppCompatImageView imageBack, AppCompatImageView imageClose, RecyclerView rvTimeIntervalList,
      TextView textFrom, TextView textTo, Button tvApplyTimeInterval, TextView tvHeader) {
    super(_bindingComponent, _root, _localFieldCount);
    this.clCustomDate = clCustomDate;
    this.clFromSection = clFromSection;
    this.clHeader = clHeader;
    this.clToSection = clToSection;
    this.dropDownTimeIntervalFrom = dropDownTimeIntervalFrom;
    this.dropDownTimeIntervalTo = dropDownTimeIntervalTo;
    this.imageBack = imageBack;
    this.imageClose = imageClose;
    this.rvTimeIntervalList = rvTimeIntervalList;
    this.textFrom = textFrom;
    this.textTo = textTo;
    this.tvApplyTimeInterval = tvApplyTimeInterval;
    this.tvHeader = tvHeader;
  }

  @NonNull
  public static BottomsheetChooseTimeIntervalBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.bottomsheet_choose_time_interval, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static BottomsheetChooseTimeIntervalBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<BottomsheetChooseTimeIntervalBinding>inflateInternal(inflater, R.layout.bottomsheet_choose_time_interval, root, attachToRoot, component);
  }

  @NonNull
  public static BottomsheetChooseTimeIntervalBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.bottomsheet_choose_time_interval, null, false, component)
   */
  @NonNull
  @Deprecated
  public static BottomsheetChooseTimeIntervalBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<BottomsheetChooseTimeIntervalBinding>inflateInternal(inflater, R.layout.bottomsheet_choose_time_interval, null, false, component);
  }

  public static BottomsheetChooseTimeIntervalBinding bind(@NonNull View view) {
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
  public static BottomsheetChooseTimeIntervalBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (BottomsheetChooseTimeIntervalBinding)bind(component, view, R.layout.bottomsheet_choose_time_interval);
  }
}
