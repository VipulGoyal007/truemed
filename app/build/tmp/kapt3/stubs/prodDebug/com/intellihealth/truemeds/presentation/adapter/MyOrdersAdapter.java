package com.intellihealth.truemeds.presentation.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003)*+B!\b\u0016\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bB\u0005\u00a2\u0006\u0002\u0010\tJ\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0016J\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u001fH\u0016J\u0018\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\u001fH\u0016R\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u0006,"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/MyOrdersAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "items", "", "Lcom/intellihealth/truemeds/data/model/home/AllCustomersOrdersResponseModel$ResponseData$Orders;", "viewmodel", "Lcom/intellihealth/truemeds/presentation/viewmodel/OrdersTabViewModel;", "(Ljava/util/List;Lcom/intellihealth/truemeds/presentation/viewmodel/OrdersTabViewModel;)V", "()V", "binding", "Lcom/intellihealth/truemeds/databinding/MyOrdersItemBinding;", "getBinding", "()Lcom/intellihealth/truemeds/databinding/MyOrdersItemBinding;", "setBinding", "(Lcom/intellihealth/truemeds/databinding/MyOrdersItemBinding;)V", "bindingLoad", "Lcom/intellihealth/truemeds/databinding/ProgressBarItemBinding;", "getBindingLoad", "()Lcom/intellihealth/truemeds/databinding/ProgressBarItemBinding;", "setBindingLoad", "(Lcom/intellihealth/truemeds/databinding/ProgressBarItemBinding;)V", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "getViewmodel", "()Lcom/intellihealth/truemeds/presentation/viewmodel/OrdersTabViewModel;", "setViewmodel", "(Lcom/intellihealth/truemeds/presentation/viewmodel/OrdersTabViewModel;)V", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "ViewHolderOne", "ViewHolderTwo", "app_prodDebug"})
public final class MyOrdersAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel.ResponseData.Orders> items;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.viewmodel.OrdersTabViewModel viewmodel;
    public com.intellihealth.truemeds.databinding.MyOrdersItemBinding binding;
    public com.intellihealth.truemeds.databinding.ProgressBarItemBinding bindingLoad;
    private static final int VIEW_TYPE_ITEM = 1;
    private static final int VIEW_TYPE_LOADING = 2;
    @org.jetbrains.annotations.NotNull()
    public static final com.intellihealth.truemeds.presentation.adapter.MyOrdersAdapter.Companion Companion = null;
    
    public MyOrdersAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel.ResponseData.Orders> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.Nullable()
    java.util.List<com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel.ResponseData.Orders> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.presentation.viewmodel.OrdersTabViewModel getViewmodel() {
        return null;
    }
    
    public final void setViewmodel(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.presentation.viewmodel.OrdersTabViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.databinding.MyOrdersItemBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.databinding.MyOrdersItemBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.databinding.ProgressBarItemBinding getBindingLoad() {
        return null;
    }
    
    public final void setBindingLoad(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.databinding.ProgressBarItemBinding p0) {
    }
    
    public MyOrdersAdapter(@org.jetbrains.annotations.Nullable()
    java.util.List<com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel.ResponseData.Orders> items, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.presentation.viewmodel.OrdersTabViewModel viewmodel) {
        super();
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/MyOrdersAdapter$Companion;", "", "()V", "VIEW_TYPE_ITEM", "", "VIEW_TYPE_LOADING", "app_prodDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/MyOrdersAdapter$ViewHolderOne;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/intellihealth/truemeds/databinding/MyOrdersItemBinding;", "viewmodel", "Lcom/intellihealth/truemeds/presentation/viewmodel/OrdersTabViewModel;", "(Lcom/intellihealth/truemeds/databinding/MyOrdersItemBinding;Lcom/intellihealth/truemeds/presentation/viewmodel/OrdersTabViewModel;)V", "getBinding", "()Lcom/intellihealth/truemeds/databinding/MyOrdersItemBinding;", "app_prodDebug"})
    public static final class ViewHolderOne extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.intellihealth.truemeds.databinding.MyOrdersItemBinding binding = null;
        
        public ViewHolderOne(@org.jetbrains.annotations.NotNull()
        com.intellihealth.truemeds.databinding.MyOrdersItemBinding binding, @org.jetbrains.annotations.Nullable()
        com.intellihealth.truemeds.presentation.viewmodel.OrdersTabViewModel viewmodel) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.intellihealth.truemeds.databinding.MyOrdersItemBinding getBinding() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/MyOrdersAdapter$ViewHolderTwo;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/intellihealth/truemeds/databinding/ProgressBarItemBinding;", "(Lcom/intellihealth/truemeds/databinding/ProgressBarItemBinding;)V", "bind", "", "app_prodDebug"})
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