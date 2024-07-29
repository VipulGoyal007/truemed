package com.intellihealth.truemeds.presentation.bottomsheet.productdetail;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0018\u001a\u00020\u0016H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0002J\b\u0010\u001a\u001a\u00020\u0014H\u0002J\u0010\u0010\u001b\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\bJ\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J$\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u001a\u0010\'\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\"2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010)\u001a\u00020\u0014H\u0002J\u0012\u0010*\u001a\u00020\u00142\b\u0010+\u001a\u0004\u0018\u00010\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lcom/intellihealth/truemeds/presentation/bottomsheet/productdetail/CompositionDetailsBottomSheet;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "()V", "binding", "Lcom/intellihealth/truemeds/databinding/BottomsheetCompositionDetailsBinding;", "bottomSheetHeaderModel", "Lcom/intellihealth/salt/models/BottomsheetHeaderModel;", "compositionDetails", "", "compositionList", "Ljava/util/ArrayList;", "Lcom/intellihealth/truemeds/data/model/home/CompositionBSDataModel;", "Lkotlin/collections/ArrayList;", "dialog", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "header", "", "viewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/ProductDetailViewModel;", "addObservers", "", "getBottomSheetDialogDefaultHeight", "", "getTheme", "getWindowHeight", "initArgs", "initView", "newInstance", "molecules", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "setEventListeners", "setupFullHeight", "bottomSheetDialog", "app_stageAndroidDebug"})
public final class CompositionDetailsBottomSheet extends com.google.android.material.bottomsheet.BottomSheetDialogFragment {
    private com.intellihealth.truemeds.databinding.BottomsheetCompositionDetailsBinding binding;
    private com.intellihealth.salt.models.BottomsheetHeaderModel bottomSheetHeaderModel;
    private com.google.android.material.bottomsheet.BottomSheetDialog dialog;
    private boolean header = true;
    private com.intellihealth.truemeds.presentation.viewmodel.ProductDetailViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.intellihealth.truemeds.data.model.home.CompositionBSDataModel> compositionList;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String compositionDetails = "";
    
    public CompositionDetailsBottomSheet() {
        super();
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
    
    private final void initArgs() {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void setupFullHeight(com.google.android.material.bottomsheet.BottomSheetDialog bottomSheetDialog) {
    }
    
    private final int getWindowHeight() {
        return 0;
    }
    
    private final int getBottomSheetDialogDefaultHeight() {
        return 0;
    }
    
    private final void setEventListeners() {
    }
    
    private final void initView() {
    }
    
    @java.lang.Override()
    public int getTheme() {
        return 0;
    }
    
    private final void addObservers() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.bottomsheet.productdetail.CompositionDetailsBottomSheet newInstance(@org.jetbrains.annotations.Nullable()
    java.lang.String molecules) {
        return null;
    }
}