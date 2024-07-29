package com.intellihealth.truemeds.presentation.bindingadapter

import android.view.View
import androidx.core.view.isVisible
import androidx.databinding.BindingAdapter
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.salt.views.section.ProductCardSection
import com.intellihealth.truemeds.presentation.adapter.DoctorPrescriptionOrderSummaryAdapter
import com.intellihealth.truemeds.presentation.adapter.OrderSummaryAdapter
import com.intellihealth.truemeds.presentation.callbacks.ViewPrescriptionCallback
import com.intellihealth.truemeds.presentation.viewmodel.CartViewModel
import com.intellihealth.truemeds.presentation.viewmodel.OrderSummaryViewModel

/*@BindingAdapter("setOrderSummaryCartList", "viewmodel")
fun setOrderSummaryCartList(
    view: RecyclerView,
    list: MutableList<ProductInfoModel>,
    viewModel: OrderSummaryViewModel
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
}*/

@BindingAdapter("setOrderSummaryCartList", "viewmodel", "fragmentManager")
fun setOrderSummaryCartList(
    view: RecyclerView,
    list: List<com.intellihealth.truemeds.presentation.model.ProductInfoModel>,
    viewModel: CartViewModel,
    fragmentManager: FragmentManager
) {
    view.adapter?.run {
        if (this is OrderSummaryAdapter) {
            this.items = list
            this.viewmodel = viewModel
            this.notifyDataSetChanged()
        }
    } ?: run {
        val adapter = OrderSummaryAdapter(list, viewModel, fragmentManager)
        adapter.setHasStableIds(true)
        view.adapter = adapter
    }
}


@BindingAdapter("updateSubHeading")
fun updateSubHeading(view: ProductCardSection?, freeValue: String?) {
    if (view?.isVisible == true) {
        if (!freeValue.isNullOrEmpty()) view.updateSubHeading(freeValue)
        else {
            view.updateSubHeading("")
        }
    }
}

@BindingAdapter(value = ["setPrescriptionListOrderSummary", "viewmodel", "prescriptionCallback"])
fun setPrescriptionListOrderSummary(
    view: RecyclerView,
    list: List<String>,
    viewModel: OrderSummaryViewModel,
    callback: ViewPrescriptionCallback
) {
    view.adapter?.run {
        if (this is DoctorPrescriptionOrderSummaryAdapter) {
            this.items = list
            this.notifyDataSetChanged()
        }
    } ?: run {
        view.adapter = DoctorPrescriptionOrderSummaryAdapter(list,callback, viewModel,true)
    }
}
