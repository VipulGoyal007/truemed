package com.intellihealth.truemeds.presentation.viewmodel;

import android.content.Context;
import com.intellihealth.truemeds.domain.usecase.CouponUseCase;
import com.intellihealth.truemeds.domain.usecase.HomePageUseCase;
import com.intellihealth.truemeds.domain.usecase.LocalDbUseCase;
import com.intellihealth.truemeds.domain.usecase.LoginUseCase;
import com.intellihealth.truemeds.domain.usecase.OrderFlowUseCase;
import com.intellihealth.truemeds.domain.usecase.OrderStatusUseCase;
import com.intellihealth.truemeds.domain.usecase.PaymentOptionsUseCase;
import com.intellihealth.truemeds.domain.usecase.ReminderUseCase;
import com.intellihealth.truemeds.domain.usecase.ReorderUseCase;
import com.intellihealth.truemeds.domain.usecase.UserDataUseCase;
import com.intellihealth.truemeds.domain.usecase.analytics.SdkEventUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class OrderStatusViewModel_Factory implements Factory<OrderStatusViewModel> {
  private final Provider<OrderStatusUseCase> orderStatusUseCaseProvider;

  private final Provider<ReminderUseCase> reminderUseCaseProvider;

  private final Provider<ReorderUseCase> reorderUseCaseProvider;

  private final Provider<PaymentOptionsUseCase> paymentOptionsUseCaseProvider;

  private final Provider<LoginUseCase> loginUseCaseProvider;

  private final Provider<HomePageUseCase> homePageUseCaseProvider;

  private final Provider<UserDataUseCase> userDataUseCaseProvider;

  private final Provider<Context> contextProvider;

  private final Provider<LocalDbUseCase> localDbUseCaseProvider;

  private final Provider<OrderFlowUseCase> orderFlowUseCaseProvider;

  private final Provider<CouponUseCase> couponUseCaseProvider;

  private final Provider<SdkEventUseCase> sdkEventUseCaseProvider;

  public OrderStatusViewModel_Factory(Provider<OrderStatusUseCase> orderStatusUseCaseProvider,
      Provider<ReminderUseCase> reminderUseCaseProvider,
      Provider<ReorderUseCase> reorderUseCaseProvider,
      Provider<PaymentOptionsUseCase> paymentOptionsUseCaseProvider,
      Provider<LoginUseCase> loginUseCaseProvider,
      Provider<HomePageUseCase> homePageUseCaseProvider,
      Provider<UserDataUseCase> userDataUseCaseProvider, Provider<Context> contextProvider,
      Provider<LocalDbUseCase> localDbUseCaseProvider,
      Provider<OrderFlowUseCase> orderFlowUseCaseProvider,
      Provider<CouponUseCase> couponUseCaseProvider,
      Provider<SdkEventUseCase> sdkEventUseCaseProvider) {
    this.orderStatusUseCaseProvider = orderStatusUseCaseProvider;
    this.reminderUseCaseProvider = reminderUseCaseProvider;
    this.reorderUseCaseProvider = reorderUseCaseProvider;
    this.paymentOptionsUseCaseProvider = paymentOptionsUseCaseProvider;
    this.loginUseCaseProvider = loginUseCaseProvider;
    this.homePageUseCaseProvider = homePageUseCaseProvider;
    this.userDataUseCaseProvider = userDataUseCaseProvider;
    this.contextProvider = contextProvider;
    this.localDbUseCaseProvider = localDbUseCaseProvider;
    this.orderFlowUseCaseProvider = orderFlowUseCaseProvider;
    this.couponUseCaseProvider = couponUseCaseProvider;
    this.sdkEventUseCaseProvider = sdkEventUseCaseProvider;
  }

  @Override
  public OrderStatusViewModel get() {
    OrderStatusViewModel instance = newInstance(orderStatusUseCaseProvider.get(), reminderUseCaseProvider.get(), reorderUseCaseProvider.get(), paymentOptionsUseCaseProvider.get(), loginUseCaseProvider.get(), homePageUseCaseProvider.get(), userDataUseCaseProvider.get(), contextProvider.get());
    BaseViewModel_MembersInjector.injectLocalDbUseCase(instance, localDbUseCaseProvider.get());
    BaseViewModel_MembersInjector.injectOrderFlowUseCase(instance, orderFlowUseCaseProvider.get());
    BaseViewModel_MembersInjector.injectCouponUseCase(instance, couponUseCaseProvider.get());
    BaseViewModel_MembersInjector.injectSdkEventUseCase(instance, sdkEventUseCaseProvider.get());
    return instance;
  }

  public static OrderStatusViewModel_Factory create(
      Provider<OrderStatusUseCase> orderStatusUseCaseProvider,
      Provider<ReminderUseCase> reminderUseCaseProvider,
      Provider<ReorderUseCase> reorderUseCaseProvider,
      Provider<PaymentOptionsUseCase> paymentOptionsUseCaseProvider,
      Provider<LoginUseCase> loginUseCaseProvider,
      Provider<HomePageUseCase> homePageUseCaseProvider,
      Provider<UserDataUseCase> userDataUseCaseProvider, Provider<Context> contextProvider,
      Provider<LocalDbUseCase> localDbUseCaseProvider,
      Provider<OrderFlowUseCase> orderFlowUseCaseProvider,
      Provider<CouponUseCase> couponUseCaseProvider,
      Provider<SdkEventUseCase> sdkEventUseCaseProvider) {
    return new OrderStatusViewModel_Factory(orderStatusUseCaseProvider, reminderUseCaseProvider, reorderUseCaseProvider, paymentOptionsUseCaseProvider, loginUseCaseProvider, homePageUseCaseProvider, userDataUseCaseProvider, contextProvider, localDbUseCaseProvider, orderFlowUseCaseProvider, couponUseCaseProvider, sdkEventUseCaseProvider);
  }

  public static OrderStatusViewModel newInstance(OrderStatusUseCase orderStatusUseCase,
      ReminderUseCase reminderUseCase, ReorderUseCase reorderUseCase,
      PaymentOptionsUseCase paymentOptionsUseCase, LoginUseCase loginUseCase,
      HomePageUseCase homePageUseCase, UserDataUseCase userDataUseCase, Context context) {
    return new OrderStatusViewModel(orderStatusUseCase, reminderUseCase, reorderUseCase, paymentOptionsUseCase, loginUseCase, homePageUseCase, userDataUseCase, context);
  }
}
