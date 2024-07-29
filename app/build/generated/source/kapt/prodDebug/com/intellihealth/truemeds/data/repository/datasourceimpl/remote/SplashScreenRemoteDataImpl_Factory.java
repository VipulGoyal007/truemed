package com.intellihealth.truemeds.data.repository.datasourceimpl.remote;

import android.content.Context;
import com.intellihealth.truemeds.data.api.SplashScreenApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata({
    "dagger.hilt.android.qualifiers.ApplicationContext",
    "javax.inject.Named"
})
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
public final class SplashScreenRemoteDataImpl_Factory implements Factory<SplashScreenRemoteDataImpl> {
  private final Provider<Context> contextProvider;

  private final Provider<SplashScreenApi> splashScreenApiProvider;

  private final Provider<String> contentTypeProvider;

  public SplashScreenRemoteDataImpl_Factory(Provider<Context> contextProvider,
      Provider<SplashScreenApi> splashScreenApiProvider, Provider<String> contentTypeProvider) {
    this.contextProvider = contextProvider;
    this.splashScreenApiProvider = splashScreenApiProvider;
    this.contentTypeProvider = contentTypeProvider;
  }

  @Override
  public SplashScreenRemoteDataImpl get() {
    return newInstance(contextProvider.get(), splashScreenApiProvider.get(), contentTypeProvider.get());
  }

  public static SplashScreenRemoteDataImpl_Factory create(Provider<Context> contextProvider,
      Provider<SplashScreenApi> splashScreenApiProvider, Provider<String> contentTypeProvider) {
    return new SplashScreenRemoteDataImpl_Factory(contextProvider, splashScreenApiProvider, contentTypeProvider);
  }

  public static SplashScreenRemoteDataImpl newInstance(Context context,
      SplashScreenApi splashScreenApi, String contentType) {
    return new SplashScreenRemoteDataImpl(context, splashScreenApi, contentType);
  }
}
