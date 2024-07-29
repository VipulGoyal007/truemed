package com.intellihealth.truemeds.presentation.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B-\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0015H\u0016J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0015H\u0016J\u0018\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0015H\u0016R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/PersonalCareProductAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/intellihealth/truemeds/presentation/adapter/PersonalCareProductAdapter$ItemViewHolder;", "productList", "", "Lcom/intellihealth/truemeds/presentation/model/ProductInfoModel;", "productCardCallback", "Lcom/intellihealth/salt/callbacks/ProductCardCallback;", "viewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/MyOrderViewModel;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "(Ljava/util/List;Lcom/intellihealth/salt/callbacks/ProductCardCallback;Lcom/intellihealth/truemeds/presentation/viewmodel/MyOrderViewModel;Landroidx/fragment/app/FragmentManager;)V", "getFragmentManager", "()Landroidx/fragment/app/FragmentManager;", "items", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "getItemCount", "", "getItemId", "", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ItemViewHolder", "app_prodDebug"})
public final class PersonalCareProductAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.intellihealth.truemeds.presentation.adapter.PersonalCareProductAdapter.ItemViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> productList = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.salt.callbacks.ProductCardCallback productCardCallback = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.presentation.viewmodel.MyOrderViewModel viewModel = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.fragment.app.FragmentManager fragmentManager = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> items;
    
    public PersonalCareProductAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> productList, @org.jetbrains.annotations.NotNull()
    com.intellihealth.salt.callbacks.ProductCardCallback productCardCallback, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.MyOrderViewModel viewModel, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager fragmentManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.fragment.app.FragmentManager getFragmentManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.intellihealth.truemeds.presentation.adapter.PersonalCareProductAdapter.ItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.adapter.PersonalCareProductAdapter.ItemViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/PersonalCareProductAdapter$ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/intellihealth/truemeds/databinding/AdapterPersonalCareProductBinding;", "(Lcom/intellihealth/truemeds/databinding/AdapterPersonalCareProductBinding;)V", "getBinding", "()Lcom/intellihealth/truemeds/databinding/AdapterPersonalCareProductBinding;", "bind", "", "productDetailModel", "Lcom/intellihealth/truemeds/presentation/model/ProductInfoModel;", "productCardCallback", "Lcom/intellihealth/salt/callbacks/ProductCardCallback;", "app_prodDebug"})
    public static final class ItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.intellihealth.truemeds.databinding.AdapterPersonalCareProductBinding binding = null;
        
        public ItemViewHolder(@org.jetbrains.annotations.NotNull()
        com.intellihealth.truemeds.databinding.AdapterPersonalCareProductBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.intellihealth.truemeds.databinding.AdapterPersonalCareProductBinding getBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.intellihealth.truemeds.presentation.model.ProductInfoModel productDetailModel, @org.jetbrains.annotations.NotNull()
        com.intellihealth.salt.callbacks.ProductCardCallback productCardCallback) {
        }
    }
}