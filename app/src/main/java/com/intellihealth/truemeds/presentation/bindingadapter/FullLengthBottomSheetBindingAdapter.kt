package com.intellihealth.truemeds.presentation.bindingadapter

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.truemeds.presentation.adapter.ReplaceAllBottomSheetAdapter
import com.intellihealth.truemeds.presentation.adapter.ReplaceAllCompanyBottomSheetAdapter
import com.intellihealth.truemeds.presentation.model.ProductInfoModel
import com.intellihealth.truemeds.presentation.viewmodel.CartViewModel

@BindingAdapter("setReplaceAllList", "viewmodel")
fun setReplaceAllList(
    view: RecyclerView,
    list: List<ProductInfoModel>,
    viewModel: CartViewModel,
) {
    view.adapter?.run {
        //notify
        if (this is ReplaceAllBottomSheetAdapter) {
            this.items = list.toList()
            this.viewmodel = viewmodel
//            this.setHasStableIds(true)
            this.notifyDataSetChanged()
        }
    } ?: run {
        view.adapter = ReplaceAllBottomSheetAdapter(list, viewModel)
//        view.adapter?.setHasStableIds(true)
    }
}

@BindingAdapter("setImageUrls")
fun setImageUrls(
    view: RecyclerView,
    list: List<String>?
) {
    view.adapter?.run {
        //notify
        if (this is ReplaceAllCompanyBottomSheetAdapter) {
            this.items = (list?: emptyList()).toList()
            this.notifyDataSetChanged()
        }
    } ?: run {
        view.adapter = ReplaceAllCompanyBottomSheetAdapter(list)
    }
}
