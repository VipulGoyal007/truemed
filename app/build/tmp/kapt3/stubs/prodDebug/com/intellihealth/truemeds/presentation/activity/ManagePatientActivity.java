package com.intellihealth.truemeds.presentation.activity;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018J\b\u0010\u0019\u001a\u00020\u0016H\u0016J\b\u0010\u001a\u001a\u00020\u0016H\u0002J\u0012\u0010\u001b\u001a\u00020\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\u0006\u0010\u001e\u001a\u00020\u0016J\b\u0010\u001f\u001a\u00020\u0016H\u0002J\u0006\u0010 \u001a\u00020\u0016R\u001c\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/intellihealth/truemeds/presentation/activity/ManagePatientActivity;", "Lcom/intellihealth/truemeds/presentation/activity/BaseActivity;", "()V", "activityLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "binding", "Lcom/intellihealth/truemeds/databinding/ActivityManagePatientBinding;", "getBinding", "()Lcom/intellihealth/truemeds/databinding/ActivityManagePatientBinding;", "binding$delegate", "Lcom/intellihealth/truemeds/presentation/utils/ActivityViewBindingDelegate;", "comingFromAccountFragment", "", "context", "Landroid/content/Context;", "editDeleteAddressBottomSheet", "Lcom/intellihealth/truemeds/presentation/bottomsheet/managepatient/BottomSheetFragment;", "viewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/ManagePatientViewModel;", "checkForNetworkAndDoApiCallings", "", "type", "", "extractIntentData", "initView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "redirectToAddPatient", "setCallbacks", "setObservers", "app_prodDebug"})
public final class ManagePatientActivity extends com.intellihealth.truemeds.presentation.activity.BaseActivity {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.presentation.utils.ActivityViewBindingDelegate binding$delegate = null;
    private com.intellihealth.truemeds.presentation.viewmodel.ManagePatientViewModel viewModel;
    private android.content.Context context;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.presentation.bottomsheet.managepatient.BottomSheetFragment editDeleteAddressBottomSheet;
    private boolean comingFromAccountFragment = false;
    @org.jetbrains.annotations.NotNull()
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> activityLauncher;
    
    public ManagePatientActivity() {
        super();
    }
    
    private final com.intellihealth.truemeds.databinding.ActivityManagePatientBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void extractIntentData() {
    }
    
    private final void initView() {
    }
    
    public final void checkForNetworkAndDoApiCallings(int type) {
    }
    
    private final void setCallbacks() {
    }
    
    public final void setObservers() {
    }
    
    public final void redirectToAddPatient() {
    }
}