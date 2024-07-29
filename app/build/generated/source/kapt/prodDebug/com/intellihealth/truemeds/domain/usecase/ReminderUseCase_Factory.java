package com.intellihealth.truemeds.domain.usecase;

import android.content.Context;
import com.intellihealth.truemeds.domain.repository.OrderReminderRepository;
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
public final class ReminderUseCase_Factory implements Factory<ReminderUseCase> {
  private final Provider<Context> contextProvider;

  private final Provider<OrderReminderRepository> orderReminderRepositoryProvider;

  private final Provider<UserDataRepository> userDataRepositoryProvider;

  private final Provider<SdkEventUseCase> sdkEventUseCaseProvider;

  public ReminderUseCase_Factory(Provider<Context> contextProvider,
      Provider<OrderReminderRepository> orderReminderRepositoryProvider,
      Provider<UserDataRepository> userDataRepositoryProvider,
      Provider<SdkEventUseCase> sdkEventUseCaseProvider) {
    this.contextProvider = contextProvider;
    this.orderReminderRepositoryProvider = orderReminderRepositoryProvider;
    this.userDataRepositoryProvider = userDataRepositoryProvider;
    this.sdkEventUseCaseProvider = sdkEventUseCaseProvider;
  }

  @Override
  public ReminderUseCase get() {
    return newInstance(contextProvider.get(), orderReminderRepositoryProvider.get(), userDataRepositoryProvider.get(), sdkEventUseCaseProvider.get());
  }

  public static ReminderUseCase_Factory create(Provider<Context> contextProvider,
      Provider<OrderReminderRepository> orderReminderRepositoryProvider,
      Provider<UserDataRepository> userDataRepositoryProvider,
      Provider<SdkEventUseCase> sdkEventUseCaseProvider) {
    return new ReminderUseCase_Factory(contextProvider, orderReminderRepositoryProvider, userDataRepositoryProvider, sdkEventUseCaseProvider);
  }

  public static ReminderUseCase newInstance(Context context,
      OrderReminderRepository orderReminderRepository, UserDataRepository userDataRepository,
      SdkEventUseCase sdkEventUseCase) {
    return new ReminderUseCase(context, orderReminderRepository, userDataRepository, sdkEventUseCase);
  }
}
