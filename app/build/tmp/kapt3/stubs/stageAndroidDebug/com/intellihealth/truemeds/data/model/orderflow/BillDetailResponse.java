package com.intellihealth.truemeds.data.model.orderflow;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001&B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0007H\u00c6\u0003J;\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010$\u001a\u00020\u0007H\u00d6\u0001J\t\u0010%\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\u001a\u0010\t\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016\u00a8\u0006\'"}, d2 = {"Lcom/intellihealth/truemeds/data/model/orderflow/BillDetailResponse;", "", "message", "", "responseData", "Lcom/intellihealth/truemeds/data/model/orderflow/BillDetailResponse$ResponseData;", "statusCode", "", "statusValue", "timeTakenInMs", "(Ljava/lang/String;Lcom/intellihealth/truemeds/data/model/orderflow/BillDetailResponse$ResponseData;ILjava/lang/String;I)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getResponseData", "()Lcom/intellihealth/truemeds/data/model/orderflow/BillDetailResponse$ResponseData;", "setResponseData", "(Lcom/intellihealth/truemeds/data/model/orderflow/BillDetailResponse$ResponseData;)V", "getStatusCode", "()I", "setStatusCode", "(I)V", "getStatusValue", "setStatusValue", "getTimeTakenInMs", "setTimeTakenInMs", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "ResponseData", "app_stageAndroidDebug"})
public final class BillDetailResponse {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String message;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse.ResponseData responseData;
    private int statusCode;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String statusValue;
    private int timeTakenInMs;
    
    public BillDetailResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse.ResponseData responseData, int statusCode, @org.jetbrains.annotations.NotNull()
    java.lang.String statusValue, int timeTakenInMs) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMessage() {
        return null;
    }
    
    public final void setMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse.ResponseData getResponseData() {
        return null;
    }
    
    public final void setResponseData(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse.ResponseData p0) {
    }
    
    public final int getStatusCode() {
        return 0;
    }
    
    public final void setStatusCode(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatusValue() {
        return null;
    }
    
    public final void setStatusValue(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getTimeTakenInMs() {
        return 0;
    }
    
    public final void setTimeTakenInMs(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse.ResponseData component2() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse copy(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse.ResponseData responseData, int statusCode, @org.jetbrains.annotations.NotNull()
    java.lang.String statusValue, int timeTakenInMs) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000G\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0003\b\u008d\u0001\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u00ba\u0001B\u00b1\u0003\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010 \u001a\u00020\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\"\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*\u0012\b\b\u0002\u0010+\u001a\u00020\u0003\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010-\u001a\u00020.\u00a2\u0006\u0002\u0010/J\u0011\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00105J\u0011\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00105J\u0011\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00105J\u0011\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0002\u0010gJ\u0011\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00105J\u0011\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00105J\f\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003J\u0011\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00105J\u0011\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00105J\u0011\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00105J\f\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00105J\u0011\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00105J\u0011\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00105J\u0011\u0010\u00a0\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00105J\f\u0010\u00a1\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\n\u0010\u00a2\u0001\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010\u00a3\u0001\u001a\u0004\u0018\u00010\"H\u00c6\u0003\u00a2\u0006\u0002\u0010VJ\f\u0010\u00a4\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\n\u0010\u00a5\u0001\u001a\u00020\u0005H\u00c6\u0003J\f\u0010\u00a6\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010\u00a7\u0001\u001a\u0004\u0018\u00010\"H\u00c6\u0003\u00a2\u0006\u0002\u0010VJ\f\u0010\u00a8\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00a9\u0001\u001a\u0004\u0018\u00010(H\u00c6\u0003J\f\u0010\u00aa\u0001\u001a\u0004\u0018\u00010*H\u00c6\u0003J\n\u0010\u00ab\u0001\u001a\u00020\u0003H\u00c6\u0003J\f\u0010\u00ac\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\n\u0010\u00ad\u0001\u001a\u00020.H\u00c6\u0003J\u0011\u0010\u00ae\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00105J\u0011\u0010\u00af\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00105J\u0011\u0010\u00b0\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00105J\u0011\u0010\u00b1\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00105J\u0011\u0010\u00b2\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00105J\u0011\u0010\u00b3\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00105J\u00c4\u0003\u0010\u00b4\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010 \u001a\u00020\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010+\u001a\u00020\u00032\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010-\u001a\u00020.H\u00c6\u0001\u00a2\u0006\u0003\u0010\u00b5\u0001J\u0015\u0010\u00b6\u0001\u001a\u00020.2\t\u0010\u00b7\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\n\u0010\u00b8\u0001\u001a\u00020\"H\u00d6\u0001J\n\u0010\u00b9\u0001\u001a\u00020\u0005H\u00d6\u0001R\u001a\u0010 \u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00108\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001c\u0010)\u001a\u0004\u0018\u00010*X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001c\u0010\'\u001a\u0004\u0018\u00010(X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001c\u0010,\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010B\"\u0004\bF\u0010DR\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00108\u001a\u0004\bG\u00105\"\u0004\bH\u00107R\u001e\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00108\u001a\u0004\bI\u00105\"\u0004\bJ\u00107R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010B\"\u0004\bL\u0010DR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010B\"\u0004\bN\u0010DR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00108\u001a\u0004\bO\u00105\"\u0004\bP\u00107R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010B\"\u0004\bR\u0010DR\u001c\u0010&\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010B\"\u0004\bT\u0010DR\u001e\u0010%\u001a\u0004\u0018\u00010\"X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010Y\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u001e\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00108\u001a\u0004\bZ\u00105\"\u0004\b[\u00107R\u001c\u0010#\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010B\"\u0004\b]\u0010DR\u001c\u0010$\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b^\u0010B\"\u0004\b_\u0010DR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00108\u001a\u0004\b`\u00105\"\u0004\ba\u00107R\u001e\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00108\u001a\u0004\bb\u00105\"\u0004\bc\u00107R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00108\u001a\u0004\bd\u00105\"\u0004\be\u00107R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010j\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00108\u001a\u0004\bk\u00105\"\u0004\bl\u00107R\u001a\u0010+\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bm\u00101\"\u0004\bn\u00103R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00108\u001a\u0004\bo\u00105\"\u0004\bp\u00107R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bq\u0010B\"\u0004\br\u0010DR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\u001a\u0010-\u001a\u00020.X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR\u001e\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010Y\u001a\u0004\b{\u0010V\"\u0004\b|\u0010XR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00108\u001a\u0004\b}\u00105\"\u0004\b~\u00107R\u001f\u0010\u0017\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0011\n\u0002\u00108\u001a\u0004\b\u007f\u00105\"\u0005\b\u0080\u0001\u00107R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0081\u0001\u0010B\"\u0005\b\u0082\u0001\u0010DR \u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u00108\u001a\u0005\b\u0083\u0001\u00105\"\u0005\b\u0084\u0001\u00107R \u0010\u001c\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u00108\u001a\u0005\b\u0085\u0001\u00105\"\u0005\b\u0086\u0001\u00107R \u0010\u001d\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u00108\u001a\u0005\b\u0087\u0001\u00105\"\u0005\b\u0088\u0001\u00107R \u0010\u001e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u00108\u001a\u0005\b\u0089\u0001\u00105\"\u0005\b\u008a\u0001\u00107R \u0010\u0018\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u00108\u001a\u0005\b\u008b\u0001\u00105\"\u0005\b\u008c\u0001\u00107R \u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u00108\u001a\u0005\b\u008d\u0001\u00105\"\u0005\b\u008e\u0001\u00107\u00a8\u0006\u00bb\u0001"}, d2 = {"Lcom/intellihealth/truemeds/data/model/orderflow/BillDetailResponse$ResponseData;", "", "addMoreForFreeDelivery", "", "couponCode", "", "couponCodeForEvent", "couponDiscountAmt", "couponAppliedAmt", "deliveryCharge", "waiveOffDeliveryCharge", "discount", "mrp", "sellingPrice", "mrpWithSubs", "orderId", "", "packagingCharge", "payableAmt", "paymentMode", "paymentSelectionInfo", "Lcom/intellihealth/truemeds/data/model/orderflow/BillDetailResponse$ResponseData$PaymentSelectionInfo;", "savingPercentageWithSubs", "savingValue", "totalSavings", "savingsText", "couldHaveSaved", "couldHaveSavedAmount", "sellingPriceWithSubs", "tmCash", "tmCredit", "couponIconUrl", "addMoreForCod", "restrictedPaymentType", "", "deliveryChargeMessage", "deliveryChargeTooltipMessage", "currentOrderStatus", "currentOrderState", "cashHandlingInfo", "Lcom/intellihealth/salt/models/CashHandlingInfoModel;", "cashHandlingApplicableInfo", "Lcom/intellihealth/salt/models/CashHandlingApplicableInfo;", "payableAmountWithoutChc", "cashHandlingRefundMsg", "pspViewed", "", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Lcom/intellihealth/truemeds/data/model/orderflow/BillDetailResponse$ResponseData$PaymentSelectionInfo;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;DLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/intellihealth/salt/models/CashHandlingInfoModel;Lcom/intellihealth/salt/models/CashHandlingApplicableInfo;DLjava/lang/String;Z)V", "getAddMoreForCod", "()D", "setAddMoreForCod", "(D)V", "getAddMoreForFreeDelivery", "()Ljava/lang/Double;", "setAddMoreForFreeDelivery", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getCashHandlingApplicableInfo", "()Lcom/intellihealth/salt/models/CashHandlingApplicableInfo;", "setCashHandlingApplicableInfo", "(Lcom/intellihealth/salt/models/CashHandlingApplicableInfo;)V", "getCashHandlingInfo", "()Lcom/intellihealth/salt/models/CashHandlingInfoModel;", "setCashHandlingInfo", "(Lcom/intellihealth/salt/models/CashHandlingInfoModel;)V", "getCashHandlingRefundMsg", "()Ljava/lang/String;", "setCashHandlingRefundMsg", "(Ljava/lang/String;)V", "getCouldHaveSaved", "setCouldHaveSaved", "getCouldHaveSavedAmount", "setCouldHaveSavedAmount", "getCouponAppliedAmt", "setCouponAppliedAmt", "getCouponCode", "setCouponCode", "getCouponCodeForEvent", "setCouponCodeForEvent", "getCouponDiscountAmt", "setCouponDiscountAmt", "getCouponIconUrl", "setCouponIconUrl", "getCurrentOrderState", "setCurrentOrderState", "getCurrentOrderStatus", "()Ljava/lang/Integer;", "setCurrentOrderStatus", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getDeliveryCharge", "setDeliveryCharge", "getDeliveryChargeMessage", "setDeliveryChargeMessage", "getDeliveryChargeTooltipMessage", "setDeliveryChargeTooltipMessage", "getDiscount", "setDiscount", "getMrp", "setMrp", "getMrpWithSubs", "setMrpWithSubs", "getOrderId", "()Ljava/lang/Long;", "setOrderId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getPackagingCharge", "setPackagingCharge", "getPayableAmountWithoutChc", "setPayableAmountWithoutChc", "getPayableAmt", "setPayableAmt", "getPaymentMode", "setPaymentMode", "getPaymentSelectionInfo", "()Lcom/intellihealth/truemeds/data/model/orderflow/BillDetailResponse$ResponseData$PaymentSelectionInfo;", "setPaymentSelectionInfo", "(Lcom/intellihealth/truemeds/data/model/orderflow/BillDetailResponse$ResponseData$PaymentSelectionInfo;)V", "getPspViewed", "()Z", "setPspViewed", "(Z)V", "getRestrictedPaymentType", "setRestrictedPaymentType", "getSavingPercentageWithSubs", "setSavingPercentageWithSubs", "getSavingValue", "setSavingValue", "getSavingsText", "setSavingsText", "getSellingPrice", "setSellingPrice", "getSellingPriceWithSubs", "setSellingPriceWithSubs", "getTmCash", "setTmCash", "getTmCredit", "setTmCredit", "getTotalSavings", "setTotalSavings", "getWaiveOffDeliveryCharge", "setWaiveOffDeliveryCharge", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Lcom/intellihealth/truemeds/data/model/orderflow/BillDetailResponse$ResponseData$PaymentSelectionInfo;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;DLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/intellihealth/salt/models/CashHandlingInfoModel;Lcom/intellihealth/salt/models/CashHandlingApplicableInfo;DLjava/lang/String;Z)Lcom/intellihealth/truemeds/data/model/orderflow/BillDetailResponse$ResponseData;", "equals", "other", "hashCode", "toString", "PaymentSelectionInfo", "app_stageAndroidDebug"})
    public static final class ResponseData {
        @org.jetbrains.annotations.Nullable()
        private java.lang.Double addMoreForFreeDelivery;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String couponCode;
        @org.jetbrains.annotations.NotNull()
        private java.lang.String couponCodeForEvent;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Double couponDiscountAmt;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Double couponAppliedAmt;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Double deliveryCharge;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Double waiveOffDeliveryCharge;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Double discount;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Double mrp;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Double sellingPrice;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Double mrpWithSubs;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Long orderId;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Double packagingCharge;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Double payableAmt;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String paymentMode;
        @org.jetbrains.annotations.Nullable()
        private com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse.ResponseData.PaymentSelectionInfo paymentSelectionInfo;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Double savingPercentageWithSubs;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Double savingValue;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Double totalSavings;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String savingsText;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String couldHaveSaved;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Double couldHaveSavedAmount;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Double sellingPriceWithSubs;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Double tmCash;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Double tmCredit;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String couponIconUrl;
        private double addMoreForCod;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Integer restrictedPaymentType;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String deliveryChargeMessage;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String deliveryChargeTooltipMessage;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Integer currentOrderStatus;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String currentOrderState;
        @org.jetbrains.annotations.Nullable()
        private com.intellihealth.salt.models.CashHandlingInfoModel cashHandlingInfo;
        @org.jetbrains.annotations.Nullable()
        private com.intellihealth.salt.models.CashHandlingApplicableInfo cashHandlingApplicableInfo;
        private double payableAmountWithoutChc;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String cashHandlingRefundMsg;
        private boolean pspViewed;
        
        public ResponseData(@org.jetbrains.annotations.Nullable()
        java.lang.Double addMoreForFreeDelivery, @org.jetbrains.annotations.Nullable()
        java.lang.String couponCode, @org.jetbrains.annotations.NotNull()
        java.lang.String couponCodeForEvent, @org.jetbrains.annotations.Nullable()
        java.lang.Double couponDiscountAmt, @org.jetbrains.annotations.Nullable()
        java.lang.Double couponAppliedAmt, @org.jetbrains.annotations.Nullable()
        java.lang.Double deliveryCharge, @org.jetbrains.annotations.Nullable()
        java.lang.Double waiveOffDeliveryCharge, @org.jetbrains.annotations.Nullable()
        java.lang.Double discount, @org.jetbrains.annotations.Nullable()
        java.lang.Double mrp, @org.jetbrains.annotations.Nullable()
        java.lang.Double sellingPrice, @org.jetbrains.annotations.Nullable()
        java.lang.Double mrpWithSubs, @org.jetbrains.annotations.Nullable()
        java.lang.Long orderId, @org.jetbrains.annotations.Nullable()
        java.lang.Double packagingCharge, @org.jetbrains.annotations.Nullable()
        java.lang.Double payableAmt, @org.jetbrains.annotations.Nullable()
        java.lang.String paymentMode, @org.jetbrains.annotations.Nullable()
        com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse.ResponseData.PaymentSelectionInfo paymentSelectionInfo, @org.jetbrains.annotations.Nullable()
        java.lang.Double savingPercentageWithSubs, @org.jetbrains.annotations.Nullable()
        java.lang.Double savingValue, @org.jetbrains.annotations.Nullable()
        java.lang.Double totalSavings, @org.jetbrains.annotations.Nullable()
        java.lang.String savingsText, @org.jetbrains.annotations.Nullable()
        java.lang.String couldHaveSaved, @org.jetbrains.annotations.Nullable()
        java.lang.Double couldHaveSavedAmount, @org.jetbrains.annotations.Nullable()
        java.lang.Double sellingPriceWithSubs, @org.jetbrains.annotations.Nullable()
        java.lang.Double tmCash, @org.jetbrains.annotations.Nullable()
        java.lang.Double tmCredit, @org.jetbrains.annotations.Nullable()
        java.lang.String couponIconUrl, double addMoreForCod, @org.jetbrains.annotations.Nullable()
        java.lang.Integer restrictedPaymentType, @org.jetbrains.annotations.Nullable()
        java.lang.String deliveryChargeMessage, @org.jetbrains.annotations.Nullable()
        java.lang.String deliveryChargeTooltipMessage, @org.jetbrains.annotations.Nullable()
        java.lang.Integer currentOrderStatus, @org.jetbrains.annotations.Nullable()
        java.lang.String currentOrderState, @org.jetbrains.annotations.Nullable()
        com.intellihealth.salt.models.CashHandlingInfoModel cashHandlingInfo, @org.jetbrains.annotations.Nullable()
        com.intellihealth.salt.models.CashHandlingApplicableInfo cashHandlingApplicableInfo, double payableAmountWithoutChc, @org.jetbrains.annotations.Nullable()
        java.lang.String cashHandlingRefundMsg, boolean pspViewed) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double getAddMoreForFreeDelivery() {
            return null;
        }
        
        public final void setAddMoreForFreeDelivery(@org.jetbrains.annotations.Nullable()
        java.lang.Double p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCouponCode() {
            return null;
        }
        
        public final void setCouponCode(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCouponCodeForEvent() {
            return null;
        }
        
        public final void setCouponCodeForEvent(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double getCouponDiscountAmt() {
            return null;
        }
        
        public final void setCouponDiscountAmt(@org.jetbrains.annotations.Nullable()
        java.lang.Double p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double getCouponAppliedAmt() {
            return null;
        }
        
        public final void setCouponAppliedAmt(@org.jetbrains.annotations.Nullable()
        java.lang.Double p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double getDeliveryCharge() {
            return null;
        }
        
        public final void setDeliveryCharge(@org.jetbrains.annotations.Nullable()
        java.lang.Double p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double getWaiveOffDeliveryCharge() {
            return null;
        }
        
        public final void setWaiveOffDeliveryCharge(@org.jetbrains.annotations.Nullable()
        java.lang.Double p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double getDiscount() {
            return null;
        }
        
        public final void setDiscount(@org.jetbrains.annotations.Nullable()
        java.lang.Double p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double getMrp() {
            return null;
        }
        
        public final void setMrp(@org.jetbrains.annotations.Nullable()
        java.lang.Double p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double getSellingPrice() {
            return null;
        }
        
        public final void setSellingPrice(@org.jetbrains.annotations.Nullable()
        java.lang.Double p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double getMrpWithSubs() {
            return null;
        }
        
        public final void setMrpWithSubs(@org.jetbrains.annotations.Nullable()
        java.lang.Double p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long getOrderId() {
            return null;
        }
        
        public final void setOrderId(@org.jetbrains.annotations.Nullable()
        java.lang.Long p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double getPackagingCharge() {
            return null;
        }
        
        public final void setPackagingCharge(@org.jetbrains.annotations.Nullable()
        java.lang.Double p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double getPayableAmt() {
            return null;
        }
        
        public final void setPayableAmt(@org.jetbrains.annotations.Nullable()
        java.lang.Double p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPaymentMode() {
            return null;
        }
        
        public final void setPaymentMode(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse.ResponseData.PaymentSelectionInfo getPaymentSelectionInfo() {
            return null;
        }
        
        public final void setPaymentSelectionInfo(@org.jetbrains.annotations.Nullable()
        com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse.ResponseData.PaymentSelectionInfo p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double getSavingPercentageWithSubs() {
            return null;
        }
        
        public final void setSavingPercentageWithSubs(@org.jetbrains.annotations.Nullable()
        java.lang.Double p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double getSavingValue() {
            return null;
        }
        
        public final void setSavingValue(@org.jetbrains.annotations.Nullable()
        java.lang.Double p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double getTotalSavings() {
            return null;
        }
        
        public final void setTotalSavings(@org.jetbrains.annotations.Nullable()
        java.lang.Double p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSavingsText() {
            return null;
        }
        
        public final void setSavingsText(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCouldHaveSaved() {
            return null;
        }
        
        public final void setCouldHaveSaved(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double getCouldHaveSavedAmount() {
            return null;
        }
        
        public final void setCouldHaveSavedAmount(@org.jetbrains.annotations.Nullable()
        java.lang.Double p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double getSellingPriceWithSubs() {
            return null;
        }
        
        public final void setSellingPriceWithSubs(@org.jetbrains.annotations.Nullable()
        java.lang.Double p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double getTmCash() {
            return null;
        }
        
        public final void setTmCash(@org.jetbrains.annotations.Nullable()
        java.lang.Double p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double getTmCredit() {
            return null;
        }
        
        public final void setTmCredit(@org.jetbrains.annotations.Nullable()
        java.lang.Double p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCouponIconUrl() {
            return null;
        }
        
        public final void setCouponIconUrl(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public final double getAddMoreForCod() {
            return 0.0;
        }
        
        public final void setAddMoreForCod(double p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getRestrictedPaymentType() {
            return null;
        }
        
        public final void setRestrictedPaymentType(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDeliveryChargeMessage() {
            return null;
        }
        
        public final void setDeliveryChargeMessage(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDeliveryChargeTooltipMessage() {
            return null;
        }
        
        public final void setDeliveryChargeTooltipMessage(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getCurrentOrderStatus() {
            return null;
        }
        
        public final void setCurrentOrderStatus(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCurrentOrderState() {
            return null;
        }
        
        public final void setCurrentOrderState(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.intellihealth.salt.models.CashHandlingInfoModel getCashHandlingInfo() {
            return null;
        }
        
        public final void setCashHandlingInfo(@org.jetbrains.annotations.Nullable()
        com.intellihealth.salt.models.CashHandlingInfoModel p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.intellihealth.salt.models.CashHandlingApplicableInfo getCashHandlingApplicableInfo() {
            return null;
        }
        
        public final void setCashHandlingApplicableInfo(@org.jetbrains.annotations.Nullable()
        com.intellihealth.salt.models.CashHandlingApplicableInfo p0) {
        }
        
        public final double getPayableAmountWithoutChc() {
            return 0.0;
        }
        
        public final void setPayableAmountWithoutChc(double p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCashHandlingRefundMsg() {
            return null;
        }
        
        public final void setCashHandlingRefundMsg(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public final boolean getPspViewed() {
            return false;
        }
        
        public final void setPspViewed(boolean p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double component10() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double component11() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long component12() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double component13() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double component14() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component15() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse.ResponseData.PaymentSelectionInfo component16() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double component17() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double component18() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double component19() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component20() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component21() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double component22() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double component23() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double component24() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double component25() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component26() {
            return null;
        }
        
        public final double component27() {
            return 0.0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component28() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component29() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component30() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component31() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component32() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.intellihealth.salt.models.CashHandlingInfoModel component33() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.intellihealth.salt.models.CashHandlingApplicableInfo component34() {
            return null;
        }
        
        public final double component35() {
            return 0.0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component36() {
            return null;
        }
        
        public final boolean component37() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double component8() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double component9() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse.ResponseData copy(@org.jetbrains.annotations.Nullable()
        java.lang.Double addMoreForFreeDelivery, @org.jetbrains.annotations.Nullable()
        java.lang.String couponCode, @org.jetbrains.annotations.NotNull()
        java.lang.String couponCodeForEvent, @org.jetbrains.annotations.Nullable()
        java.lang.Double couponDiscountAmt, @org.jetbrains.annotations.Nullable()
        java.lang.Double couponAppliedAmt, @org.jetbrains.annotations.Nullable()
        java.lang.Double deliveryCharge, @org.jetbrains.annotations.Nullable()
        java.lang.Double waiveOffDeliveryCharge, @org.jetbrains.annotations.Nullable()
        java.lang.Double discount, @org.jetbrains.annotations.Nullable()
        java.lang.Double mrp, @org.jetbrains.annotations.Nullable()
        java.lang.Double sellingPrice, @org.jetbrains.annotations.Nullable()
        java.lang.Double mrpWithSubs, @org.jetbrains.annotations.Nullable()
        java.lang.Long orderId, @org.jetbrains.annotations.Nullable()
        java.lang.Double packagingCharge, @org.jetbrains.annotations.Nullable()
        java.lang.Double payableAmt, @org.jetbrains.annotations.Nullable()
        java.lang.String paymentMode, @org.jetbrains.annotations.Nullable()
        com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse.ResponseData.PaymentSelectionInfo paymentSelectionInfo, @org.jetbrains.annotations.Nullable()
        java.lang.Double savingPercentageWithSubs, @org.jetbrains.annotations.Nullable()
        java.lang.Double savingValue, @org.jetbrains.annotations.Nullable()
        java.lang.Double totalSavings, @org.jetbrains.annotations.Nullable()
        java.lang.String savingsText, @org.jetbrains.annotations.Nullable()
        java.lang.String couldHaveSaved, @org.jetbrains.annotations.Nullable()
        java.lang.Double couldHaveSavedAmount, @org.jetbrains.annotations.Nullable()
        java.lang.Double sellingPriceWithSubs, @org.jetbrains.annotations.Nullable()
        java.lang.Double tmCash, @org.jetbrains.annotations.Nullable()
        java.lang.Double tmCredit, @org.jetbrains.annotations.Nullable()
        java.lang.String couponIconUrl, double addMoreForCod, @org.jetbrains.annotations.Nullable()
        java.lang.Integer restrictedPaymentType, @org.jetbrains.annotations.Nullable()
        java.lang.String deliveryChargeMessage, @org.jetbrains.annotations.Nullable()
        java.lang.String deliveryChargeTooltipMessage, @org.jetbrains.annotations.Nullable()
        java.lang.Integer currentOrderStatus, @org.jetbrains.annotations.Nullable()
        java.lang.String currentOrderState, @org.jetbrains.annotations.Nullable()
        com.intellihealth.salt.models.CashHandlingInfoModel cashHandlingInfo, @org.jetbrains.annotations.Nullable()
        com.intellihealth.salt.models.CashHandlingApplicableInfo cashHandlingApplicableInfo, double payableAmountWithoutChc, @org.jetbrains.annotations.Nullable()
        java.lang.String cashHandlingRefundMsg, boolean pspViewed) {
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
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b*\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\rJ\u000b\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\u000b\u0010.\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010$Jl\u00100\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00c6\u0001\u00a2\u0006\u0002\u00101J\u0013\u00102\u001a\u00020\f2\b\u00103\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00104\u001a\u00020\u0006H\u00d6\u0001J\t\u00105\u001a\u00020\u0003H\u00d6\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u0011R\u001e\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000f\"\u0004\b\"\u0010\u0011R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\'\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&\u00a8\u00066"}, d2 = {"Lcom/intellihealth/truemeds/data/model/orderflow/BillDetailResponse$ResponseData$PaymentSelectionInfo;", "", "lastPaymentMethod", "", "lastPaymentMethodIconUrl", "lastPaymentMethodId", "", "paymentMethod", "paymentMethodIconUrl", "paymentMethodId", "paymentNote", "paymentSpecificCouponApplied", "", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)V", "getLastPaymentMethod", "()Ljava/lang/String;", "setLastPaymentMethod", "(Ljava/lang/String;)V", "getLastPaymentMethodIconUrl", "setLastPaymentMethodIconUrl", "getLastPaymentMethodId", "()I", "setLastPaymentMethodId", "(I)V", "getPaymentMethod", "setPaymentMethod", "getPaymentMethodIconUrl", "setPaymentMethodIconUrl", "getPaymentMethodId", "()Ljava/lang/Integer;", "setPaymentMethodId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getPaymentNote", "setPaymentNote", "getPaymentSpecificCouponApplied", "()Ljava/lang/Boolean;", "setPaymentSpecificCouponApplied", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/intellihealth/truemeds/data/model/orderflow/BillDetailResponse$ResponseData$PaymentSelectionInfo;", "equals", "other", "hashCode", "toString", "app_stageAndroidDebug"})
        public static final class PaymentSelectionInfo {
            @org.jetbrains.annotations.Nullable()
            private java.lang.String lastPaymentMethod;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String lastPaymentMethodIconUrl;
            private int lastPaymentMethodId;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String paymentMethod;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String paymentMethodIconUrl;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Integer paymentMethodId;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String paymentNote;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Boolean paymentSpecificCouponApplied;
            
            public PaymentSelectionInfo(@org.jetbrains.annotations.Nullable()
            java.lang.String lastPaymentMethod, @org.jetbrains.annotations.Nullable()
            java.lang.String lastPaymentMethodIconUrl, int lastPaymentMethodId, @org.jetbrains.annotations.Nullable()
            java.lang.String paymentMethod, @org.jetbrains.annotations.Nullable()
            java.lang.String paymentMethodIconUrl, @org.jetbrains.annotations.Nullable()
            java.lang.Integer paymentMethodId, @org.jetbrains.annotations.Nullable()
            java.lang.String paymentNote, @org.jetbrains.annotations.Nullable()
            java.lang.Boolean paymentSpecificCouponApplied) {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getLastPaymentMethod() {
                return null;
            }
            
            public final void setLastPaymentMethod(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getLastPaymentMethodIconUrl() {
                return null;
            }
            
            public final void setLastPaymentMethodIconUrl(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            public final int getLastPaymentMethodId() {
                return 0;
            }
            
            public final void setLastPaymentMethodId(int p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getPaymentMethod() {
                return null;
            }
            
            public final void setPaymentMethod(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getPaymentMethodIconUrl() {
                return null;
            }
            
            public final void setPaymentMethodIconUrl(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getPaymentMethodId() {
                return null;
            }
            
            public final void setPaymentMethodId(@org.jetbrains.annotations.Nullable()
            java.lang.Integer p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getPaymentNote() {
                return null;
            }
            
            public final void setPaymentNote(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Boolean getPaymentSpecificCouponApplied() {
                return null;
            }
            
            public final void setPaymentSpecificCouponApplied(@org.jetbrains.annotations.Nullable()
            java.lang.Boolean p0) {
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
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component4() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component5() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer component6() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component7() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Boolean component8() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse.ResponseData.PaymentSelectionInfo copy(@org.jetbrains.annotations.Nullable()
            java.lang.String lastPaymentMethod, @org.jetbrains.annotations.Nullable()
            java.lang.String lastPaymentMethodIconUrl, int lastPaymentMethodId, @org.jetbrains.annotations.Nullable()
            java.lang.String paymentMethod, @org.jetbrains.annotations.Nullable()
            java.lang.String paymentMethodIconUrl, @org.jetbrains.annotations.Nullable()
            java.lang.Integer paymentMethodId, @org.jetbrains.annotations.Nullable()
            java.lang.String paymentNote, @org.jetbrains.annotations.Nullable()
            java.lang.Boolean paymentSpecificCouponApplied) {
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
}