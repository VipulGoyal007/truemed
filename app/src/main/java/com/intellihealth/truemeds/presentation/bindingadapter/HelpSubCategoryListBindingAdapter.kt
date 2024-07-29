package com.intellihealth.truemeds.presentation.bindingadapter

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.truemeds.data.model.helpfaqtnc.HelpCategoryResponse
import com.intellihealth.truemeds.presentation.adapter.HelpSubCategoryAdapter
import com.intellihealth.truemeds.presentation.viewmodel.HelpViewModel

@BindingAdapter(value = ["setHelpSubCategoryList", "viewmodel"])
fun setHelpSubCategoryList(
    view: RecyclerView,
    list: MutableList<HelpCategoryResponse.CategoryList?>,
    viewModel: HelpViewModel
) {
    view.adapter?.run {
        //notify
        if (this is HelpSubCategoryAdapter) {
            this.items = list
            this.viewmodel = viewModel
            this.notifyDataSetChanged()
        }
    } ?: run {
        view.adapter = HelpSubCategoryAdapter(list, viewModel)
    }
}
