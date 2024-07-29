package com.intellihealth.truemeds.presentation.activity


import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.graphics.Rect
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.viewModels
import androidx.core.os.bundleOf
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearSmoothScroller
import androidx.recyclerview.widget.RecyclerView
import com.google.common.reflect.TypeToken
import com.google.gson.Gson
import com.intellihealth.salt.callbacks.BackArrowClickCallback
import com.intellihealth.salt.callbacks.CartIconClickCallback
import com.intellihealth.salt.callbacks.CartsCallback
import com.intellihealth.salt.callbacks.ProductCardCallback
import com.intellihealth.salt.callbacks.SearchBarCallback
import com.intellihealth.salt.callbacks.StepperCallback
import com.intellihealth.salt.callbacks.TopDealCallback
import com.intellihealth.salt.constants.CartsConstants
import com.intellihealth.salt.constants.MobileSectionTypeConstants
import com.intellihealth.salt.models.MobileSectionHeadersModel
import com.intellihealth.salt.models.ProductInfoModel
import com.intellihealth.salt.views.Toast
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.callback.DeleteCallback
import com.intellihealth.truemeds.data.model.home.ChildCategoryModel
import com.intellihealth.truemeds.data.model.home.SuperCategoryModel
import com.intellihealth.truemeds.data.model.mixpanel.MxLoginPageViewed
import com.intellihealth.truemeds.data.utils.MESSAGES
import com.intellihealth.truemeds.databinding.ActivityOtcCategoryBinding
import com.intellihealth.truemeds.domain.navigation.navigateToCartActivity
import com.intellihealth.truemeds.domain.navigation.navigateToOrderSummaryActivity
import com.intellihealth.truemeds.domain.navigation.navigateToPrescriptionActivity
import com.intellihealth.truemeds.domain.navigation.navigateToSearchSuggestionActivity
import com.intellihealth.truemeds.mvvm.data.appsflyer.AFLoginPageViewed
import com.intellihealth.truemeds.mvvm.data.mixpanel.MXFilterClicked
import com.intellihealth.truemeds.presentation.adapter.HomeOtcCategoryAdapter
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxItemAdded
import com.intellihealth.truemeds.presentation.bottomsheet.filter.FilterBottomSheet
import com.intellihealth.truemeds.presentation.bottomsheet.login.LoginBottomSheet
import com.intellihealth.truemeds.presentation.bottomsheet.productdetail.ProductDetailBottomSheet
import com.intellihealth.truemeds.presentation.bottomsheet.search.RemoveProductBottomSheet
import com.intellihealth.truemeds.presentation.callbacks.GenericCallback
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.stickyscrollview.IScrollViewListener
import com.intellihealth.truemeds.presentation.utils.AppConstants
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.utils.CommonFunc
import com.intellihealth.truemeds.presentation.utils.CommonFunc.isSingleClickParam
import com.intellihealth.truemeds.presentation.utils.CommonFunc.notifyMeOnBottomReached
import com.intellihealth.truemeds.presentation.utils.CommonFunc.smoothSnapToPosition
import com.intellihealth.truemeds.presentation.utils.CommonFunc.toAppProductModel
import com.intellihealth.truemeds.presentation.utils.CommonFunc.toSdkProductModelList
import com.intellihealth.truemeds.presentation.utils.viewBinding
import com.intellihealth.truemeds.presentation.viewmodel.MyOrderViewModel
import com.intellihealth.truemeds.presentation.viewmodel.events.EventObserver
import com.truecaller.android.sdk.oAuth.TcSdk
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch
import java.lang.reflect.Type


@AndroidEntryPoint
class OtcCategoryActivity : BaseActivityWithLogin(),
    ProductDetailBottomSheet.CrossSellingProductBSCallback {

    private lateinit var context: Context
    private val binding by viewBinding(ActivityOtcCategoryBinding::inflate)
    val viewModel: MyOrderViewModel by viewModels()
    private var allSuperCategory = 1
    private var childCategories = mutableListOf<ChildCategoryModel>()
    private var pdBottomsheetCallbackListener: ProductDetailBottomSheet.CrossSellingProductBSCallback? =
        null
    lateinit var topDealProduct: com.intellihealth.truemeds.presentation.model.ProductInfoModel
    private var mLocationLastClickTime = 0L
    private var mLocationLastClickTimeForFilter = 0L

    private var lastVisibleItemPositionForTopSix = 0
    private var lastVisibleItemPositionForLaterTen = 0
    private lateinit var loader: Dialog

    val topSixSeenItemsSet = mutableSetOf<Int>()
    val restTopSixSeenItemsSet = mutableSetOf<Int>()
    var catList: List<ChildCategoryModel> = listOf()
    var banners: List<SuperCategoryModel.BannersItem> = listOf()
    private lateinit var bottomSheet : LoginBottomSheet

    override fun sendLoginPageViewedEvent() {
        val mxLoginPageViewed = MxLoginPageViewed(
            "otc_category",
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
        viewModel.currentPageNameForSignup = "otc_category"
        viewModel.getTrueCallerUserDetails(
            textAuthorizationCode = "authorization_code",
            clientId = resources.getString(R.string.truecaller_client_id),
            authorizationCode,
            codeVerifier,
            context
        )
    }

    override fun openLoginBottomSheet() {
        bottomSheet = LoginBottomSheet("otc_category", pageSection)
        bottomSheet.isCancelable = false
        if (!bottomSheet.isVisible && CommonFunc.isSingleClickParam(500))
            bottomSheet.show(supportFragmentManager, "LocationBottomSheet")
    }

    override fun closeLoginBottomSheet() {
        if (this::bottomSheet.isInitialized && bottomSheet.isVisible) {
            bottomSheet.dismiss()
        }
    }

    override fun onPause() {
        super.onPause()
        sendItemImpression()
    }

    private fun sendItemImpression() {
        lifecycleScope.launch {
            try {

                if (lastVisibleItemPositionForTopSix == 0 || lastVisibleItemPositionForLaterTen == 0) {
                    updateLastVisibleItemCount(
                        recyclerView = binding.rvTopProductCard,
                        isTopSix = true
                    )
                    updateLastVisibleItemCount(
                        recyclerView = binding.rvBottomProductCard,
                        isTopSix = false
                    )
                }

                viewModel.sendProductItemImpressionEventToMixPanelForTopSix(
                    lastVisibleItemPositionForTopSix
                )

                if (lastVisibleItemPositionForLaterTen > 0) {
                    viewModel.sendProductItemImpressionEventToMixPanelForLaterTen(
                        lastVisibleItemPositionForLaterTen
                    )
                }
            } catch (e: Exception) {
                Log.d("TAG", "onPause: ${e.printStackTrace()}")
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        pdBottomsheetCallbackListener = this
        supportActionBar?.hide()
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        binding.fragmentManager = supportFragmentManager
        context = this

        extractIntentData()
        initUI()
        setListener()
        updateStatusBarColor()

    }

    override fun extractIntentData(){
        intent.extras?.let { bundle ->

            try {
                if(bundle.getString(BundleConstants.CATEGORY_LIST)!=null) {
                    val type: Type = object : TypeToken<List<ChildCategoryModel>?>() {}.type
                    catList = Gson().fromJson(
                        bundle.getString(BundleConstants.CATEGORY_LIST),
                        type
                    )
                }
                if (bundle.getString(BundleConstants.OTC_BANNERS) != null) {
                    val banner: Type =
                        object : TypeToken<List<SuperCategoryModel.BannersItem>?>() {}.type
                    banners = Gson().fromJson(
                        bundle.getString(BundleConstants.OTC_BANNERS), banner
                    )
                }
            } catch (ignore: Exception) {
            }

            viewModel.highLightPosition = bundle.getInt(BundleConstants.POSITION, 0)
            viewModel.otcHighLightedCategoryPosition = bundle.getInt(BundleConstants.POSITION, 0)
            viewModel.superCategoryID = bundle.getInt(BundleConstants.CATEGORY_ID, 1)
            allSuperCategory = bundle.getInt(BundleConstants.SUPER_CAT_ID, 1)
            viewModel.childCategoryType = bundle.getString(BundleConstants.TYPE) ?: "All"
            viewModel.superCategoryType =
                bundle.getString(BundleConstants.CATEGORY_TYPE) ?: "LEVEL3"

            if (bundle.containsKey(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE)) {
                viewModel.clickedOnPage =
                    bundle.getString(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE).toString()
            }

        }
    }

    private fun initUI() {
        val header = MobileSectionHeadersModel(
            headerText = HomeOtcCategoryAdapter.superCategoryName,
            cartCount = 0,
            buttonText = null,
            subHeaderText = null,
            subHeaderTextTwo = null
        )

        val id =
            if (viewModel.childCategoryType == "All") allSuperCategory else viewModel.superCategoryID
        childCategories.add(
            ChildCategoryModel(
                id = id,
                name = "All",
                type = "LEVEL1",
                collectionId = if (viewModel.highLightPosition == catList.size) catList[catList.size - 1].collectionId else catList[viewModel.highLightPosition].collectionId,
                categoryLevel3List = emptyList(),
                image = HomeOtcCategoryAdapter.superCategoryImage
            )
        )
        childCategories.addAll(catList)
        viewModel.childCategoryList.postValue(childCategories)
        viewModel.getOtcProductsByCategory(
            page = 0,
            categoryID = viewModel.superCategoryID,
            type = viewModel.superCategoryType,
            collectionId = childCategories[viewModel.highLightPosition].collectionId,
            isBrandOnly = false,
        )
        binding.header.setMobileSectionHeadersViewType(MobileSectionTypeConstants.TEXT_WITH_ICONS)
        binding.header.setUpMobileSectionHeadersData(header)
        binding.selectedChild = viewModel.highLightPosition
        viewModel.filterListClick(childCategories, viewModel.childCategoryType)
        viewModel.updateIds(
            id,
            viewModel.superCategoryType,
            childCategories[viewModel.highLightPosition].collectionId
        )

        setOTCBanner(banners)

        val horizontalSpace = 0
        val verticalSpace = -2
        binding.rvTopProductCard.addItemDecoration(
            SpacesItemDecoration(
                horizontalSpace = horizontalSpace,
                verticalSpace = verticalSpace
            )
        )
        binding.rvBottomProductCard.addItemDecoration(
            SpacesItemDecoration(
                horizontalSpace = horizontalSpace,
                verticalSpace = verticalSpace
            )
        )
        loader = Dialog(this)

        binding.contentScroll.setScrollViewListener(object : IScrollViewListener {
            override fun onScrollChanged(
                scrollX: Int,
                scrollY: Int,
                oldScrollX: Int,
                oldScrollY: Int
            ) {
                super.onScrollChanged(scrollX, scrollY, oldScrollX, oldScrollY)
                if (scrollY > oldScrollY) {
                    updateLastVisibleItemCount(
                        recyclerView = binding.rvTopProductCard,
                        isTopSix = true
                    )
                    updateLastVisibleItemCount(
                        recyclerView = binding.rvBottomProductCard,
                        isTopSix = false
                    )
                }
            }

        })
    }

    private fun updateLastVisibleItemCount(recyclerView: RecyclerView, isTopSix: Boolean) {
        val layoutManager = recyclerView.layoutManager
        if (layoutManager is GridLayoutManager) {
            val firstVisibleItemPosition = layoutManager.findFirstVisibleItemPosition()
            val lastVisibleItemPosition = layoutManager.findLastVisibleItemPosition()
            val seenItemsSet = if (isTopSix) topSixSeenItemsSet else restTopSixSeenItemsSet

            // Add unseen items to the set
            for (i in firstVisibleItemPosition..lastVisibleItemPosition) {
                val isVisible = getVisibleView(view = layoutManager.findViewByPosition(i))
                if (isVisible) {
                    seenItemsSet.add(i)
                }
            }
            // Use seenItemCount as needed
            if (isTopSix) {
                if (lastVisibleItemPositionForTopSix < seenItemsSet.size) {
                    lastVisibleItemPositionForTopSix = seenItemsSet.size
                }
            } else {
                if (lastVisibleItemPositionForLaterTen < seenItemsSet.size) {
                    lastVisibleItemPositionForLaterTen = seenItemsSet.size
                }
            }
        }
    }

    private fun setOTCBanner(banners: List<SuperCategoryModel.BannersItem>) {
        binding.bannerList = banners
        if (banners.isNotEmpty())
            setBannerVisibility(viewModel.childCategoryType == "All")
        else
            setBannerVisibility(false)
    }

    override fun onResume() {
        super.onResume()
        viewModel.setCartCount()
        viewModel.syncExistingCartProducts(viewModel.productList.value!!)
        viewModel.syncExistingTopDealsProducts(viewModel.topDeals.value!!)
    }

    private fun setListener() {
        var filterBottomSheet: FilterBottomSheet? = null

        binding.tvPrescription.setOnClickListener {
            val lastRecordedData =
                com.intellihealth.truemeds.data.utils.isSingleClick(mLocationLastClickTime)
            mLocationLastClickTime = lastRecordedData.second
            if (lastRecordedData.first) {
                filterBottomSheet = FilterBottomSheet(viewModel.childCategoryType)
                filterBottomSheet?.isCancelable = true
                filterBottomSheet?.show(supportFragmentManager, "Filter")

                viewModel.sendFilterClickedEvent(
                    MXFilterClicked(
                        clickedOnPage = viewModel.clickedOnPage,
                        categoryName = viewModel.childCategoryType,
                        superCategoryName = HomeOtcCategoryAdapter.superCategoryName
                    )
                )
            }
        }

        val searchCallback = object : SearchBarCallback {
            override fun onClearClick() {
                TODO("Not yet implemented")
            }

            override fun onIconClick() {
                navigateToSearchSuggestionActivity(
                    params = bundleOf(
                        BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "otc_page",
                        BundleConstants.BUNDLE_KEY_PAGE_SECTION to "search_bar"
                    ),
                    flags= listOf(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                )
            }

            override fun onViewClick() {
                navigateToSearchSuggestionActivity(
                    flags= listOf(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                )
            }

        }
        val backArrowClickCallback = object : BackArrowClickCallback {
            override fun onBackArrowClick() {
                finish()
            }
        }
        val cartCallback = object : CartIconClickCallback {
            override fun onCartIconClick() {
                viewModel.onViewCartClicked("view_cart")
            }

        }

        val productCallback = object : ProductCardCallback {
            override fun viewClick(productDetailModel: ProductInfoModel) {
                viewModel.currentProductCode = productDetailModel.product.productCode
                val productDetailsBottomSheet =
                    ProductDetailBottomSheet(
                        productDetailModel.product.productCode ?: "",
                        false,
                        isFromCrossSelling = true,
                        listener = pdBottomsheetCallbackListener,
                        clickedOnPage = "product_list_page",
                        pageSection = "main",
                        otcSuperCategoryName = HomeOtcCategoryAdapter.superCategoryName,
                        otcSubCategoryName = viewModel.fitteredSubCategoryName,
                        otcCategoryName = viewModel.childCategoryType,
                        isHideToolbar = true
                    )
                lifecycleScope.launch(IO) {
                    val count =
                        viewModel.getMedicineCount(productDetailModel.product.productCode ?: "")
                    productDetailModel.product.qty = count
                    productDetailsBottomSheet.isCancelable = true
                    /*productDetailsBottomSheet.dataFromOrderStatus(
                        false,
                        productDetailModel.toAppProductModel(),
                        isOTC = true
                    )*/
                    val lastRecordedData =
                        com.intellihealth.truemeds.data.utils.isSingleClick(mLocationLastClickTime)
                    mLocationLastClickTime = lastRecordedData.second
                    if (!productDetailsBottomSheet.isVisible && lastRecordedData.first) {
                        productDetailsBottomSheet.show(
                            supportFragmentManager, "ProductDetailBottomsheet"
                        )
                    }
                }
            }

        }

        val callback: TopDealCallback = object : TopDealCallback {
            override fun onProductSelected(product: ProductInfoModel, position: Int) {
                topDealProduct = product.toAppProductModel()
                viewModel.topDealPosition = position
                binding.topDeals.onItemClick(position)
            }

            override fun onProductSwipe(product: ProductInfoModel, position: Int) {
                topDealProduct = viewModel.topDeals.value?.get(position)!!
                viewModel.topDealPosition = position
            }

            override fun onViewProduct(product: ProductInfoModel, position: Int) {
                viewModel.currentProductCode = product.product.productCode
                val productDetailsBottomSheet =
                    ProductDetailBottomSheet(
                        product.product.productCode ?: "",
                        false,
                        isFromCrossSelling = true,
                        listener = pdBottomsheetCallbackListener,
                        clickedOnPage = "product_list_page",
                        pageSection = "main",
                        isHideToolbar = true
                    )
                productDetailsBottomSheet.isCancelable = true
                /*productDetailsBottomSheet.dataFromOrderStatus(
                    false,
                    product.toAppProductModel(),
                    c = true
                )*/
                val lastRecordedData =
                    com.intellihealth.truemeds.data.utils.isSingleClick(mLocationLastClickTime)
                mLocationLastClickTime = lastRecordedData.second
                if (!productDetailsBottomSheet.isVisible && lastRecordedData.first) {
                    productDetailsBottomSheet.show(
                        supportFragmentManager, "ProductDetailBottomsheet"
                    )
                }

                /* val myIntent =
                     Intent(this@OtcCategoryActivity, ProductDetailActivity::class.java)
                 myIntent.putExtra(BundleConstants.IS_SUBS, false)
                 myIntent.putExtra(
                     BundleConstants.PRODUCT_CODE,
                     product.product.productCode
                 )
                 myIntent.putExtra(
                     BundleConstants.SEARCH_TYPE,
                     ElasticSearchType.FETCH_PRODUCT_DETAILS.toString()
                 )
                 startActivity(myIntent)*/
            }
        }

        val stepperCallback: StepperCallback = object : StepperCallback {
            override fun cartItemPlus(qty: Int) {
                if (::topDealProduct.isInitialized) {
                    if (qty == 1) {
                        var item = MxItemAdded()

                        var sectionHeading = ""
                        if (!viewModel.childCategoryList.value.isNullOrEmpty()) {
                            val categoriesList = viewModel.childCategoryList.value!!
                            if (categoriesList.size > viewModel.highLightPosition) {
                                val dataModel =
                                    categoriesList[viewModel.otcHighLightedCategoryPosition]
                                sectionHeading = dataModel.name ?: ""
                            }
                        }
                        item.clickedOnPage = "product_list_page"
                        item.categoryName = sectionHeading
                        item.superCategoryName = HomeOtcCategoryAdapter.superCategoryName
                        item.sectionHeading = if (sectionHeading.equals(
                                "all",
                                true
                            )
                        ) HomeOtcCategoryAdapter.superCategoryName else sectionHeading
                        item.sectionIndex = viewModel.topDealPosition + 1
                        item.pageSection = "main"
//                        viewModel.sendItemAddedEvent(viewModel.topDeals.value?.get(viewModel.topDealPosition),null,null, item)
                        Toast().showCustomToastMessage(
                            context,
                            context.getString(R.string.item_added)
                        )
                        viewModel.addToCart(topDealProduct, false, qty, item)
                    } else {
                        viewModel.updateQuantity(topDealProduct, qty)
                    }
                    viewModel.topDeals.value?.get(viewModel.topDealPosition)?.product?.qty = qty
                    binding.topDeals.setData(
                        viewModel.topDeals.value?.toSdkProductModelList()!!,
                        callback,
                        viewModel.topDealPosition
                    )
                }
            }

            override fun cartItemMinus(qty: Int) {
                if (qty == 0) {
                    viewModel.removeItemFromCart(topDealProduct, false)
                } else {
                    viewModel.updateQuantity(topDealProduct, qty)
                }
                viewModel.topDeals.value?.get(viewModel.topDealPosition)?.product?.qty = qty
                binding.topDeals.setData(
                    viewModel.topDeals.value?.toSdkProductModelList()!!,
                    callback,
                    viewModel.topDealPosition
                )
            }

            override fun stepperError(msg: String?) {
//                Toast().showCustomToastMessage(this@OtcCategoryActivity, "$msg")
            }

            override fun deleteAlert() {
                val removeProductBottomSheet =
                    RemoveProductBottomSheet(object : DeleteCallback {
                        override fun yesClick() {
                            viewModel.removeItemFromCart(topDealProduct, false)
                            val updatedDeals = viewModel.topDeals.value.apply {
                                this?.get(viewModel.topDealPosition)?.product?.qty = 0
                            }
                            binding.topDeals.setData(
                                updatedDeals?.toSdkProductModelList()!!,
                                callback,
                                viewModel.topDealPosition
                            )
                        }

                    })
                removeProductBottomSheet.isCancelable = true
                if (!removeProductBottomSheet.isVisible && supportFragmentManager != null && isSingleClickParam())
                    removeProductBottomSheet.show(supportFragmentManager, "remove product")
            }


        }

        viewModel.productList.observe(this) {
            if (it.isNotEmpty()) {
                binding.contentScroll.notifyMeOnBottomReached(
                    AppConstants.OTC_CATEGORY_PAGE_COUNT, viewModel.productList.value?.size!!
                ) { page ->
                    if (viewModel.isNextPageAvailable) {
                        val id =
                            if (viewModel.childCategoryType == "All") allSuperCategory else viewModel.superCategoryID
                        viewModel.updateIds(
                            id,
                            viewModel.superCategoryType,
                            childCategories[viewModel.highLightPosition].collectionId
                        )
                        var filteredBrands = viewModel.allBrandIs.map { name -> name?.brandName }

                        viewModel.getOtcProductsByCategory(
                            page = page,
                            categoryID = id,
                            type = viewModel.superCategoryType,
                            collectionId = childCategories[viewModel.highLightPosition].collectionId,
                            brands = if (filteredBrands.isNotEmpty()) filteredBrands as List<String> else emptyList(),
                            isBrandOnly = false,
                            isListPaginating = true
                        )
                    }

                }

                binding.topDeals.setCallback(stepperCallback)

            }
        }

        viewModel.topDeals.observe(this) {
            if (!it.isNullOrEmpty()) {
                topDealProduct = it.getOrNull(viewModel.topDealPosition)?: return@observe
                binding.topDeals.setData(
                    it.toSdkProductModelList(),
                    callback,
                    viewModel.topDealPosition
                )
            }
        }

        val genericCallback = object : GenericCallback {
            override fun onActionTriggered(position: Int) {
                viewModel.otcHighLightedCategoryPosition = position
                viewModel.explicitLoading.postValue(true)
                viewModel.clickedOnPage = "product_list_page"
                if (viewModel.lastScrollPosition1 < position) viewModel.lastScrollPosition1 =
                    position

                viewModel.appliedFilterCount.postValue(0)
                viewModel.isCategoryFilterOn = false
                viewModel.brandsLocal.clear()
                viewModel.allBrandIs.clear()
                viewModel.allSubCategoriesId.clear()
                viewModel.childCategoryList.value?.get(position)?.let {
                    viewModel.sendCategoryImpression(position)
                    setBannerVisibility(it.name == "All")
                    val id = if (it.name == "All") allSuperCategory else it.id
                    viewModel.superCategoryType = it.type ?: ""
                    viewModel.childCategoryType = it.name ?: ""
                    viewModel.superCategoryID = id
                    viewModel.updateIds(
                        id,
                        viewModel.superCategoryType,
                        childCategories[viewModel.highLightPosition].collectionId
                    )
                    this@OtcCategoryActivity.viewModel.getOtcProductsByCategory(
                        page = 0,
                        categoryID = id,
                        type = viewModel.superCategoryType,
                        collectionId = childCategories[viewModel.highLightPosition].collectionId,
                        isBrandOnly = false
                    )
                    val list = childCategories.apply {
                        childCategories.forEach { model ->
                            model.selectedCategory = false
                        }
                    }
                    viewModel.filterListClick(list, viewModel.childCategoryType)
                }
                with(binding.contentScroll) {
                    post {
                        fling(0)
                        smoothScrollTo(0, 0)
                    }
                }

                val pos = if (position > 0) position - 1 else 0
                binding.rvCategories.smoothSnapToPosition(pos, LinearSmoothScroller.SNAP_TO_START)
            }
        }
        binding.categoryListener = genericCallback

        binding.header.setSearchIconClickCallBack(searchCallback)
        binding.header.setBackArrowClickCallback(backArrowClickCallback)
        binding.header.setCartIconClickCallBack(cartCallback)
        binding.callback = productCallback

        viewModel.cartModel.observe(this) {
            lifecycleScope.launch(IO) { viewModel.setCartCount() }

            binding.header.updateHeaderChipCount((it?.count ?: 0))
            binding.tmCarts.updateTotalItemsInCartCount(
                it?.count ?: 0,
                it?.amount ?: 0.0,
                SharedPrefManager.getInstance().prescriptionCount
            )
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


        /*//event to launch OrderSummaryActivity
        viewModel.eventOpenOrderSummaryActivity.observe(this,
            EventObserver {
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
            EventObserver {
                startActivity(Intent(context, CartActivity::class.java).apply {
                    putExtra(
                        BundleConstants.BUNDLE_KEY_ORDER_ID,
                        SharedPrefManager.getInstance().incompleteOrderId.toString()
                    )
                    putExtra(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE, "search_result")
                    putExtra(BundleConstants.BUNDLE_KEY_PAGE_SECTION, "view_cart")
                })
            })


        //event to initiate login
        viewModel.eventInitiateLogin.observe(
            this,
            EventObserver { initializationTrueCallerOAuth() })


        viewModel.eventLoginOpenBottomSheet.observe(this) { openLoginBottomSheet() }*/

        viewModel.eventMessage.observe(this) {
            if (it.peekContent().name == MESSAGES.BOTTOM_SHEET_APPLY_CLICK.name) {
                setBannerVisibility(viewModel.filteredCategoryName == "All")
                filterBottomSheet?.dismiss()
                val isPositionChangeRequired = (viewModel.filteredPostion + 1) != 0
                if (viewModel.childCategoryType == "All" && isPositionChangeRequired) {
                    binding.selectedChild = viewModel.filteredPostion + 1
                    binding.rvCategories.scrollToPosition(viewModel.filteredPostion + 1)
                    viewModel.childCategoryType = viewModel.filteredCategoryName
                    viewModel.filterListClick(childCategories, viewModel.childCategoryType)
                }
//                viewModel.clickedOnPage = "product_list_page"
                with(binding.contentScroll) {
                    post {
                        fling(0)
                        smoothScrollTo(0, 0)
                    }
                }
            } else if (it.peekContent().name == MESSAGES.BOTTOM_SHEET_CLEAR_CLICK.name) {
                filterBottomSheet?.dismiss()
                binding.selectedChild = 0
                binding.rvCategories.scrollToPosition(0)
                viewModel.childCategoryType = "All"
                viewModel.superCategoryType = "LEVEL1"
                viewModel.childCategoryType = viewModel.filteredCategoryName
                val list = childCategories.apply {
                    childCategories.forEach { model ->
                        model.selectedCategory = false
                    }
                }
                viewModel.filterListClick(list, viewModel.childCategoryType)
                viewModel.getOtcProductsByCategory(
                    page = 0,
                    categoryID = allSuperCategory,
                    type = viewModel.superCategoryType,
                    collectionId = childCategories[viewModel.highLightPosition].collectionId,
                    isBrandOnly = false,
                )
                setBannerVisibility(true)
            }
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

        binding.btnCurrentLocation.setOnClickListener {
            if (!SharedPrefManager.getInstance().customerCareNumber.isNullOrEmpty()) {
                callCustomerCareIntent()
                viewModel.eventCallPharmacistClickedEvent()
            }
        }

        viewModel.explicitLoading.observe(this) {
            if (it) enableLoadingView(loader)
            else disableLoadingView(loader)
        }

        viewModel.eventSendItemImpression.observe(this, EventObserver {
            sendItemImpression()
        })
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


    class SpacesItemDecoration(private val horizontalSpace: Int, private val verticalSpace: Int) :
        RecyclerView.ItemDecoration() {
        override fun getItemOffsets(
            outRect: Rect, view: View,
            parent: RecyclerView, state: RecyclerView.State
        ) {
            outRect.left = horizontalSpace
            outRect.right = horizontalSpace
            outRect.bottom = verticalSpace
            outRect.top = verticalSpace

        }
    }

    override fun dismissProductDetailBottomsheet(productCode: String) {
        if (productCode.isEmpty()) return

        viewModel.setCartCount()
        viewModel.syncExistingCartProducts(viewModel.productList.value!!)
        viewModel.syncExistingTopDealsProducts(viewModel.topDeals.value!!)
    }

    /*private fun callNow(number: String?) {
        try {
            if (!TextUtils.isEmpty(number)) {
                val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", number, null))
                startActivity(intent)
            } else {
                Toast().showCustomToastMessage(
                    this@OtcCategoryActivity,
                    "Something went wrong"
                )
            }
        } catch (ignore: java.lang.Exception) {
        }
    }*/

    private fun getVisibleViewIndexOnBasisOfHeight(view: View?): Int {
        if (view == null) return 0
        val globalVisibilityRectangle = Rect()
        view.getGlobalVisibleRect(globalVisibilityRectangle)
        val actualHeight = view.measuredHeight
        val visibleHeight = globalVisibilityRectangle.bottom - globalVisibilityRectangle.top
        return if (visibleHeight > actualHeight.div(2)) {
            1
        } else {
            0
        }
    }

    private fun getVisibleView(view: View?): Boolean {
        if (view == null) return false
        val globalVisibilityRectangle = Rect()
        return view.getGlobalVisibleRect(globalVisibilityRectangle)
    }

    private fun setBannerVisibility(isVisible: Boolean) {
        if (isVisible) {
            binding.rvBanner.visibility = View.VISIBLE
            viewModel.isOTCBannerClicked = true
        } else {
            binding.rvBanner.visibility = View.GONE
            viewModel.isOTCBannerClicked = false
        }
    }

}
