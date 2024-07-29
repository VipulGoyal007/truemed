package com.intellihealth.truemeds.presentation.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\b\u0007\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010\u0019\u001a\u00020\u000bH\u0016J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u000bH\u0016J\u0018\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u000bH\u0016J\u000e\u0010\"\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u000bR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/RxPrescriptionAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/intellihealth/truemeds/presentation/adapter/RxPrescriptionViewHolder;", "list", "", "Lcom/intellihealth/truemeds/data/model/orderflow/OrderRxInfo;", "callback", "Lcom/intellihealth/truemeds/presentation/callbacks/ViewPrescriptionCallback;", "context", "Landroid/content/Context;", "index", "", "(Ljava/util/List;Lcom/intellihealth/truemeds/presentation/callbacks/ViewPrescriptionCallback;Landroid/content/Context;I)V", "getCallback", "()Lcom/intellihealth/truemeds/presentation/callbacks/ViewPrescriptionCallback;", "getContext", "()Landroid/content/Context;", "getIndex", "()I", "items", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "selectedIndex", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateSelectedItemIndex", "app_prodDebug"})
public final class RxPrescriptionAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.intellihealth.truemeds.presentation.adapter.RxPrescriptionViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.presentation.callbacks.ViewPrescriptionCallback callback = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    private final int index = 0;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.intellihealth.truemeds.data.model.orderflow.OrderRxInfo> items;
    private int selectedIndex;
    
    @javax.inject.Inject()
    public RxPrescriptionAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.orderflow.OrderRxInfo> list, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.callbacks.ViewPrescriptionCallback callback, @org.jetbrains.annotations.NotNull()
    android.content.Context context, int index) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.callbacks.ViewPrescriptionCallback getCallback() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final int getIndex() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.truemeds.data.model.orderflow.OrderRxInfo> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.orderflow.OrderRxInfo> p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.intellihealth.truemeds.presentation.adapter.RxPrescriptionViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.adapter.RxPrescriptionViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void updateSelectedItemIndex(int position) {
    }
}