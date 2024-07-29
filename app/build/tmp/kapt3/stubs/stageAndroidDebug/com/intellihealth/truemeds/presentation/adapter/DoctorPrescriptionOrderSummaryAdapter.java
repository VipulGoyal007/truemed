package com.intellihealth.truemeds.presentation.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003()*B-\b\u0016\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fB\u0005\u00a2\u0006\u0002\u0010\rJ\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001eH\u0016J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001eH\u0016J\u0018\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u001eH\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006+"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/DoctorPrescriptionOrderSummaryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "items", "", "", "callback", "Lcom/intellihealth/truemeds/presentation/callbacks/ViewPrescriptionCallback;", "viewmodel", "Lcom/intellihealth/truemeds/presentation/viewmodel/OrderSummaryViewModel;", "isCloseButtonShow", "", "(Ljava/util/List;Lcom/intellihealth/truemeds/presentation/callbacks/ViewPrescriptionCallback;Lcom/intellihealth/truemeds/presentation/viewmodel/OrderSummaryViewModel;Z)V", "()V", "getCallback", "()Lcom/intellihealth/truemeds/presentation/callbacks/ViewPrescriptionCallback;", "setCallback", "(Lcom/intellihealth/truemeds/presentation/callbacks/ViewPrescriptionCallback;)V", "()Z", "setCloseButtonShow", "(Z)V", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "getViewmodel", "()Lcom/intellihealth/truemeds/presentation/viewmodel/OrderSummaryViewModel;", "setViewmodel", "(Lcom/intellihealth/truemeds/presentation/viewmodel/OrderSummaryViewModel;)V", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "AddMorePrescriptionViewHolder", "Companion", "ViewUploadedPrescriptionViewHolder", "app_stageAndroidDebug"})
public final class DoctorPrescriptionOrderSummaryAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.String> items;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.viewmodel.OrderSummaryViewModel viewmodel;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.callbacks.ViewPrescriptionCallback callback;
    private boolean isCloseButtonShow = false;
    private static final int ADD_MORE_PRESCRIPTION = 1;
    private static final int SHOW_UPLOADED_PRESCRIPTION = 2;
    @org.jetbrains.annotations.NotNull()
    public static final com.intellihealth.truemeds.presentation.adapter.DoctorPrescriptionOrderSummaryAdapter.Companion Companion = null;
    
    public DoctorPrescriptionOrderSummaryAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.presentation.viewmodel.OrderSummaryViewModel getViewmodel() {
        return null;
    }
    
    public final void setViewmodel(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.presentation.viewmodel.OrderSummaryViewModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.presentation.callbacks.ViewPrescriptionCallback getCallback() {
        return null;
    }
    
    public final void setCallback(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.presentation.callbacks.ViewPrescriptionCallback p0) {
    }
    
    public final boolean isCloseButtonShow() {
        return false;
    }
    
    public final void setCloseButtonShow(boolean p0) {
    }
    
    public DoctorPrescriptionOrderSummaryAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> items, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.callbacks.ViewPrescriptionCallback callback, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.OrderSummaryViewModel viewmodel, boolean isCloseButtonShow) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/DoctorPrescriptionOrderSummaryAdapter$AddMorePrescriptionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/intellihealth/truemeds/databinding/AdapterAddmorePrescriptionOrderSummaryBinding;", "(Lcom/intellihealth/truemeds/databinding/AdapterAddmorePrescriptionOrderSummaryBinding;)V", "getBinding", "()Lcom/intellihealth/truemeds/databinding/AdapterAddmorePrescriptionOrderSummaryBinding;", "app_stageAndroidDebug"})
    public static final class AddMorePrescriptionViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.intellihealth.truemeds.databinding.AdapterAddmorePrescriptionOrderSummaryBinding binding = null;
        
        public AddMorePrescriptionViewHolder(@org.jetbrains.annotations.NotNull()
        com.intellihealth.truemeds.databinding.AdapterAddmorePrescriptionOrderSummaryBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.intellihealth.truemeds.databinding.AdapterAddmorePrescriptionOrderSummaryBinding getBinding() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/DoctorPrescriptionOrderSummaryAdapter$Companion;", "", "()V", "ADD_MORE_PRESCRIPTION", "", "SHOW_UPLOADED_PRESCRIPTION", "app_stageAndroidDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/DoctorPrescriptionOrderSummaryAdapter$ViewUploadedPrescriptionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/intellihealth/truemeds/databinding/AdapterDoctorPrescriptionOrderSummaryBinding;", "(Lcom/intellihealth/truemeds/databinding/AdapterDoctorPrescriptionOrderSummaryBinding;)V", "getBinding", "()Lcom/intellihealth/truemeds/databinding/AdapterDoctorPrescriptionOrderSummaryBinding;", "bind", "", "item", "", "app_stageAndroidDebug"})
    public static final class ViewUploadedPrescriptionViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.intellihealth.truemeds.databinding.AdapterDoctorPrescriptionOrderSummaryBinding binding = null;
        
        public ViewUploadedPrescriptionViewHolder(@org.jetbrains.annotations.NotNull()
        com.intellihealth.truemeds.databinding.AdapterDoctorPrescriptionOrderSummaryBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.intellihealth.truemeds.databinding.AdapterDoctorPrescriptionOrderSummaryBinding getBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        java.lang.String item) {
        }
    }
}