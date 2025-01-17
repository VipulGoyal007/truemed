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
import com.intellihealth.salt.views.TextView;
import com.intellihealth.salt.views.buttons.ButtonLite;
import com.intellihealth.salt.views.dropdown.DropDownDefault;
import com.intellihealth.salt.views.dropdown.DropDownHeader;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.data.callback.BottomSheetCloseCallback;
import com.intellihealth.truemeds.presentation.viewmodel.PrescriptionViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class PastPrescriptionBottomsheetBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatImageView bottomLine;

  @NonNull
  public final ConstraintLayout clProgress;

  @NonNull
  public final DropDownDefault dropDownDefault;

  @NonNull
  public final DropDownHeader dropDownHeader;

  @NonNull
  public final AppCompatImageView imageClose;

  @NonNull
  public final AppCompatImageView ivShadow;

  @NonNull
  public final ConstraintLayout mainCardCtl;

  @NonNull
  public final RecyclerView rvAllPatientPastPrescription;

  @NonNull
  public final ConstraintLayout topCardCtl;

  @NonNull
  public final ConstraintLayout topHeaderCtl;

  @NonNull
  public final TextView tvHeader;

  @NonNull
  public final TextView tvPatientNameHeader;

  @NonNull
  public final ButtonLite uploadBtn;

  @NonNull
  public final ConstraintLayout uploadCtl;

  @NonNull
  public final View viewDragHandle;

  @Bindable
  protected PrescriptionViewModel mViewModel;

  @Bindable
  protected String mPatientId;

  @Bindable
  protected BottomSheetCloseCallback mBottomSheetCloseCallBAck;

  protected PastPrescriptionBottomsheetBinding(Object _bindingComponent, View _root,
      int _localFieldCount, AppCompatImageView bottomLine, ConstraintLayout clProgress,
      DropDownDefault dropDownDefault, DropDownHeader dropDownHeader, AppCompatImageView imageClose,
      AppCompatImageView ivShadow, ConstraintLayout mainCardCtl,
      RecyclerView rvAllPatientPastPrescription, ConstraintLayout topCardCtl,
      ConstraintLayout topHeaderCtl, TextView tvHeader, TextView tvPatientNameHeader,
      ButtonLite uploadBtn, ConstraintLayout uploadCtl, View viewDragHandle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.bottomLine = bottomLine;
    this.clProgress = clProgress;
    this.dropDownDefault = dropDownDefault;
    this.dropDownHeader = dropDownHeader;
    this.imageClose = imageClose;
    this.ivShadow = ivShadow;
    this.mainCardCtl = mainCardCtl;
    this.rvAllPatientPastPrescription = rvAllPatientPastPrescription;
    this.topCardCtl = topCardCtl;
    this.topHeaderCtl = topHeaderCtl;
    this.tvHeader = tvHeader;
    this.tvPatientNameHeader = tvPatientNameHeader;
    this.uploadBtn = uploadBtn;
    this.uploadCtl = uploadCtl;
    this.viewDragHandle = viewDragHandle;
  }

  public abstract void setViewModel(@Nullable PrescriptionViewModel viewModel);

  @Nullable
  public PrescriptionViewModel getViewModel() {
    return mViewModel;
  }

  public abstract void setPatientId(@Nullable String patientId);

  @Nullable
  public String getPatientId() {
    return mPatientId;
  }

  public abstract void setBottomSheetCloseCallBAck(
      @Nullable BottomSheetCloseCallback bottomSheetCloseCallBAck);

  @Nullable
  public BottomSheetCloseCallback getBottomSheetCloseCallBAck() {
    return mBottomSheetCloseCallBAck;
  }

  @NonNull
  public static PastPrescriptionBottomsheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.past_prescription_bottomsheet, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static PastPrescriptionBottomsheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<PastPrescriptionBottomsheetBinding>inflateInternal(inflater, R.layout.past_prescription_bottomsheet, root, attachToRoot, component);
  }

  @NonNull
  public static PastPrescriptionBottomsheetBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.past_prescription_bottomsheet, null, false, component)
   */
  @NonNull
  @Deprecated
  public static PastPrescriptionBottomsheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<PastPrescriptionBottomsheetBinding>inflateInternal(inflater, R.layout.past_prescription_bottomsheet, null, false, component);
  }

  public static PastPrescriptionBottomsheetBinding bind(@NonNull View view) {
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
  public static PastPrescriptionBottomsheetBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (PastPrescriptionBottomsheetBinding)bind(component, view, R.layout.past_prescription_bottomsheet);
  }
}
