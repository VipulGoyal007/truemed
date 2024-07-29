package com.intellihealth.truemeds.data.repository.datasourceimpl.remote;

import com.intellihealth.truemeds.data.api.CashFreeApi;
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
public final class CashFreeRemoteDataSourceImpl_Factory implements Factory<CashFreeRemoteDataSourceImpl> {
  private final Provider<CashFreeApi> cashFreeApiProvider;

  private final Provider<String> contentTypeProvider;

  public CashFreeRemoteDataSourceImpl_Factory(Provider<CashFreeApi> cashFreeApiProvider,
      Provider<String> contentTypeProvider) {
    this.cashFreeApiProvider = cashFreeApiProvider;
    this.contentTypeProvider = contentTypeProvider;
  }

  @Override
  public CashFreeRemoteDataSourceImpl get() {
    return newInstance(cashFreeApiProvider.get(), contentTypeProvider.get());
  }

  public static CashFreeRemoteDataSourceImpl_Factory create(
      Provider<CashFreeApi> cashFreeApiProvider, Provider<String> contentTypeProvider) {
    return new CashFreeRemoteDataSourceImpl_Factory(cashFreeApiProvider, contentTypeProvider);
  }

  public static CashFreeRemoteDataSourceImpl newInstance(CashFreeApi cashFreeApi,
      String contentType) {
    return new CashFreeRemoteDataSourceImpl(cashFreeApi, contentType);
  }
}
