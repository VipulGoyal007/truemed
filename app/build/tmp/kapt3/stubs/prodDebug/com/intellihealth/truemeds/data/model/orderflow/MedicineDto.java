package com.intellihealth.truemeds.data.model.orderflow;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b:\b\u0086\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u0012J\u0010\u00104\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u0010\u00105\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010&J\u0010\u00106\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010&J\u0010\u00107\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010&J\u000b\u00108\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010;\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010<\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010&J\u0010\u0010=\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010!J\u0010\u0010>\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010!J\u0010\u0010?\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u009e\u0001\u0010@\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\nH\u00c6\u0001\u00a2\u0006\u0002\u0010AJ\u0013\u0010B\u001a\u00020\u00032\b\u0010C\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010D\u001a\u00020\fH\u00d6\u0001J\t\u0010E\u001a\u00020\u0005H\u00d6\u0001R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u000e\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0002\u0010\u0014\"\u0004\b\u001b\u0010\u0016R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010$\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010)\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\"\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010)\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R\"\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010)\u001a\u0004\b,\u0010&\"\u0004\b-\u0010(R \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001d\"\u0004\b/\u0010\u001fR\"\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010)\u001a\u0004\b0\u0010&\"\u0004\b1\u0010(R\"\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010$\u001a\u0004\b2\u0010!\"\u0004\b3\u0010#\u00a8\u0006F"}, d2 = {"Lcom/intellihealth/truemeds/data/model/orderflow/MedicineDto;", "", "isKeepOrg", "", "medicineName", "", "productCode", "cxAcceptedSubs", "cxOrgAdded", "productDetailsId", "", "quantity", "", "medicineQty", "isCrossSellingProduct", "prevOrderId", "prevOrgProductId", "ogPdId", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "getCxAcceptedSubs", "()Ljava/lang/Boolean;", "setCxAcceptedSubs", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getCxOrgAdded", "setCxOrgAdded", "setCrossSellingProduct", "setKeepOrg", "getMedicineName", "()Ljava/lang/String;", "setMedicineName", "(Ljava/lang/String;)V", "getMedicineQty", "()Ljava/lang/Integer;", "setMedicineQty", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getOgPdId", "()Ljava/lang/Long;", "setOgPdId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getPrevOrderId", "setPrevOrderId", "getPrevOrgProductId", "setPrevOrgProductId", "getProductCode", "setProductCode", "getProductDetailsId", "setProductDetailsId", "getQuantity", "setQuantity", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)Lcom/intellihealth/truemeds/data/model/orderflow/MedicineDto;", "equals", "other", "hashCode", "toString", "app_prodDebug"})
public final class MedicineDto {
    @com.google.gson.annotations.SerializedName(value = "isKeepOrg")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean isKeepOrg;
    @com.google.gson.annotations.SerializedName(value = "medicineName")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String medicineName;
    @com.google.gson.annotations.SerializedName(value = "productCode")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String productCode;
    @com.google.gson.annotations.SerializedName(value = "cxAcceptedSubs")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean cxAcceptedSubs;
    @com.google.gson.annotations.SerializedName(value = "cxOrgAdded")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean cxOrgAdded;
    @com.google.gson.annotations.SerializedName(value = "productDetailsId")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long productDetailsId;
    @com.google.gson.annotations.SerializedName(value = "quantity")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer quantity;
    @com.google.gson.annotations.SerializedName(value = "medicineQty")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer medicineQty;
    @com.google.gson.annotations.SerializedName(value = "isCrossSellingProduct")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean isCrossSellingProduct;
    @com.google.gson.annotations.SerializedName(value = "prevOrderId")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long prevOrderId;
    @com.google.gson.annotations.SerializedName(value = "prevOrgProductId")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long prevOrgProductId;
    @com.google.gson.annotations.SerializedName(value = "ogPdId")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long ogPdId;
    
    public MedicineDto(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean isKeepOrg, @org.jetbrains.annotations.Nullable()
    java.lang.String medicineName, @org.jetbrains.annotations.Nullable()
    java.lang.String productCode, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean cxAcceptedSubs, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean cxOrgAdded, @org.jetbrains.annotations.Nullable()
    java.lang.Long productDetailsId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer quantity, @org.jetbrains.annotations.Nullable()
    java.lang.Integer medicineQty, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isCrossSellingProduct, @org.jetbrains.annotations.Nullable()
    java.lang.Long prevOrderId, @org.jetbrains.annotations.Nullable()
    java.lang.Long prevOrgProductId, @org.jetbrains.annotations.Nullable()
    java.lang.Long ogPdId) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isKeepOrg() {
        return null;
    }
    
    public final void setKeepOrg(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMedicineName() {
        return null;
    }
    
    public final void setMedicineName(@org.jetbrains.annotations.Nullable()
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
    public final java.lang.Boolean getCxAcceptedSubs() {
        return null;
    }
    
    public final void setCxAcceptedSubs(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getCxOrgAdded() {
        return null;
    }
    
    public final void setCxOrgAdded(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getProductDetailsId() {
        return null;
    }
    
    public final void setProductDetailsId(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getQuantity() {
        return null;
    }
    
    public final void setQuantity(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getMedicineQty() {
        return null;
    }
    
    public final void setMedicineQty(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isCrossSellingProduct() {
        return null;
    }
    
    public final void setCrossSellingProduct(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getPrevOrderId() {
        return null;
    }
    
    public final void setPrevOrderId(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getPrevOrgProductId() {
        return null;
    }
    
    public final void setPrevOrgProductId(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getOgPdId() {
        return null;
    }
    
    public final void setOgPdId(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    public MedicineDto() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component12() {
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
    public final java.lang.Boolean component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.orderflow.MedicineDto copy(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean isKeepOrg, @org.jetbrains.annotations.Nullable()
    java.lang.String medicineName, @org.jetbrains.annotations.Nullable()
    java.lang.String productCode, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean cxAcceptedSubs, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean cxOrgAdded, @org.jetbrains.annotations.Nullable()
    java.lang.Long productDetailsId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer quantity, @org.jetbrains.annotations.Nullable()
    java.lang.Integer medicineQty, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isCrossSellingProduct, @org.jetbrains.annotations.Nullable()
    java.lang.Long prevOrderId, @org.jetbrains.annotations.Nullable()
    java.lang.Long prevOrgProductId, @org.jetbrains.annotations.Nullable()
    java.lang.Long ogPdId) {
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