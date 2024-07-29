package com.intellihealth.truemeds.di;

import com.intellihealth.truemeds.data.api.WalletAndReferralApi;
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
public final class WalletAndReferralNetworkModule_ProvidesWalletAndReferralApiFactory implements Factory<WalletAndReferralApi> {
  private final WalletAndReferralNetworkModule module;

  private final Provider<Retrofit> retrofitProvider;

  public WalletAndReferralNetworkModule_ProvidesWalletAndReferralApiFactory(
      WalletAndReferralNetworkModule module, Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public WalletAndReferralApi get() {
    return providesWalletAndReferralApi(module, retrofitProvider.get());
  }

  public static WalletAndReferralNetworkModule_ProvidesWalletAndReferralApiFactory create(
      WalletAndReferralNetworkModule module, Provider<Retrofit> retrofitProvider) {
    return new WalletAndReferralNetworkModule_ProvidesWalletAndReferralApiFactory(module, retrofitProvider);
  }

  public static WalletAndReferralApi providesWalletAndReferralApi(
      WalletAndReferralNetworkModule instance, Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(instance.providesWalletAndReferralApi(retrofit));
  }
}
