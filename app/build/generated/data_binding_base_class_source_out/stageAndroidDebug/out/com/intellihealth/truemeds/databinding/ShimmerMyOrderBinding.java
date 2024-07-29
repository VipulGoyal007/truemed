// Generated by data binding compiler. Do not edit!
package com.intellihealth.truemeds.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.intellihealth.truemeds.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ShimmerMyOrderBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatImageView ivTopTube;

  @NonNull
  public final AppCompatImageView ivTopTube2;

  @NonNull
  public final AppCompatImageView ivTopTube3;

  protected ShimmerMyOrderBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatImageView ivTopTube, AppCompatImageView ivTopTube2, AppCompatImageView ivTopTube3) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ivTopTube = ivTopTube;
    this.ivTopTube2 = ivTopTube2;
    this.ivTopTube3 = ivTopTube3;
  }

  @NonNull
  public static ShimmerMyOrderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.shimmer_my_order, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ShimmerMyOrderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ShimmerMyOrderBinding>inflateInternal(inflater, R.layout.shimmer_my_order, root, attachToRoot, component);
  }

  @NonNull
  public static ShimmerMyOrderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.shimmer_my_order, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ShimmerMyOrderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ShimmerMyOrderBinding>inflateInternal(inflater, R.layout.shimmer_my_order, null, false, component);
  }

  public static ShimmerMyOrderBinding bind(@NonNull View view) {
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
  public static ShimmerMyOrderBinding bind(@NonNull View view, @Nullable Object component) {
    return (ShimmerMyOrderBinding)bind(component, view, R.layout.shimmer_my_order);
  }
}
