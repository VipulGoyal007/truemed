package com.intellihealth.truemeds.presentation.bottomsheet;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0010H\u0002J\u0006\u0010\u0014\u001a\u00020\u0000J\u0012\u0010\u0015\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J$\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u001b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\"\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006#"}, d2 = {"Lcom/intellihealth/truemeds/presentation/bottomsheet/ViewBillDetailsBottomSheet;", "Lcom/intellihealth/salt/views/bottomsheet/BottomSheet;", "()V", "binding", "Lcom/intellihealth/truemeds/databinding/BottomsheetViewBillDetailsBinding;", "dialog", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "model", "Lcom/intellihealth/salt/models/BillDetailsModel;", "viewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/PaymentOptionsViewModel;", "getViewModel", "()Lcom/intellihealth/truemeds/presentation/viewmodel/PaymentOptionsViewModel;", "setViewModel", "(Lcom/intellihealth/truemeds/presentation/viewmodel/PaymentOptionsViewModel;)V", "closeBottomSheet", "", "getTheme", "", "initView", "newInstance", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "setEventListeners", "app_stageAndroidDebug"})
public final class ViewBillDetailsBottomSheet extends com.intellihealth.salt.views.bottomsheet.BottomSheet {
    public com.intellihealth.truemeds.presentation.viewmodel.PaymentOptionsViewModel viewModel;
    private com.intellihealth.truemeds.databinding.BottomsheetViewBillDetailsBinding binding;
    private com.intellihealth.salt.models.BillDetailsModel model;
    private com.google.android.material.bottomsheet.BottomSheetDialog dialog;
    
    public ViewBillDetailsBottomSheet() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.viewmodel.PaymentOptionsViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.PaymentOptionsViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.bottomsheet.ViewBillDetailsBottomSheet newInstance() {
        return null;
    }
    
    /**
     * Set the style for bottomsheet
     */
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Inflate the bottomsheet view
     */
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    /**
     * 1) Bind the viewmodel to the view inside initView()
     * 2) Setup event listeners
     */
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void initView() {
    }
    
    /**
     * observe eventPaymentChange whenever change mode button is clicked,
     * observe eventPaymentChangeCloseBS whenever dont remove button is clicked and call dismiss to close the bottomsheet
     */
    private final void setEventListeners() {
    }
    
    @java.lang.Override()
    public int getTheme() {
        return 0;
    }
    
    private final void closeBottomSheet() {
    }
}