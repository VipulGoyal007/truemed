package com.intellihealth.truemeds.presentation.bottomsheet.orderstatus

import android.app.Dialog
import android.graphics.Color
import android.graphics.Typeface
import android.os.Build
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.text.style.StyleSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.databinding.DataBindingUtil
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.intellihealth.salt.constants.CustomTypefaceSpan
import com.intellihealth.salt.constants.FullWidthProductCardConstants
import com.intellihealth.salt.models.ProductInfoModel
import com.intellihealth.salt.views.bottomsheet.BottomSheet
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.databinding.OptForSubsBottomSheetBinding
import com.intellihealth.truemeds.presentation.utils.applyTryCatch

class OptForSubstituteBottomSheet: BottomSheet() {

    private lateinit var binding: OptForSubsBottomSheetBinding
    private lateinit var dialog: BottomSheetDialog
    private lateinit var productModel: ProductInfoModel

    fun setOrderStatus(productModel: ProductInfoModel) {
        this.productModel = productModel
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.opt_for_subs_bottom_sheet, container, false)
        if(::productModel.isInitialized) {
            binding.subsModel = productModel.apply {
                product.showStepper = false
                cardType = FullWidthProductCardConstants.COMPARE_N_CHOOSE
                suggestion = productModel.product
                product.subsSavingsPercentage = product.discount.toString() + "%"
            }
            binding.lifecycleOwner = viewLifecycleOwner
            setHeaderText()
        }
        return binding.root
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        dialog = BottomSheetDialog(requireContext(), theme)
        setUpBottomSheetBehaviour(
            dialog,
            true,
            4,
            50
        )
        return dialog
    }

    private fun setHeaderText() = applyTryCatch {
//        Substitutes are safe
        val fontSemiBold = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            resources.getFont(R.font.plus_jakarta_sans_regular)
        } else {
            Typeface.createFromAsset(resources.assets,"fonts/plus_jakarta_sans_regular.ttf");
        }
        val stringBuilder = SpannableStringBuilder()
        stringBuilder.append("Opt of this substitute on doctor call and save ")
        val start = stringBuilder.length
        stringBuilder.setSpan(
            StyleSpan(Typeface.NORMAL),
            0,
            stringBuilder.length,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        stringBuilder.setSpan(
            CustomTypefaceSpan("", fontSemiBold),
            0,
            stringBuilder.length,
            Spanned.SPAN_EXCLUSIVE_INCLUSIVE
        )

        stringBuilder.append(productModel.product.discount.toString()+"%")
        val end = stringBuilder.length
        stringBuilder.setSpan(
            CustomTypefaceSpan("", fontSemiBold),
            start,
            end,
            Spanned.SPAN_EXCLUSIVE_INCLUSIVE
        )
        stringBuilder.setSpan(
            ForegroundColorSpan(Color.parseColor("#178755")),
            start,
            end,
            Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        );
        binding.subsTitle.text = stringBuilder
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dismissMissBottomSheet()
    }

    private fun dismissMissBottomSheet() {
        binding.closeBottomSheet.setOnClickListener {
            dismiss()
        }
    }

    override fun getTheme() = R.style.BottomSheetDialog

    fun newInstance(): OptForSubstituteBottomSheet {
        return OptForSubstituteBottomSheet()
    }
}