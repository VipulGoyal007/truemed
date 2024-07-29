package com.intellihealth.truemeds.domain.usecase.analytics;

import com.intellihealth.truemeds.presentation.analytics.AppsFlyerEvent;
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
public final class AppsFlyerEventUseCase_Factory implements Factory<AppsFlyerEventUseCase> {
  private final Provider<AppsFlyerEvent> appsFlyerEventProvider;

  public AppsFlyerEventUseCase_Factory(Provider<AppsFlyerEvent> appsFlyerEventProvider) {
    this.appsFlyerEventProvider = appsFlyerEventProvider;
  }

  @Override
  public AppsFlyerEventUseCase get() {
    return newInstance(appsFlyerEventProvider.get());
  }

  public static AppsFlyerEventUseCase_Factory create(
      Provider<AppsFlyerEvent> appsFlyerEventProvider) {
    return new AppsFlyerEventUseCase_Factory(appsFlyerEventProvider);
  }

  public static AppsFlyerEventUseCase newInstance(AppsFlyerEvent appsFlyerEvent) {
    return new AppsFlyerEventUseCase(appsFlyerEvent);
  }
}
