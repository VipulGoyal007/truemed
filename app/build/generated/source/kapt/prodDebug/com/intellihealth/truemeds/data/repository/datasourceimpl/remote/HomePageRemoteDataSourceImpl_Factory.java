package com.intellihealth.truemeds.data.repository.datasourceimpl.remote;

import android.content.Context;
import com.intellihealth.truemeds.data.api.HomePageApi;
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
public final class HomePageRemoteDataSourceImpl_Factory implements Factory<HomePageRemoteDataSourceImpl> {
  private final Provider<Context> contextProvider;

  private final Provider<HomePageApi> homePageApiProvider;

  private final Provider<String> contentTypeProvider;

  public HomePageRemoteDataSourceImpl_Factory(Provider<Context> contextProvider,
      Provider<HomePageApi> homePageApiProvider, Provider<String> contentTypeProvider) {
    this.contextProvider = contextProvider;
    this.homePageApiProvider = homePageApiProvider;
    this.contentTypeProvider = contentTypeProvider;
  }

  @Override
  public HomePageRemoteDataSourceImpl get() {
    return newInstance(contextProvider.get(), homePageApiProvider.get(), contentTypeProvider.get());
  }

  public static HomePageRemoteDataSourceImpl_Factory create(Provider<Context> contextProvider,
      Provider<HomePageApi> homePageApiProvider, Provider<String> contentTypeProvider) {
    return new HomePageRemoteDataSourceImpl_Factory(contextProvider, homePageApiProvider, contentTypeProvider);
  }

  public static HomePageRemoteDataSourceImpl newInstance(Context context, HomePageApi homePageApi,
      String contentType) {
    return new HomePageRemoteDataSourceImpl(context, homePageApi, contentType);
  }
}
