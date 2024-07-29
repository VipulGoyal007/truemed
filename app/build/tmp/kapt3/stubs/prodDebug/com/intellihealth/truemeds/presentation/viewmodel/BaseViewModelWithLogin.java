package com.intellihealth.truemeds.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010I\u001a\u00020JH\u0002J\u0006\u0010K\u001a\u00020\bJ.\u0010L\u001a\u00020J2\u0006\u0010M\u001a\u00020\u000e2\u0006\u0010N\u001a\u00020\u000e2\u0006\u0010O\u001a\u00020\u000e2\u0006\u0010P\u001a\u00020\u000e2\u0006\u0010Q\u001a\u00020RJ\b\u0010S\u001a\u00020JH\u0002J\u000e\u0010T\u001a\u00020J2\u0006\u0010U\u001a\u00020\u000eJ\u0016\u0010V\u001a\u00020J2\u0006\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020ZJ\u000e\u0010[\u001a\u00020J2\u0006\u0010Q\u001a\u00020RJ\u0016\u0010\\\u001a\u00020J2\u0006\u0010]\u001a\u00020\u000e2\u0006\u0010^\u001a\u00020\bJ\u0016\u0010_\u001a\u00020J2\u0006\u0010`\u001a\u00020a2\u0006\u0010\u0019\u001a\u00020\u000eJ\u000e\u0010b\u001a\u00020J2\u0006\u0010c\u001a\u00020\u000eJ\b\u0010d\u001a\u00020JH\u0002J\u0010\u0010e\u001a\u00020J2\u0006\u0010f\u001a\u00020\bH\u0002J\u0010\u0010g\u001a\u00020J2\u0006\u0010^\u001a\u00020\bH\u0002J\u001e\u0010h\u001a\b\u0012\u0004\u0012\u00020j0i2\u0006\u0010k\u001a\u00020j2\b\b\u0002\u0010l\u001a\u00020jJ\u0015\u0010m\u001a\u00020J2\u0006\u0010Q\u001a\u00020RH\u0000\u00a2\u0006\u0002\bnR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\t\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\b0\b0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u000f\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\b0\b0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u001f\u0010\u0011\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00120\u00120\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\fR\u001a\u0010\u0014\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\u001d\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\"8F\u00a2\u0006\u0006\u001a\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001b\"\u0004\b\'\u0010\u001dR\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020\b0\"8F\u00a2\u0006\u0006\u001a\u0004\b(\u0010$R \u0010)\u001a\b\u0012\u0004\u0012\u00020\b0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\f\"\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0016\"\u0004\b-\u0010\u0018R\u001a\u0010.\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0016\"\u0004\b/\u0010\u0018R\u001a\u00100\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0016\"\u0004\b1\u0010\u0018R\u001a\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\"8F\u00a2\u0006\u0006\u001a\u0004\b4\u0010$R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u00105\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u001b\"\u0004\b7\u0010\u001dR\u001c\u00108\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u001b\"\u0004\b:\u0010\u001dR\u001a\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010\fR\u001d\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0\u00070\"8F\u00a2\u0006\u0006\u001a\u0004\b@\u0010$R\u001f\u0010A\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\b0\b0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010\fR\u001d\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00070\"8F\u00a2\u0006\u0006\u001a\u0004\bD\u0010$R\u001d\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u0010\fR\u0017\u0010G\u001a\b\u0012\u0004\u0012\u00020\b0\"8F\u00a2\u0006\u0006\u001a\u0004\bH\u0010$\u00a8\u0006o"}, d2 = {"Lcom/intellihealth/truemeds/presentation/viewmodel/BaseViewModelWithLogin;", "Lcom/intellihealth/truemeds/presentation/viewmodel/BaseViewModel;", "loginUseCase", "Lcom/intellihealth/truemeds/domain/usecase/LoginUseCase;", "(Lcom/intellihealth/truemeds/domain/usecase/LoginUseCase;)V", "_eventTrueCallerLoginFailed", "Landroidx/lifecycle/MutableLiveData;", "Lcom/intellihealth/truemeds/presentation/viewmodel/events/Event;", "", "_isLoading", "kotlin.jvm.PlatformType", "get_isLoading", "()Landroidx/lifecycle/MutableLiveData;", "_showLoginError", "", "_updateButtonText", "get_updateButtonText", "bottomSheetPageSwitch", "", "getBottomSheetPageSwitch", "continueExploringFlowEnabled", "getContinueExploringFlowEnabled", "()Z", "setContinueExploringFlowEnabled", "(Z)V", "currentPageNameForSignup", "getCurrentPageNameForSignup", "()Ljava/lang/String;", "setCurrentPageNameForSignup", "(Ljava/lang/String;)V", "enteredOTP", "getEnteredOTP", "setEnteredOTP", "eventTrueCallerLoginFailed", "Landroidx/lifecycle/LiveData;", "getEventTrueCallerLoginFailed", "()Landroidx/lifecycle/LiveData;", "fillType", "getFillType", "setFillType", "isLoading", "isLoadingViewForLoginBottomSheet", "setLoadingViewForLoginBottomSheet", "(Landroidx/lifecycle/MutableLiveData;)V", "isNewCustomer", "setNewCustomer", "isOTPVerified", "setOTPVerified", "isTruecaller", "setTruecaller", "loginEvent", "loginPageSwitchObserver", "getLoginPageSwitchObserver", "mobileNumber", "getMobileNumber", "setMobileNumber", "mobileNumberErrorMessage", "getMobileNumberErrorMessage", "setMobileNumberErrorMessage", "otpEvent", "", "otpObserver", "getOtpObserver", "otpPageSwitchObserver", "getOtpPageSwitchObserver", "processSkipFlow", "getProcessSkipFlow", "showLoginError", "getShowLoginError", "tcObserver", "getTcObserver", "updateButtonText", "getUpdateButtonText", "backToLoginMobileNumberPage", "", "checkTrueCallerAvailability", "getTrueCallerUserDetails", "textAuthorizationCode", "clientId", "authorizationCode", "codeVerifier", "context", "Landroid/content/Context;", "hideLoader", "loginOTPEditClicked", "mobile", "loginPageViewedEvent", "mxLoginPageViewed", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxLoginPageViewed;", "afLoginPageViewed", "Lcom/intellihealth/truemeds/mvvm/data/appsflyer/AFLoginPageViewed;", "performOTPVerification", "performSendOTP", "enteredMobileNo", "isResendClicked", "sendOTPClickedEvent", "mxOtpClicked", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxOtpClicked;", "setCurrentPage", "currentPage", "showLoader", "showNextScreen", "isOtpFlow", "showOtpInputPage", "startCountDownTimer", "Lkotlinx/coroutines/flow/Flow;", "", "start", "delayInSeconds", "updateFirebaseId", "updateFirebaseId$app_prodDebug", "app_prodDebug"})
public class BaseViewModelWithLogin extends com.intellihealth.truemeds.presentation.viewmodel.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.LoginUseCase loginUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isLoading = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.String>> _showLoginError = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _updateButtonText = null;
    private boolean continueExploringFlowEnabled = false;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> otpEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Boolean>> _eventTrueCallerLoginFailed = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Boolean>> loginEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.String>> otpObserver = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.String>> tcObserver = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> processSkipFlow = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String mobileNumberErrorMessage = "";
    private boolean isOTPVerified = false;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> bottomSheetPageSwitch = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String mobileNumber = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String fillType = "keyboard_typed";
    private boolean isTruecaller = false;
    private boolean isNewCustomer = false;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String enteredOTP = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String currentPageNameForSignup = "app_open";
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoadingViewForLoginBottomSheet;
    
    public BaseViewModelWithLogin(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.LoginUseCase loginUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> get_isLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.String>> getShowLoginError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> get_updateButtonText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getUpdateButtonText() {
        return null;
    }
    
    public final boolean getContinueExploringFlowEnabled() {
        return false;
    }
    
    public final void setContinueExploringFlowEnabled(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> getOtpPageSwitchObserver() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Boolean>> getEventTrueCallerLoginFailed() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Boolean>> getLoginPageSwitchObserver() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.String>> getOtpObserver() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.String>> getTcObserver() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getProcessSkipFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMobileNumberErrorMessage() {
        return null;
    }
    
    public final void setMobileNumberErrorMessage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean isOTPVerified() {
        return false;
    }
    
    public final void setOTPVerified(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getBottomSheetPageSwitch() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMobileNumber() {
        return null;
    }
    
    public final void setMobileNumber(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFillType() {
        return null;
    }
    
    public final void setFillType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean isTruecaller() {
        return false;
    }
    
    public final void setTruecaller(boolean p0) {
    }
    
    public final boolean isNewCustomer() {
        return false;
    }
    
    public final void setNewCustomer(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEnteredOTP() {
        return null;
    }
    
    public final void setEnteredOTP(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrentPageNameForSignup() {
        return null;
    }
    
    public final void setCurrentPageNameForSignup(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoadingViewForLoginBottomSheet() {
        return null;
    }
    
    public final void setLoadingViewForLoginBottomSheet(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    public final boolean checkTrueCallerAvailability() {
        return false;
    }
    
    public final void setCurrentPage(@org.jetbrains.annotations.NotNull()
    java.lang.String currentPage) {
    }
    
    /**
     * 1) Validate input mobile number
     * If input is invalid, notify to view,
     * If input is valid, make API call to generate OTP
     */
    public final void performSendOTP(@org.jetbrains.annotations.NotNull()
    java.lang.String enteredMobileNo, boolean isResendClicked) {
    }
    
    public final void loginOTPEditClicked(@org.jetbrains.annotations.NotNull()
    java.lang.String mobile) {
    }
    
    private final void showOtpInputPage(boolean isResendClicked) {
    }
    
    private final void backToLoginMobileNumberPage() {
    }
    
    public final void sendOTPClickedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxOtpClicked mxOtpClicked, @org.jetbrains.annotations.NotNull()
    java.lang.String currentPageNameForSignup) {
    }
    
    /**
     * Performing the otp check along with validation
     */
    public final void performOTPVerification(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    private final void showLoader() {
    }
    
    private final void hideLoader() {
    }
    
    private final void showNextScreen(boolean isOtpFlow) {
    }
    
    public final void getTrueCallerUserDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String textAuthorizationCode, @org.jetbrains.annotations.NotNull()
    java.lang.String clientId, @org.jetbrains.annotations.NotNull()
    java.lang.String authorizationCode, @org.jetbrains.annotations.NotNull()
    java.lang.String codeVerifier, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    /**
     * This method will initiate all SDK events for mobile number
     */
    public final void loginPageViewedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxLoginPageViewed mxLoginPageViewed, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.mvvm.data.appsflyer.AFLoginPageViewed afLoginPageViewed) {
    }
    
    /**
     * This will start count down timer in which start value is the time in seconds
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Long> startCountDownTimer(long start, long delayInSeconds) {
        return null;
    }
    
    public final void updateFirebaseId$app_prodDebug(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
}