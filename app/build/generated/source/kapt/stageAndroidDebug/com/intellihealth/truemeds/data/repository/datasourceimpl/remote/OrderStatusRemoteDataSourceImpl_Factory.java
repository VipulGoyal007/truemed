package com.intellihealth.truemeds.data.repository.datasourceimpl.remote;

import com.intellihealth.truemeds.data.api.OrderStatusApi;
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
public final class OrderStatusRemoteDataSourceImpl_Factory implements Factory<OrderStatusRemoteDataSourceImpl> {
  private final Provider<OrderStatusApi> orderStatusApiProvider;

  private final Provider<String> contentTypeProvider;

  public OrderStatusRemoteDataSourceImpl_Factory(Provider<OrderStatusApi> orderStatusApiProvider,
      Provider<String> contentTypeProvider) {
    this.orderStatusApiProvider = orderStatusApiProvider;
    this.contentTypeProvider = contentTypeProvider;
  }

  @Override
  public OrderStatusRemoteDataSourceImpl get() {
    return newInstance(orderStatusApiProvider.get(), contentTypeProvider.get());
  }

  public static OrderStatusRemoteDataSourceImpl_Factory create(
      Provider<OrderStatusApi> orderStatusApiProvider, Provider<String> contentTypeProvider) {
    return new OrderStatusRemoteDataSourceImpl_Factory(orderStatusApiProvider, contentTypeProvider);
  }

  public static OrderStatusRemoteDataSourceImpl newInstance(OrderStatusApi orderStatusApi,
      String contentType) {
    return new OrderStatusRemoteDataSourceImpl(orderStatusApi, contentType);
  }
}
