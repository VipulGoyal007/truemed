package com.intellihealth.truemeds.data.repository.datasourceimpl.remote;

import com.intellihealth.truemeds.data.api.LoginApi;
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
public final class LoginRemoteDataImpl_Factory implements Factory<LoginRemoteDataImpl> {
  private final Provider<LoginApi> loginApiProvider;

  private final Provider<String> contentTypeProvider;

  public LoginRemoteDataImpl_Factory(Provider<LoginApi> loginApiProvider,
      Provider<String> contentTypeProvider) {
    this.loginApiProvider = loginApiProvider;
    this.contentTypeProvider = contentTypeProvider;
  }

  @Override
  public LoginRemoteDataImpl get() {
    return newInstance(loginApiProvider.get(), contentTypeProvider.get());
  }

  public static LoginRemoteDataImpl_Factory create(Provider<LoginApi> loginApiProvider,
      Provider<String> contentTypeProvider) {
    return new LoginRemoteDataImpl_Factory(loginApiProvider, contentTypeProvider);
  }

  public static LoginRemoteDataImpl newInstance(LoginApi loginApi, String contentType) {
    return new LoginRemoteDataImpl(loginApi, contentType);
  }
}
