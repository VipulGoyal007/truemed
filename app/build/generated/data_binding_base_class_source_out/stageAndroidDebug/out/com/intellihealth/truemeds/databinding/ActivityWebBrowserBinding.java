// Generated by data binding compiler. Do not edit!
package com.intellihealth.truemeds.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.intellihealth.truemeds.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityWebBrowserBinding extends ViewDataBinding {
  @NonNull
  public final Guideline guideline3;

  @NonNull
  public final LinearLayout linearLayout8;

  @NonNull
  public final TextView textviewCall;

  @NonNull
  public final TextView textviewDeliveryPersonContact;

  @NonNull
  public final TextView textviewDeliveryPersonName;

  @NonNull
  public final WebView viewWebview;

  protected ActivityWebBrowserBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Guideline guideline3, LinearLayout linearLayout8, TextView textviewCall,
      TextView textviewDeliveryPersonContact, TextView textviewDeliveryPersonName,
      WebView viewWebview) {
    super(_bindingComponent, _root, _localFieldCount);
    this.guideline3 = guideline3;
    this.linearLayout8 = linearLayout8;
    this.textviewCall = textviewCall;
    this.textviewDeliveryPersonContact = textviewDeliveryPersonContact;
    this.textviewDeliveryPersonName = textviewDeliveryPersonName;
    this.viewWebview = viewWebview;
  }

  @NonNull
  public static ActivityWebBrowserBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_web_browser, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityWebBrowserBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityWebBrowserBinding>inflateInternal(inflater, R.layout.activity_web_browser, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityWebBrowserBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_web_browser, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityWebBrowserBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityWebBrowserBinding>inflateInternal(inflater, R.layout.activity_web_browser, null, false, component);
  }

  public static ActivityWebBrowserBinding bind(@NonNull View view) {
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
  public static ActivityWebBrowserBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityWebBrowserBinding)bind(component, view, R.layout.activity_web_browser);
  }
}
