package com.intellihealth.truemeds.di;

import com.intellihealth.truemeds.data.api.OrderFlowApi;
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
public final class OrderFlowNetworkModule_ProvidesOrderFlowApiFactory implements Factory<OrderFlowApi> {
  private final OrderFlowNetworkModule module;

  private final Provider<Retrofit> retrofitProvider;

  public OrderFlowNetworkModule_ProvidesOrderFlowApiFactory(OrderFlowNetworkModule module,
      Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public OrderFlowApi get() {
    return providesOrderFlowApi(module, retrofitProvider.get());
  }

  public static OrderFlowNetworkModule_ProvidesOrderFlowApiFactory create(
      OrderFlowNetworkModule module, Provider<Retrofit> retrofitProvider) {
    return new OrderFlowNetworkModule_ProvidesOrderFlowApiFactory(module, retrofitProvider);
  }

  public static OrderFlowApi providesOrderFlowApi(OrderFlowNetworkModule instance,
      Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(instance.providesOrderFlowApi(retrofit));
  }
}
