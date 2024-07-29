package com.intellihealth.truemeds.data.repository.datasource.remote;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u00a6@\u00a2\u0006\u0002\u0010\tJ&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\bH\u00a6@\u00a2\u0006\u0002\u0010\rJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00a6@\u00a2\u0006\u0002\u0010\u0012\u00a8\u0006\u0013"}, d2 = {"Lcom/intellihealth/truemeds/data/repository/datasource/remote/OrderReminderRemoteDataSource;", "", "deletePillReminderData", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "customerId", "", "reminderId", "", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getReminders", "Lcom/intellihealth/truemeds/data/model/orderreminder/GetReminderResponse;", "patientId", "(Ljava/lang/String;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setReminder", "Lcom/intellihealth/truemeds/data/model/orderreminder/SetReminderResponse;", "requestModel", "Lcom/intellihealth/truemeds/data/model/orderreminder/ReminderRequestModel;", "(Lcom/intellihealth/truemeds/data/model/orderreminder/ReminderRequestModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_prodDebug"})
public abstract interface OrderReminderRemoteDataSource {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getReminders(@org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.Nullable()
    java.lang.Long patientId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.orderreminder.GetReminderResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object setReminder(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.orderreminder.ReminderRequestModel requestModel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.orderreminder.SetReminderResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deletePillReminderData(@org.jetbrains.annotations.NotNull()
    java.lang.String customerId, long reminderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion);
}