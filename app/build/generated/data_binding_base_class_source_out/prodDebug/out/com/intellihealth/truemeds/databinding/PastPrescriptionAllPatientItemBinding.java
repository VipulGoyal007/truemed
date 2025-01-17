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
import androidx.recyclerview.widget.RecyclerView;
import com.intellihealth.salt.views.TextView;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.data.model.prescription.PastPrescriptions;
import com.intellihealth.truemeds.presentation.viewmodel.PrescriptionViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class PastPrescriptionAllPatientItemBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView rvPrescription;

  @NonNull
  public final TextView tvHeader;

  @Bindable
  protected PastPrescriptions mPastPrescriptionModel;

  @Bindable
  protected PrescriptionViewModel mViewModell;

  protected PastPrescriptionAllPatientItemBinding(Object _bindingComponent, View _root,
      int _localFieldCount, RecyclerView rvPrescription, TextView tvHeader) {
    super(_bindingComponent, _root, _localFieldCount);
    this.rvPrescription = rvPrescription;
    this.tvHeader = tvHeader;
  }

  public abstract void setPastPrescriptionModel(@Nullable PastPrescriptions pastPrescriptionModel);

  @Nullable
  public PastPrescriptions getPastPrescriptionModel() {
    return mPastPrescriptionModel;
  }

  public abstract void setViewModell(@Nullable PrescriptionViewModel viewModell);

  @Nullable
  public PrescriptionViewModel getViewModell() {
    return mViewModell;
  }

  @NonNull
  public static PastPrescriptionAllPatientItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.past_prescription_all_patient_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static PastPrescriptionAllPatientItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<PastPrescriptionAllPatientItemBinding>inflateInternal(inflater, R.layout.past_prescription_all_patient_item, root, attachToRoot, component);
  }

  @NonNull
  public static PastPrescriptionAllPatientItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.past_prescription_all_patient_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static PastPrescriptionAllPatientItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<PastPrescriptionAllPatientItemBinding>inflateInternal(inflater, R.layout.past_prescription_all_patient_item, null, false, component);
  }

  public static PastPrescriptionAllPatientItemBinding bind(@NonNull View view) {
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
  public static PastPrescriptionAllPatientItemBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (PastPrescriptionAllPatientItemBinding)bind(component, view, R.layout.past_prescription_all_patient_item);
  }
}
