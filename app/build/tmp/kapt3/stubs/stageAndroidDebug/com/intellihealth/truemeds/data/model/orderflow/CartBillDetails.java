package com.intellihealth.truemeds.data.model.orderflow;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bC\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00c3\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0017J\u0010\u0010E\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010/J\u0010\u0010F\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010$J\u000b\u0010G\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u0010\u0010I\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019J\u000b\u0010J\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003J\t\u0010L\u001a\u00020\u000fH\u00c6\u0003J\u0010\u0010M\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010$J\u0010\u0010N\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010$J\u0010\u0010O\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010$J\u0010\u0010P\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010$J\u0010\u0010Q\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010$J\u0010\u0010R\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010$J\u0010\u0010S\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010$J\u0010\u0010T\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010$J\u00cc\u0001\u0010U\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u000fH\u00c6\u0001\u00a2\u0006\u0002\u0010VJ\t\u0010W\u001a\u00020\u0012H\u00d6\u0001J\u0013\u0010X\u001a\u00020Y2\b\u0010Z\u001a\u0004\u0018\u00010[H\u00d6\u0003J\t\u0010\\\u001a\u00020\u0012H\u00d6\u0001J.\u0010]\u001a\u00020^2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010_\u001a\u00020\u000f2\u0006\u0010`\u001a\u00020\u000f2\u0006\u0010a\u001a\u00020\u000f2\u0006\u0010b\u001a\u00020\u000fJ\t\u0010c\u001a\u00020\u000fH\u00d6\u0001J\u0019\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020g2\u0006\u0010h\u001a\u00020\u0012H\u00d6\u0001R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0016\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R \u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\'\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\'\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\'\u001a\u0004\b*\u0010$\"\u0004\b+\u0010&R\"\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\'\u001a\u0004\b,\u0010$\"\u0004\b-\u0010&R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00102\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\'\u001a\u0004\b3\u0010$\"\u0004\b4\u0010&R\"\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\'\u001a\u0004\b5\u0010$\"\u0004\b6\u0010&R \u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u001e\"\u0004\b8\u0010 R \u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\'\u001a\u0004\b=\u0010$\"\u0004\b>\u0010&R \u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u001e\"\u0004\b@\u0010 R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\'\u001a\u0004\bA\u0010$\"\u0004\bB\u0010&R\"\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\'\u001a\u0004\bC\u0010$\"\u0004\bD\u0010&\u00a8\u0006i"}, d2 = {"Lcom/intellihealth/truemeds/data/model/orderflow/CartBillDetails;", "Landroid/os/Parcelable;", "orderId", "", "savingValue", "", "discount", "tmCash", "deliveryCharge", "tmCredit", "packagingCharge", "couponDiscountAmt", "mrp", "payableAmt", "savingsText", "", "paymentMode", "addMoreForFreeDelivery", "", "couponCode", "paymentSelectionInfo", "Lcom/intellihealth/truemeds/data/model/orderflow/PaymentSelectionInfo;", "billDetailsTitle", "(Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/intellihealth/truemeds/data/model/orderflow/PaymentSelectionInfo;Ljava/lang/String;)V", "getAddMoreForFreeDelivery", "()Ljava/lang/Integer;", "setAddMoreForFreeDelivery", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getBillDetailsTitle", "()Ljava/lang/String;", "setBillDetailsTitle", "(Ljava/lang/String;)V", "getCouponCode", "setCouponCode", "getCouponDiscountAmt", "()Ljava/lang/Double;", "setCouponDiscountAmt", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getDeliveryCharge", "setDeliveryCharge", "getDiscount", "setDiscount", "getMrp", "setMrp", "getOrderId", "()Ljava/lang/Long;", "setOrderId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getPackagingCharge", "setPackagingCharge", "getPayableAmt", "setPayableAmt", "getPaymentMode", "setPaymentMode", "getPaymentSelectionInfo", "()Lcom/intellihealth/truemeds/data/model/orderflow/PaymentSelectionInfo;", "setPaymentSelectionInfo", "(Lcom/intellihealth/truemeds/data/model/orderflow/PaymentSelectionInfo;)V", "getSavingValue", "setSavingValue", "getSavingsText", "setSavingsText", "getTmCash", "setTmCash", "getTmCredit", "setTmCredit", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/intellihealth/truemeds/data/model/orderflow/PaymentSelectionInfo;Ljava/lang/String;)Lcom/intellihealth/truemeds/data/model/orderflow/CartBillDetails;", "describeContents", "equals", "", "other", "", "hashCode", "toSdkModel", "Lcom/intellihealth/salt/models/BillDetailsModel;", "totalPayable", "gst", "sellerPackagingCharge", "saveOrderPrice", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_stageAndroidDebug"})
@kotlinx.parcelize.Parcelize()
public final class CartBillDetails implements android.os.Parcelable {
    @com.google.gson.annotations.SerializedName(value = "orderId")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long orderId;
    @com.google.gson.annotations.SerializedName(value = "savingValue")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double savingValue;
    @com.google.gson.annotations.SerializedName(value = "discount")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double discount;
    @com.google.gson.annotations.SerializedName(value = "tmCash")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double tmCash;
    @com.google.gson.annotations.SerializedName(value = "deliveryCharge")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double deliveryCharge;
    @com.google.gson.annotations.SerializedName(value = "tmCredit")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double tmCredit;
    @com.google.gson.annotations.SerializedName(value = "packagingCharge")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double packagingCharge;
    @com.google.gson.annotations.SerializedName(value = "couponDiscountAmt")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double couponDiscountAmt;
    @com.google.gson.annotations.SerializedName(value = "mrp")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double mrp;
    @com.google.gson.annotations.SerializedName(value = "payableAmt")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double payableAmt;
    @com.google.gson.annotations.SerializedName(value = "savingsText")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String savingsText;
    @com.google.gson.annotations.SerializedName(value = "paymentMode")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String paymentMode;
    @com.google.gson.annotations.SerializedName(value = "addMoreForFreeDelivery")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer addMoreForFreeDelivery;
    @com.google.gson.annotations.SerializedName(value = "couponCode")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String couponCode;
    @com.google.gson.annotations.SerializedName(value = "paymentSelectionInfo")
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.data.model.orderflow.PaymentSelectionInfo paymentSelectionInfo;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String billDetailsTitle;
    
    public CartBillDetails(@org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, @org.jetbrains.annotations.Nullable()
    java.lang.Double savingValue, @org.jetbrains.annotations.Nullable()
    java.lang.Double discount, @org.jetbrains.annotations.Nullable()
    java.lang.Double tmCash, @org.jetbrains.annotations.Nullable()
    java.lang.Double deliveryCharge, @org.jetbrains.annotations.Nullable()
    java.lang.Double tmCredit, @org.jetbrains.annotations.Nullable()
    java.lang.Double packagingCharge, @org.jetbrains.annotations.Nullable()
    java.lang.Double couponDiscountAmt, @org.jetbrains.annotations.Nullable()
    java.lang.Double mrp, @org.jetbrains.annotations.Nullable()
    java.lang.Double payableAmt, @org.jetbrains.annotations.Nullable()
    java.lang.String savingsText, @org.jetbrains.annotations.Nullable()
    java.lang.String paymentMode, @org.jetbrains.annotations.Nullable()
    java.lang.Integer addMoreForFreeDelivery, @org.jetbrains.annotations.Nullable()
    java.lang.String couponCode, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.orderflow.PaymentSelectionInfo paymentSelectionInfo, @org.jetbrains.annotations.NotNull()
    java.lang.String billDetailsTitle) {
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
    public final java.lang.Double getTmCash() {
        return null;
    }
    
    public final void setTmCash(@org.jetbrains.annotations.Nullable()
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
    public final java.lang.Double getTmCredit() {
        return null;
    }
    
    public final void setTmCredit(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getPackagingCharge() {
        return null;
    }
    
    public final void setPackagingCharge(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getCouponDiscountAmt() {
        return null;
    }
    
    public final void setCouponDiscountAmt(@org.jetbrains.annotations.Nullable()
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
    public final java.lang.Double getPayableAmt() {
        return null;
    }
    
    public final void setPayableAmt(@org.jetbrains.annotations.Nullable()
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
    public final java.lang.String getPaymentMode() {
        return null;
    }
    
    public final void setPaymentMode(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
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
    public final com.intellihealth.truemeds.data.model.orderflow.PaymentSelectionInfo getPaymentSelectionInfo() {
        return null;
    }
    
    public final void setPaymentSelectionInfo(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.orderflow.PaymentSelectionInfo p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBillDetailsTitle() {
        return null;
    }
    
    public final void setBillDetailsTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.salt.models.BillDetailsModel toSdkModel(@org.jetbrains.annotations.NotNull()
    java.lang.String billDetailsTitle, @org.jetbrains.annotations.NotNull()
    java.lang.String totalPayable, @org.jetbrains.annotations.NotNull()
    java.lang.String gst, @org.jetbrains.annotations.NotNull()
    java.lang.String sellerPackagingCharge, @org.jetbrains.annotations.NotNull()
    java.lang.String saveOrderPrice) {
        return null;
    }
    
    public CartBillDetails() {
        super();
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
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.orderflow.PaymentSelectionInfo component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component16() {
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
    public final java.lang.Double component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component5() {
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
    public final java.lang.Double component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.orderflow.CartBillDetails copy(@org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, @org.jetbrains.annotations.Nullable()
    java.lang.Double savingValue, @org.jetbrains.annotations.Nullable()
    java.lang.Double discount, @org.jetbrains.annotations.Nullable()
    java.lang.Double tmCash, @org.jetbrains.annotations.Nullable()
    java.lang.Double deliveryCharge, @org.jetbrains.annotations.Nullable()
    java.lang.Double tmCredit, @org.jetbrains.annotations.Nullable()
    java.lang.Double packagingCharge, @org.jetbrains.annotations.Nullable()
    java.lang.Double couponDiscountAmt, @org.jetbrains.annotations.Nullable()
    java.lang.Double mrp, @org.jetbrains.annotations.Nullable()
    java.lang.Double payableAmt, @org.jetbrains.annotations.Nullable()
    java.lang.String savingsText, @org.jetbrains.annotations.Nullable()
    java.lang.String paymentMode, @org.jetbrains.annotations.Nullable()
    java.lang.Integer addMoreForFreeDelivery, @org.jetbrains.annotations.Nullable()
    java.lang.String couponCode, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.orderflow.PaymentSelectionInfo paymentSelectionInfo, @org.jetbrains.annotations.NotNull()
    java.lang.String billDetailsTitle) {
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