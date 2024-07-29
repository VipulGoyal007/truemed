package com.intellihealth.truemeds.data.repository;

import com.intellihealth.truemeds.data.repository.datasource.remote.OrderReminderRemoteDataSource;
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
public final class OrderReminderRepositoryImpl_Factory implements Factory<OrderReminderRepositoryImpl> {
  private final Provider<OrderReminderRemoteDataSource> orderReminderRemoteDataSourceProvider;

  private final Provider<ApiCallInitClass> apiCallInitClassProvider;

  public OrderReminderRepositoryImpl_Factory(
      Provider<OrderReminderRemoteDataSource> orderReminderRemoteDataSourceProvider,
      Provider<ApiCallInitClass> apiCallInitClassProvider) {
    this.orderReminderRemoteDataSourceProvider = orderReminderRemoteDataSourceProvider;
    this.apiCallInitClassProvider = apiCallInitClassProvider;
  }

  @Override
  public OrderReminderRepositoryImpl get() {
    return newInstance(orderReminderRemoteDataSourceProvider.get(), apiCallInitClassProvider.get());
  }

  public static OrderReminderRepositoryImpl_Factory create(
      Provider<OrderReminderRemoteDataSource> orderReminderRemoteDataSourceProvider,
      Provider<ApiCallInitClass> apiCallInitClassProvider) {
    return new OrderReminderRepositoryImpl_Factory(orderReminderRemoteDataSourceProvider, apiCallInitClassProvider);
  }

  public static OrderReminderRepositoryImpl newInstance(
      OrderReminderRemoteDataSource orderReminderRemoteDataSource,
      ApiCallInitClass apiCallInitClass) {
    return new OrderReminderRepositoryImpl(orderReminderRemoteDataSource, apiCallInitClass);
  }
}
