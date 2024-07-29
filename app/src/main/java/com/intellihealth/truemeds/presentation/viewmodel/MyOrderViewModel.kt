package com.intellihealth.truemeds.presentation.viewmodel

import android.util.Log
import android.view.View
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.intellihealth.salt.models.CartModel
import com.intellihealth.salt.views.Toast
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.home.ChildCategoryModel
import com.intellihealth.truemeds.data.model.home.PersonalCareCategoryModel
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.model.user.GetAllBrandsTypeResponse
import com.intellihealth.truemeds.data.model.user.GetAllSubCategoryTypeResponse
import com.intellihealth.truemeds.data.utils.MESSAGES
import com.intellihealth.truemeds.domain.usecase.LoginUseCase
import com.intellihealth.truemeds.domain.usecase.UserDataUseCase
import com.intellihealth.truemeds.mvvm.data.mixpanel.MXFilterClicked
import com.intellihealth.truemeds.presentation.adapter.HomeOtcCategoryAdapter
import com.intellihealth.truemeds.presentation.adapter.HomeOtcCategoryAdapter.Companion.superCategoryName
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxBannerClicked
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxCategoryImpression
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxOtcProductListPageViewed
import com.intellihealth.truemeds.presentation.model.OtcProductsForCategoriesRequest
import com.intellihealth.truemeds.presentation.model.ProductInfoModel
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.AppConstants
import com.intellihealth.truemeds.presentation.viewmodel.events.Event
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class MyOrderViewModel @Inject constructor(
    private val userDataUseCase: UserDataUseCase,
    private val loginUseCase: LoginUseCase
) :
    BaseViewModelWithLogin(loginUseCase),
    DefaultLifecycleObserver {

    private val showMessage = MutableLiveData<Event<MESSAGES>>()
    val eventMessage: LiveData<Event<MESSAGES>> get() = showMessage
    var showShimmer = MutableLiveData<Boolean>(true)
    var lastScrollPosition = 0
    var lastScrollPosition1 = 0
    val showShimmerLiveData: LiveData<Boolean> get() = showShimmer
    var orderTypePreviousPos = 0
    var orderTypeActualSelectedPos = 0

    var patientsSelectedListTemp: MutableList<Int> = mutableListOf()
    var patientTypeValue: String = ""
    var highLightPosition = 0

    //managing filter list conditions
    var filterlistType = MutableLiveData<String>("category")
    var categoryBottomSheetListTemp: MutableLiveData<MutableList<ChildCategoryModel?>> =
        MutableLiveData(mutableListOf())
    var subCategoryBottomSheetListTemp: MutableLiveData<MutableList<GetAllSubCategoryTypeResponse.SubCategoryType?>> =
        MutableLiveData(mutableListOf())
    var brandBottomSheetListTemp: MutableLiveData<MutableList<GetAllBrandsTypeResponse.BrandType?>> =
        MutableLiveData(mutableListOf())
    var categoryTypePreviousPos = -1
    var subCategoryTypePreviousPos = -1
    private val listOfBrands = arrayListOf<GetAllBrandsTypeResponse.BrandType>()

    //val isLoading = MutableLiveData(false)
    val isEmptyData = MutableLiveData(false)
    val childCategoryList = MutableLiveData<List<ChildCategoryModel>?>(emptyList())
    var adapterCartModel: ProductInfoModel? = null
    private var filteredLevel: String? = null
    private var filteredCategoryId: String? = null
    private var filteredCollectionId: Int? = 0
    var filteredPostion = -1
    var filteredCategoryName = "All"
    var fitteredSubCategoryName: String? = null
    var brandsLocal: MutableList<GetAllBrandsTypeResponse.BrandType?> = mutableListOf()
    var otcHighLightedCategoryPosition = 0
    /*private val openOrderSummaryActivity = MutableLiveData<Event<Any>>()
    val eventOpenOrderSummaryActivity: LiveData<Event<Any>> get() = openOrderSummaryActivity

    private val openCartActivity = MutableLiveData<Event<Any>>()
    val eventOpenCartActivity: LiveData<Event<Any>> get() = openCartActivity

    private val initiateLogin = MutableLiveData<Event<Any>>()
    val eventInitiateLogin: LiveData<Event<Any>> get() = initiateLogin*/

    private val openLoginBottomSheet = MutableLiveData<Event<Any>>()
    val eventLoginOpenBottomSheet: LiveData<Event<Any>> get() = openLoginBottomSheet
    var currentProductCode: String = ""
    var topDealPosition = 0
    val allBrandIs = mutableListOf<GetAllBrandsTypeResponse.BrandType?>()
    val allSubCategoriesId = mutableListOf<GetAllSubCategoryTypeResponse.SubCategoryType?>()
    var appliedFilterCount = MutableLiveData<Int>(0)
    var isCategoryFilterOn = false
    var isOTCBannerClicked = false
    var childCategoryType = ""
    var clickedOnPage: String = ""
    var mxInternalErrorOccurred=MxInternalErrorOccurred()
    private val sendItemImpression = MutableLiveData<Event<Any>>()
    val eventSendItemImpression: LiveData<Event<Any>> get() = sendItemImpression
    val explicitLoading = MutableLiveData(false)
    var superCategoryID = 1
    var superCategoryType = ""
    var isNextPageAvailable = false


    /*fun getTrueCallerUserDetails(
        textAuthorizationCode: String,
        clientId: String,
        authorizationCode: String,
        codeVerifier: String,
        context: Context
    ) = viewModelScope.launch(Dispatchers.IO) {
        try {
            //showSearching.postValue(true)
            val loginStatus = loginUseCase.getTrueCallerUserDetails(
                textAuthorizationCode,
                clientId,
                authorizationCode,
                codeVerifier,
                SharedPrefManager.getInstance().fcm,
                SharedPrefManager.getInstance().googleAdId,
                context
            )
            when (loginStatus) {
                LoginStatus.SUCCESS -> {
                    //for homepage bottom nav, to update data
                    SharedPrefManager.getInstance().isLoggedInFromBottomSheet = true
                    //postLoginSetUserSpecificData()
                    //hide loader
                    //showSearching.postValue(false)
                }

                LoginStatus.INVALID_OTP -> {
                    //showSearching.postValue(false)
                }


                LoginStatus.INVALID_ACCESS_TOKEN -> {
                    //showSearching.postValue(false)
                }

                LoginStatus.EXCEPTION_OCCURRED -> {
                    //showSearching.postValue(false)
                }

                LoginStatus.NULL -> {
                    //showSearching.postValue(false)
                    openLoginBottomSheet.postValue(Event(Any()))
                }
            }
        } catch (e: Exception) {
            openLoginBottomSheet.postValue(Event(Any()))
        }
    }*/

    /*fun onViewCartClicked1() {
        if (SharedPrefManager.getInstance().loggedInUserAccessToken.isEmpty()) {
            */
    /**
     * Initialize Login
     * If TrueCaller bottomsheet can't be shown(this is returned by TrueCaller SDK), then open OTP based login bottomsheet
     *//*
            initiateLogin.value = Event(Any())

        } else {
            if (SharedPrefManager.getInstance().isReOrder) {
                openOrderSummaryActivity.value =
                    Event(
                        Any()
                    )
            } else {
                openCartActivity.value = Event(Any())
            }
        }
    }*/

    fun bottomSheetClearClick(view: View) {
        /*with(getFilterCount() > 0) {
            if (this || isCategoryFilterOn) {*/
        try {
            categoryBottomSheetListTemp.value!!.forEach { it!!.selectedCategory = false }
            subCategoryBottomSheetListTemp.value!!.forEach { it!!.isSelected = false }
            brandBottomSheetListTemp.value!!.forEach { it!!.isSelected = 0 }
            orderTypePreviousPos = 0
            filteredPostion = -1
            filteredCategoryName = "All"
            fitteredSubCategoryName = ""
            brandsLocal.clear()
            allSubCategoriesId.clear()
            allBrandIs.clear()
            appliedFilterCount.postValue(0)
            isCategoryFilterOn = false
            showMessage.postValue(Event(MESSAGES.BOTTOM_SHEET_CLEAR_CLICK))
        }
        catch (_:Exception){}
            /*} else {
                view.context?.let {
                    Toast().showCustomToastMessage(
                        it,
                        it.resources.getString(R.string.filter_warning)
                    )
                }
            }
        }*/
    }

    fun bottomSheetApplyClick(view: View) {
        sendItemImpression.postValue(Event(Any()))
        with(getFilterCount() > 0) {
            if (this || isCategoryFilterOn) {
                explicitLoading.postValue(true)
                var filteredBrands = arrayListOf<String>()
                orderTypeActualSelectedPos = orderTypePreviousPos

                patientsSelectedListTemp.clear()
                patientTypeValue = ""
                brandBottomSheetListTemp.value?.forEach { brand ->
                    if (brand?.isSelected == 2) {
                        brand.brandName?.let { filteredBrands.add(it) }
                    }
                }
                getOtcProductsByCategory(
                    page = 0,
                    categoryID = filteredCategoryId?.toInt() ?: 0,
                    type = filteredLevel ?: "LEVEL2",
                    brands = filteredBrands,
                    collectionId = filteredCollectionId ?: 0,
                    isBrandOnly = false,
                    isFilterOn = false,
                )
                clickedOnPage = "filter_page"
                showMessage.postValue(Event(MESSAGES.BOTTOM_SHEET_APPLY_CLICK))
            } else {
                view.context?.let {
                    Toast().showCustomToastMessage(
                        it,
                        it.resources.getString(R.string.filter_warning)
                    )
                }
            }
        }
    }

    private fun getFilterCount(): Int {
        appliedFilterCount.value = 0
        var count = 0
        val category = categoryBottomSheetListTemp.value?.filter { it?.selectedCategory == true }
        val subCategory = subCategoryBottomSheetListTemp.value?.filter { it?.isSelected == true }
        val brands = brandBottomSheetListTemp.value?.filter { it?.isSelected == 2 }
        if (category?.isNotEmpty() == true) isCategoryFilterOn = true
        if (subCategory?.isNotEmpty() == true) count++
        if (brands?.isNotEmpty() == true) count++
        appliedFilterCount.postValue(count)
        return count
    }

    //managing filter list conditions
    fun filterListClick(
        childCategories: MutableList<ChildCategoryModel>,
        category: String?,
        alsoSuperCategoryRequired: Boolean = false
    ) {
        // setListData()
        categoryBottomSheetListTemp.value?.clear()
        subCategoryBottomSheetListTemp.value?.clear()
        brandBottomSheetListTemp.value?.clear()

        if (category == "All" || alsoSuperCategoryRequired) {
            categoryBottomSheetListTemp.value?.addAll(
                childCategories.subList(
                    1,
                    childCategories.size
                )
            )
        }
        val list = userDataUseCase.getSubCategoryTypeList(
            childCategories.subList(1, childCategories.size),
            category
        )
        subCategoryBottomSheetListTemp.value?.addAll(list)
        if (allSubCategoriesId.isNotEmpty() && !alsoSuperCategoryRequired) {
            syncExistingSubCategories(list.toMutableList())
        } else {
            subCategoryBottomSheetListTemp.postValue(list.toMutableList())
        }
        filterlistType.value = "brands"
        showMessage.postValue(Event(MESSAGES.FILTER_LIST_CLICK))
    }

    fun setRadioCategoryClicked(position: Int) {
        Log.e("category_clicked", ":::" + position)
        if (categoryTypePreviousPos != -1)
            categoryBottomSheetListTemp.value!!.get(categoryTypePreviousPos)!!.selectedCategory =
                false
        brandBottomSheetListTemp.value!!.map { it!!.isSelected = 0 } /** This is to clear selected brand list when category is changed */
        categoryBottomSheetListTemp.value!!.get(position)!!.selectedCategory = true
        categoryTypePreviousPos = position
        categoryBottomSheetListTemp.postValue(categoryBottomSheetListTemp.value!!)
        filteredLevel = categoryBottomSheetListTemp.value!![position]?.type
        filteredCategoryName = categoryBottomSheetListTemp.value!![position]?.name ?: ""
        filteredCategoryId = categoryBottomSheetListTemp.value!![position]?.id.toString()
        superCategoryID = categoryBottomSheetListTemp.value!![position]?.id ?: 1
        superCategoryType = categoryBottomSheetListTemp.value!![position]?.type ?: "LEVEL1"
        filteredPostion = position
        filteredCollectionId = categoryBottomSheetListTemp.value!![position]?.collectionId
        filterListClick(childCategoryList.value?.toMutableList()!!, filteredCategoryName, true)
        getOtcProductsByCategory(
            page = 0,
            categoryID = filteredCategoryId?.toInt() ?: 0,
            type = filteredLevel ?: "LEVEL2",
            collectionId = filteredCollectionId ?: 0,
            isBrandOnly = true,
            isFromRadioOptionClick = true
        )
    }

    fun setRadioSubCategoryClicked(position: Int) {
        Log.e("sub_category_clicked", ":::" + position)
        if (subCategoryTypePreviousPos != -1) {
            subCategoryBottomSheetListTemp.value!!.forEach { it!!.isSelected = false }
            brandBottomSheetListTemp.value!!.forEach { it!!.isSelected = 0 }
            allBrandIs.clear()
            allSubCategoriesId.clear()
        }

        subCategoryBottomSheetListTemp.value!!.get(position)!!.isSelected = true
        allSubCategoriesId.add(subCategoryBottomSheetListTemp.value!!.get(position)!!)
        subCategoryTypePreviousPos = position
        syncExistingSubCategories(subCategoryBottomSheetListTemp.value!!)
        filteredLevel = subCategoryBottomSheetListTemp.value!![position]?.level
        filteredCategoryId = subCategoryBottomSheetListTemp.value!![position]?.subCategoryId
        filteredPostion = subCategoryBottomSheetListTemp.value!![position]?.position!!
        filteredCategoryName = subCategoryBottomSheetListTemp.value!![position]?.categoryName!!
        fitteredSubCategoryName = subCategoryBottomSheetListTemp.value!![position]?.subCategoryName
        filteredCollectionId = subCategoryBottomSheetListTemp.value!![position]?.collectionId
        superCategoryID = subCategoryBottomSheetListTemp.value!![position]?.id?.toInt() ?: 1
        if (categoryBottomSheetListTemp.value?.isNullOrEmpty() == false) {
            superCategoryType = categoryBottomSheetListTemp.value?.first { it?.id == superCategoryID }?.type  ?: "LEVEL1"
        }
        brandBottomSheetListTemp.value?.let {
            brandsLocal = it
        }
        superCategoryID = filteredCategoryId?.toInt() ?: 0
        superCategoryType = filteredLevel ?: "LEVEL2"
        getOtcProductsByCategory(
            page = 0,
            categoryID = filteredCategoryId?.toInt() ?: 0,
            type = filteredLevel ?: "LEVEL2",
            collectionId = filteredCollectionId ?: 0,
            isBrandOnly = true,
        )
    }

    fun setCheckboxBrandClicked(position: Int) {
        Log.e("brand_clicked", ":::" + position)


        if (brandBottomSheetListTemp.value!!.get(position)!!.isSelected == 0) {
            allBrandIs.add(brandBottomSheetListTemp.value!![position]!!)
            brandBottomSheetListTemp.value!!.get(position)!!.isSelected = 2
        } else {
            allBrandIs.remove(brandBottomSheetListTemp.value!![position]!!)
            brandBottomSheetListTemp.value!!.get(position)!!.isSelected = 0
        }

        brandBottomSheetListTemp.postValue(brandBottomSheetListTemp.value!!)
        brandBottomSheetListTemp.value?.let {
            brandsLocal = it
        }
    }


    var personalCareList: List<PersonalCareCategoryModel> = mutableListOf()
    var productList = MutableLiveData<List<ProductInfoModel>>(emptyList())
    var emptyList = MutableLiveData<List<ProductInfoModel>>(emptyList())
    var preSyncProducts = emptyList<ProductInfoModel>()
    var topDeals =
        MutableLiveData<List<ProductInfoModel>>(emptyList())
    var cartData: MutableLiveData<CartModel> = MutableLiveData(
        CartModel(
            "View cart",
            4,
            500.34
        )
    )

    /*fun getPersonalCareData() {
        personalCareList = personalCareUseCase.getPersonalCareCategory()
        val set = HashSet<String>()
        set.add("OTC_BANNER")
        viewModelScope.launch {
            bannerList.postValue(
                homePageUseCase.getBannersForHomePage(
                    "app",
                    set,
                    Banner.OTC
                )?.responseData?.otc ?: emptyList()
            )
        }
    }*/

    fun getOtcProductsByCategory(
        page: Int,
        categoryID: Int,
        type: String,
        collectionId: Int,
        isBrandOnly: Boolean,
        isListPaginating: Boolean = false,
        brands: List<String> = emptyList(),
        isFilterOn: Boolean = false,
        isFromRadioOptionClick:Boolean=false,
        bannerClickedFilterName: String? = null
    ) {
        Log.d(
            "otcAppliedParams",
            "page $page categoryID $categoryID type $type collectionId $collectionId isBrandOnly $isBrandOnly brands $brands"
        )
        isEmptyData.postValue(false)
        if (!isListPaginating) listOfBrands.clear()
        var wareHouseId = 0
        Log.i("warehouseId", "" + SharedPrefManager.getInstance().selectedWarehouseID)
        if (!SharedPrefManager.getInstance().selectedWarehouseID.isNullOrEmpty()) {
            wareHouseId = SharedPrefManager.getInstance().selectedWarehouseID.toInt()
        }
        val fcmToken = SharedPrefManager.getInstance().fcm
        var sessionToken = ""
        viewModelScope.launch {
            sessionToken = withContext(coroutineContext) {
                if (page > 0) _isLoading.postValue(true)
                loginUseCase.getSessionToken(mxInternalErrorOccurred,fcmToken)
            }
            withContext(coroutineContext) {
                val request = OtcProductsForCategoriesRequest(
                    collectionId = collectionId,
                    id = categoryID,
                    result = AppConstants.OTC_CATEGORY_PAGE_COUNT,
                    sessionToken = sessionToken,
                    type = type,
                    page = page,
                    brands = brands,
                    /*warehouseId = SharedPrefManager.getInstance().selectedWarehouseID.apply {
                        this ?: "0"
                    }.toInt()*/
                    warehouseId = wareHouseId,
                    isBrandOnly = isBrandOnly,
                    variantId = if (SharedPrefManager.getInstance().algoSpecificVariantId < 0) null else SharedPrefManager.getInstance().algoSpecificVariantId,
                    isApp = true,
                )
                val response = orderFlowUseCase.fetchOtcProductsForCategories(mxInternalErrorOccurred,request)
                if (!isListPaginating) {
                    response?.responseData?.brandNameList?.mapIndexed { index, brand ->
                        listOfBrands.add(
                            GetAllBrandsTypeResponse.BrandType(
                                id = index.toString(),
                                brandName = brand,
                                isSelected = if (brand.equals(bannerClickedFilterName, true)) 2 else 0
                            )
                        )
                    }
                }
                if (!isBrandOnly) {
                    syncPreviousSelectedBrands()
                    if (page == 0) {
                        preSyncProducts = response?.responseData?.toSDKObject() ?: emptyList()
                        val topDeals = response?.responseData?.toTopDealObject() ?: emptyList()
                        syncExistingTopDealsProducts(topDeals)
                    } else {
                        preSyncProducts = preSyncProducts.toMutableList()
                            .apply { addAll(response?.responseData?.toSDKObject() ?: emptyList()) }

                    }

                    isNextPageAvailable = (response?.responseData?.totalCount ?: 0) != preSyncProducts.size
                    _isLoading.postValue(false)
                    syncExistingCartProducts(preSyncProducts)
                    isEmptyData.postValue(preSyncProducts.isEmpty())
                } else {
                    syncPreviousSelectedBrands()
                }
                if (!isFilterOn && !isFromRadioOptionClick){
                    val model = MxOtcProductListPageViewed(
                        superCategoryName = HomeOtcCategoryAdapter.superCategoryName, categoryName = childCategoryType,
                        subCategoryName = fitteredSubCategoryName, clickedOnPage = clickedOnPage,
                            filterApplied = (appliedFilterCount.value ?: 0) > 0, brandsSelected = brands.ifEmpty { null },
                        bannerViewed = isOTCBannerClicked, isEmpty = response?.responseData?.productElastic?.isEmpty() ?: true
                    )
                    isOTCBannerClicked = false
                    sdkEventUseCase.sendOtcProductListPageViewed(model)
                }
                explicitLoading.postValue(false)
            }
        }
    }

    private fun syncPreviousSelectedBrands() {
        val list =
            if (allBrandIs.size > 0) allBrandIs else brandsLocal.filter { it?.isSelected == 2 }
        list.map { local ->
            listOfBrands.mapIndexed { index, model ->
                if (local?.id == model.id && local?.brandName == model.brandName) {
                    listOfBrands.apply { this[index].isSelected = local?.isSelected ?: 0 }
                }
            }
        }
        brandBottomSheetListTemp.postValue(listOfBrands.toMutableList())
    }

    /**
     * This function will fetch the local database cart list and compare with the remote list
     */
    fun syncExistingCartProducts(preSyncProducts: List<ProductInfoModel>) {
        viewModelScope.launch(Dispatchers.IO) {
            val list = generateProductList(preSyncProducts)
            productList.postValue(list)
        }
    }

    fun syncExistingTopDealsProducts(preSyncProducts: List<ProductInfoModel>) {
        viewModelScope.launch(Dispatchers.IO) {
            val list = generateProductList(preSyncProducts)
            topDeals.postValue(list)
        }
    }

    private fun syncExistingSubCategories(subCategoryTypes: MutableList<GetAllSubCategoryTypeResponse.SubCategoryType?>) {
        val list =
            if (allSubCategoriesId.size > 0) allSubCategoriesId else subCategoryTypes.filter { it?.isSelected == true }
        var updatedList = emptyList<GetAllSubCategoryTypeResponse.SubCategoryType?>()
        list.map { local ->
            subCategoryTypes.mapIndexed { index, model ->
                if (local?.id == model?.id && local?.subCategoryName == model?.subCategoryName) {
                    updatedList = subCategoryTypes.apply {
                        this[index]?.isSelected = local?.isSelected ?: false
                    }
                }
            }
        }
        subCategoryBottomSheetListTemp.postValue(updatedList.toMutableList())
    }

    override fun onResume(owner: LifecycleOwner) {
        super.onResume(owner)
        setCartCount()
    }

    fun updateIds(id: Int, superCategoryType: String, collectionId: Int) {
        filteredCategoryId = id.toString()
        filteredLevel = superCategoryType
        filteredCollectionId = collectionId
    }

    /**
     * When user clicks on banner image then this method will be invoked and mark the list item as selected if any
     */
    fun updateSelectedBrands(brand: ArrayList<String>) {
        brand.map { local ->
            brandBottomSheetListTemp.value?.map { model ->
                if (local.equals(model?.brandName, true)) {
                    if (model != null) {
                        allBrandIs.add(model.copy(isSelected = 2))
                    }
                }
            }
        }
    }

    private suspend fun generateProductList(preSyncProducts: List<ProductInfoModel>): List<ProductInfoModel> {
        val dbList = localDbUseCase.getAddedMedicines()
        with(dbList) {
            preSyncProducts.apply {
                this.forEachIndexed { _, remote ->
                    run breaking@{
                        dbList.forEach { localList ->
                            if (localList.medicineId == remote.product.productCode) {
                                remote.product.qty = localList.addedQty
                                return@breaking
                            } else if (remote.product.productCode != localList.medicineId) {
                                remote.product.qty = 0
                            }
                        }
                    }
                }
            }

            /**
             * If local db doesn't holds any list then it means clear the all product quantity to zero
             */
            if (this.isEmpty()) {
                preSyncProducts.apply {
                    this.map { remote -> remote.product.qty = 0 }
                }
            }
        }
        return preSyncProducts
    }

    fun getMedicineCount(productCode: String): Int = runBlocking {
        return@runBlocking async {
            localDbUseCase.getAddedQtyOfAddedMedicine(productCode)
        }.await()
    }

    fun sendHomePageBannerClickedEvent(mxBannerClicked: MxBannerClicked) {
        sdkEventUseCase.sendBannerClicked(mxBannerClicked)
    }

    fun sendFilterClickedEvent(mxFilterClicked: MXFilterClicked) {
        sdkEventUseCase.sendFilterClicked(mxFilterClicked)
    }




    //(childCategoryList.value?.size?.minus(1) ?: 0)
    fun sendCategoryImpression(position: Int) {
        if (childCategoryList.value?.size == 0) return
        for (i in 0..lastScrollPosition1) {
            val mxCategoryImpression = MxCategoryImpression().also {
                it.clickedOnPage = "product_list_page"
                it.superCategoryName = superCategoryName
                childCategoryList.value?.get(i)?.let { item ->
                    it.categoryName = item.name ?: ""
                }
                it.categoryIndex = position
                childCategoryList.value?.get(i)?.let { item ->
                    it.subTitleText = item.subsTitle
                }
            }
            sdkEventUseCase.sendCategoryImpression(mxCategoryImpression)
        }
    }

    fun sendProductItemImpressionEventToMixPanelForTopSix(position: Int) {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                var index = position//.plus(1)
                if (index < 0) return@launch
                if (index > 6) {
                    index = 6
                }
                var finalPosition: Int = index
                if (finalPosition > 0) {
                    val list: List<ProductInfoModel> = productList.value!!
                    if (list != null && list.isNotEmpty()) {
                        for (i in 0 until finalPosition) {
                            if (finalPosition <= list.size) {
                                sendItemImpressionEvent(
                                    list[i],
                                    clickedOnPage,
                                    "main",
                                    i + 1,
                                    "",
                                    i + 1,
                                    0,
                                    /*SharedPrefManager.getInstance().deliveryOnAmount.toDouble()*/0.0
                                )
                            }
                        }
                    }
                }

            } catch (ex: Exception) {
                ex.printStackTrace()
            }
        }
    }


    fun sendProductItemImpressionEventToMixPanelForLaterTen(position: Int) {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                var index = position + 6
                if (index < 6) return@launch
                if (index > productList.value!!.size) {
                    index = productList.value!!.size
                }
                val finalPosition = index
                if (finalPosition > 0) {
                    val list: List<ProductInfoModel> = productList.value!!
                    if (list != null && list.isNotEmpty()) {
                        for (i in 6 until finalPosition) {
                            sendItemImpressionEvent(
                                list[i],
                                clickedOnPage,
                                "main",
                                i + 1,
                                "",
                                i + 1,
                                0,
                                /*SharedPrefManager.getInstance().deliveryOnAmount.toDouble()*/0.0
                            )
                        }
                    }
                }

            } catch (ex: Exception) {
                ex.printStackTrace()
            }
        }
    }

    fun eventCallPharmacistClickedEvent() {
        sdkEventUseCase.sendCallPharmacistClickedEvent()
    }
}
