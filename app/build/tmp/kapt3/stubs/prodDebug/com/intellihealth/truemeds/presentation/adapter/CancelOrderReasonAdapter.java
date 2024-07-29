package com.intellihealth.truemeds.presentation.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001$B\u001f\u0012\u0010\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u001c\u0010\u0019\u001a\u00020\u001a2\n\u0010\u001b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0018H\u0016J\u001c\u0010\u001d\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0018H\u0016J\u001a\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u00182\b\u0010#\u001a\u0004\u0018\u00010\u0005H\u0002R\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006%"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/CancelOrderReasonAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/intellihealth/truemeds/presentation/adapter/CancelOrderReasonAdapter$MyViewHolder;", "cancelOrderReasonList", "", "Lcom/intellihealth/truemeds/data/model/cancelorder/CancelReasonResponse$Reason;", "viewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/CancelOrderViewModel;", "(Ljava/util/List;Lcom/intellihealth/truemeds/presentation/viewmodel/CancelOrderViewModel;)V", "binding", "Lcom/intellihealth/truemeds/databinding/CancelOrderItemBinding;", "getBinding", "()Lcom/intellihealth/truemeds/databinding/CancelOrderItemBinding;", "setBinding", "(Lcom/intellihealth/truemeds/databinding/CancelOrderItemBinding;)V", "getCancelOrderReasonList", "()Ljava/util/List;", "setCancelOrderReasonList", "(Ljava/util/List;)V", "getViewModel", "()Lcom/intellihealth/truemeds/presentation/viewmodel/CancelOrderViewModel;", "setViewModel", "(Lcom/intellihealth/truemeds/presentation/viewmodel/CancelOrderViewModel;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setClickListener", "reasonId", "currentObj", "MyViewHolder", "app_prodDebug"})
public final class CancelOrderReasonAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.intellihealth.truemeds.presentation.adapter.CancelOrderReasonAdapter.MyViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.intellihealth.truemeds.data.model.cancelorder.CancelReasonResponse.Reason> cancelOrderReasonList;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.presentation.viewmodel.CancelOrderViewModel viewModel;
    public com.intellihealth.truemeds.databinding.CancelOrderItemBinding binding;
    
    public CancelOrderReasonAdapter(@org.jetbrains.annotations.Nullable()
    java.util.List<com.intellihealth.truemeds.data.model.cancelorder.CancelReasonResponse.Reason> cancelOrderReasonList, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.CancelOrderViewModel viewModel) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.intellihealth.truemeds.data.model.cancelorder.CancelReasonResponse.Reason> getCancelOrderReasonList() {
        return null;
    }
    
    public final void setCancelOrderReasonList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.intellihealth.truemeds.data.model.cancelorder.CancelReasonResponse.Reason> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.viewmodel.CancelOrderViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.CancelOrderViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.databinding.CancelOrderItemBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.databinding.CancelOrderItemBinding p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.intellihealth.truemeds.presentation.adapter.CancelOrderReasonAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.adapter.CancelOrderReasonAdapter.MyViewHolder holder, int position) {
    }
    
    private final void setClickListener(int reasonId, com.intellihealth.truemeds.data.model.cancelorder.CancelReasonResponse.Reason currentObj) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a8\u0006\t"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/CancelOrderReasonAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Lcom/intellihealth/truemeds/databinding/CancelOrderItemBinding;", "(Lcom/intellihealth/truemeds/presentation/adapter/CancelOrderReasonAdapter;Lcom/intellihealth/truemeds/databinding/CancelOrderItemBinding;)V", "setBindingData", "", "currentObj", "Lcom/intellihealth/truemeds/data/model/cancelorder/CancelReasonResponse$Reason;", "app_prodDebug"})
    public final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        com.intellihealth.truemeds.databinding.CancelOrderItemBinding itemView) {
            super(null);
        }
        
        public final void setBindingData(@org.jetbrains.annotations.Nullable()
        com.intellihealth.truemeds.data.model.cancelorder.CancelReasonResponse.Reason currentObj) {
        }
    }
}