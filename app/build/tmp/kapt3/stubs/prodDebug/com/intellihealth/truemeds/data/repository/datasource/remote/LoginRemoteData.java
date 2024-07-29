package com.intellihealth.truemeds.data.repository.datasource.remote;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00a2\u0006\u0002\u0010\u0007J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\tH\u00a6@\u00a2\u0006\u0002\u0010\nJ4\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u00a6@\u00a2\u0006\u0002\u0010\u0011J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00a6@\u00a2\u0006\u0002\u0010\u0016JX\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u00062\u0006\u0010 \u001a\u00020\u001dH\u00a6@\u00a2\u0006\u0002\u0010!JL\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00180\u00032\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u0006H\u00a6@\u00a2\u0006\u0002\u0010\'\u00a8\u0006("}, d2 = {"Lcom/intellihealth/truemeds/data/repository/datasource/remote/LoginRemoteData;", "", "fetchDefaultToken", "Lretrofit2/Response;", "Lcom/intellihealth/truemeds/data/model/login/DefaultTokenResponse;", "encodeToString", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSessionToken", "Lcom/google/gson/JsonObject;", "(Lcom/google/gson/JsonObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTrueCallerToken", "Lcom/intellihealth/truemeds/data/model/login/TruecallerTokenResponse;", "textAuthorizationCode", "clientId", "authorizationCode", "codeVerifier", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendMobileOtp", "Lcom/intellihealth/truemeds/data/model/login/SendMobileOtpResponse;", "mobileOtpRequest", "Lcom/intellihealth/truemeds/data/model/login/MobileOtpRequest;", "(Lcom/intellihealth/truemeds/data/model/login/MobileOtpRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifyOtp", "Lcom/intellihealth/truemeds/data/model/login/LoginVerificationResponse;", "mobileNo", "otp", "deviceKey", "isIos", "", "aaid", "source", "skippedLogin", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifyTrueCallerToken", "tcToken", "firebaseID", "loginSkipped", "sessionToken", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_prodDebug"})
public abstract interface LoginRemoteData {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTrueCallerToken(@org.jetbrains.annotations.NotNull()
    java.lang.String textAuthorizationCode, @org.jetbrains.annotations.NotNull()
    java.lang.String clientId, @org.jetbrains.annotations.NotNull()
    java.lang.String authorizationCode, @org.jetbrains.annotations.NotNull()
    java.lang.String codeVerifier, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.login.TruecallerTokenResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchDefaultToken(@org.jetbrains.annotations.NotNull()
    java.lang.String encodeToString, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.login.DefaultTokenResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getSessionToken(@org.jetbrains.annotations.NotNull()
    com.google.gson.JsonObject encodeToString, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.login.DefaultTokenResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object sendMobileOtp(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.login.MobileOtpRequest mobileOtpRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.login.SendMobileOtpResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object verifyOtp(@org.jetbrains.annotations.Nullable()
    java.lang.String mobileNo, @org.jetbrains.annotations.Nullable()
    java.lang.String otp, @org.jetbrains.annotations.Nullable()
    java.lang.String deviceKey, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isIos, @org.jetbrains.annotations.Nullable()
    java.lang.String aaid, @org.jetbrains.annotations.Nullable()
    java.lang.String source, boolean skippedLogin, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.login.LoginVerificationResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object verifyTrueCallerToken(@org.jetbrains.annotations.NotNull()
    java.lang.String tcToken, @org.jetbrains.annotations.NotNull()
    java.lang.String firebaseID, boolean loginSkipped, boolean isIos, @org.jetbrains.annotations.NotNull()
    java.lang.String source, @org.jetbrains.annotations.NotNull()
    java.lang.String aaid, @org.jetbrains.annotations.NotNull()
    java.lang.String sessionToken, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.login.LoginVerificationResponse>> $completion);
}