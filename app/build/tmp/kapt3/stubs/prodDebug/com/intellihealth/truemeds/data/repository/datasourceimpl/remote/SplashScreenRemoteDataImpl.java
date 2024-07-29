package com.intellihealth.truemeds.data.repository.datasourceimpl.remote;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B#\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\u0007H\u0096@\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/intellihealth/truemeds/data/repository/datasourceimpl/remote/SplashScreenRemoteDataImpl;", "Lcom/intellihealth/truemeds/data/repository/datasource/remote/SplashScreenRemoteData;", "context", "Landroid/content/Context;", "splashScreenApi", "Lcom/intellihealth/truemeds/data/api/SplashScreenApi;", "contentType", "", "(Landroid/content/Context;Lcom/intellihealth/truemeds/data/api/SplashScreenApi;Ljava/lang/String;)V", "getMobileMaster", "Lretrofit2/Response;", "Lcom/intellihealth/truemeds/data/model/splashactivity/MobileMasterResponse;", "versionName", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_prodDebug"})
public final class SplashScreenRemoteDataImpl implements com.intellihealth.truemeds.data.repository.datasource.remote.SplashScreenRemoteData {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.data.api.SplashScreenApi splashScreenApi = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String contentType = null;
    
    @javax.inject.Inject()
    public SplashScreenRemoteDataImpl(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.api.SplashScreenApi splashScreenApi, @javax.inject.Named(value = "content_type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String contentType) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getMobileMaster(@org.jetbrains.annotations.NotNull()
    java.lang.String versionName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.splashactivity.MobileMasterResponse>> $completion) {
        return null;
    }
}