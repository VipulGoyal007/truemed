package com.intellihealth.truemeds.di

import com.intellihealth.truemeds.data.api.OrderStatusApi
import com.intellihealth.truemeds.data.repository.OrderStatusRepositoryImpl
import com.intellihealth.truemeds.data.repository.datasource.remote.OrderStatusRemoteDataSource
import com.intellihealth.truemeds.data.repository.datasourceimpl.remote.OrderStatusRemoteDataSourceImpl
import com.intellihealth.truemeds.domain.repository.OrderStatusRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
abstract class OrderStatusDataModule {
    @Singleton
    @Binds
    abstract fun bindOrderStatusRemoteData(orderStatusRemoteDataSourceImpl: OrderStatusRemoteDataSourceImpl): OrderStatusRemoteDataSource
}

@Module
@InstallIn(SingletonComponent::class)
abstract class OrderStatusRepositoryModule {
    @Binds
    abstract fun bindOrderStatusRepository(orderStatusRepositoryImpl: OrderStatusRepositoryImpl): OrderStatusRepository
}

@Module
@InstallIn(SingletonComponent::class)
class OrderStatusNetworkModule {
    @Singleton
    @Provides
    fun providesOrderStatusApi(retrofit: Retrofit): OrderStatusApi {
        return retrofit.create(OrderStatusApi::class.java)
    }
}