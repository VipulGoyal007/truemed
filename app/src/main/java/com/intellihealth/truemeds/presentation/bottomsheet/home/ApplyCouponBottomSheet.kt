package com.intellihealth.truemeds.presentation.bottomsheet.home


import android.app.Dialog
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.clevertap.android.sdk.Utils.runOnUiThread
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.intellihealth.salt.models.BottomsheetHeaderModel
import com.intellihealth.salt.views.bottomsheet.BottomSheet
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse
import com.intellihealth.truemeds.data.model.home.RatingDetailsResponseModel
import com.intellihealth.truemeds.databinding.BottomsheetApplyCouponBinding
import com.intellihealth.truemeds.domain.enums.Coupon
import com.intellihealth.truemeds.presentation.callbacks.ApplyCouponCallback
import com.intellihealth.truemeds.presentation.callbacks.FeedbackCallback
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.viewmodel.ProductDetailViewModel


class ApplyCouponBottomSheet(): BottomSheet() {
    private lateinit var binding: BottomsheetApplyCouponBinding
    private lateinit var bottomSheetHeaderModel: BottomsheetHeaderModel
    private lateinit var dialog: BottomSheetDialog
    private var header: Boolean=true
    private lateinit var viewModel: ProductDetailViewModel
    var applyCouponBottomSheetModel: CouponCodeResponse.Coupon?= null
    var applyCouponCallback: ApplyCouponCallback?=null
    constructor(applyCouponBottomSheetModel: CouponCodeResponse.Coupon?, applyCouponCallback: ApplyCouponCallback) : this(){
        this.applyCouponBottomSheetModel = applyCouponBottomSheetModel
        this.applyCouponCallback = applyCouponCallback
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.bottomsheet_apply_coupon, container, false)

        viewModel = ViewModelProvider(requireActivity())[ProductDetailViewModel::class.java]

        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        clickListeners()
        setUpData()
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        dialog = BottomSheetDialog(requireContext(), theme)
        bottomSheetHeaderModel = BottomsheetHeaderModel(closeIcon = null, header = null, subHeader = null, icon = null, showIcon = false, showViewDragHandle = false, height = 40, bottomSheetState = 3)
        setUpBottomSheetBehaviour(
            dialog,
            true,
            bottomSheetHeaderModel.bottomSheetState,
            bottomSheetHeaderModel.height,
            bottomSheetHeaderModel
        )
        return dialog
    }

    fun openBottomSheet(header: Boolean, height: Int, bottomSheetState: Int) {
        this.header=header
        bottomSheetHeaderModel = BottomsheetHeaderModel(
            "Get20 applied", "apply",
            R.drawable.ic_purple_tick, true,
            R.drawable.ic_close, header, height,
            bottomSheetState
        )
    }

    private fun setUpData() {
        var termsAndCondition: String = ""
        binding.applyCouponData = applyCouponBottomSheetModel
        //binding.tvSubHeaderContent.text = termsAndCondition

        val dotOperator = binding.tvSubHeaderContent.context.getString(R.string.dot_symbol)

        if (null != applyCouponBottomSheetModel?.description && !applyCouponBottomSheetModel?.description.equals("")) {
            termsAndCondition = applyCouponBottomSheetModel?.description!!
            termsAndCondition = "$dotOperator " + termsAndCondition.replace(
                "\n",
                "\n\n$dotOperator "
            )
            binding.tvSubHeaderContent.text = termsAndCondition
        }else{
            binding.tvSubHeaderContent.text = termsAndCondition
        }
    }

    private fun clickListeners(){
        binding.imageClose.setOnClickListener {
            dismiss()
        }
        if(SharedPrefManager.getInstance().couponModel != null && !SharedPrefManager.getInstance().couponModel.promoCode.isNullOrEmpty() && SharedPrefManager.getInstance().couponModel.promoCode.equals(applyCouponBottomSheetModel?.promoCode, true) ){
            binding.btnRemoveCoupon.visibility = View.VISIBLE
            binding.btnApplyCoupon.visibility = View.GONE
            binding.tvHeader.text = applyCouponBottomSheetModel?.promoCode+" applied"
            binding.imgLeft.setImageResource(R.drawable.ic_purple_tick)

            if(applyCouponBottomSheetModel?.showFtcCounter != null && applyCouponBottomSheetModel?.showFtcCounter == true) {
                //Log.d("TAG", "clickListeners: date= ${applyCouponBottomSheetModel.expiryDate}")
                Log.d("TAG", "clickListeners: date= ${SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime}")
                viewModel.startTimer(
                    Coupon.ENDS_IN.prefix,
                    //applyCouponBottomSheetModel.expiryDate ?: 0L
                    SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime ?: 0L
                ) { time ->
                    if(time != getString(R.string.timer_ends_string)) {
                        runOnUiThread {
                            binding.tvTimerApplyCoupon.visibility = View.VISIBLE
                            binding.tvTimerApplyCoupon.setChipTitle(time)
                            Log.d("TAG", "clickListeners: timen= $time")
                        }
                    }else{
                        runOnUiThread {
                            binding.tvTimerApplyCoupon.visibility = View.GONE
                            Log.d("TAG", "clickListeners: timen= $time")
                        }
                        viewModel.stopCouponTimer()
                    }
                }
            }
        } else{
            viewModel.callEventApplyCouponClickedFromBaseVM()
            binding.tvHeader.text = applyCouponBottomSheetModel?.promoCode
            binding.btnRemoveCoupon.visibility = View.GONE
            binding.btnApplyCoupon.visibility = View.VISIBLE
            binding.tvTimerApplyCoupon.visibility = View.GONE
            binding.imgLeft.setImageResource(R.drawable.ic_percentage_purple)
        }
        binding.btnApplyCoupon.setOnClickListener {
//            viewModel.applyCouponCode(SharedPrefManager.getInstance().incompleteOrderId, applyCouponBottomSheetModel.offerId ?: 0)
            binding.btnApplyCoupon.visibility = View.GONE
            binding.btnRemoveCoupon.visibility = View.VISIBLE
            applyCouponCallback?.applyCouponButtonClick(applyCouponBottomSheetModel)
            dismiss()
        }
        binding.btnRemoveCoupon.setOnClickListener {
            binding.btnApplyCoupon.visibility = View.VISIBLE
            binding.btnRemoveCoupon.visibility = View.GONE
            binding.tvTimerApplyCoupon.visibility = View.GONE
            applyCouponCallback?.removeCouponButtonClick(applyCouponBottomSheetModel)
            dismiss()
        }
    }
    override fun getTheme() = R.style.BottomSheetDialog

    override fun onPause() {
        super.onPause()
        viewModel.stopCouponTimer()
    }
}