package com.intellihealth.truemeds.data.api;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JJ\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0001\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\fH\u00a7@\u00a2\u0006\u0002\u0010\rJ4\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0001\u0010\n\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0002\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lcom/intellihealth/truemeds/data/api/CashFreeApi;", "", "createOrderTokenInCashFree", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "contentType", "", "transactionId", "orderId", "", "authorization", "version", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveCashFreeResponse", "cfTxnRequestBody", "Lcom/google/gson/JsonObject;", "(Ljava/lang/String;Lcom/google/gson/JsonObject;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_stageAndroidDebug"})
public abstract interface CashFreeApi {
    
    @retrofit2.http.POST(value = "/ThirdPartyService/saveCashFreeResponse")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object saveCashFreeResponse(@retrofit2.http.Header(value = "Content-Type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String contentType, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    com.google.gson.JsonObject cfTxnRequestBody, @retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull()
    java.lang.String authorization, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion);
    
    @retrofit2.http.GET(value = "/ThirdPartyService/createOrderTokenInCashFree")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object createOrderTokenInCashFree(@retrofit2.http.Header(value = "Content-Type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String contentType, @retrofit2.http.Header(value = "transactionId")
    @org.jetbrains.annotations.Nullable()
    java.lang.String transactionId, @retrofit2.http.Query(value = "orderId")
    @org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, @retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull()
    java.lang.String authorization, @retrofit2.http.Query(value = "version")
    int version, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion);
}