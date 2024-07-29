package com.intellihealth.truemeds.data.repository.datasourceimpl.remote;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00a2\u0006\u0002\u0010\rJ&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0096@\u00a2\u0006\u0002\u0010\u0011J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096@\u00a2\u0006\u0002\u0010\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/intellihealth/truemeds/data/repository/datasourceimpl/remote/OrderReminderRemoteDataSourceImpl;", "Lcom/intellihealth/truemeds/data/repository/datasource/remote/OrderReminderRemoteDataSource;", "orderReminderApi", "Lcom/intellihealth/truemeds/data/api/OrderReminderApi;", "contentType", "", "(Lcom/intellihealth/truemeds/data/api/OrderReminderApi;Ljava/lang/String;)V", "deletePillReminderData", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "customerId", "reminderId", "", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getReminders", "Lcom/intellihealth/truemeds/data/model/orderreminder/GetReminderResponse;", "patientId", "(Ljava/lang/String;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setReminder", "Lcom/intellihealth/truemeds/data/model/orderreminder/SetReminderResponse;", "requestModel", "Lcom/intellihealth/truemeds/data/model/orderreminder/ReminderRequestModel;", "(Lcom/intellihealth/truemeds/data/model/orderreminder/ReminderRequestModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_stageAndroidDebug"})
public final class OrderReminderRemoteDataSourceImpl implements com.intellihealth.truemeds.data.repository.datasource.remote.OrderReminderRemoteDataSource {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.data.api.OrderReminderApi orderReminderApi = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String contentType = null;
    
    @javax.inject.Inject()
    public OrderReminderRemoteDataSourceImpl(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.api.OrderReminderApi orderReminderApi, @javax.inject.Named(value = "content_type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String contentType) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getReminders(@org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.Nullable()
    java.lang.Long patientId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.orderreminder.GetReminderResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object setReminder(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.orderreminder.ReminderRequestModel requestModel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.orderreminder.SetReminderResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object deletePillReminderData(@org.jetbrains.annotations.NotNull()
    java.lang.String customerId, long reminderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion) {
        return null;
    }
}