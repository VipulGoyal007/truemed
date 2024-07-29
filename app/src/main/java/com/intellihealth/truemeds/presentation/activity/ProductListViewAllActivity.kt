package com.intellihealth.truemeds.presentation.activity

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.OnBackPressedCallback
import androidx.core.content.ContextCompat
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.viewModelScope
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.SimpleItemAnimator
import com.google.common.reflect.TypeToken
import com.google.gson.Gson
import com.intellihealth.salt.adapter.ProductCardChipsAdapter
import com.intellihealth.salt.callbacks.BackArrowClickCallback
import com.intellihealth.salt.callbacks.CartIconClickCallback
import com.intellihealth.salt.callbacks.CartsCallback
import com.intellihealth.salt.callbacks.ProductCardCallback
import com.intellihealth.salt.callbacks.SearchBarCallback
import com.intellihealth.salt.callbacks.StepperCallback
import com.intellihealth.salt.constants.CartsConstants
import com.intellihealth.salt.constants.MobileSectionTypeConstants
import com.intellihealth.salt.models.MobileSectionHeadersModel
import com.intellihealth.salt.models.ProductCardSectionChipModel
import com.intellihealth.salt.models.ProductInfoModel
import com.intellihealth.salt.utils.toPx
import com.intellihealth.salt.views.Toast
import com.intellihealth.salt.views.section.ProductCardSection
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.callback.DeleteCallback
import com.intellihealth.truemeds.data.model.home.CustomerMedicinesResponseModel
import com.intellihealth.truemeds.data.model.mixpanel.MxLoginPageViewed
import com.intellihealth.truemeds.databinding.ActivityProductDetailBinding
import com.intellihealth.truemeds.databinding.ActivityProductListViewAllBinding
import com.intellihealth.truemeds.domain.enums.ElasticSearchType
import com.intellihealth.truemeds.domain.navigation.navigateToCartActivity
import com.intellihealth.truemeds.domain.navigation.navigateToOrderSummaryActivity
import com.intellihealth.truemeds.domain.navigation.navigateToPrescriptionActivity
import com.intellihealth.truemeds.domain.navigation.navigateToProductDetailActivity
import com.intellihealth.truemeds.domain.navigation.navigateToSearchSuggestionActivity
import com.intellihealth.truemeds.mvvm.data.appsflyer.AFLoginPageViewed
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxItemAdded
import com.intellihealth.truemeds.presentation.bottomsheet.cart.RemoveProductBottomSheet
import com.intellihealth.truemeds.presentation.bottomsheet.login.LoginBottomSheet
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.ApiParameterConstants
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.utils.CommonFunc
import com.intellihealth.truemeds.presentation.utils.CommonFunc.isSingleClick
import com.intellihealth.truemeds.presentation.utils.viewBinding
import com.intellihealth.truemeds.presentation.viewmodel.CartViewModel
import com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel
import com.intellihealth.truemeds.presentation.viewmodel.ProductListViewAllViewModel
import com.intellihealth.truemeds.presentation.viewmodel.events.EventObserver
import com.truecaller.android.sdk.oAuth.TcSdk
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.lang.reflect.Type


@AndroidEntryPoint
class ProductListViewAllActivity : BaseActivityWithLogin() {

    private lateinit var context: Context
    private val binding by viewBinding(ActivityProductListViewAllBinding::inflate)
    private val viewModel by lazy { ViewModelProvider(this)[ProductListViewAllViewModel::class.java] }
    private val homeViewModel by lazy { ViewModelProvider(this)[HomeViewModel::class.java] }
    private var listType = ""
    private var heading = ""
    val deleteBottomSheet = RemoveProductBottomSheet()
    var clickedOnPage = ""
    /*private var superCategoryID = 1
    private var highLightPosition = 0
    private var superCategoryType = ""
    private var childCategoryType = ""
    private var childCategories = mutableListOf<ChildCategoryModel>()*/

    private val cartViewModel by lazy { ViewModelProvider(this)[CartViewModel::class.java] }
    private var chipsAdapter: ProductCardChipsAdapter? = null
    var chipList:ArrayList<ProductCardSectionChipModel> = arrayListOf()
    var productCardSectionCallback: ProductCardSection.ProductCardSectionCallback? = null
    private lateinit var bottomSheet : LoginBottomSheet
    override fun extractIntentData(){
        intent.extras?.let { bundle ->

            listType = bundle.getString("type") ?: ""
            heading = bundle.getString("heading") ?: ""
            clickedOnPage = bundle.getString(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE) ?: ""
            viewModel.yourMedicinePatientId = bundle.getString(BundleConstants.BUNDLE_PATIENT_ID) ?: ""
            viewModel.yourMedicineSelectedPos = bundle.getInt(BundleConstants.BUNDLE_YOUR_MEDICINES_SELECTED_POS,0)
            val jsonResponse  = bundle.getString(BundleConstants.BUNDLE_YOUR_MEDICINES_PATIENT_LIST)
            val typeResponse: Type = object : TypeToken<List<CustomerMedicinesResponseModel.ResponseData.PatientDetail>>() {}.type
            if(listType.equals(ApiParameterConstants.CONST_LIST_YOUR_MEDICINE) && jsonResponse!=null) {
                viewModel.yourMedicinePatientList =
                    Gson().fromJson<List<CustomerMedicinesResponseModel.ResponseData.PatientDetail>>(jsonResponse, typeResponse)
                Log.e("your_medicine_list",viewModel.yourMedicinePatientList.toString())
            }
        }}
    override fun sendLoginPageViewedEvent() {
        val mxLoginPageViewed = MxLoginPageViewed(
            viewModel.clickedOnPage,
            pageSection,
            viewModel.isTruecaller
        )
        val afLoginPageViewed = AFLoginPageViewed(viewModel.isTruecaller)
        viewModel.loginPageViewedEvent(mxLoginPageViewed, afLoginPageViewed)
    }

    override fun setIsTruecaller(isTruecaller: Boolean) {
        viewModel.isTruecaller = isTruecaller
    }

    override fun getTrueCallerUserDetails() {
        viewModel.currentPageNameForSignup = viewModel.clickedOnPage
        viewModel.getTrueCallerUserDetails(
            textAuthorizationCode = "authorization_code",
            clientId = resources.getString(R.string.truecaller_client_id),
            authorizationCode,
            codeVerifier,
            context
        )
    }

    override fun openLoginBottomSheet() {
        bottomSheet = LoginBottomSheet("view_all_page", pageSection)
        bottomSheet.isCancelable = false
        if (!bottomSheet.isVisible && isSingleClick())
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
                Log.d("TAG", "onPause: lastScrollPosition ${viewModel.lastScrollPosition}")
                for (i in 0..viewModel.lastScrollPosition) {
                    viewModel.productListObserved.value?.get(i)?.let { pim ->
                        viewModel.sendItemImpressionEvent(
                            pim,
                            "product_list_page",
                            "tray",
                            i + 1,
                            heading,
                            i + 1,
                            1,
                           /* SharedPrefManager.getInstance().deliveryOnAmount.toDouble()*/0.0
                        )
                    }
                }
            } catch (e:Exception){
                Log.d("TAG", "onPause: ${e.printStackTrace()}")
            }
        }

    }


    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        context = this
        initView()

        setListener()
        updateStatusBarColor()
        if(!listType.equals(ApiParameterConstants.CONST_LIST_YOUR_MEDICINE))
        viewModel.callTrendingListApi(listType, 0)
        else {

            /* Chip List */

            if (chipList.isNullOrEmpty()) {

                if (!viewModel.yourMedicinePatientList.isNullOrEmpty() &&
                    viewModel.yourMedicinePatientList.size!! > 1
                ) {
                    chipList.add(ProductCardSectionChipModel("All", 0))
                    for (i in 0..viewModel.yourMedicinePatientList.size!! - 1) {
                        viewModel.yourMedicinePatientList.get(i).let {
                            chipList.add(
                                ProductCardSectionChipModel(
                                    it.patientName,
                                    it.patientId
                                )
                            )
                        }
                    }
                }
            }

            if (!chipList.isNullOrEmpty()) {
                binding.rvProductCardChips.visibility=View.VISIBLE
                handlingCallBack()
                chipsAdapter = ProductCardChipsAdapter(
                    binding.clMainLayout.context,
                    chipList, productCardSectionCallback
                )
                chipsAdapter?.setHasStableIds(true)
                binding.rvProductCardChips.apply {
                    layoutManager =
                        LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
                    this.adapter = chipsAdapter
                }
                chipsAdapter?.setUpdatedSelectedPosition(viewModel.yourMedicineSelectedPos)
            }
            viewModel.pageIndexYourMedicines=0
            viewModel.callPatientListMedicineListApi( viewModel.pageIndexYourMedicines)
        }

    }

    private fun handlingCallBack()
    {
        productCardSectionCallback = object : ProductCardSection.ProductCardSectionCallback {
            override fun cartItemMinus(
                data: com.intellihealth.salt.models.ProductInfoModel,
                pos: Int,
                qty: Int
            ) {

            }

            override fun cartItemPlus(
                data: com.intellihealth.salt.models.ProductInfoModel,
                pos: Int,
                qty: Int
            ) {

            }

            override fun chipListItemClicked(
                position: Int,
                item: ProductCardSectionChipModel?
            ) {
                viewModel.yourMedicinePatientId= if (position == 0) null else
                    viewModel.yourMedicinePatientList.get(
                        position - 1
                    )?.patientId.toString()

                Log.d("qwerty_component","chipListItemClicked : $position")
                viewModel.pageIndexYourMedicines=0
                viewModel.callPatientListMedicineListApi(0)
            }

            override fun deleteAlert(
                data: com.intellihealth.salt.models.ProductInfoModel,
                pos: Int,
                qty: Int
            ) {

            }

            override fun itemViewClick(productDetailModel: com.intellihealth.salt.models.ProductInfoModel) {

            }

            override fun lastScrollPosition(pos: Int) {


            }

            override fun reachedToLastItem() {

            }

            override fun reachedToLastStackedItem() {
            }

            override fun stepperError(
                data: com.intellihealth.salt.models.ProductInfoModel,
                pos: Int,
                msg: String?
            ) {
            }

            override fun viewAllClicked() {
                homeViewModel.viewAllYourMedicinesClick()
            }

            override fun viewAllStackedClicked() {
            }


        }
    }

    private fun setLoadMore(){
        //note:- Paging Logic
        binding.rvProductList.also { rv ->

            rv.addOnScrollListener(object : RecyclerView.OnScrollListener() {
                override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                    super.onScrolled(recyclerView, dx, dy)
                    val layoutManager = recyclerView.layoutManager as GridLayoutManager?
                    val firstVisiblePosition = layoutManager!!.findFirstVisibleItemPosition()
                    val lastVisiblePosition = layoutManager.findLastVisibleItemPosition()
                    Log.d("TAG", "lastVisiblePosition: lastScrollPosition $lastVisiblePosition")
                    viewModel.lastScrollPosition = lastVisiblePosition
                    Log.d("TAG", "rvProductList: lastScrollPosition ${viewModel.lastScrollPosition}")
                    val view = layoutManager.findViewByPosition(lastVisiblePosition)

                    if(!listType.equals(ApiParameterConstants.CONST_LIST_YOUR_MEDICINE)){
                        with(viewModel) {
                            if (productListData.isNullOrEmpty()) return
                            if (!hasMoreData) return

                        }

//                    if (lastVisiblePosition == viewModel.productListData.size - 1 && viewModel.productListData
//                            .size >= 20 && !viewModel.isLoadingMore && !viewModel.stopPagging
//                    ) {
                        if (lastVisiblePosition == viewModel.productListObserved.value!!
                                .size - 1 && viewModel.productListObserved.value!!
                                .size >= 10 && !viewModel.isLoadingMore && !viewModel.stopPagging
                        ) {
                            viewModel.showProgressBar.postValue(true)
                            viewModel.isLoadingMore = true
                            lifecycleScope.launch(IO) {
                                viewModel.loadMoreResults(true, listType)
                            }


                        }}
                    // managing case for your medicines listing
                    else if(listType.equals(ApiParameterConstants.CONST_LIST_YOUR_MEDICINE))
                    {
                        with(viewModel) {
                            if (productListData.isNullOrEmpty()) return
                            if (!hasMoreData) return

                        }

                        if (lastVisiblePosition == viewModel.productListObserved.value!!
                                .size - 1 && viewModel.productListObserved.value!!
                                .size >= 8 && !viewModel.isLoadingMore && !viewModel.stopPagging
                        ) {
                            viewModel.showProgressBar.postValue(true)
                            viewModel.isLoadingMore = true
                            lifecycleScope.launch(IO) {
                                viewModel.pageIndexYourMedicines=viewModel.pageIndexYourMedicines+1
                                viewModel.loadMoreYourMedicinesResults()
                            }

                        }}


                }
            })

        }
    }
    private fun initView() {
        binding.lifecycleOwner = this
        extractIntentData()


        viewModel.sectionHeading = heading.replace(" ", "_")
        val header = MobileSectionHeadersModel(
            headerText = heading,
            cartCount = 0,
            buttonText = null,
            subHeaderText = null,
            subHeaderTextTwo = null
        )
        //setHeaderData(MobileSectionTypeConstants.DEFAULT_WITHOUT_FILL)
//        viewModel = ViewModelProvider(this)[ProductListViewAllViewModel::class.java]
//        homeViewModel = ViewModelProvider(this)[HomeViewModel::class.java]
        //binding.productListViewAllViewModel = productListViewAllViewModel
        lifecycle.addObserver(viewModel)
        binding.viewModel = viewModel
        binding.fragmentManager = supportFragmentManager
        binding.mobileSectionHeadersTextWithCTA.setMobileSectionHeadersViewType(
            MobileSectionTypeConstants.TEXT_WITH_ICONS
        )
        binding.mobileSectionHeadersTextWithCTA.setUpMobileSectionHeadersData(header)

        setObservers()
        setCallbacks()

        (binding.rvProductList.itemAnimator as SimpleItemAnimator).supportsChangeAnimations = false
        binding.rvProductList.itemAnimator = null

        setLoadMore()

        viewModel.showProgressBar.observe(this) {
            if (it==true) binding.rvProductList.setPadding(0.toPx,0.toPx,0.toPx,36.toPx)
            else binding.rvProductList.setPadding(0.toPx,0.toPx,0.toPx,0.toPx)
        }
        viewModel.showProductListView.observe(this){

//            if (it==true) binding.rvProductList.setPadding(0.toPx,0.toPx,0.toPx,36.toPx)
//            else binding.rvProductList.setPadding(0.toPx,0.toPx,0.toPx,0.toPx)
        }


        viewModel.eventInitiateLogin.observe(
            this,
            EventObserver {
                pageSection = "proceed_to_cart"
                initializationTrueCallerOAuth()
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

        viewModel.eventOpenPrescriptionActivity.observe(this,
            EventObserver {
                navigateToPrescriptionActivity(
                    params = bundleOf(
                        BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "homepage",
                        BundleConstants.BUNDLE_KEY_PAGE_SECTION to "toolbar_cart"
                    ),
                    isFlagAdded = true
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
        val horizontalSpace = 0
        val verticalSpace = -2
        binding.rvProductList.addItemDecoration(OtcCategoryActivity.SpacesItemDecoration(horizontalSpace = horizontalSpace, verticalSpace = verticalSpace))
    }

    override fun onResume() {
        super.onResume()
        viewModel.setCartCount()
        viewModel.syncExistingCartProducts(emptyList())
    }

    override fun updateStatusBarColor() {
        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                window.decorView.systemUiVisibility =
                    View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR //  set status text dark
                window.statusBarColor =
                    ContextCompat.getColor(this, R.color.white) // set status background white
            }
        } catch (ignore: java.lang.Exception) {
        }
    }

    private fun setCallbacks() {
        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                onBackSetResult()
                finish()
            }
        })
        binding.mobileSectionHeadersTextWithCTA.setBackArrowClickCallback(object :
            BackArrowClickCallback {
            override fun onBackArrowClick() {
                onBackSetResult()
                finish()
            }
        })


    }

    private fun setObservers() {
        /*viewModel.showShimmerLiveData.observe(this) {
            if (it) {
                binding.shimmerViewContainer.startShimmerAnimation()
            } else {
                binding.shimmerViewContainer.stopShimmerAnimation()
            }
        }*/


        /*//event to launch OrderSummaryActivity
        viewModel.eventOpenOrderSummaryActivity.observe(this,
            com.intellihealth.truemeds.presentation.viewmodel.events.EventObserver {
                startActivity(Intent(context, OrderSummaryActivity::class.java).apply {
                    putExtra(
                        BundleConstants.BUNDLE_KEY_ORDER_ID,
                        SharedPrefManager.getInstance().incompleteOrderId.toString()
                    )
                    putExtra(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE, "search_result")
                    putExtra(BundleConstants.BUNDLE_KEY_PAGE_SECTION, "view_cart")
                })
            })

        //event to launch CartActivity
        viewModel.eventOpenCartActivity.observe(this,
            com.intellihealth.truemeds.presentation.viewmodel.events.EventObserver {
                startActivity(Intent(context, CartActivity::class.java).apply {
                    putExtra(
                        BundleConstants.BUNDLE_KEY_ORDER_ID,
                        SharedPrefManager.getInstance().incompleteOrderId.toString()
                    )
                    putExtra(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE, "search_result")
                    putExtra(BundleConstants.BUNDLE_KEY_PAGE_SECTION, "view_cart")
                })
            })*/

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
        /*viewModel.eventInitiateLogin.observe(
            this,
            com.intellihealth.truemeds.presentation.viewmodel.events.EventObserver { initializationTrueCallerOAuth() })


        viewModel.eventLoginOpenBottomSheet.observe(this) { openLoginBottomSheet() }*/

        homeViewModel.isCallAndOrderClicked.observe(this) {
            it?.let {
                if (it) {
                    try {
                        val u = Uri.parse("tel:" + SharedPrefManager.getInstance().customerCareNumber)
                        val i = Intent(Intent.ACTION_DIAL, u)
                        startActivity(i)
                    } catch (_: Exception) {
                        Toast().showCustomToastMessage(this, "An error occurred")
                    }
                }
            }

        }
    }

    private fun setListener() {
        val searchCallback = object : SearchBarCallback {
            override fun onClearClick() {
                TODO("Not yet implemented")
            }

            override fun onIconClick() {
              /*  startActivity(
                    Intent(
                        this@ProductListViewAllActivity,
                        SearchSuggestionActivity::class.java
                    ).putExtra(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE, clickedOnPage)
                        .putExtra(BundleConstants.BUNDLE_KEY_PAGE_SECTION, "search_bar")
                        .addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                )*/

                navigateToSearchSuggestionActivity(
                    params = bundleOf(
                        BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to clickedOnPage,
                        BundleConstants.BUNDLE_KEY_PAGE_SECTION to "search_bar"
                    ),
                    flags= listOf(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                )
            }

            override fun onViewClick() {
             /*   startActivity(
                    Intent(
                        this@ProductListViewAllActivity,
                        SearchSuggestionActivity::class.java
                    ).putExtra(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE, "pdp")
                        .putExtra(BundleConstants.BUNDLE_KEY_PAGE_SECTION, "search_bar")
                            .addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                )*/


                navigateToSearchSuggestionActivity(
                    params = bundleOf(
                        BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "pdp",
                        BundleConstants.BUNDLE_KEY_PAGE_SECTION to "search_bar"
                    ),
                    flags= listOf(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                )
            }

        }
        val cartCallback = object : CartIconClickCallback {
            override fun onCartIconClick() {
                /*if (viewModel.cartCount.value!! > 0) {
                    startActivity(Intent(this@ProductListViewAllActivity, CartActivity::class.java))
                    //startActivity(Intent(this, CartActivity::class.java))
                } else if (viewModel.cartCount.value!! == 0 &&
                    SharedPrefManager.getInstance().prescriptionCount > 0
                ) {
                    startActivity(
                        Intent(
                            this@ProductListViewAllActivity,
                            OrderSummaryActivity::class.java
                        )
                    )
                    //startActivity(Intent(activity, OrderSummaryActivity::class.java))
                }*/

                viewModel.onViewCartClicked("view_cart")
            }

        }

        val productCallback = object : ProductCardCallback {
            override fun viewClick(productDetailModel: ProductInfoModel) {
                /*val myIntent =
                    Intent(this@ProductListViewAllActivity, ProductDetailActivity::class.java)
               //  myIntent.putExtra(BundleConstants.IS_SUBS, true)
                myIntent.putExtra(
                    BundleConstants.PRODUCT_CODE,
                    productDetailModel.product.productCode
                )
                myIntent.putExtra(
                    BundleConstants.SEARCH_TYPE,
                    ElasticSearchType.FETCH_PRODUCT_DETAILS.toString()
                )
                myIntent.putExtra(
                    BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE,
                    "homepage"
                )
                startActivity(myIntent)*/

                navigateToProductDetailActivity(
                    params = bundleOf(
                        BundleConstants.PRODUCT_CODE to productDetailModel.product.productCode,
                        BundleConstants.SEARCH_TYPE to ElasticSearchType.FETCH_PRODUCT_DETAILS.toString(),
                        BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "homepage",
                        )
                )
            }

        }

        val stepperCallback: StepperCallback = object : StepperCallback {
            override fun cartItemPlus(qty: Int) {
                com.intellihealth.salt.views.Toast()
                    .showCustomToastMessage(this@ProductListViewAllActivity, "$qty")
            }

            override fun cartItemMinus(qty: Int) {
                com.intellihealth.salt.views.Toast()
                    .showCustomToastMessage(this@ProductListViewAllActivity, "$qty")
            }

            override fun stepperError(msg: String?) {
                com.intellihealth.salt.views.Toast()
                    .showCustomToastMessage(this@ProductListViewAllActivity, "$msg")
            }


        }

        viewModel.productListObserved.observe(this@ProductListViewAllActivity){
            if (!it.isNullOrEmpty()){
                /*binding.contentScroll.notifyMeOnBottomReached(
                    AppConstants.OTC_CATEGORY_PAGE_COUNT,
                    viewModel.productListObserved.value?.size ?: 0
                ){
                    viewModel.callTrendingListApi(listType, it )

                }*/
            }
        }

        binding.mobileSectionHeadersTextWithCTA.setSearchIconClickCallBack(searchCallback)
        binding.mobileSectionHeadersTextWithCTA.setCartIconClickCallBack(cartCallback)
        binding.productCardCallback = productCallback
        //productListViewAllViewModel.setCartCount()

        viewModel.cartModel.observe(this) {
            lifecycleScope.launch(Dispatchers.IO) { viewModel.setCartCount() }

            binding.mobileSectionHeadersTextWithCTA.updateHeaderChipCount((it?.count ?: 0))
            binding.tmCarts.updateTotalItemsInCartCount(it?.count ?: 0, it?.amount ?: 0.0, SharedPrefManager.getInstance().prescriptionCount)
        }
        binding.tmCarts.setCallback(object : CartsCallback {
            override fun viewClickCallback(viewType: CartsConstants) {
                when (viewType) {
                    CartsConstants.VIEW_CART -> {
                        viewModel.onViewCartClicked("view_cart")
                    }

                    else -> {}
                }
            }

        })

        binding.btnCurrentLocation.setOnClickListener{
            homeViewModel.isCallAndOrderClicked.postValue(true)
        }

    }

    fun onBackSetResult(){
        setResult(Activity.RESULT_OK)
    }
    private fun dismiss() {
        if (deleteBottomSheet.isVisible) {
            deleteBottomSheet.dismiss()
        }
    }

    private fun showConfirmationDialog(productCode: String, isSubs: Boolean) {
        deleteBottomSheet.isCancelable = true
        if (!deleteBottomSheet.isVisible) deleteBottomSheet.setBottomSheet(cartViewModel)
        deleteBottomSheet.show(supportFragmentManager, "Discard unsaved details?")
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == TcSdk.SHARE_PROFILE_REQUEST_CODE) {
            try {
                TcSdk.getInstance().onActivityResultObtained(this, requestCode, resultCode, data)
            } catch (ignore: Exception) {
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        CommonFunc.freeMemory()
    }
}