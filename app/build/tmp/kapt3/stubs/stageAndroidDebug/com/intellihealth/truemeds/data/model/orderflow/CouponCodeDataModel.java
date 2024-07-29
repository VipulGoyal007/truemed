package com.intellihealth.truemeds.data.model.orderflow;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\bC\b\u0086\b\u0018\u00002\u00020\u0001B\u00cd\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010$J\u000b\u00109\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003H\u00c2\u0003J\t\u0010;\u001a\u00020\u000eH\u00c2\u0003J\t\u0010<\u001a\u00020\u000eH\u00c2\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003H\u00c2\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003H\u00c2\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003H\u00c2\u0003J\t\u0010@\u001a\u00020\u000eH\u00c2\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003H\u00c2\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003H\u00c2\u0003J\t\u0010C\u001a\u00020\u0019H\u00c2\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010E\u001a\u00020\u000eH\u00c6\u0003J\t\u0010F\u001a\u00020\u000eH\u00c6\u0003J\t\u0010G\u001a\u00020\u000bH\u00c2\u0003J\t\u0010H\u001a\u00020\u000bH\u00c2\u0003J\t\u0010I\u001a\u00020\u0003H\u00c2\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003H\u00c2\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003H\u00c2\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010M\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u00108J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003H\u00c2\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003H\u00c2\u0003J\u0010\u0010R\u001a\u0004\u0018\u00010\tH\u00c2\u0003\u00a2\u0006\u0002\u00108J\u0010\u0010S\u001a\u0004\u0018\u00010\u000bH\u00c2\u0003\u00a2\u0006\u0002\u0010.J\u0010\u0010T\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010.J\t\u0010U\u001a\u00020\u000eH\u00c2\u0003J\u00d6\u0002\u0010V\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u000e2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010WJ\u0013\u0010X\u001a\u00020\u000b2\b\u0010Y\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010Z\u001a\u00020\u000eH\u00d6\u0001J\t\u0010[\u001a\u00020\u0003H\u00d6\u0001R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001a\u0010\u001b\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010&\"\u0004\b*\u0010(R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u001e\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00101\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010,R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010,R\u0012\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u00104R\u0012\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u00101R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010!\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010,R\u0013\u0010#\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010,R\u0015\u0010\"\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u00104\u001a\u0004\b7\u00108R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\\"}, d2 = {"Lcom/intellihealth/truemeds/data/model/orderflow/CouponCodeDataModel;", "", "coupon_code", "", "coupon_code_title", "coupon_code_description", "couponCodeBulletDescription", "coupon_code_id", "coupon_code_validity", "", "coupon_code_visible", "", "coupon_code_applied", "discountValue", "", "applicable_payment_mode", "min_cart_value", "offer_type_id", "image", "discountTypeName", "discountTypeValue", "max_discount", "offerId", "tncDescription", "cashbackValue", "", "cashBackActiveAfterDeliveryDays", "cashbackValidAfterActivation", "couponCodeRequired", "offersVisibleOnOrderSummary", "colorCode", "infoPanel", "offerOrderSummaryTitle", "paymentMethod", "paymentMethodId", "paymentMethodIconUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;DIIZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "getCashBackActiveAfterDeliveryDays", "()I", "setCashBackActiveAfterDeliveryDays", "(I)V", "getCashbackValidAfterActivation", "setCashbackValidAfterActivation", "getCoupon_code", "()Ljava/lang/String;", "getCoupon_code_applied", "()Ljava/lang/Boolean;", "setCoupon_code_applied", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getCoupon_code_description", "getCoupon_code_title", "Ljava/lang/Long;", "getPaymentMethod", "getPaymentMethodIconUrl", "getPaymentMethodId", "()Ljava/lang/Long;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;DIIZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/intellihealth/truemeds/data/model/orderflow/CouponCodeDataModel;", "equals", "other", "hashCode", "toString", "app_stageAndroidDebug"})
public final class CouponCodeDataModel {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String coupon_code = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String coupon_code_title = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String coupon_code_description = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String couponCodeBulletDescription = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String coupon_code_id;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long coupon_code_validity = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean coupon_code_visible = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean coupon_code_applied;
    private final int discountValue = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String applicable_payment_mode;
    private final int min_cart_value = 0;
    private final int offer_type_id = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String image = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String discountTypeName = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String discountTypeValue = null;
    private final int max_discount = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String offerId = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String tncDescription = null;
    private double cashbackValue;
    private int cashBackActiveAfterDeliveryDays;
    private int cashbackValidAfterActivation;
    private final boolean couponCodeRequired = false;
    private final boolean offersVisibleOnOrderSummary = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String colorCode = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String infoPanel = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String offerOrderSummaryTitle = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String paymentMethod = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long paymentMethodId = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String paymentMethodIconUrl = null;
    
    public CouponCodeDataModel(@org.jetbrains.annotations.Nullable()
    java.lang.String coupon_code, @org.jetbrains.annotations.Nullable()
    java.lang.String coupon_code_title, @org.jetbrains.annotations.Nullable()
    java.lang.String coupon_code_description, @org.jetbrains.annotations.Nullable()
    java.lang.String couponCodeBulletDescription, @org.jetbrains.annotations.Nullable()
    java.lang.String coupon_code_id, @org.jetbrains.annotations.Nullable()
    java.lang.Long coupon_code_validity, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean coupon_code_visible, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean coupon_code_applied, int discountValue, @org.jetbrains.annotations.Nullable()
    java.lang.String applicable_payment_mode, int min_cart_value, int offer_type_id, @org.jetbrains.annotations.Nullable()
    java.lang.String image, @org.jetbrains.annotations.Nullable()
    java.lang.String discountTypeName, @org.jetbrains.annotations.Nullable()
    java.lang.String discountTypeValue, int max_discount, @org.jetbrains.annotations.Nullable()
    java.lang.String offerId, @org.jetbrains.annotations.Nullable()
    java.lang.String tncDescription, double cashbackValue, int cashBackActiveAfterDeliveryDays, int cashbackValidAfterActivation, boolean couponCodeRequired, boolean offersVisibleOnOrderSummary, @org.jetbrains.annotations.NotNull()
    java.lang.String colorCode, @org.jetbrains.annotations.Nullable()
    java.lang.String infoPanel, @org.jetbrains.annotations.Nullable()
    java.lang.String offerOrderSummaryTitle, @org.jetbrains.annotations.Nullable()
    java.lang.String paymentMethod, @org.jetbrains.annotations.Nullable()
    java.lang.Long paymentMethodId, @org.jetbrains.annotations.Nullable()
    java.lang.String paymentMethodIconUrl) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCoupon_code() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCoupon_code_title() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCoupon_code_description() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getCoupon_code_applied() {
        return null;
    }
    
    public final void setCoupon_code_applied(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    public final int getCashBackActiveAfterDeliveryDays() {
        return 0;
    }
    
    public final void setCashBackActiveAfterDeliveryDays(int p0) {
    }
    
    public final int getCashbackValidAfterActivation() {
        return 0;
    }
    
    public final void setCashbackValidAfterActivation(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPaymentMethod() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getPaymentMethodId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPaymentMethodIconUrl() {
        return null;
    }
    
    public CouponCodeDataModel() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    private final java.lang.String component10() {
        return null;
    }
    
    private final int component11() {
        return 0;
    }
    
    private final int component12() {
        return 0;
    }
    
    private final java.lang.String component13() {
        return null;
    }
    
    private final java.lang.String component14() {
        return null;
    }
    
    private final java.lang.String component15() {
        return null;
    }
    
    private final int component16() {
        return 0;
    }
    
    private final java.lang.String component17() {
        return null;
    }
    
    private final java.lang.String component18() {
        return null;
    }
    
    private final double component19() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    public final int component20() {
        return 0;
    }
    
    public final int component21() {
        return 0;
    }
    
    private final boolean component22() {
        return false;
    }
    
    private final boolean component23() {
        return false;
    }
    
    private final java.lang.String component24() {
        return null;
    }
    
    private final java.lang.String component25() {
        return null;
    }
    
    private final java.lang.String component26() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component27() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component28() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component29() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    private final java.lang.String component4() {
        return null;
    }
    
    private final java.lang.String component5() {
        return null;
    }
    
    private final java.lang.Long component6() {
        return null;
    }
    
    private final java.lang.Boolean component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component8() {
        return null;
    }
    
    private final int component9() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.orderflow.CouponCodeDataModel copy(@org.jetbrains.annotations.Nullable()
    java.lang.String coupon_code, @org.jetbrains.annotations.Nullable()
    java.lang.String coupon_code_title, @org.jetbrains.annotations.Nullable()
    java.lang.String coupon_code_description, @org.jetbrains.annotations.Nullable()
    java.lang.String couponCodeBulletDescription, @org.jetbrains.annotations.Nullable()
    java.lang.String coupon_code_id, @org.jetbrains.annotations.Nullable()
    java.lang.Long coupon_code_validity, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean coupon_code_visible, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean coupon_code_applied, int discountValue, @org.jetbrains.annotations.Nullable()
    java.lang.String applicable_payment_mode, int min_cart_value, int offer_type_id, @org.jetbrains.annotations.Nullable()
    java.lang.String image, @org.jetbrains.annotations.Nullable()
    java.lang.String discountTypeName, @org.jetbrains.annotations.Nullable()
    java.lang.String discountTypeValue, int max_discount, @org.jetbrains.annotations.Nullable()
    java.lang.String offerId, @org.jetbrains.annotations.Nullable()
    java.lang.String tncDescription, double cashbackValue, int cashBackActiveAfterDeliveryDays, int cashbackValidAfterActivation, boolean couponCodeRequired, boolean offersVisibleOnOrderSummary, @org.jetbrains.annotations.NotNull()
    java.lang.String colorCode, @org.jetbrains.annotations.Nullable()
    java.lang.String infoPanel, @org.jetbrains.annotations.Nullable()
    java.lang.String offerOrderSummaryTitle, @org.jetbrains.annotations.Nullable()
    java.lang.String paymentMethod, @org.jetbrains.annotations.Nullable()
    java.lang.Long paymentMethodId, @org.jetbrains.annotations.Nullable()
    java.lang.String paymentMethodIconUrl) {
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