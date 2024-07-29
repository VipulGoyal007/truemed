package com.intellihealth.truemeds.di

import com.intellihealth.truemeds.data.api.OrderReminderApi
import com.intellihealth.truemeds.data.repository.OrderReminderRepositoryImpl
import com.intellihealth.truemeds.data.repository.datasource.remote.OrderReminderRemoteDataSource
import com.intellihealth.truemeds.data.repository.datasourceimpl.remote.OrderReminderRemoteDataSourceImpl
import com.intellihealth.truemeds.domain.repository.OrderReminderRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class OrderReminderRemoteDataModule {
    @Singleton
    @Binds
    abstract fun bindOrderReminderRemoteData(orderReminderRemoteDataSourceImpl: OrderReminderRemoteDataSourceImpl): OrderReminderRemoteDataSource
}

@Module
@InstallIn(SingletonComponent::class)
abstract class OrderReminderRepositoryModule {
    @Binds
    abstract fun bindOrderReminderRepository(orderReminderRepositoryImpl: OrderReminderRepositoryImpl): OrderReminderRepository
}


@Module
@InstallIn(SingletonComponent::class)
class OrderReminderNetworkModule {
    @Singleton
    @Provides
    fun providesOrderReminderApi(retrofit: Retrofit): OrderReminderApi {
        return retrofit.create(OrderReminderApi::class.java)
    }
}
