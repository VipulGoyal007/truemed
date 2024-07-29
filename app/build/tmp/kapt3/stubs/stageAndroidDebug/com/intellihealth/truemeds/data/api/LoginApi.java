package com.intellihealth.truemeds.data.api;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00a7@\u00a2\u0006\u0002\u0010\bJ,\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000bH\u00a7@\u00a2\u0006\u0002\u0010\fJ<\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\u000f\u001a\u00020\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u00062\b\b\u0001\u0010\u0011\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0002\u0010\u0013J,\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00a7@\u00a2\u0006\u0002\u0010\u0018Jr\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\"\u001a\u00020\u001fH\u00a7@\u00a2\u0006\u0002\u0010#Jd\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\"\u001a\u00020\u001f2\b\b\u0001\u0010\u001e\u001a\u00020\u001f2\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\u0006H\u00a7@\u00a2\u0006\u0002\u0010\'\u00a8\u0006("}, d2 = {"Lcom/intellihealth/truemeds/data/api/LoginApi;", "", "fetchDefaultToken", "Lretrofit2/Response;", "Lcom/intellihealth/truemeds/data/model/login/DefaultTokenResponse;", "contentType", "", "base64String", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchSessionToken", "helpObject", "Lcom/google/gson/JsonObject;", "(Ljava/lang/String;Lcom/google/gson/JsonObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTrueCallerToken", "Lcom/intellihealth/truemeds/data/model/login/TruecallerTokenResponse;", "grantType", "clientId", "code", "codeVerifier", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendMobileOtp", "Lcom/intellihealth/truemeds/data/model/login/SendMobileOtpResponse;", "mobileOtpRequest", "Lcom/intellihealth/truemeds/data/model/login/MobileOtpRequest;", "(Ljava/lang/String;Lcom/intellihealth/truemeds/data/model/login/MobileOtpRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifyOtp", "Lcom/intellihealth/truemeds/data/model/login/LoginVerificationResponse;", "mobileNo", "otp", "deviceKey", "isIos", "", "aaid", "source", "skippedLogin", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifyTruecallerToken", "truecallerToken", "sessionToken", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_stageAndroidDebug"})
public abstract interface LoginApi {
    
    @retrofit2.http.POST(value = "/CustomerService/v1/fetchDefaultToken")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchDefaultToken(@retrofit2.http.Header(value = "Content-Type")
    @org.jetbrains.annotations.Nullable()
    java.lang.String contentType, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    java.lang.String base64String, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.login.DefaultTokenResponse>> $completion);
    
    @retrofit2.http.POST(value = "/CustomerService/v1/fetchSessionToken")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchSessionToken(@retrofit2.http.Header(value = "Content-Type")
    @org.jetbrains.annotations.Nullable()
    java.lang.String contentType, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    com.google.gson.JsonObject helpObject, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.login.DefaultTokenResponse>> $completion);
    
    @retrofit2.http.POST(value = "/CustomerService/v1/sendMobileOtp")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object sendMobileOtp(@retrofit2.http.Header(value = "Content-Type")
    @org.jetbrains.annotations.Nullable()
    java.lang.String contentType, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.login.MobileOtpRequest mobileOtpRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.login.SendMobileOtpResponse>> $completion);
    
    @retrofit2.http.GET(value = "/CustomerService/v1/verifyOtp")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object verifyOtp(@retrofit2.http.Header(value = "Content-Type")
    @org.jetbrains.annotations.Nullable()
    java.lang.String contentType, @retrofit2.http.Query(value = "mobileNo")
    @org.jetbrains.annotations.Nullable()
    java.lang.String mobileNo, @retrofit2.http.Query(value = "otp")
    @org.jetbrains.annotations.Nullable()
    java.lang.String otp, @retrofit2.http.Query(value = "deviceKey")
    @org.jetbrains.annotations.Nullable()
    java.lang.String deviceKey, @retrofit2.http.Query(value = "isIos")
    @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isIos, @retrofit2.http.Query(value = "aaid")
    @org.jetbrains.annotations.Nullable()
    java.lang.String aaid, @retrofit2.http.Query(value = "source")
    @org.jetbrains.annotations.Nullable()
    java.lang.String source, @retrofit2.http.Query(value = "skippedLogin")
    boolean skippedLogin, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.login.LoginVerificationResponse>> $completion);
    
    @retrofit2.http.FormUrlEncoded()
    @retrofit2.http.POST(value = "https://oauth-account-noneu.truecaller.com/v1/token")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTrueCallerToken(@retrofit2.http.Field(value = "grant_type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String grantType, @retrofit2.http.Field(value = "client_id")
    @org.jetbrains.annotations.NotNull()
    java.lang.String clientId, @retrofit2.http.Field(value = "code")
    @org.jetbrains.annotations.NotNull()
    java.lang.String code, @retrofit2.http.Field(value = "code_verifier")
    @org.jetbrains.annotations.NotNull()
    java.lang.String codeVerifier, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.login.TruecallerTokenResponse>> $completion);
    
    @retrofit2.http.POST(value = "/CustomerService/v1/verifyTruecallerToken")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object verifyTruecallerToken(@retrofit2.http.Query(value = "truecallerToken")
    @org.jetbrains.annotations.Nullable()
    java.lang.String truecallerToken, @retrofit2.http.Query(value = "deviceKey")
    @org.jetbrains.annotations.Nullable()
    java.lang.String deviceKey, @retrofit2.http.Query(value = "skippedLogin")
    boolean skippedLogin, @retrofit2.http.Query(value = "isIos")
    boolean isIos, @retrofit2.http.Query(value = "source")
    @org.jetbrains.annotations.Nullable()
    java.lang.String source, @retrofit2.http.Query(value = "aaid")
    @org.jetbrains.annotations.Nullable()
    java.lang.String aaid, @retrofit2.http.Query(value = "sessionToken")
    @org.jetbrains.annotations.Nullable()
    java.lang.String sessionToken, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.login.LoginVerificationResponse>> $completion);
}