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

public abstract class BottomsheetReplaceAllCompanyItemBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout clRoot;

  @NonNull
  public final AppCompatImageView ivProduct;

  @Bindable
  protected String mImgUrl;

  protected BottomsheetReplaceAllCompanyItemBinding(Object _bindingComponent, View _root,
      int _localFieldCount, ConstraintLayout clRoot, AppCompatImageView ivProduct) {
    super(_bindingComponent, _root, _localFieldCount);
    this.clRoot = clRoot;
    this.ivProduct = ivProduct;
  }

  public abstract void setImgUrl(@Nullable String imgUrl);

  @Nullable
  public String getImgUrl() {
    return mImgUrl;
  }

  @NonNull
  public static BottomsheetReplaceAllCompanyItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.bottomsheet_replace_all_company_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static BottomsheetReplaceAllCompanyItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<BottomsheetReplaceAllCompanyItemBinding>inflateInternal(inflater, R.layout.bottomsheet_replace_all_company_item, root, attachToRoot, component);
  }

  @NonNull
  public static BottomsheetReplaceAllCompanyItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.bottomsheet_replace_all_company_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static BottomsheetReplaceAllCompanyItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<BottomsheetReplaceAllCompanyItemBinding>inflateInternal(inflater, R.layout.bottomsheet_replace_all_company_item, null, false, component);
  }

  public static BottomsheetReplaceAllCompanyItemBinding bind(@NonNull View view) {
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
  public static BottomsheetReplaceAllCompanyItemBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (BottomsheetReplaceAllCompanyItemBinding)bind(component, view, R.layout.bottomsheet_replace_all_company_item);
  }
}