package com.intellihealth.truemeds.presentation.bindingadapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007\u001a \u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007\u00a8\u0006\f"}, d2 = {"setHealthArticleSuggestionList", "", "view", "Landroidx/recyclerview/widget/RecyclerView;", "list", "Lcom/intellihealth/truemeds/data/model/home/BlogSectionDataModel;", "healthArticlesViewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/HealthArticlesViewModel;", "setSubTitle", "Lcom/intellihealth/salt/views/TextView;", "subTitle", "", "app_prodDebug"})
public final class HealthArticleBindingAdapterKt {
    
    @androidx.databinding.BindingAdapter(value = {"setSubTitle", "healthArticlesViewModel"})
    public static final void setSubTitle(@org.jetbrains.annotations.NotNull()
    com.intellihealth.salt.views.TextView view, @org.jetbrains.annotations.NotNull()
    java.lang.String subTitle, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.HealthArticlesViewModel healthArticlesViewModel) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"setHealthArticleSuggestionList", "healthArticlesViewModel"})
    public static final void setHealthArticleSuggestionList(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView view, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.BlogSectionDataModel list, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.HealthArticlesViewModel healthArticlesViewModel) {
    }
}