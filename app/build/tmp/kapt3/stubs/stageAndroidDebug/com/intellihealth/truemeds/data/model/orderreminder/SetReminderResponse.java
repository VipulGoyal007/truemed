package com.intellihealth.truemeds.data.model.orderreminder;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001:\u0001\u001bB9\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016\u00a8\u0006\u001c"}, d2 = {"Lcom/intellihealth/truemeds/data/model/orderreminder/SetReminderResponse;", "", "message", "", "statusValue", "statusCode", "", "timeTakenInMs", "responseData", "Lcom/intellihealth/truemeds/data/model/orderreminder/SetReminderResponse$ResponseData;", "(Ljava/lang/String;Ljava/lang/String;IILcom/intellihealth/truemeds/data/model/orderreminder/SetReminderResponse$ResponseData;)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getResponseData", "()Lcom/intellihealth/truemeds/data/model/orderreminder/SetReminderResponse$ResponseData;", "setResponseData", "(Lcom/intellihealth/truemeds/data/model/orderreminder/SetReminderResponse$ResponseData;)V", "getStatusCode", "()I", "setStatusCode", "(I)V", "getStatusValue", "setStatusValue", "getTimeTakenInMs", "setTimeTakenInMs", "ResponseData", "app_stageAndroidDebug"})
public final class SetReminderResponse {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String message;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String statusValue;
    private int statusCode;
    private int timeTakenInMs;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.data.model.orderreminder.SetReminderResponse.ResponseData responseData;
    
    public SetReminderResponse(@org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.String statusValue, int statusCode, int timeTakenInMs, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.orderreminder.SetReminderResponse.ResponseData responseData) {
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
    public final com.intellihealth.truemeds.data.model.orderreminder.SetReminderResponse.ResponseData getResponseData() {
        return null;
    }
    
    public final void setResponseData(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.orderreminder.SetReminderResponse.ResponseData p0) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\u0011"}, d2 = {"Lcom/intellihealth/truemeds/data/model/orderreminder/SetReminderResponse$ResponseData;", "", "reminderId", "", "(J)V", "getReminderId", "()J", "setReminderId", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_stageAndroidDebug"})
    public static final class ResponseData {
        private long reminderId;
        
        public ResponseData(long reminderId) {
            super();
        }
        
        public final long getReminderId() {
            return 0L;
        }
        
        public final void setReminderId(long p0) {
        }
        
        public ResponseData() {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.intellihealth.truemeds.data.model.orderreminder.SetReminderResponse.ResponseData copy(long reminderId) {
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