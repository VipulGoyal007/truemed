package com.intellihealth.truemeds.data.repository.datasource.remote;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00a2\u0006\u0002\u0010\u0007J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00a2\u0006\u0002\u0010\u0007J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00a2\u0006\u0002\u0010\u0007J$\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u00a6@\u00a2\u0006\u0002\u0010\u0010J \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u000fH&J$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u000fH\u00a6@\u00a2\u0006\u0002\u0010\u0010J0\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000fH\u00a6@\u00a2\u0006\u0002\u0010\u001b\u00a8\u0006\u001c"}, d2 = {"Lcom/intellihealth/truemeds/data/repository/datasource/remote/OrderStatusRemoteDataSource;", "", "deleteAlternateNumberForOrder", "Lretrofit2/Response;", "Lcom/intellihealth/truemeds/data/model/orderstatus/DeleteAlternateNumberResponse;", "orderId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchDoctorOrderConfirmedAndBoxVerifiedDetails", "Lcom/intellihealth/truemeds/data/model/orderstatus/OrderConfirmBoxVerifyResponse;", "generateReturnUrlResponse", "Lcom/intellihealth/truemeds/data/model/orderstatus/GenerateReturnUrlResponse;", "getOrderStatus", "Lcom/intellihealth/truemeds/data/model/orderstatus/OrderStatusResponse;", "customerId", "", "(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOrderStatusVideo", "Lcom/intellihealth/truemeds/data/model/orderstatus/VideoOrderStatusResponse;", "app", "saveAlternateNumberForOrder", "Lcom/intellihealth/truemeds/data/model/orderstatus/AlternateNumberResponse;", "alternateNumber", "saveCustomerEmailAddress", "Lcom/intellihealth/truemeds/data/model/user/SaveEmailResponse;", "emailId", "transactionId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_stageAndroidDebug"})
public abstract interface OrderStatusRemoteDataSource {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getOrderStatus(long orderId, @org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.orderstatus.OrderStatusResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchDoctorOrderConfirmedAndBoxVerifiedDetails(long orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.orderstatus.OrderConfirmBoxVerifyResponse>> $completion);
    
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Response<com.intellihealth.truemeds.data.model.orderstatus.VideoOrderStatusResponse> getOrderStatusVideo(long orderId, @org.jetbrains.annotations.Nullable()
    java.lang.String app);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object saveAlternateNumberForOrder(long orderId, @org.jetbrains.annotations.NotNull()
    java.lang.String alternateNumber, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.orderstatus.AlternateNumberResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteAlternateNumberForOrder(long orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.orderstatus.DeleteAlternateNumberResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object generateReturnUrlResponse(long orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.orderstatus.GenerateReturnUrlResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object saveCustomerEmailAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.Nullable()
    java.lang.String emailId, @org.jetbrains.annotations.Nullable()
    java.lang.String transactionId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.user.SaveEmailResponse>> $completion);
}