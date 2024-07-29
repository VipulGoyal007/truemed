package com.intellihealth.truemeds.domain.usecase;

import android.content.Context;
import com.intellihealth.truemeds.domain.repository.OrderFlowRepository;
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
public final class PaymentOptionsUseCase_Factory implements Factory<PaymentOptionsUseCase> {
  private final Provider<OrderFlowRepository> orderFlowRepositoryProvider;

  private final Provider<Context> contextProvider;

  private final Provider<SdkEventUseCase> sdkEventUseCaseProvider;

  public PaymentOptionsUseCase_Factory(Provider<OrderFlowRepository> orderFlowRepositoryProvider,
      Provider<Context> contextProvider, Provider<SdkEventUseCase> sdkEventUseCaseProvider) {
    this.orderFlowRepositoryProvider = orderFlowRepositoryProvider;
    this.contextProvider = contextProvider;
    this.sdkEventUseCaseProvider = sdkEventUseCaseProvider;
  }

  @Override
  public PaymentOptionsUseCase get() {
    return newInstance(orderFlowRepositoryProvider.get(), contextProvider.get(), sdkEventUseCaseProvider.get());
  }

  public static PaymentOptionsUseCase_Factory create(
      Provider<OrderFlowRepository> orderFlowRepositoryProvider, Provider<Context> contextProvider,
      Provider<SdkEventUseCase> sdkEventUseCaseProvider) {
    return new PaymentOptionsUseCase_Factory(orderFlowRepositoryProvider, contextProvider, sdkEventUseCaseProvider);
  }

  public static PaymentOptionsUseCase newInstance(OrderFlowRepository orderFlowRepository,
      Context context, SdkEventUseCase sdkEventUseCase) {
    return new PaymentOptionsUseCase(orderFlowRepository, context, sdkEventUseCase);
  }
}
