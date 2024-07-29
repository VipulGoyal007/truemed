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
import com.google.android.material.card.MaterialCardView;
import com.intellihealth.salt.views.TextView;
import com.intellihealth.salt.views.buttons.Button;
import com.intellihealth.salt.views.buttons.ButtonLite;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.presentation.viewmodel.PrescriptionViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class UploadPrescriptionBottomsheetBinding extends ViewDataBinding {
  @NonNull
  public final Button btnLessMore;

  @NonNull
  public final ButtonLite btnNoPrescription;

  @NonNull
  public final ConstraintLayout cameraCtl;

  @NonNull
  public final MaterialCardView cameraMl;

  @NonNull
  public final ConstraintLayout clHeader;

  @NonNull
  public final ConstraintLayout clProgress;

  @NonNull
  public final ConstraintLayout galaryCtl;

  @NonNull
  public final MaterialCardView galaryMl;

  @NonNull
  public final AppCompatImageView imageClose;

  @NonNull
  public final AppCompatImageView imgCamera;

  @NonNull
  public final AppCompatImageView imgGalary;

  @NonNull
  public final AppCompatImageView imgPastPrescription;

  @NonNull
  public final ConstraintLayout mainCardCtl;

  @NonNull
  public final ConstraintLayout pastPrescriptionCtl;

  @NonNull
  public final MaterialCardView pastPrescriptionMl;

  @NonNull
  public final RecyclerView rvPrescription;

  @NonNull
  public final TextView tmCameraTV;

  @NonNull
  public final TextView tmGalaryTv;

  @NonNull
  public final TextView tmPastPrescriptionTv;

  @NonNull
  public final TextView tvHeader;

  @NonNull
  public final TextView tvPrescriptionDetail;

  @NonNull
  public final ConstraintLayout uploadPrescriptionCard;

  @Bindable
  protected PrescriptionViewModel mViewModel;

  protected UploadPrescriptionBottomsheetBinding(Object _bindingComponent, View _root,
      int _localFieldCount, Button btnLessMore, ButtonLite btnNoPrescription,
      ConstraintLayout cameraCtl, MaterialCardView cameraMl, ConstraintLayout clHeader,
      ConstraintLayout clProgress, ConstraintLayout galaryCtl, MaterialCardView galaryMl,
      AppCompatImageView imageClose, AppCompatImageView imgCamera, AppCompatImageView imgGalary,
      AppCompatImageView imgPastPrescription, ConstraintLayout mainCardCtl,
      ConstraintLayout pastPrescriptionCtl, MaterialCardView pastPrescriptionMl,
      RecyclerView rvPrescription, TextView tmCameraTV, TextView tmGalaryTv,
      TextView tmPastPrescriptionTv, TextView tvHeader, TextView tvPrescriptionDetail,
      ConstraintLayout uploadPrescriptionCard) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnLessMore = btnLessMore;
    this.btnNoPrescription = btnNoPrescription;
    this.cameraCtl = cameraCtl;
    this.cameraMl = cameraMl;
    this.clHeader = clHeader;
    this.clProgress = clProgress;
    this.galaryCtl = galaryCtl;
    this.galaryMl = galaryMl;
    this.imageClose = imageClose;
    this.imgCamera = imgCamera;
    this.imgGalary = imgGalary;
    this.imgPastPrescription = imgPastPrescription;
    this.mainCardCtl = mainCardCtl;
    this.pastPrescriptionCtl = pastPrescriptionCtl;
    this.pastPrescriptionMl = pastPrescriptionMl;
    this.rvPrescription = rvPrescription;
    this.tmCameraTV = tmCameraTV;
    this.tmGalaryTv = tmGalaryTv;
    this.tmPastPrescriptionTv = tmPastPrescriptionTv;
    this.tvHeader = tvHeader;
    this.tvPrescriptionDetail = tvPrescriptionDetail;
    this.uploadPrescriptionCard = uploadPrescriptionCard;
  }

  public abstract void setViewModel(@Nullable PrescriptionViewModel viewModel);

  @Nullable
  public PrescriptionViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static UploadPrescriptionBottomsheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.upload_prescription_bottomsheet, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static UploadPrescriptionBottomsheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<UploadPrescriptionBottomsheetBinding>inflateInternal(inflater, R.layout.upload_prescription_bottomsheet, root, attachToRoot, component);
  }

  @NonNull
  public static UploadPrescriptionBottomsheetBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.upload_prescription_bottomsheet, null, false, component)
   */
  @NonNull
  @Deprecated
  public static UploadPrescriptionBottomsheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<UploadPrescriptionBottomsheetBinding>inflateInternal(inflater, R.layout.upload_prescription_bottomsheet, null, false, component);
  }

  public static UploadPrescriptionBottomsheetBinding bind(@NonNull View view) {
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
  public static UploadPrescriptionBottomsheetBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (UploadPrescriptionBottomsheetBinding)bind(component, view, R.layout.upload_prescription_bottomsheet);
  }
}