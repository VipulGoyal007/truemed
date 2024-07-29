package com.intellihealth.truemeds.presentation.bottomsheet;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\nJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\nJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J&\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010$\u001a\u00020\u0019H\u0016J\u001a\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\u001f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\'\u001a\u00020\u0019H\u0002J\b\u0010(\u001a\u00020\u0019H\u0002J\u000e\u0010)\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u0012J\u001e\u0010*\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010+\u001a\u00020,J\b\u0010-\u001a\u00020\u0019H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lcom/intellihealth/truemeds/presentation/bottomsheet/ReminderEditFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "()V", "binding", "Lcom/intellihealth/truemeds/databinding/FragmentEditReminderBinding;", "bottomSheetCloseCallback", "Lcom/intellihealth/truemeds/data/callback/BottomSheetCloseCallback;", "dialog", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "formattedDate", "", "reminderDeleteFragment", "Lcom/intellihealth/truemeds/presentation/bottomsheet/ReminderDeleteFragment;", "sdf", "Ljava/text/SimpleDateFormat;", "selectedCalendar", "Ljava/util/Calendar;", "viewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/ReminderViewModel;", "changeDateFormat", "inputDate", "changeDateFormatInApiFormat", "getTheme", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onResume", "onViewCreated", "view", "setChipTitle", "setEventListener", "setReminderViewModel", "setReminderViewModelForOrderStatus", "mxReminderSuccessfullySet", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxReminderSuccessfullySet;", "showDatePickerDialog", "app_stageAndroidDebug"})
public final class ReminderEditFragment extends com.google.android.material.bottomsheet.BottomSheetDialogFragment {
    private com.intellihealth.truemeds.databinding.FragmentEditReminderBinding binding;
    private com.intellihealth.truemeds.presentation.viewmodel.ReminderViewModel viewModel;
    private com.google.android.material.bottomsheet.BottomSheetDialog dialog;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Calendar selectedCalendar = null;
    @org.jetbrains.annotations.NotNull()
    private final java.text.SimpleDateFormat sdf = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String formattedDate = "";
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.data.callback.BottomSheetCloseCallback bottomSheetCloseCallback;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.presentation.bottomsheet.ReminderDeleteFragment reminderDeleteFragment;
    
    public ReminderEditFragment() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void setReminderViewModel(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.ReminderViewModel viewModel) {
    }
    
    public final void setReminderViewModelForOrderStatus(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.ReminderViewModel viewModel, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.callback.BottomSheetCloseCallback bottomSheetCloseCallback, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxReminderSuccessfullySet mxReminderSuccessfullySet) {
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
    public void onResume() {
    }
    
    private final void setChipTitle() {
    }
    
    private final void setEventListener() {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void showDatePickerDialog() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String changeDateFormat(@org.jetbrains.annotations.Nullable()
    java.lang.String inputDate) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String changeDateFormatInApiFormat(@org.jetbrains.annotations.Nullable()
    java.lang.String inputDate) {
        return null;
    }
    
    @java.lang.Override()
    public int getTheme() {
        return 0;
    }
}