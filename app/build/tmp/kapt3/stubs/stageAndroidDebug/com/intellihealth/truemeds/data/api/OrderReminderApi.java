package com.intellihealth.truemeds.data.api;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J<\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ>\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\nH\u00a7@\u00a2\u0006\u0002\u0010\u000fJ4\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00a7@\u00a2\u0006\u0002\u0010\u0014\u00a8\u0006\u0015"}, d2 = {"Lcom/intellihealth/truemeds/data/api/OrderReminderApi;", "", "deletePillReminderData", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "contentType", "", "authorization", "customerId", "reminderId", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getReminders", "Lcom/intellihealth/truemeds/data/model/orderreminder/GetReminderResponse;", "patientId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setReminder", "Lcom/intellihealth/truemeds/data/model/orderreminder/SetReminderResponse;", "jsonObject", "Lcom/intellihealth/truemeds/data/model/orderreminder/ReminderRequestModel;", "(Ljava/lang/String;Ljava/lang/String;Lcom/intellihealth/truemeds/data/model/orderreminder/ReminderRequestModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_stageAndroidDebug"})
public abstract interface OrderReminderApi {
    
    @retrofit2.http.GET(value = "/CustomerService/v1/getReminders")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getReminders(@retrofit2.http.Header(value = "Content-Type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String contentType, @retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull()
    java.lang.String authorization, @retrofit2.http.Query(value = "customerId")
    @org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @retrofit2.http.Query(value = "patientId")
    @org.jetbrains.annotations.Nullable()
    java.lang.Long patientId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.orderreminder.GetReminderResponse>> $completion);
    
    @retrofit2.http.POST(value = "/CustomerService/v1/setReminder")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object setReminder(@retrofit2.http.Header(value = "Content-Type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String contentType, @retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull()
    java.lang.String authorization, @retrofit2.http.Body()
    @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.orderreminder.ReminderRequestModel jsonObject, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.orderreminder.SetReminderResponse>> $completion);
    
    @retrofit2.http.POST(value = "/CustomerService/v1/cancleReminder")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deletePillReminderData(@retrofit2.http.Header(value = "Content-Type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String contentType, @retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull()
    java.lang.String authorization, @retrofit2.http.Query(value = "customerId")
    @org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @retrofit2.http.Query(value = "reminderId")
    long reminderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion);
}