package com.intellihealth.truemeds.presentation.bottomsheet;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u0012H\u0002J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0016H\u0016J\u0012\u0010\u0017\u001a\u00020\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J$\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u001d2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0006\u0010$\u001a\u00020\u0012J\u000e\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0004R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/intellihealth/truemeds/presentation/bottomsheet/DoNotHavePrescriptionBottomSheet;", "Lcom/intellihealth/salt/views/bottomsheet/BottomSheet;", "fromPage", "", "(Ljava/lang/String;)V", "()V", "binding", "Lcom/intellihealth/truemeds/databinding/DoNotHaveBottomsheetBinding;", "dialog", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "getFromPage", "()Ljava/lang/String;", "setFromPage", "viewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/PrescriptionViewModel;", "getTheme", "", "initUIButton", "", "launchCartPage", "launchOrderSummary", "onCancel", "Landroid/content/DialogInterface;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "setOnClickListener", "setViewModel", "prescriptionViewModel", "app_stageAndroidDebug"})
public final class DoNotHavePrescriptionBottomSheet extends com.intellihealth.salt.views.bottomsheet.BottomSheet {
    private com.intellihealth.truemeds.databinding.DoNotHaveBottomsheetBinding binding;
    private com.intellihealth.truemeds.presentation.viewmodel.PrescriptionViewModel viewModel;
    private com.google.android.material.bottomsheet.BottomSheetDialog dialog;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String fromPage = "";
    
    public DoNotHavePrescriptionBottomSheet() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFromPage() {
        return null;
    }
    
    public final void setFromPage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public DoNotHavePrescriptionBottomSheet(@org.jetbrains.annotations.NotNull()
    java.lang.String fromPage) {
        super();
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.PrescriptionViewModel prescriptionViewModel) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void initUIButton() {
    }
    
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
    
    @java.lang.Override()
    public int getTheme() {
        return 0;
    }
    
    @java.lang.Override()
    public void onCancel(@org.jetbrains.annotations.NotNull()
    android.content.DialogInterface dialog) {
    }
    
    public final void setOnClickListener() {
    }
    
    private final void launchOrderSummary() {
    }
    
    private final void launchCartPage() {
    }
}