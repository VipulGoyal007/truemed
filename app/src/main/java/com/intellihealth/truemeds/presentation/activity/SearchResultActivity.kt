package com.intellihealth.truemeds.presentation.activity

import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.annotation.Nullable
import androidx.core.content.ContextCompat
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.DialogFragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.viewModelScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson
import com.intellihealth.salt.callbacks.CartsCallback
import com.intellihealth.salt.callbacks.SearchBarCallback
import com.intellihealth.salt.callbacks.StickyNotStickyNotificationCallback
import com.intellihealth.salt.constants.CartsConstants
import com.intellihealth.salt.models.NotificationButton
import com.intellihealth.salt.models.NotificationPosition
import com.intellihealth.salt.models.NotificationType
import com.intellihealth.salt.models.StickyNonStickyNotificationModel
import com.intellihealth.salt.views.Toast
import com.intellihealth.salt.views.cards.ActionCardCallback
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.callback.OrgSubCompareBottomSheetCallback
import com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse
import com.intellihealth.truemeds.data.model.coupon.CouponSaveRemoveResponse
import com.intellihealth.truemeds.data.model.home.ApplyCouponBottomSheetModel
import com.intellihealth.truemeds.data.model.mixpanel.MxLoginPageViewed
import com.intellihealth.truemeds.data.model.orderflow.MedicineDto
import com.intellihealth.truemeds.data.utils.MESSAGES
import com.intellihealth.truemeds.databinding.ActivityReturnRefundWebBinding
import com.intellihealth.truemeds.databinding.ActivitySearchResultBinding
import com.intellihealth.truemeds.domain.enums.Coupon
import com.intellihealth.truemeds.domain.enums.ElasticSearchType
import com.intellihealth.truemeds.domain.navigation.navigateToCartActivity
import com.intellihealth.truemeds.domain.navigation.navigateToOrderSummaryActivity
import com.intellihealth.truemeds.domain.navigation.navigateToProductDetailActivity
import com.intellihealth.truemeds.domain.navigation.navigateToSearchSuggestionActivity
import com.intellihealth.truemeds.mvvm.data.appsflyer.AFLoginPageViewed
import com.intellihealth.truemeds.mvvm.viewmodel.CountDownTimerViewModel
import com.intellihealth.truemeds.presentation.bottomsheet.SubsBottomSheet
import com.intellihealth.truemeds.presentation.bottomsheet.home.ApplyCouponBottomSheet
import com.intellihealth.truemeds.presentation.bottomsheet.login.LoginBottomSheet
import com.intellihealth.truemeds.presentation.bottomsheet.productdetail.OrgSubCompareBottomSheet
import com.intellihealth.truemeds.presentation.callbacks.ApplyCouponCallback
import com.intellihealth.truemeds.presentation.callbacks.PopUpDialogCallback
import com.intellihealth.truemeds.presentation.dialog.CouponApplySuccess
import com.intellihealth.truemeds.presentation.dialog.CouponErrorPopup
import com.intellihealth.truemeds.presentation.dialog.CouponSavingPopUp
import com.intellihealth.truemeds.presentation.model.ProductInfoModel
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.utils.CommonFunc
import com.intellihealth.truemeds.presentation.utils.getVisibleViewIndexOnBasisOfHeight
import com.intellihealth.truemeds.presentation.utils.viewBinding
import com.intellihealth.truemeds.presentation.viewmodel.CouponViewModel
import com.intellihealth.truemeds.presentation.viewmodel.SearchViewModel
import com.intellihealth.truemeds.presentation.viewmodel.events.Event
import com.intellihealth.truemeds.presentation.viewmodel.events.EventObserver
import com.truecaller.android.sdk.oAuth.TcSdk
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.json.JSONException


@AndroidEntryPoint
class SearchResultActivity : BaseActivityWithLogin() {
    private val viewModel by lazy { ViewModelProvider(this)[SearchViewModel::class.java] }
    private val couponViewModel by lazy { ViewModelProvider(this)[CouponViewModel::class.java] }
    private val ftcViewModel: CountDownTimerViewModel by lazy { ViewModelProvider(this)[CountDownTimerViewModel::class.java] }
    private val binding by viewBinding(ActivitySearchResultBinding::inflate)
    var lastVisibleItemPosition = 0
    private lateinit var couponSavingPopUp: CouponSavingPopUp
    lateinit var searchText: String
    lateinit var searchType: String
    lateinit var clickedSuggestionType: String
    var qcEvent: String? = null
    var rtEvent: String? = null
    lateinit var term_searched: String
    var suggestion_term_clicked_position: Int = 0
    var suggestion_term_clicked: String? = null
    var elasticSearchType: String? = null
    var isMultiSearch: Boolean = false
    var orgSubCompareFragment = OrgSubCompareBottomSheet().newInstance()
    var subCompareFragment = SubsBottomSheet().newInstance()
    private var applyCouponCallBack: ApplyCouponCallback? = null
    var dialog: DialogFragment? = null
    private lateinit var bottomSheet: LoginBottomSheet
    override fun extractIntentData() {

        intent.extras?.let { bundle ->
        searchText = bundle.getString(BundleConstants.SEARCH_TEXT)?.trim() ?: ""
        searchType = bundle.getString(BundleConstants.SEARCH_TYPE) ?: "ORIGINAL_SKU_NAME"
        isMultiSearch = bundle.getBoolean(BundleConstants.SEARCH_IS_MULTI_SEARCH, false)

        if (bundle.containsKey(BundleConstants.BUNDLE_KEY_ITEM_QC)) {
            qcEvent = bundle.getString(BundleConstants.BUNDLE_KEY_ITEM_QC) ?: ""
            viewModel.selectedItemQC =
                bundle.getString(BundleConstants.BUNDLE_KEY_ITEM_QC).toString()
        }
        if (bundle.containsKey("item_rt")) {
            rtEvent = bundle.getString(BundleConstants.BUNDLE_KEY_ITEM_RT) ?: ""
            viewModel.selectedItemRT =
                bundle.getString(BundleConstants.BUNDLE_KEY_ITEM_RT).toString()
        }
        term_searched = bundle.getString(BundleConstants.BUNDLE_KEY_TERM_SEARCHED) ?: ""
        suggestion_term_clicked =
            bundle.getString(BundleConstants.BUNDLE_KEY_SUGGESTION_TERM_CLICKED) ?: ""
        suggestion_term_clicked_position =
            bundle.getInt(BundleConstants.BUNDLE_KEY_SUGGESTION_TERM_CLICKED_POSITION, 0)
        viewModel.selectedItemQC = bundle.getString(BundleConstants.BUNDLE_KEY_ITEM_QC) ?: ""
        viewModel.selectedItemRT = bundle.getString(BundleConstants.BUNDLE_KEY_ITEM_RT) ?: ""
        viewModel.term_searched =
            bundle.getString(BundleConstants.BUNDLE_KEY_TERM_SEARCHED) ?: ""
        viewModel.mxTermSearched =
            bundle.getString(BundleConstants.BUNDLE_KEY_TERM_SEARCHED) ?: ""
        viewModel.suggestion_term_clicked_position =
            bundle.getInt(BundleConstants.BUNDLE_KEY_SUGGESTION_TERM_CLICKED_POSITION, 0)
        viewModel.suggestion_term_clicked =
            bundle.getString(BundleConstants.BUNDLE_KEY_SUGGESTION_TERM_CLICKED) ?: ""
        clickedSuggestionType =
            bundle.getString(BundleConstants.BUNDLE_KEY_CLICKED_SUGGESTION_TYPE).toString()
        viewModel.clickedSuggestionType =
            bundle.getString(BundleConstants.BUNDLE_KEY_CLICKED_SUGGESTION_TYPE).toString()


        viewModel.clickedOnPage =
            bundle.getString(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE) ?: ""
    }

        //event integration parameters value set here
        /*qcEvent = intent.getStringExtra(BundleConstants.BUNDLE_KEY_ITEM_QC) ?: ""
        rtEvent = intent.getStringExtra(BundleConstants.BUNDLE_KEY_ITEM_RT) ?: ""*/

        //        viewModel.clickedSuggestionType = searchType
//
//        if (viewModel.clickedSuggestionType == "") "ORIGINAL_SKU_NAME" else viewModel.clickedSuggestionType
//        if (viewModel.clickedSuggestionType=="ORIGINAL_SKU_NAME") {
//            viewModel.clickedSuggestionType = "ORIGINAL_MOTHER_BRAND"
//        }
    }
    override fun sendLoginPageViewedEvent() {
        val mxLoginPageViewed = MxLoginPageViewed(
            "search_resul_page",
            "proceed_to_cart",
            viewModel.isTruecaller
        )
        val afLoginPageViewed = AFLoginPageViewed(viewModel.isTruecaller)
        viewModel.loginPageViewedEvent(mxLoginPageViewed, afLoginPageViewed)
    }

    override fun setIsTruecaller(isTruecaller: Boolean) {
        viewModel.isTruecaller = isTruecaller
    }

    override fun getTrueCallerUserDetails() {
        viewModel.currentPageNameForSignup = "search_resul_page"
        viewModel.getTrueCallerUserDetails(
            textAuthorizationCode = "authorization_code",
            clientId = resources.getString(R.string.truecaller_client_id),
            authorizationCode,
            codeVerifier,
            this@SearchResultActivity
        )
    }

    override fun openLoginBottomSheet() {
        bottomSheet = LoginBottomSheet("search_result_page", pageSection)
        bottomSheet.isCancelable = false
        if (!bottomSheet.isVisible)
            bottomSheet.show(supportFragmentManager, "LocationBottomSheet")
    }

    override fun closeLoginBottomSheet() {
        if (this::bottomSheet.isInitialized && bottomSheet.isVisible) {
            bottomSheet.dismiss()
        }
    }


    override fun onPause() {
        super.onPause()

        lifecycleScope.launch {
            try {
                for (i in 0..lastVisibleItemPosition) {
                    viewModel.searchResultList.value?.get(i)?.let { pim ->
                        viewModel.sendItemImpressionEvent(
                            pim,
                            "srp",
                            "tray",
                            i + 1,
                            null,
                            i + 1,
                            0,
                            0.0,
                            suggestionTermClicked = suggestion_term_clicked,
                            termSearched = term_searched
                        )
                    }
                }
            } catch (e: Exception) {
                Log.d("TAG", "onPause: ${e.printStackTrace()}")
            }
        }
        viewModel.srpViewTriggered = false
        viewModel.lastScreenName = "SRP"

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        extractIntentData()

        viewModel.setMedicineListDataReceived()

        setContentView(binding.root)

        binding.viewmodel = viewModel
        binding.couponViewModel = couponViewModel
        binding.lifecycleOwner = this

        binding.headerChip.setCartCount(viewModel.cartItemCount.value!!)

        binding.searchText = searchText
//        binding.tvResultMessage.text = resultMessage
        lifecycle.addObserver(viewModel)

        updateStatusBarColor()
        initializeData()
        setEventListeners()
        setListenerObserver()


        viewModel.eventSendFtcCounterStarted.observe(this) {
            if (it > 0L) viewModel.sendFtcCounterStarted(
                it
            )
        }

    }

    /*
        private fun openCouponBottomSheets(coupon: CouponCodeResponse2.Coupon) {

            val callback = object : PopUpDialogCallback {

                override fun onActionButtonClicked() {
                    couponSavingPopUp.dismiss()
                }

                override fun onCloseButtonClicked() {
                    TODO("Not yet implemented")
                }
            }

            couponSavingPopUp = CouponSavingPopUp("", 0.0, "", callback)


             applyCouponCallBack = object : ApplyCouponCallback {
                override fun applyCouponButtonClick() {
                    Toast().showCustomToastMessage(this@SearchResultActivity, "apply coupon clicked ")
                    couponSavingPopUp.show(
                        this@SearchResultActivity.supportFragmentManager,
                        "PurchaseConfirmationDialog.TAG"
                    )
                }

                override fun applyCouponButtonClick(couponCodeResponse: CouponCodeResponse2.Coupon) {
                    openCouponBottomSheets(couponCodeResponse)
                }

                override fun removeCouponButtonClick() {
                    Toast().showCustomToastMessage(this@SearchResultActivity, "remove coupon clicked ")
                }

                override fun removeCouponButtonClick(couponCodeResponse: CouponCodeResponse2.Coupon) {
                }
            }

            var applyCouponBottomSheet: ApplyCouponBottomSheet? = null
            applyCouponBottomSheet =
                ApplyCouponBottomSheet(coupon, applyCouponCallBack)

            applyCouponBottomSheet.isCancelable = true
            applyCouponBottomSheet.openBottomSheet(false, 35, 6)
            if (!applyCouponBottomSheet.isVisible)
                applyCouponBottomSheet.show(
                    this.supportFragmentManager, "ApplyCouponBottomSheet"
                )
        }
    */

    private fun setupApplyCouponData(): ApplyCouponBottomSheetModel {

        val couponData = viewModel.notificationDetailData.value
        var couponModel: ApplyCouponBottomSheetModel? = null
        if (couponData != null) {
            couponModel = ApplyCouponBottomSheetModel(
                couponData.coupon_code,
                couponData.coupon_code_title,
                couponData.coupon_code_description,
                "Apply Coupon",
                "Ends in 20m:05s",
                false,
                "",
                "",
                "",
                "",
                null
            )
        }
        return couponModel!!

    }

    private fun setEventListeners() {

        binding.actionPharmacist.setCallback(object : ActionCardCallback {
            override fun viewClickCallback(type: Int) {
                callCustomerCareIntent()
                viewModel.eventCallPharmacistClickedEvent()
            }

            override fun viewCopyClick(type: Int) {
                // TODO("Not yet implemented")
            }

        })

        binding.searchBar.setCallBack(object : SearchBarCallback {
            override fun onClearClick() {//cross cta
//                sendSearchResultViewedEvent()

                /*val sIntent = when {
                    !intent.getBooleanExtra("isFromBanner", false) -> {
                        Intent()
                    }

                    intent.getBooleanExtra("isFromBanner", false) -> {
                        Intent(this@SearchResultActivity, SearchSuggestionActivity::class.java)
                    }

                    else -> {
                        Intent(this@SearchResultActivity, SearchSuggestionActivity::class.java)
                    }
                }

                //val intent = Intent()
                sIntent.putExtra("clear_search", true)
                    .putExtra("requestTextFocus", true)
                    .putExtra(BundleConstants.BUNDLE_KEY_SCREEN_NAME, "SRP")
                    .putExtra("_isSearchMedicineVisible", false)
                    .putExtra(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE, "search_result")
                    .putExtra(BundleConstants.BUNDLE_KEY_PAGE_SECTION, "search_bar")
                    .addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)


                when {
                    !intent.getBooleanExtra("isFromBanner", false) -> {
                        setResult(1001, sIntent)
                    }

                    intent.getBooleanExtra("isFromBanner", false) -> {
                        startActivity(sIntent)
                    }

                    else -> {
                        startActivity(sIntent)
                    }
                }*/


                val paramsData = bundleOf(
                    "clear_search" to true,
                    "requestTextFocus" to true,
                    BundleConstants.BUNDLE_KEY_SCREEN_NAME to "SRP",
                    "_isSearchMedicineVisible" to false,
                     BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "search_result",
                    BundleConstants.BUNDLE_KEY_PAGE_SECTION to "search_bar"
                )


                when {
                    !intent.extras?.getBoolean("isFromBanner", false)!! -> {
                        // setResult(1001, sIntent)
                        setResult(1001, Intent())
                    }

                    intent.extras?.getBoolean("isFromBanner", false)!! -> {
                        //startActivity(sIntent/*.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)*/)
                        navigateToSearchSuggestionActivity(params = paramsData,flags= listOf(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT))
                    }

                    else -> {
                        //startActivity(sIntent)
                        navigateToSearchSuggestionActivity(params = paramsData,flags= listOf(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT))
                    }
                }

                finish()
            }

            override fun onIconClick() {//back cta
//                sendSearchResultViewedEvent()
                val intent = Intent()
                intent.putExtra("clear_search", false)
                    .putExtra("requestTextFocus", true)
                    .putExtra("_isSearchMedicineVisible", false)
                    .putExtra(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE, "search_result")
                    .putExtra(BundleConstants.BUNDLE_KEY_PAGE_SECTION, "search_bar")
                setResult(1001, intent)
                finish()
            }

            override fun onViewClick() {//et cta
//                sendSearchResultViewedEvent()
         /*       val sIntent = when {
                    !intent.getBooleanExtra("isFromBanner", false) && searchText.isNotEmpty() -> {
                        Intent()
                    }

                    intent.getBooleanExtra("isFromBanner", false) && searchText.isNotEmpty() -> {
                        Intent(this@SearchResultActivity, SearchSuggestionActivity::class.java)
                    }

                    else -> {
                        Intent(this@SearchResultActivity, SearchSuggestionActivity::class.java)
                    }
                }*/




               /* sIntent.putExtra("clear_search", true)
                sIntent.putExtra("requestTextFocus", true)
                sIntent.putExtra("_isSearchMedicineVisible", false)
                sIntent.putExtra(BundleConstants.BUNDLE_KEY_SCREEN_NAME, "SRP")
                if (searchText.isNotEmpty()) sIntent.putExtra(
                    "searchText",
                    searchText.ifEmpty { null })
                sIntent.putExtra(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE, "search_result")
                sIntent.putExtra(BundleConstants.BUNDLE_KEY_PAGE_SECTION, "search_bar")
                sIntent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)*/


                val paramsData = bundleOf(
                    "clear_search" to true,
                    "requestTextFocus" to true,
                    "_isSearchMedicineVisible" to false,
                    BundleConstants.BUNDLE_KEY_SCREEN_NAME to "SRP",
                    if (searchText.isNotEmpty()) "searchText" to searchText.ifEmpty { null } else "searchText" to null,// need to check
                    BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "search_result",
                    BundleConstants.BUNDLE_KEY_PAGE_SECTION to "search_bar"
                )


                when {
                    !intent.extras?.getBoolean("isFromBanner", false)!! && searchText.isNotEmpty() -> {
                       // setResult(1001, sIntent)
                        setResult(1001, Intent())
                    }

                    intent.extras?.getBoolean("isFromBanner", false)!! && searchText.isNotEmpty() -> {
                        //startActivity(sIntent/*.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)*/)
                        navigateToSearchSuggestionActivity(params = paramsData,flags= listOf(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT))
                    }

                    else -> {
                        //startActivity(sIntent)
                        navigateToSearchSuggestionActivity(params = paramsData,flags= listOf(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT))
                    }
                }

                finish()
            }
        })

        binding.headerChip.setOnClickListener {
            viewModel.onViewCartClicked("toolbar_cart")
        }

        val stickyNotStickyNotificationCallback = object : StickyNotStickyNotificationCallback {
            override fun onButtonClick(notificationType: StickyNonStickyNotificationModel) {
                Toast().showCustomToastMessage(
                    this@SearchResultActivity,
                    notificationType.buttonText
                )
            }

            override fun onViewClick(notificationType: StickyNonStickyNotificationModel) {

            }

        }

        binding.promoCard.setNotificationCallback(stickyNotStickyNotificationCallback)


        binding.cartView.setCallback(object : CartsCallback {
            override fun viewClickCallback(viewType: CartsConstants) {
                when (viewType) {
                    CartsConstants.VIEW_CART -> {
                        viewModel.onViewCartClicked("view_cart")
                    }

                    CartsConstants.VIEW_BILL -> {}

                    CartsConstants.PROCEED -> {}
                }
            }

        })

        binding.rvSearchResult.addOnScrollListener(object :
            RecyclerView.OnScrollListener() {
            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                super.onScrollStateChanged(recyclerView, newState)
            }

            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)
                if (recyclerView.adapter != null) {
                    val layoutManager = recyclerView.layoutManager as LinearLayoutManager?
                    val firstVisiblePosition = layoutManager!!.findFirstVisibleItemPosition()
                    val lastVisiblePosition = layoutManager.findLastCompletelyVisibleItemPosition()
                    val view = layoutManager.findViewByPosition(lastVisiblePosition)
                    if (lastVisiblePosition == viewModel.searchResultList.value!!
                            .size - 1 && viewModel.searchResultList.value!!
                            .size >= 20 && !viewModel.isLoadingMore && !viewModel.stopPagging
                    ) {
                        viewModel.isLoadingMore = true
                        viewModel.loadMoreResults(true)
                    }
                    if (lastVisibleItemPosition <= lastVisiblePosition) {
                        lastVisibleItemPosition =
                            getVisibleViewIndexOnBasisOfHeight(view, lastVisiblePosition)
                    }
                }
            }
        })

    }

    /*fun callNow(number: String?) {
        try {
            if (!TextUtils.isEmpty(number)) {
                val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", number, null))
                startActivity(intent)
            } else {
                Toast().showCustomToastMessage(
                    this@SearchResultActivity,
                    "Something went wrong"
                )
            }
        } catch (ignore: java.lang.Exception) {
        }
    }*/

    /*fun sendSearchResultViewedEvent(){
        viewModel.clickedOnPage = "search_result"
        viewModel.pageSection = "search_bar"
        viewModel.eventSendSearchViewedEvent()
    }*/


    private fun setListenerObserver() {

//        viewModel.searchSuggestionList.observe(this) {
//            if (it != null && it.isNotEmpty())
//                viewModel.updateUIState()
//        }
        //offer coupon apply
        applyCouponCallBack = object : ApplyCouponCallback {
            override fun applyCouponButtonClick() {
                Toast().showCustomToastMessage(this@SearchResultActivity, "apply coupon clicked ")
                couponSavingPopUp.show(
                    supportFragmentManager, "PurchaseConfirmationDialog.TAG"
                )
            }

            override fun applyCouponButtonClick(couponCodeResponse: CouponCodeResponse.Coupon?) {
//                Toast().showCustomToastMessage(this@HomePageActivity, "apply coupon clicked with response ${Gson().toJson(couponCodeResponse)}")
                if (SharedPrefManager.getInstance().incompleteOrderId > 0) {
                    viewModel.setCartCount()
                    viewModel.applyCouponClick(couponCodeResponse)
                } else {
                    Log.e("currentPayableAmount", "::::" + viewModel.cartModel.value?.amount)
                    viewModel.calculateSavingAmount(
                        couponCodeResponse,
                        viewModel.cartModel.value?.amount ?: 0.0
                    )
                }
            }

            override fun removeCouponButtonClick() {
                Toast().showCustomToastMessage(this@SearchResultActivity, "remove coupon clicked ")
            }

            override fun removeCouponButtonClick(couponCodeResponse: CouponCodeResponse.Coupon?) {
                couponCodeResponse?.offerId.let { offerID ->
                    Log.d("TAG", "removeCouponButtonClick: $offerID")
                    binding.promoCard.setStickyUI(
                        type = NotificationType.APPLY_COUPON.type,
                        position = NotificationPosition.TOP.position,
                        isButtonVisible = NotificationButton.DISABLED.status
                    )
                    if (SharedPrefManager.getInstance().incompleteOrderId > 0) {
                        viewModel.removeCouponClick(couponCodeResponse)
                    } else {
                        viewModel.callCouponRemovedEventForOfflineCouponCase(
                            viewModel.billDetailsData,
                            "search_result",
                            couponCodeResponse,
                            0
                        )
                        SharedPrefManager.getInstance().offerId = "0"
                        SharedPrefManager.getInstance().couponModel = null
                        SharedPrefManager.getInstance().setFtcVariantCCouponExpiryTimeRestart(0)
                        Log.d(
                            "Intent",
                            "onCreate: setParameter call 10000:::" + SharedPrefManager.getInstance().couponDiscount.toDouble()
                        )

                        SharedPrefManager.getInstance().setCouponDiscount(0f)
                        viewModel.setCartCount()
                        viewModel.stopCouponTimer()
                        stickyNotificationWithCallBack(couponCodeResponse, "")
                    }
                }
            }
        }



        viewModel.getEventSendSrpEvent()!!.observe(this) { objectEvent ->
            try {
                if (!viewModel.srpViewTriggered) {
                    val layoutManager =
                        binding.rvSearchResult.layoutManager as LinearLayoutManager?
                    viewModel.visibleItemCount =
                        layoutManager!!.findLastVisibleItemPosition() + 1 // - layoutManager.findFirstVisibleItemPosition();

                    Log.e("case::::", "111111::::yesss")
                    viewModel.eventSendSrpViewedEvent()
                    viewModel.srpViewTriggered = true
                }

            } catch (e: JSONException) {
                e.printStackTrace()
            }
        }



        viewModel.ftcCouponData.observe(this@SearchResultActivity) {
            if (it == null) {
                binding.promoCard.visibility = View.GONE
            }
            it?.let {
                Log.d(
                    "TAG",
                    "setListener: maxDis = ${it.maxDiscount} nosrp = ${viewModel.searchResultList.value?.size} "
                )
                if (SharedPrefManager.getInstance()?.couponModel?.showFtcCounter != null && SharedPrefManager.getInstance()?.couponModel?.showFtcCounter == true && SharedPrefManager.getInstance()?.couponModel?.promoCode == it.promoCode) {
                    if (SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime - System.currentTimeMillis() > 0L) {
                        viewModel.startTimer(
                            Coupon.ENDS_IN.prefix,
                            SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime ?: 0L
                        ) { time ->
                            if (time != getString(R.string.timer_ends_string)) {
                                runOnUiThread {
                                    stickyNotificationWithCallBack(it, time)
                                }
                            } else {
                                viewModel.stopCouponTimer()
                                runOnUiThread {
                                    stickyNotificationWithCallBack(it, "")
                                }
                            }
                        }
                    } else {
                        viewModel.stopCouponTimer()
                        stickyNotificationWithCallBack(it, "")
                    }
                } else {
                    viewModel.stopCouponTimer()
                    stickyNotificationWithCallBack(it, "")
                }
                viewModel.urgencyStickyViewedEvent(it)
            }
        }
        viewModel.eventOpenCouponPopup.observe(this, EventObserver {
            if (SharedPrefManager.getInstance().incompleteOrderId > 0) {
                viewModel.viewModelScope.launch(Dispatchers.IO) {
                    viewModel.calculateBillDetailsAfterCouponApplied(
                        SharedPrefManager.getInstance().incompleteOrderId
                    )
                }
            }


            if (it.second?.message.equals("Success")) {
                if (it.second?.responseData?.isOfferApplied == true) {
                    //SharedPrefManager.getInstance().offerId = it.first.offerId.toString()
                    SharedPrefManager.getInstance().couponModel = it.first
                    Log.d(
                        "Intent",
                        "onCreate: setParameter call 11:::" + SharedPrefManager.getInstance().couponDiscount.toDouble()
                    )

                    /*SharedPrefManager.getInstance()
                        .setCouponDiscount(it.second?.responseData?.couponDiscount?.toFloat() ?: 0f)*/
                    viewModel.setCartCount()
                    if (it.first.expiryDate!! > 0 && it.first.showFtcCounter!!) {
                        //SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime = it.first.currentDate!!.toLong()
                        SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime =
                            System.currentTimeMillis()
                        it.first.expiryDate =
                            SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime
                        Log.i("expiryDate", "" + it.first.expiryDate)
                        Log.i("expiryDate", "" + it.first.currentDate!!.toLong())
                    }
                    if (SharedPrefManager.getInstance().couponModel.showFtcCounter != null && SharedPrefManager.getInstance()?.couponModel?.showFtcCounter == true) {
                        if (SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime - System.currentTimeMillis() > 0L) {
                            viewModel.startTimer(
                                Coupon.ENDS_IN.prefix,
                                SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime ?: 0L
                            ) { time ->
                                if (time != getString(R.string.timer_ends_string)) {
                                    runOnUiThread {
                                        stickyNotificationWithCallBack(it.first, time)
                                    }
                                } else {
                                    viewModel.stopCouponTimer()
                                    runOnUiThread {
                                        stickyNotificationWithCallBack(it.first, "")
                                    }
                                }
                            }
                        } else {
                            viewModel.stopCouponTimer()
                            stickyNotificationWithCallBack(it.first, "")
                        }

                    } else {
                        viewModel.stopCouponTimer()
                        stickyNotificationWithCallBack(it.first, "")
                    }

                    val callback = object : PopUpDialogCallback {
                        override fun onActionButtonClicked() {
                            dialog?.dismiss()
                        }

                        override fun onCloseButtonClicked() {
                            dialog?.dismiss()
                        }
                    }
                    /**
                     * This pop up is used to show savings on coupon
                     */
                    dialog = CouponApplySuccess(
                        couponCode = it.first.promoCode ?: "",
                        saving = it.second?.responseData?.couponDiscount ?: 0.0,
                        callback = callback,
                        expiryTime = it.first.expiryDate ?: 0L,
                        isFtcCounterEnabled = it.first.showFtcCounter == true,
                        description = it.second?.responseData?.description?.joinToString(separator = "\n"),
                        //description = it.second?.responseData?.description,
                        tnc = it.second?.responseData?.tnc,
                        ftcViewModel
                    )
                    (dialog as CouponApplySuccess).isCancelable = true
                    if (!(dialog as CouponApplySuccess).isVisible) {
                        dialog?.show(
                            this@SearchResultActivity.supportFragmentManager,
                            "CouponApplySuccess"
                        )
                    }
                } else {
                    openApplyCouponValidationPopup(it.first, it.second)
                }

            } else {
                val callback = object : PopUpDialogCallback {
                    override fun onActionButtonClicked() {
                        dialog?.dismiss()
                    }

                    override fun onCloseButtonClicked() {
                        dialog?.dismiss()
                    }
                }

                /**
                 * This pop up is used to show error on coupon
                 */
//                SharedPrefManager.getInstance().offerId = "0"
//                SharedPrefManager.getInstance().couponModel = null
                dialog = CouponErrorPopup(
                    couponCode = it.first.promoCode ?: "",
                    cartValue = it.first.minCartValue ?: 0,
                    message = getString(R.string.couponErrorMsg_without_dot) + (it.first.minCartValue
                        ?: 0.0) + getString(
                        R.string.couponErrorMsgAvailable
                    ),
                    callback = callback,
                )
                (dialog as CouponErrorPopup).isCancelable = true
                if (!(dialog as CouponErrorPopup).isVisible) {
                    dialog?.show(
                        this@SearchResultActivity.supportFragmentManager,
                        "CouponApplySuccess"
                    )
                }


            }
        })

        viewModel.eventOpenCouponPopupOffline.observe(this, EventObserver {
            var dialog: DialogFragment? = null
            if (it.second.isSuccess) {
                viewModel.stopCouponTimer()
                SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime =
                    System.currentTimeMillis()
                SharedPrefManager.getInstance().offerId = it.first?.offerId.toString()
                SharedPrefManager.getInstance().couponModel = it.first
                Log.d(
                    "Intent",
                    "onCreate: setParameter call 12:::" + SharedPrefManager.getInstance().couponDiscount.toDouble()
                )

                SharedPrefManager.getInstance().couponDiscount =
                    it.second.couponAppliedAmt.toFloat()
                viewModel.setCartCount()
                if (SharedPrefManager.getInstance().couponModel.showFtcCounter != null && SharedPrefManager.getInstance()?.couponModel?.showFtcCounter == true) {

                    if (SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime - System.currentTimeMillis() > 0L) {
                        viewModel.startTimer(
                            Coupon.ENDS_IN.prefix,
                            SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime ?: 0L
                        ) { time ->
                            if (time != getString(R.string.timer_ends_string)) {
                                runOnUiThread {
                                    stickyNotificationWithCallBack(it.first, time)
                                }
                            } else {
                                viewModel.stopCouponTimer()
                                runOnUiThread {
                                    stickyNotificationWithCallBack(it.first, "")
                                }
                            }
                        }
                    } else {
                        viewModel.stopCouponTimer()
                        stickyNotificationWithCallBack(it.first, "")
                    }

                } else {
                    viewModel.stopCouponTimer()
                    stickyNotificationWithCallBack(it.first, "")
                }
                val callback = object : PopUpDialogCallback {
                    override fun onActionButtonClicked() {
                        dialog?.dismiss()
                    }

                    override fun onCloseButtonClicked() {
                        dialog?.dismiss()
                    }
                }
                /**
                 * This pop up is used to show savings on coupon
                 */
                /**
                 * This pop up is used to show savings on coupon
                 */
                if (it.first?.expiryDate!! > 0 && it.first?.showFtcCounter!!) {
                    //SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime = it.first.currentDate!!.toLong()
                    SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime =
                        System.currentTimeMillis()
                    it.first?.expiryDate =
                        SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime
                    Log.i("expiryDate", "" + it.first?.expiryDate)
                    Log.i("expiryDate", "" + it.first?.currentDate!!.toLong())
                }
                SharedPrefManager.getInstance().offerId = it.first?.offerId.toString()
                SharedPrefManager.getInstance().couponModel = it.first
                dialog = CouponApplySuccess(
                    couponCode = it.first?.promoCode ?: "",
                    saving = it.second?.savingAmount ?: 0.0,
                    callback = callback,
                    expiryTime = it.first?.expiryDate ?: 0L,
                    isFtcCounterEnabled = it.first?.showFtcCounter == true,
                    description = null,
                    tnc = null,
                    ftcViewModel
                )
                dialog?.isCancelable = true
                if (!dialog?.isVisible!!) {
                    dialog?.show(
                        this@SearchResultActivity.supportFragmentManager,
                        "CouponApplySuccess"
                    )
                }

            } else {
                val callback = object : PopUpDialogCallback {
                    override fun onActionButtonClicked() {
                        dialog?.dismiss()
                    }

                    override fun onCloseButtonClicked() {
                        dialog?.dismiss()
                    }
                }

                /**
                 * This pop up is used to show error on coupon
                 */

                /**
                 * This pop up is used to show error on coupon
                 */
//                SharedPrefManager.getInstance().offerId = "0"
//                SharedPrefManager.getInstance().couponModel = null
                dialog = CouponErrorPopup(
                    couponCode = it.first?.promoCode ?: "",
                    cartValue = it.first?.minCartValue ?: 0,
                    message = it.second.message,
                    callback = callback,
                )
                dialog?.isCancelable = true
                if (!dialog?.isVisible!!) {
                    dialog?.show(
                        this@SearchResultActivity.supportFragmentManager,
                        "CouponApplySuccess"
                    )
                }


            }
        })

        viewModel.isDelete.observe(this, EventObserver {
            if (it) {
                val editList: List<MedicineDto> = viewModel.getEditOrderRequestData(
                    viewModel.selectedMedicineProductCode,
                    0
                )
                viewModel.editMedicine(
                    SharedPrefManager.getInstance().incompleteOrderId,
                    editList,
                    true,
                    "SRP"
                )
            }
        })
        viewModel.isDeleteCompleted.observe(this, EventObserver {
            if (it) {
//                viewModel.searchResultList.postValue(viewModel.searchResultList.value)
                viewModel.deleteMedicineFromCart(
                    viewModel.selectedMedicineProductCode,
                    viewModel.isSubs
                )
                viewModel.isDeleteCompleted.postValue(Event(false))
            }
        })


        viewModel.eventLaunchSearchSubsBS.observe(this, EventObserver { item ->
            try {
                if (item == null) return@EventObserver
                val bundle = Bundle()
                val model = Gson().toJson(item.products[viewModel.selectedMedicineIndex])
                bundle.putString(BundleConstants.PRODUCT_SUBS_DETAIL, model)
                bundle.putString(
                    BundleConstants.PRODUCT_SUBS_TITLE,
                    item.selectedProduct.product?.skuName
                )
                bundle.putInt(
                    BundleConstants.BUNDLE_KEY_SUGGESTION_TERM_CLICKED_POSITION,
                    suggestion_term_clicked_position
                )
                bundle.putInt(BundleConstants.POSITION, viewModel.selectedMedicineIndex)
                bundle.putString(
                    BundleConstants.BUNDLE_KEY_TERM_SEARCHED,
                    viewModel.searchQuery.value
                )
                Log.d("TAG", "setListenerObserver: ${viewModel.searchQuery.value}")
                bundle.putString(
                    BundleConstants.BUNDLE_KEY_SUGGESTION_TERM_CLICKED,
                    viewModel.suggestion_term_clicked
                )
                bundle.putString(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE, "search_result")

                subCompareFragment = SubsBottomSheet().newInstance()

                subCompareFragment.setUpEventData(
                    suggestion_term_clicked_position,
                    suggestion_term_clicked,
                    term_searched,
                    clickedSuggestionType
                )
                subCompareFragment.isCancelable = false
                subCompareFragment.arguments = bundle

                var isOrgAdded: String? = "false"
                if (item.selectedProduct.isOrgAddedToCart || item.selectedProduct.isSubsAddedToCart) {
                    isOrgAdded = "true"
                }

                subCompareFragment.setCallback(object :
                    OrgSubCompareBottomSheetCallback {
                    override fun closeClick(isReload: Boolean) {
                        if (isReload)
                            viewModel.reloadSearchResultList(item.products.toMutableList())
                    }

                    override fun openPDPage(productCode: String?, subs: Boolean?) {
                        /*if (subCompareFragment.isVisible)
                            subCompareFragment.dismiss()*/

                        val productInfoGson =
                            Gson().toJson(viewModel.selectedMedicineDetails)//Gson().toJson(productInfo)
              /*          startActivity(
                            Intent(this@SearchResultActivity, ProductDetailActivity::class.java)
                                .putExtra(BundleConstants.PRODUCT_CODE, productCode)
                                .putExtra(BundleConstants.IS_SUBS, true)
                                .putExtra(BundleConstants.ORG_PRODUCT_OF_SUBS, productInfoGson)
                                .putExtra(BundleConstants.IS_ORG_ADDED_TO_CART, isOrgAdded)
                                .putExtra(
                                    BundleConstants.SEARCH_TYPE,
                                    ElasticSearchType.FETCH_PRODUCT_DETAILS.toString()
                                )
                                .putExtra(BundleConstants.IS_FROM_SEARCH, true)
                                .putExtra(BundleConstants.BUNDLE_KEY_ITEM_QC, qcEvent)
                                .putExtra(BundleConstants.BUNDLE_KEY_ITEM_RT, rtEvent)
                                .putExtra(
                                    BundleConstants.BUNDLE_KEY_TERM_SEARCHED,
                                    viewModel.searchQuery.value
                                )
                                .putExtra(
                                    BundleConstants.BUNDLE_KEY_SUGGESTION_TERM_CLICKED_POSITION,
                                    suggestion_term_clicked_position
                                )
                                .putExtra(
                                    BundleConstants.BUNDLE_KEY_SUGGESTION_TERM_CLICKED,
                                    viewModel.suggestion_term_clicked
                                )
                                .putExtra(
                                    BundleConstants.BUNDLE_KEY_ELASTIC_SEARCH_TYPE,
                                    elasticSearchType
                                )
                                .putExtra(
                                    BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE,
                                    "Search_result"
                                )
                                .putExtra(
                                    BundleConstants.BUNDLE_KEY_CLICKED_SUGGESTION_TYPE,
                                    viewModel.clickedSuggestionType
                                )
                        )*/

                        navigateToProductDetailActivity(
                            params = bundleOf(
                                BundleConstants.PRODUCT_CODE to productCode,
                                BundleConstants.IS_SUBS to true,
                                BundleConstants.ORG_PRODUCT_OF_SUBS to productInfoGson,
                                BundleConstants.IS_ORG_ADDED_TO_CART to isOrgAdded,
                                BundleConstants.SEARCH_TYPE to ElasticSearchType.FETCH_PRODUCT_DETAILS.toString(),
                                BundleConstants.IS_FROM_SEARCH to true,
                                BundleConstants.BUNDLE_KEY_ITEM_QC to qcEvent,
                                BundleConstants.BUNDLE_KEY_ITEM_RT to rtEvent,
                                BundleConstants.BUNDLE_KEY_TERM_SEARCHED to viewModel.searchQuery.value,
                                BundleConstants.BUNDLE_KEY_SUGGESTION_TERM_CLICKED_POSITION to suggestion_term_clicked_position,
                                BundleConstants.BUNDLE_KEY_SUGGESTION_TERM_CLICKED to viewModel.suggestion_term_clicked,
                                BundleConstants.BUNDLE_KEY_ELASTIC_SEARCH_TYPE to elasticSearchType,
                                BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "Search_result",
                                BundleConstants.BUNDLE_KEY_CLICKED_SUGGESTION_TYPE to viewModel.clickedSuggestionType

                                )
                        )

                    }
                })


                if (!subCompareFragment.isVisible)
                    subCompareFragment.show(supportFragmentManager, "COMPARE_AND_UNDERSTAND")
                viewModel.eventSendSrpViewSubsBottomSheetViewedEvent(
                    viewModel.selectedMedicineDetails,
                    viewModel.selectedMedicineIndex
                )
            } catch (_: Exception) {
            }

        })

        viewModel.eventLaunchSearchBS.observe(this, EventObserver { item ->
            if (item != null) {
                val bundle = Bundle()
                val model = Gson().toJson(viewModel.selectedMedicineDetails)
                bundle.putString(BundleConstants.PRODUCT_ORD_SUBS_DETAIL, model)
//            bundle.putBoolean(BundleConstants.IS_SUBS, subs)
                bundle.putInt(
                    BundleConstants.BUNDLE_KEY_SUGGESTION_TERM_CLICKED_POSITION,
                    suggestion_term_clicked_position
                )
                bundle.putInt(BundleConstants.POSITION, viewModel.selectedMedicineIndex)
                bundle.putString(BundleConstants.BUNDLE_KEY_TERM_SEARCHED, viewModel.term_searched)
                bundle.putString(
                    BundleConstants.BUNDLE_KEY_SUGGESTION_TERM_CLICKED,
                    viewModel.suggestion_term_clicked
                )
                bundle.putString(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE, "search_result")

                //val productInfo = item.products[viewModel.selectedMedicineIndex]
                orgSubCompareFragment = OrgSubCompareBottomSheet().newInstance()

                orgSubCompareFragment.isCancelable = false
                orgSubCompareFragment.arguments = bundle

                var isOrgAdded: String? = "false"
                if (item.selectedProduct.isOrgAddedToCart || item.selectedProduct.isSubsAddedToCart) {
                    isOrgAdded = "true"
                }
//(suggestion_term_clicked_position: Int,
//                       suggestion_term_clicked: String?,
//                       term_searched: String?,
//                       clicked_suggestion_type: String?) {
                orgSubCompareFragment.setUpEventData(
                    suggestion_term_clicked_position,
                    suggestion_term_clicked,
                    term_searched,
                    clickedSuggestionType
                )
                orgSubCompareFragment.setCallback(object :
                    OrgSubCompareBottomSheetCallback {
                    override fun closeClick(isReload: Boolean) {
                        if (isReload)
                            viewModel.reloadSearchResultList(item.products.toMutableList())
                    }

                    override fun openPDPage(productCode: String?, subs: Boolean?) {

                        /*if (orgSubCompareFragment.isVisible) {
                            orgSubCompareFragment.dismiss()
                        }*/

                        val productInfoGson = Gson().toJson(viewModel.selectedMedicineDetails)

                      /*  startActivity(
                            Intent(this@SearchResultActivity, ProductDetailActivity::class.java)
                                .putExtra(BundleConstants.PRODUCT_CODE, productCode)
                                .putExtra(BundleConstants.IS_SUBS, subs)
                                .putExtra(BundleConstants.ORG_PRODUCT_OF_SUBS, productInfoGson)
                                .putExtra(BundleConstants.IS_ORG_ADDED_TO_CART, isOrgAdded)
                                .putExtra(
                                    BundleConstants.SEARCH_TYPE,
                                    ElasticSearchType.FETCH_PRODUCT_DETAILS.toString()
                                )
                                .putExtra(BundleConstants.IS_FROM_SEARCH, true)
                                .putExtra(BundleConstants.BUNDLE_KEY_ITEM_QC, qcEvent)
                                .putExtra(BundleConstants.BUNDLE_KEY_ITEM_RT, rtEvent)
                                .putExtra(BundleConstants.BUNDLE_KEY_TERM_SEARCHED, term_searched)
                                .putExtra(
                                    BundleConstants.BUNDLE_KEY_SUGGESTION_TERM_CLICKED_POSITION,
                                    suggestion_term_clicked_position
                                )
                                .putExtra(
                                    BundleConstants.BUNDLE_KEY_SUGGESTION_TERM_CLICKED,
                                    viewModel.suggestion_term_clicked
                                )
                                .putExtra(
                                    BundleConstants.BUNDLE_KEY_ELASTIC_SEARCH_TYPE,
                                    elasticSearchType
                                )
                                .putExtra(
                                    BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE,
                                    "Search_result"
                                )
                                .putExtra(
                                    BundleConstants.BUNDLE_KEY_CLICKED_SUGGESTION_TYPE,
                                    viewModel.clickedSuggestionType
                                )
                        )*/

                        navigateToProductDetailActivity(
                            params = bundleOf(
                                BundleConstants.PRODUCT_CODE to productCode,
                                BundleConstants.IS_SUBS to subs,
                                BundleConstants.ORG_PRODUCT_OF_SUBS to productInfoGson,
                                BundleConstants.IS_ORG_ADDED_TO_CART to isOrgAdded,
                                BundleConstants.SEARCH_TYPE to ElasticSearchType.FETCH_PRODUCT_DETAILS.toString(),
                                BundleConstants.IS_FROM_SEARCH to true,
                                BundleConstants.BUNDLE_KEY_ITEM_QC to qcEvent,
                                BundleConstants.BUNDLE_KEY_ITEM_RT to rtEvent,
                                BundleConstants.BUNDLE_KEY_TERM_SEARCHED to term_searched,
                                BundleConstants.BUNDLE_KEY_SUGGESTION_TERM_CLICKED_POSITION to suggestion_term_clicked_position,
                                BundleConstants.BUNDLE_KEY_SUGGESTION_TERM_CLICKED to viewModel.suggestion_term_clicked,
                                BundleConstants.BUNDLE_KEY_ELASTIC_SEARCH_TYPE to elasticSearchType,
                                BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "Search_result",
                                BundleConstants.BUNDLE_KEY_CLICKED_SUGGESTION_TYPE to viewModel.clickedSuggestionType

                            )
                        )
                    }
                })

                if (!orgSubCompareFragment.isVisible) supportFragmentManager.let { it1 ->
                    orgSubCompareFragment.show(it1, "OrgSubsCompareBottomsheet")
                    viewModel.eventSendSrpAddSubsBottomSheetViewedEvent(
                        viewModel.selectedMedicineDetails,
                        viewModel.selectedMedicineIndex
                    )
                }
            }
        })

        viewModel.eventLaunchPDPage.observe(this, EventObserver {
            it?.let {

              /*  val intent = Intent(this, ProductDetailActivity::class.java)
                intent.putExtra(BundleConstants.IS_SUBS, viewModel.isSubsClicked)
                intent.putExtra(BundleConstants.IS_FROM_SEARCH, true)
                intent.putExtra(BundleConstants.POSITION, viewModel.selectedMedicineIndex)
                var isOrgAdded: String? = "false"
                if (viewModel.isSubsClicked && (it.isOrgAddedToCart || it.isSubsAddedToCart)) {
                    isOrgAdded = "true"
                }
                intent.putExtra(BundleConstants.IS_ORG_ADDED_TO_CART, isOrgAdded)
                intent.putExtra(
                    BundleConstants.SEARCH_TYPE,
                    ElasticSearchType.FETCH_PRODUCT_DETAILS.toString()
                )
                if (!viewModel.isSubsClicked) {
                    //org data
                    intent.putExtra(BundleConstants.PRODUCT_CODE, it.product?.productCode)
                } else {
                    //subs data
                    intent.putExtra(BundleConstants.PRODUCT_CODE, it.suggestion?.productCode)
                    val model = Gson().toJson(viewModel.selectedMedicineDetails)
                    intent.putExtra(BundleConstants.ORG_PRODUCT_OF_SUBS, model)
                }
                intent.putExtra(BundleConstants.BUNDLE_KEY_ITEM_QC, qcEvent)
                intent.putExtra(BundleConstants.BUNDLE_KEY_ITEM_RT, rtEvent)
                intent.putExtra(BundleConstants.BUNDLE_KEY_TERM_SEARCHED, term_searched)
                intent.putExtra(
                    BundleConstants.BUNDLE_KEY_SUGGESTION_TERM_CLICKED_POSITION,
                    suggestion_term_clicked_position
                )
                intent.putExtra(
                    BundleConstants.BUNDLE_KEY_SUGGESTION_TERM_CLICKED,
                    viewModel.suggestion_term_clicked
                )
                intent.putExtra(BundleConstants.BUNDLE_KEY_ELASTIC_SEARCH_TYPE, elasticSearchType)
                intent.putExtra(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE, "Search_result")
                intent.putExtra(
                    BundleConstants.BUNDLE_KEY_CLICKED_SUGGESTION_TYPE,
                    viewModel.clickedSuggestionType
                )
                startActivity(intent)*/


                var isOrgAdded: String? = "false"
                if (viewModel.isSubsClicked && (it.isOrgAddedToCart || it.isSubsAddedToCart)) {
                    isOrgAdded = "true"
                }

                val PRODUCT_CODE = if (!viewModel.isSubsClicked) {
                    //org data
                     it.product.productCode
                } else {
                    //subs data
                    it.suggestion?.productCode
                }

                navigateToProductDetailActivity(
                    params = bundleOf(
                        BundleConstants.IS_SUBS to viewModel.isSubsClicked,
                        BundleConstants.IS_FROM_SEARCH to true,
                        BundleConstants.POSITION to viewModel.selectedMedicineIndex,
                        BundleConstants.IS_ORG_ADDED_TO_CART to isOrgAdded,
                        BundleConstants.SEARCH_TYPE to ElasticSearchType.FETCH_PRODUCT_DETAILS.toString(),
                        BundleConstants.PRODUCT_CODE to PRODUCT_CODE,
                        BundleConstants.ORG_PRODUCT_OF_SUBS to if (viewModel.isSubsClicked) Gson().toJson(viewModel.selectedMedicineDetails) else null,
                        BundleConstants.BUNDLE_KEY_ITEM_QC to qcEvent,
                        BundleConstants.BUNDLE_KEY_ITEM_RT to rtEvent,
                        BundleConstants.BUNDLE_KEY_TERM_SEARCHED to term_searched,
                        BundleConstants.BUNDLE_KEY_SUGGESTION_TERM_CLICKED_POSITION to suggestion_term_clicked_position,
                        BundleConstants.BUNDLE_KEY_SUGGESTION_TERM_CLICKED to viewModel.suggestion_term_clicked,
                        BundleConstants.BUNDLE_KEY_ELASTIC_SEARCH_TYPE to elasticSearchType,
                        BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "Search_result",
                        BundleConstants.BUNDLE_KEY_CLICKED_SUGGESTION_TYPE to viewModel.clickedSuggestionType

                    )
                )

            }
        })

        //event to initiate login
        viewModel.eventInitiateLogin.observe(
            this,
            EventObserver { initializationTrueCallerOAuth() })


        viewModel.cartItemCount.observe(this, Observer {
            binding.headerChip.setCartCount(it)
            binding.cartView.updateTotalItemsInCartCount(
                it,
                viewModel.cartTotal,
                SharedPrefManager.getInstance().prescriptionCount
            )

        })

        viewModel.eventOpenOrderSummaryActivity.observe(this,
            EventObserver {
                navigateToOrderSummaryActivity(
                    params = bundleOf(
                        BundleConstants.BUNDLE_KEY_ORDER_ID to SharedPrefManager.getInstance().incompleteOrderId.toString(),
                        BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "search_result",
                        BundleConstants.BUNDLE_KEY_PAGE_SECTION to "view_cart"
                    ),
                    flags= listOf(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                )
            })

        //event to launch CartActivity
        viewModel.eventOpenCartActivity.observe(this,
            EventObserver {
                navigateToCartActivity(
                    params = bundleOf(
                        BundleConstants.BUNDLE_KEY_ORDER_ID to SharedPrefManager.getInstance().incompleteOrderId.toString(),
                        BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "search_result",
                        BundleConstants.BUNDLE_KEY_PAGE_SECTION to "view_cart"
                    ),
                    flags= listOf(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                )
            })
        viewModel.eventMessage.observe(this, EventObserver {
            if (it.messageEnum == MESSAGES.REMOVED_COUPON_SUCCESSFULLY) {
                viewModel.stopCouponTimer()
                stickyNotificationWithCallBack(viewModel.ftcCouponData.value!!, "")
                Log.d("TAG", "setObservers: REMOVED_COUPON_SUCCESSFULLY")
                CommonFunc.showCustomToastMessage(this@SearchResultActivity, it.displayMessage)
            }
        })

        viewModel.cartItemCount.observe(this) {
            if (it > 0)
                binding.headerChip.setCartCount(it)
            else
                binding.headerChip.setCartCount(0)
        }

        viewModel.cartModel.observe(this) {
            if (it != null)
                binding.cartView.updateTotalItemsInCartCount(
                    it.count ?: 0,
                    it.amount,
                    SharedPrefManager.getInstance().prescriptionCount
                )
        }
        val loader = Dialog(this)
        viewModel.isLoading.observe(this) {
            if (it) enableLoadingView(loader)
            else disableLoadingView(loader)
        }

        viewModel.eventBaseMessage.observe(this, EventObserver {
            when {
                it.equals(MESSAGES.REMOVED_COUPON_SUCCESSFULLY) -> {
                    viewModel.stopCouponTimer()
                    Log.d("TAG", "setObservers: REMOVED_COUPON_SUCCESSFULLY")
                    viewModel.ftcCouponResponse?.let {
                        stickyNotificationWithCallBack(
                            it.first(),
                            ""
                        )
                    }
                    Log.d(
                        "Intent",
                        "onCreate: setParameter call 13:::" + SharedPrefManager.getInstance().couponDiscount.toDouble()
                    )

                    SharedPrefManager.getInstance().setCouponDiscount(0f)
                    viewModel.setCartCount()
                }
            }
        })
    }

    private fun initializeData() {
        viewModel.elasticSearchType = searchType
        viewModel.searchQuery.value = searchText
        viewModel.isMultiSearch = isMultiSearch
        binding.fragmentManager = supportFragmentManager

        binding.searchBar.setSearchText(searchText)
        binding.searchBar.setPlaceHolderText("")
        binding.searchBar.setSearchEnable(false)
        binding.searchBar.setStartIconAsSearch(false)

//        viewModel.getCouponDataFromApi()
        viewModel.getSearchResultList(searchText, searchType, 1, isMultiSearch)

        /***
         * If the isFtc flag is true from the preference then only call all offers list API
         */

        //for ftc coupon
        //if (SharedPrefManager.getInstance().isFtc) {
        //viewModel.getFtcCouponsData()
        //}

    }

    override fun onResume() {
        super.onResume()
        /* if (orgSubCompareFragment != null && orgSubCompareFragment.isVisible) {
             orgSubCompareFragment.dismiss()
         }
         if (subCompareFragment != null && subCompareFragment.isVisible) {
             subCompareFragment.dismiss()
         }*/
        if (dialog != null)
            dialog?.dismiss()

        viewModel.reloadSearchResultList(viewModel.searchResultList.value!!)

        if (!viewModel.srpViewTriggered && SharedPrefManager.getInstance().loggedInUserAccessToken.isNotEmpty() && resumeCount > 1) {
            lifecycleScope.launch(IO) { viewModel.getFtcCouponsData() }
            viewModel.eventSendSrpViewedEvent()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, @Nullable data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == TcSdk.SHARE_PROFILE_REQUEST_CODE) {
            try {
                TcSdk.getInstance().onActivityResultObtained(this, requestCode, resultCode, data)
            } catch (ignore: Exception) {
            }
        }
    }

    private fun stickyNotificationWithCallBack(
        couponResp: CouponCodeResponse.Coupon?,
        time: String
    ) {
        var message = ""
        message = if (SharedPrefManager.getInstance().couponModel == null) couponResp?.title ?: ""
        else if (!couponResp?.promoCode.isNullOrEmpty() && SharedPrefManager.getInstance().couponModel.promoCode == couponResp?.promoCode) SharedPrefManager.getInstance().couponModel.promoCode + " applied" else couponResp?.title
            ?: ""
        val data = StickyNonStickyNotificationModel(
            message = message,
            amount = couponResp?.maxDiscount ?: 0.0,
            subTitle = "",
            timer = if (SharedPrefManager.getInstance().couponModel != null && SharedPrefManager.getInstance().couponModel?.showFtcCounter == true && time != getString(
                    R.string.timer_ends_string
                )
            ) time else "",
            buttonText = "Apply",
            drawableRight = if (SharedPrefManager.getInstance().couponModel == null) {
                ContextCompat.getDrawable(
                    this@SearchResultActivity,
                    com.intellihealth.salt.R.drawable.ic_chevron_right_white
                )
            } else if (SharedPrefManager.getInstance().couponModel.promoCode != (couponResp?.promoCode
                    ?: "")
            ) {
                ContextCompat.getDrawable(
                    this@SearchResultActivity,
                    com.intellihealth.salt.R.drawable.ic_chevron_right_white
                )
            } else {
                ContextCompat.getDrawable(
                    this@SearchResultActivity,
                    com.intellihealth.salt.R.drawable.ic_right_arrow
                )
            },
            drawableLeft = if (SharedPrefManager.getInstance().couponModel != null && SharedPrefManager.getInstance().couponModel.promoCode == couponResp?.promoCode) ContextCompat.getDrawable(
                this@SearchResultActivity,
                R.drawable.ic_purple_tick
            ) else ContextCompat.getDrawable(
                this@SearchResultActivity,
                com.intellihealth.salt.R.drawable.percentage
            ),
            buttonIcon = null
        )
        val ftcNotificationCallback =
            object : StickyNotStickyNotificationCallback {
                override fun onButtonClick(notificationType: StickyNonStickyNotificationModel) {
                    Toast().showCustomToastMessage(
                        this@SearchResultActivity,
                        notificationType.buttonText
                    )
                }

                override fun onViewClick(notificationType: StickyNonStickyNotificationModel) {
                    //     viewModel.callEventApplyCouponClickedFromBaseVM()
                    if (CommonFunc.isSingleClickParam(500)) {
                        openApplyCouponBottomSheet(couponResp)
                        viewModel.urgencyStickyClickedEvent(couponResp)
                    }
                }

            }
        binding.promoCard.setStickyNonStickyNotificationData(data)
        binding.promoCard.setNotificationCallback(
            ftcNotificationCallback
        )
        if (SharedPrefManager.getInstance().couponModel != null && SharedPrefManager.getInstance().couponModel.promoCode == couponResp?.promoCode) {
            binding.promoCard.setStickyUI(
                type = NotificationType.COUPON_APPLIED.type,
                position = NotificationPosition.TOP.position,
                isButtonVisible = NotificationButton.DISABLED.status
            )
        } else {
            viewModel.stopCouponTimer()
            binding.promoCard.setStickyUI(
                type = NotificationType.APPLY_COUPON.type,
                position = NotificationPosition.TOP.position,
                isButtonVisible = NotificationButton.DISABLED.status
            )
        }
        binding.promoCard.visibility = View.VISIBLE
    }

    fun openApplyCouponBottomSheet(couponResponse: CouponCodeResponse.Coupon?) {
        if (applyCouponCallBack != null) {
            val applyCouponBottomSheet =
                ApplyCouponBottomSheet(couponResponse, applyCouponCallBack!!)
            applyCouponBottomSheet.isCancelable = true
            if (!applyCouponBottomSheet.isVisible) {
                applyCouponBottomSheet.show(
                    this@SearchResultActivity.supportFragmentManager, "CouponCodeOfferBottomSheet"
                )
            }
        }
    }

    private fun openApplyCouponValidationPopup(
        couponResponse2: CouponCodeResponse.Coupon?,
        couponResponse: CouponSaveRemoveResponse?
    ) {
        /**
         * Display Best offer already applied case
         */
        var dialogValidations: DialogFragment? = null
        val callback = object : PopUpDialogCallback {
            override fun onActionButtonClicked() {
                dialogValidations?.dismiss()
            }

            override fun onCloseButtonClicked() {

            }
        }
        dialogValidations = CouponErrorPopup(
            couponCode = couponResponse2?.promoCode ?: "",
            cartValue = 0,
            message = couponResponse?.responseData?.description?.get(0) ?: "",
            callback = callback,
        )
        dialogValidations.isCancelable = true
        if (!dialogValidations.isVisible) {
            dialogValidations.show(
                this@SearchResultActivity.supportFragmentManager,
                "CouponNotApplied"
            )
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        CommonFunc.freeMemory()
    }

    override fun onNewIntent(intentReceived: Intent?) {
        super.onNewIntent(intentReceived)
      //this code is added to refresh the activity
        finish()
        startActivity(intentReceived)

    }
}