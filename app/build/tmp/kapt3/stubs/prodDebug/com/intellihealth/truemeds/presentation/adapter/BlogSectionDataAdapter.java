package com.intellihealth.truemeds.presentation.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\'B\'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u0018\u001a\u00020\u0013H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u0018\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0013H\u0016J\u0018\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0013H\u0016J\u0018\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\u00042\b\b\u0002\u0010$\u001a\u00020\bJ\u0010\u0010%\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\bH\u0007R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0002X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/BlogSectionDataAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/intellihealth/truemeds/presentation/adapter/BlogSectionDataAdapter$ItemViewHolder;", "blogSectionDataModel", "Lcom/intellihealth/truemeds/data/model/home/BlogSectionDataModel;", "homeViewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/HomeViewModel;", "showShimmer", "", "context", "Lcom/intellihealth/truemeds/presentation/fragment/HomeFragment;", "(Lcom/intellihealth/truemeds/data/model/home/BlogSectionDataModel;Lcom/intellihealth/truemeds/presentation/viewmodel/HomeViewModel;ZLcom/intellihealth/truemeds/presentation/fragment/HomeFragment;)V", "binding", "Lcom/intellihealth/truemeds/databinding/AdapterBlogSectionItemBinding;", "getContext", "()Lcom/intellihealth/truemeds/presentation/fragment/HomeFragment;", "getHomeViewModel", "()Lcom/intellihealth/truemeds/presentation/viewmodel/HomeViewModel;", "previousListSize", "", "shimmerState", "getShowShimmer", "()Z", "viewHolder", "getItemCount", "manageShimmer", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setDataAndNotify", "responseApi", "isNotify", "toggleShimmer", "isShimmerVisible", "ItemViewHolder", "app_prodDebug"})
public final class BlogSectionDataAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.intellihealth.truemeds.presentation.adapter.BlogSectionDataAdapter.ItemViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.data.model.home.BlogSectionDataModel blogSectionDataModel;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel homeViewModel = null;
    private final boolean showShimmer = false;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.presentation.fragment.HomeFragment context = null;
    private com.intellihealth.truemeds.databinding.AdapterBlogSectionItemBinding binding;
    private int previousListSize = 0;
    private boolean shimmerState = false;
    private com.intellihealth.truemeds.presentation.adapter.BlogSectionDataAdapter.ItemViewHolder viewHolder;
    
    public BlogSectionDataAdapter(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.BlogSectionDataModel blogSectionDataModel, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel homeViewModel, boolean showShimmer, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.fragment.HomeFragment context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel getHomeViewModel() {
        return null;
    }
    
    public final boolean getShowShimmer() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.fragment.HomeFragment getContext() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.intellihealth.truemeds.presentation.adapter.BlogSectionDataAdapter.ItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.adapter.BlogSectionDataAdapter.ItemViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setDataAndNotify(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.home.BlogSectionDataModel responseApi, boolean isNotify) {
    }
    
    @androidx.annotation.MainThread()
    public final void toggleShimmer(boolean isShimmerVisible) {
    }
    
    private final void manageShimmer() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/BlogSectionDataAdapter$ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/intellihealth/truemeds/databinding/AdapterBlogSectionItemBinding;", "(Lcom/intellihealth/truemeds/databinding/AdapterBlogSectionItemBinding;)V", "getBinding", "()Lcom/intellihealth/truemeds/databinding/AdapterBlogSectionItemBinding;", "app_prodDebug"})
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