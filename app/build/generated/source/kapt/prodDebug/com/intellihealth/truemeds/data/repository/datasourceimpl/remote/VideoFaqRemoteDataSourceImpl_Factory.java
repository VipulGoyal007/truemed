package com.intellihealth.truemeds.data.repository.datasourceimpl.remote;

import com.intellihealth.truemeds.data.api.VideoApi;
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
public final class VideoFaqRemoteDataSourceImpl_Factory implements Factory<VideoFaqRemoteDataSourceImpl> {
  private final Provider<VideoApi> videoApiProvider;

  private final Provider<String> contentTypeProvider;

  public VideoFaqRemoteDataSourceImpl_Factory(Provider<VideoApi> videoApiProvider,
      Provider<String> contentTypeProvider) {
    this.videoApiProvider = videoApiProvider;
    this.contentTypeProvider = contentTypeProvider;
  }

  @Override
  public VideoFaqRemoteDataSourceImpl get() {
    return newInstance(videoApiProvider.get(), contentTypeProvider.get());
  }

  public static VideoFaqRemoteDataSourceImpl_Factory create(Provider<VideoApi> videoApiProvider,
      Provider<String> contentTypeProvider) {
    return new VideoFaqRemoteDataSourceImpl_Factory(videoApiProvider, contentTypeProvider);
  }

  public static VideoFaqRemoteDataSourceImpl newInstance(VideoApi videoApi, String contentType) {
    return new VideoFaqRemoteDataSourceImpl(videoApi, contentType);
  }
}
