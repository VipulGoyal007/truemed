package com.intellihealth.truemeds.data.model.orderflow;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0007J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u00c6\u0003J-\u0010\u0016\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\rH\u00d6\u0001J\u0016\u0010\u001b\u001a\u00020\u00182\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003J\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0003J\t\u0010\u001f\u001a\u00020\u0006H\u00d6\u0001R&\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R&\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\t\"\u0004\b\u0013\u0010\u000b\u00a8\u0006 "}, d2 = {"Lcom/intellihealth/truemeds/data/model/orderflow/GetOrderMedicineDetailsResponse;", "", "elasticProductDetails", "", "Lcom/intellihealth/truemeds/presentation/model/ProductInfoModel;", "logoUrlList", "", "(Ljava/util/List;Ljava/util/List;)V", "getElasticProductDetails", "()Ljava/util/List;", "setElasticProductDetails", "(Ljava/util/List;)V", "index", "", "getIndex", "()I", "setIndex", "(I)V", "getLogoUrlList", "setLogoUrlList", "component1", "component2", "copy", "equals", "", "other", "hashCode", "isLastItemTrue", "responseData", "toSDKObject", "Lcom/intellihealth/salt/models/OrderedItemCardModel;", "toString", "app_prodDebug"})
public final class GetOrderMedicineDetailsResponse {
    @com.google.gson.annotations.SerializedName(value = "elasticProductDetails")
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> elasticProductDetails;
    @com.google.gson.annotations.SerializedName(value = "logoUrlList")
    @org.jetbrains.annotations.Nullable()
    private java.util.List<java.lang.String> logoUrlList;
    private int index = 1;
    
    public GetOrderMedicineDetailsResponse(@org.jetbrains.annotations.Nullable()
    java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> elasticProductDetails, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> logoUrlList) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> getElasticProductDetails() {
        return null;
    }
    
    public final void setElasticProductDetails(@org.jetbrains.annotations.Nullable()
    java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getLogoUrlList() {
        return null;
    }
    
    public final void setLogoUrlList(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> p0) {
    }
    
    public final int getIndex() {
        return 0;
    }
    
    public final void setIndex(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.salt.models.OrderedItemCardModel> toSDKObject() {
        return null;
    }
    
    /**
     * This logic is for hide or show the bottom
     */
    public final boolean isLastItemTrue(@org.jetbrains.annotations.Nullable()
    java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> responseData) {
        return false;
    }
    
    public GetOrderMedicineDetailsResponse() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.orderflow.GetOrderMedicineDetailsResponse copy(@org.jetbrains.annotations.Nullable()
    java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> elasticProductDetails, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> logoUrlList) {
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