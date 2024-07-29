package com.intellihealth.truemeds.di;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\u000bH\u0007J\"\u0010\f\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\b\u001a\u00020\tH\u0007\u00a8\u0006\u000f"}, d2 = {"Lcom/intellihealth/truemeds/di/OkHttpClientModule;", "", "()V", "cache", "Lokhttp3/Cache;", "cacheFile", "Ljava/io/File;", "file", "context", "Landroid/content/Context;", "httpLoggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "providesOkHttpClient", "Lokhttp3/OkHttpClient;", "BasicAuthInterceptor", "app_prodDebug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class OkHttpClientModule {
    
    public OkHttpClientModule() {
        super();
    }
    
    @javax.inject.Singleton()
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.OkHttpClient providesOkHttpClient(@org.jetbrains.annotations.NotNull()
    okhttp3.Cache cache, @org.jetbrains.annotations.NotNull()
    okhttp3.logging.HttpLoggingInterceptor httpLoggingInterceptor, @dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @javax.inject.Singleton()
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.Cache cache(@org.jetbrains.annotations.Nullable()
    java.io.File cacheFile) {
        return null;
    }
    
    @javax.inject.Singleton()
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final java.io.File file(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @javax.inject.Singleton()
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.logging.HttpLoggingInterceptor httpLoggingInterceptor() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lcom/intellihealth/truemeds/di/OkHttpClientModule$BasicAuthInterceptor;", "Lokhttp3/Interceptor;", "sdkEventUseCase", "Lcom/intellihealth/truemeds/domain/usecase/analytics/SdkEventUseCase;", "(Lcom/intellihealth/truemeds/domain/usecase/analytics/SdkEventUseCase;)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "app_prodDebug"})
    public static final class BasicAuthInterceptor implements okhttp3.Interceptor {
        
        public BasicAuthInterceptor(@org.jetbrains.annotations.NotNull()
        com.intellihealth.truemeds.domain.usecase.analytics.SdkEventUseCase sdkEventUseCase) {
            super();
        }
        
        @java.lang.Override()
        @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
        @org.jetbrains.annotations.NotNull()
        public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull()
        okhttp3.Interceptor.Chain chain) throws java.io.IOException {
            return null;
        }
    }
}