package com.intellihealth.truemeds.presentation.bottomsheet.home;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006B\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u000fH\u0002J\u0012\u0010\u0017\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J&\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u001d2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u001e\u0010$\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u0015J\b\u0010\'\u001a\u00020\u0013H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/intellihealth/truemeds/presentation/bottomsheet/home/ReorderBottomSheet;", "Lcom/intellihealth/salt/views/bottomsheet/BottomSheet;", "homeReorderBottomSheetModel", "Lcom/intellihealth/truemeds/data/model/home/HomeReorderBottomSheetModel;", "homeViewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/HomeViewModel;", "(Lcom/intellihealth/truemeds/data/model/home/HomeReorderBottomSheetModel;Lcom/intellihealth/truemeds/presentation/viewmodel/HomeViewModel;)V", "()V", "binding", "Lcom/intellihealth/truemeds/databinding/BottomsheetReorderBinding;", "bottomSheetHeaderModel", "Lcom/intellihealth/salt/models/BottomsheetHeaderModel;", "dialog", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "header", "", "mLastClickTime", "", "clickListeners", "", "getTheme", "", "isSingleClick", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "openBottomSheet", "height", "bottomSheetState", "setUpData", "app_prodDebug"})
public final class ReorderBottomSheet extends com.intellihealth.salt.views.bottomsheet.BottomSheet {
    private com.intellihealth.truemeds.databinding.BottomsheetReorderBinding binding;
    private com.intellihealth.salt.models.BottomsheetHeaderModel bottomSheetHeaderModel;
    private com.google.android.material.bottomsheet.BottomSheetDialog dialog;
    private boolean header = true;
    private long mLastClickTime = 0L;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.data.model.home.HomeReorderBottomSheetModel homeReorderBottomSheetModel;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel homeViewModel;
    
    public ReorderBottomSheet() {
        super();
    }
    
    public ReorderBottomSheet(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.HomeReorderBottomSheetModel homeReorderBottomSheetModel, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel homeViewModel) {
        super();
    }
    
    private final boolean isSingleClick() {
        return false;
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
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public final void openBottomSheet(boolean header, int height, int bottomSheetState) {
    }
    
    private final void setUpData() {
    }
    
    private final void clickListeners() {
    }
    
    @java.lang.Override()
    public int getTheme() {
        return 0;
    }
}