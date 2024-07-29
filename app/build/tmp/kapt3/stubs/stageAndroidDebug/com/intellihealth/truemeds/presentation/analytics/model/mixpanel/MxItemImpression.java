package com.intellihealth.truemeds.presentation.analytics.model.mixpanel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b`\b\u0086\b\u0018\u00002\u00020\u0001B\u0097\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u001dJ\u000b\u0010U\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010V\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010#J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010Y\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0002\u0010=J\u0010\u0010Z\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010#J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\\\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0002\u0010=J\u0010\u0010]\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0002\u0010=J\u0010\u0010^\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0002\u0010=J\u0010\u0010_\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010#J\u0010\u0010`\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010#J\u0010\u0010a\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010#J\u000b\u0010b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010e\u001a\u00020\u0007H\u00c6\u0003J\u0010\u0010f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010#J\u0010\u0010g\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010#J\u000b\u0010h\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010j\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010#J\u000b\u0010k\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u00a0\u0002\u0010l\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010mJ\u0013\u0010n\u001a\u00020\u00072\b\u0010o\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010p\u001a\u00020\u0012H\u00d6\u0001J\t\u0010q\u001a\u00020\u0003H\u00d6\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010&\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\'\"\u0004\b(\u0010)R\"\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010&\u001a\u0004\b*\u0010#\"\u0004\b+\u0010%R\"\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010&\u001a\u0004\b,\u0010#\"\u0004\b-\u0010%R \u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001f\"\u0004\b/\u0010!R \u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001f\"\u0004\b1\u0010!R\"\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010&\u001a\u0004\b2\u0010#\"\u0004\b3\u0010%R \u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001f\"\u0004\b5\u0010!R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010&\u001a\u0004\b6\u0010#\"\u0004\b7\u0010%R \u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u001f\"\u0004\b9\u0010!R \u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u001f\"\u0004\b;\u0010!R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010@\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010&\u001a\u0004\bA\u0010#\"\u0004\bB\u0010%R \u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u001f\"\u0004\bD\u0010!R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010@\u001a\u0004\bE\u0010=\"\u0004\bF\u0010?R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010@\u001a\u0004\bG\u0010=\"\u0004\bH\u0010?R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010@\u001a\u0004\bI\u0010=\"\u0004\bJ\u0010?R\"\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010&\u001a\u0004\bK\u0010#\"\u0004\bL\u0010%R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010&\u001a\u0004\bM\u0010#\"\u0004\bN\u0010%R \u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u001f\"\u0004\bP\u0010!R \u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010\u001f\"\u0004\bR\u0010!R \u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010\u001f\"\u0004\bT\u0010!\u00a8\u0006r"}, d2 = {"Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxItemImpression;", "", "clickedOnPage", "", "freeDeliveryRequiredAmount", "", "isOtc", "", "mrp", "orgMrp", "orgProductId", "orgProductName", "orgSalesPrice", "pageSection", "productDiscountPercentage", "productId", "productName", "resultPosition", "", "salesPrice", "sectionHeading", "sectionIndex", "sectionRow", "subsId", "subsMrp", "subsSalesPrice", "whId", "suggestionTermClicked", "termSearched", "(Ljava/lang/String;Ljava/lang/Double;ZLjava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getClickedOnPage", "()Ljava/lang/String;", "setClickedOnPage", "(Ljava/lang/String;)V", "getFreeDeliveryRequiredAmount", "()Ljava/lang/Double;", "setFreeDeliveryRequiredAmount", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "()Z", "setOtc", "(Z)V", "getMrp", "setMrp", "getOrgMrp", "setOrgMrp", "getOrgProductId", "setOrgProductId", "getOrgProductName", "setOrgProductName", "getOrgSalesPrice", "setOrgSalesPrice", "getPageSection", "setPageSection", "getProductDiscountPercentage", "setProductDiscountPercentage", "getProductId", "setProductId", "getProductName", "setProductName", "getResultPosition", "()Ljava/lang/Integer;", "setResultPosition", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getSalesPrice", "setSalesPrice", "getSectionHeading", "setSectionHeading", "getSectionIndex", "setSectionIndex", "getSectionRow", "setSectionRow", "getSubsId", "setSubsId", "getSubsMrp", "setSubsMrp", "getSubsSalesPrice", "setSubsSalesPrice", "getSuggestionTermClicked", "setSuggestionTermClicked", "getTermSearched", "setTermSearched", "getWhId", "setWhId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Double;ZLjava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxItemImpression;", "equals", "other", "hashCode", "toString", "app_stageAndroidDebug"})
public final class MxItemImpression {
    @com.google.gson.annotations.SerializedName(value = "clicked_on_page")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String clickedOnPage;
    @com.google.gson.annotations.SerializedName(value = "free_delivery_required_amount")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double freeDeliveryRequiredAmount;
    @com.google.gson.annotations.SerializedName(value = "is_otc")
    private boolean isOtc;
    @com.google.gson.annotations.SerializedName(value = "mrp")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double mrp;
    @com.google.gson.annotations.SerializedName(value = "org_mrp")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double orgMrp;
    @com.google.gson.annotations.SerializedName(value = "org_product_id")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String orgProductId;
    @com.google.gson.annotations.SerializedName(value = "org_product_name")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String orgProductName;
    @com.google.gson.annotations.SerializedName(value = "org_sales_price")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double orgSalesPrice;
    @com.google.gson.annotations.SerializedName(value = "page_section")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String pageSection;
    @com.google.gson.annotations.SerializedName(value = "product_discount_percentage")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double productDiscountPercentage;
    @com.google.gson.annotations.SerializedName(value = "product_id")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String productId;
    @com.google.gson.annotations.SerializedName(value = "product_name")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String productName;
    @com.google.gson.annotations.SerializedName(value = "result_position")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer resultPosition;
    @com.google.gson.annotations.SerializedName(value = "sales_price")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double salesPrice;
    @com.google.gson.annotations.SerializedName(value = "section_heading")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String sectionHeading;
    @com.google.gson.annotations.SerializedName(value = "section_index")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer sectionIndex;
    @com.google.gson.annotations.SerializedName(value = "section_row")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer sectionRow;
    @com.google.gson.annotations.SerializedName(value = "subs_id")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer subsId;
    @com.google.gson.annotations.SerializedName(value = "subs_mrp")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double subsMrp;
    @com.google.gson.annotations.SerializedName(value = "subs_sales_price")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double subsSalesPrice;
    @com.google.gson.annotations.SerializedName(value = "wh_id")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String whId;
    @com.google.gson.annotations.SerializedName(value = "suggestion_term_clicked")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String suggestionTermClicked;
    @com.google.gson.annotations.SerializedName(value = "term_searched")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String termSearched;
    
    public MxItemImpression(@org.jetbrains.annotations.Nullable()
    java.lang.String clickedOnPage, @org.jetbrains.annotations.Nullable()
    java.lang.Double freeDeliveryRequiredAmount, boolean isOtc, @org.jetbrains.annotations.Nullable()
    java.lang.Double mrp, @org.jetbrains.annotations.Nullable()
    java.lang.Double orgMrp, @org.jetbrains.annotations.Nullable()
    java.lang.String orgProductId, @org.jetbrains.annotations.Nullable()
    java.lang.String orgProductName, @org.jetbrains.annotations.Nullable()
    java.lang.Double orgSalesPrice, @org.jetbrains.annotations.Nullable()
    java.lang.String pageSection, @org.jetbrains.annotations.Nullable()
    java.lang.Double productDiscountPercentage, @org.jetbrains.annotations.Nullable()
    java.lang.String productId, @org.jetbrains.annotations.Nullable()
    java.lang.String productName, @org.jetbrains.annotations.Nullable()
    java.lang.Integer resultPosition, @org.jetbrains.annotations.Nullable()
    java.lang.Double salesPrice, @org.jetbrains.annotations.Nullable()
    java.lang.String sectionHeading, @org.jetbrains.annotations.Nullable()
    java.lang.Integer sectionIndex, @org.jetbrains.annotations.Nullable()
    java.lang.Integer sectionRow, @org.jetbrains.annotations.Nullable()
    java.lang.Integer subsId, @org.jetbrains.annotations.Nullable()
    java.lang.Double subsMrp, @org.jetbrains.annotations.Nullable()
    java.lang.Double subsSalesPrice, @org.jetbrains.annotations.Nullable()
    java.lang.String whId, @org.jetbrains.annotations.Nullable()
    java.lang.String suggestionTermClicked, @org.jetbrains.annotations.Nullable()
    java.lang.String termSearched) {
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
    public final java.lang.Double getFreeDeliveryRequiredAmount() {
        return null;
    }
    
    public final void setFreeDeliveryRequiredAmount(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    public final boolean isOtc() {
        return false;
    }
    
    public final void setOtc(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getMrp() {
        return null;
    }
    
    public final void setMrp(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getOrgMrp() {
        return null;
    }
    
    public final void setOrgMrp(@org.jetbrains.annotations.Nullable()
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
    public final java.lang.Double getOrgSalesPrice() {
        return null;
    }
    
    public final void setOrgSalesPrice(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPageSection() {
        return null;
    }
    
    public final void setPageSection(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
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
    public final java.lang.String getProductName() {
        return null;
    }
    
    public final void setProductName(@org.jetbrains.annotations.Nullable()
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
    public final java.lang.Double getSalesPrice() {
        return null;
    }
    
    public final void setSalesPrice(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSectionHeading() {
        return null;
    }
    
    public final void setSectionHeading(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSectionIndex() {
        return null;
    }
    
    public final void setSectionIndex(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSectionRow() {
        return null;
    }
    
    public final void setSectionRow(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSubsId() {
        return null;
    }
    
    public final void setSubsId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getSubsMrp() {
        return null;
    }
    
    public final void setSubsMrp(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getSubsSalesPrice() {
        return null;
    }
    
    public final void setSubsSalesPrice(@org.jetbrains.annotations.Nullable()
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
    public final java.lang.String getSuggestionTermClicked() {
        return null;
    }
    
    public final void setSuggestionTermClicked(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTermSearched() {
        return null;
    }
    
    public final void setTermSearched(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public MxItemImpression() {
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
    public final java.lang.Integer component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component18() {
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
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component23() {
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
    public final java.lang.Double component5() {
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
    public final com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxItemImpression copy(@org.jetbrains.annotations.Nullable()
    java.lang.String clickedOnPage, @org.jetbrains.annotations.Nullable()
    java.lang.Double freeDeliveryRequiredAmount, boolean isOtc, @org.jetbrains.annotations.Nullable()
    java.lang.Double mrp, @org.jetbrains.annotations.Nullable()
    java.lang.Double orgMrp, @org.jetbrains.annotations.Nullable()
    java.lang.String orgProductId, @org.jetbrains.annotations.Nullable()
    java.lang.String orgProductName, @org.jetbrains.annotations.Nullable()
    java.lang.Double orgSalesPrice, @org.jetbrains.annotations.Nullable()
    java.lang.String pageSection, @org.jetbrains.annotations.Nullable()
    java.lang.Double productDiscountPercentage, @org.jetbrains.annotations.Nullable()
    java.lang.String productId, @org.jetbrains.annotations.Nullable()
    java.lang.String productName, @org.jetbrains.annotations.Nullable()
    java.lang.Integer resultPosition, @org.jetbrains.annotations.Nullable()
    java.lang.Double salesPrice, @org.jetbrains.annotations.Nullable()
    java.lang.String sectionHeading, @org.jetbrains.annotations.Nullable()
    java.lang.Integer sectionIndex, @org.jetbrains.annotations.Nullable()
    java.lang.Integer sectionRow, @org.jetbrains.annotations.Nullable()
    java.lang.Integer subsId, @org.jetbrains.annotations.Nullable()
    java.lang.Double subsMrp, @org.jetbrains.annotations.Nullable()
    java.lang.Double subsSalesPrice, @org.jetbrains.annotations.Nullable()
    java.lang.String whId, @org.jetbrains.annotations.Nullable()
    java.lang.String suggestionTermClicked, @org.jetbrains.annotations.Nullable()
    java.lang.String termSearched) {
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