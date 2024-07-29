package com.intellihealth.truemeds.di

import com.intellihealth.truemeds.data.repository.LoginRepositoryImpl
import com.intellihealth.truemeds.data.repository.SearchRepositoryImpl
import com.intellihealth.truemeds.data.repository.TmWalletRepositoryImpl
import com.intellihealth.truemeds.data.repository.UserDataRepositoryImpl
import com.intellihealth.truemeds.data.repository.datasource.local.LocalDbRepositoryImpl
import com.intellihealth.truemeds.domain.repository.LocalDbRepository
import com.intellihealth.truemeds.domain.repository.LoginRepository
import com.intellihealth.truemeds.domain.repository.SearchRepository
import com.intellihealth.truemeds.domain.repository.TmWalletRepository
import com.intellihealth.truemeds.domain.repository.UserDataRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    abstract fun bindsLoginRepository(loginRepositoryImpl: LoginRepositoryImpl): LoginRepository

    @Binds
    abstract fun bindsSearchRepository(searchRepositoryImpl: SearchRepositoryImpl): SearchRepository

    @Binds
    abstract fun bindsWalletRepository(walletRepositoryImpl: TmWalletRepositoryImpl): TmWalletRepository

    @Binds
    abstract fun bindsUserDataRepository(userDataRepositoryImpl: UserDataRepositoryImpl): UserDataRepository

    @Binds
    abstract fun bindsLocalDbRepository(localDbRepository: LocalDbRepositoryImpl): LocalDbRepository
}