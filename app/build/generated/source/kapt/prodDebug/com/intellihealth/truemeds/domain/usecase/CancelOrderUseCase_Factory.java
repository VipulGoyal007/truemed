package com.intellihealth.truemeds.domain.usecase;

import com.intellihealth.truemeds.domain.repository.CancelOrderRepository;
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
public final class CancelOrderUseCase_Factory implements Factory<CancelOrderUseCase> {
  private final Provider<CancelOrderRepository> cancelOrderRepositoryProvider;

  private final Provider<SdkEventUseCase> sdkEventUseCaseProvider;

  public CancelOrderUseCase_Factory(Provider<CancelOrderRepository> cancelOrderRepositoryProvider,
      Provider<SdkEventUseCase> sdkEventUseCaseProvider) {
    this.cancelOrderRepositoryProvider = cancelOrderRepositoryProvider;
    this.sdkEventUseCaseProvider = sdkEventUseCaseProvider;
  }

  @Override
  public CancelOrderUseCase get() {
    return newInstance(cancelOrderRepositoryProvider.get(), sdkEventUseCaseProvider.get());
  }

  public static CancelOrderUseCase_Factory create(
      Provider<CancelOrderRepository> cancelOrderRepositoryProvider,
      Provider<SdkEventUseCase> sdkEventUseCaseProvider) {
    return new CancelOrderUseCase_Factory(cancelOrderRepositoryProvider, sdkEventUseCaseProvider);
  }

  public static CancelOrderUseCase newInstance(CancelOrderRepository cancelOrderRepository,
      SdkEventUseCase sdkEventUseCase) {
    return new CancelOrderUseCase(cancelOrderRepository, sdkEventUseCase);
  }
}
