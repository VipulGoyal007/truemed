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
import com.intellihealth.salt.views.TextView;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.data.model.home.SuperCategoryModel;
import com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class SuperCategoryShopItemBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout clSuperMain;

  @NonNull
  public final AppCompatImageView ivSuperImg;

  @NonNull
  public final TextView tvTitle;

  @Bindable
  protected SuperCategoryModel mItem;

  @Bindable
  protected Integer mPosition;

  @Bindable
  protected HomeViewModel mViewModel;

  protected SuperCategoryShopItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout clSuperMain, AppCompatImageView ivSuperImg, TextView tvTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.clSuperMain = clSuperMain;
    this.ivSuperImg = ivSuperImg;
    this.tvTitle = tvTitle;
  }

  public abstract void setItem(@Nullable SuperCategoryModel item);

  @Nullable
  public SuperCategoryModel getItem() {
    return mItem;
  }

  public abstract void setPosition(@Nullable Integer position);

  @Nullable
  public Integer getPosition() {
    return mPosition;
  }

  public abstract void setViewModel(@Nullable HomeViewModel viewModel);

  @Nullable
  public HomeViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static SuperCategoryShopItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.super_category_shop_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static SuperCategoryShopItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<SuperCategoryShopItemBinding>inflateInternal(inflater, R.layout.super_category_shop_item, root, attachToRoot, component);
  }

  @NonNull
  public static SuperCategoryShopItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.super_category_shop_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static SuperCategoryShopItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<SuperCategoryShopItemBinding>inflateInternal(inflater, R.layout.super_category_shop_item, null, false, component);
  }

  public static SuperCategoryShopItemBinding bind(@NonNull View view) {
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
  public static SuperCategoryShopItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (SuperCategoryShopItemBinding)bind(component, view, R.layout.super_category_shop_item);
  }
}
