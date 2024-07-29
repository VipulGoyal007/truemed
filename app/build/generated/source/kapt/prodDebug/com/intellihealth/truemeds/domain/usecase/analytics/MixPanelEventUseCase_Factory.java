package com.intellihealth.truemeds.domain.usecase.analytics;

import com.intellihealth.truemeds.presentation.analytics.MixPanelEvent;
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
public final class MixPanelEventUseCase_Factory implements Factory<MixPanelEventUseCase> {
  private final Provider<MixPanelEvent> mixPanelEventProvider;

  public MixPanelEventUseCase_Factory(Provider<MixPanelEvent> mixPanelEventProvider) {
    this.mixPanelEventProvider = mixPanelEventProvider;
  }

  @Override
  public MixPanelEventUseCase get() {
    return newInstance(mixPanelEventProvider.get());
  }

  public static MixPanelEventUseCase_Factory create(Provider<MixPanelEvent> mixPanelEventProvider) {
    return new MixPanelEventUseCase_Factory(mixPanelEventProvider);
  }

  public static MixPanelEventUseCase newInstance(MixPanelEvent mixPanelEvent) {
    return new MixPanelEventUseCase(mixPanelEvent);
  }
}
