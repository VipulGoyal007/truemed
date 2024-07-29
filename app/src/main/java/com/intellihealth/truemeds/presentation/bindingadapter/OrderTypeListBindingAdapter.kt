package com.intellihealth.truemeds.presentation.bindingadapter

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.truemeds.data.model.orderflow.OrderTypeResponse
import com.intellihealth.truemeds.presentation.adapter.OrderTypeAdapter
import com.intellihealth.truemeds.presentation.viewmodel.OrdersTabViewModel

@BindingAdapter("setOrderTypeList", "viewmodel")
fun setOrderTypeList(
        view: RecyclerView,
        list: MutableList<OrderTypeResponse.OrderType?>,
        viewModel: OrdersTabViewModel
) {
    view.adapter?.run {
        //notify
        if (this is OrderTypeAdapter) {
            this.items = list
            this.viewmodel = viewModel
            this.notifyDataSetChanged()
        }
    } ?: run {
        view.adapter = OrderTypeAdapter(list, viewModel)
    }

}


