package com.intellihealth.truemeds.data.model.search;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b1\b\u0086\b\u0018\u00002\u00020\u0001B}\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0002\u0010\u0010J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u000b\u00101\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016J\u0010\u00104\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016J\u0010\u00105\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016J\u0010\u00106\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\u000b\u00107\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u0086\u0001\u00109\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u00c6\u0001\u00a2\u0006\u0002\u0010:J\u0013\u0010;\u001a\u00020\u000e2\b\u0010<\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010=\u001a\u00020\u000bH\u00d6\u0001J\t\u0010>\u001a\u00020\u0003H\u00d6\u0001R \u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\r\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0012\"\u0004\b&\u0010\u0014R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0012\"\u0004\b(\u0010\u0014R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b)\u0010\u0016\"\u0004\b*\u0010\u0018R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0012\"\u0004\b,\u0010\u0014R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b-\u0010\u001a\"\u0004\b.\u0010\u001c\u00a8\u0006?"}, d2 = {"Lcom/intellihealth/truemeds/data/model/search/ProductList;", "", "skuName", "", "productCode", "productImage", "mrp", "", "sellingPrice", "discount", "maxQuantity", "", "availabilityStatus", "isAvailable", "", "suppliedByTm", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getAvailabilityStatus", "()Ljava/lang/String;", "setAvailabilityStatus", "(Ljava/lang/String;)V", "getDiscount", "()Ljava/lang/Double;", "setDiscount", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "()Ljava/lang/Boolean;", "setAvailable", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getMaxQuantity", "()Ljava/lang/Integer;", "setMaxQuantity", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getMrp", "setMrp", "getProductCode", "setProductCode", "getProductImage", "setProductImage", "getSellingPrice", "setSellingPrice", "getSkuName", "setSkuName", "getSuppliedByTm", "setSuppliedByTm", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/intellihealth/truemeds/data/model/search/ProductList;", "equals", "other", "hashCode", "toString", "app_prodDebug"})
public final class ProductList {
    @com.google.gson.annotations.SerializedName(value = "skuName")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String skuName;
    @com.google.gson.annotations.SerializedName(value = "productCode")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String productCode;
    @com.google.gson.annotations.SerializedName(value = "productImage")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String productImage;
    @com.google.gson.annotations.SerializedName(value = "mrp")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double mrp;
    @com.google.gson.annotations.SerializedName(value = "sellingPrice")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double sellingPrice;
    @com.google.gson.annotations.SerializedName(value = "discount")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double discount;
    @com.google.gson.annotations.SerializedName(value = "maxQuantity")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer maxQuantity;
    @com.google.gson.annotations.SerializedName(value = "availabilityStatus")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String availabilityStatus;
    @com.google.gson.annotations.SerializedName(value = "isAvailable")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean isAvailable;
    @com.google.gson.annotations.SerializedName(value = "suppliedByTm")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean suppliedByTm;
    
    public ProductList(@org.jetbrains.annotations.Nullable()
    java.lang.String skuName, @org.jetbrains.annotations.Nullable()
    java.lang.String productCode, @org.jetbrains.annotations.Nullable()
    java.lang.String productImage, @org.jetbrains.annotations.Nullable()
    java.lang.Double mrp, @org.jetbrains.annotations.Nullable()
    java.lang.Double sellingPrice, @org.jetbrains.annotations.Nullable()
    java.lang.Double discount, @org.jetbrains.annotations.Nullable()
    java.lang.Integer maxQuantity, @org.jetbrains.annotations.Nullable()
    java.lang.String availabilityStatus, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isAvailable, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean suppliedByTm) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSkuName() {
        return null;
    }
    
    public final void setSkuName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getProductCode() {
        return null;
    }
    
    public final void setProductCode(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getProductImage() {
        return null;
    }
    
    public final void setProductImage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getMrp() {
        return null;
    }
    
    public final void setMrp(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getSellingPrice() {
        return null;
    }
    
    public final void setSellingPrice(@org.jetbrains.annotations.Nullable()
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
    public final java.lang.Integer getMaxQuantity() {
        return null;
    }
    
    public final void setMaxQuantity(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAvailabilityStatus() {
        return null;
    }
    
    public final void setAvailabilityStatus(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isAvailable() {
        return null;
    }
    
    public final void setAvailable(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getSuppliedByTm() {
        return null;
    }
    
    public final void setSuppliedByTm(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    public ProductList() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
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
    public final java.lang.Integer component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.search.ProductList copy(@org.jetbrains.annotations.Nullable()
    java.lang.String skuName, @org.jetbrains.annotations.Nullable()
    java.lang.String productCode, @org.jetbrains.annotations.Nullable()
    java.lang.String productImage, @org.jetbrains.annotations.Nullable()
    java.lang.Double mrp, @org.jetbrains.annotations.Nullable()
    java.lang.Double sellingPrice, @org.jetbrains.annotations.Nullable()
    java.lang.Double discount, @org.jetbrains.annotations.Nullable()
    java.lang.Integer maxQuantity, @org.jetbrains.annotations.Nullable()
    java.lang.String availabilityStatus, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isAvailable, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean suppliedByTm) {
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