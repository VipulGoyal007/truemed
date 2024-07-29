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
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.flexbox.FlexboxLayout;
import com.intellihealth.salt.views.MobileSectionHeaders;
import com.intellihealth.salt.views.TextView;
import com.intellihealth.salt.views.buttons.ButtonLite;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.presentation.viewmodel.HelpViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityHelpSubcategoryBinding extends ViewDataBinding {
  @NonNull
  public final ButtonLite btnLinkSmall;

  @NonNull
  public final FlexboxLayout llBottom;

  @NonNull
  public final RecyclerView rvHelpSubCategoryList;

  @NonNull
  public final ShimmerFrameLayout shimmerViewContainer;

  @NonNull
  public final MobileSectionHeaders tmTopHeader;

  @NonNull
  public final TextView tvStillHaveQuestion;

  @Bindable
  protected HelpViewModel mViewModel;

  protected ActivityHelpSubcategoryBinding(Object _bindingComponent, View _root,
      int _localFieldCount, ButtonLite btnLinkSmall, FlexboxLayout llBottom,
      RecyclerView rvHelpSubCategoryList, ShimmerFrameLayout shimmerViewContainer,
      MobileSectionHeaders tmTopHeader, TextView tvStillHaveQuestion) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnLinkSmall = btnLinkSmall;
    this.llBottom = llBottom;
    this.rvHelpSubCategoryList = rvHelpSubCategoryList;
    this.shimmerViewContainer = shimmerViewContainer;
    this.tmTopHeader = tmTopHeader;
    this.tvStillHaveQuestion = tvStillHaveQuestion;
  }

  public abstract void setViewModel(@Nullable HelpViewModel viewModel);

  @Nullable
  public HelpViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ActivityHelpSubcategoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_help_subcategory, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityHelpSubcategoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityHelpSubcategoryBinding>inflateInternal(inflater, R.layout.activity_help_subcategory, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityHelpSubcategoryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_help_subcategory, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityHelpSubcategoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityHelpSubcategoryBinding>inflateInternal(inflater, R.layout.activity_help_subcategory, null, false, component);
  }

  public static ActivityHelpSubcategoryBinding bind(@NonNull View view) {
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
  public static ActivityHelpSubcategoryBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ActivityHelpSubcategoryBinding)bind(component, view, R.layout.activity_help_subcategory);
  }
}