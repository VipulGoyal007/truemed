package com.intellihealth.truemeds.presentation.bindingadapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0007\u001a*\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\u000b"}, d2 = {"setHealthArticleCategoryList", "", "view", "Landroidx/recyclerview/widget/RecyclerView;", "list", "", "Lcom/intellihealth/truemeds/data/model/home/CategoryListModel;", "viewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/HealthArticlesViewModel;", "setHealthArticleList", "Lcom/intellihealth/truemeds/presentation/model/BlogCardModel;", "app_stageAndroidDebug"})
public final class HealthArticleCategoryBindingAdapterKt {
    
    @androidx.databinding.BindingAdapter(value = {"setHealthArticleList", "healthArticlesViewModel"})
    public static final void setHealthArticleList(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView view, @org.jetbrains.annotations.Nullable()
    java.util.List<com.intellihealth.truemeds.presentation.model.BlogCardModel> list, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.HealthArticlesViewModel viewModel) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"setHealthArticleCategoryList", "healthArticlesCategoryViewModel"})
    public static final void setHealthArticleCategoryList(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView view, @org.jetbrains.annotations.Nullable()
    java.util.List<com.intellihealth.truemeds.data.model.home.CategoryListModel> list, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.HealthArticlesViewModel viewModel) {
    }
}