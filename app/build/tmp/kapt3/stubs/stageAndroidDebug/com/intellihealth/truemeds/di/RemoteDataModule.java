package com.intellihealth.truemeds.di;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\'J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\'\u00a8\u0006\u0013"}, d2 = {"Lcom/intellihealth/truemeds/di/RemoteDataModule;", "", "()V", "bindsElasticMedicineRemoteDataSource", "Lcom/intellihealth/truemeds/data/repository/datasource/remote/ElasticMedicineRemoteDataSource;", "elasticMedicineRemoteDataSourceImpl", "Lcom/intellihealth/truemeds/data/repository/datasourceimpl/remote/ElasticMedicineRemoteDataSourceImpl;", "bindsLoginRemoteDataSource", "Lcom/intellihealth/truemeds/data/repository/datasource/remote/LoginRemoteData;", "loginRemoteDataSourceImpl", "Lcom/intellihealth/truemeds/data/repository/datasourceimpl/remote/LoginRemoteDataImpl;", "bindsTmWalletRemoteDataSource", "Lcom/intellihealth/truemeds/data/repository/datasource/remote/TmWalletRemoteDataSource;", "tmWalletRemoteDataSourceImpl", "Lcom/intellihealth/truemeds/data/repository/datasourceimpl/remote/TmWalletRemoteDataSourceImpl;", "bindsUserDataRemoteDataSource", "Lcom/intellihealth/truemeds/data/repository/datasource/remote/UserRemoteDataSource;", "userDataRemoteDataSourceImpl", "Lcom/intellihealth/truemeds/data/repository/datasourceimpl/remote/UserRemoteDataSourceImpl;", "app_stageAndroidDebug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public abstract class RemoteDataModule {
    
    public RemoteDataModule() {
        super();
    }
    
    @dagger.Binds()
    @org.jetbrains.annotations.NotNull()
    public abstract com.intellihealth.truemeds.data.repository.datasource.remote.LoginRemoteData bindsLoginRemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.datasourceimpl.remote.LoginRemoteDataImpl loginRemoteDataSourceImpl);
    
    @dagger.Binds()
    @org.jetbrains.annotations.NotNull()
    public abstract com.intellihealth.truemeds.data.repository.datasource.remote.ElasticMedicineRemoteDataSource bindsElasticMedicineRemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.datasourceimpl.remote.ElasticMedicineRemoteDataSourceImpl elasticMedicineRemoteDataSourceImpl);
    
    @dagger.Binds()
    @org.jetbrains.annotations.NotNull()
    public abstract com.intellihealth.truemeds.data.repository.datasource.remote.TmWalletRemoteDataSource bindsTmWalletRemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.datasourceimpl.remote.TmWalletRemoteDataSourceImpl tmWalletRemoteDataSourceImpl);
    
    @dagger.Binds()
    @org.jetbrains.annotations.NotNull()
    public abstract com.intellihealth.truemeds.data.repository.datasource.remote.UserRemoteDataSource bindsUserDataRemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.datasourceimpl.remote.UserRemoteDataSourceImpl userDataRemoteDataSourceImpl);
}