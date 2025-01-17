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
import com.intellihealth.salt.views.buttons.Button;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.presentation.viewmodel.MyOrderViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class BottomsheetFilterBinding extends ViewDataBinding {
  @NonNull
  public final Button btnApply;

  @NonNull
  public final Button btnClear;

  @NonNull
  public final ConstraintLayout clApply;

  @NonNull
  public final ConstraintLayout clButtonView;

  @NonNull
  public final ConstraintLayout clClear;

  @NonNull
  public final ConstraintLayout clSelectType;

  @NonNull
  public final ConstraintLayout clShowList;

  @NonNull
  public final View divider;

  @NonNull
  public final AppCompatImageView divider2;

  @NonNull
  public final ConstraintLayout entireListingView;

  @NonNull
  public final ConstraintLayout helpTopHeader;

  @NonNull
  public final AppCompatImageView ivClose;

  @NonNull
  public final RecyclerView rvBrandsList;

  @NonNull
  public final RecyclerView rvCategoryList;

  @NonNull
  public final RecyclerView rvSubCategoryList;

  @NonNull
  public final TextView tvBrands;

  @NonNull
  public final TextView tvCategory;

  @NonNull
  public final TextView tvSubCategory;

  @NonNull
  public final TextView tvSubCategoryTitle;

  @Bindable
  protected MyOrderViewModel mViewModel;

  protected BottomsheetFilterBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button btnApply, Button btnClear, ConstraintLayout clApply, ConstraintLayout clButtonView,
      ConstraintLayout clClear, ConstraintLayout clSelectType, ConstraintLayout clShowList,
      View divider, AppCompatImageView divider2, ConstraintLayout entireListingView,
      ConstraintLayout helpTopHeader, AppCompatImageView ivClose, RecyclerView rvBrandsList,
      RecyclerView rvCategoryList, RecyclerView rvSubCategoryList, TextView tvBrands,
      TextView tvCategory, TextView tvSubCategory, TextView tvSubCategoryTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnApply = btnApply;
    this.btnClear = btnClear;
    this.clApply = clApply;
    this.clButtonView = clButtonView;
    this.clClear = clClear;
    this.clSelectType = clSelectType;
    this.clShowList = clShowList;
    this.divider = divider;
    this.divider2 = divider2;
    this.entireListingView = entireListingView;
    this.helpTopHeader = helpTopHeader;
    this.ivClose = ivClose;
    this.rvBrandsList = rvBrandsList;
    this.rvCategoryList = rvCategoryList;
    this.rvSubCategoryList = rvSubCategoryList;
    this.tvBrands = tvBrands;
    this.tvCategory = tvCategory;
    this.tvSubCategory = tvSubCategory;
    this.tvSubCategoryTitle = tvSubCategoryTitle;
  }

  public abstract void setViewModel(@Nullable MyOrderViewModel viewModel);

  @Nullable
  public MyOrderViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static BottomsheetFilterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.bottomsheet_filter, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static BottomsheetFilterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<BottomsheetFilterBinding>inflateInternal(inflater, R.layout.bottomsheet_filter, root, attachToRoot, component);
  }

  @NonNull
  public static BottomsheetFilterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.bottomsheet_filter, null, false, component)
   */
  @NonNull
  @Deprecated
  public static BottomsheetFilterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<BottomsheetFilterBinding>inflateInternal(inflater, R.layout.bottomsheet_filter, null, false, component);
  }

  public static BottomsheetFilterBinding bind(@NonNull View view) {
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
  public static BottomsheetFilterBinding bind(@NonNull View view, @Nullable Object component) {
    return (BottomsheetFilterBinding)bind(component, view, R.layout.bottomsheet_filter);
  }
}
