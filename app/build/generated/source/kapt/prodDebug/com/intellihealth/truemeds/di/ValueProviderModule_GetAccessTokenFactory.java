package com.intellihealth.truemeds.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("javax.inject.Named")
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
public final class ValueProviderModule_GetAccessTokenFactory implements Factory<String> {
  private final ValueProviderModule module;

  public ValueProviderModule_GetAccessTokenFactory(ValueProviderModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return getAccessToken(module);
  }

  public static ValueProviderModule_GetAccessTokenFactory create(ValueProviderModule module) {
    return new ValueProviderModule_GetAccessTokenFactory(module);
  }

  public static String getAccessToken(ValueProviderModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.getAccessToken());
  }
}
