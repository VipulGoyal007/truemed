package com.intellihealth.truemeds.di

import com.intellihealth.truemeds.data.api.CancelOrderApi
import com.intellihealth.truemeds.data.repository.CancelOrderRepositoryImpl
import com.intellihealth.truemeds.data.repository.datasource.remote.CancelOrderRemoteDataSource
import com.intellihealth.truemeds.data.repository.datasourceimpl.remote.CancelOrderRemoteDataSourceImpl
import com.intellihealth.truemeds.domain.repository.CancelOrderRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
abstract class CancelOrderDataModule {
    @Singleton
    @Binds
    abstract fun bindCancelOrderRemoteData(cancelOrderRemoteDataSourceImpl: CancelOrderRemoteDataSourceImpl): CancelOrderRemoteDataSource
}

@Module
@InstallIn(SingletonComponent::class)
abstract class CancelOrderRepositoryModule {
    @Binds
    abstract fun bindCancelOrderRepository(cancelOrderRepositoryImpl: CancelOrderRepositoryImpl): CancelOrderRepository
}
@Module
@InstallIn(SingletonComponent::class)
class CancelOrderNetworkModule {
    @Provides
    fun providesCancelOrderApi(retrofit: Retrofit): CancelOrderApi {
        return retrofit.create(CancelOrderApi::class.java)
    }
}