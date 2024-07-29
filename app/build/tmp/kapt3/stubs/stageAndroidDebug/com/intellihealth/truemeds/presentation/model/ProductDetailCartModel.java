package com.intellihealth.truemeds.presentation.model;

/**
 * Use this class to fetch intent attributes
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b8\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010;\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016J\u0010\u0010<\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016J\u0010\u0010=\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016J\u0010\u0010>\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016J\u000b\u0010?\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\u0010\u0010A\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016J\u0010\u0010B\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016J\u000b\u0010C\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016J\u000b\u0010E\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0010\u0010F\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010!J\u0010\u0010G\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010!J\u0010\u0010H\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016J\u00b6\u0001\u0010I\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00c6\u0001\u00a2\u0006\u0002\u0010JJ\u0013\u0010K\u001a\u00020L2\b\u0010M\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010N\u001a\u00020\u000bH\u00d6\u0001J\u0006\u0010O\u001a\u00020PJ\t\u0010Q\u001a\u00020\u0007H\u00d6\u0001R\"\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u001e\u0010\u0016\"\u0004\b\u001f\u0010\u0018R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010$\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b%\u0010\u0016\"\u0004\b&\u0010\u0018R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\'\u0010\u0016\"\u0004\b(\u0010\u0018R\"\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010$\u001a\u0004\b)\u0010!\"\u0004\b*\u0010#R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b+\u0010\u0016\"\u0004\b,\u0010\u0018R \u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001b\"\u0004\b.\u0010\u001dR \u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b3\u0010\u0016\"\u0004\b4\u0010\u0018R \u0010\t\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u001b\"\u0004\b6\u0010\u001dR\"\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b7\u0010\u0016\"\u0004\b8\u0010\u0018R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b9\u0010\u0016\"\u0004\b:\u0010\u0018\u00a8\u0006R"}, d2 = {"Lcom/intellihealth/truemeds/presentation/model/ProductDetailCartModel;", "", "mrp", "", "discount", "couponDiscount", "couponCode", "", "savingAmount", "savingsText", "packagingCharge", "", "deliveryCharge", "addMoreForFreeDelivery", "tmCash", "tmCredit", "payableAmount", "paymentMode", "paymentSelectionInfo", "Lcom/example/example/PaymentSelectionInfo;", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Lcom/example/example/PaymentSelectionInfo;)V", "getAddMoreForFreeDelivery", "()Ljava/lang/Double;", "setAddMoreForFreeDelivery", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getCouponCode", "()Ljava/lang/String;", "setCouponCode", "(Ljava/lang/String;)V", "getCouponDiscount", "setCouponDiscount", "getDeliveryCharge", "()Ljava/lang/Integer;", "setDeliveryCharge", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getDiscount", "setDiscount", "getMrp", "setMrp", "getPackagingCharge", "setPackagingCharge", "getPayableAmount", "setPayableAmount", "getPaymentMode", "setPaymentMode", "getPaymentSelectionInfo", "()Lcom/example/example/PaymentSelectionInfo;", "setPaymentSelectionInfo", "(Lcom/example/example/PaymentSelectionInfo;)V", "getSavingAmount", "setSavingAmount", "getSavingsText", "setSavingsText", "getTmCash", "setTmCash", "getTmCredit", "setTmCredit", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Lcom/example/example/PaymentSelectionInfo;)Lcom/intellihealth/truemeds/presentation/model/ProductDetailCartModel;", "equals", "", "other", "hashCode", "toCartModel", "Lcom/intellihealth/salt/models/CartModel;", "toString", "app_stageAndroidDebug"})
public final class ProductDetailCartModel {
    @com.google.gson.annotations.SerializedName(value = "mrp")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double mrp;
    @com.google.gson.annotations.SerializedName(value = "discount")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double discount;
    @com.google.gson.annotations.SerializedName(value = "couponDiscount")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double couponDiscount;
    @com.google.gson.annotations.SerializedName(value = "couponCode")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String couponCode;
    @com.google.gson.annotations.SerializedName(value = "savingAmount")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double savingAmount;
    @com.google.gson.annotations.SerializedName(value = "savingsText")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String savingsText;
    @com.google.gson.annotations.SerializedName(value = "packagingCharge")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer packagingCharge;
    @com.google.gson.annotations.SerializedName(value = "deliveryCharge")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer deliveryCharge;
    @com.google.gson.annotations.SerializedName(value = "addMoreForFreeDelivery")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double addMoreForFreeDelivery;
    @com.google.gson.annotations.SerializedName(value = "tmCash")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double tmCash;
    @com.google.gson.annotations.SerializedName(value = "tmCredit")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double tmCredit;
    @com.google.gson.annotations.SerializedName(value = "payableAmount")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double payableAmount;
    @com.google.gson.annotations.SerializedName(value = "paymentMode")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String paymentMode;
    @com.google.gson.annotations.SerializedName(value = "paymentSelectionInfo")
    @org.jetbrains.annotations.Nullable()
    private com.example.example.PaymentSelectionInfo paymentSelectionInfo;
    
    public ProductDetailCartModel(@org.jetbrains.annotations.Nullable()
    java.lang.Double mrp, @org.jetbrains.annotations.Nullable()
    java.lang.Double discount, @org.jetbrains.annotations.Nullable()
    java.lang.Double couponDiscount, @org.jetbrains.annotations.Nullable()
    java.lang.String couponCode, @org.jetbrains.annotations.Nullable()
    java.lang.Double savingAmount, @org.jetbrains.annotations.Nullable()
    java.lang.String savingsText, @org.jetbrains.annotations.Nullable()
    java.lang.Integer packagingCharge, @org.jetbrains.annotations.Nullable()
    java.lang.Integer deliveryCharge, @org.jetbrains.annotations.Nullable()
    java.lang.Double addMoreForFreeDelivery, @org.jetbrains.annotations.Nullable()
    java.lang.Double tmCash, @org.jetbrains.annotations.Nullable()
    java.lang.Double tmCredit, @org.jetbrains.annotations.Nullable()
    java.lang.Double payableAmount, @org.jetbrains.annotations.Nullable()
    java.lang.String paymentMode, @org.jetbrains.annotations.Nullable()
    com.example.example.PaymentSelectionInfo paymentSelectionInfo) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getMrp() {
        return null;
    }
    
    public final void setMrp(@org.jetbrains.annotations.Nullable()
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
    public final java.lang.Double getCouponDiscount() {
        return null;
    }
    
    public final void setCouponDiscount(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCouponCode() {
        return null;
    }
    
    public final void setCouponCode(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getSavingAmount() {
        return null;
    }
    
    public final void setSavingAmount(@org.jetbrains.annotations.Nullable()
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
    public final java.lang.Integer getPackagingCharge() {
        return null;
    }
    
    public final void setPackagingCharge(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getDeliveryCharge() {
        return null;
    }
    
    public final void setDeliveryCharge(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getAddMoreForFreeDelivery() {
        return null;
    }
    
    public final void setAddMoreForFreeDelivery(@org.jetbrains.annotations.Nullable()
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
    public final java.lang.Double getPayableAmount() {
        return null;
    }
    
    public final void setPayableAmount(@org.jetbrains.annotations.Nullable()
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
    public final com.example.example.PaymentSelectionInfo getPaymentSelectionInfo() {
        return null;
    }
    
    public final void setPaymentSelectionInfo(@org.jetbrains.annotations.Nullable()
    com.example.example.PaymentSelectionInfo p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.salt.models.CartModel toCartModel() {
        return null;
    }
    
    public ProductDetailCartModel() {
        super();
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
    public final java.lang.Double component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.example.PaymentSelectionInfo component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
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
    public final java.lang.Double component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.model.ProductDetailCartModel copy(@org.jetbrains.annotations.Nullable()
    java.lang.Double mrp, @org.jetbrains.annotations.Nullable()
    java.lang.Double discount, @org.jetbrains.annotations.Nullable()
    java.lang.Double couponDiscount, @org.jetbrains.annotations.Nullable()
    java.lang.String couponCode, @org.jetbrains.annotations.Nullable()
    java.lang.Double savingAmount, @org.jetbrains.annotations.Nullable()
    java.lang.String savingsText, @org.jetbrains.annotations.Nullable()
    java.lang.Integer packagingCharge, @org.jetbrains.annotations.Nullable()
    java.lang.Integer deliveryCharge, @org.jetbrains.annotations.Nullable()
    java.lang.Double addMoreForFreeDelivery, @org.jetbrains.annotations.Nullable()
    java.lang.Double tmCash, @org.jetbrains.annotations.Nullable()
    java.lang.Double tmCredit, @org.jetbrains.annotations.Nullable()
    java.lang.Double payableAmount, @org.jetbrains.annotations.Nullable()
    java.lang.String paymentMode, @org.jetbrains.annotations.Nullable()
    com.example.example.PaymentSelectionInfo paymentSelectionInfo) {
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