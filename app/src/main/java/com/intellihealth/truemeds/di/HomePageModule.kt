package com.intellihealth.truemeds.di

import com.intellihealth.truemeds.data.api.HomePageApi
import com.intellihealth.truemeds.data.repository.HomePageRepositoryImpl
import com.intellihealth.truemeds.data.repository.datasource.remote.HomePageRemoteDataSource
import com.intellihealth.truemeds.data.repository.datasourceimpl.remote.HomePageRemoteDataSourceImpl
import com.intellihealth.truemeds.domain.repository.HomePageRepository
import com.intellihealth.truemeds.presentation.analytics.MixPanelEvent
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
abstract class HomePageRemoteDataModule {
    @Singleton
    @Binds
    abstract fun bindHomePageRemoteData(homePageRemoteDataSourceImpl: HomePageRemoteDataSourceImpl): HomePageRemoteDataSource
}

@Module
@InstallIn(SingletonComponent::class)
abstract class HomePageRepositoryModule {
    @Binds
    abstract fun bindHomePageRepository(homePageRepositoryImpl: HomePageRepositoryImpl): HomePageRepository
}


@Module
@InstallIn(SingletonComponent::class)
class HomePageNetworkModule {
    @Singleton
    @Provides
    fun providesHomePageApi(retrofit: Retrofit): HomePageApi {
        return retrofit.create(HomePageApi::class.java)
    }
}