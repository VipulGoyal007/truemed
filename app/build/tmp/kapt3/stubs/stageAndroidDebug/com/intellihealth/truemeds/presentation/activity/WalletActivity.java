package com.intellihealth.truemeds.presentation.activity;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002J\u0006\u0010\u0018\u001a\u00020\u0014J\b\u0010\u0019\u001a\u00020\u0014H\u0016J\b\u0010\u001a\u001a\u00020\u0014H\u0002J\u0012\u0010\u001b\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0014J\u0010\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u0014H\u0002J\b\u0010!\u001a\u00020\u0014H\u0002J\b\u0010\"\u001a\u00020\u0014H\u0002J\b\u0010#\u001a\u00020\u0014H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/intellihealth/truemeds/presentation/activity/WalletActivity;", "Lcom/intellihealth/truemeds/presentation/activity/BaseActivity;", "()V", "anim", "Landroid/os/Bundle;", "getAnim", "()Landroid/os/Bundle;", "setAnim", "(Landroid/os/Bundle;)V", "binding", "Lcom/intellihealth/truemeds/databinding/ActivityWalletBinding;", "getBinding", "()Lcom/intellihealth/truemeds/databinding/ActivityWalletBinding;", "binding$delegate", "Lcom/intellihealth/truemeds/presentation/utils/ActivityViewBindingDelegate;", "handler", "Landroid/os/Handler;", "viewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/WalletViewModel;", "addFaq", "", "faqlist", "", "Lcom/intellihealth/truemeds/data/model/helpfaqtnc/FaqCategoryResponse$Payload;", "checkForNetworkAndDoApiCallings", "extractIntentData", "initViewModelApi", "onCreate", "savedInstanceState", "openWalletTransaction", "isRewardTransact", "", "setAndObserveData", "setupBackPressedAction", "setupData", "showNoInternetDialog", "app_stageAndroidDebug"})
public final class WalletActivity extends com.intellihealth.truemeds.presentation.activity.BaseActivity {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.presentation.utils.ActivityViewBindingDelegate binding$delegate = null;
    private com.intellihealth.truemeds.presentation.viewmodel.WalletViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    private final android.os.Handler handler = null;
    @org.jetbrains.annotations.NotNull()
    private android.os.Bundle anim;
    
    public WalletActivity() {
        super();
    }
    
    private final com.intellihealth.truemeds.databinding.ActivityWalletBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.os.Bundle getAnim() {
        return null;
    }
    
    public final void setAnim(@org.jetbrains.annotations.NotNull()
    android.os.Bundle p0) {
    }
    
    @java.lang.Override()
    public void extractIntentData() {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupData() {
    }
    
    private final void openWalletTransaction(boolean isRewardTransact) {
    }
    
    private final void setupBackPressedAction() {
    }
    
    private final void initViewModelApi() {
    }
    
    public final void checkForNetworkAndDoApiCallings() {
    }
    
    private final void addFaq(java.util.List<com.intellihealth.truemeds.data.model.helpfaqtnc.FaqCategoryResponse.Payload> faqlist) {
    }
    
    private final void setAndObserveData() {
    }
    
    private final void showNoInternetDialog() {
    }
}