package com.intellihealth.truemeds.data.repository.datasourceimpl.remote;

import com.intellihealth.truemeds.data.api.CancelOrderApi;
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
public final class CancelOrderRemoteDataSourceImpl_Factory implements Factory<CancelOrderRemoteDataSourceImpl> {
  private final Provider<CancelOrderApi> cancelOrderApiProvider;

  private final Provider<String> contentTypeProvider;

  public CancelOrderRemoteDataSourceImpl_Factory(Provider<CancelOrderApi> cancelOrderApiProvider,
      Provider<String> contentTypeProvider) {
    this.cancelOrderApiProvider = cancelOrderApiProvider;
    this.contentTypeProvider = contentTypeProvider;
  }

  @Override
  public CancelOrderRemoteDataSourceImpl get() {
    return newInstance(cancelOrderApiProvider.get(), contentTypeProvider.get());
  }

  public static CancelOrderRemoteDataSourceImpl_Factory create(
      Provider<CancelOrderApi> cancelOrderApiProvider, Provider<String> contentTypeProvider) {
    return new CancelOrderRemoteDataSourceImpl_Factory(cancelOrderApiProvider, contentTypeProvider);
  }

  public static CancelOrderRemoteDataSourceImpl newInstance(CancelOrderApi cancelOrderApi,
      String contentType) {
    return new CancelOrderRemoteDataSourceImpl(cancelOrderApi, contentType);
  }
}
