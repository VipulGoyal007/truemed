// Generated by data binding compiler. Do not edit!
package com.intellihealth.truemeds.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.intellihealth.salt.models.InstructionAccordionModel;
import com.intellihealth.salt.models.StickyNonStickyNotificationModel;
import com.intellihealth.salt.views.MobileSectionHeaders;
import com.intellihealth.salt.views.StickyNonStickyNotification;
import com.intellihealth.salt.views.TextView;
import com.intellihealth.salt.views.buttons.Button;
import com.intellihealth.salt.views.cards.Faq;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.presentation.viewmodel.PaymentOptionsViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityPaymentOptionBinding extends ViewDataBinding {
  @NonNull
  public final Button btnViewMoreOptions;

  @NonNull
  public final ConstraintLayout clBillDetails;

  @NonNull
  public final ConstraintLayout clFAQ;

  @NonNull
  public final ConstraintLayout clOrderIsBeingPlacedView;

  @NonNull
  public final ConstraintLayout clOrderPlacedView;

  @NonNull
  public final ConstraintLayout clPayableDesc;

  @NonNull
  public final ConstraintLayout clPayableInfo;

  @NonNull
  public final Faq faqList;

  @NonNull
  public final AppCompatImageView imgInfoCircle;

  @NonNull
  public final AppCompatImageView ivOrderIsBeingPlaced;

  @NonNull
  public final LottieAnimationView lottieView;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final RecyclerView recyclerViewPaymentOptions;

  @NonNull
  public final NestedScrollView scrollView;

  @NonNull
  public final ShimmerFrameLayout shimmerViewContainer;

  @NonNull
  public final TextView tmAmountToBePaidDesc;

  @NonNull
  public final TextView tmEstimatedPayableLabel;

  @NonNull
  public final MobileSectionHeaders tmMobileSectionHeader;

  @NonNull
  public final TextView tmPayableAmount;

  @NonNull
  public final StickyNonStickyNotification tmStickyNotificationCouponApplied;

  @NonNull
  public final TextView tmViewBill;

  @NonNull
  public final TextView tvFaqLabel;

  @NonNull
  public final TextView tvOrderPlaced;

  @NonNull
  public final View viewHorizontal;

  @Bindable
  protected PaymentOptionsViewModel mViewModel;

  @Bindable
  protected InstructionAccordionModel mFaqData;

  @Bindable
  protected StickyNonStickyNotificationModel mFtcCouponAppliedData;

  protected ActivityPaymentOptionBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button btnViewMoreOptions, ConstraintLayout clBillDetails, ConstraintLayout clFAQ,
      ConstraintLayout clOrderIsBeingPlacedView, ConstraintLayout clOrderPlacedView,
      ConstraintLayout clPayableDesc, ConstraintLayout clPayableInfo, Faq faqList,
      AppCompatImageView imgInfoCircle, AppCompatImageView ivOrderIsBeingPlaced,
      LottieAnimationView lottieView, ProgressBar progressBar,
      RecyclerView recyclerViewPaymentOptions, NestedScrollView scrollView,
      ShimmerFrameLayout shimmerViewContainer, TextView tmAmountToBePaidDesc,
      TextView tmEstimatedPayableLabel, MobileSectionHeaders tmMobileSectionHeader,
      TextView tmPayableAmount, StickyNonStickyNotification tmStickyNotificationCouponApplied,
      TextView tmViewBill, TextView tvFaqLabel, TextView tvOrderPlaced, View viewHorizontal) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnViewMoreOptions = btnViewMoreOptions;
    this.clBillDetails = clBillDetails;
    this.clFAQ = clFAQ;
    this.clOrderIsBeingPlacedView = clOrderIsBeingPlacedView;
    this.clOrderPlacedView = clOrderPlacedView;
    this.clPayableDesc = clPayableDesc;
    this.clPayableInfo = clPayableInfo;
    this.faqList = faqList;
    this.imgInfoCircle = imgInfoCircle;
    this.ivOrderIsBeingPlaced = ivOrderIsBeingPlaced;
    this.lottieView = lottieView;
    this.progressBar = progressBar;
    this.recyclerViewPaymentOptions = recyclerViewPaymentOptions;
    this.scrollView = scrollView;
    this.shimmerViewContainer = shimmerViewContainer;
    this.tmAmountToBePaidDesc = tmAmountToBePaidDesc;
    this.tmEstimatedPayableLabel = tmEstimatedPayableLabel;
    this.tmMobileSectionHeader = tmMobileSectionHeader;
    this.tmPayableAmount = tmPayableAmount;
    this.tmStickyNotificationCouponApplied = tmStickyNotificationCouponApplied;
    this.tmViewBill = tmViewBill;
    this.tvFaqLabel = tvFaqLabel;
    this.tvOrderPlaced = tvOrderPlaced;
    this.viewHorizontal = viewHorizontal;
  }

  public abstract void setViewModel(@Nullable PaymentOptionsViewModel viewModel);

  @Nullable
  public PaymentOptionsViewModel getViewModel() {
    return mViewModel;
  }

  public abstract void setFaqData(@Nullable InstructionAccordionModel faqData);

  @Nullable
  public InstructionAccordionModel getFaqData() {
    return mFaqData;
  }

  public abstract void setFtcCouponAppliedData(
      @Nullable StickyNonStickyNotificationModel ftcCouponAppliedData);

  @Nullable
  public StickyNonStickyNotificationModel getFtcCouponAppliedData() {
    return mFtcCouponAppliedData;
  }

  @NonNull
  public static ActivityPaymentOptionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_payment_option, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityPaymentOptionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityPaymentOptionBinding>inflateInternal(inflater, R.layout.activity_payment_option, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityPaymentOptionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_payment_option, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityPaymentOptionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityPaymentOptionBinding>inflateInternal(inflater, R.layout.activity_payment_option, null, false, component);
  }

  public static ActivityPaymentOptionBinding bind(@NonNull View view) {
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
  public static ActivityPaymentOptionBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityPaymentOptionBinding)bind(component, view, R.layout.activity_payment_option);
  }
}
