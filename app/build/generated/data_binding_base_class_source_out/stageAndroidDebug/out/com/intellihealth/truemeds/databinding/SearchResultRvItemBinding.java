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
import com.intellihealth.salt.models.ProductInfoModel;
import com.intellihealth.salt.views.cards.FullWidthProductCard;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.data.model.SearchResult;
import com.intellihealth.truemeds.presentation.viewmodel.SearchViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class SearchResultRvItemBinding extends ViewDataBinding {
  @NonNull
  public final FullWidthProductCard fwcSRP;

  @Bindable
  protected SearchResult mItem;

  @Bindable
  protected SearchViewModel mViewmodel;

  @Bindable
  protected Integer mIndex;

  @Bindable
  protected ProductInfoModel mProductInfoModel;

  protected SearchResultRvItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      FullWidthProductCard fwcSRP) {
    super(_bindingComponent, _root, _localFieldCount);
    this.fwcSRP = fwcSRP;
  }

  public abstract void setItem(@Nullable SearchResult item);

  @Nullable
  public SearchResult getItem() {
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

  public abstract void setProductInfoModel(@Nullable ProductInfoModel productInfoModel);

  @Nullable
  public ProductInfoModel getProductInfoModel() {
    return mProductInfoModel;
  }

  @NonNull
  public static SearchResultRvItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.search_result_rv_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static SearchResultRvItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<SearchResultRvItemBinding>inflateInternal(inflater, R.layout.search_result_rv_item, root, attachToRoot, component);
  }

  @NonNull
  public static SearchResultRvItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.search_result_rv_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static SearchResultRvItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<SearchResultRvItemBinding>inflateInternal(inflater, R.layout.search_result_rv_item, null, false, component);
  }

  public static SearchResultRvItemBinding bind(@NonNull View view) {
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
  public static SearchResultRvItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (SearchResultRvItemBinding)bind(component, view, R.layout.search_result_rv_item);
  }
}
