package com.intellihealth.truemeds.data.repository;

import com.intellihealth.truemeds.data.repository.datasource.remote.OrderIssueRemoteData;
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
public final class OrderIssueRepositoryImpl_Factory implements Factory<OrderIssueRepositoryImpl> {
  private final Provider<OrderIssueRemoteData> orderIssueRemoteDataProvider;

  private final Provider<ApiCallInitClass> apiCallInitClassProvider;

  public OrderIssueRepositoryImpl_Factory(
      Provider<OrderIssueRemoteData> orderIssueRemoteDataProvider,
      Provider<ApiCallInitClass> apiCallInitClassProvider) {
    this.orderIssueRemoteDataProvider = orderIssueRemoteDataProvider;
    this.apiCallInitClassProvider = apiCallInitClassProvider;
  }

  @Override
  public OrderIssueRepositoryImpl get() {
    return newInstance(orderIssueRemoteDataProvider.get(), apiCallInitClassProvider.get());
  }

  public static OrderIssueRepositoryImpl_Factory create(
      Provider<OrderIssueRemoteData> orderIssueRemoteDataProvider,
      Provider<ApiCallInitClass> apiCallInitClassProvider) {
    return new OrderIssueRepositoryImpl_Factory(orderIssueRemoteDataProvider, apiCallInitClassProvider);
  }

  public static OrderIssueRepositoryImpl newInstance(OrderIssueRemoteData orderIssueRemoteData,
      ApiCallInitClass apiCallInitClass) {
    return new OrderIssueRepositoryImpl(orderIssueRemoteData, apiCallInitClass);
  }
}
