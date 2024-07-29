package com.intellihealth.truemeds.domain.usecase;

import com.intellihealth.truemeds.domain.repository.OrderFlowRepository;
import com.intellihealth.truemeds.domain.repository.ProductListAndDetailsRepository;
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
public final class ProductDetailUseCase_Factory implements Factory<ProductDetailUseCase> {
  private final Provider<ProductListAndDetailsRepository> productDetailRepositoryProvider;

  private final Provider<OrderFlowRepository> orderFlowRepositoryProvider;

  public ProductDetailUseCase_Factory(
      Provider<ProductListAndDetailsRepository> productDetailRepositoryProvider,
      Provider<OrderFlowRepository> orderFlowRepositoryProvider) {
    this.productDetailRepositoryProvider = productDetailRepositoryProvider;
    this.orderFlowRepositoryProvider = orderFlowRepositoryProvider;
  }

  @Override
  public ProductDetailUseCase get() {
    return newInstance(productDetailRepositoryProvider.get(), orderFlowRepositoryProvider.get());
  }

  public static ProductDetailUseCase_Factory create(
      Provider<ProductListAndDetailsRepository> productDetailRepositoryProvider,
      Provider<OrderFlowRepository> orderFlowRepositoryProvider) {
    return new ProductDetailUseCase_Factory(productDetailRepositoryProvider, orderFlowRepositoryProvider);
  }

  public static ProductDetailUseCase newInstance(
      ProductListAndDetailsRepository productDetailRepository,
      OrderFlowRepository orderFlowRepository) {
    return new ProductDetailUseCase(productDetailRepository, orderFlowRepository);
  }
}
