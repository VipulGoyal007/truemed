package com.intellihealth.truemeds.presentation.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u001d\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0012H\u0016R\"\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001c"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/AccountTabAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/intellihealth/truemeds/presentation/adapter/AccountTabAdapter$ViewHolder;", "accountItem", "", "Lcom/intellihealth/truemeds/data/model/bottomnav/AccountTabModel;", "viewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/AccountTabViewModel;", "(Ljava/util/List;Lcom/intellihealth/truemeds/presentation/viewmodel/AccountTabViewModel;)V", "getAccountItem", "()Ljava/util/List;", "setAccountItem", "(Ljava/util/List;)V", "getViewModel", "()Lcom/intellihealth/truemeds/presentation/viewmodel/AccountTabViewModel;", "setViewModel", "(Lcom/intellihealth/truemeds/presentation/viewmodel/AccountTabViewModel;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_prodDebug"})
public final class AccountTabAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.intellihealth.truemeds.presentation.adapter.AccountTabAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.intellihealth.truemeds.data.model.bottomnav.AccountTabModel> accountItem;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.presentation.viewmodel.AccountTabViewModel viewModel;
    
    public AccountTabAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.bottomnav.AccountTabModel> accountItem, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.AccountTabViewModel viewModel) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.truemeds.data.model.bottomnav.AccountTabModel> getAccountItem() {
        return null;
    }
    
    public final void setAccountItem(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.bottomnav.AccountTabModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.viewmodel.AccountTabViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.AccountTabViewModel p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.intellihealth.truemeds.presentation.adapter.AccountTabAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.adapter.AccountTabAdapter.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/AccountTabAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/intellihealth/truemeds/databinding/ItemTabAccountBinding;", "(Lcom/intellihealth/truemeds/databinding/ItemTabAccountBinding;)V", "getBinding", "()Lcom/intellihealth/truemeds/databinding/ItemTabAccountBinding;", "app_prodDebug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.intellihealth.truemeds.databinding.ItemTabAccountBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.intellihealth.truemeds.databinding.ItemTabAccountBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.intellihealth.truemeds.databinding.ItemTabAccountBinding getBinding() {
            return null;
        }
    }
}