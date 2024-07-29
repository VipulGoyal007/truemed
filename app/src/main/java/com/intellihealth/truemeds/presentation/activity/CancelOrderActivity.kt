package com.intellihealth.truemeds.presentation.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.google.gson.Gson
import com.intellihealth.salt.callbacks.BackArrowClickCallback
import com.intellihealth.truemeds.data.model.mixpanel.MxAppOrderCancelled
import com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse
import com.intellihealth.truemeds.data.utils.MESSAGES
import com.intellihealth.truemeds.data.utils.PopUpType
import com.intellihealth.truemeds.databinding.ActivityCancelOrderBinding
import com.intellihealth.truemeds.domain.navigation.navigateToCancelOrderSubActivity
import com.intellihealth.truemeds.presentation.callbacks.PopUpDialogCallback
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.utils.viewBinding
import com.intellihealth.truemeds.presentation.viewmodel.CancelOrderViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CancelOrderActivity : BaseActivity() {
    private val binding by viewBinding(ActivityCancelOrderBinding::inflate)
    private lateinit var cancelOrderViewModel: CancelOrderViewModel
    private var orderId = 0L
    private var currentOrderStatus = 0
    private var totalSaveAmount = ""
    private var cancelOrderData: String? = null
    private var billDetailResponse: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        try {
            cancelOrderViewModel = ViewModelProvider(this)[CancelOrderViewModel::class.java]
        } catch (e: Exception) {
            Log.d("Error Message", "error onCreate: " + e.message)
        }
        extractIntentData()
        cancelOrderListFromAPI()
        binding.viewModel = cancelOrderViewModel
        binding.lifecycleOwner = this
        //Set view model as lifecycle observer of the activity
        lifecycle.addObserver(cancelOrderViewModel)
        setEventListener()
        updateStatusBarColor()
    }

    override fun extractIntentData() {
        intent.extras?.let { bundle ->

            val gson = Gson()

            if (bundle.containsKey("orderId")) {
                orderId = bundle.getLong("orderId", 0)
            }
            if (bundle.containsKey(BundleConstants.CANCEL_ORDER_EVENT_DATA)) {
                cancelOrderData = bundle.getString(BundleConstants.CANCEL_ORDER_EVENT_DATA)
                cancelOrderViewModel.appOrderCancelledModel =
                    gson.fromJson(cancelOrderData, MxAppOrderCancelled::class.java)
            }
            if (bundle.containsKey(BundleConstants.BUNDLE_KEY_BILL_DETAILS)) {
                billDetailResponse = bundle.getString(BundleConstants.BUNDLE_KEY_BILL_DETAILS)
                cancelOrderViewModel.billDetailsResponse =
                    gson.fromJson(billDetailResponse, BillDetailResponse::class.java)
            }
            if (bundle.containsKey(BundleConstants.CURRENT_ORDER_STATUS)) {
                currentOrderStatus = bundle.getInt(BundleConstants.CURRENT_ORDER_STATUS, 0)
            }
            totalSaveAmount = bundle.getString(BundleConstants.TOTAL_SAVING_AMOUNT).toString()
        }
    }

    private fun setEventListener() {
        cancelOrderViewModel.eventMessage.observe(this,
            com.intellihealth.truemeds.presentation.viewmodel.events.EventObserver {
                when {
                    it.equals(MESSAGES.CANCEL_ORDER_REASON_CLICK) -> {
                        navigateToCancelOrderSubActivity(
                            params = bundleOf(
                                "reasonId" to cancelOrderViewModel.reasonId,
                                BundleConstants.CANCEL_REASON to cancelOrderViewModel.firstPageCancelReason,
                                "orderId" to orderId,
                                BundleConstants.CURRENT_ORDER_STATUS to currentOrderStatus,
                                BundleConstants.TOTAL_SAVING_AMOUNT to totalSaveAmount,
                                BundleConstants.CANCEL_ORDER_EVENT_DATA to cancelOrderData,
                                BundleConstants.BUNDLE_KEY_BILL_DETAILS to billDetailResponse
                            ),
                            activityLauncher = activityLauncher
                        )
                    }

                    it.equals(MESSAGES.NO_NETWORK) -> {
                        showDialogBox(PopUpType.INTERNET_FAILURE, object : PopUpDialogCallback {
                            override fun onActionButtonClicked() {
                                cancelOrderViewModel.getCancelOrderList()
                            }

                            override fun onCloseButtonClicked() {
                            }
                        }, true)
                    }
                }
            })

        binding.mobileSectionHeadersDefaultWithoutFill.setBackArrowClickCallback(object :
            BackArrowClickCallback {
            override fun onBackArrowClick() {
                finish()
            }
        })

        cancelOrderViewModel.showShimmerLiveData.observe(this) {
            if (it) {
                binding.shimmerViewContainer.startShimmerAnimation()
            } else {
                binding.shimmerViewContainer.stopShimmerAnimation()
            }
        }
    }

    private var activityLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result: ActivityResult? ->
        if (result?.resultCode == Activity.RESULT_OK) {
            finish()
        }
    }

    private fun cancelOrderListFromAPI() {
        cancelOrderViewModel.getCancelOrderList()
    }

}