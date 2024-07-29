package com.intellihealth.truemeds.presentation.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\"B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u001c\u0010\u001a\u001a\u00020\u001b2\n\u0010\u001c\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0019H\u0016J\u001c\u0010\u001e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0019H\u0016R\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006#"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/HealthArticleCategoryItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/intellihealth/truemeds/presentation/adapter/HealthArticleCategoryItemAdapter$HealthArticlesCategoryMyViewHolder;", "list", "", "Lcom/intellihealth/truemeds/data/model/home/CategoryListModel;", "viewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/HealthArticlesViewModel;", "(Ljava/util/List;Lcom/intellihealth/truemeds/presentation/viewmodel/HealthArticlesViewModel;)V", "binding", "Lcom/intellihealth/truemeds/databinding/HealthArticleBottomsheetItemBinding;", "getBinding", "()Lcom/intellihealth/truemeds/databinding/HealthArticleBottomsheetItemBinding;", "setBinding", "(Lcom/intellihealth/truemeds/databinding/HealthArticleBottomsheetItemBinding;)V", "healthArticlesCategoryList", "getHealthArticlesCategoryList", "()Ljava/util/List;", "setHealthArticlesCategoryList", "(Ljava/util/List;)V", "getViewModel", "()Lcom/intellihealth/truemeds/presentation/viewmodel/HealthArticlesViewModel;", "setViewModel", "(Lcom/intellihealth/truemeds/presentation/viewmodel/HealthArticlesViewModel;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "HealthArticlesCategoryMyViewHolder", "app_stageAndroidDebug"})
public final class HealthArticleCategoryItemAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.intellihealth.truemeds.presentation.adapter.HealthArticleCategoryItemAdapter.HealthArticlesCategoryMyViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.presentation.viewmodel.HealthArticlesViewModel viewModel;
    public com.intellihealth.truemeds.databinding.HealthArticleBottomsheetItemBinding binding;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.intellihealth.truemeds.data.model.home.CategoryListModel> healthArticlesCategoryList;
    
    public HealthArticleCategoryItemAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.home.CategoryListModel> list, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.HealthArticlesViewModel viewModel) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.viewmodel.HealthArticlesViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.HealthArticlesViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.databinding.HealthArticleBottomsheetItemBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.databinding.HealthArticleBottomsheetItemBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.truemeds.data.model.home.CategoryListModel> getHealthArticlesCategoryList() {
        return null;
    }
    
    public final void setHealthArticlesCategoryList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.home.CategoryListModel> p0) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.adapter.HealthArticleCategoryItemAdapter.HealthArticlesCategoryMyViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.intellihealth.truemeds.presentation.adapter.HealthArticleCategoryItemAdapter.HealthArticlesCategoryMyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/HealthArticleCategoryItemAdapter$HealthArticlesCategoryMyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/intellihealth/truemeds/databinding/HealthArticleBottomsheetItemBinding;", "(Lcom/intellihealth/truemeds/presentation/adapter/HealthArticleCategoryItemAdapter;Lcom/intellihealth/truemeds/databinding/HealthArticleBottomsheetItemBinding;)V", "bindingCategoryData", "", "position", "", "data", "Lcom/intellihealth/truemeds/data/model/home/CategoryListModel;", "viewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/HealthArticlesViewModel;", "app_stageAndroidDebug"})
    public final class HealthArticlesCategoryMyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.intellihealth.truemeds.databinding.HealthArticleBottomsheetItemBinding binding = null;
        
        public HealthArticlesCategoryMyViewHolder(@org.jetbrains.annotations.NotNull()
        com.intellihealth.truemeds.databinding.HealthArticleBottomsheetItemBinding binding) {
            super(null);
        }
        
        public final void bindingCategoryData(int position, @org.jetbrains.annotations.NotNull()
        com.intellihealth.truemeds.data.model.home.CategoryListModel data, @org.jetbrains.annotations.NotNull()
        com.intellihealth.truemeds.presentation.viewmodel.HealthArticlesViewModel viewModel) {
        }
    }
}