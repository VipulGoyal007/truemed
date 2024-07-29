package com.intellihealth.truemeds.data.repository;

import com.intellihealth.truemeds.data.repository.datasource.remote.TmWalletRemoteDataSource;
import com.intellihealth.truemeds.data.utils.ApiCallInitClass;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class TmWalletRepositoryImpl_Factory implements Factory<TmWalletRepositoryImpl> {
  private final Provider<TmWalletRemoteDataSource> walletRemoteDataSourceProvider;

  private final Provider<ApiCallInitClass> apiCallInitClassProvider;

  public TmWalletRepositoryImpl_Factory(
      Provider<TmWalletRemoteDataSource> walletRemoteDataSourceProvider,
      Provider<ApiCallInitClass> apiCallInitClassProvider) {
    this.walletRemoteDataSourceProvider = walletRemoteDataSourceProvider;
    this.apiCallInitClassProvider = apiCallInitClassProvider;
  }

  @Override
  public TmWalletRepositoryImpl get() {
    return newInstance(walletRemoteDataSourceProvider.get(), apiCallInitClassProvider.get());
  }

  public static TmWalletRepositoryImpl_Factory create(
      Provider<TmWalletRemoteDataSource> walletRemoteDataSourceProvider,
      Provider<ApiCallInitClass> apiCallInitClassProvider) {
    return new TmWalletRepositoryImpl_Factory(walletRemoteDataSourceProvider, apiCallInitClassProvider);
  }

  public static TmWalletRepositoryImpl newInstance(TmWalletRemoteDataSource walletRemoteDataSource,
      ApiCallInitClass apiCallInitClass) {
    return new TmWalletRepositoryImpl(walletRemoteDataSource, apiCallInitClass);
  }
}
