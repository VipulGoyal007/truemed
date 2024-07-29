package com.intellihealth.truemeds.presentation.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0016H\u0016J\u0018\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0016H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/HealthArtcileBlogListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/intellihealth/truemeds/presentation/adapter/HealthArtcileBlogListAdapter$ItemViewHolder;", "blogSectionDataModel", "Lcom/intellihealth/truemeds/data/model/home/BlogSectionDataModel;", "homeViewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/HealthArticlesViewModel;", "(Lcom/intellihealth/truemeds/data/model/home/BlogSectionDataModel;Lcom/intellihealth/truemeds/presentation/viewmodel/HealthArticlesViewModel;)V", "binding", "Lcom/intellihealth/truemeds/databinding/AdapterBlogSectionItemBinding;", "getBlogSectionDataModel", "()Lcom/intellihealth/truemeds/data/model/home/BlogSectionDataModel;", "setBlogSectionDataModel", "(Lcom/intellihealth/truemeds/data/model/home/BlogSectionDataModel;)V", "getHomeViewModel", "()Lcom/intellihealth/truemeds/presentation/viewmodel/HealthArticlesViewModel;", "setHomeViewModel", "(Lcom/intellihealth/truemeds/presentation/viewmodel/HealthArticlesViewModel;)V", "userModalArrayList", "", "Lcom/intellihealth/salt/models/BlogModel;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ItemViewHolder", "app_stageAndroidDebug"})
public final class HealthArtcileBlogListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.intellihealth.truemeds.presentation.adapter.HealthArtcileBlogListAdapter.ItemViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.data.model.home.BlogSectionDataModel blogSectionDataModel;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.presentation.viewmodel.HealthArticlesViewModel homeViewModel;
    private com.intellihealth.truemeds.databinding.AdapterBlogSectionItemBinding binding;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.intellihealth.salt.models.BlogModel> userModalArrayList = null;
    
    public HealthArtcileBlogListAdapter(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.BlogSectionDataModel blogSectionDataModel, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.HealthArticlesViewModel homeViewModel) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.home.BlogSectionDataModel getBlogSectionDataModel() {
        return null;
    }
    
    public final void setBlogSectionDataModel(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.BlogSectionDataModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.viewmodel.HealthArticlesViewModel getHomeViewModel() {
        return null;
    }
    
    public final void setHomeViewModel(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.HealthArticlesViewModel p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.intellihealth.truemeds.presentation.adapter.HealthArtcileBlogListAdapter.ItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.adapter.HealthArtcileBlogListAdapter.ItemViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/HealthArtcileBlogListAdapter$ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/intellihealth/truemeds/databinding/AdapterBlogSectionItemBinding;", "(Lcom/intellihealth/truemeds/databinding/AdapterBlogSectionItemBinding;)V", "getBinding", "()Lcom/intellihealth/truemeds/databinding/AdapterBlogSectionItemBinding;", "app_stageAndroidDebug"})
    public static final class ItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.intellihealth.truemeds.databinding.AdapterBlogSectionItemBinding binding = null;
        
        public ItemViewHolder(@org.jetbrains.annotations.NotNull()
        com.intellihealth.truemeds.databinding.AdapterBlogSectionItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.intellihealth.truemeds.databinding.AdapterBlogSectionItemBinding getBinding() {
            return null;
        }
    }
}