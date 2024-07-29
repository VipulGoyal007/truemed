package com.intellihealth.truemeds.presentation.bindingadapter

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.truemeds.presentation.adapter.OrderSummaryCartAdapter
import com.intellihealth.truemeds.presentation.model.ProductInfoModel
import com.intellihealth.truemeds.presentation.viewmodel.CartViewModel

@BindingAdapter("setItemNoLongerAvailableList", "viewmodel")
fun setItemNoLongerAvailableList(
    view: RecyclerView,
    list: MutableList<ProductInfoModel>,
    viewModel: CartViewModel
) {
    view.adapter?.run {
        if (this is OrderSummaryCartAdapter) {
            this.items = list
            this.viewmodel = viewmodel
            this.notifyDataSetChanged()
        }
    } ?: run {
        view.adapter = OrderSummaryCartAdapter(list, viewModel)
    }
}