package com.intellihealth.truemeds.domain.usecase;

import android.content.Context;
import com.intellihealth.truemeds.domain.repository.OrderFlowRepository;
import com.intellihealth.truemeds.domain.repository.UserDataRepository;
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
public final class OrderFlowUseCase_Factory implements Factory<OrderFlowUseCase> {
  private final Provider<OrderFlowRepository> orderFlowRepositoryProvider;

  private final Provider<UserDataRepository> userDataRepositoryProvider;

  private final Provider<LocalDbUseCase> localDbUseCaseProvider;

  private final Provider<SdkEventUseCase> sdkEventUseCaseProvider;

  private final Provider<Context> contextProvider;

  public OrderFlowUseCase_Factory(Provider<OrderFlowRepository> orderFlowRepositoryProvider,
      Provider<UserDataRepository> userDataRepositoryProvider,
      Provider<LocalDbUseCase> localDbUseCaseProvider,
      Provider<SdkEventUseCase> sdkEventUseCaseProvider, Provider<Context> contextProvider) {
    this.orderFlowRepositoryProvider = orderFlowRepositoryProvider;
    this.userDataRepositoryProvider = userDataRepositoryProvider;
    this.localDbUseCaseProvider = localDbUseCaseProvider;
    this.sdkEventUseCaseProvider = sdkEventUseCaseProvider;
    this.contextProvider = contextProvider;
  }

  @Override
  public OrderFlowUseCase get() {
    return newInstance(orderFlowRepositoryProvider.get(), userDataRepositoryProvider.get(), localDbUseCaseProvider.get(), sdkEventUseCaseProvider.get(), contextProvider.get());
  }

  public static OrderFlowUseCase_Factory create(
      Provider<OrderFlowRepository> orderFlowRepositoryProvider,
      Provider<UserDataRepository> userDataRepositoryProvider,
      Provider<LocalDbUseCase> localDbUseCaseProvider,
      Provider<SdkEventUseCase> sdkEventUseCaseProvider, Provider<Context> contextProvider) {
    return new OrderFlowUseCase_Factory(orderFlowRepositoryProvider, userDataRepositoryProvider, localDbUseCaseProvider, sdkEventUseCaseProvider, contextProvider);
  }

  public static OrderFlowUseCase newInstance(OrderFlowRepository orderFlowRepository,
      UserDataRepository userDataRepository, LocalDbUseCase localDbUseCase,
      SdkEventUseCase sdkEventUseCase, Context context) {
    return new OrderFlowUseCase(orderFlowRepository, userDataRepository, localDbUseCase, sdkEventUseCase, context);
  }
}
