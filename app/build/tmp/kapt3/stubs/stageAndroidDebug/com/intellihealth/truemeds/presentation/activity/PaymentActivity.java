package com.intellihealth.truemeds.presentation.activity;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0011H\u0002J\u0012\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/intellihealth/truemeds/presentation/activity/PaymentActivity;", "Lcom/intellihealth/truemeds/presentation/activity/BaseActivity;", "()V", "binding", "Lcom/intellihealth/truemeds/databinding/ActivityPaymentBinding;", "getBinding", "()Lcom/intellihealth/truemeds/databinding/ActivityPaymentBinding;", "binding$delegate", "Lcom/intellihealth/truemeds/presentation/utils/ActivityViewBindingDelegate;", "clickedOnPage", "", "context", "Landroid/content/Context;", "paymentMethod", "viewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/PaymentStatusViewModel;", "eventObservers", "", "extractIntentData", "goToHomeScreenActivity", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_stageAndroidDebug"})
public final class PaymentActivity extends com.intellihealth.truemeds.presentation.activity.BaseActivity {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.presentation.utils.ActivityViewBindingDelegate binding$delegate = null;
    private com.intellihealth.truemeds.presentation.viewmodel.PaymentStatusViewModel viewModel;
    private android.content.Context context;
    private java.lang.String clickedOnPage;
    private java.lang.String paymentMethod;
    
    public PaymentActivity() {
        super();
    }
    
    private final com.intellihealth.truemeds.databinding.ActivityPaymentBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void extractIntentData() {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void eventObservers() {
    }
    
    private final void goToHomeScreenActivity() {
    }
}