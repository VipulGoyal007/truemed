package com.intellihealth.truemeds.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010 \u001a\u00020!2\u0006\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\"\u001a\u00020\u0012J\u000e\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020%R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR&\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R&\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\t\"\u0004\b\u001f\u0010\u000b\u00a8\u0006&"}, d2 = {"Lcom/intellihealth/truemeds/presentation/viewmodel/LoginViewModel;", "Lcom/intellihealth/truemeds/presentation/viewmodel/BaseViewModelWithLogin;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "loginUseCase", "Lcom/intellihealth/truemeds/domain/usecase/LoginUseCase;", "(Lcom/intellihealth/truemeds/domain/usecase/LoginUseCase;)V", "clickedOnPage", "", "getClickedOnPage", "()Ljava/lang/String;", "setClickedOnPage", "(Ljava/lang/String;)V", "currentPageName", "getCurrentPageName", "setCurrentPageName", "notificationPermissionCallBack", "Landroidx/lifecycle/MutableLiveData;", "Lcom/intellihealth/truemeds/presentation/viewmodel/events/Event;", "", "getNotificationPermissionCallBack", "()Landroidx/lifecycle/MutableLiveData;", "setNotificationPermissionCallBack", "(Landroidx/lifecycle/MutableLiveData;)V", "notificationPermissionCallBackLivedata", "Landroidx/lifecycle/LiveData;", "getNotificationPermissionCallBackLivedata", "()Landroidx/lifecycle/LiveData;", "setNotificationPermissionCallBackLivedata", "(Landroidx/lifecycle/LiveData;)V", "pageSection", "getPageSection", "setPageSection", "sendLoginSkippedEvent", "", "isNewCustomer", "sendOTPTypeEvent", "mxOtpTyped", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxOtpTyped;", "app_prodDebug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class LoginViewModel extends com.intellihealth.truemeds.presentation.viewmodel.BaseViewModelWithLogin implements androidx.lifecycle.DefaultLifecycleObserver {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String currentPageName = "login_page";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String clickedOnPage = "app_open";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String pageSection = "";
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Boolean>> notificationPermissionCallBack;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Boolean>> notificationPermissionCallBackLivedata;
    
    @javax.inject.Inject()
    public LoginViewModel(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.LoginUseCase loginUseCase) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrentPageName() {
        return null;
    }
    
    public final void setCurrentPageName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getClickedOnPage() {
        return null;
    }
    
    public final void setClickedOnPage(@org.jetbrains.annotations.NotNull()
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
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Boolean>> getNotificationPermissionCallBack() {
        return null;
    }
    
    public final void setNotificationPermissionCallBack(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Boolean>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Boolean>> getNotificationPermissionCallBackLivedata() {
        return null;
    }
    
    public final void setNotificationPermissionCallBackLivedata(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Boolean>> p0) {
    }
    
    public final void sendLoginSkippedEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String currentPageName, boolean isNewCustomer) {
    }
    
    public final void sendOTPTypeEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxOtpTyped mxOtpTyped) {
    }
}