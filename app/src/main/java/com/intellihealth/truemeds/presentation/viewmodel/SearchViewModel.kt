package com.intellihealth.truemeds.presentation.viewmodel

import android.content.Context
import android.os.Handler
import android.os.Looper
import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.google.gson.Gson
import com.intellihealth.salt.constants.FullWidthProductCardConstants
import com.intellihealth.truemeds.data.model.KeyValuePair
import com.intellihealth.truemeds.data.model.SearchResult
import com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse
import com.intellihealth.truemeds.data.model.coupon.CouponResponse
import com.intellihealth.truemeds.data.model.coupon.CouponSaveRemoveResponse
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.model.mixpanel.MxItemSearched
import com.intellihealth.truemeds.data.model.mixpanel.MxSearchViewed
import com.intellihealth.truemeds.data.model.mixpanel.MxSrpAddSubBottomSheetViewed
import com.intellihealth.truemeds.data.model.mixpanel.MxSrpViewed
import com.intellihealth.truemeds.data.model.mixpanel.MxStickyStripViewed
import com.intellihealth.truemeds.data.model.mixpanel.MxUrgencyTimerStarted
import com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse
import com.intellihealth.truemeds.data.model.orderflow.CouponCodeDataModel
import com.intellihealth.truemeds.data.model.orderflow.MedicineDto
import com.intellihealth.truemeds.data.model.orderflow.MedicineListDetailsSent
import com.intellihealth.truemeds.data.model.orderflow.ReplaceAllBottomSheetModel
import com.intellihealth.truemeds.data.model.search.SearchBottomSheetModel
import com.intellihealth.truemeds.data.model.search.SearchUIStateConstants
import com.intellihealth.truemeds.data.model.search.SuggestionResponseData
import com.intellihealth.truemeds.data.model.search.SuggestionWithType
import com.intellihealth.truemeds.data.model.search.TrendingSearchResponse
import com.intellihealth.truemeds.data.repository.datasource.local.entity.CartItemSellingPrice
import com.intellihealth.truemeds.data.repository.datasource.local.entity.CartMedicine
import com.intellihealth.truemeds.data.repository.datasource.local.entity.RecentMedicine
import com.intellihealth.truemeds.data.utils.MESSAGES
import com.intellihealth.truemeds.data.utils.MessageConstant
import com.intellihealth.truemeds.domain.enums.ElasticSearchType
import com.intellihealth.truemeds.domain.enums.UserCategoryEnum
import com.intellihealth.truemeds.domain.usecase.LoginUseCase
import com.intellihealth.truemeds.domain.usecase.SearchUseCase
import com.intellihealth.truemeds.domain.usecase.TmWalletUseCase
import com.intellihealth.truemeds.domain.usecase.UserDataUseCase
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxItemAdded
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxSearchSuggestionImpression
import com.intellihealth.truemeds.presentation.model.FtcCouponResponseList
import com.intellihealth.truemeds.presentation.model.ProductInfoModel
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.utils.DateUtils
import com.intellihealth.truemeds.presentation.viewmodel.events.Event
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Job
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import org.json.JSONObject
import javax.inject.Inject
import kotlin.math.min

@HiltViewModel
class SearchViewModel @Inject constructor(
    @ApplicationContext private val context: Context,
    private val searchUseCase: SearchUseCase,
    private val loginUseCase: LoginUseCase,
    private val userDataUseCase: UserDataUseCase,
    private val tmWalletUseCase: TmWalletUseCase,

    ) : BaseViewModelWithLogin(loginUseCase), DefaultLifecycleObserver {

    companion object {
        const val DEBOUNCER_TIME: Long = 250
        const val DELAY: Long = 500
        var timeTakenInMs: Int = 0
    }

    //var isTruecaller = false

    //var lastScrollPosition = 0
    var ftcCounterTime: MutableLiveData<String> = MutableLiveData("")
    var ftcCouponData: MutableLiveData<CouponCodeResponse.Coupon?> = MutableLiveData(null)
    private val openCouponPopup =
        MutableLiveData<Event<Pair<CouponCodeResponse.Coupon, CouponSaveRemoveResponse?>>>()
    private val openCouponPopupOffline =
        MutableLiveData<Event<Pair<CouponCodeResponse.Coupon?, CouponResponse>>>()
    val eventOpenCouponPopupOffline: LiveData<Event<Pair<CouponCodeResponse.Coupon?, CouponResponse>>> =
        openCouponPopupOffline
    val eventOpenCouponPopup: LiveData<Event<Pair<CouponCodeResponse.Coupon, CouponSaveRemoveResponse?>>> get() = openCouponPopup
    //=======Events=======
    /*private val updateSearchBoxHint = MutableLiveData<Event<Any>>()
    val eventUpdateSearchBoxHint: LiveData<Event<Any>> get() = updateSearchBoxHint*/

    val isDelete: MutableLiveData<Event<Boolean>> = MutableLiveData()
    val isDeleteCompleted: MutableLiveData<Event<Boolean>> = MutableLiveData()

    var selectedMedicineProductCode = ""
    var pageSection = ""
    var isSubs = false
    var lastScreenName = ""
    var lastVisibleItemPosition = 0
    var lastVisibleItemPositionOfPreviouslyViewed = 0
    var lastVisibleItemPositionOfRecentlyViewed = 0

    private val callPharmacist = MutableLiveData<Event<Any>>()
    val eventCallPharmacist: LiveData<Event<Any>> get() = callPharmacist

    /*private val closeBottomSheet = MutableLiveData<Event<Any>>()
    val eventCloseBottomSheet: LiveData<Event<Any>> get() = closeBottomSheet*/

    private val openLoginBottomSheet = MutableLiveData<Event<Any>>()
    val eventLoginOpenBottomSheet: LiveData<Event<Any>> get() = openLoginBottomSheet
    private val checkReferralClaim = MutableLiveData<Event<Any>>()
    val eventCheckReferralClaim: LiveData<Event<Any>> get() = checkReferralClaim

    //=======Live data======
    //This will hold response of RecentMedicine
    var isSubsClicked = false
    var isLoadingMore = false
    var stopPagging = false

    //    var loaderValue = MutableLiveData(false)
    /*val _isLoading = MutableLiveData(false)
    val isLoading: LiveData<Boolean> get() = _isLoading*/

    //=======Live data======
    //This will hold response of RecentMedicine
    var onClickRecentItem = MutableLiveData<RecentMedicine>()

    //This will hold response of RecentMedicine
    var onClickPreviousItem = MutableLiveData<RecentMedicine>()

    //This will hold response of RecentMedicine
    var onClickTrendingItem = MutableLiveData<TrendingSearchResponse.TrendingSearch>()

    //This will hold response of SuggestionWithType
    var onClickSuggestionItem = MutableLiveData<SuggestionWithType>()

    //This will hold search suggestion UI state
    var searchUIState = MutableLiveData(SearchUIStateConstants.DEFAULT_VIEW)

    //This will hold search response return from api, it can be either search result or did you mean result
    var searchResultList = MutableLiveData(mutableListOf<ProductInfoModel>())

    //This will hold ftc coupon data response return from api, it can be either search result or did you mean result
    var ftcCouponList = MutableLiveData<FtcCouponResponseList>()

    //This will hold search response return from api, it can be either search result or did you mean result
    var searchSuggestionList = MutableLiveData(emptyList<SuggestionWithType>())

    //This will hold recently searched data store in offline DB
    var recentlySearchedList = MutableLiveData(emptyList<RecentMedicine>())

    //This will hold previously viewed product data store in offline DB
    var previouslyViewedList = MutableLiveData(emptyList<RecentMedicine>())

    //This will hold trending search data received from api
    var trendingSearchList = MutableLiveData(emptyList<TrendingSearchResponse.TrendingSearch>())

    var searchQuery = MutableLiveData("")

    //var cartCount = MutableLiveData(0)
    var lastKnownResponse = JSONObject()

    val notificationDetailData = MutableLiveData<CouponCodeDataModel?>()

    //TODO recheck whether these variable are required or not, functionality based on these can be replaced with List.size
    var isSearchMedicineVisible = MutableLiveData(false)
    var hideAPIData = MutableLiveData(true)

    //var isLocalData = MutableLiveData(true) = recentlySearchedList.size > 0
    var noResultFound = MutableLiveData(false)
    var noResultSRP = MutableLiveData(false)
    var isSuggestionLoaded = MutableLiveData(false)
    var showSearchedMedicine = MutableLiveData(false)

    var showSearching = MutableLiveData(false)
    var showDidYouMean = MutableLiveData(false)
    var showProgressBar = MutableLiveData(false)

    //=======other variables=======
    var elasticSearchType = "" //updated on activity EditText beforeTextChanged event
    var mxElasticSearchType = ""
    var isMultiSearch = false
    var pageNumber = 1
    var beforeTextChange = ""//updated on activity EditText beforeTextChanged event
    private var showProducts = false
    var mxTermSearchedTriggered = false
    var mxTermSearchTriggeredFor = ""
    var mxTermSearched = ""
    private var mxClickedOnPage = ""
    private var mxPageSection = ""
    var ftcCouponResponse: List<CouponCodeResponse.Coupon>? = null

    private var deepLinkSearchQuery = ""

    var cartTotal: Double = 0.0
    private val showMessage = MutableLiveData<Event<MessageConstant>>()
    var replaceAllModel = ReplaceAllBottomSheetModel(
        0.0, 0.0, 0.0,
        0.0, listOf(), "", listOf()
    )
    val eventMessage: LiveData<Event<MessageConstant>> get() = showMessage
    /*var cartModel: MutableLiveData<CartModel> = MutableLiveData(
        CartModel(
            "View cart",
            _cartItemCount.value,
            cartTotal
        )
    )*/


    val launchPDPage = MutableLiveData<Event<com.intellihealth.salt.models.ProductInfoModel>>()
    val eventLaunchPDPage: LiveData<Event<com.intellihealth.salt.models.ProductInfoModel>> get() = launchPDPage


    val launchSearchBS = MutableLiveData<Event<SearchBottomSheetModel>>()
    val eventLaunchSearchBS: LiveData<Event<SearchBottomSheetModel>> get() = launchSearchBS
    fun launchSearchBS(searchBottomSheetModel: SearchBottomSheetModel) =
        launchSearchBS.postValue(Event(searchBottomSheetModel))


    val launchSearchSubsBS = MutableLiveData<Event<SearchBottomSheetModel>>()
    val eventLaunchSearchSubsBS: LiveData<Event<SearchBottomSheetModel>> get() = launchSearchSubsBS
    fun launchSearchSubsBS(searchBottomSheetModel: SearchBottomSheetModel) =
        launchSearchSubsBS.postValue(Event(searchBottomSheetModel))

    private var lastTextEdit = longArrayOf(0)
    var totalSearchCount = MutableLiveData(0)
    var handler = Handler(Looper.getMainLooper())
    var inputFinishChecker = Runnable {
        if (System.currentTimeMillis() > lastTextEdit[0] + DELAY - DEBOUNCER_TIME) {
//            isSuggestionLoaded.value = true
//            updateUIState()
            afterTextChanged(searchQuery.value!!.trim { it <= ' ' })
            /*getReactiveSuggestions(
                searchQuery.value!!.trim { it <= ' ' },
            )*/
        }
    }


    /**
     * Search edit text variables
     * **/

    var recentMedicines: MutableLiveData<MutableList<SearchResult>> =
        MutableLiveData<MutableList<SearchResult>>(
            mutableListOf()
        )
    /*var recentSearchHistoryMedicines = MutableLiveData(emptyList<SearchResult>())
    var previousSearchMedicines = MutableLiveData(emptyList<SearchResult>())*/


    var selectedMedicineDetails: ProductInfoModel? = null
    var selectedMedicineIndex: Int = -1

    //event data
    var clickedOnPage = ""
    var billDetailsData: BillDetailResponse.ResponseData? = null
    var medicineListDataReceived: ArrayList<MedicineListDetailsSent> = arrayListOf()
    var qcEvent = null
    var rtEvent = null
    var suggestion_term_clicked_position = -1
    var suggestion_term_clicked: String? = null
    var term_searched: String? = null
    var couponAppliedRemovedPageName: String = "search_result"


    var mxItemSearched = MxItemSearched()

    /*mxItemSearched.termSearched = viewModel.term_searched?.lowercase()?.trim()
    mxItemSearched.qc = viewModel.selectedItemQC
    mxItemSearched.rt = viewModel.selectedItemRT
    mxItemSearched.exitAction = "view_cart"
    mxItemSearched.whId = SharedPrefManager.getInstance().selectedWarehouseID
    mxItemSearched.timeTaken = 0
    mxItemSearched.termSearchedCharCount = viewModel.term_searched?.length
    mxItemSearched.didYouMeanTriggered = false
    mxItemSearched.isPreviouslyViewed = false
    mxItemSearched.resultFoundCount = 0
    */

    var selectedItemQC: String? = ""
    var selectedItemRT: String? = ""
    var mxSuggestionTermClicked: String = ""
    var mxClickedSuggestionsPosition = 0
    var clickedSuggestionType = "" //SEARCH_TYPE
    var mxInternalErrorOccurred = MxInternalErrorOccurred()
    var srpViewTriggered = false

    open fun getEventSendSrpEvent(): MutableLiveData<Event<Any>>? {
        return eventSendSrpEvent
    }

    private val eventSendSrpEvent = MutableLiveData<Event<Any>>()
    var isSrpView = false
    var visibleItemCount: Int = 0
    fun setMedicineListDataReceived() {
        medicineListDataReceived.clear()
        viewModelScope.launch(IO) {
            var productIdsList = localDbUseCase.getAddedMedProductCode()
            var productNamesList = localDbUseCase.getAddedMedNames()
            for (i in 0..productIdsList.size!! - 1) {
                medicineListDataReceived.add(
                    MedicineListDetailsSent(
                        productIdsList.getOrNull(i) ?: "",
                        productNamesList.getOrNull(i) ?: ""
                    )
                )

            }
        }
    }


    /**
     * 1) Send SDK Events
     * 2) Update cart item count, recently searched and previously viewed section
     * 3) Reset search text and search suggestion
     * 4) Start search box animation
     */
    fun onClearSearchTextClick(exitEventName: String = "cross") {
        // 1) Send SDK Events
        if (mxTermSearchTriggeredFor.lowercase() != mxTermSearched.lowercase()) {
            mxTermSearchedTriggered = false
        }
        sendItemSearchedEvent(exitEventName)//exitEventName to be updated
        sendSuggestionItemImpression(exitEventName)
        logEvents("Search_Remove")

        // 2) Update cart item count, recently searched and previously viewed section
        setOfflineData()

        // 3) Reset search text and search suggestion
        isSearchMedicineVisible.value = false
        resetSearchResult()

        // 4) Start search box animation
        //searchBoxTextAnimationJob = startSearchBoxTextAnimation()
    }

    /**
     * 1) If search suggestion is loaded then perform all steps from ivClearSearchText else Finish activity
     */
    fun updateUIState() {
        viewModelScope.launch(IO) {
            try{
                val previousList = localDbUseCase.getPreviouslySearch()
                val recentList = localDbUseCase.getRecentlySearch()

                if (searchSuggestionList.value!!.isNotEmpty() && isSuggestionLoaded.value!! &&
                        searchQuery.value!!.isNotEmpty()
                ) {
                    searchUIState.postValue(SearchUIStateConstants.LOADING)
                } else if (searchSuggestionList.value!!.isEmpty() && isSuggestionLoaded.value!! &&
                        searchQuery.value!!.isNotEmpty()
                ) {
                    searchUIState.postValue(SearchUIStateConstants.LOADING)
//                searchUIState.postValue(SearchUIStateConstants.SHIMMER)
                } else if (trendingSearchList.value!!.isEmpty() &&
                        recentList.isEmpty() && previousList.isEmpty()
                        && searchQuery.value!!.isEmpty()
                ) { //default view
                    searchUIState.postValue(SearchUIStateConstants.DEFAULT_VIEW)
                } else if ((SharedPrefManager.getInstance().getTrendingSearch().isNotEmpty() ||
                                recentList.isNotEmpty() || previousList.isNotEmpty())
                        && searchQuery.value!!.isEmpty()
                ) { //local db view
                    searchUIState.postValue(SearchUIStateConstants.LOCAL_DATA)
                } else if (!isSuggestionLoaded.value!! && searchQuery.value!!.isNotEmpty() &&
                        searchSuggestionList.value!!.isNotEmpty()
                ) { //search suggestion list view
                    if (showDidYouMean.value!!) {
                        searchUIState.postValue(SearchUIStateConstants.DID_YOU_MEAN)
                    } else {
                        searchUIState.postValue(SearchUIStateConstants.SUGGESTION_VIEW)
                    }
                } else if (!isSuggestionLoaded.value!! && searchQuery.value!!.isNotEmpty() &&
                        searchSuggestionList.value!!.isEmpty()
                ) { //no record view
                    if (lastScreenName == "SRP") {
                        searchUIState.postValue(SearchUIStateConstants.LOADING)
//                        lastScreenName = ""
                    } else
                        searchUIState.postValue(SearchUIStateConstants.NO_RECORDS)
                } else if (isSuggestionLoaded.value!!) { //default view
                    searchUIState.postValue(SearchUIStateConstants.LOADING)
                }
            }catch (_:Exception){}
        }
    }

    /**
     * 1) If search suggestion is loaded then perform all steps from ivClearSearchText else Finish activity
     */
    fun onBackIconClick() {
        if (!searchQuery.value.isNullOrEmpty()) {
            sendSearchSuggestionImpressionEvent("back")
            onClearSearchTextClick("back_pressed")
            searchQuery.value = ""
        } else {
            //TODO singular event
            /*EventManager.getInstance().logEvents(
                this@SearchSuggestionViewModel, "Search_Back", EventManager.getInstance().eventData(
                    SharedPrefManager.getInstance().loggedInUserMobile,
                    "Search", SharedPrefManager.getInstance().loggedInUserId,
                    "", "" + "", "", "", "", "", ""
                )
            )*/
            finishActivity.value =
                Event(
                    Any()
                )
        }
    }

    /**
     * 1) Delete Recently Searched and Previously Viewed
     * 2) Reset Recently Searched and Previously Viewed list
     */
    fun onClearRecentlySearch() {
        //TODO
        // 1) Delete Recently Searched and Previously Viewed
        viewModelScope.launch(IO) {
            localDbUseCase.deleteRecentlySearchForCustomerId(SharedPrefManager.getInstance().loggedInUserAccessToken)
            searchSuggestionList.postValue(emptyList())
            recentlySearchedList.postValue(emptyList())
            previouslyViewedList.postValue(emptyList())

            updateUIState()
        }

        // 2) Reset Recently Searched and Previously Viewed list
        //isLocalData.postValue(false)
    }

    /**
     * 1) Log MixPanel, Firebase, Singular, Facebook event
     * 2) open dialer with customer care number which is saved in Shared Preference
     */
    fun onCallPharmacistClick() {
        //1) sdk event
        //2) open dialer with customer care number which is saved in Shared Preference
        callPharmacist.value =
            Event<Any>(
                SharedPrefManager.getInstance().customerCareNumber
            )
    }

    private fun resetSearchResult() {
        searchQuery.value = ""
        //TODO reset edittext
        //binding.etSearchProduct.setText("")
        showSearchedMedicine.postValue(false)
        noResultFound.value =
            !(recentlySearchedList.value?.size!! > 0 || previouslyViewedList.value?.size!! > 0)

        isSuggestionLoaded.postValue(false)
        showProducts = false
    }

    /**
     * 1) Update cart item count
     * 2) Update recently searched list
     * 3) Update previously searched list
     * 4) Update trending searches
     */
    fun setOfflineData() {
        try {
            setCartCount()
            setRecentlySearched()
            setPreviouslyViewedProducts()
            updateUIState()
            setTrendingSearches()
        } catch (_: Exception) {
        }
    }

    private fun setTrendingSearches() {
        try {
            val keyValuePairs = ArrayList<KeyValuePair>()
            if (SharedPrefManager.getInstance().trendingSearch.isNullOrBlank() && SharedPrefManager.getInstance().trendingSearch != "null") {
                val jsonObject = JSONObject(SharedPrefManager.getInstance().trendingSearch)
                val keys: Iterator<String> = jsonObject.keys()
                var key: String
                var value: String
                while (keys.hasNext()) {
                    key = keys.next()
                    value = jsonObject.optString(key)
                    if (key != "" && value != "") keyValuePairs.add(KeyValuePair(key, value))
                }
            }
//            trendingSearchList.postValue(keyValuePairs)
        } catch (_: Exception) {
        }
    }

    /*fun setCartCount() = viewModelScope.launch(Dispatchers.IO) {
        val amount = setCartAmount()
        cartCount.postValue(
            localDbUseCase.getCartCount()
        )


    }*/

    fun getEditOrderRequestData(productCode: String, qty: Int): List<MedicineDto> =
        runBlocking(IO) {
            return@runBlocking async {
                if (cartMedicineListResponse.isNullOrEmpty()) {
                    val response =
                        orderFlowUseCase.getOrderMedicineDetails(
                            mxInternalErrorOccurred,
                            SharedPrefManager.getInstance().incompleteOrderId
                        )
                    if (response != null && response.statusCode == 200) {
                        cartMedicineListResponse =
                            response.responseData?.elasticProductDetails ?: listOf()
                    }
                }
                localDbUseCase.getCartMedicineDtoFromProductCode(
                    cartMedicineListResponse,
                    productCode,
                    qty
                )
            }.await()
        }

    fun editMedicine(
        orderId: Long,
        list: List<MedicineDto>,
        removeMed: Boolean,
        page: String = ""
    ) {
        viewModelScope.launch(IO) {
            loaderValue.postValue(true)

            if (list.isEmpty()) return@launch
            val apiResponse = orderFlowUseCase.editMedicine(mxInternalErrorOccurred, orderId, list)
            if (apiResponse != null) {
                if (removeMed) {
                    localDbUseCase.removeCrossSellingProductUsingId(list[0].productCode ?: "")
                } else {
                    localDbUseCase.updateMedicineQuantity(
                        list[0].productCode ?: "",
                        list[0].quantity ?: 1
                    )
                }
                isDeleteCompleted.postValue(Event(true))
                isDelete.postValue(Event(false))
                loaderValue.postValue(false)


            } else {
                isDelete.postValue(Event(false))
                loaderValue.postValue(false)
            }

        }
    }


    private fun setRecentlySearched() = viewModelScope.launch(IO) {
        //TODO fetch from offline db
        var list = localDbUseCase.getRecentlySearch() ?: listOf()
//        recentlySearchedList.postValue(list!!)
        recentlySearchedList.postValue(localDbUseCase.getRecentlySearch())

        if (list.isNotEmpty()) {
            noResultFound.postValue(false)
            isSuggestionLoaded.postValue(false)
        }
    }

    private fun setPreviouslyViewedProducts() = viewModelScope.launch(IO) {
        val list = localDbUseCase.getPreviouslySearch()
//        previouslyViewedList.postValue(list)
        previouslyViewedList.postValue(localDbUseCase.getPreviouslySearch())
        /*launch(Dispatchers.Main){
            getDummyPreviousData().single {
                val my result=it
                //Update your UI
            }
        }*/

        if (list.isNotEmpty()) {
            noResultFound.postValue(false)
            isSuggestionLoaded.postValue(false)
        }
    }

    private fun sendSuggestionItemImpression(exitEventName: String) {
        //TODO implement mixPanel event
    }

    private fun sendItemSearchedEvent(exitEventName: String) {
        //TODO implement mixPanel event
    }

    /**
     * log events for Firebase, Singular and Facebook
     */
    private fun logEvents(eventName: String) {
        //TODO singular event
        /*val keyValuePairList: MutableList<KeyValuePair> = ArrayList()
        keyValuePairList.add(
            KeyValuePair(
                "customer_id",
                SharedPrefManager.getInstance().loggedInUserId
            )
        )
        keyValuePairList.add(
            KeyValuePair(
                "mobile",
                SharedPrefManager.getInstance().loggedInUserMobile
            )
        )
        EventManager.getInstance().logEvents(
            getApplication<Application>().getApplicationContext(),
            "Search_Remove",
            keyValuePairList
        )*/
    }

    fun showBottomSheet() {
//        val bottomSheet = CompareAndUnderstandSubstituteBottomSheet(sheet)
//        bottomSheet?.isCancelable = true
//        if (bottomSheet?.isVisible == false) bottomSheet.show(context, "COMPARE_AND_UNDERSTAND")

//        val bottomSheet = HomePageBottomSheetInfo(type = BottomSheetType.COMPARE_AND_UNDERSTAND, compareAndUnderstand = getCompareAndUnderstandSubstituteData()).compareAndUnderstand?.let { sheet -> CompareAndUnderstandSubstituteBottomSheet(sheet) }
//        bottomSheet?.isCancelable = true
//        if (bottomSheet?.isVisible == false) bottomSheet.show(context, "COMPARE_AND_UNDERSTAND")

    }

    /*private fun redeemReferralCode(
        customerId: String?,
        mobileNumber: String,
        referralId: String
    ) = viewModelScope.launch(Dispatchers.IO) {
        tmWalletUseCase.redeemReferralCode(
            customerId,
            mobileNumber,
            referralId
        )
    }*/

    /*fun getTrueCallerUserDetails(
        textAuthorizationCode: String,
        clientId: String,
        authorizationCode: String,
        codeVerifier: String,
        context: Context
    ) = viewModelScope.launch(IO) {
        try {
            showSearching.postValue(true)
            val loginStatus = loginUseCase.getTrueCallerUserDetails(
                mxInternalErrorOccurred,textAuthorizationCode,
                clientId,
                authorizationCode,
                codeVerifier,
                SharedPrefManager.getInstance().fcm,
                SharedPrefManager.getInstance().googleAdId,
                context,
                clickedOnPage,
                fillType = "truecaller"
            )
            when (loginStatus) {
                LoginStatus.SUCCESS -> {
                    //for homepage bottom nav, to update data
                    SharedPrefManager.getInstance().isLoggedInFromBottomSheet = true
                    //postLoginSetUserSpecificData()
                    //hide loader
                    showSearching.postValue(false)
                }

                LoginStatus.INVALID_OTP -> {
                    showSearching.postValue(false)
                }


                LoginStatus.INVALID_ACCESS_TOKEN -> {
                    showSearching.postValue(false)
                }

                LoginStatus.EXCEPTION_OCCURRED -> {
                    showSearching.postValue(false)
                }

                LoginStatus.NULL -> {
                    showSearching.postValue(false)
                    openLoginBottomSheet.postValue(Event(Any()))
                }
            }
        } catch (e: Exception) {
            openLoginBottomSheet.postValue(Event(Any()))
        }
    }*/

    /**
     * 1) Redeem referral code: this will happen when user opened app from referral deeplink. if user open app from referral link again, then error message comes from service.
     * This error message we don't show to customer in login flow
     * 2) call getCustomerAndOrderDetailsForHome service to get variant specific data
     * 3) call getCustomerDeliveryChargeData service to get base discount percentage which is used while calculating coupon discount
     * and to get delivery charge amount
     * This must be done after getCustomerAndOrderDetailsForHome because this will set user dynamic discount variant and after that getCustomerDeliveryChargeData should get called
     * to get dynamic discount basis baseDiscount attribute value
     */
    /*private suspend fun postLoginSetUserSpecificData() {
        try {

            //2) call getCustomerAndOrderDetailsForHome service to get variant specific data
            userDataUseCase.getCustomerAndOrderDetailsForHome(
                SharedPrefManager.getInstance().loggedInUserId.toLong()
            )

            //1) redeem referral code
            redeemReferralCode(
                null,
                SharedPrefManager.getInstance().loggedInUserMobile,
                SharedPrefManager.getInstance().referryId
            )

            //3) call getCustomerDeliveryChargeData service to get base discount percentage and delivery charge data
            val response = userDataUseCase.getCustomerDeliveryCharge(
                SharedPrefManager.getInstance().loggedInUserId.toLong()
            )
            response?.let { userDataUseCase.saveDeliveryChargeAndBaseDiscount(it) }
        } catch (_: Exception) {
        }
    }*/

    /**
     * Activity's onResume event callback will come here as well, as this viewmodel is observing activity lifecycle
     * 1) Start EditText animation
     */
    override fun onResume(owner: LifecycleOwner) {
        super.onResume(owner)
        viewModelScope.launch(IO) { setCartCount() }
    }


    /**
     * This method defines logic for Activity's EditText onTextChanged event
     * 1) Set showProduct = false so that product list is not shown to user
     * 2) If user pressed back space from keyboard, it's an exit event for search event, then send MixPanel item_searched event(if it's not triggered before for same exit event)
     * Else set mixpanel term searched to false so that next time item_searched event can be triggered
     */
    fun onTextChanged(input: String) {
        showProducts = false
        handler.removeCallbacks(searchResultRunner)

        //call mixpanel event when customer press back space from keyboard
        if (beforeTextChange.length > input.trim().length) {
            //TODO
            /*try {
                viewModel.sendItemSearchedEventToMixpanel("back_space")
            } catch (ignore: java.lang.Exception) {
            }*/
        } else {
            mxTermSearchedTriggered = false
        }
    }

    /**
     * This method defines logic for Activity's EditText afterTextChanged event
     * 1) if user enters all space characters then do not execute any text change logic & stop EditText animation(to avoid space characters and EditText cursor getting animated)
     * 2) Update search query, so that data binding with respect to this can update view accordingly
     * 3) If input string is empty, then perform step 4 to step 7
     * 4) Reset variable:
     * 5) Get offline search data: recently searched, previously viewed.trending searched(Stored in session)
     * 6) If offline data not available then show default view, else show view having offline data
     * 7) Start EditText animation
     * 8) Else perform step 9 to step 12
     * 9) Reset variables for mixpanel item_searched event
     * 10) Stop EditText animation(to avoid inout characters and EditText cursor getting animated)
     * 11) Call api if gap between 2 input character is more than 500 milliseconds
     * 12) Trigger Singular event Search_typing(if not triggered in active instance)
     *
     */

    private var last_text_edit: Long = 0
    var delay: Long = 500
    var searchResultRunner: Runnable = Runnable {
        Log.d(
            "debounce",
            "${System.currentTimeMillis()} : $last_text_edit : ${last_text_edit + delay} "
        )
        if (System.currentTimeMillis() >= (last_text_edit + delay)) {
            getSearchSuggestions(searchQuery.value!!.trim { it <= ' ' })
        } else {
            showProducts = false
        }
    }

    fun afterTextChanged(input: String) = viewModelScope.launch(IO) {
        if (input.isNotEmpty()) {
            last_text_edit = System.currentTimeMillis()
            searchQuery.postValue(input)
            //isSuggestionLoaded.postValue(true)
            handler.postDelayed(searchResultRunner, delay);
        } /*else {
            searchQuery.postValue("")
            searchSuggestionList.postValue(listOf())
            updateUIState()
        }*/
    }

    private fun getSearchSuggestions(input: String) {
        viewModelScope.launch(IO) {

            val searchSuggestion =
                searchUseCase.getReactiveResults(
                    mxInternalErrorOccurred,
                    input
                )//getReactiveSuggestions(input)
            val list = searchSuggestion.suggestionWithType ?: listOf()

            for (item in list) {
                item.inSection = item.getInSectionCategory(localDbUseCase) ?: ""
            }
            withContext(Dispatchers.Main) {
                showDidYouMean.value = searchSuggestion.didYouMeanTriggered
                isSuggestionLoaded.value = false
                searchSuggestionList.value = list
            }

            if (list.isEmpty())
                lastScreenName = ""

            mxItemSearched.termSearched = input.lowercase()?.trim()
            mxItemSearched.whId = SharedPrefManager.getInstance().selectedWarehouseID
            mxItemSearched.timeTaken = searchSuggestion.timeTaken
            mxItemSearched.termSearchedCharCount = input.length
            mxItemSearched.didYouMeanTriggered = searchSuggestion.didYouMeanTriggered
            mxItemSearched.isPreviouslyViewed =
                checkProductInList(previouslyViewedList.value!!, input)
            mxItemSearched.resultFoundCount = list.size
            mxItemSearched.suggestionTermClicked = suggestion_term_clicked

            updateUIState()
        }
    }

    fun getSearchResultList(
        input: String,
        elasticSearchType: String,
        page: Int,
        isMultiBrand: Boolean
    ) {
        setCartCount()
        if (page > 1) {
            showProgressBar.postValue(true)
        } else {
            showSearching.postValue(true)
        }
        pageNumber = page
        viewModelScope.launch(IO) {
            val searchResultObj =
                orderFlowUseCase.getSearchResults(
                    mxInternalErrorOccurred,
                    input,
                    elasticSearchType,
                    page,
                    isMultiSearch
                )

            if (page == 1 && SharedPrefManager.getInstance().loggedInUserAccessToken.isNotEmpty())
                getFtcCouponsData()

            searchResultObj?.let {
                if (it.elasticProductDetails?.isEmpty() == true) {
                    stopPagging = true
                }
                totalSearchCount.postValue(it.totalProducts ?: 0)
            }

            val list = searchResultObj?.elasticProductDetails ?: listOf()

            val resultList = searchResultList.value ?: mutableListOf()

            for (item in list) {
                val orgQty = getMedicineCount(item.product.productCode)
                item.product.qty = orgQty
                item.suggestion?.productCode?.let {
                    val subsQty = getMedicineCount(it)
                    item.suggestion?.qty = subsQty
                    item.isSubsAddedToCart = checkAlreadyAddedAsSubs(item.product.productCode, it)
                    /*if (subsQty > 1) {
                    item.suggestion!!.sellingPrice = (item.suggestion!!.sellingPrice * subsQty)
                }*/
                }
//                item.isSubsAddedToCart = checkAlreadyAddedSubsAsOrg(item.product.productCode)
                item.isOrgAddedToCart = checkAlreadyAddedSubsAsOrg(item.product.productCode)
                item.isReplaced = checkProductReplacedInReorder(item.product.productCode)
                item.isAutoReplaced = checkProductAsReplaceInReorder(item.product.productCode)
                item.isSubsAddedToCart = checkAlreadyAddedAsSubs(
                    item.product.productCode,
                    item.suggestion?.productCode ?: ""
                )

                item.product.showRemove = false
                item.product.showRemoved = false

                if (item.suggestion != null) {
                    //TODO - "Remove hardcoded max capped qty"
//                    item.suggestion?.maxCappedQty = 10
                    if ((item.suggestion?.qty ?: 0) > 0) {
                        val itemCount = getOrgCountFromSubsMed(item.product.productCode)
                        val list = getAddedSubsInfoByOrg(item.product.productCode)
                        if (list.isNotEmpty()) {
                            //show org subs mapping
//                            item.isOrgAddedToCart = true
                            item.cardType = FullWidthProductCardConstants.SUBS_ADDED
                        } else {
                            //show already added to cart on subs bottom sheet
                            if (itemCount == 0) {
                                item.cardType = FullWidthProductCardConstants.SEARCH
                                item.suggestion?.qty = 0
                                item.isSubsAddedToCart = true
                                Log.e("SEARCH", "subs added as ORG")
                            }
                        }

                    } else {
                        item.cardType = FullWidthProductCardConstants.SEARCH
                    }

                    item.product.subsFound =
                        item.product.subsFound
                    if (item.product.productCode == item.suggestion?.productCode) {
                        item.product.subsFound = false
                        item.suggestion?.qty = 0
                        item.cardType = FullWidthProductCardConstants.SEARCH
                    }

                } else {
                    item.product.subsFound = false
                    item.cardType = FullWidthProductCardConstants.COMPARE_N_CHOOSE
                }


                resultList.add(item)
            }
            searchResultList.postValue(resultList)
            noResultSRP.postValue(resultList.size == 0)
            if (page > 1) {
                showProgressBar.postValue(false)
            } else {
                showSearching.postValue(false)
            }
            isLoadingMore = false
            eventSendSrpEvent.postValue(Event(Any()))
        }

    }


    fun reloadSearchResultList(mList: List<ProductInfoModel>) {

        viewModelScope.launch(IO) {
            //Do something after 200ms
            val resultList = mutableListOf<ProductInfoModel>()
            try {
                for (item in mList) {
                    val orgQty = getMedicineCount(item.product.productCode)
                    item.product.qty = orgQty
                    item.suggestion?.productCode?.let {
                        val subsQty = getMedicineCount(it)
                        item.suggestion?.qty = subsQty
                        item.isSubsAddedToCart =
                            checkAlreadyAddedAsSubs(item.product.productCode, it)
                        /*if (subsQty > 1) {
                        item.suggestion!!.sellingPrice = (item.suggestion!!.sellingPrice * subsQty)
                    }*/
                    }
//                item.isSubsAddedToCart = checkAlreadyAddedSubsAsOrg(item.product.productCode)
                    item.isOrgAddedToCart = checkAlreadyAddedSubsAsOrg(item.product.productCode)
                    item.isReplaced = checkProductReplacedInReorder(item.product.productCode)
                    item.isAutoReplaced = checkProductAsReplaceInReorder(item.product.productCode)
                    item.isSubsAddedToCart = checkAlreadyAddedAsSubs(
                        item.product.productCode,
                        item.suggestion?.productCode ?: ""
                    )

                    item.product.showRemove = false
                    item.product.showRemoved = false

                    if (item.suggestion != null) {
                        //TODO - "Remove hardcoded max capped qty"
//                    item.suggestion?.maxCappedQty = 10
                        if ((item.suggestion?.qty ?: 0) > 0) {
                            val itemCount = getOrgCountFromSubsMed(item.product.productCode)
                            val list = getAddedSubsInfoByOrg(item.product.productCode)
                            if (list.isNotEmpty()) {
                                //show org subs mapping
//                            item.isOrgAddedToCart = true
                                item.cardType = FullWidthProductCardConstants.SUBS_ADDED
                            } else {
                                //show already added to cart on subs bottom sheet
                                if (itemCount == 0) {
                                    item.cardType = FullWidthProductCardConstants.SEARCH
                                    item.suggestion?.qty = 0
                                    item.isSubsAddedToCart = true
                                    Log.e("SEARCH", "subs added as ORG")
                                }
                            }

                        } else {
                            item.cardType = FullWidthProductCardConstants.SEARCH
                        }

                        item.product.subsFound =
                            item.product.subsFound
                        if (item.product.productCode == item.suggestion?.productCode) {
                            item.product.subsFound = false
                            item.suggestion?.qty = 0
                            item.cardType = FullWidthProductCardConstants.SEARCH
                        }

                    } else {
                        item.product.subsFound = false
                        item.cardType = FullWidthProductCardConstants.COMPARE_N_CHOOSE
                    }

                    resultList.add(item)
                }
            } catch (_: Exception) {
            }
            searchResultList.postValue(resultList)
            setCartCount()
//            showSearching.postValue(false)
//            noResultSRP.postValue(resultList.size == 0)
        }
    }


    /*fun reloadSearchResultList(resultList: MutableList<ProductInfoModel>) {
    
//        viewModelScope.launch(Dispatchers.IO) {
    
//            val resultList = searchResultList.value ?: mutableListOf()
    
            for (item in resultList) {
                val orgQty = getMedicineCount(item.product.productCode)
                item.product.qty = orgQty
                item.suggestion?.productCode?.let {
                    val subsQty = getMedicineCount(it)
                    item.suggestion?.qty = subsQty
                    item.isSubsAddedToCart = checkAlreadyAddedAsSubs(item.product.productCode, it)
                    *//*if (subsQty > 1) {
                    item.suggestion!!.sellingPrice = (item.suggestion!!.sellingPrice * subsQty)
                }*//*
                }
//                item.isSubsAddedToCart = checkAlreadyAddedSubsAsOrg(item.product.productCode)
                item.isOrgAddedToCart = checkAlreadyAddedSubsAsOrg(item.product.productCode)
                item.isReplaced = checkProductReplacedInReorder(item.product.productCode)
                item.isAutoReplaced = checkProductAsReplaceInReorder(item.product.productCode)
                item.isSubsAddedToCart = checkAlreadyAddedAsSubs(
                    item.product.productCode,
                    item.suggestion?.productCode ?: ""
                )
        
        
                if (item.suggestion != null) {
                    //TODO - "Remove hardcoded max capped qty"
//                    item.suggestion?.maxCappedQty = 10
                    if ((item.suggestion?.qty ?: 0) > 0) {
                        item.cardType = FullWidthProductCardConstants.SUBS_ADDED
                
                        val itemCount = getOrgCountFromSubsMed(item.product.productCode)
                        if (itemCount == 0) {
                            item.cardType = FullWidthProductCardConstants.SEARCH
                            item.suggestion?.qty = 0
                            Log.e("SEARCH", "subs added as ORG")
                        }
                
                    } else {
                        item.cardType = FullWidthProductCardConstants.SEARCH
                    }
            
                    item.product.subsFound =
                        item.product.subsFound
                    if (item.product.productCode == item.suggestion?.productCode) {
                        item.product.subsFound = false
                        item.suggestion?.qty = 0
                        item.cardType = FullWidthProductCardConstants.SEARCH
                    }
            
                } else {
                    item.product.subsFound = false
                    item.cardType = FullWidthProductCardConstants.COMPARE_N_CHOOSE
                }
        
        
                resultList.add(item)
            }
            searchResultList.postValue(resultList)
            noResultSRP.postValue(resultList.size == 0)
//        }
    }*/

    /**
     * API call to get trending searches list
     */
    fun getTrendingSearch() {
        val fcmToken = SharedPrefManager.getInstance().fcm
        val sessionToken = getSessionToken(fcmToken)
        sessionToken?.let {
//            val jsonObject = getCrossSellingProducts(it)
//            trendingSearchList.postValue(getDummyTrendingList())
            updateUIState()
        }
    }


    private fun loadRecentMedicines() = viewModelScope.launch(IO) {
        recentMedicines.postValue(mutableListOf())
        recentlySearchedList.postValue(localDbUseCase.getRecentlySearch())
        previouslyViewedList.postValue(localDbUseCase.getPreviouslySearch())
        updateUIState()
    }

    /**
     * This job is used to start search only if user has not entered any character in 0.5 seconds time interval
     *
     * **/
    private var taskSearchJob: Job? = null
    private fun initiateSearchJob(elasticSearchType: String, search: String) {
        cancelJob() // optional if you want to start afresh

        // Create a new Job and assign it to our variable
        taskSearchJob = viewModelScope.launch(IO) {
            delay(500) // Task will be performed after the delay

            /**
             * elastic search call after time delay
             * **/
            var isMultiSearch: Boolean =
                elasticSearchType == ElasticSearchType.SKU_BRAND_SEARCH.toString() || elasticSearchType == ElasticSearchType.SEARCH_SUGGESTION.toString()

            lastKnownResponse = searchUseCase.fetchElasticSearch(
                "application/json",
                SharedPrefManager.getInstance().loggedInUserAccessToken,
                SharedPrefManager.getInstance().selectedWarehouseID,
                elasticSearchType,
                search,
                isMultiSearch,
                if (SharedPrefManager.getInstance().algoSpecificVariantId < 0) null else SharedPrefManager.getInstance().algoSpecificVariantId,
                null
            ) ?: JSONObject()

        }
    }

    private fun cancelJob() {
        taskSearchJob?.cancel()
    }


    private fun getSessionToken(firebaseId: String): String = runBlocking {
        return@runBlocking async {
            loginUseCase.getSessionToken(
                mxInternalErrorOccurred,
                firebaseId
            )
        }.await()
    }

    /*private fun getCrossSellingProducts(sessionToken: String) : TrendingSearchResponse? = runBlocking {
        return@runBlocking async { productDetailUseCase.getTrendingSearches(3, sessionToken, 0, "App", setOf("TRENDING_SEARCHES"), 30, 4) }.await()
    }*/

    fun loadMoreResults(hidePrimaryLoader: Boolean) {
        val existingMedicineList = searchResultList.value
//        existingMedicineList?.add(null)
        searchResultList.postValue(existingMedicineList)
        noResultSRP.postValue(existingMedicineList?.size == 0)
        getSearchResultList(searchQuery.value!!, elasticSearchType, pageNumber + 1, isMultiSearch)
    }

    private fun getReactiveSuggestions(query: String): SuggestionResponseData = runBlocking {
        return@runBlocking async {
            searchUseCase.getReactiveResults(mxInternalErrorOccurred, query)
        }.await()
    }

    fun getTrendingSearches() {
        val mJson = SharedPrefManager.getInstance().trendingSearch

        if (mJson != null) {
            val mTrendingSearchList =
                Gson().fromJson(mJson, Array<TrendingSearchResponse.TrendingSearch>::class.java)
                    .asList()

            trendingSearchList.value = mTrendingSearchList
            updateUIState()
        }

    }


    fun insertRecentlySearchMedicineInDB(recentMedicine: RecentMedicine) {
        viewModelScope.launch(IO) {
            if (localDbUseCase.getCartCountFromRecentlySearch(recentMedicine.medicineName) == 0) {
                localDbUseCase.addRecentlySearchMed(recentMedicine)
            } /*else {
                localDbUseCase.updateTimeInRecentSearch(System.currentTimeMillis(), recentMedicine.productCode)
            }*/
        }
    }

    private fun getMedicineCount(productCode: String): Int = runBlocking {
        return@runBlocking async {
            localDbUseCase.getAddedQtyOfAddedMedicine(productCode)
        }.await()
    }

    private fun getOrgCountFromSubsMed(productCode: String): Int = runBlocking {
        return@runBlocking async {
            localDbUseCase.getOrgCountFromSubsMed(productCode)
        }.await()
    }

    private fun checkAlreadyAddedAsSubs(orgProductCode: String, subsProductCode: String): Boolean =
        runBlocking {
            return@runBlocking async {
                localDbUseCase.checkAlreadyAddedAsSubs(orgProductCode, subsProductCode, false)
            }.await()
        }

    private fun checkAlreadyAddedSubsAsOrg(productCode: String): Boolean = runBlocking {
        return@runBlocking async {
            localDbUseCase.checkAlreadyAddedSubsAsOrg(productCode)
        }.await()
    }

    private fun checkProductAsReplaceInReorder(productCode: String): Boolean = runBlocking {
        return@runBlocking async {
            localDbUseCase.productAsReplaceInReorder(productCode)
        }.await()
    }

    private fun checkProductReplacedInReorder(productCode: String): Boolean = runBlocking {
        return@runBlocking async {
            localDbUseCase.productReplacedInReorder(productCode)
        }.await()
    }

    private fun getOrgProductCodeToMerge(productCode: String): String = runBlocking {
        return@runBlocking async {
            localDbUseCase.getOrgProductCodeToMerge(productCode)
        }.await()
    }

    private fun getAddedSubsInfoByOrg(productCode: String): List<CartMedicine> = runBlocking {
        return@runBlocking async {
            localDbUseCase.getAddedSubsInfoByOrg(productCode)
        }.await()
    }


    fun addMedicine(productInfoModel: ProductInfoModel, isSub: Boolean = false, position: Int) {
        viewModelScope.launch(IO) {

            val orgCartItem = productInfoModel.productAsCartItem(false, 1)

            var itemAdded = MxItemAdded()
            itemAdded.clickedOnPage = "search_result"
            itemAdded.sectionIndex = position + 1
            itemAdded.resultPosition = position + 1
            itemAdded.pageSection = "main"
            itemAdded.freeDeliveryRequiredAmount = 0.0
            orderFlowUseCase.addMedicineToCart(orgCartItem, null, false, itemAdded)
            localDbUseCase.insertCartSellingPrice(
                CartItemSellingPrice(
                    if (isSub) productInfoModel.suggestion?.productCode!! else productInfoModel.product.productCode,
                    if (isSub) productInfoModel.suggestion?.sellingPrice!! else productInfoModel.product.sellingPrice
                )
            )
            var mxClickedSuggestionType =
                localDbUseCase.getKeyValueFromSearchCategoryIgnoreCase(clickedSuggestionType)
            sendItemAddedEvent(
                productInfoModel,
                null,
                null,
                itemAdded,
                isSub,
                searchQuery.value,
                mxClickedSuggestionType,
                suggestion_term_clicked,
                suggestion_term_clicked_position
            )
            updateOrgAvailableOfCartMedicine(orgCartItem.medicineId, true)
            reloadSearchResultList(searchResultList.value!!)
            setCartCount()
        }
    }

    fun updateCartMedicineQty(productCode: String, qty: Int) {
        viewModelScope.launch(IO) {
            orderFlowUseCase.updateCartMedicineCount(productCode, qty)
            setCartCount()
            reloadSearchResultList(searchResultList.value!!)
        }
    }

    fun updateOrgAvailableOfCartMedicine(productCode: String, available: Boolean) {
        viewModelScope.launch(IO) {
            localDbUseCase.updateOrgAvailable(productCode, available)
        }
    }

    fun deleteMedicineFromCart(productCode: String, isSubs: Boolean) {
        viewModelScope.launch(IO) {
            orderFlowUseCase.deleteMedicineFromCart(productCode, isSubs)
            setCartCount()
            reloadSearchResultList(searchResultList.value!!)
        }
    }

    /*fun getCouponDataFromApi() {
        viewModelScope.launch(Dispatchers.IO) {
            val couponData =
                orderFlowUseCase.fetchFtcCoupons(
                    SharedPrefManager.getInstance().loggedInUserId,
                    UserCategoryEnum.FTC_COUPON_URGENCY.apiCategoryType,
                    CommonFunc.getSourceVersionName()
                )
            if (!couponData.couponList.isNullOrEmpty()) {
                notificationDetailData.postValue(couponData.couponList[0])
            } else {
                notificationDetailData.postValue(null)
            }
        }

    }*/

    /*fun setCartAmount() = viewModelScope.launch(Dispatchers.IO) {
        val amount = async { orderFlowUseCase.setCartTotalSellingPrice() }.await()
        cartTotal = amount
    }*/

    suspend fun getFtcCouponsData() {
        var categoryType = "NFTC_DynamicDiscount"
        val genericDiscountVariantId = localDbUseCase.getCustomerCategoryId(UserCategoryEnum.GENERIC_CAP_DISCOUNT.apiCategoryType)
        if (genericDiscountVariantId > 0) {
            categoryType = UserCategoryEnum.GENERIC_CAP_DISCOUNT.apiCategoryType
        }
        couponUseCase.fetchAllOffers(
            mxInternalErrorOccurred, 100,
            SharedPrefManager.getInstance().pincode.toString(),
            "URGENCY_COUPON",
            if (SharedPrefManager.getInstance().isFtc) "FTC_Coupon_Urgency" else categoryType,
            if (SharedPrefManager.getInstance().algoSpecificVariantId == null || SharedPrefManager.getInstance().algoSpecificVariantId < 0) null else SharedPrefManager.getInstance().algoSpecificVariantId
        )?.let {

/*            if (it.responseData.isNotEmpty()) {
                ftcCouponData.postValue(it.responseData.first())
            }*/
            ftcCouponResponse = it.responseData

            if (SharedPrefManager.getInstance().couponModel == null)
                if (it.responseData.isNotEmpty()) ftcCouponData.postValue(it.responseData.first())
                else ftcCouponData.postValue(null)
            else SharedPrefManager.getInstance().couponModel.also { savedModel ->
                if (savedModel.showFtcCounter == true && it.responseData.isNotEmpty() && it.responseData.first().promoCode == savedModel.promoCode) {
                    ftcCouponData.postValue(savedModel)
                } else if (it.responseData.isNotEmpty()) ftcCouponData.postValue(it.responseData.first())
                else ftcCouponData.postValue(null)
            }

        }
    }

    fun applyCouponClick(couponCodeResponse: CouponCodeResponse.Coupon?) {
        _isLoading.postValue(true)
        viewModelScope.launch(IO) {

            Log.i("CartValue", "$cartSellingPrice.value!!")
            if (medicineTotalSellingPrice.value!! >= couponCodeResponse?.minCartValue!!) {
                SharedPrefManager.getInstance().offerId = couponCodeResponse.offerId.toString()

                val cartMedList = getAddedMedicinesFromCart(false, true)

                val responseCode = orderFlowUseCase.replaceMedicineForIncompleteOrder(
                    mxInternalErrorOccurred, SharedPrefManager.getInstance().incompleteOrderId,
                    cartMedList,
                    SharedPrefManager.getInstance().loggedInUserId,
                    SharedPrefManager.getInstance().offerId,
                    true,
                    true,
                    SharedPrefManager.getInstance().srcType,
                    SharedPrefManager.getInstance().algoSpecificVariantId,
                )

                responseCode?.let {
                    if (it.statusCode == 200) {
                        SharedPrefManager.getInstance().autoReplaced = true
                        getMedicineOrderDetailsList(
                            mxInternalErrorOccurred,
                            SharedPrefManager.getInstance().incompleteOrderId,
                            false
                        )
                    }
                }
            }

            Log.i("CartValue", "" + cartSellingPrice.value!!)
            var couponSaveRemoveResponse: CouponSaveRemoveResponse? = null
            Log.d("TAG", "applyCouponClick:  cartAmount = ${cartSellingPrice.value}")
            if (medicineTotalSellingPrice.value!! >= couponCodeResponse.minCartValue!! || (SharedPrefManager.getInstance().prescriptionCount > 0 && medicineTotalSellingPrice.value == 0.0)) {
                setMedicineListDataReceived()
                couponSaveRemoveResponse = couponUseCase.applyAndRemoveCouponCode(
                    mxInternalErrorOccurred,
                    SharedPrefManager.getInstance().incompleteOrderId,
                    getPaymentMode().toString(),
                    couponCodeResponse.offerId.toString(),
                    billDetailsData,
                    couponAppliedRemovedPageName,
                    couponCodeResponse,
                    medicineListDataReceived

                )
            }
//                SharedPrefManager.getInstance().setCouponModel()
            openCouponPopup.postValue(Event(Pair(couponCodeResponse, couponSaveRemoveResponse)))
            /*if (SharedPrefManager.getInstance().couponModel == null) {
//                couponCodeResponse.isCouponApplied = true
                var couponSaveRemoveResponse: CouponSaveRemoveResponse? = null
                Log.d("TAG", "applyCouponClick:  cartAmount = ${cartSellingPrice.value}")
                if (cartSellingPrice.value!! >= couponCodeResponse.minCartValue!! || SharedPrefManager.getInstance().prescriptionCount > 0) {
                    couponSaveRemoveResponse = couponUseCase.applyAndRemoveCouponCode(
                        SharedPrefManager.getInstance().incompleteOrderId,
                        getPaymentMode().toString(), couponCodeResponse.offerId.toString()
                    )
                }
//                SharedPrefManager.getInstance().setCouponModel()
                openCouponPopup.postValue(Event(Pair(couponCodeResponse, couponSaveRemoveResponse)))

            } else {
                /*val couponSaveRemoveResponse = async {
                    couponUseCase.applyAndRemoveCouponCode(
                        SharedPrefManager.getInstance().incompleteOrderId,
                        getPaymentMode().toString(), "0"
                    )
                }.await()*/

                val couponSaveRemoveResponse = couponUseCase.applyAndRemoveCouponCode(
                    SharedPrefManager.getInstance().incompleteOrderId,
                    getPaymentMode().toString(), "0"
                )

                if (couponSaveRemoveResponse != null && couponSaveRemoveResponse.message.equals(
                        BundleConstants.COUPON_REMOVED,
                        true
                    )
                ) {
                    SharedPrefManager.getInstance().couponModel = null
                    SharedPrefManager.getInstance().offerId = "0"
                    showMessage.postValue(Event(MESSAGES.REMOVED_COUPON_SUCCESSFULLY))
                }
            }

             */
            _isLoading.postValue(false)
        }

    }

    fun removeCouponClick(couponCodeResponse: CouponCodeResponse.Coupon?) {
        _isLoading.postValue(true)
        viewModelScope.launch(IO) {
//            if (SharedPrefManager.getInstance().couponModel == null) getBillDetailApi(couponCodeResponse)
            Log.d(
                "TAG",
                "applyCouponClick:  cartAmount = ${cartSellingPrice.value} coupon model ${SharedPrefManager.getInstance().couponModel}"
            )
            val couponSaveRemoveResponse = async {
                setMedicineListDataReceived()
                couponUseCase.applyAndRemoveCouponCode(
                    mxInternalErrorOccurred,
                    SharedPrefManager.getInstance().incompleteOrderId,
                    getPaymentMode().toString(),
                    "0",
                    billDetailsData,
                    couponAppliedRemovedPageName,
                    couponCodeResponse,
                    medicineListDataReceived
                )
            }.await()
//                SharedPrefManager.getInstance().setCouponModel()
            if (couponSaveRemoveResponse != null && couponSaveRemoveResponse.message.equals(
                    BundleConstants.COUPON_REMOVED,
                    true
                )
            ) {
                SharedPrefManager.getInstance().couponModel = null
                SharedPrefManager.getInstance().offerId = "0"
                SharedPrefManager.getInstance().setFtcVariantCCouponExpiryTimeRestart(0)
                Log.d(
                    "Intent",
                    "onCreate: setParameter call 21:::" + SharedPrefManager.getInstance().couponDiscount.toDouble()
                )

                SharedPrefManager.getInstance().setCouponDiscount(0f)
                setCartCount()
                showMessage.postValue(
                    Event(
                        MessageConstant(
                            MESSAGES.REMOVED_COUPON_SUCCESSFULLY,
                            couponSaveRemoveResponse.responseData?.description?.get(0) ?: ""
                        )
                    )
                )
            } else {
                //applyCouponFailed.postValue(Event(Any()))
            }
            _isLoading.postValue(false)
        }

    }

    private suspend fun getAddedMedicinesFromCart(
        newOrder: Boolean,
        isReplaceAll: Boolean
    ): List<MedicineDto> =
        localDbUseCase.getCartMedicineDto(cartMedicineListResponse, newOrder, isReplaceAll)

    private fun getPaymentMode(): Long {
        var paymentId: Long
        paymentId = if (SharedPrefManager.getInstance().couponPaymentMode == "online") {
            16
        } else if (SharedPrefManager.getInstance().couponPaymentMode
                .equals("cod", ignoreCase = true)
        ) {
            17
        } else {
            if (SharedPrefManager.getInstance().lastSelectedPaymentModeId == -1)
                17
            else
                SharedPrefManager.getInstance().lastSelectedPaymentModeId.toLong()
        }

        if (paymentId < 1) {
            paymentId = 16L
        }

        return paymentId
    }

    fun calculateSavingAmount(
        couponCodeResponse: CouponCodeResponse.Coupon?,
        currentPayableAmount: Double
    ) {
        _isLoading.postValue(true)
        viewModelScope.launch(IO) {
            openCouponPopupOffline.postValue(
                Event(
                    Pair(
                        couponCodeResponse,
                        orderFlowUseCase.calculateSavingAmount(
                            couponCodeResponse,
                            "search_result",
                            medicineListDataReceived,
                            billDetailsData,
                            currentPayableAmount
                        )
                    )
                )
            )
            _isLoading.postValue(false)
        }
    }

    /***
     *  setting MixPanel SDK event for sticky_strip_viewed
     */
    fun urgencyStickyViewedEvent(couponResponse: CouponCodeResponse.Coupon) {
        val mxStickyStripViewed = MxStickyStripViewed(
            clickedOnPage = "search_result",
            couponId = couponResponse.offerId.toString(),
            couponName = couponResponse.promoCode,
            couponSubtitle = couponResponse.description,
            isCouponApplied = SharedPrefManager.getInstance().couponModel != null && SharedPrefManager.getInstance().couponModel.promoCode == couponResponse.promoCode,
            urgencyTimeRemaining = if (couponResponse.showFtcCounter == true) {
                DateUtils.convertMillisToSeconds(
                    DateUtils.convertEpochTimeStampToDateMillis(
                        SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime,
                        System.currentTimeMillis()
                    )
                )
            } else {
                null
            }
        )
        sdkEventUseCase.sendFtcStickyStripViewedEvent(mxStickyStripViewed)
    }

    /***
     *  setting MixPanel SDK event for sticky_strip_clicked
     */
    fun urgencyStickyClickedEvent(couponResponse: CouponCodeResponse.Coupon?) {
        val mxStickyStripViewed = MxStickyStripViewed(
            clickedOnPage = "search_result",
            couponId = couponResponse?.offerId.toString(),
            couponName = couponResponse?.promoCode,
            couponSubtitle = couponResponse?.description,
            isCouponApplied = SharedPrefManager.getInstance().couponModel != null && SharedPrefManager.getInstance().couponModel.promoCode == couponResponse?.promoCode,
            urgencyTimeRemaining = if (couponResponse?.showFtcCounter == true) {
                DateUtils.convertMillisToSeconds(
                    DateUtils.convertEpochTimeStampToDateMillis(
                        SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime,
                        System.currentTimeMillis()
                    )
                )
            } else {
                null
            }
        )
        sdkEventUseCase.sendFtcStickyStripClickedEvent(mxStickyStripViewed)
    }

//    fun openCouponBottomSheet(couponCodeResponse: CouponCodeResponse2.Coupon) {
//        openCouponBottomSheet.value = Event(couponCodeResponse)
//    }

    fun eventCallPharmacistClickedEvent() {
        sdkEventUseCase.sendCallPharmacistClickedEvent()
    }

    fun eventSendSearchViewedEvent() {
        var discountVariantId = 0L
        if (SharedPrefManager.getInstance().algoSpecificVariantId > 0) {
            discountVariantId = SharedPrefManager.getInstance().algoSpecificVariantId
        }
        sdkEventUseCase.sendSearchViewedEvent(
            MxSearchViewed(
                clickedOnPage = if (clickedOnPage.isNullOrEmpty()) " " else clickedOnPage,
                pageSection = pageSection,
                discountVariantId = discountVariantId.toInt()
            )
        )

    }

    fun eventSendSrpAddSubsBottomSheetViewedEvent(
        selectedMedicineDetails: ProductInfoModel?,
        index: Int
    ) {
        viewModelScope.launch(IO) {
            val mxClickedSuggestionType =
                localDbUseCase.getKeyValueFromSearchCategoryIgnoreCase(clickedSuggestionType.trim())
            val subsSaving =
                selectedMedicineDetails?.product?.subsSavingPercentage?.replace("%", "")?.toDouble()
            var mxSrpAddSubs = MxSrpAddSubBottomSheetViewed(
                clickedSuggestionType = mxClickedSuggestionType,
                orgMrp = selectedMedicineDetails?.product?.mrp,
                orgProductDiscountPercentage = selectedMedicineDetails?.product?.discount,
                orgProductId = selectedMedicineDetails?.product?.productCode,
                orgProductName = selectedMedicineDetails?.product?.skuName,
                orgProductPictureExists = setEventPictureExists(selectedMedicineDetails?.product?.productImageUrl),
                orgSalePrice = selectedMedicineDetails?.product?.sellingPrice,
                packSizeDifference = /*selectedMedicineDetails?.product?.packSize  */calculatePackSizeDiff(
                    selectedMedicineDetails?.product?.packSize,
                    selectedMedicineDetails?.suggestion?.packSize
                ),
                resultPosition = index + 1,
                subsDiscountPercentage = selectedMedicineDetails?.suggestion?.discount,
                subsMrp = selectedMedicineDetails?.suggestion?.mrp,
                subsProductId = selectedMedicineDetails?.suggestion?.productCode,
                subsProductName = selectedMedicineDetails?.suggestion?.skuName,
                subsProductPictureExists = setEventPictureExists(selectedMedicineDetails?.suggestion?.productImageUrl),
                subsSalePrice = selectedMedicineDetails?.suggestion?.sellingPrice,
                subsSavings = subsSaving,
                substituteAvailable =
                selectedMedicineDetails?.suggestion != null && selectedMedicineDetails.suggestion?.availabilityStatus.isNullOrEmpty(),
                termSearched = searchQuery.value
            )

            sdkEventUseCase.sendSrpAddSubsBottomSheetViewedEvent(mxSrpAddSubs)
        }
    }

    fun setEventPictureExists(imgUrl: String?): Boolean {
        if (imgUrl.isNullOrEmpty()) return false
        try {
            return imgUrl.contains("http")

        } catch (ex: NullPointerException) {
            ex.printStackTrace()
        }
        return true
    }

    fun eventSendSrpViewSubsBottomSheetViewedEvent(
        selectedMedicineDetails: ProductInfoModel?,
        index: Int
    ) {
//        var mxClickedSuggestionType=""
        viewModelScope.launch(IO) {
            val mxClickedSuggestionType =
                localDbUseCase.getKeyValueFromSearchCategoryIgnoreCase(clickedSuggestionType.trim())
            val subsSaving =
                selectedMedicineDetails?.product?.subsSavingPercentage?.replace("%", "")?.toDouble()

            sdkEventUseCase.sendSrpViewSubsBottomSheetViewedEvent(
                MxSrpAddSubBottomSheetViewed(
                    clickedSuggestionType = mxClickedSuggestionType,
                    orgMrp = selectedMedicineDetails?.product?.mrp,
                    orgProductDiscountPercentage = selectedMedicineDetails?.product?.discount,
                    orgProductId = selectedMedicineDetails?.product?.productCode,
                    orgProductName = selectedMedicineDetails?.product?.skuName,
                    orgProductPictureExists = (selectedMedicineDetails?.product?.productImageUrl
                        ?: "").startsWith("http"),
                    orgSalePrice = selectedMedicineDetails?.product?.sellingPrice,
                    packSizeDifference = /*selectedMedicineDetails?.product?.packSize*/calculatePackSizeDiff(
                        selectedMedicineDetails?.product?.packSize,
                        selectedMedicineDetails?.suggestion?.packSize
                    ),
                    resultPosition = index + 1,
                    subsDiscountPercentage = selectedMedicineDetails?.suggestion?.discount,
                    subsMrp = selectedMedicineDetails?.suggestion?.mrp,
                    subsProductId = selectedMedicineDetails?.suggestion?.productCode,
                    subsProductName = selectedMedicineDetails?.suggestion?.skuName,
                    subsProductPictureExists = (selectedMedicineDetails?.suggestion?.productImageUrl
                        ?: "").startsWith("http"),
                    subsSalePrice = selectedMedicineDetails?.suggestion?.sellingPrice,
                    subsSavings = subsSaving,
                    substituteAvailable = selectedMedicineDetails?.suggestion?.availabilityStatus.isNullOrEmpty(),
                    termSearched = searchQuery.value,
                )
            )
        }
    }

    fun sendSearchSuggestionImpressionEvent(exitAction: String) {
        if (lastVisibleItemPosition > 0) {
            if (!searchSuggestionList.value.isNullOrEmpty()) {
                for (i in 0 until min(lastVisibleItemPosition, searchSuggestionList.value?.size?:0)) {
                    try {
                        val result = searchSuggestionList.value!![i]
                        //suggestion_term_clicked,elasticSearchType
                        sdkEventUseCase.sendSearchSuggestionImpressionEvent(
                            MxSearchSuggestionImpression(
                                termSearched = searchQuery.value,
                                suggestionTermClicked = result.text,
                                clickedSuggestionType = if (result.inSection.isNullOrEmpty()) "in sku" else result.inSection,
                                exitAction = exitAction,
                                termSearchedCharCount = searchQuery.value?.length,
                                clickedSuggestionPosition = i + 1,
                                resultFoundCount = searchResultList.value?.size,
                                impressionType = "main",
                                rt = if(result.rt==null) null else result.rt.toString(),
                                qc = result.qc,
                                isRecentlySearched = recentlySearchedList.value?.isNotEmpty(),
                                isPreviouslyViewed = previouslyViewedList.value?.isNotEmpty(),
                                timeTaken = timeTakenInMs.toLong()
                            )
                        )
                    } catch (_: Exception) {
                    }
                }
            }
        }
    }

    fun sendItem_searched(mxItemSearched: MxItemSearched) {
        viewModelScope.launch(IO) {
            if (!mxTermSearchedTriggered) {

                if (mxItemSearched.clickedSuggestionType.isNullOrEmpty())
                    mxItemSearched.clickedSuggestionType = null
                else {
                    if (!mxItemSearched.clickedSuggestionType.equals(
                            ElasticSearchType.ORIGINAL_SKU_NAME.toString()
                        )
                    ) {
                        mxItemSearched.clickedSuggestionType =
                            localDbUseCase.getKeyValueFromSearchCategoryIgnoreCase(
                                mxItemSearched.clickedSuggestionType ?: ""
                            )
                    } else {
                        mxItemSearched.clickedSuggestionType = "in sku"
                    }
                }

                mxItemSearched.timestamp = System.currentTimeMillis()
                mxItemSearched.suggestionTermClicked =
                    if (suggestion_term_clicked.isNullOrEmpty()) null else suggestion_term_clicked
                sdkEventUseCase.sendItemSearchedEvent(mxItemSearched)
                mxTermSearchedTriggered = true
                mxTermSearchTriggeredFor = mxItemSearched.termSearched ?: ""
                suggestion_term_clicked = null
            }
        }
    }

    fun eventSendSrpViewedEvent() {
//        var mxClickedSuggestionType=""
        viewModelScope.launch(IO) {
            //mxClickedSuggestionType =/*viewModelScope.launch(Dispatchers.IO) {
            var mxClickedSuggestionType =
                localDbUseCase.getKeyValueFromSearchCategoryIgnoreCase(clickedSuggestionType)

            var resultListEvent: ArrayList<String> = arrayListOf()
            var resultsViewedEvent: ArrayList<String> = arrayListOf()

            var suggestionTermClicked = searchQuery.value
            var suggestionTermClickedPosition = suggestion_term_clicked_position

            var whId = SharedPrefManager.getInstance().selectedWarehouseID

            if (searchResultList.value != null) {
                val srpList = searchResultList.value!!
                for (srpItem in srpList) {
                    resultListEvent.add(srpItem.product?.skuName ?: "")
                }
            }


            var lstVisibleItemPos = visibleItemCount
            if (lstVisibleItemPos < 1) {
                lstVisibleItemPos =
                    if (searchResultList.value != null && (searchResultList?.value?.size
                            ?: 0) < 4
                    ) {
                        searchResultList?.value?.size ?: 0
                    } else {
                        4
                    }
            }
            for (i in 0..<lstVisibleItemPos) {
                resultsViewedEvent.add(searchResultList.value?.get(i)?.product?.skuName ?: "")
            }

            val mixPanelData = MxSrpViewed(
                if (mxClickedSuggestionType.isNullOrEmpty()) "in sku" else mxClickedSuggestionType,
                if (selectedItemQC.isNullOrEmpty()) null else selectedItemQC,
                resultListEvent,
                resultsViewedEvent,
                if (selectedItemRT.isNullOrEmpty()) null else selectedItemRT,
                suggestionTermClicked,
                suggestionTermClickedPosition,
                if (mxTermSearched.isNullOrEmpty()) null else mxTermSearched,//if (searchQuery.value.isNullOrEmpty()) null else searchQuery.value,
                whId
            )

            sdkEventUseCase.sendSrpViewedEvent(
                mixPanelData
            )
        }
    }


    private fun checkProductInList(list: List<RecentMedicine>?, name: String): Boolean {
        var exists = false
        if (!list.isNullOrEmpty()) {
            for (result in list) {
                if (result.medicineName.equals(name, ignoreCase = true)) {
                    exists = true
                    break
                }
            }
        }
        return exists
    }


    fun sendFtcCounterStarted(timestamp: Long) {
        val mxUrgencyTimerStarted = MxUrgencyTimerStarted(
            DateUtils.convertMillisToSeconds(
                DateUtils.convertEpochTimeStampToDateMillis(
                    timestamp,
                    System.currentTimeMillis()
                )
            )
        )
        sdkEventUseCase.sendFtcTimerStartedEvent(mxUrgencyTimerStarted)
    }

    fun calculateBillDetailsAfterCouponApplied(orderId: Long) = viewModelScope.launch {
        orderFlowUseCase.calculateBillDetailsforApp(mxInternalErrorOccurred, orderId, true)
            .let { bill ->
                if (bill != null) {
                    billDetailsData = bill.responseData
                    bill?.responseData?.let {

                        Log.e("card_dataaaa::::", "6666:::" + bill?.responseData!!.toString())
                        SharedPrefManager.getInstance().accountTmCredit =(it.tmCredit?:0f).toFloat()
                        SharedPrefManager.getInstance().setCurrentOrderAmountDetails(
                            (it.tmCash ?: 0.0).toFloat(),
                            (it.tmCredit ?: 0.0).toFloat(),
                            (it.deliveryCharge ?: 0.0).toFloat(),
                            // (it.couponDiscountAmt ?: 0.0).toFloat(),
                            (it.couponAppliedAmt ?: 0.0).toFloat(),
                            (it.packagingCharge ?: 0.0).toFloat(),
                            (it.payableAmt ?: 0.0).toFloat(),
                            (it.couponDiscountAmt ?: 0.0).toFloat(),
                            (it.discount ?: 0.0).toFloat(),
                            (it.mrp ?: 0.0).toFloat()

                        )



                        SharedPrefManager.getInstance().setCouponDiscount(
                            it.couponAppliedAmt?.toFloat() ?: 0f
                        )

                        setCartCount()
                    }
                }
            }
    }
}