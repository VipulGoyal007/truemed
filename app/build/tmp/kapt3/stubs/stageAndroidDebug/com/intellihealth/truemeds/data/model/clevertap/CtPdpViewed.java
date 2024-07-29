package com.intellihealth.truemeds.data.model.clevertap;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b9\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0013J\u000b\u00108\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0002\u00104J\u0010\u0010=\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019J\u0010\u0010>\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019J\u0010\u0010?\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010E\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019J\u00b6\u0001\u0010F\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010GJ\u0013\u0010H\u001a\u00020\u00112\b\u0010I\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010J\u001a\u00020KH\u00d6\u0001J\t\u0010L\u001a\u00020\u0003H\u00d6\u0001R \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0015\"\u0004\b\u001e\u0010\u0017R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u001f\u0010\u0019\"\u0004\b \u0010\u001bR \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0015\"\u0004\b\"\u0010\u0017R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b#\u0010\u0019\"\u0004\b$\u0010\u001bR \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0015\"\u0004\b&\u0010\u0017R \u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0015\"\u0004\b(\u0010\u0017R \u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0015\"\u0004\b*\u0010\u0017R\"\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b+\u0010\u0019\"\u0004\b,\u0010\u001bR \u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0015\"\u0004\b.\u0010\u0017R\"\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b/\u0010\u0019\"\u0004\b0\u0010\u001bR \u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0015\"\u0004\b2\u0010\u0017R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00107\u001a\u0004\b3\u00104\"\u0004\b5\u00106\u00a8\u0006M"}, d2 = {"Lcom/intellihealth/truemeds/data/model/clevertap/CtPdpViewed;", "", "orgProductName", "", "orgProductMrp", "", "orgProductSalePrice", "orgProductDiscountPercentage", "productId", "productName", "subsProductId", "subsProductName", "subsProductMrp", "subsProductSalePrice", "subsProductDiscountPercentage", "subsSavings", "substituteAvailable", "", "productMrp", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Double;)V", "getOrgProductDiscountPercentage", "()Ljava/lang/String;", "setOrgProductDiscountPercentage", "(Ljava/lang/String;)V", "getOrgProductMrp", "()Ljava/lang/Double;", "setOrgProductMrp", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getOrgProductName", "setOrgProductName", "getOrgProductSalePrice", "setOrgProductSalePrice", "getProductId", "setProductId", "getProductMrp", "setProductMrp", "getProductName", "setProductName", "getSubsProductDiscountPercentage", "setSubsProductDiscountPercentage", "getSubsProductId", "setSubsProductId", "getSubsProductMrp", "setSubsProductMrp", "getSubsProductName", "setSubsProductName", "getSubsProductSalePrice", "setSubsProductSalePrice", "getSubsSavings", "setSubsSavings", "getSubstituteAvailable", "()Ljava/lang/Boolean;", "setSubstituteAvailable", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Double;)Lcom/intellihealth/truemeds/data/model/clevertap/CtPdpViewed;", "equals", "other", "hashCode", "", "toString", "app_stageAndroidDebug"})
public final class CtPdpViewed {
    @com.google.gson.annotations.SerializedName(value = "org_product_name")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String orgProductName;
    @com.google.gson.annotations.SerializedName(value = "org_product_mrp")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double orgProductMrp;
    @com.google.gson.annotations.SerializedName(value = "org_product_sale_price")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double orgProductSalePrice;
    @com.google.gson.annotations.SerializedName(value = "org_product_discount_percentage")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String orgProductDiscountPercentage;
    @com.google.gson.annotations.SerializedName(value = "product_id")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String productId;
    @com.google.gson.annotations.SerializedName(value = "product_name")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String productName;
    @com.google.gson.annotations.SerializedName(value = "subs_product_id")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String subsProductId;
    @com.google.gson.annotations.SerializedName(value = "subs_product_name")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String subsProductName;
    @com.google.gson.annotations.SerializedName(value = "subs_product_mrp")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double subsProductMrp;
    @com.google.gson.annotations.SerializedName(value = "subs_product_sale_price")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double subsProductSalePrice;
    @com.google.gson.annotations.SerializedName(value = "subs_product_discount_percentage")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String subsProductDiscountPercentage;
    @com.google.gson.annotations.SerializedName(value = "subs_savings")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String subsSavings;
    @com.google.gson.annotations.SerializedName(value = "substitute_available")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean substituteAvailable;
    @com.google.gson.annotations.SerializedName(value = "product_mrp")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double productMrp;
    
    public CtPdpViewed(@org.jetbrains.annotations.Nullable()
    java.lang.String orgProductName, @org.jetbrains.annotations.Nullable()
    java.lang.Double orgProductMrp, @org.jetbrains.annotations.Nullable()
    java.lang.Double orgProductSalePrice, @org.jetbrains.annotations.Nullable()
    java.lang.String orgProductDiscountPercentage, @org.jetbrains.annotations.Nullable()
    java.lang.String productId, @org.jetbrains.annotations.Nullable()
    java.lang.String productName, @org.jetbrains.annotations.Nullable()
    java.lang.String subsProductId, @org.jetbrains.annotations.Nullable()
    java.lang.String subsProductName, @org.jetbrains.annotations.Nullable()
    java.lang.Double subsProductMrp, @org.jetbrains.annotations.Nullable()
    java.lang.Double subsProductSalePrice, @org.jetbrains.annotations.Nullable()
    java.lang.String subsProductDiscountPercentage, @org.jetbrains.annotations.Nullable()
    java.lang.String subsSavings, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean substituteAvailable, @org.jetbrains.annotations.Nullable()
    java.lang.Double productMrp) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOrgProductName() {
        return null;
    }
    
    public final void setOrgProductName(@org.jetbrains.annotations.Nullable()
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
    public final java.lang.Double getOrgProductSalePrice() {
        return null;
    }
    
    public final void setOrgProductSalePrice(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOrgProductDiscountPercentage() {
        return null;
    }
    
    public final void setOrgProductDiscountPercentage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getProductId() {
        return null;
    }
    
    public final void setProductId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getProductName() {
        return null;
    }
    
    public final void setProductName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
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
    public final java.lang.String getSubsProductDiscountPercentage() {
        return null;
    }
    
    public final void setSubsProductDiscountPercentage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSubsSavings() {
        return null;
    }
    
    public final void setSubsSavings(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getSubstituteAvailable() {
        return null;
    }
    
    public final void setSubstituteAvailable(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getProductMrp() {
        return null;
    }
    
    public final void setProductMrp(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    public CtPdpViewed() {
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
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component14() {
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
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.clevertap.CtPdpViewed copy(@org.jetbrains.annotations.Nullable()
    java.lang.String orgProductName, @org.jetbrains.annotations.Nullable()
    java.lang.Double orgProductMrp, @org.jetbrains.annotations.Nullable()
    java.lang.Double orgProductSalePrice, @org.jetbrains.annotations.Nullable()
    java.lang.String orgProductDiscountPercentage, @org.jetbrains.annotations.Nullable()
    java.lang.String productId, @org.jetbrains.annotations.Nullable()
    java.lang.String productName, @org.jetbrains.annotations.Nullable()
    java.lang.String subsProductId, @org.jetbrains.annotations.Nullable()
    java.lang.String subsProductName, @org.jetbrains.annotations.Nullable()
    java.lang.Double subsProductMrp, @org.jetbrains.annotations.Nullable()
    java.lang.Double subsProductSalePrice, @org.jetbrains.annotations.Nullable()
    java.lang.String subsProductDiscountPercentage, @org.jetbrains.annotations.Nullable()
    java.lang.String subsSavings, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean substituteAvailable, @org.jetbrains.annotations.Nullable()
    java.lang.Double productMrp) {
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