package com.intellihealth.truemeds.presentation.bindingadapter

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.truemeds.data.model.cancelorder.CancelReasonResponse
import com.intellihealth.truemeds.presentation.adapter.CancelOrderReasonAdapter
import com.intellihealth.truemeds.presentation.viewmodel.CancelOrderViewModel

@BindingAdapter("setCancelOrderReasonList", "viewModel")
fun setCancelOrderReasonList(
    view: RecyclerView,
    list: List<CancelReasonResponse.Reason?>?,
    viewModel: CancelOrderViewModel
) {
    view.adapter?.run {
        //notify
        if (this is CancelOrderReasonAdapter) {
            this.cancelOrderReasonList = list!!
            this.viewModel = viewModel
            this.notifyDataSetChanged()
        }
    } ?: run {
        view.adapter = list?.let {
            CancelOrderReasonAdapter(it, viewModel)
        }
    }
}