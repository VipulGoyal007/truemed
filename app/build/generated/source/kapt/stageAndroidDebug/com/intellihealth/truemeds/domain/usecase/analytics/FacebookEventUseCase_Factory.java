package com.intellihealth.truemeds.domain.usecase.analytics;

import com.intellihealth.truemeds.presentation.analytics.FacebookEvent;
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
public final class FacebookEventUseCase_Factory implements Factory<FacebookEventUseCase> {
  private final Provider<FacebookEvent> facebookEventProvider;

  public FacebookEventUseCase_Factory(Provider<FacebookEvent> facebookEventProvider) {
    this.facebookEventProvider = facebookEventProvider;
  }

  @Override
  public FacebookEventUseCase get() {
    return newInstance(facebookEventProvider.get());
  }

  public static FacebookEventUseCase_Factory create(Provider<FacebookEvent> facebookEventProvider) {
    return new FacebookEventUseCase_Factory(facebookEventProvider);
  }

  public static FacebookEventUseCase newInstance(FacebookEvent facebookEvent) {
    return new FacebookEventUseCase(facebookEvent);
  }
}
