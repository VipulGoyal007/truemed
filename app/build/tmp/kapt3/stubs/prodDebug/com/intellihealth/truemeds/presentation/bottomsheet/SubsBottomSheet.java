package com.intellihealth.truemeds.presentation.bottomsheet;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001aH\u0002J\b\u0010\u001c\u001a\u00020\u0015H\u0016J\b\u0010\u001d\u001a\u00020\u001aH\u0002J\b\u0010\u001e\u001a\u00020\u001aH\u0002J\u0006\u0010\u001f\u001a\u00020\u0000J\u0010\u0010 \u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020!H\u0016J\u0012\u0010\"\u001a\u00020\u001a2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0012\u0010%\u001a\u00020&2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J&\u0010\'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010-\u001a\u00020\u001aH\u0016J\u001a\u0010.\u001a\u00020\u001a2\u0006\u0010/\u001a\u00020(2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u000e\u00100\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u00101\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0018J,\u00102\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00063"}, d2 = {"Lcom/intellihealth/truemeds/presentation/bottomsheet/SubsBottomSheet;", "Lcom/intellihealth/salt/views/bottomsheet/BottomSheet;", "()V", "binding", "Lcom/intellihealth/truemeds/databinding/FragmentSubsBottomSheetBinding;", "clicked_suggestion_type", "", "dialog", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "firebaseEventUseCase", "Lcom/intellihealth/truemeds/domain/usecase/analytics/FirebaseEventUseCase;", "getFirebaseEventUseCase", "()Lcom/intellihealth/truemeds/domain/usecase/analytics/FirebaseEventUseCase;", "setFirebaseEventUseCase", "(Lcom/intellihealth/truemeds/domain/usecase/analytics/FirebaseEventUseCase;)V", "model", "Lcom/intellihealth/truemeds/presentation/model/ProductInfoModel;", "orgSubCompareBottomSheetCallback", "Lcom/intellihealth/truemeds/data/callback/OrgSubCompareBottomSheetCallback;", "suggestion_term_clicked", "suggestion_term_clicked_position", "", "term_searched", "viewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/ProductDetailViewModel;", "dismissMissBottomSheet", "", "eventListeners", "getTheme", "getUpdatedDBCount", "initArgs", "newInstance", "onCancel", "Landroid/content/DialogInterface;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onResume", "onViewCreated", "view", "setCallback", "setProductViewModel", "setUpEventData", "app_prodDebug"})
public final class SubsBottomSheet extends com.intellihealth.salt.views.bottomsheet.BottomSheet {
    private com.intellihealth.truemeds.databinding.FragmentSubsBottomSheetBinding binding;
    private com.google.android.material.bottomsheet.BottomSheetDialog dialog;
    private com.intellihealth.truemeds.presentation.viewmodel.ProductDetailViewModel viewModel;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.data.callback.OrgSubCompareBottomSheetCallback orgSubCompareBottomSheetCallback;
    private com.intellihealth.truemeds.presentation.model.ProductInfoModel model;
    private int suggestion_term_clicked_position = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String suggestion_term_clicked;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String term_searched;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String clicked_suggestion_type;
    @javax.inject.Inject()
    public com.intellihealth.truemeds.domain.usecase.analytics.FirebaseEventUseCase firebaseEventUseCase;
    
    public SubsBottomSheet() {
        super();
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
    
    @java.lang.Override()
    public void onCancel(@org.jetbrains.annotations.NotNull()
    android.content.DialogInterface dialog) {
    }
    
    public final void setProductViewModel(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.ProductDetailViewModel viewModel) {
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
    
    private final void initArgs() {
    }
    
    private final void dismissMissBottomSheet() {
    }
    
    private final void eventListeners() {
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
    
    public final void setUpEventData(int suggestion_term_clicked_position, @org.jetbrains.annotations.Nullable()
    java.lang.String suggestion_term_clicked, @org.jetbrains.annotations.Nullable()
    java.lang.String term_searched, @org.jetbrains.annotations.Nullable()
    java.lang.String clicked_suggestion_type) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.bottomsheet.SubsBottomSheet newInstance() {
        return null;
    }
    
    public final void setCallback(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.callback.OrgSubCompareBottomSheetCallback orgSubCompareBottomSheetCallback) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    private final void getUpdatedDBCount() {
    }
}