// Generated by data binding compiler. Do not edit!
package com.intellihealth.truemeds.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.intellihealth.salt.views.MobileSectionHeaders;
import com.intellihealth.salt.views.buttons.Button;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.presentation.viewmodel.ManageAddressViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityManageAddressBinding extends ViewDataBinding {
  @NonNull
  public final Button addAddressBtn;

  @NonNull
  public final ConstraintLayout defaultCardCl;

  @NonNull
  public final ConstraintLayout mainCardCl;

  @NonNull
  public final RecyclerView manageAddressCardRv;

  @NonNull
  public final MobileSectionHeaders mobileSectionHeadersTextWithIcons;

  @NonNull
  public final AppCompatImageView noAddressAddedYetImg;

  @NonNull
  public final ShimmerFrameLayout shimmerViewContainer;

  @Bindable
  protected ManageAddressViewModel mManageAddressViewModel;

  protected ActivityManageAddressBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button addAddressBtn, ConstraintLayout defaultCardCl, ConstraintLayout mainCardCl,
      RecyclerView manageAddressCardRv, MobileSectionHeaders mobileSectionHeadersTextWithIcons,
      AppCompatImageView noAddressAddedYetImg, ShimmerFrameLayout shimmerViewContainer) {
    super(_bindingComponent, _root, _localFieldCount);
    this.addAddressBtn = addAddressBtn;
    this.defaultCardCl = defaultCardCl;
    this.mainCardCl = mainCardCl;
    this.manageAddressCardRv = manageAddressCardRv;
    this.mobileSectionHeadersTextWithIcons = mobileSectionHeadersTextWithIcons;
    this.noAddressAddedYetImg = noAddressAddedYetImg;
    this.shimmerViewContainer = shimmerViewContainer;
  }

  public abstract void setManageAddressViewModel(
      @Nullable ManageAddressViewModel manageAddressViewModel);

  @Nullable
  public ManageAddressViewModel getManageAddressViewModel() {
    return mManageAddressViewModel;
  }

  @NonNull
  public static ActivityManageAddressBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_manage_address, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityManageAddressBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityManageAddressBinding>inflateInternal(inflater, R.layout.activity_manage_address, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityManageAddressBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_manage_address, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityManageAddressBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityManageAddressBinding>inflateInternal(inflater, R.layout.activity_manage_address, null, false, component);
  }

  public static ActivityManageAddressBinding bind(@NonNull View view) {
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
  public static ActivityManageAddressBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityManageAddressBinding)bind(component, view, R.layout.activity_manage_address);
  }
}
