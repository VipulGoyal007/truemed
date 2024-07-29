package com.intellihealth.truemeds.di

import com.intellihealth.truemeds.data.api.HelpFaqTncApi
import com.intellihealth.truemeds.data.api.LoginApi
import com.intellihealth.truemeds.data.api.OrderIssueApi
import com.intellihealth.truemeds.data.api.OrderReminderApi
import com.intellihealth.truemeds.data.api.UserDataApi
import com.intellihealth.truemeds.data.api.WalletAndReferralApi
import com.intellihealth.truemeds.data.utils.ApiEndpointConstants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class ApiModule {
    @Singleton
    @Provides
    fun providesRetrofit(okHttpClient: OkHttpClient): Retrofit {
        val interceptor = HttpLoggingInterceptor()
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)

        return Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl(ApiEndpointConstants.baseUrl())
            .addConverterFactory(ScalarsConverterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    /*@Singleton
    @Provides
    fun providesHelpFaqTncApi(retrofit: Retrofit): HelpFaqTncApi {
        return retrofit.create(HelpFaqTncApi::class.java)
    }*/

    @Singleton
    @Provides
    fun providesLoginApi(retrofit: Retrofit): LoginApi {
        return retrofit.create(LoginApi::class.java)
    }



    @Singleton
    @Provides
    fun providesOrderIssueApi(retrofit: Retrofit): OrderIssueApi {
        return retrofit.create(OrderIssueApi::class.java)
    }





    @Singleton
    @Provides
    fun providesUserDataApi(retrofit: Retrofit): UserDataApi {
        return retrofit.create(UserDataApi::class.java)
    }



}