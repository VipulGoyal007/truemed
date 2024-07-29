package com.intellihealth.truemeds.data.model.mixpanel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\bV\b\u0086\b\u0018\u00002\u00020\u0001B\u00e9\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0019J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010L\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\u0010\u0010M\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\u000b\u0010N\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010P\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010*J\u0010\u0010Q\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\u0010\u0010R\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\u0010\u0010S\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010*J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010V\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\u0010\u0010W\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\u000b\u0010X\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010Z\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010*J\u0010\u0010[\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\u000b\u0010\\\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010]\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u00103J\u00f2\u0001\u0010^\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010_J\u0013\u0010`\u001a\u00020\n2\b\u0010a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010b\u001a\u00020\u000eH\u00d6\u0001J\t\u0010c\u001a\u00020\u0003H\u00d6\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001b\"\u0004\b&\u0010\u001dR \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u001b\"\u0004\b(\u0010\u001dR\"\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010-\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b.\u0010\u001f\"\u0004\b/\u0010!R \u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001b\"\u0004\b1\u0010\u001dR\"\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00106\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b7\u0010\u001f\"\u0004\b8\u0010!R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b9\u0010\u001f\"\u0004\b:\u0010!R \u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u001b\"\u0004\b<\u0010\u001dR \u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u001b\"\u0004\b>\u0010\u001dR\"\u0010\u0013\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010-\u001a\u0004\b?\u0010*\"\u0004\b@\u0010,R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\"\u001a\u0004\bA\u0010\u001f\"\u0004\bB\u0010!R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\"\u001a\u0004\bC\u0010\u001f\"\u0004\bD\u0010!R\"\u0010\u0016\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010-\u001a\u0004\bE\u0010*\"\u0004\bF\u0010,R \u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u001b\"\u0004\bH\u0010\u001dR \u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u001b\"\u0004\bJ\u0010\u001d\u00a8\u0006d"}, d2 = {"Lcom/intellihealth/truemeds/data/model/mixpanel/MxSrpAddSubBottomSheetViewed;", "", "clickedSuggestionType", "", "orgMrp", "", "orgProductDiscountPercentage", "orgProductId", "orgProductName", "orgProductPictureExists", "", "orgSalePrice", "packSizeDifference", "resultPosition", "", "subsDiscountPercentage", "subsMrp", "subsProductId", "subsProductName", "subsProductPictureExists", "subsSalePrice", "subsSavings", "substituteAvailable", "termSearched", "whId", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getClickedSuggestionType", "()Ljava/lang/String;", "setClickedSuggestionType", "(Ljava/lang/String;)V", "getOrgMrp", "()Ljava/lang/Double;", "setOrgMrp", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getOrgProductDiscountPercentage", "setOrgProductDiscountPercentage", "getOrgProductId", "setOrgProductId", "getOrgProductName", "setOrgProductName", "getOrgProductPictureExists", "()Ljava/lang/Boolean;", "setOrgProductPictureExists", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getOrgSalePrice", "setOrgSalePrice", "getPackSizeDifference", "setPackSizeDifference", "getResultPosition", "()Ljava/lang/Integer;", "setResultPosition", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getSubsDiscountPercentage", "setSubsDiscountPercentage", "getSubsMrp", "setSubsMrp", "getSubsProductId", "setSubsProductId", "getSubsProductName", "setSubsProductName", "getSubsProductPictureExists", "setSubsProductPictureExists", "getSubsSalePrice", "setSubsSalePrice", "getSubsSavings", "setSubsSavings", "getSubstituteAvailable", "setSubstituteAvailable", "getTermSearched", "setTermSearched", "getWhId", "setWhId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/intellihealth/truemeds/data/model/mixpanel/MxSrpAddSubBottomSheetViewed;", "equals", "other", "hashCode", "toString", "app_prodDebug"})
public final class MxSrpAddSubBottomSheetViewed {
    @com.google.gson.annotations.SerializedName(value = "clicked_suggestion_type")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String clickedSuggestionType;
    @com.google.gson.annotations.SerializedName(value = "org_mrp")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double orgMrp;
    @com.google.gson.annotations.SerializedName(value = "org_product_discount_percentage")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double orgProductDiscountPercentage;
    @com.google.gson.annotations.SerializedName(value = "org_product_id")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String orgProductId;
    @com.google.gson.annotations.SerializedName(value = "org_product_name")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String orgProductName;
    @com.google.gson.annotations.SerializedName(value = "org_product_picture_exists")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean orgProductPictureExists;
    @com.google.gson.annotations.SerializedName(value = "org_sale_price")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double orgSalePrice;
    @com.google.gson.annotations.SerializedName(value = "pack_size_difference")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String packSizeDifference;
    @com.google.gson.annotations.SerializedName(value = "result_position")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer resultPosition;
    @com.google.gson.annotations.SerializedName(value = "subs_discount_percentage")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double subsDiscountPercentage;
    @com.google.gson.annotations.SerializedName(value = "subs_mrp")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double subsMrp;
    @com.google.gson.annotations.SerializedName(value = "subs_product_id")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String subsProductId;
    @com.google.gson.annotations.SerializedName(value = "subs_product_name")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String subsProductName;
    @com.google.gson.annotations.SerializedName(value = "subs_product_picture_exists")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean subsProductPictureExists;
    @com.google.gson.annotations.SerializedName(value = "subs_sale_price")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double subsSalePrice;
    @com.google.gson.annotations.SerializedName(value = "subs_savings")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double subsSavings;
    @com.google.gson.annotations.SerializedName(value = "substitute_available")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean substituteAvailable;
    @com.google.gson.annotations.SerializedName(value = "term_searched")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String termSearched;
    @com.google.gson.annotations.SerializedName(value = "wh_id")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String whId;
    
    public MxSrpAddSubBottomSheetViewed(@org.jetbrains.annotations.Nullable()
    java.lang.String clickedSuggestionType, @org.jetbrains.annotations.Nullable()
    java.lang.Double orgMrp, @org.jetbrains.annotations.Nullable()
    java.lang.Double orgProductDiscountPercentage, @org.jetbrains.annotations.Nullable()
    java.lang.String orgProductId, @org.jetbrains.annotations.Nullable()
    java.lang.String orgProductName, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean orgProductPictureExists, @org.jetbrains.annotations.Nullable()
    java.lang.Double orgSalePrice, @org.jetbrains.annotations.Nullable()
    java.lang.String packSizeDifference, @org.jetbrains.annotations.Nullable()
    java.lang.Integer resultPosition, @org.jetbrains.annotations.Nullable()
    java.lang.Double subsDiscountPercentage, @org.jetbrains.annotations.Nullable()
    java.lang.Double subsMrp, @org.jetbrains.annotations.Nullable()
    java.lang.String subsProductId, @org.jetbrains.annotations.Nullable()
    java.lang.String subsProductName, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean subsProductPictureExists, @org.jetbrains.annotations.Nullable()
    java.lang.Double subsSalePrice, @org.jetbrains.annotations.Nullable()
    java.lang.Double subsSavings, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean substituteAvailable, @org.jetbrains.annotations.Nullable()
    java.lang.String termSearched, @org.jetbrains.annotations.Nullable()
    java.lang.String whId) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getClickedSuggestionType() {
        return null;
    }
    
    public final void setClickedSuggestionType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getOrgMrp() {
        return null;
    }
    
    public final void setOrgMrp(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getOrgProductDiscountPercentage() {
        return null;
    }
    
    public final void setOrgProductDiscountPercentage(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOrgProductId() {
        return null;
    }
    
    public final void setOrgProductId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOrgProductName() {
        return null;
    }
    
    public final void setOrgProductName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getOrgProductPictureExists() {
        return null;
    }
    
    public final void setOrgProductPictureExists(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getOrgSalePrice() {
        return null;
    }
    
    public final void setOrgSalePrice(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPackSizeDifference() {
        return null;
    }
    
    public final void setPackSizeDifference(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getResultPosition() {
        return null;
    }
    
    public final void setResultPosition(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getSubsDiscountPercentage() {
        return null;
    }
    
    public final void setSubsDiscountPercentage(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getSubsMrp() {
        return null;
    }
    
    public final void setSubsMrp(@org.jetbrains.annotations.Nullable()
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
    public final java.lang.Boolean getSubsProductPictureExists() {
        return null;
    }
    
    public final void setSubsProductPictureExists(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getSubsSalePrice() {
        return null;
    }
    
    public final void setSubsSalePrice(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getSubsSavings() {
        return null;
    }
    
    public final void setSubsSavings(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getSubstituteAvailable() {
        return null;
    }
    
    public final void setSubstituteAvailable(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTermSearched() {
        return null;
    }
    
    public final void setTermSearched(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getWhId() {
        return null;
    }
    
    public final void setWhId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public MxSrpAddSubBottomSheetViewed() {
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
    public final java.lang.Double component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component14() {
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
    public final java.lang.Boolean component17() {
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
    public final java.lang.Boolean component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.mixpanel.MxSrpAddSubBottomSheetViewed copy(@org.jetbrains.annotations.Nullable()
    java.lang.String clickedSuggestionType, @org.jetbrains.annotations.Nullable()
    java.lang.Double orgMrp, @org.jetbrains.annotations.Nullable()
    java.lang.Double orgProductDiscountPercentage, @org.jetbrains.annotations.Nullable()
    java.lang.String orgProductId, @org.jetbrains.annotations.Nullable()
    java.lang.String orgProductName, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean orgProductPictureExists, @org.jetbrains.annotations.Nullable()
    java.lang.Double orgSalePrice, @org.jetbrains.annotations.Nullable()
    java.lang.String packSizeDifference, @org.jetbrains.annotations.Nullable()
    java.lang.Integer resultPosition, @org.jetbrains.annotations.Nullable()
    java.lang.Double subsDiscountPercentage, @org.jetbrains.annotations.Nullable()
    java.lang.Double subsMrp, @org.jetbrains.annotations.Nullable()
    java.lang.String subsProductId, @org.jetbrains.annotations.Nullable()
    java.lang.String subsProductName, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean subsProductPictureExists, @org.jetbrains.annotations.Nullable()
    java.lang.Double subsSalePrice, @org.jetbrains.annotations.Nullable()
    java.lang.Double subsSavings, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean substituteAvailable, @org.jetbrains.annotations.Nullable()
    java.lang.String termSearched, @org.jetbrains.annotations.Nullable()
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