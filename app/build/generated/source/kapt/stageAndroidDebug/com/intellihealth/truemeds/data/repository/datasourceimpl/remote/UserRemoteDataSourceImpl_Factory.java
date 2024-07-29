package com.intellihealth.truemeds.data.repository.datasourceimpl.remote;

import com.intellihealth.truemeds.data.api.UserDataApi;
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
public final class UserRemoteDataSourceImpl_Factory implements Factory<UserRemoteDataSourceImpl> {
  private final Provider<UserDataApi> userDataApiProvider;

  private final Provider<String> contentTypeProvider;

  public UserRemoteDataSourceImpl_Factory(Provider<UserDataApi> userDataApiProvider,
      Provider<String> contentTypeProvider) {
    this.userDataApiProvider = userDataApiProvider;
    this.contentTypeProvider = contentTypeProvider;
  }

  @Override
  public UserRemoteDataSourceImpl get() {
    return newInstance(userDataApiProvider.get(), contentTypeProvider.get());
  }

  public static UserRemoteDataSourceImpl_Factory create(Provider<UserDataApi> userDataApiProvider,
      Provider<String> contentTypeProvider) {
    return new UserRemoteDataSourceImpl_Factory(userDataApiProvider, contentTypeProvider);
  }

  public static UserRemoteDataSourceImpl newInstance(UserDataApi userDataApi, String contentType) {
    return new UserRemoteDataSourceImpl(userDataApi, contentType);
  }
}
