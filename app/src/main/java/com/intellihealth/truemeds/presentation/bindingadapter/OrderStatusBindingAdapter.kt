package com.intellihealth.truemeds.presentation.bindingadapter

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.salt.models.NotificationType
import com.intellihealth.salt.views.StickyNonStickyNotification
import com.intellihealth.truemeds.data.model.orderstatus.ModificationItem
import com.intellihealth.truemeds.presentation.adapter.ModificationItemAdapter
import com.intellihealth.truemeds.presentation.viewmodel.OrderStatusViewModel

@BindingAdapter("setModificationItemList", "viewmodel")
fun setModificationItemList(
    view: RecyclerView,
    list: List<ModificationItem>,
    viewModel: OrderStatusViewModel
) {
    view.adapter?.run {
        if (this is ModificationItemAdapter) {
            this.items = list
            this.viewmodel = viewmodel
            this.notifyDataSetChanged()
        }
    } ?: run {
        view.adapter = ModificationItemAdapter(list, viewModel)
    }
}

@BindingAdapter("setNotificationType")
fun setNotificationType(
    view: StickyNonStickyNotification,
    type: NotificationType
) {
view.setNotificationType(type)
}
