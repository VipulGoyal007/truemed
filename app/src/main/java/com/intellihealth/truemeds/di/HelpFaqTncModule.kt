package com.intellihealth.truemeds.di

import com.intellihealth.truemeds.data.api.HelpFaqTncApi
import com.intellihealth.truemeds.data.repository.HelpFaqAndTnCRepositoryImpl
import com.intellihealth.truemeds.data.repository.datasource.remote.HelpFaqAndTnCRemoteDataSource
import com.intellihealth.truemeds.data.repository.datasourceimpl.remote.HelpFaqAndTnCRemoteDataSourceImpl
import com.intellihealth.truemeds.domain.repository.HelpFaqAndTnCRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
abstract class HelpFaqTncModule {
    @Singleton
    @Binds
    abstract fun bindHelpFaqTncRemoteData(helpFaqAndTnCRemoteDataSourceImpl: HelpFaqAndTnCRemoteDataSourceImpl): HelpFaqAndTnCRemoteDataSource
}

@Module
@InstallIn(SingletonComponent::class)
abstract class HelpFaqTncRepositoryModule {
    @Binds
    abstract fun bindsHelpFaqTncRepository(helpFaqAndTnCRepositoryImpl: HelpFaqAndTnCRepositoryImpl): HelpFaqAndTnCRepository
}

@Module
@InstallIn(SingletonComponent::class)
class HelpFaqTncNetworkModule {
    @Provides
    fun providesHelpFaqTncApi(retrofit: Retrofit): HelpFaqTncApi {
        return retrofit.create(HelpFaqTncApi::class.java)
    }
}