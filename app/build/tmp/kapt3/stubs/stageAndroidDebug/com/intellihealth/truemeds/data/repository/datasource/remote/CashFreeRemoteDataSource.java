package com.intellihealth.truemeds.data.repository.datasource.remote;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u00a6@\u00a2\u0006\u0002\u0010\u000bJ\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00a6@\u00a2\u0006\u0002\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/intellihealth/truemeds/data/repository/datasource/remote/CashFreeRemoteDataSource;", "", "createOrderTokenInCashFree", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "transactionId", "", "orderId", "", "version", "", "(Ljava/lang/String;Ljava/lang/Long;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveCashFreeResponse", "cfTxnRequestBody", "Lcom/google/gson/JsonObject;", "(Lcom/google/gson/JsonObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_stageAndroidDebug"})
public abstract interface CashFreeRemoteDataSource {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object saveCashFreeResponse(@org.jetbrains.annotations.Nullable()
    com.google.gson.JsonObject cfTxnRequestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object createOrderTokenInCashFree(@org.jetbrains.annotations.Nullable()
    java.lang.String transactionId, @org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, int version, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion);
}