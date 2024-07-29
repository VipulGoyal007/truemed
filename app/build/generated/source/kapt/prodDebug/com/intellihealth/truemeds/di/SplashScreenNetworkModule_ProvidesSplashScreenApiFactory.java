package com.intellihealth.truemeds.di;

import com.intellihealth.truemeds.data.api.SplashScreenApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@ScopeMetadata
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
public final class SplashScreenNetworkModule_ProvidesSplashScreenApiFactory implements Factory<SplashScreenApi> {
  private final SplashScreenNetworkModule module;

  private final Provider<Retrofit> retrofitProvider;

  public SplashScreenNetworkModule_ProvidesSplashScreenApiFactory(SplashScreenNetworkModule module,
      Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public SplashScreenApi get() {
    return providesSplashScreenApi(module, retrofitProvider.get());
  }

  public static SplashScreenNetworkModule_ProvidesSplashScreenApiFactory create(
      SplashScreenNetworkModule module, Provider<Retrofit> retrofitProvider) {
    return new SplashScreenNetworkModule_ProvidesSplashScreenApiFactory(module, retrofitProvider);
  }

  public static SplashScreenApi providesSplashScreenApi(SplashScreenNetworkModule instance,
      Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(instance.providesSplashScreenApi(retrofit));
  }
}
