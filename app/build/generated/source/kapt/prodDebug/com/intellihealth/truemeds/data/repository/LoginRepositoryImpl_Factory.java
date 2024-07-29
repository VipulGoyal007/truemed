package com.intellihealth.truemeds.data.repository;

import com.intellihealth.truemeds.data.repository.datasource.remote.LoginRemoteData;
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
public final class LoginRepositoryImpl_Factory implements Factory<LoginRepositoryImpl> {
  private final Provider<LoginRemoteData> loginRemoteDataProvider;

  private final Provider<ApiCallInitClass> apiCallInitClassProvider;

  public LoginRepositoryImpl_Factory(Provider<LoginRemoteData> loginRemoteDataProvider,
      Provider<ApiCallInitClass> apiCallInitClassProvider) {
    this.loginRemoteDataProvider = loginRemoteDataProvider;
    this.apiCallInitClassProvider = apiCallInitClassProvider;
  }

  @Override
  public LoginRepositoryImpl get() {
    return newInstance(loginRemoteDataProvider.get(), apiCallInitClassProvider.get());
  }

  public static LoginRepositoryImpl_Factory create(
      Provider<LoginRemoteData> loginRemoteDataProvider,
      Provider<ApiCallInitClass> apiCallInitClassProvider) {
    return new LoginRepositoryImpl_Factory(loginRemoteDataProvider, apiCallInitClassProvider);
  }

  public static LoginRepositoryImpl newInstance(LoginRemoteData loginRemoteData,
      ApiCallInitClass apiCallInitClass) {
    return new LoginRepositoryImpl(loginRemoteData, apiCallInitClass);
  }
}
