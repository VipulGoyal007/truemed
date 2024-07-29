package com.intellihealth.truemeds.presentation.activity;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0002J\b\u0010\u001d\u001a\u00020\u001bH\u0002J\u0012\u0010\u001e\u001a\u00020\u001b2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J\b\u0010!\u001a\u00020\u001bH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/intellihealth/truemeds/presentation/activity/PolicyDetailActivity;", "Lcom/intellihealth/truemeds/presentation/activity/BaseActivity;", "()V", "binding", "Lcom/intellihealth/truemeds/databinding/ActivityPolicyDetailBinding;", "getBinding", "()Lcom/intellihealth/truemeds/databinding/ActivityPolicyDetailBinding;", "binding$delegate", "Lcom/intellihealth/truemeds/presentation/utils/ActivityViewBindingDelegate;", "context", "Landroid/content/Context;", "isPrimary", "", "()Z", "setPrimary", "(Z)V", "privacyTncResponse", "Lcom/intellihealth/truemeds/data/model/helpfaqtnc/PrivacyPolicyAndTnCResponse$Legal;", "receivedData", "", "getReceivedData", "()Ljava/lang/String;", "setReceivedData", "(Ljava/lang/String;)V", "viewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/PolicyTncViewModel;", "extractIntentData", "", "getPolicyTnCData", "initView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setObservers", "app_stageAndroidDebug"})
public final class PolicyDetailActivity extends com.intellihealth.truemeds.presentation.activity.BaseActivity {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.presentation.utils.ActivityViewBindingDelegate binding$delegate = null;
    private com.intellihealth.truemeds.presentation.viewmodel.PolicyTncViewModel viewModel;
    private com.intellihealth.truemeds.data.model.helpfaqtnc.PrivacyPolicyAndTnCResponse.Legal privacyTncResponse;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String receivedData = "";
    private boolean isPrimary = true;
    private android.content.Context context;
    
    public PolicyDetailActivity() {
        super();
    }
    
    private final com.intellihealth.truemeds.databinding.ActivityPolicyDetailBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getReceivedData() {
        return null;
    }
    
    public final void setReceivedData(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean isPrimary() {
        return false;
    }
    
    public final void setPrimary(boolean p0) {
    }
    
    @java.lang.Override()
    public void extractIntentData() {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initView() {
    }
    
    private final void getPolicyTnCData() {
    }
    
    private final void setObservers() {
    }
}