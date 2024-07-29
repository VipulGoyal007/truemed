package com.intellihealth.truemeds.presentation.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001$B1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010\u001b\u001a\u00020\u000bH\u0016J\u001c\u0010\u001c\u001a\u00020\u001d2\n\u0010\u001e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u000bH\u0016J\u001c\u0010 \u001a\u00060\u0002R\u00020\u00002\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u000bH\u0016R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006%"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/ChildOtcCategoryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/intellihealth/truemeds/presentation/adapter/ChildOtcCategoryAdapter$CategoryViewHolder;", "categoryModelList", "", "Lcom/intellihealth/truemeds/data/model/home/ChildCategoryModel;", "banners", "Lcom/intellihealth/truemeds/data/model/home/SuperCategoryModel$BannersItem;", "viewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/HomeViewModel;", "superCategoryId", "", "(Ljava/util/List;Ljava/util/List;Lcom/intellihealth/truemeds/presentation/viewmodel/HomeViewModel;I)V", "getBanners", "()Ljava/util/List;", "setBanners", "(Ljava/util/List;)V", "getCategoryModelList", "setCategoryModelList", "getSuperCategoryId", "()I", "setSuperCategoryId", "(I)V", "getViewModel", "()Lcom/intellihealth/truemeds/presentation/viewmodel/HomeViewModel;", "setViewModel", "(Lcom/intellihealth/truemeds/presentation/viewmodel/HomeViewModel;)V", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "CategoryViewHolder", "app_prodDebug"})
public final class ChildOtcCategoryAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.intellihealth.truemeds.presentation.adapter.ChildOtcCategoryAdapter.CategoryViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.intellihealth.truemeds.data.model.home.ChildCategoryModel> categoryModelList;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.intellihealth.truemeds.data.model.home.SuperCategoryModel.BannersItem> banners;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel viewModel;
    private int superCategoryId;
    
    public ChildOtcCategoryAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.home.ChildCategoryModel> categoryModelList, @org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.home.SuperCategoryModel.BannersItem> banners, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel viewModel, int superCategoryId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.truemeds.data.model.home.ChildCategoryModel> getCategoryModelList() {
        return null;
    }
    
    public final void setCategoryModelList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.home.ChildCategoryModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.truemeds.data.model.home.SuperCategoryModel.BannersItem> getBanners() {
        return null;
    }
    
    public final void setBanners(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.home.SuperCategoryModel.BannersItem> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel p0) {
    }
    
    public final int getSuperCategoryId() {
        return 0;
    }
    
    public final void setSuperCategoryId(int p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.intellihealth.truemeds.presentation.adapter.ChildOtcCategoryAdapter.CategoryViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.adapter.ChildOtcCategoryAdapter.CategoryViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/ChildOtcCategoryAdapter$CategoryViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/intellihealth/truemeds/databinding/CategoryShopItemBinding;", "(Lcom/intellihealth/truemeds/presentation/adapter/ChildOtcCategoryAdapter;Lcom/intellihealth/truemeds/databinding/CategoryShopItemBinding;)V", "bindSuperCategory", "", "listModel", "Lcom/intellihealth/truemeds/data/model/home/ChildCategoryModel;", "itemPosition", "", "homeViewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/HomeViewModel;", "app_prodDebug"})
    public final class CategoryViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.intellihealth.truemeds.databinding.CategoryShopItemBinding binding = null;
        
        public CategoryViewHolder(@org.jetbrains.annotations.NotNull()
        com.intellihealth.truemeds.databinding.CategoryShopItemBinding binding) {
            super(null);
        }
        
        public final void bindSuperCategory(@org.jetbrains.annotations.NotNull()
        com.intellihealth.truemeds.data.model.home.ChildCategoryModel listModel, int itemPosition, @org.jetbrains.annotations.NotNull()
        com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel homeViewModel) {
        }
    }
}