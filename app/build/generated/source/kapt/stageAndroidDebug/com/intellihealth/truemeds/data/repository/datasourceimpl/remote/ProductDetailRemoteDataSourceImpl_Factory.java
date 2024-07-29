package com.intellihealth.truemeds.data.repository.datasourceimpl.remote;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class ProductDetailRemoteDataSourceImpl_Factory implements Factory<ProductDetailRemoteDataSourceImpl> {
  @Override
  public ProductDetailRemoteDataSourceImpl get() {
    return newInstance();
  }

  public static ProductDetailRemoteDataSourceImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ProductDetailRemoteDataSourceImpl newInstance() {
    return new ProductDetailRemoteDataSourceImpl();
  }

  private static final class InstanceHolder {
    private static final ProductDetailRemoteDataSourceImpl_Factory INSTANCE = new ProductDetailRemoteDataSourceImpl_Factory();
  }
}
