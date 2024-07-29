package com.intellihealth.truemeds.data.repository.datasourceimpl.remote;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J8\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@\u00a2\u0006\u0002\u0010\u0010J8\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@\u00a2\u0006\u0002\u0010\u0010J\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\bH\u0096@\u00a2\u0006\u0002\u0010\u0014J\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\bH\u0096@\u00a2\u0006\u0002\u0010\u0014J\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\u0006\u0010\f\u001a\u00020\u0005H\u0096@\u00a2\u0006\u0002\u0010\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/intellihealth/truemeds/data/repository/datasourceimpl/remote/CancelOrderRemoteDataSourceImpl;", "Lcom/intellihealth/truemeds/data/repository/datasource/remote/CancelOrderRemoteDataSource;", "cancelOrderApi", "Lcom/intellihealth/truemeds/data/api/CancelOrderApi;", "contentType", "", "(Lcom/intellihealth/truemeds/data/api/CancelOrderApi;Ljava/lang/String;)V", "cancelOrder", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "orderId", "", "reasonId", "notes", "cancelledById", "", "(JLjava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "discardOrderWithReason", "getL1ReasonsForOrderCancellation", "Lcom/intellihealth/truemeds/data/model/cancelorder/CancelReasonResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getReasonsForOrderCancellation", "getSubsReasonsForOrderCancellation", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_stageAndroidDebug"})
public final class CancelOrderRemoteDataSourceImpl implements com.intellihealth.truemeds.data.repository.datasource.remote.CancelOrderRemoteDataSource {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.data.api.CancelOrderApi cancelOrderApi = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String contentType = null;
    
    @javax.inject.Inject()
    public CancelOrderRemoteDataSourceImpl(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.api.CancelOrderApi cancelOrderApi, @javax.inject.Named(value = "content_type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String contentType) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getReasonsForOrderCancellation(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.cancelorder.CancelReasonResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getL1ReasonsForOrderCancellation(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.cancelorder.CancelReasonResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getSubsReasonsForOrderCancellation(@org.jetbrains.annotations.NotNull()
    java.lang.String reasonId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.cancelorder.CancelReasonResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object cancelOrder(long orderId, @org.jetbrains.annotations.Nullable()
    java.lang.String reasonId, @org.jetbrains.annotations.Nullable()
    java.lang.String notes, int cancelledById, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object discardOrderWithReason(long orderId, @org.jetbrains.annotations.Nullable()
    java.lang.String reasonId, @org.jetbrains.annotations.Nullable()
    java.lang.String notes, int cancelledById, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion) {
        return null;
    }
}