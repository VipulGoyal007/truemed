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
import com.google.android.material.card.MaterialCardView;
import com.intellihealth.salt.models.ProductComparisonModel;
import com.intellihealth.salt.views.TextView;
import com.intellihealth.truemeds.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class BottomsheetCompareAndUnderstandBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout clBoby;

  @NonNull
  public final ConstraintLayout clHeader;

  @NonNull
  public final ConstraintLayout clOGProduct;

  @NonNull
  public final MaterialCardView clOGProductCard;

  @NonNull
  public final MaterialCardView clOGProductCard2;

  @NonNull
  public final ConstraintLayout clSub;

  @NonNull
  public final ConstraintLayout clSubProduct;

  @NonNull
  public final AppCompatImageView imageClose;

  @NonNull
  public final AppCompatImageView ivMatch;

  @NonNull
  public final AppCompatImageView ivOg;

  @NonNull
  public final AppCompatImageView ivSub;

  @NonNull
  public final AppCompatImageView ivSubTag;

  @NonNull
  public final TextView tvHeader;

  @NonNull
  public final TextView tvOgApproval;

  @NonNull
  public final TextView tvOgManufacturer;

  @NonNull
  public final TextView tvOgPriceMRP;

  @NonNull
  public final TextView tvOgPricePerUnit;

  @NonNull
  public final TextView tvOgProductContain;

  @NonNull
  public final TextView tvOgProductName;

  @NonNull
  public final TextView tvSubApproval;

  @NonNull
  public final TextView tvSubDiscount;

  @NonNull
  public final TextView tvSubManufacturer;

  @NonNull
  public final TextView tvSubPricePerUnit;

  @NonNull
  public final TextView tvSubProductContain;

  @NonNull
  public final TextView tvSubProductName;

  @NonNull
  public final TextView tvSubTag;

  @NonNull
  public final View vOgApproval;

  @NonNull
  public final View vOgManufacture;

  @NonNull
  public final View vOgProductContain;

  @NonNull
  public final View vOgProductName;

  @NonNull
  public final View vSubApproval;

  @NonNull
  public final View vSubManufacture;

  @NonNull
  public final View vSubProductContain;

  @NonNull
  public final View vSubProductName;

  @Bindable
  protected ProductComparisonModel mProductComparisonData;

  protected BottomsheetCompareAndUnderstandBinding(Object _bindingComponent, View _root,
      int _localFieldCount, ConstraintLayout clBoby, ConstraintLayout clHeader,
      ConstraintLayout clOGProduct, MaterialCardView clOGProductCard,
      MaterialCardView clOGProductCard2, ConstraintLayout clSub, ConstraintLayout clSubProduct,
      AppCompatImageView imageClose, AppCompatImageView ivMatch, AppCompatImageView ivOg,
      AppCompatImageView ivSub, AppCompatImageView ivSubTag, TextView tvHeader,
      TextView tvOgApproval, TextView tvOgManufacturer, TextView tvOgPriceMRP,
      TextView tvOgPricePerUnit, TextView tvOgProductContain, TextView tvOgProductName,
      TextView tvSubApproval, TextView tvSubDiscount, TextView tvSubManufacturer,
      TextView tvSubPricePerUnit, TextView tvSubProductContain, TextView tvSubProductName,
      TextView tvSubTag, View vOgApproval, View vOgManufacture, View vOgProductContain,
      View vOgProductName, View vSubApproval, View vSubManufacture, View vSubProductContain,
      View vSubProductName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.clBoby = clBoby;
    this.clHeader = clHeader;
    this.clOGProduct = clOGProduct;
    this.clOGProductCard = clOGProductCard;
    this.clOGProductCard2 = clOGProductCard2;
    this.clSub = clSub;
    this.clSubProduct = clSubProduct;
    this.imageClose = imageClose;
    this.ivMatch = ivMatch;
    this.ivOg = ivOg;
    this.ivSub = ivSub;
    this.ivSubTag = ivSubTag;
    this.tvHeader = tvHeader;
    this.tvOgApproval = tvOgApproval;
    this.tvOgManufacturer = tvOgManufacturer;
    this.tvOgPriceMRP = tvOgPriceMRP;
    this.tvOgPricePerUnit = tvOgPricePerUnit;
    this.tvOgProductContain = tvOgProductContain;
    this.tvOgProductName = tvOgProductName;
    this.tvSubApproval = tvSubApproval;
    this.tvSubDiscount = tvSubDiscount;
    this.tvSubManufacturer = tvSubManufacturer;
    this.tvSubPricePerUnit = tvSubPricePerUnit;
    this.tvSubProductContain = tvSubProductContain;
    this.tvSubProductName = tvSubProductName;
    this.tvSubTag = tvSubTag;
    this.vOgApproval = vOgApproval;
    this.vOgManufacture = vOgManufacture;
    this.vOgProductContain = vOgProductContain;
    this.vOgProductName = vOgProductName;
    this.vSubApproval = vSubApproval;
    this.vSubManufacture = vSubManufacture;
    this.vSubProductContain = vSubProductContain;
    this.vSubProductName = vSubProductName;
  }

  public abstract void setProductComparisonData(
      @Nullable ProductComparisonModel productComparisonData);

  @Nullable
  public ProductComparisonModel getProductComparisonData() {
    return mProductComparisonData;
  }

  @NonNull
  public static BottomsheetCompareAndUnderstandBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.bottomsheet_compare_and_understand, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static BottomsheetCompareAndUnderstandBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<BottomsheetCompareAndUnderstandBinding>inflateInternal(inflater, R.layout.bottomsheet_compare_and_understand, root, attachToRoot, component);
  }

  @NonNull
  public static BottomsheetCompareAndUnderstandBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.bottomsheet_compare_and_understand, null, false, component)
   */
  @NonNull
  @Deprecated
  public static BottomsheetCompareAndUnderstandBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<BottomsheetCompareAndUnderstandBinding>inflateInternal(inflater, R.layout.bottomsheet_compare_and_understand, null, false, component);
  }

  public static BottomsheetCompareAndUnderstandBinding bind(@NonNull View view) {
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
  public static BottomsheetCompareAndUnderstandBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (BottomsheetCompareAndUnderstandBinding)bind(component, view, R.layout.bottomsheet_compare_and_understand);
  }
}
