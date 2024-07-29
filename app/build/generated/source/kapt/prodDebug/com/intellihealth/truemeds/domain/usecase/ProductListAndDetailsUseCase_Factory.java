package com.intellihealth.truemeds.domain.usecase;

import com.intellihealth.truemeds.domain.repository.ProductListAndDetailsRepository;
import com.intellihealth.truemeds.domain.usecase.analytics.SdkEventUseCase;
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
public final class ProductListAndDetailsUseCase_Factory implements Factory<ProductListAndDetailsUseCase> {
  private final Provider<ProductListAndDetailsRepository> productListAndDetailsRepositoryProvider;

  private final Provider<SdkEventUseCase> sdkEventUseCaseProvider;

  public ProductListAndDetailsUseCase_Factory(
      Provider<ProductListAndDetailsRepository> productListAndDetailsRepositoryProvider,
      Provider<SdkEventUseCase> sdkEventUseCaseProvider) {
    this.productListAndDetailsRepositoryProvider = productListAndDetailsRepositoryProvider;
    this.sdkEventUseCaseProvider = sdkEventUseCaseProvider;
  }

  @Override
  public ProductListAndDetailsUseCase get() {
    return newInstance(productListAndDetailsRepositoryProvider.get(), sdkEventUseCaseProvider.get());
  }

  public static ProductListAndDetailsUseCase_Factory create(
      Provider<ProductListAndDetailsRepository> productListAndDetailsRepositoryProvider,
      Provider<SdkEventUseCase> sdkEventUseCaseProvider) {
    return new ProductListAndDetailsUseCase_Factory(productListAndDetailsRepositoryProvider, sdkEventUseCaseProvider);
  }

  public static ProductListAndDetailsUseCase newInstance(
      ProductListAndDetailsRepository productListAndDetailsRepository,
      SdkEventUseCase sdkEventUseCase) {
    return new ProductListAndDetailsUseCase(productListAndDetailsRepository, sdkEventUseCase);
  }
}
