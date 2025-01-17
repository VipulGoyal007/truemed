// Generated by data binding compiler. Do not edit!
package com.intellihealth.truemeds.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.intellihealth.salt.views.TextView;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.presentation.viewmodel.HealthArticlesViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class HealthArticleBottomsheetBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView healthArticleItemRv;

  @NonNull
  public final AppCompatImageView imageClose;

  @NonNull
  public final AppCompatImageView ivShadow;

  @NonNull
  public final TextView tvHeader;

  @NonNull
  public final View viewDragHandle;

  @Bindable
  protected HealthArticlesViewModel mHealthArticlesViewModel;

  protected HealthArticleBottomsheetBinding(Object _bindingComponent, View _root,
      int _localFieldCount, RecyclerView healthArticleItemRv, AppCompatImageView imageClose,
      AppCompatImageView ivShadow, TextView tvHeader, View viewDragHandle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.healthArticleItemRv = healthArticleItemRv;
    this.imageClose = imageClose;
    this.ivShadow = ivShadow;
    this.tvHeader = tvHeader;
    this.viewDragHandle = viewDragHandle;
  }

  public abstract void setHealthArticlesViewModel(
      @Nullable HealthArticlesViewModel healthArticlesViewModel);

  @Nullable
  public HealthArticlesViewModel getHealthArticlesViewModel() {
    return mHealthArticlesViewModel;
  }

  @NonNull
  public static HealthArticleBottomsheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.health_article_bottomsheet, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static HealthArticleBottomsheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<HealthArticleBottomsheetBinding>inflateInternal(inflater, R.layout.health_article_bottomsheet, root, attachToRoot, component);
  }

  @NonNull
  public static HealthArticleBottomsheetBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.health_article_bottomsheet, null, false, component)
   */
  @NonNull
  @Deprecated
  public static HealthArticleBottomsheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<HealthArticleBottomsheetBinding>inflateInternal(inflater, R.layout.health_article_bottomsheet, null, false, component);
  }

  public static HealthArticleBottomsheetBinding bind(@NonNull View view) {
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
  public static HealthArticleBottomsheetBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (HealthArticleBottomsheetBinding)bind(component, view, R.layout.health_article_bottomsheet);
  }
}
