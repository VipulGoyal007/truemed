package com.intellihealth.truemeds.data.model.home;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003JA\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010$\u001a\u00020\u0003H\u00d6\u0001J\t\u0010%\u001a\u00020\u0005H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006&"}, d2 = {"Lcom/intellihealth/truemeds/data/model/home/ProductCardDataModel;", "", "id", "", "type", "", "productCardModel", "Lcom/intellihealth/truemeds/data/model/productlistanddetails/CrossSellingRecommendedProductResponse;", "productCardLimitedOfferModel", "productCardNewArrivalModel", "(ILjava/lang/String;Lcom/intellihealth/truemeds/data/model/productlistanddetails/CrossSellingRecommendedProductResponse;Lcom/intellihealth/truemeds/data/model/productlistanddetails/CrossSellingRecommendedProductResponse;Lcom/intellihealth/truemeds/data/model/productlistanddetails/CrossSellingRecommendedProductResponse;)V", "getId", "()I", "setId", "(I)V", "getProductCardLimitedOfferModel", "()Lcom/intellihealth/truemeds/data/model/productlistanddetails/CrossSellingRecommendedProductResponse;", "setProductCardLimitedOfferModel", "(Lcom/intellihealth/truemeds/data/model/productlistanddetails/CrossSellingRecommendedProductResponse;)V", "getProductCardModel", "setProductCardModel", "getProductCardNewArrivalModel", "setProductCardNewArrivalModel", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_prodDebug"})
public final class ProductCardDataModel {
    private int id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String type;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.data.model.productlistanddetails.CrossSellingRecommendedProductResponse productCardModel;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.data.model.productlistanddetails.CrossSellingRecommendedProductResponse productCardLimitedOfferModel;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.data.model.productlistanddetails.CrossSellingRecommendedProductResponse productCardNewArrivalModel;
    
    public ProductCardDataModel(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.productlistanddetails.CrossSellingRecommendedProductResponse productCardModel, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.productlistanddetails.CrossSellingRecommendedProductResponse productCardLimitedOfferModel, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.productlistanddetails.CrossSellingRecommendedProductResponse productCardNewArrivalModel) {
        super();
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.productlistanddetails.CrossSellingRecommendedProductResponse getProductCardModel() {
        return null;
    }
    
    public final void setProductCardModel(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.productlistanddetails.CrossSellingRecommendedProductResponse p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.productlistanddetails.CrossSellingRecommendedProductResponse getProductCardLimitedOfferModel() {
        return null;
    }
    
    public final void setProductCardLimitedOfferModel(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.productlistanddetails.CrossSellingRecommendedProductResponse p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.productlistanddetails.CrossSellingRecommendedProductResponse getProductCardNewArrivalModel() {
        return null;
    }
    
    public final void setProductCardNewArrivalModel(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.productlistanddetails.CrossSellingRecommendedProductResponse p0) {
    }
    
    public ProductCardDataModel() {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.productlistanddetails.CrossSellingRecommendedProductResponse component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.productlistanddetails.CrossSellingRecommendedProductResponse component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.productlistanddetails.CrossSellingRecommendedProductResponse component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.home.ProductCardDataModel copy(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.productlistanddetails.CrossSellingRecommendedProductResponse productCardModel, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.productlistanddetails.CrossSellingRecommendedProductResponse productCardLimitedOfferModel, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.productlistanddetails.CrossSellingRecommendedProductResponse productCardNewArrivalModel) {
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