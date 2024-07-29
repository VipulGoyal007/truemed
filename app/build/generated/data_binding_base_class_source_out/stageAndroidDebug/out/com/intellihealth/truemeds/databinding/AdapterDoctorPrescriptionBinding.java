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
import com.intellihealth.truemeds.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class AdapterDoctorPrescriptionBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout clMain;

  @NonNull
  public final AppCompatImageView ivClose;

  @NonNull
  public final AppCompatImageView ivPrescription;

  @Bindable
  protected String mUrl;

  @Bindable
  protected Boolean mIsCloseButtonShow;

  protected AdapterDoctorPrescriptionBinding(Object _bindingComponent, View _root,
      int _localFieldCount, ConstraintLayout clMain, AppCompatImageView ivClose,
      AppCompatImageView ivPrescription) {
    super(_bindingComponent, _root, _localFieldCount);
    this.clMain = clMain;
    this.ivClose = ivClose;
    this.ivPrescription = ivPrescription;
  }

  public abstract void setUrl(@Nullable String url);

  @Nullable
  public String getUrl() {
    return mUrl;
  }

  public abstract void setIsCloseButtonShow(@Nullable Boolean isCloseButtonShow);

  @Nullable
  public Boolean getIsCloseButtonShow() {
    return mIsCloseButtonShow;
  }

  @NonNull
  public static AdapterDoctorPrescriptionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.adapter_doctor_prescription, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static AdapterDoctorPrescriptionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<AdapterDoctorPrescriptionBinding>inflateInternal(inflater, R.layout.adapter_doctor_prescription, root, attachToRoot, component);
  }

  @NonNull
  public static AdapterDoctorPrescriptionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.adapter_doctor_prescription, null, false, component)
   */
  @NonNull
  @Deprecated
  public static AdapterDoctorPrescriptionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<AdapterDoctorPrescriptionBinding>inflateInternal(inflater, R.layout.adapter_doctor_prescription, null, false, component);
  }

  public static AdapterDoctorPrescriptionBinding bind(@NonNull View view) {
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
  public static AdapterDoctorPrescriptionBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (AdapterDoctorPrescriptionBinding)bind(component, view, R.layout.adapter_doctor_prescription);
  }
}
