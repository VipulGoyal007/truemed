package com.intellihealth.truemeds.presentation.bottomsheet.cart

import android.app.Dialog
import android.graphics.Color
import android.graphics.Typeface
import android.os.Build
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.text.style.RelativeSizeSpan
import android.text.style.StyleSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.intellihealth.salt.constants.CustomTypefaceSpan
import com.intellihealth.salt.models.BottomsheetHeaderModel
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.callback.ChooseLocationCallback
import com.intellihealth.truemeds.databinding.BottomsheetSwitchBackOgBinding
import com.intellihealth.truemeds.presentation.model.ProductInfoModel
import com.intellihealth.truemeds.presentation.utils.applyTryCatch
import com.intellihealth.truemeds.presentation.viewmodel.CartViewModel

class SwitchBackOgBottomSheet() : BottomSheetDialogFragment() {
    private lateinit var dialog: BottomSheetDialog
    private lateinit var binding: BottomsheetSwitchBackOgBinding
    private lateinit var bottomSheetHeaderModel: BottomsheetHeaderModel
    private lateinit var viewModel: CartViewModel
    private var productInfoModel:ProductInfoModel? = null
    private var savingPercent: String?=""

    constructor(productInfoModel: ProductInfoModel, savingPercent: String) : this(){
        this.productInfoModel = productInfoModel
        this.savingPercent = savingPercent
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.bottomsheet_switch_back_og, container, false)
        viewModel = ViewModelProvider(requireActivity())[CartViewModel::class.java]

//        binding.viewmodel = viewModel

        binding.productInfoModel = productInfoModel
        binding.savingPercent = savingPercent
        
        binding.lifecycleOwner = viewLifecycleOwner

        setListener()
        setHeaderText()
        return binding.root
    }

    private fun setHeaderText()= applyTryCatch {
//        Substitutes are safe
        //val fontSemiBold = resources.getFont(R.font.plus_jakarta_sans_semi_bold)
        val fontSemiBold =
            Typeface.createFromAsset(context?.assets, "plus_jakarta_sans_semi_bold.ttf")
        val stringBuilder = SpannableStringBuilder()
        stringBuilder.append("You ")
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

        stringBuilder.append("saved ${productInfoModel?.product?.subsSavingPercentage}")
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
        binding.tvHeader.text = stringBuilder
    }

    private fun setListener() {
        binding.ivClose.setOnClickListener {
            if (dialog.isShowing) dialog.dismiss()
        }

        binding.btnOkay.setOnClickListener {
            if (dialog.isShowing) dialog.dismiss()
        }
        binding.btnSwitchBackOg.setOnClickListener {
            viewModel.loaderValue.postValue(true)
            viewModel.onReplaceSwitchSingleMedicine(productInfoModel, false)
            dismiss()
        }
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        bottomSheetHeaderModel = BottomsheetHeaderModel(closeIcon = null, header = null, subHeader = null, icon = null, showIcon = false, showViewDragHandle = true, height = 65, bottomSheetState = 4)
        dialog = BottomSheetDialog(requireContext(), theme)
        return dialog
    }

    override fun getTheme() = R.style.BottomSheetDialog
}