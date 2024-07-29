package com.intellihealth.truemeds.data.repository;

import com.intellihealth.truemeds.data.repository.datasource.remote.ElasticMedicineRemoteDataSource;
import com.intellihealth.truemeds.data.repository.datasource.remote.OrderFlowRemoteDataSource;
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
public final class OrderFlowRepositoryImpl_Factory implements Factory<OrderFlowRepositoryImpl> {
  private final Provider<OrderFlowRemoteDataSource> orderFlowRemoteDataSourceProvider;

  private final Provider<ElasticMedicineRemoteDataSource> elasticMedicineRemoteDataSourceProvider;

  private final Provider<ApiCallInitClass> apiCallInitClassProvider;

  public OrderFlowRepositoryImpl_Factory(
      Provider<OrderFlowRemoteDataSource> orderFlowRemoteDataSourceProvider,
      Provider<ElasticMedicineRemoteDataSource> elasticMedicineRemoteDataSourceProvider,
      Provider<ApiCallInitClass> apiCallInitClassProvider) {
    this.orderFlowRemoteDataSourceProvider = orderFlowRemoteDataSourceProvider;
    this.elasticMedicineRemoteDataSourceProvider = elasticMedicineRemoteDataSourceProvider;
    this.apiCallInitClassProvider = apiCallInitClassProvider;
  }

  @Override
  public OrderFlowRepositoryImpl get() {
    return newInstance(orderFlowRemoteDataSourceProvider.get(), elasticMedicineRemoteDataSourceProvider.get(), apiCallInitClassProvider.get());
  }

  public static OrderFlowRepositoryImpl_Factory create(
      Provider<OrderFlowRemoteDataSource> orderFlowRemoteDataSourceProvider,
      Provider<ElasticMedicineRemoteDataSource> elasticMedicineRemoteDataSourceProvider,
      Provider<ApiCallInitClass> apiCallInitClassProvider) {
    return new OrderFlowRepositoryImpl_Factory(orderFlowRemoteDataSourceProvider, elasticMedicineRemoteDataSourceProvider, apiCallInitClassProvider);
  }

  public static OrderFlowRepositoryImpl newInstance(
      OrderFlowRemoteDataSource orderFlowRemoteDataSource,
      ElasticMedicineRemoteDataSource elasticMedicineRemoteDataSource,
      ApiCallInitClass apiCallInitClass) {
    return new OrderFlowRepositoryImpl(orderFlowRemoteDataSource, elasticMedicineRemoteDataSource, apiCallInitClass);
  }
}
