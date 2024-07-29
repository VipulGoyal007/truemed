package com.intellihealth.truemeds.data.repository.datasource.local.entity;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001BY\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0010R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u001e\u0010\u000e\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010 R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"\u00a8\u0006#"}, d2 = {"Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/RecentMedicine;", "", "id", "", "medicineName", "", "productCode", "iconType", "", "customerId", "addedDateTime", "keyName", "showHistoryIcon", "", "productImage", "drugType", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;JLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getAddedDateTime", "()J", "getCustomerId", "()Ljava/lang/String;", "getDrugType", "getIconType", "()I", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getKeyName", "getMedicineName", "getProductCode", "getProductImage", "setProductImage", "(Ljava/lang/String;)V", "getShowHistoryIcon", "()Z", "app_prodDebug"})
@androidx.room.Entity(tableName = "recentlySearched")
public final class RecentMedicine {
    @androidx.room.PrimaryKey()
    @androidx.room.ColumnInfo(name = "id")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long id = null;
    @androidx.room.ColumnInfo(name = "medicineName")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String medicineName = null;
    @androidx.room.ColumnInfo(name = "productCode")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String productCode = null;
    @androidx.room.ColumnInfo(name = "iconType")
    private final int iconType = 0;
    @androidx.room.ColumnInfo(name = "customerId")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String customerId = null;
    @androidx.room.ColumnInfo(name = "addedDateTime")
    private final long addedDateTime = 0L;
    @androidx.room.ColumnInfo(name = "elastic_search_type")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String keyName = null;
    @androidx.room.ColumnInfo(name = "showHistoryIcon")
    private final boolean showHistoryIcon = false;
    @androidx.room.ColumnInfo(name = "productImage")
    @org.jetbrains.annotations.NotNull()
    private java.lang.String productImage;
    @androidx.room.ColumnInfo(name = "drugType")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String drugType = null;
    
    public RecentMedicine(@org.jetbrains.annotations.Nullable()
    java.lang.Long id, @org.jetbrains.annotations.NotNull()
    java.lang.String medicineName, @org.jetbrains.annotations.NotNull()
    java.lang.String productCode, int iconType, @org.jetbrains.annotations.Nullable()
    java.lang.String customerId, long addedDateTime, @org.jetbrains.annotations.NotNull()
    java.lang.String keyName, boolean showHistoryIcon, @org.jetbrains.annotations.NotNull()
    java.lang.String productImage, @org.jetbrains.annotations.NotNull()
    java.lang.String drugType) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMedicineName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProductCode() {
        return null;
    }
    
    public final int getIconType() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCustomerId() {
        return null;
    }
    
    public final long getAddedDateTime() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKeyName() {
        return null;
    }
    
    public final boolean getShowHistoryIcon() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProductImage() {
        return null;
    }
    
    public final void setProductImage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDrugType() {
        return null;
    }
}