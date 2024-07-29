package com.intellihealth.truemeds.domain.usecase;

import com.intellihealth.truemeds.domain.repository.UserDataRepository;
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
public final class UserDataUseCase_Factory implements Factory<UserDataUseCase> {
  private final Provider<LocalDbUseCase> localDbUseCaseProvider;

  private final Provider<UserDataRepository> userDataRepositoryProvider;

  private final Provider<SdkEventUseCase> sdkEventUseCaseProvider;

  public UserDataUseCase_Factory(Provider<LocalDbUseCase> localDbUseCaseProvider,
      Provider<UserDataRepository> userDataRepositoryProvider,
      Provider<SdkEventUseCase> sdkEventUseCaseProvider) {
    this.localDbUseCaseProvider = localDbUseCaseProvider;
    this.userDataRepositoryProvider = userDataRepositoryProvider;
    this.sdkEventUseCaseProvider = sdkEventUseCaseProvider;
  }

  @Override
  public UserDataUseCase get() {
    return newInstance(localDbUseCaseProvider.get(), userDataRepositoryProvider.get(), sdkEventUseCaseProvider.get());
  }

  public static UserDataUseCase_Factory create(Provider<LocalDbUseCase> localDbUseCaseProvider,
      Provider<UserDataRepository> userDataRepositoryProvider,
      Provider<SdkEventUseCase> sdkEventUseCaseProvider) {
    return new UserDataUseCase_Factory(localDbUseCaseProvider, userDataRepositoryProvider, sdkEventUseCaseProvider);
  }

  public static UserDataUseCase newInstance(LocalDbUseCase localDbUseCase,
      UserDataRepository userDataRepository, SdkEventUseCase sdkEventUseCase) {
    return new UserDataUseCase(localDbUseCase, userDataRepository, sdkEventUseCase);
  }
}
