package com.intellihealth.truemeds.di;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

@ScopeMetadata("javax.inject.Singleton")
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
public final class OkHttpClientModule_ProvidesOkHttpClientFactory implements Factory<OkHttpClient> {
  private final OkHttpClientModule module;

  private final Provider<Cache> cacheProvider;

  private final Provider<HttpLoggingInterceptor> httpLoggingInterceptorProvider;

  private final Provider<Context> contextProvider;

  public OkHttpClientModule_ProvidesOkHttpClientFactory(OkHttpClientModule module,
      Provider<Cache> cacheProvider,
      Provider<HttpLoggingInterceptor> httpLoggingInterceptorProvider,
      Provider<Context> contextProvider) {
    this.module = module;
    this.cacheProvider = cacheProvider;
    this.httpLoggingInterceptorProvider = httpLoggingInterceptorProvider;
    this.contextProvider = contextProvider;
  }

  @Override
  public OkHttpClient get() {
    return providesOkHttpClient(module, cacheProvider.get(), httpLoggingInterceptorProvider.get(), contextProvider.get());
  }

  public static OkHttpClientModule_ProvidesOkHttpClientFactory create(OkHttpClientModule module,
      Provider<Cache> cacheProvider,
      Provider<HttpLoggingInterceptor> httpLoggingInterceptorProvider,
      Provider<Context> contextProvider) {
    return new OkHttpClientModule_ProvidesOkHttpClientFactory(module, cacheProvider, httpLoggingInterceptorProvider, contextProvider);
  }

  public static OkHttpClient providesOkHttpClient(OkHttpClientModule instance, Cache cache,
      HttpLoggingInterceptor httpLoggingInterceptor, Context context) {
    return Preconditions.checkNotNullFromProvides(instance.providesOkHttpClient(cache, httpLoggingInterceptor, context));
  }
}
