package com.intellihealth.truemeds.presentation.viewmodel;

import com.intellihealth.truemeds.domain.usecase.analytics.AppsFlyerEventUseCase;
import com.intellihealth.truemeds.domain.usecase.analytics.CleverTapEventUseCase;
import com.intellihealth.truemeds.domain.usecase.analytics.MixPanelEventUseCase;
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
public final class OtcSuperCategoryViewModel_Factory implements Factory<OtcSuperCategoryViewModel> {
  private final Provider<MixPanelEventUseCase> mixPanelEventUseCaseProvider;

  private final Provider<CleverTapEventUseCase> cleverTapEventUseCaseProvider;

  private final Provider<AppsFlyerEventUseCase> appsFlyerEventUseCaseProvider;

  public OtcSuperCategoryViewModel_Factory(
      Provider<MixPanelEventUseCase> mixPanelEventUseCaseProvider,
      Provider<CleverTapEventUseCase> cleverTapEventUseCaseProvider,
      Provider<AppsFlyerEventUseCase> appsFlyerEventUseCaseProvider) {
    this.mixPanelEventUseCaseProvider = mixPanelEventUseCaseProvider;
    this.cleverTapEventUseCaseProvider = cleverTapEventUseCaseProvider;
    this.appsFlyerEventUseCaseProvider = appsFlyerEventUseCaseProvider;
  }

  @Override
  public OtcSuperCategoryViewModel get() {
    return newInstance(mixPanelEventUseCaseProvider.get(), cleverTapEventUseCaseProvider.get(), appsFlyerEventUseCaseProvider.get());
  }

  public static OtcSuperCategoryViewModel_Factory create(
      Provider<MixPanelEventUseCase> mixPanelEventUseCaseProvider,
      Provider<CleverTapEventUseCase> cleverTapEventUseCaseProvider,
      Provider<AppsFlyerEventUseCase> appsFlyerEventUseCaseProvider) {
    return new OtcSuperCategoryViewModel_Factory(mixPanelEventUseCaseProvider, cleverTapEventUseCaseProvider, appsFlyerEventUseCaseProvider);
  }

  public static OtcSuperCategoryViewModel newInstance(MixPanelEventUseCase mixPanelEventUseCase,
      CleverTapEventUseCase cleverTapEventUseCase, AppsFlyerEventUseCase appsFlyerEventUseCase) {
    return new OtcSuperCategoryViewModel(mixPanelEventUseCase, cleverTapEventUseCase, appsFlyerEventUseCase);
  }
}
