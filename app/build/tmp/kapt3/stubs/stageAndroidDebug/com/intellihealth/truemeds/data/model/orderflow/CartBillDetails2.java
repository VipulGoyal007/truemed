package com.intellihealth.truemeds.data.model.orderflow;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\bN\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001fB\u00d9\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0019J\u0010\u0010M\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00101J\u0010\u0010N\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010$J\u0010\u0010O\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010$J\u000b\u0010P\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\t\u0010R\u001a\u00020\bH\u00c6\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u0010\u0010T\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\u0010\u0010U\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010$J\u0010\u0010V\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010$J\u0010\u0010W\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010$J\u0010\u0010X\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010$J\u0010\u0010Y\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\u000b\u0010Z\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u0010\u0010[\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010$J\u0010\u0010\\\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010$J\u0010\u0010]\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010$J\u0010\u0010^\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\u00e4\u0001\u0010_\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010`J\u0013\u0010a\u001a\u00020b2\b\u0010c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010d\u001a\u00020\bH\u00d6\u0001J\t\u0010e\u001a\u00020\nH\u00d6\u0001R\"\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\'\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\'\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\'\u001a\u0004\b*\u0010$\"\u0004\b+\u0010&R\"\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\'\u001a\u0004\b,\u0010$\"\u0004\b-\u0010&R\"\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b.\u0010\u001b\"\u0004\b/\u0010\u001dR\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00104\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\'\u001a\u0004\b5\u0010$\"\u0004\b6\u0010&R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\'\u001a\u0004\b7\u0010$\"\u0004\b8\u0010&R \u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010 \"\u0004\b:\u0010\"R \u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001e\u0010\u0014\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\'\u001a\u0004\bC\u0010$\"\u0004\bD\u0010&R \u0010\u0015\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010 \"\u0004\bF\u0010\"R\"\u0010\u0016\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\bG\u0010\u001b\"\u0004\bH\u0010\u001dR\"\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\'\u001a\u0004\bI\u0010$\"\u0004\bJ\u0010&R\"\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\'\u001a\u0004\bK\u0010$\"\u0004\bL\u0010&\u00a8\u0006g"}, d2 = {"Lcom/intellihealth/truemeds/data/model/orderflow/CartBillDetails2;", "", "orderId", "", "savingValue", "", "discount", "addMoreForFreeDelivery", "", "couponCode", "", "couponDiscountAmt", "deliveryCharge", "mrp", "mrpWithSubs", "packagingCharge", "payableAmt", "paymentMode", "paymentSelectionInfo", "Lcom/intellihealth/truemeds/data/model/orderflow/CartBillDetails2$PaymentSelectionInfo;", "savingPercentageWithSubs", "savingsText", "sellingPriceWithSubs", "tmCash", "tmCredit", "(Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Lcom/intellihealth/truemeds/data/model/orderflow/CartBillDetails2$PaymentSelectionInfo;ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;)V", "getAddMoreForFreeDelivery", "()Ljava/lang/Integer;", "setAddMoreForFreeDelivery", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getCouponCode", "()Ljava/lang/String;", "setCouponCode", "(Ljava/lang/String;)V", "getCouponDiscountAmt", "()Ljava/lang/Double;", "setCouponDiscountAmt", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getDeliveryCharge", "setDeliveryCharge", "getDiscount", "setDiscount", "getMrp", "setMrp", "getMrpWithSubs", "setMrpWithSubs", "getOrderId", "()Ljava/lang/Long;", "setOrderId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getPackagingCharge", "setPackagingCharge", "getPayableAmt", "setPayableAmt", "getPaymentMode", "setPaymentMode", "getPaymentSelectionInfo", "()Lcom/intellihealth/truemeds/data/model/orderflow/CartBillDetails2$PaymentSelectionInfo;", "setPaymentSelectionInfo", "(Lcom/intellihealth/truemeds/data/model/orderflow/CartBillDetails2$PaymentSelectionInfo;)V", "getSavingPercentageWithSubs", "()I", "setSavingPercentageWithSubs", "(I)V", "getSavingValue", "setSavingValue", "getSavingsText", "setSavingsText", "getSellingPriceWithSubs", "setSellingPriceWithSubs", "getTmCash", "setTmCash", "getTmCredit", "setTmCredit", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Lcom/intellihealth/truemeds/data/model/orderflow/CartBillDetails2$PaymentSelectionInfo;ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;)Lcom/intellihealth/truemeds/data/model/orderflow/CartBillDetails2;", "equals", "", "other", "hashCode", "toString", "PaymentSelectionInfo", "app_stageAndroidDebug"})
public final class CartBillDetails2 {
    @com.google.gson.annotations.SerializedName(value = "orderId")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long orderId;
    @com.google.gson.annotations.SerializedName(value = "savingValue")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double savingValue;
    @com.google.gson.annotations.SerializedName(value = "discount")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double discount;
    @com.google.gson.annotations.SerializedName(value = "addMoreForFreeDelivery")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer addMoreForFreeDelivery;
    @com.google.gson.annotations.SerializedName(value = "couponCode")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String couponCode;
    @com.google.gson.annotations.SerializedName(value = "couponDiscountAmt")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double couponDiscountAmt;
    @com.google.gson.annotations.SerializedName(value = "deliveryCharge")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double deliveryCharge;
    @com.google.gson.annotations.SerializedName(value = "mrp")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double mrp;
    @com.google.gson.annotations.SerializedName(value = "mrpWithSubs")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer mrpWithSubs;
    @com.google.gson.annotations.SerializedName(value = "packagingCharge")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double packagingCharge;
    @com.google.gson.annotations.SerializedName(value = "payableAmt")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double payableAmt;
    @com.google.gson.annotations.SerializedName(value = "paymentMode")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String paymentMode;
    @com.google.gson.annotations.SerializedName(value = "paymentSelectionInfo")
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.data.model.orderflow.CartBillDetails2.PaymentSelectionInfo paymentSelectionInfo;
    @com.google.gson.annotations.SerializedName(value = "savingPercentageWithSubs")
    private int savingPercentageWithSubs;
    @com.google.gson.annotations.SerializedName(value = "savingsText")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String savingsText;
    @com.google.gson.annotations.SerializedName(value = "sellingPriceWithSubs")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer sellingPriceWithSubs;
    @com.google.gson.annotations.SerializedName(value = "tmCash")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double tmCash;
    @com.google.gson.annotations.SerializedName(value = "tmCredit")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double tmCredit;
    
    public CartBillDetails2(@org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, @org.jetbrains.annotations.Nullable()
    java.lang.Double savingValue, @org.jetbrains.annotations.Nullable()
    java.lang.Double discount, @org.jetbrains.annotations.Nullable()
    java.lang.Integer addMoreForFreeDelivery, @org.jetbrains.annotations.Nullable()
    java.lang.String couponCode, @org.jetbrains.annotations.Nullable()
    java.lang.Double couponDiscountAmt, @org.jetbrains.annotations.Nullable()
    java.lang.Double deliveryCharge, @org.jetbrains.annotations.Nullable()
    java.lang.Double mrp, @org.jetbrains.annotations.Nullable()
    java.lang.Integer mrpWithSubs, @org.jetbrains.annotations.Nullable()
    java.lang.Double packagingCharge, @org.jetbrains.annotations.Nullable()
    java.lang.Double payableAmt, @org.jetbrains.annotations.Nullable()
    java.lang.String paymentMode, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.orderflow.CartBillDetails2.PaymentSelectionInfo paymentSelectionInfo, int savingPercentageWithSubs, @org.jetbrains.annotations.Nullable()
    java.lang.String savingsText, @org.jetbrains.annotations.Nullable()
    java.lang.Integer sellingPriceWithSubs, @org.jetbrains.annotations.Nullable()
    java.lang.Double tmCash, @org.jetbrains.annotations.Nullable()
    java.lang.Double tmCredit) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getOrderId() {
        return null;
    }
    
    public final void setOrderId(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getSavingValue() {
        return null;
    }
    
    public final void setSavingValue(@org.jetbrains.annotations.Nullable()
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
    public final java.lang.Integer getAddMoreForFreeDelivery() {
        return null;
    }
    
    public final void setAddMoreForFreeDelivery(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCouponCode() {
        return null;
    }
    
    public final void setCouponCode(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getCouponDiscountAmt() {
        return null;
    }
    
    public final void setCouponDiscountAmt(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getDeliveryCharge() {
        return null;
    }
    
    public final void setDeliveryCharge(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getMrp() {
        return null;
    }
    
    public final void setMrp(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getMrpWithSubs() {
        return null;
    }
    
    public final void setMrpWithSubs(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getPackagingCharge() {
        return null;
    }
    
    public final void setPackagingCharge(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getPayableAmt() {
        return null;
    }
    
    public final void setPayableAmt(@org.jetbrains.annotations.Nullable()
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
    public final com.intellihealth.truemeds.data.model.orderflow.CartBillDetails2.PaymentSelectionInfo getPaymentSelectionInfo() {
        return null;
    }
    
    public final void setPaymentSelectionInfo(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.orderflow.CartBillDetails2.PaymentSelectionInfo p0) {
    }
    
    public final int getSavingPercentageWithSubs() {
        return 0;
    }
    
    public final void setSavingPercentageWithSubs(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSavingsText() {
        return null;
    }
    
    public final void setSavingsText(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSellingPriceWithSubs() {
        return null;
    }
    
    public final void setSellingPriceWithSubs(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
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
    public final java.lang.Long component1() {
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
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.orderflow.CartBillDetails2.PaymentSelectionInfo component13() {
        return null;
    }
    
    public final int component14() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component18() {
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
    public final java.lang.Integer component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.orderflow.CartBillDetails2 copy(@org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, @org.jetbrains.annotations.Nullable()
    java.lang.Double savingValue, @org.jetbrains.annotations.Nullable()
    java.lang.Double discount, @org.jetbrains.annotations.Nullable()
    java.lang.Integer addMoreForFreeDelivery, @org.jetbrains.annotations.Nullable()
    java.lang.String couponCode, @org.jetbrains.annotations.Nullable()
    java.lang.Double couponDiscountAmt, @org.jetbrains.annotations.Nullable()
    java.lang.Double deliveryCharge, @org.jetbrains.annotations.Nullable()
    java.lang.Double mrp, @org.jetbrains.annotations.Nullable()
    java.lang.Integer mrpWithSubs, @org.jetbrains.annotations.Nullable()
    java.lang.Double packagingCharge, @org.jetbrains.annotations.Nullable()
    java.lang.Double payableAmt, @org.jetbrains.annotations.Nullable()
    java.lang.String paymentMode, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.orderflow.CartBillDetails2.PaymentSelectionInfo paymentSelectionInfo, int savingPercentageWithSubs, @org.jetbrains.annotations.Nullable()
    java.lang.String savingsText, @org.jetbrains.annotations.Nullable()
    java.lang.Integer sellingPriceWithSubs, @org.jetbrains.annotations.Nullable()
    java.lang.Double tmCash, @org.jetbrains.annotations.Nullable()
    java.lang.Double tmCredit) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b(\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\rJ\u000b\u0010&\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010\"Jn\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00c6\u0001\u00a2\u0006\u0002\u0010/J\u0013\u00100\u001a\u00020\f2\b\u00101\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00102\u001a\u00020\u0006H\u00d6\u0001J\t\u00103\u001a\u00020\u0003H\u00d6\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000f\"\u0004\b\u001c\u0010\u0011R\"\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u001d\u0010\u0015\"\u0004\b\u001e\u0010\u0017R \u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u0011R\"\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$\u00a8\u00064"}, d2 = {"Lcom/intellihealth/truemeds/data/model/orderflow/CartBillDetails2$PaymentSelectionInfo;", "", "lastPaymentMethod", "", "lastPaymentMethodIconUrl", "lastPaymentMethodId", "", "paymentMethod", "paymentMethodIconUrl", "paymentMethodId", "paymentNote", "paymentSpecificCouponApplied", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)V", "getLastPaymentMethod", "()Ljava/lang/String;", "setLastPaymentMethod", "(Ljava/lang/String;)V", "getLastPaymentMethodIconUrl", "setLastPaymentMethodIconUrl", "getLastPaymentMethodId", "()Ljava/lang/Integer;", "setLastPaymentMethodId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getPaymentMethod", "setPaymentMethod", "getPaymentMethodIconUrl", "setPaymentMethodIconUrl", "getPaymentMethodId", "setPaymentMethodId", "getPaymentNote", "setPaymentNote", "getPaymentSpecificCouponApplied", "()Ljava/lang/Boolean;", "setPaymentSpecificCouponApplied", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/intellihealth/truemeds/data/model/orderflow/CartBillDetails2$PaymentSelectionInfo;", "equals", "other", "hashCode", "toString", "app_stageAndroidDebug"})
    public static final class PaymentSelectionInfo {
        @com.google.gson.annotations.SerializedName(value = "lastPaymentMethod")
        @org.jetbrains.annotations.Nullable()
        private java.lang.String lastPaymentMethod;
        @com.google.gson.annotations.SerializedName(value = "lastPaymentMethodIconUrl")
        @org.jetbrains.annotations.Nullable()
        private java.lang.String lastPaymentMethodIconUrl;
        @com.google.gson.annotations.SerializedName(value = "lastPaymentMethodId")
        @org.jetbrains.annotations.Nullable()
        private java.lang.Integer lastPaymentMethodId;
        @com.google.gson.annotations.SerializedName(value = "paymentMethod")
        @org.jetbrains.annotations.Nullable()
        private java.lang.String paymentMethod;
        @com.google.gson.annotations.SerializedName(value = "paymentMethodIconUrl")
        @org.jetbrains.annotations.Nullable()
        private java.lang.String paymentMethodIconUrl;
        @com.google.gson.annotations.SerializedName(value = "paymentMethodId")
        @org.jetbrains.annotations.Nullable()
        private java.lang.Integer paymentMethodId;
        @com.google.gson.annotations.SerializedName(value = "paymentNote")
        @org.jetbrains.annotations.Nullable()
        private java.lang.String paymentNote;
        @com.google.gson.annotations.SerializedName(value = "paymentSpecificCouponApplied")
        @org.jetbrains.annotations.Nullable()
        private java.lang.Boolean paymentSpecificCouponApplied;
        
        public PaymentSelectionInfo(@org.jetbrains.annotations.Nullable()
        java.lang.String lastPaymentMethod, @org.jetbrains.annotations.Nullable()
        java.lang.String lastPaymentMethodIconUrl, @org.jetbrains.annotations.Nullable()
        java.lang.Integer lastPaymentMethodId, @org.jetbrains.annotations.Nullable()
        java.lang.String paymentMethod, @org.jetbrains.annotations.Nullable()
        java.lang.String paymentMethodIconUrl, @org.jetbrains.annotations.Nullable()
        java.lang.Integer paymentMethodId, @org.jetbrains.annotations.Nullable()
        java.lang.String paymentNote, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean paymentSpecificCouponApplied) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getLastPaymentMethod() {
            return null;
        }
        
        public final void setLastPaymentMethod(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getLastPaymentMethodIconUrl() {
            return null;
        }
        
        public final void setLastPaymentMethodIconUrl(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getLastPaymentMethodId() {
            return null;
        }
        
        public final void setLastPaymentMethodId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPaymentMethod() {
            return null;
        }
        
        public final void setPaymentMethod(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPaymentMethodIconUrl() {
            return null;
        }
        
        public final void setPaymentMethodIconUrl(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getPaymentMethodId() {
            return null;
        }
        
        public final void setPaymentMethodId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPaymentNote() {
            return null;
        }
        
        public final void setPaymentNote(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean getPaymentSpecificCouponApplied() {
            return null;
        }
        
        public final void setPaymentSpecificCouponApplied(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean p0) {
        }
        
        public PaymentSelectionInfo() {
            super();
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
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component8() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.intellihealth.truemeds.data.model.orderflow.CartBillDetails2.PaymentSelectionInfo copy(@org.jetbrains.annotations.Nullable()
        java.lang.String lastPaymentMethod, @org.jetbrains.annotations.Nullable()
        java.lang.String lastPaymentMethodIconUrl, @org.jetbrains.annotations.Nullable()
        java.lang.Integer lastPaymentMethodId, @org.jetbrains.annotations.Nullable()
        java.lang.String paymentMethod, @org.jetbrains.annotations.Nullable()
        java.lang.String paymentMethodIconUrl, @org.jetbrains.annotations.Nullable()
        java.lang.Integer paymentMethodId, @org.jetbrains.annotations.Nullable()
        java.lang.String paymentNote, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean paymentSpecificCouponApplied) {
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