package com.intellihealth.truemeds.presentation.activity

import android.animation.ObjectAnimator
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.View
import android.view.WindowManager
import android.widget.PopupWindow
import androidx.activity.OnBackPressedCallback
import androidx.core.content.ContextCompat
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.bumptech.glide.Glide
import com.google.common.reflect.TypeToken
import com.google.gson.Gson
import com.intellihealth.salt.callbacks.BackArrowClickCallback
import com.intellihealth.salt.callbacks.FaqCallBack
import com.intellihealth.salt.models.BillDetailsModel
import com.intellihealth.salt.models.FaqModel
import com.intellihealth.salt.models.MobileSectionHeadersModel
import com.intellihealth.salt.models.StickyNonStickyNotificationModel
import com.intellihealth.salt.views.Toast
import com.intellihealth.salt.views.tooltip.DefaultExpandedTooltip
import com.intellihealth.salt.views.tooltip.MultiColumnTooltip
import com.intellihealth.salt.views.tooltip.PaymentTooltip
import com.intellihealth.salt.views.tooltip.ToolTypeType
import com.intellihealth.salt.views.tooltip.TooltipBuilder
import com.intellihealth.truemeds.BuildConfig
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.mixpanel.MxViewBillClicked
import com.intellihealth.truemeds.data.model.orderflow.OrderRxInfo
import com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse
import com.intellihealth.truemeds.data.utils.PopUpType
import com.intellihealth.truemeds.databinding.ActivityPaymentOptionBinding
import com.intellihealth.truemeds.domain.enums.Coupon
import com.intellihealth.truemeds.domain.navigation.navigateToOrderStatusActivity
import com.intellihealth.truemeds.domain.navigation.navigateToPaymentActivity
import com.intellihealth.truemeds.mvvm.viewmodel.CountDownTimerViewModel
import com.intellihealth.truemeds.presentation.bottomsheet.PaymentChangeSelectionBottomSheet
import com.intellihealth.truemeds.presentation.bottomsheet.PaymentUnsuccessfulBottomsheet
import com.intellihealth.truemeds.presentation.bottomsheet.ViewBillDetailsBottomSheet
import com.intellihealth.truemeds.presentation.callbacks.PopUpDialogCallback
import com.intellihealth.truemeds.presentation.model.ProductInfoModel
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.utils.ClassNameConstants
import com.intellihealth.truemeds.presentation.utils.CommonFunc
import com.intellihealth.truemeds.presentation.utils.viewBinding
import com.intellihealth.truemeds.presentation.viewmodel.PaymentOptionsViewModel
import com.intellihealth.truemeds.presentation.viewmodel.events.EventObserver
import com.userexperior.UserExperior
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.lang.reflect.Type
import java.util.Objects


@AndroidEntryPoint
class PaymentOptionActivity : BaseActivity() {

    private val binding by viewBinding(ActivityPaymentOptionBinding::inflate)
    private lateinit var context: Context
    private lateinit var clickedOnPage: String
    private val viewModel by lazy { ViewModelProvider(this)[PaymentOptionsViewModel::class.java] }
    var paymentChangePaymentSelection: PaymentChangeSelectionBottomSheet? = null
    private var addCOD: Boolean = false
    private var lastSelectedPaymentMethod: String = ""
    private var lastSelectedPaymentMethodId: Long = 0L
    private var appliedCouponCode: String = ""
    private var isPaymentSpecificCoupon: Boolean = false
    private var millis = 0L
    lateinit var ftcViewModel: CountDownTimerViewModel


    /**
     * 1) Setup binding and viewmodel
     * 2) Set viewmodel as lifecycle observer of the activity
     * 3) Update status bar color
     * 5) Get data from intent
     * 5) Fetch icon master from API
     * 6) Set up view
     * 7) Set click listeners
     * */
    override fun extractIntentData(){

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        context = this
        // 1) Setup binding and viewmodel
        setContentView(binding.root)
        binding.viewModel = viewModel
        ftcViewModel = ViewModelProvider(this)[CountDownTimerViewModel::class.java]
        // 2) Set viewmodel as lifecycle observer of the activity
        binding.lifecycleOwner = this
        //lifecycle.addObserver(viewModel)
        // 3) Update status bar color
        updateStatusBarColor()
        // 4) Get data from intent
        getIntentDataAndProcess()
        // 5) Fetch icon master from API
        fetchIconMaster()
        // 6) Set up view
        setUpView()
        //7) Set click listeners, event listeners, viewmodel observers
        setEventListener()
        setupBackPressedAction()

        viewModel.eventShowInternalServerError.observe(this) { message ->
            if (message.isNotEmpty()) {
                showDialogBox(PopUpType.API_FAILURE, object : PopUpDialogCallback {
                    override fun onActionButtonClicked() {
                        finish()
                    }

                    override fun onCloseButtonClicked() {
                        finish()
                    }
                }, false, "Internal Server Error", message)
            }
        }
    }

    /*fun updateStatusBarColor() {
        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                window.decorView.systemUiVisibility =
                    View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR //  set status text dark
                window.statusBarColor =
                    ContextCompat.getColor(this, R.color.white) // set status background white
            }
        } catch (ignore: java.lang.Exception) {
        }
    }*/

    private fun setUpView() {
        Glide.with(context).asGif().load(R.drawable.order_being_placed_final)
            .into(binding.ivOrderIsBeingPlaced)

        binding.tmMobileSectionHeader.setUpMobileSectionHeadersData(
            MobileSectionHeadersModel(
                context.getString(R.string.payment_option),
                if (viewModel.billDetails.estimatedPayableValue!=null && viewModel.billDetails.estimatedPayableValue!! > 0 ) "" else if (viewModel.onlyPrescription) "" else context.getString(
                    R.string.price_range_text
                ),
                "", "", 0, null
            )
        )

        if (viewModel.currentOrderStatusId == 59 || viewModel.currentOrderStatusId == 58 ||
            viewModel.currentOrderStatusId == 66 || viewModel.currentOrderStatusId == 49
        ) {

            val toolTipPayment = PaymentTooltip(context)
            toolTipPayment.dismiss()
            val screenPos = IntArray(2)
            //TODO enable this
            /*binding.clBillDetails.getLocationOnScreen(screenPos)
            toolTipPayment.showTooltip(binding.clBillDetails, getString(R.string.amount_to_be_paid_desc), screenPos[0])*/
        }
    }

    /** Intents for PSP are get from homescreen/reorder/ordersummary/orderstatus
     * 1) get bill details model object from intent
     * 2) get payableAmountButtonText boolean from intent when there will be button with Pay and amount text
     * 3) get clickedOnPage string,lastSelectedPaymentMethod string,lastSelectedPaymentMethodId long,patientId string,
     * addCod boolean,addMoreForCod double, restrictCod boolean, orderId String,isPaymentSpecificCoupon boolean
     * appliedCouponCode String from intent
     * 4) process bill details in viewmodel received from intent
     * 5) setDataBasedOnPspVariant in viewmodel
     *
     * **/
    private fun getIntentDataAndProcess() {
        try {



            if (intent.getBooleanExtra(BundleConstants.DISPLAY_PAYMENT_UNSUCCESSFUL, false)) {
                viewModel.paymentUnsuccessful =
                    intent.getBooleanExtra(BundleConstants.DISPLAY_PAYMENT_UNSUCCESSFUL, false)
                // TODO to place bottomsheet at the center of the screen
                initUnsuccessfulBottomSheet()
                if (!UserExperior.isRecording()) {
                    Log.i("Recording","recording started")
                    UserExperior.startRecording(applicationContext, BuildConfig.userExperiorSDKKey)
                }
            }

            if (intent.getStringExtra(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE) != null || !intent.getStringExtra(
                    BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE
                ).equals("")
            ) {
                clickedOnPage = intent.getStringExtra(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE).toString()
                viewModel.clickedOnPageMutableLiveData.value = clickedOnPage
            }

            viewModel.orderTypeId = intent.getIntExtra("ORDER_TYPE_ID",0).toString()
            viewModel.orderSubsId = intent.getIntExtra(BundleConstants.BUNDLE_KEY_SUBS_ID,0).toString()
            viewModel.orderPageSection = intent.getStringExtra(BundleConstants.BUNDLE_KEY_ORDER_PAGE_SECTION)
            viewModel.orderPreviousStage = intent.getStringExtra(BundleConstants.BUNDLE_KEY_ORDER_IS_DELIVERED_OR_CANCELLED)


            addCOD = intent.getBooleanExtra(BundleConstants.BUNDLE_KEY_INCLUDE_COD, false)
            viewModel.addCOD = addCOD

            val patientId = intent.getLongExtra(BundleConstants.BUNDLE_KEY_PATIENT_ID, 0)
            viewModel.patientID = patientId.toString()

            val patientType = intent.getStringExtra(BundleConstants.BUNDLE_KEY_PATIENT_TYPE)
            viewModel.patientType = patientType.toString()
            val patientAge = intent.getStringExtra(BundleConstants.BUNDLE_KEY_PATIENT_AGE)
            viewModel.patientAge = patientAge.toString()
            val patientGender = intent.getStringExtra(BundleConstants.BUNDLE_KEY_PATIENT_GENDER)
            viewModel.patientGender = patientGender.toString()
            val cityName = intent.getStringExtra(BundleConstants.BUNDLE_KEY_SHIPPING_CITY)
            viewModel.cityName = cityName.toString()
            val stateName = intent.getStringExtra(BundleConstants.BUNDLE_KEY_SHIPPING_STATE)
            viewModel.stateName = stateName.toString()
            val pinCode = intent.getIntExtra(BundleConstants.BUNDLE_KEY_SHIPPING_PINCODE, 0)
            viewModel.pinCode = pinCode.toString()
            val addressType = intent.getStringExtra(BundleConstants.BUNDLE_KEY_ADDRESS_TYPE)
            viewModel.addressType = addressType.toString()
            val noOfItems = intent.getIntExtra(BundleConstants.BUNDLE_KEY_NO_OF_ITEMS, 0)
            viewModel.noOfItems = noOfItems
            viewModel.currentOrderStatus =
                intent.getStringExtra(BundleConstants.BUNDLE_KEY_CURRENT_ORDER_STATUS).toString()

            viewModel.currentOrderStatusId = intent.getIntExtra(BundleConstants.BUNDLE_KEY_CURRENT_ORDER_STATUS_ID, 0)

            val itemNames = intent.extras?.getStringArrayList(BundleConstants.BUNDLE_KEY_ITEM_NAMES)
            itemNames?.let {
                viewModel.itemNames = itemNames
            }
            val productIds = intent.extras?.getStringArrayList(BundleConstants.BUNDLE_KEY_PRODUCT_IDS)
            productIds?.let {
                viewModel.productIds = productIds
            }
            val isRxRequired = intent.getBooleanExtra(BundleConstants.BUNDLE_KEY_RX_REQUIRED, false)
            viewModel.isRxRequired = isRxRequired

            val isOtcAdded = intent.getBooleanExtra(BundleConstants.BUNDLE_KEY_IS_OTC_ADDED, false)
            viewModel.isOtcAdded = isOtcAdded

            val isChronicAdded =
                intent.getBooleanExtra(BundleConstants.BUNDLE_KEY_IS_CHRONIC_ADDED, false)
            viewModel.isChronicAdded = isChronicAdded

            val isGenericAdded =
                intent.getBooleanExtra(BundleConstants.BUNDLE_KEY_IS_GENERIC_ADDED, false)
            viewModel.isGenericAdded = isGenericAdded

            val totalOutOfStockCount =
                intent.getIntExtra(BundleConstants.BUNDLE_KEY_TOTAL_OUT_OF_STOCK_COUNT, 0)
            viewModel.totalOutOfStockCount = totalOutOfStockCount

            val prescriptionUploadedCount =
                intent.getIntExtra(BundleConstants.BUNDLE_KEY_ONLY_PRESCRIPTION_UPLOADED_COUNT, 0)
            viewModel.prescUploadedCount = prescriptionUploadedCount

            viewModel.trackPurchaseEvents =
                intent.getStringExtra(BundleConstants.BUNDLE_KEY_TRACK_PURCHASE_EVENTS).toString()

            lastSelectedPaymentMethod =
                intent.getStringExtra(BundleConstants.BUNDLE_KEY_LAST_SELECTED_PAYMENT_METHOD)
                    .toString()
            viewModel.lastPaymentMethodSelectedMutableLiveData.value = lastSelectedPaymentMethod

            lastSelectedPaymentMethodId =
                intent.getLongExtra(BundleConstants.BUNDLE_KEY_LAST_SELECTED_PAYMENT_METHOD_ID, 0L)
            viewModel.lastPaymentMethodSelectedIdMutableLiveData.value = lastSelectedPaymentMethodId

            if (intent.extras?.containsKey(BundleConstants.BUNDLE_KEY_BILL_DETAIL)!! && intent.extras?.getString(
                    BundleConstants.BUNDLE_KEY_BILL_DETAIL
                ) != null
            ) {
                viewModel.billDetails = Gson().fromJson(
                    intent.extras?.getString(BundleConstants.BUNDLE_KEY_BILL_DETAIL),
                    BillDetailsModel::class.java
                )
                
                viewModel.cartBillDetails.postValue(Gson().fromJson(
                    intent.extras?.getString(BundleConstants.BUNDLE_KEY_BILL_DETAIL),
                    BillDetailsModel::class.java
                ))
            }

            if (intent.getStringExtra(BundleConstants.BUNDLE_KEY_PAGE_SECTION) != null) {
                viewModel.pageSection =
                    intent.getStringExtra(BundleConstants.BUNDLE_KEY_PAGE_SECTION).toString()
            } else {
                viewModel.pageSection = "main"
            }

            viewModel.sellingPrice = intent.getDoubleExtra(BundleConstants.BUNDLE_KEY_SELLING_PRICE, 0.0)
            // TODO
            /*if (intent.hasExtra(BundleConstants.BUNDLE_KEY_ITEM_ADDED)
                && intent.getStringExtra(BundleConstants.BUNDLE_KEY_ITEM_ADDED) != null) {
                viewModel.mxItemsPlaced =
                    Gson().fromJson(
                        intent.getStringExtra(BundleConstants.BUNDLE_KEY_ITEM_ADDED),
                        object : TypeToken<List<MXItemOrderPlaced?>?>() {}.type
                    )
            }*/

            viewModel.addMoreForCod =
                intent.getDoubleExtra(BundleConstants.BUNDLE_KEY_ADD_MORE_FOR_COD, 0.0)
            viewModel.paymentRestrictedType =
                intent.getIntExtra(BundleConstants.BUNDLE_KEY_PAYMENT_RESTRICTED_TYPE, 0)
            viewModel.restrictCod =
                intent.getBooleanExtra(BundleConstants.BUNDLE_KEY_RESTRICT_COD, false)
            viewModel.onlyPrescription =
                intent.getBooleanExtra(BundleConstants.BUNDLE_KEY_ONLY_PRESCRIPTION, false)

            viewModel.isReorder =
                intent.getBooleanExtra(BundleConstants.BUNDLE_KEY_IS_REORDER, false)
            Log.i(
                "bundle key payable",
                "" + intent.getBooleanExtra(BundleConstants.BUNDLE_KEY_PAYABLE_AMOUNT_TEXT, false)
            )
            viewModel.payableAmountButtonText =
                intent.getBooleanExtra(BundleConstants.BUNDLE_KEY_PAYABLE_AMOUNT_TEXT, false)

            viewModel.orderId =
                intent.getStringExtra(BundleConstants.BUNDLE_KEY_ORDER_ID)?.toLong() ?: 0
            Log.i("::::orderId",""+intent.getStringExtra(BundleConstants.BUNDLE_KEY_ORDER_ID))
            isPaymentSpecificCoupon =
                intent.getBooleanExtra(BundleConstants.BUNDLE_KEY_IS_PAYMENT_SPECIFIC_COUPON, false)
            viewModel.isPaymentSpecificCoupon = isPaymentSpecificCoupon
            if (clickedOnPage == BundleConstants.ORDER_SUMMARY || clickedOnPage == BundleConstants.REORDER) {
                SharedPrefManager.getInstance().couponModel?.let {
                    appliedCouponCode = SharedPrefManager.getInstance().couponModel.promoCode!!
                    viewModel.appliedCouponCode.value = appliedCouponCode
                }
            } else {
                appliedCouponCode =
                    intent.getStringExtra(BundleConstants.BUNDLE_KEY_COUPON_APPLIED_NAME).toString()
                Log.i("appliedCouponCode",appliedCouponCode)
                viewModel.appliedCouponCode.value = appliedCouponCode
            }

            val json = intent.getStringExtra(BundleConstants.BUNDLE_KEY_ADDED_CART)
            val type: Type = object : TypeToken<MutableList<ProductInfoModel?>?>() {}.type
            if(json!=null){
            viewModel.apiMedicineList = Gson().fromJson<MutableList<ProductInfoModel>>(json, type)
            }
            val jsonResponse = intent.getStringExtra(BundleConstants.BUNDLE_KEY_ADDED_CART_RESPONSE)
            val typeResponse: Type = object : TypeToken<List<ProductInfoModel?>?>() {}.type
            if(jsonResponse!=null) {
                viewModel.cartMedicineListResponse =
                    Gson().fromJson<List<ProductInfoModel>>(jsonResponse, typeResponse)
            }

            val jsonRx = intent.getStringExtra(BundleConstants.BUNDLE_KEY_ADDED_RX)
            val typeRx: Type = object : TypeToken<List<OrderRxInfo?>?>() {}.type
            if(jsonRx!=null) {
                viewModel.prescriptions = Gson().fromJson<List<OrderRxInfo>>(jsonRx, typeRx)
            }
            viewModel.processBillDetails()
            viewModel.setDataBasedOnPspVariant()



        } catch (ex: Exception) {
            ex.printStackTrace()
            Log.i("getIntentData", ex.toString())
        }

        viewModel.getCustomerOrderDetails(
            SharedPrefManager.getInstance().incompleteOrderId,
            SharedPrefManager.getInstance().loggedInUserId,
            false,
            ClassNameConstants.ORDER_SUMMARY_ACTIVITY,
            false
        )

    }

    private fun fetchIconMaster() {
        // addCOD needs to be get from intent data on failure of payment

        lifecycleScope.launch {
            val result1 = async { viewModel.setPSPViewedByCustomer() }
            result1.await()
            val result2 = async { viewModel.fetchPaymentMethods(addCOD) }
            result2.await()
            val result3 = async { viewModel.sendPspViewedEvent() }
            result3.await()
        }

    }

    /**
     * 1) handle onBackPress
     * 2) btnTryAgain event for confirmOrderLoader
     * 3) Network Error Dialog event
     * 4) launch bill details bottomsheet event
     * 5) launch payment method change bottomsheet event
     * 6) Update FTC coupon UI, visibility for timer event
     * 7) Show and Hid Confirm order progress bar event
     * 8) On changeToCOD API call success event
     * 9) View More Button event
     * 10) Go to Payment Activity(Cashfree) event
     * **/

    private fun setEventListener() {
        //val toolTip = DefaultExpandedTooltip(context)

        binding.tmMobileSectionHeader.setBackArrowClickCallback(object :
            BackArrowClickCallback {
            override fun onBackArrowClick() {
                handleBackPress()
            }
        })

        viewModel.showShimmerPaymentMethodsLiveData.observe(this) {
            if (it) {
                binding.shimmerViewContainer.startShimmerAnimation()
            } else {
                binding.shimmerViewContainer.stopShimmerAnimation()
            }
        }

        viewModel.launchOrderIsBeingPlaced.observe(this) {
            if (it) {
                // viewModel.setMainDataView.value = false
                //  viewModel.orderPlacedView.value = false
                viewModel.orderIsBeingPlacedView.value = true
            }
        }
        viewModel.launchOrderIsBeingPlacedCaseFailed.observe(this) {
            if (it) {
                viewModel.orderIsBeingPlacedView.value = false
                // viewModel.setMainDataView.value = true
                // viewModel.orderPlacedView.value = true
            }
        }



        binding.imgInfoCircle.setOnClickListener {

            val screenPos = IntArray(2)
            it.getLocationOnScreen(screenPos)
            val metrics = context.resources.displayMetrics
            val screenWidth = metrics.widthPixels
            /*toolTip.isFocusable = true
            toolTip.showTooltip(
                it,
                "",
                getString(R.string.tooltip_estimated_payable_message),
                showIconTop = true,
                screenPos[0],
                screenWidth,
                0,
                true
            )
            dismissToolTip(toolTip)*/

            TooltipBuilder()
                .with(it.context)
                .setHeading("")
                .setBody(getString(R.string.tooltip_estimated_payable_message))
                .setShowIconTop(false)
                .setHorizontalOffset(screenPos[0])
                .setAnchorView(it)
                .setScreenWidth(screenWidth)
                .setFocusable(true)
                .setType(ToolTypeType.DEFAULT)
                .show()


        }

        viewModel.eventOpenBillDetailsBs.observe(this, EventObserver {
            it?.let { data ->
                showBillDetailsBottomSheet(data)
            }
        })

        viewModel.eventOpenPaymentMethodChangePopup.observe(this, EventObserver {
            if (it != null) {
                initPaymentChangePaymentSelection(it.first, it.second)
            }
        })

        viewModel.eventButtonViewMoreClicked.observe(this, EventObserver<Any> {
            try {
                val expanded = viewModel.viewExpandedMutableLiveData.value!!
                val list: List<PaymentMethodResponse.ResponseData> =
                    viewModel.totalPaymentOptionsList
                Log.i("totalpaymentlist", "" + viewModel.totalPaymentOptionsList)
                Log.i("visibleList", "" + viewModel.paymentOptionsVisibleMutableLiveData.value)
                if (list != null) {
                    if (expanded) {
                        if (viewModel.paymentOptionsVisibleMutableLiveData.value?.get(0)?.paymentCategory == BundleConstants.PAYMENT_DEFAULT_OPTION &&
                            viewModel.paymentOptionsVisibleMutableLiveData.value?.get(0)?.paymentOptions?.get(
                                0
                            )?.isPaymentMethodSelected == true
                        ) {
                            viewModel.paymentOptionsVisibleMutableLiveData.value = (
                                    list.subList(
                                        0,
                                        1
                                    )
                                    )
                        } else {
                            viewModel.paymentOptionsVisibleMutableLiveData.value = (
                                    list.subList(
                                        0,
                                        2
                                    )
                                    )
                        }
                        if (Objects.requireNonNull<List<PaymentMethodResponse.ResponseData>>(
                                viewModel.paymentOptionsVisibleMutableLiveData.value
                            ).size > 2
                        ) {
                            viewModel.viewOtherPaymentOptions.postValue(getString(R.string.show_other_payment_options))
                            viewModel.viewExpandedMutableLiveData.value = false
                        }
                    } else {

                        viewModel.paymentOptionsVisibleMutableLiveData.value = (list)
                        viewModel.viewOtherPaymentOptions.postValue("View Less")
                        viewModel.viewExpandedMutableLiveData.value = true
                        Log.i("visibleListinside",""+viewModel.paymentOptionsVisibleMutableLiveData.value)
                    }
                    viewModel.viewExpandedMutableLiveData.postValue(!expanded)
                }
            } catch (ignore: Exception) {
            }
        })

        viewModel.eventUpdateFtcCouponUi.observe(this, EventObserver<Boolean> { `object`: Boolean ->

            Handler(Looper.getMainLooper()).post {
                if (!SharedPrefManager.getInstance().isFtc) {
                    binding.tmStickyNotificationCouponApplied.visibility = View.GONE
                    return@post
                }
                if (SharedPrefManager.getInstance()?.couponModel?.showFtcCounter != null && SharedPrefManager.getInstance()?.couponModel?.showFtcCounter == true) {
                    if (SharedPrefManager.getInstance()?.couponModel?.expiryDate!! - System.currentTimeMillis() > 0L) {
                        viewModel.stopCouponTimer()
                        viewModel.startTimer(Coupon.ENDS_IN.prefix, SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime ?: 0L) { time ->
                            runOnUiThread {
                                setCountDownTimerData(time)
                            }
                        }
                    } else {
                        viewModel.stopCouponTimer()
                        setCountDownTimerData("")
                    }
                } else {
                    viewModel.stopCouponTimer()
                    setCountDownTimerData("")
                }
                /*if (SharedPrefManager.getInstance().couponModel!=null
                ){
                    millis = DateUtils.convertEpochTimeStampToDateMillis(
                        SharedPrefManager.getInstance().couponModel.expiryDate!!,
                        //SharedPrefManager.getInstance().couponModel.currentDate!!
                        System.currentTimeMillis()
                    )
                    if (millis > 0 && SharedPrefManager.getInstance().couponModel.showFtcCounter!!) {
                        initFtcCountDownTimer(millis, `object`)
                    } else {
                        binding.tmStickyNotificationCouponApplied.visibility = View.GONE
                    }
                }else{
                    setCountDownTimerData("")
                }

                 */

            }
        })

        viewModel.faqLoaded.observe(this) {
            if (it) {
                binding.faqList.setUpData(
                    FaqModel(
                        viewModel.tmListDataHeader.value!!,
                        viewModel.tmListDataChildMap.value!!
                    )
                )
            }
        }

        binding.faqList.setEventListner(object : FaqCallBack {
            override fun viewClickCallback(position: Int) {
                binding.scrollView.postDelayed({
                    binding.scrollView.smoothScrollTo(
                        0,
                        binding.scrollView.bottom
                    )
                }, 50)
            }

        })
        viewModel.goToPaymentActivityEvent.observe(this,EventObserver{
            viewModel.sendPaymentPageVisitedEventToMixpanel("psp",viewModel.pageSection)
          /*  val intent = Intent(this@PaymentOptionActivity, PaymentActivity::class.java)
            intent.putExtra("orderId", viewModel.orderId)
            intent.putExtra(BundleConstants.BUNDLE_KEY_BILL_DETAIL, Gson().toJson(viewModel.cartBillDetails.value))
            intent.putExtra("paymentMethod", CommonFunc.getPaymentMethodForCashfree(viewModel.lastPaymentMethodSelectedMutableLiveData.value))
            intent.putExtra("paymentMethodId", viewModel.lastPaymentMethodSelectedIdMutableLiveData.value)
            intent.putExtra("estimatedPayableValue", viewModel.estimatedPayableValueMutableLiveData.value)
            intent.putExtra(BundleConstants.BUNDLE_KEY_IS_REORDER,viewModel.isReorder)
            intent.putExtra(BundleConstants.CURRENT_ORDER_STATUS,viewModel.currentOrderStatus)
            *//*intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK*//*
            startActivity(intent)*/


            navigateToPaymentActivity(
                params = bundleOf(
                    "orderId" to viewModel.orderId,
                    BundleConstants.BUNDLE_KEY_BILL_DETAIL to Gson().toJson(viewModel.cartBillDetails.value),
                    "paymentMethod" to CommonFunc.getPaymentMethodForCashfree(viewModel.lastPaymentMethodSelectedMutableLiveData.value),
                    "paymentMethodId" to viewModel.lastPaymentMethodSelectedIdMutableLiveData.value,
                    "estimatedPayableValue" to viewModel.estimatedPayableValueMutableLiveData.value,
                    BundleConstants.BUNDLE_KEY_IS_REORDER to viewModel.isReorder,
                    BundleConstants.CURRENT_ORDER_STATUS to viewModel.currentOrderStatus
                ),

            )

            finish()
            //finishAffinity()
        })

        viewModel.eventLaunchOrderStatus.observe(this, EventObserver {
            it?.let {
                viewModel.isbackbuttonEnabled=false
                viewModel.setMainDataView.value = false
                viewModel.orderIsBeingPlacedView.value = false
               /*   viewModel.setMainDataView.value = false
                viewModel.orderPlacedView.value = false*/

              //  viewModel.orderIsBeingPlacedView.value = true


                lifecycleScope.launch {
                    viewModel.orderIsBeingPlacedView.value = false
                    viewModel.orderPlacedView.value = true


                    with(binding.lottieView){
                        setAnimation("orderplacedsuccessfully.json")
                        repeatCount = 0
                        playAnimation()
                    }

                        delay(1400)

                        var distanceToTop: Float = -300f// Negative value to move upwards - default value
                        if(binding.lottieView.getY()>0)
                        {
                            distanceToTop= -binding.lottieView.getY() // Negative value to move upwards - caculated
                        }
                        Log.e("negative_dis::",":::::"+distanceToTop)


                        ObjectAnimator.ofFloat(binding.tvOrderPlaced, "translationY", distanceToTop).apply {
                            duration = 900
                            binding.tvOrderPlaced.visibility=View.VISIBLE
                            start()
                        }
                    delay(3000)
                    navigateToOrderStatusActivity(
                        params = bundleOf(
                            BundleConstants.ORDER_ID to viewModel.orderId,
                            BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "psp",
                            "onFinishReCreateHomePage" to true,
                        ),
                        isFlagAdded = true
                    )
                    finishAffinity()
//                  //finish()
                }
            }
        })

        viewModel.changeToCodEventLiveData.observe(this,EventObserver{
            it?.let{
                if(it.first as Boolean){
                    handleBackPress()
                    //viewModel.sendEventChangeToCod()
                }else if(it.first as Boolean == false){
                    Toast().showCustomToastMessage(this@PaymentOptionActivity,it.second.toString())
                }
            }
        })

        viewModel.showLoader.observe(this) {
            if (it) {
                window.setFlags(
                    WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE,
                    WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE
                )
            } else {
                window.clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
            }
        }

    }

    private fun initFtcCountDownTimer(millis: Long, ftcApiCalled: Boolean) {
        if (ftcViewModel.getCountDownTimerInstance() == null) {
            ftcViewModel.ftcTimeRemainingString.observe(this, Observer<String> { str: String ->
                viewModel.ftcCounterTime.value = str
                setCountDownTimerData(viewModel.ftcCounterTime.value!!)
                Log.e("SRP", "initFtcCountDownTimer: $str")
                if (str.isNotEmpty() && binding.tmStickyNotificationCouponApplied.visibility === View.GONE) {

                    if (SharedPrefManager.getInstance().couponModel.promoCode != null &&
                        SharedPrefManager.getInstance().couponModel.showFtcCounter!!
                    ) {
                        binding.tmStickyNotificationCouponApplied.visibility = View.VISIBLE
                    } else {
                        ftcViewModel.stop()
                    }
                }
            })
            ftcViewModel.start(millis)
        }
    }

    private fun setCountDownTimerData(millis: String) {
        val data = StickyNonStickyNotificationModel(
            message = "$appliedCouponCode applied",
            amount = 0.0,
            subTitle = "",
            timer = if(millis.isEmpty()) "" else millis,
            buttonText = "",
            drawableLeft = ContextCompat.getDrawable(
                application,
                R.drawable.ic_purple_tick
            ),
            buttonIcon = ContextCompat.getDrawable(
                context,
                R.drawable.ic_purple_tick,
            ),
            drawableRight = null
        )

        binding.ftcCouponAppliedData = data



        if (viewModel.appliedCouponCode.value != null &&
            !viewModel.appliedCouponCode.value.equals("null") &&
            !viewModel.appliedCouponCode.value.equals("") &&
            !viewModel.appliedCouponCode.value!!.contains("UPI") && viewModel.appliedCouponCode.value!!.startsWith("first",true)
        ) {
            Log.e("payment_option:::", "1111:::" + viewModel.appliedCouponCode.value.toString())
            if (viewModel.isPaymentSpecificCoupon)
                binding.tmStickyNotificationCouponApplied.visibility = View.GONE
            else
                binding.tmStickyNotificationCouponApplied.visibility = View.VISIBLE
        } else {
            Log.e("payment_option:::", "2222:::" + viewModel.appliedCouponCode.value.toString())

            binding.tmStickyNotificationCouponApplied.visibility = View.GONE
        }


        // ? (viewModel.isPaymentSpecificCoupon ? View.GONE : View.VISIBLE) : View.GONE


    }

    /**
     * This function is used to open CartOrderDetailsBottomSheet to show the bill details. This bottomsheet will open on click of view bill text or total amount from the top
    right side of the screen.
     * 1) Pass CartBillDetailsModel as a parameter to this function
     * 2) Create a bundle and pass the model values with key present in AppConstants.Kt Class, Refer BillDetailsConstants
     * 3) Pass the bundle as arguments to CartOrderDetailsBottomSheet
     * **/
    private fun showBillDetailsBottomSheet(model: BillDetailsModel) {

        val bundle = Bundle()
        Log.i("bill details psp",""+Gson().toJson(model))
        bundle.putString(BundleConstants.BUNDLE_TM_BILL_DETAILS_MODEL, Gson().toJson(model))
        val viewBillDetailsBottomSheet = ViewBillDetailsBottomSheet().newInstance()
        viewBillDetailsBottomSheet.arguments = bundle
        viewBillDetailsBottomSheet.isCancelable = true
        viewBillDetailsBottomSheet.show(supportFragmentManager, "ViewBillDetailsBottomSheet")
        viewModel.sendViewBillClickedEvent(MxViewBillClicked("psp", model.mxCouponAppliedAmount, model.deliveryChargesValue, model.discountValue, model.estimatedPayableValue, model.mrpValue, viewModel.orderId.toString(), model.taxesAndChargesValue, viewModel.sellingPrice,  model.tmCreditValue, model.tmRewardValue,
            null,
            if(viewModel.billDetailsResponse?.pspViewed == true) viewModel.billDetailsResponse?.cashHandlingInfo?.charge ?: 0.0 else null,
            if(viewModel.billDetailsResponse?.pspViewed == true) CommonFunc.getApplicableCashHandlingCharger(viewModel.billDetailsResponse) else null
        ))
    }

    private fun dismissToolTip(toolTipView: Any?) {
        val toolTipView: PopupWindow =
            if (toolTipView is DefaultExpandedTooltip) toolTipView else (toolTipView as MultiColumnTooltip)
        CoroutineScope(Dispatchers.Main).launch {
            delay(2000)
            toolTipView.dismiss()
        }
    }

    private fun initUnsuccessfulBottomSheet() = PaymentUnsuccessfulBottomsheet(this).also {
        it.isCancelable = true
        it.show(supportFragmentManager, "Unsuccessful_BottomSheet")
    }

    private fun initPaymentChangePaymentSelection(
        item: PaymentMethodResponse.ResponseData,
        position: Int
    ) {
        val paymentChangePaymentSelectionBottomSheet = PaymentChangeSelectionBottomSheet()
        paymentChangePaymentSelectionBottomSheet.setupData(
            item,
            position,
            viewModel,
            viewModel.appliedCouponCode.value!!,
            clickedOnPage
        )
        paymentChangePaymentSelectionBottomSheet.isCancelable = true
        paymentChangePaymentSelectionBottomSheet.show(
            supportFragmentManager,
            "Payment_Change_BottomSheet"
        )
    }

    private fun setupBackPressedAction() {
        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                if (viewModel.loaderValue.value == false && viewModel.orderIsBeingPlacedView.value == false && viewModel.orderPlacedView.value == false)
                    handleBackPress()
            }
        })
    }

    fun handleBackPress() {
        if(viewModel.isbackbuttonEnabled){
        if (clickedOnPage == BundleConstants.ORDER_STATUS) {
            Log.i("::lastPaymentMethod",lastSelectedPaymentMethod)
            viewModel.setPaymentSelectionMethod()
            if (lastSelectedPaymentMethod != null || lastSelectedPaymentMethod != "null") {
                if (lastSelectedPaymentMethod != viewModel.lastPaymentMethodSelectedMutableLiveData.value) {
                    val intent = Intent(this@PaymentOptionActivity, OrderStatusActivity::class.java)
                    intent.putExtra(
                        BundleConstants.BUNDLE_KEY_LAST_SELECTED_PAYMENT_METHOD,
                        viewModel.lastPaymentMethodSelectedMutableLiveData.value
                    )
                    intent.putExtra(
                        BundleConstants.BUNDLE_KEY_LAST_SELECTED_PAYMENT_METHOD_ID,
                        viewModel.lastPaymentMethodSelectedIdMutableLiveData.value
                    )
                    intent.putExtra(
                        BundleConstants.BUNDLE_KEY_LAST_SELECTED_PAYMENT_METHOD_URL,
                        viewModel.lastPaymentMethodSelectedIconUrlMutableLiveData.value
                    )
                    intent.putExtra(
                        BundleConstants.ORDER_ID,
                        viewModel.orderId
                    )
                    intent.putExtra(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE,"psp")
                    setResult(BundleConstants.REQUEST_CODE_PAYMENT_CHANGE, intent)
                    finish();
                } else {
                    finish()
                }
            } else {
                finish()
            }
        }else{
            /**
             * if the saved coupon applicable is cod and the selected payment type is online then remove the applied coupon &
             * if the saved coupon applicable is online and the selected payment type is cod then remove the applied coupon
             */
            SharedPrefManager.getInstance().couponModel?.let {
                if(it.applicableOn == "Online Payment" && SharedPrefManager.getInstance().selectedPaymentMethod == "Cash on delivery"){
                     viewModel.removeCoupon()
                }
                if(it.applicableOn == "Cod Payment" && SharedPrefManager.getInstance().selectedPaymentMethod != "Cash on delivery"){
                    viewModel.removeCoupon()
                }
            }
            lifecycleScope.launch {
                delay(500)
                finish()
            }
        }}
    }


    override fun onResume() {
        super.onResume()
        
    }

//    private var activityLauncher = registerForActivityResult(
//        ActivityResultContracts.StartActivityForResult()
//    ) { result: ActivityResult? ->
//        if (result?.resultCode == BundleConstants.REQUEST_CODE_PAYMENT_CHANGE) {
//            val data = result.data
//            data?.let {
//                lastSelectedPaymentMethod = data.getStringExtra(BundleConstants.BUNDLE_KEY_LAST_SELECTED_PAYMENT_METHOD).toString()
//                lastSelectedPaymentMethodId=data.getLongExtra(BundleConstants.BUNDLE_KEY_LAST_SELECTED_PAYMENT_METHOD_ID)
//            }
//
//        }
//    }

   /* private var activityLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result: ActivityResult? ->
        if (result?.resultCode == BundleConstants.REQUEST_CODE_PAYMENT_CHANGE) {
            val data = result.data
            data?.let {
                lastSelectedPaymentMethod = data.getStringExtra(BundleConstants.BUNDLE_KEY_LAST_SELECTED_PAYMENT_METHOD).toString()
                //lastSelectedPaymentMethodId=data.getLongExtra(BundleConstants.BUNDLE_KEY_LAST_SELECTED_PAYMENT_METHOD_ID)
            }

        }
    }*/

}