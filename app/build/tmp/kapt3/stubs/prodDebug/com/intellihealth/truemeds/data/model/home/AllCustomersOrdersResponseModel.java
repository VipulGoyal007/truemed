package com.intellihealth.truemeds.data.model.home;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001eB7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0007H\u00c6\u0003J=\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010\u00a8\u0006\u001f"}, d2 = {"Lcom/intellihealth/truemeds/data/model/home/AllCustomersOrdersResponseModel;", "", "message", "", "responseData", "Lcom/intellihealth/truemeds/data/model/home/AllCustomersOrdersResponseModel$ResponseData;", "statusCode", "", "statusValue", "timeTakenInMs", "(Ljava/lang/String;Lcom/intellihealth/truemeds/data/model/home/AllCustomersOrdersResponseModel$ResponseData;ILjava/lang/String;I)V", "getMessage", "()Ljava/lang/String;", "getResponseData", "()Lcom/intellihealth/truemeds/data/model/home/AllCustomersOrdersResponseModel$ResponseData;", "getStatusCode", "()I", "getStatusValue", "getTimeTakenInMs", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "ResponseData", "app_prodDebug"})
public final class AllCustomersOrdersResponseModel {
    @com.google.gson.annotations.SerializedName(value = "message")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String message = null;
    @com.google.gson.annotations.SerializedName(value = "responseData")
    @org.jetbrains.annotations.Nullable()
    private final com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel.ResponseData responseData = null;
    @com.google.gson.annotations.SerializedName(value = "statusCode")
    private final int statusCode = 0;
    @com.google.gson.annotations.SerializedName(value = "statusValue")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String statusValue = null;
    @com.google.gson.annotations.SerializedName(value = "timeTakenInMs")
    private final int timeTakenInMs = 0;
    
    public AllCustomersOrdersResponseModel(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel.ResponseData responseData, int statusCode, @org.jetbrains.annotations.NotNull()
    java.lang.String statusValue, int timeTakenInMs) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel.ResponseData getResponseData() {
        return null;
    }
    
    public final int getStatusCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatusValue() {
        return null;
    }
    
    public final int getTimeTakenInMs() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel.ResponseData component2() {
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
    public final com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel copy(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel.ResponseData responseData, int statusCode, @org.jetbrains.annotations.NotNull()
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0019B3\u0012\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J7\u0010\u0012\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R&\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r\u00a8\u0006\u001a"}, d2 = {"Lcom/intellihealth/truemeds/data/model/home/AllCustomersOrdersResponseModel$ResponseData;", "", "ordersList", "Ljava/util/ArrayList;", "Lcom/intellihealth/truemeds/data/model/home/AllCustomersOrdersResponseModel$ResponseData$Orders;", "Lkotlin/collections/ArrayList;", "pageCount", "", "recordsCount", "(Ljava/util/ArrayList;II)V", "getOrdersList", "()Ljava/util/ArrayList;", "getPageCount", "()I", "getRecordsCount", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "Orders", "app_prodDebug"})
    public static final class ResponseData {
        @com.google.gson.annotations.SerializedName(value = "ordersList")
        @org.jetbrains.annotations.NotNull()
        private final java.util.ArrayList<com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel.ResponseData.Orders> ordersList = null;
        @com.google.gson.annotations.SerializedName(value = "pageCount")
        private final int pageCount = 0;
        @com.google.gson.annotations.SerializedName(value = "recordsCount")
        private final int recordsCount = 0;
        
        public ResponseData(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel.ResponseData.Orders> ordersList, int pageCount, int recordsCount) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel.ResponseData.Orders> getOrdersList() {
            return null;
        }
        
        public final int getPageCount() {
            return 0;
        }
        
        public final int getRecordsCount() {
            return 0;
        }
        
        public ResponseData() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel.ResponseData.Orders> component1() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int component3() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel.ResponseData copy(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel.ResponseData.Orders> ordersList, int pageCount, int recordsCount) {
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
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b=\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0003jklB\u00d7\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u0016\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0012\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010!J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010C\u001a\u00020\u000eH\u00c6\u0003J\t\u0010D\u001a\u00020\u000eH\u00c6\u0003J\t\u0010E\u001a\u00020\u000eH\u00c6\u0003J\u000f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u00c6\u0003J\t\u0010G\u001a\u00020\tH\u00c6\u0003J\t\u0010H\u001a\u00020\u0016H\u00c6\u0003J\t\u0010I\u001a\u00020\u0016H\u00c6\u0003J\t\u0010J\u001a\u00020\u0003H\u00c6\u0003J\t\u0010K\u001a\u00020\u0003H\u00c6\u0003J\t\u0010L\u001a\u00020\u0016H\u00c6\u0003J\t\u0010M\u001a\u00020\u0003H\u00c6\u0003J\t\u0010N\u001a\u00020\u0016H\u00c6\u0003J\u000f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0012H\u00c6\u0003J\t\u0010P\u001a\u00020\u001fH\u00c6\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010S\u001a\u00020\u0003H\u00c6\u0003J\t\u0010T\u001a\u00020\u0003H\u00c6\u0003J\t\u0010U\u001a\u00020\tH\u00c6\u0003J\t\u0010V\u001a\u00020\u0003H\u00c6\u0003J\t\u0010W\u001a\u00020\u0003H\u00c6\u0003J\t\u0010X\u001a\u00020\u0003H\u00c6\u0003J\u0081\u0002\u0010Y\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u00162\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00122\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010Z\u001a\u00020\u00162\b\u0010[\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u0010\u0010\\\u001a\u00020]2\u0006\u0010^\u001a\u00020\u0003H\u0002J\u001a\u0010_\u001a\u0004\u0018\u00010`2\u0006\u0010a\u001a\u00020b2\u0006\u0010\u0018\u001a\u00020\u0003H\u0002J\t\u0010c\u001a\u00020dH\u00d6\u0001J\u0006\u0010e\u001a\u00020fJ\u000e\u0010g\u001a\u00020h2\u0006\u0010a\u001a\u00020bJ\t\u0010i\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0016\u0010\u001a\u001a\u00020\u00168\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010#R\u0016\u0010\u0019\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010#R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010#R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010#R\u0011\u0010\u0010\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u001a\u0010\u0017\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010&\"\u0004\b.\u0010/R\u0016\u0010\u0015\u001a\u00020\u00168\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010&R\u0016\u0010\u0014\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010#R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010#R\u0011\u0010\u0018\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010#R\u0016\u0010\u001e\u001a\u00020\u001f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010#R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u00102R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010,R\u001e\u0010\u001b\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010&\"\u0004\b<\u0010/R\u0016\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010,R\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0018\u0010 \u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010#R\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00128\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010?\u00a8\u0006m"}, d2 = {"Lcom/intellihealth/truemeds/data/model/home/AllCustomersOrdersResponseModel$ResponseData$Orders;", "", "actionButtonText", "", "actionButtonType", "cartActionType", "date", "orderForPatientName", "orderId", "", "deliveryDate", "homepageActionButtonType", "homepageActionButtonText", "payableAmount", "", "paymentValue", "discount", "productNameList", "", "Lcom/intellihealth/truemeds/data/model/home/AllCustomersOrdersResponseModel$ResponseData$Orders$ProductName;", "drCallbackValidMillis", "doctorCallMissed", "", "doctorCallConfirm", "iconName", "color", "callbackRequested", "paymentPending", "statuses", "Lcom/intellihealth/truemeds/data/model/home/AllCustomersOrdersResponseModel$ResponseData$Orders$Statuse;", "mxEvents", "Lcom/intellihealth/truemeds/data/model/home/AllCustomersOrdersResponseModel$ResponseData$Orders$MxEvents;", "savingText", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDLjava/util/List;JZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/List;Lcom/intellihealth/truemeds/data/model/home/AllCustomersOrdersResponseModel$ResponseData$Orders$MxEvents;Ljava/lang/String;)V", "getActionButtonText", "()Ljava/lang/String;", "getActionButtonType", "getCallbackRequested", "()Z", "getCartActionType", "getColor", "getDate", "getDeliveryDate", "getDiscount", "()D", "getDoctorCallConfirm", "setDoctorCallConfirm", "(Z)V", "getDoctorCallMissed", "getDrCallbackValidMillis", "()J", "getHomepageActionButtonText", "getHomepageActionButtonType", "getIconName", "getMxEvents", "()Lcom/intellihealth/truemeds/data/model/home/AllCustomersOrdersResponseModel$ResponseData$Orders$MxEvents;", "getOrderForPatientName", "getOrderId", "getPayableAmount", "getPaymentPending", "setPaymentPending", "getPaymentValue", "getProductNameList", "()Ljava/util/List;", "getSavingText", "getStatuses", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "getCategoryTypeForEnum", "Lcom/intellihealth/salt/models/OrderTracking;", "data", "getImageFromDrawable", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "hashCode", "", "toOrderStatusCardsModel", "Lcom/intellihealth/salt/models/TmOrderStatusCardModel;", "toSdkActiveOrderList", "Lcom/intellihealth/salt/models/OrderTrackingModel;", "toString", "MxEvents", "ProductName", "Statuse", "app_prodDebug"})
        public static final class Orders {
            @com.google.gson.annotations.SerializedName(value = "actionButtonText")
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String actionButtonText = null;
            @com.google.gson.annotations.SerializedName(value = "actionButtonType")
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String actionButtonType = null;
            @com.google.gson.annotations.SerializedName(value = "cartActionType")
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String cartActionType = null;
            @com.google.gson.annotations.SerializedName(value = "date")
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String date = null;
            @com.google.gson.annotations.SerializedName(value = "orderForPatientName")
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String orderForPatientName = null;
            @com.google.gson.annotations.SerializedName(value = "orderId")
            private final long orderId = 0L;
            @com.google.gson.annotations.SerializedName(value = "deliveryDate")
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String deliveryDate = null;
            @com.google.gson.annotations.SerializedName(value = "homepageActionButtonType")
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String homepageActionButtonType = null;
            @com.google.gson.annotations.SerializedName(value = "homepageActionButtonText")
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String homepageActionButtonText = null;
            @com.google.gson.annotations.SerializedName(value = "payableAmount")
            private final double payableAmount = 0.0;
            @com.google.gson.annotations.SerializedName(value = "paymentValue")
            private final double paymentValue = 0.0;
            private final double discount = 0.0;
            @com.google.gson.annotations.SerializedName(value = "productNameList")
            @org.jetbrains.annotations.NotNull()
            private final java.util.List<com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel.ResponseData.Orders.ProductName> productNameList = null;
            @com.google.gson.annotations.SerializedName(value = "drCallbackValidMillis")
            private final long drCallbackValidMillis = 0L;
            @com.google.gson.annotations.SerializedName(value = "doctorCallMissed")
            private final boolean doctorCallMissed = false;
            private boolean doctorCallConfirm;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String iconName = null;
            @com.google.gson.annotations.SerializedName(value = "bgCardColor")
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String color = null;
            @com.google.gson.annotations.SerializedName(value = "callbackRequested")
            private final boolean callbackRequested = false;
            @com.google.gson.annotations.SerializedName(value = "paymentPending")
            private boolean paymentPending;
            @com.google.gson.annotations.SerializedName(value = "statuses")
            @org.jetbrains.annotations.NotNull()
            private final java.util.List<com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel.ResponseData.Orders.Statuse> statuses = null;
            @com.google.gson.annotations.SerializedName(value = "sdkEvents")
            @org.jetbrains.annotations.NotNull()
            private final com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel.ResponseData.Orders.MxEvents mxEvents = null;
            @com.google.gson.annotations.SerializedName(value = "savingsText")
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String savingText = null;
            
            public Orders(@org.jetbrains.annotations.Nullable()
            java.lang.String actionButtonText, @org.jetbrains.annotations.NotNull()
            java.lang.String actionButtonType, @org.jetbrains.annotations.Nullable()
            java.lang.String cartActionType, @org.jetbrains.annotations.NotNull()
            java.lang.String date, @org.jetbrains.annotations.NotNull()
            java.lang.String orderForPatientName, long orderId, @org.jetbrains.annotations.NotNull()
            java.lang.String deliveryDate, @org.jetbrains.annotations.NotNull()
            java.lang.String homepageActionButtonType, @org.jetbrains.annotations.NotNull()
            java.lang.String homepageActionButtonText, double payableAmount, double paymentValue, double discount, @org.jetbrains.annotations.NotNull()
            java.util.List<com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel.ResponseData.Orders.ProductName> productNameList, long drCallbackValidMillis, boolean doctorCallMissed, boolean doctorCallConfirm, @org.jetbrains.annotations.NotNull()
            java.lang.String iconName, @org.jetbrains.annotations.NotNull()
            java.lang.String color, boolean callbackRequested, boolean paymentPending, @org.jetbrains.annotations.NotNull()
            java.util.List<com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel.ResponseData.Orders.Statuse> statuses, @org.jetbrains.annotations.NotNull()
            com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel.ResponseData.Orders.MxEvents mxEvents, @org.jetbrains.annotations.Nullable()
            java.lang.String savingText) {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getActionButtonText() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getActionButtonType() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getCartActionType() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getDate() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getOrderForPatientName() {
                return null;
            }
            
            public final long getOrderId() {
                return 0L;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getDeliveryDate() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getHomepageActionButtonType() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getHomepageActionButtonText() {
                return null;
            }
            
            public final double getPayableAmount() {
                return 0.0;
            }
            
            public final double getPaymentValue() {
                return 0.0;
            }
            
            public final double getDiscount() {
                return 0.0;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel.ResponseData.Orders.ProductName> getProductNameList() {
                return null;
            }
            
            public final long getDrCallbackValidMillis() {
                return 0L;
            }
            
            public final boolean getDoctorCallMissed() {
                return false;
            }
            
            public final boolean getDoctorCallConfirm() {
                return false;
            }
            
            public final void setDoctorCallConfirm(boolean p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getIconName() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getColor() {
                return null;
            }
            
            public final boolean getCallbackRequested() {
                return false;
            }
            
            public final boolean getPaymentPending() {
                return false;
            }
            
            public final void setPaymentPending(boolean p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel.ResponseData.Orders.Statuse> getStatuses() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel.ResponseData.Orders.MxEvents getMxEvents() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getSavingText() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.intellihealth.salt.models.OrderTrackingModel toSdkActiveOrderList(@org.jetbrains.annotations.NotNull()
            android.content.Context context) {
                return null;
            }
            
            private final com.intellihealth.salt.models.OrderTracking getCategoryTypeForEnum(java.lang.String data) {
                return null;
            }
            
            private final android.graphics.drawable.Drawable getImageFromDrawable(android.content.Context context, java.lang.String iconName) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.intellihealth.salt.models.TmOrderStatusCardModel toOrderStatusCardsModel() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component1() {
                return null;
            }
            
            public final double component10() {
                return 0.0;
            }
            
            public final double component11() {
                return 0.0;
            }
            
            public final double component12() {
                return 0.0;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel.ResponseData.Orders.ProductName> component13() {
                return null;
            }
            
            public final long component14() {
                return 0L;
            }
            
            public final boolean component15() {
                return false;
            }
            
            public final boolean component16() {
                return false;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component17() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component18() {
                return null;
            }
            
            public final boolean component19() {
                return false;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component2() {
                return null;
            }
            
            public final boolean component20() {
                return false;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel.ResponseData.Orders.Statuse> component21() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel.ResponseData.Orders.MxEvents component22() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component23() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component3() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component4() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component5() {
                return null;
            }
            
            public final long component6() {
                return 0L;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component7() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component8() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component9() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel.ResponseData.Orders copy(@org.jetbrains.annotations.Nullable()
            java.lang.String actionButtonText, @org.jetbrains.annotations.NotNull()
            java.lang.String actionButtonType, @org.jetbrains.annotations.Nullable()
            java.lang.String cartActionType, @org.jetbrains.annotations.NotNull()
            java.lang.String date, @org.jetbrains.annotations.NotNull()
            java.lang.String orderForPatientName, long orderId, @org.jetbrains.annotations.NotNull()
            java.lang.String deliveryDate, @org.jetbrains.annotations.NotNull()
            java.lang.String homepageActionButtonType, @org.jetbrains.annotations.NotNull()
            java.lang.String homepageActionButtonText, double payableAmount, double paymentValue, double discount, @org.jetbrains.annotations.NotNull()
            java.util.List<com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel.ResponseData.Orders.ProductName> productNameList, long drCallbackValidMillis, boolean doctorCallMissed, boolean doctorCallConfirm, @org.jetbrains.annotations.NotNull()
            java.lang.String iconName, @org.jetbrains.annotations.NotNull()
            java.lang.String color, boolean callbackRequested, boolean paymentPending, @org.jetbrains.annotations.NotNull()
            java.util.List<com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel.ResponseData.Orders.Statuse> statuses, @org.jetbrains.annotations.NotNull()
            com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel.ResponseData.Orders.MxEvents mxEvents, @org.jetbrains.annotations.Nullable()
            java.lang.String savingText) {
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
            
            @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b)\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u00b3\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0002\u0010\u0014J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0018J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0018J\u0011\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0012H\u00c6\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0002\u0010\"J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0018J\u000b\u00101\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0002\u0010\"J\u00bc\u0001\u00107\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\rH\u00c6\u0001\u00a2\u0006\u0002\u00108J\u0013\u00109\u001a\u00020\r2\b\u0010:\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010;\u001a\u00020<H\u00d6\u0001J\t\u0010=\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001d\u0010\u0018R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\r\u00a2\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0015\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\n\n\u0002\u0010#\u001a\u0004\b$\u0010\"R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u0016R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b(\u0010\u0018\u00a8\u0006>"}, d2 = {"Lcom/intellihealth/truemeds/data/model/home/AllCustomersOrdersResponseModel$ResponseData$Orders$MxEvents;", "", "patientType", "", "patientAge", "patientId", "", "patientGender", "shippingCity", "shippingState", "shippingPincode", "addressType", "rxRequired", "", "statusId", "doctorName", "doctorId", "productCodes", "", "reorder", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Boolean;)V", "getAddressType", "()Ljava/lang/String;", "getDoctorId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDoctorName", "getPatientAge", "getPatientGender", "getPatientId", "getPatientType", "getProductCodes", "()Ljava/util/List;", "getReorder", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRxRequired", "getShippingCity", "getShippingPincode", "getShippingState", "getStatusId", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Boolean;)Lcom/intellihealth/truemeds/data/model/home/AllCustomersOrdersResponseModel$ResponseData$Orders$MxEvents;", "equals", "other", "hashCode", "", "toString", "app_prodDebug"})
            public static final class MxEvents {
                @org.jetbrains.annotations.Nullable()
                private final java.lang.String patientType = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.String patientAge = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Long patientId = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.String patientGender = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.String shippingCity = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.String shippingState = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.String shippingPincode = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.String addressType = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Boolean rxRequired = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Long statusId = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.String doctorName = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Long doctorId = null;
                @org.jetbrains.annotations.Nullable()
                private final java.util.List<java.lang.String> productCodes = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Boolean reorder = null;
                
                public MxEvents(@org.jetbrains.annotations.Nullable()
                java.lang.String patientType, @org.jetbrains.annotations.Nullable()
                java.lang.String patientAge, @org.jetbrains.annotations.Nullable()
                java.lang.Long patientId, @org.jetbrains.annotations.Nullable()
                java.lang.String patientGender, @org.jetbrains.annotations.Nullable()
                java.lang.String shippingCity, @org.jetbrains.annotations.Nullable()
                java.lang.String shippingState, @org.jetbrains.annotations.Nullable()
                java.lang.String shippingPincode, @org.jetbrains.annotations.Nullable()
                java.lang.String addressType, @org.jetbrains.annotations.Nullable()
                java.lang.Boolean rxRequired, @org.jetbrains.annotations.Nullable()
                java.lang.Long statusId, @org.jetbrains.annotations.Nullable()
                java.lang.String doctorName, @org.jetbrains.annotations.Nullable()
                java.lang.Long doctorId, @org.jetbrains.annotations.Nullable()
                java.util.List<java.lang.String> productCodes, @org.jetbrains.annotations.Nullable()
                java.lang.Boolean reorder) {
                    super();
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getPatientType() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getPatientAge() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Long getPatientId() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getPatientGender() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getShippingCity() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getShippingState() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getShippingPincode() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getAddressType() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Boolean getRxRequired() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Long getStatusId() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getDoctorName() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Long getDoctorId() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.util.List<java.lang.String> getProductCodes() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Boolean getReorder() {
                    return null;
                }
                
                public MxEvents() {
                    super();
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String component1() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Long component10() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String component11() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Long component12() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.util.List<java.lang.String> component13() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Boolean component14() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String component2() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Long component3() {
                    return null;
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
                public final java.lang.String component6() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String component7() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String component8() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Boolean component9() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel.ResponseData.Orders.MxEvents copy(@org.jetbrains.annotations.Nullable()
                java.lang.String patientType, @org.jetbrains.annotations.Nullable()
                java.lang.String patientAge, @org.jetbrains.annotations.Nullable()
                java.lang.Long patientId, @org.jetbrains.annotations.Nullable()
                java.lang.String patientGender, @org.jetbrains.annotations.Nullable()
                java.lang.String shippingCity, @org.jetbrains.annotations.Nullable()
                java.lang.String shippingState, @org.jetbrains.annotations.Nullable()
                java.lang.String shippingPincode, @org.jetbrains.annotations.Nullable()
                java.lang.String addressType, @org.jetbrains.annotations.Nullable()
                java.lang.Boolean rxRequired, @org.jetbrains.annotations.Nullable()
                java.lang.Long statusId, @org.jetbrains.annotations.Nullable()
                java.lang.String doctorName, @org.jetbrains.annotations.Nullable()
                java.lang.Long doctorId, @org.jetbrains.annotations.Nullable()
                java.util.List<java.lang.String> productCodes, @org.jetbrains.annotations.Nullable()
                java.lang.Boolean reorder) {
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
            
            @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001f"}, d2 = {"Lcom/intellihealth/truemeds/data/model/home/AllCustomersOrdersResponseModel$ResponseData$Orders$ProductName;", "Landroid/os/Parcelable;", "quantity", "", "sellingPrice", "", "skuName", "", "(IDLjava/lang/String;)V", "getQuantity", "()I", "getSellingPrice", "()D", "getSkuName", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_prodDebug"})
            @kotlinx.parcelize.Parcelize()
            public static final class ProductName implements android.os.Parcelable {
                @com.google.gson.annotations.SerializedName(value = "quantity")
                private final int quantity = 0;
                @com.google.gson.annotations.SerializedName(value = "sellingPrice")
                private final double sellingPrice = 0.0;
                @com.google.gson.annotations.SerializedName(value = "skuName")
                @org.jetbrains.annotations.NotNull()
                private final java.lang.String skuName = null;
                
                public ProductName(int quantity, double sellingPrice, @org.jetbrains.annotations.NotNull()
                java.lang.String skuName) {
                    super();
                }
                
                public final int getQuantity() {
                    return 0;
                }
                
                public final double getSellingPrice() {
                    return 0.0;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.lang.String getSkuName() {
                    return null;
                }
                
                public final int component1() {
                    return 0;
                }
                
                public final double component2() {
                    return 0.0;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.lang.String component3() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel.ResponseData.Orders.ProductName copy(int quantity, double sellingPrice, @org.jetbrains.annotations.NotNull()
                java.lang.String skuName) {
                    return null;
                }
                
                @java.lang.Override()
                public int describeContents() {
                    return 0;
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
                
                @java.lang.Override()
                public void writeToParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel parcel, int flags) {
                }
            }
            
            @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/intellihealth/truemeds/data/model/home/AllCustomersOrdersResponseModel$ResponseData$Orders$Statuse;", "", "statusName", "", "statusType", "homepageStatusDesc", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHomepageStatusDesc", "()Ljava/lang/String;", "getStatusName", "getStatusType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodDebug"})
            public static final class Statuse {
                @com.google.gson.annotations.SerializedName(value = "statusName")
                @org.jetbrains.annotations.NotNull()
                private final java.lang.String statusName = null;
                @com.google.gson.annotations.SerializedName(value = "statusType")
                @org.jetbrains.annotations.NotNull()
                private final java.lang.String statusType = null;
                @com.google.gson.annotations.SerializedName(value = "homepageStatusDesc")
                @org.jetbrains.annotations.Nullable()
                private final java.lang.String homepageStatusDesc = null;
                
                public Statuse(@org.jetbrains.annotations.NotNull()
                java.lang.String statusName, @org.jetbrains.annotations.NotNull()
                java.lang.String statusType, @org.jetbrains.annotations.Nullable()
                java.lang.String homepageStatusDesc) {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.lang.String getStatusName() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.lang.String getStatusType() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getHomepageStatusDesc() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.lang.String component1() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.lang.String component2() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String component3() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel.ResponseData.Orders.Statuse copy(@org.jetbrains.annotations.NotNull()
                java.lang.String statusName, @org.jetbrains.annotations.NotNull()
                java.lang.String statusType, @org.jetbrains.annotations.Nullable()
                java.lang.String homepageStatusDesc) {
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
}