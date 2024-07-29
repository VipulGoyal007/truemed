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
import com.intellihealth.salt.views.HelpCategories;
import com.intellihealth.salt.views.TextView;
import com.intellihealth.salt.views.cards.Divider;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.data.model.helpfaqtnc.HelpCategoryResponse;
import com.intellihealth.truemeds.presentation.viewmodel.HelpViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class HelpCategoryItemBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout clFilter;

  @NonNull
  public final ConstraintLayout clFilterHelpCategoryCard;

  @NonNull
  public final ConstraintLayout constraitMain;

  @NonNull
  public final View dividerHelpCategoryCard;

  @NonNull
  public final HelpCategories helpCategoryCard;

  @NonNull
  public final AppCompatImageView ivNextArrow;

  @NonNull
  public final Divider tmDivider1;

  @NonNull
  public final TextView tvSubCategoryTitle;

  @Bindable
  protected HelpViewModel mViewModel;

  @Bindable
  protected Integer mItemPosition;

  @Bindable
  protected HelpCategoryResponse.CategoryList mCategory;

  protected HelpCategoryItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout clFilter, ConstraintLayout clFilterHelpCategoryCard,
      ConstraintLayout constraitMain, View dividerHelpCategoryCard, HelpCategories helpCategoryCard,
      AppCompatImageView ivNextArrow, Divider tmDivider1, TextView tvSubCategoryTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.clFilter = clFilter;
    this.clFilterHelpCategoryCard = clFilterHelpCategoryCard;
    this.constraitMain = constraitMain;
    this.dividerHelpCategoryCard = dividerHelpCategoryCard;
    this.helpCategoryCard = helpCategoryCard;
    this.ivNextArrow = ivNextArrow;
    this.tmDivider1 = tmDivider1;
    this.tvSubCategoryTitle = tvSubCategoryTitle;
  }

  public abstract void setViewModel(@Nullable HelpViewModel viewModel);

  @Nullable
  public HelpViewModel getViewModel() {
    return mViewModel;
  }

  public abstract void setItemPosition(@Nullable Integer itemPosition);

  @Nullable
  public Integer getItemPosition() {
    return mItemPosition;
  }

  public abstract void setCategory(@Nullable HelpCategoryResponse.CategoryList category);

  @Nullable
  public HelpCategoryResponse.CategoryList getCategory() {
    return mCategory;
  }

  @NonNull
  public static HelpCategoryItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.help_category_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static HelpCategoryItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<HelpCategoryItemBinding>inflateInternal(inflater, R.layout.help_category_item, root, attachToRoot, component);
  }

  @NonNull
  public static HelpCategoryItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.help_category_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static HelpCategoryItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<HelpCategoryItemBinding>inflateInternal(inflater, R.layout.help_category_item, null, false, component);
  }

  public static HelpCategoryItemBinding bind(@NonNull View view) {
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
  public static HelpCategoryItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (HelpCategoryItemBinding)bind(component, view, R.layout.help_category_item);
  }
}
