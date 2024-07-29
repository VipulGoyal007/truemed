package com.intellihealth.truemeds.presentation.bottomsheet.logout;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J&\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u001a\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u001a2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u001e\u0010!\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u0012J\b\u0010$\u001a\u00020\u0014H\u0002J\u000e\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\'"}, d2 = {"Lcom/intellihealth/truemeds/presentation/bottomsheet/logout/LogoutBottomSheet;", "Lcom/intellihealth/salt/views/bottomsheet/BottomSheet;", "()V", "binding", "Lcom/intellihealth/truemeds/databinding/FragmentLogoutBottomSheetBinding;", "bottomSheetHeaderModel", "Lcom/intellihealth/salt/models/BottomsheetHeaderModel;", "dialog", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "header", "", "viewmodel", "Lcom/intellihealth/truemeds/presentation/viewmodel/AccountTabViewModel;", "getViewmodel", "()Lcom/intellihealth/truemeds/presentation/viewmodel/AccountTabViewModel;", "setViewmodel", "(Lcom/intellihealth/truemeds/presentation/viewmodel/AccountTabViewModel;)V", "getTheme", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "openBottomSheet", "height", "bottomsheetState", "setEventListeners", "setViewModel", "viewModel", "app_prodDebug"})
public final class LogoutBottomSheet extends com.intellihealth.salt.views.bottomsheet.BottomSheet {
    private com.intellihealth.truemeds.databinding.FragmentLogoutBottomSheetBinding binding;
    private com.intellihealth.salt.models.BottomsheetHeaderModel bottomSheetHeaderModel;
    private com.google.android.material.bottomsheet.BottomSheetDialog dialog;
    private boolean header = true;
    public com.intellihealth.truemeds.presentation.viewmodel.AccountTabViewModel viewmodel;
    
    public LogoutBottomSheet() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.viewmodel.AccountTabViewModel getViewmodel() {
        return null;
    }
    
    public final void setViewmodel(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.AccountTabViewModel p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
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
    
    private final void setEventListeners() {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public final void openBottomSheet(boolean header, int height, int bottomsheetState) {
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.AccountTabViewModel viewModel) {
    }
    
    @java.lang.Override()
    public int getTheme() {
        return 0;
    }
}