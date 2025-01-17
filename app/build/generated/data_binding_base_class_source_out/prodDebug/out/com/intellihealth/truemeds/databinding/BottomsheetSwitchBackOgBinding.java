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
import com.intellihealth.salt.views.TextView;
import com.intellihealth.salt.views.buttons.Button;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.presentation.model.ProductInfoModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class BottomsheetSwitchBackOgBinding extends ViewDataBinding {
  @NonNull
  public final Button btnIntersect;

  @NonNull
  public final Button btnOkay;

  @NonNull
  public final Button btnSwitchBackOg;

  @NonNull
  public final ConstraintLayout clBody;

  @NonNull
  public final ConstraintLayout clMain;

  @NonNull
  public final ConstraintLayout clProduct;

  @NonNull
  public final ConstraintLayout clRoot;

  @NonNull
  public final ConstraintLayout clSuggestion;

  @NonNull
  public final ConstraintLayout clSuggestionUnit;

  @NonNull
  public final ConstraintLayout clTopHeader;

  @NonNull
  public final AppCompatImageView ivClose;

  @NonNull
  public final AppCompatImageView ivCoin;

  @NonNull
  public final AppCompatImageView ivProduct;

  @NonNull
  public final AppCompatImageView ivSuggestion;

  @NonNull
  public final MaterialCardView mcProduct;

  @NonNull
  public final MaterialCardView mcSuggestion;

  @NonNull
  public final TextView tvHeader;

  @NonNull
  public final TextView tvProductManufacturer;

  @NonNull
  public final TextView tvProductName;

  @NonNull
  public final TextView tvProductPricePerUnits;

  @NonNull
  public final TextView tvProductQty;

  @NonNull
  public final TextView tvProductSellingPrice;

  @NonNull
  public final TextView tvProductUnit;

  @NonNull
  public final TextView tvSubHeader;

  @NonNull
  public final TextView tvSuggestionManufacturer;

  @NonNull
  public final TextView tvSuggestionName;

  @NonNull
  public final TextView tvSuggestionPricePerUnits;

  @NonNull
  public final TextView tvSuggestionQty;

  @NonNull
  public final TextView tvSuggestionSellingPrice;

  @NonNull
  public final TextView tvSuggestionUnit;

  @NonNull
  public final TextView txtInCart;

  @Bindable
  protected ProductInfoModel mProductInfoModel;

  @Bindable
  protected String mSavingPercent;

  protected BottomsheetSwitchBackOgBinding(Object _bindingComponent, View _root,
      int _localFieldCount, Button btnIntersect, Button btnOkay, Button btnSwitchBackOg,
      ConstraintLayout clBody, ConstraintLayout clMain, ConstraintLayout clProduct,
      ConstraintLayout clRoot, ConstraintLayout clSuggestion, ConstraintLayout clSuggestionUnit,
      ConstraintLayout clTopHeader, AppCompatImageView ivClose, AppCompatImageView ivCoin,
      AppCompatImageView ivProduct, AppCompatImageView ivSuggestion, MaterialCardView mcProduct,
      MaterialCardView mcSuggestion, TextView tvHeader, TextView tvProductManufacturer,
      TextView tvProductName, TextView tvProductPricePerUnits, TextView tvProductQty,
      TextView tvProductSellingPrice, TextView tvProductUnit, TextView tvSubHeader,
      TextView tvSuggestionManufacturer, TextView tvSuggestionName,
      TextView tvSuggestionPricePerUnits, TextView tvSuggestionQty,
      TextView tvSuggestionSellingPrice, TextView tvSuggestionUnit, TextView txtInCart) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnIntersect = btnIntersect;
    this.btnOkay = btnOkay;
    this.btnSwitchBackOg = btnSwitchBackOg;
    this.clBody = clBody;
    this.clMain = clMain;
    this.clProduct = clProduct;
    this.clRoot = clRoot;
    this.clSuggestion = clSuggestion;
    this.clSuggestionUnit = clSuggestionUnit;
    this.clTopHeader = clTopHeader;
    this.ivClose = ivClose;
    this.ivCoin = ivCoin;
    this.ivProduct = ivProduct;
    this.ivSuggestion = ivSuggestion;
    this.mcProduct = mcProduct;
    this.mcSuggestion = mcSuggestion;
    this.tvHeader = tvHeader;
    this.tvProductManufacturer = tvProductManufacturer;
    this.tvProductName = tvProductName;
    this.tvProductPricePerUnits = tvProductPricePerUnits;
    this.tvProductQty = tvProductQty;
    this.tvProductSellingPrice = tvProductSellingPrice;
    this.tvProductUnit = tvProductUnit;
    this.tvSubHeader = tvSubHeader;
    this.tvSuggestionManufacturer = tvSuggestionManufacturer;
    this.tvSuggestionName = tvSuggestionName;
    this.tvSuggestionPricePerUnits = tvSuggestionPricePerUnits;
    this.tvSuggestionQty = tvSuggestionQty;
    this.tvSuggestionSellingPrice = tvSuggestionSellingPrice;
    this.tvSuggestionUnit = tvSuggestionUnit;
    this.txtInCart = txtInCart;
  }

  public abstract void setProductInfoModel(@Nullable ProductInfoModel productInfoModel);

  @Nullable
  public ProductInfoModel getProductInfoModel() {
    return mProductInfoModel;
  }

  public abstract void setSavingPercent(@Nullable String savingPercent);

  @Nullable
  public String getSavingPercent() {
    return mSavingPercent;
  }

  @NonNull
  public static BottomsheetSwitchBackOgBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.bottomsheet_switch_back_og, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static BottomsheetSwitchBackOgBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<BottomsheetSwitchBackOgBinding>inflateInternal(inflater, R.layout.bottomsheet_switch_back_og, root, attachToRoot, component);
  }

  @NonNull
  public static BottomsheetSwitchBackOgBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.bottomsheet_switch_back_og, null, false, component)
   */
  @NonNull
  @Deprecated
  public static BottomsheetSwitchBackOgBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<BottomsheetSwitchBackOgBinding>inflateInternal(inflater, R.layout.bottomsheet_switch_back_og, null, false, component);
  }

  public static BottomsheetSwitchBackOgBinding bind(@NonNull View view) {
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
  public static BottomsheetSwitchBackOgBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (BottomsheetSwitchBackOgBinding)bind(component, view, R.layout.bottomsheet_switch_back_og);
  }
}
