package com.intellihealth.truemeds.presentation.bindingadapter

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.truemeds.data.model.user.GetAllSubCategoryTypeResponse
import com.intellihealth.truemeds.presentation.adapter.SubCategoryTypeAdapter
import com.intellihealth.truemeds.presentation.viewmodel.MyOrderViewModel

@BindingAdapter("setSubCategoryTypeList", "viewmodel")
fun setSubCategoryTypeList(
    view: RecyclerView,
    list: MutableList<GetAllSubCategoryTypeResponse.SubCategoryType?>,
    viewModel: MyOrderViewModel
) {
    view.adapter?.run {
        //notify
        if (this is SubCategoryTypeAdapter) {
            this.items = list
            this.viewmodel = viewModel
            this.notifyDataSetChanged()
        }
    } ?: run {
        view.adapter = SubCategoryTypeAdapter(list, viewModel)
    }

}


