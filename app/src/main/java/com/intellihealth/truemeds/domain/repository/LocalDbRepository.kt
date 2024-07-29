package com.intellihealth.truemeds.domain.repository

import com.intellihealth.truemeds.data.repository.datasource.local.entity.AddedCrossSelling
import com.intellihealth.truemeds.data.repository.datasource.local.entity.CartItemSellingPrice
import com.intellihealth.truemeds.data.repository.datasource.local.entity.CartMedicine
import com.intellihealth.truemeds.data.repository.datasource.local.entity.CartReplaceStatus
import com.intellihealth.truemeds.data.repository.datasource.local.entity.CustomerCategory
import com.intellihealth.truemeds.data.repository.datasource.local.entity.CustomerDetails
import com.intellihealth.truemeds.data.repository.datasource.local.entity.ItemAddedEventAttributes
import com.intellihealth.truemeds.data.repository.datasource.local.entity.OrderFilter
import com.intellihealth.truemeds.data.repository.datasource.local.entity.OrgSubsInfo
import com.intellihealth.truemeds.data.repository.datasource.local.entity.PatientNameEntity
import com.intellihealth.truemeds.data.repository.datasource.local.entity.PillReminder
import com.intellihealth.truemeds.data.repository.datasource.local.entity.RecentMedicine
import com.intellihealth.truemeds.data.repository.datasource.local.entity.SaveVideoFAQ
import com.intellihealth.truemeds.data.repository.datasource.local.entity.SearchCategory
import com.intellihealth.truemeds.data.repository.datasource.local.entity.SubOptReasons
import com.intellihealth.truemeds.data.repository.datasource.local.entity.TmContactVersion

interface LocalDbRepository {
    suspend fun addItemToCart(medicine: CartMedicine)

    suspend fun getCartItemCount(): Int

    suspend fun updateAddedMedicine(originalPrdCode: String, addedQty: Int)

    suspend fun removeMedicineItem(originalProductCode: String)

    suspend fun removeOrgSubsInfo(originalPrdCode: String)

    suspend fun addSubOrgInfo(orgSubsInfo: OrgSubsInfo)

    suspend fun addVideoFaq()

    suspend fun addRecentlySearchedMedicine(
        recentMedicine: RecentMedicine
    )

    suspend fun addProductImage(productCode: String, productImage: String)

    suspend fun addCustomerDetails(customerDetails: CustomerDetails)

    /*suspend fun insertOrderFilterDetails(orderFilterList: OrderFilter)*/
    suspend fun insertOrderFilterDetails(orderFilterList: List<OrderFilter>)
    suspend fun deleteOrderFilterDetails()
    suspend fun insertSearchTypeMaster(searchCategoryList: List<SearchCategory>)
    suspend fun deleteSearchTypeMaster()
    suspend fun insertTmContactDetails(tmContact: List<TmContactVersion>)
    suspend fun deleteTmContactDetails()

    //    suspend fun getUserAccessToken(): String?
    suspend fun getRecentSearch(): List<RecentMedicine>?
    suspend fun getPreviouslySearch(): List<RecentMedicine>?

    suspend fun getAddedMedicines(): List<CartMedicine>

    suspend fun insertCrossSellingProduct(addedCrossSelling: AddedCrossSelling)

    suspend fun getCrossSellingProduct(): List<AddedCrossSelling>

    suspend fun getAddedCrossSellingProductCount(): Int
    suspend fun getPrevOrderIdItemCount(): Int
    suspend fun getSavedContactsCount(): Int

    suspend fun getOrderFilterList(): List<OrderFilter>

    suspend fun getCustomerDetails(mobileNo: String): CustomerDetails

    suspend fun clearAddedCrossSellingTable()

    suspend fun removeAddedCrossSellingUsingId(productCode: String)

    suspend fun getAddedMedicineCount(productCode: String): Int

    suspend fun checkAlreadyAddedAsSubs(
        orgProductCode: String,
        subsProductCode: String,
        fromOrderSummary: Boolean
    ): Boolean


    suspend fun checkAlreadyAddedSubsAsOrg(orgProductCode: String): Boolean

    suspend fun productReplacedInReorder(orgProductCode: String): Boolean

    suspend fun productAsReplaceInReorder(orgProductCode: String): Boolean

    suspend fun deleteRecentlySearchForCustomerId(accessToken: String)

    suspend fun deleteAllRecentlySearchMeds()

    suspend fun updateImageAndDrugTypeInRecentSearchMed(
        image: String,
        drugType: String,
        productCode: String
    )

    suspend fun updateTimeInRecentSearchMed(time: Long, productCode: String)

    suspend fun updateSellingPrice(sellingPrice: Double, productCode: String)

    suspend fun getCartCountFromRecentlySearch(medicineName: String): Int

    suspend fun insertCartSellingPrice(cartItemSellingPrice: CartItemSellingPrice)
    suspend fun insertSubOptReasons(subOptReasons: List<SubOptReasons>)
    suspend fun getSubOptReasonId(value: String): Int

    suspend fun deleteOfflineDbData()
    suspend fun deleteCustomerDetails()
    suspend fun getInSectionValueOfSearch(keyName: String) : String
    suspend fun getCxOrgAdded(orgProductCode: String, subsProductCode: String) : Int

    suspend fun isSubsAddedAsWell(orgProductCode: String) : Int

    suspend fun updateProductDetailsId(productCode: String, productDetailsId: Long)
    suspend fun updatePrevOrderId(productCode: String, prevOrderId: Long)
    suspend fun updatePrevProductDetailsId(productCode: String, prevProductDetailsId: Long)
    suspend fun updateSubsMedProductCode(productCode: String, subsProductCode: String)

    suspend fun getSubsMedicineList() : List<CartMedicine>

    suspend fun getAddedMedDetails(productCode: String) : CartMedicine

    suspend fun getAddedSubsOrgInfo(subsProductCode: String) : List<OrgSubsInfo>

    suspend fun getProductDetailsId(productCode: String) : Long
    suspend fun getPrevOrderId(productCode: String) : Long
    suspend fun getPrevProductId(productCode: String) : Long

    suspend fun clearCartTable()
    
    suspend fun updateOrgAvailableStatus(productCode: String, available: Boolean)

    suspend fun getPillReminderUsingOrderId(orderId:Long):List<PillReminder>

    suspend fun insertPillReminder(pillReminder: PillReminder)
    suspend fun insertOrgSubFromCart(orgProductCode: String)

    suspend fun getSavedVideOFAQ(orderId: Long):List<SaveVideoFAQ>

    suspend fun insertSaveVideoFAQ(saveVideoFAQ: SaveVideoFAQ)
    suspend fun insertContactList(contactEntityList:  List<TmContactVersion>)
    suspend fun getCartTotalSellingPrice(): Double
    suspend fun getCartTotalMrpPrice(): Double

    suspend fun getReplaceMedAddedInCart(orgProductCode: String) : Boolean
    suspend fun getSubsProductCodeAfterDelete(orgProductCode: String) : String?
    
    suspend fun getAddedSubsInfoByOrg(orgProductCode: String) : List<CartMedicine>
    suspend fun getOrgProductCodeToMerge(orgProductCode: String) : String

    suspend fun insertPatientNameEntity(patientNameEntity: List<PatientNameEntity>)

    suspend fun getLastDateForNameValidation():Long

    suspend fun checkNameExist(name:String):Int
    suspend fun isAutoReplace(medicineId: String):Int
    suspend fun insertCartReplaceStatus(cartReplaceStatus: CartReplaceStatus)
    suspend fun deleteCartReplaceStatus(medicineId: String)
    suspend fun deleteCartReplaceStatus()
    suspend fun getAddedSubsMedCountFromMedicineId(productCode: String):Int
    suspend fun getSwitchBackCount(productCode: String):Int

    suspend fun insertCustomerCategory(item: CustomerCategory)
    suspend fun getCustomerCategory(categoryType: String): String
    suspend fun getCustomerCategoryId(categoryType: String): Long
    suspend fun getAllCustomerCategory(): List<String>
    suspend fun deleteCustomerCategory(categoryType: String)
    suspend fun getExistingCartItems() : HashMap<String, Int>
    
    suspend fun getOrgProductCodeFromSubs(subsProductCode: String) : String
    
    suspend fun getAddedMedProductCode() : List<String>
    suspend fun getAddedMedNames() : List<String>
    suspend fun getTrayDetailsOfItemAddedAttributes() : List<String>
    suspend fun getAddedOrgInfoByOrgCode(productCode: String) : OrgSubsInfo
    suspend fun getAddedOrgInfoBySubCode(subsProductCode: String) : OrgSubsInfo
    
    suspend fun getDuplicateSubsFoundMedCode() : String
    suspend fun getCountOfDuplicateSubsFound(subsProductCode: String) : Int
    suspend fun getMedicineListWIthSameSubs(subsProductCode: String) : List<CartMedicine>
    /*suspend fun fetchCartMedicines(): List<String>*/
    suspend fun insertItemAddedAttributes(item: ItemAddedEventAttributes)
    
    suspend fun deleteItemAddedAttributesUsingProductCode(productId: String)
    
    suspend fun clearItemAddedAttributes()
    
    suspend fun getItemAddedAttributes(productCode: String) : ItemAddedEventAttributes
    fun getKeyValueFromSearchCategoryIgnoreCase(key: String) : String
    
    suspend fun isSubsItselfAddedToCart() : Int
    suspend fun isOrgHavingSubsAddedToCart() : Int
    suspend fun isOrgHavingNoSubsAddedToCart() : Int
    suspend fun isSubAddedFromOrgToCart() : Int
    
    suspend fun isAutoReplaceDone() : Int
    suspend fun deleteCartItemSequence()
    suspend fun fetchMedsSequenceOnCartPage() : List<String>
    suspend fun fetchOrgMedsFromDBWhooseSubsWereSame(subsMedProductCode: String) : List<OrgSubsInfo>

    suspend fun getLastCustomerCategoryId(): Long
}
