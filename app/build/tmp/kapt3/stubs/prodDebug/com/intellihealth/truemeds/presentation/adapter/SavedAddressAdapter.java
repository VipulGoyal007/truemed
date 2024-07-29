package com.intellihealth.truemeds.presentation.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(B\u001f\u0012\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ:\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u0016H\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001dH\u0016J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001dH\u0016J\u0018\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u001dH\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/SavedAddressAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/intellihealth/truemeds/presentation/adapter/SavedAddressAdapter$ItemViewHolder;", "list", "", "Lcom/intellihealth/truemeds/data/model/user/GetAllAddressResponse$ResponseObj;", "callback", "Lcom/intellihealth/truemeds/data/callback/ChooseLocationCallback;", "(Ljava/util/List;Lcom/intellihealth/truemeds/data/callback/ChooseLocationCallback;)V", "binding", "Lcom/intellihealth/truemeds/databinding/SavedAddressItemBinding;", "getCallback", "()Lcom/intellihealth/truemeds/data/callback/ChooseLocationCallback;", "setCallback", "(Lcom/intellihealth/truemeds/data/callback/ChooseLocationCallback;)V", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "toolTip", "Lcom/intellihealth/salt/views/tooltip/DefaultExpandedTooltipWithMargin;", "getAppendedAddressString", "", "addressline1", "addressline2", "addressline3", "cityName", "pinCode", "getItemCount", "", "getItemId", "", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ItemViewHolder", "app_prodDebug"})
public final class SavedAddressAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.intellihealth.truemeds.presentation.adapter.SavedAddressAdapter.ItemViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.intellihealth.truemeds.data.model.user.GetAllAddressResponse.ResponseObj> list;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.data.callback.ChooseLocationCallback callback;
    private com.intellihealth.truemeds.databinding.SavedAddressItemBinding binding;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.salt.views.tooltip.DefaultExpandedTooltipWithMargin toolTip;
    
    public SavedAddressAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.user.GetAllAddressResponse.ResponseObj> list, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.callback.ChooseLocationCallback callback) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.truemeds.data.model.user.GetAllAddressResponse.ResponseObj> getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.user.GetAllAddressResponse.ResponseObj> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.callback.ChooseLocationCallback getCallback() {
        return null;
    }
    
    public final void setCallback(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.callback.ChooseLocationCallback p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.intellihealth.truemeds.presentation.adapter.SavedAddressAdapter.ItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.adapter.SavedAddressAdapter.ItemViewHolder holder, int position) {
    }
    
    private final java.lang.String getAppendedAddressString(java.lang.String addressline1, java.lang.String addressline2, java.lang.String addressline3, java.lang.String cityName, java.lang.String pinCode) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/SavedAddressAdapter$ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/intellihealth/truemeds/databinding/SavedAddressItemBinding;", "(Lcom/intellihealth/truemeds/databinding/SavedAddressItemBinding;)V", "getBinding", "()Lcom/intellihealth/truemeds/databinding/SavedAddressItemBinding;", "app_prodDebug"})
    public static final class ItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.intellihealth.truemeds.databinding.SavedAddressItemBinding binding = null;
        
        public ItemViewHolder(@org.jetbrains.annotations.NotNull()
        com.intellihealth.truemeds.databinding.SavedAddressItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.intellihealth.truemeds.databinding.SavedAddressItemBinding getBinding() {
            return null;
        }
    }
}