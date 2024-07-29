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
import com.intellihealth.salt.views.cards.BlogCard;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.presentation.model.BlogCardModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class HealthArticlesItemBinding extends ViewDataBinding {
  @NonNull
  public final BlogCard heathArticleCard;

  @Bindable
  protected BlogCardModel mBlogCardModel;

  protected HealthArticlesItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      BlogCard heathArticleCard) {
    super(_bindingComponent, _root, _localFieldCount);
    this.heathArticleCard = heathArticleCard;
  }

  public abstract void setBlogCardModel(@Nullable BlogCardModel blogCardModel);

  @Nullable
  public BlogCardModel getBlogCardModel() {
    return mBlogCardModel;
  }

  @NonNull
  public static HealthArticlesItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.health_articles_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static HealthArticlesItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<HealthArticlesItemBinding>inflateInternal(inflater, R.layout.health_articles_item, root, attachToRoot, component);
  }

  @NonNull
  public static HealthArticlesItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.health_articles_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static HealthArticlesItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<HealthArticlesItemBinding>inflateInternal(inflater, R.layout.health_articles_item, null, false, component);
  }

  public static HealthArticlesItemBinding bind(@NonNull View view) {
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
  public static HealthArticlesItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (HealthArticlesItemBinding)bind(component, view, R.layout.health_articles_item);
  }
}