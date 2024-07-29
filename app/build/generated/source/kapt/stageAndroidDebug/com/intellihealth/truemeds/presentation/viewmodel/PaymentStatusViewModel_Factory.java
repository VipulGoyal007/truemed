package com.intellihealth.truemeds.presentation.viewmodel;

import android.content.Context;
import com.intellihealth.truemeds.domain.usecase.CashFreeUseCase;
import com.intellihealth.truemeds.domain.usecase.OrderFlowUseCase;
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
public final class PaymentStatusViewModel_Factory implements Factory<PaymentStatusViewModel> {
  private final Provider<CashFreeUseCase> cashFreeUseCaseProvider;

  private final Provider<OrderFlowUseCase> orderFlowUseCaseProvider;

  private final Provider<SdkEventUseCase> sdkEventUseCaseProvider;

  private final Provider<Context> contextProvider;

  public PaymentStatusViewModel_Factory(Provider<CashFreeUseCase> cashFreeUseCaseProvider,
      Provider<OrderFlowUseCase> orderFlowUseCaseProvider,
      Provider<SdkEventUseCase> sdkEventUseCaseProvider, Provider<Context> contextProvider) {
    this.cashFreeUseCaseProvider = cashFreeUseCaseProvider;
    this.orderFlowUseCaseProvider = orderFlowUseCaseProvider;
    this.sdkEventUseCaseProvider = sdkEventUseCaseProvider;
    this.contextProvider = contextProvider;
  }

  @Override
  public PaymentStatusViewModel get() {
    return newInstance(cashFreeUseCaseProvider.get(), orderFlowUseCaseProvider.get(), sdkEventUseCaseProvider.get(), contextProvider.get());
  }

  public static PaymentStatusViewModel_Factory create(
      Provider<CashFreeUseCase> cashFreeUseCaseProvider,
      Provider<OrderFlowUseCase> orderFlowUseCaseProvider,
      Provider<SdkEventUseCase> sdkEventUseCaseProvider, Provider<Context> contextProvider) {
    return new PaymentStatusViewModel_Factory(cashFreeUseCaseProvider, orderFlowUseCaseProvider, sdkEventUseCaseProvider, contextProvider);
  }

  public static PaymentStatusViewModel newInstance(CashFreeUseCase cashFreeUseCase,
      OrderFlowUseCase orderFlowUseCase, SdkEventUseCase sdkEventUseCase, Context context) {
    return new PaymentStatusViewModel(cashFreeUseCase, orderFlowUseCase, sdkEventUseCase, context);
  }
}
