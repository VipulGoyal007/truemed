package com.intellihealth.truemeds.data.api;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001JT\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\t2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\f\u001a\u00020\rH\u00a7@\u00a2\u0006\u0002\u0010\u000eJ^\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\t2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\f\u001a\u00020\rH\u00a7@\u00a2\u0006\u0002\u0010\u0011J(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0002\u0010\u0014J(\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0002\u0010\u0014J4\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0006H\u00a7@\u00a2\u0006\u0002\u0010\u0017\u00a8\u0006\u0018"}, d2 = {"Lcom/intellihealth/truemeds/data/api/CancelOrderApi;", "", "cancelOrder", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "contentType", "", "authorization", "orderId", "", "reasonId", "notes", "cancelledById", "", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "discardOrderWithReason", "customerId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getL1ReasonsForOrderCancellation", "Lcom/intellihealth/truemeds/data/model/cancelorder/CancelReasonResponse;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getReasonsForOrderCancellation", "getSubsReasonsForOrderCancellation", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_stageAndroidDebug"})
public abstract interface CancelOrderApi {
    
    @retrofit2.http.POST(value = "/OrderManagementService/getReasonsForOrderCancellation")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getReasonsForOrderCancellation(@retrofit2.http.Header(value = "Content-Type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String contentType, @retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull()
    java.lang.String authorization, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.cancelorder.CancelReasonResponse>> $completion);
    
    @retrofit2.http.GET(value = "/OrderManagementService/getL1ReasonsForOrderCancellation")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getL1ReasonsForOrderCancellation(@retrofit2.http.Header(value = "Content-Type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String contentType, @retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull()
    java.lang.String authorization, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.cancelorder.CancelReasonResponse>> $completion);
    
    @retrofit2.http.GET(value = "/OrderManagementService/getSubReasonsForOrderCancellation")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getSubsReasonsForOrderCancellation(@retrofit2.http.Header(value = "Content-Type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String contentType, @retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull()
    java.lang.String authorization, @retrofit2.http.Query(value = "reasonId")
    @org.jetbrains.annotations.Nullable()
    java.lang.String reasonId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.cancelorder.CancelReasonResponse>> $completion);
    
    @retrofit2.http.POST(value = "/OrderManagementService/cancelOrder")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object cancelOrder(@retrofit2.http.Header(value = "Content-Type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String contentType, @retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull()
    java.lang.String authorization, @retrofit2.http.Query(value = "orderId")
    long orderId, @retrofit2.http.Query(value = "reasonId")
    @org.jetbrains.annotations.Nullable()
    java.lang.String reasonId, @retrofit2.http.Query(value = "notes")
    @org.jetbrains.annotations.Nullable()
    java.lang.String notes, @retrofit2.http.Query(value = "cancelledById")
    int cancelledById, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion);
    
    @retrofit2.http.POST(value = "/CustomerService/discardOrder")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object discardOrderWithReason(@retrofit2.http.Header(value = "Content-Type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String contentType, @retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull()
    java.lang.String authorization, @retrofit2.http.Header(value = "customerId")
    @org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @retrofit2.http.Query(value = "orderId")
    long orderId, @retrofit2.http.Query(value = "reasonId")
    @org.jetbrains.annotations.Nullable()
    java.lang.String reasonId, @retrofit2.http.Query(value = "notes")
    @org.jetbrains.annotations.Nullable()
    java.lang.String notes, @retrofit2.http.Query(value = "cancelledById")
    int cancelledById, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion);
}