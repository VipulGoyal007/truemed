// Generated by data binding compiler. Do not edit!
package com.intellihealth.truemeds.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.intellihealth.salt.models.ProductInfoModel;
import com.intellihealth.salt.views.TextView;
import com.intellihealth.salt.views.cards.FullWidthProductCard;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.presentation.viewmodel.ProductDetailViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentOrgSubCompareBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatImageView closeBottomSheet;

  @NonNull
  public final ConstraintLayout headerLayout;

  @NonNull
  public final AppCompatImageView ivTriangleView;

  @NonNull
  public final FullWidthProductCard orgCard;

  @NonNull
  public final TextView orgTitle;

  @NonNull
  public final NestedScrollView scroll;

  @NonNull
  public final FullWidthProductCard subsCard;

  @NonNull
  public final AppCompatImageView subsIcon;

  @NonNull
  public final TextView subsTitle;

  @NonNull
  public final TextView tvTitle;

  @Bindable
  protected ProductDetailViewModel mViewModel;

  @Bindable
  protected ProductInfoModel mOrgModel;

  @Bindable
  protected ProductInfoModel mSubsModel;

  protected FragmentOrgSubCompareBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatImageView closeBottomSheet, ConstraintLayout headerLayout,
      AppCompatImageView ivTriangleView, FullWidthProductCard orgCard, TextView orgTitle,
      NestedScrollView scroll, FullWidthProductCard subsCard, AppCompatImageView subsIcon,
      TextView subsTitle, TextView tvTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.closeBottomSheet = closeBottomSheet;
    this.headerLayout = headerLayout;
    this.ivTriangleView = ivTriangleView;
    this.orgCard = orgCard;
    this.orgTitle = orgTitle;
    this.scroll = scroll;
    this.subsCard = subsCard;
    this.subsIcon = subsIcon;
    this.subsTitle = subsTitle;
    this.tvTitle = tvTitle;
  }

  public abstract void setViewModel(@Nullable ProductDetailViewModel viewModel);

  @Nullable
  public ProductDetailViewModel getViewModel() {
    return mViewModel;
  }

  public abstract void setOrgModel(@Nullable ProductInfoModel orgModel);

  @Nullable
  public ProductInfoModel getOrgModel() {
    return mOrgModel;
  }

  public abstract void setSubsModel(@Nullable ProductInfoModel subsModel);

  @Nullable
  public ProductInfoModel getSubsModel() {
    return mSubsModel;
  }

  @NonNull
  public static FragmentOrgSubCompareBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_org_sub_compare, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentOrgSubCompareBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentOrgSubCompareBinding>inflateInternal(inflater, R.layout.fragment_org_sub_compare, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentOrgSubCompareBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_org_sub_compare, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentOrgSubCompareBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentOrgSubCompareBinding>inflateInternal(inflater, R.layout.fragment_org_sub_compare, null, false, component);
  }

  public static FragmentOrgSubCompareBinding bind(@NonNull View view) {
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
  public static FragmentOrgSubCompareBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentOrgSubCompareBinding)bind(component, view, R.layout.fragment_org_sub_compare);
  }
}