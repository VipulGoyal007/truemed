package com.intellihealth.truemeds.data.model.orderreminder;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\'B?\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0002\u0010\u000bJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0006H\u00c6\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003JE\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020\u0006H\u00d6\u0001J\t\u0010&\u001a\u00020\u0003H\u00d6\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017\u00a8\u0006("}, d2 = {"Lcom/intellihealth/truemeds/data/model/orderreminder/GetReminderResponse;", "", "message", "", "statusValue", "statusCode", "", "timeTakenInMs", "responseData", "", "Lcom/intellihealth/truemeds/data/model/orderreminder/GetReminderResponse$ResponseData;", "(Ljava/lang/String;Ljava/lang/String;IILjava/util/List;)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getResponseData", "()Ljava/util/List;", "setResponseData", "(Ljava/util/List;)V", "getStatusCode", "()I", "setStatusCode", "(I)V", "getStatusValue", "setStatusValue", "getTimeTakenInMs", "setTimeTakenInMs", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "ResponseData", "app_stageAndroidDebug"})
public final class GetReminderResponse {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String message;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String statusValue;
    private int statusCode;
    private int timeTakenInMs;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.intellihealth.truemeds.data.model.orderreminder.GetReminderResponse.ResponseData> responseData;
    
    public GetReminderResponse(@org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.String statusValue, int statusCode, int timeTakenInMs, @org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.orderreminder.GetReminderResponse.ResponseData> responseData) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMessage() {
        return null;
    }
    
    public final void setMessage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStatusValue() {
        return null;
    }
    
    public final void setStatusValue(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int getStatusCode() {
        return 0;
    }
    
    public final void setStatusCode(int p0) {
    }
    
    public final int getTimeTakenInMs() {
        return 0;
    }
    
    public final void setTimeTakenInMs(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.truemeds.data.model.orderreminder.GetReminderResponse.ResponseData> getResponseData() {
        return null;
    }
    
    public final void setResponseData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.orderreminder.GetReminderResponse.ResponseData> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int component4() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.truemeds.data.model.orderreminder.GetReminderResponse.ResponseData> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.orderreminder.GetReminderResponse copy(@org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.String statusValue, int statusCode, int timeTakenInMs, @org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.orderreminder.GetReminderResponse.ResponseData> responseData) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\bA\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u008d\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\u0002\u0010\u001dJ\u0010\u0010>\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\u0010\u0010?\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\"J\u000b\u0010@\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u0010\u0010B\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\"J\u000b\u0010C\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\"J\u000b\u0010E\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u0010\u0010F\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\u0010\u0010G\u001a\u0004\u0018\u00010\u0018H\u00c6\u0003\u00a2\u0006\u0002\u0010&J\u0010\u0010H\u001a\u0004\u0018\u00010\u0018H\u00c6\u0003\u00a2\u0006\u0002\u0010&J\u0010\u0010I\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\"J\u000b\u0010J\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u0010\u0010L\u001a\u0004\u0018\u00010\u0018H\u00c6\u0003\u00a2\u0006\u0002\u0010&J\u0010\u0010M\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\"J\u0010\u0010N\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\"J\u000b\u0010O\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u0010\u0010P\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\u000b\u0010Q\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u0010\u0010R\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\u0010\u0010S\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0002\u0010/J\u0096\u0002\u0010T\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0018H\u00c6\u0001\u00a2\u0006\u0002\u0010UJ\u0013\u0010V\u001a\u00020\u00182\b\u0010W\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010X\u001a\u00020\u0005H\u00d6\u0001J\u0006\u0010Y\u001a\u00020ZJ\t\u0010[\u001a\u00020\u0010H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010#\u001a\u0004\b$\u0010\"R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\n\n\u0002\u0010\'\u001a\u0004\b%\u0010&R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010#\u001a\u0004\b(\u0010\"R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010 \u001a\u0004\b+\u0010\u001fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010*R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010 \u001a\u0004\b-\u0010\u001fR\u0015\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\n\n\u0002\u00100\u001a\u0004\b.\u0010/R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010#\u001a\u0004\b1\u0010\"R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010*R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010#\u001a\u0004\b5\u0010\"R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u00103R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010#\u001a\u0004\b7\u0010\"R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u00103R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010 \u001a\u0004\b9\u0010\u001fR\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\n\n\u0002\u0010\'\u001a\u0004\b:\u0010&R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\n\n\u0002\u0010\'\u001a\u0004\b;\u0010&R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010*R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010*\u00a8\u0006\\"}, d2 = {"Lcom/intellihealth/truemeds/data/model/orderreminder/GetReminderResponse$ResponseData;", "", "createdOn", "", "customerId", "", "frequency", "id", "lastCall", "modifiedOn", "notes", "orderId", "orderValue", "", "patientId", "patientName", "", "pillReminderByDate", "pillReminderType", "pillReminderTypeName", "reasonId", "reminderDate", "reminderOn", "setByPharmacist", "", "setByPharmicist", "sheduleCall", "status", "ftc", "(Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Long;Ljava/lang/Object;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Boolean;)V", "getCreatedOn", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCustomerId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFrequency", "getFtc", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getId", "getLastCall", "()Ljava/lang/Object;", "getModifiedOn", "getNotes", "getOrderId", "getOrderValue", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getPatientId", "getPatientName", "()Ljava/lang/String;", "getPillReminderByDate", "getPillReminderType", "getPillReminderTypeName", "getReasonId", "getReminderDate", "getReminderOn", "getSetByPharmacist", "getSetByPharmicist", "getSheduleCall", "getStatus", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Long;Ljava/lang/Object;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Boolean;)Lcom/intellihealth/truemeds/data/model/orderreminder/GetReminderResponse$ResponseData;", "equals", "other", "hashCode", "toReminderListModel", "Lcom/intellihealth/truemeds/data/model/reminder/ReminderListModel$ReminderList;", "toString", "app_stageAndroidDebug"})
    public static final class ResponseData {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Long createdOn = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer customerId = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer frequency = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer id = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Object lastCall = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Long modifiedOn = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Object notes = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Long orderId = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Double orderValue = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer patientId = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String patientName = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Object pillReminderByDate = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer pillReminderType = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String pillReminderTypeName = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer reasonId = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String reminderDate = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Long reminderOn = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean setByPharmacist = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean setByPharmicist = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Object sheduleCall = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Object status = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean ftc = null;
        
        public ResponseData(@org.jetbrains.annotations.Nullable()
        java.lang.Long createdOn, @org.jetbrains.annotations.Nullable()
        java.lang.Integer customerId, @org.jetbrains.annotations.Nullable()
        java.lang.Integer frequency, @org.jetbrains.annotations.Nullable()
        java.lang.Integer id, @org.jetbrains.annotations.Nullable()
        java.lang.Object lastCall, @org.jetbrains.annotations.Nullable()
        java.lang.Long modifiedOn, @org.jetbrains.annotations.Nullable()
        java.lang.Object notes, @org.jetbrains.annotations.Nullable()
        java.lang.Long orderId, @org.jetbrains.annotations.Nullable()
        java.lang.Double orderValue, @org.jetbrains.annotations.Nullable()
        java.lang.Integer patientId, @org.jetbrains.annotations.Nullable()
        java.lang.String patientName, @org.jetbrains.annotations.Nullable()
        java.lang.Object pillReminderByDate, @org.jetbrains.annotations.Nullable()
        java.lang.Integer pillReminderType, @org.jetbrains.annotations.Nullable()
        java.lang.String pillReminderTypeName, @org.jetbrains.annotations.Nullable()
        java.lang.Integer reasonId, @org.jetbrains.annotations.Nullable()
        java.lang.String reminderDate, @org.jetbrains.annotations.Nullable()
        java.lang.Long reminderOn, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean setByPharmacist, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean setByPharmicist, @org.jetbrains.annotations.Nullable()
        java.lang.Object sheduleCall, @org.jetbrains.annotations.Nullable()
        java.lang.Object status, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean ftc) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long getCreatedOn() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getCustomerId() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getFrequency() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getId() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getLastCall() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long getModifiedOn() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getNotes() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long getOrderId() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double getOrderValue() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getPatientId() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPatientName() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getPillReminderByDate() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getPillReminderType() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPillReminderTypeName() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getReasonId() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getReminderDate() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long getReminderOn() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean getSetByPharmacist() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean getSetByPharmicist() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getSheduleCall() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getStatus() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean getFtc() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.intellihealth.truemeds.data.model.reminder.ReminderListModel.ReminderList toReminderListModel() {
            return null;
        }
        
        public ResponseData() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component10() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component11() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object component12() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component13() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component14() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component15() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component16() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long component17() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component18() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component19() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object component20() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object component21() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component22() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long component8() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double component9() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.intellihealth.truemeds.data.model.orderreminder.GetReminderResponse.ResponseData copy(@org.jetbrains.annotations.Nullable()
        java.lang.Long createdOn, @org.jetbrains.annotations.Nullable()
        java.lang.Integer customerId, @org.jetbrains.annotations.Nullable()
        java.lang.Integer frequency, @org.jetbrains.annotations.Nullable()
        java.lang.Integer id, @org.jetbrains.annotations.Nullable()
        java.lang.Object lastCall, @org.jetbrains.annotations.Nullable()
        java.lang.Long modifiedOn, @org.jetbrains.annotations.Nullable()
        java.lang.Object notes, @org.jetbrains.annotations.Nullable()
        java.lang.Long orderId, @org.jetbrains.annotations.Nullable()
        java.lang.Double orderValue, @org.jetbrains.annotations.Nullable()
        java.lang.Integer patientId, @org.jetbrains.annotations.Nullable()
        java.lang.String patientName, @org.jetbrains.annotations.Nullable()
        java.lang.Object pillReminderByDate, @org.jetbrains.annotations.Nullable()
        java.lang.Integer pillReminderType, @org.jetbrains.annotations.Nullable()
        java.lang.String pillReminderTypeName, @org.jetbrains.annotations.Nullable()
        java.lang.Integer reasonId, @org.jetbrains.annotations.Nullable()
        java.lang.String reminderDate, @org.jetbrains.annotations.Nullable()
        java.lang.Long reminderOn, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean setByPharmacist, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean setByPharmicist, @org.jetbrains.annotations.Nullable()
        java.lang.Object sheduleCall, @org.jetbrains.annotations.Nullable()
        java.lang.Object status, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean ftc) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
}