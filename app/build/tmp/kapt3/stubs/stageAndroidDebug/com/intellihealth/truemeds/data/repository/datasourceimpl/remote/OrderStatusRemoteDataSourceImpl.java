package com.intellihealth.truemeds.data.repository.datasourceimpl.remote;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00a2\u0006\u0002\u0010\fJ\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00a2\u0006\u0002\u0010\fJ\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00a2\u0006\u0002\u0010\fJ$\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0005H\u0096@\u00a2\u0006\u0002\u0010\u0014J \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\b2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u0016J$\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0005H\u0096@\u00a2\u0006\u0002\u0010\u0014J0\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\b2\u0006\u0010\u0013\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u0096@\u00a2\u0006\u0002\u0010\u001fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/intellihealth/truemeds/data/repository/datasourceimpl/remote/OrderStatusRemoteDataSourceImpl;", "Lcom/intellihealth/truemeds/data/repository/datasource/remote/OrderStatusRemoteDataSource;", "orderStatusApi", "Lcom/intellihealth/truemeds/data/api/OrderStatusApi;", "contentType", "", "(Lcom/intellihealth/truemeds/data/api/OrderStatusApi;Ljava/lang/String;)V", "deleteAlternateNumberForOrder", "Lretrofit2/Response;", "Lcom/intellihealth/truemeds/data/model/orderstatus/DeleteAlternateNumberResponse;", "orderId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchDoctorOrderConfirmedAndBoxVerifiedDetails", "Lcom/intellihealth/truemeds/data/model/orderstatus/OrderConfirmBoxVerifyResponse;", "generateReturnUrlResponse", "Lcom/intellihealth/truemeds/data/model/orderstatus/GenerateReturnUrlResponse;", "getOrderStatus", "Lcom/intellihealth/truemeds/data/model/orderstatus/OrderStatusResponse;", "customerId", "(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOrderStatusVideo", "Lcom/intellihealth/truemeds/data/model/orderstatus/VideoOrderStatusResponse;", "app", "saveAlternateNumberForOrder", "Lcom/intellihealth/truemeds/data/model/orderstatus/AlternateNumberResponse;", "alternateNumber", "saveCustomerEmailAddress", "Lcom/intellihealth/truemeds/data/model/user/SaveEmailResponse;", "emailId", "transactionId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_stageAndroidDebug"})
public final class OrderStatusRemoteDataSourceImpl implements com.intellihealth.truemeds.data.repository.datasource.remote.OrderStatusRemoteDataSource {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.data.api.OrderStatusApi orderStatusApi = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String contentType = null;
    
    @javax.inject.Inject()
    public OrderStatusRemoteDataSourceImpl(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.api.OrderStatusApi orderStatusApi, @javax.inject.Named(value = "content_type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String contentType) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getOrderStatus(long orderId, @org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.orderstatus.OrderStatusResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object fetchDoctorOrderConfirmedAndBoxVerifiedDetails(long orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.orderstatus.OrderConfirmBoxVerifyResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public retrofit2.Response<com.intellihealth.truemeds.data.model.orderstatus.VideoOrderStatusResponse> getOrderStatusVideo(long orderId, @org.jetbrains.annotations.Nullable()
    java.lang.String app) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object saveAlternateNumberForOrder(long orderId, @org.jetbrains.annotations.NotNull()
    java.lang.String alternateNumber, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.orderstatus.AlternateNumberResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object deleteAlternateNumberForOrder(long orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.orderstatus.DeleteAlternateNumberResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object generateReturnUrlResponse(long orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.orderstatus.GenerateReturnUrlResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object saveCustomerEmailAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.Nullable()
    java.lang.String emailId, @org.jetbrains.annotations.Nullable()
    java.lang.String transactionId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.user.SaveEmailResponse>> $completion) {
        return null;
    }
}