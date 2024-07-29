package com.intellihealth.truemeds.data.repository;

import com.intellihealth.truemeds.data.repository.datasource.remote.UserRemoteDataSource;
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
public final class UserDataRepositoryImpl_Factory implements Factory<UserDataRepositoryImpl> {
  private final Provider<UserRemoteDataSource> userRemoteDataSourceProvider;

  private final Provider<ApiCallInitClass> apiCallInitClassProvider;

  public UserDataRepositoryImpl_Factory(Provider<UserRemoteDataSource> userRemoteDataSourceProvider,
      Provider<ApiCallInitClass> apiCallInitClassProvider) {
    this.userRemoteDataSourceProvider = userRemoteDataSourceProvider;
    this.apiCallInitClassProvider = apiCallInitClassProvider;
  }

  @Override
  public UserDataRepositoryImpl get() {
    return newInstance(userRemoteDataSourceProvider.get(), apiCallInitClassProvider.get());
  }

  public static UserDataRepositoryImpl_Factory create(
      Provider<UserRemoteDataSource> userRemoteDataSourceProvider,
      Provider<ApiCallInitClass> apiCallInitClassProvider) {
    return new UserDataRepositoryImpl_Factory(userRemoteDataSourceProvider, apiCallInitClassProvider);
  }

  public static UserDataRepositoryImpl newInstance(UserRemoteDataSource userRemoteDataSource,
      ApiCallInitClass apiCallInitClass) {
    return new UserDataRepositoryImpl(userRemoteDataSource, apiCallInitClass);
  }
}
