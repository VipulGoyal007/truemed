package com.intellihealth.truemeds.data.repository.datasourceimpl.remote;

import com.intellihealth.truemeds.data.api.OrderReminderApi;
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
public final class OrderReminderRemoteDataSourceImpl_Factory implements Factory<OrderReminderRemoteDataSourceImpl> {
  private final Provider<OrderReminderApi> orderReminderApiProvider;

  private final Provider<String> contentTypeProvider;

  public OrderReminderRemoteDataSourceImpl_Factory(
      Provider<OrderReminderApi> orderReminderApiProvider, Provider<String> contentTypeProvider) {
    this.orderReminderApiProvider = orderReminderApiProvider;
    this.contentTypeProvider = contentTypeProvider;
  }

  @Override
  public OrderReminderRemoteDataSourceImpl get() {
    return newInstance(orderReminderApiProvider.get(), contentTypeProvider.get());
  }

  public static OrderReminderRemoteDataSourceImpl_Factory create(
      Provider<OrderReminderApi> orderReminderApiProvider, Provider<String> contentTypeProvider) {
    return new OrderReminderRemoteDataSourceImpl_Factory(orderReminderApiProvider, contentTypeProvider);
  }

  public static OrderReminderRemoteDataSourceImpl newInstance(OrderReminderApi orderReminderApi,
      String contentType) {
    return new OrderReminderRemoteDataSourceImpl(orderReminderApi, contentType);
  }
}
