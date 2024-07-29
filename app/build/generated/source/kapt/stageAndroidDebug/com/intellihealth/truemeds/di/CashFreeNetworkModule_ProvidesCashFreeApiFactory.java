package com.intellihealth.truemeds.di;

import com.intellihealth.truemeds.data.api.CashFreeApi;
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
public final class CashFreeNetworkModule_ProvidesCashFreeApiFactory implements Factory<CashFreeApi> {
  private final CashFreeNetworkModule module;

  private final Provider<Retrofit> retrofitProvider;

  public CashFreeNetworkModule_ProvidesCashFreeApiFactory(CashFreeNetworkModule module,
      Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public CashFreeApi get() {
    return providesCashFreeApi(module, retrofitProvider.get());
  }

  public static CashFreeNetworkModule_ProvidesCashFreeApiFactory create(
      CashFreeNetworkModule module, Provider<Retrofit> retrofitProvider) {
    return new CashFreeNetworkModule_ProvidesCashFreeApiFactory(module, retrofitProvider);
  }

  public static CashFreeApi providesCashFreeApi(CashFreeNetworkModule instance, Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(instance.providesCashFreeApi(retrofit));
  }
}
