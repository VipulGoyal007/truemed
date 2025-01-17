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

public abstract class ShimmerCompareBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatImageView ivTopTube1;

  @NonNull
  public final AppCompatImageView ivTopTube2;

  @NonNull
  public final AppCompatImageView ivTopTube3;

  @NonNull
  public final AppCompatImageView ivTopTube4;

  @NonNull
  public final AppCompatImageView startBox;

  @NonNull
  public final AppCompatImageView startBox2;

  protected ShimmerCompareBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatImageView ivTopTube1, AppCompatImageView ivTopTube2, AppCompatImageView ivTopTube3,
      AppCompatImageView ivTopTube4, AppCompatImageView startBox, AppCompatImageView startBox2) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ivTopTube1 = ivTopTube1;
    this.ivTopTube2 = ivTopTube2;
    this.ivTopTube3 = ivTopTube3;
    this.ivTopTube4 = ivTopTube4;
    this.startBox = startBox;
    this.startBox2 = startBox2;
  }

  @NonNull
  public static ShimmerCompareBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.shimmer_compare, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ShimmerCompareBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ShimmerCompareBinding>inflateInternal(inflater, R.layout.shimmer_compare, root, attachToRoot, component);
  }

  @NonNull
  public static ShimmerCompareBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.shimmer_compare, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ShimmerCompareBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ShimmerCompareBinding>inflateInternal(inflater, R.layout.shimmer_compare, null, false, component);
  }

  public static ShimmerCompareBinding bind(@NonNull View view) {
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
  public static ShimmerCompareBinding bind(@NonNull View view, @Nullable Object component) {
    return (ShimmerCompareBinding)bind(component, view, R.layout.shimmer_compare);
  }
}
