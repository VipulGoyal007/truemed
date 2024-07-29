package com.intellihealth.truemeds.presentation.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/intellihealth/truemeds/presentation/utils/SQLiteDBHelper;", "", "()V", "Companion", "app_stageAndroidDebug"})
public final class SQLiteDBHelper {
    @org.jetbrains.annotations.NotNull()
    public static final com.intellihealth.truemeds.presentation.utils.SQLiteDBHelper.Companion Companion = null;
    
    public SQLiteDBHelper() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00102\u0006\u0010\u0005\u001a\u00020\u0006J\u0018\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006J\u0016\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00102\u0006\u0010\u0005\u001a\u00020\u0006J \u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002\u00a8\u0006\u001e"}, d2 = {"Lcom/intellihealth/truemeds/presentation/utils/SQLiteDBHelper$Companion;", "", "()V", "clearAddedMeds", "", "db", "Landroid/database/sqlite/SQLiteDatabase;", "clearAddedSubOrg", "clearCartReplaceStatus", "clearCrossSelling", "clearDocConfirmationSubsOptions", "clearProductImage", "clearRecentlySearched", "clearReorderAlternateSubs", "clearSearchCategory", "getAddedMedsRecords", "", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/CartMedicine;", "getOrgSubsRecords", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/OrgSubsInfo;", "getRecentlySearchedMedicine", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/RecentMedicine;", "sqLiteDatabase", "getReorderAlternateRecords", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/ReorderAlternateSubs;", "isColumnExist", "", "tableName", "", "columnName", "app_stageAndroidDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.OrgSubsInfo> getOrgSubsRecords(@org.jetbrains.annotations.NotNull()
        android.database.sqlite.SQLiteDatabase db) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.CartMedicine> getAddedMedsRecords(@org.jetbrains.annotations.NotNull()
        android.database.sqlite.SQLiteDatabase db) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.ReorderAlternateSubs> getReorderAlternateRecords(@org.jetbrains.annotations.NotNull()
        android.database.sqlite.SQLiteDatabase db) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.RecentMedicine> getRecentlySearchedMedicine(@org.jetbrains.annotations.Nullable()
        android.database.sqlite.SQLiteDatabase sqLiteDatabase) {
            return null;
        }
        
        private final boolean isColumnExist(android.database.sqlite.SQLiteDatabase db, java.lang.String tableName, java.lang.String columnName) {
            return false;
        }
        
        public final void clearAddedMeds(@org.jetbrains.annotations.NotNull()
        android.database.sqlite.SQLiteDatabase db) {
        }
        
        public final void clearAddedSubOrg(@org.jetbrains.annotations.NotNull()
        android.database.sqlite.SQLiteDatabase db) {
        }
        
        public final void clearCartReplaceStatus(@org.jetbrains.annotations.NotNull()
        android.database.sqlite.SQLiteDatabase db) {
        }
        
        public final void clearReorderAlternateSubs(@org.jetbrains.annotations.NotNull()
        android.database.sqlite.SQLiteDatabase db) {
        }
        
        public final void clearCrossSelling(@org.jetbrains.annotations.NotNull()
        android.database.sqlite.SQLiteDatabase db) {
        }
        
        public final void clearSearchCategory(@org.jetbrains.annotations.NotNull()
        android.database.sqlite.SQLiteDatabase db) {
        }
        
        public final void clearRecentlySearched(@org.jetbrains.annotations.NotNull()
        android.database.sqlite.SQLiteDatabase db) {
        }
        
        public final void clearProductImage(@org.jetbrains.annotations.NotNull()
        android.database.sqlite.SQLiteDatabase db) {
        }
        
        public final void clearDocConfirmationSubsOptions(@org.jetbrains.annotations.NotNull()
        android.database.sqlite.SQLiteDatabase db) {
        }
    }
}