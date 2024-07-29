// Generated by data binding compiler. Do not edit!
package com.intellihealth.truemeds.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.intellihealth.salt.views.TextView;
import com.intellihealth.salt.views.cards.Divider;
import com.intellihealth.salt.views.radiofield.Radio;
import com.intellihealth.salt.views.radiofield.RadioFieldLayout;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.data.model.wallet.TimeIntervalBottomSheetModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class AdapterTimeIntervalItemDefaultBinding extends ViewDataBinding {
  @NonNull
  public final Divider dividerTimerInterval;

  @NonNull
  public final AppCompatImageView ivEditCustomDates;

  @NonNull
  public final RadioFieldLayout radio;

  @NonNull
  public final Radio radioHeader;

  @NonNull
  public final TextView textSelectedCustomDates;

  @NonNull
  public final TextView tvRadioLabel;

  @Bindable
  protected TimeIntervalBottomSheetModel mTimeIntervalData;

  protected AdapterTimeIntervalItemDefaultBinding(Object _bindingComponent, View _root,
      int _localFieldCount, Divider dividerTimerInterval, AppCompatImageView ivEditCustomDates,
      RadioFieldLayout radio, Radio radioHeader, TextView textSelectedCustomDates,
      TextView tvRadioLabel) {
    super(_bindingComponent, _root, _localFieldCount);
    this.dividerTimerInterval = dividerTimerInterval;
    this.ivEditCustomDates = ivEditCustomDates;
    this.radio = radio;
    this.radioHeader = radioHeader;
    this.textSelectedCustomDates = textSelectedCustomDates;
    this.tvRadioLabel = tvRadioLabel;
  }

  public abstract void setTimeIntervalData(@Nullable TimeIntervalBottomSheetModel timeIntervalData);

  @Nullable
  public TimeIntervalBottomSheetModel getTimeIntervalData() {
    return mTimeIntervalData;
  }

  @NonNull
  public static AdapterTimeIntervalItemDefaultBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.adapter_time_interval_item_default, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static AdapterTimeIntervalItemDefaultBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<AdapterTimeIntervalItemDefaultBinding>inflateInternal(inflater, R.layout.adapter_time_interval_item_default, root, attachToRoot, component);
  }

  @NonNull
  public static AdapterTimeIntervalItemDefaultBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.adapter_time_interval_item_default, null, false, component)
   */
  @NonNull
  @Deprecated
  public static AdapterTimeIntervalItemDefaultBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<AdapterTimeIntervalItemDefaultBinding>inflateInternal(inflater, R.layout.adapter_time_interval_item_default, null, false, component);
  }

  public static AdapterTimeIntervalItemDefaultBinding bind(@NonNull View view) {
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
  public static AdapterTimeIntervalItemDefaultBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (AdapterTimeIntervalItemDefaultBinding)bind(component, view, R.layout.adapter_time_interval_item_default);
  }
}