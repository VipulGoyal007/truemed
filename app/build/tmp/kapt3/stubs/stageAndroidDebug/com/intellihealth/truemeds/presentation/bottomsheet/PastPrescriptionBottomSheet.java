package com.intellihealth.truemeds.presentation.bottomsheet;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u0005\u00a2\u0006\u0002\u0010\bJ\b\u0010%\u001a\u00020\u001cH\u0016J\u0012\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J$\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u00100\u001a\u000201H\u0016J\u001a\u00102\u001a\u0002012\u0006\u00103\u001a\u00020+2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u00104\u001a\u000201H\u0002J\b\u00105\u001a\u000201H\u0002J\b\u00106\u001a\u000201H\u0002J\b\u00107\u001a\u000201H\u0002R\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$\u00a8\u00068"}, d2 = {"Lcom/intellihealth/truemeds/presentation/bottomsheet/PastPrescriptionBottomSheet;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "dropDownDefaultModelsList", "", "Lcom/intellihealth/salt/models/DropDownDefaultModel;", "viewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/PrescriptionViewModel;", "(Ljava/util/List;Lcom/intellihealth/truemeds/presentation/viewmodel/PrescriptionViewModel;)V", "()V", "binding", "Lcom/intellihealth/truemeds/databinding/PastPrescriptionBottomsheetBinding;", "getBinding", "()Lcom/intellihealth/truemeds/databinding/PastPrescriptionBottomsheetBinding;", "setBinding", "(Lcom/intellihealth/truemeds/databinding/PastPrescriptionBottomsheetBinding;)V", "concatAdapter", "Landroidx/recyclerview/widget/ConcatAdapter;", "getConcatAdapter", "()Landroidx/recyclerview/widget/ConcatAdapter;", "setConcatAdapter", "(Landroidx/recyclerview/widget/ConcatAdapter;)V", "dialog", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "getDropDownDefaultModelsList", "()Ljava/util/List;", "setDropDownDefaultModelsList", "(Ljava/util/List;)V", "patientId", "", "getPatientId", "()I", "setPatientId", "(I)V", "getViewModel", "()Lcom/intellihealth/truemeds/presentation/viewmodel/PrescriptionViewModel;", "setViewModel", "(Lcom/intellihealth/truemeds/presentation/viewmodel/PrescriptionViewModel;)V", "getTheme", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onResume", "", "onViewCreated", "view", "setEventListeners", "setObserver", "setUpConcatAdapter", "setUpDropDown", "app_stageAndroidDebug"})
public final class PastPrescriptionBottomSheet extends com.google.android.material.bottomsheet.BottomSheetDialogFragment {
    private com.google.android.material.bottomsheet.BottomSheetDialog dialog;
    public com.intellihealth.truemeds.databinding.PastPrescriptionBottomsheetBinding binding;
    private int patientId = 0;
    @org.jetbrains.annotations.NotNull()
    private androidx.recyclerview.widget.ConcatAdapter concatAdapter;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.intellihealth.salt.models.DropDownDefaultModel> dropDownDefaultModelsList;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.viewmodel.PrescriptionViewModel viewModel;
    
    public PastPrescriptionBottomSheet() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.databinding.PastPrescriptionBottomsheetBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.databinding.PastPrescriptionBottomsheetBinding p0) {
    }
    
    public final int getPatientId() {
        return 0;
    }
    
    public final void setPatientId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.ConcatAdapter getConcatAdapter() {
        return null;
    }
    
    public final void setConcatAdapter(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.ConcatAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.salt.models.DropDownDefaultModel> getDropDownDefaultModelsList() {
        return null;
    }
    
    public final void setDropDownDefaultModelsList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.salt.models.DropDownDefaultModel> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.presentation.viewmodel.PrescriptionViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.presentation.viewmodel.PrescriptionViewModel p0) {
    }
    
    public PastPrescriptionBottomSheet(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.salt.models.DropDownDefaultModel> dropDownDefaultModelsList, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.PrescriptionViewModel viewModel) {
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
    
    private final void setObserver() {
    }
    
    private final void setUpDropDown() {
    }
    
    private final void setUpConcatAdapter() {
    }
    
    private final void setEventListeners() {
    }
    
    @java.lang.Override()
    public int getTheme() {
        return 0;
    }
    
    @java.lang.Override()
    public void onResume() {
    }
}