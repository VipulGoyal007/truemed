package com.intellihealth.truemeds.presentation.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B+\b\u0016\u0012\u0010\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nB\u0005\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0019H\u0016J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0019H\u0016J\u0018\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0019H\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006%"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/DeliveryDetailsPatientAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/intellihealth/truemeds/presentation/adapter/DeliveryDetailsPatientAdapter$MyViewHolder;", "items", "", "Lcom/intellihealth/truemeds/data/model/user/GetAllPatientResponse$Patient;", "viewmodel", "Lcom/intellihealth/truemeds/presentation/viewmodel/DeliveryDetailsViewModel;", "callback", "Lcom/intellihealth/truemeds/data/callback/PatientClickCallback;", "(Ljava/util/List;Lcom/intellihealth/truemeds/presentation/viewmodel/DeliveryDetailsViewModel;Lcom/intellihealth/truemeds/data/callback/PatientClickCallback;)V", "()V", "getCallback", "()Lcom/intellihealth/truemeds/data/callback/PatientClickCallback;", "setCallback", "(Lcom/intellihealth/truemeds/data/callback/PatientClickCallback;)V", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "getViewmodel", "()Lcom/intellihealth/truemeds/presentation/viewmodel/DeliveryDetailsViewModel;", "setViewmodel", "(Lcom/intellihealth/truemeds/presentation/viewmodel/DeliveryDetailsViewModel;)V", "getItemCount", "", "getItemId", "", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MyViewHolder", "app_stageAndroidDebug"})
public final class DeliveryDetailsPatientAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.intellihealth.truemeds.presentation.adapter.DeliveryDetailsPatientAdapter.MyViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.intellihealth.truemeds.data.model.user.GetAllPatientResponse.Patient> items;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.viewmodel.DeliveryDetailsViewModel viewmodel;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.data.callback.PatientClickCallback callback;
    
    public DeliveryDetailsPatientAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.intellihealth.truemeds.data.model.user.GetAllPatientResponse.Patient> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.Nullable()
    java.util.List<com.intellihealth.truemeds.data.model.user.GetAllPatientResponse.Patient> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.presentation.viewmodel.DeliveryDetailsViewModel getViewmodel() {
        return null;
    }
    
    public final void setViewmodel(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.presentation.viewmodel.DeliveryDetailsViewModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.callback.PatientClickCallback getCallback() {
        return null;
    }
    
    public final void setCallback(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.callback.PatientClickCallback p0) {
    }
    
    public DeliveryDetailsPatientAdapter(@org.jetbrains.annotations.Nullable()
    java.util.List<com.intellihealth.truemeds.data.model.user.GetAllPatientResponse.Patient> items, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.presentation.viewmodel.DeliveryDetailsViewModel viewmodel, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.callback.PatientClickCallback callback) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.intellihealth.truemeds.presentation.adapter.DeliveryDetailsPatientAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.adapter.DeliveryDetailsPatientAdapter.MyViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/DeliveryDetailsPatientAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/intellihealth/truemeds/databinding/DeliveryDetailsPatientItemBinding;", "(Lcom/intellihealth/truemeds/databinding/DeliveryDetailsPatientItemBinding;)V", "getBinding", "()Lcom/intellihealth/truemeds/databinding/DeliveryDetailsPatientItemBinding;", "bindManagePatient", "", "itemPosition", "", "data", "Lcom/intellihealth/salt/models/AddressPatientDetailsCardModel;", "app_stageAndroidDebug"})
    public static final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.intellihealth.truemeds.databinding.DeliveryDetailsPatientItemBinding binding = null;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        com.intellihealth.truemeds.databinding.DeliveryDetailsPatientItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.intellihealth.truemeds.databinding.DeliveryDetailsPatientItemBinding getBinding() {
            return null;
        }
        
        public final void bindManagePatient(int itemPosition, @org.jetbrains.annotations.NotNull()
        com.intellihealth.salt.models.AddressPatientDetailsCardModel data) {
        }
    }
}