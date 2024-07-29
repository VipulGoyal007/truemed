package com.intellihealth.truemeds.domain.usecase

import android.util.Log
import com.intellihealth.truemeds.data.model.orderflow.MedicineDto
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
import com.intellihealth.truemeds.data.repository.datasource.local.entity.ReferReminder
import com.intellihealth.truemeds.data.repository.datasource.local.entity.ReorderAlternateSubs
import com.intellihealth.truemeds.data.repository.datasource.local.entity.SaveVideoFAQ
import com.intellihealth.truemeds.data.repository.datasource.local.entity.SearchCategory
import com.intellihealth.truemeds.data.repository.datasource.local.entity.SubOptReasons
import com.intellihealth.truemeds.data.repository.datasource.local.entity.TmContactVersion
import com.intellihealth.truemeds.data.repository.datasource.local.entity.getSellingPrice
import com.intellihealth.truemeds.domain.repository.LocalDbRepository
import com.intellihealth.truemeds.presentation.model.ProductInfoModel
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.roundOffDecimal
import javax.inject.Inject

class LocalDbUseCase @Inject constructor(
    private val localDbRepository: LocalDbRepository
) {

    /**
     * Add product in offline DB
     */
    suspend fun addToCart(item: CartMedicine, orgSubsInfo: OrgSubsInfo?, isSubs: Boolean) {
        val count = getAddedQtyOfAddedMedicine(item.medicineId)
        if (count == 0) {
            localDbRepository.addItemToCart(item)
        } else {
            localDbRepository.updateAddedMedicine(item.medicineId, item.addedQty)
        }
        if (isSubs) {
            addSubsInfo(orgSubsInfo)
        }
        localDbRepository.insertCartSellingPrice(
            CartItemSellingPrice(
                item.medicineId,
                item.getSellingPrice()
            )
        )
    }


    /**
     * Adds ORG-SUBS mapping in DB is customer added subs product in Cart
     * **/
    suspend fun addSubsInfo(item: OrgSubsInfo?) {
        if (item != null)
            localDbRepository.addSubOrgInfo(item)
    }

    suspend fun getAddedMedicines(): List<CartMedicine> {
        return localDbRepository.getAddedMedicines() ?: listOf()
    }

    /*suspend fun getReplaceMedicineDto(cartList: List<ProductInfoModel>) : MutableList<MedicineDto> {
        var list = mutableListOf<MedicineDto>()
//        var cartItems = localDbRepository.getAddedMedicines() ?: listOf()
        for (item in cartList) {
            val qty = getAddedQtyOfAddedMedicine(item.product.productCode)
            val medicineItem = getMedicineDto(cartList, item, qty)
            list.add(medicineItem)
        }
        return list
    }*/
    suspend fun getCartMedicineDto(
        cartList: List<ProductInfoModel>,
        newOrder: Boolean,
        isReplaceAll: Boolean
    ): MutableList<MedicineDto> {
        var list = mutableListOf<MedicineDto>()
        var cartItems = localDbRepository.getAddedMedicines() ?: listOf()
        for (item in cartItems) {
            /*val cxOrgAdded = localDbRepository.getCxOrgAdded(
                item.medicineId,
                item.subsMedProductCode ?: ""
            )

            val isAdded = localDbRepository.isSubsAddedAsWell(
                item.medicineId
            )

            var medicineItem = MedicineDto(
                false,
                item.medicineName,
                item.medicineId,
                isAdded > 0,
                cxOrgAdded > 0,
                if (newOrder) null else item.productDetailsId,
                item.addedQty,
                false,
                if (newOrder) null else item.prevOrderId,
                if (newOrder) null else item.prevOrgProductId
            )*/
//            val qty = getAddedQtyOfAddedMedicine(item.product.productCode)
//            val medicineItem = getMedicineDto(cartItems, item.product.productCode, qty)
            val medicineItem = getMedicineDto(item, cartList, false)
            /*if (isReplaceAll) {
                medicineItem.cxAcceptedSubs = true
            }*/
            list.add(medicineItem)
        }
        return list
    }

    suspend fun getCartMedicineDtoFromProductCode(
        cartList: List<ProductInfoModel>,
        productCode: String,
        qty: Int
    ): MutableList<MedicineDto> {
        var list = mutableListOf<MedicineDto>()
        var cartItem = localDbRepository.getAddedMedDetails(productCode)
        cartItem?.let { item ->
            /*val cxOrgAdded = localDbRepository.getCxOrgAdded(
                item.medicineId,
                item.subsMedProductCode ?: ""
            )

            val isAdded = localDbRepository.isSubsAddedAsWell(
                item.medicineId
            )

            var medicineItem = MedicineDto(
                false,
                item.medicineName,
                item.medicineId,
                isAdded > 0,
                cxOrgAdded > 0,
                item.productDetailsId,
                qty,
                false,
                item.prevOrderId,
                item.prevOrgProductId
            )

                if (item.prevOrderId > 0) item.prevOrderId else null,
                if (item.prevOrgProductId > 0) item.prevOrgProductId else null
            )*/

            var medicineItem = getMedicineDto(item, cartList, qty == 0)
//            if (qty > 1) {
            medicineItem.quantity = qty
            medicineItem.medicineQty = qty
//            }
            list.add(medicineItem)
        }
        return list
    }

    suspend fun getCartMedicineDtoFromProductCodeByAPI(
        cartList: List<ProductInfoModel>,
        productCode: String,
        qty: Int
    ): MutableList<MedicineDto> {
        var list = mutableListOf<MedicineDto>()

        for (item in cartList) {
            if (item.product.productCode == productCode) {
                /*
                            val medicineDto = MedicineDto()

                            medicineDto.isKeepOrg = false

                            if (item.product.cxAcceptedSubs && item.product.switchBackProductCode != null) {
                                medicineDto.medicineName = item.product.switchBackSkuName
                                medicineDto.productCode = item.product.switchBackProductCode
                                medicineDto.cxAcceptedSubs = true
                                medicineDto.productDetailsId = item.product.productDetailsId
                            } else {
                                */
                /**
                 * User has not selected subs med
                 * **//*
                    medicineDto.medicineName = item.product.skuName
                    medicineDto.productCode = item.product.productCode
                    medicineDto.cxAcceptedSubs = false
    
                    
                    val cxOrgAdded = getCxOrgAdded(cartList, productCode)
        
                        medicineDto.cxOrgAdded = cxOrgAdded != null
        
                        val isAdded = localDbRepository.isSubsAddedAsWell(productCode)
        
                        val productDetailsId: Long = if (isAdded > 0) {
                            //org added with subs
                            medicineDto.isKeepOrg = true
                            item.product.productDetailsId ?: 0
                            
                        } else {
                            //only org added
                            item.product.productDetailsId ?: 0
                            
                        }
        
                        if (productDetailsId > 0) {
                            medicineDto.productDetailsId = productDetailsId
                        }
                    
                }
                
                
                val prevOrderId = item.product.prevOrderId
    
                if (prevOrderId != 0L) {
                    medicineDto.prevOrderId = prevOrderId
                }
    
                val prevOrgProductId = item.product.prevOrgProductId
    
    
                if (prevOrgProductId != 0L) {
                    medicineDto.prevOrgProductId = prevOrgProductId
                }
                medicineDto.quantity = qty
                medicineDto.medicineQty = qty
    
                medicineDto.isCrossSellingProduct = false*/

                val medicineDto = getMedicineDto1(cartList, item, qty)
                list.add(medicineDto)
            }
        }
        return list
    }


    private suspend fun getCxOrgAdded(
        list: List<ProductInfoModel>,
        productCode: String
    ): ProductInfoModel? {
        var infoModel: ProductInfoModel? = null
        for (item in list) {
            if (item.product.productCode == productCode) {
                infoModel = item
                break
            }
        }
        return infoModel
    }


    suspend fun getCartMedicineDtoFromProductCodeForSwitchBack(
        productCode: String,
        qty: Int
    ): MutableList<MedicineDto> {
        var list = mutableListOf<MedicineDto>()
        var cartItem = localDbRepository.getAddedMedDetails(productCode)
        cartItem?.let { item ->
            val medicineItem = getMedicineDto(item, listOf(), false)
            medicineItem.quantity = qty
            medicineItem.medicineQty = qty
            list.add(medicineItem)
        }
        return list
    }

    private suspend fun getMedicineDto1(
        cartList: List<ProductInfoModel>,
        item: ProductInfoModel,
        qty: Int
    ): MedicineDto {
        val medicineDto = MedicineDto()
//        for (item in cartList) {
//            if (item.product.productCode == productCode) {

        medicineDto.isKeepOrg = false

        if (item.product.cxAcceptedSubs && item.product.switchBackProductCode != null) {
            medicineDto.medicineName = item.product.switchBackSkuName
            medicineDto.productCode = item.product.switchBackProductCode
            medicineDto.cxAcceptedSubs = true
            medicineDto.productDetailsId = item.product.productDetailsId
        } else {
            /**
             * User has not selected subs med
             * **/
            medicineDto.medicineName = item.product.skuName
            medicineDto.productCode = item.product.productCode
            medicineDto.cxAcceptedSubs = false


            val cxOrgAdded = getCxOrgAdded(cartList, item.product.productCode)

            medicineDto.cxOrgAdded = cxOrgAdded != null

            val isAdded = localDbRepository.isSubsAddedAsWell(item.product.productCode)

            val productDetailsId: Long = if (isAdded > 0) {
                //org added with subs
                medicineDto.isKeepOrg = true
                item.product.productDetailsId ?: 0

            } else {
                //only org added
                item.product.productDetailsId ?: 0

            }

            if (productDetailsId > 0) {
                medicineDto.productDetailsId = productDetailsId
            }

        }


        val prevOrderId = item.product.prevOrderId

        if (prevOrderId != 0L) {
            medicineDto.prevOrderId = prevOrderId
        }

        val prevOrgProductId = item.product.prevOrgProductId


        if (prevOrgProductId != 0L) {
            medicineDto.prevOrgProductId = prevOrgProductId
        }
        medicineDto.quantity = qty
        medicineDto.medicineQty = qty

        medicineDto.isCrossSellingProduct = false
//                break
//            }
//        }
        return medicineDto
    }

    private suspend fun getMedicineDto(
        model: CartMedicine,
        cartList: List<ProductInfoModel>,
        addOgPdId: Boolean
    ): MedicineDto {
        var medicineDto: MedicineDto? = null
        try {
            val list = localDbRepository.getAddedSubsOrgInfo(model.medicineId)
            /*val list = DatabaseHelper.getAddedSubsOrgInfo(
                appDao, model.originalPrioductCode
            )*/

            if (list!!.isNotEmpty()) {
                //to take from service response
                /*val medicineModel = list[0]
                medicineDto.medicineName = medicineModel.medicineName
                medicineDto.productCode = medicineModel.medicineId
                medicineDto.cxAcceptedSubs = true*/
//                medicineDto.medicineId = medicineModel._source.original_product_code

                if (!cartList.isNullOrEmpty()) {
                    for (cartItem in cartList) {
                        if (cartItem.product.productCode == model.medicineId) {
                            medicineDto = MedicineDto()
                            if (cartItem.product.productDetailsId ?: 0 > 0) {
                                medicineDto.productDetailsId = cartItem.product.productDetailsId
                                medicineDto.cxAcceptedSubs = cartItem.product.cxAcceptedSubs
                                medicineDto.medicineName = cartItem.product.switchBackSkuName
                                medicineDto.productCode = cartItem.product.switchBackProductCode

                                val ogPdId = localDbRepository.getProductDetailsId(
                                    cartItem.product.switchBackProductCode ?: ""
                                )
                                if (cartItem.product.cxAcceptedSubs && addOgPdId && ogPdId > 0) {
                                    medicineDto.ogPdId = ogPdId
                                }
                                medicineDto.isKeepOrg = false
                            }
                            break
                        }
                    }
                }

                if (medicineDto == null) {
                    medicineDto = MedicineDto()
                    val medicineModel = list[0]
                    medicineDto.medicineName = medicineModel.medicineName
                    medicineDto.productCode = medicineModel.medicineId
                    medicineDto.cxAcceptedSubs = true
                    val productDetailsId =
                        localDbRepository.getProductDetailsId(model.medicineId ?: "")
                    if (productDetailsId > 0) {
                        medicineDto.productDetailsId = productDetailsId
                    }
                    val ogPdId =
                        localDbRepository.getProductDetailsId(medicineModel.medicineId ?: "")
                    if (addOgPdId && ogPdId > 0) {
                        medicineDto.ogPdId = ogPdId
                    }
                }
                /*medicineDto.cxAcceptedSubs = true
                val productDetailsId =
                    localDbRepository.getProductDetailsId(model.medicineId ?: "") Constants.getProductDetailsId(
                    appSqliteDatabase,
                    medicineModel._source.subs_product_code,
                    medicineModel._source.subs_product_code,
                    "false",
                    "true"
                )
                
                 if (productDetailsId > 0) {
                    medicineDto.productDetailsId = productDetailsId
                }
                */


            } else {
                medicineDto = MedicineDto()
                medicineDto.medicineName = model.medicineName
                medicineDto.productCode = model.medicineId
                medicineDto.cxAcceptedSubs = false

                val cxOrgAdded = localDbRepository.getCxOrgAdded(
                    model.medicineId,
                    model.subsMedProductCode ?: ""
                )

                medicineDto.cxOrgAdded = cxOrgAdded > 0

                val isAdded = localDbRepository.isSubsAddedAsWell(model.medicineId)

                val productDetailsId: Long = if (isAdded > 0) {
                    //org added with subs
                    medicineDto.isKeepOrg = true
                    localDbRepository.getProductDetailsId(model.medicineId)
                    /*Constants.getProductDetailsId(
                        appSqliteDatabase,
                        model.originalPrioductCode,
                        model.searchMedicineSourceModel.subs_product_code,
                        "true",
                        "false"
                    )*/
                } else {
                    //only org added
                    localDbRepository.getProductDetailsId(model.medicineId)
                    /*Constants.getProductDetailsId(
                        appSqliteDatabase,
                        model.originalPrioductCode,
                        model.searchMedicineSourceModel.subs_product_code,
                        "false",
                        "false"
                    )*/
                }

                if (productDetailsId > 0) {
                    medicineDto.productDetailsId = productDetailsId
                }
            }

            val prevOrderId =
                localDbRepository.getPrevOrderId(model.medicineId)

            if (prevOrderId != 0L) {
                medicineDto.prevOrderId = prevOrderId
            }

            val prevOrgProductId =
                localDbRepository.getPrevProductId(model.medicineId)


            if (prevOrgProductId != 0L) {
                medicineDto.prevOrgProductId = prevOrgProductId
            }
            medicineDto.quantity = model.addedQty
            medicineDto.medicineQty = model.addedQty

            /**
             * not in use
             * **/
            medicineDto.isCrossSellingProduct =
                false//crossList.contains(model.originalPrioductCode)
        } catch (ignore: Exception) {
            ignore.message
        }
        return medicineDto ?: MedicineDto()
    }

    /**
     * If customer orders medicine 'A' and selected 'B' on Dr call
     * Now, while doing reorder if subs medicine becomes unavailable
     * In the above scenario if ORG med has another subs medicine available which is 'C'
     * So, we need to insert medicine 'C' in our DB table
     * **/
    fun addReorderAlternateMedicine(item: ReorderAlternateSubs?) {
//        item?.let { appDao.insertReorderAltSubs(item) }
    }

    /**
     * add reminder of order placed items
     * **/
    fun addPillReminder(item: PillReminder?) {
//        item?.let { appDao.insertPillReminder(it) }
    }

    /**
     * add reminder of referral program in DB
     * **/
    fun addReferReminder(item: ReferReminder?) {
//        item?.let { appDao.insertReferReminder(it) }
    }

    /**
     * add variant category
     * **/
    suspend fun addVariant(item: CustomerCategory) {
        localDbRepository.insertCustomerCategory(item)
    }

    suspend fun getCustomerCategory(categoryType: String): String {
        return localDbRepository.getCustomerCategory(categoryType)
    }
    suspend fun getCustomerCategoryId(categoryType: String): Long {
        return localDbRepository.getCustomerCategoryId(categoryType)
    }
    suspend fun getAllCustomerCategory(): List<String> {
        return localDbRepository.getAllCustomerCategory()
    }

    suspend fun addCustomerDetails(item: CustomerDetails) {
        SharedPrefManager.getInstance().currentUserGender = item.genderName
        SharedPrefManager.getInstance().currentUserAge = item.age
        localDbRepository.addCustomerDetails(item)
    }

    /*suspend fun insertOrderFilterDetails(item: OrderFilter) {
        localDbRepository.insertOrderFilterDetails(item)
    }*/
    suspend fun insertOrderFilterDetails(orderFilterList: List<OrderFilter>) {
        localDbRepository.deleteOrderFilterDetails()
        localDbRepository.insertOrderFilterDetails(orderFilterList)
    }

    suspend fun insertSearchType(searchCategoryList: List<SearchCategory>) {
        localDbRepository.deleteSearchTypeMaster()
        localDbRepository.insertSearchTypeMaster(searchCategoryList)
    }

    suspend fun insertTmContactDetails(tmContacts: List<TmContactVersion>) {
        localDbRepository.deleteTmContactDetails()
        localDbRepository.insertTmContactDetails(tmContacts)
    }

    /**
     * remove medicine from cart
     * **/
    suspend fun removeItemFromCart(productCode: String, isSubs: Boolean) {
        Log.e("removeMediciImpl:::", "11:::" + productCode)
        localDbRepository.removeMedicineItem(productCode)
        if (isSubs) {
            localDbRepository.removeOrgSubsInfo(productCode)
        }
    }

    suspend fun removeOrgSubsMapping(productCode: String) {
        localDbRepository.removeOrgSubsInfo(productCode)
    }

    /**
     * update medicine quantity on addition and substraction
     * **/
    suspend fun updateMedicineQuantity(productCode: String, addedQty: Int) {
        localDbRepository.updateAddedMedicine(productCode, addedQty)
    }

    suspend fun updateProductDetailsId(productCode: String, productDetailsId: Long) {
        localDbRepository.updateProductDetailsId(productCode, productDetailsId)
    }

    suspend fun updatePrevOrderId(productCode: String, prevOrderId: Long) {
        localDbRepository.updatePrevOrderId(productCode, prevOrderId)
    }

    suspend fun updatePrevProductDetailsId(productCode: String, prevProductDetailsId: Long) {
        localDbRepository.updatePrevProductDetailsId(productCode, prevProductDetailsId)
    }
    
    suspend fun updateSubsMedProductCode(productCode: String, subsProductCode: String) {
        localDbRepository.updateSubsMedProductCode(productCode, subsProductCode)
    }


    /**
     * fetch medicine quantity from
     * **/
//    fun getAddedMedicineQuantity(productCode: String?): Int {
//        return productCode?.let {
//            //appDao.getMedicineItemCount(productCode)
//        } ?: 0
//    }

    suspend fun updateOrgAvailable(productCode: String, available: Boolean) {
        localDbRepository.updateOrgAvailableStatus(productCode, available)
    }

    fun getReOrderPatientInfo(): List<String> = listOf<String>()
//    appDao.getReorderPatientInfo()

    /**
     * delete customer category from table
     * **/
    suspend fun deleteOfflineDbData(categoryType: String?) {
        categoryType?.let { localDbRepository.deleteCustomerCategory(it) }
    }

    /* suspend fun getUserAccessToken():String? {
         return  localDbRepository.getUserAccessToken()
     }*/

    suspend fun getRecentlySearch() = localDbRepository.getRecentSearch() ?: listOf()

    suspend fun getPreviouslySearch() = localDbRepository.getPreviouslySearch() ?: listOf()

    suspend fun getCartCount() = localDbRepository.getCartItemCount()

    suspend fun insertCrossSellingProduct(productCode: String) =
        localDbRepository.insertCrossSellingProduct(AddedCrossSelling(null, productCode))

    suspend fun getAddedCrossSellingProducts() = localDbRepository.getCrossSellingProduct()

    suspend fun getAddedCrossSellingProductCount() =
        localDbRepository.getAddedCrossSellingProductCount()
    suspend fun getPrevOrderIdItemCount() =
        localDbRepository.getPrevOrderIdItemCount()
    suspend fun getSavedContactsCount() =
        localDbRepository.getSavedContactsCount()

    suspend fun clearCrossSellingProducts() = localDbRepository.clearAddedCrossSellingTable()

    suspend fun removeCrossSellingProductUsingId(productCode: String) =
        localDbRepository.removeAddedCrossSellingUsingId(productCode)

    suspend fun getAddedQtyOfAddedMedicine(productCode: String) =
        localDbRepository.getAddedMedicineCount(productCode)

    suspend fun checkAlreadyAddedAsSubs(
        orgProductCode: String,
        subsProductCode: String,
        fromOrderSummary: Boolean
    ) = localDbRepository.checkAlreadyAddedAsSubs(orgProductCode, subsProductCode, fromOrderSummary)

    suspend fun checkAlreadyAddedSubsAsOrg(orgProductCode: String) =
        localDbRepository.checkAlreadyAddedSubsAsOrg(orgProductCode)

    suspend fun productReplacedInReorder(orgProductCode: String) =
        localDbRepository.productReplacedInReorder(orgProductCode)

    suspend fun productAsReplaceInReorder(orgProductCode: String) =
        localDbRepository.productAsReplaceInReorder(orgProductCode)

    suspend fun deleteRecentlySearchForCustomerId(accessToken: String) =
        localDbRepository.deleteRecentlySearchForCustomerId(accessToken)

    suspend fun deleteAllRecentlySearchMeds() = localDbRepository.deleteAllRecentlySearchMeds()

    suspend fun updateImageAndDrugTypeInRecentMeds(
        image: String,
        drugType: String,
        productCode: String
    ) = localDbRepository.updateImageAndDrugTypeInRecentSearchMed(image, drugType, productCode)

    suspend fun updateTimeInRecentSearch(time: Long, productCode: String) =
        localDbRepository.updateTimeInRecentSearchMed(time, productCode)

    suspend fun getCartCountFromRecentlySearch(medicineName: String) =
        localDbRepository.getCartCountFromRecentlySearch(medicineName)

    suspend fun addRecentlySearchMed(recentMedicine: RecentMedicine) {
        if (recentMedicine.medicineName.isNotEmpty()) {
            localDbRepository.addRecentlySearchedMedicine(recentMedicine)
        }
    }

    suspend fun updateSellingPrice(sellingPrice: Double, productCode: String) =
        localDbRepository.updateSellingPrice(sellingPrice, productCode)

    suspend fun insertCartSellingPrice(cartItemSellingPrice: CartItemSellingPrice) =
        localDbRepository.insertCartSellingPrice(cartItemSellingPrice)

    suspend fun insertSubOptReasons(subOptReasonsList: List<SubOptReasons>) =
        localDbRepository.insertSubOptReasons(subOptReasonsList)

    suspend fun getSubOptReasonId(value: String) = localDbRepository.getSubOptReasonId(value)

    suspend fun deleteOfflineDbData() = localDbRepository.deleteOfflineDbData()

    suspend fun getOrderFilterList(): List<OrderFilter> {
        return localDbRepository.getOrderFilterList()
    }

    suspend fun getCustomerDetails(mobileNo: String): CustomerDetails {
        return localDbRepository.getCustomerDetails(mobileNo)
    }

    suspend fun getInSectionForSearch(keyName: String) =
        localDbRepository.getInSectionValueOfSearch(keyName)

    suspend fun getCxOrgAdded(orgProductCode: String, subsProductCode: String) =
        localDbRepository.getCxOrgAdded(orgProductCode, subsProductCode)

    suspend fun getSubsAddedAsWell(orgProductCode: String) =
        localDbRepository.isSubsAddedAsWell(orgProductCode)

    suspend fun getSubsMedicineList() = localDbRepository.getSubsMedicineList()

    suspend fun clearCart() = localDbRepository.clearCartTable()

    suspend fun getPillReminderUsingOrderId(orderId: Long): List<PillReminder> {
        return localDbRepository.getPillReminderUsingOrderId(orderId)
    }

    suspend fun insertPillReminder(pillReminder: PillReminder) {
        localDbRepository.insertPillReminder(pillReminder)
    }
    suspend fun insertOrgSubFromCart(orgProductCode: String) {
        if (orgProductCode.isNullOrEmpty()) return
        localDbRepository.insertOrgSubFromCart(orgProductCode)
    }

    suspend fun getSavedVideOFAQ(orderId: Long): List<SaveVideoFAQ> {
        return localDbRepository.getSavedVideOFAQ(orderId)
    }

    suspend fun insertSaveVideoFAQ(saveVideoFAQ: SaveVideoFAQ) {
        localDbRepository.insertSaveVideoFAQ(saveVideoFAQ)
    }

    suspend fun insertContactList(contactEntityList: List<TmContactVersion>) {
        localDbRepository.insertContactList(contactEntityList)
    }

    suspend fun getCartTotalSellingPrice(): Double {
        return roundOffDecimal(localDbRepository.getCartTotalSellingPrice())
    }
    suspend fun getCartTotalMrpPrice(): Double {
        return roundOffDecimal(localDbRepository.getCartTotalMrpPrice())
    }

    suspend fun getProductDetailsId(productCode: String): Long {
        return localDbRepository.getProductDetailsId(productCode)
    }

    suspend fun getReplaceMedAddedInCart(productCode: String): Boolean {
        return localDbRepository.getReplaceMedAddedInCart(productCode)
    }

    suspend fun getSubsProductCodeAfterDelete(orgProductCode: String): String {
        return localDbRepository.getSubsProductCodeAfterDelete(orgProductCode) ?: ""
    }

    suspend fun getOrgCountFromSubsMed(orgProductCode: String): Int {
        val list = localDbRepository.getAddedSubsOrgInfo(orgProductCode)
        return list.size
    }

    suspend fun getOrgProductCodeToMerge(orgProductCode: String): String {
        return localDbRepository.getOrgProductCodeToMerge(orgProductCode)
    }

    suspend fun getAddedSubsInfoByOrg(orgProductCode: String): List<CartMedicine> {
        return localDbRepository.getAddedSubsInfoByOrg(orgProductCode)
    }

    //  @Insert(onConflict = OnConflictStrategy.REPLACE)
    //  fun insertContactList(tmContactVersion: List<TmContactVersion>)

    suspend fun insertPatientNameEntity(patientNameEntity: List<PatientNameEntity>) {
        localDbRepository.insertPatientNameEntity(patientNameEntity)
    }

    suspend fun getLastDateForNameValidation(): Long {
        return localDbRepository.getLastDateForNameValidation()
    }

    suspend fun checkNameExist(name: String): Int {
        return localDbRepository.checkNameExist(name)
    }

    suspend fun isAutoReplace(medicineId: String): Int {
        return localDbRepository.isAutoReplace(medicineId)
    }

    suspend fun insertCartReplaceStatus(cartReplaceStatus: CartReplaceStatus) {
        return localDbRepository.insertCartReplaceStatus(cartReplaceStatus)
    }

    suspend fun deleteCartReplaceStatus(medicineId: String) {
        return localDbRepository.deleteCartReplaceStatus(medicineId)
    }

    suspend fun deleteCartReplaceStatus() {
        return localDbRepository.deleteCartReplaceStatus()
    }

    suspend fun getAddedSubsMedCountFromMedicineId(productCode: String): Int {
        return localDbRepository.getAddedSubsMedCountFromMedicineId(productCode)
    }

    suspend fun getExistingCartMap(): HashMap<String, Int> {
        return localDbRepository.getExistingCartItems()
    }

    suspend fun getSwitchBackCount(productCode: String): Int {
        return localDbRepository.getSwitchBackCount(productCode)
    }

    suspend fun getOrgProductCodeFromSubs(subsProductCode: String): String {
        return localDbRepository.getOrgProductCodeFromSubs(subsProductCode)
    }

    suspend fun getPrevOrderId(productCode: String): Long {
        return localDbRepository.getPrevOrderId(productCode)
    }

    suspend fun getAddedMedProductCode(): List<String> {
        return localDbRepository.getAddedMedProductCode()
    }

    suspend fun getAddedMedNames(): List<String> {
        return localDbRepository.getAddedMedNames()
    }

    suspend fun getAddedOrgInfoByOrgCode(productCode: String): OrgSubsInfo {
        return localDbRepository.getAddedOrgInfoByOrgCode(productCode)
    }
    
    suspend fun getAddedOrgInfoBySubsCode(subsCode: String): OrgSubsInfo {
        return localDbRepository.getAddedOrgInfoBySubCode(subsCode)
    }

    /*suspend fun fetchCartMedicines(): List<String> {
        return localDbRepository.fetchCartMedicines()
    }*/
    
    suspend fun insertItemAddedAttributes(item: ItemAddedEventAttributes) {
        var clickPage = if (!item.clickedPage.isNullOrEmpty()) {
            if (item.clickedPage == "pdp") {
                "pd"
            } else {
                item.clickedPage
            }
        } else {
            ""
        }
        item.clickedPage = clickPage
        return localDbRepository.insertItemAddedAttributes(item)
    }

    suspend fun clearItemAddedAttributes() {
        localDbRepository.clearItemAddedAttributes()
    }

    suspend fun deleteItemAddedAttributesUsingProductCode(productCode: String) {
        localDbRepository.deleteItemAddedAttributesUsingProductCode(productCode)
    }

    suspend fun getItemAddedAttributes(productCode: String) : ItemAddedEventAttributes {
        return localDbRepository.getItemAddedAttributes(productCode)
    }

    fun getKeyValueFromSearchCategoryIgnoreCase(key: String) :String {
        return localDbRepository.getKeyValueFromSearchCategoryIgnoreCase(key)
    }

    suspend fun getAddedMedicineDetails(medicineId: String) : CartMedicine {
        return localDbRepository.getAddedMedDetails(medicineId)
    }

    suspend fun getTrayDetailsOfItemAddedAttributes() : List<String> {
        return localDbRepository.getTrayDetailsOfItemAddedAttributes()
    }
    
    private suspend fun isSubsItselfAddedToCart() : Int {
        return localDbRepository.isSubsItselfAddedToCart()
    }
    private suspend fun isOrgHavingSubsAddedToCart() : Int {
        return localDbRepository.isOrgHavingSubsAddedToCart()
    }
    
    private suspend fun isOrgHavingNoSubsAddedToCart() : Int {
        return localDbRepository.isOrgHavingNoSubsAddedToCart()
    }
    
    private suspend fun isSubAddedFromOrgToCart() : Int {
        return localDbRepository.isSubAddedFromOrgToCart()
    }
    suspend fun getSubsIdOfOrder() :Int {
        var orderTypeId = 211
        try {
            var isSubsItselfAdded = false
            var isOrgHavingSubsAdded = false
            var isOrgHaveNoSubsAdded = false
            var isSubsAddedFromOrg = false
            var cursor = isSubsItselfAddedToCart()
            isSubsItselfAdded = cursor > 0
            cursor = isOrgHavingSubsAddedToCart()
            isOrgHavingSubsAdded = cursor > 0
            cursor = isOrgHavingNoSubsAddedToCart()
            isOrgHaveNoSubsAdded = cursor > 0
            cursor = isSubAddedFromOrgToCart()
            isSubsAddedFromOrg = cursor > 0
            if (isSubsAddedFromOrg) {
                orderTypeId = 61
            } else if (isSubsItselfAdded) {
                orderTypeId = 211
            } else if (isOrgHavingSubsAdded) {
                orderTypeId = 62
            } else if (isOrgHaveNoSubsAdded) {
                orderTypeId = 211
            }
        } catch (ignore: Exception) {
        }
        return orderTypeId
    }

    suspend fun getDuplicateSubsFoundMedCode() : String {
        return localDbRepository.getDuplicateSubsFoundMedCode()
    }

    suspend fun getCountOfDuplicateSubsFound(subsProductCode: String) : Int {
        return localDbRepository.getCountOfDuplicateSubsFound(subsProductCode)
    }

    suspend fun getMedicineListWIthSameSubs(subsProductCode: String) : List<CartMedicine> {
        return localDbRepository.getMedicineListWIthSameSubs(subsProductCode)
    }

    
    private suspend fun isAutoReplaceDone() : Int {
        return localDbRepository.isAutoReplaceDone()
    }
    
    private suspend fun deleteCartItemSequence() {
        return localDbRepository.deleteCartItemSequence()
    }
    
    private suspend fun fetchMedsSequenceOnCartPage() : List<String> {
        return localDbRepository.fetchMedsSequenceOnCartPage()
    }
    
    suspend fun fetchCartMedicines(): List<String> {
        val cartDataModelList: MutableList<String> = ArrayList()
        var c: List<String>? = null
        try {
            
            val isAutoReplaced = isAutoReplaceDone() > 0
            if (!isAutoReplaced) {
                deleteCartItemSequence()
            }
            
            c = fetchMedsSequenceOnCartPage()
            
            if (!c.isNullOrEmpty()) {
                for (item in c) {
                    cartDataModelList.add(item)
                }
            }
            
        } catch (ignore: Exception) {
            ignore.message
        } finally {
        }
        return cartDataModelList
    }
    
    
    
    suspend fun getCartMedicineDiscount() : Double {
        var discount: Double = 0.0
        val list = getAddedMedicines()
        for (item in list) {
            /*val productCodeOfAddedMed = item.medicineId
            val addedOrgInfo = getAddedOrgInfoBySubsCode(productCodeOfAddedMed)
            if (addedOrgInfo != null) {
                *//**
                 * customer added SUBS medicine
                 * **//*
                val orgPackSize = addedOrgInfo.originalPackSize
                val subsPackSize = addedOrgInfo.substitutePackSize
                val recommended = orgPackSize / subsPackSize
                
                val mrp = addedOrgInfo.mrp
                val sellingPrice = item.subsSellingPrice * recommended
                
                val qty = item.addedQty
                if (qty > recommended) {
                    *//**
                     * higher qty is ordered than recommended
                     * **//*
                    val qtyToMatch = qty / recommended
                    val savings = (mrp * qtyToMatch) - sellingPrice
                    discount += savings
                } else {
                    val savings = mrp - sellingPrice
                    discount += savings
                }
            } else {*/
                /**
                 * customer added ORG medicine
                 * **/
                val mrp = item.mrp
                val sellingPrice = item.mrp - (item.mrp * (item.discount * 0.01))
                val savings = (mrp - sellingPrice) * item.addedQty
                discount += savings
//            }
        }
        
        return discount
    }
    
    suspend fun fetchOrgMedsFromDBWhooseSubsWereSame(subsMedProductCode: String) : List<OrgSubsInfo> =
        localDbRepository.fetchOrgMedsFromDBWhooseSubsWereSame(subsMedProductCode)

    suspend fun getLastCustomerCategoryId() = localDbRepository.getLastCustomerCategoryId()
}