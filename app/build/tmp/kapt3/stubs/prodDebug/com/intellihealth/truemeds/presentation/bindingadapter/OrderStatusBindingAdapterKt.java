package com.intellihealth.truemeds.presentation.bindingadapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0007\u001a\u0018\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007\u00a8\u0006\r"}, d2 = {"setModificationItemList", "", "view", "Landroidx/recyclerview/widget/RecyclerView;", "list", "", "Lcom/intellihealth/truemeds/data/model/orderstatus/ModificationItem;", "viewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/OrderStatusViewModel;", "setNotificationType", "Lcom/intellihealth/salt/views/StickyNonStickyNotification;", "type", "Lcom/intellihealth/salt/models/NotificationType;", "app_prodDebug"})
public final class OrderStatusBindingAdapterKt {
    
    @androidx.databinding.BindingAdapter(value = {"setModificationItemList", "viewmodel"})
    public static final void setModificationItemList(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView view, @org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.orderstatus.ModificationItem> list, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.OrderStatusViewModel viewModel) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"setNotificationType"})
    public static final void setNotificationType(@org.jetbrains.annotations.NotNull()
    com.intellihealth.salt.views.StickyNonStickyNotification view, @org.jetbrains.annotations.NotNull()
    com.intellihealth.salt.models.NotificationType type) {
    }
}