// Generated by data binding compiler. Do not edit!
package com.intellihealth.truemeds.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.intellihealth.salt.views.chip.Chip;
import com.intellihealth.truemeds.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class AdapterChipsReminderItemBinding extends ViewDataBinding {
  @NonNull
  public final Chip chip;

  protected AdapterChipsReminderItemBinding(Object _bindingComponent, View _root,
      int _localFieldCount, Chip chip) {
    super(_bindingComponent, _root, _localFieldCount);
    this.chip = chip;
  }

  @NonNull
  public static AdapterChipsReminderItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.adapter_chips_reminder_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static AdapterChipsReminderItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<AdapterChipsReminderItemBinding>inflateInternal(inflater, R.layout.adapter_chips_reminder_item, root, attachToRoot, component);
  }

  @NonNull
  public static AdapterChipsReminderItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.adapter_chips_reminder_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static AdapterChipsReminderItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<AdapterChipsReminderItemBinding>inflateInternal(inflater, R.layout.adapter_chips_reminder_item, null, false, component);
  }

  public static AdapterChipsReminderItemBinding bind(@NonNull View view) {
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
  public static AdapterChipsReminderItemBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (AdapterChipsReminderItemBinding)bind(component, view, R.layout.adapter_chips_reminder_item);
  }
}