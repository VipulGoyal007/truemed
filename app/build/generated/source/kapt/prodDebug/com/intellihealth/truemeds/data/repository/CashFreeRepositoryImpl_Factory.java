package com.intellihealth.truemeds.data.repository;

import com.intellihealth.truemeds.data.repository.datasource.remote.CashFreeRemoteDataSource;
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
public final class CashFreeRepositoryImpl_Factory implements Factory<CashFreeRepositoryImpl> {
  private final Provider<CashFreeRemoteDataSource> cashFreeRemoteDataSourceProvider;

  private final Provider<ApiCallInitClass> apiCallInitClassProvider;

  public CashFreeRepositoryImpl_Factory(
      Provider<CashFreeRemoteDataSource> cashFreeRemoteDataSourceProvider,
      Provider<ApiCallInitClass> apiCallInitClassProvider) {
    this.cashFreeRemoteDataSourceProvider = cashFreeRemoteDataSourceProvider;
    this.apiCallInitClassProvider = apiCallInitClassProvider;
  }

  @Override
  public CashFreeRepositoryImpl get() {
    return newInstance(cashFreeRemoteDataSourceProvider.get(), apiCallInitClassProvider.get());
  }

  public static CashFreeRepositoryImpl_Factory create(
      Provider<CashFreeRemoteDataSource> cashFreeRemoteDataSourceProvider,
      Provider<ApiCallInitClass> apiCallInitClassProvider) {
    return new CashFreeRepositoryImpl_Factory(cashFreeRemoteDataSourceProvider, apiCallInitClassProvider);
  }

  public static CashFreeRepositoryImpl newInstance(
      CashFreeRemoteDataSource cashFreeRemoteDataSource, ApiCallInitClass apiCallInitClass) {
    return new CashFreeRepositoryImpl(cashFreeRemoteDataSource, apiCallInitClass);
  }
}
