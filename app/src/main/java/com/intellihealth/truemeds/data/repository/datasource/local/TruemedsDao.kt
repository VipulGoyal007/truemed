package com.intellihealth.truemeds.data.repository.datasource.local

import android.database.Cursor
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.intellihealth.truemeds.data.model.LocalCartDBMrpCalculations
import com.intellihealth.truemeds.data.model.LocalCartDBSellingPriceCalculations
import com.intellihealth.truemeds.data.repository.datasource.local.entity.*


@Dao
interface TruemedsDao {

    //=======================Insert Queries=======================
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertOriginalMedicine(medicine: CartMedicine)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertSubsOrgInfo(medicine: OrgSubsInfo)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertReorderAltSubs(medicine: ReorderAlternateSubs)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertReferReminder(referReminder: ReferReminder)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertPillReminder(pillReminder: PillReminder)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertSaveVideoFAQ(videoFAQ: SaveVideoFAQ)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertContactList(contactEntityList:List<TmContactVersion>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertRecentlySearch(recentSearch: RecentMedicine)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addCartItemSequence(cartItemSequence: CartItemSequence)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertSubOptReasons(subOptReasons: List<SubOptReasons>)

    @Query(
        "INSERT INTO addedSubsOrgInfo SELECT id, medicineId, medicineName, companyName, discount, mrp, addedQty, composition, " +
                " :savingPercentage AS subDiscountPercentage, " +
                " :subsSellingPrice AS subsSellingPrice, isSubFound, isFromApi, " +
                " :originalProductCode AS subsMedProductCode," +
                " :subsMrp AS subsMrp," +
                " :originalSkuName AS subsMedName," +
                " :originalCompanyName AS subCompanyName, isColdStorage ,drugType, originalPackSize, substitutePackSize, " +
                "prescriptionRequired, maxCapped, subsReccommendedQty, originalCountryNm, subs_country_nm, subs_unit, original_unit, product_image_urls, original_company_addr, orgAvailable " +
                "FROM addedMedsTable12 " +
                "WHERE medicineId = :orgProductCode "
    )
    fun insertReplaceMed(
        orgProductCode: String,
        savingPercentage: String,
        subsSellingPrice: Double,
        originalProductCode: String,
        subsMrp: Double,
        originalSkuName: String,
        originalCompanyName: String

    )

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertReplaceMedNormalFlow(orgSubsInfo: OrgSubsInfo)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertCartReplaceStatus(cartReplaceStatus: CartReplaceStatus)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertCrossSellingProduct(addedCrossSelling: AddedCrossSelling)

    @Query(
        "INSERT INTO addedMedsTable12" +
                " SELECT null, medicineId, medicineName, companyName, discount, mrp, addedQty, composition, subDiscountPercentage, subsSellingPrice, \n" +
                "isSubFound, isFromApi, subsMedProductCode,subsMrp, subsMedName, subCompanyName, isColdStorage, drugType, originalPackSize, \n" +
                "substitutePackSize, prescriptionRequired, maxCapped, subsReccommendedQty, originalCountryNm, subs_country_nm, subs_unit, original_unit, \n" +
                "product_image_urls,original_company_addr, orgAvailable, :productDetailsId AS productDetailsId, :prevOrderId AS prevOrderId, :prevOrgProductId AS prevOrgProductId " +
                " FROM addedSubsOrgInfo " +
                " WHERE subsMedProductCode = :orgInfoProductCode "
    )
    fun insertSwitchToOrgMed(
        productDetailsId: Long,
        prevOrderId: Long,
        prevOrgProductId: Long,
        orgInfoProductCode: String
    )

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertSearchCategory(searchCategory: SearchCategory)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertSearchCategory(searchCategoryList: List<SearchCategory>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertDoctorConfirmationSubOptions(doctorConfirmationSubOptions: DoctorConfirmationSubOptions)

    @Query(
        "INSERT INTO addedSubsOrgInfo " +
                "SELECT null, medicineId,medicineName,companyName,discount,mrp,addedQty,composition,subDiscountPercentage,subsSellingPrice,isSubFound,isFromApi,subsMedProductCode,subsMrp,subsMedName,subCompanyName,isColdStorage,drugType,originalPackSize,substitutePackSize,prescriptionRequired,maxCapped,subsReccommendedQty,originalCountryNm,subs_country_nm,subs_unit,original_unit, product_image_urls, original_company_addr, orgAvailable " +
                "FROM addedMedsTable12 " +
                "WHERE medicineId = :orgProductCode "
    )
    fun insertOrgSubFromCart(orgProductCode: String)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertOrderTicket(ticket: OrderTicket)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertProductImage(image: ProductImage)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertCustomerCategory(variant: CustomerCategory)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertCustomerDetails(customerDetails: CustomerDetails)

    /*@Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertOrderFilterDetails(orderFilter: OrderFilter)*/

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertOrderFilterDetails(orderFilter: List<OrderFilter>)


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertTmContactVersionDetails(tmContactVersions: List<TmContactVersion>)


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertCartItemSellingPrice(cartItemSellingPrice: CartItemSellingPrice)
    
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertItemAddedAttributes(item: ItemAddedEventAttributes)
    
    //=======================Delete Queries=======================

    @Query("delete from patientName")
    fun deletePatientNameEntity()

    @Query("delete from cart_item_price")
    fun deleteCartItemSellingPrice()

    @Query("delete from sub_opt_reasons")
    fun deleteSubOptReasons()
    @Query("delete from OrderFilter")
    fun deleteOrderFilter()

    @Query("delete from customer_category")
    fun deleteCustomerCategory()
    @Query("delete from productImage")
    fun deleteProductImage()

    @Query("delete from raise_ticket")
    fun deleteOrderTicket()

    @Query("delete from AddedCrossSelling")
    fun deleteAddedCrossSelling()

    @Query("delete from doctor_confirmation_sub_options")
    fun deleteDoctorConfirmationSubOptions()

    @Query("delete from saveVideoFaq")
    fun deleteSaveVideoFAQ()

    @Query("delete from refferReminder")
    fun deleteReferReminder()

    @Query("delete from savePillReminder")
    fun deletePillReminder()

    @Query("delete from customer_details")
    fun deleteCustomerDetails()

    @Query("delete from recentlySearched")
    fun deleteAllRecentSearch()

    @Query("delete from addedMedsTable12 where medicineId = :medicineId")
    fun removeAddedMedicineFromCart(medicineId: String)

    @Query("delete from cart_item_price where productCode = :productCode")
    fun removeCartItemPrice(productCode: String)

    @Query("delete from addedSubsOrgInfo where subsMedProductCode= :medicineId ")
    fun removeOrgSubsMedicineFromCart(medicineId: String)

    @Query("delete from addedMedsTable12")
    fun clearCartTable()

    @Query("delete from addedSubsOrgInfo")
    fun clearOrgSubsTable()

    @Query("delete from reorder_alternate_subs")
    fun clearReorderAltSubsTable()

    @Query("delete from cartReplaceStatus")
    fun deleteCartReplaceStatus()

    @Query("delete from addedcrossselling")
    fun clearCrossSellingTable()

    @Query("DELETE FROM cartItemSequence")
    fun deleteCartItemSequence()

    @Query("delete from cartReplaceStatus where medicineId = :orgProductCode ")
    fun deleteCartReplaceStatus(orgProductCode: String)

    @Query("delete from reorder_alternate_subs where medicineId= :medicineId ")
    fun deleteReorderMedItem(medicineId: String)

    @Query("delete from search_category")
    fun deleteSearchCategory()

    @Query("delete from doctor_confirmation_sub_options")
    fun deleteDoctorConfirmation()

    @Query("delete from AddedCrossSelling where ProductCode = :productCode")
    fun deleteCrossSellingUsingId(productCode: String)

    @Query("delete from raise_ticket where medicineId = :medicineId")
    fun deleteOrderTicketFromMedId(medicineId: String)

    @Query("delete from customer_category where categoryType = :categoryType")
    fun deleteCustomerCategory(categoryType: String)


    @Query("delete from OrderFilter")
    fun deleteOrderFilterDetails()

    @Query("delete from TmContactVersion")
    fun deleteTmContactVersion()

    //=======================Update Queries=======================
    @Query("UPDATE recentlySearched SET productImage = :image, drugType = :drugType WHERE productCode =:id")
    fun updateImageAndDrugTypeInRecentlySearch(image: String, drugType: String, id: String)

    @Query(
        "UPDATE recentlySearched " +
                "SET addedDateTime = :addedTime " +
                "WHERE medicineName = :medName "
    )
    fun updateTimeInRecentlySearch(addedTime: Long, medName: String)

    @Query(
        "update addedMedsTable12 " +
                "set addedQty = :qty " +
                "where medicineId = :medicineId "
    )
    fun updateAddedMedicine(medicineId: String, qty: Int)

    @Query(
        "update addedSubsOrgInfo " +
                "set addedQty = :qty " +
                "where medicineId = :medicineId "
    )
    fun updateOrgSubInfoMedicine(medicineId: String, qty: Int)

    @Query(
        "update addedMedsTable12 " +
                "set orgAvailable = :orgAvailable " +
                " where medicineId = :medicineId "
    )
    fun updateOrgAvailableInAddedMedicine(orgAvailable: Boolean, medicineId: String)

    @Query(
        "update addedMedsTable12 " +
                "set productDetailsId = :detailId " +
                " where medicineId = :medicineId "
    )
    fun updateProductDetailIdnAddedMedicine(detailId: Long, medicineId: String)

    @Query(
        "update addedMedsTable12 " +
                "set product_image_urls = :imageUrl " +
                " where medicineId = :medicineId "
    )
    fun updateProductImageInAddedMedicine(imageUrl: String, medicineId: String)

    @Query(
        "update reorder_alternate_subs " +
                "set subImageUrl = :imageUrl " +
                " where SubsMedProductCode = :medicineId "
    )
    fun updateSubsImageInReorder(imageUrl: String, medicineId: String)

    @Query(
        "update reorder_alternate_subs " +
                "set altSubsImageUrl = :imageUrl " +
                " where altSubsMedProductCode = :medicineId "
    )
    fun updateAltSubsImageInReorder(imageUrl: String, medicineId: String)

    @Query("update addedMedsTable12 set prevOrderId = :prevOrderId where medicineId = :medicineId ")
    fun updatePrevOrderId(prevOrderId: Long, medicineId: String)
    
    @Query("update addedMedsTable12 set subsMedProductCode = :subsProductCode where medicineId = :medicineId ")
    fun updateSubsMedProductCode(medicineId: String, subsProductCode: String)

    @Query("update addedMedsTable12 set prevOrgProductId = :prevOrgProductId where medicineId = :medicineId ")
    fun updatePrevOrgProductId(prevOrgProductId: Long, medicineId: String)

    @Query("update addedMedsTable12 set productDetailsId = :productDetailsId where medicineId = :medicineId ")
    fun updateProductDetailsId(productDetailsId: Long, medicineId: String)

    @Query("update reorder_alternate_subs set isAltSubAvailable = :altSubsAvailable where medicineId = :medicineId")
    fun updateAltSubsAvailableInReorder(altSubsAvailable: Boolean, medicineId: String)

    @Query("update reorder_alternate_subs set isSubAvailable = :subsAvailable where medicineId = :medicineId")
    fun updateSubsAvailableInReorder(subsAvailable: Boolean, medicineId: String)

    @Query("update reorder_alternate_subs set isOrgDisabled = :orgDisabled where medicineId = :medicineId")
    fun updateOrgDisabledInReorder(orgDisabled: Boolean, medicineId: String)

    @Query("update reorder_alternate_subs set subsPitched = :subsPitched where medicineId = :medicineId")
    fun updateSubsPitchedInReorder(subsPitched: Boolean, medicineId: String)

    @Query("update reorder_alternate_subs set cxAcceptedSubs = :cxAcceptedSubs where medicineId = :medicineId")
    fun updateCxAcceptedSubsInReorder(cxAcceptedSubs: Boolean, medicineId: String)

    @Query("update reorder_alternate_subs set cxKeepOriginal =:cxKeepOriginal where medicineId = :medicineId ")
    fun updateCxKeepOriginalInReorder(cxKeepOriginal: Boolean, medicineId: String)

    @Query("update addedMedsTable12 set original_company_addr = :address where medicineId = :medicineId")
    fun updateOrgCompanyAddressInAddedMad(address: String, medicineId: String)

    @Query(
        "update addedMedsTable12 set mrp = :orgMrp " +
                ", discount = :orgDiscountPercentage " +
                ", orgAvailable = :orgAvailable " +
                " where medicineId = :medicineId "
    )
    fun updateOrgDetailsInAddedMed(
        orgMrp: Double,
        orgDiscountPercentage: Double,
        orgAvailable: Boolean,
        medicineId: String
    )

    @Query(
        "update addedMedsTable12 " +
                "set mrp = :orgMrp " +
                ", discount = :orgDiscountPercentage " +
                ", subDiscountPercentage = :subDiscountPercentage " +
                ", subsSellingPrice = :subsSellingPrice " +
                ", subsMedProductCode = :subsMedProductCode " +
                ", subsMrp = :subsMrp " +
                ", subsMedName = :subsMedName " +
                ", subCompanyName = :subCompanyName " +
                ", substitutePackSize = :substitutePackSize " +
                ", subsReccommendedQty = :subsRecommendedQty " +
                " where medicineId = :medicineId "
    )
    fun updateOrgAndSubDetailsInAddedMed(
        orgMrp: Double,
        orgDiscountPercentage: Double,
        subDiscountPercentage: String,
        subsSellingPrice: Double,
        subsMedProductCode: String,
        subsMrp: Double,
        subsMedName: String,
        subCompanyName: String,
        substitutePackSize: Double,
        subsRecommendedQty: Int,
        medicineId: String
    )

    @Query(
        "update reorder_alternate_subs " +
                "set altSubsDiscountPercentage = :discount " +
                " where medicineId = :medicineId "
    )
    fun updateAltSubsDiscountPercentageInReorder(discount: Double, medicineId: String)

    @Query(
        "update reorder_alternate_subs " +
                "set altSubsSellingPrice = :sellingPrice " +
                " where medicineId = :medicineId "
    )
    fun updateAltSubsSellingPriceInReorder(sellingPrice: Double, medicineId: String)

    @Query(
        "update reorder_alternate_subs " +
                "set altSubsMrp = :subsMrp " +
                " where medicineId = :medicineId "
    )
    fun updateAltSubsMrpInReorder(subsMrp: Double, medicineId: String)

    @Query(
        "update reorder_alternate_subs " +
                "set coldChainDisabled = :coldChainDisabled " +
                " where medicineId = :medicineId "
    )
    fun updateColdChainInReorder(coldChainDisabled: Boolean, medicineId: String)

    @Query("update reorder_alternate_subs set orderAddress = :orderAddress, addressID = :addressId ")
    fun updateOrderAddressInReorder(orderAddress: String, addressId: Int)

    @Query("update reorder_alternate_subs set isReplace = :isReplace where medicineId = :medicineId")
    fun updateIsReplaceInReorder(medicineId: String, isReplace: Boolean)

    @Query("update addedMedsTable12 set mrp = :mrp where medicineId = :medicineId")
    fun updateMrpOfAddedMedicine(medicineId: String, mrp: Double)

    @Query("update addedMedsTable12 set discount = :discount where medicineId = :medicineId")
    fun updateDiscountOfAddedMedicine(medicineId: String, discount: Double)

    @Query("update reorder_alternate_subs set orgAddedQuantity = :orgAddedQuantity where medicineId = :medicineId")
    fun updateOrgAddedQuantityInReorder(medicineId: String, orgAddedQuantity: Int)

    @Query("update reorder_alternate_subs set showOnlyOrg = :showOnlyOrg where medicineId = :medicineId")
    fun updateShowOnlyOrgInReorder(medicineId: String, showOnlyOrg: Boolean)

    @Query("update raise_ticket set description = :description where medicineId = :medicineId")
    fun updateDescriptionInOrderTicket(medicineId: String, description: String)

    @Query("update productImage set addedDateTime = :dateTime where productCode = :medicineId")
    fun updateProductImage(dateTime: Long, medicineId: String)

    @Query("update cart_item_price set sellingPrice = :orgSellingPrice where productCode = :productCode")
    fun updateSellingPriceInCart(orgSellingPrice: Double, productCode: String)

    /*@Query("update addedMedsTable12 set orgSellingPrice = :orgSellingPrice where medicineId = :productCode")
    fun updateSellingPriceInCart(orgSellingPrice: Double, productCode: String): Int

    @Query("update addedSubsOrgInfo set orgSellingPrice = :orgSellingPrice where medicineId = :productCode")
    fun updateSellingPriceInOrgSubs(orgSellingPrice: Double, productCode: String): Int*/

    //=======================Get Queries=======================
    @Query("SELECT COUNT(medicineId) FROM addedMedsTable12")
    fun getCartTableCount(): Long

    @Query("SELECT COUNT(medicineId) FROM addedSubsOrgInfo")
    fun getOrgSubTableCount(): Int

    @Query("SELECT COUNT(medicineId) FROM reorder_alternate_subs")
    fun getReorderTableCount(): Int

    @Query("SELECT addedQty FROM addedMedsTable12 WHERE medicineId = :medicineId")
    fun getMedicineItemCount(medicineId: String): Int

    @Query("SELECT maxCapped FROM addedMedsTable12 WHERE medicineId = :medicineId")
    fun getMaxCappedCount(medicineId: String): Int

    @Query(
        "SELECT cart.addedQty " +
                "FROM addedMedsTable12 cart " +
                "INNER JOIN addedSubsOrgInfo subOrgInfo " +
                "ON cart.medicineId = subOrgInfo.subsMedProductCode WHERE subOrgInfo.medicineId = :medicineId"
    )
    fun subsAddedMedCount(medicineId: String): Int

    @Query("SELECT addedQty FROM addedSubsOrgInfo WHERE medicineId = :medicineId AND subsMedProductCode = :subsMedicineId")
    fun getSubsMedicineItemCount(medicineId: String, subsMedicineId: String): Int

    @Query(
        "SELECT 1 " +
                "FROM addedMedsTable12 " +
                "WHERE medicineId = :subsProductCode " +
                "AND (subsMedProductCode = :subsProductCode " +
                "AND NOT EXISTS (SELECT 1 FROM addedSubsOrgInfo " +
                "WHERE subsMedProductCode = :subsProductCode " +
                "AND medicineId != :subsProductCode ))"
    )
    fun checkAlreadyAddedAsSubs(subsProductCode: String): Int

    @Query("SELECT 1 FROM addedSubsOrgInfo WHERE medicineId != :productCode and subsMedProductCode = :subsProductCode")
    fun getSubsInfoFromProductCode(productCode: String, subsProductCode: String): Int

    @Query("SELECT 1 FROM addedSubsOrgInfo WHERE subsMedProductCode = :subsProductCode ")
    fun getSubsInfoFromSubsCode(subsProductCode: String): Int

    @Query(
        "select * " +
                "from addedSubsOrgInfo " +
                "WHERE subsMedProductCode = :subsMedProductCode"
    )
    fun getSubsOrgInfo(subsMedProductCode: String): OrgSubsInfo
    
    @Query("select subsMedProductCode " +
                "from addedSubsOrgInfo " +
                "WHERE medicineId = :orgProductCode")
    fun getSubsProductCodeFromOrgCode(orgProductCode: String) : String?
    @Query(
        "SELECT 1 " +
                "FROM addedMedsTable12 " +
                "WHERE medicineId = :subsProductCode " +
                "AND (subsMedProductCode = :subsProductCode " +
                "AND NOT EXISTS (SELECT 1 FROM addedSubsOrgInfo " +
                "WHERE subsMedProductCode = :subsProductCode " +
                "AND medicineId != :subsProductCode ))"
    )
    fun subsAsOrgCount(subsProductCode: String): Int

    @Query(
        "SELECT 1 " +
                "FROM addedMedsTable12 " +
                "WHERE medicineId = :productCode " +
                "AND subsMedProductCode = :productCode " +
                "AND EXISTS (SELECT 1 FROM addedSubsOrgInfo " +
                "WHERE subsMedProductCode = :productCode " +
                "AND medicineId != :productCode )"
    )
    fun getAddedSubsAsOrgCount(productCode: String): Int

    @Query(
        "SELECT 1 " +
                "FROM reorder_alternate_subs " +
                "WHERE (SubsMedProductCode = :productId " +
                "OR altSubsMedProductCode = :productId) " +
                "AND (isReplace = '1' OR isReplace = 'true')"
    )
    fun getSubsInReorder(productId: String): Int

    @Query("SELECT * FROM savePillReminder WHERE orderId = :orderId")
    fun getPillReminderUsingOrderId(orderId: Long): List<PillReminder>

    @Query("SELECT * FROM saveVideoFaq WHERE orderId = :orderId ")
    fun getSavedVideOFAQ(orderId: Long): List<SaveVideoFAQ>

    @Query("select 1 from addedMedsTable12 where prescriptionRequired = 'true' OR prescriptionRequired = '1'")
    fun isRxRequired(): Int

    @Query("select * from recentlySearched where productCode IS NOT NULL AND productCode !='' AND productCode!='null' order by addedDateTime desc")
    fun getRecentlySearchMeds(): List<RecentMedicine>

    @Query("select * from recentlySearched where productCode IS NULL OR productCode='' OR productCode='null' OR productCode=null order by addedDateTime desc")
    fun getRecentlySearch(): List<RecentMedicine>

    @Query("SELECT 1 FROM recentlySearched WHERE medicineName = :medName")
    fun getCartCountFromRecentlySearch(medName: String): Int

    @Query(
        "SELECT 1 " +
                "FROM reorder_alternate_subs " +
                "WHERE medicineId = :productId " +
                "AND (SubsMedProductCode = :subsProductCode " +
                "OR altSubsMedProductCode = :subsProductCode) " +
                "AND (isReplace = '1' OR isReplace = 'true')"
    )
    fun getSubsReorderReplaceCount(productId: String, subsProductCode: String): Int

    @Query(
        "SELECT 1 " +
                "FROM reorder_alternate_subs " +
                "WHERE medicineId = :productCode " +
                "AND (isReplace = '1' OR isReplace = 'true')"
    )
    fun isProductReplacedInReorder(productCode: String): Int

    @Query(
        "select medicineId " +
                "from addedMedsTable12 " +
                "where subsMedProductCode = :productCode " +
                "AND medicineId!= :productCode " +
                "AND EXISTS ( " +
                "SELECT 1 FROM addedMedsTable12 " +
                "WHERE medicineId = :productCode ) " +
                "AND EXISTS ( SELECT 1 FROM addedSubsOrgInfo WHERE subsMedProductCode = :productCode)"
    )
    fun getOrgProductCodeToMerge(productCode: String): String

    @Query(
        "SELECT 1 " +
                "FROM addedMedsTable12 cart " +
                "INNER JOIN addedSubsOrgInfo orgInfo " +
                "ON cart.medicineId = orgInfo.subsMedProductCode " +
                "AND cart.medicineId = :subsProductCode " +
                "AND orgInfo.medicineId = :originalProductCode"
    )
    fun isProductInOrgInfoAdded(originalProductCode: String, subsProductCode: String): Int

    @Query(
        "SELECT 1 " +
                "FROM reorder_alternate_subs " +
                "WHERE SubsMedProductCode = :itemCode " +
                "AND (isReplace = '1' OR isReplace = 'true')"
    )
    fun isItemThereInReOrderReplace(itemCode: String): Int

    @Query(
        "select * " +
                "from addedMedsTable12 " +
                "ORDER BY (subsMedProductCode != medicineId AND subsMedProductCode IS NOT NULL AND subsMedProductCode != '' AND subsMedProductCode != 'null') DESC"
    )
    fun getMedsList(): List<CartMedicine>

    @Query(
        "SELECT 1 " +
                "FROM addedMedsTable12 " +
                "WHERE medicineId = :subsProductCode " +
                "AND NOT EXISTS(SELECT 1 FROM addedSubsOrgInfo WHERE medicineId = :orgProductCode )"
    )
    fun getCxOrgAdded(orgProductCode: String, subsProductCode: String): Int

    @Query(
        "select 1 " +
                "FROM addedMedsTable12 cart " +
                "INNER JOIN addedSubsOrgInfo orgInfo " +
                "ON cart.medicineId = orgInfo.medicineId " +
                "where cart.medicineId = :orgProductCode "
    )
    fun isSubsAddedAsWell(orgProductCode: String): Int

    @Query(
        "SELECT productDetailsId " +
                "FROM addedMedsTable12 " +
                "WHERE medicineId = :orgProductCode"
    )
    fun getProductsDetailId(orgProductCode: String): Long

    @Query(
        "SELECT prevOrderId " +
                "FROM addedMedsTable12 " +
                "WHERE medicineId = :orgProductCode"
    )
    fun getPrevOrderId(orgProductCode: String): Long

    @Query(
        "SELECT prevOrgProductId " +
                "FROM addedMedsTable12 " +
                "WHERE medicineId = :orgProductCode"
    )
    fun getPrevOrgProductId(orgProductCode: String): Long


    @Query(
        "SELECT DISTINCT org.*" +
                ", IFNULL(subs.addedQty, 0) AS subsAddedQty, IFNULL(subs.subsSellingPrice, org.subsSellingPrice) AS subsSellingPrice" +
                ", IFNULL(subs.subsReccommendedQty, org.subsReccommendedQty) AS subsReccommendedQty" +
                ", IFNULL(subs.maxCapped, org.maxCapped) AS subsMaxCapped" + ", subs.product_image_urls as subsProductImage" +
                ", IFNULL(subs.drugType, org.drugType) as subsDrugType, IFNULL(subs.originalPackSize, org.substitutePackSize) as subsPackSize" +
                ", (CASE WHEN IFNULL(orgInfo.medicineId, '') = '' THEN 'false' ELSE 'true' END) AS isReplaced, IFNULL(replaceStatus.isAutoReplace, 'false') as isAutoReplace" +
                ", (CASE WHEN EXISTS(SELECT 1 FROM addedSubsOrgInfo WHERE subsMedProductCode = org.medicineId) THEN 1 ELSE 2 END ) AS location2, " +
                "(" +
                " CASE WHEN (org.subsMedProductCode != org.medicineId" +
                " AND org.subsMedProductCode IS NOT NULL" +
                " AND org.subsMedProductCode !=''" +
                " AND org.subsMedProductCode != 'null'" +
                " AND IFNULL(subs.addedQty, 0) = 0)" +
                " THEN 1 ELSE 2" +
                " END ) AS location1" +
                " FROM addedMedsTable12 org " +
                " LEFT JOIN" +
                " (SELECT *, in_orgInfo.medicineId as OrgId FROM addedMedsTable12 in_subs" +
                " INNER JOIN addedSubsOrgInfo in_orgInfo" +
                " ON in_subs.medicineId = in_orgInfo.subsMedProductCode" +
                ") subs" +
                " ON org.subsMedProductCode = subs.medicineId" +
                " AND org.subsMedProductCode != org.medicineId" +
                " AND IFNULL(org.subsMedProductCode, '') != ''" +
                " AND org.subsMedProductCode != 'null'" +
                " AND org.medicineId = subs.OrgId" +
                " LEFT JOIN addedSubsOrgInfo orgInfo" +
                " ON org.medicineId = orgInfo.subsMedProductCode" +
                " AND EXISTS (SELECT 1 FROM addedMedsTable12 WHERE medicineId = orgInfo.medicineId)" +
                " LEFT JOIN cartReplaceStatus replaceStatus" +
                " ON org.medicineId = replaceStatus.medicineId" +
                " WHERE orgInfo.medicineId IS NULL ORDER BY :orderByString "
    )
    fun fetchMedsOnCartPage(orderByString: String): Cursor

    @Query(
        "SELECT DISTINCT org.medicineId \n" +
                "FROM addedMedsTable12 org  LEFT JOIN (SELECT *, in_orgInfo.medicineId as OrgId FROM addedMedsTable12 in_subs INNER JOIN addedSubsOrgInfo in_orgInfo ON in_subs.medicineId = in_orgInfo.subsMedProductCode) subs ON org.subsMedProductCode = subs.medicineId AND org.subsMedProductCode != org.medicineId AND IFNULL(org.subsMedProductCode, '') != '' AND org.subsMedProductCode != 'null' AND org.medicineId = subs.OrgId LEFT JOIN addedSubsOrgInfo orgInfo ON org.medicineId = orgInfo.subsMedProductCode AND EXISTS (SELECT 1 FROM addedMedsTable12 WHERE medicineId = orgInfo.medicineId) LEFT JOIN cartReplaceStatus replaceStatus ON org.medicineId = replaceStatus.medicineId WHERE orgInfo.medicineId IS NULL ORDER BY \n" +
                " ( CASE WHEN (org.subsMedProductCode != org.medicineId AND org.subsMedProductCode IS NOT NULL AND org.subsMedProductCode !='' AND org.subsMedProductCode != 'null' AND IFNULL(subs.addedQty, 0) = 0) THEN 1 ELSE 2 END ) ASC, (CASE WHEN EXISTS(SELECT 1 FROM addedSubsOrgInfo WHERE subsMedProductCode = org.medicineId) THEN 1 ELSE 2 END ) ASC;"
    )
    fun fetchMedsSequenceOnCartPage(): List<String>



    @Query(
        "SELECT * " +
                "FROM addedMedsTable12 cart " +
                "WHERE medicineId!= subsMedProductCode AND subsMedProductCode IS NOT NULL AND subsMedProductCode!='null' AND subsMedProductCode!='' " +
                "AND NOT EXISTS (SELECT 1 FROM addedMedsTable12 WHERE medicineId = cart.subsMedProductCode)"
    )
    fun getAddedMedListWithSubs(): List<CartMedicine>//Cursor

    @Query("SELECT Count(1) FROM cartReplaceStatus WHERE isAutoReplace='true' AND isAutoReplace='1'")
    fun isAutoReplaceDone(): Int
    @Query("SELECT Count(1) FROM cartReplaceStatus WHERE medicineId = :medicineId")
    fun isAutoReplace(medicineId: String): Int

    @Query(
        "select * " +
                "from addedSubsOrgInfo " +
                "WHERE subsMedProductCode = :subsMedProductCode "
    )
    fun getAddedSubsOrgInfo(subsMedProductCode: String): List<OrgSubsInfo>

    @Query("select medicineId from cartItemSequence where medicineId = :medicineId")
    fun getMedIdFromCartSequence(medicineId: String): String

    @Query(
        "SELECT * FROM addedMedsTable12" +
                " WHERE medicineId = :productCode " +
                " ORDER BY (subsMedProductCode!=medicineId AND subsMedProductCode IS NOT NULL AND subsMedProductCode!='' AND subsMedProductCode!='null') DESC"
    )
    fun getAddedMedInfo(productCode: String): Cursor

    @Query("SELECT 1 FROM addedSubsOrgInfo WHERE medicineId = :orgProductCode ")
    fun getAddedSubsMedCountFromMedicineId(orgProductCode: String): Int

    @Query("SELECT cxAcceptedSubs FROM reorder_alternate_subs WHERE medicineId = :medicineId")
    fun getCxAcceptedSubsFromReorderSubsTable(medicineId: String): Boolean

    @Query("select SubsMedProductCode from reorder_alternate_subs where altSubsMedProductCode = :medicineId")
    fun getSubsMedCodeFromReorderSubsTable(medicineId: String): String

    @Query("select medicineId, addedQty from addedMedsTable12")
    fun getExistingCartItems(): Cursor

    @Query("SELECT Count(1) FROM reorder_alternate_subs WHERE SubsMedProductCode = :subsProductCode")
    fun checkSubExistsInReorder(subsProductCode: String): Cursor

    @Query("SELECT altSubsMedProductCode FROM reorder_alternate_subs WHERE SubsMedProductCode = :subsProductCode ")
    fun getAltReOrderSubsCode(subsProductCode: String): Cursor

    @Query("SELECT subsMedName FROM addedMedsTable12 WHERE subsMedProductCode = :subsProductCode ")
    fun getSubsName(subsProductCode: String): Cursor

    @Query("SELECT altSubsMedName FROM reorder_alternate_subs WHERE medicineId = :medicineId")
    fun getAltSubsMedName(medicineId: String): String

    @Query("SELECT altSubsUnit FROM reorder_alternate_subs WHERE medicineId = :medicineId")
    fun getAltSubsUnit(medicineId: String): String

    @Query("SELECT altSubsPackSize FROM reorder_alternate_subs WHERE medicineId = :medicineId")
    fun getAltSubsPack(medicineId: String): Double

    @Query("SELECT isAltSubAvailable FROM reorder_alternate_subs WHERE medicineId = :medicineId")
    fun getIsAltSubsAvailable(medicineId: String): Boolean

    @Query("SELECT showOnlyOrg FROM reorder_alternate_subs WHERE medicineId = :medicineId")
    fun getShowOnlyOrg(medicineId: String): Boolean

    @Query("SELECT altSubsMedProductCode FROM reorder_alternate_subs WHERE medicineId = :medicineId")
    fun getAltSubsMedProductCode(medicineId: String): String

    @Query("SELECT altSubsCompanyName FROM reorder_alternate_subs WHERE medicineId = :medicineId")
    fun getAltSubsCompanyName(medicineId: String): String

    @Query("SELECT altSubsMrp FROM reorder_alternate_subs WHERE medicineId = :medicineId")
    fun getAltSubsMrp(medicineId: String): Double

    @Query("SELECT altSubsSellingPrice FROM reorder_alternate_subs WHERE medicineId = :medicineId")
    fun getAltSubsSellingPrice(medicineId: String): Double

    @Query("SELECT altSubsDiscountPercentage FROM reorder_alternate_subs WHERE medicineId = :medicineId")
    fun getAltSubsDiscountPercentage(medicineId: String): Double

    @Query("SELECT isSubAvailable FROM reorder_alternate_subs WHERE SubsMedProductCode = :medicineId")
    fun getAltSubsAvailable(medicineId: String): Boolean

    @Query("select isReplace from reorder_alternate_subs where medicineId = :medicineId")
    fun getOrgReplaceStatus(medicineId: String): Boolean

    @Query("select cxKeepOriginal from reorder_alternate_subs where medicineId = :medicineId")
    fun getCxKeepOriginal(medicineId: String): Boolean

    @Query(
        "select * from addedMedsTable12 " +
                "WHERE medicineId = (SELECT subsMedProductCode FROM addedSubsOrgInfo WHERE medicineId = :orgProductCode)"
    )
    fun getAddedSubsInfoByOrg(orgProductCode: String): List<CartMedicine>

    @Query("SELECT isSubAvailable FROM reorder_alternate_subs WHERE medicineId = :medicineId")
    fun isSubsAvailableInReOrderAltSubs(medicineId: String): Boolean?

    @Query("SELECT orgAvailable FROM addedMedsTable12 WHERE medicineId = :medicineId")
    fun isOrgAvailableFromAddedMeds(medicineId: String): Boolean

    @Query("select * from AddedCrossSelling")
    fun getAddedCrossSellingProducts(): List<AddedCrossSelling>


    @Query("SELECT Count(prevOrgProductId) FROM addedMedsTable12 WHERE prevOrgProductId > 0 ")
    fun getPrevOrderIdItemCount(): Int

    @Query("select orgAvailable from addedSubsOrgInfo where subsMedProductCode = :medicineId")
    fun getOrgAvailableFromOrgSubs(medicineId: String): Boolean

    @Query("select medicineId from addedSubsOrgInfo where subsMedProductCode = :medicineId")
    fun getReplacedMedId(medicineId: String): String

    @Query("select medicineName from addedSubsOrgInfo where subsMedProductCode = :medicineId")
    fun getReplacedMedName(medicineId: String): String

    @Query("select subDiscountPercentage from addedSubsOrgInfo where subsMedProductCode = :medicineId")
    fun getSubsDiscountPercentage(medicineId: String): String

    @Query(
        "SELECT 1 FROM addedMedsTable12 " +
                "WHERE medicineId = subsMedProductCode " +
                "AND subsMedProductCode IS NOT NULL " +
                "AND subsMedProductCode!='null' " +
                "AND subsMedProductCode!=''"
    )
    fun isSubsItselfAddedToCart(): Int

    @Query(
        "SELECT 1 FROM addedMedsTable12 " +
                "WHERE medicineId != subsMedProductCode " +
                "AND subsMedProductCode IS NOT NULL "
                + "AND subsMedProductCode!='null' "
                + "AND subsMedProductCode!=''"
    )
    fun isOrgHavingSubsAddedToCart(): Int

    @Query(
        "SELECT 1 FROM addedMedsTable12 " +
                "WHERE subsMedProductCode IS NULL "
                + "OR subsMedProductCode ='null' "
                + "OR subsMedProductCode=''"
    )
    fun isOrgHavingNoSubsAddedToCart(): Int

    @Query("SELECT 1 FROM addedSubsOrgInfo")
    fun isSubAddedFromOrgToCart(): Int

    @Query("select * from addedSubsOrgInfo WHERE medicineId = :medicineId ")
    fun getAddedSubsOrgInfoFromOrgId(medicineId: String): Cursor

    @Query("SELECT SubsMedProductCode FROM reorder_alternate_subs WHERE medicineId = :medicineId")
    fun getOrgInfoCodeInReorder(medicineId: String): String

    @Query(
        "SELECT reasonId " +
                "FROM doctor_confirmation_sub_options " +
                "WHERE key_value = :value "
    )
    fun getAllDoctorConfirmationSubOption(value: String): Long

    @Query("select patientID, patientName, orderAddress, addressID, orderID from reorder_alternate_subs;")
    fun getReorderPatientInfo(): Cursor

    @Query(
        "select * from addedMedsTable12 " +
                "WHERE medicineId NOT IN (SELECT medicineId FROM addedSubsOrgInfo)" +
                "ORDER BY (subsMedProductCode!=medicineId AND subsMedProductCode IS NOT NULL AND subsMedProductCode!='' AND subsMedProductCode!='null') DESC"
    )
    fun getAddedMedListNotInOrgInfo(): Cursor

    @Query(
        "SELECT 1 FROM reorder_alternate_subs " +
                "WHERE (SubsMedProductCode = :productCode OR altSubsMedProductCode = :productCode ) " +
                "AND (isReplace = '1' OR isReplace = 'true')"
    )
    fun isProductAddedAsReplacedInReorder(productCode: String): Int

    @Query("select productCode from recentlySearched where productCode = :productCode")
    fun getProductCodeFromRecentlySearch(productCode: String): String

    @Query("select product_image_urls from addedMedsTable12 where medicineId=:medicineId ")
    fun getImageUrlFromAddedMeds(medicineId: String): String

    @Query("select key_value from search_category where key_name = :key ")
    fun getKeyValueFromSearchCategory(key: String): String

    @Query("select key_value from search_category where key_name = :key LIMIT 1 COLLATE NOCASE")
    fun getKeyValueFromSearchCategoryIgnoreCase(key: String): String

    @Query("SELECT medicineId FROM reorder_alternate_subs WHERE medicineId = :medicineId")
    fun getMedicineIdFromReorderMed(medicineId: String): String

    @Query("select medicineId from addedSubsOrgInfo where medicineId = :medicineId")
    fun getMedIdFromCartTable(medicineId: String): String

    @Query("SELECT * FROM addedMedsTable12 WHERE medicineId = :medicineId")
    fun getAddedMedDetails(medicineId: String): CartMedicine

    @Query(
        "SELECT 1 FROM addedMedsTable12 " +
                "WHERE medicineId = :subsProductCode " +
                "AND EXISTS(SELECT 1 FROM addedSubsOrgInfo WHERE medicineId = :orgProductCode AND subsMedProductCode = :subsProductCode )"
    )
    fun isSubsAlsoAddedForOrg(orgProductCode: String, subsProductCode: String): Int

    @Query("select originalPackSize from addedSubsOrgInfo where medicineId = :medicineId")
    fun getOriginalPackSizeFromOrgSubs(medicineId: String): Double

    @Query(
        "SELECT medicineId, subsMedProductCode " +
                "FROM addedMedsTable12 cart " +
                "WHERE (" +
                "medicineId!= subsMedProductCode " +
                "AND subsMedProductCode IS NOT NULL " +
                "AND subsMedProductCode!='null' " +
                "AND subsMedProductCode!='' ) " +
                "OR EXISTS (SELECT 1 FROM addedSubsOrgInfo WHERE subsMedProductCode = cart.medicineId AND (orgAvailable='true' OR orgAvailable='1'))"
    )
    fun isSubsAvailable(): Cursor

    @Query(
        "SELECT medicineId, subsMedProductCode " +
                "FROM addedMedsTable12 cart " +
                "WHERE (medicineId NOT IN (:notInAddedMedicineIds) " +
                "AND medicineId!= subsMedProductCode " +
                "AND subsMedProductCode IS NOT NULL " +
                "AND subsMedProductCode!='null' " +
                "AND subsMedProductCode!='') " +
                "OR EXISTS (" +
                "SELECT 1 FROM addedSubsOrgInfo WHERE subsMedProductCode = cart.medicineId" +
                ");"
    )
    fun isSubsAvailableFromAddedMedId(notInAddedMedicineIds: String): Cursor

    @Query("Select subImageUrl from reorder_alternate_subs where SubsMedProductCode = :medicineId")
    fun getSubImageUrlInReorder(medicineId: String): String

    @Query("Select subImageUrl from reorder_alternate_subs where medicineId = :medicineId")
    fun getSubImageUrlInReorderFromMedicineId(medicineId: String): String

    @Query("Select subsPitched from reorder_alternate_subs where medicineId = :medicineId")
    fun getSubsPitchedInReorder(medicineId: String): Boolean

    @Query("Select orgAddedQuantity from reorder_alternate_subs where medicineId = :medicineId")
    fun getOrgAddedQtyFromReorder(medicineId: String): Int

    @Query("Select altSubsImageUrl from reorder_alternate_subs where medicineId = :medicineId")
    fun getAltSubsImageUrlFromReorder(medicineId: String): String

    @Query("Select altSubsImageUrl from reorder_alternate_subs where SubsMedProductCode = :medicineId")
    fun getAltSubsImageUrlFromSubMed(medicineId: String): String

    @Query("Select altSubsSavingPercentage from reorder_alternate_subs where medicineId = :medicineId")
    fun getAltSubsSavingPercentage(medicineId: String): String

    @Query("SELECT prevOrgProductId FROM addedMedsTable12 WHERE prevOrgProductId = 0 ")
    fun getEmptyPrevOrgProductId(): Long

    @Query("select * from raise_ticket")
    fun getOrderTicketDetails(): Cursor

    @Query("select * from productImage where productCode = :productCode")
    fun getProductImages(productCode: String): Cursor

    @Query("select id from customer_category where categoryType = :category")
    fun getCustomerCategoryId(category: String): Long

    @Query("select category from customer_category where categoryType = :categoryType")
    fun getCustomerCategory(categoryType: String): String

    @Query("select categoryType from customer_category")
    fun getAllCustomerCategory(): List<String>

    /*@Query("select accessToken from customer_details")
    fun getUserAccessToken(): String?*/

    @Query("select count(*) from AddedCrossSelling")
    fun getAddedCrossSellingProductsCount(): Int

    @Query("select * from OrderFilter")
    fun getFilterOrderList(): List<OrderFilter>

    @Query("select * from customer_details where mobileNo= :mobileNo")
    fun getCustomerDetails(mobileNo: String): CustomerDetails

    @Query("select reasonId from sub_opt_reasons where value= :value")
    fun getSubOptReasonId(value: String): Int



   /* @Query("SELECT SUM(sp.sellingPrice * cart.addedQty) " +
            "FROM addedMedsTable12 cart " +
            "INNER JOIN cart_item_price sp " +
            "ON cart.medicineId = sp.productCode AND cart.orgAvailable = 1")*/
    @Query("SELECT sp.sellingPrice, cart.addedQty FROM addedMedsTable12 cart INNER JOIN cart_item_price sp ON cart.medicineId = sp.productCode AND orgAvailable = 1")
    fun getCartTotalSellingPrice(): List<LocalCartDBSellingPriceCalculations>
    
    /*@Query("SELECT SUM(cart.mrp * cart.addedQty) " +
            "FROM addedMedsTable12 cart " +
            "INNER JOIN cart_item_price sp " +
            "ON cart.medicineId = sp.productCode AND cart.orgAvailable = 1")*/
    @Query("SELECT cart.mrp, cart.addedQty FROM addedMedsTable12 cart INNER JOIN cart_item_price sp ON cart.medicineId = sp.productCode AND orgAvailable = 1")
    fun getCartTotalMrpPrice(): List<LocalCartDBMrpCalculations>
    
    @Query("SELECT subsMedProductCode" +
            " FROM addedMedsTable12" +
            " WHERE subsMedProductCode != NULL AND subsMedProductCode!='' AND subsMedProductCode!='null' AND subsMedProductCode!='NULL'" +
            " GROUP BY subsMedProductCode HAVING COUNT(subsMedProductCode) > 1")
    fun getDuplicateSubsFoundMedCode() : String
    
    @Query("SELECT count(*) FROM addedMedsTable12 WHERE subsMedProductCode = :subsMedProductCode")
    fun getCountOfDuplicateSubsFound(subsMedProductCode: String) : Int

    @Query("SELECT * FROM addedMedsTable12 WHERE subsMedProductCode = :subsProductCode AND medicineId != :subsProductCode")
    fun getMedicineListWIthSameSubs(subsProductCode: String) : List<CartMedicine>
    
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertPatientNameList(patientNameEntity: List<PatientNameEntity>)

    @Query("SELECT MAX(SaveDate) FROM patientName")
    fun getLastDateForNameValidation(): Long

    @Query("SELECT COUNT(*) FROM patientName WHERE PatientName = :inputString COLLATE NOCASE")
    fun checkNameExist(inputString: String?): Int
    
    @Query("SELECT addedQty FROM addedSubsOrgInfo WHERE medicineId = :medicineId")
    fun getSwitchBackCount(medicineId: String): Int
    
    @Query("SELECT medicineId FROM addedMedsTable12")
    fun getAddedMedProductCode(): List<String>

    @Query("SELECT DISTINCT medicineName FROM addedMedsTable12")
    fun getAddedMedNames(): List<String>
    
    @Query("select * from addedSubsOrgInfo WHERE medicineId = :orgProductCode")
    fun getAddedOrgInfoByOrgCode(orgProductCode: String): OrgSubsInfo
    
    @Query("select * from addedSubsOrgInfo WHERE subsMedProductCode = :subsMedCode")
    fun getAddedOrgInfoBySubsCode(subsMedCode: String): OrgSubsInfo
    
    @Query("select * from addedSubsOrgInfo")
    fun getAddedOrgInfoByList(): List<OrgSubsInfo>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertReorderCrossSellingProduct(addedCrossSelling: AddedReorderCrossSelling)
    
    @Query("SELECT Count(*) FROM TmContactVersion")
    fun getSavedContactsCount() : Int
    
    @Query("select * from item_added_attributes where productCode = :medicineId")
    fun getItemAddedAttributes(medicineId: String) : ItemAddedEventAttributes
    
    @Query("delete from item_added_attributes where productCode = :medicineId")
    fun deleteItemAddedAttribute(medicineId: String)
    
    @Query("select section_heading from item_added_attributes")
    fun getTrayDetailsOfItemAddedAttributes() : List<String>
    
    @Query("delete from item_added_attributes")
    fun clearItemAddedAttributes()
    
    @Query("select * from addedSubsOrgInfo where subsMedProductCode = :subsProductCode AND addedQty != 0")
    fun fetchOrgMedsFromDBWhooseSubsWereSame(subsProductCode: String) : List<OrgSubsInfo>

    @Query("SELECT MAX(id) FROM customer_category")
    fun getLastCustomerCategoryId(): Long
}

