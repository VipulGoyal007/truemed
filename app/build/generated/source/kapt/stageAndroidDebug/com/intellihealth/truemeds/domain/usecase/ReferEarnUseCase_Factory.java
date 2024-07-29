package com.intellihealth.truemeds.domain.usecase;

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
public final class ReferEarnUseCase_Factory implements Factory<ReferEarnUseCase> {
  private final Provider<Context> appContextProvider;

  public ReferEarnUseCase_Factory(Provider<Context> appContextProvider) {
    this.appContextProvider = appContextProvider;
  }

  @Override
  public ReferEarnUseCase get() {
    return newInstance(appContextProvider.get());
  }

  public static ReferEarnUseCase_Factory create(Provider<Context> appContextProvider) {
    return new ReferEarnUseCase_Factory(appContextProvider);
  }

  public static ReferEarnUseCase newInstance(Context appContext) {
    return new ReferEarnUseCase(appContext);
  }
}
