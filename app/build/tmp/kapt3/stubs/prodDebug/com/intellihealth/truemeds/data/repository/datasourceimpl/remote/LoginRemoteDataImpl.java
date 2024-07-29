package com.intellihealth.truemeds.data.repository.datasourceimpl.remote;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u0005H\u0096@\u00a2\u0006\u0002\u0010\u000bJ\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\rH\u0096@\u00a2\u0006\u0002\u0010\u000eJ4\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H\u0096@\u00a2\u0006\u0002\u0010\u0015J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096@\u00a2\u0006\u0002\u0010\u001aJX\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u00052\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010\u00052\b\u0010#\u001a\u0004\u0018\u00010\u00052\u0006\u0010$\u001a\u00020!H\u0096@\u00a2\u0006\u0002\u0010%JL\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001c0\b2\u0006\u0010\'\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u00052\u0006\u0010)\u001a\u00020!2\u0006\u0010 \u001a\u00020!2\u0006\u0010#\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u0005H\u0096@\u00a2\u0006\u0002\u0010+R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lcom/intellihealth/truemeds/data/repository/datasourceimpl/remote/LoginRemoteDataImpl;", "Lcom/intellihealth/truemeds/data/repository/datasource/remote/LoginRemoteData;", "loginApi", "Lcom/intellihealth/truemeds/data/api/LoginApi;", "contentType", "", "(Lcom/intellihealth/truemeds/data/api/LoginApi;Ljava/lang/String;)V", "fetchDefaultToken", "Lretrofit2/Response;", "Lcom/intellihealth/truemeds/data/model/login/DefaultTokenResponse;", "encodeToString", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSessionToken", "Lcom/google/gson/JsonObject;", "(Lcom/google/gson/JsonObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTrueCallerToken", "Lcom/intellihealth/truemeds/data/model/login/TruecallerTokenResponse;", "textAuthorizationCode", "clientId", "authorizationCode", "codeVerifier", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendMobileOtp", "Lcom/intellihealth/truemeds/data/model/login/SendMobileOtpResponse;", "mobileOtpRequest", "Lcom/intellihealth/truemeds/data/model/login/MobileOtpRequest;", "(Lcom/intellihealth/truemeds/data/model/login/MobileOtpRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifyOtp", "Lcom/intellihealth/truemeds/data/model/login/LoginVerificationResponse;", "mobileNo", "otp", "deviceKey", "isIos", "", "aaid", "source", "skippedLogin", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifyTrueCallerToken", "tcToken", "firebaseID", "loginSkipped", "sessionToken", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_prodDebug"})
public final class LoginRemoteDataImpl implements com.intellihealth.truemeds.data.repository.datasource.remote.LoginRemoteData {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.data.api.LoginApi loginApi = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String contentType = null;
    
    @javax.inject.Inject()
    public LoginRemoteDataImpl(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.api.LoginApi loginApi, @javax.inject.Named(value = "content_type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String contentType) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getTrueCallerToken(@org.jetbrains.annotations.NotNull()
    java.lang.String textAuthorizationCode, @org.jetbrains.annotations.NotNull()
    java.lang.String clientId, @org.jetbrains.annotations.NotNull()
    java.lang.String authorizationCode, @org.jetbrains.annotations.NotNull()
    java.lang.String codeVerifier, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.login.TruecallerTokenResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object fetchDefaultToken(@org.jetbrains.annotations.NotNull()
    java.lang.String encodeToString, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.login.DefaultTokenResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getSessionToken(@org.jetbrains.annotations.NotNull()
    com.google.gson.JsonObject encodeToString, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.login.DefaultTokenResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object sendMobileOtp(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.login.MobileOtpRequest mobileOtpRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.login.SendMobileOtpResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object verifyOtp(@org.jetbrains.annotations.Nullable()
    java.lang.String mobileNo, @org.jetbrains.annotations.Nullable()
    java.lang.String otp, @org.jetbrains.annotations.Nullable()
    java.lang.String deviceKey, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isIos, @org.jetbrains.annotations.Nullable()
    java.lang.String aaid, @org.jetbrains.annotations.Nullable()
    java.lang.String source, boolean skippedLogin, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.login.LoginVerificationResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object verifyTrueCallerToken(@org.jetbrains.annotations.NotNull()
    java.lang.String tcToken, @org.jetbrains.annotations.NotNull()
    java.lang.String firebaseID, boolean loginSkipped, boolean isIos, @org.jetbrains.annotations.NotNull()
    java.lang.String source, @org.jetbrains.annotations.NotNull()
    java.lang.String aaid, @org.jetbrains.annotations.NotNull()
    java.lang.String sessionToken, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.login.LoginVerificationResponse>> $completion) {
        return null;
    }
}