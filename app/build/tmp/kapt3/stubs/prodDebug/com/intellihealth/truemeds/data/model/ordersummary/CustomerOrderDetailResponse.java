package com.intellihealth.truemeds.data.model.ordersummary;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001&B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0007H\u00c6\u0003J;\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010$\u001a\u00020\u0007H\u00d6\u0001J\t\u0010%\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\u001a\u0010\t\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016\u00a8\u0006\'"}, d2 = {"Lcom/intellihealth/truemeds/data/model/ordersummary/CustomerOrderDetailResponse;", "", "message", "", "responseData", "Lcom/intellihealth/truemeds/data/model/ordersummary/CustomerOrderDetailResponse$ResponseData;", "statusCode", "", "statusValue", "timeTakenInMs", "(Ljava/lang/String;Lcom/intellihealth/truemeds/data/model/ordersummary/CustomerOrderDetailResponse$ResponseData;ILjava/lang/String;I)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getResponseData", "()Lcom/intellihealth/truemeds/data/model/ordersummary/CustomerOrderDetailResponse$ResponseData;", "setResponseData", "(Lcom/intellihealth/truemeds/data/model/ordersummary/CustomerOrderDetailResponse$ResponseData;)V", "getStatusCode", "()I", "setStatusCode", "(I)V", "getStatusValue", "setStatusValue", "getTimeTakenInMs", "setTimeTakenInMs", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "ResponseData", "app_prodDebug"})
public final class CustomerOrderDetailResponse {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String message;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.data.model.ordersummary.CustomerOrderDetailResponse.ResponseData responseData;
    private int statusCode;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String statusValue;
    private int timeTakenInMs;
    
    public CustomerOrderDetailResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.ordersummary.CustomerOrderDetailResponse.ResponseData responseData, int statusCode, @org.jetbrains.annotations.NotNull()
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
    public final com.intellihealth.truemeds.data.model.ordersummary.CustomerOrderDetailResponse.ResponseData getResponseData() {
        return null;
    }
    
    public final void setResponseData(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.ordersummary.CustomerOrderDetailResponse.ResponseData p0) {
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
    public final com.intellihealth.truemeds.data.model.ordersummary.CustomerOrderDetailResponse.ResponseData component2() {
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
    public final com.intellihealth.truemeds.data.model.ordersummary.CustomerOrderDetailResponse copy(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.ordersummary.CustomerOrderDetailResponse.ResponseData responseData, int statusCode, @org.jetbrains.annotations.NotNull()
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b6\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0001\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0010J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\t\u00100\u001a\u00020\u0001H\u00c6\u0003J\t\u00101\u001a\u00020\u0005H\u00c6\u0003J\t\u00102\u001a\u00020\u0005H\u00c6\u0003J\t\u00103\u001a\u00020\u0007H\u00c6\u0003J\t\u00104\u001a\u00020\u0007H\u00c6\u0003J\t\u00105\u001a\u00020\u0007H\u00c6\u0003J\t\u00106\u001a\u00020\u0003H\u00c6\u0003J\t\u00107\u001a\u00020\u0007H\u00c6\u0003J\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\t\u00109\u001a\u00020\u0007H\u00c6\u0003Jw\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010;\u001a\u00020\u00072\b\u0010<\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010=\u001a\u00020>H\u00d6\u0001J\t\u0010?\u001a\u00020\u0005H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\u001a\u0010\t\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0012\"\u0004\b\"\u0010\u0014R\u001a\u0010\u000b\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001a\"\u0004\b$\u0010\u001cR\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0012\"\u0004\b&\u0010\u0014R\u001a\u0010\r\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u001a\"\u0004\b(\u0010\u001cR\u001a\u0010\u000e\u001a\u00020\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010\u000f\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0016\"\u0004\b.\u0010\u0018\u00a8\u0006@"}, d2 = {"Lcom/intellihealth/truemeds/data/model/ordersummary/CustomerOrderDetailResponse$ResponseData;", "", "addressId", "", "altMobNumber", "", "cxHasActiveAddress", "", "cxHasActivePatient", "drCallRequired", "orderId", "orderReorder", "patientId", "pharmacistCallRequired", "prevPaymentId", "regMobNumber", "(JLjava/lang/String;ZZZJZJZLjava/lang/Object;Ljava/lang/String;)V", "getAddressId", "()J", "setAddressId", "(J)V", "getAltMobNumber", "()Ljava/lang/String;", "setAltMobNumber", "(Ljava/lang/String;)V", "getCxHasActiveAddress", "()Z", "setCxHasActiveAddress", "(Z)V", "getCxHasActivePatient", "setCxHasActivePatient", "getDrCallRequired", "setDrCallRequired", "getOrderId", "setOrderId", "getOrderReorder", "setOrderReorder", "getPatientId", "setPatientId", "getPharmacistCallRequired", "setPharmacistCallRequired", "getPrevPaymentId", "()Ljava/lang/Object;", "setPrevPaymentId", "(Ljava/lang/Object;)V", "getRegMobNumber", "setRegMobNumber", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "app_prodDebug"})
    public static final class ResponseData {
        private long addressId;
        @org.jetbrains.annotations.NotNull()
        private java.lang.String altMobNumber;
        private boolean cxHasActiveAddress;
        private boolean cxHasActivePatient;
        private boolean drCallRequired;
        private long orderId;
        private boolean orderReorder;
        private long patientId;
        private boolean pharmacistCallRequired;
        @org.jetbrains.annotations.NotNull()
        private java.lang.Object prevPaymentId;
        @org.jetbrains.annotations.NotNull()
        private java.lang.String regMobNumber;
        
        public ResponseData(long addressId, @org.jetbrains.annotations.NotNull()
        java.lang.String altMobNumber, boolean cxHasActiveAddress, boolean cxHasActivePatient, boolean drCallRequired, long orderId, boolean orderReorder, long patientId, boolean pharmacistCallRequired, @org.jetbrains.annotations.NotNull()
        java.lang.Object prevPaymentId, @org.jetbrains.annotations.NotNull()
        java.lang.String regMobNumber) {
            super();
        }
        
        public final long getAddressId() {
            return 0L;
        }
        
        public final void setAddressId(long p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAltMobNumber() {
            return null;
        }
        
        public final void setAltMobNumber(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        public final boolean getCxHasActiveAddress() {
            return false;
        }
        
        public final void setCxHasActiveAddress(boolean p0) {
        }
        
        public final boolean getCxHasActivePatient() {
            return false;
        }
        
        public final void setCxHasActivePatient(boolean p0) {
        }
        
        public final boolean getDrCallRequired() {
            return false;
        }
        
        public final void setDrCallRequired(boolean p0) {
        }
        
        public final long getOrderId() {
            return 0L;
        }
        
        public final void setOrderId(long p0) {
        }
        
        public final boolean getOrderReorder() {
            return false;
        }
        
        public final void setOrderReorder(boolean p0) {
        }
        
        public final long getPatientId() {
            return 0L;
        }
        
        public final void setPatientId(long p0) {
        }
        
        public final boolean getPharmacistCallRequired() {
            return false;
        }
        
        public final void setPharmacistCallRequired(boolean p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Object getPrevPaymentId() {
            return null;
        }
        
        public final void setPrevPaymentId(@org.jetbrains.annotations.NotNull()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getRegMobNumber() {
            return null;
        }
        
        public final void setRegMobNumber(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        public final long component1() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Object component10() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component11() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        public final boolean component3() {
            return false;
        }
        
        public final boolean component4() {
            return false;
        }
        
        public final boolean component5() {
            return false;
        }
        
        public final long component6() {
            return 0L;
        }
        
        public final boolean component7() {
            return false;
        }
        
        public final long component8() {
            return 0L;
        }
        
        public final boolean component9() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.intellihealth.truemeds.data.model.ordersummary.CustomerOrderDetailResponse.ResponseData copy(long addressId, @org.jetbrains.annotations.NotNull()
        java.lang.String altMobNumber, boolean cxHasActiveAddress, boolean cxHasActivePatient, boolean drCallRequired, long orderId, boolean orderReorder, long patientId, boolean pharmacistCallRequired, @org.jetbrains.annotations.NotNull()
        java.lang.Object prevPaymentId, @org.jetbrains.annotations.NotNull()
        java.lang.String regMobNumber) {
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