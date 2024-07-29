package com.intellihealth.truemeds.data.repository.datasource.remote;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J8\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000bH\u00a6@\u00a2\u0006\u0002\u0010\fJ8\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000bH\u00a6@\u00a2\u0006\u0002\u0010\fJ\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003H\u00a6@\u00a2\u0006\u0002\u0010\u0010J\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003H\u00a6@\u00a2\u0006\u0002\u0010\u0010J\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\u0006\u0010\u0007\u001a\u00020\bH\u00a6@\u00a2\u0006\u0002\u0010\u0013\u00a8\u0006\u0014"}, d2 = {"Lcom/intellihealth/truemeds/data/repository/datasource/remote/CancelOrderRemoteDataSource;", "", "cancelOrder", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "orderId", "", "reasonId", "", "notes", "cancelledById", "", "(JLjava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "discardOrderWithReason", "getL1ReasonsForOrderCancellation", "Lcom/intellihealth/truemeds/data/model/cancelorder/CancelReasonResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getReasonsForOrderCancellation", "getSubsReasonsForOrderCancellation", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_prodDebug"})
public abstract interface CancelOrderRemoteDataSource {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getReasonsForOrderCancellation(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.cancelorder.CancelReasonResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getL1ReasonsForOrderCancellation(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.cancelorder.CancelReasonResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getSubsReasonsForOrderCancellation(@org.jetbrains.annotations.NotNull()
    java.lang.String reasonId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.cancelorder.CancelReasonResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object cancelOrder(long orderId, @org.jetbrains.annotations.Nullable()
    java.lang.String reasonId, @org.jetbrains.annotations.Nullable()
    java.lang.String notes, int cancelledById, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object discardOrderWithReason(long orderId, @org.jetbrains.annotations.Nullable()
    java.lang.String reasonId, @org.jetbrains.annotations.Nullable()
    java.lang.String notes, int cancelledById, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion);
}