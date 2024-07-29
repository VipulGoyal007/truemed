package com.intellihealth.truemeds.di;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\'J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\'J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\'\u00a8\u0006\u0017"}, d2 = {"Lcom/intellihealth/truemeds/di/RepositoryModule;", "", "()V", "bindsLocalDbRepository", "Lcom/intellihealth/truemeds/domain/repository/LocalDbRepository;", "localDbRepository", "Lcom/intellihealth/truemeds/data/repository/datasource/local/LocalDbRepositoryImpl;", "bindsLoginRepository", "Lcom/intellihealth/truemeds/domain/repository/LoginRepository;", "loginRepositoryImpl", "Lcom/intellihealth/truemeds/data/repository/LoginRepositoryImpl;", "bindsSearchRepository", "Lcom/intellihealth/truemeds/domain/repository/SearchRepository;", "searchRepositoryImpl", "Lcom/intellihealth/truemeds/data/repository/SearchRepositoryImpl;", "bindsUserDataRepository", "Lcom/intellihealth/truemeds/domain/repository/UserDataRepository;", "userDataRepositoryImpl", "Lcom/intellihealth/truemeds/data/repository/UserDataRepositoryImpl;", "bindsWalletRepository", "Lcom/intellihealth/truemeds/domain/repository/TmWalletRepository;", "walletRepositoryImpl", "Lcom/intellihealth/truemeds/data/repository/TmWalletRepositoryImpl;", "app_prodDebug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public abstract class RepositoryModule {
    
    public RepositoryModule() {
        super();
    }
    
    @dagger.Binds()
    @org.jetbrains.annotations.NotNull()
    public abstract com.intellihealth.truemeds.domain.repository.LoginRepository bindsLoginRepository(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.LoginRepositoryImpl loginRepositoryImpl);
    
    @dagger.Binds()
    @org.jetbrains.annotations.NotNull()
    public abstract com.intellihealth.truemeds.domain.repository.SearchRepository bindsSearchRepository(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.SearchRepositoryImpl searchRepositoryImpl);
    
    @dagger.Binds()
    @org.jetbrains.annotations.NotNull()
    public abstract com.intellihealth.truemeds.domain.repository.TmWalletRepository bindsWalletRepository(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.TmWalletRepositoryImpl walletRepositoryImpl);
    
    @dagger.Binds()
    @org.jetbrains.annotations.NotNull()
    public abstract com.intellihealth.truemeds.domain.repository.UserDataRepository bindsUserDataRepository(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.UserDataRepositoryImpl userDataRepositoryImpl);
    
    @dagger.Binds()
    @org.jetbrains.annotations.NotNull()
    public abstract com.intellihealth.truemeds.domain.repository.LocalDbRepository bindsLocalDbRepository(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.datasource.local.LocalDbRepositoryImpl localDbRepository);
}