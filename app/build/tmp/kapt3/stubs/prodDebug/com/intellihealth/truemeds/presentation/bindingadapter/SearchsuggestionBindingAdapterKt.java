package com.intellihealth.truemeds.presentation.bindingadapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007\u001a$\u0010\u0006\u001a\u00020\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0007\u001a&\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007\u001a&\u0010\u0013\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007\u001a&\u0010\u0014\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00150\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007\u001a&\u0010\u0016\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00170\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007\u00a8\u0006\u0018"}, d2 = {"setImageFromArrayUrl", "", "imgVw", "Landroidx/appcompat/widget/AppCompatImageView;", "imgUrl", "", "setMedicineNameWithHighlight", "textView", "Landroidx/appcompat/widget/AppCompatTextView;", "data", "searchText", "setPreviousHistoryList", "view", "Landroidx/recyclerview/widget/RecyclerView;", "list", "", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/RecentMedicine;", "viewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/SearchViewModel;", "setRecentHistoryList", "setSearchSuggestionList", "Lcom/intellihealth/truemeds/data/model/search/SuggestionWithType;", "setTrendingList", "Lcom/intellihealth/truemeds/data/model/search/TrendingSearchResponse$TrendingSearch;", "app_prodDebug"})
public final class SearchsuggestionBindingAdapterKt {
    
    @androidx.databinding.BindingAdapter(value = {"setRecentHistoryList", "viewmodel"})
    public static final void setRecentHistoryList(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView view, @org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.RecentMedicine> list, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.SearchViewModel viewModel) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"setTrendingList", "viewmodel"})
    public static final void setTrendingList(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView view, @org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.search.TrendingSearchResponse.TrendingSearch> list, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.SearchViewModel viewModel) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"name", "search"})
    public static final void setMedicineNameWithHighlight(@org.jetbrains.annotations.Nullable()
    androidx.appcompat.widget.AppCompatTextView textView, @org.jetbrains.annotations.Nullable()
    java.lang.String data, @org.jetbrains.annotations.NotNull()
    java.lang.String searchText) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"setPreviousHistoryList", "viewmodel"})
    public static final void setPreviousHistoryList(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView view, @org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.RecentMedicine> list, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.SearchViewModel viewModel) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"setSearchSuggestionList", "viewmodel"})
    public static final void setSearchSuggestionList(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView view, @org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.search.SuggestionWithType> list, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.SearchViewModel viewModel) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"setImageFromArrayUrl"})
    public static final void setImageFromArrayUrl(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatImageView imgVw, @org.jetbrains.annotations.Nullable()
    java.lang.String imgUrl) {
    }
}