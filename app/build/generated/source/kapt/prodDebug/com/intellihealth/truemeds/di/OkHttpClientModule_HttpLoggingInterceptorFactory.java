package com.intellihealth.truemeds.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import okhttp3.logging.HttpLoggingInterceptor;

@ScopeMetadata("javax.inject.Singleton")
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
public final class OkHttpClientModule_HttpLoggingInterceptorFactory implements Factory<HttpLoggingInterceptor> {
  private final OkHttpClientModule module;

  public OkHttpClientModule_HttpLoggingInterceptorFactory(OkHttpClientModule module) {
    this.module = module;
  }

  @Override
  public HttpLoggingInterceptor get() {
    return httpLoggingInterceptor(module);
  }

  public static OkHttpClientModule_HttpLoggingInterceptorFactory create(OkHttpClientModule module) {
    return new OkHttpClientModule_HttpLoggingInterceptorFactory(module);
  }

  public static HttpLoggingInterceptor httpLoggingInterceptor(OkHttpClientModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.httpLoggingInterceptor());
  }
}
