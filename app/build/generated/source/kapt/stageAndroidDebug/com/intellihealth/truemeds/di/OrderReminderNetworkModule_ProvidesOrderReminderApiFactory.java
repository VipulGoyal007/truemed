package com.intellihealth.truemeds.di;

import com.intellihealth.truemeds.data.api.OrderReminderApi;
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
public final class OrderReminderNetworkModule_ProvidesOrderReminderApiFactory implements Factory<OrderReminderApi> {
  private final OrderReminderNetworkModule module;

  private final Provider<Retrofit> retrofitProvider;

  public OrderReminderNetworkModule_ProvidesOrderReminderApiFactory(
      OrderReminderNetworkModule module, Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public OrderReminderApi get() {
    return providesOrderReminderApi(module, retrofitProvider.get());
  }

  public static OrderReminderNetworkModule_ProvidesOrderReminderApiFactory create(
      OrderReminderNetworkModule module, Provider<Retrofit> retrofitProvider) {
    return new OrderReminderNetworkModule_ProvidesOrderReminderApiFactory(module, retrofitProvider);
  }

  public static OrderReminderApi providesOrderReminderApi(OrderReminderNetworkModule instance,
      Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(instance.providesOrderReminderApi(retrofit));
  }
}
