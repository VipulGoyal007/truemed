package com.intellihealth.truemeds.presentation.bindingadapter

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.truemeds.data.model.home.ChildCategoryModel
import com.intellihealth.truemeds.presentation.adapter.CategoryTypeAdapter
import com.intellihealth.truemeds.presentation.viewmodel.MyOrderViewModel

@BindingAdapter("setCategoryTypeList", "viewmodel")
fun setCategoryTypeList(
    view: RecyclerView,
    list: MutableList<ChildCategoryModel?>,
    viewModel: MyOrderViewModel
) {
    view.adapter?.run {
        //notify
        if (this is CategoryTypeAdapter) {
            this.items = list
            this.viewmodel = viewModel
            this.notifyDataSetChanged()
        }
    } ?: run {
        view.adapter = CategoryTypeAdapter(list, viewModel)
    }

}


