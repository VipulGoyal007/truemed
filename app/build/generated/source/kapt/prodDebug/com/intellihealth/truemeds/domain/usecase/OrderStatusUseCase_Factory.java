package com.intellihealth.truemeds.domain.usecase;

import android.content.Context;
import com.intellihealth.truemeds.domain.repository.OrderStatusRepository;
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
public final class OrderStatusUseCase_Factory implements Factory<OrderStatusUseCase> {
  private final Provider<OrderStatusRepository> orderStatusRepositoryProvider;

  private final Provider<Context> contextProvider;

  private final Provider<SdkEventUseCase> sdkEventUseCaseProvider;

  public OrderStatusUseCase_Factory(Provider<OrderStatusRepository> orderStatusRepositoryProvider,
      Provider<Context> contextProvider, Provider<SdkEventUseCase> sdkEventUseCaseProvider) {
    this.orderStatusRepositoryProvider = orderStatusRepositoryProvider;
    this.contextProvider = contextProvider;
    this.sdkEventUseCaseProvider = sdkEventUseCaseProvider;
  }

  @Override
  public OrderStatusUseCase get() {
    return newInstance(orderStatusRepositoryProvider.get(), contextProvider.get(), sdkEventUseCaseProvider.get());
  }

  public static OrderStatusUseCase_Factory create(
      Provider<OrderStatusRepository> orderStatusRepositoryProvider,
      Provider<Context> contextProvider, Provider<SdkEventUseCase> sdkEventUseCaseProvider) {
    return new OrderStatusUseCase_Factory(orderStatusRepositoryProvider, contextProvider, sdkEventUseCaseProvider);
  }

  public static OrderStatusUseCase newInstance(OrderStatusRepository orderStatusRepository,
      Context context, SdkEventUseCase sdkEventUseCase) {
    return new OrderStatusUseCase(orderStatusRepository, context, sdkEventUseCase);
  }
}
