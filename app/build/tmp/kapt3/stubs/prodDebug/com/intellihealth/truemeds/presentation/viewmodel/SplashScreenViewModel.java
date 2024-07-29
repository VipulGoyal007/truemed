package com.intellihealth.truemeds.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/J\b\u00100\u001a\u00020-H\u0002J\u0010\u00101\u001a\u00020-2\u0006\u00102\u001a\u000203H\u0016J\u0010\u00104\u001a\u00020-2\u0006\u00102\u001a\u000203H\u0016J\u0010\u00105\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0007J\u0015\u00106\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0000\u00a2\u0006\u0002\b7J\u000e\u00108\u001a\u00020-2\u0006\u0010.\u001a\u00020/J\r\u00109\u001a\u00020-H\u0000\u00a2\u0006\u0002\b:R\u001c\u0010\u0006\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u000f0\u000f0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\u000e\u0010\u001f\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00138F\u00a2\u0006\u0006\u001a\u0004\b%\u0010\u0015R\u001d\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00138F\u00a2\u0006\u0006\u001a\u0004\b\'\u0010\u0015R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00138F\u00a2\u0006\u0006\u001a\u0004\b)\u0010\u0015R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00110\u00138F\u00a2\u0006\u0006\u001a\u0004\b+\u0010\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006;"}, d2 = {"Lcom/intellihealth/truemeds/presentation/viewmodel/SplashScreenViewModel;", "Lcom/intellihealth/truemeds/presentation/viewmodel/BaseViewModel;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "splashScreenUseCase", "Lcom/intellihealth/truemeds/domain/usecase/SplashScreenUseCase;", "(Lcom/intellihealth/truemeds/domain/usecase/SplashScreenUseCase;)V", "_goToPlayStore", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "_openHomePageActivity", "Lcom/intellihealth/truemeds/presentation/viewmodel/events/Event;", "", "_openLoginActivity", "_secondsRemainingForLoader", "", "_splashScreenImageType", "Lcom/intellihealth/truemeds/domain/enums/SplashScreenImageType;", "goToPlayStore", "Landroidx/lifecycle/LiveData;", "getGoToPlayStore", "()Landroidx/lifecycle/LiveData;", "intentDestinationPage", "", "getIntentDestinationPage", "()Ljava/lang/String;", "setIntentDestinationPage", "(Ljava/lang/String;)V", "intentOrderId", "getIntentOrderId", "setIntentOrderId", "isApiCallCompleted", "isLoaderCountDownCompleted", "isNextPageLaunched", "loaderTimer", "Landroid/os/CountDownTimer;", "openHomePageActivity", "getOpenHomePageActivity", "openLoginActivity", "getOpenLoginActivity", "secondsRemainingForLoader", "getSecondsRemainingForLoader", "splashScreenImageType", "getSplashScreenImageType", "getMobileMaster", "", "context", "Landroid/content/Context;", "launchNextPage", "onStart", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onStop", "sendAppOpenedEvent", "updateFirebaseId", "updateFirebaseId$app_prodDebug", "updateGoogleAdId", "updateSplashScreenImage", "updateSplashScreenImage$app_prodDebug", "app_prodDebug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class SplashScreenViewModel extends com.intellihealth.truemeds.presentation.viewmodel.BaseViewModel implements androidx.lifecycle.DefaultLifecycleObserver {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.SplashScreenUseCase splashScreenUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.domain.enums.SplashScreenImageType> _splashScreenImageType;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> _openLoginActivity = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> _openHomePageActivity = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _goToPlayStore = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> _secondsRemainingForLoader;
    private boolean isApiCallCompleted = false;
    private boolean isNextPageLaunched = false;
    private boolean isLoaderCountDownCompleted = false;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String intentOrderId = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String intentDestinationPage = "";
    
    /**
     * If splash Screen is visible for minimum 2 second
     * and api call to check whether the current app version is active or not is completed(either success or failure)
     * then only we need to redirect to other screen
     * If Splash Screen is visible more than or equal to 3 second, then show loader
     */
    @org.jetbrains.annotations.NotNull()
    private android.os.CountDownTimer loaderTimer;
    
    @javax.inject.Inject()
    public SplashScreenViewModel(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.SplashScreenUseCase splashScreenUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.domain.enums.SplashScreenImageType> getSplashScreenImageType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> getOpenLoginActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> getOpenHomePageActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getGoToPlayStore() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getSecondsRemainingForLoader() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIntentOrderId() {
        return null;
    }
    
    public final void setIntentOrderId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIntentDestinationPage() {
        return null;
    }
    
    public final void setIntentDestinationPage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    private final void launchNextPage() {
    }
    
    public final void updateSplashScreenImage$app_prodDebug() {
    }
    
    public final void updateGoogleAdId(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void updateFirebaseId$app_prodDebug(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void getMobileMaster(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onStart(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner owner) {
    }
    
    @java.lang.Override()
    public void onStop(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner owner) {
    }
    
    @android.annotation.SuppressLint(value = {"HardwareIds"})
    public final void sendAppOpenedEvent(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
}