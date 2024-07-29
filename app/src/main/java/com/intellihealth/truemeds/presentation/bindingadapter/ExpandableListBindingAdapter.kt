package com.intellihealth.truemeds.presentation.bindingadapter

import android.app.Application
import androidx.databinding.BindingAdapter
import com.intellihealth.truemeds.presentation.adapter.ExpandableListAdapter
import com.intellihealth.truemeds.presentation.utils.NoScrollExListView
import com.intellihealth.truemeds.presentation.viewmodel.PaymentOptionsViewModel


@BindingAdapter("listDataHeader", "listDataChildMap", "viewModel")
fun setFaqCategoryList(
    noScrollExListView: NoScrollExListView,
    listDataHeader: List<String>,
    listDataChildMap: HashMap<String, List<String>>,
    viewModel: PaymentOptionsViewModel
) {
    val expandableListAdapter = ExpandableListAdapter(
        listDataHeader,
        listDataChildMap, viewModel
    )
    noScrollExListView.setAdapter(expandableListAdapter)
}
