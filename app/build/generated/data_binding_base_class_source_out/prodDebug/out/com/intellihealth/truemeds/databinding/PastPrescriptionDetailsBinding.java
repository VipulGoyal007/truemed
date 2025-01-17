// Generated by data binding compiler. Do not edit!
package com.intellihealth.truemeds.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.intellihealth.salt.views.CheckFieldLayout;
import com.intellihealth.salt.views.TextView;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.data.model.prescription.ActiveRx;
import com.intellihealth.truemeds.presentation.viewmodel.PrescriptionViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class PastPrescriptionDetailsBinding extends ViewDataBinding {
  @NonNull
  public final CheckFieldLayout customCheckBox;

  @NonNull
  public final ConstraintLayout uploadPreascriptionDetailCard;

  @NonNull
  public final AppCompatImageView uploadPrescriptionImg;

  @NonNull
  public final CardView uploadPrescriptionImgCard;

  @NonNull
  public final TextView uploadedImageIdTxt;

  @NonNull
  public final TextView uploadedTxt;

  @Bindable
  protected PrescriptionViewModel mViewmodel;

  @Bindable
  protected ActiveRx mModel;

  @Bindable
  protected Integer mIndex;

  @Bindable
  protected Integer mChildIndex;

  protected PastPrescriptionDetailsBinding(Object _bindingComponent, View _root,
      int _localFieldCount, CheckFieldLayout customCheckBox,
      ConstraintLayout uploadPreascriptionDetailCard, AppCompatImageView uploadPrescriptionImg,
      CardView uploadPrescriptionImgCard, TextView uploadedImageIdTxt, TextView uploadedTxt) {
    super(_bindingComponent, _root, _localFieldCount);
    this.customCheckBox = customCheckBox;
    this.uploadPreascriptionDetailCard = uploadPreascriptionDetailCard;
    this.uploadPrescriptionImg = uploadPrescriptionImg;
    this.uploadPrescriptionImgCard = uploadPrescriptionImgCard;
    this.uploadedImageIdTxt = uploadedImageIdTxt;
    this.uploadedTxt = uploadedTxt;
  }

  public abstract void setViewmodel(@Nullable PrescriptionViewModel viewmodel);

  @Nullable
  public PrescriptionViewModel getViewmodel() {
    return mViewmodel;
  }

  public abstract void setModel(@Nullable ActiveRx model);

  @Nullable
  public ActiveRx getModel() {
    return mModel;
  }

  public abstract void setIndex(@Nullable Integer index);

  @Nullable
  public Integer getIndex() {
    return mIndex;
  }

  public abstract void setChildIndex(@Nullable Integer childIndex);

  @Nullable
  public Integer getChildIndex() {
    return mChildIndex;
  }

  @NonNull
  public static PastPrescriptionDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.past_prescription_details, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static PastPrescriptionDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<PastPrescriptionDetailsBinding>inflateInternal(inflater, R.layout.past_prescription_details, root, attachToRoot, component);
  }

  @NonNull
  public static PastPrescriptionDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.past_prescription_details, null, false, component)
   */
  @NonNull
  @Deprecated
  public static PastPrescriptionDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<PastPrescriptionDetailsBinding>inflateInternal(inflater, R.layout.past_prescription_details, null, false, component);
  }

  public static PastPrescriptionDetailsBinding bind(@NonNull View view) {
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
  public static PastPrescriptionDetailsBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (PastPrescriptionDetailsBinding)bind(component, view, R.layout.past_prescription_details);
  }
}
