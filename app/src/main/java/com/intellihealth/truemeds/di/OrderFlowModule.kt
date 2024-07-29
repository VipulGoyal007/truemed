package com.intellihealth.truemeds.di

import com.intellihealth.truemeds.data.api.OrderFlowApi
import com.intellihealth.truemeds.data.repository.OrderFlowRepositoryImpl
import com.intellihealth.truemeds.data.repository.datasource.remote.OrderFlowRemoteDataSource
import com.intellihealth.truemeds.data.repository.datasourceimpl.remote.OrderFlowRemoteDataSourceImpl
import com.intellihealth.truemeds.domain.repository.OrderFlowRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class OrderFlowDataModule {
    @Singleton
    @Binds
    abstract fun bindOrderFlowRemoteData(orderFlowRemoteDataSourceImpl: OrderFlowRemoteDataSourceImpl): OrderFlowRemoteDataSource
}

@Module
@InstallIn(SingletonComponent::class)
abstract class OrderFlowRepositoryModule {
    @Binds
    abstract fun bindOrderFlowRepository(orderFlowRepositoryImpl: OrderFlowRepositoryImpl): OrderFlowRepository
}


@Module
@InstallIn(SingletonComponent::class)
class OrderFlowNetworkModule {
    @Singleton
    @Provides
    fun providesOrderFlowApi(retrofit: Retrofit): OrderFlowApi {
        return retrofit.create(OrderFlowApi::class.java)
    }
}