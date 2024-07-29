package com.intellihealth.truemeds.presentation.bindingadapter

import android.graphics.Color
import android.graphics.Typeface
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import androidx.appcompat.widget.AppCompatTextView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.salt.constants.CustomTypefaceSpan
import com.intellihealth.salt.models.TmOrderStatusCardModel
import com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel
import com.intellihealth.truemeds.presentation.adapter.MyOrdersAdapter
import com.intellihealth.truemeds.presentation.model.DeliveredOrders
import com.intellihealth.truemeds.presentation.viewmodel.OrdersTabViewModel

@BindingAdapter("setMyOrdersList", "viewmodel")
fun setMyOrdersList(
    view: RecyclerView,
    list: MutableList<AllCustomersOrdersResponseModel.ResponseData.Orders>,
    viewModel: OrdersTabViewModel
) {
    view.adapter?.run {
        //notify
        if (this is MyOrdersAdapter) {
            this.items = list
            this.viewmodel = viewModel
            this.notifyDataSetChanged()
        }
    } ?: run {
        view.adapter = MyOrdersAdapter(list, viewModel)
    }
}

@BindingAdapter("commonBindingForSpanText", "spanString")
fun commonBindingForSpanText(view: AppCompatTextView, input: String?, spanString: String?) {

    if (input == null || spanString == null) return

    val fontBold: Typeface =
        Typeface.createFromAsset(view.context.assets, "plus_jakarta_sans_bold.ttf")

    val spannableString = SpannableString(input)

    // Find the start and end index of spanString in input
    val start = input.indexOf(spanString)
    val end = start + spanString.length

    // Apply style (color and font style) to spanString
    spannableString.setSpan(ForegroundColorSpan(Color.parseColor("#178755")), start, end, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
    spannableString.setSpan(CustomTypefaceSpan("", fontBold), start, end, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)

    view.setText(spannableString)

}


@BindingAdapter("commonBindingForSpanTextWithOutColor", "spanString")
fun commonBindingForSpanTextWithOutColor(view: AppCompatTextView, input: String?, spanString: String?) {

    if (input == null || spanString == null) return

    val fontBold: Typeface =
        Typeface.createFromAsset(view.context.assets, "plus_jakarta_sans_bold.ttf")

    val spannableString = SpannableString(input)

    // Find the start and end index of spanString in input
    val start = input.indexOf(spanString)
    val end = start + spanString.length

    // Apply style (color and font style) to spanString
    spannableString.setSpan(CustomTypefaceSpan("", fontBold), start, end, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)

    view.setText(spannableString)

}
