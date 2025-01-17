// Generated by data binding compiler. Do not edit!
package com.intellihealth.truemeds.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.intellihealth.salt.views.MobileSectionHeaders;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.presentation.viewmodel.ReferNEarnViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityReferAndEarnBinding extends ViewDataBinding {
  @NonNull
  public final MobileSectionHeaders header;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final FrameLayout referNEarnContainer;

  @Bindable
  protected ReferNEarnViewModel mViewModel;

  protected ActivityReferAndEarnBinding(Object _bindingComponent, View _root, int _localFieldCount,
      MobileSectionHeaders header, ProgressBar progressBar, FrameLayout referNEarnContainer) {
    super(_bindingComponent, _root, _localFieldCount);
    this.header = header;
    this.progressBar = progressBar;
    this.referNEarnContainer = referNEarnContainer;
  }

  public abstract void setViewModel(@Nullable ReferNEarnViewModel viewModel);

  @Nullable
  public ReferNEarnViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ActivityReferAndEarnBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_refer_and_earn, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityReferAndEarnBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityReferAndEarnBinding>inflateInternal(inflater, R.layout.activity_refer_and_earn, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityReferAndEarnBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_refer_and_earn, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityReferAndEarnBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityReferAndEarnBinding>inflateInternal(inflater, R.layout.activity_refer_and_earn, null, false, component);
  }

  public static ActivityReferAndEarnBinding bind(@NonNull View view) {
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
  public static ActivityReferAndEarnBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityReferAndEarnBinding)bind(component, view, R.layout.activity_refer_and_earn);
  }
}
