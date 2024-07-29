package com.intellihealth.truemeds.domain.usecase.analytics;

import com.intellihealth.truemeds.presentation.analytics.FirebaseEvent;
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
public final class FirebaseEventUseCase_Factory implements Factory<FirebaseEventUseCase> {
  private final Provider<FirebaseEvent> firebaseEventProvider;

  public FirebaseEventUseCase_Factory(Provider<FirebaseEvent> firebaseEventProvider) {
    this.firebaseEventProvider = firebaseEventProvider;
  }

  @Override
  public FirebaseEventUseCase get() {
    return newInstance(firebaseEventProvider.get());
  }

  public static FirebaseEventUseCase_Factory create(Provider<FirebaseEvent> firebaseEventProvider) {
    return new FirebaseEventUseCase_Factory(firebaseEventProvider);
  }

  public static FirebaseEventUseCase newInstance(FirebaseEvent firebaseEvent) {
    return new FirebaseEventUseCase(firebaseEvent);
  }
}
