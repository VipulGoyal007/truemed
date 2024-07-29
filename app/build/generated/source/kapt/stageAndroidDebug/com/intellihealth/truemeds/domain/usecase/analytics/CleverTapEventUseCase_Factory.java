package com.intellihealth.truemeds.domain.usecase.analytics;

import com.intellihealth.truemeds.presentation.analytics.CleverTapEvent;
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
public final class CleverTapEventUseCase_Factory implements Factory<CleverTapEventUseCase> {
  private final Provider<CleverTapEvent> cleverTapEventProvider;

  public CleverTapEventUseCase_Factory(Provider<CleverTapEvent> cleverTapEventProvider) {
    this.cleverTapEventProvider = cleverTapEventProvider;
  }

  @Override
  public CleverTapEventUseCase get() {
    return newInstance(cleverTapEventProvider.get());
  }

  public static CleverTapEventUseCase_Factory create(
      Provider<CleverTapEvent> cleverTapEventProvider) {
    return new CleverTapEventUseCase_Factory(cleverTapEventProvider);
  }

  public static CleverTapEventUseCase newInstance(CleverTapEvent cleverTapEvent) {
    return new CleverTapEventUseCase(cleverTapEvent);
  }
}
