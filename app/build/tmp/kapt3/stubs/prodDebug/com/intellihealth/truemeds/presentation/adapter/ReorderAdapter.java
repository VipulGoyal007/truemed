package com.intellihealth.truemeds.presentation.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)B\'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u001d\u001a\u00020\bH\u0016J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\bH\u0016J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\bH\u0016J\u0018\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\bH\u0016J\u001e\u0010(\u001a\u00020\"2\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`\u0017R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R*\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/ReorderAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/intellihealth/truemeds/presentation/adapter/ReorderAdapter$ViewHolder;", "list", "Lcom/intellihealth/truemeds/data/model/home/AllCustomersOrdersResponseModel$ResponseData;", "reOrderCallback", "Lcom/intellihealth/salt/callbacks/ReorderCallback;", "width", "", "homeViewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/HomeViewModel;", "(Lcom/intellihealth/truemeds/data/model/home/AllCustomersOrdersResponseModel$ResponseData;Lcom/intellihealth/salt/callbacks/ReorderCallback;ILcom/intellihealth/truemeds/presentation/viewmodel/HomeViewModel;)V", "getHomeViewModel", "()Lcom/intellihealth/truemeds/presentation/viewmodel/HomeViewModel;", "setHomeViewModel", "(Lcom/intellihealth/truemeds/presentation/viewmodel/HomeViewModel;)V", "getList", "()Lcom/intellihealth/truemeds/data/model/home/AllCustomersOrdersResponseModel$ResponseData;", "setList", "(Lcom/intellihealth/truemeds/data/model/home/AllCustomersOrdersResponseModel$ResponseData;)V", "moreOrderList", "Ljava/util/ArrayList;", "Lcom/intellihealth/salt/models/ReorderModel;", "Lkotlin/collections/ArrayList;", "orderList", "getOrderList", "()Ljava/util/ArrayList;", "setOrderList", "(Ljava/util/ArrayList;)V", "getItemCount", "getItemId", "", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "ViewHolder", "app_prodDebug"})
public final class ReorderAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.intellihealth.truemeds.presentation.adapter.ReorderAdapter.ViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel.ResponseData list;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.salt.callbacks.ReorderCallback reOrderCallback = null;
    private final int width = 0;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel homeViewModel;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.intellihealth.salt.models.ReorderModel> orderList;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.intellihealth.salt.models.ReorderModel> moreOrderList;
    
    public ReorderAdapter(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel.ResponseData list, @org.jetbrains.annotations.NotNull()
    com.intellihealth.salt.callbacks.ReorderCallback reOrderCallback, int width, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel homeViewModel) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel.ResponseData getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel.ResponseData p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel getHomeViewModel() {
        return null;
    }
    
    public final void setHomeViewModel(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.intellihealth.salt.models.ReorderModel> getOrderList() {
        return null;
    }
    
    public final void setOrderList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.intellihealth.salt.models.ReorderModel> p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.intellihealth.truemeds.presentation.adapter.ReorderAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.adapter.ReorderAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.intellihealth.salt.models.ReorderModel> orderList) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rJ\u001c\u0010\u000e\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/ReorderAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/intellihealth/truemeds/databinding/AdapterReorderBinding;", "(Lcom/intellihealth/truemeds/databinding/AdapterReorderBinding;)V", "getBinding", "()Lcom/intellihealth/truemeds/databinding/AdapterReorderBinding;", "bind", "", "list", "", "Lcom/intellihealth/salt/models/ReorderModel;", "width", "", "setMoreReorderList", "app_prodDebug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.intellihealth.truemeds.databinding.AdapterReorderBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.intellihealth.truemeds.databinding.AdapterReorderBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.intellihealth.truemeds.databinding.AdapterReorderBinding getBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        java.util.List<com.intellihealth.salt.models.ReorderModel> list, int width) {
        }
        
        public final void setMoreReorderList(@org.jetbrains.annotations.NotNull()
        java.util.List<com.intellihealth.salt.models.ReorderModel> list, int width) {
        }
    }
}