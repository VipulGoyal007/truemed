package com.intellihealth.truemeds.presentation.analytics.model.mixpanel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\bS\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u00e7\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0018J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010F\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010 J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010H\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010 J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010K\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010 J\u0010\u0010L\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010 J\u0010\u0010M\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010 J\u0010\u0010N\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010 J\u0010\u0010O\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010 J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010Q\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010 J\u0010\u0010R\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010 J\t\u0010S\u001a\u00020\tH\u00c6\u0003J\u0010\u0010T\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010 J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010V\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010 J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u00f0\u0001\u0010X\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0002\u0010YJ\u0013\u0010Z\u001a\u00020\t2\b\u0010[\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\\\u001a\u00020]H\u00d6\u0001J\t\u0010^\u001a\u00020\u0003H\u00d6\u0001R \u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR \u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\"\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010#\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010#\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010#\u001a\u0004\b&\u0010 \"\u0004\b\'\u0010\"R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001a\"\u0004\b)\u0010\u001cR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001a\"\u0004\b+\u0010\u001cR\"\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010#\u001a\u0004\b,\u0010 \"\u0004\b-\u0010\"R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010#\u001a\u0004\b.\u0010 \"\u0004\b/\u0010\"R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010#\u001a\u0004\b0\u0010 \"\u0004\b1\u0010\"R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u00102\"\u0004\b3\u00104R\"\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010#\u001a\u0004\b5\u0010 \"\u0004\b6\u0010\"R \u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u001a\"\u0004\b8\u0010\u001cR\"\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010#\u001a\u0004\b9\u0010 \"\u0004\b:\u0010\"R \u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u001a\"\u0004\b<\u0010\u001cR\"\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010#\u001a\u0004\b=\u0010 \"\u0004\b>\u0010\"R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010#\u001a\u0004\b?\u0010 \"\u0004\b@\u0010\"R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010#\u001a\u0004\bA\u0010 \"\u0004\bB\u0010\"R \u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u001a\"\u0004\bD\u0010\u001c\u00a8\u0006_"}, d2 = {"Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxPaymentPopupViewed;", "", "ctaType", "", "currentOrderStatus", "discountAmount", "", "estimatedPayableAmount", "isReorder", "", "mrpTotalAmount", "orderId", "packagingChargeAmount", "paymentMode", "salesPrice", "whId", "couponDiscountAmount", "appliedCouponName", "appliedCouponType", "tmCreditAmount", "tmRewardAmount", "deliveryChargeAmount", "cashHandlingChargeApplicable", "cashHandlingCharge", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;ZLjava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "getAppliedCouponName", "()Ljava/lang/String;", "setAppliedCouponName", "(Ljava/lang/String;)V", "getAppliedCouponType", "setAppliedCouponType", "getCashHandlingCharge", "()Ljava/lang/Double;", "setCashHandlingCharge", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getCashHandlingChargeApplicable", "setCashHandlingChargeApplicable", "getCouponDiscountAmount", "setCouponDiscountAmount", "getCtaType", "setCtaType", "getCurrentOrderStatus", "setCurrentOrderStatus", "getDeliveryChargeAmount", "setDeliveryChargeAmount", "getDiscountAmount", "setDiscountAmount", "getEstimatedPayableAmount", "setEstimatedPayableAmount", "()Z", "setReorder", "(Z)V", "getMrpTotalAmount", "setMrpTotalAmount", "getOrderId", "setOrderId", "getPackagingChargeAmount", "setPackagingChargeAmount", "getPaymentMode", "setPaymentMode", "getSalesPrice", "setSalesPrice", "getTmCreditAmount", "setTmCreditAmount", "getTmRewardAmount", "setTmRewardAmount", "getWhId", "setWhId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;ZLjava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxPaymentPopupViewed;", "equals", "other", "hashCode", "", "toString", "app_stageAndroidDebug"})
public final class MxPaymentPopupViewed {
    @com.google.gson.annotations.SerializedName(value = "cta_type")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String ctaType;
    @com.google.gson.annotations.SerializedName(value = "current_order_status")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String currentOrderStatus;
    @com.google.gson.annotations.SerializedName(value = "discount_amount")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double discountAmount;
    @com.google.gson.annotations.SerializedName(value = "estimated_payable_amount")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double estimatedPayableAmount;
    @com.google.gson.annotations.SerializedName(value = "is_reorder")
    private boolean isReorder;
    @com.google.gson.annotations.SerializedName(value = "mrp_total_amount")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double mrpTotalAmount;
    @com.google.gson.annotations.SerializedName(value = "order_id")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String orderId;
    @com.google.gson.annotations.SerializedName(value = "packaging_charge_amount")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double packagingChargeAmount;
    @com.google.gson.annotations.SerializedName(value = "payment_mode")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String paymentMode;
    @com.google.gson.annotations.SerializedName(value = "sales_price")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double salesPrice;
    @com.google.gson.annotations.SerializedName(value = "wh_id")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String whId;
    @com.google.gson.annotations.SerializedName(value = "coupon_discount_amount")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double couponDiscountAmount;
    @com.google.gson.annotations.SerializedName(value = "applied_coupon_name")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String appliedCouponName;
    @com.google.gson.annotations.SerializedName(value = "applied_coupon_type")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String appliedCouponType;
    @com.google.gson.annotations.SerializedName(value = "tm_credit_amount")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double tmCreditAmount;
    @com.google.gson.annotations.SerializedName(value = "tm_reward_amount")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double tmRewardAmount;
    @com.google.gson.annotations.SerializedName(value = "delivery_charge_amount")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double deliveryChargeAmount;
    @com.google.gson.annotations.SerializedName(value = "cash_handling_charge_applicable")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double cashHandlingChargeApplicable;
    @com.google.gson.annotations.SerializedName(value = "cash_handling_charge")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double cashHandlingCharge;
    
    public MxPaymentPopupViewed(@org.jetbrains.annotations.Nullable()
    java.lang.String ctaType, @org.jetbrains.annotations.Nullable()
    java.lang.String currentOrderStatus, @org.jetbrains.annotations.Nullable()
    java.lang.Double discountAmount, @org.jetbrains.annotations.Nullable()
    java.lang.Double estimatedPayableAmount, boolean isReorder, @org.jetbrains.annotations.Nullable()
    java.lang.Double mrpTotalAmount, @org.jetbrains.annotations.Nullable()
    java.lang.String orderId, @org.jetbrains.annotations.Nullable()
    java.lang.Double packagingChargeAmount, @org.jetbrains.annotations.Nullable()
    java.lang.String paymentMode, @org.jetbrains.annotations.Nullable()
    java.lang.Double salesPrice, @org.jetbrains.annotations.Nullable()
    java.lang.String whId, @org.jetbrains.annotations.Nullable()
    java.lang.Double couponDiscountAmount, @org.jetbrains.annotations.Nullable()
    java.lang.String appliedCouponName, @org.jetbrains.annotations.Nullable()
    java.lang.String appliedCouponType, @org.jetbrains.annotations.Nullable()
    java.lang.Double tmCreditAmount, @org.jetbrains.annotations.Nullable()
    java.lang.Double tmRewardAmount, @org.jetbrains.annotations.Nullable()
    java.lang.Double deliveryChargeAmount, @org.jetbrains.annotations.Nullable()
    java.lang.Double cashHandlingChargeApplicable, @org.jetbrains.annotations.Nullable()
    java.lang.Double cashHandlingCharge) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCtaType() {
        return null;
    }
    
    public final void setCtaType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCurrentOrderStatus() {
        return null;
    }
    
    public final void setCurrentOrderStatus(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getDiscountAmount() {
        return null;
    }
    
    public final void setDiscountAmount(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getEstimatedPayableAmount() {
        return null;
    }
    
    public final void setEstimatedPayableAmount(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    public final boolean isReorder() {
        return false;
    }
    
    public final void setReorder(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getMrpTotalAmount() {
        return null;
    }
    
    public final void setMrpTotalAmount(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOrderId() {
        return null;
    }
    
    public final void setOrderId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getPackagingChargeAmount() {
        return null;
    }
    
    public final void setPackagingChargeAmount(@org.jetbrains.annotations.Nullable()
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
    public final java.lang.Double getSalesPrice() {
        return null;
    }
    
    public final void setSalesPrice(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getWhId() {
        return null;
    }
    
    public final void setWhId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getCouponDiscountAmount() {
        return null;
    }
    
    public final void setCouponDiscountAmount(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAppliedCouponName() {
        return null;
    }
    
    public final void setAppliedCouponName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAppliedCouponType() {
        return null;
    }
    
    public final void setAppliedCouponType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getTmCreditAmount() {
        return null;
    }
    
    public final void setTmCreditAmount(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getTmRewardAmount() {
        return null;
    }
    
    public final void setTmRewardAmount(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getDeliveryChargeAmount() {
        return null;
    }
    
    public final void setDeliveryChargeAmount(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getCashHandlingChargeApplicable() {
        return null;
    }
    
    public final void setCashHandlingChargeApplicable(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getCashHandlingCharge() {
        return null;
    }
    
    public final void setCashHandlingCharge(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    public MxPaymentPopupViewed() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
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
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component16() {
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
    public final java.lang.Double component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component4() {
        return null;
    }
    
    public final boolean component5() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxPaymentPopupViewed copy(@org.jetbrains.annotations.Nullable()
    java.lang.String ctaType, @org.jetbrains.annotations.Nullable()
    java.lang.String currentOrderStatus, @org.jetbrains.annotations.Nullable()
    java.lang.Double discountAmount, @org.jetbrains.annotations.Nullable()
    java.lang.Double estimatedPayableAmount, boolean isReorder, @org.jetbrains.annotations.Nullable()
    java.lang.Double mrpTotalAmount, @org.jetbrains.annotations.Nullable()
    java.lang.String orderId, @org.jetbrains.annotations.Nullable()
    java.lang.Double packagingChargeAmount, @org.jetbrains.annotations.Nullable()
    java.lang.String paymentMode, @org.jetbrains.annotations.Nullable()
    java.lang.Double salesPrice, @org.jetbrains.annotations.Nullable()
    java.lang.String whId, @org.jetbrains.annotations.Nullable()
    java.lang.Double couponDiscountAmount, @org.jetbrains.annotations.Nullable()
    java.lang.String appliedCouponName, @org.jetbrains.annotations.Nullable()
    java.lang.String appliedCouponType, @org.jetbrains.annotations.Nullable()
    java.lang.Double tmCreditAmount, @org.jetbrains.annotations.Nullable()
    java.lang.Double tmRewardAmount, @org.jetbrains.annotations.Nullable()
    java.lang.Double deliveryChargeAmount, @org.jetbrains.annotations.Nullable()
    java.lang.Double cashHandlingChargeApplicable, @org.jetbrains.annotations.Nullable()
    java.lang.Double cashHandlingCharge) {
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