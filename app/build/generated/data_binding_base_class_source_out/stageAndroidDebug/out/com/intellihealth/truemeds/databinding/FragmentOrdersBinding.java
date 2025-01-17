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
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.intellihealth.salt.views.MobileSectionHeaders;
import com.intellihealth.salt.views.buttons.Button;
import com.intellihealth.salt.views.dropdown.DropDownHeader;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.presentation.viewmodel.OrdersTabViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentOrdersBinding extends ViewDataBinding {
  @NonNull
  public final Button btnAddNewPatients;

  @NonNull
  public final ConstraintLayout clTopList;

  @NonNull
  public final MobileSectionHeaders header;

  @NonNull
  public final AppCompatImageView ivNoPatientYet;

  @NonNull
  public final ConstraintLayout rlNoPatientView;

  @NonNull
  public final RecyclerView rvOrderList;

  @NonNull
  public final ShimmerFrameLayout shimmerViewContainer;

  @NonNull
  public final SwipeRefreshLayout swipeToRefresh;

  @NonNull
  public final DropDownHeader tmDropDownOrders;

  @NonNull
  public final DropDownHeader tmDropDownPatient;

  @NonNull
  public final ConstraintLayout userWithoutLogin;

  @Bindable
  protected OrdersTabViewModel mViewModel;

  protected FragmentOrdersBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button btnAddNewPatients, ConstraintLayout clTopList, MobileSectionHeaders header,
      AppCompatImageView ivNoPatientYet, ConstraintLayout rlNoPatientView, RecyclerView rvOrderList,
      ShimmerFrameLayout shimmerViewContainer, SwipeRefreshLayout swipeToRefresh,
      DropDownHeader tmDropDownOrders, DropDownHeader tmDropDownPatient,
      ConstraintLayout userWithoutLogin) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnAddNewPatients = btnAddNewPatients;
    this.clTopList = clTopList;
    this.header = header;
    this.ivNoPatientYet = ivNoPatientYet;
    this.rlNoPatientView = rlNoPatientView;
    this.rvOrderList = rvOrderList;
    this.shimmerViewContainer = shimmerViewContainer;
    this.swipeToRefresh = swipeToRefresh;
    this.tmDropDownOrders = tmDropDownOrders;
    this.tmDropDownPatient = tmDropDownPatient;
    this.userWithoutLogin = userWithoutLogin;
  }

  public abstract void setViewModel(@Nullable OrdersTabViewModel viewModel);

  @Nullable
  public OrdersTabViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentOrdersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_orders, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentOrdersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentOrdersBinding>inflateInternal(inflater, R.layout.fragment_orders, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentOrdersBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_orders, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentOrdersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentOrdersBinding>inflateInternal(inflater, R.layout.fragment_orders, null, false, component);
  }

  public static FragmentOrdersBinding bind(@NonNull View view) {
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
  public static FragmentOrdersBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentOrdersBinding)bind(component, view, R.layout.fragment_orders);
  }
}
