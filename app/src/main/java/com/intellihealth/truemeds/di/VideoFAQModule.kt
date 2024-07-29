package com.intellihealth.truemeds.di

import com.intellihealth.truemeds.data.api.VideoApi
import com.intellihealth.truemeds.data.repository.VideoRepositoryImpl
import com.intellihealth.truemeds.data.repository.datasource.remote.VideoFaqRemoteDataSource
import com.intellihealth.truemeds.data.repository.datasourceimpl.remote.VideoFaqRemoteDataSourceImpl
import com.intellihealth.truemeds.domain.repository.VideoFaqRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit

@Module
@InstallIn(SingletonComponent::class)
class VideoFAQModule {
    @Provides
    fun providesVideoScreenApi(retrofit: Retrofit): VideoApi {
        return retrofit.create(VideoApi::class.java)
    }
}

@Module
@InstallIn(SingletonComponent::class)
abstract class VideoFAQRepositoryModule {
    @Binds
    abstract fun bindVideoFAQRepository(videoRepositoryImpl: VideoRepositoryImpl): VideoFaqRepository
}

@Module
@InstallIn(SingletonComponent::class)
abstract class VideoFAQRemoteDataModule {
    @Binds
    abstract fun bindVideoFAQRemoteData(videoFaqRemoteDataSourceImpl: VideoFaqRemoteDataSourceImpl): VideoFaqRemoteDataSource
}