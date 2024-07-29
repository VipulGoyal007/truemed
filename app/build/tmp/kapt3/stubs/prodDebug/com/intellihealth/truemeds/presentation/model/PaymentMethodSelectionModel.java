package com.intellihealth.truemeds.presentation.model;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u00c6\u0003JD\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010#\u001a\u00020$H\u00d6\u0001J\t\u0010%\u001a\u00020\u0003H\u00d6\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u000eR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u00a8\u0006&"}, d2 = {"Lcom/intellihealth/truemeds/presentation/model/PaymentMethodSelectionModel;", "", "paymentMethod", "", "paymentMethodId", "", "paymentMethodUrl", "paymentOptionsList", "", "Lcom/intellihealth/truemeds/data/model/psp/PaymentMethodResponse$ResponseData;", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;)V", "getPaymentMethod", "()Ljava/lang/String;", "setPaymentMethod", "(Ljava/lang/String;)V", "getPaymentMethodId", "()Ljava/lang/Long;", "setPaymentMethodId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getPaymentMethodUrl", "setPaymentMethodUrl", "getPaymentOptionsList", "()Ljava/util/List;", "setPaymentOptionsList", "(Ljava/util/List;)V", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;)Lcom/intellihealth/truemeds/presentation/model/PaymentMethodSelectionModel;", "equals", "", "other", "hashCode", "", "toString", "app_prodDebug"})
public final class PaymentMethodSelectionModel {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String paymentMethod;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long paymentMethodId;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String paymentMethodUrl;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData> paymentOptionsList;
    
    public PaymentMethodSelectionModel(@org.jetbrains.annotations.Nullable()
    java.lang.String paymentMethod, @org.jetbrains.annotations.Nullable()
    java.lang.Long paymentMethodId, @org.jetbrains.annotations.Nullable()
    java.lang.String paymentMethodUrl, @org.jetbrains.annotations.Nullable()
    java.util.List<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData> paymentOptionsList) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPaymentMethod() {
        return null;
    }
    
    public final void setPaymentMethod(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getPaymentMethodId() {
        return null;
    }
    
    public final void setPaymentMethodId(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPaymentMethodUrl() {
        return null;
    }
    
    public final void setPaymentMethodUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData> getPaymentOptionsList() {
        return null;
    }
    
    public final void setPaymentOptionsList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData> p0) {
    }
    
    public PaymentMethodSelectionModel() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.model.PaymentMethodSelectionModel copy(@org.jetbrains.annotations.Nullable()
    java.lang.String paymentMethod, @org.jetbrains.annotations.Nullable()
    java.lang.Long paymentMethodId, @org.jetbrains.annotations.Nullable()
    java.lang.String paymentMethodUrl, @org.jetbrains.annotations.Nullable()
    java.util.List<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData> paymentOptionsList) {
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