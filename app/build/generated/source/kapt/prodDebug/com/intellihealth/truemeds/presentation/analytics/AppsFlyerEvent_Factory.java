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
public final class AppsFlyerEvent_Factory implements Factory<AppsFlyerEvent> {
  private final Provider<Context> contextProvider;

  public AppsFlyerEvent_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public AppsFlyerEvent get() {
    return newInstance(contextProvider.get());
  }

  public static AppsFlyerEvent_Factory create(Provider<Context> contextProvider) {
    return new AppsFlyerEvent_Factory(contextProvider);
  }

  public static AppsFlyerEvent newInstance(Context context) {
    return new AppsFlyerEvent(context);
  }
}
