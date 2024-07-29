// Generated by data binding compiler. Do not edit!
package com.intellihealth.truemeds.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.intellihealth.salt.models.HealthArticleChipCategoryData;
import com.intellihealth.salt.views.TextView;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.presentation.viewmodel.HealthArticlesViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class HealthArticleChipItemBinding extends ViewDataBinding {
  @NonNull
  public final TextView chipTitle;

  @Bindable
  protected HealthArticleChipCategoryData mItem;

  @Bindable
  protected HealthArticlesViewModel mHealthArticlesViewModel;

  protected HealthArticleChipItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView chipTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.chipTitle = chipTitle;
  }

  public abstract void setItem(@Nullable HealthArticleChipCategoryData item);

  @Nullable
  public HealthArticleChipCategoryData getItem() {
    return mItem;
  }

  public abstract void setHealthArticlesViewModel(
      @Nullable HealthArticlesViewModel healthArticlesViewModel);

  @Nullable
  public HealthArticlesViewModel getHealthArticlesViewModel() {
    return mHealthArticlesViewModel;
  }

  @NonNull
  public static HealthArticleChipItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.health_article_chip_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static HealthArticleChipItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<HealthArticleChipItemBinding>inflateInternal(inflater, R.layout.health_article_chip_item, root, attachToRoot, component);
  }

  @NonNull
  public static HealthArticleChipItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.health_article_chip_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static HealthArticleChipItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<HealthArticleChipItemBinding>inflateInternal(inflater, R.layout.health_article_chip_item, null, false, component);
  }

  public static HealthArticleChipItemBinding bind(@NonNull View view) {
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
  public static HealthArticleChipItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (HealthArticleChipItemBinding)bind(component, view, R.layout.health_article_chip_item);
  }
}