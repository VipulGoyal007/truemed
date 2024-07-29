package com.intellihealth.truemeds.di;

import com.intellihealth.truemeds.data.api.CancelOrderApi;
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
public final class CancelOrderNetworkModule_ProvidesCancelOrderApiFactory implements Factory<CancelOrderApi> {
  private final CancelOrderNetworkModule module;

  private final Provider<Retrofit> retrofitProvider;

  public CancelOrderNetworkModule_ProvidesCancelOrderApiFactory(CancelOrderNetworkModule module,
      Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public CancelOrderApi get() {
    return providesCancelOrderApi(module, retrofitProvider.get());
  }

  public static CancelOrderNetworkModule_ProvidesCancelOrderApiFactory create(
      CancelOrderNetworkModule module, Provider<Retrofit> retrofitProvider) {
    return new CancelOrderNetworkModule_ProvidesCancelOrderApiFactory(module, retrofitProvider);
  }

  public static CancelOrderApi providesCancelOrderApi(CancelOrderNetworkModule instance,
      Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(instance.providesCancelOrderApi(retrofit));
  }
}
