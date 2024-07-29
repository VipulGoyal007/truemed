package com.intellihealth.truemeds.app;

@dagger.hilt.android.HiltAndroidApp()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014J\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u001c\u0010\f\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\b\u0010\u0011\u001a\u00020\bH\u0016J\b\u0010\u0012\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/intellihealth/truemeds/app/ApplicationClass;", "Landroidx/multidex/MultiDexApplication;", "()V", "conversionListener", "Lcom/appsflyer/AppsFlyerConversionListener;", "mixPanelEvent", "Lcom/intellihealth/truemeds/presentation/analytics/MixPanelEvent;", "attachBaseContext", "", "base", "Landroid/content/Context;", "getMixPanelEvent", "goToActivity", "activityName", "", "dlData", "Lcom/appsflyer/deeplink/DeepLink;", "onCreate", "processAppsFlyerDeeplink", "Companion", "app_stageAndroidDebug"})
public final class ApplicationClass extends androidx.multidex.MultiDexApplication {
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.analytics.MixPanelEvent mixPanelEvent;
    @org.jetbrains.annotations.NotNull()
    private final com.appsflyer.AppsFlyerConversionListener conversionListener = null;
    private static com.intellihealth.truemeds.app.ApplicationClass mInstance;
    @org.jetbrains.annotations.NotNull()
    public static final com.intellihealth.truemeds.app.ApplicationClass.Companion Companion = null;
    
    public ApplicationClass() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    protected void attachBaseContext(@org.jetbrains.annotations.Nullable()
    android.content.Context base) {
    }
    
    private final void processAppsFlyerDeeplink() {
    }
    
    private final void goToActivity(java.lang.String activityName, com.appsflyer.deeplink.DeepLink dlData) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.presentation.analytics.MixPanelEvent getMixPanelEvent() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/intellihealth/truemeds/app/ApplicationClass$Companion;", "", "()V", "mInstance", "Lcom/intellihealth/truemeds/app/ApplicationClass;", "getInstance", "app_stageAndroidDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.jvm.Synchronized()
        @org.jetbrains.annotations.NotNull()
        public final synchronized com.intellihealth.truemeds.app.ApplicationClass getInstance() {
            return null;
        }
    }
}