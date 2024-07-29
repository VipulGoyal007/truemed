package com.intellihealth.truemeds.presentation.bottomsheet;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0018\u001a\u00020\u0016H\u0002J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J$\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u001a\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u001e\u0010&\u001a\u00020$2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u0016J\b\u0010)\u001a\u00020$H\u0002J\b\u0010*\u001a\u00020$H\u0002J\u000e\u0010+\u001a\u00020$2\u0006\u0010,\u001a\u00020\fR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006-"}, d2 = {"Lcom/intellihealth/truemeds/presentation/bottomsheet/HealthArticleBottomSheet;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "()V", "binding", "Lcom/intellihealth/truemeds/databinding/HealthArticleBottomsheetBinding;", "getBinding", "()Lcom/intellihealth/truemeds/databinding/HealthArticleBottomsheetBinding;", "setBinding", "(Lcom/intellihealth/truemeds/databinding/HealthArticleBottomsheetBinding;)V", "bottomSheetHeaderModel", "Lcom/intellihealth/salt/models/BottomsheetHeaderModel;", "dialog", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "header", "", "healthArticlesViewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/HealthArticlesViewModel;", "getHealthArticlesViewModel", "()Lcom/intellihealth/truemeds/presentation/viewmodel/HealthArticlesViewModel;", "healthArticlesViewModel$delegate", "Lkotlin/Lazy;", "getBottomSheetDialogDefaultHeight", "", "getTheme", "getWindowHeight", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "", "view", "openBottomSheet", "height", "bottomSheetState", "setEventListeners", "setUpData", "setupFullHeight", "bottomSheetDialog", "app_stageAndroidDebug"})
public final class HealthArticleBottomSheet extends com.google.android.material.bottomsheet.BottomSheetDialogFragment {
    private com.intellihealth.salt.models.BottomsheetHeaderModel bottomSheetHeaderModel;
    private com.google.android.material.bottomsheet.BottomSheetDialog dialog;
    public com.intellihealth.truemeds.databinding.HealthArticleBottomsheetBinding binding;
    private boolean header = true;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy healthArticlesViewModel$delegate = null;
    
    public HealthArticleBottomSheet() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.databinding.HealthArticleBottomsheetBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.databinding.HealthArticleBottomsheetBinding p0) {
    }
    
    private final com.intellihealth.truemeds.presentation.viewmodel.HealthArticlesViewModel getHealthArticlesViewModel() {
        return null;
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
    @org.jetbrains.annotations.NotNull()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public final void openBottomSheet(boolean header, int height, int bottomSheetState) {
    }
    
    public final void setupFullHeight(@org.jetbrains.annotations.NotNull()
    com.google.android.material.bottomsheet.BottomSheetDialog bottomSheetDialog) {
    }
    
    private final int getWindowHeight() {
        return 0;
    }
    
    private final int getBottomSheetDialogDefaultHeight() {
        return 0;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUpData() {
    }
    
    private final void setEventListeners() {
    }
    
    @java.lang.Override()
    public int getTheme() {
        return 0;
    }
}