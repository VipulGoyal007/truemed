package com.intellihealth.truemeds.domain.usecase.analytics;

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
public final class SdkEventUseCase_Factory implements Factory<SdkEventUseCase> {
  private final Provider<MixPanelEventUseCase> mixPanelEventUseCaseProvider;

  private final Provider<AppsFlyerEventUseCase> appsFlyerEventUseCaseProvider;

  private final Provider<CleverTapEventUseCase> cleverTapEventUseCaseProvider;

  private final Provider<FirebaseEventUseCase> firebaseEventUseCaseProvider;

  private final Provider<FacebookEventUseCase> facebookEventUseCaseProvider;

  public SdkEventUseCase_Factory(Provider<MixPanelEventUseCase> mixPanelEventUseCaseProvider,
      Provider<AppsFlyerEventUseCase> appsFlyerEventUseCaseProvider,
      Provider<CleverTapEventUseCase> cleverTapEventUseCaseProvider,
      Provider<FirebaseEventUseCase> firebaseEventUseCaseProvider,
      Provider<FacebookEventUseCase> facebookEventUseCaseProvider) {
    this.mixPanelEventUseCaseProvider = mixPanelEventUseCaseProvider;
    this.appsFlyerEventUseCaseProvider = appsFlyerEventUseCaseProvider;
    this.cleverTapEventUseCaseProvider = cleverTapEventUseCaseProvider;
    this.firebaseEventUseCaseProvider = firebaseEventUseCaseProvider;
    this.facebookEventUseCaseProvider = facebookEventUseCaseProvider;
  }

  @Override
  public SdkEventUseCase get() {
    return newInstance(mixPanelEventUseCaseProvider.get(), appsFlyerEventUseCaseProvider.get(), cleverTapEventUseCaseProvider.get(), firebaseEventUseCaseProvider.get(), facebookEventUseCaseProvider.get());
  }

  public static SdkEventUseCase_Factory create(
      Provider<MixPanelEventUseCase> mixPanelEventUseCaseProvider,
      Provider<AppsFlyerEventUseCase> appsFlyerEventUseCaseProvider,
      Provider<CleverTapEventUseCase> cleverTapEventUseCaseProvider,
      Provider<FirebaseEventUseCase> firebaseEventUseCaseProvider,
      Provider<FacebookEventUseCase> facebookEventUseCaseProvider) {
    return new SdkEventUseCase_Factory(mixPanelEventUseCaseProvider, appsFlyerEventUseCaseProvider, cleverTapEventUseCaseProvider, firebaseEventUseCaseProvider, facebookEventUseCaseProvider);
  }

  public static SdkEventUseCase newInstance(MixPanelEventUseCase mixPanelEventUseCase,
      AppsFlyerEventUseCase appsFlyerEventUseCase, CleverTapEventUseCase cleverTapEventUseCase,
      FirebaseEventUseCase firebaseEventUseCase, FacebookEventUseCase facebookEventUseCase) {
    return new SdkEventUseCase(mixPanelEventUseCase, appsFlyerEventUseCase, cleverTapEventUseCase, firebaseEventUseCase, facebookEventUseCase);
  }
}
