package com.intellihealth.truemeds.presentation.bindingadapter

import android.view.View
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import com.intellihealth.salt.constants.InputFieldConstants
import com.intellihealth.salt.views.TextView
import com.intellihealth.salt.views.chip.Chip
import com.intellihealth.salt.views.edittext.InputFieldLayout
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData

@BindingAdapter("setErrorMessage")
fun setErrorMessage(
    view: InputFieldLayout,
    errorModel: ErrorMessageData?
) {
    if(errorModel!=null) {
        if (errorModel.errorStatus == InputFieldConstants.STATE_PRE_FIELD) {
            view.setUpState(errorModel.errorStatus)
        } else {
            view.setUpState(errorModel.errorStatus)
            if (!errorModel.message.isNullOrBlank())
                view.setHelperText(errorModel.message?:"", errorModel.errorStatus)
        }
    }
}

@BindingAdapter("setChipErrorMessage")
fun setChipErrorMessage(
    view: TextView,
    errorModel: ErrorMessageData
) {
    if(errorModel.errorStatus == InputFieldConstants.STATE_ERROR) {view.text = errorModel.message} else {view.text = ""}
    view.requestFocus()
    view.requestFocus(0)
}

@BindingAdapter("setPinErrorMessage")
fun setPinErrorMessage(
    view: TextView,
    errorModel: ErrorMessageData
) {
    if(errorModel.errorStatus == InputFieldConstants.STATE_ERROR) {
        view.visibility = View.VISIBLE
        view.text = errorModel.message
        view.requestFocus()
        view.requestFocus(0)
        view.setTextColor(ContextCompat.getColor(view.context, com.intellihealth.salt.R.color.tm_core_color_red_500))
    } else if(errorModel.errorStatus == InputFieldConstants.STATE_SUCCESS) {
        view.visibility = View.VISIBLE
        view.text = errorModel.message
        view.setTextColor(ContextCompat.getColor(view.context, com.intellihealth.salt.R.color.tm_core_color_green_500))
    }else if(errorModel.errorStatus == InputFieldConstants.STATE_WARNING) {
        view.visibility = View.VISIBLE
        view.text = errorModel.message
        view.setTextColor(ContextCompat.getColor(view.context,com.intellihealth.salt.R.color.tm_semantic_color_content_warning_default))
    }
    else {
        view.visibility = View.GONE
    }
}

@BindingAdapter("setErrorMessageForPin")
fun setErrorMessageForPin(
    view: InputFieldLayout,
    errorModel: ErrorMessageData
) {
    view.setUpState(errorModel.errorStatus)
}
