package com.intellihealth.truemeds.data.repository.datasource.local

import android.util.Log
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
import com.intellihealth.truemeds.domain.repository.LocalDbRepository
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import javax.inject.Inject

class LocalDbRepositoryImpl @Inject constructor(private val appDao: TruemedsDao) :
    LocalDbRepository {
    override suspend fun addItemToCart(medicine: CartMedicine) {
        appDao.insertOriginalMedicine(medicine)
    }

    override suspend fun getCartItemCount(): Int {
        return appDao.getCartTableCount().toInt()
    }

    override suspend fun updateAddedMedicine(originalPrdCode: String, addedQty: Int) {
        appDao.updateAddedMedicine(originalPrdCode, addedQty)
    }

    override suspend fun removeMedicineItem(originalProductCode: String) {
        Log.e("removeMediciImpl:::", "22:::" + originalProductCode)
        appDao.removeAddedMedicineFromCart(originalProductCode)
        appDao.removeCartItemPrice(originalProductCode)
    }

    override suspend fun removeOrgSubsInfo(originalPrdCode: String) {
        appDao.removeOrgSubsMedicineFromCart(originalPrdCode)
    }

    override suspend fun addSubOrgInfo(orgSubsInfo: OrgSubsInfo) {
        appDao.insertSubsOrgInfo(orgSubsInfo)
    }

    override suspend fun addVideoFaq() {

    }

    override suspend fun addRecentlySearchedMedicine(recentMedicine: RecentMedicine) {
        /*RecentMedicine(null, trendSearchName, trendingSearchId, 0,
            SharedPrefManager.getInstance().getLoggedInUserAccessToken(), System.currentTimeMillis(), elasticSearchType,
            true, "", "");*/
        appDao.insertRecentlySearch(recentMedicine)
    }

    override suspend fun addProductImage(productCode: String, productImage: String) {

    }

    override suspend fun addCustomerDetails(customerDetails: CustomerDetails) {
        appDao.insertCustomerDetails(customerDetails)
    }

    /*override suspend fun insertOrderFilterDetails(orderFilter: OrderFilter) {
        appDao.insertOrderFilterDetails(orderFilter)
    }*/
    override suspend fun insertOrderFilterDetails(orderFilterList: List<OrderFilter>) {
        appDao.insertOrderFilterDetails(orderFilterList)
    }

    override suspend fun deleteOrderFilterDetails() {
        appDao.deleteOrderFilterDetails()
    }

    override suspend fun insertSearchTypeMaster(searchCategoryList: List<SearchCategory>) {
        appDao.insertSearchCategory(searchCategoryList)
    }

    override suspend fun deleteSearchTypeMaster() {
        appDao.deleteSearchCategory()
    }

    override suspend fun insertTmContactDetails(tmContactVersions: List<TmContactVersion>) {
        appDao.insertTmContactVersionDetails(tmContactVersions)
    }

    override suspend fun deleteTmContactDetails() {
        appDao.deleteTmContactVersion()
    }


    /* override suspend fun getUserAccessToken(): String? {
         return appDao.getUserAccessToken()
     }*/

    override suspend fun getRecentSearch(): List<RecentMedicine>? {
        return appDao.getRecentlySearch()
    }

    override suspend fun getPreviouslySearch(): List<RecentMedicine>? {
        return appDao.getRecentlySearchMeds()
    }

    override suspend fun getAddedMedicines(): List<CartMedicine> {
        return appDao.getMedsList()
    }

    override suspend fun insertCrossSellingProduct(addedCrossSelling: AddedCrossSelling) {
        appDao.insertCrossSellingProduct(addedCrossSelling)
    }


    override suspend fun getCrossSellingProduct(): List<AddedCrossSelling> {
        return appDao.getAddedCrossSellingProducts()
    }

    override suspend fun getAddedCrossSellingProductCount(): Int {
        return appDao.getAddedCrossSellingProductsCount()
    }

    override suspend fun getPrevOrderIdItemCount(): Int {
        return appDao.getPrevOrderIdItemCount()
    }
    override suspend fun getSavedContactsCount(): Int {
        return appDao.getSavedContactsCount()
    }

    override suspend fun getOrderFilterList(): List<OrderFilter> {
        return appDao.getFilterOrderList()
    }

    override suspend fun getCustomerDetails(mobileNo: String): CustomerDetails {
        return appDao.getCustomerDetails(mobileNo)
    }

    override suspend fun clearAddedCrossSellingTable() {
        appDao.clearCrossSellingTable()
    }

    override suspend fun removeAddedCrossSellingUsingId(productCode: String) {
        appDao.deleteCrossSellingUsingId(productCode)
    }

    override suspend fun getAddedMedicineCount(productCode: String): Int {
        return appDao.getMedicineItemCount(productCode)
    }


    override suspend fun checkAlreadyAddedAsSubs(
        orgProductCode: String,
        subsProductCode: String,
        fromOrderSummary: Boolean
    ): Boolean {
        var isAdded = false
        var subsWithOrgInfoCount =
            appDao.getSubsInfoFromProductCode(orgProductCode, subsProductCode)
        if (fromOrderSummary) {
            subsWithOrgInfoCount = appDao.getSubsInfoFromSubsCode(subsProductCode)
        }

        var subsAsOrgCount = appDao.subsAsOrgCount(subsProductCode)
        var subsInReOrderReplaceCount =
            appDao.getSubsReorderReplaceCount(orgProductCode, subsProductCode)
        isAdded = subsWithOrgInfoCount > 0 || subsAsOrgCount > 0 || subsInReOrderReplaceCount > 0
        return isAdded
    }


    override suspend fun checkAlreadyAddedSubsAsOrg(orgProductCode: String): Boolean {
        var isAdded = false
        var subsAsOrgCount = appDao.getAddedSubsAsOrgCount(orgProductCode)
        var subsInReOrderReplaceCount = appDao.getSubsInReorder(orgProductCode)
        isAdded = subsAsOrgCount > 0 || subsInReOrderReplaceCount > 0
        return isAdded
    }

    override suspend fun productReplacedInReorder(orgProductCode: String): Boolean {
        var isAdded = false
        var count = appDao.isProductReplacedInReorder(orgProductCode)
        isAdded = count > 0
        return isAdded
    }

    override suspend fun productAsReplaceInReorder(orgProductCode: String): Boolean {
        var isAdded = false
        var count = appDao.getSubsInReorder(orgProductCode)
        isAdded = count > 0
        return isAdded
    }

    override suspend fun deleteRecentlySearchForCustomerId(accessToken: String) {
        appDao.deleteAllRecentSearch()
    }


    override suspend fun deleteAllRecentlySearchMeds() {
        appDao.deleteAllRecentSearch()
    }

    override suspend fun updateImageAndDrugTypeInRecentSearchMed(
        image: String,
        drugType: String,
        productCode: String
    ) {
        appDao.updateImageAndDrugTypeInRecentlySearch(image, drugType, productCode)
    }

    override suspend fun updateTimeInRecentSearchMed(time: Long, productCode: String) {
        appDao.updateTimeInRecentlySearch(time, productCode)
    }

    override suspend fun getCartCountFromRecentlySearch(medicineName: String): Int = runBlocking {
        return@runBlocking async {
            appDao.getCartCountFromRecentlySearch(medicineName)
        }.await()
    }

    override suspend fun updateSellingPrice(sellingPrice: Double, productCode: String) {
        appDao.updateSellingPriceInCart(sellingPrice, productCode)
    }

    override suspend fun insertCartSellingPrice(cartItemSellingPrice: CartItemSellingPrice) {
        appDao.insertCartItemSellingPrice(cartItemSellingPrice)
    }

    override suspend fun insertSubOptReasons(subOptReasons: List<SubOptReasons>) {
        appDao.insertSubOptReasons(subOptReasons)
    }

    override suspend fun getSubOptReasonId(value: String): Int {
        return appDao.getSubOptReasonId(value)
    }

    override suspend fun deleteOfflineDbData() {
        appDao.deleteCustomerDetails()
        appDao.deleteAllRecentSearch()
        appDao.clearCartTable()
        appDao.clearOrgSubsTable()
        appDao.clearReorderAltSubsTable()
        appDao.deleteCartReplaceStatus()
        appDao.clearCrossSellingTable()
        appDao.deleteCartItemSequence()

        appDao.deletePillReminder()
        appDao.deleteReferReminder()
        appDao.deleteSaveVideoFAQ()
        appDao.deleteDoctorConfirmationSubOptions()
        appDao.deleteAddedCrossSelling()
        appDao.deleteOrderTicket()
        appDao.deleteProductImage()
        appDao.deleteCustomerCategory()
        appDao.deleteOrderFilter()
        appDao.deleteSubOptReasons()
        appDao.deleteCartItemSellingPrice()
        appDao.deleteTmContactVersion()

//        appDao.deletePatientNameEntity()
    }

    override suspend fun deleteCustomerDetails() {
        appDao.deleteCustomerDetails()
    }

    override suspend fun getInSectionValueOfSearch(keyName: String): String {
        return appDao.getKeyValueFromSearchCategory(keyName)
    }

    override suspend fun getCxOrgAdded(orgProductCode: String, subsProductCode: String): Int {
        return appDao.getCxOrgAdded(orgProductCode, subsProductCode)
    }

    override suspend fun isSubsAddedAsWell(orgProductCode: String): Int {
        return appDao.isSubsAddedAsWell(orgProductCode)
    }

    override suspend fun updateProductDetailsId(productCode: String, productDetailsId: Long) {
        return appDao.updateProductDetailsId(productDetailsId, productCode)
    }
    
    override suspend fun updatePrevOrderId(productCode: String, prevOrderId: Long) {
        appDao.updatePrevOrderId(prevOrderId, productCode)
    }
    
    override suspend fun updatePrevProductDetailsId(
        productCode: String,
        prevProductDetailsId: Long
    ) {
        appDao.updatePrevOrgProductId(prevProductDetailsId, productCode)
    }
    
    override suspend fun updateSubsMedProductCode(productCode: String, subsProductCode: String) {
        appDao.updateSubsMedProductCode(productCode, subsProductCode)
    }
    override suspend fun getSubsMedicineList(): List<CartMedicine> {
        return appDao.getAddedMedListWithSubs()
    }

    override suspend fun getAddedMedDetails(productCode: String): CartMedicine {
        return appDao.getAddedMedDetails(productCode)
    }

    override suspend fun getAddedSubsOrgInfo(subsProductCode: String): List<OrgSubsInfo> {
        return appDao.getAddedSubsOrgInfo(subsProductCode)
    }

    override suspend fun getProductDetailsId(productCode: String): Long {
        return appDao.getProductsDetailId(productCode)
    }

    override suspend fun getPrevOrderId(productCode: String): Long {
        return appDao.getPrevOrderId(productCode)
    }

    override suspend fun getPrevProductId(productCode: String): Long {
        return appDao.getPrevOrgProductId(productCode)
    }

    override suspend fun clearCartTable() {
        appDao.clearCartTable()
        appDao.clearOrgSubsTable()
        appDao.clearCrossSellingTable()
        appDao.clearReorderAltSubsTable()
        appDao.clearItemAddedAttributes()
        appDao.deleteCartReplaceStatus()
        appDao.deleteCartItemSellingPrice()
    }

    override suspend fun updateOrgAvailableStatus(productCode: String, available: Boolean) {
        appDao.updateOrgAvailableInAddedMedicine(available, productCode)
    }

    override suspend fun getPillReminderUsingOrderId(orderId: Long): List<PillReminder> {
        return appDao.getPillReminderUsingOrderId(orderId)
    }

    override suspend fun insertPillReminder(pillReminder: PillReminder) {
        appDao.insertPillReminder(pillReminder)
    }
    override suspend fun insertOrgSubFromCart(orgProductCode: String) {
        appDao.insertOrgSubFromCart(orgProductCode)
    }

    override suspend fun getSavedVideOFAQ(orderId: Long): List<SaveVideoFAQ> {
        return appDao.getSavedVideOFAQ(orderId)
    }

    override suspend fun insertSaveVideoFAQ(saveVideoFAQ: SaveVideoFAQ) {
        appDao.insertSaveVideoFAQ(saveVideoFAQ)
    }

    override suspend fun insertContactList(contactEntityList: List<TmContactVersion>) {
        appDao.insertContactList(contactEntityList)
    }
    
    override suspend fun getCartTotalSellingPrice(): Double {
        var total = 0.0
        val list = appDao.getCartTotalSellingPrice()
        if(!list.isNullOrEmpty()) {
            for (item in list) {
                total += item.sellingPrice * item.addedQty
            }
        }
        return total
    }
    override suspend fun getCartTotalMrpPrice(): Double {
        var total = 0.0
        val list = appDao.getCartTotalMrpPrice()
        if(!list.isNullOrEmpty()) {
            for (item in list) {
                total += item.mrp * item.addedQty
            }
        }
        return total
    }

    override suspend fun getReplaceMedAddedInCart(orgProductCode: String): Boolean {
        val count = appDao.getMedicineItemCount(orgProductCode)
        return count > 0
    }

    override suspend fun getSubsProductCodeAfterDelete(orgProductCode: String): String? {
        return appDao.getSubsProductCodeFromOrgCode(orgProductCode)
    }

    override suspend fun insertPatientNameEntity(patientNameEntity: List<PatientNameEntity>) {
        return appDao.insertPatientNameList(patientNameEntity)
    }

    override suspend fun getLastDateForNameValidation(): Long {
        return appDao.getLastDateForNameValidation()
    }

    override suspend fun checkNameExist(name: String): Int {
        return appDao.checkNameExist(name)
    }

    override suspend fun isAutoReplace(medicineId: String): Int {
        return appDao.isAutoReplace(medicineId)
    }
    override suspend fun deleteCartReplaceStatus(medicineId: String) {
        return appDao.deleteCartReplaceStatus(medicineId)
    }
    override suspend fun deleteCartReplaceStatus() {
        return appDao.deleteCartReplaceStatus()
    }
    override suspend fun insertCartReplaceStatus(cartReplaceStatus: CartReplaceStatus) {
        return appDao.insertCartReplaceStatus(cartReplaceStatus)
    }

    override suspend fun getAddedSubsInfoByOrg(orgProductCode: String): List<CartMedicine> {
        return appDao.getAddedSubsInfoByOrg(orgProductCode) ?: listOf()
    }

    override suspend fun getOrgProductCodeToMerge(orgProductCode: String): String {
        return appDao.getOrgProductCodeToMerge(orgProductCode) ?: ""
    }

    override suspend fun getAddedSubsMedCountFromMedicineId(orgProductCode: String): Int {
        return appDao.getAddedSubsMedCountFromMedicineId(orgProductCode)
    }

    override suspend fun insertCustomerCategory(item: CustomerCategory) {
        appDao.insertCustomerCategory(item)
    }

    override suspend fun getCustomerCategory(categoryType: String): String {
        return appDao.getCustomerCategory(categoryType)
    }

    override suspend fun getCustomerCategoryId(categoryType: String): Long {
        return appDao.getCustomerCategoryId(categoryType)
    }

    override suspend fun getAllCustomerCategory(): List<String> {
        return appDao.getAllCustomerCategory()
    }

    override suspend fun deleteCustomerCategory(categoryType: String) {
        return appDao.deleteCustomerCategory(categoryType)
    }
    
    override suspend fun getExistingCartItems() : HashMap<String, Int> {
        val map = HashMap<String, Int>()
        return try {
            val c = appDao.getExistingCartItems()
            if (c.count > 0) {
                while (c.moveToNext()) {
                    val productCode = c.getString(0)
                    val qty = c.getInt(1)
                    map[productCode] = qty
                }
            }
            map
        } catch (e: java.lang.Exception) {
            map
        }
    }
    
    override suspend fun getSwitchBackCount(productCode: String): Int {
        return appDao.getSwitchBackCount(productCode)
    }
    
    override suspend fun getOrgProductCodeFromSubs(subsProductCode: String) : String {
        return appDao.getReplacedMedId(subsProductCode)
    }
    
    override suspend fun getAddedMedProductCode(): List<String> {
        return appDao.getAddedMedProductCode()
    }
     override suspend fun getAddedMedNames(): List<String> {
        return appDao.getAddedMedNames()
    }

    override suspend fun getTrayDetailsOfItemAddedAttributes(): List<String> {
        return appDao.getTrayDetailsOfItemAddedAttributes()
    }

    override suspend fun getAddedOrgInfoByOrgCode(productCode: String): OrgSubsInfo {
        return appDao.getAddedOrgInfoByOrgCode(productCode)
    }
    
    override suspend fun getAddedOrgInfoBySubCode(subsProductCode: String): OrgSubsInfo {
        return appDao.getAddedOrgInfoBySubsCode(subsProductCode)
    }

    override suspend fun getDuplicateSubsFoundMedCode(): String {
        return appDao.getDuplicateSubsFoundMedCode()
    }

    override suspend fun getCountOfDuplicateSubsFound(subsProductCode: String): Int {
        return appDao.getCountOfDuplicateSubsFound(subsProductCode)
    }

    override suspend fun getMedicineListWIthSameSubs(subsProductCode: String): List<CartMedicine> {
        return appDao.getMedicineListWIthSameSubs(subsProductCode)
    }

    /*override suspend fun fetchCartMedicines(): List<String> {
        return cartLocalDataSource.fetchCartMedicines()
    }*/
    
    override suspend fun getItemAddedAttributes(productCode: String): ItemAddedEventAttributes {
        return appDao.getItemAddedAttributes(productCode)
    }

    override suspend fun deleteItemAddedAttributesUsingProductCode(productId: String) {
        appDao.deleteItemAddedAttribute(productId)
    }

    override suspend fun clearItemAddedAttributes() {
        appDao.clearItemAddedAttributes()
    }

    override suspend fun insertItemAddedAttributes(item: ItemAddedEventAttributes) {
        
        appDao.insertItemAddedAttributes(item)
    }

    override fun getKeyValueFromSearchCategoryIgnoreCase(key: String): String {
        return appDao.getKeyValueFromSearchCategoryIgnoreCase(key)
    }
    
    override suspend fun isSubsItselfAddedToCart(): Int {
        return appDao.isSubsItselfAddedToCart()
    }
    
    override suspend fun isOrgHavingSubsAddedToCart(): Int {
        return appDao.isOrgHavingSubsAddedToCart()
    }
    
    override suspend fun isOrgHavingNoSubsAddedToCart(): Int {
       return appDao.isOrgHavingNoSubsAddedToCart()
    }
    
    override suspend fun isSubAddedFromOrgToCart(): Int {
        return appDao.isSubAddedFromOrgToCart()
    }
    
    override suspend fun isAutoReplaceDone() : Int {
        return appDao.isAutoReplaceDone()
    }
    
    override suspend fun deleteCartItemSequence() {
        return appDao.deleteCartItemSequence()
    }
    
    override suspend fun fetchMedsSequenceOnCartPage(): List<String> {
        return appDao.fetchMedsSequenceOnCartPage()
    }
    
    override suspend fun fetchOrgMedsFromDBWhooseSubsWereSame(subsProductCode: String): List<OrgSubsInfo> {
        return appDao.fetchOrgMedsFromDBWhooseSubsWereSame(subsProductCode)
    }

    override suspend fun getLastCustomerCategoryId(): Long {
        return appDao.getLastCustomerCategoryId()
    }
}