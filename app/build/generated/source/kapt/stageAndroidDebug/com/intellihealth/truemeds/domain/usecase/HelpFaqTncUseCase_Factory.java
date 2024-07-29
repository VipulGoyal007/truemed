package com.intellihealth.truemeds.domain.usecase;

import android.content.Context;
import com.intellihealth.truemeds.domain.repository.HelpFaqAndTnCRepository;
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
public final class HelpFaqTncUseCase_Factory implements Factory<HelpFaqTncUseCase> {
  private final Provider<Context> appContextProvider;

  private final Provider<HelpFaqAndTnCRepository> helpFaqAndTnCRepositoryProvider;

  private final Provider<SdkEventUseCase> sdkEventUseCaseProvider;

  public HelpFaqTncUseCase_Factory(Provider<Context> appContextProvider,
      Provider<HelpFaqAndTnCRepository> helpFaqAndTnCRepositoryProvider,
      Provider<SdkEventUseCase> sdkEventUseCaseProvider) {
    this.appContextProvider = appContextProvider;
    this.helpFaqAndTnCRepositoryProvider = helpFaqAndTnCRepositoryProvider;
    this.sdkEventUseCaseProvider = sdkEventUseCaseProvider;
  }

  @Override
  public HelpFaqTncUseCase get() {
    return newInstance(appContextProvider.get(), helpFaqAndTnCRepositoryProvider.get(), sdkEventUseCaseProvider.get());
  }

  public static HelpFaqTncUseCase_Factory create(Provider<Context> appContextProvider,
      Provider<HelpFaqAndTnCRepository> helpFaqAndTnCRepositoryProvider,
      Provider<SdkEventUseCase> sdkEventUseCaseProvider) {
    return new HelpFaqTncUseCase_Factory(appContextProvider, helpFaqAndTnCRepositoryProvider, sdkEventUseCaseProvider);
  }

  public static HelpFaqTncUseCase newInstance(Context appContext,
      HelpFaqAndTnCRepository helpFaqAndTnCRepository, SdkEventUseCase sdkEventUseCase) {
    return new HelpFaqTncUseCase(appContext, helpFaqAndTnCRepository, sdkEventUseCase);
  }
}
