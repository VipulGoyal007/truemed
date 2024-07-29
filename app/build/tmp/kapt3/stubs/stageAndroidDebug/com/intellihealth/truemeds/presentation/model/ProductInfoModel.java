package com.intellihealth.truemeds.presentation.model;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b?\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0017J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\t\u0010@\u001a\u00020\u0012H\u00c6\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\t\u0010D\u001a\u00020\u0005H\u00c6\u0003J\t\u0010E\u001a\u00020\u0005H\u00c6\u0003J\t\u0010F\u001a\u00020\u0005H\u00c6\u0003J\t\u0010G\u001a\u00020\u0005H\u00c6\u0003J\t\u0010H\u001a\u00020\u0005H\u00c6\u0003J\t\u0010I\u001a\u00020\u0005H\u00c6\u0003J\t\u0010J\u001a\u00020\u0005H\u00c6\u0003J\t\u0010K\u001a\u00020\u0005H\u00c6\u0003J\t\u0010L\u001a\u00020\rH\u00c6\u0003J\u00ba\u0001\u0010M\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010NJ\u0013\u0010O\u001a\u00020\u00052\b\u0010P\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u0016\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020\u00052\u0006\u0010T\u001a\u00020\u0010J\t\u0010U\u001a\u00020\u0010H\u00d6\u0001J\u0016\u0010V\u001a\u00020W2\u0006\u0010S\u001a\u00020\u00052\u0006\u0010T\u001a\u00020\u0010J\u0016\u0010X\u001a\u00020W2\u0006\u0010S\u001a\u00020\u00052\u0006\u0010T\u001a\u00020\u0010J\u0006\u0010Y\u001a\u00020ZJ\t\u0010[\u001a\u00020\u0012H\u00d6\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010!\"\u0004\b\"\u0010#R\u001a\u0010\u0016\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010!\"\u0004\b$\u0010#R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010!\"\u0004\b%\u0010#R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010!\"\u0004\b&\u0010#R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010!\"\u0004\b\'\u0010#R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010!\"\u0004\b(\u0010#R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010.\"\u0004\b2\u00100R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010.\"\u0004\b4\u00100R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010 \u001a\u0004\b5\u0010\u001d\"\u0004\b6\u0010\u001fR\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010!\"\u0004\b8\u0010#R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010!\"\u0004\b:\u0010#R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010*\"\u0004\b<\u0010,\u00a8\u0006\\"}, d2 = {"Lcom/intellihealth/truemeds/presentation/model/ProductInfoModel;", "", "cardType", "Lcom/intellihealth/salt/constants/FullWidthProductCardConstants;", "isReplaced", "", "isDisplayAddIcon", "isOrgAddedToCart", "isAutoReplaced", "isSubsAddedToCart", "subsAddedAsOrg", "showRemoveButton", "product", "Lcom/intellihealth/truemeds/presentation/model/Product;", "suggestion", "sequenceNo", "", "sameCompositionProduct", "", "sectionHeading", "sectionStackedHeading", "crossSellingItemClickPosition", "isAvailableSubsAddedInCart", "(Lcom/intellihealth/salt/constants/FullWidthProductCardConstants;ZZZZZZZLcom/intellihealth/truemeds/presentation/model/Product;Lcom/intellihealth/truemeds/presentation/model/Product;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Z)V", "getCardType", "()Lcom/intellihealth/salt/constants/FullWidthProductCardConstants;", "setCardType", "(Lcom/intellihealth/salt/constants/FullWidthProductCardConstants;)V", "getCrossSellingItemClickPosition", "()Ljava/lang/Integer;", "setCrossSellingItemClickPosition", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "()Z", "setAutoReplaced", "(Z)V", "setAvailableSubsAddedInCart", "setDisplayAddIcon", "setOrgAddedToCart", "setReplaced", "setSubsAddedToCart", "getProduct", "()Lcom/intellihealth/truemeds/presentation/model/Product;", "setProduct", "(Lcom/intellihealth/truemeds/presentation/model/Product;)V", "getSameCompositionProduct", "()Ljava/lang/String;", "setSameCompositionProduct", "(Ljava/lang/String;)V", "getSectionHeading", "setSectionHeading", "getSectionStackedHeading", "setSectionStackedHeading", "getSequenceNo", "setSequenceNo", "getShowRemoveButton", "setShowRemoveButton", "getSubsAddedAsOrg", "setSubsAddedAsOrg", "getSuggestion", "setSuggestion", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/intellihealth/salt/constants/FullWidthProductCardConstants;ZZZZZZZLcom/intellihealth/truemeds/presentation/model/Product;Lcom/intellihealth/truemeds/presentation/model/Product;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Z)Lcom/intellihealth/truemeds/presentation/model/ProductInfoModel;", "equals", "other", "getOrgSubsInfo", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/OrgSubsInfo;", "isFromAPI", "addedQty", "hashCode", "productAsCartItem", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/CartMedicine;", "suggestionAsCartItem", "toSdkObject", "Lcom/intellihealth/salt/models/ProductInfoModel;", "toString", "app_stageAndroidDebug"})
public final class ProductInfoModel {
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.salt.constants.FullWidthProductCardConstants cardType;
    private boolean isReplaced;
    private boolean isDisplayAddIcon;
    private boolean isOrgAddedToCart;
    private boolean isAutoReplaced;
    private boolean isSubsAddedToCart;
    private boolean subsAddedAsOrg;
    private boolean showRemoveButton;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.presentation.model.Product product;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.model.Product suggestion;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer sequenceNo;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String sameCompositionProduct;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String sectionHeading;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String sectionStackedHeading;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer crossSellingItemClickPosition;
    private boolean isAvailableSubsAddedInCart;
    
    public ProductInfoModel(@org.jetbrains.annotations.Nullable()
    com.intellihealth.salt.constants.FullWidthProductCardConstants cardType, boolean isReplaced, boolean isDisplayAddIcon, boolean isOrgAddedToCart, boolean isAutoReplaced, boolean isSubsAddedToCart, boolean subsAddedAsOrg, boolean showRemoveButton, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.model.Product product, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.presentation.model.Product suggestion, @org.jetbrains.annotations.Nullable()
    java.lang.Integer sequenceNo, @org.jetbrains.annotations.NotNull()
    java.lang.String sameCompositionProduct, @org.jetbrains.annotations.Nullable()
    java.lang.String sectionHeading, @org.jetbrains.annotations.Nullable()
    java.lang.String sectionStackedHeading, @org.jetbrains.annotations.Nullable()
    java.lang.Integer crossSellingItemClickPosition, boolean isAvailableSubsAddedInCart) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.salt.constants.FullWidthProductCardConstants getCardType() {
        return null;
    }
    
    public final void setCardType(@org.jetbrains.annotations.Nullable()
    com.intellihealth.salt.constants.FullWidthProductCardConstants p0) {
    }
    
    public final boolean isReplaced() {
        return false;
    }
    
    public final void setReplaced(boolean p0) {
    }
    
    public final boolean isDisplayAddIcon() {
        return false;
    }
    
    public final void setDisplayAddIcon(boolean p0) {
    }
    
    public final boolean isOrgAddedToCart() {
        return false;
    }
    
    public final void setOrgAddedToCart(boolean p0) {
    }
    
    public final boolean isAutoReplaced() {
        return false;
    }
    
    public final void setAutoReplaced(boolean p0) {
    }
    
    public final boolean isSubsAddedToCart() {
        return false;
    }
    
    public final void setSubsAddedToCart(boolean p0) {
    }
    
    public final boolean getSubsAddedAsOrg() {
        return false;
    }
    
    public final void setSubsAddedAsOrg(boolean p0) {
    }
    
    public final boolean getShowRemoveButton() {
        return false;
    }
    
    public final void setShowRemoveButton(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.model.Product getProduct() {
        return null;
    }
    
    public final void setProduct(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.model.Product p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.presentation.model.Product getSuggestion() {
        return null;
    }
    
    public final void setSuggestion(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.presentation.model.Product p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSequenceNo() {
        return null;
    }
    
    public final void setSequenceNo(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSameCompositionProduct() {
        return null;
    }
    
    public final void setSameCompositionProduct(@org.jetbrains.annotations.NotNull()
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
    public final java.lang.String getSectionStackedHeading() {
        return null;
    }
    
    public final void setSectionStackedHeading(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getCrossSellingItemClickPosition() {
        return null;
    }
    
    public final void setCrossSellingItemClickPosition(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    public final boolean isAvailableSubsAddedInCart() {
        return false;
    }
    
    public final void setAvailableSubsAddedInCart(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.salt.models.ProductInfoModel toSdkObject() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.repository.datasource.local.entity.CartMedicine productAsCartItem(boolean isFromAPI, int addedQty) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.repository.datasource.local.entity.CartMedicine suggestionAsCartItem(boolean isFromAPI, int addedQty) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.repository.datasource.local.entity.OrgSubsInfo getOrgSubsInfo(boolean isFromAPI, int addedQty) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.salt.constants.FullWidthProductCardConstants component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.presentation.model.Product component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
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
    
    public final boolean component16() {
        return false;
    }
    
    public final boolean component2() {
        return false;
    }
    
    public final boolean component3() {
        return false;
    }
    
    public final boolean component4() {
        return false;
    }
    
    public final boolean component5() {
        return false;
    }
    
    public final boolean component6() {
        return false;
    }
    
    public final boolean component7() {
        return false;
    }
    
    public final boolean component8() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.model.Product component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.model.ProductInfoModel copy(@org.jetbrains.annotations.Nullable()
    com.intellihealth.salt.constants.FullWidthProductCardConstants cardType, boolean isReplaced, boolean isDisplayAddIcon, boolean isOrgAddedToCart, boolean isAutoReplaced, boolean isSubsAddedToCart, boolean subsAddedAsOrg, boolean showRemoveButton, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.model.Product product, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.presentation.model.Product suggestion, @org.jetbrains.annotations.Nullable()
    java.lang.Integer sequenceNo, @org.jetbrains.annotations.NotNull()
    java.lang.String sameCompositionProduct, @org.jetbrains.annotations.Nullable()
    java.lang.String sectionHeading, @org.jetbrains.annotations.Nullable()
    java.lang.String sectionStackedHeading, @org.jetbrains.annotations.Nullable()
    java.lang.Integer crossSellingItemClickPosition, boolean isAvailableSubsAddedInCart) {
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