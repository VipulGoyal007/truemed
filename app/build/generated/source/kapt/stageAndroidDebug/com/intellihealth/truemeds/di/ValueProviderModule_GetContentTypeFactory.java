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
public final class ValueProviderModule_GetContentTypeFactory implements Factory<String> {
  private final ValueProviderModule module;

  public ValueProviderModule_GetContentTypeFactory(ValueProviderModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return getContentType(module);
  }

  public static ValueProviderModule_GetContentTypeFactory create(ValueProviderModule module) {
    return new ValueProviderModule_GetContentTypeFactory(module);
  }

  public static String getContentType(ValueProviderModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.getContentType());
  }
}
