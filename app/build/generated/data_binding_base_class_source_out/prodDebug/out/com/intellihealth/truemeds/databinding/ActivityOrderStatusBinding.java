// Generated by data binding compiler. Do not edit!
package com.intellihealth.truemeds.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.intellihealth.salt.views.Banner;
import com.intellihealth.salt.views.FloatingVideoLayout;
import com.intellihealth.salt.views.MobileSectionHeaders;
import com.intellihealth.salt.views.StickyNonStickyNotification;
import com.intellihealth.salt.views.TextView;
import com.intellihealth.salt.views.cards.BillDetails;
import com.intellihealth.salt.views.cards.DoctorCallCard;
import com.intellihealth.salt.views.cards.ReminderCard;
import com.intellihealth.salt.views.cards.orderDetailCard.OrderPersonalDetailsCard;
import com.intellihealth.salt.views.cards.orderDetailCard.OrderedItemCard;
import com.intellihealth.salt.views.orders.OrderTracker;
import com.intellihealth.salt.views.payments.StickyPaymentContainer;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.data.model.orderstatus.OrderStatusResponse;
import com.intellihealth.truemeds.presentation.callbacks.ViewPrescriptionCallback;
import com.intellihealth.truemeds.presentation.viewmodel.OrderStatusViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityOrderStatusBinding extends ViewDataBinding {
  @NonNull
  public final OrderPersonalDetailsCard addressDetailCard;

  @NonNull
  public final BillDetails billDetails;

  @NonNull
  public final OrderPersonalDetailsCard cancelOrderCard;

  @NonNull
  public final ConstraintLayout clBillDetails;

  @NonNull
  public final ConstraintLayout clUploadPrescription;

  @NonNull
  public final ConstraintLayout clVideoBanner;

  @NonNull
  public final DoctorCallCard doctorCallCard;

  @NonNull
  public final OrderPersonalDetailsCard emailDetailCard;

  @NonNull
  public final FloatingVideoLayout floatingVideoThumbnail;

  @NonNull
  public final OrderPersonalDetailsCard helpDetailCard;

  @NonNull
  public final ConstraintLayout mainLayout;

  @NonNull
  public final NestedScrollView nestedScrollView;

  @NonNull
  public final OrderPersonalDetailsCard numberDetailCard;

  @NonNull
  public final OrderTracker orderTracker;

  @NonNull
  public final OrderedItemCard orderedItemCard;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final ReminderCard reminderCard;

  @NonNull
  public final MobileSectionHeaders sectionHeader;

  @NonNull
  public final ShimmerFrameLayout shimmerViewContainer;

  @NonNull
  public final StickyNonStickyNotification stickyOrderStatus;

  @NonNull
  public final StickyPaymentContainer stickyPaymentContainer;

  @NonNull
  public final Banner tmBanner;

  @NonNull
  public final TextView tvLearnMoreLabel;

  @NonNull
  public final TextView tvUploadPrescriptionLabel;

  @Bindable
  protected OrderStatusViewModel mViewModel;

  @Bindable
  protected OrderStatusResponse.ResponseData mOrderStatusResponseData;

  @Bindable
  protected ViewPrescriptionCallback mCallback;

  protected ActivityOrderStatusBinding(Object _bindingComponent, View _root, int _localFieldCount,
      OrderPersonalDetailsCard addressDetailCard, BillDetails billDetails,
      OrderPersonalDetailsCard cancelOrderCard, ConstraintLayout clBillDetails,
      ConstraintLayout clUploadPrescription, ConstraintLayout clVideoBanner,
      DoctorCallCard doctorCallCard, OrderPersonalDetailsCard emailDetailCard,
      FloatingVideoLayout floatingVideoThumbnail, OrderPersonalDetailsCard helpDetailCard,
      ConstraintLayout mainLayout, NestedScrollView nestedScrollView,
      OrderPersonalDetailsCard numberDetailCard, OrderTracker orderTracker,
      OrderedItemCard orderedItemCard, ProgressBar progressBar, ReminderCard reminderCard,
      MobileSectionHeaders sectionHeader, ShimmerFrameLayout shimmerViewContainer,
      StickyNonStickyNotification stickyOrderStatus, StickyPaymentContainer stickyPaymentContainer,
      Banner tmBanner, TextView tvLearnMoreLabel, TextView tvUploadPrescriptionLabel) {
    super(_bindingComponent, _root, _localFieldCount);
    this.addressDetailCard = addressDetailCard;
    this.billDetails = billDetails;
    this.cancelOrderCard = cancelOrderCard;
    this.clBillDetails = clBillDetails;
    this.clUploadPrescription = clUploadPrescription;
    this.clVideoBanner = clVideoBanner;
    this.doctorCallCard = doctorCallCard;
    this.emailDetailCard = emailDetailCard;
    this.floatingVideoThumbnail = floatingVideoThumbnail;
    this.helpDetailCard = helpDetailCard;
    this.mainLayout = mainLayout;
    this.nestedScrollView = nestedScrollView;
    this.numberDetailCard = numberDetailCard;
    this.orderTracker = orderTracker;
    this.orderedItemCard = orderedItemCard;
    this.progressBar = progressBar;
    this.reminderCard = reminderCard;
    this.sectionHeader = sectionHeader;
    this.shimmerViewContainer = shimmerViewContainer;
    this.stickyOrderStatus = stickyOrderStatus;
    this.stickyPaymentContainer = stickyPaymentContainer;
    this.tmBanner = tmBanner;
    this.tvLearnMoreLabel = tvLearnMoreLabel;
    this.tvUploadPrescriptionLabel = tvUploadPrescriptionLabel;
  }

  public abstract void setViewModel(@Nullable OrderStatusViewModel viewModel);

  @Nullable
  public OrderStatusViewModel getViewModel() {
    return mViewModel;
  }

  public abstract void setOrderStatusResponseData(
      @Nullable OrderStatusResponse.ResponseData orderStatusResponseData);

  @Nullable
  public OrderStatusResponse.ResponseData getOrderStatusResponseData() {
    return mOrderStatusResponseData;
  }

  public abstract void setCallback(@Nullable ViewPrescriptionCallback callback);

  @Nullable
  public ViewPrescriptionCallback getCallback() {
    return mCallback;
  }

  @NonNull
  public static ActivityOrderStatusBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_order_status, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityOrderStatusBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityOrderStatusBinding>inflateInternal(inflater, R.layout.activity_order_status, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityOrderStatusBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_order_status, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityOrderStatusBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityOrderStatusBinding>inflateInternal(inflater, R.layout.activity_order_status, null, false, component);
  }

  public static ActivityOrderStatusBinding bind(@NonNull View view) {
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
  public static ActivityOrderStatusBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityOrderStatusBinding)bind(component, view, R.layout.activity_order_status);
  }
}
