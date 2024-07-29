package com.intellihealth.truemeds.data.repository.datasourceimpl.remote;

import com.intellihealth.truemeds.data.api.OrderFlowApi;
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
public final class OrderFlowRemoteDataSourceImpl_Factory implements Factory<OrderFlowRemoteDataSourceImpl> {
  private final Provider<OrderFlowApi> orderFlowApiProvider;

  private final Provider<String> contentTypeProvider;

  public OrderFlowRemoteDataSourceImpl_Factory(Provider<OrderFlowApi> orderFlowApiProvider,
      Provider<String> contentTypeProvider) {
    this.orderFlowApiProvider = orderFlowApiProvider;
    this.contentTypeProvider = contentTypeProvider;
  }

  @Override
  public OrderFlowRemoteDataSourceImpl get() {
    return newInstance(orderFlowApiProvider.get(), contentTypeProvider.get());
  }

  public static OrderFlowRemoteDataSourceImpl_Factory create(
      Provider<OrderFlowApi> orderFlowApiProvider, Provider<String> contentTypeProvider) {
    return new OrderFlowRemoteDataSourceImpl_Factory(orderFlowApiProvider, contentTypeProvider);
  }

  public static OrderFlowRemoteDataSourceImpl newInstance(OrderFlowApi orderFlowApi,
      String contentType) {
    return new OrderFlowRemoteDataSourceImpl(orderFlowApi, contentType);
  }
}
