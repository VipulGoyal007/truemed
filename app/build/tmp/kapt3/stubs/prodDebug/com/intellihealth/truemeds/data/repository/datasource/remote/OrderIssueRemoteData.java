package com.intellihealth.truemeds.data.repository.datasource.remote;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00a6@\u00a2\u0006\u0002\u0010\bJ*\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00a6@\u00a2\u0006\u0002\u0010\fJ>\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00a6@\u00a2\u0006\u0002\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lcom/intellihealth/truemeds/data/repository/datasource/remote/OrderIssueRemoteData;", "", "getAllIssueMedicines", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "orderId", "", "customerId", "(Ljava/lang/Long;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTicketIssueDetails", "ticketId", "", "(Ljava/lang/String;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "raiseOrderIssues", "ticketObj", "Lcom/google/gson/JsonObject;", "isReturn", "(Ljava/lang/Long;Lcom/google/gson/JsonObject;Ljava/lang/String;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_prodDebug"})
public abstract interface OrderIssueRemoteData {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAllIssueMedicines(@org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, @org.jetbrains.annotations.Nullable()
    java.lang.Long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object raiseOrderIssues(@org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, @org.jetbrains.annotations.Nullable()
    com.google.gson.JsonObject ticketObj, @org.jetbrains.annotations.Nullable()
    java.lang.String isReturn, @org.jetbrains.annotations.Nullable()
    java.lang.Long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTicketIssueDetails(@org.jetbrains.annotations.Nullable()
    java.lang.String ticketId, @org.jetbrains.annotations.Nullable()
    java.lang.Long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion);
}