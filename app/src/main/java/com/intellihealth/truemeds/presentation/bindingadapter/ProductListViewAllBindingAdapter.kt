package com.intellihealth.truemeds.presentation.bindingadapter

import androidx.databinding.BindingAdapter
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.salt.callbacks.ProductCardCallback
import com.intellihealth.truemeds.presentation.adapter.ProductListViewAllAdapter
import com.intellihealth.truemeds.presentation.model.ProductInfoModel
import com.intellihealth.truemeds.presentation.viewmodel.ProductListViewAllViewModel

@BindingAdapter("setProductListViewAllList", "viewModel","productCardCallback","fragmentManager")
fun setProductListViewAllList(
    view: RecyclerView,
    list: List<ProductInfoModel> = emptyList<ProductInfoModel>(),
    viewModel: ProductListViewAllViewModel,
    productCardCallback: ProductCardCallback,
    fragmentManager: FragmentManager
) {
    view.adapter?.run {
        //notify
        if (this is ProductListViewAllAdapter) {
            this.items = list
            this.viewmodel = viewModel
            this.notifyDataSetChanged()
        }
    } ?: run {
        view.adapter = ProductListViewAllAdapter(list, viewModel,productCardCallback,fragmentManager)
        view.setHasFixedSize(true)
    }
}


