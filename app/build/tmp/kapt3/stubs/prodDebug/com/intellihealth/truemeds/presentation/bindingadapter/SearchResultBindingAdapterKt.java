package com.intellihealth.truemeds.presentation.bindingadapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a.\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007\u001a\u0018\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007\u00a8\u0006\u000f"}, d2 = {"setSearchResulList", "", "view", "Landroidx/recyclerview/widget/RecyclerView;", "list", "", "Lcom/intellihealth/truemeds/presentation/model/ProductInfoModel;", "viewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/SearchViewModel;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "startStopAnimation", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "isStart", "", "app_prodDebug"})
public final class SearchResultBindingAdapterKt {
    
    @androidx.databinding.BindingAdapter(value = {"setSearchResulList", "viewmodel", "fragmentManager"})
    public static final void setSearchResulList(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView view, @org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> list, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.SearchViewModel viewModel, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager fragmentManager) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"startStopAnimation"})
    public static final void startStopAnimation(@org.jetbrains.annotations.NotNull()
    com.facebook.shimmer.ShimmerFrameLayout view, boolean isStart) {
    }
}