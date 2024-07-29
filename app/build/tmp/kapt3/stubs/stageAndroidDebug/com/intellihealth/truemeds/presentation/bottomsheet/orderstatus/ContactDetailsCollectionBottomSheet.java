package com.intellihealth.truemeds.presentation.bottomsheet.orderstatus;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B7\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u00a2\u0006\u0002\u0010\u000bB\u0005\u00a2\u0006\u0002\u0010\fJ\b\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020%H\u0016J\u0012\u0010&\u001a\u00020#2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\u0012\u0010)\u001a\u00020*2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J$\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u0001002\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\u001a\u00101\u001a\u00020#2\u0006\u00102\u001a\u00020,2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\b\u00103\u001a\u00020#H\u0002R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u00a8\u00064"}, d2 = {"Lcom/intellihealth/truemeds/presentation/bottomsheet/orderstatus/ContactDetailsCollectionBottomSheet;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "viewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/OrderStatusViewModel;", "orderId", "", "alternateNumber", "", "isEdit", "", "isAddAlternateEmail", "(Lcom/intellihealth/truemeds/presentation/viewmodel/OrderStatusViewModel;JLjava/lang/String;ZZ)V", "()V", "getAlternateNumber", "()Ljava/lang/String;", "setAlternateNumber", "(Ljava/lang/String;)V", "binding", "Lcom/intellihealth/truemeds/databinding/BottomsheetAlternateNumberBinding;", "dialog", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "enteredEmailId", "enteredMobileNo", "()Z", "setEdit", "(Z)V", "getOrderId", "()J", "setOrderId", "(J)V", "getViewModel", "()Lcom/intellihealth/truemeds/presentation/viewmodel/OrderStatusViewModel;", "setViewModel", "(Lcom/intellihealth/truemeds/presentation/viewmodel/OrderStatusViewModel;)V", "clickListeners", "", "getTheme", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "setObserver", "app_stageAndroidDebug"})
public final class ContactDetailsCollectionBottomSheet extends com.google.android.material.bottomsheet.BottomSheetDialogFragment {
    private com.intellihealth.truemeds.databinding.BottomsheetAlternateNumberBinding binding;
    private com.google.android.material.bottomsheet.BottomSheetDialog dialog;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String enteredMobileNo = "";
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.viewmodel.OrderStatusViewModel viewModel;
    private long orderId = 0L;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String alternateNumber = "";
    private boolean isEdit = false;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String enteredEmailId = "";
    private boolean isAddAlternateEmail = false;
    
    public ContactDetailsCollectionBottomSheet() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.presentation.viewmodel.OrderStatusViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.presentation.viewmodel.OrderStatusViewModel p0) {
    }
    
    public final long getOrderId() {
        return 0L;
    }
    
    public final void setOrderId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAlternateNumber() {
        return null;
    }
    
    public final void setAlternateNumber(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean isEdit() {
        return false;
    }
    
    public final void setEdit(boolean p0) {
    }
    
    public ContactDetailsCollectionBottomSheet(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.OrderStatusViewModel viewModel, long orderId, @org.jetbrains.annotations.Nullable()
    java.lang.String alternateNumber, boolean isEdit, boolean isAddAlternateEmail) {
        super();
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setObserver() {
    }
    
    private final void clickListeners() {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public int getTheme() {
        return 0;
    }
}