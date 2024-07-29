package com.intellihealth.truemeds.presentation.bindingadapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007\u001a$\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007\u001a&\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0007\u00a8\u0006\u000f"}, d2 = {"commonBindingForSpanText", "", "view", "Landroidx/appcompat/widget/AppCompatTextView;", "input", "", "spanString", "commonBindingForSpanTextWithOutColor", "setMyOrdersList", "Landroidx/recyclerview/widget/RecyclerView;", "list", "", "Lcom/intellihealth/truemeds/data/model/home/AllCustomersOrdersResponseModel$ResponseData$Orders;", "viewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/OrdersTabViewModel;", "app_stageAndroidDebug"})
public final class MyOrdersListBindingAdapterKt {
    
    @androidx.databinding.BindingAdapter(value = {"setMyOrdersList", "viewmodel"})
    public static final void setMyOrdersList(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView view, @org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel.ResponseData.Orders> list, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.OrdersTabViewModel viewModel) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"commonBindingForSpanText", "spanString"})
    public static final void commonBindingForSpanText(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatTextView view, @org.jetbrains.annotations.Nullable()
    java.lang.String input, @org.jetbrains.annotations.Nullable()
    java.lang.String spanString) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"commonBindingForSpanTextWithOutColor", "spanString"})
    public static final void commonBindingForSpanTextWithOutColor(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatTextView view, @org.jetbrains.annotations.Nullable()
    java.lang.String input, @org.jetbrains.annotations.Nullable()
    java.lang.String spanString) {
    }
}