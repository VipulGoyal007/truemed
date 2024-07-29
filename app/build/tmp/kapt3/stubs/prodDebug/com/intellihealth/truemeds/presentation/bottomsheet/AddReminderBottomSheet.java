package com.intellihealth.truemeds.presentation.bottomsheet;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0012\u0010!\u001a\u00020\"2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J&\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010)\u001a\u00020\u001eH\u0016J\u001a\u0010*\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020$2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010,\u001a\u00020\u001eH\u0002J\u001e\u0010-\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010.\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lcom/intellihealth/truemeds/presentation/bottomsheet/AddReminderBottomSheet;", "Lcom/intellihealth/salt/views/bottomsheet/BottomSheet;", "()V", "binding", "Lcom/intellihealth/truemeds/databinding/FragmentReminderBottomSheetBinding;", "bottomSheetCloseCallback", "Lcom/intellihealth/truemeds/data/callback/BottomSheetCloseCallback;", "dialog", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "firebaseEventUseCase", "Lcom/intellihealth/truemeds/domain/usecase/analytics/FirebaseEventUseCase;", "getFirebaseEventUseCase", "()Lcom/intellihealth/truemeds/domain/usecase/analytics/FirebaseEventUseCase;", "setFirebaseEventUseCase", "(Lcom/intellihealth/truemeds/domain/usecase/analytics/FirebaseEventUseCase;)V", "isFromOrderStatusActivity", "", "mxReminderSuccessfullySet", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxReminderSuccessfullySet;", "patientName", "", "getPatientName", "()Ljava/lang/String;", "setPatientName", "(Ljava/lang/String;)V", "viewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/ReminderViewModel;", "getTheme", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onViewCreated", "view", "setEventListener", "setReminderViewModel", "setReminderViewModelForOrderStatus", "app_prodDebug"})
public final class AddReminderBottomSheet extends com.intellihealth.salt.views.bottomsheet.BottomSheet {
    private com.intellihealth.truemeds.databinding.FragmentReminderBottomSheetBinding binding;
    private com.intellihealth.truemeds.presentation.viewmodel.ReminderViewModel viewModel;
    private com.google.android.material.bottomsheet.BottomSheetDialog dialog;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.data.model.mixpanel.MxReminderSuccessfullySet mxReminderSuccessfullySet;
    private boolean isFromOrderStatusActivity = false;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.data.callback.BottomSheetCloseCallback bottomSheetCloseCallback;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String patientName = "";
    @javax.inject.Inject()
    public com.intellihealth.truemeds.domain.usecase.analytics.FirebaseEventUseCase firebaseEventUseCase;
    
    public AddReminderBottomSheet() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPatientName() {
        return null;
    }
    
    public final void setPatientName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.domain.usecase.analytics.FirebaseEventUseCase getFirebaseEventUseCase() {
        return null;
    }
    
    public final void setFirebaseEventUseCase(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.analytics.FirebaseEventUseCase p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void setReminderViewModel(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.ReminderViewModel viewModel, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxReminderSuccessfullySet mxReminderSuccessfullySet, boolean isFromOrderStatusActivity) {
    }
    
    public final void setReminderViewModelForOrderStatus(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.ReminderViewModel viewModel, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.callback.BottomSheetCloseCallback bottomSheetCloseCallback) {
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
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    private final void setEventListener() {
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