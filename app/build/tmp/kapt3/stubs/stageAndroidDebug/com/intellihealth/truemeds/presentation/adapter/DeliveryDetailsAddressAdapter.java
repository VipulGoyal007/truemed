package com.intellihealth.truemeds.presentation.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\"B%\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u001e\u0010\u001a\u001a\u00020\u001b2\n\u0010\u001c\u001a\u00060\u0002R\u00020\u00002\b\b\u0001\u0010\u001d\u001a\u00020\u0019H\u0016J\u001c\u0010\u001e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0019H\u0016R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006#"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/DeliveryDetailsAddressAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/intellihealth/truemeds/presentation/adapter/DeliveryDetailsAddressAdapter$ManageAddressViewHolder;", "manageAddressList", "", "Lcom/intellihealth/truemeds/data/model/user/GetAllAddressResponse$ResponseObj;", "viewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/DeliveryDetailsViewModel;", "callback", "Lcom/intellihealth/truemeds/data/callback/AddressClickCallback;", "(Ljava/util/List;Lcom/intellihealth/truemeds/presentation/viewmodel/DeliveryDetailsViewModel;Lcom/intellihealth/truemeds/data/callback/AddressClickCallback;)V", "getCallback", "()Lcom/intellihealth/truemeds/data/callback/AddressClickCallback;", "setCallback", "(Lcom/intellihealth/truemeds/data/callback/AddressClickCallback;)V", "mViewModel", "getManageAddressList", "()Ljava/util/List;", "setManageAddressList", "(Ljava/util/List;)V", "getViewModel", "()Lcom/intellihealth/truemeds/presentation/viewmodel/DeliveryDetailsViewModel;", "setViewModel", "(Lcom/intellihealth/truemeds/presentation/viewmodel/DeliveryDetailsViewModel;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ManageAddressViewHolder", "app_stageAndroidDebug"})
public final class DeliveryDetailsAddressAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.intellihealth.truemeds.presentation.adapter.DeliveryDetailsAddressAdapter.ManageAddressViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.intellihealth.truemeds.data.model.user.GetAllAddressResponse.ResponseObj> manageAddressList;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.presentation.viewmodel.DeliveryDetailsViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.data.callback.AddressClickCallback callback;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.viewmodel.DeliveryDetailsViewModel mViewModel;
    
    public DeliveryDetailsAddressAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.user.GetAllAddressResponse.ResponseObj> manageAddressList, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.DeliveryDetailsViewModel viewModel, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.callback.AddressClickCallback callback) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.truemeds.data.model.user.GetAllAddressResponse.ResponseObj> getManageAddressList() {
        return null;
    }
    
    public final void setManageAddressList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.user.GetAllAddressResponse.ResponseObj> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.viewmodel.DeliveryDetailsViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.DeliveryDetailsViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.callback.AddressClickCallback getCallback() {
        return null;
    }
    
    public final void setCallback(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.callback.AddressClickCallback p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.intellihealth.truemeds.presentation.adapter.DeliveryDetailsAddressAdapter.ManageAddressViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.adapter.DeliveryDetailsAddressAdapter.ManageAddressViewHolder holder, @android.annotation.SuppressLint(value = {"RecyclerView"})
    int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/DeliveryDetailsAddressAdapter$ManageAddressViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/intellihealth/truemeds/databinding/SavedAddressItemBinding;", "(Lcom/intellihealth/truemeds/presentation/adapter/DeliveryDetailsAddressAdapter;Lcom/intellihealth/truemeds/databinding/SavedAddressItemBinding;)V", "getBinding", "()Lcom/intellihealth/truemeds/databinding/SavedAddressItemBinding;", "app_stageAndroidDebug"})
    public final class ManageAddressViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.intellihealth.truemeds.databinding.SavedAddressItemBinding binding = null;
        
        public ManageAddressViewHolder(@org.jetbrains.annotations.NotNull()
        com.intellihealth.truemeds.databinding.SavedAddressItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.intellihealth.truemeds.databinding.SavedAddressItemBinding getBinding() {
            return null;
        }
    }
}