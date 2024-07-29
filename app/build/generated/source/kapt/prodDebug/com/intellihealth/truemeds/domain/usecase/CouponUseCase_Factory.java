package com.intellihealth.truemeds.domain.usecase;

import com.intellihealth.truemeds.domain.repository.OrderFlowRepository;
import com.intellihealth.truemeds.domain.usecase.analytics.SdkEventUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
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
public final class CouponUseCase_Factory implements Factory<CouponUseCase> {
  private final Provider<OrderFlowRepository> orderFlowRepositoryProvider;

  private final Provider<SdkEventUseCase> sdkEventUseCaseProvider;

  public CouponUseCase_Factory(Provider<OrderFlowRepository> orderFlowRepositoryProvider,
      Provider<SdkEventUseCase> sdkEventUseCaseProvider) {
    this.orderFlowRepositoryProvider = orderFlowRepositoryProvider;
    this.sdkEventUseCaseProvider = sdkEventUseCaseProvider;
  }

  @Override
  public CouponUseCase get() {
    return newInstance(orderFlowRepositoryProvider.get(), sdkEventUseCaseProvider.get());
  }

  public static CouponUseCase_Factory create(
      Provider<OrderFlowRepository> orderFlowRepositoryProvider,
      Provider<SdkEventUseCase> sdkEventUseCaseProvider) {
    return new CouponUseCase_Factory(orderFlowRepositoryProvider, sdkEventUseCaseProvider);
  }

  public static CouponUseCase newInstance(OrderFlowRepository orderFlowRepository,
      SdkEventUseCase sdkEventUseCase) {
    return new CouponUseCase(orderFlowRepository, sdkEventUseCase);
  }
}
