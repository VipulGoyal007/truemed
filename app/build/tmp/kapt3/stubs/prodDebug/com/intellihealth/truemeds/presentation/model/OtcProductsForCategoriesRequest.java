package com.intellihealth.truemeds.presentation.model;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b2\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011\u00a2\u0006\u0002\u0010\u0012J\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\u0005H\u00c6\u0003J\u000f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011H\u00c6\u0003J\t\u00105\u001a\u00020\u0005H\u00c6\u0003J\t\u00106\u001a\u00020\u0007H\u00c6\u0003J\t\u00107\u001a\u00020\u0005H\u00c6\u0003J\t\u00108\u001a\u00020\u0005H\u00c6\u0003J\t\u00109\u001a\u00020\u0005H\u00c6\u0003J\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\t\u0010;\u001a\u00020\u0007H\u00c6\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010,J\u0084\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011H\u00c6\u0001\u00a2\u0006\u0002\u0010>J\u0013\u0010?\u001a\u00020\u00032\b\u0010@\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010A\u001a\u00020\u0005H\u00d6\u0001J\t\u0010B\u001a\u00020\u0007H\u00d6\u0001R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u001d\"\u0004\b \u0010\u001fR\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001aR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0018\"\u0004\b$\u0010\u001aR\u001a\u0010\f\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010&\"\u0004\b*\u0010(R\u001e\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010/\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010\u000f\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0018\"\u0004\b1\u0010\u001a\u00a8\u0006C"}, d2 = {"Lcom/intellihealth/truemeds/presentation/model/OtcProductsForCategoriesRequest;", "", "isApp", "", "id", "", "type", "", "collectionId", "page", "result", "isBrandOnly", "sessionToken", "variantId", "", "warehouseId", "brands", "", "(ZILjava/lang/String;IIIZLjava/lang/String;Ljava/lang/Long;ILjava/util/List;)V", "getBrands", "()Ljava/util/List;", "setBrands", "(Ljava/util/List;)V", "getCollectionId", "()I", "setCollectionId", "(I)V", "getId", "setId", "()Z", "setApp", "(Z)V", "setBrandOnly", "getPage", "setPage", "getResult", "setResult", "getSessionToken", "()Ljava/lang/String;", "setSessionToken", "(Ljava/lang/String;)V", "getType", "setType", "getVariantId", "()Ljava/lang/Long;", "setVariantId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getWarehouseId", "setWarehouseId", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ZILjava/lang/String;IIIZLjava/lang/String;Ljava/lang/Long;ILjava/util/List;)Lcom/intellihealth/truemeds/presentation/model/OtcProductsForCategoriesRequest;", "equals", "other", "hashCode", "toString", "app_prodDebug"})
public final class OtcProductsForCategoriesRequest {
    private boolean isApp;
    private int id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String type;
    private int collectionId;
    private int page;
    private int result;
    private boolean isBrandOnly;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String sessionToken;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long variantId;
    private int warehouseId;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.String> brands;
    
    public OtcProductsForCategoriesRequest(boolean isApp, int id, @org.jetbrains.annotations.NotNull()
    java.lang.String type, int collectionId, int page, int result, boolean isBrandOnly, @org.jetbrains.annotations.NotNull()
    java.lang.String sessionToken, @org.jetbrains.annotations.Nullable()
    java.lang.Long variantId, int warehouseId, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> brands) {
        super();
    }
    
    public final boolean isApp() {
        return false;
    }
    
    public final void setApp(boolean p0) {
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
    
    public final int getCollectionId() {
        return 0;
    }
    
    public final void setCollectionId(int p0) {
    }
    
    public final int getPage() {
        return 0;
    }
    
    public final void setPage(int p0) {
    }
    
    public final int getResult() {
        return 0;
    }
    
    public final void setResult(int p0) {
    }
    
    public final boolean isBrandOnly() {
        return false;
    }
    
    public final void setBrandOnly(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSessionToken() {
        return null;
    }
    
    public final void setSessionToken(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getVariantId() {
        return null;
    }
    
    public final void setVariantId(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    public final int getWarehouseId() {
        return 0;
    }
    
    public final void setWarehouseId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getBrands() {
        return null;
    }
    
    public final void setBrands(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> p0) {
    }
    
    public final boolean component1() {
        return false;
    }
    
    public final int component10() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component11() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int component6() {
        return 0;
    }
    
    public final boolean component7() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.model.OtcProductsForCategoriesRequest copy(boolean isApp, int id, @org.jetbrains.annotations.NotNull()
    java.lang.String type, int collectionId, int page, int result, boolean isBrandOnly, @org.jetbrains.annotations.NotNull()
    java.lang.String sessionToken, @org.jetbrains.annotations.Nullable()
    java.lang.Long variantId, int warehouseId, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> brands) {
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