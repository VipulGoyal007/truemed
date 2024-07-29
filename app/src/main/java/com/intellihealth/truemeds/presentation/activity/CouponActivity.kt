package com.intellihealth.truemeds.presentation.activity

import android.app.Activity
import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.view.inputmethod.EditorInfo
import androidx.activity.OnBackPressedCallback
import androidx.core.content.ContextCompat
import androidx.fragment.app.DialogFragment
import androidx.lifecycle.ViewModelProvider
import com.google.common.reflect.TypeToken
import com.google.gson.Gson
import com.intellihealth.salt.callbacks.BackArrowClickCallback
import com.intellihealth.salt.callbacks.InputFieldCallback
import com.intellihealth.salt.constants.InputFieldConstants
import com.intellihealth.salt.models.MobileSectionHeadersModel
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse
import com.intellihealth.truemeds.data.model.coupon.CouponSaveRemoveResponse
import com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData
import com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse
import com.intellihealth.truemeds.data.model.orderflow.MedicineListDetailsSent
import com.intellihealth.truemeds.data.utils.MESSAGES
import com.intellihealth.truemeds.data.utils.PopUpManager
import com.intellihealth.truemeds.data.utils.PopUpType
import com.intellihealth.truemeds.data.utils.hideKeyboard
import com.intellihealth.truemeds.data.utils.isNetworkAvailable
import com.intellihealth.truemeds.databinding.ActivityCouponBinding
import com.intellihealth.truemeds.domain.enums.Coupon
import com.intellihealth.truemeds.domain.enums.ErrorType
import com.intellihealth.truemeds.mvvm.viewmodel.CountDownTimerViewModel
import com.intellihealth.truemeds.presentation.bottomsheet.CouponCodeOfferBottomSheet
import com.intellihealth.truemeds.presentation.callbacks.CouponBottomSheetCallback
import com.intellihealth.truemeds.presentation.callbacks.PopUpDialogCallback
import com.intellihealth.truemeds.presentation.dialog.CouponApplySuccess
import com.intellihealth.truemeds.presentation.dialog.CouponErrorPopup
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.utils.CommonFunc
import com.intellihealth.truemeds.presentation.utils.viewBinding
import com.intellihealth.truemeds.presentation.viewmodel.CouponViewModel
import com.intellihealth.truemeds.presentation.viewmodel.events.Event
import com.intellihealth.truemeds.presentation.viewmodel.events.EventObserver
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CouponActivity : BaseActivity() {
    private val binding by viewBinding(ActivityCouponBinding::inflate)
    private lateinit var viewModel: CouponViewModel
    private var applyCouponCallBack: CouponBottomSheetCallback? = null
    var couponCode = ""
    var currentCartValueD = 0.0
    var prescriptionCount = 0
    private lateinit var ftcViewModel: CountDownTimerViewModel
    private var loader: Dialog? = null

    override fun extractIntentData(){

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this)[CouponViewModel::class.java]
        ftcViewModel = ViewModelProvider(this)[CountDownTimerViewModel::class.java]
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        supportActionBar?.hide()
        if (intent.hasExtra(BundleConstants.CURRENT_CART_VALUE)) {
            currentCartValueD = intent.getDoubleExtra(BundleConstants.CURRENT_CART_VALUE, 0.0)
        }
        if (intent.hasExtra(BundleConstants.PRESCRIPTION_COUNT)) {
            prescriptionCount = intent.getIntExtra(BundleConstants.PRESCRIPTION_COUNT, 0)
        }
        binding.currentCartValue = currentCartValueD
        loader = Dialog(this)

        updateStatusBarColor()
        initViews()
        getApiData()
        clickEvent()
        setupOnBackPresses()

        viewModel.eventSendFtcCounterStarted.observe(this) {
            if (it > 0L) viewModel.sendFtcCounterStarted(it)
        }

    }

    private fun getApiData() {

        //event integration parameters value set here
        viewModel.clickedOnPageFromIntent =
            intent.getStringExtra(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE) ?: ""
        viewModel.clickedOnPage =
            intent.getStringExtra(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE).toString()
        viewModel.clickedOnPageNameForCouponEvent =
            intent.getStringExtra("clickedOnPageNameForCouponEvent").toString()
        viewModel.clickedOnPageNameForCouponApplyEvent =
            intent.getStringExtra("clickedOnPageNameForCouponApplyEvent").toString()

        viewModel.couponDiscountAmountEventValue =
            intent.getDoubleExtra("couponDiscountAmountEventValue", 0.0)


        val billDetailData = intent.getStringExtra("billDetailData")
        val gson = Gson()
        viewModel.billDetailsData =
            gson.fromJson(billDetailData, BillDetailResponse.ResponseData::class.java)


        viewModel.billDetailsData?.let { billDetailsData ->
            viewModel.couponDiscountAmountEventValue = billDetailsData.couponDiscountAmt ?: 0.0
            viewModel.deliveryChargeAmountEventValue = billDetailsData.deliveryCharge ?: 0.0
            viewModel.discountAmountEventValue = billDetailsData.discount ?: 0.0
            viewModel.estimatedPayableAmountEventValue = billDetailsData.payableAmt ?: 0.0
            viewModel.mrpTotalAmountEventValue = billDetailsData.mrp ?: 0.0
            viewModel.packagingChargesAmountEventValue = billDetailsData.packagingCharge ?: 0.0
            viewModel.tmCreditAmountEventValue = billDetailsData.tmCredit ?: 0.0
            viewModel.tmRewardAmountEventValue = billDetailsData.tmCash ?: 0.0
            viewModel.cashHandlingCharge = if(billDetailsData.pspViewed) billDetailsData.cashHandlingInfo?.charge ?: 0.0 else  null
            viewModel.cashHandlingChargeApplicable = if(billDetailsData.pspViewed) CommonFunc.getApplicableCashHandlingCharger(billDetailsData) else null

        }

        viewModel.subsIdEventValue = intent.getIntExtra(BundleConstants.BUNDLE_KEY_SUBS_ID, 0)

        val medicineListData = intent.getStringExtra("medicineListData")
        val gsonBill = Gson()
        val listType = object : TypeToken<ArrayList<MedicineListDetailsSent>>() {}.type

        // Convert JSON string back to a list
        viewModel.medicineListDataReceived.clear()
        viewModel.medicineListDataReceived = gsonBill.fromJson(medicineListData, listType)

        for (i in 0..<viewModel.medicineListDataReceived.size) {
            viewModel.itemNamesEventValue.add(
                viewModel.medicineListDataReceived[i].skuName ?: ""
            )
            viewModel.productsIdsEventValue.add(
                viewModel.medicineListDataReceived[i].productCode ?: ""
            )
        }

        if (isNetworkAvailable(this)) {
            viewModel.setCouponData()
        } else {
            showDialogBox(
                popUpType = PopUpType.INTERNET_FAILURE,
                object : PopUpDialogCallback {
                    override fun onActionButtonClicked() {
                        finish()
                    }

                    override fun onCloseButtonClicked() {
                        finish()
                    }
                }, isCancelable = false
            )
        }
    }

    private fun initViews() {
        viewModel.eventOpenErrorDialog.observe(this, EventObserver {
            if (it.equals(ErrorType.NO_NETWORK)) {
                showDialogBox(PopUpType.INTERNET_FAILURE, object : PopUpDialogCallback {
                    override fun onActionButtonClicked() {

                    }

                    override fun onCloseButtonClicked() {
                        finish()
                    }
                }, true)
            }

        })
        binding.header.setUpMobileSectionHeadersData(
            MobileSectionHeadersModel(
                this@CouponActivity.getString(R.string.coupon_header), "", "", "", 0,
                null, ContextCompat.getDrawable(applicationContext, R.drawable.ic_back_arrow)
            )
        )
        applyCouponCallBack = object : CouponBottomSheetCallback {
            override fun applyCouponButtonClick(couponCodeResponse: CouponCodeResponse.Coupon?) {
                if (SharedPrefManager.getInstance().prescriptionCount > 0 && currentCartValueD <= 0.0) {
                    //only prescription case
                    viewModel.applyCouponClick(couponCodeResponse)
                } else {
                    if (currentCartValueD >= (couponCodeResponse?.minCartValue
                            ?: 0)
                    )
                        viewModel.applyCouponClick(couponCodeResponse)
                    else {
                        viewModel.openCouponFailed.postValue(Event(couponCodeResponse))
                    }
                }
            }

            override fun removeCouponButtonClick(couponCodeResponse: CouponCodeResponse.Coupon?) {
                couponCodeResponse?.offerId?.let { offerID ->
                    viewModel.removeCoupon(couponCodeResponse)
                    viewModel.changeCouponButtonState(true, offerID)
                }
            }
        }
        viewModel.isLoadingEnabled.observe(this) { isEnabled ->
            loader?.let { loader ->
                if (isEnabled) enableLoadingView(loader)
                else disableLoadingView(loader)
            }
        }
        viewModel.setTextFieldEmpty.observe(this) { isEmpty ->

            if (isEmpty) {
                binding.edtApplyCoupon.setETText("")
                viewModel.errorMsgHelper?.postValue(
                    ErrorMessageData(
                        "",
                        InputFieldConstants.STATE_DEFAULT
                    )
                )
            }

        }

    }

    private fun clickEvent() {
        binding.header.setBackArrowClickCallback(object : BackArrowClickCallback {
            override fun onBackArrowClick() {
                if (viewModel.isCouponRemoved) {
                    val resultIntent = Intent()
                    resultIntent.putExtra(BundleConstants.RELOAD_BILL_DETAILS, true)
                    setResult(Activity.RESULT_OK, resultIntent)
                    finish()
                } else {
                    finish()
                }
            }
        })
        viewModel.eventOpenCouponPopup.observe(this, EventObserver {
            if (it.second?.message.equals("Success")) {
                if (it.second?.responseData?.isOfferApplied == true) {
                    var dialog: DialogFragment? = null
                    val callback = object : PopUpDialogCallback {
                        override fun onActionButtonClicked() {
                            dialog?.dismiss()
                            val resultIntent = Intent()
                            resultIntent.putExtra(BundleConstants.RELOAD_BILL_DETAILS, true)
                            setResult(Activity.RESULT_OK, resultIntent)
                            finish()

                        }

                        override fun onCloseButtonClicked() {
                            dialog?.dismiss()
                            val resultIntent = Intent()
                            resultIntent.putExtra(BundleConstants.RELOAD_BILL_DETAILS, true)
                            setResult(Activity.RESULT_OK, resultIntent)
                            finish()
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
                        // expiryTime = SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime ?: 0L,
                        isFtcCounterEnabled = it.first.showFtcCounter == true,
                        description = it.second?.responseData?.description?.joinToString(separator = "\n"),
                        //description = it.second?.responseData?.description,
                        tnc = it.second?.responseData?.tnc,
                        ftcViewModel,
                        currentPaymentIconType = viewModel.currentPaymentIconType
                    )
                    dialog.isCancelable = true

                    if ((it.first.expiryDate ?: 0L) > 0L) {

                        viewModel.startTimer(
                            Coupon.ENDS_IN.prefix,
                            //endTimestamp = if (null == SharedPrefManager.getInstance().couponModel) 0L else SharedPrefManager.getInstance().couponModel.expiryDate
                            endTimestamp = if (null == SharedPrefManager.getInstance().couponModel) 0L else SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime
                                ?: 0L
                        ) {}
                    }
                    if (!dialog.isVisible) {
                        dialog.show(this.supportFragmentManager, "CouponApplySuccess")
                    }
                    viewModel.changeCouponButtonState(false, it.first.offerId)
                } else {
                    openApplyCouponValidationPopup(it.first, it.second)
                }

            } else {
                CommonFunc.openErrorDialog(this@CouponActivity, it.second?.message ?: "")
            }


        })

        viewModel.eventOpenCouponFailed.observe(this, EventObserver {
            var dialogFailed: DialogFragment? = null
            val callback = object : PopUpDialogCallback {
                override fun onActionButtonClicked() {
                    dialogFailed?.dismiss()
                }

                override fun onCloseButtonClicked() {
                    dialogFailed?.dismiss()
                }
            }

            //This pop up is used to show error on coupon
            dialogFailed = CouponErrorPopup(
                couponCode = it?.promoCode ?: "",
                cartValue = it?.minCartValue ?: 0,
                message = getString(R.string.couponErrorMsg_without_dot) + (it?.minCartValue
                    ?: 0) + getString(
                    R.string.couponErrorMsgAvailable
                ),
                callback = callback,
            )
            dialogFailed.isCancelable = true
            if (!dialogFailed.isVisible) {
                dialogFailed.show(this.supportFragmentManager, "CouponErrorPopup")
            }
        })

        viewModel.initCountDownTimerTriggerEvent.observe(this, EventObserver {
            initFtcCountDownTimer(it)
        })

        viewModel.eventOpenCouponBottomSheet.observe(this, EventObserver {
            hideKeyboard(this@CouponActivity)
            val couponCodeOfferBottomSheet =
                CouponCodeOfferBottomSheet(it, ftcViewModel, applyCouponCallBack!!, viewModel)
            couponCodeOfferBottomSheet.isCancelable = true
            if (!couponCodeOfferBottomSheet.isVisible) {
                couponCodeOfferBottomSheet.show(
                    this.supportFragmentManager, "CouponCodeOfferBottomSheet"
                )
            }


        })
        with(binding) {
            val btnApplyCallback = InputFieldCallback.TmInputFieldCallbackListener {
                if (CommonFunc.isSingleClickParam())
                    viewModel?.searchApplyClicked(couponCode, currentCartValueD)
            }
            edtApplyCoupon.setInputFieldCallback(
                listener = btnApplyCallback,
                textWatcher = object : TextWatcher {
                    override fun afterTextChanged(s: Editable?) {
                        couponCode = s.toString().trim()
                        if (couponCode.isEmpty()) {
                            viewModel?.errorMsgHelper?.postValue(
                                ErrorMessageData(
                                    "",
                                    InputFieldConstants.STATE_DEFAULT
                                )
                            )

                            viewModel?.couponList?.value = viewModel?.tempList?.value
                            viewModel?.couponList?.postValue(viewModel?.tempList?.value)
                            clCoupon.visibility = View.VISIBLE
                            clNoCoupon.visibility = View.GONE

                            if (viewModel?.couponList?.value.isNullOrEmpty() || viewModel?.couponList?.value?.size == 0) {
                                clCoupon.visibility = View.GONE
                                clNoCoupon.visibility = View.VISIBLE
                            }
                        } else {
                            edtApplyCoupon.setActionButtonEnabled(true)

                            //removed from here bcoz validations are only required on apply button click
                            viewModel?.searchApplyCouponClick(couponCode)


                            /***
                             * if the searched coupon is valid then only enabled apply button
                             */
                            for (item in viewModel?.tempList?.value!!) {
                                if ((item.promoCode
                                        ?: "").lowercase() == couponCode.lowercase() && item.couponCodeRequired == true && !item.isCouponApplied
                                ) {
                                    edtApplyCoupon.setActionButtonEnabled(true)
                                }
                            }
                        }

                        //edtApplyCoupon.setUpState(InputFieldConstants.STATE_TYPING  )

                    }

                    override fun beforeTextChanged(
                        s: CharSequence?,
                        start: Int,
                        count: Int,
                        after: Int
                    ) {
                    }

                    override fun onTextChanged(
                        s: CharSequence?,
                        start: Int,
                        before: Int,
                        count: Int
                    ) {

                    }
                }) { v, actionId, event ->
                actionId == EditorInfo.IME_ACTION_DONE || actionId == EditorInfo.IME_NULL
                false
            }
        }


        viewModel.eventApplyCouponFailed.observe(this, EventObserver {
            PopUpManager.showPopUp(
                fragmentManager = supportFragmentManager,
                popUpType = PopUpType.COUPON_FAILED,
                object : PopUpDialogCallback {
                    override fun onActionButtonClicked() {}
                    override fun onCloseButtonClicked() {}
                }, false
            )
        })
        viewModel.eventMessage.observe(this, EventObserver {
            when (it.messageEnum) {
                MESSAGES.REMOVED_COUPON_SUCCESSFULLY -> {
                    CommonFunc.showCustomToastMessage(this@CouponActivity, it.displayMessage)
                }

                else -> {}
            }
        })

    }

    private fun initFtcCountDownTimer(millis: Long) {
        if (ftcViewModel.getCountDownTimerInstance() == null) {
            ftcViewModel.ftcTimeRemainingString.observe(this) { str: String ->
                if (str != "") {
                    viewModel.ftcCounterTime.postValue(str)
                }
            }
            ftcViewModel.start(millis)
        }

    }

    private fun setupOnBackPresses() {
        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                if (viewModel.isCouponRemoved) {
                    val resultIntent = Intent()
                    resultIntent.putExtra(BundleConstants.RELOAD_BILL_DETAILS, true)
                    setResult(Activity.RESULT_OK, resultIntent)
                    finish()
                } else {
                    finish()
                }
            }
        })
    }

    private fun openApplyCouponValidationPopup(
        couponResponse2: CouponCodeResponse.Coupon?,
        couponResponse: CouponSaveRemoveResponse?
    ) {
        //Display Best offer already applied case
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
                this@CouponActivity.supportFragmentManager,
                "CouponNotApplied"
            )
        }

    }

}