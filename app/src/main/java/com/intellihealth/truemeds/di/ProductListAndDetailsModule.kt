package com.intellihealth.truemeds.di

import com.intellihealth.truemeds.data.api.ProductListAndDetailsApi
import com.intellihealth.truemeds.data.repository.ProductListAndDetailsRepositoryImpl
import com.intellihealth.truemeds.data.repository.datasource.remote.ProductListAndDetailsRemoteDataSource
import com.intellihealth.truemeds.data.repository.datasourceimpl.remote.ProductListAndDetailsRemoteDataSourceImpl
import com.intellihealth.truemeds.domain.repository.ProductListAndDetailsRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
abstract class ProductListAndDetailsRepositoryModule {

    @Binds
    abstract fun provideProductListAndDetailsRepository(productListAndDetailsRepositoryImpl: ProductListAndDetailsRepositoryImpl): ProductListAndDetailsRepository

}


@Module
@InstallIn(SingletonComponent::class)
abstract class ProductListAndDetailsDataModule {
    @Singleton
    @Binds
    abstract fun bindProductListAndDetailsRemoteData(productListAndDetailsRemoteDataSourceImpl: ProductListAndDetailsRemoteDataSourceImpl): ProductListAndDetailsRemoteDataSource

}



@Module
@InstallIn(SingletonComponent::class)
class ProductListAndDetailsNetworkModule {

    @Singleton
    @Provides
    fun providesProductListAndDetailsApi(retrofit: Retrofit): ProductListAndDetailsApi {
        return retrofit.create(ProductListAndDetailsApi::class.java)
    }
}