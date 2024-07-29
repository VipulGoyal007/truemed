package com.intellihealth.truemeds.presentation.analytics;

import android.content.Context;
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
public final class FirebaseEvent_Factory implements Factory<FirebaseEvent> {
  private final Provider<Context> contextProvider;

  public FirebaseEvent_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public FirebaseEvent get() {
    return newInstance(contextProvider.get());
  }

  public static FirebaseEvent_Factory create(Provider<Context> contextProvider) {
    return new FirebaseEvent_Factory(contextProvider);
  }

  public static FirebaseEvent newInstance(Context context) {
    return new FirebaseEvent(context);
  }
}
