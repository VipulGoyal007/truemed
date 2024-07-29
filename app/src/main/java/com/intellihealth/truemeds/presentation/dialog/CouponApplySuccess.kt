package com.intellihealth.truemeds.presentation.dialog

import android.content.DialogInterface
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.DialogFragment
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.utils.removeExtraZeros
import com.intellihealth.truemeds.databinding.DialogCouponSuceessBinding
import com.intellihealth.truemeds.domain.enums.Coupon
import com.intellihealth.truemeds.mvvm.viewmodel.CountDownTimerViewModel
import com.intellihealth.truemeds.presentation.callbacks.PopUpDialogCallback
import com.intellihealth.truemeds.presentation.utils.CommonFunc.wrapInTwoDigit

class CouponApplySuccess(
    val couponCode: String,
    val saving: Double,
    val callback: PopUpDialogCallback,
    val expiryTime: Long,
    val isFtcCounterEnabled: Boolean,
    val description: String? = null,
    val tnc: String? = null,
    val ftcViewModel: CountDownTimerViewModel,
    val currentPaymentIconType: String = "",

) : DialogFragment() {
    private lateinit var binding: DialogCouponSuceessBinding
    private var millis = 0L
    override fun getTheme() = R.style.RoundedCornersDialog

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.dialog_coupon_suceess, container, false)
        //Enter exit animation
        dialog?.window?.attributes?.windowAnimations = R.style.DialogAnimation;
        binding.callback = callback
        /*binding.couponCode = couponCode
        binding.saving = saving.wrapInTwoDigit()
        binding.description = description
        binding.tnc = tnc*/
        Log.d("qwerty","couponCode : $couponCode saving : $saving tnc : $tnc desc : $description")
        binding.also{
            it.tvCouponCodeSuccess.text = "$couponCode applied"
            it.tvCouponSuccessSavings.text = "₹" + saving.wrapInTwoDigit()
            it.tvTnc.text = tnc
            it.tvDesc.text = description

            if (saving == 0.0){
                it.tvCouponSuccessSavings.visibility = View.GONE
                it.tvSaving.visibility = View.GONE
                it.tvTimer.visibility = View.GONE
                binding.btnOk.setTitle("Okay, got it")
            } else {
                it.tvTnc.visibility = View.GONE
                it.tvDesc.visibility = View.GONE
            }

            if(!currentPaymentIconType.isNullOrEmpty()) {
                it.tvCurrentPaymentIconType.visibility=View.VISIBLE
                it.tvCurrentPaymentIconType.text =
                    getString(R.string.payment_mode_changed_to) + " " + currentPaymentIconType
            }
            else{
                it.tvCurrentPaymentIconType.visibility=View.GONE
            }
        }

        setListener()
        showAnimation()

        return binding.root
    }

    private fun showAnimation() {
        with(binding.lottieCouponApplied){
            setAnimation("success_confetti.json")
            repeatCount = 0 /*LottieDrawable.INFINITE*/
            speed = 0.7f
            scaleY = 1.3f
            scaleX = 1.175f
            playAnimation()
        }
    }

    private fun setListener() {
        if (isFtcCounterEnabled && saving > 0.0) {
            binding.tvTimer.visibility = View.VISIBLE
            ftcViewModel.startTimer(Coupon.ENDS_IN.prefix,expiryTime){
            //ftcViewModel.startTimer(Coupon.ENDS_IN.prefix, SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime){
                activity?.runOnUiThread {
                    binding.tvTimer.setChipTitle(it)
                }
            }
        }
        else {
            binding.tvTimer.visibility = View.GONE
        }


        binding.ivClose.setOnClickListener {
            if (dialog?.isShowing == true){
                callback.onCloseButtonClicked()
                dialog?.dismiss()
            }
        }

        binding.btnOk.setOnClickListener{
            if (dialog?.isShowing == true){
                callback.onActionButtonClicked()

            }
        }
    }

    override fun onDismiss(dialog: DialogInterface) {
        super.onDismiss(dialog)
        ftcViewModel.stopCouponTimer()
    }
}