package com.intellihealth.truemeds.presentation.activity;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u00020\u0014H\u0016J\u0012\u0010\u0018\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u0014H\u0002J\u0010\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u0014H\u0002R\u001c\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/intellihealth/truemeds/presentation/activity/ManageAddressActivity;", "Lcom/intellihealth/truemeds/presentation/activity/BaseActivity;", "()V", "activityLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "binding", "Lcom/intellihealth/truemeds/databinding/ActivityManageAddressBinding;", "getBinding", "()Lcom/intellihealth/truemeds/databinding/ActivityManageAddressBinding;", "binding$delegate", "Lcom/intellihealth/truemeds/presentation/utils/ActivityViewBindingDelegate;", "comingFromAccountFragment", "", "context", "Landroid/content/Context;", "manageAddressViewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/ManageAddressViewModel;", "checkForNetworkAndDoApiCallings", "", "type", "", "extractIntentData", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setEventListener", "setHeaderData", "Lcom/intellihealth/salt/constants/MobileSectionTypeConstants;", "setObserver", "app_prodDebug"})
public final class ManageAddressActivity extends com.intellihealth.truemeds.presentation.activity.BaseActivity {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.presentation.utils.ActivityViewBindingDelegate binding$delegate = null;
    private com.intellihealth.truemeds.presentation.viewmodel.ManageAddressViewModel manageAddressViewModel;
    private android.content.Context context;
    private boolean comingFromAccountFragment = false;
    @org.jetbrains.annotations.NotNull()
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> activityLauncher;
    
    public ManageAddressActivity() {
        super();
    }
    
    private final com.intellihealth.truemeds.databinding.ActivityManageAddressBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void extractIntentData() {
    }
    
    public final void checkForNetworkAndDoApiCallings(int type) {
    }
    
    private final void setObserver() {
    }
    
    private final void setEventListener() {
    }
    
    private final void setHeaderData(com.intellihealth.salt.constants.MobileSectionTypeConstants type) {
    }
}