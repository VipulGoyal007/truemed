package com.intellihealth.truemeds.di;

import com.intellihealth.truemeds.data.api.LoginApi;
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
public final class ApiModule_ProvidesLoginApiFactory implements Factory<LoginApi> {
  private final ApiModule module;

  private final Provider<Retrofit> retrofitProvider;

  public ApiModule_ProvidesLoginApiFactory(ApiModule module, Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public LoginApi get() {
    return providesLoginApi(module, retrofitProvider.get());
  }

  public static ApiModule_ProvidesLoginApiFactory create(ApiModule module,
      Provider<Retrofit> retrofitProvider) {
    return new ApiModule_ProvidesLoginApiFactory(module, retrofitProvider);
  }

  public static LoginApi providesLoginApi(ApiModule instance, Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(instance.providesLoginApi(retrofit));
  }
}
