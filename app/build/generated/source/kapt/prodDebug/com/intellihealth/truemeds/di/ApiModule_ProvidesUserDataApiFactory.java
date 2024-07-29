package com.intellihealth.truemeds.di;

import com.intellihealth.truemeds.data.api.UserDataApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@ScopeMetadata("javax.inject.Singleton")
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
public final class ApiModule_ProvidesUserDataApiFactory implements Factory<UserDataApi> {
  private final ApiModule module;

  private final Provider<Retrofit> retrofitProvider;

  public ApiModule_ProvidesUserDataApiFactory(ApiModule module,
      Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public UserDataApi get() {
    return providesUserDataApi(module, retrofitProvider.get());
  }

  public static ApiModule_ProvidesUserDataApiFactory create(ApiModule module,
      Provider<Retrofit> retrofitProvider) {
    return new ApiModule_ProvidesUserDataApiFactory(module, retrofitProvider);
  }

  public static UserDataApi providesUserDataApi(ApiModule instance, Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(instance.providesUserDataApi(retrofit));
  }
}
