package com.intellihealth.truemeds.data.model.psp;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0002#$B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0006H\u00c6\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00c6\u0003J;\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00c6\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\"\u001a\u00020\u0003H\u00d6\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000e\u00a8\u0006%"}, d2 = {"Lcom/intellihealth/truemeds/data/model/psp/PaymentMethodResponse;", "", "message", "", "statusValue", "statusCode", "", "responseData", "", "Lcom/intellihealth/truemeds/data/model/psp/PaymentMethodResponse$ResponseData;", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getResponseData", "()Ljava/util/List;", "setResponseData", "(Ljava/util/List;)V", "getStatusCode", "()I", "setStatusCode", "(I)V", "getStatusValue", "setStatusValue", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "PaymentOption", "ResponseData", "app_prodDebug"})
public final class PaymentMethodResponse {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String message;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String statusValue;
    private int statusCode;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData> responseData;
    
    public PaymentMethodResponse(@org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.String statusValue, int statusCode, @org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData> responseData) {
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
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData> getResponseData() {
        return null;
    }
    
    public final void setResponseData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData> p0) {
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
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse copy(@org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.String statusValue, int statusCode, @org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData> responseData) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b)\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0002\u0010\u0011J\u0010\u0010)\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0013J\u000b\u0010*\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016J\t\u0010,\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010#J\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\u0082\u0001\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00c6\u0001\u00a2\u0006\u0002\u00104J\u0013\u00105\u001a\u00020\u00032\b\u00106\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00107\u001a\u00020\u0007H\u00d6\u0001J\t\u00108\u001a\u00020\tH\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u001f\"\u0004\b \u0010!R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(\u00a8\u00069"}, d2 = {"Lcom/intellihealth/truemeds/data/model/psp/PaymentMethodResponse$PaymentOption;", "", "active", "", "createdOn", "", "iconId", "", "iconName", "", "iconPath", "iconSubType", "iconType", "paymentMethodId", "isPaymentMethodSelected", "paymentOptionRadioModel", "Lcom/intellihealth/salt/models/PaymentOptionRadioModel;", "(Ljava/lang/Boolean;Ljava/lang/Long;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZLcom/intellihealth/salt/models/PaymentOptionRadioModel;)V", "getActive", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCreatedOn", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getIconId", "()I", "getIconName", "()Ljava/lang/String;", "getIconPath", "getIconSubType", "getIconType", "()Z", "setPaymentMethodSelected", "(Z)V", "getPaymentMethodId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPaymentOptionRadioModel", "()Lcom/intellihealth/salt/models/PaymentOptionRadioModel;", "setPaymentOptionRadioModel", "(Lcom/intellihealth/salt/models/PaymentOptionRadioModel;)V", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Boolean;Ljava/lang/Long;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZLcom/intellihealth/salt/models/PaymentOptionRadioModel;)Lcom/intellihealth/truemeds/data/model/psp/PaymentMethodResponse$PaymentOption;", "equals", "other", "hashCode", "toString", "app_prodDebug"})
    public static final class PaymentOption {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean active = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Long createdOn = null;
        private final int iconId = 0;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String iconName = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String iconPath = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String iconSubType = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String iconType = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer paymentMethodId = null;
        private boolean isPaymentMethodSelected;
        @org.jetbrains.annotations.Nullable()
        private com.intellihealth.salt.models.PaymentOptionRadioModel paymentOptionRadioModel;
        
        public PaymentOption(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean active, @org.jetbrains.annotations.Nullable()
        java.lang.Long createdOn, int iconId, @org.jetbrains.annotations.Nullable()
        java.lang.String iconName, @org.jetbrains.annotations.Nullable()
        java.lang.String iconPath, @org.jetbrains.annotations.Nullable()
        java.lang.String iconSubType, @org.jetbrains.annotations.Nullable()
        java.lang.String iconType, @org.jetbrains.annotations.Nullable()
        java.lang.Integer paymentMethodId, boolean isPaymentMethodSelected, @org.jetbrains.annotations.Nullable()
        com.intellihealth.salt.models.PaymentOptionRadioModel paymentOptionRadioModel) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean getActive() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long getCreatedOn() {
            return null;
        }
        
        public final int getIconId() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getIconName() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getIconPath() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getIconSubType() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getIconType() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getPaymentMethodId() {
            return null;
        }
        
        public final boolean isPaymentMethodSelected() {
            return false;
        }
        
        public final void setPaymentMethodSelected(boolean p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.intellihealth.salt.models.PaymentOptionRadioModel getPaymentOptionRadioModel() {
            return null;
        }
        
        public final void setPaymentOptionRadioModel(@org.jetbrains.annotations.Nullable()
        com.intellihealth.salt.models.PaymentOptionRadioModel p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.intellihealth.salt.models.PaymentOptionRadioModel component10() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long component2() {
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
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component8() {
            return null;
        }
        
        public final boolean component9() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.PaymentOption copy(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean active, @org.jetbrains.annotations.Nullable()
        java.lang.Long createdOn, int iconId, @org.jetbrains.annotations.Nullable()
        java.lang.String iconName, @org.jetbrains.annotations.Nullable()
        java.lang.String iconPath, @org.jetbrains.annotations.Nullable()
        java.lang.String iconSubType, @org.jetbrains.annotations.Nullable()
        java.lang.String iconType, @org.jetbrains.annotations.Nullable()
        java.lang.Integer paymentMethodId, boolean isPaymentMethodSelected, @org.jetbrains.annotations.Nullable()
        com.intellihealth.salt.models.PaymentOptionRadioModel paymentOptionRadioModel) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u0013\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\bH\u00c6\u0003JF\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0012\b\u0002\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\bH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006 "}, d2 = {"Lcom/intellihealth/truemeds/data/model/psp/PaymentMethodResponse$ResponseData;", "", "paymentCategory", "", "paymentModeUrl", "paymentModeUrlId", "", "paymentOptions", "", "Lcom/intellihealth/truemeds/data/model/psp/PaymentMethodResponse$PaymentOption;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)V", "getPaymentCategory", "()Ljava/lang/String;", "getPaymentModeUrl", "getPaymentModeUrlId", "()Ljava/lang/Integer;", "setPaymentModeUrlId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getPaymentOptions", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)Lcom/intellihealth/truemeds/data/model/psp/PaymentMethodResponse$ResponseData;", "equals", "", "other", "hashCode", "toString", "app_prodDebug"})
    public static final class ResponseData {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String paymentCategory = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String paymentModeUrl = null;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Integer paymentModeUrlId;
        @org.jetbrains.annotations.Nullable()
        private final java.util.List<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.PaymentOption> paymentOptions = null;
        
        public ResponseData(@org.jetbrains.annotations.Nullable()
        java.lang.String paymentCategory, @org.jetbrains.annotations.Nullable()
        java.lang.String paymentModeUrl, @org.jetbrains.annotations.Nullable()
        java.lang.Integer paymentModeUrlId, @org.jetbrains.annotations.Nullable()
        java.util.List<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.PaymentOption> paymentOptions) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPaymentCategory() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPaymentModeUrl() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getPaymentModeUrlId() {
            return null;
        }
        
        public final void setPaymentModeUrlId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.PaymentOption> getPaymentOptions() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.PaymentOption> component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData copy(@org.jetbrains.annotations.Nullable()
        java.lang.String paymentCategory, @org.jetbrains.annotations.Nullable()
        java.lang.String paymentModeUrl, @org.jetbrains.annotations.Nullable()
        java.lang.Integer paymentModeUrlId, @org.jetbrains.annotations.Nullable()
        java.util.List<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.PaymentOption> paymentOptions) {
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