package com.intellihealth.truemeds.data.model.ordersummary;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001&B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0007H\u00c6\u0003J=\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010$\u001a\u00020\u0007H\u00d6\u0001J\t\u0010%\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\u001a\u0010\t\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016\u00a8\u0006\'"}, d2 = {"Lcom/intellihealth/truemeds/data/model/ordersummary/OTCResponse;", "", "message", "", "responseData", "Lcom/intellihealth/truemeds/data/model/ordersummary/OTCResponse$ResponseData;", "statusCode", "", "statusValue", "timeTakenInMs", "(Ljava/lang/String;Lcom/intellihealth/truemeds/data/model/ordersummary/OTCResponse$ResponseData;ILjava/lang/String;I)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getResponseData", "()Lcom/intellihealth/truemeds/data/model/ordersummary/OTCResponse$ResponseData;", "setResponseData", "(Lcom/intellihealth/truemeds/data/model/ordersummary/OTCResponse$ResponseData;)V", "getStatusCode", "()I", "setStatusCode", "(I)V", "getStatusValue", "setStatusValue", "getTimeTakenInMs", "setTimeTakenInMs", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "ResponseData", "app_stageAndroidDebug"})
public final class OTCResponse {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String message;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.data.model.ordersummary.OTCResponse.ResponseData responseData;
    private int statusCode;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String statusValue;
    private int timeTakenInMs;
    
    public OTCResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.ordersummary.OTCResponse.ResponseData responseData, int statusCode, @org.jetbrains.annotations.NotNull()
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
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.ordersummary.OTCResponse.ResponseData getResponseData() {
        return null;
    }
    
    public final void setResponseData(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.ordersummary.OTCResponse.ResponseData p0) {
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
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.ordersummary.OTCResponse.ResponseData component2() {
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
    public final com.intellihealth.truemeds.data.model.ordersummary.OTCResponse copy(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.ordersummary.OTCResponse.ResponseData responseData, int statusCode, @org.jetbrains.annotations.NotNull()
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0007J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u00c6\u0003J+\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0006H\u00d6\u0001R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lcom/intellihealth/truemeds/data/model/ordersummary/OTCResponse$ResponseData;", "", "reOrderCrossSellingProduct", "", "Lcom/intellihealth/truemeds/presentation/model/ProductInfoModel;", "productCodeList", "", "(Ljava/util/List;Ljava/util/List;)V", "getProductCodeList", "()Ljava/util/List;", "setProductCodeList", "(Ljava/util/List;)V", "getReOrderCrossSellingProduct", "setReOrderCrossSellingProduct", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_stageAndroidDebug"})
    public static final class ResponseData {
        @org.jetbrains.annotations.NotNull()
        private java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> reOrderCrossSellingProduct;
        @org.jetbrains.annotations.Nullable()
        private java.util.List<java.lang.String> productCodeList;
        
        public ResponseData(@org.jetbrains.annotations.NotNull()
        java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> reOrderCrossSellingProduct, @org.jetbrains.annotations.Nullable()
        java.util.List<java.lang.String> productCodeList) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> getReOrderCrossSellingProduct() {
            return null;
        }
        
        public final void setReOrderCrossSellingProduct(@org.jetbrains.annotations.NotNull()
        java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<java.lang.String> getProductCodeList() {
            return null;
        }
        
        public final void setProductCodeList(@org.jetbrains.annotations.Nullable()
        java.util.List<java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<java.lang.String> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.intellihealth.truemeds.data.model.ordersummary.OTCResponse.ResponseData copy(@org.jetbrains.annotations.NotNull()
        java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> reOrderCrossSellingProduct, @org.jetbrains.annotations.Nullable()
        java.util.List<java.lang.String> productCodeList) {
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