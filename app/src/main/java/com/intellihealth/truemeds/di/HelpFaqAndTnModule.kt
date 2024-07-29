package com.intellihealth.truemeds.di

import com.intellihealth.truemeds.data.repository.HelpFaqAndTnCRepositoryImpl
import com.intellihealth.truemeds.domain.repository.HelpFaqAndTnCRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class HelpFaqAndTnModule {

}