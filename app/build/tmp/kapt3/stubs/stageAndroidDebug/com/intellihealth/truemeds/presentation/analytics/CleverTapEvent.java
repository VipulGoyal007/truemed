package com.intellihealth.truemeds.presentation.analytics;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\"\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\rJ\u0016\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/intellihealth/truemeds/presentation/analytics/CleverTapEvent;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "cleverTapApi", "Lcom/clevertap/android/sdk/CleverTapAPI;", "onUserLoginCleverTap", "", "pushEvent", "eventName", "", "hashMap", "", "pushFcmRegistrationId", "fcmId", "register", "", "pushProfileCleverTap", "Companion", "app_stageAndroidDebug"})
public final class CleverTapEvent {
    private com.clevertap.android.sdk.CleverTapAPI cleverTapApi;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CLEVER_TAP_EVENT_LOGIN_SUCCESSFUL = "login_successful";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CLEVER_TAP_EVENT_LOGGED_OUT = "logged_out";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CLEVER_TAP_EVENT_SEARCH_VIEWED = "search_viewed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CLEVER_TAP_EVENT_ITEM_SEARCHED = "item_searched";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CLEVER_TAP_EVENT_SRP_VIEWED = "srp_viewed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CLEVER_TAP_EVENT_ITEM_ADDED = "item_added";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CLEVER_TAP_EVENT_PDP_VIEWED = "pdp_viewed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CLEVER_TAP_EVENT_CART_VIEWED = "cart_viewed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CLEVER_TAP_EVENT_APP_ORDER_PLACED = "app_order_placed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CLEVER_TAP_EVENT_ORDER_STATUS_VIEWED = "order_status_viewed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CLEVER_TAP_EVENT_ORDER_CANCELLED = "app_order_cancelled";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CLEVER_TAP_EVENT_REORDER_CLICKED = "reorder_button_clicked";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CLEVER_TAP_EVENT_PATIENT_ADDED = "patient_added";
    @org.jetbrains.annotations.NotNull()
    public static final com.intellihealth.truemeds.presentation.analytics.CleverTapEvent.Companion Companion = null;
    
    @javax.inject.Inject()
    public CleverTapEvent(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    public final void pushFcmRegistrationId(@org.jetbrains.annotations.NotNull()
    java.lang.String fcmId, boolean register) {
    }
    
    public final void pushEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String eventName, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.lang.Object> hashMap) {
    }
    
    public final void onUserLoginCleverTap() {
    }
    
    /**
     * cleverTapApi.pushProfile should not get called after cleverTapApi.onUserLogin
     */
    public final void pushProfileCleverTap() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/intellihealth/truemeds/presentation/analytics/CleverTapEvent$Companion;", "", "()V", "CLEVER_TAP_EVENT_APP_ORDER_PLACED", "", "CLEVER_TAP_EVENT_CART_VIEWED", "CLEVER_TAP_EVENT_ITEM_ADDED", "CLEVER_TAP_EVENT_ITEM_SEARCHED", "CLEVER_TAP_EVENT_LOGGED_OUT", "CLEVER_TAP_EVENT_LOGIN_SUCCESSFUL", "CLEVER_TAP_EVENT_ORDER_CANCELLED", "CLEVER_TAP_EVENT_ORDER_STATUS_VIEWED", "CLEVER_TAP_EVENT_PATIENT_ADDED", "CLEVER_TAP_EVENT_PDP_VIEWED", "CLEVER_TAP_EVENT_REORDER_CLICKED", "CLEVER_TAP_EVENT_SEARCH_VIEWED", "CLEVER_TAP_EVENT_SRP_VIEWED", "app_stageAndroidDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}