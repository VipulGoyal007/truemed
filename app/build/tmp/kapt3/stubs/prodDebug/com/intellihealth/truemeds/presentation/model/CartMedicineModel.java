package com.intellihealth.truemeds.presentation.model;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\t\u0010\"\u001a\u00020\bH\u00c6\u0003J\t\u0010#\u001a\u00020\nH\u00c6\u0003JF\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001\u00a2\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020\u00062\b\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010(\u001a\u00020\nH\u00d6\u0001J\t\u0010)\u001a\u00020*H\u00d6\u0001R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u0006+"}, d2 = {"Lcom/intellihealth/truemeds/presentation/model/CartMedicineModel;", "", "orgInfoModel", "Lcom/intellihealth/truemeds/presentation/model/ProductInfoModel;", "subsMedicineModel", "autoReplaced", "", "totalSavings", "", "sequence", "", "(Lcom/intellihealth/truemeds/presentation/model/ProductInfoModel;Lcom/intellihealth/truemeds/presentation/model/ProductInfoModel;Ljava/lang/Boolean;DI)V", "getAutoReplaced", "()Ljava/lang/Boolean;", "setAutoReplaced", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getOrgInfoModel", "()Lcom/intellihealth/truemeds/presentation/model/ProductInfoModel;", "setOrgInfoModel", "(Lcom/intellihealth/truemeds/presentation/model/ProductInfoModel;)V", "getSequence", "()I", "setSequence", "(I)V", "getSubsMedicineModel", "setSubsMedicineModel", "getTotalSavings", "()D", "setTotalSavings", "(D)V", "component1", "component2", "component3", "component4", "component5", "copy", "(Lcom/intellihealth/truemeds/presentation/model/ProductInfoModel;Lcom/intellihealth/truemeds/presentation/model/ProductInfoModel;Ljava/lang/Boolean;DI)Lcom/intellihealth/truemeds/presentation/model/CartMedicineModel;", "equals", "other", "hashCode", "toString", "", "app_prodDebug"})
public final class CartMedicineModel {
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.model.ProductInfoModel orgInfoModel;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.model.ProductInfoModel subsMedicineModel;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean autoReplaced;
    private double totalSavings;
    private int sequence;
    
    public CartMedicineModel(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.presentation.model.ProductInfoModel orgInfoModel, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.presentation.model.ProductInfoModel subsMedicineModel, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean autoReplaced, double totalSavings, int sequence) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.presentation.model.ProductInfoModel getOrgInfoModel() {
        return null;
    }
    
    public final void setOrgInfoModel(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.presentation.model.ProductInfoModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.presentation.model.ProductInfoModel getSubsMedicineModel() {
        return null;
    }
    
    public final void setSubsMedicineModel(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.presentation.model.ProductInfoModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getAutoReplaced() {
        return null;
    }
    
    public final void setAutoReplaced(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    public final double getTotalSavings() {
        return 0.0;
    }
    
    public final void setTotalSavings(double p0) {
    }
    
    public final int getSequence() {
        return 0;
    }
    
    public final void setSequence(int p0) {
    }
    
    public CartMedicineModel() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.presentation.model.ProductInfoModel component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.presentation.model.ProductInfoModel component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component3() {
        return null;
    }
    
    public final double component4() {
        return 0.0;
    }
    
    public final int component5() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.model.CartMedicineModel copy(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.presentation.model.ProductInfoModel orgInfoModel, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.presentation.model.ProductInfoModel subsMedicineModel, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean autoReplaced, double totalSavings, int sequence) {
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