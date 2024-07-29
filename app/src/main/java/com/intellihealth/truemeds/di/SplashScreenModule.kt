package com.intellihealth.truemeds.di

import com.intellihealth.truemeds.data.api.SplashScreenApi
import com.intellihealth.truemeds.data.repository.SplashScreenRepositoryImpl
import com.intellihealth.truemeds.data.repository.datasource.remote.SplashScreenRemoteData
import com.intellihealth.truemeds.data.repository.datasourceimpl.remote.SplashScreenRemoteDataImpl
import com.intellihealth.truemeds.domain.repository.SplashScreenRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit


@Module
@InstallIn(SingletonComponent::class)
class SplashScreenNetworkModule {
    @Provides
    fun providesSplashScreenApi(retrofit: Retrofit): SplashScreenApi {
        return retrofit.create(SplashScreenApi::class.java)
    }
}

@Module
@InstallIn(SingletonComponent::class)
abstract class SplashScreenRepositoryModule {
    @Binds
    abstract fun bindSplashScreenRepository(splashScreenRepositoryImpl: SplashScreenRepositoryImpl): SplashScreenRepository
}

@Module
@InstallIn(SingletonComponent::class)
abstract class SplashScreenRemoteDataModule {
    @Binds
    abstract fun bindSplashScreenRemoteData(splashScreenRemoteDataImpl: SplashScreenRemoteDataImpl): SplashScreenRemoteData
}