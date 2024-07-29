package com.intellihealth.truemeds.presentation.activity

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.SystemClock
import android.util.Log
import android.view.View
import android.view.ViewTreeObserver
import android.widget.RatingBar
import androidx.activity.OnBackPressedCallback
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.ContextCompat
import androidx.core.os.bundleOf
import androidx.lifecycle.ViewModelProvider
import com.google.android.play.core.review.ReviewInfo
import com.google.android.play.core.review.ReviewManager
import com.google.android.play.core.review.ReviewManagerFactory
import com.google.gson.Gson
import com.google.gson.JsonObject
import com.intellihealth.salt.callbacks.BackArrowClickCallback
import com.intellihealth.salt.callbacks.BannerCallback
import com.intellihealth.salt.callbacks.BannerClickCallback
import com.intellihealth.salt.callbacks.ButtonClickCallback
import com.intellihealth.salt.callbacks.DoctorCallCardCallback
import com.intellihealth.salt.callbacks.FloatingVideoCallback
import com.intellihealth.salt.callbacks.FullWidthProductCardCallback
import com.intellihealth.salt.callbacks.OrderPersonalDetailsCallback
import com.intellihealth.salt.callbacks.OrderTrackerCallback
import com.intellihealth.salt.callbacks.OrderedItemCallback
import com.intellihealth.salt.callbacks.PaymentContainerCallback
import com.intellihealth.salt.callbacks.ReminderCardCallback
import com.intellihealth.salt.constants.FullWidthProductCardConstants
import com.intellihealth.salt.constants.PaymentContainerConstants
import com.intellihealth.salt.models.BillDetailsModel
import com.intellihealth.salt.models.MobileSectionHeadersModel
import com.intellihealth.salt.models.OrderPersonalDetailsModel
import com.intellihealth.salt.models.OrderTrackerModel
import com.intellihealth.salt.models.ProductInfoModel
import com.intellihealth.salt.views.Toast
import com.intellihealth.salt.views.tooltip.DefaultExpandedTooltip
import com.intellihealth.truemeds.BuildConfig
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.callback.BottomSheetCloseCallback
import com.intellihealth.truemeds.data.repository.datasource.local.entity.PillReminder
import com.intellihealth.truemeds.data.repository.datasource.local.entity.SaveVideoFAQ
import com.intellihealth.truemeds.data.utils.MESSAGES
import com.intellihealth.truemeds.data.utils.removeExtraZeros
import com.intellihealth.truemeds.databinding.ActivityOrderStatusBinding
import com.intellihealth.truemeds.domain.navigation.navigateToVideoFaqActivity
import com.intellihealth.truemeds.domain.navigation.navigateToCancelOrderActivity
import com.intellihealth.truemeds.domain.navigation.navigateToHelpActivity
import com.intellihealth.truemeds.domain.navigation.navigateToHomePageActivity
import com.intellihealth.truemeds.domain.navigation.navigateToPaymentActivity
import com.intellihealth.truemeds.domain.navigation.navigateToPaymentOptionActivity
import com.intellihealth.truemeds.domain.navigation.navigateToWebBrowser
import com.intellihealth.truemeds.domain.usecase.analytics.FirebaseEventUseCase
import com.intellihealth.truemeds.presentation.analytics.FirebaseEvent
import com.intellihealth.truemeds.presentation.bottomsheet.AddReminderBottomSheet
import com.intellihealth.truemeds.presentation.bottomsheet.ReminderEditFragment
import com.intellihealth.truemeds.presentation.bottomsheet.cart.ViewPrescriptionBottomSheet
import com.intellihealth.truemeds.presentation.bottomsheet.orderstatus.ContactDetailsCollectionBottomSheet
import com.intellihealth.truemeds.presentation.bottomsheet.orderstatus.DetailedStatusBottomSheet
import com.intellihealth.truemeds.presentation.bottomsheet.orderstatus.ModificationItemBottomSheet
import com.intellihealth.truemeds.presentation.bottomsheet.orderstatus.OptForSubstituteBottomSheet
import com.intellihealth.truemeds.presentation.bottomsheet.productdetail.ProductDetailBottomSheet
import com.intellihealth.truemeds.presentation.callbacks.DetailTimeLineActionBtnBack
import com.intellihealth.truemeds.presentation.callbacks.ViewPrescriptionCallback
import com.intellihealth.truemeds.presentation.model.Product
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.utils.CommonFunc
import com.intellihealth.truemeds.presentation.utils.CommonFunc.isSingleClickParam
import com.intellihealth.truemeds.presentation.utils.HomeSectionConstants
import com.intellihealth.truemeds.presentation.utils.viewBinding
import com.intellihealth.truemeds.presentation.viewmodel.OrderStatusViewModel
import com.intellihealth.truemeds.presentation.viewmodel.ProductDetailViewModel
import com.intellihealth.truemeds.presentation.viewmodel.ReminderViewModel
import com.intellihealth.truemeds.presentation.viewmodel.events.EventObserver
import com.userexperior.UserExperior
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class OrderStatusActivity : BaseActivity() {
    private val binding by viewBinding(ActivityOrderStatusBinding::inflate)
    private lateinit var viewModel: OrderStatusViewModel
    private lateinit var reminderViewModel: ReminderViewModel
    private lateinit var productDetailViewModel: ProductDetailViewModel
    var orderId: Long = 0
    var isReturnBack: Boolean = false
    var onFinishReCreateHomePage = false
    private var lastClickTime: Long = 0
    private val coolDownSeconds = 2
    val handler = Handler(Looper.getMainLooper())
    private var toolTip: DefaultExpandedTooltip? = null
    val delayMillis = 4000L
    var isAnotherActivityClik: Boolean = false
    var requestChangeToCod = false
    val bottomSheet: AddReminderBottomSheet by lazy { AddReminderBottomSheet() }

    @Inject
    lateinit var firebaseEventUseCase: FirebaseEventUseCase
    override fun extractIntentData() {
        intent.extras?.let { bundle ->
            if (bundle.containsKey(BundleConstants.ORDER_ID)) {
                orderId = bundle.getLong(BundleConstants.ORDER_ID, 0)
            }

            if (bundle.containsKey("is_return_back")) {
                isReturnBack = bundle.getBoolean("is_return_back", false)
            }

            if (bundle.containsKey("onFinishReCreateHomePage")) {
                onFinishReCreateHomePage = bundle.getBoolean("onFinishReCreateHomePage", false)
            }

            if (bundle.containsKey(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE)) {
                viewModel.clickedOnPage =
                    bundle.getString(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE).toString()
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this)[OrderStatusViewModel::class.java]
        productDetailViewModel = ViewModelProvider(this)[ProductDetailViewModel::class.java]
        reminderViewModel = ViewModelProvider(this)[ReminderViewModel::class.java]

        viewModel.showShimmerLiveData.observe(this) {
            if (it) {
                binding.stickyOrderStatus.visibility = View.GONE
                binding.nestedScrollView.visibility = View.GONE
                binding.shimmerViewContainer.startShimmerAnimation()
            } else {
                binding.shimmerViewContainer.stopShimmerAnimation()
                binding.stickyOrderStatus.visibility = View.VISIBLE
                binding.nestedScrollView.visibility = View.VISIBLE

            }
        }

        binding.viewModel = viewModel
        binding.orderStatusResponseData = viewModel.orderStatusResponseData.value
        binding.lifecycleOwner = this
        supportActionBar?.hide()
        extractIntentData()
        /**
         * All setting data method
         * **/
        setData()
        eventListener()
        updateStatusBarColor()
        /**
         * All click listener and callback and observe data
         * **/
        allCallbackAndClick()
        setStatusBarColor()
        ratingToPlayStore()

        if (!UserExperior.isRecording()) {
            Log.i("Recording", "recording started")
            UserExperior.startRecording(applicationContext, BuildConfig.userExperiorSDKKey)
        }
    }

    private fun eventListener() {
        viewModel.pageTitle.observe(this) {
            if (it != null) {
                binding.sectionHeader.setHeaderTitle(it)
            }
        }
        viewModel.orderPlaceModel?.observe(this) {
            if (it != null) {
                binding.orderTracker.visibility = View.VISIBLE
                binding.orderTracker.setOrderTracker(it)
                /*if (it.orderStatusCardModel.buttonText.contains("pay", true)) {
                    viewModel.sendPaymentPendingSheetViewed(MxPaymentPendingViewed(
                        clickedOnPage = "order_status",
                        estimatedPayableAmount = viewModel.billDetailsResponse.value?.responseData?.payableAmt,
                        orderId = orderId.toString()
                    ))
                }*/
            }
        }
        viewModel.paymentContainerModel.observe(this) {
            if (it.payableAmount > 0.0) {
                binding.stickyPaymentContainer.visibility = View.VISIBLE
                binding.stickyPaymentContainer.setUpPaymentContainer(it)
            } else {
                binding.stickyPaymentContainer.visibility = View.GONE
            }
        }
        viewModel.orderPersonalAddressModel.observe(this) {
            binding.addressDetailCard.setPersonalDetails(it)
            viewModel.showShimmerLiveData.postValue(false)
        }
        viewModel.orderPersonalMobileDetail.observe(this) {
            if (it.alternatePhoneNumber == null || (viewModel.isFromDeleteAlternateNumber && viewModel.isDeleteNumberSuccessFully)) {
                binding.numberDetailCard.setPersonalDetails(it)
                binding.numberDetailCard.setPersonalDetailType(it, 2)

            } else {
                binding.numberDetailCard.setPersonalDetails(it)
                binding.numberDetailCard.setPersonalDetailType(it, 3)
            }

            binding.helpDetailCard.setPersonalDetails(it)
            binding.cancelOrderCard.setPersonalDetails(it)

        }

        viewModel.orderPersonalEmailDetail.observe(this) { isEmailDetailCard ->
            if (isEmailDetailCard) {
                binding.emailDetailCard.visibility = View.VISIBLE
                binding.emailDetailCard.setPersonalDetails(viewModel.getCustomerEmailIdCard())
                binding.emailDetailCard.setPersonalDetailType(viewModel.getCustomerEmailIdCard(), 7)
            } else {
                binding.emailDetailCard.visibility = View.GONE
            }
        }

        viewModel.reminderDataExist.observe(this) {
            if (!it) {
                if (viewModel.orderIdExistForReminder.value == false) {
                    if (reminderViewModel.deleteReminderForOrderStatus.value == false) {
                        binding.reminderCard.visibility = View.GONE
                        viewModel.insertPillReminder(
                            PillReminder(
                                0,
                                orderId,
                                "" + viewModel.patientIdForReminder.value
                            )
                        )
                        reminderViewModel.addReminderFromOrderStatusActivity.value = true
                        reminderViewModel.alertReminderNameValue.value = viewModel.patientName.value
                        //this id is used for set reminder
                        reminderViewModel.addPatientId.value = viewModel.patientId.value!!.toInt()
                        // this id is set for reminder alert page edit page
                        reminderViewModel.editReminderPatientId.value = viewModel.patientId.value!!
                        reminderViewModel.addReminderTitle.value =
                            "Set a reminder call for your next order"
                        bottomSheet.setReminderViewModel(
                            reminderViewModel,
                            viewModel.mxReminderSuccessfullySetDataToMixpanel(), true
                        )
                        bottomSheet.isCancelable = true
                        /*val mngr = getSystemService(ACTIVITY_SERVICE) as ActivityManager
                        val taskList = mngr.getRunningTasks(10)
                        if (taskList[0].numActivities == 1 && taskList[0].topActivity!!.className == this.javaClass.name) {
                            if (!bottomSheet.isVisible) {
                                try {
                                    handler.postDelayed({
                                        if (!supportFragmentManager.isDestroyed)
                                            bottomSheet.show(
                                                supportFragmentManager,
                                                "AddReminderBottomSheet"
                                            )
                                    }, delayMillis)
                                } catch (ignore: java.lang.Exception) {
                                }
                            }
                        }
                        Log.d("Activity", "name:"+this.javaClass.name)
                        Log.d("Activity", "nameOther:"+taskList[0].topActivity!!.className)
*/
                        if (!isAnotherActivityClik) {
                            if (!bottomSheet.isVisible) {
                                try {
                                    handler.postDelayed({
                                        if (!supportFragmentManager.isDestroyed) {
                                            try {
                                                bottomSheet.show(
                                                    supportFragmentManager,
                                                    "AddReminderBottomSheet"
                                                )
                                                binding.reminderCard.visibility = View.VISIBLE
                                            } catch (e: Exception) {
                                                isReminderPendingToShow = true
                                            }

                                            isReminderPendingToShow = false
                                            viewModel.sendReminderBottomSheetViewedEvent()
                                        }
                                    }, delayMillis)
                                } catch (e: Exception) {
                                    isReminderPendingToShow = true
                                }
                            }
                        }
                    }

                } else {
                    binding.reminderCard.visibility = View.VISIBLE
                }
            }
        }
        viewModel.reminderCardModel.observe(this) {
            if (it.snooze != "") {
                ContextCompat.getDrawable(this, R.drawable.ic_edit)
                    ?.let { it1 -> binding.reminderCard.setImageRightIcon(it1) }
            } else {
                ContextCompat.getDrawable(this, com.intellihealth.salt.R.drawable.ic_forward)
                    ?.let { it1 -> binding.reminderCard.setImageRightIcon(it1) }
            }
            binding.reminderCard.setUpData(it)
        }

        viewModel.isShowVideoPopup.observe(this) {
            if (it) {
                viewModel.insertSaveVideoFAQ(
                    SaveVideoFAQ(
                        0,
                        orderId,
                        java.lang.String.valueOf(viewModel.patientIdForReminder)
                    )
                )
                if (viewModel.gifUrlVertical.value.isNullOrEmpty()) {
                    binding.floatingVideoThumbnail.visibility = View.GONE
                    binding.clVideoBanner.visibility = View.GONE
                } else {
                    binding.floatingVideoThumbnail.visibility = View.VISIBLE
                    binding.floatingVideoThumbnail.setThumbnailUrl(viewModel.gifUrlVertical.value.toString())
                    binding.clVideoBanner.visibility = View.GONE

                    viewModel.sendVideoFloaterImpressionEvent(orderId.toString())
                }
            } else {
                binding.floatingVideoThumbnail.visibility = View.GONE
                binding.clVideoBanner.visibility = View.VISIBLE
            }

        }
        viewModel.doctorRating.observe(this) {
            if (it?.statusCode == 200) {
                viewModel.setOrderTrackerData(orderId, true)
            } else {
                CommonFunc.openErrorDialog(this, it?.message ?: "")
            }
        }
        viewModel.billDetailsResponse.observe(this) {
            it?.let {
                if (it.responseData.mrp != null && (it.responseData.mrp ?: 0.0) > 0.0) {
                    binding.billDetails.setUpBillDetailsData(viewModel.billDetails.value, 0)
                } else {
                    val pharmacistPaymentModeOffData = BillDetailsModel(
                        billDetailsTitle = "Bill Details",
                        postProcessingMsg = "Total amount will be calculated post processing",
                        paymentModeValue = it.responseData.paymentSelectionInfo?.paymentMethod
                    )
                    binding.billDetails.setUpBillDetailsData(pharmacistPaymentModeOffData, 1)
                }
            }
        }

    }

    override fun onResume() {
        super.onResume()
        if (isReminderPendingToShow && !bottomSheet.isVisible) {
            bottomSheet.show(supportFragmentManager, "Reminder")
        }
    }

    private fun setStatusBarColor() {
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


    private fun setData() {
        viewModel.setOrderTrackerData(orderId, true)

        if (SharedPrefManager.getInstance().loggedInUserEmail.isNullOrEmpty()) {
            viewModel.orderPersonalEmailDetail.value = true
        } else {
            viewModel.orderPersonalEmailDetail.value = false
        }
    }

    private fun allCallbackAndClick() {

        val orderTrackerCallback = object : OrderTrackerCallback {
            override fun onViewDetailsCallback(orderTrackerModel: OrderTrackerModel) {
                if (isSingleClickParam()) {
                    viewModel.detailedTimeLineDataList.value?.let {
                        val detailStatusBottomSheet =
                            DetailedStatusBottomSheet(it, object : DetailTimeLineActionBtnBack {
                                override fun actionButtonClick(action: String) {
                                    if (action.contains("pay", true)) {
                                        openPaymentPage()
                                    } else if (action.contains("call", ignoreCase = true)) {
                                        viewModel.getDoctorCallMeBack(orderId)
                                    } else {
                                        navigateToWebBrowser(
                                            params = bundleOf(
                                                "isDeliveryPartner" to true,
                                                "deliveryPartnerName" to viewModel.deliveryPartnerName.value,
                                                "deliveryPartnerContact" to viewModel.deliveryPartnerContact.value,
                                                "ExtUrl" to viewModel.clickPostTrackingUrl.value
                                            )
                                        )
                                    }
                                }

                            })
                        detailStatusBottomSheet.isCancelable = true

                        if (!detailStatusBottomSheet.isVisible) {
                            detailStatusBottomSheet.show(
                                supportFragmentManager, "DetailedStatusBottomSheet"
                            )
                            viewModel.eventViewDetailsClicked(viewModel.mxOrderStatusBill)
                            lastClickTime = SystemClock.elapsedRealtime()
                        }
                    }
                }


            }

            override fun actionButtonClick(type: String?) {
                if (type?.contains("pay", true) == true) {
                    openPaymentPage()
                } else if (type?.contains("call", ignoreCase = true) == true) {
                    viewModel.getDoctorCallMeBack(orderId)
                } else {
                    navigateToWebBrowser(
                        params = bundleOf(
                            "isDeliveryPartner" to true,
                            "deliveryPartnerName" to viewModel.deliveryPartnerName.value,
                            "deliveryPartnerContact" to viewModel.deliveryPartnerContact.value,
                            "ExtUrl" to viewModel.clickPostTrackingUrl.value
                        )
                    )
                }


            }

        }


        binding.orderedItemCard.setCallBack(object : OrderedItemCallback {
            override fun onViewOriginalCallback(product: ProductInfoModel) {
                if (isSingleClickParam()) {
                    val productDetailsBottomSheet =
                        ProductDetailBottomSheet(
                            product.product.switchBackProductCode ?: "",
                            clickedOnPage = "Order Details",
                            pageSection = "main"
                        )
                    productDetailsBottomSheet.dataFromOrderStatus(true)
                    productDetailsBottomSheet.isCancelable = true
                    if (!productDetailsBottomSheet.isVisible) supportFragmentManager.let {
                        productDetailsBottomSheet.show(
                            it, "ProductDetailBottomsheet"
                        )
                        lastClickTime = SystemClock.elapsedRealtime()
                    }
                }
            }

            override fun onViewChangesCallback() {
                if (isSingleClickParam()) {
                    val modificationItemBottomSheet = ModificationItemBottomSheet(viewModel)
                    modificationItemBottomSheet.isCancelable = true
                    if (!modificationItemBottomSheet.isVisible) {
                        modificationItemBottomSheet.show(
                            supportFragmentManager, "ModificationItemBottomSheet"
                        )
                        lastClickTime = SystemClock.elapsedRealtime()
                    }
                }
            }

            override fun onCardCallback(product: ProductInfoModel) {

                val isSubs = !product.product.switchBackSkuName.isNullOrEmpty()
                val switchBackSkuNameForBottomSheetSubs = product.product.switchBackSkuName ?: ""
                val productDetailsBottomSheet =
                    ProductDetailBottomSheet(
                        product.product.productCode ?: "",
                        isSubs = isSubs,
                        switchBackSkuNameForBottomSheetSubs = switchBackSkuNameForBottomSheetSubs,
                        clickedOnPage = "Order Details",
                        pageSection = "main"
                    )
                val productInfoMapped =
                    com.intellihealth.truemeds.presentation.model.ProductInfoModel(
                        product.cardType,
                        product.isReplaced,
                        product.isOrgAddedToCart,
                        product.isAutoReplaced,
                        product.isSubsAddedToCart,
                        product = Product(
                            productCode = product.product.productCode,
                            skuName = product.product.skuName ?: "",
                            availabilityStatus = product.product.availabilityStatus,
                            isAvailable = product.product.isAvailable,
                            suppliedByTm = product.product.suppliedByTm,
                            manufacturerName = product.product.manufacturerName ?: "",
                            maxCappedQty = product.product.maxCappedQty,
                            mrp = removeExtraZeros(product.product.mrp),
                            sellingPrice = removeExtraZeros(product.product.sellingPrice),
                            discount = product.product.discount,
                            packSize = product.product.packSize ?: "",
                            manufacturerAddr = product.product.manufacturerAddress,
                            unit = product.product.unit ?: "",
                            packForm = product.product.packForm ?: "",
                            pricePerUnitLabel = product.product.pricePerUnitLabel ?: "",
                            productImageUrl = product.product.productImageUrl ?: "",
                            qty = product.product.qty,
                            composition = product.product.composition ?: "",
                            subsSavingPercentage = product.product.subsSavingsPercentage,
                            cxAcceptedSubs = product.product.cxAcceptedSubs,
                            switchBackSkuName = product.product.switchBackSkuName ?: null,
                            switchBackProductCode = product.product.switchBackProductCode ?: null,
                            switchBackImageUrl = product.product.switchBackImageUrl ?: "",
                            preSubsSkuName = product.product.preSubsSkuName ?: "",
                            preSubsProductCode = product.product.preSubsProductCode ?: "",
                            usersAlsoBoughtMessage = product.product.usersAlsoBoughtMessage.toString() + " users bought this instead",
                            subsFound = product.product.subsFound,
                            prevOrderId = null,
                            prevOrgProductId = null,
                            replacedSavingPercentage = product.product.replacedSavingPercentage,
                            motherBrand = product.product.motherBrand,
                            isOtc = product.product.isOtc ?: false,
                            isChronic = product.product.isChronic ?: false,
                        ),
                        suggestion = if (product.suggestion == null) null else {
                            Product(
                                productCode = product.suggestion?.productCode ?: "",
                                skuName = product.suggestion?.skuName ?: "",
                                availabilityStatus = product.suggestion?.availabilityStatus,
                                isAvailable = product.suggestion?.isAvailable ?: false,
                                suppliedByTm = product.suggestion?.suppliedByTm ?: false,
                                manufacturerName = product.suggestion?.manufacturerName ?: "",
                                maxCappedQty = product.suggestion?.maxCappedQty ?: 0,
                                mrp = removeExtraZeros(product.suggestion?.mrp ?: 0.0),
                                sellingPrice = removeExtraZeros(
                                    product.suggestion?.sellingPrice ?: 0.0
                                ),
                                discount = product.suggestion?.discount ?: 0.0,
                                packSize = product.suggestion?.packSize ?: "",
                                manufacturerAddr = product.suggestion?.manufacturerAddress,
                                unit = product.suggestion?.unit ?: "",
                                packForm = product.suggestion?.packForm ?: "",
                                pricePerUnitLabel = product.suggestion?.pricePerUnitLabel ?: "",
                                productImageUrl = product.suggestion?.productImageUrl ?: "",
                                qty = product.suggestion?.qty,
                                composition = product.suggestion?.composition ?: "",
                                subsSavingPercentage = product.suggestion?.subsSavingsPercentage,
                                cxAcceptedSubs = product.suggestion?.cxAcceptedSubs ?: false,
                                switchBackSkuName = product.suggestion?.switchBackSkuName ?: null,
                                switchBackProductCode = product.suggestion?.switchBackProductCode
                                    ?: null,
                                switchBackImageUrl = product.suggestion?.switchBackImageUrl ?: "",
                                preSubsSkuName = product.suggestion?.preSubsSkuName ?: "",
                                preSubsProductCode = product.suggestion?.preSubsProductCode ?: "",
                                usersAlsoBoughtMessage = product.suggestion?.usersAlsoBoughtMessage.toString() + " users bought this instead",
                                subsFound = product.suggestion?.subsFound ?: false,
                                prevOrderId = null,
                                prevOrgProductId = null,
                                replacedSavingPercentage = product.suggestion?.replacedSavingPercentage,
                                motherBrand = product.suggestion?.motherBrand,
                                isOtc = product.suggestion?.isOtc ?: false,
                                isChronic = product.suggestion?.isChronic ?: false,
                            )
                        }
                    )
                productDetailsBottomSheet.dataFromOrderStatus(true, productInfoMapped)
                productDetailsBottomSheet.isCancelable = true

                if (isSingleClickHandle()) {
                    supportFragmentManager.let {
                        productDetailsBottomSheet.show(
                            it, "ProductDetailBottomsheet"
                        )
                    }
                    lastClickTime = SystemClock.elapsedRealtime()
                }
            }


            override fun onSubstituteCallback(product: ProductInfoModel) {
                if (isSingleClickParam()) {
                    val bundle = Bundle()
                    val model = Gson().toJson(product.suggestion)
                    bundle.putString(BundleConstants.PRODUCT_SUBS_DETAIL, model)
                    bundle.putString(
                        BundleConstants.PRODUCT_SUBS_TITLE,
                        product.suggestion?.skuName
                    )
                    val optSubsBs = OptForSubstituteBottomSheet().newInstance()
                    optSubsBs.isCancelable = true

                    var productTest = ProductInfoModel(
                        cardType = FullWidthProductCardConstants.MODIFICATION,
                        isReplaced = false,
                        isOrgAddedToCart = false,
                        isAutoReplaced = false,
                        isSubsAddedToCart = false,
                        sameCompositionProduct = product.product.skuName,
                        product = product.suggestion!!,
                        suggestion = null,
                        isDisplayAddIcon = false
                    )
                    var cardCallBack =
                        object : FullWidthProductCardCallback {
                            override fun removeButtonClick(productCode: String) {
                                Log.d("qwerty", "fwpc removeButtonClick : $productCode")

                            }

                            override fun switchBackOrg(
                                productCode: String,
                                switchBackAvailability: Boolean
                            ) {
                                Log.d("qwerty", "fwpc switchBackOrg : $productCode")
                            }

                            override fun substituteCheck(productCode: String) {
                                Log.d("qwerty", "fwpc substituteCheck : $productCode")
                            }

                            override fun productClick(productCode: String) {

                                val isSubs = true
                                val switchBackSkuNameForBottomSheetSubs = product.product.skuName
                                val productDetailsBottomSheet =
                                    ProductDetailBottomSheet(
                                        productCode ?: "",
                                        isSubs = isSubs,
                                        switchBackSkuNameForBottomSheetSubs = switchBackSkuNameForBottomSheetSubs,
                                        clickedOnPage = "Order Details",
                                        pageSection = "main"
                                    )
                                val productInfoMapped =
                                    com.intellihealth.truemeds.presentation.model.ProductInfoModel(
                                        product.cardType,
                                        product.isReplaced,
                                        product.isOrgAddedToCart,
                                        product.isAutoReplaced,
                                        product.isSubsAddedToCart,
                                        product = Product(
                                            productCode = product.suggestion?.productCode ?: "",
                                            skuName = product.suggestion?.skuName ?: "",
                                            availabilityStatus = product.suggestion?.availabilityStatus,
                                            isAvailable = product.suggestion?.isAvailable ?: false,
                                            suppliedByTm = product.suggestion?.suppliedByTm
                                                ?: false,
                                            manufacturerName = product.suggestion?.manufacturerName
                                                ?: "",
                                            maxCappedQty = product.suggestion?.maxCappedQty ?: 1,
                                            mrp = removeExtraZeros(product.suggestion?.mrp ?: 0.0),
                                            sellingPrice = removeExtraZeros(
                                                product.suggestion?.sellingPrice ?: 0.0
                                            ),
                                            discount = product.suggestion?.discount ?: 0.0,
                                            packSize = product.suggestion?.packSize ?: "",
                                            manufacturerAddr = product.suggestion?.manufacturerAddress,
                                            unit = product.suggestion?.unit ?: "",
                                            packForm = product.suggestion?.packForm ?: "",
                                            pricePerUnitLabel = product.suggestion?.pricePerUnitLabel
                                                ?: "",
                                            productImageUrl = product.suggestion?.productImageUrl
                                                ?: "",
                                            qty = product.suggestion?.qty,
                                            composition = product.suggestion?.composition ?: "",
                                            subsSavingPercentage = product.suggestion?.subsSavingsPercentage,
                                            cxAcceptedSubs = product.suggestion?.cxAcceptedSubs
                                                ?: false,
                                            switchBackSkuName = product.suggestion?.switchBackSkuName
                                                ?: null,
                                            switchBackProductCode = product.suggestion?.switchBackProductCode
                                                ?: null,
                                            switchBackImageUrl = product.suggestion?.switchBackImageUrl
                                                ?: "",
                                            preSubsSkuName = product.suggestion?.preSubsSkuName
                                                ?: "",
                                            preSubsProductCode = product.suggestion?.preSubsProductCode
                                                ?: "",
                                            usersAlsoBoughtMessage = product.suggestion?.usersAlsoBoughtMessage.toString() + " users bought this instead",
                                            subsFound = product.suggestion?.subsFound ?: false,
                                            prevOrderId = null,
                                            prevOrgProductId = null,
                                            replacedSavingPercentage = product.product.replacedSavingPercentage,
                                            motherBrand = product.product.motherBrand,
                                            isOtc = product.product.isOtc ?: false,
                                            isChronic = product.product.isChronic ?: false
                                        ),
                                        suggestion = null
                                    )
                                productDetailsBottomSheet.dataFromOrderStatus(
                                    true,
                                    productInfoMapped
                                )
                                productDetailsBottomSheet.isCancelable = true

                                if (!productDetailsBottomSheet.isVisible && isSingleClickHandle()) {
                                    supportFragmentManager.let {
                                        productDetailsBottomSheet.show(
                                            it, "ProductDetailBottomsheet"
                                        )
                                    }
                                    lastClickTime = SystemClock.elapsedRealtime()
                                }
                            }

                            override fun suggestionClick(productCode: String) {
                            }
                        }
                    productTest.product.productCallback = cardCallBack
                    optSubsBs.setOrderStatus(productTest)

                    if (!optSubsBs.isVisible) {
                        optSubsBs.show(supportFragmentManager, "OptSubsBottomSheet")
                        lastClickTime = SystemClock.elapsedRealtime()
                    }
                }
            }

        })
        val helpCardCallBack = object : OrderPersonalDetailsCallback {
            override fun onAddAlternateEmailClick(personalDetails: OrderPersonalDetailsModel) {
                if (isSingleClickParam()) {
                    viewModel.isFromDeleteAlternateNumber = false
                    val alternateNumberBottomSheet =
                        ContactDetailsCollectionBottomSheet(
                            viewModel = viewModel,
                            orderId = orderId,
                            isAddAlternateEmail = true
                        )
                    alternateNumberBottomSheet.isCancelable = true
                    if (!alternateNumberBottomSheet.isVisible) {
                        alternateNumberBottomSheet.show(
                            supportFragmentManager, "AlternateNumberBottomSheet"
                        )
                        lastClickTime = SystemClock.elapsedRealtime()
                    }
                }
            }

            override fun onAddAlternateNumberClick(personalDetails: OrderPersonalDetailsModel) {
                if (isSingleClickParam()) {
                    viewModel.isFromDeleteAlternateNumber = false
                    val alternateNumberBottomSheet =
                        ContactDetailsCollectionBottomSheet(viewModel, orderId, "")
                    alternateNumberBottomSheet.isCancelable = true
                    if (!alternateNumberBottomSheet.isVisible) {
                        firebaseEventUseCase.logFirebaseEvent(
                            FirebaseEvent.FIREBASE_ORDER_STATUS_ADD_ALTERNATE_CONTACT,
                            ""
                        )
                        alternateNumberBottomSheet.show(
                            supportFragmentManager, "AlternateNumberBottomSheet"
                        )
                        viewModel.eventAddAlternateContactNumber(orderId)
                        lastClickTime = SystemClock.elapsedRealtime()
                    }
                }
            }

            override fun onEditAlternateNumberClick(personalDetails: OrderPersonalDetailsModel) {
                viewModel.isFromDeleteAlternateNumber = false
                if (isSingleClickParam()) {
                    val alternateNumberBottomSheet =
                        ContactDetailsCollectionBottomSheet(
                            viewModel,
                            orderId,
                            personalDetails.alternatePhoneNumber ?: "", isEdit = true
                        )
                    alternateNumberBottomSheet.isCancelable = true
                    if (!alternateNumberBottomSheet.isVisible) {
                        alternateNumberBottomSheet.show(
                            supportFragmentManager, "AlternateNumberBottomSheet"
                        )
                        lastClickTime = SystemClock.elapsedRealtime()
                    }
                }
            }

            override fun onCallUsClick(personalDetails: OrderPersonalDetailsModel) {
                /*val intent = Intent(Intent.ACTION_DIAL)
                intent.data = Uri.parse("tel:" + SharedPrefManager.getInstance().customerCareNumber)
                startActivity(intent)*/
                callCustomerCareIntent()
            }

            override fun onModifyOrderClick(personalDetails: OrderPersonalDetailsModel) {
                Toast().showCustomToastMessage(
                    this@OrderStatusActivity,
                    "clicked onModifyOrderClick"
                )
            }

            override fun onCancelOrderClick(personalDetails: OrderPersonalDetailsModel) {
                isAnotherActivityClik = true
                val gson = Gson()
                val json = gson.toJson(viewModel.appOrderCancelledData())
                viewModel.eventAppOrderCancelledClick("OrderStatusCancelBtn")

                navigateToCancelOrderActivity(
                    params = bundleOf(
                        "orderId" to orderId,
                        BundleConstants.TOTAL_SAVING_AMOUNT to viewModel.savingValue.value.toString(),
                        BundleConstants.CANCEL_ORDER_EVENT_DATA to json,
                        BundleConstants.CURRENT_ORDER_STATUS to viewModel.currentOrderStatus,
                        BundleConstants.BUNDLE_KEY_BILL_DETAILS to Gson().toJson(viewModel.billDetailsResponse.value)
                    )
                )
            }
        }
        val prescriptionCallback = object : ViewPrescriptionCallback {
            override fun onDeleteImage(imageId: Long) {
                TODO("Not yet implemented")
            }

            override fun onViewPrescriptionClicked(position: Int, imageURL: String) {
                if (isSingleClickParam()) {
                    val bottomSheet = viewModel.prescriptionList.value?.let {
                        ViewPrescriptionBottomSheet(
                            position,
                            it, HomeSectionConstants.VIEW_PRESCRIPTION
                        )
                    }
                    bottomSheet?.isCancelable = true
                    if (bottomSheet != null)
                        if (!bottomSheet.isVisible) {
                            bottomSheet.show(supportFragmentManager, "ViewPrescriptionBottomSheet")
                            lastClickTime = SystemClock.elapsedRealtime()
                        }
                }
            }

            override fun onAddMoreClicked() {

            }

        }

        binding.stickyPaymentContainer.setCallback(object : PaymentContainerCallback {
            override fun viewClickCallback(viewType: PaymentContainerConstants) {
                when (viewType) {
                    PaymentContainerConstants.CHANGE -> {
                        if (viewModel.paymentEnable) {
                            changedActionClicked()
                        } else {
                            Toast().showCustomToastMessage(
                                this@OrderStatusActivity,
                                "Available once order is ready to dispatch"
                            )
                        }
                    }

                    PaymentContainerConstants.PAY -> {
                        if (viewModel.paymentEnable) {
                            openPaymentPage()
                        } else {
                            Toast().showCustomToastMessage(
                                this@OrderStatusActivity,
                                "Available once order is ready to dispatch"
                            )
                        }
                    }

                    PaymentContainerConstants.PLACE_ORDER -> {}

                    PaymentContainerConstants.PAY_USING -> {}
                }
            }


        })

        binding.sectionHeader.setUpMobileSectionHeadersData(
            MobileSectionHeadersModel(
                "", "Sub-Header", "", "Help", 20,
                buttonIconRight = ContextCompat.getDrawable(
                    this,
                    com.intellihealth.salt.R.drawable.ic_help_symbol
                )
            )
        )


        binding.floatingVideoThumbnail.setListener(object : FloatingVideoCallback {
            override fun onCloseClick() {
                if (viewModel.isShowVideoPopup.value == true) {
                    binding.clVideoBanner.visibility = View.VISIBLE
                } else {
                    binding.clVideoBanner.visibility = View.GONE
                }
                binding.floatingVideoThumbnail.visibility = View.GONE
            }

            override fun onGifClick() {
                isAnotherActivityClik = true
                navigateToVideoFaqActivity(
                    params = bundleOf(
                        "video_url" to viewModel.videoUrl.value,
                        "source" to "order_status_section"
                    )
                )
                binding.floatingVideoThumbnail.visibility = View.GONE
                viewModel.eventVideoFloaterClickedEvent(orderId)
            }
        })




        reminderViewModel.eventMessage.observe(this, EventObserver {
            if (it != null) {
                if (it.equals(MESSAGES.SET_REMINDER_SUCCESSFULLY) || it.equals(MESSAGES.DELETE_REMINDER_SUCCESSFULLY)) {
                    viewModel.patientId.value?.let { viewModel.getReminderData(it) }
                } else if (it.equals(MESSAGES.EDIT_PATIENT_DETAILS_CLICK)) {

                }
            }
        })
        reminderViewModel.closeAddReminder.observe(this) {
            if (it) {
                binding.reminderCard.visibility = View.VISIBLE
            }
        }

        binding.reminderCard.setCallback(object : ReminderCardCallback {
            override fun viewClickCallback() {
                if (viewModel.reminderDataExist.value == true) {
                    if (isSingleClickParam()) {

                        /*val mxReminderSuccessfullySet = MxReminderSuccessfullySet(
                            addressType = viewModel.addressData?.responseData?.get(0)?.addressType?:"",
                            couponDiscountAmount = viewModel.billDetailsResponse.value?.responseData?.couponDiscountAmt ?: 0.0,
                            discountAmount = viewModel.billDetailsResponse.value?.responseData?.discount ?:0.0,
                            orderId = viewModel.orderID,
                            deliveryChargeAmount = viewModel.billDetailsResponse.value?.responseData?.deliveryCharge ?:0.0,
                            deliveryDays = viewModel.customerOrderDetailsResponseData?.deliveryDays?.toDouble() ?:0.0,
                            estimatedPayableAmount = viewModel.billDetailsResponse.value?.responseData?.payableAmt ?:0.0,
                            gender = viewModel.patientData?.responseData?.get(0)?.gender ?: "",
                            isDrCallRequired = viewModel.customerOrderDetailsResponseData?.drCallRequired ?: false,
                            mrpTotalAmount = viewModel.billDetailsResponse.value?.responseData?.mrp ?:0.0,
                            packagingChargeAmount = viewModel.billDetailsResponse.value?.responseData?.packagingCharge ?:0.0,
                            patientAge = viewModel.patientData?.responseData?.get(0)?.age,
                            patientType = viewModel.patientData?.responseData?.get(0)?.relationName,
                            paymentMethod = viewModel.billDetailsResponse.value?.responseData?.paymentMode,
                            rxRequired = viewModel.rxRequired,
                            shippingCity = viewModel.addressData?.responseData?.get(0)?.cityName,
                            shippingPincode = viewModel.addressData?.responseData?.get(0)?.pincode,
                            shippingState = viewModel.addressData?.responseData?.get(0)?.stateName,
                            tmCreditAmount = viewModel.billDetailsResponse.value?.responseData?.tmCredit ?: 0.0,
                            tmRewardAmount = viewModel.billDetailsResponse.value?.responseData?.tmCash ?: 0.0,
                            whId = SharedPrefManager.getInstance().selectedWarehouseID ?: "",
                            reminderDate = viewModel.convertStringToDate(viewModel.editReminderDate),
                            reminderFrequency = viewModel.editReminderFrequency.toDouble(),
                            clickedOnPage = "order_status_screen",
                            variantName = "A" // as to discuss
                        )*/


                        val bottomSheet = ReminderEditFragment()
                        reminderViewModel.editReminderDateValue = viewModel.editReminderDate
                        reminderViewModel.editReminderFrequency.value =
                            viewModel.editReminderFrequency
                        reminderViewModel.editReminderPatientId.value =
                            viewModel.patientIdForReminder.value
                        reminderViewModel.editReminderId.value = viewModel.editReminderDeleteId
                        reminderViewModel.editReminderNameValue.value = viewModel.patientName.value
                        reminderViewModel.previousReminderFrequency =
                            viewModel.editReminderFrequency
                        reminderViewModel.previousReminderDateValue = viewModel.editReminderDate
                        bottomSheet.setReminderViewModelForOrderStatus(reminderViewModel, object :
                            BottomSheetCloseCallback {
                            override fun closed() {
                                viewModel.patientId.value?.let {
                                    viewModel.getReminderData(it)
                                }
                            }
                        }, viewModel.mxReminderSuccessfullySetDataToMixpanel())
                        bottomSheet.isCancelable = true
                        if (!bottomSheet.isVisible) {
                            reminderViewModel.currentPage = "order_status_screen"
                            bottomSheet.show(supportFragmentManager, "ReminderEditBottomSheet")
                            lastClickTime = SystemClock.elapsedRealtime()
                            viewModel.sendReminderEditClickedEvent()
                        }
                    }
                } else {
                    if (isSingleClickParam()) {
                        val bottomSheet = AddReminderBottomSheet()
                        bottomSheet.setReminderViewModelForOrderStatus(reminderViewModel, object :
                            BottomSheetCloseCallback {
                            override fun closed() {
                                viewModel.patientId.value?.let { viewModel.getReminderData(it) }
                            }
                        })
                        bottomSheet.isCancelable = true
                        if (!bottomSheet.isVisible) {
                            reminderViewModel.addReminderFromOrderStatusActivity.value = true
                            reminderViewModel.alertReminderNameValue.value =
                                viewModel.patientName.value
                            //this id is used for set reminder
                            reminderViewModel.addPatientId.value =
                                viewModel.patientId.value!!.toInt()
                            // this id is set for reminder alert page edit page
                            reminderViewModel.editReminderPatientId.value =
                                viewModel.patientId.value!!
                            reminderViewModel.addReminderTitle.value =
                                "Set a reminder call for your next order"
                            bottomSheet.setReminderViewModel(
                                reminderViewModel,
                                viewModel.mxReminderSuccessfullySetDataToMixpanel(), true
                            )
                            bottomSheet.show(supportFragmentManager, "AddReminderBottomSheet")
                            lastClickTime = SystemClock.elapsedRealtime()
                            reminderViewModel.currentPage = "order_status_screen"
                            viewModel.sendPatientAndReminderSetButtonOrderStatus()
                            viewModel.sendReminderBottomSheetViewedEvent()
                        }

                    }
                }
            }
        })

        binding.sectionHeader.setBackArrowClickCallback(object :
            BackArrowClickCallback {
            override fun onBackArrowClick() {
                onBackPressAction()
            }
        })

        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                onBackPressAction()
            }
        })

        binding.sectionHeader.setButtonClickCallback(object :
            ButtonClickCallback {
            override fun buttonClick() {
                isAnotherActivityClik = true
                navigateToHelpActivity()
            }

            override fun buttonClickWithParams(buttonType: String) {
                // TODO("Not yet implemented")
            }
        })
        binding.callback = prescriptionCallback
        binding.addressDetailCard.setCallBack(helpCardCallBack)
        binding.numberDetailCard.setCallBack(helpCardCallBack)
        binding.emailDetailCard.setCallBack(helpCardCallBack)
        binding.orderTracker.setOrderTrackerCallback(orderTrackerCallback)
        binding.cancelOrderCard.setCallBack(helpCardCallBack)
        binding.helpDetailCard.setCallBack(helpCardCallBack)
//todo modification changes hide
        binding.orderedItemCard.hideViewChanges(false)

        binding.doctorCallCard.setDoctorCardClickCallback(object : DoctorCallCardCallback {
            var finaLRating = 0
            override fun getOnRatingBarChangeListener(
                ratingBar: RatingBar,
                rating: Float,
                fromUser: Boolean
            ) {
                finaLRating = rating.toInt()
            }

            override fun getOnSubmitClickListener() {
                val jsonObject = JsonObject()
                jsonObject.addProperty("customerId", SharedPrefManager.getInstance().loggedInUserId)
                jsonObject.addProperty("doctorId", viewModel.doctorId.value)
                jsonObject.addProperty("orderId", orderId)
                jsonObject.addProperty("rating", finaLRating)
                jsonObject.addProperty("comments", "")
                viewModel.submitDoctorRating(jsonObject, orderId)
            }

        })

        viewModel.bannerList.observe(this) {
            binding.tmBanner.setBannerData(
                it,
                object : BannerCallback {
                    override fun getBannerSwipe() {}
                    override fun getBannerClick(bannerPosition: Int) {

                    }

                    override fun getBannerPosition(position: Int) {
                    }

                }, 0, object : BannerClickCallback {
                    override fun onBannerClick(position: Int) {
                        navigateToVideoFaqActivity(
                            params = bundleOf(
                                "video_url" to viewModel.videoUrl.value,
                                "source" to "order_status_section"
                            )
                        )
                    }
                }, false
            )

            binding.nestedScrollView.viewTreeObserver
                .addOnScrollChangedListener(ViewTreeObserver.OnScrollChangedListener {
                    binding.billDetails.dismissTooltips()
                })

        }


        /*val dialog = Dialog(this)
        viewModel.loaderValue.observe(this) {
            if (it) enableLoadingView(dialog)
            else disableLoadingView(dialog)
        }*/

        /*   viewModel.showAlternateNumberVisibilityLiveData.observe(this, Observer {
               if(it && viewModel.isFromDeleteAlternateNumber) {
                   Toast().showCustomToastMessage(this, "Callback received")
                   viewModel.orderPersonalMobileDetail.value?.let { it1 ->
                       binding.numberDetailCard.setPersonalDetailType(
                           it1, 2)
                   }
               }
           })*/
    }

    private fun onBackPressAction() {
        if (onFinishReCreateHomePage) {
            navigateToHomePageActivity(
                params = bundleOf(
                    "isFromSummaryPage" to true
                )
            )
            finishAffinity()
        } else {
            finish()
        }
    }

    private fun openPaymentPage() {
       /* val intent = Intent(this@OrderStatusActivity, PaymentActivity::class.java)
        if (requestChangeToCod) {
            intent.putExtra("orderId", orderId)
            intent.putExtra(
                BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE,
                BundleConstants.ORDER_STATUS
            )
        } else {
            intent.putExtra(
                "paymentMethod",
                CommonFunc.getPaymentMethodForCashfree(viewModel.paymentSelectionInfo.value?.paymentMethod)
            )
            intent.putExtra(
                "paymentMethodId",
                viewModel.paymentSelectionInfo.value?.paymentMethodId?.toLong()
            )
            intent.putExtra("orderId", orderId)
            intent.putExtra(
                BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE,
                BundleConstants.ORDER_STATUS
            )
            intent.putExtra(
                "estimatedPayableValue",
                viewModel.billDetails.value?.estimatedPayableValue
            )
            intent.putExtra(
                BundleConstants.CURRENT_ORDER_STATUS,
                viewModel.currentOrderState
            )
            intent.putExtra(BundleConstants.BUNDLE_KEY_IS_REORDER, viewModel.isReOrder)
        }
        activityLauncher.launch(intent)*/


        if (requestChangeToCod) {
            navigateToPaymentActivity(
                params = bundleOf(
                    "orderId" to orderId,
                    BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to BundleConstants.ORDER_STATUS
                ),

                activityLauncher = activityLauncher

            )

        } else {
            navigateToPaymentActivity(
                params = bundleOf(
                    "paymentMethod" to CommonFunc.getPaymentMethodForCashfree(viewModel.paymentSelectionInfo.value?.paymentMethod),
                    "paymentMethodId" to viewModel.paymentSelectionInfo.value?.paymentMethodId?.toLong(),
                    "orderId" to orderId,
                    BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to BundleConstants.ORDER_STATUS,
                    "estimatedPayableValue" to viewModel.billDetails.value?.estimatedPayableValue,
                    BundleConstants.CURRENT_ORDER_STATUS to viewModel.currentOrderState,
                    BundleConstants.BUNDLE_KEY_IS_REORDER to viewModel.isReOrder
                ),

                activityLauncher = activityLauncher

            )

        }
        viewModel.sendPaymentPageVisitedEventToMixpanel("order_status", "payment_bottom_card")
    }


    fun changedActionClicked() {
        var productIds = ArrayList<String>(0)
        var productNames: ArrayList<String> = ArrayList<String>(0)
        try {
            for (index in viewModel.orderedItemsList.value?.indices!!) {
                productNames.add(
                    index,
                    viewModel.orderedItemsList.value!![index].productDetailModel.product.skuName
                )
                productIds.add(
                    index,
                    viewModel.orderedItemsList.value!![index].productDetailModel.product.productCode
                )
            }
        } catch (e: Exception) {

        }
        val intent =
            Intent(this@OrderStatusActivity, PaymentOptionActivity::class.java).apply {
                putExtra(
                    BundleConstants.BUNDLE_KEY_LAST_SELECTED_PAYMENT_METHOD,
                    viewModel.paymentSelectionInfo.value?.paymentMethod
                )
                putExtra(
                    BundleConstants.BUNDLE_KEY_LAST_SELECTED_PAYMENT_METHOD_ID,
                    viewModel.paymentSelectionInfo.value?.paymentMethodId?.toLong()
                )
                putExtra(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE, BundleConstants.ORDER_STATUS)
                putExtra(
                    BundleConstants.BUNDLE_KEY_PATIENT_ID,
                    viewModel.patientId.value
                )
                putExtra(BundleConstants.BUNDLE_KEY_INCLUDE_COD, false)
                putExtra(
                    BundleConstants.BUNDLE_KEY_BILL_DETAILS,
                    Gson().toJson(viewModel.billDetails.value)
                )
                putExtra(
                    BundleConstants.BUNDLE_KEY_ORDER_ID,
                    orderId.toString()
                )
                putExtra(BundleConstants.BUNDLE_KEY_PAYABLE_AMOUNT_TEXT, true)
                putExtra(
                    BundleConstants.BUNDLE_KEY_COUPON_APPLIED_NAME,
                    viewModel.billDetails.value?.couponName
                )
                putExtra(
                    BundleConstants.BUNDLE_KEY_IS_PAYMENT_SPECIFIC_COUPON,
                    viewModel.paymentSelectionInfo.value?.paymentSpecificCouponApplied
                )
                putExtra(BundleConstants.BUNDLE_KEY_PAGE_SECTION, "pay_using")
                putExtra(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE, BundleConstants.ORDER_STATUS)
                //putExtra("ORDER_TYPE_ID", viewModel.customerOrderDetailsResponseData?.orderTypeId)

                putExtra(
                    BundleConstants.BUNDLE_KEY_NO_OF_ITEMS,
                    productNames.size
                )
                putExtra(BundleConstants.BUNDLE_KEY_ITEM_NAMES, productNames)
                putExtra(
                    BundleConstants.BUNDLE_KEY_SELLING_PRICE,
                    viewModel.billDetailsResponse.value?.responseData?.sellingPrice
                )
                putExtra(
                    BundleConstants.BUNDLE_KEY_CURRENT_ORDER_STATUS,
                    viewModel.currentOrderState
                )
                putExtra(
                    BundleConstants.BUNDLE_KEY_IS_REORDER,
                    viewModel.isReOrder
                )
                putExtra(
                    BundleConstants.BUNDLE_KEY_PATIENT_TYPE,
                    viewModel.patientData?.responseData?.get(0)?.relationName
                )
                putExtra(
                    BundleConstants.BUNDLE_KEY_PATIENT_AGE,
                    viewModel.patientData?.responseData?.get(0)?.age.toString()
                )
                putExtra(
                    BundleConstants.BUNDLE_KEY_PATIENT_GENDER,
                    viewModel.patientData?.responseData?.get(0)?.gender
                )
                putExtra(
                    BundleConstants.BUNDLE_KEY_SHIPPING_CITY,
                    viewModel.addressData?.responseData?.get(0)?.cityName
                )
                putExtra(
                    BundleConstants.BUNDLE_KEY_SHIPPING_STATE,
                    viewModel.addressData?.responseData?.get(0)?.stateName
                )
                putExtra(
                    BundleConstants.BUNDLE_KEY_SHIPPING_PINCODE,
                    viewModel.addressData?.responseData?.get(0)?.pincode?.toInt()
                )
                putExtra(
                    BundleConstants.BUNDLE_KEY_ADDRESS_TYPE,
                    viewModel.addressData?.responseData?.get(0)?.addressType
                )
                putExtra(BundleConstants.BUNDLE_KEY_PRODUCT_IDS, productIds)
                putExtra(
                    BundleConstants.BUNDLE_KEY_RX_REQUIRED,
                    viewModel.rxRequired
                )
                putExtra(
                    BundleConstants.BUNDLE_KEY_IS_CHRONIC_ADDED,
                    viewModel.isChronicAdded
                )
                putExtra(
                    BundleConstants.BUNDLE_KEY_CURRENT_ORDER_STATUS_ID,
                    viewModel.currentOrderStatus
                )
                putExtra(
                    BundleConstants.CURRENT_ORDER_STATUS,
                    viewModel.currentOrderState
                )
            }
        //startActivity(intent)
        activityLauncher.launch(intent)


    }

    private var activityLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result: ActivityResult? ->
        if (result?.resultCode == BundleConstants.REQUEST_CODE_PAYMENT_CHANGE) {
            requestChangeToCod = true
            viewModel.setBillDetailsData(orderId, true, "", false, "", true)
        }
    }

    fun ratingToPlayStore() {
        try {
            var reviewManager: ReviewManager = ReviewManagerFactory.create(applicationContext)
            val manager: com.google.android.gms.tasks.Task<ReviewInfo> =
                reviewManager.requestReviewFlow()
            manager.addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    try {
                        var reviewInfo = task.result
                        run {
                            val flow: com.google.android.gms.tasks.Task<Void> =
                                reviewManager.launchReviewFlow(this, reviewInfo)
                            flow.addOnCompleteListener { task1 -> }
                            flow.addOnFailureListener { e -> }
                        }
                    } catch (ignore: Exception) {
                    }
                }
            }

        } catch (ignore: Exception) {
        }
    }


    private fun isSingleClickHandle(): Boolean {
        val currentTime = SystemClock.elapsedRealtime()
        return currentTime - lastClickTime > coolDownSeconds * 1000
    }

}
