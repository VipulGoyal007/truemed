package com.intellihealth.truemeds.presentation.bottomsheet

import android.app.Dialog
import android.graphics.Color
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.style.ForegroundColorSpan
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.gson.Gson
import com.intellihealth.salt.views.bottomsheet.BottomSheet
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse
import com.intellihealth.truemeds.databinding.BottomsheetPaymentChangeSelectionBinding
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.viewmodel.PaymentOptionsViewModel
import com.intellihealth.truemeds.presentation.viewmodel.events.EventObserver
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PaymentChangeSelectionBottomSheet : BottomSheet() {

    lateinit var viewModel: PaymentOptionsViewModel
    private lateinit var binding: BottomsheetPaymentChangeSelectionBinding
    private lateinit var dialog: BottomSheetDialog
    lateinit var item: PaymentMethodResponse.ResponseData
    var position = 0
    var couponCode: String = ""
    var clickedOnPage: String = ""

    fun setupData(
        item: PaymentMethodResponse.ResponseData,
        position: Int,
        viewModel: PaymentOptionsViewModel,
        couponCode: String, clickedOnPage: String
    ) {
        this.item = item
        this.position = position
        this.viewModel = viewModel
        this.couponCode = couponCode
        this.clickedOnPage = clickedOnPage
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    /**
     * Inflate the bottomsheet view
     * **/
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.bottomsheet_payment_change_selection, container, false)
        binding = DataBindingUtil.bind(view)!!
        return binding.root
    }

    /**
     * 1) Bind the viewmodel to the view inside initView()
     * 2) Setup event listeners
     * **/
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // 1) Bind the viewmodel to the view inside initView()
        initView()
        // 3) Setup event listeners
        setEventListeners()
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        dialog = BottomSheetDialog(requireContext(), theme)

        setUpBottomSheetBehaviour(
            dialog,
            true,
            6,
            55
        )
        return dialog
    }

    private fun initView() {

        binding.let {
            it.viewModel = viewModel
            it.lifecycleOwner = activity
        }

        if (activity != null) {

            val stringBuilderSavings = SpannableStringBuilder()
            stringBuilderSavings.append(couponCode)
            stringBuilderSavings.setSpan(
                ForegroundColorSpan(Color.parseColor("#7e26d7")),
                0,
                stringBuilderSavings.length,
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
            )
            val start = stringBuilderSavings.length
            stringBuilderSavings.append(" offer will be removed!")
            val end = stringBuilderSavings.length
            stringBuilderSavings.setSpan(
                ForegroundColorSpan(Color.parseColor("#40444c")),
                start,
                end,
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
            )
            binding.tvCouponCodeRemovedMsg.text = stringBuilderSavings
        } else {
            binding.tvCouponCodeRemovedMsg.text = couponCode + " offer will be removed !"
        }

    }

    /**
     * observe eventPaymentChange whenever change mode button is clicked,
     * observe eventPaymentChangeCloseBS whenever dont remove button is clicked and call dismiss to close the bottomsheet
     * **/
    private fun setEventListeners() {
        binding.imgClose.setOnClickListener { closeBottomSheet() }

        viewModel.eventPaymentChange.observe(viewLifecycleOwner, EventObserver {
            Log.d("qwerty", "item ${Gson().toJson(item)} position $position")
            Log.i("mutabledata", "" + viewModel.paymentOptionsMutableLiveData.value)
            viewModel.isPaymentSpecificCoupon = false
            viewModel.onPaymentMethodSelected(item, position, clickedOnPage)
            Log.i("initEvents", clickedOnPage)
            if (clickedOnPage == BundleConstants.ORDER_SUMMARY || clickedOnPage == BundleConstants.REORDER) {
                //viewModel.onPaymentMethodSelected(item,position,clickedOnPage)
                viewModel.setOfferIdForOrderId(0L)
                SharedPrefManager.getInstance().offerId = "0"
                SharedPrefManager.getInstance().couponModel = null
            } else {
                viewModel.cartBillDetails.value?.couponName = ""
                Log.i("clickedOnPage", clickedOnPage)
                //viewModel.calculateFinalBillDetailsAfterCouponRemove(clickedOnPage,viewModel.cartBillDetails.value?.couponValue!!)
                viewModel.calculateFinalBillDetailsAfterCouponRemove(
                    clickedOnPage,
                    viewModel.cartBillDetails.value?.couponValue!!,
                    item,
                    position,
                    viewModel.cartBillDetails.value?.estimatedPayableValue!!,
                )
            }
            viewModel.appliedCouponCode.value = ""
            closeBottomSheet()
        })

        viewModel.eventPaymentChangeCloseBS.observe(viewLifecycleOwner, EventObserver {
            if (it == 1) {
                closeBottomSheet()
            }
        })
    }

    /**
     * Set the style for bottomsheet
     * **/
    override fun getTheme(): Int {
        return R.style.BottomSheetDialog
    }

    private fun closeBottomSheet() {
        dialog.dismiss()
    }
}