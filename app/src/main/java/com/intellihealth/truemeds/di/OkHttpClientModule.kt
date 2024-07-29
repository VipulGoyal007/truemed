package com.intellihealth.truemeds.di

import android.content.Context
import com.chuckerteam.chucker.api.ChuckerInterceptor
import com.intellihealth.truemeds.domain.usecase.analytics.SdkEventUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.Cache
import okhttp3.Credentials.basic
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import okhttp3.ResponseBody
import okhttp3.logging.HttpLoggingInterceptor
import java.io.File
import java.io.IOException
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class OkHttpClientModule {

    @Singleton
    @Provides
    fun providesOkHttpClient(
        cache: Cache,
        httpLoggingInterceptor: HttpLoggingInterceptor,
        @ApplicationContext context: Context
    ): OkHttpClient {
        /*val interceptor = HttpLoggingInterceptor()
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)*/
        return OkHttpClient()
            .newBuilder()
            .cache(cache)
            //.addInterceptor(BasicAuthInterceptor())
            .addInterceptor(ChuckerInterceptor.Builder(context).build())
            .connectTimeout(300, TimeUnit.SECONDS)
            .readTimeout(300, TimeUnit.SECONDS)
            .writeTimeout(300, TimeUnit.SECONDS)
            .build()
    }


    @Singleton
    @Provides
    fun cache(cacheFile: File?): Cache {
        return Cache(cacheFile!!, (10 * 1000 * 1000).toLong()) //10 MB
    }


    @Singleton
    @Provides
    fun file(@ApplicationContext context: Context): File {
        val file = File(context.cacheDir, "HttpCache")
        file.mkdirs()
        return file
    }


    @Singleton
    @Provides
    fun httpLoggingInterceptor(): HttpLoggingInterceptor {
        val httpLoggingInterceptor = HttpLoggingInterceptor(object : HttpLoggingInterceptor.Logger {
            override fun log(message: String) {}
        })
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
        return httpLoggingInterceptor
    }


    internal class BasicAuthInterceptor(sdkEventUseCase: SdkEventUseCase) :Interceptor {

        @Throws(IOException::class)
        override fun intercept(chain: Interceptor.Chain): Response {
            val request: Request = chain.request()
            /*val authenticatedRequest =
                request.newBuilder().build()*/
            var response = chain.proceed(request)
            /*if (!response.isSuccessful) {
                // Get the original error body
                val originalErrorBody = response.body

                // Read the original error body as string
                val originalErrorBodyString = originalErrorBody?.string()

                // Modify the error body as needed
                val modifiedErrorBodyString = modifyErrorBody(originalErrorBodyString)

                // Create a new response with the modified error body
                val modifiedResponseBody = ResponseBody.create(
                    originalErrorBody?.contentType(),
                    modifiedErrorBodyString ?: ""
                )

                val modifiedResponse = response.newBuilder()
                    .body(modifiedResponseBody)
                    .build()
            }*/
            return response
        }
    }


}
