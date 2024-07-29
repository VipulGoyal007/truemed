package com.intellihealth.truemeds.di;

import com.intellihealth.truemeds.data.api.VideoApi;
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
public final class VideoFAQModule_ProvidesVideoScreenApiFactory implements Factory<VideoApi> {
  private final VideoFAQModule module;

  private final Provider<Retrofit> retrofitProvider;

  public VideoFAQModule_ProvidesVideoScreenApiFactory(VideoFAQModule module,
      Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public VideoApi get() {
    return providesVideoScreenApi(module, retrofitProvider.get());
  }

  public static VideoFAQModule_ProvidesVideoScreenApiFactory create(VideoFAQModule module,
      Provider<Retrofit> retrofitProvider) {
    return new VideoFAQModule_ProvidesVideoScreenApiFactory(module, retrofitProvider);
  }

  public static VideoApi providesVideoScreenApi(VideoFAQModule instance, Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(instance.providesVideoScreenApi(retrofit));
  }
}
