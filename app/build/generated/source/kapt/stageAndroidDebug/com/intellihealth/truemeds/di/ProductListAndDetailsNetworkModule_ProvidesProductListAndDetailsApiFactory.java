package com.intellihealth.truemeds.di;

import com.intellihealth.truemeds.data.api.ProductListAndDetailsApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@ScopeMetadata("javax.inject.Singleton")
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
public final class ProductListAndDetailsNetworkModule_ProvidesProductListAndDetailsApiFactory implements Factory<ProductListAndDetailsApi> {
  private final ProductListAndDetailsNetworkModule module;

  private final Provider<Retrofit> retrofitProvider;

  public ProductListAndDetailsNetworkModule_ProvidesProductListAndDetailsApiFactory(
      ProductListAndDetailsNetworkModule module, Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public ProductListAndDetailsApi get() {
    return providesProductListAndDetailsApi(module, retrofitProvider.get());
  }

  public static ProductListAndDetailsNetworkModule_ProvidesProductListAndDetailsApiFactory create(
      ProductListAndDetailsNetworkModule module, Provider<Retrofit> retrofitProvider) {
    return new ProductListAndDetailsNetworkModule_ProvidesProductListAndDetailsApiFactory(module, retrofitProvider);
  }

  public static ProductListAndDetailsApi providesProductListAndDetailsApi(
      ProductListAndDetailsNetworkModule instance, Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(instance.providesProductListAndDetailsApi(retrofit));
  }
}
