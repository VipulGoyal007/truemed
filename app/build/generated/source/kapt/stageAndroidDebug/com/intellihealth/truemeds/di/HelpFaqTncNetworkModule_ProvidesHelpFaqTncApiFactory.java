package com.intellihealth.truemeds.di;

import com.intellihealth.truemeds.data.api.HelpFaqTncApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

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
public final class HelpFaqTncNetworkModule_ProvidesHelpFaqTncApiFactory implements Factory<HelpFaqTncApi> {
  private final HelpFaqTncNetworkModule module;

  private final Provider<Retrofit> retrofitProvider;

  public HelpFaqTncNetworkModule_ProvidesHelpFaqTncApiFactory(HelpFaqTncNetworkModule module,
      Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public HelpFaqTncApi get() {
    return providesHelpFaqTncApi(module, retrofitProvider.get());
  }

  public static HelpFaqTncNetworkModule_ProvidesHelpFaqTncApiFactory create(
      HelpFaqTncNetworkModule module, Provider<Retrofit> retrofitProvider) {
    return new HelpFaqTncNetworkModule_ProvidesHelpFaqTncApiFactory(module, retrofitProvider);
  }

  public static HelpFaqTncApi providesHelpFaqTncApi(HelpFaqTncNetworkModule instance,
      Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(instance.providesHelpFaqTncApi(retrofit));
  }
}
