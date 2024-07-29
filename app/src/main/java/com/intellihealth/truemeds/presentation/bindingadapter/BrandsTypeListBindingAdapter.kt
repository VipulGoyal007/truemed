package com.intellihealth.truemeds.presentation.bindingadapter

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.truemeds.data.model.user.GetAllBrandsTypeResponse
import com.intellihealth.truemeds.presentation.adapter.BrandsTypeAdapter
import com.intellihealth.truemeds.presentation.viewmodel.MyOrderViewModel

@BindingAdapter("setBrandsTypeList", "viewmodel")
fun setBrandsTypeList(
    view: RecyclerView,
    list: MutableList<GetAllBrandsTypeResponse.BrandType?>,
    viewModel: MyOrderViewModel
) {
    view.adapter?.run {
        //notify
        if (this is BrandsTypeAdapter) {
            this.items = list
            this.viewmodel = viewModel
            this.notifyDataSetChanged()
        }
    } ?: run {
        view.adapter = BrandsTypeAdapter(list, viewModel)
    }
}


