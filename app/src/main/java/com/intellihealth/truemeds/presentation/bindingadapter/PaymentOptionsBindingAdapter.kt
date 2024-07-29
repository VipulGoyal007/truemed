package com.intellihealth.truemeds.presentation.bindingadapter

import android.util.Log
import android.view.View
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse
import com.intellihealth.truemeds.presentation.adapter.PaymentOptionsAdapter
import com.intellihealth.truemeds.presentation.utils.CommonFunc
import com.intellihealth.truemeds.presentation.viewmodel.PaymentOptionsViewModel


@BindingAdapter(value = ["setPaymentOptions", "viewmodel"])
fun setPaymentOptions(
    view: RecyclerView,
    list: MutableList<PaymentMethodResponse.ResponseData>,
    viewModel: PaymentOptionsViewModel
) {
    view.adapter?.run {
        //notify
        if (this is PaymentOptionsAdapter) {
            if (viewModel.payableAmountButtonText && viewModel.isPaymentSpecificCoupon) {
                var targetHeight = 0
                Log.i("adapterlist",""+list)
                if (list.size > 2) {
                    val matchParentMeasureSpec = View.MeasureSpec.makeMeasureSpec(
                        (view.parent as View).width,
                        View.MeasureSpec.EXACTLY
                    )
                    val wrapContentMeasureSpec =
                        View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED)
                    view.measure(matchParentMeasureSpec, wrapContentMeasureSpec)
                    targetHeight = view.measuredHeight
                }


                /*if (list.size > 3) {
                    val params = view.layoutParams
                    params.height = targetHeight
                    view.layoutParams = params
                    CommonFunc.expand(view, list.size - 4, targetHeight)

                }*/

            }
            this.paymentOptionsList = list
            this.viewModel = viewModel
            this.notifyDataSetChanged()
        }
    } ?: run {
        //adapter init
        PaymentOptionsAdapter(list, viewModel).apply {
            setHasStableIds(true)
            view.setHasFixedSize(true)
            view.adapter = this
        }
    }

}
