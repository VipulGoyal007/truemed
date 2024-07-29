package com.intellihealth.truemeds.data.repository;

import com.intellihealth.truemeds.data.repository.datasource.remote.HelpFaqAndTnCRemoteDataSource;
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
public final class HelpFaqAndTnCRepositoryImpl_Factory implements Factory<HelpFaqAndTnCRepositoryImpl> {
  private final Provider<HelpFaqAndTnCRemoteDataSource> helpFaqAndTnCRemoteDataSourceProvider;

  private final Provider<ApiCallInitClass> apiCallInitClassProvider;

  public HelpFaqAndTnCRepositoryImpl_Factory(
      Provider<HelpFaqAndTnCRemoteDataSource> helpFaqAndTnCRemoteDataSourceProvider,
      Provider<ApiCallInitClass> apiCallInitClassProvider) {
    this.helpFaqAndTnCRemoteDataSourceProvider = helpFaqAndTnCRemoteDataSourceProvider;
    this.apiCallInitClassProvider = apiCallInitClassProvider;
  }

  @Override
  public HelpFaqAndTnCRepositoryImpl get() {
    return newInstance(helpFaqAndTnCRemoteDataSourceProvider.get(), apiCallInitClassProvider.get());
  }

  public static HelpFaqAndTnCRepositoryImpl_Factory create(
      Provider<HelpFaqAndTnCRemoteDataSource> helpFaqAndTnCRemoteDataSourceProvider,
      Provider<ApiCallInitClass> apiCallInitClassProvider) {
    return new HelpFaqAndTnCRepositoryImpl_Factory(helpFaqAndTnCRemoteDataSourceProvider, apiCallInitClassProvider);
  }

  public static HelpFaqAndTnCRepositoryImpl newInstance(
      HelpFaqAndTnCRemoteDataSource helpFaqAndTnCRemoteDataSource,
      ApiCallInitClass apiCallInitClass) {
    return new HelpFaqAndTnCRepositoryImpl(helpFaqAndTnCRemoteDataSource, apiCallInitClass);
  }
}
