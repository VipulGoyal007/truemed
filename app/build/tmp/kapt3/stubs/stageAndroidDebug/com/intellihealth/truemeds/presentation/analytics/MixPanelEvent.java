package com.intellihealth.truemeds.presentation.analytics;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ \u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0010J\u0006\u0010\u0013\u001a\u00020\bJ\u0016\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/intellihealth/truemeds/presentation/analytics/MixPanelEvent;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mixpanelApi", "Lcom/mixpanel/android/mpmetrics/MixpanelAPI;", "customerIdentity", "", "customerId", "", "logMixPanelEvent", "lowercaseEventProperty", "", "eventName", "ipJsonObject", "Lorg/json/JSONObject;", "sendMixPanelEvent", "jsonObject", "sendSuperEventToMixpanel", "setUserProperty", "propertyName", "propertyValue", "", "Companion", "app_stageAndroidDebug"})
public final class MixPanelEvent {
    @org.jetbrains.annotations.Nullable()
    private static com.intellihealth.truemeds.presentation.analytics.MixPanelEvent mInstance;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_EXPERIMENT_STARTED = "$experiment_started";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_LOGIN_SKIPPED = "login_skipped";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_LOG_IN_SUCCESS = "login_successful";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_SIGNUP_SUCCESSFUL = "signup_successful";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_LOGIN_PAGE_VIEWED = "login_page_viewed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_OTP_TYPED = "otp_typed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_OTP_CLICKED = "get_otp_clicked";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_APP_OPENED = "app_opened";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_HOMEPAGE_VIEWED = "homepage_viewed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_HOMEPAGE_BANNER_IMPRESSION = "homepage_banner_impression";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_HOMEPAGE_BANNER_CLICKED = "homepage_banner_click";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_HOMEPAGE_SKINNY_BANNER_IMPRESSION = "homepage_skinny_banner_impression";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_BANNER_CLICKED = "banner_clicked";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_ADDRESS_ADDED = "address_added";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_ADD_ADDRESS_CLICKED = "add_address_clicked";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_ADDRESS_CHANGED = "address_changed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_ADDRESS_EDITED = "address_edited";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_PATIENT_ADDED = "patient_added";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_ADD_PATIENT_CLICKED = "add_patient_clicked";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_PATIENT_DETAILS_EDITED = "patient_details_edited";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_DELIVERY_DETAILS_VIEWED = "delivery_details_viewed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_PRESCRIPTION_CLICKED = "upload_prescription_clicked";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_PRESCRIPTION_UPLOAD_PAGE_VIEWED = "prescription_upload_page_viewed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_CART_VIEWED = "cart_viewed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_OFFER_SHEET_VIEWED = "offer_sheet_viewed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_SUBS_REPLACE_CLICKED = "substitute_replace_clicked";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_UNDO_CLICKED = "undo_clicked";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_SWITCH_BACK_CLICKED = "switch_back_clicked";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_ONE_CLICK_SUBSTITUTION_POPUP_VIEWED = "one_click_substitution_popup_viewed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_APPLY_COUPON_CLICKED = "apply_coupon_clicked";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_COUPON_LIST_OPENED = "coupon_list_opened";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_COUPON_APPLIED = "coupon_applied";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_COUPON_REMOVED = "coupon_removed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String OTC_PRODUCT_LIST_PAGE_VIEWED = "otc_product_list_page_viewed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_SEARCH_VIEWED = "search_viewed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_ITEM_SEARCHED = "item_searched";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_SUGGESTION_ITEM_IMPRESSION = "search_suggestion_impression";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_SRP_VIEWED = "srp_viewed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_SRP_ADD_SUBS_BOTTOM_SHEET_VIEWED = "srp_add_subs_bottom_sheet_viewed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_SRP_VIEW_SUBS_BOTTOM_SHEET_VIEWED = "srp_view_subs_bottom_sheet_viewed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_ORDER_CANCELLED_CLICKED = "app_order_cancelled";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_ORDER_DETAILS_CANCEL_ORDER_CLICKED = "order_detail_cancelled_clicked";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_FIRST_CANCEL_PAGE_VIEWED = "first_cancel_page_viewed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_SECOND_CANCEL_PAGE_VIEWED = "second_cancel_page_viewed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_THIRD_CANCEL_PAGE_VIEWED = "third_cancel_sheet_viewed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_REMINDER_POPUP_VIEWED = "reminder_bottomsheet_viewed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_REMINDER_SUCCESSFULLY_SET = "reminder_successfully_Set";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_REMINDER_EDIT_CLICKED = "reminder_edit_clicked";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_REMINDER_UPDATED = "reminder_updated";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_REMINDER_DELETED = "reminder_deleted";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_ORDER_STATUS_VIEWED = "order_status_viewed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_ORDER_STATUS_ADD_ALTERNATE_CONTACT_CLICKED = "add_alternate_contact_clicked";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_ORDER_STATUS_ALTERNATE_CONTACT_SAVED = "alternate_contact_saved";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_VIDEO_FLOATER_CLICKED = "video_floater_clicked";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_VIDEO_FLOATER_IMPRESSION = "video_floater_impression";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_VIDEO_PLAYED = "video_played";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_VIDEO_CONTINUED = "video_continued";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_VIDEO_COMPLETED = "video_completed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_VIDEO_PLAYER_CLOSED = "video_player_closed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_VIDEO_PAUSED = "video_paused";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_SUBS_VIDEO_PLAYED = "subs_video_played";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_ITEM_ADDED = "item_added";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_CALL_PHARMACIST_CLICKED = "call_pharmacist_clicked";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_PRESCRIPTION_REMOVED = "prescription_removed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_PRESCRIPTION_UPLOADED = "prescription_uploaded";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_ORDER_SUMMARY_VIEWED = "order_summary_viewed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_PATIENT_CHANGED = "Patient_changed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_DOCTOR_CONFIRMATION_CARD_VIEWED = "doctor_confirmation_card_viewed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_LOCATION_BOTTOMSHEET_OPENED = "location_bottomsheet_opened";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_LOCATION_SELECTED = "location_selected";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_PDP_VIEWED = "pdp_viewed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_MEDICINE_DETAILS_VIEWED = "pdp_medicine_details_viewed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_PDP_IMAGE_VIEWED = "pdp_image_viewed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_CHANGE_TO_COD_CLICKED = "change_to_cod_clicked";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_PINCODE_UNSERVICEABLE = "pincode_not_servicable";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_REFERRAL_SCREEN_VIEWED = "referral_screen_viewed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_LOGGED_OUT = "logged_out";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_PSP_VIEWED = "psp_viewed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_PAYMENT_POPUP_VIEWED = "payment_popup_viewed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_PAYMENT_UNSUCCESSFUL = "payment_unsuccessful";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_PAYMENT_FAILED = "payment_failed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_PAYMENT_SUCCESSFUL = "payment_successful";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_APP_ORDER_PLACED = "app_order_placed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_ARTICLE_SECTION_VIEWED = "articles_section_viewed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_ARTICLE_VIEWED = "article_viewed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_ARTICLE_CATEGORY_SECTION_VIEWED = "articles_category_section_viewed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_ARTICLE_SHARED = "article_shared";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_PAYMENT_PAGE_VISITED = "payment_page_visited";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_PAYMENT_PENDING_VIEWED = "payment_pending_viewed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_ITEM_IMPRESSION = "item_impression";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_VIEW_BILL_CLICKED = "view_bill_clicked";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_NOTIFICATION_RECEIVED = "notification_received";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_NOTIFICATION_CLICKED = "notification_clicked";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_URGENCY_TIMER_STARTED = "urgency_timer_started";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_URGENCY_STICKY_STRIP_VIEWED = "sticky_strip_viewed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_URGENCY_STICKY_STRIP_CLICKED = "sticky_strip_clicked";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_PRODUCT_LIST_PAGE_VIEWED = "product_list_page_viewed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_REORDER_SHEET_VIEWED = "reorder_sheet_viewed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_ITEM_APP_ORDER_PLACED = "item_app_order_placed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_USE_LOCATION_CLICKED = "use_location_clicked";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_CONTACT_BOTTOM_SHEET_VIEWED = "tm_contact_bottomsheet_viewed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_CONTACT_SAVED = "tm_contact_saved";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_CONTACT_SAVE_CLICKED = "tm_contact_save_clicked";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_FILTER_CLICKED = "filter_clicked";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_CATEGORY_IMPRESSION = "category_impression";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_SUPER_CATEGORY_SECTION_IMPRESSION = "super_category_section_impression";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_ERROR_OCCURED = "internal_error_occured";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_VIEW_DETAILS_CLICKED = "view_details_clicked";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_PROFILE_DETAILS_ADDED = "profile_details_added";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIX_EVENT_PROFILE_DETAILS_EDITED = "profile_details_edited";
    @org.jetbrains.annotations.NotNull()
    private com.mixpanel.android.mpmetrics.MixpanelAPI mixpanelApi;
    @org.jetbrains.annotations.NotNull()
    public static final com.intellihealth.truemeds.presentation.analytics.MixPanelEvent.Companion Companion = null;
    
    @javax.inject.Inject()
    public MixPanelEvent(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    public final void setUserProperty(@org.jetbrains.annotations.NotNull()
    java.lang.String propertyName, double propertyValue) {
    }
    
    public final void customerIdentity(@org.jetbrains.annotations.NotNull()
    java.lang.String customerId) {
    }
    
    public final void logMixPanelEvent(boolean lowercaseEventProperty, @org.jetbrains.annotations.NotNull()
    java.lang.String eventName, @org.jetbrains.annotations.NotNull()
    org.json.JSONObject ipJsonObject) {
    }
    
    public final void sendSuperEventToMixpanel() {
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {org.json.JSONException.class})
    public final void sendMixPanelEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String eventName, @org.jetbrains.annotations.NotNull()
    org.json.JSONObject jsonObject) throws org.json.JSONException {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\bn\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010t\u001a\u0004\u0018\u00010s2\b\u0010u\u001a\u0004\u0018\u00010vR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010W\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010Y\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010Z\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010[\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\\\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010]\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010^\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010_\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010`\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010a\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010c\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010d\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010g\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010h\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010i\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010j\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010k\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010l\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010m\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010o\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010p\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010q\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0010\u0010r\u001a\u0004\u0018\u00010sX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006w"}, d2 = {"Lcom/intellihealth/truemeds/presentation/analytics/MixPanelEvent$Companion;", "", "()V", "MIX_EVENT_ADDRESS_ADDED", "", "MIX_EVENT_ADDRESS_CHANGED", "MIX_EVENT_ADDRESS_EDITED", "MIX_EVENT_ADD_ADDRESS_CLICKED", "MIX_EVENT_ADD_PATIENT_CLICKED", "MIX_EVENT_APPLY_COUPON_CLICKED", "MIX_EVENT_APP_OPENED", "MIX_EVENT_APP_ORDER_PLACED", "MIX_EVENT_ARTICLE_CATEGORY_SECTION_VIEWED", "MIX_EVENT_ARTICLE_SECTION_VIEWED", "MIX_EVENT_ARTICLE_SHARED", "MIX_EVENT_ARTICLE_VIEWED", "MIX_EVENT_BANNER_CLICKED", "MIX_EVENT_CALL_PHARMACIST_CLICKED", "MIX_EVENT_CART_VIEWED", "MIX_EVENT_CATEGORY_IMPRESSION", "MIX_EVENT_CHANGE_TO_COD_CLICKED", "MIX_EVENT_CONTACT_BOTTOM_SHEET_VIEWED", "MIX_EVENT_CONTACT_SAVED", "MIX_EVENT_CONTACT_SAVE_CLICKED", "MIX_EVENT_COUPON_APPLIED", "MIX_EVENT_COUPON_LIST_OPENED", "MIX_EVENT_COUPON_REMOVED", "MIX_EVENT_DELIVERY_DETAILS_VIEWED", "MIX_EVENT_DOCTOR_CONFIRMATION_CARD_VIEWED", "MIX_EVENT_ERROR_OCCURED", "MIX_EVENT_EXPERIMENT_STARTED", "MIX_EVENT_FILTER_CLICKED", "MIX_EVENT_FIRST_CANCEL_PAGE_VIEWED", "MIX_EVENT_HOMEPAGE_BANNER_CLICKED", "MIX_EVENT_HOMEPAGE_BANNER_IMPRESSION", "MIX_EVENT_HOMEPAGE_SKINNY_BANNER_IMPRESSION", "MIX_EVENT_HOMEPAGE_VIEWED", "MIX_EVENT_ITEM_ADDED", "MIX_EVENT_ITEM_APP_ORDER_PLACED", "MIX_EVENT_ITEM_IMPRESSION", "MIX_EVENT_ITEM_SEARCHED", "MIX_EVENT_LOCATION_BOTTOMSHEET_OPENED", "MIX_EVENT_LOCATION_SELECTED", "MIX_EVENT_LOGGED_OUT", "MIX_EVENT_LOGIN_PAGE_VIEWED", "MIX_EVENT_LOGIN_SKIPPED", "MIX_EVENT_LOG_IN_SUCCESS", "MIX_EVENT_MEDICINE_DETAILS_VIEWED", "MIX_EVENT_NOTIFICATION_CLICKED", "MIX_EVENT_NOTIFICATION_RECEIVED", "MIX_EVENT_OFFER_SHEET_VIEWED", "MIX_EVENT_ONE_CLICK_SUBSTITUTION_POPUP_VIEWED", "MIX_EVENT_ORDER_CANCELLED_CLICKED", "MIX_EVENT_ORDER_DETAILS_CANCEL_ORDER_CLICKED", "MIX_EVENT_ORDER_STATUS_ADD_ALTERNATE_CONTACT_CLICKED", "MIX_EVENT_ORDER_STATUS_ALTERNATE_CONTACT_SAVED", "MIX_EVENT_ORDER_STATUS_VIEWED", "MIX_EVENT_ORDER_SUMMARY_VIEWED", "MIX_EVENT_OTP_CLICKED", "MIX_EVENT_OTP_TYPED", "MIX_EVENT_PATIENT_ADDED", "MIX_EVENT_PATIENT_CHANGED", "MIX_EVENT_PATIENT_DETAILS_EDITED", "MIX_EVENT_PAYMENT_FAILED", "MIX_EVENT_PAYMENT_PAGE_VISITED", "MIX_EVENT_PAYMENT_PENDING_VIEWED", "MIX_EVENT_PAYMENT_POPUP_VIEWED", "MIX_EVENT_PAYMENT_SUCCESSFUL", "MIX_EVENT_PAYMENT_UNSUCCESSFUL", "MIX_EVENT_PDP_IMAGE_VIEWED", "MIX_EVENT_PDP_VIEWED", "MIX_EVENT_PINCODE_UNSERVICEABLE", "MIX_EVENT_PRESCRIPTION_CLICKED", "MIX_EVENT_PRESCRIPTION_REMOVED", "MIX_EVENT_PRESCRIPTION_UPLOADED", "MIX_EVENT_PRESCRIPTION_UPLOAD_PAGE_VIEWED", "MIX_EVENT_PRODUCT_LIST_PAGE_VIEWED", "MIX_EVENT_PROFILE_DETAILS_ADDED", "MIX_EVENT_PROFILE_DETAILS_EDITED", "MIX_EVENT_PSP_VIEWED", "MIX_EVENT_REFERRAL_SCREEN_VIEWED", "MIX_EVENT_REMINDER_DELETED", "MIX_EVENT_REMINDER_EDIT_CLICKED", "MIX_EVENT_REMINDER_POPUP_VIEWED", "MIX_EVENT_REMINDER_SUCCESSFULLY_SET", "MIX_EVENT_REMINDER_UPDATED", "MIX_EVENT_REORDER_SHEET_VIEWED", "MIX_EVENT_SEARCH_VIEWED", "MIX_EVENT_SECOND_CANCEL_PAGE_VIEWED", "MIX_EVENT_SIGNUP_SUCCESSFUL", "MIX_EVENT_SRP_ADD_SUBS_BOTTOM_SHEET_VIEWED", "MIX_EVENT_SRP_VIEWED", "MIX_EVENT_SRP_VIEW_SUBS_BOTTOM_SHEET_VIEWED", "MIX_EVENT_SUBS_REPLACE_CLICKED", "MIX_EVENT_SUBS_VIDEO_PLAYED", "MIX_EVENT_SUGGESTION_ITEM_IMPRESSION", "MIX_EVENT_SUPER_CATEGORY_SECTION_IMPRESSION", "MIX_EVENT_SWITCH_BACK_CLICKED", "MIX_EVENT_THIRD_CANCEL_PAGE_VIEWED", "MIX_EVENT_UNDO_CLICKED", "MIX_EVENT_URGENCY_STICKY_STRIP_CLICKED", "MIX_EVENT_URGENCY_STICKY_STRIP_VIEWED", "MIX_EVENT_URGENCY_TIMER_STARTED", "MIX_EVENT_USE_LOCATION_CLICKED", "MIX_EVENT_VIDEO_COMPLETED", "MIX_EVENT_VIDEO_CONTINUED", "MIX_EVENT_VIDEO_FLOATER_CLICKED", "MIX_EVENT_VIDEO_FLOATER_IMPRESSION", "MIX_EVENT_VIDEO_PAUSED", "MIX_EVENT_VIDEO_PLAYED", "MIX_EVENT_VIDEO_PLAYER_CLOSED", "MIX_EVENT_VIEW_BILL_CLICKED", "MIX_EVENT_VIEW_DETAILS_CLICKED", "OTC_PRODUCT_LIST_PAGE_VIEWED", "mInstance", "Lcom/intellihealth/truemeds/presentation/analytics/MixPanelEvent;", "getInstance", "ctx", "Landroid/content/Context;", "app_stageAndroidDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.jvm.Synchronized()
        @org.jetbrains.annotations.Nullable()
        public final synchronized com.intellihealth.truemeds.presentation.analytics.MixPanelEvent getInstance(@org.jetbrains.annotations.Nullable()
        android.content.Context ctx) {
            return null;
        }
    }
}