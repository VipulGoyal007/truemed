package com.intellihealth.truemeds.presentation.bindingadapter

import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.text.style.StrikethroughSpan
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.intellihealth.salt.models.ProductComparisonModel
import com.intellihealth.salt.utils.removeExtraZerosWithValidation
import com.intellihealth.truemeds.R


@BindingAdapter("setMRPValue")
fun setMRPValue(
    view: TextView,
    productComparisonData: ProductComparisonModel,
) {
    val originalString = "MRP ₹${productComparisonData.product.mrp}  ${removeExtraZerosWithValidation(productComparisonData.product.discount)}%OFF"

    val start = originalString.indexOf("₹")
    val start1 = originalString.indexOf("MRP ")
    val end = originalString.indexOf(" ", start) // Find the index of the first space after the MRP value
    val spannableString = SpannableString(originalString)

    spannableString.setSpan(ForegroundColorSpan(view.context.getColor(R.color.light_grey)), 0, end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

    val discountStart = originalString.lastIndexOf(" ", end) + 1 // Find the start index of the discount value
    spannableString.setSpan(ForegroundColorSpan(view.context.getColor(R.color.undo_replace_all_bg)), discountStart, originalString.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE) // -4 to exclude "%OFF"

    spannableString.setSpan(StrikethroughSpan(), start, end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

    view.text = spannableString

}