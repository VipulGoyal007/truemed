package com.intellihealth.truemeds.data.repository.datasource.local.entity;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\bB\b\u0007\u0018\u00002\u00020\u0001B\u00b3\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u000e\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u0007\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u001f\u001a\u00020\u000e\u0012\u0006\u0010 \u001a\u00020\u000e\u0012\u0006\u0010!\u001a\u00020\u0013\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010#\u001a\u00020\u000e\u0012\u0006\u0010$\u001a\u00020\u000e\u0012\u0006\u0010%\u001a\u00020\u000e\u0012\u0006\u0010&\u001a\u00020\u000e\u0012\u0006\u0010\'\u001a\u00020\u000e\u0012\u0006\u0010(\u001a\u00020\u000e\u00a2\u0006\u0002\u0010)R\u0016\u0010\u0010\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0016\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010+R\u0016\u0010$\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0016\u0010\u0018\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010.R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00101R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u00101R\u0016\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u00101R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u00101R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u00101R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u00101R\u0016\u0010\u0015\u001a\u00020\u00138\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u00105R\u0016\u0010!\u001a\u00020\u00138\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u00105R\u0016\u0010\u001a\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010+R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u00101R\u0016\u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u00105R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u00101R\u0016\u0010#\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010.R\u0016\u0010&\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010.R\u0016\u0010\'\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010.R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010E\u001a\u0004\bC\u0010DR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u00101R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u00101R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0016\u0010%\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010.R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u0010+R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u00101R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u00101R\u0016\u0010\u001f\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u0010.R\u0016\u0010(\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u0010.R\u001a\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010R\u001a\u0004\bP\u0010QR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bS\u00101R\u0016\u0010 \u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bT\u0010.\u00a8\u0006U"}, d2 = {"Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/ReorderAlternateSubs;", "", "id", "", "medicineId", "", "patientId", "", "patientName", "orderAddress", "addressId", "orderId", "subsMedProductCode", "subAvailable", "", "productImageUrls", "addedQty", "altSubsMedProductCode", "altSubsDiscountPercentage", "", "altSubsSellingPrice", "altSubsMrp", "altSubsMedName", "altSubsCompanyName", "altSubsColdStorage", "altSubsDrugType", "altSubsRecommendedQty", "altSubsCountryName", "altSubsUnit", "altSubsImageUrl", "altSubsCompanyAddress", "replace", "subsPitched", "altSubsPackSize", "altSubsSavingPercentage", "coldChainDisabled", "altSubAvailable", "orgDisabled", "cxAcceptedSubs", "cxKeepOriginal", "showOnlyOrg", "(Ljava/lang/Long;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IJLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;ILjava/lang/String;DDDLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZDLjava/lang/String;ZZZZZZ)V", "getAddedQty", "()I", "getAddressId", "getAltSubAvailable", "()Z", "getAltSubsColdStorage", "getAltSubsCompanyAddress", "()Ljava/lang/String;", "getAltSubsCompanyName", "getAltSubsCountryName", "getAltSubsDiscountPercentage", "()D", "getAltSubsDrugType", "getAltSubsImageUrl", "getAltSubsMedName", "getAltSubsMedProductCode", "getAltSubsMrp", "getAltSubsPackSize", "getAltSubsRecommendedQty", "getAltSubsSavingPercentage", "getAltSubsSellingPrice", "getAltSubsUnit", "getColdChainDisabled", "getCxAcceptedSubs", "getCxKeepOriginal", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMedicineId", "getOrderAddress", "getOrderId", "()J", "getOrgDisabled", "getPatientId", "getPatientName", "getProductImageUrls", "getReplace", "getShowOnlyOrg", "getSubAvailable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSubsMedProductCode", "getSubsPitched", "app_stageAndroidDebug"})
@androidx.room.Entity(tableName = "reorder_alternate_subs")
public final class ReorderAlternateSubs {
    @androidx.room.PrimaryKey(autoGenerate = true)
    @androidx.room.ColumnInfo(name = "id")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long id = null;
    @androidx.room.ColumnInfo(name = "medicineId")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String medicineId = null;
    @androidx.room.ColumnInfo(name = "patientID")
    private final int patientId = 0;
    @androidx.room.ColumnInfo(name = "patientName")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String patientName = null;
    @androidx.room.ColumnInfo(name = "orderAddress")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String orderAddress = null;
    @androidx.room.ColumnInfo(name = "addressID")
    private final int addressId = 0;
    @androidx.room.ColumnInfo(name = "orderID")
    private final long orderId = 0L;
    @androidx.room.ColumnInfo(name = "SubsMedProductCode")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String subsMedProductCode = null;
    @androidx.room.ColumnInfo(name = "isSubAvailable")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean subAvailable = null;
    @androidx.room.ColumnInfo(name = "subImageUrl")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String productImageUrls = null;
    @androidx.room.ColumnInfo(name = "orgAddedQuantity")
    private final int addedQty = 0;
    @androidx.room.ColumnInfo(name = "altSubsMedProductCode")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String altSubsMedProductCode = null;
    @androidx.room.ColumnInfo(name = "altSubsDiscountPercentage")
    private final double altSubsDiscountPercentage = 0.0;
    @androidx.room.ColumnInfo(name = "altSubsSellingPrice")
    private final double altSubsSellingPrice = 0.0;
    @androidx.room.ColumnInfo(name = "altSubsMrp")
    private final double altSubsMrp = 0.0;
    @androidx.room.ColumnInfo(name = "altSubsMedName")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String altSubsMedName = null;
    @androidx.room.ColumnInfo(name = "altSubsCompanyName")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String altSubsCompanyName = null;
    @androidx.room.ColumnInfo(name = "isAltSubsColdStorage")
    private final boolean altSubsColdStorage = false;
    @androidx.room.ColumnInfo(name = "altSubsDrugType")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String altSubsDrugType = null;
    @androidx.room.ColumnInfo(name = "altSubsRecommendedQty")
    private final int altSubsRecommendedQty = 0;
    @androidx.room.ColumnInfo(name = "altSubsCountryName")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String altSubsCountryName = null;
    @androidx.room.ColumnInfo(name = "altSubsUnit")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String altSubsUnit = null;
    @androidx.room.ColumnInfo(name = "altSubsImageUrl")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String altSubsImageUrl = null;
    @androidx.room.ColumnInfo(name = "altSubsCompanyAddress")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String altSubsCompanyAddress = null;
    @androidx.room.ColumnInfo(name = "isReplace")
    private final boolean replace = false;
    @androidx.room.ColumnInfo(name = "subsPitched")
    private final boolean subsPitched = false;
    @androidx.room.ColumnInfo(name = "altSubsPackSize")
    private final double altSubsPackSize = 0.0;
    @androidx.room.ColumnInfo(name = "altSubsSavingPercentage")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String altSubsSavingPercentage = null;
    @androidx.room.ColumnInfo(name = "coldChainDisabled")
    private final boolean coldChainDisabled = false;
    @androidx.room.ColumnInfo(name = "isAltSubAvailable")
    private final boolean altSubAvailable = false;
    @androidx.room.ColumnInfo(name = "isOrgDisabled")
    private final boolean orgDisabled = false;
    @androidx.room.ColumnInfo(name = "cxAcceptedSubs")
    private final boolean cxAcceptedSubs = false;
    @androidx.room.ColumnInfo(name = "cxKeepOriginal")
    private final boolean cxKeepOriginal = false;
    @androidx.room.ColumnInfo(name = "showOnlyOrg")
    private final boolean showOnlyOrg = false;
    
    public ReorderAlternateSubs(@org.jetbrains.annotations.Nullable()
    java.lang.Long id, @org.jetbrains.annotations.NotNull()
    java.lang.String medicineId, int patientId, @org.jetbrains.annotations.Nullable()
    java.lang.String patientName, @org.jetbrains.annotations.Nullable()
    java.lang.String orderAddress, int addressId, long orderId, @org.jetbrains.annotations.Nullable()
    java.lang.String subsMedProductCode, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean subAvailable, @org.jetbrains.annotations.Nullable()
    java.lang.String productImageUrls, int addedQty, @org.jetbrains.annotations.Nullable()
    java.lang.String altSubsMedProductCode, double altSubsDiscountPercentage, double altSubsSellingPrice, double altSubsMrp, @org.jetbrains.annotations.Nullable()
    java.lang.String altSubsMedName, @org.jetbrains.annotations.Nullable()
    java.lang.String altSubsCompanyName, boolean altSubsColdStorage, @org.jetbrains.annotations.Nullable()
    java.lang.String altSubsDrugType, int altSubsRecommendedQty, @org.jetbrains.annotations.Nullable()
    java.lang.String altSubsCountryName, @org.jetbrains.annotations.Nullable()
    java.lang.String altSubsUnit, @org.jetbrains.annotations.Nullable()
    java.lang.String altSubsImageUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String altSubsCompanyAddress, boolean replace, boolean subsPitched, double altSubsPackSize, @org.jetbrains.annotations.Nullable()
    java.lang.String altSubsSavingPercentage, boolean coldChainDisabled, boolean altSubAvailable, boolean orgDisabled, boolean cxAcceptedSubs, boolean cxKeepOriginal, boolean showOnlyOrg) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMedicineId() {
        return null;
    }
    
    public final int getPatientId() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPatientName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOrderAddress() {
        return null;
    }
    
    public final int getAddressId() {
        return 0;
    }
    
    public final long getOrderId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSubsMedProductCode() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getSubAvailable() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getProductImageUrls() {
        return null;
    }
    
    public final int getAddedQty() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAltSubsMedProductCode() {
        return null;
    }
    
    public final double getAltSubsDiscountPercentage() {
        return 0.0;
    }
    
    public final double getAltSubsSellingPrice() {
        return 0.0;
    }
    
    public final double getAltSubsMrp() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAltSubsMedName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAltSubsCompanyName() {
        return null;
    }
    
    public final boolean getAltSubsColdStorage() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAltSubsDrugType() {
        return null;
    }
    
    public final int getAltSubsRecommendedQty() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAltSubsCountryName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAltSubsUnit() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAltSubsImageUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAltSubsCompanyAddress() {
        return null;
    }
    
    public final boolean getReplace() {
        return false;
    }
    
    public final boolean getSubsPitched() {
        return false;
    }
    
    public final double getAltSubsPackSize() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAltSubsSavingPercentage() {
        return null;
    }
    
    public final boolean getColdChainDisabled() {
        return false;
    }
    
    public final boolean getAltSubAvailable() {
        return false;
    }
    
    public final boolean getOrgDisabled() {
        return false;
    }
    
    public final boolean getCxAcceptedSubs() {
        return false;
    }
    
    public final boolean getCxKeepOriginal() {
        return false;
    }
    
    public final boolean getShowOnlyOrg() {
        return false;
    }
}