package com.intellihealth.truemeds.presentation.analytics.model.mixpanel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\bX\b\u0086\b\u0018\u00002\u00020\u0001B\u00fb\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u001cJ\u000b\u0010R\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010U\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0002\u00109J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010X\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003\u00a2\u0006\u0002\u0010BJ\u0010\u0010Y\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0002\u00109J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010]\u001a\u00020\u0005H\u00c6\u0003J\u0010\u0010^\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003\u00a2\u0006\u0002\u0010BJ\u000b\u0010_\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010`\u001a\u00020\u0005H\u00c6\u0003J\t\u0010a\u001a\u00020\u0005H\u00c6\u0003J\u0010\u0010b\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010(J\u000b\u0010c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0084\u0002\u0010g\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010hJ\u0013\u0010i\u001a\u00020\u00052\b\u0010j\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010k\u001a\u00020\u0015H\u00d6\u0001J\t\u0010l\u001a\u00020\u0003H\u00d6\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010!\"\u0004\b\"\u0010#R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010!\"\u0004\b$\u0010#R\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R\"\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010+\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R \u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001e\"\u0004\b-\u0010 R \u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001e\"\u0004\b/\u0010 R \u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001e\"\u0004\b1\u0010 R \u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001e\"\u0004\b3\u0010 R \u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001e\"\u0004\b5\u0010 R \u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u001e\"\u0004\b7\u0010 R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010<\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R \u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u001e\"\u0004\b>\u0010 R \u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u001e\"\u0004\b@\u0010 R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010E\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010<\u001a\u0004\bF\u00109\"\u0004\bG\u0010;R \u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\u001e\"\u0004\bI\u0010 R \u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\u001e\"\u0004\bK\u0010 R \u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u001e\"\u0004\bM\u0010 R\"\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010E\u001a\u0004\bN\u0010B\"\u0004\bO\u0010DR \u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bP\u0010\u001e\"\u0004\bQ\u0010 \u00a8\u0006m"}, d2 = {"Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxItemAppOrderPlaced;", "", "clickedOnPage", "", "isReorder", "", "isSubstitute", "itemIsOtc", "orderId", "", "pageSection", "productBrandName", "productDiscountPercentage", "productDrugType", "productId", "productManufacturer", "productMrp", "", "productName", "productPack", "productQtySold", "", "productSalePrice", "productSalt", "sectionHeading", "sectionIndex", "subsId", "whId", "(Ljava/lang/String;ZZZLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getClickedOnPage", "()Ljava/lang/String;", "setClickedOnPage", "(Ljava/lang/String;)V", "()Z", "setReorder", "(Z)V", "setSubstitute", "getItemIsOtc", "setItemIsOtc", "getOrderId", "()Ljava/lang/Long;", "setOrderId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getPageSection", "setPageSection", "getProductBrandName", "setProductBrandName", "getProductDiscountPercentage", "setProductDiscountPercentage", "getProductDrugType", "setProductDrugType", "getProductId", "setProductId", "getProductManufacturer", "setProductManufacturer", "getProductMrp", "()Ljava/lang/Double;", "setProductMrp", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getProductName", "setProductName", "getProductPack", "setProductPack", "getProductQtySold", "()Ljava/lang/Integer;", "setProductQtySold", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getProductSalePrice", "setProductSalePrice", "getProductSalt", "setProductSalt", "getSectionHeading", "setSectionHeading", "getSectionIndex", "setSectionIndex", "getSubsId", "setSubsId", "getWhId", "setWhId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;ZZZLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxItemAppOrderPlaced;", "equals", "other", "hashCode", "toString", "app_prodDebug"})
public final class MxItemAppOrderPlaced {
    @com.google.gson.annotations.SerializedName(value = "clicked_on_page")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String clickedOnPage;
    @com.google.gson.annotations.SerializedName(value = "is_reorder")
    private boolean isReorder;
    @com.google.gson.annotations.SerializedName(value = "is_substitute")
    private boolean isSubstitute;
    @com.google.gson.annotations.SerializedName(value = "item_is_otc")
    private boolean itemIsOtc;
    @com.google.gson.annotations.SerializedName(value = "order_id")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long orderId;
    @com.google.gson.annotations.SerializedName(value = "page_section")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String pageSection;
    @com.google.gson.annotations.SerializedName(value = "product_brand_name")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String productBrandName;
    @com.google.gson.annotations.SerializedName(value = "product_discount_percentage")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String productDiscountPercentage;
    @com.google.gson.annotations.SerializedName(value = "product_drug_type")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String productDrugType;
    @com.google.gson.annotations.SerializedName(value = "product_id")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String productId;
    @com.google.gson.annotations.SerializedName(value = "product_manufacturer")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String productManufacturer;
    @com.google.gson.annotations.SerializedName(value = "product_mrp")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double productMrp;
    @com.google.gson.annotations.SerializedName(value = "product_name")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String productName;
    @com.google.gson.annotations.SerializedName(value = "product_pack")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String productPack;
    @com.google.gson.annotations.SerializedName(value = "product_qty_sold")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer productQtySold;
    @com.google.gson.annotations.SerializedName(value = "product_sale_price")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double productSalePrice;
    @com.google.gson.annotations.SerializedName(value = "product_salt")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String productSalt;
    @com.google.gson.annotations.SerializedName(value = "section_heading")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String sectionHeading;
    @com.google.gson.annotations.SerializedName(value = "section_index")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String sectionIndex;
    @com.google.gson.annotations.SerializedName(value = "subs_id")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer subsId;
    @com.google.gson.annotations.SerializedName(value = "wh_id")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String whId;
    
    public MxItemAppOrderPlaced(@org.jetbrains.annotations.Nullable()
    java.lang.String clickedOnPage, boolean isReorder, boolean isSubstitute, boolean itemIsOtc, @org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, @org.jetbrains.annotations.Nullable()
    java.lang.String pageSection, @org.jetbrains.annotations.Nullable()
    java.lang.String productBrandName, @org.jetbrains.annotations.Nullable()
    java.lang.String productDiscountPercentage, @org.jetbrains.annotations.Nullable()
    java.lang.String productDrugType, @org.jetbrains.annotations.Nullable()
    java.lang.String productId, @org.jetbrains.annotations.Nullable()
    java.lang.String productManufacturer, @org.jetbrains.annotations.Nullable()
    java.lang.Double productMrp, @org.jetbrains.annotations.Nullable()
    java.lang.String productName, @org.jetbrains.annotations.Nullable()
    java.lang.String productPack, @org.jetbrains.annotations.Nullable()
    java.lang.Integer productQtySold, @org.jetbrains.annotations.Nullable()
    java.lang.Double productSalePrice, @org.jetbrains.annotations.Nullable()
    java.lang.String productSalt, @org.jetbrains.annotations.Nullable()
    java.lang.String sectionHeading, @org.jetbrains.annotations.Nullable()
    java.lang.String sectionIndex, @org.jetbrains.annotations.Nullable()
    java.lang.Integer subsId, @org.jetbrains.annotations.Nullable()
    java.lang.String whId) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getClickedOnPage() {
        return null;
    }
    
    public final void setClickedOnPage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean isReorder() {
        return false;
    }
    
    public final void setReorder(boolean p0) {
    }
    
    public final boolean isSubstitute() {
        return false;
    }
    
    public final void setSubstitute(boolean p0) {
    }
    
    public final boolean getItemIsOtc() {
        return false;
    }
    
    public final void setItemIsOtc(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getOrderId() {
        return null;
    }
    
    public final void setOrderId(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPageSection() {
        return null;
    }
    
    public final void setPageSection(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getProductBrandName() {
        return null;
    }
    
    public final void setProductBrandName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getProductDiscountPercentage() {
        return null;
    }
    
    public final void setProductDiscountPercentage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getProductDrugType() {
        return null;
    }
    
    public final void setProductDrugType(@org.jetbrains.annotations.Nullable()
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
    public final java.lang.String getProductManufacturer() {
        return null;
    }
    
    public final void setProductManufacturer(@org.jetbrains.annotations.Nullable()
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getProductPack() {
        return null;
    }
    
    public final void setProductPack(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getProductQtySold() {
        return null;
    }
    
    public final void setProductQtySold(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getProductSalePrice() {
        return null;
    }
    
    public final void setProductSalePrice(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getProductSalt() {
        return null;
    }
    
    public final void setProductSalt(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSectionHeading() {
        return null;
    }
    
    public final void setSectionHeading(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSectionIndex() {
        return null;
    }
    
    public final void setSectionIndex(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSubsId() {
        return null;
    }
    
    public final void setSubsId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getWhId() {
        return null;
    }
    
    public final void setWhId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public MxItemAppOrderPlaced() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
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
    public final java.lang.Integer component15() {
        return null;
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
    public final java.lang.Integer component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component21() {
        return null;
    }
    
    public final boolean component3() {
        return false;
    }
    
    public final boolean component4() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component5() {
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
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxItemAppOrderPlaced copy(@org.jetbrains.annotations.Nullable()
    java.lang.String clickedOnPage, boolean isReorder, boolean isSubstitute, boolean itemIsOtc, @org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, @org.jetbrains.annotations.Nullable()
    java.lang.String pageSection, @org.jetbrains.annotations.Nullable()
    java.lang.String productBrandName, @org.jetbrains.annotations.Nullable()
    java.lang.String productDiscountPercentage, @org.jetbrains.annotations.Nullable()
    java.lang.String productDrugType, @org.jetbrains.annotations.Nullable()
    java.lang.String productId, @org.jetbrains.annotations.Nullable()
    java.lang.String productManufacturer, @org.jetbrains.annotations.Nullable()
    java.lang.Double productMrp, @org.jetbrains.annotations.Nullable()
    java.lang.String productName, @org.jetbrains.annotations.Nullable()
    java.lang.String productPack, @org.jetbrains.annotations.Nullable()
    java.lang.Integer productQtySold, @org.jetbrains.annotations.Nullable()
    java.lang.Double productSalePrice, @org.jetbrains.annotations.Nullable()
    java.lang.String productSalt, @org.jetbrains.annotations.Nullable()
    java.lang.String sectionHeading, @org.jetbrains.annotations.Nullable()
    java.lang.String sectionIndex, @org.jetbrains.annotations.Nullable()
    java.lang.Integer subsId, @org.jetbrains.annotations.Nullable()
    java.lang.String whId) {
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