package com.intellihealth.truemeds.presentation.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001*B/\b\u0016\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fB\u0005\u00a2\u0006\u0002\u0010\rJ\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001fH\u0016J\u0018\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u001fH\u0016J\u0018\u0010&\u001a\u00020\u00022\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001fH\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u0006+"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/ProductListViewAllAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/intellihealth/truemeds/presentation/adapter/ProductListViewAllAdapter$MyViewHolder;", "items", "", "Lcom/intellihealth/truemeds/presentation/model/ProductInfoModel;", "viewmodel", "Lcom/intellihealth/truemeds/presentation/viewmodel/ProductListViewAllViewModel;", "productCardCallback", "Lcom/intellihealth/salt/callbacks/ProductCardCallback;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "(Ljava/util/List;Lcom/intellihealth/truemeds/presentation/viewmodel/ProductListViewAllViewModel;Lcom/intellihealth/salt/callbacks/ProductCardCallback;Landroidx/fragment/app/FragmentManager;)V", "()V", "getFragmentManager", "()Landroidx/fragment/app/FragmentManager;", "setFragmentManager", "(Landroidx/fragment/app/FragmentManager;)V", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "getProductCardCallback", "()Lcom/intellihealth/salt/callbacks/ProductCardCallback;", "setProductCardCallback", "(Lcom/intellihealth/salt/callbacks/ProductCardCallback;)V", "getViewmodel", "()Lcom/intellihealth/truemeds/presentation/viewmodel/ProductListViewAllViewModel;", "setViewmodel", "(Lcom/intellihealth/truemeds/presentation/viewmodel/ProductListViewAllViewModel;)V", "getItemCount", "", "getItemId", "", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MyViewHolder", "app_stageAndroidDebug"})
public final class ProductListViewAllAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.intellihealth.truemeds.presentation.adapter.ProductListViewAllAdapter.MyViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> items;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.viewmodel.ProductListViewAllViewModel viewmodel;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.salt.callbacks.ProductCardCallback productCardCallback;
    @org.jetbrains.annotations.Nullable()
    private androidx.fragment.app.FragmentManager fragmentManager;
    
    public ProductListViewAllAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.presentation.viewmodel.ProductListViewAllViewModel getViewmodel() {
        return null;
    }
    
    public final void setViewmodel(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.presentation.viewmodel.ProductListViewAllViewModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.salt.callbacks.ProductCardCallback getProductCardCallback() {
        return null;
    }
    
    public final void setProductCardCallback(@org.jetbrains.annotations.Nullable()
    com.intellihealth.salt.callbacks.ProductCardCallback p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.fragment.app.FragmentManager getFragmentManager() {
        return null;
    }
    
    public final void setFragmentManager(@org.jetbrains.annotations.Nullable()
    androidx.fragment.app.FragmentManager p0) {
    }
    
    public ProductListViewAllAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> items, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.presentation.viewmodel.ProductListViewAllViewModel viewmodel, @org.jetbrains.annotations.NotNull()
    com.intellihealth.salt.callbacks.ProductCardCallback productCardCallback, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager fragmentManager) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.intellihealth.truemeds.presentation.adapter.ProductListViewAllAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.adapter.ProductListViewAllAdapter.MyViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/ProductListViewAllAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/intellihealth/truemeds/databinding/ProductListViewAllItemBinding;", "(Lcom/intellihealth/truemeds/databinding/ProductListViewAllItemBinding;)V", "getBinding", "()Lcom/intellihealth/truemeds/databinding/ProductListViewAllItemBinding;", "bind", "", "productDetailModel", "Lcom/intellihealth/truemeds/presentation/model/ProductInfoModel;", "productCardCallback", "Lcom/intellihealth/salt/callbacks/ProductCardCallback;", "app_stageAndroidDebug"})
    public static final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.intellihealth.truemeds.databinding.ProductListViewAllItemBinding binding = null;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        com.intellihealth.truemeds.databinding.ProductListViewAllItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.intellihealth.truemeds.databinding.ProductListViewAllItemBinding getBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.intellihealth.truemeds.presentation.model.ProductInfoModel productDetailModel, @org.jetbrains.annotations.NotNull()
        com.intellihealth.salt.callbacks.ProductCardCallback productCardCallback) {
        }
    }
}