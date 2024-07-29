package com.intellihealth.truemeds.data.repository;

import com.intellihealth.truemeds.data.repository.datasource.remote.SplashScreenRemoteData;
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
public final class SplashScreenRepositoryImpl_Factory implements Factory<SplashScreenRepositoryImpl> {
  private final Provider<SplashScreenRemoteData> splashScreenRemoteDataProvider;

  private final Provider<ApiCallInitClass> apiCallInitClassProvider;

  public SplashScreenRepositoryImpl_Factory(
      Provider<SplashScreenRemoteData> splashScreenRemoteDataProvider,
      Provider<ApiCallInitClass> apiCallInitClassProvider) {
    this.splashScreenRemoteDataProvider = splashScreenRemoteDataProvider;
    this.apiCallInitClassProvider = apiCallInitClassProvider;
  }

  @Override
  public SplashScreenRepositoryImpl get() {
    return newInstance(splashScreenRemoteDataProvider.get(), apiCallInitClassProvider.get());
  }

  public static SplashScreenRepositoryImpl_Factory create(
      Provider<SplashScreenRemoteData> splashScreenRemoteDataProvider,
      Provider<ApiCallInitClass> apiCallInitClassProvider) {
    return new SplashScreenRepositoryImpl_Factory(splashScreenRemoteDataProvider, apiCallInitClassProvider);
  }

  public static SplashScreenRepositoryImpl newInstance(
      SplashScreenRemoteData splashScreenRemoteData, ApiCallInitClass apiCallInitClass) {
    return new SplashScreenRepositoryImpl(splashScreenRemoteData, apiCallInitClass);
  }
}
