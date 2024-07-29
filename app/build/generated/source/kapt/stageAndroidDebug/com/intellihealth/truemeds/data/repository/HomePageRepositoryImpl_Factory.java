package com.intellihealth.truemeds.data.repository;

import com.intellihealth.truemeds.data.repository.datasource.remote.HomePageRemoteDataSource;
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
public final class HomePageRepositoryImpl_Factory implements Factory<HomePageRepositoryImpl> {
  private final Provider<HomePageRemoteDataSource> homePageRemoteDataSourceProvider;

  private final Provider<ApiCallInitClass> apiCallInitClassProvider;

  public HomePageRepositoryImpl_Factory(
      Provider<HomePageRemoteDataSource> homePageRemoteDataSourceProvider,
      Provider<ApiCallInitClass> apiCallInitClassProvider) {
    this.homePageRemoteDataSourceProvider = homePageRemoteDataSourceProvider;
    this.apiCallInitClassProvider = apiCallInitClassProvider;
  }

  @Override
  public HomePageRepositoryImpl get() {
    return newInstance(homePageRemoteDataSourceProvider.get(), apiCallInitClassProvider.get());
  }

  public static HomePageRepositoryImpl_Factory create(
      Provider<HomePageRemoteDataSource> homePageRemoteDataSourceProvider,
      Provider<ApiCallInitClass> apiCallInitClassProvider) {
    return new HomePageRepositoryImpl_Factory(homePageRemoteDataSourceProvider, apiCallInitClassProvider);
  }

  public static HomePageRepositoryImpl newInstance(
      HomePageRemoteDataSource homePageRemoteDataSource, ApiCallInitClass apiCallInitClass) {
    return new HomePageRepositoryImpl(homePageRemoteDataSource, apiCallInitClass);
  }
}
