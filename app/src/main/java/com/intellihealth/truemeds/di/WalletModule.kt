package com.intellihealth.truemeds.di

import com.intellihealth.truemeds.data.api.WalletAndReferralApi
import com.intellihealth.truemeds.data.repository.TmWalletRepositoryImpl
import com.intellihealth.truemeds.data.repository.datasource.remote.TmWalletRemoteDataSource
import com.intellihealth.truemeds.data.repository.datasourceimpl.remote.TmWalletRemoteDataSourceImpl
import com.intellihealth.truemeds.domain.repository.TmWalletRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

/**
 * The method was duplicated at another module so commented one of them
 */
/*@Module
@InstallIn(SingletonComponent::class)
abstract class WalletAndReferralDataModule {
    @Singleton
    @Binds
    abstract fun bindWalletAndReferralRemoteData(walletRemoteDataSourceImpl: TmWalletRemoteDataSourceImpl): TmWalletRemoteDataSource
}*/

/*@Module
@InstallIn(SingletonComponent::class)
abstract class WalletAndReferralRepositoryModule {
    @Binds
    abstract fun bindWalletAndReferralsRepository(walletRepositoryImpl: TmWalletRepositoryImpl): TmWalletRepository
}*/

@Module
@InstallIn(SingletonComponent::class)
class WalletAndReferralNetworkModule {
    @Singleton
    @Provides
    fun providesWalletAndReferralApi(retrofit: Retrofit): WalletAndReferralApi {
        return retrofit.create(WalletAndReferralApi::class.java)
    }
}