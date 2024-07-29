package com.intellihealth.truemeds.presentation.viewmodel;

import com.intellihealth.truemeds.domain.usecase.HomePageUseCase;
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
public final class HealthArticlesViewModel_Factory implements Factory<HealthArticlesViewModel> {
  private final Provider<HomePageUseCase> homePageUseCaseProvider;

  private final Provider<SdkEventUseCase> sdkEventUseCaseProvider;

  public HealthArticlesViewModel_Factory(Provider<HomePageUseCase> homePageUseCaseProvider,
      Provider<SdkEventUseCase> sdkEventUseCaseProvider) {
    this.homePageUseCaseProvider = homePageUseCaseProvider;
    this.sdkEventUseCaseProvider = sdkEventUseCaseProvider;
  }

  @Override
  public HealthArticlesViewModel get() {
    return newInstance(homePageUseCaseProvider.get(), sdkEventUseCaseProvider.get());
  }

  public static HealthArticlesViewModel_Factory create(
      Provider<HomePageUseCase> homePageUseCaseProvider,
      Provider<SdkEventUseCase> sdkEventUseCaseProvider) {
    return new HealthArticlesViewModel_Factory(homePageUseCaseProvider, sdkEventUseCaseProvider);
  }

  public static HealthArticlesViewModel newInstance(HomePageUseCase homePageUseCase,
      SdkEventUseCase sdkEventUseCase) {
    return new HealthArticlesViewModel(homePageUseCase, sdkEventUseCase);
  }
}
