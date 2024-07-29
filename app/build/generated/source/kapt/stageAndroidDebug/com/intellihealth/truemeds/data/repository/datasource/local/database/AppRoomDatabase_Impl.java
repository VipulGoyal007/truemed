package com.intellihealth.truemeds.data.repository.datasource.local.database;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.intellihealth.truemeds.data.repository.datasource.local.TruemedsDao;
import com.intellihealth.truemeds.data.repository.datasource.local.TruemedsDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class AppRoomDatabase_Impl extends AppRoomDatabase {
  private volatile TruemedsDao _truemedsDao;

  @Override
  @NonNull
  protected SupportSQLiteOpenHelper createOpenHelper(@NonNull final DatabaseConfiguration config) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(config, new RoomOpenHelper.Delegate(5) {
      @Override
      public void createAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS `addedMedsTable12` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `medicineId` TEXT NOT NULL, `medicineName` TEXT, `companyName` TEXT, `discount` REAL NOT NULL, `mrp` REAL NOT NULL, `addedQty` INTEGER NOT NULL, `composition` TEXT, `subDiscountPercentage` TEXT, `subsSellingPrice` REAL NOT NULL, `isSubFound` INTEGER NOT NULL, `isFromApi` INTEGER NOT NULL, `subsMedProductCode` TEXT, `subsMrp` REAL NOT NULL, `subsMedName` TEXT, `subCompanyName` TEXT, `isColdStorage` INTEGER NOT NULL, `drugType` TEXT, `originalPackSize` REAL NOT NULL, `substitutePackSize` REAL NOT NULL, `prescriptionRequired` INTEGER NOT NULL, `maxCapped` INTEGER NOT NULL, `subsReccommendedQty` INTEGER NOT NULL, `originalCountryNm` TEXT, `subs_country_nm` TEXT, `subs_unit` TEXT, `original_unit` TEXT, `product_image_urls` TEXT, `original_company_addr` TEXT, `orgAvailable` INTEGER NOT NULL, `productDetailsId` INTEGER NOT NULL, `prevOrderId` INTEGER NOT NULL, `prevOrgProductId` INTEGER NOT NULL)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `reorder_alternate_subs` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `medicineId` TEXT NOT NULL, `patientID` INTEGER NOT NULL, `patientName` TEXT, `orderAddress` TEXT, `addressID` INTEGER NOT NULL, `orderID` INTEGER NOT NULL, `SubsMedProductCode` TEXT, `isSubAvailable` INTEGER, `subImageUrl` TEXT, `orgAddedQuantity` INTEGER NOT NULL, `altSubsMedProductCode` TEXT, `altSubsDiscountPercentage` REAL NOT NULL, `altSubsSellingPrice` REAL NOT NULL, `altSubsMrp` REAL NOT NULL, `altSubsMedName` TEXT, `altSubsCompanyName` TEXT, `isAltSubsColdStorage` INTEGER NOT NULL, `altSubsDrugType` TEXT, `altSubsRecommendedQty` INTEGER NOT NULL, `altSubsCountryName` TEXT, `altSubsUnit` TEXT, `altSubsImageUrl` TEXT, `altSubsCompanyAddress` TEXT, `isReplace` INTEGER NOT NULL, `subsPitched` INTEGER NOT NULL, `altSubsPackSize` REAL NOT NULL, `altSubsSavingPercentage` TEXT, `coldChainDisabled` INTEGER NOT NULL, `isAltSubAvailable` INTEGER NOT NULL, `isOrgDisabled` INTEGER NOT NULL, `cxAcceptedSubs` INTEGER NOT NULL, `cxKeepOriginal` INTEGER NOT NULL, `showOnlyOrg` INTEGER NOT NULL)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `addedSubsOrgInfo` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `medicineId` TEXT NOT NULL, `medicineName` TEXT, `companyName` TEXT, `discount` REAL NOT NULL, `mrp` REAL NOT NULL, `addedQty` INTEGER NOT NULL, `composition` TEXT, `subDiscountPercentage` TEXT, `subsSellingPrice` REAL NOT NULL, `isSubFound` INTEGER NOT NULL, `isFromApi` INTEGER NOT NULL, `subsMedProductCode` TEXT, `subsMrp` REAL NOT NULL, `subsMedName` TEXT, `subCompanyName` TEXT, `isColdStorage` INTEGER NOT NULL, `drugType` TEXT, `originalPackSize` REAL NOT NULL, `substitutePackSize` REAL NOT NULL, `prescriptionRequired` INTEGER NOT NULL, `maxCapped` INTEGER NOT NULL, `subsReccommendedQty` INTEGER NOT NULL, `originalCountryNm` TEXT, `subs_country_nm` TEXT, `subs_unit` TEXT, `original_unit` TEXT, `product_image_urls` TEXT, `original_company_addr` TEXT, `orgAvailable` INTEGER NOT NULL)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `recentlySearched` (`id` INTEGER, `medicineName` TEXT NOT NULL, `productCode` TEXT NOT NULL, `iconType` INTEGER NOT NULL, `customerId` TEXT, `addedDateTime` INTEGER NOT NULL, `elastic_search_type` TEXT NOT NULL, `showHistoryIcon` INTEGER NOT NULL, `productImage` TEXT NOT NULL, `drugType` TEXT NOT NULL, PRIMARY KEY(`id`))");
        db.execSQL("CREATE TABLE IF NOT EXISTS `savePillReminder` (`od` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `orderId` INTEGER NOT NULL, `patientId` TEXT NOT NULL)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `refferReminder` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `mobile` TEXT NOT NULL, `referTime` INTEGER NOT NULL)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `saveVideoFaq` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `orderId` INTEGER NOT NULL, `patientId` TEXT NOT NULL)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `cartReplaceStatus` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `medicineId` TEXT NOT NULL, `isAutoReplace` INTEGER NOT NULL)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `cartItemSequence` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `medicineId` TEXT NOT NULL, `sequence` INTEGER NOT NULL)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `doctor_confirmation_sub_options` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `key_name` TEXT NOT NULL, `key_value` TEXT NOT NULL, `reasonId` INTEGER NOT NULL)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `search_category` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `key_name` TEXT NOT NULL, `key_value` TEXT NOT NULL)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `AddedCrossSelling` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `ProductCode` TEXT NOT NULL)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `raise_ticket` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `issueId` INTEGER NOT NULL, `description` TEXT NOT NULL, `orderProductName` TEXT NOT NULL, `medicineId` TEXT NOT NULL, `orderProductQty` INTEGER NOT NULL, `orderProductPrice` REAL NOT NULL)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `productImage` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `productCode` TEXT NOT NULL, `images` TEXT NOT NULL, `addedDateTime` INTEGER NOT NULL)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `customer_category` (`id` INTEGER, `categoryType` TEXT NOT NULL, `category` TEXT NOT NULL, PRIMARY KEY(`id`))");
        db.execSQL("CREATE TABLE IF NOT EXISTS `customer_details` (`customerId` INTEGER, `mobileNo` TEXT NOT NULL, `emailAddress` TEXT, `profileImageUrl` TEXT, `customerName` TEXT, `genderName` TEXT, `age` TEXT, `languageId` INTEGER, `customerLastName` TEXT, PRIMARY KEY(`customerId`))");
        db.execSQL("CREATE TABLE IF NOT EXISTS `OrderFilter` (`id` INTEGER, `name` TEXT, `displayName` TEXT, PRIMARY KEY(`id`))");
        db.execSQL("CREATE TABLE IF NOT EXISTS `TmContactVersion` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `contactName` TEXT NOT NULL, `version` REAL NOT NULL)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `sub_opt_reasons` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `reasonId` INTEGER, `name` TEXT NOT NULL, `value` TEXT NOT NULL)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `cart_item_price` (`productCode` TEXT NOT NULL, `sellingPrice` REAL NOT NULL, PRIMARY KEY(`productCode`))");
        db.execSQL("CREATE TABLE IF NOT EXISTS `patientName` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `PatientName` TEXT, `SaveDate` INTEGER)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `item_added_attributes` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `productCode` TEXT NOT NULL, `clicked_on_page` TEXT NOT NULL, `page_section` TEXT NOT NULL, `section_heading` TEXT NOT NULL, `section_index` INTEGER NOT NULL)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `addedReorderCrossSelling` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `ProductCode` TEXT NOT NULL)");
        db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '39d6fbfdab37fd2c4535b65f68980919')");
      }

      @Override
      public void dropAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS `addedMedsTable12`");
        db.execSQL("DROP TABLE IF EXISTS `reorder_alternate_subs`");
        db.execSQL("DROP TABLE IF EXISTS `addedSubsOrgInfo`");
        db.execSQL("DROP TABLE IF EXISTS `recentlySearched`");
        db.execSQL("DROP TABLE IF EXISTS `savePillReminder`");
        db.execSQL("DROP TABLE IF EXISTS `refferReminder`");
        db.execSQL("DROP TABLE IF EXISTS `saveVideoFaq`");
        db.execSQL("DROP TABLE IF EXISTS `cartReplaceStatus`");
        db.execSQL("DROP TABLE IF EXISTS `cartItemSequence`");
        db.execSQL("DROP TABLE IF EXISTS `doctor_confirmation_sub_options`");
        db.execSQL("DROP TABLE IF EXISTS `search_category`");
        db.execSQL("DROP TABLE IF EXISTS `AddedCrossSelling`");
        db.execSQL("DROP TABLE IF EXISTS `raise_ticket`");
        db.execSQL("DROP TABLE IF EXISTS `productImage`");
        db.execSQL("DROP TABLE IF EXISTS `customer_category`");
        db.execSQL("DROP TABLE IF EXISTS `customer_details`");
        db.execSQL("DROP TABLE IF EXISTS `OrderFilter`");
        db.execSQL("DROP TABLE IF EXISTS `TmContactVersion`");
        db.execSQL("DROP TABLE IF EXISTS `sub_opt_reasons`");
        db.execSQL("DROP TABLE IF EXISTS `cart_item_price`");
        db.execSQL("DROP TABLE IF EXISTS `patientName`");
        db.execSQL("DROP TABLE IF EXISTS `item_added_attributes`");
        db.execSQL("DROP TABLE IF EXISTS `addedReorderCrossSelling`");
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onDestructiveMigration(db);
          }
        }
      }

      @Override
      public void onCreate(@NonNull final SupportSQLiteDatabase db) {
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onCreate(db);
          }
        }
      }

      @Override
      public void onOpen(@NonNull final SupportSQLiteDatabase db) {
        mDatabase = db;
        internalInitInvalidationTracker(db);
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onOpen(db);
          }
        }
      }

      @Override
      public void onPreMigrate(@NonNull final SupportSQLiteDatabase db) {
        DBUtil.dropFtsSyncTriggers(db);
      }

      @Override
      public void onPostMigrate(@NonNull final SupportSQLiteDatabase db) {
      }

      @Override
      @NonNull
      public RoomOpenHelper.ValidationResult onValidateSchema(
          @NonNull final SupportSQLiteDatabase db) {
        final HashMap<String, TableInfo.Column> _columnsAddedMedsTable12 = new HashMap<String, TableInfo.Column>(33);
        _columnsAddedMedsTable12.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedMedsTable12.put("medicineId", new TableInfo.Column("medicineId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedMedsTable12.put("medicineName", new TableInfo.Column("medicineName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedMedsTable12.put("companyName", new TableInfo.Column("companyName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedMedsTable12.put("discount", new TableInfo.Column("discount", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedMedsTable12.put("mrp", new TableInfo.Column("mrp", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedMedsTable12.put("addedQty", new TableInfo.Column("addedQty", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedMedsTable12.put("composition", new TableInfo.Column("composition", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedMedsTable12.put("subDiscountPercentage", new TableInfo.Column("subDiscountPercentage", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedMedsTable12.put("subsSellingPrice", new TableInfo.Column("subsSellingPrice", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedMedsTable12.put("isSubFound", new TableInfo.Column("isSubFound", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedMedsTable12.put("isFromApi", new TableInfo.Column("isFromApi", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedMedsTable12.put("subsMedProductCode", new TableInfo.Column("subsMedProductCode", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedMedsTable12.put("subsMrp", new TableInfo.Column("subsMrp", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedMedsTable12.put("subsMedName", new TableInfo.Column("subsMedName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedMedsTable12.put("subCompanyName", new TableInfo.Column("subCompanyName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedMedsTable12.put("isColdStorage", new TableInfo.Column("isColdStorage", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedMedsTable12.put("drugType", new TableInfo.Column("drugType", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedMedsTable12.put("originalPackSize", new TableInfo.Column("originalPackSize", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedMedsTable12.put("substitutePackSize", new TableInfo.Column("substitutePackSize", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedMedsTable12.put("prescriptionRequired", new TableInfo.Column("prescriptionRequired", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedMedsTable12.put("maxCapped", new TableInfo.Column("maxCapped", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedMedsTable12.put("subsReccommendedQty", new TableInfo.Column("subsReccommendedQty", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedMedsTable12.put("originalCountryNm", new TableInfo.Column("originalCountryNm", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedMedsTable12.put("subs_country_nm", new TableInfo.Column("subs_country_nm", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedMedsTable12.put("subs_unit", new TableInfo.Column("subs_unit", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedMedsTable12.put("original_unit", new TableInfo.Column("original_unit", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedMedsTable12.put("product_image_urls", new TableInfo.Column("product_image_urls", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedMedsTable12.put("original_company_addr", new TableInfo.Column("original_company_addr", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedMedsTable12.put("orgAvailable", new TableInfo.Column("orgAvailable", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedMedsTable12.put("productDetailsId", new TableInfo.Column("productDetailsId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedMedsTable12.put("prevOrderId", new TableInfo.Column("prevOrderId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedMedsTable12.put("prevOrgProductId", new TableInfo.Column("prevOrgProductId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysAddedMedsTable12 = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesAddedMedsTable12 = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoAddedMedsTable12 = new TableInfo("addedMedsTable12", _columnsAddedMedsTable12, _foreignKeysAddedMedsTable12, _indicesAddedMedsTable12);
        final TableInfo _existingAddedMedsTable12 = TableInfo.read(db, "addedMedsTable12");
        if (!_infoAddedMedsTable12.equals(_existingAddedMedsTable12)) {
          return new RoomOpenHelper.ValidationResult(false, "addedMedsTable12(com.intellihealth.truemeds.data.repository.datasource.local.entity.CartMedicine).\n"
                  + " Expected:\n" + _infoAddedMedsTable12 + "\n"
                  + " Found:\n" + _existingAddedMedsTable12);
        }
        final HashMap<String, TableInfo.Column> _columnsReorderAlternateSubs = new HashMap<String, TableInfo.Column>(34);
        _columnsReorderAlternateSubs.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReorderAlternateSubs.put("medicineId", new TableInfo.Column("medicineId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReorderAlternateSubs.put("patientID", new TableInfo.Column("patientID", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReorderAlternateSubs.put("patientName", new TableInfo.Column("patientName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReorderAlternateSubs.put("orderAddress", new TableInfo.Column("orderAddress", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReorderAlternateSubs.put("addressID", new TableInfo.Column("addressID", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReorderAlternateSubs.put("orderID", new TableInfo.Column("orderID", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReorderAlternateSubs.put("SubsMedProductCode", new TableInfo.Column("SubsMedProductCode", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReorderAlternateSubs.put("isSubAvailable", new TableInfo.Column("isSubAvailable", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReorderAlternateSubs.put("subImageUrl", new TableInfo.Column("subImageUrl", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReorderAlternateSubs.put("orgAddedQuantity", new TableInfo.Column("orgAddedQuantity", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReorderAlternateSubs.put("altSubsMedProductCode", new TableInfo.Column("altSubsMedProductCode", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReorderAlternateSubs.put("altSubsDiscountPercentage", new TableInfo.Column("altSubsDiscountPercentage", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReorderAlternateSubs.put("altSubsSellingPrice", new TableInfo.Column("altSubsSellingPrice", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReorderAlternateSubs.put("altSubsMrp", new TableInfo.Column("altSubsMrp", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReorderAlternateSubs.put("altSubsMedName", new TableInfo.Column("altSubsMedName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReorderAlternateSubs.put("altSubsCompanyName", new TableInfo.Column("altSubsCompanyName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReorderAlternateSubs.put("isAltSubsColdStorage", new TableInfo.Column("isAltSubsColdStorage", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReorderAlternateSubs.put("altSubsDrugType", new TableInfo.Column("altSubsDrugType", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReorderAlternateSubs.put("altSubsRecommendedQty", new TableInfo.Column("altSubsRecommendedQty", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReorderAlternateSubs.put("altSubsCountryName", new TableInfo.Column("altSubsCountryName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReorderAlternateSubs.put("altSubsUnit", new TableInfo.Column("altSubsUnit", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReorderAlternateSubs.put("altSubsImageUrl", new TableInfo.Column("altSubsImageUrl", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReorderAlternateSubs.put("altSubsCompanyAddress", new TableInfo.Column("altSubsCompanyAddress", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReorderAlternateSubs.put("isReplace", new TableInfo.Column("isReplace", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReorderAlternateSubs.put("subsPitched", new TableInfo.Column("subsPitched", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReorderAlternateSubs.put("altSubsPackSize", new TableInfo.Column("altSubsPackSize", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReorderAlternateSubs.put("altSubsSavingPercentage", new TableInfo.Column("altSubsSavingPercentage", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReorderAlternateSubs.put("coldChainDisabled", new TableInfo.Column("coldChainDisabled", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReorderAlternateSubs.put("isAltSubAvailable", new TableInfo.Column("isAltSubAvailable", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReorderAlternateSubs.put("isOrgDisabled", new TableInfo.Column("isOrgDisabled", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReorderAlternateSubs.put("cxAcceptedSubs", new TableInfo.Column("cxAcceptedSubs", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReorderAlternateSubs.put("cxKeepOriginal", new TableInfo.Column("cxKeepOriginal", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReorderAlternateSubs.put("showOnlyOrg", new TableInfo.Column("showOnlyOrg", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysReorderAlternateSubs = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesReorderAlternateSubs = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoReorderAlternateSubs = new TableInfo("reorder_alternate_subs", _columnsReorderAlternateSubs, _foreignKeysReorderAlternateSubs, _indicesReorderAlternateSubs);
        final TableInfo _existingReorderAlternateSubs = TableInfo.read(db, "reorder_alternate_subs");
        if (!_infoReorderAlternateSubs.equals(_existingReorderAlternateSubs)) {
          return new RoomOpenHelper.ValidationResult(false, "reorder_alternate_subs(com.intellihealth.truemeds.data.repository.datasource.local.entity.ReorderAlternateSubs).\n"
                  + " Expected:\n" + _infoReorderAlternateSubs + "\n"
                  + " Found:\n" + _existingReorderAlternateSubs);
        }
        final HashMap<String, TableInfo.Column> _columnsAddedSubsOrgInfo = new HashMap<String, TableInfo.Column>(30);
        _columnsAddedSubsOrgInfo.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedSubsOrgInfo.put("medicineId", new TableInfo.Column("medicineId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedSubsOrgInfo.put("medicineName", new TableInfo.Column("medicineName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedSubsOrgInfo.put("companyName", new TableInfo.Column("companyName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedSubsOrgInfo.put("discount", new TableInfo.Column("discount", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedSubsOrgInfo.put("mrp", new TableInfo.Column("mrp", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedSubsOrgInfo.put("addedQty", new TableInfo.Column("addedQty", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedSubsOrgInfo.put("composition", new TableInfo.Column("composition", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedSubsOrgInfo.put("subDiscountPercentage", new TableInfo.Column("subDiscountPercentage", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedSubsOrgInfo.put("subsSellingPrice", new TableInfo.Column("subsSellingPrice", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedSubsOrgInfo.put("isSubFound", new TableInfo.Column("isSubFound", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedSubsOrgInfo.put("isFromApi", new TableInfo.Column("isFromApi", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedSubsOrgInfo.put("subsMedProductCode", new TableInfo.Column("subsMedProductCode", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedSubsOrgInfo.put("subsMrp", new TableInfo.Column("subsMrp", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedSubsOrgInfo.put("subsMedName", new TableInfo.Column("subsMedName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedSubsOrgInfo.put("subCompanyName", new TableInfo.Column("subCompanyName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedSubsOrgInfo.put("isColdStorage", new TableInfo.Column("isColdStorage", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedSubsOrgInfo.put("drugType", new TableInfo.Column("drugType", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedSubsOrgInfo.put("originalPackSize", new TableInfo.Column("originalPackSize", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedSubsOrgInfo.put("substitutePackSize", new TableInfo.Column("substitutePackSize", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedSubsOrgInfo.put("prescriptionRequired", new TableInfo.Column("prescriptionRequired", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedSubsOrgInfo.put("maxCapped", new TableInfo.Column("maxCapped", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedSubsOrgInfo.put("subsReccommendedQty", new TableInfo.Column("subsReccommendedQty", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedSubsOrgInfo.put("originalCountryNm", new TableInfo.Column("originalCountryNm", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedSubsOrgInfo.put("subs_country_nm", new TableInfo.Column("subs_country_nm", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedSubsOrgInfo.put("subs_unit", new TableInfo.Column("subs_unit", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedSubsOrgInfo.put("original_unit", new TableInfo.Column("original_unit", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedSubsOrgInfo.put("product_image_urls", new TableInfo.Column("product_image_urls", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedSubsOrgInfo.put("original_company_addr", new TableInfo.Column("original_company_addr", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedSubsOrgInfo.put("orgAvailable", new TableInfo.Column("orgAvailable", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysAddedSubsOrgInfo = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesAddedSubsOrgInfo = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoAddedSubsOrgInfo = new TableInfo("addedSubsOrgInfo", _columnsAddedSubsOrgInfo, _foreignKeysAddedSubsOrgInfo, _indicesAddedSubsOrgInfo);
        final TableInfo _existingAddedSubsOrgInfo = TableInfo.read(db, "addedSubsOrgInfo");
        if (!_infoAddedSubsOrgInfo.equals(_existingAddedSubsOrgInfo)) {
          return new RoomOpenHelper.ValidationResult(false, "addedSubsOrgInfo(com.intellihealth.truemeds.data.repository.datasource.local.entity.OrgSubsInfo).\n"
                  + " Expected:\n" + _infoAddedSubsOrgInfo + "\n"
                  + " Found:\n" + _existingAddedSubsOrgInfo);
        }
        final HashMap<String, TableInfo.Column> _columnsRecentlySearched = new HashMap<String, TableInfo.Column>(10);
        _columnsRecentlySearched.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecentlySearched.put("medicineName", new TableInfo.Column("medicineName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecentlySearched.put("productCode", new TableInfo.Column("productCode", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecentlySearched.put("iconType", new TableInfo.Column("iconType", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecentlySearched.put("customerId", new TableInfo.Column("customerId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecentlySearched.put("addedDateTime", new TableInfo.Column("addedDateTime", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecentlySearched.put("elastic_search_type", new TableInfo.Column("elastic_search_type", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecentlySearched.put("showHistoryIcon", new TableInfo.Column("showHistoryIcon", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecentlySearched.put("productImage", new TableInfo.Column("productImage", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecentlySearched.put("drugType", new TableInfo.Column("drugType", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysRecentlySearched = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesRecentlySearched = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoRecentlySearched = new TableInfo("recentlySearched", _columnsRecentlySearched, _foreignKeysRecentlySearched, _indicesRecentlySearched);
        final TableInfo _existingRecentlySearched = TableInfo.read(db, "recentlySearched");
        if (!_infoRecentlySearched.equals(_existingRecentlySearched)) {
          return new RoomOpenHelper.ValidationResult(false, "recentlySearched(com.intellihealth.truemeds.data.repository.datasource.local.entity.RecentMedicine).\n"
                  + " Expected:\n" + _infoRecentlySearched + "\n"
                  + " Found:\n" + _existingRecentlySearched);
        }
        final HashMap<String, TableInfo.Column> _columnsSavePillReminder = new HashMap<String, TableInfo.Column>(3);
        _columnsSavePillReminder.put("od", new TableInfo.Column("od", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSavePillReminder.put("orderId", new TableInfo.Column("orderId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSavePillReminder.put("patientId", new TableInfo.Column("patientId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSavePillReminder = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSavePillReminder = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSavePillReminder = new TableInfo("savePillReminder", _columnsSavePillReminder, _foreignKeysSavePillReminder, _indicesSavePillReminder);
        final TableInfo _existingSavePillReminder = TableInfo.read(db, "savePillReminder");
        if (!_infoSavePillReminder.equals(_existingSavePillReminder)) {
          return new RoomOpenHelper.ValidationResult(false, "savePillReminder(com.intellihealth.truemeds.data.repository.datasource.local.entity.PillReminder).\n"
                  + " Expected:\n" + _infoSavePillReminder + "\n"
                  + " Found:\n" + _existingSavePillReminder);
        }
        final HashMap<String, TableInfo.Column> _columnsRefferReminder = new HashMap<String, TableInfo.Column>(3);
        _columnsRefferReminder.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRefferReminder.put("mobile", new TableInfo.Column("mobile", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRefferReminder.put("referTime", new TableInfo.Column("referTime", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysRefferReminder = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesRefferReminder = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoRefferReminder = new TableInfo("refferReminder", _columnsRefferReminder, _foreignKeysRefferReminder, _indicesRefferReminder);
        final TableInfo _existingRefferReminder = TableInfo.read(db, "refferReminder");
        if (!_infoRefferReminder.equals(_existingRefferReminder)) {
          return new RoomOpenHelper.ValidationResult(false, "refferReminder(com.intellihealth.truemeds.data.repository.datasource.local.entity.ReferReminder).\n"
                  + " Expected:\n" + _infoRefferReminder + "\n"
                  + " Found:\n" + _existingRefferReminder);
        }
        final HashMap<String, TableInfo.Column> _columnsSaveVideoFaq = new HashMap<String, TableInfo.Column>(3);
        _columnsSaveVideoFaq.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSaveVideoFaq.put("orderId", new TableInfo.Column("orderId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSaveVideoFaq.put("patientId", new TableInfo.Column("patientId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSaveVideoFaq = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSaveVideoFaq = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSaveVideoFaq = new TableInfo("saveVideoFaq", _columnsSaveVideoFaq, _foreignKeysSaveVideoFaq, _indicesSaveVideoFaq);
        final TableInfo _existingSaveVideoFaq = TableInfo.read(db, "saveVideoFaq");
        if (!_infoSaveVideoFaq.equals(_existingSaveVideoFaq)) {
          return new RoomOpenHelper.ValidationResult(false, "saveVideoFaq(com.intellihealth.truemeds.data.repository.datasource.local.entity.SaveVideoFAQ).\n"
                  + " Expected:\n" + _infoSaveVideoFaq + "\n"
                  + " Found:\n" + _existingSaveVideoFaq);
        }
        final HashMap<String, TableInfo.Column> _columnsCartReplaceStatus = new HashMap<String, TableInfo.Column>(3);
        _columnsCartReplaceStatus.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCartReplaceStatus.put("medicineId", new TableInfo.Column("medicineId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCartReplaceStatus.put("isAutoReplace", new TableInfo.Column("isAutoReplace", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCartReplaceStatus = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCartReplaceStatus = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCartReplaceStatus = new TableInfo("cartReplaceStatus", _columnsCartReplaceStatus, _foreignKeysCartReplaceStatus, _indicesCartReplaceStatus);
        final TableInfo _existingCartReplaceStatus = TableInfo.read(db, "cartReplaceStatus");
        if (!_infoCartReplaceStatus.equals(_existingCartReplaceStatus)) {
          return new RoomOpenHelper.ValidationResult(false, "cartReplaceStatus(com.intellihealth.truemeds.data.repository.datasource.local.entity.CartReplaceStatus).\n"
                  + " Expected:\n" + _infoCartReplaceStatus + "\n"
                  + " Found:\n" + _existingCartReplaceStatus);
        }
        final HashMap<String, TableInfo.Column> _columnsCartItemSequence = new HashMap<String, TableInfo.Column>(3);
        _columnsCartItemSequence.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCartItemSequence.put("medicineId", new TableInfo.Column("medicineId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCartItemSequence.put("sequence", new TableInfo.Column("sequence", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCartItemSequence = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCartItemSequence = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCartItemSequence = new TableInfo("cartItemSequence", _columnsCartItemSequence, _foreignKeysCartItemSequence, _indicesCartItemSequence);
        final TableInfo _existingCartItemSequence = TableInfo.read(db, "cartItemSequence");
        if (!_infoCartItemSequence.equals(_existingCartItemSequence)) {
          return new RoomOpenHelper.ValidationResult(false, "cartItemSequence(com.intellihealth.truemeds.data.repository.datasource.local.entity.CartItemSequence).\n"
                  + " Expected:\n" + _infoCartItemSequence + "\n"
                  + " Found:\n" + _existingCartItemSequence);
        }
        final HashMap<String, TableInfo.Column> _columnsDoctorConfirmationSubOptions = new HashMap<String, TableInfo.Column>(4);
        _columnsDoctorConfirmationSubOptions.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDoctorConfirmationSubOptions.put("key_name", new TableInfo.Column("key_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDoctorConfirmationSubOptions.put("key_value", new TableInfo.Column("key_value", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDoctorConfirmationSubOptions.put("reasonId", new TableInfo.Column("reasonId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysDoctorConfirmationSubOptions = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesDoctorConfirmationSubOptions = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoDoctorConfirmationSubOptions = new TableInfo("doctor_confirmation_sub_options", _columnsDoctorConfirmationSubOptions, _foreignKeysDoctorConfirmationSubOptions, _indicesDoctorConfirmationSubOptions);
        final TableInfo _existingDoctorConfirmationSubOptions = TableInfo.read(db, "doctor_confirmation_sub_options");
        if (!_infoDoctorConfirmationSubOptions.equals(_existingDoctorConfirmationSubOptions)) {
          return new RoomOpenHelper.ValidationResult(false, "doctor_confirmation_sub_options(com.intellihealth.truemeds.data.repository.datasource.local.entity.DoctorConfirmationSubOptions).\n"
                  + " Expected:\n" + _infoDoctorConfirmationSubOptions + "\n"
                  + " Found:\n" + _existingDoctorConfirmationSubOptions);
        }
        final HashMap<String, TableInfo.Column> _columnsSearchCategory = new HashMap<String, TableInfo.Column>(3);
        _columnsSearchCategory.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSearchCategory.put("key_name", new TableInfo.Column("key_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSearchCategory.put("key_value", new TableInfo.Column("key_value", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSearchCategory = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSearchCategory = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSearchCategory = new TableInfo("search_category", _columnsSearchCategory, _foreignKeysSearchCategory, _indicesSearchCategory);
        final TableInfo _existingSearchCategory = TableInfo.read(db, "search_category");
        if (!_infoSearchCategory.equals(_existingSearchCategory)) {
          return new RoomOpenHelper.ValidationResult(false, "search_category(com.intellihealth.truemeds.data.repository.datasource.local.entity.SearchCategory).\n"
                  + " Expected:\n" + _infoSearchCategory + "\n"
                  + " Found:\n" + _existingSearchCategory);
        }
        final HashMap<String, TableInfo.Column> _columnsAddedCrossSelling = new HashMap<String, TableInfo.Column>(2);
        _columnsAddedCrossSelling.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedCrossSelling.put("ProductCode", new TableInfo.Column("ProductCode", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysAddedCrossSelling = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesAddedCrossSelling = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoAddedCrossSelling = new TableInfo("AddedCrossSelling", _columnsAddedCrossSelling, _foreignKeysAddedCrossSelling, _indicesAddedCrossSelling);
        final TableInfo _existingAddedCrossSelling = TableInfo.read(db, "AddedCrossSelling");
        if (!_infoAddedCrossSelling.equals(_existingAddedCrossSelling)) {
          return new RoomOpenHelper.ValidationResult(false, "AddedCrossSelling(com.intellihealth.truemeds.data.repository.datasource.local.entity.AddedCrossSelling).\n"
                  + " Expected:\n" + _infoAddedCrossSelling + "\n"
                  + " Found:\n" + _existingAddedCrossSelling);
        }
        final HashMap<String, TableInfo.Column> _columnsRaiseTicket = new HashMap<String, TableInfo.Column>(7);
        _columnsRaiseTicket.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRaiseTicket.put("issueId", new TableInfo.Column("issueId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRaiseTicket.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRaiseTicket.put("orderProductName", new TableInfo.Column("orderProductName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRaiseTicket.put("medicineId", new TableInfo.Column("medicineId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRaiseTicket.put("orderProductQty", new TableInfo.Column("orderProductQty", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRaiseTicket.put("orderProductPrice", new TableInfo.Column("orderProductPrice", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysRaiseTicket = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesRaiseTicket = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoRaiseTicket = new TableInfo("raise_ticket", _columnsRaiseTicket, _foreignKeysRaiseTicket, _indicesRaiseTicket);
        final TableInfo _existingRaiseTicket = TableInfo.read(db, "raise_ticket");
        if (!_infoRaiseTicket.equals(_existingRaiseTicket)) {
          return new RoomOpenHelper.ValidationResult(false, "raise_ticket(com.intellihealth.truemeds.data.repository.datasource.local.entity.OrderTicket).\n"
                  + " Expected:\n" + _infoRaiseTicket + "\n"
                  + " Found:\n" + _existingRaiseTicket);
        }
        final HashMap<String, TableInfo.Column> _columnsProductImage = new HashMap<String, TableInfo.Column>(4);
        _columnsProductImage.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProductImage.put("productCode", new TableInfo.Column("productCode", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProductImage.put("images", new TableInfo.Column("images", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProductImage.put("addedDateTime", new TableInfo.Column("addedDateTime", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysProductImage = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesProductImage = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoProductImage = new TableInfo("productImage", _columnsProductImage, _foreignKeysProductImage, _indicesProductImage);
        final TableInfo _existingProductImage = TableInfo.read(db, "productImage");
        if (!_infoProductImage.equals(_existingProductImage)) {
          return new RoomOpenHelper.ValidationResult(false, "productImage(com.intellihealth.truemeds.data.repository.datasource.local.entity.ProductImage).\n"
                  + " Expected:\n" + _infoProductImage + "\n"
                  + " Found:\n" + _existingProductImage);
        }
        final HashMap<String, TableInfo.Column> _columnsCustomerCategory = new HashMap<String, TableInfo.Column>(3);
        _columnsCustomerCategory.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCustomerCategory.put("categoryType", new TableInfo.Column("categoryType", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCustomerCategory.put("category", new TableInfo.Column("category", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCustomerCategory = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCustomerCategory = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCustomerCategory = new TableInfo("customer_category", _columnsCustomerCategory, _foreignKeysCustomerCategory, _indicesCustomerCategory);
        final TableInfo _existingCustomerCategory = TableInfo.read(db, "customer_category");
        if (!_infoCustomerCategory.equals(_existingCustomerCategory)) {
          return new RoomOpenHelper.ValidationResult(false, "customer_category(com.intellihealth.truemeds.data.repository.datasource.local.entity.CustomerCategory).\n"
                  + " Expected:\n" + _infoCustomerCategory + "\n"
                  + " Found:\n" + _existingCustomerCategory);
        }
        final HashMap<String, TableInfo.Column> _columnsCustomerDetails = new HashMap<String, TableInfo.Column>(9);
        _columnsCustomerDetails.put("customerId", new TableInfo.Column("customerId", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCustomerDetails.put("mobileNo", new TableInfo.Column("mobileNo", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCustomerDetails.put("emailAddress", new TableInfo.Column("emailAddress", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCustomerDetails.put("profileImageUrl", new TableInfo.Column("profileImageUrl", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCustomerDetails.put("customerName", new TableInfo.Column("customerName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCustomerDetails.put("genderName", new TableInfo.Column("genderName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCustomerDetails.put("age", new TableInfo.Column("age", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCustomerDetails.put("languageId", new TableInfo.Column("languageId", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCustomerDetails.put("customerLastName", new TableInfo.Column("customerLastName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCustomerDetails = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCustomerDetails = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCustomerDetails = new TableInfo("customer_details", _columnsCustomerDetails, _foreignKeysCustomerDetails, _indicesCustomerDetails);
        final TableInfo _existingCustomerDetails = TableInfo.read(db, "customer_details");
        if (!_infoCustomerDetails.equals(_existingCustomerDetails)) {
          return new RoomOpenHelper.ValidationResult(false, "customer_details(com.intellihealth.truemeds.data.repository.datasource.local.entity.CustomerDetails).\n"
                  + " Expected:\n" + _infoCustomerDetails + "\n"
                  + " Found:\n" + _existingCustomerDetails);
        }
        final HashMap<String, TableInfo.Column> _columnsOrderFilter = new HashMap<String, TableInfo.Column>(3);
        _columnsOrderFilter.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrderFilter.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrderFilter.put("displayName", new TableInfo.Column("displayName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysOrderFilter = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesOrderFilter = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoOrderFilter = new TableInfo("OrderFilter", _columnsOrderFilter, _foreignKeysOrderFilter, _indicesOrderFilter);
        final TableInfo _existingOrderFilter = TableInfo.read(db, "OrderFilter");
        if (!_infoOrderFilter.equals(_existingOrderFilter)) {
          return new RoomOpenHelper.ValidationResult(false, "OrderFilter(com.intellihealth.truemeds.data.repository.datasource.local.entity.OrderFilter).\n"
                  + " Expected:\n" + _infoOrderFilter + "\n"
                  + " Found:\n" + _existingOrderFilter);
        }
        final HashMap<String, TableInfo.Column> _columnsTmContactVersion = new HashMap<String, TableInfo.Column>(3);
        _columnsTmContactVersion.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTmContactVersion.put("contactName", new TableInfo.Column("contactName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTmContactVersion.put("version", new TableInfo.Column("version", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTmContactVersion = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTmContactVersion = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTmContactVersion = new TableInfo("TmContactVersion", _columnsTmContactVersion, _foreignKeysTmContactVersion, _indicesTmContactVersion);
        final TableInfo _existingTmContactVersion = TableInfo.read(db, "TmContactVersion");
        if (!_infoTmContactVersion.equals(_existingTmContactVersion)) {
          return new RoomOpenHelper.ValidationResult(false, "TmContactVersion(com.intellihealth.truemeds.data.repository.datasource.local.entity.TmContactVersion).\n"
                  + " Expected:\n" + _infoTmContactVersion + "\n"
                  + " Found:\n" + _existingTmContactVersion);
        }
        final HashMap<String, TableInfo.Column> _columnsSubOptReasons = new HashMap<String, TableInfo.Column>(4);
        _columnsSubOptReasons.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubOptReasons.put("reasonId", new TableInfo.Column("reasonId", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubOptReasons.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubOptReasons.put("value", new TableInfo.Column("value", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSubOptReasons = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSubOptReasons = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSubOptReasons = new TableInfo("sub_opt_reasons", _columnsSubOptReasons, _foreignKeysSubOptReasons, _indicesSubOptReasons);
        final TableInfo _existingSubOptReasons = TableInfo.read(db, "sub_opt_reasons");
        if (!_infoSubOptReasons.equals(_existingSubOptReasons)) {
          return new RoomOpenHelper.ValidationResult(false, "sub_opt_reasons(com.intellihealth.truemeds.data.repository.datasource.local.entity.SubOptReasons).\n"
                  + " Expected:\n" + _infoSubOptReasons + "\n"
                  + " Found:\n" + _existingSubOptReasons);
        }
        final HashMap<String, TableInfo.Column> _columnsCartItemPrice = new HashMap<String, TableInfo.Column>(2);
        _columnsCartItemPrice.put("productCode", new TableInfo.Column("productCode", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCartItemPrice.put("sellingPrice", new TableInfo.Column("sellingPrice", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCartItemPrice = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCartItemPrice = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCartItemPrice = new TableInfo("cart_item_price", _columnsCartItemPrice, _foreignKeysCartItemPrice, _indicesCartItemPrice);
        final TableInfo _existingCartItemPrice = TableInfo.read(db, "cart_item_price");
        if (!_infoCartItemPrice.equals(_existingCartItemPrice)) {
          return new RoomOpenHelper.ValidationResult(false, "cart_item_price(com.intellihealth.truemeds.data.repository.datasource.local.entity.CartItemSellingPrice).\n"
                  + " Expected:\n" + _infoCartItemPrice + "\n"
                  + " Found:\n" + _existingCartItemPrice);
        }
        final HashMap<String, TableInfo.Column> _columnsPatientName = new HashMap<String, TableInfo.Column>(3);
        _columnsPatientName.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPatientName.put("PatientName", new TableInfo.Column("PatientName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPatientName.put("SaveDate", new TableInfo.Column("SaveDate", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPatientName = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPatientName = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoPatientName = new TableInfo("patientName", _columnsPatientName, _foreignKeysPatientName, _indicesPatientName);
        final TableInfo _existingPatientName = TableInfo.read(db, "patientName");
        if (!_infoPatientName.equals(_existingPatientName)) {
          return new RoomOpenHelper.ValidationResult(false, "patientName(com.intellihealth.truemeds.data.repository.datasource.local.entity.PatientNameEntity).\n"
                  + " Expected:\n" + _infoPatientName + "\n"
                  + " Found:\n" + _existingPatientName);
        }
        final HashMap<String, TableInfo.Column> _columnsItemAddedAttributes = new HashMap<String, TableInfo.Column>(6);
        _columnsItemAddedAttributes.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItemAddedAttributes.put("productCode", new TableInfo.Column("productCode", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItemAddedAttributes.put("clicked_on_page", new TableInfo.Column("clicked_on_page", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItemAddedAttributes.put("page_section", new TableInfo.Column("page_section", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItemAddedAttributes.put("section_heading", new TableInfo.Column("section_heading", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItemAddedAttributes.put("section_index", new TableInfo.Column("section_index", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysItemAddedAttributes = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesItemAddedAttributes = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoItemAddedAttributes = new TableInfo("item_added_attributes", _columnsItemAddedAttributes, _foreignKeysItemAddedAttributes, _indicesItemAddedAttributes);
        final TableInfo _existingItemAddedAttributes = TableInfo.read(db, "item_added_attributes");
        if (!_infoItemAddedAttributes.equals(_existingItemAddedAttributes)) {
          return new RoomOpenHelper.ValidationResult(false, "item_added_attributes(com.intellihealth.truemeds.data.repository.datasource.local.entity.ItemAddedEventAttributes).\n"
                  + " Expected:\n" + _infoItemAddedAttributes + "\n"
                  + " Found:\n" + _existingItemAddedAttributes);
        }
        final HashMap<String, TableInfo.Column> _columnsAddedReorderCrossSelling = new HashMap<String, TableInfo.Column>(2);
        _columnsAddedReorderCrossSelling.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddedReorderCrossSelling.put("ProductCode", new TableInfo.Column("ProductCode", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysAddedReorderCrossSelling = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesAddedReorderCrossSelling = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoAddedReorderCrossSelling = new TableInfo("addedReorderCrossSelling", _columnsAddedReorderCrossSelling, _foreignKeysAddedReorderCrossSelling, _indicesAddedReorderCrossSelling);
        final TableInfo _existingAddedReorderCrossSelling = TableInfo.read(db, "addedReorderCrossSelling");
        if (!_infoAddedReorderCrossSelling.equals(_existingAddedReorderCrossSelling)) {
          return new RoomOpenHelper.ValidationResult(false, "addedReorderCrossSelling(com.intellihealth.truemeds.data.repository.datasource.local.entity.AddedReorderCrossSelling).\n"
                  + " Expected:\n" + _infoAddedReorderCrossSelling + "\n"
                  + " Found:\n" + _existingAddedReorderCrossSelling);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "39d6fbfdab37fd2c4535b65f68980919", "ae549bee6193c8ab1556e7cf80719054");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(config.context).name(config.name).callback(_openCallback).build();
    final SupportSQLiteOpenHelper _helper = config.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  @NonNull
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    final HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "addedMedsTable12","reorder_alternate_subs","addedSubsOrgInfo","recentlySearched","savePillReminder","refferReminder","saveVideoFaq","cartReplaceStatus","cartItemSequence","doctor_confirmation_sub_options","search_category","AddedCrossSelling","raise_ticket","productImage","customer_category","customer_details","OrderFilter","TmContactVersion","sub_opt_reasons","cart_item_price","patientName","item_added_attributes","addedReorderCrossSelling");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `addedMedsTable12`");
      _db.execSQL("DELETE FROM `reorder_alternate_subs`");
      _db.execSQL("DELETE FROM `addedSubsOrgInfo`");
      _db.execSQL("DELETE FROM `recentlySearched`");
      _db.execSQL("DELETE FROM `savePillReminder`");
      _db.execSQL("DELETE FROM `refferReminder`");
      _db.execSQL("DELETE FROM `saveVideoFaq`");
      _db.execSQL("DELETE FROM `cartReplaceStatus`");
      _db.execSQL("DELETE FROM `cartItemSequence`");
      _db.execSQL("DELETE FROM `doctor_confirmation_sub_options`");
      _db.execSQL("DELETE FROM `search_category`");
      _db.execSQL("DELETE FROM `AddedCrossSelling`");
      _db.execSQL("DELETE FROM `raise_ticket`");
      _db.execSQL("DELETE FROM `productImage`");
      _db.execSQL("DELETE FROM `customer_category`");
      _db.execSQL("DELETE FROM `customer_details`");
      _db.execSQL("DELETE FROM `OrderFilter`");
      _db.execSQL("DELETE FROM `TmContactVersion`");
      _db.execSQL("DELETE FROM `sub_opt_reasons`");
      _db.execSQL("DELETE FROM `cart_item_price`");
      _db.execSQL("DELETE FROM `patientName`");
      _db.execSQL("DELETE FROM `item_added_attributes`");
      _db.execSQL("DELETE FROM `addedReorderCrossSelling`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  @NonNull
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(TruemedsDao.class, TruemedsDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  @NonNull
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  @NonNull
  public List<Migration> getAutoMigrations(
      @NonNull final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
    final List<Migration> _autoMigrations = new ArrayList<Migration>();
    return _autoMigrations;
  }

  @Override
  public TruemedsDao getAppDao() {
    if (_truemedsDao != null) {
      return _truemedsDao;
    } else {
      synchronized(this) {
        if(_truemedsDao == null) {
          _truemedsDao = new TruemedsDao_Impl(this);
        }
        return _truemedsDao;
      }
    }
  }
}
