package com.intellihealth.truemeds.presentation.analytics.model.mixpanel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\bm\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u00b3\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u001fJ\u000b\u0010X\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010Y\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010*J\u0010\u0010Z\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010*J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\\\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010*J\u000b\u0010]\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010^\u001a\u00020\u0005H\u00c6\u0003J\u0010\u0010_\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010*J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010c\u001a\u00020\u0005H\u00c6\u0003J\u0010\u0010d\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010*J\u0010\u0010e\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010*J\u0010\u0010f\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010*J\u0010\u0010g\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010*J\t\u0010h\u001a\u00020\u0005H\u00c6\u0003J\t\u0010i\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010k\u001a\u00020\u0005H\u00c6\u0003J\u0010\u0010l\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010*J\u000b\u0010m\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010p\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010*J\u000b\u0010q\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u00bc\u0002\u0010r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u00052\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010sJ\u0013\u0010t\u001a\u00020\u00052\b\u0010u\u001a\u0004\u0018\u00010vH\u00d6\u0003J\t\u0010w\u001a\u00020xH\u00d6\u0001J\u001a\u0010y\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020v0z2\u0006\u0010{\u001a\u00020\u0005J\u0006\u0010|\u001a\u00020}J\t\u0010~\u001a\u00020\u0003H\u00d6\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010\u001d\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010$\"\u0004\b%\u0010&R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010$\"\u0004\b\'\u0010&R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010$\"\u0004\b(\u0010&R\"\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010-\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R \u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010!\"\u0004\b/\u0010#R\"\u0010\f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010-\u001a\u0004\b0\u0010*\"\u0004\b1\u0010,R \u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010!\"\u0004\b3\u0010#R\"\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010-\u001a\u0004\b4\u0010*\"\u0004\b5\u0010,R \u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010!\"\u0004\b7\u0010#R\"\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010-\u001a\u0004\b8\u0010*\"\u0004\b9\u0010,R \u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010!\"\u0004\b;\u0010#R\"\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010-\u001a\u0004\b<\u0010*\"\u0004\b=\u0010,R \u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010!\"\u0004\b?\u0010#R\u001e\u0010\u0013\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010$\"\u0004\bA\u0010&R\"\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010-\u001a\u0004\bB\u0010*\"\u0004\bC\u0010,R \u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010!\"\u0004\bE\u0010#R \u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010!\"\u0004\bG\u0010#R \u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010!\"\u0004\bI\u0010#R\"\u0010\u0018\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010-\u001a\u0004\bJ\u0010*\"\u0004\bK\u0010,R \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010!\"\u0004\bM\u0010#R\"\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010-\u001a\u0004\bN\u0010*\"\u0004\bO\u0010,R \u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bP\u0010!\"\u0004\bQ\u0010#R\"\u0010\u001a\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010-\u001a\u0004\bR\u0010*\"\u0004\bS\u0010,R\"\u0010\u001b\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010-\u001a\u0004\bT\u0010*\"\u0004\bU\u0010,R\u001e\u0010\u001c\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bV\u0010$\"\u0004\bW\u0010&\u00a8\u0006\u007f"}, d2 = {"Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxItemAdded;", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxCommonWithMultipleValues;", "brand", "", "isOtc", "", "isSubstitute", "orgProductDiscountPercentage", "", "subsProductId", "subsProductName", "orgProductId", "orgProductMrp", "orgProductName", "orgProductSalePrice", "productDiscountPercentage", "productId", "productMrp", "productName", "productPictureExists", "productSalePrice", "qc", "rt", "subsId", "subsProductDiscountPercentage", "subsProductMrp", "subsProductSalePrice", "subsSavings", "substituteAvailable", "isChronic", "packSizeDifference", "(Ljava/lang/String;ZZLjava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;ZLjava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ZZLjava/lang/String;)V", "getBrand", "()Ljava/lang/String;", "setBrand", "(Ljava/lang/String;)V", "()Z", "setChronic", "(Z)V", "setOtc", "setSubstitute", "getOrgProductDiscountPercentage", "()Ljava/lang/Double;", "setOrgProductDiscountPercentage", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getOrgProductId", "setOrgProductId", "getOrgProductMrp", "setOrgProductMrp", "getOrgProductName", "setOrgProductName", "getOrgProductSalePrice", "setOrgProductSalePrice", "getPackSizeDifference", "setPackSizeDifference", "getProductDiscountPercentage", "setProductDiscountPercentage", "getProductId", "setProductId", "getProductMrp", "setProductMrp", "getProductName", "setProductName", "getProductPictureExists", "setProductPictureExists", "getProductSalePrice", "setProductSalePrice", "getQc", "setQc", "getRt", "setRt", "getSubsId", "setSubsId", "getSubsProductDiscountPercentage", "setSubsProductDiscountPercentage", "getSubsProductId", "setSubsProductId", "getSubsProductMrp", "setSubsProductMrp", "getSubsProductName", "setSubsProductName", "getSubsProductSalePrice", "setSubsProductSalePrice", "getSubsSavings", "setSubsSavings", "getSubstituteAvailable", "setSubstituteAvailable", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;ZZLjava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;ZLjava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ZZLjava/lang/String;)Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxItemAdded;", "equals", "other", "", "hashCode", "", "toAppsFlyer", "", "isSubstitutable", "toCleverTap", "Lcom/intellihealth/truemeds/data/model/clevertap/CtItemAdded;", "toString", "app_stageAndroidDebug"})
public final class MxItemAdded extends com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxCommonWithMultipleValues {
    @com.google.gson.annotations.SerializedName(value = "brand")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String brand;
    @com.google.gson.annotations.SerializedName(value = "is_otc")
    private boolean isOtc;
    @com.google.gson.annotations.SerializedName(value = "is_substitute")
    private boolean isSubstitute;
    @com.google.gson.annotations.SerializedName(value = "org_product_discount_percentage")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double orgProductDiscountPercentage;
    @com.google.gson.annotations.SerializedName(value = "subs_product_id")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String subsProductId;
    @com.google.gson.annotations.SerializedName(value = "subs_product_name")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String subsProductName;
    @com.google.gson.annotations.SerializedName(value = "org_product_id")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String orgProductId;
    @com.google.gson.annotations.SerializedName(value = "org_product_mrp")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double orgProductMrp;
    @com.google.gson.annotations.SerializedName(value = "org_product_name")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String orgProductName;
    @com.google.gson.annotations.SerializedName(value = "org_product_sale_price")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double orgProductSalePrice;
    @com.google.gson.annotations.SerializedName(value = "product_discount_percentage")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double productDiscountPercentage;
    @com.google.gson.annotations.SerializedName(value = "product_id")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String productId;
    @com.google.gson.annotations.SerializedName(value = "product_mrp")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double productMrp;
    @com.google.gson.annotations.SerializedName(value = "product_name")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String productName;
    @com.google.gson.annotations.SerializedName(value = "product_picture_exists")
    private boolean productPictureExists;
    @com.google.gson.annotations.SerializedName(value = "product_sale_price")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double productSalePrice;
    @com.google.gson.annotations.SerializedName(value = "_qc")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String qc;
    @com.google.gson.annotations.SerializedName(value = "_rt")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String rt;
    @com.google.gson.annotations.SerializedName(value = "subs_id")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String subsId;
    @com.google.gson.annotations.SerializedName(value = "subs_product_discount_percentage")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double subsProductDiscountPercentage;
    @com.google.gson.annotations.SerializedName(value = "subs_product_mrp")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double subsProductMrp;
    @com.google.gson.annotations.SerializedName(value = "subs_product_sale_price")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double subsProductSalePrice;
    @com.google.gson.annotations.SerializedName(value = "subs_savings")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double subsSavings;
    @com.google.gson.annotations.SerializedName(value = "substitute_available")
    private boolean substituteAvailable;
    @com.google.gson.annotations.SerializedName(value = "is_chronic")
    private boolean isChronic;
    @com.google.gson.annotations.SerializedName(value = "pack_size_difference")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String packSizeDifference;
    
    public MxItemAdded(@org.jetbrains.annotations.Nullable()
    java.lang.String brand, boolean isOtc, boolean isSubstitute, @org.jetbrains.annotations.Nullable()
    java.lang.Double orgProductDiscountPercentage, @org.jetbrains.annotations.Nullable()
    java.lang.String subsProductId, @org.jetbrains.annotations.Nullable()
    java.lang.String subsProductName, @org.jetbrains.annotations.Nullable()
    java.lang.String orgProductId, @org.jetbrains.annotations.Nullable()
    java.lang.Double orgProductMrp, @org.jetbrains.annotations.Nullable()
    java.lang.String orgProductName, @org.jetbrains.annotations.Nullable()
    java.lang.Double orgProductSalePrice, @org.jetbrains.annotations.Nullable()
    java.lang.Double productDiscountPercentage, @org.jetbrains.annotations.Nullable()
    java.lang.String productId, @org.jetbrains.annotations.Nullable()
    java.lang.Double productMrp, @org.jetbrains.annotations.Nullable()
    java.lang.String productName, boolean productPictureExists, @org.jetbrains.annotations.Nullable()
    java.lang.Double productSalePrice, @org.jetbrains.annotations.Nullable()
    java.lang.String qc, @org.jetbrains.annotations.Nullable()
    java.lang.String rt, @org.jetbrains.annotations.Nullable()
    java.lang.String subsId, @org.jetbrains.annotations.Nullable()
    java.lang.Double subsProductDiscountPercentage, @org.jetbrains.annotations.Nullable()
    java.lang.Double subsProductMrp, @org.jetbrains.annotations.Nullable()
    java.lang.Double subsProductSalePrice, @org.jetbrains.annotations.Nullable()
    java.lang.Double subsSavings, boolean substituteAvailable, boolean isChronic, @org.jetbrains.annotations.Nullable()
    java.lang.String packSizeDifference) {
        super(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBrand() {
        return null;
    }
    
    public final void setBrand(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean isOtc() {
        return false;
    }
    
    public final void setOtc(boolean p0) {
    }
    
    public final boolean isSubstitute() {
        return false;
    }
    
    public final void setSubstitute(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getOrgProductDiscountPercentage() {
        return null;
    }
    
    public final void setOrgProductDiscountPercentage(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSubsProductId() {
        return null;
    }
    
    public final void setSubsProductId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSubsProductName() {
        return null;
    }
    
    public final void setSubsProductName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOrgProductId() {
        return null;
    }
    
    public final void setOrgProductId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getOrgProductMrp() {
        return null;
    }
    
    public final void setOrgProductMrp(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOrgProductName() {
        return null;
    }
    
    public final void setOrgProductName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getOrgProductSalePrice() {
        return null;
    }
    
    public final void setOrgProductSalePrice(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getProductDiscountPercentage() {
        return null;
    }
    
    public final void setProductDiscountPercentage(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getProductId() {
        return null;
    }
    
    public final void setProductId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getProductMrp() {
        return null;
    }
    
    public final void setProductMrp(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getProductName() {
        return null;
    }
    
    public final void setProductName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean getProductPictureExists() {
        return false;
    }
    
    public final void setProductPictureExists(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getProductSalePrice() {
        return null;
    }
    
    public final void setProductSalePrice(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getQc() {
        return null;
    }
    
    public final void setQc(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRt() {
        return null;
    }
    
    public final void setRt(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSubsId() {
        return null;
    }
    
    public final void setSubsId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getSubsProductDiscountPercentage() {
        return null;
    }
    
    public final void setSubsProductDiscountPercentage(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getSubsProductMrp() {
        return null;
    }
    
    public final void setSubsProductMrp(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getSubsProductSalePrice() {
        return null;
    }
    
    public final void setSubsProductSalePrice(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getSubsSavings() {
        return null;
    }
    
    public final void setSubsSavings(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    public final boolean getSubstituteAvailable() {
        return false;
    }
    
    public final void setSubstituteAvailable(boolean p0) {
    }
    
    public final boolean isChronic() {
        return false;
    }
    
    public final void setChronic(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPackSizeDifference() {
        return null;
    }
    
    public final void setPackSizeDifference(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.clevertap.CtItemAdded toCleverTap() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.Object> toAppsFlyer(boolean isSubstitutable) {
        return null;
    }
    
    public MxItemAdded() {
        super(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
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
    public final java.lang.Double component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component14() {
        return null;
    }
    
    public final boolean component15() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component19() {
        return null;
    }
    
    public final boolean component2() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component23() {
        return null;
    }
    
    public final boolean component24() {
        return false;
    }
    
    public final boolean component25() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component26() {
        return null;
    }
    
    public final boolean component3() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component4() {
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
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxItemAdded copy(@org.jetbrains.annotations.Nullable()
    java.lang.String brand, boolean isOtc, boolean isSubstitute, @org.jetbrains.annotations.Nullable()
    java.lang.Double orgProductDiscountPercentage, @org.jetbrains.annotations.Nullable()
    java.lang.String subsProductId, @org.jetbrains.annotations.Nullable()
    java.lang.String subsProductName, @org.jetbrains.annotations.Nullable()
    java.lang.String orgProductId, @org.jetbrains.annotations.Nullable()
    java.lang.Double orgProductMrp, @org.jetbrains.annotations.Nullable()
    java.lang.String orgProductName, @org.jetbrains.annotations.Nullable()
    java.lang.Double orgProductSalePrice, @org.jetbrains.annotations.Nullable()
    java.lang.Double productDiscountPercentage, @org.jetbrains.annotations.Nullable()
    java.lang.String productId, @org.jetbrains.annotations.Nullable()
    java.lang.Double productMrp, @org.jetbrains.annotations.Nullable()
    java.lang.String productName, boolean productPictureExists, @org.jetbrains.annotations.Nullable()
    java.lang.Double productSalePrice, @org.jetbrains.annotations.Nullable()
    java.lang.String qc, @org.jetbrains.annotations.Nullable()
    java.lang.String rt, @org.jetbrains.annotations.Nullable()
    java.lang.String subsId, @org.jetbrains.annotations.Nullable()
    java.lang.Double subsProductDiscountPercentage, @org.jetbrains.annotations.Nullable()
    java.lang.Double subsProductMrp, @org.jetbrains.annotations.Nullable()
    java.lang.Double subsProductSalePrice, @org.jetbrains.annotations.Nullable()
    java.lang.Double subsSavings, boolean substituteAvailable, boolean isChronic, @org.jetbrains.annotations.Nullable()
    java.lang.String packSizeDifference) {
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