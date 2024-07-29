package com.intellihealth.truemeds.domain.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u00a6@\u00a2\u0006\u0002\u0010\fJ4\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u00a6@\u00a2\u0006\u0002\u0010\u0010J*\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0014H\u00a6@\u00a2\u0006\u0002\u0010\u0015\u00a8\u0006\u0016"}, d2 = {"Lcom/intellihealth/truemeds/domain/repository/OrderReminderRepository;", "", "deletePillReminderData", "Lcom/intellihealth/truemeds/data/utils/Resource;", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "mxInternalErrorOccurred", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "customerId", "", "reminderId", "", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getReminders", "Lcom/intellihealth/truemeds/data/model/orderreminder/GetReminderResponse;", "patientId", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setReminder", "Lcom/intellihealth/truemeds/data/model/orderreminder/SetReminderResponse;", "reminderRequestModel", "Lcom/intellihealth/truemeds/data/model/orderreminder/ReminderRequestModel;", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Lcom/intellihealth/truemeds/data/model/orderreminder/ReminderRequestModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_stageAndroidDebug"})
public abstract interface OrderReminderRepository {
    
    /**
     * This service provides reminder list which is set customer
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getReminders(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.Nullable()
    java.lang.Long patientId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.orderreminder.GetReminderResponse>>> $completion);
    
    /**
     * This service is used to set reminder with date and frequency of reminder
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object setReminder(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.orderreminder.ReminderRequestModel reminderRequestModel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.orderreminder.SetReminderResponse>>> $completion);
    
    /**
     * This service is used to delete selected reminder
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deletePillReminderData(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String customerId, long reminderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<okhttp3.ResponseBody>>> $completion);
}