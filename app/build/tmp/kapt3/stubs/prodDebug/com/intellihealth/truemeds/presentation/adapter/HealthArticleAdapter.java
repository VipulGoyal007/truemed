package com.intellihealth.truemeds.presentation.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003&\'(B\u001d\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001aH\u0016J\u0010\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001aH\u0016J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001aH\u0016J\u0018\u0010\"\u001a\u00020\u00022\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aH\u0016R\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\"\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006)"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/HealthArticleAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemList", "", "Lcom/intellihealth/truemeds/presentation/model/BlogCardModel;", "viewmodel", "Lcom/intellihealth/truemeds/presentation/viewmodel/HealthArticlesViewModel;", "(Ljava/util/List;Lcom/intellihealth/truemeds/presentation/viewmodel/HealthArticlesViewModel;)V", "binding", "Lcom/intellihealth/truemeds/databinding/HealthArticlesItemBinding;", "getBinding", "()Lcom/intellihealth/truemeds/databinding/HealthArticlesItemBinding;", "setBinding", "(Lcom/intellihealth/truemeds/databinding/HealthArticlesItemBinding;)V", "bindingLoad", "Lcom/intellihealth/truemeds/databinding/ProgressBarItemBinding;", "getItemList", "()Ljava/util/List;", "setItemList", "(Ljava/util/List;)V", "getViewmodel", "()Lcom/intellihealth/truemeds/presentation/viewmodel/HealthArticlesViewModel;", "setViewmodel", "(Lcom/intellihealth/truemeds/presentation/viewmodel/HealthArticlesViewModel;)V", "getItemCount", "", "getItemId", "", "position", "getItemViewType", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "ViewHolderOne", "ViewHolderTwo", "app_prodDebug"})
public final class HealthArticleAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.intellihealth.truemeds.presentation.model.BlogCardModel> itemList;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.presentation.viewmodel.HealthArticlesViewModel viewmodel;
    public com.intellihealth.truemeds.databinding.HealthArticlesItemBinding binding;
    private com.intellihealth.truemeds.databinding.ProgressBarItemBinding bindingLoad;
    private static final int VIEW_TYPE_ITEM = 1;
    private static final int VIEW_TYPE_LOADING = 2;
    @org.jetbrains.annotations.NotNull()
    public static final com.intellihealth.truemeds.presentation.adapter.HealthArticleAdapter.Companion Companion = null;
    
    public HealthArticleAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.presentation.model.BlogCardModel> itemList, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.HealthArticlesViewModel viewmodel) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.truemeds.presentation.model.BlogCardModel> getItemList() {
        return null;
    }
    
    public final void setItemList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.presentation.model.BlogCardModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.viewmodel.HealthArticlesViewModel getViewmodel() {
        return null;
    }
    
    public final void setViewmodel(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.HealthArticlesViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.databinding.HealthArticlesItemBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.databinding.HealthArticlesItemBinding p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/HealthArticleAdapter$Companion;", "", "()V", "VIEW_TYPE_ITEM", "", "VIEW_TYPE_LOADING", "app_prodDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/HealthArticleAdapter$ViewHolderOne;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/intellihealth/truemeds/databinding/HealthArticlesItemBinding;", "viewmodel", "Lcom/intellihealth/truemeds/presentation/viewmodel/HealthArticlesViewModel;", "(Lcom/intellihealth/truemeds/databinding/HealthArticlesItemBinding;Lcom/intellihealth/truemeds/presentation/viewmodel/HealthArticlesViewModel;)V", "getBinding", "()Lcom/intellihealth/truemeds/databinding/HealthArticlesItemBinding;", "setBinding", "(Lcom/intellihealth/truemeds/databinding/HealthArticlesItemBinding;)V", "getViewmodel", "()Lcom/intellihealth/truemeds/presentation/viewmodel/HealthArticlesViewModel;", "setViewmodel", "(Lcom/intellihealth/truemeds/presentation/viewmodel/HealthArticlesViewModel;)V", "app_prodDebug"})
    public static final class ViewHolderOne extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private com.intellihealth.truemeds.databinding.HealthArticlesItemBinding binding;
        @org.jetbrains.annotations.Nullable()
        private com.intellihealth.truemeds.presentation.viewmodel.HealthArticlesViewModel viewmodel;
        
        public ViewHolderOne(@org.jetbrains.annotations.NotNull()
        com.intellihealth.truemeds.databinding.HealthArticlesItemBinding binding, @org.jetbrains.annotations.Nullable()
        com.intellihealth.truemeds.presentation.viewmodel.HealthArticlesViewModel viewmodel) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.intellihealth.truemeds.databinding.HealthArticlesItemBinding getBinding() {
            return null;
        }
        
        public final void setBinding(@org.jetbrains.annotations.NotNull()
        com.intellihealth.truemeds.databinding.HealthArticlesItemBinding p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.intellihealth.truemeds.presentation.viewmodel.HealthArticlesViewModel getViewmodel() {
            return null;
        }
        
        public final void setViewmodel(@org.jetbrains.annotations.Nullable()
        com.intellihealth.truemeds.presentation.viewmodel.HealthArticlesViewModel p0) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/HealthArticleAdapter$ViewHolderTwo;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/intellihealth/truemeds/databinding/ProgressBarItemBinding;", "(Lcom/intellihealth/truemeds/databinding/ProgressBarItemBinding;)V", "bind", "", "app_prodDebug"})
    public static final class ViewHolderTwo extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private com.intellihealth.truemeds.databinding.ProgressBarItemBinding binding;
        
        public ViewHolderTwo(@org.jetbrains.annotations.NotNull()
        com.intellihealth.truemeds.databinding.ProgressBarItemBinding binding) {
            super(null);
        }
        
        public final void bind() {
        }
    }
}