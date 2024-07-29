package com.intellihealth.truemeds.data.repository.datasourceimpl.remote;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J0\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0002\u0010\u000fJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096@\u00a2\u0006\u0002\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/intellihealth/truemeds/data/repository/datasourceimpl/remote/CashFreeRemoteDataSourceImpl;", "Lcom/intellihealth/truemeds/data/repository/datasource/remote/CashFreeRemoteDataSource;", "cashFreeApi", "Lcom/intellihealth/truemeds/data/api/CashFreeApi;", "contentType", "", "(Lcom/intellihealth/truemeds/data/api/CashFreeApi;Ljava/lang/String;)V", "createOrderTokenInCashFree", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "transactionId", "orderId", "", "version", "", "(Ljava/lang/String;Ljava/lang/Long;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveCashFreeResponse", "cfTxnRequestBody", "Lcom/google/gson/JsonObject;", "(Lcom/google/gson/JsonObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_stageAndroidDebug"})
public final class CashFreeRemoteDataSourceImpl implements com.intellihealth.truemeds.data.repository.datasource.remote.CashFreeRemoteDataSource {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.data.api.CashFreeApi cashFreeApi = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String contentType = null;
    
    @javax.inject.Inject()
    public CashFreeRemoteDataSourceImpl(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.api.CashFreeApi cashFreeApi, @javax.inject.Named(value = "content_type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String contentType) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object saveCashFreeResponse(@org.jetbrains.annotations.Nullable()
    com.google.gson.JsonObject cfTxnRequestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object createOrderTokenInCashFree(@org.jetbrains.annotations.Nullable()
    java.lang.String transactionId, @org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, int version, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion) {
        return null;
    }
}