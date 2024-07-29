package com.intellihealth.truemeds.presentation.utils

import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteException
import com.intellihealth.truemeds.data.repository.datasource.local.entity.CartMedicine
import com.intellihealth.truemeds.data.repository.datasource.local.entity.OrgSubsInfo
import com.intellihealth.truemeds.data.repository.datasource.local.entity.RecentMedicine
import com.intellihealth.truemeds.data.repository.datasource.local.entity.ReorderAlternateSubs

class SQLiteDBHelper {
    
    companion object {
        fun getOrgSubsRecords(db: SQLiteDatabase): List<OrgSubsInfo>? {
            return try {
                val list: MutableList<OrgSubsInfo> = ArrayList<OrgSubsInfo>()
                db.execSQL("CREATE TABLE IF NOT EXISTS addedSubsOrgInfo(medicineId VARCHAR, medicineName VARCHAR, companyName VARCHAR,discount VARCHAR, mrp VARCHAR, addedQty VARCHAR, composition VARCHAR,subDiscountPercentage VARCHAR,subsSellingPrice VARCHAR,isSubFound VARCHAR,isFromApi VARCHAR,subsMedProductCode VARCHAR,subsMrp VARCHAR,subsMedName VARCHAR,subCompanyName VARCHAR,isColdStorage VARCHAR,drugType VARCHAR, originalPackSize VARCHAR, substitutePackSize VARCHAR,prescriptionRequired VARCHAR,maxCapped VARCHAR,subsReccommendedQty VARCHAR,originalCountryNm VARCHAR,subs_country_nm VARCHAR,subs_unit VARCHAR,original_unit VARCHAR,product_image_urls VARCHAR,original_company_addr VARCHAR, orgAvailable VARCHAR);")
                val c = db.rawQuery("SELECT * FROM addedSubsOrgInfo;", null)
                if (c != null && c.count > 0) {
                    while (c.moveToNext()) {
                        val id = (list.size + 1).toLong()
                        val subInfo = OrgSubsInfo(
                            id,
                            c.getString(0),
                            c.getString(1),
                            c.getString(2),
                            c.getDouble(3),
                            c.getDouble(4),
                            c.getInt(5),
                            c.getString(6),
                            c.getString(7),
                            c.getDouble(8), c.getString(9) == "true", c.getString(10) == "true",
                            c.getString(11),
                            c.getDouble(12),
                            c.getString(13),
                            c.getString(14), c.getString(15) == "true",
                            c.getString(16),
                            c.getDouble(17),
                            c.getDouble(18), c.getString(19) == "true",
                            c.getInt(20),
                            c.getInt(21),
                            c.getString(22),
                            c.getString(23),
                            c.getString(24),
                            c.getString(25),
                            c.getString(26),
                            c.getString(27), c.getString(28) == "true"
                        )
                        list.add(subInfo)
                    }
                }
                c?.close()
                list
            } catch (e: Exception) {
                ArrayList<OrgSubsInfo>()
            }
        }
    
    
        fun getAddedMedsRecords(db: SQLiteDatabase): List<CartMedicine>? {
            return try {
                val list: MutableList<CartMedicine> = java.util.ArrayList<CartMedicine>()
                db.execSQL("CREATE TABLE IF NOT EXISTS addedMedsTable12(medicineId VARCHAR, medicineName VARCHAR, companyName VARCHAR,discount VARCHAR, mrp VARCHAR, addedQty VARCHAR, composition VARCHAR,subDiscountPercentage VARCHAR,subsSellingPrice VARCHAR,isSubFound VARCHAR,isFromApi VARCHAR,subsMedProductCode VARCHAR,subsMrp VARCHAR,subsMedName VARCHAR,subCompanyName VARCHAR,isColdStorage VARCHAR,drugType VARCHAR, originalPackSize VARCHAR, substitutePackSize VARCHAR,prescriptionRequired VARCHAR,maxCapped VARCHAR,subsReccommendedQty VARCHAR,originalCountryNm VARCHAR,subs_country_nm VARCHAR,subs_unit VARCHAR,original_unit VARCHAR,product_image_urls VARCHAR,original_company_addr VARCHAR, orgAvailable VARCHAR);")
                val c = db.rawQuery("SELECT * FROM addedMedsTable12;", null)
                if (c != null && c.count > 0) {
                    while (c.moveToNext()) {
                        //                    long id = list.size() + 1;
                        var productDetailsId = 0L
                        var prevOrderId = 0L
                        var prevOrgProductId = 0L
                        try {
                            productDetailsId = c.getLong(29)
                            prevOrderId = c.getLong(30)
                            prevOrgProductId = c.getLong(31)
                        } catch (ignore: java.lang.Exception) {
                        }
                        val orgInfo = CartMedicine(
                            null,
                            c.getString(0),
                            c.getString(1),
                            c.getString(2),
                            c.getDouble(3),
                            c.getDouble(4),
                            c.getInt(5),
                            c.getString(6),
                            c.getString(7),
                            c.getDouble(8), c.getString(9) == "true", c.getString(10) == "true",
                            c.getString(11),
                            c.getDouble(12),
                            c.getString(13),
                            c.getString(14), c.getString(15) == "true",
                            c.getString(16),
                            c.getDouble(17),
                            c.getDouble(18), c.getString(19) == "true",
                            c.getInt(20),
                            c.getInt(21),
                            c.getString(22),
                            c.getString(23),
                            c.getString(24),
                            c.getString(25),
                            c.getString(26),
                            c.getString(27), c.getString(28) == "true",
                            productDetailsId,
                            prevOrderId,
                            prevOrgProductId
                        )
                        list.add(orgInfo)
                    }
                }
                list
            } catch (e: java.lang.Exception) {
                java.util.ArrayList<CartMedicine>()
            }
        }
    
    
        fun getReorderAlternateRecords(db: SQLiteDatabase): List<ReorderAlternateSubs>? {
            try {
                val list: MutableList<ReorderAlternateSubs> =
                    java.util.ArrayList<ReorderAlternateSubs>()
                db.execSQL(
                    "CREATE TABLE IF NOT EXISTS reorder_alternate_subs(medicineId VARCHAR, patientID VARCHAR, patientName VARCHAR, orderAddress VARCHAR, addressID VARCHAR, " +
                            "orderID VARCHAR, SubsMedProductCode VARCHAR, isSubAvailable VARCHAR, subImageUrl VARCHAR, orgAddedQuantity VARCHAR, " +
                            "altSubsMedProductCode VARCHAR, altSubsDiscountPercentage VARCHAR,altSubsSellingPrice VARCHAR," +
                            "altSubsMrp VARCHAR,altSubsMedName VARCHAR,altSubsCompanyName VARCHAR,isAltSubsColdStorage VARCHAR,altSubsDrugType VARCHAR, " +
                            "altSubsRecommendedQty VARCHAR,altSubsCountryName VARCHAR,altSubsUnit VARCHAR, altSubsImageUrl VARCHAR,altSubsCompanyAddress VARCHAR, " +
                            "isReplace VARCHAR, subsPitched VARCHAR, altSubsPackSize VARCHAR, altSubsSavingPercentage VARCHAR, coldChainDisabled VARCHAR, isAltSubAvailable VARCHAR," +
                            "isOrgDisabled VARCHAR);"
                )
                val c = db.rawQuery("SELECT * FROM reorder_alternate_subs;", null)
                if (c != null && c.count > 0) {
                    while (c.moveToNext()) {
                        val id = (list.size + 1).toLong()
                        val alternateSubs = ReorderAlternateSubs(
                            id,
                            c.getString(0),
                            c.getInt(1),
                            c.getString(2),
                            c.getString(3),
                            c.getInt(4),
                            c.getLong(5),
                            c.getString(6),
                            (c.getString(7) == "true"),
                            c.getString(8),
                            c.getInt(9),
                            c.getString(10),
                            c.getDouble(11),
                            c.getDouble(12),
                            c.getDouble(13),
                            c.getString(14),
                            c.getString(15),
                            (c.getString(16) == "true"),
                            c.getString(17),
                            c.getInt(18),
                            c.getString(19),
                            c.getString(20),
                            c.getString(21),
                            c.getString(22),
                            (c.getString(23) == "true"),
                            (c.getString(24) == "true"),
                            c.getDouble(25),
                            c.getString(26),
                            (c.getString(28) == "true"),
                            (c.getString(28) == "true"),
                            (c.getString(28) == "true"),
                            (c.getString(28) == "true"),
                            (c.getString(28) == "true"),
                            (c.getString(29) == "true")
                        )
                        list.add(alternateSubs)
                    }
                }
                return list
            } catch (e: java.lang.Exception) {
                return java.util.ArrayList<ReorderAlternateSubs>()
            }
        }
    
    
        fun getRecentlySearchedMedicine(sqLiteDatabase: SQLiteDatabase?): List<RecentMedicine>? {
            val list: MutableList<RecentMedicine> = java.util.ArrayList<RecentMedicine>()
            try {
                if (sqLiteDatabase != null) {
                    sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS recentlySearched(medicineName VARCHAR, productCode VARCHAR, customerId VARCHAR,addedDateTime Long);")
                    try {
                        if (!SQLiteDBHelper.isColumnExist(
                                sqLiteDatabase,
                                "recentlySearched",
                                "elastic_search_type"
                            )
                        ) sqLiteDatabase.execSQL("ALTER TABLE recentlySearched ADD COLUMN elastic_search_type VARCHAR")
                    } catch (ignore: java.lang.Exception) {
                    }
                    //                int counter = 1;
                    val c1 = sqLiteDatabase.rawQuery(
                        "select * from recentlySearched order by addedDateTime desc;",
                        null
                    ) /*customerId = '" + accessToken + "'*/
                    while (c1.moveToNext()) {
                        var iconType: Int
                        var productName = c1.getString(1)
                        if (c1.getString(1) == null || c1.getString(1) == "" || c1.getString(1) == "null") {
                            iconType = 0
                            productName = ""
                        } else {
                            iconType = 1
                        }
                        val result = RecentMedicine(
                            null,
                            c1.getString(0),
                            productName,
                            iconType,
                            c1.getString(2),
                            c1.getLong(3),
                            c1.getString(4),
                            true,
                            c1.getString(5),
                            c1.getString(6)
                        )
                        list.add(result)
                    }
                    c1.close()
                }
            } catch (ignore: java.lang.Exception) {
            }
            return list
        }
    
    
        private fun isColumnExist(db: SQLiteDatabase, tableName: String, columnName: String): Boolean {
            var isExist = false
            try {
                val res = db.rawQuery("PRAGMA table_info($tableName)", null)
                res.moveToFirst()
                do {
                    val currentColumn = res.getString(1)
                    if (currentColumn == columnName) {
                        isExist = true
                    }
                } while (res.moveToNext())
            } catch (ignore: java.lang.Exception) {
            }
            return isExist
        }
    
        fun clearAddedMeds(db: SQLiteDatabase) {
            try {
                db.execSQL("CREATE TABLE IF NOT EXISTS addedMedsTable12(medicineId VARCHAR, medicineName VARCHAR, companyName VARCHAR,discount VARCHAR, mrp VARCHAR, addedQty VARCHAR, composition VARCHAR,subDiscountPercentage VARCHAR,subsSellingPrice VARCHAR,isSubFound VARCHAR,isFromApi VARCHAR,subsMedProductCode VARCHAR,subsMrp VARCHAR,subsMedName VARCHAR,subCompanyName VARCHAR,isColdStorage VARCHAR,drugType VARCHAR, originalPackSize VARCHAR, substitutePackSize VARCHAR,prescriptionRequired VARCHAR,maxCapped VARCHAR,subsReccommendedQty VARCHAR,originalCountryNm VARCHAR, subs_country_nm VARCHAR,subs_unit VARCHAR,original_unit VARCHAR,product_image_urls VARCHAR,original_company_addr VARCHAR, orgAvailable VARCHAR);")
                db.execSQL("drop table addedMedsTable12;")
                clearReorderAlternateSubs(db)
                clearCrossSelling(db)
                clearAddedSubOrg(db)
                clearCartReplaceStatus(db)
            } catch (e: SQLiteException) {
                //Constants.printText("inside clearAddedMeds  exception occured: " + e);
            }
        }
    
    
        fun clearAddedSubOrg(db: SQLiteDatabase) {
            try {
                db.execSQL("drop table addedSubsOrgInfo;")
            } catch (ignore: SQLiteException) {
            }
        }
    
        fun clearCartReplaceStatus(db: SQLiteDatabase) {
            try {
                db.execSQL("drop table cartReplaceStatus;")
            } catch (ignore: SQLiteException) {
            }
        }
    
    
        fun clearReorderAlternateSubs(db: SQLiteDatabase) {
            try {
                db.execSQL("drop table reorder_alternate_subs;")
            } catch (ex: java.lang.Exception) {
                ex.message
            }
        }
    
        fun clearCrossSelling(db: SQLiteDatabase) {
            try {
                db.execSQL("CREATE TABLE IF NOT EXISTS AddedCrossSelling(ProductCode VARCHAR)")
                db.execSQL("drop table AddedCrossSelling")
            } catch (e: SQLiteException) {
            }
        }
    
        fun clearSearchCategory(db: SQLiteDatabase) {
            try {
                db.execSQL("drop table search_category;")
            } catch (ex: java.lang.Exception) {
                ex.message
            }
        }
    
        fun clearRecentlySearched(db: SQLiteDatabase) {
            try {
                db.execSQL("drop table recentlySearched;")
            } catch (ex: java.lang.Exception) {
                ex.message
            }
        }
    
        fun clearProductImage(db: SQLiteDatabase) {
            try {
                db.execSQL("drop table productImage;")
            } catch (ex: java.lang.Exception) {
                ex.message
            }
        }
    
    
        fun clearDocConfirmationSubsOptions(db: SQLiteDatabase) {
            try {
                db.execSQL("drop table doctor_confirmation_sub_options;")
            } catch (ex: java.lang.Exception) {
                ex.message
            }
        }
    
    }
}