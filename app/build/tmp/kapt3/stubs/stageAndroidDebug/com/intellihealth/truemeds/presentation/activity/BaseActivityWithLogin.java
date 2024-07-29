package com.intellihealth.truemeds.presentation.activity;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\u0018H&J\b\u0010\u0019\u001a\u00020\u0018H&J\u0006\u0010\u001a\u001a\u00020\u0018J\b\u0010\u001b\u001a\u00020\u0018H&J\b\u0010\u001c\u001a\u00020\u0018H&J\u0010\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001fH&J&\u0010 \u001a\u00020\u00182\b\b\u0002\u0010!\u001a\u00020\"2\u0006\u0010\u000f\u001a\u00020\u00042\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00180$R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/intellihealth/truemeds/presentation/activity/BaseActivityWithLogin;", "Lcom/intellihealth/truemeds/presentation/activity/BaseActivity;", "()V", "authorizationCode", "", "getAuthorizationCode", "()Ljava/lang/String;", "setAuthorizationCode", "(Ljava/lang/String;)V", "codeVerifier", "getCodeVerifier", "setCodeVerifier", "login_clicked_on_page", "getLogin_clicked_on_page", "setLogin_clicked_on_page", "pageSection", "getPageSection", "setPageSection", "stateRequested", "getStateRequested", "setStateRequested", "tcOAuthCallback", "Lcom/truecaller/android/sdk/oAuth/TcOAuthCallback;", "closeLoginBottomSheet", "", "getTrueCallerUserDetails", "initializationTrueCallerOAuth", "openLoginBottomSheet", "sendLoginPageViewedEvent", "setIsTruecaller", "isTruecaller", "", "verifyLoginAndRedirect", "type", "Lcom/intellihealth/truemeds/domain/enums/LoginFromScreen;", "function", "Lkotlin/Function0;", "app_stageAndroidDebug"})
public abstract class BaseActivityWithLogin extends com.intellihealth.truemeds.presentation.activity.BaseActivity {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String stateRequested = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String codeVerifier = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String authorizationCode = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String pageSection = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String login_clicked_on_page = "homepage";
    @org.jetbrains.annotations.NotNull()
    private final com.truecaller.android.sdk.oAuth.TcOAuthCallback tcOAuthCallback = null;
    
    public BaseActivityWithLogin() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStateRequested() {
        return null;
    }
    
    public final void setStateRequested(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCodeVerifier() {
        return null;
    }
    
    public final void setCodeVerifier(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAuthorizationCode() {
        return null;
    }
    
    public final void setAuthorizationCode(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPageSection() {
        return null;
    }
    
    public final void setPageSection(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLogin_clicked_on_page() {
        return null;
    }
    
    public final void setLogin_clicked_on_page(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public abstract void setIsTruecaller(boolean isTruecaller);
    
    public abstract void sendLoginPageViewedEvent();
    
    public abstract void getTrueCallerUserDetails();
    
    public abstract void openLoginBottomSheet();
    
    public abstract void closeLoginBottomSheet();
    
    public final void initializationTrueCallerOAuth() {
    }
    
    public final void verifyLoginAndRedirect(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.enums.LoginFromScreen type, @org.jetbrains.annotations.NotNull()
    java.lang.String pageSection, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> function) {
    }
}