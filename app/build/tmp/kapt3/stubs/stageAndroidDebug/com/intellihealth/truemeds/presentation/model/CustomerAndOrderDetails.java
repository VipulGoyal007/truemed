package com.intellihealth.truemeds.presentation.model;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002HIB\u0085\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\u0010\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\u0013J\u0010\u00105\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u0010\u00106\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010 J\u0013\u00107\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u0010H\u00c6\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010 J\u0010\u00109\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u000b\u0010:\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010 J\u0010\u0010<\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u0010\u0010=\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010 J\u0010\u0010>\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010 J\u0010\u0010?\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010 J\u0010\u0010@\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010 J\u00a6\u0001\u0010A\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0012\b\u0002\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\bH\u00c6\u0001\u00a2\u0006\u0002\u0010BJ\u0013\u0010C\u001a\u00020\u00032\b\u0010D\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010E\u001a\u00020\bH\u00d6\u0001J\t\u0010F\u001a\u00020GH\u00d6\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010#\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\t\u0010\u0015\"\u0004\b$\u0010\u0017R\u001e\u0010\n\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010#\u001a\u0004\b%\u0010 \"\u0004\b&\u0010\"R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010#\u001a\u0004\b\'\u0010 \"\u0004\b(\u0010\"R\u001e\u0010\f\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010#\u001a\u0004\b)\u0010 \"\u0004\b*\u0010\"R\u001e\u0010\r\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010#\u001a\u0004\b+\u0010 \"\u0004\b,\u0010\"R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010#\u001a\u0004\b-\u0010 \"\u0004\b.\u0010\"R$\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010#\u001a\u0004\b3\u0010 \"\u0004\b4\u0010\"\u00a8\u0006J"}, d2 = {"Lcom/intellihealth/truemeds/presentation/model/CustomerAndOrderDetails;", "", "acceptedPP", "", "acceptedTnC", "customerDetails", "Lcom/intellihealth/truemeds/presentation/model/CustomerAndOrderDetails$CustomerDetails;", "incompleteOrderId", "", "isFtc", "orderIdForRating", "prescriptionCount", "prevDeliveredAddressId", "prevDeliveredPatientId", "productCount", "referralData", "", "Lcom/intellihealth/truemeds/presentation/model/CustomerAndOrderDetails$ReferralData;", "tmWallet", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/intellihealth/truemeds/presentation/model/CustomerAndOrderDetails$CustomerDetails;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;)V", "getAcceptedPP", "()Ljava/lang/Boolean;", "setAcceptedPP", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getAcceptedTnC", "setAcceptedTnC", "getCustomerDetails", "()Lcom/intellihealth/truemeds/presentation/model/CustomerAndOrderDetails$CustomerDetails;", "setCustomerDetails", "(Lcom/intellihealth/truemeds/presentation/model/CustomerAndOrderDetails$CustomerDetails;)V", "getIncompleteOrderId", "()Ljava/lang/Integer;", "setIncompleteOrderId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "setFtc", "getOrderIdForRating", "setOrderIdForRating", "getPrescriptionCount", "setPrescriptionCount", "getPrevDeliveredAddressId", "setPrevDeliveredAddressId", "getPrevDeliveredPatientId", "setPrevDeliveredPatientId", "getProductCount", "setProductCount", "getReferralData", "()Ljava/util/List;", "setReferralData", "(Ljava/util/List;)V", "getTmWallet", "setTmWallet", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/intellihealth/truemeds/presentation/model/CustomerAndOrderDetails$CustomerDetails;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;)Lcom/intellihealth/truemeds/presentation/model/CustomerAndOrderDetails;", "equals", "other", "hashCode", "toString", "", "CustomerDetails", "ReferralData", "app_stageAndroidDebug"})
public final class CustomerAndOrderDetails {
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean acceptedPP;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean acceptedTnC;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.model.CustomerAndOrderDetails.CustomerDetails customerDetails;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer incompleteOrderId;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean isFtc;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer orderIdForRating;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer prescriptionCount;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer prevDeliveredAddressId;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer prevDeliveredPatientId;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer productCount;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.intellihealth.truemeds.presentation.model.CustomerAndOrderDetails.ReferralData> referralData;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer tmWallet;
    
    public CustomerAndOrderDetails(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean acceptedPP, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean acceptedTnC, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.presentation.model.CustomerAndOrderDetails.CustomerDetails customerDetails, @org.jetbrains.annotations.Nullable()
    java.lang.Integer incompleteOrderId, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isFtc, @org.jetbrains.annotations.Nullable()
    java.lang.Integer orderIdForRating, @org.jetbrains.annotations.Nullable()
    java.lang.Integer prescriptionCount, @org.jetbrains.annotations.Nullable()
    java.lang.Integer prevDeliveredAddressId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer prevDeliveredPatientId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer productCount, @org.jetbrains.annotations.Nullable()
    java.util.List<com.intellihealth.truemeds.presentation.model.CustomerAndOrderDetails.ReferralData> referralData, @org.jetbrains.annotations.Nullable()
    java.lang.Integer tmWallet) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getAcceptedPP() {
        return null;
    }
    
    public final void setAcceptedPP(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getAcceptedTnC() {
        return null;
    }
    
    public final void setAcceptedTnC(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.presentation.model.CustomerAndOrderDetails.CustomerDetails getCustomerDetails() {
        return null;
    }
    
    public final void setCustomerDetails(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.presentation.model.CustomerAndOrderDetails.CustomerDetails p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getIncompleteOrderId() {
        return null;
    }
    
    public final void setIncompleteOrderId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isFtc() {
        return null;
    }
    
    public final void setFtc(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getOrderIdForRating() {
        return null;
    }
    
    public final void setOrderIdForRating(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPrescriptionCount() {
        return null;
    }
    
    public final void setPrescriptionCount(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPrevDeliveredAddressId() {
        return null;
    }
    
    public final void setPrevDeliveredAddressId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPrevDeliveredPatientId() {
        return null;
    }
    
    public final void setPrevDeliveredPatientId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getProductCount() {
        return null;
    }
    
    public final void setProductCount(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.intellihealth.truemeds.presentation.model.CustomerAndOrderDetails.ReferralData> getReferralData() {
        return null;
    }
    
    public final void setReferralData(@org.jetbrains.annotations.Nullable()
    java.util.List<com.intellihealth.truemeds.presentation.model.CustomerAndOrderDetails.ReferralData> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTmWallet() {
        return null;
    }
    
    public final void setTmWallet(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.intellihealth.truemeds.presentation.model.CustomerAndOrderDetails.ReferralData> component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.presentation.model.CustomerAndOrderDetails.CustomerDetails component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.model.CustomerAndOrderDetails copy(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean acceptedPP, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean acceptedTnC, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.presentation.model.CustomerAndOrderDetails.CustomerDetails customerDetails, @org.jetbrains.annotations.Nullable()
    java.lang.Integer incompleteOrderId, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isFtc, @org.jetbrains.annotations.Nullable()
    java.lang.Integer orderIdForRating, @org.jetbrains.annotations.Nullable()
    java.lang.Integer prescriptionCount, @org.jetbrains.annotations.Nullable()
    java.lang.Integer prevDeliveredAddressId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer prevDeliveredPatientId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer productCount, @org.jetbrains.annotations.Nullable()
    java.util.List<com.intellihealth.truemeds.presentation.model.CustomerAndOrderDetails.ReferralData> referralData, @org.jetbrains.annotations.Nullable()
    java.lang.Integer tmWallet) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u00011BS\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\rJ\u0010\u0010#\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u0013\u0010$\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u000b\u0010)\u001a\u0004\u0018\u00010\bH\u00c6\u0003Jj\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\bH\u00c6\u0001\u00a2\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010/\u001a\u00020\u0003H\u00d6\u0001J\t\u00100\u001a\u00020\bH\u00d6\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u0011R\u001c\u0010\f\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001a\u00a8\u00062"}, d2 = {"Lcom/intellihealth/truemeds/presentation/model/CustomerAndOrderDetails$CustomerDetails;", "", "age", "", "categoryList", "", "Lcom/intellihealth/truemeds/presentation/model/CustomerAndOrderDetails$CustomerDetails$Category;", "customerName", "", "firstName", "gender", "genderId", "lastName", "(Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getAge", "()Ljava/lang/Integer;", "setAge", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getCategoryList", "()Ljava/util/List;", "setCategoryList", "(Ljava/util/List;)V", "getCustomerName", "()Ljava/lang/String;", "setCustomerName", "(Ljava/lang/String;)V", "getFirstName", "setFirstName", "getGender", "setGender", "getGenderId", "setGenderId", "getLastName", "setLastName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/intellihealth/truemeds/presentation/model/CustomerAndOrderDetails$CustomerDetails;", "equals", "", "other", "hashCode", "toString", "Category", "app_stageAndroidDebug"})
    public static final class CustomerDetails {
        @org.jetbrains.annotations.Nullable()
        private java.lang.Integer age;
        @org.jetbrains.annotations.Nullable()
        private java.util.List<com.intellihealth.truemeds.presentation.model.CustomerAndOrderDetails.CustomerDetails.Category> categoryList;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String customerName;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String firstName;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String gender;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Integer genderId;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String lastName;
        
        public CustomerDetails(@org.jetbrains.annotations.Nullable()
        java.lang.Integer age, @org.jetbrains.annotations.Nullable()
        java.util.List<com.intellihealth.truemeds.presentation.model.CustomerAndOrderDetails.CustomerDetails.Category> categoryList, @org.jetbrains.annotations.Nullable()
        java.lang.String customerName, @org.jetbrains.annotations.Nullable()
        java.lang.String firstName, @org.jetbrains.annotations.Nullable()
        java.lang.String gender, @org.jetbrains.annotations.Nullable()
        java.lang.Integer genderId, @org.jetbrains.annotations.Nullable()
        java.lang.String lastName) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getAge() {
            return null;
        }
        
        public final void setAge(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.intellihealth.truemeds.presentation.model.CustomerAndOrderDetails.CustomerDetails.Category> getCategoryList() {
            return null;
        }
        
        public final void setCategoryList(@org.jetbrains.annotations.Nullable()
        java.util.List<com.intellihealth.truemeds.presentation.model.CustomerAndOrderDetails.CustomerDetails.Category> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCustomerName() {
            return null;
        }
        
        public final void setCustomerName(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getFirstName() {
            return null;
        }
        
        public final void setFirstName(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getGender() {
            return null;
        }
        
        public final void setGender(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getGenderId() {
            return null;
        }
        
        public final void setGenderId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getLastName() {
            return null;
        }
        
        public final void setLastName(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.intellihealth.truemeds.presentation.model.CustomerAndOrderDetails.CustomerDetails.Category> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
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
        public final java.lang.Integer component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component7() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.intellihealth.truemeds.presentation.model.CustomerAndOrderDetails.CustomerDetails copy(@org.jetbrains.annotations.Nullable()
        java.lang.Integer age, @org.jetbrains.annotations.Nullable()
        java.util.List<com.intellihealth.truemeds.presentation.model.CustomerAndOrderDetails.CustomerDetails.Category> categoryList, @org.jetbrains.annotations.Nullable()
        java.lang.String customerName, @org.jetbrains.annotations.Nullable()
        java.lang.String firstName, @org.jetbrains.annotations.Nullable()
        java.lang.String gender, @org.jetbrains.annotations.Nullable()
        java.lang.Integer genderId, @org.jetbrains.annotations.Nullable()
        java.lang.String lastName) {
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
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001%B5\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\u0013\u0010\u001a\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016JF\u0010\u001e\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010#\u001a\u00020\tH\u00d6\u0001J\t\u0010$\u001a\u00020\u0006H\u00d6\u0001R$\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006&"}, d2 = {"Lcom/intellihealth/truemeds/presentation/model/CustomerAndOrderDetails$CustomerDetails$Category;", "", "additionalProps", "", "Lcom/intellihealth/truemeds/presentation/model/CustomerAndOrderDetails$CustomerDetails$Category$AdditionalProp;", "category", "", "categoryType", "id", "", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getAdditionalProps", "()Ljava/util/List;", "setAdditionalProps", "(Ljava/util/List;)V", "getCategory", "()Ljava/lang/String;", "setCategory", "(Ljava/lang/String;)V", "getCategoryType", "setCategoryType", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/intellihealth/truemeds/presentation/model/CustomerAndOrderDetails$CustomerDetails$Category;", "equals", "", "other", "hashCode", "toString", "AdditionalProp", "app_stageAndroidDebug"})
        public static final class Category {
            @org.jetbrains.annotations.Nullable()
            private java.util.List<com.intellihealth.truemeds.presentation.model.CustomerAndOrderDetails.CustomerDetails.Category.AdditionalProp> additionalProps;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String category;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String categoryType;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Integer id;
            
            public Category(@org.jetbrains.annotations.Nullable()
            java.util.List<com.intellihealth.truemeds.presentation.model.CustomerAndOrderDetails.CustomerDetails.Category.AdditionalProp> additionalProps, @org.jetbrains.annotations.Nullable()
            java.lang.String category, @org.jetbrains.annotations.Nullable()
            java.lang.String categoryType, @org.jetbrains.annotations.Nullable()
            java.lang.Integer id) {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.util.List<com.intellihealth.truemeds.presentation.model.CustomerAndOrderDetails.CustomerDetails.Category.AdditionalProp> getAdditionalProps() {
                return null;
            }
            
            public final void setAdditionalProps(@org.jetbrains.annotations.Nullable()
            java.util.List<com.intellihealth.truemeds.presentation.model.CustomerAndOrderDetails.CustomerDetails.Category.AdditionalProp> p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getCategory() {
                return null;
            }
            
            public final void setCategory(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getCategoryType() {
                return null;
            }
            
            public final void setCategoryType(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getId() {
                return null;
            }
            
            public final void setId(@org.jetbrains.annotations.Nullable()
            java.lang.Integer p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.util.List<com.intellihealth.truemeds.presentation.model.CustomerAndOrderDetails.CustomerDetails.Category.AdditionalProp> component1() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component3() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer component4() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.intellihealth.truemeds.presentation.model.CustomerAndOrderDetails.CustomerDetails.Category copy(@org.jetbrains.annotations.Nullable()
            java.util.List<com.intellihealth.truemeds.presentation.model.CustomerAndOrderDetails.CustomerDetails.Category.AdditionalProp> additionalProps, @org.jetbrains.annotations.Nullable()
            java.lang.String category, @org.jetbrains.annotations.Nullable()
            java.lang.String categoryType, @org.jetbrains.annotations.Nullable()
            java.lang.Integer id) {
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
            
            @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001aB\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\bJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J&\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001b"}, d2 = {"Lcom/intellihealth/truemeds/presentation/model/CustomerAndOrderDetails$CustomerDetails$Category$AdditionalProp;", "", "id", "", "value", "Lcom/intellihealth/truemeds/presentation/model/CustomerAndOrderDetails$CustomerDetails$Category$AdditionalProp$Value;", "(Ljava/lang/Integer;Lcom/intellihealth/truemeds/presentation/model/CustomerAndOrderDetails$CustomerDetails$Category$AdditionalProp$Value;)V", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getValue", "()Lcom/intellihealth/truemeds/presentation/model/CustomerAndOrderDetails$CustomerDetails$Category$AdditionalProp$Value;", "setValue", "(Lcom/intellihealth/truemeds/presentation/model/CustomerAndOrderDetails$CustomerDetails$Category$AdditionalProp$Value;)V", "component1", "component2", "copy", "(Ljava/lang/Integer;Lcom/intellihealth/truemeds/presentation/model/CustomerAndOrderDetails$CustomerDetails$Category$AdditionalProp$Value;)Lcom/intellihealth/truemeds/presentation/model/CustomerAndOrderDetails$CustomerDetails$Category$AdditionalProp;", "equals", "", "other", "hashCode", "toString", "", "Value", "app_stageAndroidDebug"})
            public static final class AdditionalProp {
                @org.jetbrains.annotations.Nullable()
                private java.lang.Integer id;
                @org.jetbrains.annotations.Nullable()
                private com.intellihealth.truemeds.presentation.model.CustomerAndOrderDetails.CustomerDetails.Category.AdditionalProp.Value value;
                
                public AdditionalProp(@org.jetbrains.annotations.Nullable()
                java.lang.Integer id, @org.jetbrains.annotations.Nullable()
                com.intellihealth.truemeds.presentation.model.CustomerAndOrderDetails.CustomerDetails.Category.AdditionalProp.Value value) {
                    super();
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Integer getId() {
                    return null;
                }
                
                public final void setId(@org.jetbrains.annotations.Nullable()
                java.lang.Integer p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final com.intellihealth.truemeds.presentation.model.CustomerAndOrderDetails.CustomerDetails.Category.AdditionalProp.Value getValue() {
                    return null;
                }
                
                public final void setValue(@org.jetbrains.annotations.Nullable()
                com.intellihealth.truemeds.presentation.model.CustomerAndOrderDetails.CustomerDetails.Category.AdditionalProp.Value p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Integer component1() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final com.intellihealth.truemeds.presentation.model.CustomerAndOrderDetails.CustomerDetails.Category.AdditionalProp.Value component2() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final com.intellihealth.truemeds.presentation.model.CustomerAndOrderDetails.CustomerDetails.Category.AdditionalProp copy(@org.jetbrains.annotations.Nullable()
                java.lang.Integer id, @org.jetbrains.annotations.Nullable()
                com.intellihealth.truemeds.presentation.model.CustomerAndOrderDetails.CustomerDetails.Category.AdditionalProp.Value value) {
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
                
                @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\b\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\u0012"}, d2 = {"Lcom/intellihealth/truemeds/presentation/model/CustomerAndOrderDetails$CustomerDetails$Category$AdditionalProp$Value;", "", "baseDiscount", "", "(Ljava/lang/Integer;)V", "getBaseDiscount", "()Ljava/lang/Integer;", "setBaseDiscount", "Ljava/lang/Integer;", "component1", "copy", "(Ljava/lang/Integer;)Lcom/intellihealth/truemeds/presentation/model/CustomerAndOrderDetails$CustomerDetails$Category$AdditionalProp$Value;", "equals", "", "other", "hashCode", "toString", "", "app_stageAndroidDebug"})
                public static final class Value {
                    @org.jetbrains.annotations.Nullable()
                    private java.lang.Integer baseDiscount;
                    
                    public Value(@org.jetbrains.annotations.Nullable()
                    java.lang.Integer baseDiscount) {
                        super();
                    }
                    
                    @org.jetbrains.annotations.Nullable()
                    public final java.lang.Integer getBaseDiscount() {
                        return null;
                    }
                    
                    public final void setBaseDiscount(@org.jetbrains.annotations.Nullable()
                    java.lang.Integer p0) {
                    }
                    
                    @org.jetbrains.annotations.Nullable()
                    public final java.lang.Integer component1() {
                        return null;
                    }
                    
                    @org.jetbrains.annotations.NotNull()
                    public final com.intellihealth.truemeds.presentation.model.CustomerAndOrderDetails.CustomerDetails.Category.AdditionalProp.Value copy(@org.jetbrains.annotations.Nullable()
                    java.lang.Integer baseDiscount) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\bJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J&\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0005H\u00d6\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0019"}, d2 = {"Lcom/intellihealth/truemeds/presentation/model/CustomerAndOrderDetails$ReferralData;", "", "referralAmount", "", "registeredCustomerName", "", "(Ljava/lang/Integer;Ljava/lang/String;)V", "getReferralAmount", "()Ljava/lang/Integer;", "setReferralAmount", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getRegisteredCustomerName", "()Ljava/lang/String;", "setRegisteredCustomerName", "(Ljava/lang/String;)V", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/intellihealth/truemeds/presentation/model/CustomerAndOrderDetails$ReferralData;", "equals", "", "other", "hashCode", "toString", "app_stageAndroidDebug"})
    public static final class ReferralData {
        @org.jetbrains.annotations.Nullable()
        private java.lang.Integer referralAmount;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String registeredCustomerName;
        
        public ReferralData(@org.jetbrains.annotations.Nullable()
        java.lang.Integer referralAmount, @org.jetbrains.annotations.Nullable()
        java.lang.String registeredCustomerName) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getReferralAmount() {
            return null;
        }
        
        public final void setReferralAmount(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getRegisteredCustomerName() {
            return null;
        }
        
        public final void setRegisteredCustomerName(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.intellihealth.truemeds.presentation.model.CustomerAndOrderDetails.ReferralData copy(@org.jetbrains.annotations.Nullable()
        java.lang.Integer referralAmount, @org.jetbrains.annotations.Nullable()
        java.lang.String registeredCustomerName) {
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