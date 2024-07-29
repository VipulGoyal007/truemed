package com.intellihealth.truemeds.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

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
public final class ApiModule_ProvidesRetrofitFactory implements Factory<Retrofit> {
  private final ApiModule module;

  private final Provider<OkHttpClient> okHttpClientProvider;

  public ApiModule_ProvidesRetrofitFactory(ApiModule module,
      Provider<OkHttpClient> okHttpClientProvider) {
    this.module = module;
    this.okHttpClientProvider = okHttpClientProvider;
  }

  @Override
  public Retrofit get() {
    return providesRetrofit(module, okHttpClientProvider.get());
  }

  public static ApiModule_ProvidesRetrofitFactory create(ApiModule module,
      Provider<OkHttpClient> okHttpClientProvider) {
    return new ApiModule_ProvidesRetrofitFactory(module, okHttpClientProvider);
  }

  public static Retrofit providesRetrofit(ApiModule instance, OkHttpClient okHttpClient) {
    return Preconditions.checkNotNullFromProvides(instance.providesRetrofit(okHttpClient));
  }
}
