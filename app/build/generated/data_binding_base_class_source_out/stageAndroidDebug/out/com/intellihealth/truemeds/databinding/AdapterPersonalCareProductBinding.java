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
import com.intellihealth.salt.callbacks.ProductCardCallback;
import com.intellihealth.salt.models.ProductInfoModel;
import com.intellihealth.salt.views.cards.ProductCard;
import com.intellihealth.truemeds.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class AdapterPersonalCareProductBinding extends ViewDataBinding {
  @NonNull
  public final ProductCard productCard;

  @Bindable
  protected ProductCardCallback mProductCardCallback;

  @Bindable
  protected ProductInfoModel mData;

  protected AdapterPersonalCareProductBinding(Object _bindingComponent, View _root,
      int _localFieldCount, ProductCard productCard) {
    super(_bindingComponent, _root, _localFieldCount);
    this.productCard = productCard;
  }

  public abstract void setProductCardCallback(@Nullable ProductCardCallback productCardCallback);

  @Nullable
  public ProductCardCallback getProductCardCallback() {
    return mProductCardCallback;
  }

  public abstract void setData(@Nullable ProductInfoModel data);

  @Nullable
  public ProductInfoModel getData() {
    return mData;
  }

  @NonNull
  public static AdapterPersonalCareProductBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.adapter_personal_care_product, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static AdapterPersonalCareProductBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<AdapterPersonalCareProductBinding>inflateInternal(inflater, R.layout.adapter_personal_care_product, root, attachToRoot, component);
  }

  @NonNull
  public static AdapterPersonalCareProductBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.adapter_personal_care_product, null, false, component)
   */
  @NonNull
  @Deprecated
  public static AdapterPersonalCareProductBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<AdapterPersonalCareProductBinding>inflateInternal(inflater, R.layout.adapter_personal_care_product, null, false, component);
  }

  public static AdapterPersonalCareProductBinding bind(@NonNull View view) {
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
  public static AdapterPersonalCareProductBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (AdapterPersonalCareProductBinding)bind(component, view, R.layout.adapter_personal_care_product);
  }
}