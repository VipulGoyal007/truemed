package com.intellihealth.truemeds.data.repository;

import com.intellihealth.truemeds.data.repository.datasource.remote.ProductListAndDetailsRemoteDataSource;
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
public final class ProductListAndDetailsRepositoryImpl_Factory implements Factory<ProductListAndDetailsRepositoryImpl> {
  private final Provider<ProductListAndDetailsRemoteDataSource> productListAndDetailsRemoteDataSourceProvider;

  private final Provider<ApiCallInitClass> apiCallInitClassProvider;

  public ProductListAndDetailsRepositoryImpl_Factory(
      Provider<ProductListAndDetailsRemoteDataSource> productListAndDetailsRemoteDataSourceProvider,
      Provider<ApiCallInitClass> apiCallInitClassProvider) {
    this.productListAndDetailsRemoteDataSourceProvider = productListAndDetailsRemoteDataSourceProvider;
    this.apiCallInitClassProvider = apiCallInitClassProvider;
  }

  @Override
  public ProductListAndDetailsRepositoryImpl get() {
    return newInstance(productListAndDetailsRemoteDataSourceProvider.get(), apiCallInitClassProvider.get());
  }

  public static ProductListAndDetailsRepositoryImpl_Factory create(
      Provider<ProductListAndDetailsRemoteDataSource> productListAndDetailsRemoteDataSourceProvider,
      Provider<ApiCallInitClass> apiCallInitClassProvider) {
    return new ProductListAndDetailsRepositoryImpl_Factory(productListAndDetailsRemoteDataSourceProvider, apiCallInitClassProvider);
  }

  public static ProductListAndDetailsRepositoryImpl newInstance(
      ProductListAndDetailsRemoteDataSource productListAndDetailsRemoteDataSource,
      ApiCallInitClass apiCallInitClass) {
    return new ProductListAndDetailsRepositoryImpl(productListAndDetailsRemoteDataSource, apiCallInitClass);
  }
}
