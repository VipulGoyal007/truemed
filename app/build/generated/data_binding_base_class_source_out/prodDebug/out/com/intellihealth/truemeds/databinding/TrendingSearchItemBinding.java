// Generated by data binding compiler. Do not edit!
package com.intellihealth.truemeds.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.data.model.KeyValuePair;
import com.intellihealth.truemeds.presentation.viewmodel.SearchViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class TrendingSearchItemBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatTextView text;

  @Bindable
  protected KeyValuePair mItem;

  @Bindable
  protected SearchViewModel mViewmodel;

  @Bindable
  protected Integer mIndex;

  protected TrendingSearchItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatTextView text) {
    super(_bindingComponent, _root, _localFieldCount);
    this.text = text;
  }

  public abstract void setItem(@Nullable KeyValuePair item);

  @Nullable
  public KeyValuePair getItem() {
    return mItem;
  }

  public abstract void setViewmodel(@Nullable SearchViewModel viewmodel);

  @Nullable
  public SearchViewModel getViewmodel() {
    return mViewmodel;
  }

  public abstract void setIndex(@Nullable Integer index);

  @Nullable
  public Integer getIndex() {
    return mIndex;
  }

  @NonNull
  public static TrendingSearchItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.trending_search_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static TrendingSearchItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<TrendingSearchItemBinding>inflateInternal(inflater, R.layout.trending_search_item, root, attachToRoot, component);
  }

  @NonNull
  public static TrendingSearchItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.trending_search_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static TrendingSearchItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<TrendingSearchItemBinding>inflateInternal(inflater, R.layout.trending_search_item, null, false, component);
  }

  public static TrendingSearchItemBinding bind(@NonNull View view) {
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
  public static TrendingSearchItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (TrendingSearchItemBinding)bind(component, view, R.layout.trending_search_item);
  }
}
