package com.intellihealth.truemeds.di

import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.NamedConstants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class ValueProviderModule {
    @Singleton
    @Provides
    @Named(NamedConstants.CONTENT_TYPE)
    fun getContentType(): String = "application/json"

    @Singleton
    @Provides
    @Named(NamedConstants.ACCESS_TOKEN)
    fun getAccessToken(): String = SharedPrefManager.getInstance().loggedInUserAccessToken
    //fun getAccessToken(): String = "Bearer eyJhbGciOiJIUzUxMiIsInppcCI6IkRFRiJ9.eNqqViouTVKyUrIwMzAwMjEwMzdW0lEqzi8tSk4Fiob4xoe7OgV7hrjGh8Ub6QEhULYoPyfVJ7O4RMkqWinI38c13jk0OMTf1zVIKVZHKbWiQMnK0NzY3MDAxMLEVEcpM7EEJGBgamJmARSoBQAAAP__.i9QsuqRh4EPwVEVTRECjRFiobB9wjCw5ZRFoW8sJrmVjM-OQJDtMwWNCjIvBVkUBRKqMvLPVid8Qp0vZKn3oRg"
}