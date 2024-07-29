package com.intellihealth.truemeds.data.api;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JF\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\tH\u00a7@\u00a2\u0006\u0002\u0010\u000bJF\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\tH\u00a7@\u00a2\u0006\u0002\u0010\u000eJ^\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\tH\u00a7@\u00a2\u0006\u0002\u0010\u0013\u00a8\u0006\u0014"}, d2 = {"Lcom/intellihealth/truemeds/data/api/OrderIssueApi;", "", "getAllIssueMedicines", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "contentType", "", "authorization", "orderId", "", "customerId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTicketIssueDetails", "ticketId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "raiseOrderIssues", "ticketObj", "Lcom/google/gson/JsonObject;", "isReturn", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/google/gson/JsonObject;Ljava/lang/String;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_prodDebug"})
public abstract interface OrderIssueApi {
    
    @retrofit2.http.GET(value = "/CustomerService/getAllIssueMedicines")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAllIssueMedicines(@retrofit2.http.Header(value = "Content-Type")
    @org.jetbrains.annotations.Nullable()
    java.lang.String contentType, @retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String authorization, @retrofit2.http.Query(value = "orderId")
    @org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, @retrofit2.http.Query(value = "customerId")
    @org.jetbrains.annotations.Nullable()
    java.lang.Long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion);
    
    @retrofit2.http.POST(value = "/CustomerService/raiseOrderIssues")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object raiseOrderIssues(@retrofit2.http.Header(value = "Content-Type")
    @org.jetbrains.annotations.Nullable()
    java.lang.String contentType, @retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String authorization, @retrofit2.http.Query(value = "orderId")
    @org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    com.google.gson.JsonObject ticketObj, @retrofit2.http.Query(value = "isReturn")
    @org.jetbrains.annotations.Nullable()
    java.lang.String isReturn, @retrofit2.http.Query(value = "customerId")
    @org.jetbrains.annotations.Nullable()
    java.lang.Long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion);
    
    @retrofit2.http.GET(value = "/CustomerService/getTicketIssueDetails")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTicketIssueDetails(@retrofit2.http.Header(value = "Content-Type")
    @org.jetbrains.annotations.Nullable()
    java.lang.String contentType, @retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.Nullable()
    java.lang.String authorization, @retrofit2.http.Query(value = "ticketId")
    @org.jetbrains.annotations.Nullable()
    java.lang.String ticketId, @retrofit2.http.Query(value = "customerId")
    @org.jetbrains.annotations.Nullable()
    java.lang.Long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion);
}