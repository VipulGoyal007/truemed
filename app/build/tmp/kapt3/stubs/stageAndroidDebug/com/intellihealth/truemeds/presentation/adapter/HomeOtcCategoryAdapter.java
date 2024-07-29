package com.intellihealth.truemeds.presentation.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000223B%\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\"\u001a\u00020\u0016H\u0016J\u0018\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(H\u0002J\u0018\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u0016H\u0016J\u0018\u0010,\u001a\u00020\u00022\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u0016H\u0016J\u0014\u00100\u001a\u00020$2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u00a8\u00064"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/HomeOtcCategoryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/intellihealth/truemeds/presentation/adapter/HomeOtcCategoryAdapter$ViewHolder;", "list", "", "Lcom/intellihealth/truemeds/data/model/home/SuperCategoryModel;", "homeViewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/HomeViewModel;", "viewLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "(Ljava/util/List;Lcom/intellihealth/truemeds/presentation/viewmodel/HomeViewModel;Landroidx/lifecycle/LifecycleOwner;)V", "getHomeViewModel", "()Lcom/intellihealth/truemeds/presentation/viewmodel/HomeViewModel;", "setHomeViewModel", "(Lcom/intellihealth/truemeds/presentation/viewmodel/HomeViewModel;)V", "isSameCellClicked", "", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "prevPos", "", "getPrevPos", "()I", "setPrevPos", "(I)V", "selectedCategory", "getSelectedCategory", "setSelectedCategory", "getViewLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "setViewLifecycleOwner", "(Landroidx/lifecycle/LifecycleOwner;)V", "getItemCount", "initCategoryRecycler", "", "binding", "Lcom/intellihealth/truemeds/databinding/AdapterSuperCategoryBinding;", "container", "Landroidx/constraintlayout/widget/ConstraintLayout;", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "responseApi", "Companion", "ViewHolder", "app_stageAndroidDebug"})
public final class HomeOtcCategoryAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.intellihealth.truemeds.presentation.adapter.HomeOtcCategoryAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.intellihealth.truemeds.data.model.home.SuperCategoryModel> list;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel homeViewModel;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LifecycleOwner viewLifecycleOwner;
    private int prevPos = -1;
    private int selectedCategory = 1;
    private boolean isSameCellClicked = false;
    @org.jetbrains.annotations.Nullable()
    private static java.lang.String superCategoryImage = "";
    @org.jetbrains.annotations.Nullable()
    private static java.lang.String superCategoryName = "";
    @org.jetbrains.annotations.NotNull()
    public static final com.intellihealth.truemeds.presentation.adapter.HomeOtcCategoryAdapter.Companion Companion = null;
    
    public HomeOtcCategoryAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.home.SuperCategoryModel> list, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel homeViewModel, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner viewLifecycleOwner) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.truemeds.data.model.home.SuperCategoryModel> getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.home.SuperCategoryModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel getHomeViewModel() {
        return null;
    }
    
    public final void setHomeViewModel(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LifecycleOwner getViewLifecycleOwner() {
        return null;
    }
    
    public final void setViewLifecycleOwner(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner p0) {
    }
    
    public final int getPrevPos() {
        return 0;
    }
    
    public final void setPrevPos(int p0) {
    }
    
    public final int getSelectedCategory() {
        return 0;
    }
    
    public final void setSelectedCategory(int p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.intellihealth.truemeds.presentation.adapter.HomeOtcCategoryAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.adapter.HomeOtcCategoryAdapter.ViewHolder holder, int position) {
    }
    
    private final void initCategoryRecycler(com.intellihealth.truemeds.databinding.AdapterSuperCategoryBinding binding, androidx.constraintlayout.widget.ConstraintLayout container) {
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.home.SuperCategoryModel> responseApi) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b\u00a8\u0006\f"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/HomeOtcCategoryAdapter$Companion;", "", "()V", "superCategoryImage", "", "getSuperCategoryImage", "()Ljava/lang/String;", "setSuperCategoryImage", "(Ljava/lang/String;)V", "superCategoryName", "getSuperCategoryName", "setSuperCategoryName", "app_stageAndroidDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSuperCategoryImage() {
            return null;
        }
        
        public final void setSuperCategoryImage(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSuperCategoryName() {
            return null;
        }
        
        public final void setSuperCategoryName(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/HomeOtcCategoryAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/intellihealth/truemeds/databinding/AdapterSuperCategoryBinding;", "(Lcom/intellihealth/truemeds/databinding/AdapterSuperCategoryBinding;)V", "getBinding", "()Lcom/intellihealth/truemeds/databinding/AdapterSuperCategoryBinding;", "app_stageAndroidDebug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.intellihealth.truemeds.databinding.AdapterSuperCategoryBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.intellihealth.truemeds.databinding.AdapterSuperCategoryBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.intellihealth.truemeds.databinding.AdapterSuperCategoryBinding getBinding() {
            return null;
        }
    }
}