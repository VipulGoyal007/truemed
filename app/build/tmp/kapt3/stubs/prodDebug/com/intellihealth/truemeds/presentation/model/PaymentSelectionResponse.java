package com.intellihealth.truemeds.presentation.model;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\u0019\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nH\u00c6\u0003JA\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nH\u00c6\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\"\u001a\u00020#H\u00d6\u0001J\t\u0010$\u001a\u00020\u0003H\u00d6\u0001R*\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013\u00a8\u0006%"}, d2 = {"Lcom/intellihealth/truemeds/presentation/model/PaymentSelectionResponse;", "", "selectedPaymentMethod", "", "selectedPaymentMethodId", "", "selectedPaymentMethodUrl", "paymentOptionsList", "Ljava/util/ArrayList;", "Lcom/intellihealth/truemeds/data/model/psp/PaymentMethodResponse$ResponseData;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;JLjava/lang/String;Ljava/util/ArrayList;)V", "getPaymentOptionsList", "()Ljava/util/ArrayList;", "setPaymentOptionsList", "(Ljava/util/ArrayList;)V", "getSelectedPaymentMethod", "()Ljava/lang/String;", "setSelectedPaymentMethod", "(Ljava/lang/String;)V", "getSelectedPaymentMethodId", "()J", "setSelectedPaymentMethodId", "(J)V", "getSelectedPaymentMethodUrl", "setSelectedPaymentMethodUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodDebug"})
public final class PaymentSelectionResponse {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String selectedPaymentMethod;
    private long selectedPaymentMethodId;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String selectedPaymentMethodUrl;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData> paymentOptionsList;
    
    public PaymentSelectionResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String selectedPaymentMethod, long selectedPaymentMethodId, @org.jetbrains.annotations.NotNull()
    java.lang.String selectedPaymentMethodUrl, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData> paymentOptionsList) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSelectedPaymentMethod() {
        return null;
    }
    
    public final void setSelectedPaymentMethod(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final long getSelectedPaymentMethodId() {
        return 0L;
    }
    
    public final void setSelectedPaymentMethodId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSelectedPaymentMethodUrl() {
        return null;
    }
    
    public final void setSelectedPaymentMethodUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData> getPaymentOptionsList() {
        return null;
    }
    
    public final void setPaymentOptionsList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    public final long component2() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.model.PaymentSelectionResponse copy(@org.jetbrains.annotations.NotNull()
    java.lang.String selectedPaymentMethod, long selectedPaymentMethodId, @org.jetbrains.annotations.NotNull()
    java.lang.String selectedPaymentMethodUrl, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData> paymentOptionsList) {
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