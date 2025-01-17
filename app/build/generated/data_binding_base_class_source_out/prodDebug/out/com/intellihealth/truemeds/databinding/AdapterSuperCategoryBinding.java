// Generated by data binding compiler. Do not edit!
package com.intellihealth.truemeds.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.intellihealth.salt.views.TextView;
import com.intellihealth.salt.views.buttons.Button;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.data.model.home.ChildCategoryModel;
import com.intellihealth.truemeds.data.model.home.SuperCategoryModel;
import com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel;
import java.lang.Deprecated;
import java.lang.Object;
import java.util.List;

public abstract class AdapterSuperCategoryBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout bothRecyclerview;

  @NonNull
  public final Button btnViewAll;

  @NonNull
  public final ConstraintLayout clCategoryMain;

  @NonNull
  public final ConstraintLayout llCategory;

  @NonNull
  public final RecyclerView rvCategory;

  @NonNull
  public final RecyclerView rvSuperCategory;

  @NonNull
  public final TextView tvTextShopByCategories;

  @Bindable
  protected Integer mPosition;

  @Bindable
  protected HomeViewModel mViewModel;

  @Bindable
  protected List<SuperCategoryModel> mSuperCategoryList;

  @Bindable
  protected List<ChildCategoryModel> mCategoryLevel2List;

  @Bindable
  protected String mSuperCategory;

  protected AdapterSuperCategoryBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout bothRecyclerview, Button btnViewAll, ConstraintLayout clCategoryMain,
      ConstraintLayout llCategory, RecyclerView rvCategory, RecyclerView rvSuperCategory,
      TextView tvTextShopByCategories) {
    super(_bindingComponent, _root, _localFieldCount);
    this.bothRecyclerview = bothRecyclerview;
    this.btnViewAll = btnViewAll;
    this.clCategoryMain = clCategoryMain;
    this.llCategory = llCategory;
    this.rvCategory = rvCategory;
    this.rvSuperCategory = rvSuperCategory;
    this.tvTextShopByCategories = tvTextShopByCategories;
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

  public abstract void setSuperCategoryList(@Nullable List<SuperCategoryModel> superCategoryList);

  @Nullable
  public List<SuperCategoryModel> getSuperCategoryList() {
    return mSuperCategoryList;
  }

  public abstract void setCategoryLevel2List(@Nullable List<ChildCategoryModel> categoryLevel2List);

  @Nullable
  public List<ChildCategoryModel> getCategoryLevel2List() {
    return mCategoryLevel2List;
  }

  public abstract void setSuperCategory(@Nullable String superCategory);

  @Nullable
  public String getSuperCategory() {
    return mSuperCategory;
  }

  @NonNull
  public static AdapterSuperCategoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.adapter_super_category, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static AdapterSuperCategoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<AdapterSuperCategoryBinding>inflateInternal(inflater, R.layout.adapter_super_category, root, attachToRoot, component);
  }

  @NonNull
  public static AdapterSuperCategoryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.adapter_super_category, null, false, component)
   */
  @NonNull
  @Deprecated
  public static AdapterSuperCategoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<AdapterSuperCategoryBinding>inflateInternal(inflater, R.layout.adapter_super_category, null, false, component);
  }

  public static AdapterSuperCategoryBinding bind(@NonNull View view) {
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
  public static AdapterSuperCategoryBinding bind(@NonNull View view, @Nullable Object component) {
    return (AdapterSuperCategoryBinding)bind(component, view, R.layout.adapter_super_category);
  }
}
