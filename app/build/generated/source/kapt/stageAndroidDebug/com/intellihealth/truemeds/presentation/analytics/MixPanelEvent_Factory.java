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
public final class MixPanelEvent_Factory implements Factory<MixPanelEvent> {
  private final Provider<Context> contextProvider;

  public MixPanelEvent_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public MixPanelEvent get() {
    return newInstance(contextProvider.get());
  }

  public static MixPanelEvent_Factory create(Provider<Context> contextProvider) {
    return new MixPanelEvent_Factory(contextProvider);
  }

  public static MixPanelEvent newInstance(Context context) {
    return new MixPanelEvent(context);
  }
}
