package com.intellihealth.truemeds.presentation.activity;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0012\u0010\u0017\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u0014H\u0002J\b\u0010\u001b\u001a\u00020\u0014H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/intellihealth/truemeds/presentation/activity/PatientReminderActivity;", "Lcom/intellihealth/truemeds/presentation/activity/BaseActivity;", "()V", "binding", "Lcom/intellihealth/truemeds/databinding/ActivityPatientReminderBinding;", "getBinding", "()Lcom/intellihealth/truemeds/databinding/ActivityPatientReminderBinding;", "binding$delegate", "Lcom/intellihealth/truemeds/presentation/utils/ActivityViewBindingDelegate;", "context", "Landroid/content/Context;", "reminderBottomSheet", "Lcom/intellihealth/truemeds/presentation/bottomsheet/AddReminderBottomSheet;", "reminderDeleteFragment", "Lcom/intellihealth/truemeds/presentation/bottomsheet/ReminderDeleteFragment;", "reminderEditFragment", "Lcom/intellihealth/truemeds/presentation/bottomsheet/ReminderEditFragment;", "viewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/ReminderViewModel;", "extractIntentData", "", "isReminderFlow", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setButtonOrTitleText", "setEventListener", "app_prodDebug"})
public final class PatientReminderActivity extends com.intellihealth.truemeds.presentation.activity.BaseActivity {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.presentation.utils.ActivityViewBindingDelegate binding$delegate = null;
    private android.content.Context context;
    private com.intellihealth.truemeds.presentation.viewmodel.ReminderViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.presentation.bottomsheet.AddReminderBottomSheet reminderBottomSheet;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.presentation.bottomsheet.ReminderDeleteFragment reminderDeleteFragment;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.presentation.bottomsheet.ReminderEditFragment reminderEditFragment;
    
    public PatientReminderActivity() {
        super();
    }
    
    private final com.intellihealth.truemeds.databinding.ActivityPatientReminderBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void extractIntentData() {
    }
    
    private final void setButtonOrTitleText() {
    }
    
    private final void setEventListener() {
    }
    
    private final boolean isReminderFlow() {
        return false;
    }
}