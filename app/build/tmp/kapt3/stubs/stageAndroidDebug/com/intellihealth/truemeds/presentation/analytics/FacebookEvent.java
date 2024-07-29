package com.intellihealth.truemeds.presentation.analytics;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/intellihealth/truemeds/presentation/analytics/FacebookEvent;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "fbAppEventsLogger", "Lcom/facebook/appevents/AppEventsLogger;", "logFacebookEvent", "", "eventName", "", "bundle", "Landroid/os/Bundle;", "logPurchase", "payableAmount", "Ljava/math/BigDecimal;", "Companion", "app_stageAndroidDebug"})
public final class FacebookEvent {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FACEBOOK_ORDER_SUMMARY_CONFIRM_ORDER = "Ordersummary_Confirmorder";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FACEBOOK_REGISTRATION_MOBILE_NO_SKIP = "Registration_MobilenoSkip";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FACEBOOK_LOGIN_OTP_SKIP = "Login_OTPSkip";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FACEBOOK_REGISTRATION_OTP_SKIP = "Registration_OTPskip";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FACEBOOK_REGISTRATION_OTP_REQUESTED = "Registration_OTPrequested";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FACEBOOK_LOGIN_OTP_REQUESTED = "Login_Otprequested";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FACEBOOK_REGISTRATION_SUCCESSFUL = "Registration_successful";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FACEBOOK_LOGIN_SUCCESSFUL = "Login_Successful";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FACEBOOK_PAYMENT_FAILED = "Payment_Failed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FACEBOOK_PAYMENT_SUCCESSFUL = "Payment_Successful";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FACEBOOK_ORDER_PRESCRIPTION_CAMERA = "Order_prescriptionCamera";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FACEBOOK_PD_PAGE_INTRODUCTION = "PDpage_introduction";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FACEBOOK_PD_PAGE_MEDICINE_ACTIVITY = "PDpage_MedicineActivity";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FACEBOOK_PD_PAGE_USES = "PDpage_uses";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FACEBOOK_PD_PAGE_DIRECTIONS_FOR_USE = "PDpage_directionsforuse";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FACEBOOK_PD_PAGE_SIDE_EFFECTS = "PDpage_sideeffects";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FACEBOOK_PD_PAGE_ADDITIONAL_INFORMATION = "PDpage_additionalinformation";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FACEBOOK_PD_PAGE_SEARCH = "PDPage_search";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FACEBOOK_PD_PAGE_CART = "PDPage_Cart";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FACEBOOK_PD_PAGE_VIEW_CART = "PDpage_viewcart";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FACEBOOK_PD_PAGE_DELETE = "PDPage_Delete";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FACEBOOK_HOMEPAGE_BANNER = "Homepage_Banner";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FACEBOOK_HOMEPAGE_UPLOAD_PRESCRIPTION = "Homepage_Uploadprescription";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FACEBOOK_HOMEPAGE_CALL_TO_ORDER = "Homepage_Calltoorder";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FACEBOOK_HOMEPAGE_HEALTH_ARTICLES = "Homepage_Heatlharticles";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FACEBOOK_HOMEPAGE_SEARCH = "Homepage_Search";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FACEBOOK_TM_WALLET_VIEWED = "Tmwallet_viewed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FACEBOOK_TM_WALLET_REWARD_TRANSACTIONS = "TMwallet_rewardtransactions";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FACEBOOK_TM_WALLET_CREDIT_TRANSACTIONS = "TMwallet_credittransactions";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FACEBOOK_PD_PAGE_ADD_TO_CART = "PDpage_addtocart";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FACEBOOK_UPLOAD_PRESCRIPTION_CAMERA = "Uploadprescription_Camera";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FACEBOOK_ORDER_PRESCRIPTION_UPLOADED = "Order_prescriptionuploaded";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FACEBOOK_UPLOAD_PRESCRIPTION_PRESCRIPTION_SELECTED = "Uploadprescription_prescriptionselected";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FACEBOOK_REGISTRATION_MOBILE_NO = "Registration_Mobileno";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FACEBOOK_SEARCH_VIEW_CART = "Search_ViewCart";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FACEBOOK_CART_ADD = "Cart_add";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FACEBOOK_UPDATE_PROFILE_SAVE = "Updateprofile_save";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FACEBOOK_CART_RECOMMENDATIONS = "Cart_recommendationsadd";
    @org.jetbrains.annotations.NotNull()
    private com.facebook.appevents.AppEventsLogger fbAppEventsLogger;
    @org.jetbrains.annotations.NotNull()
    public static final com.intellihealth.truemeds.presentation.analytics.FacebookEvent.Companion Companion = null;
    
    @javax.inject.Inject()
    public FacebookEvent(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    public final void logFacebookEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String eventName) {
    }
    
    public final void logFacebookEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String eventName, @org.jetbrains.annotations.NotNull()
    android.os.Bundle bundle) {
    }
    
    public final void logPurchase(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal payableAmount, @org.jetbrains.annotations.NotNull()
    android.os.Bundle bundle) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b&\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/intellihealth/truemeds/presentation/analytics/FacebookEvent$Companion;", "", "()V", "FACEBOOK_CART_ADD", "", "FACEBOOK_CART_RECOMMENDATIONS", "FACEBOOK_HOMEPAGE_BANNER", "FACEBOOK_HOMEPAGE_CALL_TO_ORDER", "FACEBOOK_HOMEPAGE_HEALTH_ARTICLES", "FACEBOOK_HOMEPAGE_SEARCH", "FACEBOOK_HOMEPAGE_UPLOAD_PRESCRIPTION", "FACEBOOK_LOGIN_OTP_REQUESTED", "FACEBOOK_LOGIN_OTP_SKIP", "FACEBOOK_LOGIN_SUCCESSFUL", "FACEBOOK_ORDER_PRESCRIPTION_CAMERA", "FACEBOOK_ORDER_PRESCRIPTION_UPLOADED", "FACEBOOK_ORDER_SUMMARY_CONFIRM_ORDER", "FACEBOOK_PAYMENT_FAILED", "FACEBOOK_PAYMENT_SUCCESSFUL", "FACEBOOK_PD_PAGE_ADDITIONAL_INFORMATION", "FACEBOOK_PD_PAGE_ADD_TO_CART", "FACEBOOK_PD_PAGE_CART", "FACEBOOK_PD_PAGE_DELETE", "FACEBOOK_PD_PAGE_DIRECTIONS_FOR_USE", "FACEBOOK_PD_PAGE_INTRODUCTION", "FACEBOOK_PD_PAGE_MEDICINE_ACTIVITY", "FACEBOOK_PD_PAGE_SEARCH", "FACEBOOK_PD_PAGE_SIDE_EFFECTS", "FACEBOOK_PD_PAGE_USES", "FACEBOOK_PD_PAGE_VIEW_CART", "FACEBOOK_REGISTRATION_MOBILE_NO", "FACEBOOK_REGISTRATION_MOBILE_NO_SKIP", "FACEBOOK_REGISTRATION_OTP_REQUESTED", "FACEBOOK_REGISTRATION_OTP_SKIP", "FACEBOOK_REGISTRATION_SUCCESSFUL", "FACEBOOK_SEARCH_VIEW_CART", "FACEBOOK_TM_WALLET_CREDIT_TRANSACTIONS", "FACEBOOK_TM_WALLET_REWARD_TRANSACTIONS", "FACEBOOK_TM_WALLET_VIEWED", "FACEBOOK_UPDATE_PROFILE_SAVE", "FACEBOOK_UPLOAD_PRESCRIPTION_CAMERA", "FACEBOOK_UPLOAD_PRESCRIPTION_PRESCRIPTION_SELECTED", "app_stageAndroidDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}