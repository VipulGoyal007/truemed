package com.intellihealth.truemeds.data.api;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J4\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0002\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/intellihealth/truemeds/data/api/SplashScreenApi;", "", "mobileMaster", "Lretrofit2/Response;", "Lcom/intellihealth/truemeds/data/model/splashactivity/MobileMasterResponse;", "contentType", "", "authorization", "versionName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_stageAndroidDebug"})
public abstract interface SplashScreenApi {
    
    @retrofit2.http.GET(value = "/CustomerService/v1/mobileMaster")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object mobileMaster(@retrofit2.http.Header(value = "Content-Type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String contentType, @retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String authorization, @retrofit2.http.Query(value = "versionName")
    @org.jetbrains.annotations.NotNull()
    java.lang.String versionName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.splashactivity.MobileMasterResponse>> $completion);
}