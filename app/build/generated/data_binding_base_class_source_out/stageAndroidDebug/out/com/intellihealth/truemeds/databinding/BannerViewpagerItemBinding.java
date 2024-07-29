// Generated by data binding compiler. Do not edit!
package com.intellihealth.truemeds.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.intellihealth.truemeds.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class BannerViewpagerItemBinding extends ViewDataBinding {
  @NonNull
  public final ImageView imageViewMain;

  protected BannerViewpagerItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView imageViewMain) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imageViewMain = imageViewMain;
  }

  @NonNull
  public static BannerViewpagerItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.banner_viewpager_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static BannerViewpagerItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<BannerViewpagerItemBinding>inflateInternal(inflater, R.layout.banner_viewpager_item, root, attachToRoot, component);
  }

  @NonNull
  public static BannerViewpagerItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.banner_viewpager_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static BannerViewpagerItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<BannerViewpagerItemBinding>inflateInternal(inflater, R.layout.banner_viewpager_item, null, false, component);
  }

  public static BannerViewpagerItemBinding bind(@NonNull View view) {
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
  public static BannerViewpagerItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (BannerViewpagerItemBinding)bind(component, view, R.layout.banner_viewpager_item);
  }
}
