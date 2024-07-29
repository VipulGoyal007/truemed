package com.intellihealth.truemeds.data.repository.datasourceimpl.remote;

import com.intellihealth.truemeds.data.api.HelpFaqTncApi;
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
public final class HelpFaqAndTnCRemoteDataSourceImpl_Factory implements Factory<HelpFaqAndTnCRemoteDataSourceImpl> {
  private final Provider<HelpFaqTncApi> helpFaqTncApiProvider;

  private final Provider<String> contentTypeProvider;

  public HelpFaqAndTnCRemoteDataSourceImpl_Factory(Provider<HelpFaqTncApi> helpFaqTncApiProvider,
      Provider<String> contentTypeProvider) {
    this.helpFaqTncApiProvider = helpFaqTncApiProvider;
    this.contentTypeProvider = contentTypeProvider;
  }

  @Override
  public HelpFaqAndTnCRemoteDataSourceImpl get() {
    return newInstance(helpFaqTncApiProvider.get(), contentTypeProvider.get());
  }

  public static HelpFaqAndTnCRemoteDataSourceImpl_Factory create(
      Provider<HelpFaqTncApi> helpFaqTncApiProvider, Provider<String> contentTypeProvider) {
    return new HelpFaqAndTnCRemoteDataSourceImpl_Factory(helpFaqTncApiProvider, contentTypeProvider);
  }

  public static HelpFaqAndTnCRemoteDataSourceImpl newInstance(HelpFaqTncApi helpFaqTncApi,
      String contentType) {
    return new HelpFaqAndTnCRemoteDataSourceImpl(helpFaqTncApi, contentType);
  }
}
