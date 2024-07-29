package com.intellihealth.truemeds.presentation.bottomsheet.home;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0015H\u0002J\u0012\u0010\u001a\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J&\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u001a\u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00020 2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u001e\u0010\'\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\r2\u0006\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u0018J\b\u0010*\u001a\u00020\u0015H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lcom/intellihealth/truemeds/presentation/bottomsheet/home/PrivacyPolicyBottomSheet;", "Lcom/intellihealth/salt/views/bottomsheet/BottomSheet;", "privacyPolicyModel", "Lcom/intellihealth/truemeds/data/model/home/PrivacyPolicyBottomSheetModel;", "(Lcom/intellihealth/truemeds/data/model/home/PrivacyPolicyBottomSheetModel;)V", "()V", "binding", "Lcom/intellihealth/truemeds/databinding/BottomsheetPrivacyPolicyBinding;", "bottomSheetHeaderModel", "Lcom/intellihealth/salt/models/BottomsheetHeaderModel;", "dialog", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "header", "", "homeViewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/HomeViewModel;", "getHomeViewModel", "()Lcom/intellihealth/truemeds/presentation/viewmodel/HomeViewModel;", "homeViewModel$delegate", "Lkotlin/Lazy;", "clickListeners", "", "getPolicyTnCData", "getTheme", "", "initView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "openBottomSheet", "height", "bottomSheetState", "setObserver", "app_prodDebug"})
public final class PrivacyPolicyBottomSheet extends com.intellihealth.salt.views.bottomsheet.BottomSheet {
    private com.intellihealth.truemeds.databinding.BottomsheetPrivacyPolicyBinding binding;
    private com.intellihealth.salt.models.BottomsheetHeaderModel bottomSheetHeaderModel;
    private com.google.android.material.bottomsheet.BottomSheetDialog dialog;
    private boolean header = true;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy homeViewModel$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.data.model.home.PrivacyPolicyBottomSheetModel privacyPolicyModel;
    
    public PrivacyPolicyBottomSheet() {
        super();
    }
    
    private final com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel getHomeViewModel() {
        return null;
    }
    
    public PrivacyPolicyBottomSheet(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.home.PrivacyPolicyBottomSheetModel privacyPolicyModel) {
        super();
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
    
    private final void setObserver() {
    }
    
    private final void initView() {
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
    
    private final void clickListeners() {
    }
    
    @java.lang.Override()
    public int getTheme() {
        return 0;
    }
    
    private final void getPolicyTnCData() {
    }
}