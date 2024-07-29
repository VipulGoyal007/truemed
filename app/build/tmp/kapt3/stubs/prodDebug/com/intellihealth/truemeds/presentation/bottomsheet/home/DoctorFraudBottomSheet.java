package com.intellihealth.truemeds.presentation.bottomsheet.home;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J&\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\"\u001a\u00020#H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006$"}, d2 = {"Lcom/intellihealth/truemeds/presentation/bottomsheet/home/DoctorFraudBottomSheet;", "Lcom/intellihealth/salt/views/bottomsheet/BottomSheet;", "callback", "Lcom/intellihealth/truemeds/presentation/callbacks/DoctorFraudCallback;", "model", "Lcom/intellihealth/truemeds/data/model/home/BottomSheetDefaultModel;", "(Lcom/intellihealth/truemeds/presentation/callbacks/DoctorFraudCallback;Lcom/intellihealth/truemeds/data/model/home/BottomSheetDefaultModel;)V", "()V", "binding", "Lcom/intellihealth/truemeds/databinding/BottomsheetDoctorFraudBinding;", "bottomSheetHeaderModel", "Lcom/intellihealth/salt/models/BottomsheetHeaderModel;", "getCallback", "()Lcom/intellihealth/truemeds/presentation/callbacks/DoctorFraudCallback;", "setCallback", "(Lcom/intellihealth/truemeds/presentation/callbacks/DoctorFraudCallback;)V", "dialog", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "getModel", "()Lcom/intellihealth/truemeds/data/model/home/BottomSheetDefaultModel;", "setModel", "(Lcom/intellihealth/truemeds/data/model/home/BottomSheetDefaultModel;)V", "getTheme", "", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "setListener", "", "app_prodDebug"})
public final class DoctorFraudBottomSheet extends com.intellihealth.salt.views.bottomsheet.BottomSheet {
    private com.google.android.material.bottomsheet.BottomSheetDialog dialog;
    private com.intellihealth.truemeds.databinding.BottomsheetDoctorFraudBinding binding;
    private com.intellihealth.salt.models.BottomsheetHeaderModel bottomSheetHeaderModel;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.callbacks.DoctorFraudCallback callback;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.data.model.home.BottomSheetDefaultModel model;
    
    public DoctorFraudBottomSheet() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.presentation.callbacks.DoctorFraudCallback getCallback() {
        return null;
    }
    
    public final void setCallback(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.presentation.callbacks.DoctorFraudCallback p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.home.BottomSheetDefaultModel getModel() {
        return null;
    }
    
    public final void setModel(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.BottomSheetDefaultModel p0) {
    }
    
    public DoctorFraudBottomSheet(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.callbacks.DoctorFraudCallback callback, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.home.BottomSheetDefaultModel model) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void setListener() {
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