package com.intellihealth.truemeds.presentation.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0012H\u0016R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001c"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/PatientListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/intellihealth/truemeds/presentation/adapter/PatientListAdapter$MyViewHolder;", "itemList", "", "Lcom/intellihealth/truemeds/data/model/user/GetAllPatientResponse$Patient;", "viewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/DeliveryDetailsViewModel;", "(Ljava/util/List;Lcom/intellihealth/truemeds/presentation/viewmodel/DeliveryDetailsViewModel;)V", "getItemList", "()Ljava/util/List;", "setItemList", "(Ljava/util/List;)V", "getViewModel", "()Lcom/intellihealth/truemeds/presentation/viewmodel/DeliveryDetailsViewModel;", "setViewModel", "(Lcom/intellihealth/truemeds/presentation/viewmodel/DeliveryDetailsViewModel;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MyViewHolder", "app_prodDebug"})
public final class PatientListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.intellihealth.truemeds.presentation.adapter.PatientListAdapter.MyViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.intellihealth.truemeds.data.model.user.GetAllPatientResponse.Patient> itemList;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.presentation.viewmodel.DeliveryDetailsViewModel viewModel;
    
    public PatientListAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.user.GetAllPatientResponse.Patient> itemList, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.DeliveryDetailsViewModel viewModel) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.truemeds.data.model.user.GetAllPatientResponse.Patient> getItemList() {
        return null;
    }
    
    public final void setItemList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.user.GetAllPatientResponse.Patient> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.viewmodel.DeliveryDetailsViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.DeliveryDetailsViewModel p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.intellihealth.truemeds.presentation.adapter.PatientListAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.adapter.PatientListAdapter.MyViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\f"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/PatientListAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/intellihealth/truemeds/databinding/ResPatientItemBinding;", "(Lcom/intellihealth/truemeds/databinding/ResPatientItemBinding;)V", "getBinding", "()Lcom/intellihealth/truemeds/databinding/ResPatientItemBinding;", "setBinding", "bindView", "", "item", "Lcom/intellihealth/salt/models/AddressPatientDetailsCardModel;", "app_prodDebug"})
    public static final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private com.intellihealth.truemeds.databinding.ResPatientItemBinding binding;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        com.intellihealth.truemeds.databinding.ResPatientItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.intellihealth.truemeds.databinding.ResPatientItemBinding getBinding() {
            return null;
        }
        
        public final void setBinding(@org.jetbrains.annotations.NotNull()
        com.intellihealth.truemeds.databinding.ResPatientItemBinding p0) {
        }
        
        public final void bindView(@org.jetbrains.annotations.NotNull()
        com.intellihealth.salt.models.AddressPatientDetailsCardModel item) {
        }
    }
}