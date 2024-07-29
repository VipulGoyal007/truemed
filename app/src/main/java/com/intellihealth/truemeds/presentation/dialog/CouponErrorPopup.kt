package com.intellihealth.truemeds.presentation.dialog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.DialogFragment
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.databinding.DialogCouponErrorBinding
import com.intellihealth.truemeds.databinding.DialogCouponSuceessBinding
import com.intellihealth.truemeds.presentation.callbacks.PopUpDialogCallback

class CouponErrorPopup(private val couponCode: String,
                       private val cartValue: Int,
                       private val message: String,
                       val callback: PopUpDialogCallback): DialogFragment() {
    private lateinit var binding: DialogCouponErrorBinding

    override fun getTheme() = R.style.RoundedCornersDialog

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.dialog_coupon_error, container, false)
        //Enter exit animation
        dialog?.window?.attributes?.windowAnimations = R.style.DialogAnimation;
        binding.callback = callback
        binding.couponCode = couponCode
        binding.cartValue = cartValue
        binding.message = message
        setListener()
        return binding.root
    }

    private fun setListener() {

        binding.ivClose.setOnClickListener {
            if (dialog?.isShowing == true) dialog?.dismiss()
        }

        binding.btnOk.setOnClickListener{
            if (dialog?.isShowing == true) dialog?.dismiss()
        }
    }

}