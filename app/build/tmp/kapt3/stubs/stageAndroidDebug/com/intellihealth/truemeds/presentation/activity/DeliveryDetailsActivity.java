package com.intellihealth.truemeds.presentation.activity;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014H\u0002J\u001a\u0010 \u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020\b2\b\b\u0002\u0010\"\u001a\u00020\u0014J\b\u0010#\u001a\u00020\u001eH\u0016J\u0010\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020&H\u0002J\u0006\u0010\'\u001a\u00020\u001eJ\u0012\u0010(\u001a\u00020\u001e2\b\u0010)\u001a\u0004\u0018\u00010*H\u0014J\b\u0010+\u001a\u00020\u001eH\u0014J\b\u0010,\u001a\u00020\u001eH\u0002J\b\u0010-\u001a\u00020\u001eH\u0002J\b\u0010.\u001a\u00020\u001eH\u0002J\b\u0010/\u001a\u00020\u001eH\u0002J\b\u00100\u001a\u00020\u001eH\u0002J\u0006\u00101\u001a\u00020\u001eJ\b\u00102\u001a\u00020\u001eH\u0002J\u0006\u00103\u001a\u00020\u001eJ\b\u00104\u001a\u00020\u001eH\u0002J\b\u00105\u001a\u00020\u001eH\u0002J\b\u00106\u001a\u00020\u001eH\u0002R\u001c\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001a\u00a8\u00067"}, d2 = {"Lcom/intellihealth/truemeds/presentation/activity/DeliveryDetailsActivity;", "Lcom/intellihealth/truemeds/presentation/activity/BaseActivity;", "()V", "activityLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "addressCount", "", "binding", "Lcom/intellihealth/truemeds/databinding/ActivityDeliveryDetailsBinding;", "getBinding", "()Lcom/intellihealth/truemeds/databinding/ActivityDeliveryDetailsBinding;", "binding$delegate", "Lcom/intellihealth/truemeds/presentation/utils/ActivityViewBindingDelegate;", "clickedOnPage", "", "handler", "Landroid/os/Handler;", "isFromPrescription", "", "patientCount", "redirectToCart", "viewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/DeliveryDetailsViewModel;", "getViewModel", "()Lcom/intellihealth/truemeds/presentation/viewmodel/DeliveryDetailsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "callBackToReorderActivity", "", "discard", "checkForNetworkAndDoApiCallings", "type", "isCallAddress", "extractIntentData", "goToAddPatientActivity", "patient", "Lcom/intellihealth/truemeds/data/model/user/GetAllPatientResponse$Patient;", "initView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "redirectToAddAddress", "redirectToAddPatient", "redirectToEditAddress", "redirectToEditPatient", "redirectToOrderSummary", "redirectToPrescriPtionPage", "setCallbacks", "setObservers", "setSaveBtnText", "setupOnBackPressed", "showDiscardOrderDialog", "app_stageAndroidDebug"})
public final class DeliveryDetailsActivity extends com.intellihealth.truemeds.presentation.activity.BaseActivity {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.presentation.utils.ActivityViewBindingDelegate binding$delegate = null;
    private int addressCount = 0;
    private int patientCount = 0;
    private boolean redirectToCart = false;
    private boolean isFromPrescription = false;
    @org.jetbrains.annotations.NotNull()
    private final android.os.Handler handler = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String clickedOnPage;
    @org.jetbrains.annotations.NotNull()
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> activityLauncher;
    
    public DeliveryDetailsActivity() {
        super();
    }
    
    private final com.intellihealth.truemeds.presentation.viewmodel.DeliveryDetailsViewModel getViewModel() {
        return null;
    }
    
    private final com.intellihealth.truemeds.databinding.ActivityDeliveryDetailsBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void extractIntentData() {
    }
    
    public final void initView() {
    }
    
    private final void setSaveBtnText() {
    }
    
    private final void setCallbacks() {
    }
    
    private final void goToAddPatientActivity(com.intellihealth.truemeds.data.model.user.GetAllPatientResponse.Patient patient) {
    }
    
    private final void showDiscardOrderDialog() {
    }
    
    private final void callBackToReorderActivity(boolean discard) {
    }
    
    public final void setObservers() {
    }
    
    private final void redirectToAddPatient() {
    }
    
    private final void redirectToAddAddress() {
    }
    
    private final void redirectToEditAddress() {
    }
    
    private final void redirectToEditPatient() {
    }
    
    private final void redirectToOrderSummary() {
    }
    
    public final void checkForNetworkAndDoApiCallings(int type, boolean isCallAddress) {
    }
    
    private final void setupOnBackPressed() {
    }
    
    public final void redirectToPrescriPtionPage() {
    }
}