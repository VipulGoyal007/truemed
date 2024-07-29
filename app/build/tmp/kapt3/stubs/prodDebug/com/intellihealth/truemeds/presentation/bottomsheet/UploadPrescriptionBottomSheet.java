package com.intellihealth.truemeds.presentation.bottomsheet;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J$\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u001a\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020 2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\'\u001a\u00020\u0004H\u0002J\b\u0010(\u001a\u00020\u0004H\u0002J\b\u0010)\u001a\u00020\u0004H\u0002R\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/intellihealth/truemeds/presentation/bottomsheet/UploadPrescriptionBottomSheet;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "onCameraClick", "Lkotlin/Function0;", "", "onGalleryClick", "viewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/PrescriptionViewModel;", "fromPage", "", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/intellihealth/truemeds/presentation/viewmodel/PrescriptionViewModel;Ljava/lang/String;)V", "binding", "Lcom/intellihealth/truemeds/databinding/UploadPrescriptionBottomsheetBinding;", "getBinding", "()Lcom/intellihealth/truemeds/databinding/UploadPrescriptionBottomsheetBinding;", "setBinding", "(Lcom/intellihealth/truemeds/databinding/UploadPrescriptionBottomsheetBinding;)V", "bottomSheet", "Lcom/intellihealth/truemeds/presentation/bottomsheet/PastPrescriptionBottomSheet;", "getBottomSheet", "()Lcom/intellihealth/truemeds/presentation/bottomsheet/PastPrescriptionBottomSheet;", "setBottomSheet", "(Lcom/intellihealth/truemeds/presentation/bottomsheet/PastPrescriptionBottomSheet;)V", "dialog", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "getTheme", "", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "setApiCall", "setEventListeners", "setVisibility", "app_prodDebug"})
public final class UploadPrescriptionBottomSheet extends com.google.android.material.bottomsheet.BottomSheetDialogFragment {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onCameraClick = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onGalleryClick = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.presentation.viewmodel.PrescriptionViewModel viewModel = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String fromPage = null;
    private com.google.android.material.bottomsheet.BottomSheetDialog dialog;
    public com.intellihealth.truemeds.databinding.UploadPrescriptionBottomsheetBinding binding;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.bottomsheet.PastPrescriptionBottomSheet bottomSheet;
    
    public UploadPrescriptionBottomSheet(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onCameraClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onGalleryClick, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.PrescriptionViewModel viewModel, @org.jetbrains.annotations.NotNull()
    java.lang.String fromPage) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.databinding.UploadPrescriptionBottomsheetBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.databinding.UploadPrescriptionBottomsheetBinding p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.presentation.bottomsheet.PastPrescriptionBottomSheet getBottomSheet() {
        return null;
    }
    
    public final void setBottomSheet(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.presentation.bottomsheet.PastPrescriptionBottomSheet p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void setVisibility() {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
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
    public int getTheme() {
        return 0;
    }
    
    private final void setApiCall() {
    }
}