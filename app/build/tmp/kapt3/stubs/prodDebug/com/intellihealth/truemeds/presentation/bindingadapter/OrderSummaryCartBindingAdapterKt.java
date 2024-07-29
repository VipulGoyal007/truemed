package com.intellihealth.truemeds.presentation.bindingadapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a.\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007\u001a.\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\u0006\u0010\u0007\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007\u001a\u001c\u0010\u0010\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\fH\u0007\u00a8\u0006\u0013"}, d2 = {"setOrderSummaryCartList", "", "view", "Landroidx/recyclerview/widget/RecyclerView;", "list", "", "Lcom/intellihealth/truemeds/presentation/model/ProductInfoModel;", "viewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/CartViewModel;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "setPrescriptionListOrderSummary", "", "Lcom/intellihealth/truemeds/presentation/viewmodel/OrderSummaryViewModel;", "callback", "Lcom/intellihealth/truemeds/presentation/callbacks/ViewPrescriptionCallback;", "updateSubHeading", "Lcom/intellihealth/salt/views/section/ProductCardSection;", "freeValue", "app_prodDebug"})
public final class OrderSummaryCartBindingAdapterKt {
    
    @androidx.databinding.BindingAdapter(value = {"setOrderSummaryCartList", "viewmodel", "fragmentManager"})
    public static final void setOrderSummaryCartList(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView view, @org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> list, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.CartViewModel viewModel, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager fragmentManager) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"updateSubHeading"})
    public static final void updateSubHeading(@org.jetbrains.annotations.Nullable()
    com.intellihealth.salt.views.section.ProductCardSection view, @org.jetbrains.annotations.Nullable()
    java.lang.String freeValue) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"setPrescriptionListOrderSummary", "viewmodel", "prescriptionCallback"})
    public static final void setPrescriptionListOrderSummary(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView view, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> list, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.OrderSummaryViewModel viewModel, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.callbacks.ViewPrescriptionCallback callback) {
    }
}