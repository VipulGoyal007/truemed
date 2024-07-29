package com.intellihealth.truemeds.data.model.orderflow;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b9\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0012J\u0010\u00107\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010 J\t\u00108\u001a\u00020\u0005H\u00c6\u0003J\t\u00109\u001a\u00020\rH\u00c6\u0003J\t\u0010:\u001a\u00020\rH\u00c6\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\'J\t\u0010<\u001a\u00020\u0005H\u00c6\u0003J\t\u0010=\u001a\u00020\u0005H\u00c6\u0003J\t\u0010>\u001a\u00020\u0005H\u00c6\u0003J\t\u0010?\u001a\u00020\u0005H\u00c6\u0003J\t\u0010@\u001a\u00020\u0005H\u00c6\u0003J\t\u0010A\u001a\u00020\u0005H\u00c6\u0003J\t\u0010B\u001a\u00020\u0005H\u00c6\u0003J\t\u0010C\u001a\u00020\rH\u00c6\u0003J\u0094\u0001\u0010D\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010EJ\t\u0010F\u001a\u00020GH\u00d6\u0001J\u0013\u0010H\u001a\u00020I2\b\u0010J\u001a\u0004\u0018\u00010KH\u00d6\u0003J\t\u0010L\u001a\u00020GH\u00d6\u0001J\t\u0010M\u001a\u00020\rH\u00d6\u0001J\u0019\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020GH\u00d6\u0001R\u001a\u0010\u000f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001e\u0010\u000e\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010#\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010\u0010\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0014\"\u0004\b%\u0010\u0016R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010*\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001a\"\u0004\b,\u0010\u001cR\u001e\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001a\"\u0004\b.\u0010\u001cR\u001e\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001a\"\u0004\b0\u0010\u001cR\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001a\"\u0004\b2\u0010\u001cR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u001a\"\u0004\b4\u0010\u001cR\u001e\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u001a\"\u0004\b6\u0010\u001c\u00a8\u0006S"}, d2 = {"Lcom/intellihealth/truemeds/data/model/orderflow/CartBillDetailsModel;", "Landroid/os/Parcelable;", "orderId", "", "totalMrp", "", "totalDiscount", "sellerPackagingCharges", "deliveryCharge", "tmReward", "tmCredit", "totalPayableAmount", "couponAppliedName", "", "couponCodeDiscount", "billDetailsTitle", "saveOrderMessage", "saveOrderPrice", "(Ljava/lang/Long;DDDDDDDLjava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V", "getBillDetailsTitle", "()Ljava/lang/String;", "setBillDetailsTitle", "(Ljava/lang/String;)V", "getCouponAppliedName", "setCouponAppliedName", "getCouponCodeDiscount", "()D", "setCouponCodeDiscount", "(D)V", "getDeliveryCharge", "setDeliveryCharge", "getOrderId", "()Ljava/lang/Long;", "setOrderId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getSaveOrderMessage", "setSaveOrderMessage", "getSaveOrderPrice", "()Ljava/lang/Double;", "setSaveOrderPrice", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getSellerPackagingCharges", "setSellerPackagingCharges", "getTmCredit", "setTmCredit", "getTmReward", "setTmReward", "getTotalDiscount", "setTotalDiscount", "getTotalMrp", "setTotalMrp", "getTotalPayableAmount", "setTotalPayableAmount", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Long;DDDDDDDLjava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/Double;)Lcom/intellihealth/truemeds/data/model/orderflow/CartBillDetailsModel;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_prodDebug"})
@androidx.annotation.Keep()
@kotlinx.parcelize.Parcelize()
public final class CartBillDetailsModel implements android.os.Parcelable {
    @com.google.gson.annotations.SerializedName(value = "orderId")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long orderId;
    @com.google.gson.annotations.SerializedName(value = "mrp")
    private double totalMrp;
    @com.google.gson.annotations.SerializedName(value = "discount")
    private double totalDiscount;
    @com.google.gson.annotations.SerializedName(value = "packagingCharge")
    private double sellerPackagingCharges;
    @com.google.gson.annotations.SerializedName(value = "deliveryCharge")
    private double deliveryCharge;
    @com.google.gson.annotations.SerializedName(value = "tmCash")
    private double tmReward;
    @com.google.gson.annotations.SerializedName(value = "tmCredit")
    private double tmCredit;
    @com.google.gson.annotations.SerializedName(value = "payableAmt")
    private double totalPayableAmount;
    @com.google.gson.annotations.SerializedName(value = "couponCode")
    @org.jetbrains.annotations.NotNull()
    private java.lang.String couponAppliedName;
    @com.google.gson.annotations.SerializedName(value = "couponDiscountAmt")
    private double couponCodeDiscount;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String billDetailsTitle;
    @com.google.gson.annotations.SerializedName(value = "savingsText")
    @org.jetbrains.annotations.NotNull()
    private java.lang.String saveOrderMessage;
    @com.google.gson.annotations.SerializedName(value = "savingValue")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double saveOrderPrice;
    
    public CartBillDetailsModel(@org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, double totalMrp, double totalDiscount, double sellerPackagingCharges, double deliveryCharge, double tmReward, double tmCredit, double totalPayableAmount, @org.jetbrains.annotations.NotNull()
    java.lang.String couponAppliedName, double couponCodeDiscount, @org.jetbrains.annotations.NotNull()
    java.lang.String billDetailsTitle, @org.jetbrains.annotations.NotNull()
    java.lang.String saveOrderMessage, @org.jetbrains.annotations.Nullable()
    java.lang.Double saveOrderPrice) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getOrderId() {
        return null;
    }
    
    public final void setOrderId(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    public final double getTotalMrp() {
        return 0.0;
    }
    
    public final void setTotalMrp(double p0) {
    }
    
    public final double getTotalDiscount() {
        return 0.0;
    }
    
    public final void setTotalDiscount(double p0) {
    }
    
    public final double getSellerPackagingCharges() {
        return 0.0;
    }
    
    public final void setSellerPackagingCharges(double p0) {
    }
    
    public final double getDeliveryCharge() {
        return 0.0;
    }
    
    public final void setDeliveryCharge(double p0) {
    }
    
    public final double getTmReward() {
        return 0.0;
    }
    
    public final void setTmReward(double p0) {
    }
    
    public final double getTmCredit() {
        return 0.0;
    }
    
    public final void setTmCredit(double p0) {
    }
    
    public final double getTotalPayableAmount() {
        return 0.0;
    }
    
    public final void setTotalPayableAmount(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCouponAppliedName() {
        return null;
    }
    
    public final void setCouponAppliedName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final double getCouponCodeDiscount() {
        return 0.0;
    }
    
    public final void setCouponCodeDiscount(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBillDetailsTitle() {
        return null;
    }
    
    public final void setBillDetailsTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSaveOrderMessage() {
        return null;
    }
    
    public final void setSaveOrderMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getSaveOrderPrice() {
        return null;
    }
    
    public final void setSaveOrderPrice(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    public CartBillDetailsModel() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component1() {
        return null;
    }
    
    public final double component10() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component13() {
        return null;
    }
    
    public final double component2() {
        return 0.0;
    }
    
    public final double component3() {
        return 0.0;
    }
    
    public final double component4() {
        return 0.0;
    }
    
    public final double component5() {
        return 0.0;
    }
    
    public final double component6() {
        return 0.0;
    }
    
    public final double component7() {
        return 0.0;
    }
    
    public final double component8() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.orderflow.CartBillDetailsModel copy(@org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, double totalMrp, double totalDiscount, double sellerPackagingCharges, double deliveryCharge, double tmReward, double tmCredit, double totalPayableAmount, @org.jetbrains.annotations.NotNull()
    java.lang.String couponAppliedName, double couponCodeDiscount, @org.jetbrains.annotations.NotNull()
    java.lang.String billDetailsTitle, @org.jetbrains.annotations.NotNull()
    java.lang.String saveOrderMessage, @org.jetbrains.annotations.Nullable()
    java.lang.Double saveOrderPrice) {
        return null;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
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
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
}