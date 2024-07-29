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
public final class CleverTapEvent_Factory implements Factory<CleverTapEvent> {
  private final Provider<Context> contextProvider;

  public CleverTapEvent_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public CleverTapEvent get() {
    return newInstance(contextProvider.get());
  }

  public static CleverTapEvent_Factory create(Provider<Context> contextProvider) {
    return new CleverTapEvent_Factory(contextProvider);
  }

  public static CleverTapEvent newInstance(Context context) {
    return new CleverTapEvent(context);
  }
}
