package com.intellihealth.truemeds.di


import com.intellihealth.truemeds.data.repository.datasource.remote.ElasticMedicineRemoteDataSource
import com.intellihealth.truemeds.data.repository.datasource.remote.LoginRemoteData
import com.intellihealth.truemeds.data.repository.datasource.remote.TmWalletRemoteDataSource
import com.intellihealth.truemeds.data.repository.datasource.remote.UserRemoteDataSource
import com.intellihealth.truemeds.data.repository.datasourceimpl.remote.ElasticMedicineRemoteDataSourceImpl
import com.intellihealth.truemeds.data.repository.datasourceimpl.remote.LoginRemoteDataImpl
import com.intellihealth.truemeds.data.repository.datasourceimpl.remote.TmWalletRemoteDataSourceImpl
import com.intellihealth.truemeds.data.repository.datasourceimpl.remote.UserRemoteDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RemoteDataModule {

    @Binds
    abstract fun bindsLoginRemoteDataSource(loginRemoteDataSourceImpl: LoginRemoteDataImpl): LoginRemoteData


    @Binds
    abstract fun bindsElasticMedicineRemoteDataSource(elasticMedicineRemoteDataSourceImpl: ElasticMedicineRemoteDataSourceImpl): ElasticMedicineRemoteDataSource


    @Binds
    abstract fun bindsTmWalletRemoteDataSource(tmWalletRemoteDataSourceImpl: TmWalletRemoteDataSourceImpl): TmWalletRemoteDataSource


    @Binds
    abstract fun bindsUserDataRemoteDataSource(userDataRemoteDataSourceImpl: UserRemoteDataSourceImpl): UserRemoteDataSource
}