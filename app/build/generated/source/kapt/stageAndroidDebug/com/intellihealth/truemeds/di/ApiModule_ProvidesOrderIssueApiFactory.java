package com.intellihealth.truemeds.di;

import com.intellihealth.truemeds.data.api.OrderIssueApi;
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
public final class ApiModule_ProvidesOrderIssueApiFactory implements Factory<OrderIssueApi> {
  private final ApiModule module;

  private final Provider<Retrofit> retrofitProvider;

  public ApiModule_ProvidesOrderIssueApiFactory(ApiModule module,
      Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public OrderIssueApi get() {
    return providesOrderIssueApi(module, retrofitProvider.get());
  }

  public static ApiModule_ProvidesOrderIssueApiFactory create(ApiModule module,
      Provider<Retrofit> retrofitProvider) {
    return new ApiModule_ProvidesOrderIssueApiFactory(module, retrofitProvider);
  }

  public static OrderIssueApi providesOrderIssueApi(ApiModule instance, Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(instance.providesOrderIssueApi(retrofit));
  }
}
