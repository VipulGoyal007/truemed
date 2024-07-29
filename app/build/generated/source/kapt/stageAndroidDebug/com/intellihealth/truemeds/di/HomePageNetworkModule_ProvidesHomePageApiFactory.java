package com.intellihealth.truemeds.di;

import com.intellihealth.truemeds.data.api.HomePageApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
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
public final class HomePageNetworkModule_ProvidesHomePageApiFactory implements Factory<HomePageApi> {
  private final HomePageNetworkModule module;

  private final Provider<Retrofit> retrofitProvider;

  public HomePageNetworkModule_ProvidesHomePageApiFactory(HomePageNetworkModule module,
      Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public HomePageApi get() {
    return providesHomePageApi(module, retrofitProvider.get());
  }

  public static HomePageNetworkModule_ProvidesHomePageApiFactory create(
      HomePageNetworkModule module, Provider<Retrofit> retrofitProvider) {
    return new HomePageNetworkModule_ProvidesHomePageApiFactory(module, retrofitProvider);
  }

  public static HomePageApi providesHomePageApi(HomePageNetworkModule instance, Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(instance.providesHomePageApi(retrofit));
  }
}
