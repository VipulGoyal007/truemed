package com.intellihealth.truemeds.data.repository.datasource.local.entity;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\bB\b\u0007\u0018\u00002\u00020\u0001B\u00ab\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0019\u001a\u00020\t\u0012\u0006\u0010\u001a\u001a\u00020\t\u0012\u0006\u0010\u001b\u001a\u00020\u0011\u0012\u0006\u0010\u001c\u001a\u00020\f\u0012\u0006\u0010\u001d\u001a\u00020\f\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010$\u001a\u00020\u0011\u0012\u0006\u0010%\u001a\u00020\u0003\u0012\u0006\u0010&\u001a\u00020\u0003\u0012\u0006\u0010\'\u001a\u00020\u0003\u00a2\u0006\u0002\u0010(R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010\u0017\u001a\u00020\u00118\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010.R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010.R\u0016\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010,R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u00106\u001a\u0004\b4\u00105R\u0016\u0010\u001c\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010*R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010.R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010.R\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u00101R\u0016\u0010$\u001a\u00020\u00118\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010,R\u0018\u0010#\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010.R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010.R\u0016\u0010\u0019\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u00101R\u0018\u0010!\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010.R\u0016\u0010&\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u001e\u0010\'\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010A\"\u0004\bC\u0010DR\u0016\u0010%\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010AR\u0018\u0010\"\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u0010.R\u0016\u0010\u001b\u001a\u00020\u00118\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010,R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u0010.R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010.R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010.R\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u0010,R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u0010.R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u0010.R\u0016\u0010\u0014\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u00101R\u0016\u0010\u001d\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u0010*R\u0016\u0010\u000f\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u00101R\u0018\u0010 \u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u0010.R\u0016\u0010\u001a\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u00101\u00a8\u0006S"}, d2 = {"Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/CartMedicine;", "", "id", "", "medicineId", "", "medicineName", "companyName", "discount", "", "mrp", "addedQty", "", "composition", "subsDiscountPercentage", "subsSellingPrice", "subsFound", "", "fromApi", "subsMedProductCode", "subsMrp", "subsMedName", "subCompanyName", "coldStorage", "drugType", "originalPackSize", "substitutePackSize", "rxRequired", "maxCapped", "subsRecommendedQty", "originalCountryNm", "subsCountryNm", "subsUnit", "originalUnit", "productImageUrls", "originalCompanyAddress", "orgAvailable", "productDetailsId", "prevOrderId", "prevOrgProductId", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDILjava/lang/String;Ljava/lang/String;DZZLjava/lang/String;DLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;DDZIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJJJ)V", "getAddedQty", "()I", "getColdStorage", "()Z", "getCompanyName", "()Ljava/lang/String;", "getComposition", "getDiscount", "()D", "getDrugType", "getFromApi", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMaxCapped", "getMedicineId", "getMedicineName", "getMrp", "getOrgAvailable", "getOriginalCompanyAddress", "getOriginalCountryNm", "getOriginalPackSize", "getOriginalUnit", "getPrevOrderId", "()J", "getPrevOrgProductId", "setPrevOrgProductId", "(J)V", "getProductDetailsId", "getProductImageUrls", "getRxRequired", "getSubCompanyName", "getSubsCountryNm", "getSubsDiscountPercentage", "getSubsFound", "getSubsMedName", "getSubsMedProductCode", "getSubsMrp", "getSubsRecommendedQty", "getSubsSellingPrice", "getSubsUnit", "getSubstitutePackSize", "app_prodDebug"})
@androidx.room.Entity(tableName = "addedMedsTable12")
public final class CartMedicine {
    @androidx.room.PrimaryKey(autoGenerate = true)
    @androidx.room.ColumnInfo(name = "id")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long id = null;
    @androidx.room.ColumnInfo(name = "medicineId")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String medicineId = null;
    @androidx.room.ColumnInfo(name = "medicineName")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String medicineName = null;
    @androidx.room.ColumnInfo(name = "companyName")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String companyName = null;
    @androidx.room.ColumnInfo(name = "discount")
    private final double discount = 0.0;
    @androidx.room.ColumnInfo(name = "mrp")
    private final double mrp = 0.0;
    @androidx.room.ColumnInfo(name = "addedQty")
    private final int addedQty = 0;
    @androidx.room.ColumnInfo(name = "composition")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String composition = null;
    @androidx.room.ColumnInfo(name = "subDiscountPercentage")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String subsDiscountPercentage = null;
    @androidx.room.ColumnInfo(name = "subsSellingPrice")
    private final double subsSellingPrice = 0.0;
    @androidx.room.ColumnInfo(name = "isSubFound")
    private final boolean subsFound = false;
    @androidx.room.ColumnInfo(name = "isFromApi")
    private final boolean fromApi = false;
    @androidx.room.ColumnInfo(name = "subsMedProductCode")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String subsMedProductCode = null;
    @androidx.room.ColumnInfo(name = "subsMrp")
    private final double subsMrp = 0.0;
    @androidx.room.ColumnInfo(name = "subsMedName")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String subsMedName = null;
    @androidx.room.ColumnInfo(name = "subCompanyName")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String subCompanyName = null;
    @androidx.room.ColumnInfo(name = "isColdStorage")
    private final boolean coldStorage = false;
    @androidx.room.ColumnInfo(name = "drugType")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String drugType = null;
    @androidx.room.ColumnInfo(name = "originalPackSize")
    private final double originalPackSize = 0.0;
    @androidx.room.ColumnInfo(name = "substitutePackSize")
    private final double substitutePackSize = 0.0;
    @androidx.room.ColumnInfo(name = "prescriptionRequired")
    private final boolean rxRequired = false;
    @androidx.room.ColumnInfo(name = "maxCapped")
    private final int maxCapped = 0;
    @androidx.room.ColumnInfo(name = "subsReccommendedQty")
    private final int subsRecommendedQty = 0;
    @androidx.room.ColumnInfo(name = "originalCountryNm")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String originalCountryNm = null;
    @androidx.room.ColumnInfo(name = "subs_country_nm")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String subsCountryNm = null;
    @androidx.room.ColumnInfo(name = "subs_unit")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String subsUnit = null;
    @androidx.room.ColumnInfo(name = "original_unit")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String originalUnit = null;
    @androidx.room.ColumnInfo(name = "product_image_urls")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String productImageUrls = null;
    @androidx.room.ColumnInfo(name = "original_company_addr")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String originalCompanyAddress = null;
    @androidx.room.ColumnInfo(name = "orgAvailable")
    private final boolean orgAvailable = false;
    @androidx.room.ColumnInfo(name = "productDetailsId")
    private final long productDetailsId = 0L;
    @androidx.room.ColumnInfo(name = "prevOrderId")
    private final long prevOrderId = 0L;
    @androidx.room.ColumnInfo(name = "prevOrgProductId")
    private long prevOrgProductId;
    
    public CartMedicine(@org.jetbrains.annotations.Nullable()
    java.lang.Long id, @org.jetbrains.annotations.NotNull()
    java.lang.String medicineId, @org.jetbrains.annotations.Nullable()
    java.lang.String medicineName, @org.jetbrains.annotations.Nullable()
    java.lang.String companyName, double discount, double mrp, int addedQty, @org.jetbrains.annotations.Nullable()
    java.lang.String composition, @org.jetbrains.annotations.Nullable()
    java.lang.String subsDiscountPercentage, double subsSellingPrice, boolean subsFound, boolean fromApi, @org.jetbrains.annotations.Nullable()
    java.lang.String subsMedProductCode, double subsMrp, @org.jetbrains.annotations.Nullable()
    java.lang.String subsMedName, @org.jetbrains.annotations.Nullable()
    java.lang.String subCompanyName, boolean coldStorage, @org.jetbrains.annotations.Nullable()
    java.lang.String drugType, double originalPackSize, double substitutePackSize, boolean rxRequired, int maxCapped, int subsRecommendedQty, @org.jetbrains.annotations.Nullable()
    java.lang.String originalCountryNm, @org.jetbrains.annotations.Nullable()
    java.lang.String subsCountryNm, @org.jetbrains.annotations.Nullable()
    java.lang.String subsUnit, @org.jetbrains.annotations.Nullable()
    java.lang.String originalUnit, @org.jetbrains.annotations.Nullable()
    java.lang.String productImageUrls, @org.jetbrains.annotations.Nullable()
    java.lang.String originalCompanyAddress, boolean orgAvailable, long productDetailsId, long prevOrderId, long prevOrgProductId) {
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMedicineName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCompanyName() {
        return null;
    }
    
    public final double getDiscount() {
        return 0.0;
    }
    
    public final double getMrp() {
        return 0.0;
    }
    
    public final int getAddedQty() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getComposition() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSubsDiscountPercentage() {
        return null;
    }
    
    public final double getSubsSellingPrice() {
        return 0.0;
    }
    
    public final boolean getSubsFound() {
        return false;
    }
    
    public final boolean getFromApi() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSubsMedProductCode() {
        return null;
    }
    
    public final double getSubsMrp() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSubsMedName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSubCompanyName() {
        return null;
    }
    
    public final boolean getColdStorage() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDrugType() {
        return null;
    }
    
    public final double getOriginalPackSize() {
        return 0.0;
    }
    
    public final double getSubstitutePackSize() {
        return 0.0;
    }
    
    public final boolean getRxRequired() {
        return false;
    }
    
    public final int getMaxCapped() {
        return 0;
    }
    
    public final int getSubsRecommendedQty() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOriginalCountryNm() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSubsCountryNm() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSubsUnit() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOriginalUnit() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getProductImageUrls() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOriginalCompanyAddress() {
        return null;
    }
    
    public final boolean getOrgAvailable() {
        return false;
    }
    
    public final long getProductDetailsId() {
        return 0L;
    }
    
    public final long getPrevOrderId() {
        return 0L;
    }
    
    public final long getPrevOrgProductId() {
        return 0L;
    }
    
    public final void setPrevOrgProductId(long p0) {
    }
}