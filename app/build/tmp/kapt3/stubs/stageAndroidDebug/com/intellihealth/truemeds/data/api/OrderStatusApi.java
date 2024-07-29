package com.intellihealth.truemeds.data.api;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ2\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ2\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ<\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0011\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0002\u0010\u0012J?\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\'\u00a2\u0006\u0002\u0010\u0016J<\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0019\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0002\u0010\u0012JN\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0011\u001a\u00020\u00062\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u0006H\u00a7@\u00a2\u0006\u0002\u0010\u001e\u00a8\u0006\u001f"}, d2 = {"Lcom/intellihealth/truemeds/data/api/OrderStatusApi;", "", "deleteAlternateNumberForOrder", "Lretrofit2/Response;", "Lcom/intellihealth/truemeds/data/model/orderstatus/DeleteAlternateNumberResponse;", "contentType", "", "authorization", "orderId", "", "(Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchDoctorOrderConfirmedAndBoxVerifiedDetails", "Lcom/intellihealth/truemeds/data/model/orderstatus/OrderConfirmBoxVerifyResponse;", "generateReturnUrlResponse", "Lcom/intellihealth/truemeds/data/model/orderstatus/GenerateReturnUrlResponse;", "getOrderStatus", "Lcom/intellihealth/truemeds/data/model/orderstatus/OrderStatusResponse;", "customerId", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOrderStatusVideo", "Lcom/intellihealth/truemeds/data/model/orderstatus/VideoOrderStatusResponse;", "app", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lretrofit2/Response;", "saveAlternateNumberForOrder", "Lcom/intellihealth/truemeds/data/model/orderstatus/AlternateNumberResponse;", "alternateNumber", "saveCustomerEmailAddress", "Lcom/intellihealth/truemeds/data/model/user/SaveEmailResponse;", "emailId", "transactionId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_stageAndroidDebug"})
public abstract interface OrderStatusApi {
    
    @retrofit2.http.GET(value = "/CustomerService/fetchOrderStatusDetails")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getOrderStatus(@retrofit2.http.Header(value = "Content-Type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String contentType, @retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull()
    java.lang.String authorization, @retrofit2.http.Query(value = "orderId")
    long orderId, @retrofit2.http.Query(value = "customerId")
    @org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.orderstatus.OrderStatusResponse>> $completion);
    
    @retrofit2.http.GET(value = "/CustomerService/fetchDoctorOrderConfirmdAndBoxVerifiedDetails")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchDoctorOrderConfirmedAndBoxVerifiedDetails(@retrofit2.http.Header(value = "Content-Type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String contentType, @retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull()
    java.lang.String authorization, @retrofit2.http.Query(value = "orderId")
    long orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.orderstatus.OrderConfirmBoxVerifyResponse>> $completion);
    
    @retrofit2.http.GET(value = "/CustomerService/videoOrderStatus")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Response<com.intellihealth.truemeds.data.model.orderstatus.VideoOrderStatusResponse> getOrderStatusVideo(@retrofit2.http.Header(value = "Content-Type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String contentType, @retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull()
    java.lang.String authorization, @retrofit2.http.Query(value = "orderId")
    @org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, @retrofit2.http.Query(value = "source")
    @org.jetbrains.annotations.Nullable()
    java.lang.String app);
    
    @retrofit2.http.GET(value = "/CustomerService/v1/saveAlternateNumberForOrder")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object saveAlternateNumberForOrder(@retrofit2.http.Header(value = "Content-Type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String contentType, @retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull()
    java.lang.String authorization, @retrofit2.http.Query(value = "orderId")
    long orderId, @retrofit2.http.Query(value = "alternateNumber")
    @org.jetbrains.annotations.NotNull()
    java.lang.String alternateNumber, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.orderstatus.AlternateNumberResponse>> $completion);
    
    @retrofit2.http.POST(value = "/CustomerService/deleteAlternateNumberForOrderId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteAlternateNumberForOrder(@retrofit2.http.Header(value = "Content-Type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String contentType, @retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull()
    java.lang.String authorization, @retrofit2.http.Query(value = "orderId")
    long orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.orderstatus.DeleteAlternateNumberResponse>> $completion);
    
    @retrofit2.http.GET(value = "/CustomerService/v1/generateReturnUrl")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object generateReturnUrlResponse(@retrofit2.http.Header(value = "Content-Type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String contentType, @retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull()
    java.lang.String authorization, @retrofit2.http.Query(value = "orderId")
    long orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.orderstatus.GenerateReturnUrlResponse>> $completion);
    
    @retrofit2.http.POST(value = "CustomerService/v1/saveCustomerEmailAddress")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object saveCustomerEmailAddress(@retrofit2.http.Header(value = "Content-Type")
    @org.jetbrains.annotations.Nullable()
    java.lang.String contentType, @retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String authorization, @retrofit2.http.Query(value = "customerId")
    @org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @retrofit2.http.Query(value = "emailId")
    @org.jetbrains.annotations.Nullable()
    java.lang.String emailId, @retrofit2.http.Query(value = "transactionId")
    @org.jetbrains.annotations.Nullable()
    java.lang.String transactionId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.user.SaveEmailResponse>> $completion);
}