package com.intellihealth.truemeds.data.repository.datasourceimpl.remote;

import com.intellihealth.truemeds.data.api.WalletAndReferralApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class TmWalletRemoteDataSourceImpl_Factory implements Factory<TmWalletRemoteDataSourceImpl> {
  private final Provider<WalletAndReferralApi> walletAndReferralApiProvider;

  private final Provider<String> contentTypeProvider;

  public TmWalletRemoteDataSourceImpl_Factory(
      Provider<WalletAndReferralApi> walletAndReferralApiProvider,
      Provider<String> contentTypeProvider) {
    this.walletAndReferralApiProvider = walletAndReferralApiProvider;
    this.contentTypeProvider = contentTypeProvider;
  }

  @Override
  public TmWalletRemoteDataSourceImpl get() {
    return newInstance(walletAndReferralApiProvider.get(), contentTypeProvider.get());
  }

  public static TmWalletRemoteDataSourceImpl_Factory create(
      Provider<WalletAndReferralApi> walletAndReferralApiProvider,
      Provider<String> contentTypeProvider) {
    return new TmWalletRemoteDataSourceImpl_Factory(walletAndReferralApiProvider, contentTypeProvider);
  }

  public static TmWalletRemoteDataSourceImpl newInstance(WalletAndReferralApi walletAndReferralApi,
      String contentType) {
    return new TmWalletRemoteDataSourceImpl(walletAndReferralApi, contentType);
  }
}
