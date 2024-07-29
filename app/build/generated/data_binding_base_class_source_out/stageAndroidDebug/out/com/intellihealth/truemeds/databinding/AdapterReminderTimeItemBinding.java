// Generated by data binding compiler. Do not edit!
package com.intellihealth.truemeds.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.intellihealth.salt.views.TextView;
import com.intellihealth.salt.views.cards.Divider;
import com.intellihealth.salt.views.radiofield.RadioFieldLayout;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.data.model.reminder.FrequencyListModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class AdapterReminderTimeItemBinding extends ViewDataBinding {
  @NonNull
  public final Divider divider;

  @NonNull
  public final RadioFieldLayout radio;

  @NonNull
  public final ConstraintLayout radioLayout;

  @NonNull
  public final TextView tvDate;

  @Bindable
  protected FrequencyListModel.FrequencyList mReminderItem;

  @Bindable
  protected View mView;

  protected AdapterReminderTimeItemBinding(Object _bindingComponent, View _root,
      int _localFieldCount, Divider divider, RadioFieldLayout radio, ConstraintLayout radioLayout,
      TextView tvDate) {
    super(_bindingComponent, _root, _localFieldCount);
    this.divider = divider;
    this.radio = radio;
    this.radioLayout = radioLayout;
    this.tvDate = tvDate;
  }

  public abstract void setReminderItem(@Nullable FrequencyListModel.FrequencyList reminderItem);

  @Nullable
  public FrequencyListModel.FrequencyList getReminderItem() {
    return mReminderItem;
  }

  public abstract void setView(@Nullable View view);

  @Nullable
  public View getView() {
    return mView;
  }

  @NonNull
  public static AdapterReminderTimeItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.adapter_reminder_time_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static AdapterReminderTimeItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<AdapterReminderTimeItemBinding>inflateInternal(inflater, R.layout.adapter_reminder_time_item, root, attachToRoot, component);
  }

  @NonNull
  public static AdapterReminderTimeItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.adapter_reminder_time_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static AdapterReminderTimeItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<AdapterReminderTimeItemBinding>inflateInternal(inflater, R.layout.adapter_reminder_time_item, null, false, component);
  }

  public static AdapterReminderTimeItemBinding bind(@NonNull View view) {
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
  public static AdapterReminderTimeItemBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (AdapterReminderTimeItemBinding)bind(component, view, R.layout.adapter_reminder_time_item);
  }
}
