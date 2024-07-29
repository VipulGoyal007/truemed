package com.intellihealth.truemeds.data.repository;

import com.intellihealth.truemeds.data.repository.datasource.remote.CancelOrderRemoteDataSource;
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
public final class CancelOrderRepositoryImpl_Factory implements Factory<CancelOrderRepositoryImpl> {
  private final Provider<CancelOrderRemoteDataSource> cancelOrderRemoteDataSourceProvider;

  private final Provider<ApiCallInitClass> apiCallInitClassProvider;

  public CancelOrderRepositoryImpl_Factory(
      Provider<CancelOrderRemoteDataSource> cancelOrderRemoteDataSourceProvider,
      Provider<ApiCallInitClass> apiCallInitClassProvider) {
    this.cancelOrderRemoteDataSourceProvider = cancelOrderRemoteDataSourceProvider;
    this.apiCallInitClassProvider = apiCallInitClassProvider;
  }

  @Override
  public CancelOrderRepositoryImpl get() {
    return newInstance(cancelOrderRemoteDataSourceProvider.get(), apiCallInitClassProvider.get());
  }

  public static CancelOrderRepositoryImpl_Factory create(
      Provider<CancelOrderRemoteDataSource> cancelOrderRemoteDataSourceProvider,
      Provider<ApiCallInitClass> apiCallInitClassProvider) {
    return new CancelOrderRepositoryImpl_Factory(cancelOrderRemoteDataSourceProvider, apiCallInitClassProvider);
  }

  public static CancelOrderRepositoryImpl newInstance(
      CancelOrderRemoteDataSource cancelOrderRemoteDataSource, ApiCallInitClass apiCallInitClass) {
    return new CancelOrderRepositoryImpl(cancelOrderRemoteDataSource, apiCallInitClass);
  }
}
