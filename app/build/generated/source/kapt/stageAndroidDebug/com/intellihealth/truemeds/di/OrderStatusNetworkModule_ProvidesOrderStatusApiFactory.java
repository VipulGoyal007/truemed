package com.intellihealth.truemeds.di;

import com.intellihealth.truemeds.data.api.OrderStatusApi;
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
public final class OrderStatusNetworkModule_ProvidesOrderStatusApiFactory implements Factory<OrderStatusApi> {
  private final OrderStatusNetworkModule module;

  private final Provider<Retrofit> retrofitProvider;

  public OrderStatusNetworkModule_ProvidesOrderStatusApiFactory(OrderStatusNetworkModule module,
      Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public OrderStatusApi get() {
    return providesOrderStatusApi(module, retrofitProvider.get());
  }

  public static OrderStatusNetworkModule_ProvidesOrderStatusApiFactory create(
      OrderStatusNetworkModule module, Provider<Retrofit> retrofitProvider) {
    return new OrderStatusNetworkModule_ProvidesOrderStatusApiFactory(module, retrofitProvider);
  }

  public static OrderStatusApi providesOrderStatusApi(OrderStatusNetworkModule instance,
      Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(instance.providesOrderStatusApi(retrofit));
  }
}
