package com.intellihealth.truemeds.di;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007\u00a8\u0006\u0006"}, d2 = {"Lcom/intellihealth/truemeds/di/ValueProviderModule;", "", "()V", "getAccessToken", "", "getContentType", "app_prodDebug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class ValueProviderModule {
    
    public ValueProviderModule() {
        super();
    }
    
    @javax.inject.Singleton()
    @dagger.Provides()
    @javax.inject.Named(value = "content_type")
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getContentType() {
        return null;
    }
    
    @javax.inject.Singleton()
    @dagger.Provides()
    @javax.inject.Named(value = "access_token")
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAccessToken() {
        return null;
    }
}