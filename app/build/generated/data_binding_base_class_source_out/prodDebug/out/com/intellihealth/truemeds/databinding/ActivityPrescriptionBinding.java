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
import androidx.recyclerview.widget.RecyclerView;
import com.intellihealth.salt.views.MobileSectionHeaders;
import com.intellihealth.salt.views.TextView;
import com.intellihealth.salt.views.buttons.Button;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.presentation.callbacks.ViewPrescriptionCallback;
import com.intellihealth.truemeds.presentation.viewmodel.PrescriptionViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityPrescriptionBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatImageView bottomLine;

  @NonNull
  public final Button btnCheckout;

  @NonNull
  public final Button btnUpload;

  @NonNull
  public final ConstraintLayout clCheckout;

  @NonNull
  public final MobileSectionHeaders mobileSectionHeadersDefaultWithoutFill;

  @NonNull
  public final ConstraintLayout prescriptionCardCtl;

  @NonNull
  public final AppCompatImageView prescriptionCardImg;

  @NonNull
  public final TextView prescriptionHeaderTv;

  @NonNull
  public final TextView prescriptionSubHeaderTv;

  @NonNull
  public final RecyclerView rvPrescription;

  @NonNull
  public final TextView tmChip3;

  @NonNull
  public final TextView tvHeader;

  @NonNull
  public final TextView tvNextStep;

  @NonNull
  public final TextView tvSubHeader;

  @NonNull
  public final AppCompatImageView view;

  @Bindable
  protected PrescriptionViewModel mPrescriptionViewModel;

  @Bindable
  protected ViewPrescriptionCallback mCallback;

  protected ActivityPrescriptionBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatImageView bottomLine, Button btnCheckout, Button btnUpload,
      ConstraintLayout clCheckout, MobileSectionHeaders mobileSectionHeadersDefaultWithoutFill,
      ConstraintLayout prescriptionCardCtl, AppCompatImageView prescriptionCardImg,
      TextView prescriptionHeaderTv, TextView prescriptionSubHeaderTv, RecyclerView rvPrescription,
      TextView tmChip3, TextView tvHeader, TextView tvNextStep, TextView tvSubHeader,
      AppCompatImageView view) {
    super(_bindingComponent, _root, _localFieldCount);
    this.bottomLine = bottomLine;
    this.btnCheckout = btnCheckout;
    this.btnUpload = btnUpload;
    this.clCheckout = clCheckout;
    this.mobileSectionHeadersDefaultWithoutFill = mobileSectionHeadersDefaultWithoutFill;
    this.prescriptionCardCtl = prescriptionCardCtl;
    this.prescriptionCardImg = prescriptionCardImg;
    this.prescriptionHeaderTv = prescriptionHeaderTv;
    this.prescriptionSubHeaderTv = prescriptionSubHeaderTv;
    this.rvPrescription = rvPrescription;
    this.tmChip3 = tmChip3;
    this.tvHeader = tvHeader;
    this.tvNextStep = tvNextStep;
    this.tvSubHeader = tvSubHeader;
    this.view = view;
  }

  public abstract void setPrescriptionViewModel(
      @Nullable PrescriptionViewModel prescriptionViewModel);

  @Nullable
  public PrescriptionViewModel getPrescriptionViewModel() {
    return mPrescriptionViewModel;
  }

  public abstract void setCallback(@Nullable ViewPrescriptionCallback callback);

  @Nullable
  public ViewPrescriptionCallback getCallback() {
    return mCallback;
  }

  @NonNull
  public static ActivityPrescriptionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_prescription, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityPrescriptionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityPrescriptionBinding>inflateInternal(inflater, R.layout.activity_prescription, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityPrescriptionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_prescription, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityPrescriptionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityPrescriptionBinding>inflateInternal(inflater, R.layout.activity_prescription, null, false, component);
  }

  public static ActivityPrescriptionBinding bind(@NonNull View view) {
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
  public static ActivityPrescriptionBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityPrescriptionBinding)bind(component, view, R.layout.activity_prescription);
  }
}
