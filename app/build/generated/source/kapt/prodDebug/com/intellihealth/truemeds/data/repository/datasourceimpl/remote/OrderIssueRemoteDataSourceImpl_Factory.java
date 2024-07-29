package com.intellihealth.truemeds.data.repository.datasourceimpl.remote;

import android.content.Context;
import com.intellihealth.truemeds.data.api.OrderIssueApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata({
    "dagger.hilt.android.qualifiers.ApplicationContext",
    "javax.inject.Named"
})
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
public final class OrderIssueRemoteDataSourceImpl_Factory implements Factory<OrderIssueRemoteDataSourceImpl> {
  private final Provider<Context> contextProvider;

  private final Provider<OrderIssueApi> orderIssueApiProvider;

  private final Provider<String> contentTypeProvider;

  public OrderIssueRemoteDataSourceImpl_Factory(Provider<Context> contextProvider,
      Provider<OrderIssueApi> orderIssueApiProvider, Provider<String> contentTypeProvider) {
    this.contextProvider = contextProvider;
    this.orderIssueApiProvider = orderIssueApiProvider;
    this.contentTypeProvider = contentTypeProvider;
  }

  @Override
  public OrderIssueRemoteDataSourceImpl get() {
    return newInstance(contextProvider.get(), orderIssueApiProvider.get(), contentTypeProvider.get());
  }

  public static OrderIssueRemoteDataSourceImpl_Factory create(Provider<Context> contextProvider,
      Provider<OrderIssueApi> orderIssueApiProvider, Provider<String> contentTypeProvider) {
    return new OrderIssueRemoteDataSourceImpl_Factory(contextProvider, orderIssueApiProvider, contentTypeProvider);
  }

  public static OrderIssueRemoteDataSourceImpl newInstance(Context context,
      OrderIssueApi orderIssueApi, String contentType) {
    return new OrderIssueRemoteDataSourceImpl(context, orderIssueApi, contentType);
  }
}
