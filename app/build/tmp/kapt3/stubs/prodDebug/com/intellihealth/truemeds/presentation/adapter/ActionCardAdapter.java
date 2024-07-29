package com.intellihealth.truemeds.presentation.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0019\u001aB\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\r\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\tH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\tH\u0016J\u000e\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0004R\u000e\u0010\b\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u001b"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/ActionCardAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "actionCardModel", "Lcom/intellihealth/truemeds/data/model/home/ActionCardDataModel;", "homeViewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/HomeViewModel;", "(Lcom/intellihealth/truemeds/data/model/home/ActionCardDataModel;Lcom/intellihealth/truemeds/presentation/viewmodel/HomeViewModel;)V", "CALL_AND_ORDER_TYPE", "", "PRESCIPTION_TYPE", "getHomeViewModel", "()Lcom/intellihealth/truemeds/presentation/viewmodel/HomeViewModel;", "getItemCount", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "responseApi", "CallAndOrderItemViewHolder", "PrescriptionItemViewHolder", "app_prodDebug"})
public final class ActionCardAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.data.model.home.ActionCardDataModel actionCardModel;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel homeViewModel = null;
    private final int PRESCIPTION_TYPE = 0;
    private final int CALL_AND_ORDER_TYPE = 1;
    
    public ActionCardAdapter(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.ActionCardDataModel actionCardModel, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel homeViewModel) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel getHomeViewModel() {
        return null;
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
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.home.ActionCardDataModel responseApi) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/ActionCardAdapter$CallAndOrderItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/intellihealth/truemeds/databinding/AdapterCallorderActionCardItemBinding;", "(Lcom/intellihealth/truemeds/databinding/AdapterCallorderActionCardItemBinding;)V", "callOrderbinding", "getCallOrderbinding", "()Lcom/intellihealth/truemeds/databinding/AdapterCallorderActionCardItemBinding;", "app_prodDebug"})
    public static final class CallAndOrderItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.intellihealth.truemeds.databinding.AdapterCallorderActionCardItemBinding callOrderbinding = null;
        
        public CallAndOrderItemViewHolder(@org.jetbrains.annotations.NotNull()
        com.intellihealth.truemeds.databinding.AdapterCallorderActionCardItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.intellihealth.truemeds.databinding.AdapterCallorderActionCardItemBinding getCallOrderbinding() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/ActionCardAdapter$PrescriptionItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/intellihealth/truemeds/databinding/AdapterPrescriptionActionCardItemBinding;", "(Lcom/intellihealth/truemeds/databinding/AdapterPrescriptionActionCardItemBinding;)V", "getBinding", "()Lcom/intellihealth/truemeds/databinding/AdapterPrescriptionActionCardItemBinding;", "app_prodDebug"})
    public static final class PrescriptionItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.intellihealth.truemeds.databinding.AdapterPrescriptionActionCardItemBinding binding = null;
        
        public PrescriptionItemViewHolder(@org.jetbrains.annotations.NotNull()
        com.intellihealth.truemeds.databinding.AdapterPrescriptionActionCardItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.intellihealth.truemeds.databinding.AdapterPrescriptionActionCardItemBinding getBinding() {
            return null;
        }
    }
}