package com.intellihealth.truemeds.presentation.activity;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\"H\u0002J\u0006\u0010$\u001a\u00020\"J\u0012\u0010%\u001a\u00020\"2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0014J\b\u0010(\u001a\u00020\"H\u0014J\b\u0010)\u001a\u00020\"H\u0002J\b\u0010*\u001a\u00020\"H\u0002J\b\u0010+\u001a\u00020\"H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lcom/intellihealth/truemeds/presentation/activity/SplashScreen;", "Lcom/intellihealth/truemeds/presentation/activity/BaseActivity;", "()V", "appUpdateInfoTask", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/play/core/appupdate/AppUpdateInfo;", "appUpdateManager", "Lcom/google/android/play/core/appupdate/AppUpdateManager;", "binding", "Lcom/intellihealth/truemeds/databinding/ActivitySplashScreenBinding;", "getBinding", "()Lcom/intellihealth/truemeds/databinding/ActivitySplashScreenBinding;", "binding$delegate", "Lcom/intellihealth/truemeds/presentation/utils/ActivityViewBindingDelegate;", "context", "Landroid/content/Context;", "conversionListener", "Lcom/appsflyer/AppsFlyerConversionListener;", "deferred_deep_link_processed_flag", "", "getDeferred_deep_link_processed_flag", "()Z", "setDeferred_deep_link_processed_flag", "(Z)V", "defrreddDeepLinkUri", "Landroid/net/Uri;", "installListener", "Lcom/google/android/play/core/install/InstallStateUpdatedListener;", "updateFlowResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroidx/activity/result/IntentSenderRequest;", "viewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/SplashScreenViewModel;", "extractIntentData", "", "getIntentData", "goToPlayStore", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onStop", "processAppsFlyerDeeplink", "processInAppUpdate", "setEventListener", "app_prodDebug"})
public final class SplashScreen extends com.intellihealth.truemeds.presentation.activity.BaseActivity {
    private android.content.Context context;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.presentation.utils.ActivityViewBindingDelegate binding$delegate = null;
    private com.intellihealth.truemeds.presentation.viewmodel.SplashScreenViewModel viewModel;
    @org.jetbrains.annotations.Nullable()
    private android.net.Uri defrreddDeepLinkUri;
    private boolean deferred_deep_link_processed_flag = false;
    private com.google.android.play.core.appupdate.AppUpdateManager appUpdateManager;
    private com.google.android.gms.tasks.Task<com.google.android.play.core.appupdate.AppUpdateInfo> appUpdateInfoTask;
    @org.jetbrains.annotations.NotNull()
    private final com.google.android.play.core.install.InstallStateUpdatedListener installListener = null;
    @org.jetbrains.annotations.Nullable()
    private androidx.activity.result.ActivityResultLauncher<androidx.activity.result.IntentSenderRequest> updateFlowResultLauncher;
    @org.jetbrains.annotations.NotNull()
    private final com.appsflyer.AppsFlyerConversionListener conversionListener = null;
    
    public SplashScreen() {
        super();
    }
    
    private final com.intellihealth.truemeds.databinding.ActivitySplashScreenBinding getBinding() {
        return null;
    }
    
    public final boolean getDeferred_deep_link_processed_flag() {
        return false;
    }
    
    public final void setDeferred_deep_link_processed_flag(boolean p0) {
    }
    
    @java.lang.Override()
    public void extractIntentData() {
    }
    
    /**
     * 1) Update SplashScreen image e.g. DEFAULT, CHRISTMAS
     * 2) Update Google AdId and FirebaseId
     * 3) Push CleverTap XiaomiRegistrationId
     * 4) Set event listener
     * 5) Get intent data (if any)
     * 6) Get Deeplink (if any)
     * 7) Check for in app update
     * 8) After taking action on InAppUpdate, api call to check whether the current app version is active or not
     */
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void processAppsFlyerDeeplink() {
    }
    
    private final void setEventListener() {
    }
    
    public final void goToPlayStore() {
    }
    
    private final void getIntentData() {
    }
    
    private final void processInAppUpdate() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
}