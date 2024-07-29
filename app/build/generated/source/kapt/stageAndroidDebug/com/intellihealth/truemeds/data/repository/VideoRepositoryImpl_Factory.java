package com.intellihealth.truemeds.data.repository;

import com.intellihealth.truemeds.data.repository.datasource.remote.VideoFaqRemoteDataSource;
import com.intellihealth.truemeds.data.utils.ApiCallInitClass;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class VideoRepositoryImpl_Factory implements Factory<VideoRepositoryImpl> {
  private final Provider<VideoFaqRemoteDataSource> videoFaqRemoteDataSourceProvider;

  private final Provider<ApiCallInitClass> apiCallInitClassProvider;

  public VideoRepositoryImpl_Factory(
      Provider<VideoFaqRemoteDataSource> videoFaqRemoteDataSourceProvider,
      Provider<ApiCallInitClass> apiCallInitClassProvider) {
    this.videoFaqRemoteDataSourceProvider = videoFaqRemoteDataSourceProvider;
    this.apiCallInitClassProvider = apiCallInitClassProvider;
  }

  @Override
  public VideoRepositoryImpl get() {
    return newInstance(videoFaqRemoteDataSourceProvider.get(), apiCallInitClassProvider.get());
  }

  public static VideoRepositoryImpl_Factory create(
      Provider<VideoFaqRemoteDataSource> videoFaqRemoteDataSourceProvider,
      Provider<ApiCallInitClass> apiCallInitClassProvider) {
    return new VideoRepositoryImpl_Factory(videoFaqRemoteDataSourceProvider, apiCallInitClassProvider);
  }

  public static VideoRepositoryImpl newInstance(VideoFaqRemoteDataSource videoFaqRemoteDataSource,
      ApiCallInitClass apiCallInitClass) {
    return new VideoRepositoryImpl(videoFaqRemoteDataSource, apiCallInitClass);
  }
}
