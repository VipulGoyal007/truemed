package com.intellihealth.truemeds.domain.usecase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0018\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0082@\u00a2\u0006\u0002\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\u000e\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001bJ\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001bH\u0002J \u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001bH\u0082@\u00a2\u0006\u0002\u0010%J\u001e\u0010&\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020#2\u0006\u0010\'\u001a\u00020\u001bH\u0087@\u00a2\u0006\u0002\u0010%J6\u0010(\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020#2\u0006\u0010)\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u001bH\u0082@\u00a2\u0006\u0002\u0010-J^\u0010.\u001a\u00020/2\u0006\u0010\"\u001a\u00020#2\u0006\u0010)\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u001b2\u0006\u0010\'\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\u001b2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u001b2\u0006\u00104\u001a\u00020\u001bH\u0087@\u00a2\u0006\u0002\u00105J\u0006\u00106\u001a\u00020\u000eJ\u000e\u00107\u001a\u00020\u00192\u0006\u00108\u001a\u00020\u001bJ.\u00109\u001a\u00020/2\u0006\u00101\u001a\u0002022\u0006\u0010:\u001a\u00020\u000e2\u0006\u00103\u001a\u00020\u001b2\u0006\u00104\u001a\u00020\u001bH\u0082@\u00a2\u0006\u0002\u0010;J(\u0010<\u001a\u0004\u0018\u00010=2\u0006\u0010\"\u001a\u00020#2\u0006\u0010\'\u001a\u00020\u001b2\u0006\u0010>\u001a\u00020\u001bH\u0086@\u00a2\u0006\u0002\u0010?J\u0016\u0010@\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020#H\u0082@\u00a2\u0006\u0002\u0010AJj\u0010B\u001a\u00020C2\u0006\u0010\"\u001a\u00020#2\b\u0010D\u001a\u0004\u0018\u00010\u001b2\b\u0010E\u001a\u0004\u0018\u00010\u001b2\b\u0010F\u001a\u0004\u0018\u00010\u001b2\b\u0010G\u001a\u0004\u0018\u00010\u001f2\b\u0010H\u001a\u0004\u0018\u00010\u001b2\b\u0010I\u001a\u0004\u0018\u00010\u001b2\u0006\u00101\u001a\u0002022\u0006\u00104\u001a\u00020\u001b2\u0006\u00103\u001a\u00020\u001bH\u0086@\u00a2\u0006\u0002\u0010JJ8\u0010K\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\"\u001a\u00020#2\u0006\u0010L\u001a\u00020\u001b2\u0006\u0010M\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\u001b2\u0006\u0010N\u001a\u00020\u001bH\u0082@\u00a2\u0006\u0002\u0010-R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006O"}, d2 = {"Lcom/intellihealth/truemeds/domain/usecase/LoginUseCase;", "", "loginRepository", "Lcom/intellihealth/truemeds/domain/repository/LoginRepository;", "sdkEventUseCase", "Lcom/intellihealth/truemeds/domain/usecase/analytics/SdkEventUseCase;", "localDbUseCase", "Lcom/intellihealth/truemeds/domain/usecase/LocalDbUseCase;", "userDataUseCase", "Lcom/intellihealth/truemeds/domain/usecase/UserDataUseCase;", "walletUseCase", "Lcom/intellihealth/truemeds/domain/usecase/TmWalletUseCase;", "(Lcom/intellihealth/truemeds/domain/repository/LoginRepository;Lcom/intellihealth/truemeds/domain/usecase/analytics/SdkEventUseCase;Lcom/intellihealth/truemeds/domain/usecase/LocalDbUseCase;Lcom/intellihealth/truemeds/domain/usecase/UserDataUseCase;Lcom/intellihealth/truemeds/domain/usecase/TmWalletUseCase;)V", "userDetailsResponse", "Lcom/intellihealth/truemeds/data/model/login/LoginVerificationResponse;", "getUserDetailsResponse", "()Lcom/intellihealth/truemeds/data/model/login/LoginVerificationResponse;", "setUserDetailsResponse", "(Lcom/intellihealth/truemeds/data/model/login/LoginVerificationResponse;)V", "addCustomerDetailData", "", "it", "Lcom/intellihealth/truemeds/data/model/login/LoginVerificationResponse$ResponseData;", "(Lcom/intellihealth/truemeds/data/model/login/LoginVerificationResponse$ResponseData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkEmailId", "Lcom/intellihealth/truemeds/data/model/login/InputValidationResult;", "emailIdAddress", "", "checkPhoneNumber", "phoneNumberStr", "checkPhoneNumberStartWithCorrectNo", "", "fetchDefaultToken", "Lcom/intellihealth/truemeds/data/model/login/DefaultTokenResponse;", "mxInternalErrorOccurred", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "base64Encoding", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSessionToken", "ipFirebaseId", "getTrueCallerToken", "textAuthorizationCode", "clientId", "authorizationCode", "codeVerifier", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTrueCallerUserDetails", "Lcom/intellihealth/truemeds/domain/enums/LoginStatus;", "aaId", "context", "Landroid/content/Context;", "clickedOnPage", "fillType", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserDetailResponse", "otpInputValidation", "otpStr", "processUserToLogin", "userDetails", "(Landroid/content/Context;Lcom/intellihealth/truemeds/data/model/login/LoginVerificationResponse;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendMobileOtp", "Lcom/intellihealth/truemeds/data/model/login/SendMobileOtpResponse;", "mobileNum", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePlatformVariantInfo", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifyMobileOtp", "Lcom/intellihealth/truemeds/presentation/model/ProcessUserLoginResult;", "mobileNo", "otp", "deviceKey", "isIos", "aaid", "source", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifyTrueCallerToken", "tcToken", "firebaseID", "sessionToken", "app_prodDebug"})
public final class LoginUseCase {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.repository.LoginRepository loginRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.analytics.SdkEventUseCase sdkEventUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.LocalDbUseCase localDbUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.UserDataUseCase userDataUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.TmWalletUseCase walletUseCase = null;
    
    /**
     * 1) Get TrueCaller token from trueCaller's api by passing authorizationCode
     * which trueCaller returns on successful login from trueCaller login bottom sheet
     * Get session token from our server. This require passing firebase id to service.
     * 2) If app is unable to get firebase id, then get firebase default token from our service,
     * else go to step 3 to generate session token.
     * 3) Get Session token
     * 4) Get User details from our service by passing trueCaller's token and session token which we generated in step 3
     * This will return null if user details not received from service
     */
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.data.model.login.LoginVerificationResponse userDetailsResponse;
    
    @javax.inject.Inject()
    public LoginUseCase(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.repository.LoginRepository loginRepository, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.analytics.SdkEventUseCase sdkEventUseCase, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.LocalDbUseCase localDbUseCase, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.UserDataUseCase userDataUseCase, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.TmWalletUseCase walletUseCase) {
        super();
    }
    
    /**
     * 1) Get TrueCaller token from trueCaller's api by passing authorizationCode
     * which trueCaller returns on successful login from trueCaller login bottom sheet
     * Get session token from our server. This require passing firebase id to service.
     * 2) If app is unable to get firebase id, then get firebase default token from our service,
     * else go to step 3 to generate session token.
     * 3) Get Session token
     * 4) Get User details from our service by passing trueCaller's token and session token which we generated in step 3
     * This will return null if user details not received from service
     */
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.login.LoginVerificationResponse getUserDetailsResponse() {
        return null;
    }
    
    /**
     * 1) Get TrueCaller token from trueCaller's api by passing authorizationCode
     * which trueCaller returns on successful login from trueCaller login bottom sheet
     * Get session token from our server. This require passing firebase id to service.
     * 2) If app is unable to get firebase id, then get firebase default token from our service,
     * else go to step 3 to generate session token.
     * 3) Get Session token
     * 4) Get User details from our service by passing trueCaller's token and session token which we generated in step 3
     * This will return null if user details not received from service
     */
    public final void setUserDetailsResponse(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.login.LoginVerificationResponse p0) {
    }
    
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTrueCallerUserDetails(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String textAuthorizationCode, @org.jetbrains.annotations.NotNull()
    java.lang.String clientId, @org.jetbrains.annotations.NotNull()
    java.lang.String authorizationCode, @org.jetbrains.annotations.NotNull()
    java.lang.String codeVerifier, @org.jetbrains.annotations.NotNull()
    java.lang.String ipFirebaseId, @org.jetbrains.annotations.NotNull()
    java.lang.String aaId, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String clickedOnPage, @org.jetbrains.annotations.NotNull()
    java.lang.String fillType, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.domain.enums.LoginStatus> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.login.LoginVerificationResponse getUserDetailResponse() {
        return null;
    }
    
    /**
     * Get TrueCaller token from trueCaller's api by passing authorizationCode
     * which trueCaller returns on successful login from trueCaller login bottom sheet
     */
    private final java.lang.Object getTrueCallerToken(com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, java.lang.String textAuthorizationCode, java.lang.String clientId, java.lang.String authorizationCode, java.lang.String codeVerifier, kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
        return null;
    }
    
    /**
     * If app is unable to get firebase id, then get firebase default token from our service
     */
    private final java.lang.Object fetchDefaultToken(com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, java.lang.String base64Encoding, kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.login.DefaultTokenResponse> $completion) {
        return null;
    }
    
    /**
     * Get Session token
     */
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSessionToken(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String ipFirebaseId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
        return null;
    }
    
    /**
     * send mobile otp
     * 1) If app is unable to get firebase id, then get firebase default token from our service,
     * 2) Get session token.
     * 3) Call API to generate OTP by passing Mobile Number and session token generated in step 2
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendMobileOtp(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String ipFirebaseId, @org.jetbrains.annotations.NotNull()
    java.lang.String mobileNum, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.login.SendMobileOtpResponse> $completion) {
        return null;
    }
    
    /**
     * Get User details from our service by passing trueCaller's token and session token
     */
    private final java.lang.Object verifyTrueCallerToken(com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, java.lang.String tcToken, java.lang.String firebaseID, java.lang.String aaId, java.lang.String sessionToken, kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.login.LoginVerificationResponse> $completion) {
        return null;
    }
    
    /**
     * Below method is to check phone number validation
     * case 1: It is not empty
     * case 2: It should start with 6,7,8,9
     * case 3: It should be for exact 10 digits
     */
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.login.InputValidationResult checkPhoneNumber(@org.jetbrains.annotations.NotNull()
    java.lang.String phoneNumberStr) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.login.InputValidationResult checkEmailId(@org.jetbrains.annotations.Nullable()
    java.lang.String emailIdAddress) {
        return null;
    }
    
    private final boolean checkPhoneNumberStartWithCorrectNo(java.lang.String phoneNumberStr) {
        return false;
    }
    
    /**
     * Below method is to check otp validation
     * case 1: It is not empty
     * case 2: It should be for exact 4 digits
     */
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.login.InputValidationResult otpInputValidation(@org.jetbrains.annotations.NotNull()
    java.lang.String otpStr) {
        return null;
    }
    
    /**
     * verify mobile otp
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object verifyMobileOtp(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.Nullable()
    java.lang.String mobileNo, @org.jetbrains.annotations.Nullable()
    java.lang.String otp, @org.jetbrains.annotations.Nullable()
    java.lang.String deviceKey, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isIos, @org.jetbrains.annotations.Nullable()
    java.lang.String aaid, @org.jetbrains.annotations.Nullable()
    java.lang.String source, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String fillType, @org.jetbrains.annotations.NotNull()
    java.lang.String clickedOnPage, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.presentation.model.ProcessUserLoginResult> $completion) {
        return null;
    }
    
    private final java.lang.Object updatePlatformVariantInfo(com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.lang.Object processUserToLogin(android.content.Context context, com.intellihealth.truemeds.data.model.login.LoginVerificationResponse userDetails, java.lang.String clickedOnPage, java.lang.String fillType, kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.domain.enums.LoginStatus> $completion) {
        return null;
    }
    
    /**
     * This method will initiate all SDK events for mobile number
     */
    private final java.lang.Object addCustomerDetailData(com.intellihealth.truemeds.data.model.login.LoginVerificationResponse.ResponseData it, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}