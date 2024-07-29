package com.intellihealth.truemeds.presentation.activity

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.KeyEvent
import android.view.View
import android.view.WindowManager
import androidx.core.os.bundleOf
import androidx.lifecycle.ViewModelProvider
import com.google.gson.Gson
import com.intellihealth.salt.callbacks.BackArrowClickCallback
import com.intellihealth.salt.callbacks.RadioListCallback
import com.intellihealth.salt.views.Toast
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.mixpanel.MxAppOrderCancelled
import com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse
import com.intellihealth.truemeds.data.utils.MESSAGES
import com.intellihealth.truemeds.data.utils.PopUpType
import com.intellihealth.truemeds.data.utils.hideKeyboard
import com.intellihealth.truemeds.databinding.ActivityCancelSubOrderBinding
import com.intellihealth.truemeds.domain.navigation.navigateToHomePageActivity
import com.intellihealth.truemeds.presentation.bottomsheet.CancelOrderBottomSheet
import com.intellihealth.truemeds.presentation.callbacks.PopUpDialogCallback
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.utils.viewBinding
import com.intellihealth.truemeds.presentation.viewmodel.CancelOrderViewModel
import com.intellihealth.truemeds.presentation.viewmodel.events.EventObserver
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CancelOrderSubActivity : BaseActivity() {
    private val binding by viewBinding(ActivityCancelSubOrderBinding::inflate)
    private lateinit var cancelOrderViewModel: CancelOrderViewModel
    private var reasonId = ""
    private var selectedReasonId = 0
    private var reasonTitle = ""
    private var orderId = 0L
    private var currentOrderStatus = 0
    private var totalSaveAmount = ""
    private var billDetailResponse: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        cancelOrderViewModel = ViewModelProvider(this)[CancelOrderViewModel::class.java]
        extractIntentData()
        cancelOrderListFromAPI()
        setEventListener()
        setTextWatcher()
        binding.viewModel = cancelOrderViewModel
        binding.lifecycleOwner = this
        lifecycle.addObserver(cancelOrderViewModel)
    }

    override fun extractIntentData(){

        intent?.extras?.let { bundle ->

            val gson = Gson()
            totalSaveAmount = bundle.getString(BundleConstants.TOTAL_SAVING_AMOUNT).toString()
            reasonId = bundle.getString("reasonId").toString()
            if (bundle.containsKey("orderId")) {
                orderId = bundle.getLong("orderId", 0)
            }
            if(bundle.containsKey(BundleConstants.CANCEL_ORDER_EVENT_DATA)){
                val json = bundle.getString(BundleConstants.CANCEL_ORDER_EVENT_DATA)
                cancelOrderViewModel.appOrderCancelledModel = gson.fromJson(json, MxAppOrderCancelled::class.java)
            }
            if(bundle.containsKey(BundleConstants.CANCEL_REASON)){
                cancelOrderViewModel.firstPageCancelFinalReason=
                    bundle.getString(BundleConstants.CANCEL_REASON).toString()
            }
            if(bundle.containsKey(BundleConstants.CURRENT_ORDER_STATUS)){
                currentOrderStatus = bundle.getInt(BundleConstants.CURRENT_ORDER_STATUS,0)
            }

            if(bundle.containsKey(BundleConstants.BUNDLE_KEY_BILL_DETAILS)){
                billDetailResponse = bundle.getString(BundleConstants.BUNDLE_KEY_BILL_DETAILS)
                cancelOrderViewModel.billDetailsResponse = gson.fromJson(billDetailResponse, BillDetailResponse::class.java)
            }
        }
    }

    private fun setTextWatcher() {
        binding.edtOther.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {
                if (s.trim().length >= 10) {
                    binding.tvOtherErrorMsg.visibility = View.GONE
                    binding.edtOther.setBackgroundResource(R.drawable.other_box_bg)
                }
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }
        })
    }

    private fun setEventListener() {
        binding.mobileSectionHeadersDefaultWithoutFill.setBackArrowClickCallback(object :
            BackArrowClickCallback {
            override fun onBackArrowClick() {
                finish()
            }
        })
        binding.cancelOrderBtn.setOnClickListener {
            hideKeyboard(this@CancelOrderSubActivity)
            val cancelOrderBottomSheet = CancelOrderBottomSheet()
            cancelOrderBottomSheet.isCancelable = true
            cancelOrderBottomSheet.setCancelOrderViewMode(cancelOrderViewModel)

            var notes = ""
            if (binding.edtOther.visibility == View.VISIBLE) {
                notes = binding.edtOther.text.toString()
                if (notes.length < 10) {
                    binding.tvOtherErrorMsg.visibility = View.VISIBLE
                    binding.edtOther.setBackgroundResource(R.drawable.other_box_error_bg)
                } else {
                    cancelOrderViewModel.notes.value = notes
                    cancelOrderBottomSheet.show(
                        supportFragmentManager, "Cancel Order"
                    )
                }
            } else {
                if (selectedReasonId == 0) {
                    Toast().showCustomToastMessage(
                        this@CancelOrderSubActivity,
                        "Please select any reason to cancel order"
                    )
                } else {
                    cancelOrderBottomSheet.show(
                        supportFragmentManager, "Cancel Order"
                    )
                }
            }

        }
        cancelOrderViewModel.eventMessage.observe(this, EventObserver {
            if (it == null) return@EventObserver
            when {
                it.equals(MESSAGES.CANCEL_ORDER_BOTTOM_SHEET_CLICK) -> {
                    var notes = ""
                    if (binding.edtOther.visibility == View.VISIBLE) {
                        notes = binding.edtOther.text.toString()
                        if (notes.isEmpty()) {
                            Toast().showCustomToastMessage(
                                this@CancelOrderSubActivity,
                                "Please enter some notes to cancel order"
                            )
                        } else if (notes.length < 10) {
                            binding.tvOtherErrorMsg.visibility = View.VISIBLE
                            binding.edtOther.setBackgroundResource(R.drawable.other_box_error_bg)
                        } else {
                            cancelOrderViewModel.cancelOrder(
                                orderId,
                                selectedReasonId,
                                notes,
                                currentOrderStatus
                            )
                        }
                    } else {
                        if (selectedReasonId == 0) {
                            Toast().showCustomToastMessage(
                                this@CancelOrderSubActivity,
                                "Please select any reason to cancel order"
                            )
                        } else {
                            cancelOrderViewModel.cancelOrder(
                                orderId,
                                selectedReasonId,
                                notes,
                                currentOrderStatus
                            )
                            cancelOrderViewModel.selectedReasonId.postValue(selectedReasonId.toString())
                            cancelOrderViewModel.notes.postValue(notes)
                        }
                    }

                }

                it.equals(MESSAGES.CANCEL_ORDER_BOTTOM_SHEET_CLICK_FOR_BACK) -> {
                    setResult(RESULT_OK)
                    finish()
                }

                it.equals(MESSAGES.NO_NETWORK) -> {
                    showDialogBox(PopUpType.INTERNET_FAILURE, object : PopUpDialogCallback {
                        override fun onActionButtonClicked() {
                            cancelOrderViewModel.getCancelOrderSubList(reasonId)
                        }

                        override fun onCloseButtonClicked() {
                        }
                    }, true)
                }
            }
        })

        cancelOrderViewModel.cancelOrderRadioList.observe(this) {
            it?.let { it1 ->
                binding.rvListVertical.setAdapter(it1, 0, object : RadioListCallback {
                    override fun getItem(id: Int, title: String) {
                        selectedReasonId = id
                        reasonTitle = title
                        if (reasonTitle == "Other") {
                            binding.edtOther.visibility = View.VISIBLE
                        } else {
                            hideKeyboard(this@CancelOrderSubActivity)
                            binding.edtOther.visibility = View.GONE
                            binding.tvOtherErrorMsg.visibility = View.GONE
                        }
                    }
                })
            }
        }

        cancelOrderViewModel.cancelOrderEventLiveData.observe(this, EventObserver {
            it?.let {
                val cancelEvent = it as Boolean
                if (cancelEvent) {
                    isCancelled = true
                    navigateToHomePageActivity(
                        params = bundleOf(
                            BundleConstants.ORDER_ID to orderId,
                            BundleConstants.IS_FROM_CANCEL_ORDER to true
                        ),
                        flags = listOf(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                    )
                    finishAffinity()
                }
            }
        })

        cancelOrderViewModel.showShimmerForSubOrderLiveData.observe(this) {
            if (it) {
                binding.shimmerViewContainer.startShimmerAnimation()
            } else {
                binding.shimmerViewContainer.stopShimmerAnimation()
            }
        }

        cancelOrderViewModel.isLoading.observe(this) {
            if (it) {
                window.setFlags(
                    WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE,
                    WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE
                )
            } else {
                window.clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE)
            }
        }

    }

    private fun cancelOrderListFromAPI() {
        cancelOrderViewModel.getCancelOrderSubList(reasonId)
    }

    //restrict back space when cancel order api response is not completed
    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        if ((cancelOrderViewModel.isLoading.value) == true) {
            if (keyCode == KeyEvent.KEYCODE_BACK) {
                //preventing default implementation previous to android.os.Build.VERSION_CODES.ECLAIR
                return true
            }
//            super.onKeyDown(keyCode, event)
        }
        return super.onKeyDown(keyCode, event)

    }


}