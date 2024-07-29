package com.intellihealth.truemeds.presentation.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001c\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\n2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0017H\u0016J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u0017H\u0016J\u0018\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0017H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\""}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/PaymentOptionsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/intellihealth/truemeds/presentation/adapter/PaymentOptionsAdapter$MyViewHolder;", "paymentOptionsList", "", "Lcom/intellihealth/truemeds/data/model/psp/PaymentMethodResponse$ResponseData;", "viewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/PaymentOptionsViewModel;", "(Ljava/util/List;Lcom/intellihealth/truemeds/presentation/viewmodel/PaymentOptionsViewModel;)V", "mLastClickTime", "", "getPaymentOptionsList", "()Ljava/util/List;", "setPaymentOptionsList", "(Ljava/util/List;)V", "getViewModel", "()Lcom/intellihealth/truemeds/presentation/viewmodel/PaymentOptionsViewModel;", "setViewModel", "(Lcom/intellihealth/truemeds/presentation/viewmodel/PaymentOptionsViewModel;)V", "filterCategoryNameBasedOnPaymentModeUrlId", "", "placeOrderViaPaymentMethodId", "getItemCount", "", "getItemId", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MyViewHolder", "app_prodDebug"})
public final class PaymentOptionsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.intellihealth.truemeds.presentation.adapter.PaymentOptionsAdapter.MyViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData> paymentOptionsList;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.presentation.viewmodel.PaymentOptionsViewModel viewModel;
    private long mLastClickTime = 0L;
    
    public PaymentOptionsAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData> paymentOptionsList, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.PaymentOptionsViewModel viewModel) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData> getPaymentOptionsList() {
        return null;
    }
    
    public final void setPaymentOptionsList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.viewmodel.PaymentOptionsViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.PaymentOptionsViewModel p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.intellihealth.truemeds.presentation.adapter.PaymentOptionsAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.adapter.PaymentOptionsAdapter.MyViewHolder holder, @android.annotation.SuppressLint(value = {"RecyclerView"})
    int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String filterCategoryNameBasedOnPaymentModeUrlId(long placeOrderViaPaymentMethodId, @org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData> paymentOptionsList) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/PaymentOptionsAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/intellihealth/truemeds/databinding/PaymentOptionsListItemBinding;", "(Lcom/intellihealth/truemeds/databinding/PaymentOptionsListItemBinding;)V", "getBinding", "()Lcom/intellihealth/truemeds/databinding/PaymentOptionsListItemBinding;", "app_prodDebug"})
    public static final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.intellihealth.truemeds.databinding.PaymentOptionsListItemBinding binding = null;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        com.intellihealth.truemeds.databinding.PaymentOptionsListItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.intellihealth.truemeds.databinding.PaymentOptionsListItemBinding getBinding() {
            return null;
        }
    }
}