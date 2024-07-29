package com.intellihealth.truemeds.data.repository;

import com.intellihealth.truemeds.data.repository.datasource.remote.OrderStatusRemoteDataSource;
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
public final class OrderStatusRepositoryImpl_Factory implements Factory<OrderStatusRepositoryImpl> {
  private final Provider<OrderStatusRemoteDataSource> orderStatusRemoteDataSourceProvider;

  private final Provider<ApiCallInitClass> apiCallInitClassProvider;

  public OrderStatusRepositoryImpl_Factory(
      Provider<OrderStatusRemoteDataSource> orderStatusRemoteDataSourceProvider,
      Provider<ApiCallInitClass> apiCallInitClassProvider) {
    this.orderStatusRemoteDataSourceProvider = orderStatusRemoteDataSourceProvider;
    this.apiCallInitClassProvider = apiCallInitClassProvider;
  }

  @Override
  public OrderStatusRepositoryImpl get() {
    return newInstance(orderStatusRemoteDataSourceProvider.get(), apiCallInitClassProvider.get());
  }

  public static OrderStatusRepositoryImpl_Factory create(
      Provider<OrderStatusRemoteDataSource> orderStatusRemoteDataSourceProvider,
      Provider<ApiCallInitClass> apiCallInitClassProvider) {
    return new OrderStatusRepositoryImpl_Factory(orderStatusRemoteDataSourceProvider, apiCallInitClassProvider);
  }

  public static OrderStatusRepositoryImpl newInstance(
      OrderStatusRemoteDataSource orderStatusRemoteDataSource, ApiCallInitClass apiCallInitClass) {
    return new OrderStatusRepositoryImpl(orderStatusRemoteDataSource, apiCallInitClass);
  }
}
