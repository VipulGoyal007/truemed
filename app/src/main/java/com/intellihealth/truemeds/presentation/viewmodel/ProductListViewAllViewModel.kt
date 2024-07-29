package com.intellihealth.truemeds.presentation.viewmodel

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.intellihealth.salt.models.CartModel
import com.intellihealth.truemeds.data.model.home.CustomerMedicinesResponseModel
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.model.mixpanel.MxProductListPageViewed
import com.intellihealth.truemeds.data.model.productlistanddetails.CrossSellingRecommendedProductResponse
import com.intellihealth.truemeds.data.model.productlistanddetails.OrgQtyUpdate
import com.intellihealth.truemeds.data.repository.datasource.local.entity.CartMedicine
import com.intellihealth.truemeds.data.utils.HomeFragmentData
import com.intellihealth.truemeds.data.utils.MESSAGES
import com.intellihealth.truemeds.domain.usecase.HomePageUseCase
import com.intellihealth.truemeds.domain.usecase.LoginUseCase
import com.intellihealth.truemeds.domain.usecase.ProductListAndDetailsUseCase
import com.intellihealth.truemeds.presentation.model.ProductInfoModel
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.ApiParameterConstants
import com.intellihealth.truemeds.presentation.utils.AppConstants
import com.intellihealth.truemeds.presentation.utils.CommonFunc
import com.intellihealth.truemeds.presentation.utils.DateFormats
import com.intellihealth.truemeds.presentation.viewmodel.events.Event
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.Date
import javax.inject.Inject


@HiltViewModel
class ProductListViewAllViewModel @Inject constructor(
    private val loginUseCase: LoginUseCase,
    private val productListAndDetailsUseCase: ProductListAndDetailsUseCase,
    private val homePageUseCase: HomePageUseCase
    ) : BaseViewModelWithLogin(loginUseCase),
    DefaultLifecycleObserver {
    var adapterCartModel: ProductInfoModel? = null
    var sessionToken = ""
    var showProductListView = MutableLiveData<Boolean>(false)
    val isEmptyData = MutableLiveData(false)
    var showProgressBar = MutableLiveData<Boolean>(false)
    var showShimmer = MutableLiveData<Boolean>(true)
    var pageNumber = 1
    var pageIndexYourMedicines = 0
    val showShimmerLiveData: LiveData<Boolean> get() = showShimmer
    var productListResponse: CrossSellingRecommendedProductResponse? = null
    var hasMoreData = true
    val productListObserved = MutableLiveData(mutableListOf<ProductInfoModel>())

    var lastScrollPosition = 0
    var sectionHeading = ""
    var productListData: List<ProductInfoModel> = emptyList()
    var clickedOnPage = "homepage"
    var section = "tray"
    var cartTotal: Double = 0.0
    var cartCount = MutableLiveData<Int>(0)
    val orgCount = MutableLiveData<OrgQtyUpdate>()
    val productCode = MutableLiveData<String>("")
    var cartData: MutableLiveData<CartModel> = MutableLiveData(
        CartModel(
            "View cart",
            4,
            500.34
        )
    )
    var isLoadingMore = false
    var stopPagging = false
    var mxInternalErrorOccurred=MxInternalErrorOccurred()
    /*private val openOrderSummaryActivity = MutableLiveData<Event<Any>>()
    val eventOpenOrderSummaryActivity: LiveData<Event<Any>> get() = openOrderSummaryActivity

    private val openCartActivity = MutableLiveData<Event<Any>>()
    val eventOpenCartActivity: LiveData<Event<Any>> get() = openCartActivity

    private val initiateLogin = MutableLiveData<Event<Any>>()
    val eventInitiateLogin: LiveData<Event<Any>> get() = initiateLogin*/

    private val callPharmacist = MutableLiveData<Event<Any>>()
    val eventCallPharmacist: LiveData<Event<Any>> get() = callPharmacist


    private val openLoginBottomSheet = MutableLiveData<Event<Any>>()
    val eventLoginOpenBottomSheet: LiveData<Event<Any>> get() = openLoginBottomSheet
    var yourMedicinePatientId: String? = null
    var yourMedicineSelectedPos: Int = 0
    var responsePatientMedicinesList: CustomerMedicinesResponseModel? = null
    var yourMedicinePatientList: List<CustomerMedicinesResponseModel.ResponseData.PatientDetail> =
        emptyList()
   // var yourMedicinePatientList: List<CustomerMedicinesResponseModel.ResponseData.PatientDetail> = emptyList()

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
            *//**
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
    }
*/
    fun loadMoreResults(hidePrimaryLoader: Boolean, listType: String) {
        val existingMedicineList = productListObserved.value
        Log.i("::loadMoreResults","LoadMoreCalled")
        Log.i("::loadMoreResults",""+productListObserved.value)
        Log.i("::loadMoreResults",""+pageNumber)
//        existingMedicineList?.add(null)
        productListObserved.postValue(existingMedicineList)
//        noResultSRP.postValue(existingMedicineList?.size == 0)
//        getSearchResultList(searchQuery.value!!, elasticSearchType, pageNumber + 1, isMultiSearch)
        callTrendingListApi(listType, `pageNumber`++)
    }

    fun loadMoreYourMedicinesResults() {
       // val existingMedicineList = productListObserved.value
        Log.i("::loadMoreResults","LoadMoreCalled")
        Log.i("::loadMoreResults",""+productListObserved.value)
        Log.i("::loadMoreResults",""+pageNumber)
        //  productListObserved.postValue(existingMedicineList)

        callPatientListMedicineListApi( pageIndexYourMedicines)
    }

    fun callTrendingListApi(subType: String, page: Int) {
        viewModelScope.launch(Dispatchers.IO) {
            if (page == 0)
                showShimmer.postValue(true)

            /*val simpleDate = SimpleDateFormat(DateFormats.YYYY_MM_DD_HH_MM_SS)
            val stringForBase64 =
                CommonFunc.getSourceVersionName() + "-" + simpleDate.format(Date())
            val fcmToken = SharedPrefManager.getInstance().fcm
            if (fcmToken.equals("")) {
                val defaultToken = loginUseCase.fetchDefaultToken(mxInternalErrorOccurred,stringForBase64)
                if (!defaultToken?.responseData?.token.isNullOrEmpty())
                    sessionToken = loginUseCase.getSessionToken(mxInternalErrorOccurred,defaultToken?.responseData?.token!!)
            } else {
                sessionToken = loginUseCase.getSessionToken(mxInternalErrorOccurred,fcmToken)
            }*/
            sessionToken = loginUseCase.getSessionToken(mxInternalErrorOccurred,SharedPrefManager.getInstance().fcm)


            val warehouseId = SharedPrefManager.getInstance().selectedWarehouseID

            val type = "App"
            val pageSize = 10
            val variantId: Long = SharedPrefManager.getInstance().algoSpecificVariantId

            productListData = emptyList()
            productListResponse =
                productListAndDetailsUseCase.getCrossSellingRecommendedProducts(
                    mxInternalErrorOccurred,warehouseId,
                    sessionToken, page, type,
                    setOf(subType), pageSize, variantId
                )

            if (subType.equals(ApiParameterConstants.CONST_LIST_TRENDING)) {

                Log.e("TrendingList::111", productListResponse.toString())
                productListResponse?.responseData?.TRENDING_IN_CITY?.let { data ->
                    productListData = data
                    if (data.size < 10)
                        hasMoreData = false
                }


            } else if (subType.equals(ApiParameterConstants.CONST_LIST_LIMITED_TIME_OFFER)) {

                Log.e("LimitedTimeList::111", productListResponse.toString())
                productListResponse?.responseData?.LIMITED_OFFER?.let { data ->
                    productListData = data
                    if (data.size < 10)
                        hasMoreData = false
                }


            } else if (subType.equals(ApiParameterConstants.CONST_LIST_NEW_ARRIVALS)) {

                Log.e("NewArrivalList::111", productListResponse.toString())
                productListResponse?.responseData?.NEW_ARRIVAL?.let { data ->
                    productListData = data
                    if (data.size < 10)
                        hasMoreData = false
                }


            }
            val header = subType.replace(Regex(" "), "_")
            Log.d("TAG", "callTrendingListApi: header $header")
            if (page == 0)
                showShimmer.postValue(false)
    
            var skuList = ArrayList<String?>()
            if(page == 0){
                for (item in productListData) {
                    skuList.add(item.product.skuName)
                }
                Log.d("TAG", "callTrendingListApi: skuList = $skuList")
                sdkEventUseCase.sendProductListPageViewedEvent(MxProductListPageViewed(clickedOnPage, skuList, section, header))
            }
            
            when {
                !productListData.isNullOrEmpty() -> {
                    showProgressBar.postValue(false)
                    showProductListView.postValue(true)
                    isEmptyData.postValue(false)
                    //productListObserved.postValue(productListData)
                    syncExistingCartProducts(productListData)

                }
                else -> {
                    if (productListObserved.value.isNullOrEmpty()) {
                        showProductListView.postValue(false)
                        isEmptyData.postValue(true)
                        productListObserved.postValue(mutableListOf<ProductInfoModel>())
                    }
                    hasMoreData = false
                    stopPagging = true
                    showProgressBar.postValue(false)
                }
            }
            
        }
    }


     fun callPatientListMedicineListApi(pageIndex: Int = 0) {
        viewModelScope.launch(Dispatchers.IO) {
            if (pageIndex == 0) {
                showProductListView.postValue(false)
                showShimmer.postValue(true)
                productListObserved.postValue(mutableListOf<ProductInfoModel>())
                productListData = emptyList()
            }

            val pageSize = 10


            responsePatientMedicinesList = homePageUseCase.fetchMedicineDetailsOfPatient(
                mxInternalErrorOccurred, SharedPrefManager.getInstance().loggedInUserId,
                pageIndex,
                pageSize,
                yourMedicinePatientId
            )
          //  yourMedicinePatientList = responsePatientMedicinesList?.responseData?.patientDetails?: emptyList()

            if (responsePatientMedicinesList != null && !responsePatientMedicinesList?.responseData?.productList.isNullOrEmpty()) {

                productListData = responsePatientMedicinesList?.responseData?.productList!!
                if (responsePatientMedicinesList?.responseData?.productList!!.size < pageSize)
                    hasMoreData = false
                else
                    hasMoreData = true

            }

            if (pageIndex == 0)
                showShimmer.postValue(false)

            val header =ApiParameterConstants.CONST_LIST_YOUR_MEDICINE
            var skuList = ArrayList<String?>()
            if(pageIndex == 0){
                for (item in productListData) {
                    skuList.add(item.product.skuName)
                }
                Log.d("TAG", "callTrendingListApi: skuList = $skuList")
                sdkEventUseCase.sendProductListPageViewedEvent(MxProductListPageViewed(clickedOnPage, skuList, section, header))
            }


            when {
                !productListData.isNullOrEmpty() -> {
                    showProgressBar.postValue(false)
                    showProductListView.postValue(true)
                    isEmptyData.postValue(false)
                    //productListObserved.postValue(productListData)
                    syncExistingCartProducts(productListData)

                }
                else -> {
                    if (productListObserved.value.isNullOrEmpty()) {
                        showProductListView.postValue(false)
                        isEmptyData.postValue(true)
                        productListObserved.postValue(mutableListOf<ProductInfoModel>())
                    }
                    hasMoreData = false
                    stopPagging = true
                    showProgressBar.postValue(false)
                }
            }
        }
    }
    override fun onResume(owner: LifecycleOwner) {
        super.onResume(owner)
        viewModelScope.launch(Dispatchers.IO) {
            cartCount.postValue(localDbUseCase.getCartCount())
            
        }
    }

    fun syncExistingCartProducts(preSyncProducts: List<ProductInfoModel> = emptyList()) {
        viewModelScope.launch(Dispatchers.IO) {
            val resultList = productListObserved.value ?: mutableListOf()
            if (preSyncProducts.isNotEmpty()) { /** Here paging data will be appended **/
                preSyncProducts.forEach {
                    it.product.qty = getMedicineCount(it.product.productCode ?: "")
                    resultList.add(it)
                }
            } else { /** Here existing data will be synced with Local DB **/
                resultList.forEach {
                    it.product.qty = getMedicineCount(it.product.productCode ?: "")
                }
            }
            productListObserved.postValue(resultList)
            isLoadingMore = false
        }
    }

    suspend fun getMedicineCount(productCode: String): Int =
        localDbUseCase.getAddedQtyOfAddedMedicine(productCode)

    fun updateCart(orgCartItem: CartMedicine, isFirstEntry: Boolean, quantity: Int) {
        viewModelScope.launch(Dispatchers.IO) {
            if (isFirstEntry) {
                orderFlowUseCase.addMedicineToCart(orgCartItem, null, false, null)
            } else {
                orderFlowUseCase.updateCartMedicineCount(orgCartItem.medicineId, quantity)
            }
        }
        setCartCount()
    }
    /*fun setCartCount() = viewModelScope.launch(Dispatchers.IO) {
        cartTotal = orderFlowUseCase.setCartTotalSellingPrice()
        cartCount.postValue(localDbUseCase.getCartCount())
    }*/

    fun deleteProductFromCart(it: ProductInfoModel, isSubs: Boolean) =
        viewModelScope.launch(Dispatchers.IO) {
            orderFlowUseCase.deleteMedicineFromCart(it.product.productCode, isSubs)
        }



}