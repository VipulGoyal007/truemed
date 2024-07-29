package com.intellihealth.truemeds.presentation.dialog

import android.os.Bundle
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.DialogFragment
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.home.PopUpModel
import com.intellihealth.truemeds.databinding.DialogCouponSavingBinding
import com.intellihealth.truemeds.databinding.DialogRoundedCornerBinding
import com.intellihealth.truemeds.presentation.callbacks.PopUpDialogCallback
import com.intellihealth.salt.utils.toPx

class CouponSavingPopUp(
    private val couponCode: String,
    private val saving: Double,
    private val timer: String,
    val callback: PopUpDialogCallback
) : DialogFragment() {
    private lateinit var binding: DialogCouponSavingBinding

    override fun getTheme() = R.style.RoundedCornersDialog

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.dialog_coupon_saving, container, false)
        binding.callback = callback
        binding.couponCode = couponCode
        binding.saving = saving
        binding.timer = timer
        setListener()
        return binding.root
    }

    private fun setListener() {

        binding.ivClose.setOnClickListener {
            if (dialog?.isShowing == true) dialog?.dismiss()
        }
    }

}