package com.intellihealth.truemeds.data.repository.datasourceimpl.remote;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B#\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ*\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096@\u00a2\u0006\u0002\u0010\u000fJ*\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096@\u00a2\u0006\u0002\u0010\u0012J>\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096@\u00a2\u0006\u0002\u0010\u0017R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/intellihealth/truemeds/data/repository/datasourceimpl/remote/OrderIssueRemoteDataSourceImpl;", "Lcom/intellihealth/truemeds/data/repository/datasource/remote/OrderIssueRemoteData;", "context", "Landroid/content/Context;", "orderIssueApi", "Lcom/intellihealth/truemeds/data/api/OrderIssueApi;", "contentType", "", "(Landroid/content/Context;Lcom/intellihealth/truemeds/data/api/OrderIssueApi;Ljava/lang/String;)V", "getAllIssueMedicines", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "orderId", "", "customerId", "(Ljava/lang/Long;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTicketIssueDetails", "ticketId", "(Ljava/lang/String;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "raiseOrderIssues", "ticketObj", "Lcom/google/gson/JsonObject;", "isReturn", "(Ljava/lang/Long;Lcom/google/gson/JsonObject;Ljava/lang/String;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_stageAndroidDebug"})
public final class OrderIssueRemoteDataSourceImpl implements com.intellihealth.truemeds.data.repository.datasource.remote.OrderIssueRemoteData {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.data.api.OrderIssueApi orderIssueApi = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String contentType = null;
    
    @javax.inject.Inject()
    public OrderIssueRemoteDataSourceImpl(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.api.OrderIssueApi orderIssueApi, @javax.inject.Named(value = "content_type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String contentType) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getAllIssueMedicines(@org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, @org.jetbrains.annotations.Nullable()
    java.lang.Long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object raiseOrderIssues(@org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, @org.jetbrains.annotations.Nullable()
    com.google.gson.JsonObject ticketObj, @org.jetbrains.annotations.Nullable()
    java.lang.String isReturn, @org.jetbrains.annotations.Nullable()
    java.lang.Long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getTicketIssueDetails(@org.jetbrains.annotations.Nullable()
    java.lang.String ticketId, @org.jetbrains.annotations.Nullable()
    java.lang.Long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion) {
        return null;
    }
}