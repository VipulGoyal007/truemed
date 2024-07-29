package com.intellihealth.truemeds.presentation.dialog

import android.os.Bundle
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.DialogFragment
import com.intellihealth.salt.utils.toPx
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.callback.ChooseLocationCallback
import com.intellihealth.truemeds.data.model.home.PopUpModel
import com.intellihealth.truemeds.databinding.DialogRoundedCornerBinding
import com.intellihealth.truemeds.presentation.callbacks.PopUpDialogCallback

class PopUpDialog() : DialogFragment() {
    private lateinit var binding: DialogRoundedCornerBinding
    private var model: PopUpModel?=null
    private var callback: PopUpDialogCallback?=null

    constructor(model: PopUpModel,callback: PopUpDialogCallback) : this(){
        this.model = model
        this.callback = callback
    }

    override fun getTheme() = R.style.RoundedCornersDialog

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.dialog_rounded_corner, container, false)
        binding.model = model
        binding.callback = callback
        setListener()
        return binding.root
    }


    private fun setListener() {
        if((model?.icon ?: 0) <= 0){
            binding.ivPopup.visibility = View.GONE
        }else{
            binding.ivPopup.visibility = View.VISIBLE
            binding.ivPopup.setImageDrawable(ContextCompat.getDrawable(requireContext(), model?.icon?:0))
        }


        if (model?.isSpannableText == true) binding.tvSpanMessage.text = Html.fromHtml(model?.spannableText)
        if (model?.buttonText == null){
            val header = binding.tvHeader.layoutParams as ConstraintLayout.LayoutParams
            header.width = 294.toPx
            binding.tvHeader.layoutParams = header
        }

        binding.ivClose.setOnClickListener {
            if (dialog?.isShowing == true) dialog?.dismiss()
            callback?.onCloseButtonClicked()
        }

        binding.btnAction.setOnClickListener {
            if (dialog?.isShowing == true) dialog?.dismiss()
            callback?.onActionButtonClicked()
        }
        dialog?.setOnCancelListener {
            callback?.onDismissOutside()
        }
        dialog?.setCancelable(model?.showCloseButton==true)
    }

    private fun setOutsideClickListener() {
        val decorView = dialog!!.window!!.decorView
        decorView.setOnClickListener {
            // Handle outside click
            dismiss()
        }
    }

}