package com.intellihealth.truemeds.presentation.viewmodel;

import android.app.Application;
import android.content.Context;
import com.intellihealth.truemeds.domain.usecase.CouponUseCase;
import com.intellihealth.truemeds.domain.usecase.HelpFaqTncUseCase;
import com.intellihealth.truemeds.domain.usecase.LocalDbUseCase;
import com.intellihealth.truemeds.domain.usecase.OrderFlowUseCase;
import com.intellihealth.truemeds.domain.usecase.PaymentOptionsUseCase;
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
public final class PaymentOptionsViewModel_Factory implements Factory<PaymentOptionsViewModel> {
  private final Provider<PaymentOptionsUseCase> paymentOptionsUseCaseProvider;

  private final Provider<HelpFaqTncUseCase> helpFaqTncUseCaseProvider;

  private final Provider<Application> applicationProvider;

  private final Provider<Context> contextProvider;

  private final Provider<LocalDbUseCase> localDbUseCaseProvider;

  private final Provider<OrderFlowUseCase> orderFlowUseCaseProvider;

  private final Provider<CouponUseCase> couponUseCaseProvider;

  private final Provider<SdkEventUseCase> sdkEventUseCaseProvider;

  public PaymentOptionsViewModel_Factory(
      Provider<PaymentOptionsUseCase> paymentOptionsUseCaseProvider,
      Provider<HelpFaqTncUseCase> helpFaqTncUseCaseProvider,
      Provider<Application> applicationProvider, Provider<Context> contextProvider,
      Provider<LocalDbUseCase> localDbUseCaseProvider,
      Provider<OrderFlowUseCase> orderFlowUseCaseProvider,
      Provider<CouponUseCase> couponUseCaseProvider,
      Provider<SdkEventUseCase> sdkEventUseCaseProvider) {
    this.paymentOptionsUseCaseProvider = paymentOptionsUseCaseProvider;
    this.helpFaqTncUseCaseProvider = helpFaqTncUseCaseProvider;
    this.applicationProvider = applicationProvider;
    this.contextProvider = contextProvider;
    this.localDbUseCaseProvider = localDbUseCaseProvider;
    this.orderFlowUseCaseProvider = orderFlowUseCaseProvider;
    this.couponUseCaseProvider = couponUseCaseProvider;
    this.sdkEventUseCaseProvider = sdkEventUseCaseProvider;
  }

  @Override
  public PaymentOptionsViewModel get() {
    PaymentOptionsViewModel instance = newInstance(paymentOptionsUseCaseProvider.get(), helpFaqTncUseCaseProvider.get(), applicationProvider.get(), contextProvider.get());
    BaseViewModel_MembersInjector.injectLocalDbUseCase(instance, localDbUseCaseProvider.get());
    BaseViewModel_MembersInjector.injectOrderFlowUseCase(instance, orderFlowUseCaseProvider.get());
    BaseViewModel_MembersInjector.injectCouponUseCase(instance, couponUseCaseProvider.get());
    BaseViewModel_MembersInjector.injectSdkEventUseCase(instance, sdkEventUseCaseProvider.get());
    return instance;
  }

  public static PaymentOptionsViewModel_Factory create(
      Provider<PaymentOptionsUseCase> paymentOptionsUseCaseProvider,
      Provider<HelpFaqTncUseCase> helpFaqTncUseCaseProvider,
      Provider<Application> applicationProvider, Provider<Context> contextProvider,
      Provider<LocalDbUseCase> localDbUseCaseProvider,
      Provider<OrderFlowUseCase> orderFlowUseCaseProvider,
      Provider<CouponUseCase> couponUseCaseProvider,
      Provider<SdkEventUseCase> sdkEventUseCaseProvider) {
    return new PaymentOptionsViewModel_Factory(paymentOptionsUseCaseProvider, helpFaqTncUseCaseProvider, applicationProvider, contextProvider, localDbUseCaseProvider, orderFlowUseCaseProvider, couponUseCaseProvider, sdkEventUseCaseProvider);
  }

  public static PaymentOptionsViewModel newInstance(PaymentOptionsUseCase paymentOptionsUseCase,
      HelpFaqTncUseCase helpFaqTncUseCase, Application application, Context context) {
    return new PaymentOptionsViewModel(paymentOptionsUseCase, helpFaqTncUseCase, application, context);
  }
}
