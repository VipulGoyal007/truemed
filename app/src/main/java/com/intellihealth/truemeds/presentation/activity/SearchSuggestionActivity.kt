package com.intellihealth.truemeds.presentation.activity

import android.content.Context
import android.content.Intent
import android.graphics.Rect
import android.net.Uri
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.view.WindowManager
import android.view.inputmethod.InputMethodManager
import androidx.activity.OnBackPressedCallback
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.os.bundleOf
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.google.gson.Gson
import com.intellihealth.salt.callbacks.SearchBarCallback
import com.intellihealth.salt.views.cards.ActionCardCallback
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.mixpanel.MxLoginPageViewed
import com.intellihealth.truemeds.data.model.search.SearchUIStateConstants
import com.intellihealth.truemeds.data.model.search.TrendingSearchResponse
import com.intellihealth.truemeds.data.utils.PopUpType
import com.intellihealth.truemeds.data.utils.isNetworkAvailable
import com.intellihealth.truemeds.databinding.ActivitySearchSuggestionBinding
import com.intellihealth.truemeds.domain.enums.ElasticSearchType
import com.intellihealth.truemeds.domain.navigation.navigateToCartActivity
import com.intellihealth.truemeds.domain.navigation.navigateToOrderSummaryActivity
import com.intellihealth.truemeds.domain.navigation.navigateToProductDetailActivity
import com.intellihealth.truemeds.domain.navigation.navigateToSearchResultActivity
import com.intellihealth.truemeds.mvvm.data.appsflyer.AFLoginPageViewed
import com.intellihealth.truemeds.presentation.adapter.TrendingSearchHistoryAdapter
import com.intellihealth.truemeds.presentation.bottomsheet.login.LoginBottomSheet
import com.intellihealth.truemeds.presentation.callbacks.PopUpDialogCallback
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.utils.viewBinding
import com.intellihealth.truemeds.presentation.viewmodel.SearchViewModel
import com.intellihealth.truemeds.presentation.viewmodel.events.EventObserver
import com.truecaller.android.sdk.oAuth.TcSdk
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class SearchSuggestionActivity : BaseActivityWithLogin() {

    private lateinit var context: Context
    private val viewModel by lazy { ViewModelProvider(this)[SearchViewModel::class.java] }
    private val binding by viewBinding(ActivitySearchSuggestionBinding::inflate)
    var layoutManager: StaggeredGridLayoutManager? = null
    var sspResumeCount = 1
    var resultLauncher: ActivityResultLauncher<Intent>? = null
    var backpressed = false
    var searchbarClearPressed = false
    private lateinit var bottomSheet: LoginBottomSheet
    var deepLinkSearchQuery = ""
    override fun extractIntentData() {
        intent.extras?.let { bundle ->

            if (bundle.containsKey(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE)) {
                viewModel.clickedOnPage =
                    bundle.getString(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE).toString()
            }
            if (bundle.containsKey(BundleConstants.BUNDLE_KEY_PAGE_SECTION)) {
                viewModel.pageSection =
                    bundle.getString(BundleConstants.BUNDLE_KEY_PAGE_SECTION).toString()
            }
            if (bundle.containsKey(BundleConstants.BUNDLE_KEY_SCREEN_NAME)) {
                viewModel.lastScreenName =
                    bundle.getString(BundleConstants.BUNDLE_KEY_SCREEN_NAME).toString()
            }
            if (bundle.containsKey(BundleConstants.BUNDLE_KEY_DEEP_LINK_SEARCH_QUERY)) {
                deepLinkSearchQuery =
                    bundle.getString(BundleConstants.BUNDLE_KEY_DEEP_LINK_SEARCH_QUERY).toString()
            }
        }
    }

    override fun sendLoginPageViewedEvent() {
        val mxLoginPageViewed = MxLoginPageViewed(
            "search_resul_paget",
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
            context
        )
    }

    override fun openLoginBottomSheet() {
        bottomSheet = LoginBottomSheet("search_suggestion_page", pageSection)
        bottomSheet.isCancelable = false
        if (!bottomSheet.isVisible)
            bottomSheet.show(supportFragmentManager, "LocationBottomSheet")
    }

    override fun closeLoginBottomSheet() {
        if (this::bottomSheet.isInitialized && bottomSheet.isVisible) {
            bottomSheet.dismiss()
        }
    }

    /**
     * 1) Setup binding and viewmodel
     * 2) Set viewmodel as lifecycle observer of the activity
     * 3) Set edittext to block backslash input & set focus on edittext to show keyboard on screen launch
     * 4) Load searching gif using Glide into imageview
     * 5) Update status bar color
     * 6) Set event listener
     * 7) set onBackPressed callback
     * 8) Initialize data: initialize variables, get extras, offline recently searched, previously viewed,
     * trending searches(shared preference) & Call api to get trending searches data
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //1) Setup binding and viewmodel
        setContentView(binding.root)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        context = this

        //2)Set viewmodel as lifecycle observer of the activity
        lifecycle.addObserver(viewModel)
        //3) block backslash input

        binding.headerChip.setCartCount(viewModel.cartItemCount.value!!)

        //request focus to edittext and show keyboard
        if (binding.searchBar.requestFocus())
//            showKeyboard()
            window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE)

        //4) Load searching gif using Glide into imageview

        //5) Update status bar color
        updateStatusBarColor()
        //6) Set event listener
        setEventListener()
        //7) set onBackPresseed callback
        setupOnBackPresses()
        //8) Initialize data
        initializeData()

        //viewModel.eventSendSearchViewedEvent()
        viewModel.eventSendFtcCounterStarted.observe(this) {
            if (it > 0L) viewModel.sendFtcCounterStarted(
                it
            )
        }

        if (intent!!.extras?.containsKey("searchText") == true)
            if (!intent.extras?.getString("searchText")
                    .isNullOrEmpty()
            ) binding.searchBar.setSearchText(intent.extras?.getString("searchText") ?: "")
    }


    /**
     * 1) Get extras and update variable data
     * 2) Initialize variables
     * 3) offline data: recently searched, previously viewed, trending searches(shared preference)
     * 4) Call api to get trending searches data
     */
    private fun initializeData() {
        //1) Get extras and update variable data

        //2) Initialize variables


        //3) offline data: recently searched, previously viewed, trending searches(shared preference)
        viewModel.setOfflineData()
        //4) Call api to get trending searches data
//        viewModel.getTrendingSearch()

        val hintStrings = arrayOf(
            "ECOSPRIN", "MET", "TELMA", "GALVUS", "GLYCOMET",
            "BIOVAS", "ATORVA", "ZARBOSE", "JANUMET", "CIPCAL",
            "SHELCAL", "GEMER", "OLMEZEST", "NEBICARD", "ROSEDAY",
            "NICARDIA", "CILACAR", "PROLOMET", "AMLOKIND", "NICOTEX",
            "AMARYL", "RABLET", "LEVIPIL", "PAN", "STAMLO"
        )
        binding.searchBar.switchText(hintStrings)
        binding.searchBar.setPlaceHolderText("Search for")

        binding.searchBar.setSearchEnable(true)
        binding.searchBar.setStartIconAsSearch(false)

        val mJson = SharedPrefManager.getInstance().trendingSearch

        try {
            if (mJson != null) {
                val mTrendingSearchList =
                    Gson().fromJson(mJson, Array<TrendingSearchResponse.TrendingSearch>::class.java)
                        .asList()

                val obj_adapter = TrendingSearchHistoryAdapter(mTrendingSearchList, viewModel)

                if (mTrendingSearchList.size > 0) {
                    binding.clTrending.visibility = View.VISIBLE
                    if (mTrendingSearchList.size >= 4)
                        binding.rvTrending.layoutManager =
                            StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.HORIZONTAL)
                    else
                        binding.rvTrending.layoutManager =
                            StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL)

                    binding.rvTrending.adapter = obj_adapter

                    viewModel.trendingSearchList.value = mTrendingSearchList
                    viewModel.updateUIState()
                } else {
                    binding.clTrending.visibility = View.GONE
                }
            }
        } catch (_: Exception) {
        }

        extractIntentData()



        if (!deepLinkSearchQuery.isEmpty()) {
            viewModel.searchQuery.postValue(deepLinkSearchQuery);
            binding.searchBar.setSearchText(deepLinkSearchQuery);
            binding.searchBar.clearFocus();
        }

//        viewModel.getTrendingSearches()

    }

    /**
     * as onBackPressed is deprecated, onBackPressedDispatcher is used to handle onBackPresses event
     */
    private fun setupOnBackPresses() {
        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                //viewModel.onBackIconClick()
                if (!viewModel.searchQuery.value.isNullOrEmpty()) {
                    backpressed = true
                    setLastVisibleItemIndex()
                    viewModel.sendSearchSuggestionImpressionEvent("back")
                    viewModel.onClearSearchTextClick("back_pressed")
                    viewModel.searchQuery.value = ""

                    binding.searchBar.setSearchText("")
                    try {
//                    viewModel.sendSearchSuggestionImpressionEvent("back")
                        if (!viewModel.mxItemSearched.termSearched.isNullOrEmpty()) {
                            viewModel.mxItemSearched.qc =
                                if (viewModel.selectedItemQC.isNullOrEmpty()) null else viewModel.selectedItemQC
                            viewModel.mxItemSearched.rt =
                                if (viewModel.selectedItemRT.isNullOrEmpty()) null else viewModel.selectedItemRT
                            viewModel.mxItemSearched.exitAction = "back"
                            viewModel.sendItem_searched(viewModel.mxItemSearched)
                        }
                    } catch (_: Exception) {
                    }
                } else {
                    /*EventManager.getInstance().logEvents(
                        this@SearchSuggestionViewModel, "Search_Back", EventManager.getInstance().eventData(
                            SharedPrefManager.getInstance().loggedInUserMobile,
                            "Search", SharedPrefManager.getInstance().loggedInUserId,
                            "", "" + "", "", "", "", "", ""
                        )
                    )*/

                    hideKeyboard()
                    finish()
                }
            }
        })
    }

    private fun setEventListener() {
        resultLauncher =
            registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
                if (result.resultCode === 1001) {
                    val intent: Intent = result.data!!
                    val requestTextFocus =
                        intent.getBooleanExtra("requestTextFocus", false)
                    val isSearchMedicineVisible =
                        intent.getBooleanExtra("_isSearchMedicineVisible", false)
                    val isClearSearch = intent.getBooleanExtra("clear_search", false)
                    viewModel.clickedOnPage =
                        intent.extras?.getString(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE) ?: ""
                    viewModel.pageSection =
                        intent.extras?.getString(BundleConstants.BUNDLE_KEY_PAGE_SECTION) ?: ""
                    if (requestTextFocus) {
                        binding.searchBar.requestFocus()
                        showKeyboard()
                    } else {
                        hideKeyboard()
                    }
                    if (isClearSearch) {
//                    viewModel.resetSearchResult()
                        binding.searchBar.setSearchText("")
                        viewModel.updateUIState()
                    }
//
                    if (!intent.extras?.getString("searchText")
                            .isNullOrEmpty()
                    ) binding.searchBar.setSearchText(intent.extras?.getString("searchText") ?: "")

                }
            }

        binding.actionPharmacist.setCallback(object : ActionCardCallback {
            override fun viewClickCallback(type: Int) {
                callCustomerCareIntent()
                viewModel.eventCallPharmacistClickedEvent()
            }

            override fun viewCopyClick(type: Int) {
            }

        })

        binding.headerChip.setOnClickListener {
            viewModel.onViewCartClicked("toolbar_cart")

            viewModel.mxItemSearched.qc =
                if (viewModel.selectedItemQC.isNullOrEmpty()) null else viewModel.selectedItemQC
            viewModel.mxItemSearched.rt =
                if (viewModel.selectedItemRT.isNullOrEmpty()) null else viewModel.selectedItemRT
            viewModel.mxItemSearched.exitAction = "view_cart"

            viewModel.sendItem_searched(viewModel.mxItemSearched)
        }

        binding.btnSeeResult.setOnClickListener {
            viewModel.selectedItemQC = ""
            viewModel.selectedItemRT = ""
            viewModel.suggestion_term_clicked_position = 0
            viewModel.suggestion_term_clicked = ""
            setLastVisibleItemIndex()
            viewModel.sendSearchSuggestionImpressionEvent("see_results")
            viewModel.mxItemSearched.qc =
                if (viewModel.selectedItemQC.isNullOrEmpty()) null else viewModel.selectedItemQC
            viewModel.mxItemSearched.rt =
                if (viewModel.selectedItemRT.isNullOrEmpty()) null else viewModel.selectedItemRT
            viewModel.mxItemSearched.exitAction = "see_results"
            if (viewModel.mxTermSearchTriggeredFor != viewModel.searchQuery.value) {
                viewModel.mxTermSearchedTriggered = false
            }
            viewModel.sendItem_searched(viewModel.mxItemSearched)
            hideKeyboard()

         /*   val srpIntent = Intent(
                this,
                SearchResultActivity::class.java
            ).addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                // .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                .putExtra(BundleConstants.SEARCH_TEXT, viewModel.searchQuery.value)
                .putExtra(
                    BundleConstants.SEARCH_TYPE,
                    ElasticSearchType.SKU_BRAND_SEARCH.toString()
                )
                .putExtra(BundleConstants.SEARCH_IS_MULTI_SEARCH, true)
                .putExtra(BundleConstants.BUNDLE_KEY_ITEM_QC, viewModel.selectedItemQC)
                .putExtra(BundleConstants.BUNDLE_KEY_ITEM_RT, viewModel.selectedItemRT)
                .putExtra(
                    BundleConstants.BUNDLE_KEY_TERM_SEARCHED,
                    viewModel.searchQuery.value
                )
                .putExtra(
                    BundleConstants.BUNDLE_KEY_SUGGESTION_TERM_CLICKED_POSITION,
                    viewModel.suggestion_term_clicked_position
                )
                .putExtra(
                    BundleConstants.BUNDLE_KEY_SUGGESTION_TERM_CLICKED,
                    viewModel.suggestion_term_clicked
                )
                .putExtra(
                    BundleConstants.BUNDLE_KEY_ELASTIC_SEARCH_TYPE,
                    viewModel.mxElasticSearchType
                )
                .putExtra(
                    BundleConstants.BUNDLE_KEY_CLICKED_SUGGESTION_TYPE,
                    viewModel.clickedSuggestionType
                )
                .putExtra(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE, "Search")
*/

            viewModel.lastScreenName = "SRP"
           // resultLauncher?.launch(srpIntent)

            navigateToSearchResultActivity(
                params = bundleOf(
                    BundleConstants.SEARCH_TEXT to viewModel.searchQuery.value,
                    BundleConstants.SEARCH_TYPE to ElasticSearchType.SKU_BRAND_SEARCH.toString(),
                    BundleConstants.SEARCH_IS_MULTI_SEARCH to true,
                    BundleConstants.BUNDLE_KEY_ITEM_QC to viewModel.selectedItemQC,
                    BundleConstants.BUNDLE_KEY_ITEM_RT to viewModel.selectedItemRT,
                    BundleConstants.BUNDLE_KEY_TERM_SEARCHED to viewModel.searchQuery.value,
                    BundleConstants.BUNDLE_KEY_SUGGESTION_TERM_CLICKED_POSITION to viewModel.suggestion_term_clicked_position,
                    BundleConstants.BUNDLE_KEY_SUGGESTION_TERM_CLICKED to viewModel.suggestion_term_clicked,
                    BundleConstants.BUNDLE_KEY_ELASTIC_SEARCH_TYPE to viewModel.mxElasticSearchType,
                    BundleConstants.BUNDLE_KEY_CLICKED_SUGGESTION_TYPE to viewModel.clickedSuggestionType,
                    BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "Search"
                ),
                flags= listOf(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT),
                activityLauncher = resultLauncher
            )
        }

        viewModel.onClickRecentItem.observe(this) {
            if (it.productCode.isEmpty()) {
                viewModel.selectedItemQC = ""
                viewModel.selectedItemRT = ""
                viewModel.suggestion_term_clicked_position =
                    viewModel.suggestion_term_clicked_position + 1
                viewModel.suggestion_term_clicked = it.productCode ?: ""
                viewModel.clickedSuggestionType = it.keyName ?: ""
                viewModel.mxTermSearchedTriggered = false
                viewModel.lastScreenName = "SRP"
                triggerItemSearchedEvent(it.medicineName, it.keyName)
                hideKeyboard()

               /* val srpIntent = Intent(
                    this,
                    SearchResultActivity::class.java
                ).addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                    //  .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                    .putExtra(BundleConstants.SEARCH_TEXT, it.medicineName)
                    .putExtra(BundleConstants.SEARCH_TYPE, it.keyName)
                    .putExtra(BundleConstants.BUNDLE_KEY_ITEM_QC, viewModel.selectedItemQC)
                    .putExtra(BundleConstants.BUNDLE_KEY_ITEM_RT, viewModel.selectedItemRT)
                    .putExtra(
                        BundleConstants.BUNDLE_KEY_TERM_SEARCHED,
                        viewModel.searchQuery.value
                    )
                    .putExtra(
                        BundleConstants.BUNDLE_KEY_SUGGESTION_TERM_CLICKED_POSITION,
                        viewModel.suggestion_term_clicked_position
                    )
                    .putExtra(
                        BundleConstants.BUNDLE_KEY_SUGGESTION_TERM_CLICKED,
                        it.medicineName
                    )
                    .putExtra(
                        BundleConstants.BUNDLE_KEY_ELASTIC_SEARCH_TYPE,
                        viewModel.elasticSearchType
                    )
                    .putExtra(BundleConstants.BUNDLE_KEY_CLICKED_SUGGESTION_TYPE, it.keyName)
                    .putExtra(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE, "Search")
                resultLauncher?.launch(srpIntent)*/

                navigateToSearchResultActivity(
                    params = bundleOf(
                        BundleConstants.SEARCH_TEXT to it.medicineName,
                        BundleConstants.SEARCH_TYPE to it.keyName,
                        BundleConstants.BUNDLE_KEY_ITEM_QC to viewModel.selectedItemQC,
                        BundleConstants.BUNDLE_KEY_ITEM_RT to viewModel.selectedItemRT,
                        BundleConstants.BUNDLE_KEY_TERM_SEARCHED to viewModel.searchQuery.value,
                        BundleConstants.BUNDLE_KEY_SUGGESTION_TERM_CLICKED_POSITION to viewModel.suggestion_term_clicked_position,
                        BundleConstants.BUNDLE_KEY_SUGGESTION_TERM_CLICKED to    it.medicineName,
                        BundleConstants.BUNDLE_KEY_ELASTIC_SEARCH_TYPE to viewModel.elasticSearchType,
                        BundleConstants.BUNDLE_KEY_CLICKED_SUGGESTION_TYPE to it.keyName,
                        BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "Search"
                    ),
                    flags= listOf(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT),
                    activityLauncher = resultLauncher
                )


            } else {
              /*  startActivity(
                    Intent(
                        this,
                        ProductDetailActivity::class.java
                    ).putExtra(BundleConstants.SEARCH_TEXT, it.medicineName)
                        .putExtra(BundleConstants.IS_FROM_SEARCH, true)
                        .putExtra(BundleConstants.BUNDLE_KEY_ITEM_QC, viewModel.selectedItemQC)
                        .putExtra(BundleConstants.BUNDLE_KEY_ITEM_RT, viewModel.selectedItemRT)
                        .putExtra(
                            BundleConstants.BUNDLE_KEY_TERM_SEARCHED,
                            viewModel.searchQuery.value
                        )
                        .putExtra(
                            BundleConstants.BUNDLE_KEY_SUGGESTION_TERM_CLICKED_POSITION,
                            viewModel.suggestion_term_clicked_position
                        )
                        .putExtra(
                            BundleConstants.BUNDLE_KEY_SUGGESTION_TERM_CLICKED,
                            viewModel.suggestion_term_clicked
                        )
                        .putExtra(
                            BundleConstants.BUNDLE_KEY_ELASTIC_SEARCH_TYPE,
                            viewModel.elasticSearchType
                        )
                        .putExtra(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE, "Search")
                )*/

                navigateToProductDetailActivity(
                    params = bundleOf(
                        BundleConstants.SEARCH_TEXT to it.medicineName,
                        BundleConstants.IS_FROM_SEARCH to true,
                        BundleConstants.BUNDLE_KEY_ITEM_QC to viewModel.selectedItemQC,
                        BundleConstants.BUNDLE_KEY_ITEM_RT to viewModel.selectedItemRT,
                        BundleConstants.BUNDLE_KEY_TERM_SEARCHED to viewModel.searchQuery.value,
                        BundleConstants.BUNDLE_KEY_SUGGESTION_TERM_CLICKED_POSITION to viewModel.suggestion_term_clicked_position,
                        BundleConstants.BUNDLE_KEY_SUGGESTION_TERM_CLICKED to viewModel.suggestion_term_clicked,
                        BundleConstants.BUNDLE_KEY_ELASTIC_SEARCH_TYPE to viewModel.elasticSearchType,
                        BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "Search"
                    )
                )
            }

        }
        viewModel.onClickPreviousItem.observe(this) {
            viewModel.mxTermSearchedTriggered = false
            triggerItemSearchedEvent(it.medicineName, it.keyName)

       /*     startActivity(
                Intent(
                    this,
                    ProductDetailActivity::class.java
                ).putExtra(BundleConstants.PRODUCT_CODE, it.productCode)
                    .putExtra(
                        BundleConstants.SEARCH_TYPE,
                        ElasticSearchType.FETCH_PRODUCT_DETAILS.toString()
                    ).putExtra(BundleConstants.IS_FROM_SEARCH, true)
                    .putExtra(BundleConstants.BUNDLE_KEY_ITEM_QC, viewModel.selectedItemQC)
                    .putExtra(BundleConstants.BUNDLE_KEY_ITEM_RT, viewModel.selectedItemRT)
                    .putExtra(BundleConstants.BUNDLE_KEY_TERM_SEARCHED, viewModel.searchQuery.value)
                    .putExtra(
                        BundleConstants.BUNDLE_KEY_SUGGESTION_TERM_CLICKED_POSITION,
                        viewModel.suggestion_term_clicked_position
                    )
                    .putExtra(
                        BundleConstants.BUNDLE_KEY_SUGGESTION_TERM_CLICKED,
                        viewModel.suggestion_term_clicked
                    )
                    .putExtra(
                        BundleConstants.BUNDLE_KEY_ELASTIC_SEARCH_TYPE,
                        viewModel.elasticSearchType
                    )
                    .putExtra(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE, "Search")
            )*/

            navigateToProductDetailActivity(
                params = bundleOf(
                    BundleConstants.PRODUCT_CODE to it.productCode,
                    BundleConstants.SEARCH_TYPE to ElasticSearchType.FETCH_PRODUCT_DETAILS.toString(),
                    BundleConstants.IS_FROM_SEARCH to true,
                    BundleConstants.BUNDLE_KEY_ITEM_QC to viewModel.selectedItemQC,
                    BundleConstants.BUNDLE_KEY_ITEM_RT to viewModel.selectedItemRT,
                    BundleConstants.BUNDLE_KEY_TERM_SEARCHED to viewModel.searchQuery.value,
                    BundleConstants.BUNDLE_KEY_SUGGESTION_TERM_CLICKED_POSITION to viewModel.suggestion_term_clicked_position,
                    BundleConstants.BUNDLE_KEY_SUGGESTION_TERM_CLICKED to viewModel.suggestion_term_clicked,
                    BundleConstants.BUNDLE_KEY_ELASTIC_SEARCH_TYPE to viewModel.elasticSearchType,
                    BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "Search"

                )
            )


        }
        viewModel.onClickTrendingItem.observe(this) {
            try {
                viewModel.mxTermSearchedTriggered = false
                triggerItemSearchedEvent(it.name, "original_sku_name")

                /*startActivity(
                    Intent(
                        this,
                        ProductDetailActivity::class.java
                    ).putExtra(BundleConstants.PRODUCT_CODE, it.productCode)
                        .putExtra(
                            BundleConstants.SEARCH_TYPE,
                            ElasticSearchType.FETCH_PRODUCT_DETAILS.toString()
                        ).putExtra(BundleConstants.IS_FROM_SEARCH, true)
                        .putExtra(BundleConstants.BUNDLE_KEY_ITEM_QC, viewModel.selectedItemQC)
                        .putExtra(BundleConstants.BUNDLE_KEY_ITEM_RT, viewModel.selectedItemRT)
                        .putExtra(BundleConstants.BUNDLE_KEY_TERM_SEARCHED, it.name)
                        .putExtra(
                            BundleConstants.BUNDLE_KEY_SUGGESTION_TERM_CLICKED_POSITION,
                            viewModel.suggestion_term_clicked_position
                        )
                        .putExtra(
                            BundleConstants.BUNDLE_KEY_SUGGESTION_TERM_CLICKED,
                            viewModel.suggestion_term_clicked
                        )
                        .putExtra(
                            BundleConstants.BUNDLE_KEY_ELASTIC_SEARCH_TYPE,
                            viewModel.elasticSearchType
                        )
                        .putExtra(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE, "Search")
                )*/

                navigateToProductDetailActivity(
                    params = bundleOf(
                        BundleConstants.PRODUCT_CODE to it.productCode,
                        BundleConstants.SEARCH_TYPE to ElasticSearchType.FETCH_PRODUCT_DETAILS.toString(),
                        BundleConstants.IS_FROM_SEARCH to true,
                        BundleConstants.BUNDLE_KEY_ITEM_QC to viewModel.selectedItemQC,
                        BundleConstants.BUNDLE_KEY_ITEM_RT to viewModel.selectedItemRT,
                        BundleConstants.BUNDLE_KEY_TERM_SEARCHED to it.name,
                        BundleConstants.BUNDLE_KEY_SUGGESTION_TERM_CLICKED_POSITION to viewModel.suggestion_term_clicked_position,
                        BundleConstants.BUNDLE_KEY_SUGGESTION_TERM_CLICKED to viewModel.suggestion_term_clicked,
                        BundleConstants.BUNDLE_KEY_ELASTIC_SEARCH_TYPE to viewModel.elasticSearchType,
                        BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "Search"
                    )
                )
            } catch (_: Exception) {
            }
        }
        viewModel.onClickSuggestionItem.observe(this) {
            it?.let { suggestion ->
                viewModel.selectedItemQC = suggestion.qc ?: ""
                viewModel.selectedItemRT =
                    if (suggestion.rt.isNullOrEmpty()) "" else suggestion.rt.toString()
                viewModel.suggestion_term_clicked_position =
                    viewModel.suggestion_term_clicked_position + 1
                viewModel.suggestion_term_clicked = suggestion.text ?: ""

                val elasticSearchType = suggestion.type ?: ""
                if (elasticSearchType == ElasticSearchType.ORIGINAL_SKU_NAME.toString() && !suggestion.productCode.isNullOrEmpty()) {
                    if (viewModel.clickedSuggestionType.isNullOrEmpty()) viewModel.clickedSuggestionType =
                        "in sku"

                   /* startActivity(
                        Intent(
                            this,
                            ProductDetailActivity::class.java
                        ).putExtra(BundleConstants.SEARCH_TEXT, it.text)
                            .putExtra(BundleConstants.IS_SUBS, false)
                            .putExtra(BundleConstants.PRODUCT_CODE, suggestion.productCode)
                            .putExtra(
                                BundleConstants.SEARCH_TYPE,
                                ElasticSearchType.FETCH_PRODUCT_DETAILS.toString()
                            ).putExtra(BundleConstants.IS_FROM_SEARCH, true)
                            .putExtra(BundleConstants.BUNDLE_KEY_ITEM_QC, viewModel.selectedItemQC)
                            .putExtra(BundleConstants.BUNDLE_KEY_ITEM_RT, viewModel.selectedItemRT)
                            .putExtra(
                                BundleConstants.BUNDLE_KEY_TERM_SEARCHED,
                                viewModel.searchQuery.value
                            )
                            .putExtra(
                                BundleConstants.BUNDLE_KEY_SUGGESTION_TERM_CLICKED_POSITION,
                                viewModel.suggestion_term_clicked_position
                            )
                            .putExtra(
                                BundleConstants.BUNDLE_KEY_SUGGESTION_TERM_CLICKED,
                                viewModel.suggestion_term_clicked
                            )
                            .putExtra(
                                BundleConstants.BUNDLE_KEY_ELASTIC_SEARCH_TYPE,
                                viewModel.elasticSearchType
                            )
                            .putExtra(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE, "Search")
                    )
*/
                    navigateToProductDetailActivity(
                        params = bundleOf(
                            BundleConstants.SEARCH_TEXT to it.text,
                            BundleConstants.IS_SUBS to false,
                            BundleConstants.PRODUCT_CODE to suggestion.productCode,
                            BundleConstants.SEARCH_TYPE to ElasticSearchType.FETCH_PRODUCT_DETAILS.toString(),
                            BundleConstants.IS_FROM_SEARCH to true,
                            BundleConstants.BUNDLE_KEY_ITEM_QC to viewModel.selectedItemQC,
                            BundleConstants.BUNDLE_KEY_ITEM_RT to viewModel.selectedItemRT,
                            BundleConstants.BUNDLE_KEY_TERM_SEARCHED to viewModel.searchQuery.value,
                            BundleConstants.BUNDLE_KEY_SUGGESTION_TERM_CLICKED_POSITION to viewModel.suggestion_term_clicked_position,
                            BundleConstants.BUNDLE_KEY_SUGGESTION_TERM_CLICKED to viewModel.suggestion_term_clicked,
                            BundleConstants.BUNDLE_KEY_ELASTIC_SEARCH_TYPE to viewModel.elasticSearchType,
                            BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "Search"
                        )
                    )
                } else {
                    hideKeyboard()
                 /*   val srpIntent = Intent(
                        this,
                        SearchResultActivity::class.java
                    ).addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                        .putExtra(BundleConstants.SEARCH_TEXT, it.text)
                        .putExtra(BundleConstants.SEARCH_TYPE, it.type)
                        .putExtra(BundleConstants.BUNDLE_KEY_ITEM_QC, viewModel.selectedItemQC)
                        .putExtra(BundleConstants.BUNDLE_KEY_ITEM_RT, viewModel.selectedItemRT)
                        .putExtra(
                            BundleConstants.BUNDLE_KEY_TERM_SEARCHED,
                            viewModel.searchQuery.value
                        )
                        .putExtra(
                            BundleConstants.BUNDLE_KEY_SUGGESTION_TERM_CLICKED_POSITION,
                            viewModel.suggestion_term_clicked_position
                        )
                        .putExtra(
                            BundleConstants.BUNDLE_KEY_SUGGESTION_TERM_CLICKED,
                            viewModel.suggestion_term_clicked
                        )
                        .putExtra(
                            BundleConstants.BUNDLE_KEY_ELASTIC_SEARCH_TYPE,
                            viewModel.mxElasticSearchType
                        )
                        .putExtra(
                            BundleConstants.BUNDLE_KEY_CLICKED_SUGGESTION_TYPE,
                            viewModel.clickedSuggestionType
                        )
                        .putExtra(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE, "Search")*/

                    viewModel.lastScreenName = "SRP"
                 //   resultLauncher?.launch(srpIntent)


                    navigateToSearchResultActivity(
                        params = bundleOf(
                            BundleConstants.SEARCH_TEXT to it.text,
                            BundleConstants.SEARCH_TYPE to it.type,
                            BundleConstants.BUNDLE_KEY_ITEM_QC to viewModel.selectedItemQC,
                            BundleConstants.BUNDLE_KEY_ITEM_RT to viewModel.selectedItemRT,
                            BundleConstants.BUNDLE_KEY_TERM_SEARCHED to  viewModel.searchQuery.value,
                            BundleConstants.BUNDLE_KEY_SUGGESTION_TERM_CLICKED_POSITION to viewModel.suggestion_term_clicked_position,
                            BundleConstants.BUNDLE_KEY_SUGGESTION_TERM_CLICKED to    viewModel.suggestion_term_clicked,
                            BundleConstants.BUNDLE_KEY_ELASTIC_SEARCH_TYPE to  viewModel.mxElasticSearchType,
                            BundleConstants.BUNDLE_KEY_CLICKED_SUGGESTION_TYPE to  viewModel.clickedSuggestionType,
                            BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "Search"
                        ),
                        flags= listOf(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT),
                        activityLauncher = resultLauncher
                    )
                }
                setLastVisibleItemIndex()
                viewModel.sendSearchSuggestionImpressionEvent("suggestion_term")
                viewModel.mxItemSearched.qc =
                    if (viewModel.selectedItemQC.isNullOrEmpty()) null else viewModel.selectedItemQC
                viewModel.mxItemSearched.rt =
                    if (viewModel.selectedItemRT.isNullOrEmpty()) null else viewModel.selectedItemRT
                viewModel.mxItemSearched.exitAction = "suggestion_term"
                viewModel.mxItemSearched.clickedSuggestionType = suggestion.type
                viewModel.sendItem_searched(viewModel.mxItemSearched)
            }
        }

        //text change listener for search box EditText
        addEditTextChangeListener()


        //event to finish activity
        viewModel.eventFinishActivity.observe(this,
            EventObserver {
                hideKeyboard()
                finish()
            })

        //event to launch OrderSummaryActivity
        viewModel.eventOpenOrderSummaryActivity.observe(this,
            EventObserver {
                navigateToOrderSummaryActivity(
                    params = bundleOf(
                        BundleConstants.BUNDLE_KEY_ORDER_ID to SharedPrefManager.getInstance().incompleteOrderId.toString(),
                        BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "search_result",
                        BundleConstants.BUNDLE_KEY_PAGE_SECTION to "view_cart"
                    ),
                    flags = listOf(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
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
                    flags = listOf(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                )

            })

        //event to launch Dialer with call center number
        viewModel.eventCallPharmacist.observe(this,
            EventObserver {
                if (it != null) {
                    val intent =
                        Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", it.toString(), null))
                    startActivity(intent)
                }
            })

        //event to initiate login
        viewModel.eventInitiateLogin.observe(
            this,
            EventObserver { initializationTrueCallerOAuth() })

        viewModel.cartItemCount.observe(this) {
            binding.headerChip.setCartCount(it)
        }

        viewModel.eventLoginOpenBottomSheet.observe(this) { openLoginBottomSheet() }

        binding.rvSearchSuggestion.addOnScrollListener(object :
            RecyclerView.OnScrollListener() {
            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                super.onScrollStateChanged(recyclerView, newState)
            }

            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)
                setLastVisibleItemIndex()
            }
        })
    }

    fun triggerItemSearchedEvent(pastSearchTermClicked: String, clickedPastSearchType: String) {
        viewModel.mxItemSearched.pastSearchTermClicked = pastSearchTermClicked
        viewModel.mxItemSearched.clickedPastSearchType = clickedPastSearchType
        viewModel.mxItemSearched.exitAction = "suggestion_term"
        viewModel.mxItemSearched.timeTaken = 0
        viewModel.mxItemSearched.isPreviouslyViewed = true
        viewModel.mxItemSearched.clickedSuggestionType = clickedPastSearchType
        viewModel.mxItemSearched.resultFoundCount = null

        viewModel.sendItem_searched(viewModel.mxItemSearched)

    }

    private fun setLastVisibleItemIndex() {
        try {
            if (binding.rvSearchSuggestion.adapter != null
                && (binding.rvSearchSuggestion.adapter?.itemCount ?: 0) > 0
                && binding.rvSearchSuggestion.childCount > 0
            ) {
                val layoutManager = binding.rvSearchSuggestion.layoutManager as LinearLayoutManager?
                if (layoutManager != null) {
                    val lastVisiblePosition = layoutManager.findLastCompletelyVisibleItemPosition()
                    if (lastVisiblePosition >= 0) {
                        //val view = layoutManager.findViewByPosition(lastVisiblePosition)
                        if (viewModel.lastVisibleItemPosition <= lastVisiblePosition) {
                            viewModel.lastVisibleItemPosition = lastVisiblePosition
                            /*viewModel.lastVisibleItemPosition = getVisibleViewIndexOnBasisOfHeight(
                                view,
                                lastVisiblePosition
                            )*/
                        }
                    }
                }
            }
        } catch (_: Exception) {
        }
    }

    private fun addEditTextChangeListener() {
        var beforeTextChange = ""

        binding.searchBar.setWatcher(object : TextWatcher {
            override fun beforeTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
                beforeTextChange = charSequence.toString().trim();
            }

            override fun onTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
                viewModel.handler.removeCallbacks(viewModel.searchResultRunner)
            }

            override fun afterTextChanged(editable: Editable) {
                if (isNetworkAvailable(this@SearchSuggestionActivity)) {
                    viewModel.lastVisibleItemPosition = 0

                    if (beforeTextChange.length <= editable.toString().trim { it <= ' ' }.length) {
                        viewModel.mxTermSearchedTriggered = false
                    }

                    if (beforeTextChange.length > editable.toString().trim().length
                        && editable.toString().trim().isNotEmpty()
                    ) {
                        try {
                            setLastVisibleItemIndex()
                            viewModel.sendSearchSuggestionImpressionEvent("back_space")
                            viewModel.mxItemSearched.qc =
                                if (viewModel.selectedItemQC.isNullOrEmpty()) null else viewModel.selectedItemQC
                            viewModel.mxItemSearched.rt =
                                if (viewModel.selectedItemRT.isNullOrEmpty()) null else viewModel.selectedItemRT
                            viewModel.mxItemSearched.exitAction = "back_space"
                            viewModel.sendItem_searched(viewModel.mxItemSearched)
                        } catch (_: Exception) {
                        }
                    }
                    if (editable.toString().trim().isNotEmpty()) {
                        viewModel.searchQuery.value = editable.toString()
                        //removeItemsFromRV()
                        viewModel.searchSuggestionList.value = emptyList()
                        viewModel.searchUIState.postValue(SearchUIStateConstants.LOADING)
                        viewModel.afterTextChanged(editable.toString())
                        backpressed = false
                        searchbarClearPressed = false
                    }
                    if (editable.toString().trim().isEmpty()) {
                        viewModel.searchQuery.value = ""
                        viewModel.searchSuggestionList.value = emptyList()
                        viewModel.updateUIState()
                    }
                } else {
                    showDialogBox(
                        popUpType = PopUpType.INTERNET_FAILURE,
                        object : PopUpDialogCallback {
                            override fun onActionButtonClicked() {
                                hideKeyboard()
                                finish()
                            }

                            override fun onCloseButtonClicked() {
                            }
                        }, isCancelable = false
                    )
                }
            }
        })

        binding.searchBar.setCallBack(object : SearchBarCallback {
            override fun onClearClick() {
                searchbarClearPressed = true
                setLastVisibleItemIndex()
                viewModel.sendSearchSuggestionImpressionEvent("cross")

                viewModel.mxItemSearched.qc =
                    if (viewModel.selectedItemQC.isNullOrEmpty()) null else viewModel.selectedItemQC
                viewModel.mxItemSearched.rt =
                    if (viewModel.selectedItemRT.isNullOrEmpty()) null else viewModel.selectedItemRT
                viewModel.mxItemSearched.exitAction = "cross"
                viewModel.sendItem_searched(viewModel.mxItemSearched)

                binding.searchBar.setSearchText("")
                //this is already there in afterTextChanged event
                //viewModel.searchQuery.value = ""
                //viewModel.searchSuggestionList.value = emptyList()
                //removeItemsFromRV() //not required as we are already making list empty
                //viewModel.updateUIState()


                /*MxSearchSuggestionImpression(viewModel.searchQuery.value, viewModel.suggestion_term_clicked, viewModel.elasticSearchType, "cross", viewModel.searchQuery.value?.length, viewModel.suggestion_term_clicked_position, viewModel.searchResultList.value?.size, "main",
                    viewModel.rtEvent, viewModel.qcEvent, viewModel.recentlySearchedList.value?.isNotEmpty(), viewModel.previouslyViewedList.value?.isNotEmpty(), null)*/
            }

            override fun onIconClick() {

                if (viewModel.searchQuery.value?.isEmpty() == false) {
                    /*if (viewModel.lastVisibleItemPosition == 0) {
                        val layoutManager =
                            binding.rvSearchSuggestion.layoutManager as LinearLayoutManager
                        val visibleItemCount = layoutManager.findLastVisibleItemPosition() + 1
                        viewModel.lastVisibleItemPosition = visibleItemCount
                    }*/
                    backpressed = true
                    setLastVisibleItemIndex()
                    viewModel.sendSearchSuggestionImpressionEvent("back")
                    viewModel.mxItemSearched.qc =
                        if (viewModel.selectedItemQC.isNullOrEmpty()) null else viewModel.selectedItemQC
                    viewModel.mxItemSearched.rt =
                        if (viewModel.selectedItemRT.isNullOrEmpty()) null else viewModel.selectedItemRT
                    viewModel.mxItemSearched.exitAction = "back"
                    viewModel.sendItem_searched(viewModel.mxItemSearched)

                    binding.searchBar.setSearchText("")
                    //this is already there in afterTextChanged event
                    //viewModel.searchQuery.value = ""
                    //viewModel.searchSuggestionList.value = emptyList()
                    //removeItemsFromRV() //not required as we are already making list empty
                    //viewModel.updateUIState()

                } else {
                    hideKeyboard()
                    finish()
                }

            }

            override fun onViewClick() {
            }

        })
    }

    fun removeItemsFromRV() {
        if (binding.rvSearchSuggestion.childCount > 0)
            binding.rvSearchSuggestion.removeAllViews()
    }

    private fun hideKeyboard() {
        try {
            val view = currentFocus
            if (view != null) {
                val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
                imm.hideSoftInputFromWindow(view.windowToken, 0)
            }
        } catch (_: Exception) {
        }
    }

    /*
        fun showKeyboard() {
            try {
                val inputMethodManager =
                    applicationContext.getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
                inputMethodManager.toggleSoftInput(InputMethodManager.SHOW_FORCED, 0)
            } catch (_: Exception) {
            }
        }
    */

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == TcSdk.SHARE_PROFILE_REQUEST_CODE) {
            try {
                TcSdk.getInstance().onActivityResultObtained(this, requestCode, resultCode, data)
            } catch (ignore: Exception) {
            }
        }
    }


    override fun onResume() {
        super.onResume()
        //viewModel.updateUIState()//already call added in setOfflineData()
//        viewModel.setCartCount()
        viewModel.setOfflineData()
        viewModel.eventSendSearchViewedEvent()

//        if (resumeCount > 1) {
//            viewModel.sendItem_searched(viewModel.mxItemSearched)
//        }
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)

        //this code is added to refresh the activity
        finish()
        startActivity(intent)
    }

    override fun onPause() {
        super.onPause()
        hideKeyboard()
    }


    /*fun callNow(number: String?) {
        try {
            if (!TextUtils.isEmpty(number)) {
                val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", number, null))
                startActivity(intent)
            } else {
                Toast().showCustomToastMessage(
                    this@SearchSuggestionActivity,
                    "Something went wrong"
                )
            }
        } catch (ignore: java.lang.Exception) {
        }
    }*/

    private fun getVisibleViewIndexOnBasisOfHeight(
        view: View?,
        lastVisibleItemPosition: Int
    ): Int {
        if (view == null) return 0
        try {
            val globalVisibilityRectangle = Rect()
            view.getGlobalVisibleRect(globalVisibilityRectangle)
            val actualHeight = view.measuredHeight
            val visibleHeight = globalVisibilityRectangle.bottom - globalVisibilityRectangle.top
            return if (visibleHeight > actualHeight / 2) {
                lastVisibleItemPosition + 1
            } else {
                lastVisibleItemPosition
            }
        } catch (_: Exception) {
            return 0
        }
    }

}