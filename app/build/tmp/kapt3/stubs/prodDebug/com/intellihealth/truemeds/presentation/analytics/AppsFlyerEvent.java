package com.intellihealth.truemeds.presentation.analytics;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0002\r\u000eB\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u000bJ\u0006\u0010\f\u001a\u00020\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/intellihealth/truemeds/presentation/analytics/AppsFlyerEvent;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "LOG_TAG", "", "logAppsFlyerEvent", "", "eventName", "map", "", "setCustomerIdAndLogSession", "AppsFlyerEvent", "CustomAppsFlyerRequestListener", "app_prodDebug"})
public final class AppsFlyerEvent {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String LOG_TAG = "AppsFlyerEvent";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String APPS_FLYER_EVENT_APP_OPEN = "Open";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String APPS_FLYER_EVENT_HOMEPAGE_VIEWED = "homepage_viewed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String APPS_FLYER_EVENT_HOMEPAGE_SUBS_LEARN_MORE = "subs_learn_more_clicked";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String APPS_FLYER_EVENT_REFER_A_FRIEND_CLICKED = "refer_a_friend_clicked";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String APPS_FLYER_EVENT_LOGIN_SUCCESSFUL = "login_successful";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String APPS_FLYER_EVENT_SIGNUP_SUCCESSFUL = "signup_successful";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String APPS_FLYER_EVENT_USER_DETAILS_ADD_ADDRESS = "address_added";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String APPS_FLYER_EVENT_USER_DETAILS_ADD_PATIENT = "patient_added";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String APPS_FLYER_EVENT_SEARCH_VIEWED = "search_viewed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String APPS_FLYER_EVENT_ITEM_SEARCHED = "item_searched";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String APPS_FLYER_EVENT_ITEM_ADDED = "item_added";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String APPS_FLYER_EVENT_SUBS_ITEM_ADDED = "subs_item_added";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String APPS_FLYER_EVENT_SRP_VIEWED = "srp_viewed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String APPS_FLYER_EVENT_CANCEL_ORDER = "app_order_cancelled";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String APPS_FLYER_EVENT_LOGIN_PAGE_VIEWED = "login_page_viewed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String APPS_FLYER_EVENT_PDP_VIEWED = "pdp_viewed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String APPS_FLYER_EVENT_CART_VIEWED = "cart_viewed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String APPS_FLYER_EVENT_ORDER_SUMMARY_VIEWED = "order_summary_viewed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String APPS_FLYER_EVENT_APP_ORDER_PLACED = "app_order_placed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String APPS_FLYER_EVENT_CHRONIC_ITEM_ADDED = "chronic_item_added";
    
    @javax.inject.Inject()
    public AppsFlyerEvent(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    public final void setCustomerIdAndLogSession() {
    }
    
    public final void logAppsFlyerEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String eventName, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/intellihealth/truemeds/presentation/analytics/AppsFlyerEvent$CustomAppsFlyerRequestListener;", "Lcom/appsflyer/attribution/AppsFlyerRequestListener;", "eventName", "", "map", "", "", "(Lcom/intellihealth/truemeds/presentation/analytics/AppsFlyerEvent;Ljava/lang/String;Ljava/util/Map;)V", "onError", "", "i", "", "s", "onSuccess", "app_prodDebug"})
    final class CustomAppsFlyerRequestListener implements com.appsflyer.attribution.AppsFlyerRequestListener {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String eventName = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.Map<java.lang.String, java.lang.Object> map = null;
        
        public CustomAppsFlyerRequestListener(@org.jetbrains.annotations.NotNull()
        java.lang.String eventName, @org.jetbrains.annotations.NotNull()
        java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
            super();
        }
        
        @java.lang.Override()
        public void onSuccess() {
        }
        
        @java.lang.Override()
        public void onError(int i, @org.jetbrains.annotations.NotNull()
        java.lang.String s) {
        }
    }
}