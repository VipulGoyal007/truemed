package com.intellihealth.truemeds.di

import com.intellihealth.truemeds.data.api.CashFreeApi
import com.intellihealth.truemeds.data.repository.CashFreeRepositoryImpl
import com.intellihealth.truemeds.data.repository.datasource.remote.CashFreeRemoteDataSource
import com.intellihealth.truemeds.data.repository.datasourceimpl.remote.CashFreeRemoteDataSourceImpl
import com.intellihealth.truemeds.domain.repository.CashFreeRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class CashFreeDataModule {
    @Singleton
    @Binds
    abstract fun bindCashFreeRemoteData(cashFreeRemoteDataSourceImpl: CashFreeRemoteDataSourceImpl): CashFreeRemoteDataSource
}

@Module
@InstallIn(SingletonComponent::class)
abstract class CashFreeRepositoryModule {
    @Binds
    abstract fun bindCashFreeRepository(cashFreeRepositoryImpl: CashFreeRepositoryImpl): CashFreeRepository
}


@Module
@InstallIn(SingletonComponent::class)
class CashFreeNetworkModule {
    @Provides
    fun providesCashFreeApi(retrofit: Retrofit): CashFreeApi {
        return retrofit.create(CashFreeApi::class.java)
    }
}