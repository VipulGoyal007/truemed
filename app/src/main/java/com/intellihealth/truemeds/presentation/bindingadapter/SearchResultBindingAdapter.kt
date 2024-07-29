package com.intellihealth.truemeds.presentation.bindingadapter

import androidx.databinding.BindingAdapter
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView
import com.facebook.shimmer.ShimmerFrameLayout
import com.intellihealth.truemeds.presentation.adapter.SearchResultAdapter
import com.intellihealth.truemeds.presentation.model.ProductInfoModel
import com.intellihealth.truemeds.presentation.viewmodel.SearchViewModel

@BindingAdapter("setSearchResulList", "viewmodel", "fragmentManager")
fun setSearchResulList(
    view: RecyclerView,
    list: MutableList<ProductInfoModel>,
    viewModel: SearchViewModel,
    fragmentManager: FragmentManager
) {
    view.adapter?.run {
        //notify
        if (this is SearchResultAdapter) {
            this.items = list.toList()
            this.viewmodel = viewmodel
//            this.setHasStableIds(true)
            this.notifyDataSetChanged()
        }
    } ?: run {
        view.adapter = SearchResultAdapter(list, viewModel, fragmentManager)
        view.setHasFixedSize(true)
//        view.adapter?.setHasStableIds(true)
    }
}

@BindingAdapter("startStopAnimation")
fun startStopAnimation(
    view: ShimmerFrameLayout,
    isStart: Boolean
) {
    if (isStart) {
        view.startShimmerAnimation()
    } else {
        view.stopShimmerAnimation()
    }
}
