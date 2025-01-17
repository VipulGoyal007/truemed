// Generated by data binding compiler. Do not edit!
package com.intellihealth.truemeds.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.intellihealth.salt.views.cards.ActionCard;
import com.intellihealth.truemeds.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class AdapterPrescriptionActionCardItemBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout clPrescriptionCard;

  @NonNull
  public final ActionCard tmPrescriptionActionCard;

  protected AdapterPrescriptionActionCardItemBinding(Object _bindingComponent, View _root,
      int _localFieldCount, ConstraintLayout clPrescriptionCard,
      ActionCard tmPrescriptionActionCard) {
    super(_bindingComponent, _root, _localFieldCount);
    this.clPrescriptionCard = clPrescriptionCard;
    this.tmPrescriptionActionCard = tmPrescriptionActionCard;
  }

  @NonNull
  public static AdapterPrescriptionActionCardItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.adapter_prescription_action_card_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static AdapterPrescriptionActionCardItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<AdapterPrescriptionActionCardItemBinding>inflateInternal(inflater, R.layout.adapter_prescription_action_card_item, root, attachToRoot, component);
  }

  @NonNull
  public static AdapterPrescriptionActionCardItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.adapter_prescription_action_card_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static AdapterPrescriptionActionCardItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<AdapterPrescriptionActionCardItemBinding>inflateInternal(inflater, R.layout.adapter_prescription_action_card_item, null, false, component);
  }

  public static AdapterPrescriptionActionCardItemBinding bind(@NonNull View view) {
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
  public static AdapterPrescriptionActionCardItemBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (AdapterPrescriptionActionCardItemBinding)bind(component, view, R.layout.adapter_prescription_action_card_item);
  }
}
