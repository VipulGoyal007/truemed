package com.intellihealth.truemeds.data.model.orderflow;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001 B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\nH\u00c6\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006!"}, d2 = {"Lcom/intellihealth/truemeds/data/model/orderflow/GetOrderRxResponse;", "", "message", "", "responseData", "Lcom/intellihealth/truemeds/data/model/orderflow/GetOrderRxResponse$ResponseData;", "statusCode", "", "statusValue", "timeTakenInMs", "", "(Ljava/lang/String;Lcom/intellihealth/truemeds/data/model/orderflow/GetOrderRxResponse$ResponseData;ILjava/lang/String;J)V", "getMessage", "()Ljava/lang/String;", "getResponseData", "()Lcom/intellihealth/truemeds/data/model/orderflow/GetOrderRxResponse$ResponseData;", "getStatusCode", "()I", "getStatusValue", "getTimeTakenInMs", "()J", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "ResponseData", "app_prodDebug"})
public final class GetOrderRxResponse {
    @com.google.gson.annotations.SerializedName(value = "message")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String message = null;
    @com.google.gson.annotations.SerializedName(value = "responseData")
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.data.model.orderflow.GetOrderRxResponse.ResponseData responseData = null;
    @com.google.gson.annotations.SerializedName(value = "statusCode")
    private final int statusCode = 0;
    @com.google.gson.annotations.SerializedName(value = "statusValue")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String statusValue = null;
    @com.google.gson.annotations.SerializedName(value = "timeTakenInMs")
    private final long timeTakenInMs = 0L;
    
    public GetOrderRxResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.orderflow.GetOrderRxResponse.ResponseData responseData, int statusCode, @org.jetbrains.annotations.NotNull()
    java.lang.String statusValue, long timeTakenInMs) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.orderflow.GetOrderRxResponse.ResponseData getResponseData() {
        return null;
    }
    
    public final int getStatusCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatusValue() {
        return null;
    }
    
    public final long getTimeTakenInMs() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.orderflow.GetOrderRxResponse.ResponseData component2() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    public final long component5() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.orderflow.GetOrderRxResponse copy(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.orderflow.GetOrderRxResponse.ResponseData responseData, int statusCode, @org.jetbrains.annotations.NotNull()
    java.lang.String statusValue, long timeTakenInMs) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u00a2\u0006\u0002\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003J)\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0006H\u00d6\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t\u00a8\u0006\u0014"}, d2 = {"Lcom/intellihealth/truemeds/data/model/orderflow/GetOrderRxResponse$ResponseData;", "", "rxList", "", "Lcom/intellihealth/truemeds/data/model/orderflow/OrderRxInfo;", "rxReqProductList", "", "(Ljava/util/List;Ljava/util/List;)V", "getRxList", "()Ljava/util/List;", "getRxReqProductList", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodDebug"})
    public static final class ResponseData {
        @com.google.gson.annotations.SerializedName(value = "rxList")
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.intellihealth.truemeds.data.model.orderflow.OrderRxInfo> rxList = null;
        @com.google.gson.annotations.SerializedName(value = "rxReqProductList")
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.String> rxReqProductList = null;
        
        public ResponseData(@org.jetbrains.annotations.NotNull()
        java.util.List<com.intellihealth.truemeds.data.model.orderflow.OrderRxInfo> rxList, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> rxReqProductList) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.intellihealth.truemeds.data.model.orderflow.OrderRxInfo> getRxList() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getRxReqProductList() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.intellihealth.truemeds.data.model.orderflow.OrderRxInfo> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.intellihealth.truemeds.data.model.orderflow.GetOrderRxResponse.ResponseData copy(@org.jetbrains.annotations.NotNull()
        java.util.List<com.intellihealth.truemeds.data.model.orderflow.OrderRxInfo> rxList, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> rxReqProductList) {
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