package com.intellihealth.truemeds.presentation.activity

import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.SystemClock
import android.view.View
import android.widget.RatingBar
import androidx.activity.OnBackPressedCallback
import androidx.core.content.ContextCompat
import androidx.core.os.bundleOf
import androidx.lifecycle.ViewModelProvider
import com.google.gson.JsonObject
import com.intellihealth.salt.callbacks.BackArrowClickCallback
import com.intellihealth.salt.callbacks.ButtonClickCallback
import com.intellihealth.salt.callbacks.DeliveryHistoryAccordionCallback
import com.intellihealth.salt.callbacks.DoctorCallCardCallback
import com.intellihealth.salt.callbacks.OrderPersonalDetailsCallback
import com.intellihealth.salt.callbacks.OrderedItemCallback
import com.intellihealth.salt.models.BillDetailsModel
import com.intellihealth.salt.models.MobileSectionHeadersModel
import com.intellihealth.salt.models.OrderPersonalDetailsModel
import com.intellihealth.salt.models.ProductInfoModel
import com.intellihealth.salt.views.Toast
import com.intellihealth.truemeds.databinding.ActivityNonActiveOrderStatusBinding
import com.intellihealth.truemeds.domain.navigation.navigateToHelpActivity
import com.intellihealth.truemeds.domain.navigation.navigateToHomePageActivity
import com.intellihealth.truemeds.domain.navigation.navigateToOrderSummaryActivity
import com.intellihealth.truemeds.domain.navigation.navigateToWebBrowser
import com.intellihealth.truemeds.presentation.bottomsheet.cart.ViewPrescriptionBottomSheet
import com.intellihealth.truemeds.presentation.bottomsheet.orderstatus.ContactDetailsCollectionBottomSheet
import com.intellihealth.truemeds.presentation.bottomsheet.orderstatus.ModificationItemBottomSheet
import com.intellihealth.truemeds.presentation.bottomsheet.productdetail.ProductDetailBottomSheet
import com.intellihealth.truemeds.presentation.callbacks.ViewPrescriptionCallback
import com.intellihealth.truemeds.presentation.fragment.HomeFragment
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.utils.CommonFunc
import com.intellihealth.truemeds.presentation.utils.HomeSectionConstants
import com.intellihealth.truemeds.presentation.utils.viewBinding
import com.intellihealth.truemeds.presentation.viewmodel.OrderStatusViewModel
import com.intellihealth.truemeds.presentation.viewmodel.ProductDetailViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NonActiveOrderStatusActivity : BaseActivity() {

    private val binding by viewBinding(ActivityNonActiveOrderStatusBinding::inflate)
    private lateinit var viewModel: OrderStatusViewModel
    private lateinit var productDetailViewModel: ProductDetailViewModel
    private var orderId: Long = 0
    private var onFinishReCreateHomePage = false
    private var isFromCancelOrder = false
    private var lastClickTime: Long = 0
    private val coolDownSeconds = 2

    private var mLastClickTime = 0L
    private fun isSingleClick(): Boolean {
        val lastClickTime: Long = mLastClickTime
        val now = System.currentTimeMillis()
        this@NonActiveOrderStatusActivity.mLastClickTime = now
        return now - lastClickTime >= HomeFragment.MIN_DELAY_MS
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this)[OrderStatusViewModel::class.java]
        productDetailViewModel = ViewModelProvider(this)[ProductDetailViewModel::class.java]
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        supportActionBar?.hide()
        extractIntentData()
        /**
         * All setting data method
         * **/
        setData()
        eventListener()
        /**
         * All click listener and callback and observe data
         * **/
        allCallbackAndClick()
    }

    override fun extractIntentData(){
        intent.extras?.let { bundle ->
            if (bundle.containsKey(BundleConstants.ORDER_ID)) {
                orderId = bundle.getLong(BundleConstants.ORDER_ID, 0)
                viewModel.clickedOnPage = bundle.getString(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE).toString()
            }
            if (bundle.containsKey(BundleConstants.IS_FROM_CANCEL_ORDER)) {
                isFromCancelOrder = bundle.getBoolean(BundleConstants.IS_FROM_CANCEL_ORDER, false)
            }
            onFinishReCreateHomePage = bundle.getBoolean("onFinishReCreateHomePage", false)
        }
    }

    private fun setData() {
        viewModel.setOrderTrackerData(orderId, false)
        if (isFromCancelOrder) {
            Handler(Looper.getMainLooper()).postDelayed({
                navigateToHomePageActivity()
                finishAffinity()
            }, 3000)
        }
    }

    private fun eventListener() {
        viewModel.pageTitle.observe(this) {
            if (it != null) {
                binding.sectionHeader.setHeaderTitle(it)
            }
        }
        viewModel.orderPersonalMobileDetail.observe(this) {
            binding.numberDetailCard.setPersonalDetails(it)

        }
        viewModel.returnOrderUrl.observe(this) {
            navigateToWebBrowser(
                params = bundleOf(
                    "ExtUrl" to it
                )
            )
        }
        viewModel.orderPersonalAddressModel.observe(this) {
            binding.addressDetailCard.setPersonalDetails(it)
            viewModel.showShimmerLiveData.postValue(false)

        }
        viewModel.deliveryAccordionData?.observe(this) {
            if (it != null) {
                binding.tmDeliveryHistoryAccordion.setHistoryAccordionData(it)
            }
        }


        viewModel.savingCardData?.observe(this) {
            if (it != null) {
                binding.savingCards.setUpSavingCardData(it)
            } else {
                binding.savingCards.visibility = View.GONE
            }

        }

        binding.btnReorder.setOnClickListener() {
            if (isSingleClick()) {
                viewModel._isLoading.postValue(true)
                viewModel.loaderValue.postValue(true)
                val patientArray = arrayListOf<Long?>()
                viewModel.patientId.let { pId ->
                    patientArray.add(pId.value)
                }
                viewModel.getReorder(
                    orderId,
                    SharedPrefManager.getInstance().loggedInUserId,
                    patientArray,
                    "A",
                    true,
                    true,
                    SharedPrefManager.getInstance().srcType.toInt(),
                    true,
                    if (SharedPrefManager.getInstance().algoSpecificVariantId < 0) null else SharedPrefManager.getInstance().algoSpecificVariantId
                )
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
                       // paymentModeValue = it.responseData.paymentMode
                                paymentModeValue = it.responseData.paymentSelectionInfo?.paymentMethod
                    )
                    binding.billDetails.setUpBillDetailsData(pharmacistPaymentModeOffData, 1)
                }
            }
        }
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
                if (finaLRating > 0) {
                    val jsonObject = JsonObject()
                    jsonObject.addProperty(
                        "customerId",
                        SharedPrefManager.getInstance().loggedInUserId
                    )
                    jsonObject.addProperty("doctorId", viewModel.doctorId.value)
                    jsonObject.addProperty("orderId", orderId)
                    jsonObject.addProperty("rating", finaLRating)
                    jsonObject.addProperty("comments", "")
                    viewModel.submitDoctorRating(jsonObject, orderId)
                }
            }

        })
        binding.tmDeliveryHistoryAccordion.setCallback(object : DeliveryHistoryAccordionCallback {
            override fun viewClickCallback() {
                viewModel.generateReturnUrlApiCall(orderId)
            }

        })
        val loader = Dialog(this@NonActiveOrderStatusActivity)
        viewModel.isLoading.observe(this@NonActiveOrderStatusActivity) {
            if (it) enableLoadingView(loader)
            else disableLoadingView(loader)
        }

        viewModel.doctorRating.observe(this) {
            if (it != null) {
                if (it.statusCode == 200) {
                    viewModel.setOrderTrackerData(orderId, true)
                } else {
                    CommonFunc.openErrorDialog(this, it?.message ?: "")
                }
            }
        }
    }

    private fun allCallbackAndClick() {
        viewModel.eventLaunchOrderSummary.observe(this) {
            viewModel.loaderValue.postValue(false)
            viewModel._isLoading.postValue(false)
            navigateToOrderSummaryActivity(
                params = bundleOf(
                    "isOrderSummary" to true,
                    BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "my_orders",
                    BundleConstants.BUNDLE_KEY_ORDER_PAGE_SECTION to "order_details",
                    BundleConstants.BUNDLE_KEY_ORDER_IS_DELIVERED_OR_CANCELLED to if (viewModel.orderStatusTitle.value?.contains("cancelled",true) == true) "cancelled" else "delivered",
                    BundleConstants.BUNDLE_KEY_REORDER_BUTTON_CLICKED to BundleConstants.BUNDLE_KEY_REORDER_BUTTON_CLICKED
                ),
                flags= listOf(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
            )
        }

        binding.orderedItemCard.setCallBack(object : OrderedItemCallback {
            override fun onViewOriginalCallback(product: ProductInfoModel) {
                val productDetailsBottomSheet =
                    ProductDetailBottomSheet(product.product.switchBackProductCode ?: "",clickedOnPage="Order Details",
                        pageSection = "main",isHideToolbar = true)
                productDetailsBottomSheet.dataFromOrderStatus(false)
                productDetailsBottomSheet.isCancelable = true
                if (!productDetailsBottomSheet.isVisible && isSingleClickHandle()) supportFragmentManager.let {
                    productDetailsBottomSheet.show(
                        it, "ProductDetailBottomsheet"
                    )
                    lastClickTime = SystemClock.elapsedRealtime()
                }
            }

            override fun onViewChangesCallback() {
                val modificationItemBottomSheet = ModificationItemBottomSheet(viewModel)
                (viewModel.detailedTimeLineDataList.value)
                modificationItemBottomSheet.isCancelable = true
                if (!modificationItemBottomSheet.isVisible)
                    modificationItemBottomSheet.show(
                        supportFragmentManager, "ModificationItemBottomSheet"
                    )
            }

            override fun onCardCallback(product: ProductInfoModel) {
                val productDetailsBottomSheet =
                    ProductDetailBottomSheet(product.product.productCode ?: "",clickedOnPage="Order Details",
                        pageSection = "main",isHideToolbar = true)
                productDetailsBottomSheet.dataFromOrderStatus(false)
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
                /*Toast().showCustomToastMessage(
                    this@NonActiveOrderStatusActivity,
                    "onSubstituteCallback clicked"
                )*/
            }

        })

        val prescriptionCallback = object : ViewPrescriptionCallback {
            override fun onDeleteImage(imageId: Long) {
                TODO("Not yet implemented")
            }

            override fun onViewPrescriptionClicked(position: Int, imageURL: String) {
                val bottomSheet =
                    viewModel.prescriptionList.value?.let {
                        ViewPrescriptionBottomSheet(
                            position,
                            it, HomeSectionConstants.VIEW_PRESCRIPTION
                        )
                    }
                bottomSheet?.isCancelable = true
                if (!bottomSheet?.isVisible!!)
                    bottomSheet?.show(supportFragmentManager, "ViewPrescriptionBottomSheet")
            }

            override fun onAddMoreClicked() {
                TODO("Not yet implemented")
            }

        }


        binding.sectionHeader.setUpMobileSectionHeadersData(
            MobileSectionHeadersModel(
                "", "Sub-Header", "", "Help", 0,
                buttonIconRight = ContextCompat.getDrawable(
                    this,
                    com.intellihealth.salt.R.drawable.ic_help_symbol
                )
            )
        )
        val callback = object : OrderPersonalDetailsCallback {
            override fun onAddAlternateEmailClick(personalDetails: OrderPersonalDetailsModel) {

            }

            override fun onAddAlternateNumberClick(personalDetails: OrderPersonalDetailsModel) {
                val alternateNumberBottomSheet =
                    ContactDetailsCollectionBottomSheet(viewModel, orderId,"")
                alternateNumberBottomSheet.isCancelable = true
                if (!alternateNumberBottomSheet.isVisible)
                    alternateNumberBottomSheet.show(
                        supportFragmentManager, "AlternateNumberBottomSheet"
                    )

            }

            override fun onEditAlternateNumberClick(personalDetails: OrderPersonalDetailsModel) {
                val alternateNumberBottomSheet =
                    ContactDetailsCollectionBottomSheet(
                        viewModel,
                        orderId,
                        personalDetails.alternatePhoneNumber ?: ""
                    )
                alternateNumberBottomSheet.isCancelable = true
                if (!alternateNumberBottomSheet.isVisible)
                    alternateNumberBottomSheet.show(
                        supportFragmentManager, "AlternateNumberBottomSheet"
                    )

            }

            override fun onCallUsClick(personalDetails: OrderPersonalDetailsModel) {
                Toast().showCustomToastMessage(
                    this@NonActiveOrderStatusActivity,
                    "clicked onCallUsClick"
                )
            }

            override fun onModifyOrderClick(personalDetails: OrderPersonalDetailsModel) {
                Toast().showCustomToastMessage(
                    this@NonActiveOrderStatusActivity,
                    "clicked onModifyOrderClick"
                )
            }

            override fun onCancelOrderClick(personalDetails: OrderPersonalDetailsModel) {
                Toast().showCustomToastMessage(
                    this@NonActiveOrderStatusActivity,
                    "clicked onCancelOrderClick"
                )
            }

        }
        binding.sectionHeader.setBackArrowClickCallback(object :
            BackArrowClickCallback {
            override fun onBackArrowClick() {
                onBackPressActon()
            }
        })

        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                onBackPressActon()
            }
        })

        binding.sectionHeader.setButtonClickCallback(object :
            ButtonClickCallback {
            override fun buttonClick() {
                navigateToHelpActivity()
            }

            override fun buttonClickWithParams(buttonType: String) {
                TODO("Not yet implemented")
            }
        })

        binding.orderedItemCard.hideViewChanges(false)
        binding.addressDetailCard.setCallBack(callback)
        binding.numberDetailCard.setCallBack(callback)
        binding.callback = prescriptionCallback

        binding.nestedScrollView.viewTreeObserver.addOnScrollChangedListener {
                binding.billDetails.dismissTooltips()
            }

    }

    private fun onBackPressActon() {
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

    private fun isSingleClickHandle(): Boolean {
        val currentTime = SystemClock.elapsedRealtime()
        return currentTime - lastClickTime > coolDownSeconds * 1000
    }

}