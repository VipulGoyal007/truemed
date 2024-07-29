package com.intellihealth.truemeds.presentation.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.google.gson.Gson
import com.intellihealth.salt.models.BillDetailsModel
import com.intellihealth.truemeds.BuildConfig
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.utils.PopUpType
import com.intellihealth.truemeds.databinding.ActivityPatientReminderBinding
import com.intellihealth.truemeds.databinding.ActivityPaymentBinding
import com.intellihealth.truemeds.domain.enums.ErrorType
import com.intellihealth.truemeds.domain.navigation.navigateToHomePageActivity
import com.intellihealth.truemeds.presentation.callbacks.PopUpDialogCallback
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.utils.CommonFunc
import com.intellihealth.truemeds.presentation.utils.viewBinding
import com.intellihealth.truemeds.presentation.viewmodel.PaymentStatusViewModel
import com.intellihealth.truemeds.presentation.viewmodel.events.EventObserver
import com.userexperior.UserExperior
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@AndroidEntryPoint
class PaymentActivity : BaseActivity() {

    private val binding by viewBinding(ActivityPaymentBinding::inflate)
    private lateinit var viewModel: PaymentStatusViewModel
    private lateinit var context: Context
    private lateinit var clickedOnPage: String
    private lateinit var paymentMethod: String

    override fun extractIntentData() {
        intent.extras?.let { bundle ->
            viewModel.orderId = bundle.getLong("orderId", 0)
            viewModel.paymentMethod.value = bundle.getString("paymentMethod") ?: ""
            paymentMethod = bundle.getString("paymentMethod") ?: ""
            viewModel.paymentMethodId = bundle.getLong("paymentMethodId", 0)
            viewModel.totalPayableAmount.value = bundle.getDouble("estimatedPayableValue", 0.0)
            viewModel.currentOrderStatus =
                bundle.getString(BundleConstants.CURRENT_ORDER_STATUS).toString()
            viewModel.isReorder = bundle.getBoolean(BundleConstants.BUNDLE_KEY_IS_REORDER, false)
            Log.i("pay intent", "" + viewModel.totalPayableAmount.value)
            if (bundle.containsKey(BundleConstants.BUNDLE_KEY_BILL_DETAIL)!! && bundle.getString(
                    BundleConstants.BUNDLE_KEY_BILL_DETAIL
                ) != null
            ) {
                viewModel.billDetails = Gson().fromJson(
                    bundle.getString(BundleConstants.BUNDLE_KEY_BILL_DETAIL),
                    BillDetailsModel::class.java
                )
            } else {
                viewModel.getCartBillDetails(viewModel.orderId)
            }

            if (bundle.getString(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE) != null || !bundle.getString(
                    BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE
                ).equals("")
            ) {
                viewModel.clickedOnPage =
                    bundle.getString(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE).toString()
            }

        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this)[PaymentStatusViewModel::class.java]
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        lifecycle.addObserver(viewModel)
        context = this

        extractIntentData()
        eventObservers()
        viewModel.initCashFreeSdk(this@PaymentActivity)
        if (UserExperior.isRecording()) {
            UserExperior.stopRecording()
        }
    }

    private fun eventObservers() {
        viewModel.finishPage.observe(this) {
            if (it) {
                goToHomeScreenActivity()
            }

        }

        viewModel.showCancelledPopupEventLiveData.observe(this, EventObserver {
            if (it as Boolean) {
                showDialogBox(PopUpType.PAYMENT_CANCELLED, object : PopUpDialogCallback {
                    override fun onActionButtonClicked() {
                        finish()
                    }

                    override fun onCloseButtonClicked() {
                        finish()

                    }

                    override fun onDismissOutside() {
                        finish()
                    }
                }, false)
            }
        })

        viewModel.showPaymentErrorPopupEventLiveData.observe(this, EventObserver {
            if (it as Boolean) {
                showDialogBox(PopUpType.PAYMENT_CANCELLED, object : PopUpDialogCallback {
                    override fun onActionButtonClicked() {
                        finish()
                    }

                    override fun onCloseButtonClicked() {
                        finish()

                    }

                    override fun onDismissOutside() {
                        finish()
                    }
                }, false)
            }
        })

        viewModel.showPaymentPendingPopupEventLiveData.observe(this, EventObserver {
            if (it as Boolean) {
                showDialogBox(PopUpType.PAYMENT_PENDING, object : PopUpDialogCallback {
                    override fun onActionButtonClicked() {
                        goToHomeScreenActivity()
                    }

                    override fun onCloseButtonClicked() {
                        goToHomeScreenActivity()

                    }
                }, false)
            }
        })

        viewModel.launchPaymentPage.observe(this) {
            if (it) {
                startActivity(
                    Intent(this, PaymentOptionActivity::class.java)
                        .putExtra(BundleConstants.DISPLAY_PAYMENT_UNSUCCESSFUL, true)
                        .putExtra(BundleConstants.BUNDLE_KEY_INCLUDE_COD, true)
                        .putExtra(
                            BundleConstants.BUNDLE_KEY_BILL_DETAIL,
                            Gson().toJson(viewModel.billDetails)
                        )
                        .putExtra(BundleConstants.BUNDLE_KEY_PAYABLE_AMOUNT_TEXT, true)
                        .putExtra(BundleConstants.BUNDLE_KEY_ORDER_ID, viewModel.orderId.toString())
                        .putExtra(
                            BundleConstants.BUNDLE_KEY_LAST_SELECTED_PAYMENT_METHOD,
                            CommonFunc.getPaymentMethodIgnoringCasing(paymentMethod)
                        )
                        .putExtra(
                            BundleConstants.BUNDLE_KEY_COUPON_APPLIED_NAME,
                            viewModel.billDetails.couponName
                        )
                        .putExtra(
                            BundleConstants.BUNDLE_KEY_LAST_SELECTED_PAYMENT_METHOD_ID,
                            viewModel.paymentMethodId
                        )
                        .putExtra(
                            BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE,
                            viewModel.clickedOnPage
                        )
                )
                setResult(BundleConstants.REQUEST_CODE_PAYMENT_CHANGE, intent)


                finish()
            }
        }
    }




    private fun goToHomeScreenActivity(){
        navigateToHomePageActivity(
            flags = listOf(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        )
        finish()
    }

}


