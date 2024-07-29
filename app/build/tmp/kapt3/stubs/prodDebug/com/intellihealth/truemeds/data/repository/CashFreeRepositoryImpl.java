package com.intellihealth.truemeds.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J>\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0096@\u00a2\u0006\u0002\u0010\u0013J,\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096@\u00a2\u0006\u0002\u0010\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/intellihealth/truemeds/data/repository/CashFreeRepositoryImpl;", "Lcom/intellihealth/truemeds/domain/repository/CashFreeRepository;", "cashFreeRemoteDataSource", "Lcom/intellihealth/truemeds/data/repository/datasource/remote/CashFreeRemoteDataSource;", "apiCallInitClass", "Lcom/intellihealth/truemeds/data/utils/ApiCallInitClass;", "(Lcom/intellihealth/truemeds/data/repository/datasource/remote/CashFreeRemoteDataSource;Lcom/intellihealth/truemeds/data/utils/ApiCallInitClass;)V", "createOrderTokenInCashFree", "Lcom/intellihealth/truemeds/data/utils/Resource;", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "mxInternalErrorOccurred", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "transactionId", "", "orderId", "", "version", "", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;Ljava/lang/Long;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveCashFreeResponse", "cfTxnRequestBody", "Lcom/google/gson/JsonObject;", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Lcom/google/gson/JsonObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_prodDebug"})
public final class CashFreeRepositoryImpl implements com.intellihealth.truemeds.domain.repository.CashFreeRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.data.repository.datasource.remote.CashFreeRemoteDataSource cashFreeRemoteDataSource = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.data.utils.ApiCallInitClass apiCallInitClass = null;
    
    @javax.inject.Inject()
    public CashFreeRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.datasource.remote.CashFreeRemoteDataSource cashFreeRemoteDataSource, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.utils.ApiCallInitClass apiCallInitClass) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object saveCashFreeResponse(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.Nullable()
    com.google.gson.JsonObject cfTxnRequestBody, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<okhttp3.ResponseBody>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object createOrderTokenInCashFree(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.Nullable()
    java.lang.String transactionId, @org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, int version, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<okhttp3.ResponseBody>>> $completion) {
        return null;
    }
}