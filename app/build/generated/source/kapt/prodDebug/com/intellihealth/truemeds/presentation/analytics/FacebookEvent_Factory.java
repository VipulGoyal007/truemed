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
public final class FacebookEvent_Factory implements Factory<FacebookEvent> {
  private final Provider<Context> contextProvider;

  public FacebookEvent_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public FacebookEvent get() {
    return newInstance(contextProvider.get());
  }

  public static FacebookEvent_Factory create(Provider<Context> contextProvider) {
    return new FacebookEvent_Factory(contextProvider);
  }

  public static FacebookEvent newInstance(Context context) {
    return new FacebookEvent(context);
  }
}
