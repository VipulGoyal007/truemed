package com.intellihealth.truemeds.data.repository.datasourceimpl.remote;

import com.intellihealth.truemeds.data.api.ProductListAndDetailsApi;
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
public final class ElasticMedicineRemoteDataSourceImpl_Factory implements Factory<ElasticMedicineRemoteDataSourceImpl> {
  private final Provider<ProductListAndDetailsApi> productListAndDetailsApiProvider;

  private final Provider<String> contentTypeProvider;

  public ElasticMedicineRemoteDataSourceImpl_Factory(
      Provider<ProductListAndDetailsApi> productListAndDetailsApiProvider,
      Provider<String> contentTypeProvider) {
    this.productListAndDetailsApiProvider = productListAndDetailsApiProvider;
    this.contentTypeProvider = contentTypeProvider;
  }

  @Override
  public ElasticMedicineRemoteDataSourceImpl get() {
    return newInstance(productListAndDetailsApiProvider.get(), contentTypeProvider.get());
  }

  public static ElasticMedicineRemoteDataSourceImpl_Factory create(
      Provider<ProductListAndDetailsApi> productListAndDetailsApiProvider,
      Provider<String> contentTypeProvider) {
    return new ElasticMedicineRemoteDataSourceImpl_Factory(productListAndDetailsApiProvider, contentTypeProvider);
  }

  public static ElasticMedicineRemoteDataSourceImpl newInstance(
      ProductListAndDetailsApi productListAndDetailsApi, String contentType) {
    return new ElasticMedicineRemoteDataSourceImpl(productListAndDetailsApi, contentType);
  }
}
