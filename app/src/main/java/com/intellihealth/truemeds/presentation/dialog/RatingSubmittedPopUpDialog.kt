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
import com.intellihealth.truemeds.databinding.DialogRoundedCornerBinding
import com.intellihealth.truemeds.presentation.callbacks.PopUpDialogCallback
import com.intellihealth.salt.utils.toPx
import com.intellihealth.truemeds.databinding.DialogRatingSubmittedBinding
import com.intellihealth.truemeds.presentation.callbacks.RatingSubmittedDialogCallback

class RatingSubmittedPopUpDialog( val callback: RatingSubmittedDialogCallback) : DialogFragment() {
    private lateinit var binding: DialogRatingSubmittedBinding

    override fun getTheme() = R.style.RoundedCornersDialog

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.dialog_rating_submitted, container, false)
        setListener()
        return binding.root
    }

    private fun setListener() {

        binding.ivClose.setOnClickListener {
            if (dialog?.isShowing == true) dialog?.dismiss()
            callback.onCloseButtonClicked()
        }

        binding.btnOk.setOnClickListener {
            if (dialog?.isShowing == true) dialog?.dismiss()
            callback.onCloseButtonClicked()
        }

    }

}