package com.intellihealth.truemeds.presentation.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u001e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004J\u0016\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u0007J\b\u0010$\u001a\u00020\u0004H\u0016J\u0010\u0010%\u001a\u00020&2\u0006\u0010 \u001a\u00020\u0004H\u0016J\u0018\u0010\'\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0004H\u0016J\u0018\u0010)\u001a\u00020\u00022\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0004H\u0016R\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006."}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/PastPrescriptionDetailsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/intellihealth/truemeds/presentation/adapter/PastPrescriptionDetailsAdapter$MyViewHolder;", "parentIndex", "", "prescriptionDetailList", "", "Lcom/intellihealth/truemeds/data/model/prescription/ActiveRx;", "viewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/PrescriptionViewModel;", "(ILjava/util/List;Lcom/intellihealth/truemeds/presentation/viewmodel/PrescriptionViewModel;)V", "binding", "Lcom/intellihealth/truemeds/databinding/PastPrescriptionDetailsBinding;", "getBinding", "()Lcom/intellihealth/truemeds/databinding/PastPrescriptionDetailsBinding;", "setBinding", "(Lcom/intellihealth/truemeds/databinding/PastPrescriptionDetailsBinding;)V", "getParentIndex", "()I", "setParentIndex", "(I)V", "getPrescriptionDetailList", "()Ljava/util/List;", "setPrescriptionDetailList", "(Ljava/util/List;)V", "getViewModel", "()Lcom/intellihealth/truemeds/presentation/viewmodel/PrescriptionViewModel;", "setViewModel", "(Lcom/intellihealth/truemeds/presentation/viewmodel/PrescriptionViewModel;)V", "callButtonLogicCLick", "", "item", "position", "callImageLogicCLick", "tempId", "", "getItemCount", "getItemId", "", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MyViewHolder", "app_prodDebug"})
public final class PastPrescriptionDetailsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.intellihealth.truemeds.presentation.adapter.PastPrescriptionDetailsAdapter.MyViewHolder> {
    private int parentIndex;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.intellihealth.truemeds.data.model.prescription.ActiveRx> prescriptionDetailList;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.presentation.viewmodel.PrescriptionViewModel viewModel;
    public com.intellihealth.truemeds.databinding.PastPrescriptionDetailsBinding binding;
    
    public PastPrescriptionDetailsAdapter(int parentIndex, @org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.prescription.ActiveRx> prescriptionDetailList, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.PrescriptionViewModel viewModel) {
        super();
    }
    
    public final int getParentIndex() {
        return 0;
    }
    
    public final void setParentIndex(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.truemeds.data.model.prescription.ActiveRx> getPrescriptionDetailList() {
        return null;
    }
    
    public final void setPrescriptionDetailList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.prescription.ActiveRx> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.viewmodel.PrescriptionViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.PrescriptionViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.databinding.PastPrescriptionDetailsBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.databinding.PastPrescriptionDetailsBinding p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.intellihealth.truemeds.presentation.adapter.PastPrescriptionDetailsAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.adapter.PastPrescriptionDetailsAdapter.MyViewHolder holder, int position) {
    }
    
    public final void callImageLogicCLick(@org.jetbrains.annotations.NotNull()
    java.lang.String tempId, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.prescription.ActiveRx item) {
    }
    
    public final void callButtonLogicCLick(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.prescription.ActiveRx item, int parentIndex, int position) {
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/PastPrescriptionDetailsAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/intellihealth/truemeds/databinding/PastPrescriptionDetailsBinding;", "(Lcom/intellihealth/truemeds/databinding/PastPrescriptionDetailsBinding;)V", "getBinding", "()Lcom/intellihealth/truemeds/databinding/PastPrescriptionDetailsBinding;", "app_prodDebug"})
    public static final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.intellihealth.truemeds.databinding.PastPrescriptionDetailsBinding binding = null;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        com.intellihealth.truemeds.databinding.PastPrescriptionDetailsBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.intellihealth.truemeds.databinding.PastPrescriptionDetailsBinding getBinding() {
            return null;
        }
    }
}