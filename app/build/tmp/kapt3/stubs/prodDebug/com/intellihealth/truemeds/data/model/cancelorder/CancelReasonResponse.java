package com.intellihealth.truemeds.data.model.cancelorder;

/**
 * This is used when cancel the order it contains cancellation reason list
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001#B9\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0006H\u00c6\u0003J\u0013\u0010\u001c\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\bH\u00c6\u0003J?\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0012\b\u0002\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\bH\u00c6\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\"\u001a\u00020\u0003H\u00d6\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR(\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000e\u00a8\u0006$"}, d2 = {"Lcom/intellihealth/truemeds/data/model/cancelorder/CancelReasonResponse;", "", "message", "", "statusValue", "statusCode", "", "responseData", "", "Lcom/intellihealth/truemeds/data/model/cancelorder/CancelReasonResponse$Reason;", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getResponseData", "()Ljava/util/List;", "setResponseData", "(Ljava/util/List;)V", "getStatusCode", "()I", "setStatusCode", "(I)V", "getStatusValue", "setStatusValue", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "Reason", "app_prodDebug"})
public final class CancelReasonResponse {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String message;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String statusValue;
    private int statusCode;
    @com.google.gson.annotations.SerializedName(value = "reasonList")
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.intellihealth.truemeds.data.model.cancelorder.CancelReasonResponse.Reason> responseData;
    
    public CancelReasonResponse(@org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.String statusValue, int statusCode, @org.jetbrains.annotations.Nullable()
    java.util.List<com.intellihealth.truemeds.data.model.cancelorder.CancelReasonResponse.Reason> responseData) {
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.intellihealth.truemeds.data.model.cancelorder.CancelReasonResponse.Reason> getResponseData() {
        return null;
    }
    
    public final void setResponseData(@org.jetbrains.annotations.Nullable()
    java.util.List<com.intellihealth.truemeds.data.model.cancelorder.CancelReasonResponse.Reason> p0) {
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
    public final java.util.List<com.intellihealth.truemeds.data.model.cancelorder.CancelReasonResponse.Reason> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.cancelorder.CancelReasonResponse copy(@org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.String statusValue, int statusCode, @org.jetbrains.annotations.Nullable()
    java.util.List<com.intellihealth.truemeds.data.model.cancelorder.CancelReasonResponse.Reason> responseData) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b.\b\u0086\b\u0018\u00002\u00020\u0001B{\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0011J\u0010\u0010\'\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0013J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0013J\u000b\u0010+\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0013\u0010,\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bH\u00c6\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\u0010\u0010.\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\u0010\u0010/\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0013J\u000b\u00100\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u0098\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0012\b\u0002\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0002\u00103J\u0013\u00104\u001a\u00020\u00032\b\u00105\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00106\u001a\u00020\nH\u00d6\u0001J\t\u00107\u001a\u00020\u0006H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0004\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001f\u0010\u001dR\u001e\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\"R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019\u00a8\u00068"}, d2 = {"Lcom/intellihealth/truemeds/data/model/cancelorder/CancelReasonResponse$Reason;", "", "active", "", "isValid", "name", "", "orderDetailsStatistics", "", "parentReasonId", "", "reasonId", "shuffle", "smsTemplateId", "teamId", "isChecked", "value", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/String;)V", "getActive", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "()Z", "setChecked", "(Z)V", "getName", "()Ljava/lang/String;", "getOrderDetailsStatistics", "()Ljava/util/List;", "getParentReasonId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getReasonId", "getShuffle", "setShuffle", "(Ljava/lang/Boolean;)V", "getSmsTemplateId", "()Ljava/lang/Object;", "getTeamId", "getValue", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/String;)Lcom/intellihealth/truemeds/data/model/cancelorder/CancelReasonResponse$Reason;", "equals", "other", "hashCode", "toString", "app_prodDebug"})
    public static final class Reason {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean active = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isValid = null;
        
        /**
         * This is indicates level of reason i.e L1 reason
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String name = null;
        @org.jetbrains.annotations.Nullable()
        private final java.util.List<java.lang.Object> orderDetailsStatistics = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer parentReasonId = null;
        
        /**
         * This is used for provides sub reason list against this reason id
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer reasonId = null;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Boolean shuffle;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Object smsTemplateId = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Object teamId = null;
        private boolean isChecked;
        
        /**
         * This is used for showing cancellation reason
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String value = null;
        
        public Reason(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean active, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isValid, @org.jetbrains.annotations.Nullable()
        java.lang.String name, @org.jetbrains.annotations.Nullable()
        java.util.List<? extends java.lang.Object> orderDetailsStatistics, @org.jetbrains.annotations.Nullable()
        java.lang.Integer parentReasonId, @org.jetbrains.annotations.Nullable()
        java.lang.Integer reasonId, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean shuffle, @org.jetbrains.annotations.Nullable()
        java.lang.Object smsTemplateId, @org.jetbrains.annotations.Nullable()
        java.lang.Object teamId, boolean isChecked, @org.jetbrains.annotations.Nullable()
        java.lang.String value) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean getActive() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isValid() {
            return null;
        }
        
        /**
         * This is indicates level of reason i.e L1 reason
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getName() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<java.lang.Object> getOrderDetailsStatistics() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getParentReasonId() {
            return null;
        }
        
        /**
         * This is used for provides sub reason list against this reason id
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getReasonId() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean getShuffle() {
            return null;
        }
        
        public final void setShuffle(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getSmsTemplateId() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getTeamId() {
            return null;
        }
        
        public final boolean isChecked() {
            return false;
        }
        
        public final void setChecked(boolean p0) {
        }
        
        /**
         * This is used for showing cancellation reason
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getValue() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component1() {
            return null;
        }
        
        public final boolean component10() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component11() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<java.lang.Object> component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object component8() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object component9() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.intellihealth.truemeds.data.model.cancelorder.CancelReasonResponse.Reason copy(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean active, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isValid, @org.jetbrains.annotations.Nullable()
        java.lang.String name, @org.jetbrains.annotations.Nullable()
        java.util.List<? extends java.lang.Object> orderDetailsStatistics, @org.jetbrains.annotations.Nullable()
        java.lang.Integer parentReasonId, @org.jetbrains.annotations.Nullable()
        java.lang.Integer reasonId, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean shuffle, @org.jetbrains.annotations.Nullable()
        java.lang.Object smsTemplateId, @org.jetbrains.annotations.Nullable()
        java.lang.Object teamId, boolean isChecked, @org.jetbrains.annotations.Nullable()
        java.lang.String value) {
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