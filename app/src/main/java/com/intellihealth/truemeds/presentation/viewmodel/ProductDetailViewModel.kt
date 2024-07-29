package com.intellihealth.truemeds.presentation.viewmodel

import android.content.Context
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.google.gson.Gson
import com.intellihealth.salt.callbacks.CartIconClickCallback
import com.intellihealth.salt.callbacks.FullWidthProductCardCallback
import com.intellihealth.salt.callbacks.SearchBarCallback
import com.intellihealth.salt.callbacks.StepperCallback
import com.intellihealth.salt.models.AuthorCardModel
import com.intellihealth.salt.models.BannerItemModel
import com.intellihealth.salt.models.CompositionCardModel
import com.intellihealth.salt.models.FaqModel
import com.intellihealth.salt.models.MobileSectionHeadersModel
import com.intellihealth.salt.models.ProductCardSectionChipModel
import com.intellihealth.salt.models.ProductCardSectionModel
import com.intellihealth.salt.models.ProductComparisonModel
import com.intellihealth.salt.models.RecommendedSubUpsellModel
import com.intellihealth.salt.models.StickyNonStickyNotificationModel
import com.intellihealth.salt.views.Toast
import com.intellihealth.salt.views.section.ProductCardSection
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse
import com.intellihealth.truemeds.data.model.coupon.CouponResponse
import com.intellihealth.truemeds.data.model.coupon.CouponSaveRemoveResponse
import com.intellihealth.truemeds.data.model.home.CompositionBSDataModel
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.model.mixpanel.MxStickyStripViewed
import com.intellihealth.truemeds.data.model.mixpanel.MxUrgencyTimerStarted
import com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse
import com.intellihealth.truemeds.data.model.orderflow.CouponCodeDataModel
import com.intellihealth.truemeds.data.model.orderflow.MedicineDto
import com.intellihealth.truemeds.data.model.orderflow.MedicineListDetailsSent
import com.intellihealth.truemeds.data.model.orderflow.SaveMedsCreateEditOrderResponse
import com.intellihealth.truemeds.data.model.productlistanddetails.CrossSellingRecommendedProductResponse
import com.intellihealth.truemeds.data.model.productlistanddetails.OrgQtyUpdate
import com.intellihealth.truemeds.data.model.productlistanddetails.SubsQtyUpdate
import com.intellihealth.truemeds.data.model.search.ProductOrgSubsModel
import com.intellihealth.truemeds.data.repository.datasource.local.entity.CartMedicine
import com.intellihealth.truemeds.data.repository.datasource.local.entity.RecentMedicine
import com.intellihealth.truemeds.data.utils.ERRORS
import com.intellihealth.truemeds.data.utils.MESSAGES
import com.intellihealth.truemeds.data.utils.MessageConstant
import com.intellihealth.truemeds.domain.enums.ElasticSearchType
import com.intellihealth.truemeds.domain.enums.UserCategoryEnum
import com.intellihealth.truemeds.domain.usecase.LoginUseCase
import com.intellihealth.truemeds.domain.usecase.ProductDetailUseCase
import com.intellihealth.truemeds.domain.usecase.analytics.FirebaseEventUseCase
import com.intellihealth.truemeds.presentation.analytics.AppsFlyerEvent
import com.intellihealth.truemeds.presentation.analytics.FirebaseEvent
import com.intellihealth.truemeds.presentation.analytics.model.firebase.FbSubsView
import com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxItemAdded
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxPdpImageViewed
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxPdpMedicineDetailsViewed
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxPdpViewed
import com.intellihealth.truemeds.presentation.model.ProductInfoModel
import com.intellihealth.truemeds.presentation.model.SearchResultElasticResponse
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.utils.DateUtils
import com.intellihealth.truemeds.presentation.viewmodel.events.Event
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import javax.inject.Inject


@HiltViewModel
open class ProductDetailViewModel @Inject constructor(
    @ApplicationContext val context: Context,
    private val productDetailUseCase: ProductDetailUseCase,
    //private val couponUseCase: CouponUseCase,
    private val loginUseCase: LoginUseCase
) : BaseViewModelWithLogin(loginUseCase) {

    @Inject
    lateinit var firebaseEventUseCase: FirebaseEventUseCase

    var lastScrollPosition = 0
    var customerAlsoBoughtViewed = false

    private val _showPlusIconForAddButton =
        MutableLiveData(true) //TODO: temporary true , make if false later
    val showPlusIconForAddButton: LiveData<Boolean> = _showPlusIconForAddButton

    val _productDetail = MutableLiveData<ProductInfoModel?>()
    val productDetailLiveData: LiveData<ProductInfoModel?> = _productDetail

    private val _bannerData = MutableLiveData<ArrayList<BannerItemModel>?>()
    val getBannerLiveData: LiveData<ArrayList<BannerItemModel>?> = _bannerData

    private val _recommendedData = MutableLiveData<RecommendedSubUpsellModel?>()
    val getRecommendedLiveData: LiveData<RecommendedSubUpsellModel?> = _recommendedData

    private val _compositionCardData = MutableLiveData<CompositionCardModel?>()
    val getCompositionUILiveData: LiveData<CompositionCardModel?> = _compositionCardData

    var compositionDetailsData: MutableLiveData<ArrayList<CompositionBSDataModel>> =
        MutableLiveData<ArrayList<CompositionBSDataModel>>()

    var orgBottomSheet: MutableLiveData<com.intellihealth.salt.models.ProductInfoModel?> =
        MutableLiveData<com.intellihealth.salt.models.ProductInfoModel?>()
    var sbsBottomSheet: MutableLiveData<com.intellihealth.salt.models.ProductInfoModel?> =
        MutableLiveData<com.intellihealth.salt.models.ProductInfoModel?>()

    var showShimmer = MutableLiveData<Boolean>(true)
    val showShimmerLiveData: LiveData<Boolean> get() = showShimmer

    private val showErrorPd = MutableLiveData<Event<ERRORS>>()
    val eventShowError: LiveData<Event<ERRORS>> get() = showErrorPd

    /**
     * To dismiss PD bottom sheet from cart page
     * **/
    private val dismissBottomSheet = MutableLiveData<Event<Boolean>>()
    val eventDismissBottomSheet: LiveData<Event<Boolean>> get() = dismissBottomSheet

    private val launchPDPage = MutableLiveData<Event<ProductOrgSubsModel>>()
    val eventLaunchPDPage: LiveData<Event<ProductOrgSubsModel>> get() = launchPDPage
    private val launchPDPageForSub = MutableLiveData<Event<ProductOrgSubsModel>>()
    val eventLaunchPDPageForSub: LiveData<Event<ProductOrgSubsModel>> get() = launchPDPageForSub

    private var authorListLiveData: MutableLiveData<ArrayList<AuthorCardModel>?> =
        MutableLiveData<ArrayList<AuthorCardModel>?>()
    val getAuthorListLiveData: LiveData<ArrayList<AuthorCardModel>?> = authorListLiveData

    var productInfoLiveData: MutableLiveData<FaqModel?> =
        MutableLiveData<FaqModel?>()
    val getProductInfoLiveData: LiveData<FaqModel?> = productInfoLiveData

    val doubleStackSectionMutableLiveData = MutableLiveData<ProductCardSectionModel?>()
    val getDoubleStackSectionLiveData: LiveData<ProductCardSectionModel?> =
        doubleStackSectionMutableLiveData


    val doubleStackListLiveData = MutableLiveData<ArrayList<ProductInfoModel>>()
    val getDoubleStackListLiveData: LiveData<ArrayList<ProductInfoModel>> = doubleStackListLiveData

     var doubleStackApiResponseData = ArrayList<ProductInfoModel>()

   // private val productDetailCartMutableLiveData = MutableLiveData<CartModel?>()
    //val getProductDetailCartLiveData: LiveData<CartModel?> = productDetailCartMutableLiveData

    private val isSubsViewComparison = MutableLiveData<ProductComparisonModel?>()
    val isSubsViewComparisonLiveData: LiveData<ProductComparisonModel?> = isSubsViewComparison

    var manufacturerDetailLiveData: MutableLiveData<FaqModel?> =
        MutableLiveData<FaqModel?>()
    val getManufacturerDetailLiveData: LiveData<FaqModel?> = manufacturerDetailLiveData

    private val _pdpHeader = MutableLiveData<MobileSectionHeadersModel>()
    val pdpHeader: LiveData<MobileSectionHeadersModel> = _pdpHeader

    private val _pdpStickyHeader = MutableLiveData<MobileSectionHeadersModel>()
    val pdpStickyHeader: LiveData<MobileSectionHeadersModel> = _pdpStickyHeader

    val launchOrgSubsBottomSheet: MutableLiveData<Boolean> = MutableLiveData<Boolean>(false)

    private val launchPdBottomSheet = launchOrgSubsBottomSheet

    private val showMessage = MutableLiveData<Event<MessageConstant>>()
    val eventMessage: LiveData<Event<MessageConstant>> get() = showMessage

  /*  private val _crosssellingClick =
        MutableLiveData<com.intellihealth.salt.models.ProductInfoModel>()
    val crosssellingClick: LiveData<com.intellihealth.salt.models.ProductInfoModel> =
        _crosssellingClick*/

    private val _crosssellingClick =
        MutableLiveData<Event<com.intellihealth.salt.models.ProductInfoModel>>()
    val crosssellingClick: LiveData<Event<com.intellihealth.salt.models.ProductInfoModel>> =
        _crosssellingClick

    // TODO remove dummy data
    var notificationData: MutableLiveData<StickyNonStickyNotificationModel>? = null


    private val _notificationDetailData = MutableLiveData<CouponCodeDataModel?>()
    val notificationDetailData: LiveData<CouponCodeDataModel?> = _notificationDetailData

    var isReload: Boolean = false
    /*private val finishActivity = MutableLiveData<Event<Any>>()
    val eventFinishActivity: LiveData<Event<Any>> get() = finishActivity

    private val openOrderSummaryActivity = MutableLiveData<Event<Any>>()
    val eventOpenOrderSummaryActivity: LiveData<Event<Any>> get() = openOrderSummaryActivity

    private val openCartActivity = MutableLiveData<Event<Any>>()
    val eventOpenCartActivity: LiveData<Event<Any>> get() = openCartActivity

    private val initiateLogin = MutableLiveData<Event<Any>>()
    val eventInitiateLogin: LiveData<Event<Any>> get() = initiateLogin*/

    private val callPharmacist = MutableLiveData<Event<Any>>()
    val eventCallPharmacist: LiveData<Event<Any>> get() = callPharmacist


    var compareNChooseSubs = MutableLiveData<com.intellihealth.salt.models.ProductInfoModel>()
    val deleteProductEventListener: MutableLiveData<Event<Boolean>> = MutableLiveData()
    val isDelete: MutableLiveData<Event<Boolean>> = MutableLiveData()
    var showProductPage = MutableLiveData<Boolean>(false)
    val showProductPageLiveData: LiveData<Boolean> get() = showProductPage

    private val _orgCount = MutableLiveData<OrgQtyUpdate>()
    val orgCount: LiveData<OrgQtyUpdate> = _orgCount

    private val _subsCount = MutableLiveData<SubsQtyUpdate>()
    val subsCount: LiveData<SubsQtyUpdate> = _subsCount

    var cartTotal: Double = 0.0
    var orgProductForSubs: ProductInfoModel? = null
    var recommenededUpdatedCount = MutableLiveData<Int>(0)
    var editMedicineApiSuccess = MutableLiveData(false)

    val doubleStackDeleteData = MutableLiveData<Int>()
    var ftcCouponData: MutableLiveData<CouponCodeResponse.Coupon?> = MutableLiveData(null)
    private val openCouponPopup =
        MutableLiveData<Event<Pair<CouponCodeResponse.Coupon?, CouponSaveRemoveResponse?>>>()
    private val openCouponPopupOffline =
        MutableLiveData<Event<Pair<CouponCodeResponse.Coupon?, CouponResponse>>>()
    val eventOpenCouponPopupOffline: LiveData<Event<Pair<CouponCodeResponse.Coupon?, CouponResponse>>> =
        openCouponPopupOffline
    val eventOpenCouponPopup: LiveData<Event<Pair<CouponCodeResponse.Coupon?, CouponSaveRemoveResponse?>>> get() = openCouponPopup

    var isSubs: Boolean = false
    var fromOrderSummarySkuNameForSubs: String? = null
    var isFromOrderStatus: MutableLiveData<Boolean> = MutableLiveData(false)
    var isAlreadyAddedToCartFromSearch: String? = null
    var ftcCouponResponse: List<CouponCodeResponse.Coupon>? = null

    //event data
    var clickedOnPage:String?= "product_detail_page" //todo need to set value from entire project
    var clickedOnPageNameForCouponEvent = "product_detail_page"
    var item_qc:String?= ""
    var item_rt:String? = ""
    var term_searched:String? = ""
    var suggestion_term_clicked:String? = ""
    var clicked_suggsetion_type:String? = ""
    var elastic_search_type: String?= ""
    var suggestion_term_clicked_position = 0
    var resultPosition = 0
    var section:String?=""
    var sectionIndex = 0
    var sectionRow = 0
    var billDetailsData: BillDetailResponse.ResponseData? = null
    var medicineListDataReceived: ArrayList<MedicineListDetailsSent> = arrayListOf()
    var mxInternalErrorOccurred=MxInternalErrorOccurred()
    var crossSellingSectionHeader:String?=""
    var isChronicAdded: Boolean? = null
    var notForSaleMessage: String? = ""
    var isOtcAdded: Boolean? = null
    var isFromCrossSelling: Boolean = false
    var otcSuperCategoryName:String?=""
    var otcCategoryName:String?=""
    var otcSubCategoryName:String?=""
    var deepLinkActionType:String?=""
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
                //openOrderSummaryActivity.value = Event(Any())
                showMessage.postValue(Event(MessageConstant(MESSAGES.ORDER_SUMMARY_ACTIVITY_LAUNCH)))
            } else {
                //openCartActivity.value = Event(Any())
                showMessage.postValue(Event(MessageConstant(MESSAGES.CART_ACTIVITY_LAUNCH)))
            }
        }
    }*/
    fun insertRecentlySearchMedicineInDB(recentMedicine: RecentMedicine) {
        viewModelScope.launch(Dispatchers.IO) {
            if (localDbUseCase.getCartCountFromRecentlySearch(recentMedicine.medicineName) == 0) {
                localDbUseCase.addRecentlySearchMed(recentMedicine)
            } /*else {
                localDbUseCase.updateTimeInRecentSearch(System.currentTimeMillis(), recentMedicine.productCode)
            }*/
        }
    }

    fun setMedicineListDataReceived() {
        medicineListDataReceived.clear()
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val productIdsList = localDbUseCase.getAddedMedProductCode()
                val productNamesList = localDbUseCase.getAddedMedNames()
                for (i in 0..productIdsList.size - 1) {
                    medicineListDataReceived.add(
                        MedicineListDetailsSent(
                            productIdsList.getOrNull(i) ?: "",
                            productNamesList.getOrNull(i) ?: ""
                        )
                    )
                }
            }catch (_:Exception){

            }
        }
    }


    suspend fun getProductDetailData(text: String, type: String, isBottomSheetBahaviour: Boolean) {
        val searchResultObj = orderFlowUseCase.getSearchResults(mxInternalErrorOccurred,text, type, 1)
        val list = searchResultObj?.elasticProductDetails
        //getProductDetails(text, type)
        if (!list.isNullOrEmpty()) {
            val productInfo = list[0]
            notForSaleMessage = productInfo.product.availabilityStatus
            isChronicAdded = productInfo.product.isChronic
            isOtcAdded = productInfo.product.isOtc
            if (!isBottomSheetBahaviour) {
                if (!isSubs) {
                    //org data

                    val recentMed = RecentMedicine(
                        null,
                        productInfo.product.skuName ?: "",
                        productInfo.product.productCode ?: "",
                        0,
                        "",
                        System.currentTimeMillis(),
                        ElasticSearchType.ORIGINAL_SKU_NAME.toString(),
                        true,
                        productInfo.product.productImageUrl ?: "",
                        ""
                    )
                    insertRecentlySearchMedicineInDB(recentMed)
                } else {
                    //subs data
                    val recentMed = RecentMedicine(
                        null,
                        productInfo.suggestion?.skuName ?: "",
                        productInfo.suggestion?.productCode ?: "",
                        0,
                        "",
                        System.currentTimeMillis(),
                        ElasticSearchType.ORIGINAL_SKU_NAME.toString(),
                        true,
                        productInfo.suggestion?.productImageUrl ?: "",
                        ""
                    )
                    insertRecentlySearchMedicineInDB(recentMed)
                }
            }

            /****  TODO: If suggestion maxCappedQty , for null, update maxCap as 1 added as per Kanhaiya suggestion *****/
            productInfo.suggestion?.maxCappedQty = productInfo.suggestion?.maxCappedQty ?: 1
            /********************************************/
            // db call - getAddedQtyOfAddedMedicine - org and subs
            productInfo.product.qty = getMedicineCount(productInfo.product.productCode)
            productInfo.suggestion?.qty =
                getMedicineCount(productInfo.suggestion?.productCode ?: "")

            /** Below code executes when 'isSubs' true & data of its original product is passed from previous pg where Substitute is clicked
             * With passed Original product info, replace Sub's details fields with original product info ie.
             * subsSavingPercentage,sellingPrice,pricePerUnitLabel and orgSubsSkuName
             */
            if (isSubs && orgProductForSubs != null) {
                productInfo.product.subsSavingPercentage =
                    orgProductForSubs!!.product.subsSavingPercentage
                productInfo.product.sellingPrice =
                    orgProductForSubs!!.suggestion?.sellingPrice ?: 0.0
                productInfo.product.pricePerUnitLabel =
                    orgProductForSubs!!.suggestion?.pricePerUnitLabel
                productInfo.product.orgSubsSkuName = orgProductForSubs!!.product.skuName ?: ""
                productInfo.product.orgProductCode =
                    orgProductForSubs!!.product.productCode ?: ""
                /*if (orgProductForSubs!!.product.subsSavingPercentage != null) {
                    productInfo.product.discount =
                        orgProductForSubs!!.product.subsSavingPercentage?.replace("%", "")
                            ?.toDouble() ?: 0.0
                }*/
            }
            productInfo.suggestion?.productCode?.let {
                if (productInfo.product.productCode != it) {
//                        productInfo.isDisplayAddIcon = true
                }

            }

            productInfo.suggestion?.productCode?.let {
                productInfo.suggestion?.qty = getMedicineCount(it)
                productInfo.isSubsAddedToCart =
                    checkAlreadyAddedAsSubs(productInfo.product.productCode, it)
            }

            /* productInfo.isOrgAddedToCart =
                 checkAlreadyAddedSubsAsOrg(productInfo.product.productCode)
             productInfo.isReplaced =
                 checkProductReplacedInReorder(productInfo.product.productCode)
             productInfo.isAutoReplaced =
                 checkProductAsReplaceInReorder(productInfo.product.productCode)*/


            /*productInfo.isOrgAddedToCart = checkAlreadyAddedSubsAsOrg(productInfo.product.productCode)
            productInfo.isReplaced = checkProductReplacedInReorder(productInfo.product.productCode)
            productInfo.isAutoReplaced = checkProductAsReplaceInReorder(productInfo.product.productCode)
            productInfo.isSubsAddedToCart = checkAlreadyAddedAsSubs(
                productInfo.product.productCode,
                productInfo.suggestion?.productCode ?: ""
            )*/


            val subsMapCount = getOrgCountFromSubsMed(
                if (isSubs) productInfo.product.orgProductCode
                    ?: "" else productInfo.product.productCode
            )
            /*val subsMapCount = if (isSubs) {
                getOrgCountFromSubsMed(productInfo.product.productCode)
            } else {

            }*/
            if (isSubs && orgProductForSubs != null) {
                val count =
                    localDbUseCase.getAddedQtyOfAddedMedicine(productInfo.product.productCode ?: "")
                val orgMedCode =
                    localDbUseCase.getOrgProductCodeFromSubs(productInfo.product.productCode ?: "")
                        ?: ""
                if (count > 0 && orgProductForSubs!!.product.productCode != orgMedCode) {
                    productInfo.isOrgAddedToCart = true
                }

            } else {
                /**
                 * check if medicine is added in DB
                 * **/
                val count =
                    localDbUseCase.getAddedQtyOfAddedMedicine(productInfo.product.productCode)
                val orgMedCode =
                    localDbUseCase.getOrgProductCodeFromSubs(productInfo.product.productCode)
                productInfo.isOrgAddedToCart = !orgMedCode.isNullOrEmpty()
            }

            /*if (isAlreadyAddedToCartFromSearch == null) {
                if(isSubs && orgProductForSubs != null ) {
                    val orgToSubMapCount =
                        getOrgCountFromSubsMed(productInfo.product.productCode)
                    //TODO: Not used hence commented : val listMap = getAddedSubsInfoByOrg(orgProductForSubs!!.product.productCode)
                    productInfo.isOrgAddedToCart = orgToSubMapCount == 0 //&& subsMapCount == 0
                    productInfo.isOrgAddedToCart =
                        localDbUseCase.getAddedQtyOfAddedMedicine(productInfo.product.productCode) > 0
                }
            }else {
                productInfo.isOrgAddedToCart = isAlreadyAddedToCartFromSearch.equals("true", ignoreCase = false)
            }*/

            val itemCount = getOrgCountFromSubsMed(productInfo.product.productCode)
            val list = getAddedSubsInfoByOrg(productInfo.product.productCode)

            setCartCount()
            /* Banner data */
            setMedicineDetailsInfoBannerComposition(productInfo,isBottomSheetBahaviour)
            val bannerData = productDetailUseCase.mapperToEntity.mapToBannerData(productInfo)
            updateImageAndTimeInRecentlySearchMedicine(
                productInfo.product.productImageUrl ?: "",
                productInfo.product.drugType ?: "",
                productInfo.product.productCode ?: ""
            )

            /* Top header with medicine info */
            val pdpStickyHeader =
                productDetailUseCase.mapperToEntity.mapToMobileSectionHeadersModel(productInfo, isSubs)
            _pdpStickyHeader.postValue(pdpStickyHeader)

//                productInfo.isReplaced = false
//                productInfo.isOrgAddedToCart = localDbUseCase.getAddedQtyOfAddedMedicine(productInfo.product.productCode) > 0



            /** View Comparison data
             *  This Section Visible- when 'isSubs' true & launching Substitute pdp page
             *  On Substitute Pdp page- Substitute information is inside 'ProductInfo- product'.
             *  Ideally its suggestion should be null because its itself is substitute
             * Here to show comparison between Org-Subs, we are replacing 'Product' with its original product
             * from where substitute is clicked & suggestion will have current substitute information
             */
            if (orgProductForSubs != null) {
                orgProductForSubs?.let {
                    isSubsViewComparison.postValue(
                        ProductComparisonModel(
                            title = context.getString(R.string.txt_view_comparison),
                            product = it.product.toSdkObject(),
                            suggestion = productInfo.product.toSdkObject(),
                            isCollapsible = true
                        )
                    )
                }
            } else {
                isSubsViewComparison.postValue(null)
            }

            showProductPage.postValue(true)
            //  showShimmer.postValue(false)
        } else {
            showErrorPd.postValue(Event(ERRORS.NO_PRODUCT_DETAIL_FOUND))
            // showShimmer.postValue(false)
            showProductPage.postValue(false)
        }
    }

    public suspend fun setMedicineDetailsInfoBannerComposition(
        productInfo: ProductInfoModel,isBottomSheet:Boolean,
        subsFoundOrderSummary:String?= "", eventOrgProductForThisPage:ProductInfoModel?=null
    ) {
        productInfo.suggestion?.maxCappedQty = productInfo.suggestion?.maxCappedQty ?: 1

        if (isSubs && isBottomSheet && (!clickedOnPage.equals("Order Summary"))) {
            if(!clickedOnPage.equals("Order Details")) {
                var qty = (productInfo?.product?.qty ?: 1)
                qty = if (qty == 0) 1 else qty
                productInfo?.product?.sellingPrice =
                    productInfo?.product?.sellingPrice!! / qty
//                productInfo?.product?.mrp =
//                    productInfo?.product?.mrp!! / qty
            }
        }
        /** Order Summary : If Subs present, click on Subs- in Pd page replacedSavingPercentage to show*/
        if (productInfo.product.cxAcceptedSubs) {
            productInfo.product.subsSavingPercentage =
                (productInfo.product.replacedSavingPercentage ?: 0.0).toString() + "%"
        }
        _productDetail.postValue(productInfo)
        val bannerData = productDetailUseCase.mapperToEntity.mapToBannerData(productInfo)
        _bannerData.postValue(bannerData)

        /* Manufacturer Details */
        if(!productInfo.product.manufacturerAddr.isNullOrEmpty()) {
            val manufacturerDetails =
                productDetailUseCase.mapperToEntity.mapToManufacturerDetailModel(
                    context.getString(R.string.txt_manufacturer_details),
                    "Address :" + productInfo.product.manufacturerAddr ?: ""
                )
            viewModelScope.launch(Dispatchers.IO) {
                delay(700)
                manufacturerDetailLiveData.postValue(manufacturerDetails)
            }
        }else {
            manufacturerDetailLiveData.postValue(null)
        }

        /* Composition Info */
        val compositionModel: CompositionCardModel? =
            productDetailUseCase.mapperToEntity.mapToCompositionModel(
                if (!isSubs) context.resources.getString(R.string.txt_composition) else context.resources.getString(
                    R.string.has_same_composition
                ),
                if (!isSubs) _productDetail.value?.product?.skuName?:"" else productInfo.product.orgSubsSkuName?:context.resources.getString(R.string.txt_whats_inside),
                productInfo
            )
        _compositionCardData.postValue(compositionModel)

        /** Only in case of Order Summary - Open pd bottomsheet as suggestion page & in recommended substitute for show medicine name*/
        if (fromOrderSummarySkuNameForSubs != null) {
            productInfo.product.orgSubsSkuName = fromOrderSummarySkuNameForSubs ?: ""
        }

        /* Recommended Section */
        if (productInfo.suggestion != null) {

            /*
                                val itemCount = getOrgCountFromSubsMed(productInfo.product.productCode)
                                val list = getAddedSubsInfoByOrg(productInfo.product.productCode)
                                if (list.isNotEmpty()) {
                                    //show org subs mapping
            //                            item.isOrgAddedToCart = true
                                    productInfo.cardType = FullWidthProductCardConstants.SUBS_ADDED
                                } else {
                                    if (itemCount == 0) {
                                        productInfo.cardType = FullWidthProductCardConstants.SEARCH
                                        productInfo.suggestion?.qty = 0
                                        productInfo.isSubsAddedToCart = true
                                        Log.e("SEARCH", "subs added as ORG")
                                    }
                                }
            */
            productInfo.isReplaced = true
            productInfo.isSubsAddedToCart =
                localDbUseCase.getAddedQtyOfAddedMedicine(productInfo.suggestion?.productCode!!) > 0

            val itemCount = getOrgCountFromSubsMed(productInfo.product.productCode)
            val list = getAddedSubsInfoByOrg(productInfo.product.productCode)


            val recommendedModel =
                productDetailUseCase.mapperToEntity.mapToRecommendedModel(
                    context.getString(R.string.txt_recommended_substitute),
                    context.getString(R.string.txt_compare_your_medicine),
                    productInfo,
                    isFromOrderStatus.value?:false
                )

            if (!list.isNullOrEmpty()) {
                /**
                 * subs product is added through ORG med
                 * **/
                recommendedModel.productCardData?.isReplaced = false
                recommendedModel.productCardData?.isSubsAddedToCart = false
            }

            recommendedModel.productCardData?.product?.qty =
                getMedicineCount(productInfo.suggestion?.productCode ?: "")
            recommendedModel.productCardData?.product?.callback = recommendedStepperCallBack
            recommendedModel.productCardData?.product?.productCallback =
                recommendedFullwidthProductCardCallBack


            /*recommendedModel.isOrgAddedToCart = checkAlreadyAddedSubsAsOrg(productInfo.product.productCode)
            recommendedModel.isReplaced = checkProductReplacedInReorder(productInfo.product.productCode)
            recommendedModel.isAutoReplaced = checkProductAsReplaceInReorder(productInfo.product.productCode)
            recommendedModel.isSubsAddedToCart = checkAlreadyAddedAsSubs(
                productInfo.product.productCode,
                productInfo.suggestion?.productCode ?: ""
            )*/

            _recommendedData.postValue(recommendedModel)
        } else {
            _recommendedData.postValue(null)
        }

        sendPdpViewedEvent(productInfo,isBottomSheet, subsFoundOrderSummary, eventOrgProductForThisPage)

        if(!deepLinkActionType.isNullOrEmpty() && deepLinkActionType.equals(BundleConstants.DEEPLINK_OG_SUBS_BS)){
            showMessage.postValue(Event(MessageConstant(MESSAGES.ORG_SUBS_BOTTOMSHEET_LAUNCH)))
        }
    }

    private fun getOrgCountFromSubsMed(productCode: String): Int = runBlocking {
        return@runBlocking async {
            localDbUseCase.getOrgCountFromSubsMed(productCode)
        }.await()
    }

    private fun getAddedSubsInfoByOrg(productCode: String): List<CartMedicine> = runBlocking {
        return@runBlocking async {
            localDbUseCase.getAddedSubsInfoByOrg(productCode)
        }.await()
    }

    fun getPDCompositionBSData(compositionDetails: String) {
        val list = productDetailUseCase.getCompositionList(compositionDetails)
        if (list.isNotEmpty()) {
            compositionDetailsData.postValue(list)
        }

    }

    fun getOrgList(model: ProductInfoModel) {
        // TODO: Discuss with rohit  _productDetail.value = model

        viewModelScope.launch(Dispatchers.IO) {
            model.product.qty = getMedicineCount(model.product.productCode)

            val productOrg = productDetailUseCase.getOrgBottomSheet(model)

            productOrg.let {
                it.product.callback = compareChooseOrgcallback
                it.product.productCallback = compareChooseSubsProductCardCallBack
                //


                /*it.suggestion?.let { subs -> {
                    subs.qty = getMedicineCount(subs.productCode)
                    subs.callback = compareChooseSubscallback
                    subs.productCallback = compareChooseSubsProductCardCallBack
                }
            }*/
            }

            val productSubs = productDetailUseCase.getSbsBottomSheet(model)
            productSubs?.let {
                productSubs.product.callback = compareChooseSubscallback
                productSubs.product.productCallback = subsProductCardCallBack
                //
            }

            model.suggestion?.let {
                viewModelScope.launch(Dispatchers.IO) {
                    productSubs?.let {
                        it.product.qty = getMedicineCount(it.product.productCode)

                    }
                }
            }

            model.product.subsSavingPercentage?.let {
                var discount = it.replace("%", "")
                productSubs?.product?.discount = discount.toDouble()
            }



            _productDetail.postValue(model)
            /* productOrg.isSubsAddedToCart = true
             productSubs.isSubsAddedToCart = true*/
            orgBottomSheet.postValue(productOrg)
//            sbsBottomSheet.postValue(productSubs)

            viewModelScope.launch(Dispatchers.IO) {

                /*val itemCount = localDbUseCase.getOrgCountFromSubsMed(productSubs.product.productCode)
                val list = localDbUseCase.getAddedSubsInfoByOrg(productOrg.product.productCode)*/
                /*if (list.isNotEmpty()) {
                    item.cardType = FullWidthProductCardConstants.SUBS_ADDED
                } else {
                    if (itemCount == 0) {
                        item.cardType = FullWidthProductCardConstants.SEARCH
                        item.suggestion?.qty = 0
                        item.isSubsAddedToCart = true
                        Log.e("SEARCH", "subs added as ORG")
                    }
                }*/


                val isSubsAddedInCart =
                    localDbUseCase.getAddedQtyOfAddedMedicine(productSubs.product.productCode) > 0

                if (isSubsAddedInCart) {
                    val subsCount = getOrgCountFromSubsMed(productSubs.product.productCode)
                    val subsList = getAddedSubsInfoByOrg(productSubs.product.productCode)

                    val orgProductCode =
                        localDbUseCase.getOrgProductCodeFromSubs(productSubs.product.productCode)
                    if (subsList.isNotEmpty()) {
                        //show org subs mapping
//                            item.isOrgAddedToCart = true
//                    item.cardType = FullWidthProductCardConstants.SUBS_ADDED
                    } else {
                        //show already added to cart on subs bottom sheet
                        if (subsCount == 0) {
                            productSubs.isOrgAddedToCart = true
                        }
                    }

                    if (orgProductCode != model.product.productCode) {
                        productSubs.isOrgAddedToCart = true
                    }
                } else {
                    productSubs.isOrgAddedToCart = false
                }
                /*val isSubsAdded = localDbUseCase.getAddedQtyOfAddedMedicine(productSubs.product.productCode) > 0
                productSubs.isReplaced = isSubsAdded
                productSubs.isSubsAddedToCart = isSubsAdded*/
                sbsBottomSheet.postValue(productSubs)
            }
        }
    }

    /**
     * triggers when ORG SUBS bottom sheet is launched and creates a data for SUBS medicine
     * **/
    fun getSubsList(model: ProductInfoModel) {
        // TODO: Discuss with rohit _productDetail.value = model

        sbsBottomSheet = MutableLiveData<com.intellihealth.salt.models.ProductInfoModel?>()
        model.suggestion?.let {
            val productSubs = productDetailUseCase.getSbsBottomSheet(model)
            viewModelScope.launch(Dispatchers.IO) {
                it.qty = getMedicineCount(it.productCode)

                /*model.isSubsAddedToCart = checkAlreadyAddedAsSubs(
                    item.product.productCode,
                    item.suggestion?.productCode ?: ""
                )*/
                productSubs.let {
                    it.product.callback = compareChooseSubscallback
                    it.product.productCallback = subsProductCardCallBack
                }

                model.product.subsSavingPercentage?.let {
                    var discount = it.replace("%", "")
                    productSubs?.product?.discount = discount.toDouble()
                }


                val isSubsAddedInCart =
                    localDbUseCase.getAddedQtyOfAddedMedicine(productSubs.product.productCode) > 0

                if (isSubsAddedInCart) {
                    val itemCount = getOrgCountFromSubsMed(productSubs.product.productCode)
                    val list = getAddedSubsInfoByOrg(productSubs.product.productCode)

                    val orgProductCode =
                        localDbUseCase.getOrgProductCodeFromSubs(productSubs.product.productCode)


                    if (list.isNotEmpty()) {
                        //show org subs mapping
//                            item.isOrgAddedToCart = true
//                    item.cardType = FullWidthProductCardConstants.SUBS_ADDED
                    } else {
                        //show already added to cart on subs bottom sheet
                        if (itemCount == 0) {
                            productSubs.isOrgAddedToCart = true
                        }
                    }

                    if (orgProductCode != model.product.productCode) {
                        productSubs.isOrgAddedToCart = true
                    }
                } else {
                    productSubs.isOrgAddedToCart = false
                }

                _productDetail.postValue(model)
                sbsBottomSheet.postValue(productSubs)
            }
        }
    }

    fun getSubsBottomSheet(model: ProductInfoModel) {

        compareNChooseSubs = MutableLiveData<com.intellihealth.salt.models.ProductInfoModel>()

//        sbsBottomSheet = MutableLiveData<com.intellihealth.salt.models.ProductInfoModel?>()
        val productSubs = productDetailUseCase.getSbsBottomSheet(model)
//        val productSubs = model.toSdkObject()
        with(productSubs) {
//            this.product = model.suggestion?.toSdkObject()!!
            model.product.subsSavingPercentage?.let {
                var discount = it.replace("%", "")
                this.product.discount = discount.toDouble()
            }

        }


//        val productSubs = productDetailUseCase.getSbsBottomSheet(model)
        productSubs.let {
            it.product.callback = compareChooseSubscallback
            it.product.productCallback = subsProductCardCallBack
        }
        viewModelScope.launch(Dispatchers.IO) {
            productSubs.isReplaced = true
            productSubs.isSubsAddedToCart =
                localDbUseCase.getAddedQtyOfAddedMedicine(productSubs.product.productCode) > 0
            /* model.isSubsAddedToCart = checkAlreadyAddedAsSubs(
                item.product.productCode,
                item.suggestion?.productCode ?: ""
            )*/

            compareNChooseSubs.postValue(productSubs)
            _productDetail.postValue(model)
            sbsBottomSheet.postValue(productSubs)
        }


    }

    suspend fun getProductInfoAndWrittenReviewBy(productCode: String) {
        var data =
            orderFlowUseCase.fetchMedicineDetails(mxInternalErrorOccurred, productCode)//fetchMedicineDetails(productCode)
        if (data != null) {
            if (data.writtenReviewBy != null && data.writtenReviewBy.isNotEmpty()) {
                val authorsList =
                    productDetailUseCase.mapperToEntity.mapAuthorList(data)
                delay(500)
                authorListLiveData.postValue(authorsList)
            } else {
                authorListLiveData.postValue(null)
            }
            if (data.productInfo != null && data.productInfo.isNotEmpty()) {
                val productInfoModel =
                    productDetailUseCase.mapperToEntity.mapToProductInfoModel(
                        data
                    )
                delay(500)
                productInfoLiveData.postValue(productInfoModel)
            } else {
                productInfoLiveData.postValue(null)
            }

        } else {
            showErrorPd.postValue(Event(ERRORS.NO_PRODUCT_DETAIL_FOUND))
        }
    }

    fun getCrossSellingDataForProductDetail(productCode: String) {
        viewModelScope.launch(Dispatchers.IO) {
            var data = getCrossSellingRecommendedProducts(productCode)
            if (data?.responseData != null) {
                /* Double Stack Data */
                val doubleStackData = data.responseData?.CUSTOMER_ALSO_BOUGHT
                if (!doubleStackData.isNullOrEmpty()) {
                    doubleStackApiResponseData = doubleStackData
                    preapareDataForDoubleStack()
                } else {
                    doubleStackSectionMutableLiveData.postValue(null)
                }
                //showShimmer.postValue(false)
            } else {
                //showErrorPd.postValue(Event(ERRORS.NO_PRODUCT_DETAIL_FOUND))
                //showShimmer.postValue(false)
            }
        }
    }

    fun preapareDataForDoubleStack() {
        viewModelScope.launch(Dispatchers.IO) {
            if (doubleStackApiResponseData.isNotEmpty()) {
                val doubleStackModel = doubleStackApiResponseData.let {
                    delay(500)
                    for (i in it.indices) {
                        it[i].product.qty = getMedicineCount(it[i].product.productCode ?: "")
                        Log.d("***", "" + it[i].product.qty + " : " + it[i].product.skuName)
                    }
                    doubleStackListLiveData.postValue(it)
                    productDetailUseCase.mapperToEntity.mapDoubleStackModel(
                        context.getString(R.string.txt_customers_also_bought),
                        it
                    )
                }

                doubleStackSectionMutableLiveData.postValue(doubleStackModel)
            } else {
                doubleStackSectionMutableLiveData.postValue(null)
            }

        }
    }

    /*fun getProductDetailCartData() {
        val productDetailCartData = productDetailUseCase.getProductDetailCartData(context)
        if (productDetailCartData != null) {
            val cartModel = productDetailCartData.toCartModel()
            productDetailCartMutableLiveData.postValue(cartModel)
        } else {
            showErrorPd.postValue(Event(ERRORS.NO_PRODUCT_DETAIL_FOUND))
        }
    }*/


    /*fun getCouponDataFromApi() {
        viewModelScope.launch(Dispatchers.IO) {
            val couponData =
                orderFlowUseCase.fetchFtcCoupons(
                    SharedPrefManager.getInstance().loggedInUserId,
                    UserCategoryEnum.FTC_COUPON_URGENCY.apiCategoryType,
                    CommonFunc.getSourceVersionName()
                )
            if (couponData != null && !couponData.couponList.isNullOrEmpty()) {
                _notificationDetailData.postValue(couponData.couponList[0])
            } else {
                _notificationDetailData.postValue(null)
            }
        }

    }*/

    /******* PD Page Call backs *******/

    /* *//* PDP Header: Quantity Stepper Callback *//*
    val headerQuantityStepperCallback = object : StepperCallback {
        override fun cartItemPlus(qty: Int) {
            Log.e("PDVM Header", "cartItemPlus: qty = $qty")
            val orgInfoModel = productDetailLiveData.value
            orgInfoModel?.let {
                if (qty == 1) {
                    _orgCount.postValue(OrgQtyUpdate(qty, false))
                    addToCart(it, false, qty)
                } else {
                    if (qty == 0) {
                        showMessage.postValue(Event(MESSAGES.ORG_SUBS_BOTTOMSHEET_LAUNCH))
                    } else {
                        _orgCount.postValue(OrgQtyUpdate(qty, false))
                    }
                    updateQuantity(it, qty)
                }
            }
        }

        override fun cartItemMinus(qty: Int) {
            Log.e("PDVM Header", "cartItemMinus: qty = $qty")
            //  showToast.postValue("Minus qty = $qty")
            var orgInfoModel = productDetailLiveData.value
            orgInfoModel?.let {
                if (qty > 0) {
                    _orgCount.postValue(OrgQtyUpdate(qty, false))
                    updateQuantity(it, qty)
                    setCartCount()
                }
            }
        }

        override fun deleteAlert() {
            super.deleteAlert()
            _orgCount.postValue(OrgQtyUpdate(1, true))
            setCartCount()
        }

        override fun stepperError(msg: String?) {
            val msg = context.getString(R.string.txt_add_max_items, productDetailLiveData.value?.product?.maxCappedQty.toString()) + if( productDetailLiveData.value?.product?.maxCappedQty!! > 1) " items" else " item"
            stepperMessage.postValue(Event(msg))
        }
    }*/

    /* PDP Header: Search Callback */
    val searchBarCallback = object : SearchBarCallback {
        override fun onClearClick() {
            TODO("Not yet implemented")
        }

        override fun onIconClick() {
            Log.d("PDVM Header Search", " Search call back")
            showMessage.postValue(Event(MessageConstant(MESSAGES.SEARCH_SUGGESTION_LAUNCH)))
            firebaseEventUseCase.pdPageSearch(FirebaseEventModel(mobile = SharedPrefManager.getInstance().loggedInUserMobile,
                customerId = SharedPrefManager.getInstance().loggedInUserId,
                pageName = "PdPage",
                variantId = SharedPrefManager.getInstance().algoSpecificVariantId.toInt()))
            sdkEventUseCase.sendPdPageSearchToFacebookEvent()
        }

        override fun onViewClick() {
            Log.d("PDVM Header Search", " Search call back")
            showMessage.postValue(Event(MessageConstant(MESSAGES.SEARCH_SUGGESTION_LAUNCH)))
            firebaseEventUseCase.pdPageSearch(FirebaseEventModel(mobile = SharedPrefManager.getInstance().loggedInUserMobile,
                customerId = SharedPrefManager.getInstance().loggedInUserId,
                pageName = "PdPage",
                variantId = SharedPrefManager.getInstance().algoSpecificVariantId.toInt()))
            sdkEventUseCase.sendPdPageSearchToFacebookEvent()
        }

    }

    /* PDP Header: Cart Icon Callback */
    val cartIconClickCallback = object : CartIconClickCallback {
        override fun onCartIconClick() {
            onViewCartClicked("view_cart")
            try{
                firebaseEventUseCase.pdPageCart(
                    FirebaseEventModel(
                        mobile = SharedPrefManager.getInstance().loggedInUserMobile,
                        customerId = SharedPrefManager.getInstance().loggedInUserId,
                        productCode = productDetailLiveData.value?.product?.productCode,
                        productName = productDetailLiveData.value?.product?.skuName
                    )
                )
                sdkEventUseCase.sendPdPageCartToFacebookEvent()

            }
            catch (_:Exception){}
        }
    }

    /* PD Bottomsheet - Medicine details stepper callback*/
    val pdBottomSheetQuantityStepperCallback = object : StepperCallback {
        override fun cartItemPlus(qty: Int) {
            var itemAdded = MxItemAdded()
            itemAdded.clickedOnPage = "pdp"//clickedOnPage
            itemAdded.sectionIndex = suggestion_term_clicked_position + 1
            itemAdded.pageSection = "main"
//            if (qty == 1) sendItemAddedEvent(productDetailLiveData.value,null,null, itemAdded)

            Log.e("PDVM Header", "cartItemPlus: qty = $qty")

            if (isSubs) {
                val subsInfo = productDetailLiveData.value
                if (qty == 1) {
                    Toast().showCustomToastMessage(
                        context,
                        context.getString(R.string.item_added)
                    )
                    _orgCount.postValue(OrgQtyUpdate(qty, false))
                    orgProductForSubs?.let {
                        addToCart(it, true, qty, itemAdded)
                    }
                } else {
                    if (qty == 0) {
                        showMessage.postValue(Event(MessageConstant(MESSAGES.ORG_SUBS_BOTTOMSHEET_LAUNCH)))
                    } else {
                        _orgCount.postValue(OrgQtyUpdate(qty, false))
                    }

//                    localDbUseCase.updateMedicineQuantity(subsInfo?.product?.productCode ?: "", qty)
                    subsInfo?.let {
                        updateQuantity(it, qty, false)
                    }
                }
            } else {
                val orgInfoModel = productDetailLiveData.value
                orgInfoModel?.let {
                    if (qty == 1) {
                        Toast().showCustomToastMessage(
                            context,
                            context.getString(R.string.item_added)
                        )
                        _orgCount.postValue(OrgQtyUpdate(qty, false))
                        addToCart(it, false, qty, itemAdded)
                    } else {
                        if (qty == 0) {
                            showMessage.postValue(Event(MessageConstant(MESSAGES.ORG_SUBS_BOTTOMSHEET_LAUNCH)))
                        } else {
                            _orgCount.postValue(OrgQtyUpdate(qty, false))
                        }
                        updateQuantity(it, qty)
                    }
                }
            }
        }

        /*
                override fun cartItemPlus(qty: Int) {
                    Log.e("PDVM bottomsheet", "cartItemPlus: qty = $qty")
                    val orgInfoModel = productDetailLiveData.value
                    orgInfoModel?.let {

                        if (SharedPrefManager.getInstance().incompleteOrderId > 0) {
                            if (qty == 1) {
                                viewModelScope.launch(Dispatchers.IO) {
                                    async {
                                        localDbUseCase.addToCart(
                                            orgInfoModel.productAsCartItem(
                                                false,
                                                1
                                            ), null, false
                                        )
                                    }.await()


                                    val replaceList = getAddedMedicinesFromCart(false, false)
                                    val responseCode = replaceMedsForIncompleteOrder(
                                        SharedPrefManager.getInstance().loggedInUserId,
                                        SharedPrefManager.getInstance().incompleteOrderId,
                                        replaceList,
                                        SharedPrefManager.getInstance().offerId,
                                        true,
                                        true,
                                        SharedPrefManager.getInstance().srcType,
                                        SharedPrefManager.getInstance().algoSpecificVariantId
                                    )
                                    responseCode?.let {
                                        if (it == 200) {
                                            // addToCart(orgInfoModel, false, 1)
                                            //  fetchCartDetails(initialLoad, page)
                                            */
        /*async {
                                                localDbUseCase.addToCart(
                                                    orgInfoModel.productAsCartItem(
                                                        false,
                                                        1
                                                    ), null, false
                                                )
                                            }.await()*//*

                                }
                            }
                        }
                    } else {

                        val editList: List<MedicineDto> = getEditOrderRequestData(
                            it.product.productCode,
                            qty
                        )
                        viewModelScope.launch(Dispatchers.IO) {
                            async {
                                editMedicine(
                                    SharedPrefManager.getInstance().incompleteOrderId,
                                    editList,
                                    false,
                                    "CART"
                                )
                            }.await()
                            */
        /*if (qty == 1) {
                                _orgCount.postValue(OrgQtyUpdate(qty, false))
                                val orgCartItem = it.productAsCartItem(false, 1)
                                viewModelScope.launch(Dispatchers.IO) {
                                    orderFlowUseCase.addMedicineToCart(orgCartItem, null, false)
                                }
                                setCartCount()
                            } else {
                                _orgCount.postValue(OrgQtyUpdate(qty, false))
                                viewModelScope.launch(Dispatchers.IO) {
                                    orderFlowUseCase.updateCartMedicineCount(it.product.productCode, qty)
                                }
                                setCartCount()
                            }*//*

                        }
                    }
                } else {
                    if (qty == 1) {
                        _orgCount.postValue(OrgQtyUpdate(qty, false))
                        addToCart(it, false, 1)
                    } else {
                        _orgCount.postValue(OrgQtyUpdate(qty, false))
                        updateQuantity(it, qty)
                    }
                }
            }

        }
*/

        override fun cartItemMinus(qty: Int) {
            Log.e("PDVM bottomsheet", "cartItemMinus: qty = $qty")
            val orgInfoModel = productDetailLiveData.value

            orgInfoModel?.let {
                if (qty > 0) {
                    _orgCount.postValue(OrgQtyUpdate(qty, false))
                    /*viewModelScope.launch(Dispatchers.IO) {
                        orderFlowUseCase.updateCartMedicineCount(
                            it.product.productCode,
                            qty
                        )
                    }
                    setCartCount()*/
                    updateQuantity(it, qty)
                }
                // setCartCount()
            }
        }

        override fun deleteAlert() {
            super.deleteAlert()
            _orgCount.postValue(OrgQtyUpdate(1, true))
            setCartCount()
        }

        override fun stepperError(msg: String?) {}
    }


    /* Recommended Section- Stepper callback */
    var recommendedStepperCallBack = object : StepperCallback {
        override fun cartItemMinus(qty: Int) {
            Log.d("PDVM Recomm Stepper", "callback is working minus $qty")
            var orgInfoModel = productDetailLiveData.value

            orgInfoModel?.let {
                if (qty == 0) {
                    _subsCount.postValue(SubsQtyUpdate(1, true))
                } else {
                    _subsCount.postValue(SubsQtyUpdate(qty, false))
                    updateQuantity(it, qty, isSubs = true)

                }
                setCartCount()
            }
        }


        override fun cartItemPlus(qty: Int) {
            var itemAdded = MxItemAdded()
            itemAdded.clickedOnPage = "pd"
            itemAdded.sectionIndex = suggestion_term_clicked_position + 1
            itemAdded.pageSection = "tray"
            itemAdded.sectionHeading =null
            itemAdded.sectionRow = if ( (suggestion_term_clicked_position + 1) % 2 == 0 ) 2 else 1
//            if (qty == 1) sendItemAddedEvent(productDetailLiveData.value,null,null, itemAdded)
            Log.d("PDVM Recomm Stepper", "callback is working plus $qty")
            _subsCount.postValue(SubsQtyUpdate(qty, false))
            var infoModel = productDetailLiveData.value
            infoModel?.let {
                if (qty == 1) {
                    addToCart(it, true, 1, itemAdded)
                } else {
                    updateQuantity(it, qty, isSubs = true)
                }
            }
        }

        override fun stepperError(msg: String?) {}
    }


    /* Recommended Section- FullWidthCard callback */
    private var recommendedFullwidthProductCardCallBack =
        object : FullWidthProductCardCallback {
            override fun removeButtonClick(productCode: String) {
                Log.d("PDVM Recommended FWC", "$productCode")
            }

            override fun switchBackOrg(productCode: String, switchBackAvailability: Boolean) {
                Log.d("PDVM Recommended FWC", "$productCode")
            }

            override fun substituteCheck(productCode: String) {
                Log.d("PDVM Recommended FWC", "$productCode")
            }

            override fun productClick(productCode: String) {
                super.productClick(productCode)
                Log.d("launchPDPage", "CLICKKKK")
                showMessage.postValue(Event(MessageConstant(MESSAGES.PRODUCT_DETAIL_ACTIVITY_LAUNCH)))
            }

            override fun suggestionClick(productCode: String) {
                super.suggestionClick(productCode)
            }
        }


    var compareChooseOrgcallback = object : StepperCallback {
        override fun cartItemMinus(qty: Int) {
            Log.d("PDVM cnc org stepper", "callback is working minus $qty")

            var orgInfoModel = productDetailLiveData.value

            orgInfoModel?.let {
                if (qty == 0) {
                    _orgCount.postValue(OrgQtyUpdate(qty, false))
                    removeItemFromCart(it, false)
                    if (clickedOnPage == "pd")
                        sendPdPageDeleteEvent(it.product.productCode, it.product.skuName)

                    isReload = true
                } else {
                    _orgCount.postValue(OrgQtyUpdate(qty, false))
                    updateQuantity(it, qty)
                    isReload = true
                }
            }
        }

        override fun cartItemPlus(qty: Int) {
            /**
             * ORG-SUBS mapping bottomsheet
             * **/
            var itemAdded = MxItemAdded()
            itemAdded.clickedOnPage = clickedOnPage
            itemAdded.sectionIndex = resultPosition + 1
            itemAdded.pageSection = "main"
            itemAdded.sectionRow = 0
            itemAdded.resultPosition = resultPosition + 1
            itemAdded.suggestionTermClicked = suggestion_term_clicked
            itemAdded.termSearched = term_searched
//            itemAdded.freeDeliveryRequiredAmount = /*SharedPrefManager.getInstance().deliveryOnAmount.toDouble()*/0.0
            itemAdded.suggestionTermClickedPosition = suggestion_term_clicked_position

//            if (qty == 1) sendItemAddedEvent(productDetailLiveData.value,null,null, itemAdded)
            Log.d("PDVM cnc org stepper", "callback is working plus $qty")
            var orgInfoModel = productDetailLiveData.value
            _orgCount.postValue(OrgQtyUpdate(qty, false))
            orgInfoModel?.let {
                if (qty == 1) {
                    addToCart(it, false, qty, itemAdded,
                        suggestionTermClickedPosition = suggestion_term_clicked_position,
                        suggestion_term_clicked = suggestion_term_clicked,
                        term_searched = term_searched,
                        clicked_suggestion_type = clicked_suggsetion_type)
                } else {
                    updateQuantity(it, qty)
                }
                isReload = true
            }
        }

        override fun stepperError(msg: String?) {}
    }


    private var compareChooseOrgProductCardCallBack =
        object : FullWidthProductCardCallback {
            override fun removeButtonClick(productCode: String) {
                Log.d(" PDVM cnc org card", "$productCode")
            }

            override fun switchBackOrg(productCode: String, switchBackAvailability: Boolean) {
                Log.d(" PDVM cnc org card", "$productCode")
            }

            override fun substituteCheck(productCode: String) {
                Log.d(" PDVM cnc org card", "$productCode")
            }
        }

    var compareChooseSubscallback = object : StepperCallback {
        override fun cartItemMinus(qty: Int) {
            Log.d("PDVM cnc subs stepper", "callback is working minus $qty")

            var orgInfoModel = /*sbsBottomSheet.value*/   productDetailLiveData.value

            orgInfoModel?.let {
                if (qty == 0) {
                    if (clickedOnPage == "pd")
                        sendPdPageDeleteEvent(it.suggestion?.productCode, it.suggestion?.skuName)

                    _subsCount.postValue(SubsQtyUpdate(qty, false))
                    removeItemFromCart(it, isSubs = true)
                } else {
                    _subsCount.postValue(SubsQtyUpdate(qty, false))
                    updateQuantity(it, qty, isSubs = true)
                }
                isReload = true
            }
        }

        override fun cartItemPlus(qty: Int) {
            /**
             * Subs bottomsheet add button
             * **/

            var itemAdded = MxItemAdded()
            itemAdded.clickedOnPage = clickedOnPage
            itemAdded.sectionIndex = resultPosition + 1
            itemAdded.pageSection = "main"
            itemAdded.sectionRow = 0
            itemAdded.resultPosition = resultPosition + 1
            itemAdded.suggestionTermClicked = suggestion_term_clicked
            itemAdded.termSearched = term_searched
//            itemAdded.freeDeliveryRequiredAmount = /*SharedPrefManager.getInstance().deliveryOnAmount.toDouble()*/0.0
            itemAdded.suggestionTermClickedPosition = suggestion_term_clicked_position


            var orgInfoModel = productDetailLiveData.value
            _subsCount.postValue(SubsQtyUpdate(qty, false))
            orgInfoModel?.let {
                if (qty == 1) {
                    addToCart(it, true, 1, itemAdded, term_searched = term_searched)
                } else {
                    updateQuantity(it, qty, true)
                }
                isReload = true
            }

            if (clickedOnPage.equals("search_result")){
                firebaseEventUseCase.logFirebaseEvent(FirebaseEvent.FIREBASE_SEARCH_SUBS_ADDED, "")
            }else if (clickedOnPage.equals("pd")){
                firebaseEventUseCase.logFirebaseEvent(FirebaseEvent.FIREBASE_PD_PAGE_SUB_ADDED, "")
            }
        }

        override fun stepperError(msg: String?) {}
    }

    private var compareChooseSubsProductCardCallBack =
        object : FullWidthProductCardCallback {
            override fun removeButtonClick(productCode: String) {
                Log.d("qwerty", "fwpc removeButtonClick : $productCode")

            }

            override fun switchBackOrg(productCode: String, switchBackAvailability: Boolean) {
                Log.d("qwerty", "fwpc switchBackOrg : $productCode")
            }

            override fun substituteCheck(productCode: String) {
                Log.d("qwerty", "fwpc substituteCheck : $productCode")
            }

            override fun productClick(productCode: String) {
                Log.d("launchPDPage 1", "CLICKKKK")
                val pdDetails = _productDetail.value
                if (pdDetails != null && pdDetails.suggestion?.productCode == productCode) {
                    launchPDPage.postValue(Event(ProductOrgSubsModel(productCode, true)))
                } else {
                    launchPDPage.postValue(Event(ProductOrgSubsModel(productCode, false)))
                }
            }

            override fun suggestionClick(productCode: String) {
                launchPDPage.postValue(Event(ProductOrgSubsModel(productCode, true)))
            }
        }

    private var subsProductCardCallBack =
        object : FullWidthProductCardCallback {
            override fun removeButtonClick(productCode: String) {
                Log.d("qwerty", "fwpc removeButtonClick : $productCode")

            }

            override fun switchBackOrg(productCode: String, switchBackAvailability: Boolean) {
                Log.d("qwerty", "fwpc switchBackOrg : $productCode")
            }

            override fun substituteCheck(productCode: String) {
                Log.d("qwerty", "fwpc substituteCheck : $productCode")
            }

            override fun productClick(productCode: String) {
                Log.d("launchPDPage 2", "CLICKKKK")
                val pdDetails = sbsBottomSheet.value
                launchPDPageForSub.postValue(Event(ProductOrgSubsModel(productCode, true)))
            }

            override fun suggestionClick(productCode: String) {
                launchPDPageForSub.postValue(Event(ProductOrgSubsModel(productCode, true)))
            }
        }

    var productCardSectionCallBack =
        object : ProductCardSection.ProductCardSectionCallback {
            override fun cartItemMinus(
                data: com.intellihealth.salt.models.ProductInfoModel,
                pos: Int,
                qty: Int
            ) {
                Log.e("*** PDVM ", "cartItemMinus: pos = $pos | qty = $qty")
                val doubleStackList = doubleStackListLiveData.value
                if (!doubleStackList.isNullOrEmpty() && pos < doubleStackList.size) {
                    val orgInfoModel = doubleStackList[pos]
                    orgInfoModel.let {
                        if (qty == 0) {
                        } else {
                            updateQuantity(it, qty)
                        }

                    }

                }
            }

            override fun cartItemPlus(
                data: com.intellihealth.salt.models.ProductInfoModel,
                pos: Int,
                qty: Int
            ) {
                Log.e("*** PDVM", "cartItemPlus: pos = $pos | qty = $qty")
                val doubleStackList = doubleStackListLiveData.value
                if (!doubleStackList.isNullOrEmpty() && pos < doubleStackList.size) {
                    val orgInfoModel = doubleStackList[pos]
                    orgInfoModel.let {
                        if (qty == 1) {
                            var itemAdded = MxItemAdded()
                            itemAdded.clickedOnPage = "pd"
                            itemAdded.sectionIndex = pos + 1
                            itemAdded.pageSection = "tray"
                            itemAdded.sectionHeading = "customers_also_brought"
                            var row = if((pos+1) % 2 == 0) 2 else 1
                            itemAdded.sectionRow = row
                            addToCart(it, false, qty, itemAdded)
                        } else {
                            updateQuantity(it, qty)
                        }
                    }
                }
            }

            override fun chipListItemClicked(
                position: Int,
                item: ProductCardSectionChipModel?
            ) {
                //TODO("Not yet implemented")
            }

            override fun deleteAlert(
                data: com.intellihealth.salt.models.ProductInfoModel,
                pos: Int,
                qty: Int
            ) {
                Log.d(
                    "**** product card ",
                    "deleteAlert " + data.product.skuName + " : " + pos + " " + qty
                )
                doubleStackDeleteData.postValue(pos)
            }

            override fun itemViewClick(productDetailModel: com.intellihealth.salt.models.ProductInfoModel) {
                _crosssellingClick.postValue(Event(productDetailModel))
            }

            override fun lastScrollPosition(pos: Int) {
                lastScrollPosition = pos
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
                val doubleStackList = doubleStackListLiveData.value
                if (!doubleStackList.isNullOrEmpty() && pos < doubleStackList.size) {
                    val orgInfoModel = doubleStackList[pos]
                }
            }

            override fun viewAllClicked() {
                TODO("Not yet implemented")
            }

            override fun viewAllStackedClicked() {
                TODO("Not yet implemented")
            }

        }


    private fun getProductDetails(
        query: String,
        elasticSearchType: String
    ): SearchResultElasticResponse? = runBlocking {
        return@runBlocking async {
            orderFlowUseCase.getSearchResults(mxInternalErrorOccurred,query, elasticSearchType, 1)
        }.await()
    }


    private fun updateImageAndTimeInRecentlySearchMedicine(
        image: String,
        drugType: String,
        productCode: String
    ) {
        viewModelScope.launch(Dispatchers.IO) {
            localDbUseCase.updateImageAndDrugTypeInRecentMeds(image, drugType, productCode)
        }
    }

    /*    private fun calculateCartPayableAmount() {
viewModelScope.launch(Dispatchers.IO) {
    var list = localDbUseCase.getAddedMedicines()
    cartCount.postValue(list.size)
    var cartTotal = 0.0
    for (item in list) {
        val sellingPrice = item.mrp - (item.mrp * (item.discount * 0.01))
        val subTotal = item.addedQty * sellingPrice
        cartTotal += subTotal
    }
}
}*/

    fun getMedicineCount(productCode: String): Int = runBlocking {
        return@runBlocking async {
            localDbUseCase.getAddedQtyOfAddedMedicine(productCode)
        }.await()
    }


    private fun checkAlreadyAddedAsSubs(
        orgProductCode: String,
        subsProductCode: String
    ): Boolean =
        runBlocking {
            return@runBlocking async {
                localDbUseCase.checkAlreadyAddedAsSubs(
                    orgProductCode,
                    subsProductCode,
                    false
                )
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

    /*private fun fetchMedicineDetails(
        productCode: String
    ): MedicineDetailsMain? = runBlocking {
        return@runBlocking async {
            orderFlowUseCase.fetchMedicineDetails(productCode)
        }.await()
    }*/

    fun applyCouponCode(
        orderId: Long,
        offerId: Int
    ): CouponSaveRemoveResponse {
        var applySuccess: CouponSaveRemoveResponse? = null

        viewModelScope.launch {
            withContext(coroutineContext) {
                var paymentTypeId =
                    if (SharedPrefManager.getInstance().lastSelectedPaymentModeId == -1)
                        17
                    else
                        SharedPrefManager.getInstance().lastSelectedPaymentModeId

                applySuccess = couponUseCase.applyAndRemoveCouponCode(
                    mxInternalErrorOccurred,orderId = orderId, paymentTypeId.toString(),
                    offerId = offerId.toString(),
                    billDetailsData, clickedOnPageNameForCouponEvent, null, medicineListDataReceived
                )
            }
        }
        return applySuccess ?: CouponSaveRemoveResponse()
    }


    private fun getCrossSellingRecommendedProducts(
        productCode: String
    ): CrossSellingRecommendedProductResponse? = runBlocking {
        return@runBlocking async {
            orderFlowUseCase.getCrossSellingRecommendedProducts(
                mxInternalErrorOccurred,sessionToken = loginUseCase.getSessionToken(mxInternalErrorOccurred,SharedPrefManager.getInstance().fcm),
                warehouseId = SharedPrefManager.getInstance().selectedWarehouseID,
                1,
                20,
                "App",
                productCode,
                SharedPrefManager.getInstance().algoSpecificVariantId
            )
        }.await()
    }

    fun updateCrossSellingRecommendedProducts(
        productCode: String
    ): ArrayList<com.intellihealth.salt.models.ProductInfoModel>? {

        val doubleStackModel = doubleStackSectionMutableLiveData.value ?: null
        val crossSellinglist = doubleStackModel?.list
        viewModelScope.launch(Dispatchers.IO) {
            crossSellinglist?.let {
                for (i in it.indices) {
                    //if (it[i].product.productCode == productCode) {
                    it[i].product.qty =
                        getMedicineCount(it[i].product.productCode)
                    //}
                }
            }
        }
        return crossSellinglist

    }

    fun getSuggestionRecommendedDBCount(productCode: String) {
        viewModelScope.launch(Dispatchers.IO) {
            recommenededUpdatedCount.postValue(getMedicineCount(productCode))
        }
    }

    /*fun editMedicine(orderId: Long, list: List<MedicineDto>, removeMed: Boolean, page: String = "") {
viewModelScope.launch(Dispatchers.IO) {
    if (list.isEmpty()) return@launch
    val apiResponse = orderFlowUseCase.editMedicine(orderId, list)
    if (apiResponse) {
        editMedicineApiSuccess.postValue(true)
    } else {
        editMedicineApiSuccess.postValue(false)
    }
}
}*/


    fun editMedicine(
        orderId: Long,
        list: List<MedicineDto>,
        removeMed: Boolean,
        page: String = "",
        isSubs: Boolean = false
    ) {
        viewModelScope.launch(Dispatchers.IO) {

            if (list.isEmpty()) return@launch
            var orderDiscarded = false
            val apiResponse = orderFlowUseCase.editMedicine(mxInternalErrorOccurred,orderId, list)
            if (apiResponse != null) {
                if (removeMed) {

                    if (list[0].cxAcceptedSubs == true) {
                        val subsCode =
                            localDbUseCase.getSubsProductCodeAfterDelete(list[0].productCode ?: "")
                        localDbUseCase.removeItemFromCart(subsCode ?: "", true)
                    } else {
                        localDbUseCase.removeItemFromCart(list[0].productCode ?: "", false)
                    }


                    localDbUseCase.removeCrossSellingProductUsingId(
                        list[0].productCode ?: ""
                    )

                    val productInfo = productDetailLiveData.value
                    //productInfo?.product?.qty = 0
                    productInfo?.product?.qty =
                        getMedicineCount(productInfo?.product?.productCode ?: "")
                    productInfo?.suggestion?.qty =
                        getMedicineCount(productInfo?.suggestion?.productCode ?: "")
                    _productDetail.postValue(productInfo)
//                    dismissBottomSheet.postValue(Event(true))
                } else {
                    localDbUseCase.updateMedicineQuantity(
                        list[0].productCode ?: "",
                        list[0].quantity ?: 1
                    )

                    localDbUseCase.updateOrgAvailable(list[0].productCode ?: "", true)
                    localDbUseCase.updateProductDetailsId(
                        list[0].productCode ?: "",
                        list[0].productDetailsId ?: 0
                    )
                }
                _isLoading.postValue(false)
                isDelete.postValue(Event(false))
                deleteProductEventListener.postValue(Event(false))

            } else {
                _isLoading.postValue(false)
                isDelete.postValue(Event(false))
                deleteProductEventListener.postValue(Event(false))
            }
            setCartCount()
        }
    }

    fun getEditOrderRequestData(productCode: String, qty: Int): List<MedicineDto> =
        runBlocking(Dispatchers.IO) {
            return@runBlocking async {
                localDbUseCase.getCartMedicineDtoFromProductCode(
                    cartMedicineListResponse,
                    productCode,
                    qty
                )
            }.await()
        }

    fun getFtcCouponsData() = viewModelScope.launch(Dispatchers.IO) {
        var categoryType = "NFTC_DynamicDiscount"
        val genericDiscountVariantId = localDbUseCase.getCustomerCategoryId(UserCategoryEnum.GENERIC_CAP_DISCOUNT.apiCategoryType)
        if (genericDiscountVariantId > 0) {
            categoryType = UserCategoryEnum.GENERIC_CAP_DISCOUNT.apiCategoryType
        }
        couponUseCase.fetchAllOffers(
            mxInternalErrorOccurred,100,
            SharedPrefManager.getInstance().pincode.toString(),
            "URGENCY_COUPON",
            if (SharedPrefManager.getInstance().isFtc) "FTC_Coupon_Urgency" else categoryType,
            if (SharedPrefManager.getInstance().algoSpecificVariantId == null || SharedPrefManager.getInstance().algoSpecificVariantId < 0) null else SharedPrefManager.getInstance().algoSpecificVariantId,

            )?.let {
            /*if (it.responseData.isNotEmpty()) {
                Log.d("Tag", "getFtcCouponsData: ${it.responseData.first()}")
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

    fun replaceMedsForIncompleteOrder(
        loggedInUserId: String,
        orderId: Long,
        medsList: List<MedicineDto>,
        offerId: String,
        checkAutoConfirmEligibility: Boolean,
        newAlgo: Boolean,
        srcType: Long,
        variantId: Long?
    ): SaveMedsCreateEditOrderResponse? = runBlocking {
        return@runBlocking async {
            orderFlowUseCase.replaceMedicineForIncompleteOrder(
                mxInternalErrorOccurred,orderId,
                medsList,
                loggedInUserId,
                offerId,
                checkAutoConfirmEligibility,
                newAlgo,
                srcType,
                variantId
            )
        }.await()
    }

    fun applyCouponClick(couponCodeResponse: CouponCodeResponse.Coupon?) {
        _isLoading.postValue(true)
        viewModelScope.launch(Dispatchers.IO) {

            if (medicineTotalSellingPrice.value!! >= couponCodeResponse?.minCartValue!!) {
                SharedPrefManager.getInstance().offerId = couponCodeResponse.offerId.toString()

                val replaceList = getAddedMedicinesFromCart(false, false)

                val responseCode = replaceMedsForIncompleteOrder(
                    SharedPrefManager.getInstance().loggedInUserId,
                    SharedPrefManager.getInstance().incompleteOrderId,
                    replaceList,
                    SharedPrefManager.getInstance().offerId,
                    true,
                    true,
                    SharedPrefManager.getInstance().srcType,
                    SharedPrefManager.getInstance().algoSpecificVariantId,
                )

                responseCode?.let {
                    if (it.statusCode == 200) {
                        SharedPrefManager.getInstance().autoReplaced = true
                        getMedicineOrderDetailsList(mxInternalErrorOccurred, SharedPrefManager.getInstance().incompleteOrderId, false)
                    }
                }
            }

            var couponSaveRemoveResponse: CouponSaveRemoveResponse? = null
            Log.d("TAG", "applyCouponClick:  cartAmount = ${cartSellingPrice.value}")
            if (medicineTotalSellingPrice.value!! >= couponCodeResponse?.minCartValue!! || (SharedPrefManager.getInstance().prescriptionCount > 0 && medicineTotalSellingPrice.value==0.0)) {
                setMedicineListDataReceived()
                couponSaveRemoveResponse = couponUseCase.applyAndRemoveCouponCode(
                    mxInternalErrorOccurred,SharedPrefManager.getInstance().incompleteOrderId,
                    getPaymentMode().toString(), couponCodeResponse?.offerId.toString(),
                    billDetailsData, clickedOnPageNameForCouponEvent, couponCodeResponse, medicineListDataReceived
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
//                couponCodeResponse.isCouponApplied = false
                val couponSaveRemoveResponse = async {
                    couponUseCase.applyAndRemoveCouponCode(
                        SharedPrefManager.getInstance().incompleteOrderId,
                        getPaymentMode().toString(), "0"
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
                    showMessage.postValue(Event(MESSAGES.REMOVED_COUPON_SUCCESSFULLY))
                }
            }

             */
            _isLoading.postValue(false)
        }

    }

    fun removeCouponClick(couponCodeResponse: CouponCodeResponse.Coupon?) {
        _isLoading.postValue(true)
        viewModelScope.launch(Dispatchers.IO) {
//            if (SharedPrefManager.getInstance().couponModel == null) getBillDetailApi(couponCodeResponse)
            Log.d(
                "TAG",
                "applyCouponClick:  cartAmount = ${cartSellingPrice.value} coupon model ${SharedPrefManager.getInstance().couponModel}"
            )
            val couponSaveRemoveResponse = async {
                setMedicineListDataReceived()
                couponUseCase.applyAndRemoveCouponCode(
                    mxInternalErrorOccurred,SharedPrefManager.getInstance().incompleteOrderId,
                    getPaymentMode().toString(), "0",
                    billDetailsData, clickedOnPageNameForCouponEvent, couponCodeResponse, medicineListDataReceived
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
                Log.d("Intent", "onCreate: setParameter call 20:::"+SharedPrefManager.getInstance().couponDiscount.toDouble())

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

    fun calculateSavingAmount(couponCodeResponse: CouponCodeResponse.Coupon?,currentPayableAmount:Double) {
        _isLoading.postValue(true)
        viewModelScope.launch(Dispatchers.IO) {
            openCouponPopupOffline.postValue(
                Event(
                    Pair(
                        couponCodeResponse,
                        orderFlowUseCase.calculateSavingAmount(couponCodeResponse,"product_detail_page",medicineListDataReceived,billDetailsData,
                            currentPayableAmount)

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
            clickedOnPage = "product_detail_page",
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
            }else{
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
            clickedOnPage = "product_detail_page",
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
            }else {
                null
            }
        )
        sdkEventUseCase.sendFtcStickyStripClickedEvent(mxStickyStripViewed)
    }

    fun sendPdpImageViewedEvent(mxPdpImageViewed: MxPdpImageViewed) {
        sdkEventUseCase.sendPdpImageViewedEvent(mxPdpImageViewed)
    }

    fun sendMedicineDetailsViewedViewedEvent(productDetailsSection: String) {
        val mxPdpMedicineDetailsViewed = MxPdpMedicineDetailsViewed()
        mxPdpMedicineDetailsViewed.productId = productDetailLiveData.value?.product?.productCode
        mxPdpMedicineDetailsViewed.productDetailsSection = productDetailsSection
        mxPdpMedicineDetailsViewed.whId = SharedPrefManager.getInstance().selectedWarehouseID
        mxPdpMedicineDetailsViewed.product_name =  productDetailLiveData.value?.product?.skuName
        sdkEventUseCase.sendMedicineDetailsViewedViewedEvent(mxPdpMedicineDetailsViewed, productDetailLiveData.value?.product?.productCode)
    }

    fun sendPdpViewedEvent(
        productInfo: ProductInfoModel,
        isBottomSheetBahaviour: Boolean,
        subsFoundOrderSummary: String?,
        eventOrgProductForThisPage: ProductInfoModel?=null
    ) {
        var subsSaving: String? = null
        if (eventOrgProductForThisPage != null) {
            productInfo.suggestion = eventOrgProductForThisPage.suggestion
        }
        if ((productInfo.product != null && productInfo.suggestion != null)|| (productInfo.product != null && this.orgProductForSubs != null)) {
            subsSaving =
                if (!productInfo.product.subsSavingPercentage.isNullOrEmpty()) productInfo.product.subsSavingPercentage.toString() else null
        } else null

        if(!crossSellingSectionHeader.isNullOrEmpty()){
            if(crossSellingSectionHeader?.toLowerCase()?.contains("trending") == true){
                crossSellingSectionHeader ="trending_in_city"
            }else if(crossSellingSectionHeader?.toLowerCase()?.contains("limited") == true){
                crossSellingSectionHeader="limited_offer"
            }
            else if(crossSellingSectionHeader?.toLowerCase()?.contains("arrival") == true){
                crossSellingSectionHeader="new_arrivals"
            }
            else { crossSellingSectionHeader}
        }
        var mxPdpViewed = MxPdpViewed(
            brand = if(!productInfo.product.motherBrand.isNullOrEmpty()) productInfo.product.motherBrand else null,
            clickedOnPage = clickedOnPage,
            clickedSuggestionType =if(!clicked_suggsetion_type.isNullOrEmpty()) clicked_suggsetion_type else "in sku",
            discountVariantId = SharedPrefManager.getInstance().algoSpecificVariantId,
            isBottomSheet = isBottomSheetBahaviour,
            isNotInStock = !productInfo.product.suppliedByTm || !productInfo.product.isAvailable,
            orgProductDiscountPercentage = if(isSubs && this.orgProductForSubs!= null) this.orgProductForSubs?.product?.discount.toString()  else productInfo.product.discount.toString(),
            orgProductId = if(!productInfo.product.orgProductCode.isNullOrEmpty()) productInfo.product.orgProductCode else null,
            orgProductMrp = if(isSubs && this.orgProductForSubs!= null) this.orgProductForSubs?.product?.mrp else productInfo.product.mrp,
            orgProductName = if(isSubs) productInfo.product.orgSubsSkuName else productInfo.product.skuName,
            subsProductId = if(productInfo.suggestion != null) productInfo.suggestion?.productCode else { if(isSubs) productInfo.product.productCode else null},
            subsProductName = if(productInfo.suggestion != null) {productInfo.suggestion?.skuName} else { if(isSubs) productInfo.product.skuName?:null else null},
            orgProductPictureExists = productInfo.product.productImageUrl != null,
            orgProductSalePrice = if(isSubs && this.orgProductForSubs!= null) this.orgProductForSubs?.product?.sellingPrice else productInfo.product.sellingPrice,
            pageSection = if(!section.isNullOrEmpty()) section else "main",
            pageType = if(productInfo.product.subsFound) "org_with_sub" else "org_without_sub",
            productDiscountPercentage = if(productInfo.suggestion?.discount != null) productInfo.suggestion?.discount.toString() else null,
            productId = if(productInfo.product.productCode != null)productInfo.product.productCode else null,
            productMrp = if(productInfo.product.mrp != null)productInfo.product.mrp else null,
            productName = if(productInfo.product.skuName != null)productInfo.product.skuName else null,
            productSalePrice = if(productInfo.product.sellingPrice != null) productInfo.product.sellingPrice else null,
            qc =if(!item_qc.isNullOrEmpty()) item_qc else null,
            resultPosition =suggestion_term_clicked_position,
            rt =if(!item_rt.isNullOrEmpty()) item_rt else null,
            sectionIndex = if(sectionIndex != null) sectionIndex else 0 ,
            sectionRow = if(sectionRow!=null) sectionRow else 0,
            subsProductDiscountPercentage = if (isSubs) {if(orgProductForSubs?.suggestion?.discount != null) orgProductForSubs?.suggestion?.discount.toString() else null} else if (productInfo.suggestion != null && productInfo.suggestion?.discount != null) {if(productInfo.suggestion?.discount != null)productInfo.suggestion?.discount.toString() else null } else null,
            subsProductMrp = if(productInfo.suggestion != null) productInfo.suggestion?.mrp else { if(isSubs) productInfo.product.mrp else null},
            subsProductPictureExists = productInfo.suggestion?.productImageUrl != null,
            subsProductSalePrice =if(productInfo.suggestion != null)  productInfo.suggestion?.sellingPrice  else { if(isSubs) productInfo.product.sellingPrice else null},
            subsSavings = subsSaving,
            //substituteAvailable = if(!subsFoundOrderSummary.isNullOrEmpty()) subsFoundOrderSummary.toBoolean() else productInfo.product.subsFound,
            substituteAvailable = if(isSubs) false else if(!subsFoundOrderSummary.isNullOrEmpty()) subsFoundOrderSummary.toBoolean() else productInfo.product.subsFound,
            suggestionTermClicked =if(!suggestion_term_clicked.isNullOrEmpty()) suggestion_term_clicked else null,
            suggestionTermClickedPosition =if(suggestion_term_clicked_position != null) suggestion_term_clicked_position else null,
            termSearched =if(!term_searched.isNullOrEmpty()) term_searched else null,
            section_heading =  if(!crossSellingSectionHeader.isNullOrEmpty()) crossSellingSectionHeader else null,
            is_otc = productInfo.product.isOtc,
            superCategoryName =  if(!otcSuperCategoryName.isNullOrEmpty()) otcSuperCategoryName else null,
            subCategoryName =  if(!otcSubCategoryName.isNullOrEmpty()) otcSubCategoryName else null,
            categoryName =  if(!otcCategoryName.isNullOrEmpty()) otcCategoryName else null,
            chronic = productInfo.product.isChronic
//            isSubs = isSubs
        )
        sdkEventUseCase.sendPdpViewedEvent(mxPdpViewed)
        var appFlyerPdpViewed = mxPdpViewed.toAppsFlyer()
//        appFlyerPdpViewed.is_chronic = productInfo.product.isChronic
//        appFlyerPdpViewed.is_otc = productInfo.product.isOtc ?: false

//        sdkEventUseCase.sendPdpViewedEvent(AppsFlyerEvent.convertJsonToHashmap(Gson().toJson(
//            AFPdpViewed(product_name = productInfo.product.skuName, product_mrp = productInfo.product.mrp, is_chronic = isChronicAdded, is_substitutable = if(!subsFoundOrderSummary.isNullOrEmpty()) subsFoundOrderSummary.toBoolean() else productInfo.product.subsFound, product_sale_price = if(isSubs && this.orgProductForSubs!= null) this.orgProductForSubs?.product?.sellingPrice else productInfo.product.sellingPrice, is_otc = isOtcAdded, is_not_in_stock = !productInfo.product.suppliedByTm || !productInfo.product.isAvailable)
//        )))
        sdkEventUseCase.sendPdpViewedEvent(AppsFlyerEvent.convertJsonToHashmap(Gson().toJson(appFlyerPdpViewed)))
    }

    fun sendFtcCounterStarted(timestamp: Long) {
        val mxUrgencyTimerStarted = MxUrgencyTimerStarted(
            DateUtils.convertMillisToSeconds(DateUtils.convertEpochTimeStampToDateMillis(timestamp, System.currentTimeMillis())))
        sdkEventUseCase.sendFtcTimerStartedEvent(mxUrgencyTimerStarted)
    }

    fun calculateBillDetailsAfterCouponApplied(orderId: Long) = viewModelScope.launch {
        orderFlowUseCase.calculateBillDetailsforApp(mxInternalErrorOccurred, orderId, true)
            .let { bill ->
                if (bill != null) {
                    billDetailsData = bill.responseData
                    bill?.responseData?.let {

                        Log.e("card_dataaaa::::","44444:::"+ bill?.responseData!!.toString())
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
    fun pdPageSubView(fbSubsView: FbSubsView) {
        sdkEventUseCase.pdPageSubView(fbSubsView)
    }
    fun subsPopup(fbSubsView: FbSubsView) {
        sdkEventUseCase.subsPopup(fbSubsView)
    }
    fun substituteDropdownViewed(firebaseEventModel: FirebaseEventModel) {
        sdkEventUseCase.substituteDropdownViewed(firebaseEventModel)
    }

    fun substituteDropdownClosed(firebaseEventModel: FirebaseEventModel) {
        sdkEventUseCase.substituteDropdownClosed(firebaseEventModel)
    }
    fun sendViewCartClickFirebaseEvent() {
        firebaseEventUseCase.pdPageViewCart(
            FirebaseEventModel(
                mobile = SharedPrefManager.getInstance().loggedInUserMobile,
                customerId = SharedPrefManager.getInstance().loggedInUserId,
                productCode = productDetailLiveData.value?.product?.productCode,
                productName = productDetailLiveData.value?.product?.skuName,
                variantId = SharedPrefManager.getInstance().algoSpecificVariantId.toInt()
            )
        )

        sdkEventUseCase.sendPdPageViewCartToFacebookEvent()
    }
    fun sendPDPViewedFirebaseEvent() {
        firebaseEventUseCase.logFirebaseEvent(FirebaseEvent.FIREBASE_PDP_VIEWED,"")
    }

    fun sendPdPageDeleteEvent(productCodeToDelete: String?, skuName: String?) {
        firebaseEventUseCase.pdPageDelete(FirebaseEventModel(
            mobile = SharedPrefManager.getInstance().loggedInUserMobile,
            customerId = SharedPrefManager.getInstance().loggedInUserId,
            productCode = productCodeToDelete,
            productName = skuName ?: ""
        ))

        sdkEventUseCase.sendPdPageDeleteToFacebookEvent()
    }
}
