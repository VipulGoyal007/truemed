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
import com.intellihealth.salt.callbacks.ReferralStageCallback;
import com.intellihealth.salt.models.ReferralStageModel;
import com.intellihealth.salt.views.ReferralStage;
import com.intellihealth.truemeds.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ReminderItemBinding extends ViewDataBinding {
  @NonNull
  public final ReferralStage referralReminder;

  @Bindable
  protected ReferralStageModel mReferralStageData;

  @Bindable
  protected ReferralStageCallback mReferralCallback;

  protected ReminderItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ReferralStage referralReminder) {
    super(_bindingComponent, _root, _localFieldCount);
    this.referralReminder = referralReminder;
  }

  public abstract void setReferralStageData(@Nullable ReferralStageModel referralStageData);

  @Nullable
  public ReferralStageModel getReferralStageData() {
    return mReferralStageData;
  }

  public abstract void setReferralCallback(@Nullable ReferralStageCallback referralCallback);

  @Nullable
  public ReferralStageCallback getReferralCallback() {
    return mReferralCallback;
  }

  @NonNull
  public static ReminderItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.reminder_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ReminderItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ReminderItemBinding>inflateInternal(inflater, R.layout.reminder_item, root, attachToRoot, component);
  }

  @NonNull
  public static ReminderItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.reminder_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ReminderItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ReminderItemBinding>inflateInternal(inflater, R.layout.reminder_item, null, false, component);
  }

  public static ReminderItemBinding bind(@NonNull View view) {
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
  public static ReminderItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (ReminderItemBinding)bind(component, view, R.layout.reminder_item);
  }
}
