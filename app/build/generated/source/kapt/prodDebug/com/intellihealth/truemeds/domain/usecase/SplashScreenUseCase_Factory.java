package com.intellihealth.truemeds.domain.usecase;

import com.intellihealth.truemeds.domain.repository.SplashScreenRepository;
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
public final class SplashScreenUseCase_Factory implements Factory<SplashScreenUseCase> {
  private final Provider<SplashScreenRepository> splashScreenRepositoryProvider;

  private final Provider<LocalDbUseCase> localDbUseCaseProvider;

  private final Provider<SdkEventUseCase> sdkEventUseCaseProvider;

  public SplashScreenUseCase_Factory(
      Provider<SplashScreenRepository> splashScreenRepositoryProvider,
      Provider<LocalDbUseCase> localDbUseCaseProvider,
      Provider<SdkEventUseCase> sdkEventUseCaseProvider) {
    this.splashScreenRepositoryProvider = splashScreenRepositoryProvider;
    this.localDbUseCaseProvider = localDbUseCaseProvider;
    this.sdkEventUseCaseProvider = sdkEventUseCaseProvider;
  }

  @Override
  public SplashScreenUseCase get() {
    return newInstance(splashScreenRepositoryProvider.get(), localDbUseCaseProvider.get(), sdkEventUseCaseProvider.get());
  }

  public static SplashScreenUseCase_Factory create(
      Provider<SplashScreenRepository> splashScreenRepositoryProvider,
      Provider<LocalDbUseCase> localDbUseCaseProvider,
      Provider<SdkEventUseCase> sdkEventUseCaseProvider) {
    return new SplashScreenUseCase_Factory(splashScreenRepositoryProvider, localDbUseCaseProvider, sdkEventUseCaseProvider);
  }

  public static SplashScreenUseCase newInstance(SplashScreenRepository splashScreenRepository,
      LocalDbUseCase localDbUseCase, SdkEventUseCase sdkEventUseCase) {
    return new SplashScreenUseCase(splashScreenRepository, localDbUseCase, sdkEventUseCase);
  }
}
