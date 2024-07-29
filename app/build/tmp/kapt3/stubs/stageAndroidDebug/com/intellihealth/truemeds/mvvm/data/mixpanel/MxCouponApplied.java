package com.intellihealth.truemeds.mvvm.data.mixpanel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b^\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u00b5\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u0012\b\u0002\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\u0012\b\u0002\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010 J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0013\u0010a\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0010H\u00c6\u0003J\u0010\u0010b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\"J\u0010\u0010c\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u00103J\u000b\u0010d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\"J\u0010\u0010f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\"J\u0013\u0010g\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0010H\u00c6\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010i\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\"J\u0010\u0010j\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\"J\u0010\u0010k\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\"J\u0010\u0010l\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\"J\u0010\u0010m\u001a\u0004\u0018\u00010\u001cH\u00c6\u0003\u00a2\u0006\u0002\u0010\\J\u000b\u0010n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010o\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\"J\u0010\u0010p\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\"J\u000b\u0010q\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0010\u0010r\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u00103J\u000b\u0010s\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010v\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\"J\u0010\u0010w\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\"J\u00be\u0002\u0010x\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0012\b\u0002\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u0012\b\u0002\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00102\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010yJ\u0013\u0010z\u001a\u00020{2\b\u0010|\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010}\u001a\u00020\tH\u00d6\u0001J\t\u0010~\u001a\u00020\u0003H\u00d6\u0001R\"\u0010\u001e\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010%\u001a\u0004\b&\u0010\"\"\u0004\b\'\u0010$R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010%\u001a\u0004\b,\u0010\"\"\u0004\b-\u0010$R \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00106\u001a\u0004\b2\u00103\"\u0004\b4\u00105R \u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010)\"\u0004\b8\u0010+R \u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010)\"\u0004\b:\u0010+R \u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010)\"\u0004\b<\u0010+R\"\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010%\u001a\u0004\b=\u0010\"\"\u0004\b>\u0010$R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010%\u001a\u0004\b?\u0010\"\"\u0004\b@\u0010$R(\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010%\u001a\u0004\bE\u0010\"\"\u0004\bF\u0010$R\"\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00106\u001a\u0004\bG\u00103\"\u0004\bH\u00105R \u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010)\"\u0004\bJ\u0010+R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010%\u001a\u0004\bK\u0010\"\"\u0004\bL\u0010$R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010%\u001a\u0004\bM\u0010\"\"\u0004\bN\u0010$R(\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010B\"\u0004\bP\u0010DR \u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010)\"\u0004\bR\u0010+R\"\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010%\u001a\u0004\bS\u0010\"\"\u0004\bT\u0010$R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010%\u001a\u0004\bU\u0010\"\"\u0004\bV\u0010$R \u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bW\u0010)\"\u0004\bX\u0010+R\"\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010%\u001a\u0004\bY\u0010\"\"\u0004\bZ\u0010$R\"\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010_\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^\u00a8\u0006\u007f"}, d2 = {"Lcom/intellihealth/truemeds/mvvm/data/mixpanel/MxCouponApplied;", "", "clickedOnPage", "", "couponDiscountAmount", "", "couponExpiryDate", "Ljava/util/Date;", "couponExpiryPeriod", "", "couponId", "couponName", "couponSubtitle", "deliveryChargeAmount", "discountAmount", "itemNames", "", "mrpTotalAmount", "noOfItem", "orderId", "packagingChargesAmount", "previousEstimatedPayableAmount", "productsIds", "subsId", "tmCreditAmount", "tmRewardAmount", "updatedEstimatedPayableAmount", "urgencyTimeRemaining", "", "total_discount_amount", "cashHandlingCharge", "cashHandlingChargeApplicable", "(Ljava/lang/String;Ljava/lang/Double;Ljava/util/Date;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)V", "getCashHandlingCharge", "()Ljava/lang/Double;", "setCashHandlingCharge", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getCashHandlingChargeApplicable", "setCashHandlingChargeApplicable", "getClickedOnPage", "()Ljava/lang/String;", "setClickedOnPage", "(Ljava/lang/String;)V", "getCouponDiscountAmount", "setCouponDiscountAmount", "getCouponExpiryDate", "()Ljava/util/Date;", "setCouponExpiryDate", "(Ljava/util/Date;)V", "getCouponExpiryPeriod", "()Ljava/lang/Integer;", "setCouponExpiryPeriod", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getCouponId", "setCouponId", "getCouponName", "setCouponName", "getCouponSubtitle", "setCouponSubtitle", "getDeliveryChargeAmount", "setDeliveryChargeAmount", "getDiscountAmount", "setDiscountAmount", "getItemNames", "()Ljava/util/List;", "setItemNames", "(Ljava/util/List;)V", "getMrpTotalAmount", "setMrpTotalAmount", "getNoOfItem", "setNoOfItem", "getOrderId", "setOrderId", "getPackagingChargesAmount", "setPackagingChargesAmount", "getPreviousEstimatedPayableAmount", "setPreviousEstimatedPayableAmount", "getProductsIds", "setProductsIds", "getSubsId", "setSubsId", "getTmCreditAmount", "setTmCreditAmount", "getTmRewardAmount", "setTmRewardAmount", "getTotal_discount_amount", "setTotal_discount_amount", "getUpdatedEstimatedPayableAmount", "setUpdatedEstimatedPayableAmount", "getUrgencyTimeRemaining", "()Ljava/lang/Long;", "setUrgencyTimeRemaining", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Double;Ljava/util/Date;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)Lcom/intellihealth/truemeds/mvvm/data/mixpanel/MxCouponApplied;", "equals", "", "other", "hashCode", "toString", "app_stageAndroidDebug"})
@androidx.annotation.Keep()
public final class MxCouponApplied {
    @com.google.gson.annotations.SerializedName(value = "clicked_on_page")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String clickedOnPage;
    @com.google.gson.annotations.SerializedName(value = "coupon_discount_amount")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double couponDiscountAmount;
    @com.google.gson.annotations.SerializedName(value = "coupon_expiry_date")
    @org.jetbrains.annotations.Nullable()
    private java.util.Date couponExpiryDate;
    @com.google.gson.annotations.SerializedName(value = "coupon_expiry_period")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer couponExpiryPeriod;
    @com.google.gson.annotations.SerializedName(value = "coupon_id")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String couponId;
    @com.google.gson.annotations.SerializedName(value = "coupon_name")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String couponName;
    @com.google.gson.annotations.SerializedName(value = "coupon_subtitle")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String couponSubtitle;
    @com.google.gson.annotations.SerializedName(value = "delivery_charge_amount")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double deliveryChargeAmount;
    @com.google.gson.annotations.SerializedName(value = "discount_amount")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double discountAmount;
    @com.google.gson.annotations.SerializedName(value = "item_names")
    @org.jetbrains.annotations.Nullable()
    private java.util.List<java.lang.String> itemNames;
    @com.google.gson.annotations.SerializedName(value = "mrp_total_amount")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double mrpTotalAmount;
    @com.google.gson.annotations.SerializedName(value = "no_of_item")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer noOfItem;
    @com.google.gson.annotations.SerializedName(value = "order_id")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String orderId;
    @com.google.gson.annotations.SerializedName(value = "packaging_charges_amount")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double packagingChargesAmount;
    @com.google.gson.annotations.SerializedName(value = "previous_estimated_payable_amount")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double previousEstimatedPayableAmount;
    @com.google.gson.annotations.SerializedName(value = "products_ids")
    @org.jetbrains.annotations.Nullable()
    private java.util.List<java.lang.String> productsIds;
    @com.google.gson.annotations.SerializedName(value = "subs_id")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String subsId;
    @com.google.gson.annotations.SerializedName(value = "tm_credit_amount")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double tmCreditAmount;
    @com.google.gson.annotations.SerializedName(value = "tm_reward_amount")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double tmRewardAmount;
    @com.google.gson.annotations.SerializedName(value = "updated_estimated_payable_amount")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double updatedEstimatedPayableAmount;
    @com.google.gson.annotations.SerializedName(value = "urgency_time_remaining")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long urgencyTimeRemaining;
    @com.google.gson.annotations.SerializedName(value = "total_discount_amount")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String total_discount_amount;
    @com.google.gson.annotations.SerializedName(value = "cash_handling_charge")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double cashHandlingCharge;
    @com.google.gson.annotations.SerializedName(value = "cash_handling_charge_applicable")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double cashHandlingChargeApplicable;
    
    public MxCouponApplied(@org.jetbrains.annotations.Nullable()
    java.lang.String clickedOnPage, @org.jetbrains.annotations.Nullable()
    java.lang.Double couponDiscountAmount, @org.jetbrains.annotations.Nullable()
    java.util.Date couponExpiryDate, @org.jetbrains.annotations.Nullable()
    java.lang.Integer couponExpiryPeriod, @org.jetbrains.annotations.Nullable()
    java.lang.String couponId, @org.jetbrains.annotations.Nullable()
    java.lang.String couponName, @org.jetbrains.annotations.Nullable()
    java.lang.String couponSubtitle, @org.jetbrains.annotations.Nullable()
    java.lang.Double deliveryChargeAmount, @org.jetbrains.annotations.Nullable()
    java.lang.Double discountAmount, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> itemNames, @org.jetbrains.annotations.Nullable()
    java.lang.Double mrpTotalAmount, @org.jetbrains.annotations.Nullable()
    java.lang.Integer noOfItem, @org.jetbrains.annotations.Nullable()
    java.lang.String orderId, @org.jetbrains.annotations.Nullable()
    java.lang.Double packagingChargesAmount, @org.jetbrains.annotations.Nullable()
    java.lang.Double previousEstimatedPayableAmount, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> productsIds, @org.jetbrains.annotations.Nullable()
    java.lang.String subsId, @org.jetbrains.annotations.Nullable()
    java.lang.Double tmCreditAmount, @org.jetbrains.annotations.Nullable()
    java.lang.Double tmRewardAmount, @org.jetbrains.annotations.Nullable()
    java.lang.Double updatedEstimatedPayableAmount, @org.jetbrains.annotations.Nullable()
    java.lang.Long urgencyTimeRemaining, @org.jetbrains.annotations.Nullable()
    java.lang.String total_discount_amount, @org.jetbrains.annotations.Nullable()
    java.lang.Double cashHandlingCharge, @org.jetbrains.annotations.Nullable()
    java.lang.Double cashHandlingChargeApplicable) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getClickedOnPage() {
        return null;
    }
    
    public final void setClickedOnPage(@org.jetbrains.annotations.Nullable()
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
    public final java.util.Date getCouponExpiryDate() {
        return null;
    }
    
    public final void setCouponExpiryDate(@org.jetbrains.annotations.Nullable()
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getCouponExpiryPeriod() {
        return null;
    }
    
    public final void setCouponExpiryPeriod(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCouponId() {
        return null;
    }
    
    public final void setCouponId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCouponName() {
        return null;
    }
    
    public final void setCouponName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCouponSubtitle() {
        return null;
    }
    
    public final void setCouponSubtitle(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getDeliveryChargeAmount() {
        return null;
    }
    
    public final void setDeliveryChargeAmount(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getDiscountAmount() {
        return null;
    }
    
    public final void setDiscountAmount(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getItemNames() {
        return null;
    }
    
    public final void setItemNames(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getMrpTotalAmount() {
        return null;
    }
    
    public final void setMrpTotalAmount(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getNoOfItem() {
        return null;
    }
    
    public final void setNoOfItem(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOrderId() {
        return null;
    }
    
    public final void setOrderId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getPackagingChargesAmount() {
        return null;
    }
    
    public final void setPackagingChargesAmount(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getPreviousEstimatedPayableAmount() {
        return null;
    }
    
    public final void setPreviousEstimatedPayableAmount(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getProductsIds() {
        return null;
    }
    
    public final void setProductsIds(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSubsId() {
        return null;
    }
    
    public final void setSubsId(@org.jetbrains.annotations.Nullable()
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
    public final java.lang.Double getUpdatedEstimatedPayableAmount() {
        return null;
    }
    
    public final void setUpdatedEstimatedPayableAmount(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getUrgencyTimeRemaining() {
        return null;
    }
    
    public final void setUrgencyTimeRemaining(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTotal_discount_amount() {
        return null;
    }
    
    public final void setTotal_discount_amount(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getCashHandlingCharge() {
        return null;
    }
    
    public final void setCashHandlingCharge(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getCashHandlingChargeApplicable() {
        return null;
    }
    
    public final void setCashHandlingChargeApplicable(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    public MxCouponApplied() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component17() {
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
    public final java.lang.Double component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component24() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date component3() {
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
    public final java.lang.String component6() {
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
    public final java.lang.Double component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.mvvm.data.mixpanel.MxCouponApplied copy(@org.jetbrains.annotations.Nullable()
    java.lang.String clickedOnPage, @org.jetbrains.annotations.Nullable()
    java.lang.Double couponDiscountAmount, @org.jetbrains.annotations.Nullable()
    java.util.Date couponExpiryDate, @org.jetbrains.annotations.Nullable()
    java.lang.Integer couponExpiryPeriod, @org.jetbrains.annotations.Nullable()
    java.lang.String couponId, @org.jetbrains.annotations.Nullable()
    java.lang.String couponName, @org.jetbrains.annotations.Nullable()
    java.lang.String couponSubtitle, @org.jetbrains.annotations.Nullable()
    java.lang.Double deliveryChargeAmount, @org.jetbrains.annotations.Nullable()
    java.lang.Double discountAmount, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> itemNames, @org.jetbrains.annotations.Nullable()
    java.lang.Double mrpTotalAmount, @org.jetbrains.annotations.Nullable()
    java.lang.Integer noOfItem, @org.jetbrains.annotations.Nullable()
    java.lang.String orderId, @org.jetbrains.annotations.Nullable()
    java.lang.Double packagingChargesAmount, @org.jetbrains.annotations.Nullable()
    java.lang.Double previousEstimatedPayableAmount, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> productsIds, @org.jetbrains.annotations.Nullable()
    java.lang.String subsId, @org.jetbrains.annotations.Nullable()
    java.lang.Double tmCreditAmount, @org.jetbrains.annotations.Nullable()
    java.lang.Double tmRewardAmount, @org.jetbrains.annotations.Nullable()
    java.lang.Double updatedEstimatedPayableAmount, @org.jetbrains.annotations.Nullable()
    java.lang.Long urgencyTimeRemaining, @org.jetbrains.annotations.Nullable()
    java.lang.String total_discount_amount, @org.jetbrains.annotations.Nullable()
    java.lang.Double cashHandlingCharge, @org.jetbrains.annotations.Nullable()
    java.lang.Double cashHandlingChargeApplicable) {
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