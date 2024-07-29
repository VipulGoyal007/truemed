package com.intellihealth.truemeds.presentation.pref;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;

import com.google.gson.Gson;
import com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse;
import com.intellihealth.truemeds.data.model.orderflow.CouponCodeDataModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SharedPrefManager extends SharedPrefStorageInitialize {
    private static final String PREF_NAME = "com.intellihealth.truemeds";
    private static final String PREF_CURRENT_APP_LANGUAGE = "pref_app_lang";
    private static final String PREF_CURRENT_USER_NAME = "pref_current_user_name";
    private static final String PREF_CURRENT_USER_MOBILE = "pref_current_user_mobile";
    private static final String PREF_CURRENT_USER_ID = "pref_current_user_id";
    public static final String PREF_CURRENT_USER_ACCESSTOKEN = "pref_current_user_accessstoken";
    public static final String PREF_SET_HELPLINE_NUMBER = "pref_set_helpline_number";
    public static final String PREF_SESSION_TOKEN = "pref_session_token";
    private static final String PREF_CURRENT_USER_EMAIL = "pref_current_user_email";
    private static final String PREF_CURRENT_USER_IMAGEURL = "pref_current_user_imageurl";
    private static final String PREF_CURRENT_USER_AGE = "pref_current_user_age";
    private static final String PREF_CURRENT_USER_GENDER = "pref_current_user_gender";
    private static final String PREF_IS_NOTIFICATION = "pref_current_is_notification";
    private static final String PREF_BILL_AMOUNT = "pref_bill_amount";
    private static final String PREF_LAST_SELECTED_PAYMENT_MODE = "pref_last_selected_payment_mode";
    private static final String PREF_LAST_SELECTED_ADDRESS_ID = "pref_last_selected_address_id";
    private static final String PREF_LAST_DELIVERED_ADDRESS_ID = "pref_last_delivered_address_id";
    private static final String PREF_LAST_SELECTED_ADDRESS_TYPE = "pref_last_selected_address_type";
    private static final String PREF_LAST_SELECTED_PATIENT_NAME = "pref_last_selected_patient_name";
    private static final String PREF_LAST_SELECTED_PATIENT_TYPE = "pref_last_selected_patient_type";
    private static final String LAST_SELECTED_PATIENT_ID = "pref_last_selected_patient_id";
    private static final String NEWLY_CREATED_PATIENT_ID = "pref_newly_created_patient_id";
    private static final String NEWLY_CREATED_ADDRESS_ID = "pref_newly_created_address_id";
    private static final String LAST_COMPLETED_ORDER_PATIENT_ID = "pref_last_completed_patient_id";
    private static final String PREF_IS_CUSTOMER_TMCASH = "pref_customer_tmcash";
    private static final String PREF_IS_CUSTOMER_TMCREDIT = "pref_customer_tmcredit";
    private static final String PREF_IS_CUSTOMER_DELIVERY_CHARGE = "pref_customer_delivery_charge";
    private static final String PREF_IS_CUSTOMER_PACKAGING_CHARGE = "pref_customer_pakaging_charge";
    private static final String PREF_IS_INCOMPLETE_ORDER_ID = "pref_incomplete_orderid";
    private static final String PREF_MY_MEDICINE_LIST = "pref_my_medicine_list";
    private static final String PREF_PATIENT_EXPERIMENT_VARIANT = "pref_patient_experiment_variant";
    private static final String PREF_ORDER_ADDRESS = "pref_order_address";
    private static final String PREF_GOOGLE_ADID = "pref_google_adid";
    private static final String PREF_EDD = "pref_edd";
    private static final String PREF_SHARE_LINK = "pref_share_link";
    private static final String PREF_SHARE_REFER_CODE = "pref_share_ref_code";
    private static final String DEVICE_FCM = "device_fcm";
    private static final String USER_DEFAULT_CATEGORY = "A";
    private static final String REDIRECTION_PAGE_NAME = "redirection_page_name";
    private static final String PREF_REFERRAL_CUSTOMER_ID = "pref_referral_customer_id";
    private static final String LAST_SELECTED_PINCODE = "pref_last_selected_pincode";
    private static final String NEW_SELECTED_PINCODE = "pref_new_selected_pincode";
    private static final String CX_ACCEPTED_COUNT = "cx_accepted_count";
    private static final String IS_PROCEED_WITHOUT_PRESCRIPTION = "pref_proceed_without_prescription";
    private static final String IS_LOGIN_SKIPPED = "is_login_skipped";
    private static final String PRESCRIPTION_COUNT = "pref_prescription_count";
    private static final String CROSS_SELLING_PRODUCT_IDS = "pref_cross_selling_product_ids";
    private static final String OFFER_ID = "pref_offer_id";
    private static final String CASHBACK_VALUE = "cashback_value";
    private static final String CASHBACK_ACTIVE_AFTER = "cashback_active_after";
    private static final String CASHBACK_VALID_TILL = "cashback_valid_till";
    private static final String COUPON_VALIDITY = "coupon_validity";
    private static final String COUPON_DESCRIPTION = "coupon_description";
    private static final String COUPON_PAYMENT_METHOD = "coupon_payment_method";
    private static final String COUPON_PAYMENT_METHOD_ID = "coupon_payment_method_id";
    private static final String IS_PAYMENT_SPECIFIC_COUPON_APPLIED = "is_payment_specific_coupon_applied";
    public static final String SELECTED_PAYMENT_METHOD = "selected_payment_method";
    private static final String SELECTED_PAYMENT_METHOD_ID = "selected_payment_method_id";
    private static final String SELECTED_PAYMENT_METHOD_ICON_URL = "selected_payment_method_icon_url";
    private static final String COUPON_ID = "pref_coupon_id";
    private static final String COUPON_CODE = "pref_coupon_code";
    private static final String COUPON_SAVING_PERCENTAGE = "pref_coupon_saving_percentage";
    private static final String COUPON_MIN_CART_VALUE = "pref_coupon_min_cart_value";
    private static final String COUPON_MAX_CART_VALUE = "pref_coupon_max_cart_value";
    private static final String COUPON_DISCOUNT_TYPE_VALUE = "pref_coupon_discount_type_value";
    private static final String COUPON_PAYMENT_MODE = "pref_coupon_payment_mode";
    private static final String COUPON_PAYMENT_METHOD_ICON_URL = "pref_coupon_payment_mode_icon_url";
    private static final String COUPON_TYPE_ID = "pref_coupon_type_id";
    private static final String SELECTED_BILL_ID = "pref_selected_bill_id";
    private static final String SELECTED_BILL_VALUE = "pref_selected_bill_value";
    private static final String SELECTED_CONDITIONS_LIST = "pref_conditions_list";
    private static final String LAST_RATING_FOR_ORDERID = "pref_rating_for_orderid";
    private static final String LAST_RATING_COUNT_FOR_ORDERID = "pref_rating_count";
    private static final String DELIVERY_ON_AMOUNT = "deliveryOnAmount";//for SubNotAvailable
    private static final String DELIVERY_CHARGE = "deliveryCharge";//for SubNotAvailable
    private static final String DELIVERY_ON_AMOUNT_SUBS = "deliveryOnAmountSubs";//for SubAvailable
    private static final String DELIVERY_CHARGE_SUBS = "deliveryChargeSubs";//for SubAvailable
    private static final String BASE_DISCOUNT = "baseDiscount";
    private static SharedPrefManager instance;
    private static final String SELECTED_CITY = "selectedCity";
    private static final String SELECTED_STATE = "selectedState";
    private static final String SELECTED_WAREHOUSEID = "selectedWarehouseid";
    private static final String COLD_CHAIN_DELIVERABLE = "coldChainDeliverable";
    private static final String PREF_REORDER_CATEGORY = "pref_reorder_category";
    private static final String NEW_ACTION = "new_action";
    private static final String MASTER_DATA_SPLASH = "master_data_splash";
    private static final String MAXIMUM_API_RESPONSE_TIME_TO_PUT_LOG = "maximum_api_response_time_to_put_log";
    private static final String REFERRER_DATA = "referrer_data";
    private static final String REFRESH_ORDERS = "refresh_order";
    private static final String MY_ORDER_REFRESH = "my_order_refresh";
    private static final String CUSTOMER_CARE_NUMBER = "customer_care_number";
    private static final String SUPPORT_EMAIL_ID = "support_email_id";
    private static final String PREF_SUBS_ADD_TO_CART_CATEGORY = "pref_subs_add_to_cart_category";
    private static final String SUBS_ADD_TO_CART_CATEGORY_ID = "subs_add_to_cart_category_id";
    private static final String PRE_PDSearch_BlueGreenVariant = "Pref_PDSearch_BlueGreenVariant";
    public static final String PRE_FTC_Coupon_Urgency_Variant = "Pref_FTC_Coupon_Urgency";
    public static final String PREF_FTC_Variant_C_Coupon_Expiry_Time = "pref_ftc_variant_c_coupon_Expiry_time";
    private static final String PRE_FTC_Coupon_Urgency_Variant_ID = "Pref_FTC_Coupon_Urgency_Id";
    public static final String PREF_IS_FTC_Coupon_Timer_Mixpanel_Event_Called = "IS_FTC_Coupon_Timer_Mixpanel_Event_Called";
    private static final String PREF_IS_FTC = "pref_is_ftc";
    private static final String PRE_PDSearch_BlueGreenVariantId = "Pref_PDSearch_BlueGreenVariant_Id";
    private static final String PREF_IS_ADDRESS_AVAIL_FOR_PIN_CODE = "pref_is_address_avail_for_pin_code";
    private static final String PREF_LOGGED_IN_FROM_BOTTOMSHEET = "pref_logged_in_from_bottomsheet";
    private static final String PREF_PROCESSING_FEE_VARIANT_ID = "pref_processing_fee_variant_id";
    private static final String PREF_PROCESSING_FEE_VARIANT = "pref_processing_fee_variant";
    private static final String PREF_ONE_CLICK_SUBSTITUTION_EXPERIMENT = "pref_one_click_substitution_experiment";
    private static final String PREF_ONE_CLICK_SUBSTITUTION_EXPERIMENT_ID = "pref_one_click_substitution_experiment_id";
    private static final String PREF_PILL_REMINDER_VARIANT = "pref_pill_reminder_variant";
    private static final String PREF_PILL_REMINDER_VARIANT_ID = "pref_pill_reminder_variant_id";
    private static final String PREF_CREDIT_REWARD_VARIANT = "pref_credit_reward_variant";
    private static final String PREF_CREDIT_REWARD_VARIANT_ID = "pref_credit_reward_variant_id";
    private static final String PREF_DEFAULT_PAYMENT_MODE = "pref_default_payment_mode";
    private static final String PREF_DEFAULT_PAYMENT_MODE_ID = "pref_default_payment_mode_id";
    private static final String PREF_VIDEO_ORDER_STATUS = "pref_video_order_status";
    private static final String PREF_VIDEO_ORDER_STATUS_ID = "pref_video_order_status_id";
    private static final String PREF_CANCELLATION_FLOW_VARIANT = "pref_cancellation_flow_variant";
    private static final String PREF_CANCELLATION_FLOW_VARIANT_ID = "pref_cancellation_flow_variant_id";
    private static final String PREF_PSP_EXPERIMENT_VARIANT = "pref_psp_experiment_variant";
    private static final String PREF_PSP_EXPERIMENT_VARIANT_ID = "pref_psp_experiment_variant_id";

//    private static final String PREF_PSP_IS_VIEWED = "pref_psp_is_viewed";

    private static final String FTC_PREF_DYNAMIC_DISCOUNT_EXPERIMENT_VARIANT = "ftc_dynamic_discount_experiment_variant";
    private static final String FTC_PREF_DYNAMIC_DISCOUNT_EXPERIMENT_VARIANT_ID = "ftc_dynamic_discount_experiment_variant_id";

    private static final String NFTC_PREF_DYNAMIC_DISCOUNT_EXPERIMENT_VARIANT = "nftc_dynamic_discount_experiment_variant";
    private static final String NFTC_PREF_DYNAMIC_DISCOUNT_EXPERIMENT_VARIANT_ID = "nftc_dynamic_discount_experiment_variant_id";

    public static final String PREF_CURRENT_ORDER_COUPON_CHARGE = "pref_current_coupon_Charge";
    public static final String PREF_CURRENT_ORDER_DELIVERY_CHARGE = "pref_current_delivery_Charge";
    public static final String PREF_CURRENT_ORDER_TM_CASH = "pref_current_tm_cash";
    public static final String PREF_CURRENT_ORDER_TM_CREDIT = "pref_current_tm_credit";
    public static final String PREF_ACCOUNT_TM_CREDIT = "pref_account_tm_credit";
    public static final String PREF_CURRENT_ORDER_PACKAGE_CHARGE = "pref_current_package_charge";
    public static final String PREF_API_FINAL_CALC_PAYABLE = "pref_api_final_calc_payable";

    public static final String PREF_COUPON_DISCOUNT_AMT_EVENT = "pref_coupon_discount_amt_event";
    public static final String PREF_DISCOUNT_EVENT = "pref_discount_event";
    public static final String PREF_MRP_EVENT = "pref_mrp_event";

    public static final String PREF_DEFAULT_PAYMENT_VARIANT = "pref_default_payment_variant";
    private static final String PREF_REORDER_CLICKED_ON_PAGE = "pref_reorder_clicked_on_page";
    private static final String PREF_REORDER_PREVIOUS_STAGE = "pref_reorder_previous_stage";
    private static final String PREF_IS_ADDRESS_PATIENT_ADDED_INFLOW = "pref_is_address_patient_added_inflow";
    private static final String PREF_UPI_INFO_URL = "pref_upi_info_url";
    public static final String PREF_TRENDING_SEARCH_LIST = "pref_trending_search_list";


    private static final String PREF_REORDER_DESIGN_EXPERIMENT = "pref_reorder_design_experiment";

    private static final String PREF_IS_REORDER = "pref_is_reorder";
    private static final String PREF_REORDER_DESIGN_EXPERIMENT_ID = "pref_reorder_design_experiment_id";
    private static final String REFRESH_CROSS_SELLING_PRODUCTS = "refresh_cross_selling_products";
    private static final String PERF_DB_MIGRATION_COMPLETED = "pref_db_migration_completed";

    private static final String PREF_TRADITIONAL_BASE_DISCOUNT_VARIANT_ID = "pref_traditional_base_discount_variant_id";
    private static final String PREF_ALGO_SPECIFIC_VARIANT_ID = "pref_algo_specific_variant_id";

    private static final String FIREBASE_APP_INSTANCE_ID = "firebase_app_instance_id";
    private static final String PREF_IS_FTC_HOME = "pref_is_ftc_home";
    
    private static final String PREF_IS_USER_SKIPPED_REPLACE = "pref_is_user_skipped_subs";

    private static final String RATING_ORDER_ID_SKIP = "rating_order_id_skip";

    private static final String PREF_IS_AUTO_REPLACE = "pref_is_auto_replace";
    //    private static final String PREF_LAST_SELECTED_SERVICABLE_ADDRESS_ID = "pref_last_selected_servicable_address_id";
    private static final String TOTAL_SAVING_TILL_DATE = "total_saving_till_date";
    private static final String TM_WALLET = "tm_wallet";

    private static final String COUPON_MODEL = "pref_coupon_model";
    private static final String ACTIVE_ORDER_COUNT = "active_order_count";
    private static final String DELIVERED_ORDER_COUNT = "delivered_order_count";
    private static final String PREF_CONTACT_BS_CLOSED = "pref_contacts_sheet_closed";
    public static final String PREF_FTC_Coupon_Expiry_Time = "pref_ftc_coupon_Expiry_time";
    public static final String PREF_MIN_MED_DISCOUNT_TO_BE_HIDDEN = "pref_min_med_discount_to_be_hidden";
    public static final String ANDROID_DEVICE_ID = "android_device_id";


    public SharedPrefManager(Context context, String prefName) {
        super(context, prefName);
    }

    public static void initialize(Context context) {
        if (context == null) {
            throw new NullPointerException("Context is null");
        }
        if (instance == null) {
            synchronized (SharedPrefManager.class) {
                if (instance == null) {
                    instance = new SharedPrefManager(context, PREF_NAME);
                }
            }
        }
    }

    public static SharedPrefManager getInstance() {
        if (instance == null) {
            throw new IllegalStateException("SharedPrefsManager is not initialized, call initialize(applicationContext) static method first");
        }
        return instance;
    }

    public int getSelectedBillValue() {
        return getInstance().getInt(SELECTED_BILL_VALUE, -1);
    }

    public void setSelectedBillValue(int id) {
        getInstance().setInt(SELECTED_BILL_VALUE, id);
    }

    public int getSelectedBillId() {
        return getInstance().getInt(SELECTED_BILL_ID, -1);
    }

    public void setSelectedBillId(int id) {
        getInstance().setInt(SELECTED_BILL_ID, id);
    }

    public void addLastDeliveredOrderedId(long orderId) {
        getInstance().setLong(LAST_RATING_FOR_ORDERID, orderId);
    }

    public long getLastDeliveredOrderId() {
        long val = 0L;
        try {
            val = getInstance().getLong(LAST_RATING_FOR_ORDERID, 0L);
        } catch (Exception e) {
            val = getInstance().getInt(LAST_RATING_FOR_ORDERID);
        }
        return val;
    }

    public void increaseLastDeliveredRatingCounter() {
        int counter = getInstance().getInt(LAST_RATING_COUNT_FOR_ORDERID, 0);
        counter++;
        getInstance().setInt(LAST_RATING_COUNT_FOR_ORDERID, counter);
    }

    public int lastRatingPoupCounter() {
        return getInstance().getInt(LAST_RATING_COUNT_FOR_ORDERID, 0);
    }

    public void resetRatingPopupCounter() {
        getInstance().setInt(LAST_RATING_COUNT_FOR_ORDERID, 0);
    }

    public void setSelectedConditionsList(HashSet<Integer> list) {
        Set<String> set = new HashSet<>();
        for (Integer f : list) {
            set.add(String.valueOf(f));
        }
        getInstance().setList(SELECTED_CONDITIONS_LIST, set);
    }

    public List<Integer> selectedMedicalConditions() {
        List<Integer> list = new ArrayList<>();
        Set<String> selectedIds = getInstance().getSetData(SELECTED_CONDITIONS_LIST);
        if (selectedIds != null && selectedIds.size() > 0) {
            for (String f : selectedIds) {
                list.add(Integer.parseInt(f));
            }
        }
        return list;
    }

    public String getTrendingSearch() {
        return getInstance().getString(PREF_TRENDING_SEARCH_LIST, "");
    }

    public void setTrendingSearch(String trendingSearch) {
        getInstance().setString(PREF_TRENDING_SEARCH_LIST, trendingSearch);
    }


    /*public String getClickPostLink() {
        return getInstance().getString(PREF_CLICKPOST_LINK, null);
    }

    public void setClickPostLink(String link) {
        getInstance().setString(PREF_CLICKPOST_LINK, link);
    }*/

    /*public String getReferryFullName() {
        return getInstance().getString(PREF_REFERRAL_CUSTOMER_FULL_NAME, null);
    }

    public void setReferryFullName(String fullName) {
        getInstance().setString(PREF_REFERRAL_CUSTOMER_FULL_NAME, fullName);
    }*/

    public String getReferryId() {
        return getInstance().getString(PREF_REFERRAL_CUSTOMER_ID, null);
    }

    public void setReferryId(String id) {
        getInstance().setString(PREF_REFERRAL_CUSTOMER_ID, id);
    }

    public void setUserName(String name) {
        getInstance().setString(PREF_CURRENT_USER_NAME, name);
    }

    public void setUserMobile(String name) {
        getInstance().setString(PREF_CURRENT_USER_MOBILE, name);
    }


    public void setUserEmail(String name) {
        getInstance().setString(PREF_CURRENT_USER_EMAIL, name);
    }

    public void setUserId(String name) {
        getInstance().setString(PREF_CURRENT_USER_ID, name);
    }

    private void setUserProfileImageUrl(String name) {
        getInstance().setString(PREF_CURRENT_USER_IMAGEURL, name);
    }

    public void setUserAccessToken(String name) {
        getInstance().setString(PREF_CURRENT_USER_ACCESSTOKEN, name);
    }

    public String getLoggedInUserAccessToken() {
        return getInstance().getString(PREF_CURRENT_USER_ACCESSTOKEN, "");
    }
    public void setMinMedDiscountToBeHidden(Float name) {
        getInstance().setFloat(PREF_MIN_MED_DISCOUNT_TO_BE_HIDDEN, name);
    }

    public Float getMinMedDiscountToBeHidden() {
        return getInstance().getFloat(PREF_MIN_MED_DISCOUNT_TO_BE_HIDDEN, 0f);
    }

    /*public void setHelplineNumber(String number) {
        getInstance().setString(PREF_SET_HELPLINE_NUMBER, number);
    }

    public String getHelplineNumber() {
        return getInstance().getString(PREF_SET_HELPLINE_NUMBER, "");
    }*/

    public void setSessionToken(String sessionToken) {
        getInstance().setString(PREF_SESSION_TOKEN, sessionToken);
    }


    public void setTotalSavingTillDate(String name) {
        getInstance().setString(TOTAL_SAVING_TILL_DATE, name);
    }

    public String getTotalSavingTillDate() {
        return getInstance().getString(TOTAL_SAVING_TILL_DATE, "0.0");
    }

    public void setTmWallet(String name) {
        getInstance().setString(TM_WALLET, name);
    }

    public String getTmWallet() {
        return getInstance().getString(TM_WALLET, "0.0");
    }


    public void setIsFtc(Boolean name) {
        getInstance().setBoolean(PREF_IS_FTC_HOME, name);
    }

    public Boolean getIsFtc() {
        return getInstance().getBoolean(PREF_IS_FTC_HOME, true);
    }

    public String getSessionToken() {
        return getInstance().getString(PREF_SESSION_TOKEN, "");
    }

    public String getLoggedInUserName() {
        String userName = getInstance().getString(PREF_CURRENT_USER_NAME, "");
        userName = userName.equalsIgnoreCase("null") ? "" : userName;
        return userName;
    }

    public String getLoggedInUserMobile() {
        return getInstance().getString(PREF_CURRENT_USER_MOBILE, "");
    }

    public String getLoggedInUserId() {
        return getInstance().getString(PREF_CURRENT_USER_ID, "0");
    }

    public String getLoggedInUserProfileUrl() {
        return getInstance().getString(PREF_CURRENT_USER_IMAGEURL, null);
    }

    public String getLoggedInUserEmail() {
        String userEmail = getInstance().getString(PREF_CURRENT_USER_EMAIL, "");
        userEmail = userEmail.equalsIgnoreCase("null") ? "" : userEmail;
        return userEmail;
    }

    public String getCurrentUserAge() {
        return getInstance().getString(PREF_CURRENT_USER_AGE, "");
    }

    public void setCurrentUserAge(String age) {
        getInstance().setString(PREF_CURRENT_USER_AGE, age);
    }

    public String getCurrentUserGender() {
        return getInstance().getString(PREF_CURRENT_USER_GENDER, "");
    }

    public void setCurrentUserGender(String gender) {
        getInstance().setString(PREF_CURRENT_USER_GENDER, gender);
    }

    public boolean getNotification() {
        return SharedPrefManager.getInstance().getBoolean(PREF_IS_NOTIFICATION, false);
    }

    public void setAction(int newState) {
        getInstance().setInt(NEW_ACTION, newState);
    }

    public int getAction() {
        return getInstance().getInt(NEW_ACTION, 0);
    }


    public void setNotification(boolean isNotification) {
        SharedPrefManager.getInstance().setBoolean(PREF_IS_NOTIFICATION, isNotification);
    }

    /*public String getAppVersion() {
        return getInstance().getString(CURRENT_APP_VERSION, "");
    }

    public void setAppVersion(String version) {
        getInstance().setString(CURRENT_APP_VERSION, version);
    }*/

    /*public boolean isRatingAllowed() {
        return getInstance().getBoolean(PREF_IS_ALLOWED_TO_ASK_REVIEW, false);
    }

    public void setRatingAllowed(boolean isAllowed) {
        getInstance().setBoolean(PREF_IS_ALLOWED_TO_ASK_REVIEW, isAllowed);
    }*/

    public boolean isAddressAvailForPinCode() {
        return getInstance().getBoolean(PREF_IS_ADDRESS_AVAIL_FOR_PIN_CODE, true);
    }

    public void setIsAddressAvailForPinCode(boolean isAvail) {
        getInstance().setBoolean(PREF_IS_ADDRESS_AVAIL_FOR_PIN_CODE, isAvail);
    }

    public void setIsProceedWithoutPrescription(boolean value) {
        getInstance().setBoolean(IS_PROCEED_WITHOUT_PRESCRIPTION, value);
    }

    public boolean isProceedWithoutPrescription() {
        return getInstance().getBoolean(IS_PROCEED_WITHOUT_PRESCRIPTION, true);
    }


    public void setIsLoginSkipped(boolean value) {
        getInstance().setBoolean(IS_LOGIN_SKIPPED, value);
    }

    public boolean isLoginSkipped() {
        return getInstance().getBoolean(IS_LOGIN_SKIPPED, false);
    }


    public void setPrescriptionCount(int value) {
        getInstance().setInt(PRESCRIPTION_COUNT, value);
    }

    public int getPrescriptionCount() {
        return getInstance().getInt(PRESCRIPTION_COUNT, 0);
    }

    public Long getPatientId() {
        long patientID = -1;
        if (getLastSelectedPatientID() != -1) {
            patientID = getLastSelectedPatientID();
        } /*else if (getOrderCompletedPatientID() != -1) {
            patientID = getOrderCompletedPatientID();
        }*/
        return patientID;
    }

    public long getLastSelectedPatientID() {
        long val = 0L;
        try {
            val = getInstance().getLong(LAST_SELECTED_PATIENT_ID, -1);
        } catch (Exception e) {
            val = getInstance().getInt(LAST_SELECTED_PATIENT_ID);
        }
        return val;
    }

    public void setPatientId(long patientId) {
        SharedPrefManager.getInstance().setLong(LAST_SELECTED_PATIENT_ID, patientId);
    }

    /*public void setLastSelectedServicableAddressID(int value) {
        getInstance().setInt(PREF_LAST_SELECTED_SERVICABLE_ADDRESS_ID, value);
    }

    public int getLastSelectedServicableAddressID() {
        return getInstance().getInt(PREF_LAST_SELECTED_SERVICABLE_ADDRESS_ID, -1);
    }*/

    public void setNewlyCreatedPatientId(int patientId) {
        SharedPrefManager.getInstance().setInt(NEWLY_CREATED_PATIENT_ID, patientId);
    }

    public int getNewlyCreatedPatientId() {
        return getInstance().getInt(NEWLY_CREATED_PATIENT_ID, -1);
    }

    public void setNewlyCreatedAddressId(int addressId) {
        SharedPrefManager.getInstance().setInt(NEWLY_CREATED_ADDRESS_ID, addressId);
    }

    public int getNewlyCreatedAddressId() {
        return getInstance().getInt(NEWLY_CREATED_ADDRESS_ID, -1);
    }

    /*public boolean getIsNotShowPaymentGuide() {
        return getInstance().getBoolean(PREF_SHOW_PAYMENT_GUIDE_GIF, false);
    }

    public void setIsNotShowPaymentGuide(boolean isNotShow) {
        getInstance().setBoolean(PREF_SHOW_PAYMENT_GUIDE_GIF, isNotShow);
    }*/

    public boolean getRefreshCrossSelling() {
        return getInstance().getBoolean(REFRESH_CROSS_SELLING_PRODUCTS, false);
    }

    public void setRefreshCrossSelling(boolean isRefreshFlag) {
        getInstance().setBoolean(REFRESH_CROSS_SELLING_PRODUCTS, isRefreshFlag);
    }

    public String getUpiInfoUrl() {
        return getInstance().getString(PREF_UPI_INFO_URL, "");
    }

    public void setUpiInfoUrl(String upiInfoUrl) {
        getInstance().setString(PREF_UPI_INFO_URL, upiInfoUrl);
    }

    /*public int getLastOnClickedPatientID() {
        return getInstance().getInt(LAST_ON_CLICKED_PATIENT_ID, -1);
    }

    public void setLastOnClickedPatientId(int patientId) {
        SharedPrefManager.getInstance().setInt(LAST_ON_CLICKED_PATIENT_ID, patientId);
    }

    public int getLastCreatedPatientID() {
        return getInstance().getInt(LAST_CREATED_PATIENT_ID, -1);
    }

    public void setLastCreatedPatientId(int patientId) {
        SharedPrefManager.getInstance().setInt(LAST_CREATED_PATIENT_ID, patientId);
    }

    public int getLastOnClickedAddressID() {
        return getInstance().getInt(LAST_ON_CLICKED_ADDRESS_ID, -1);
    }

    public void setLastOnClickedAddressId(int addressId) {
        SharedPrefManager.getInstance().setInt(LAST_ON_CLICKED_ADDRESS_ID, addressId);
    }

    public int getLastCreatedAddressID() {
        return getInstance().getInt(LAST_CREATED_ADDRESS_ID, -1);
    }

    public void setLastCreatedAddressId(int addressId) {
        SharedPrefManager.getInstance().setInt(LAST_CREATED_ADDRESS_ID, addressId);
    }

    public String getLastCreatedAddress() {
        return getInstance().getString(LAST_CREATED_ADDRESS, "");
    }

    public void setLastCreatedAddress(String address) {
        SharedPrefManager.getInstance().setString(LAST_CREATED_ADDRESS, address);
    }

    public String getLastCreatedAddressType() {
        return getInstance().getString(LAST_CREATED_ADDRESS_TYPE, "");
    }

    public void setLastCreatedAddressType(String addressType) {
        SharedPrefManager.getInstance().setString(LAST_CREATED_ADDRESS_TYPE, addressType);
    }*/

    public Long getAddressId() {
        long addressID = -1;
        if (getLastSelectedAddressID() != -1) {
            addressID = getLastSelectedAddressID();
        } /*else if (getOrderCompletedAddressID() != -1) {
            addressID = getOrderCompletedAddressID();
        }*/
        return addressID;
    }

    public Long getLastSelectedAddressID() {
        long val = 0L;
        try {
            val = getInstance().getLong(PREF_LAST_SELECTED_ADDRESS_ID, 0);
        } catch (Exception e) {
            val = getInstance().getInt(PREF_LAST_SELECTED_ADDRESS_ID);
        }
        return val;
    }

    public void setAddressId(long modeId) {
        SharedPrefManager.getInstance().setLong(PREF_LAST_SELECTED_ADDRESS_ID, modeId);
    }

    public int getLastDeliveredAddressId() {
        return getInstance().getInt(PREF_LAST_DELIVERED_ADDRESS_ID, -1);
    }

    public void setLastDeliveredAddressId(int modeId) {
        SharedPrefManager.getInstance().setInt(PREF_LAST_DELIVERED_ADDRESS_ID, modeId);
    }

    /*public String getLastSelectedAddressType() {
        return getInstance().getString(PREF_LAST_SELECTED_ADDRESS_ID, "");
    }*/

    public String getAddressType() {
        return getInstance().getString(PREF_LAST_SELECTED_ADDRESS_TYPE, "");
    }

    public void setAddressType(String addressType) {
        SharedPrefManager.getInstance().setString(PREF_LAST_SELECTED_ADDRESS_TYPE, addressType);
    }

    public void setPatientName(String patientName) {
        SharedPrefManager.getInstance().setString(PREF_LAST_SELECTED_PATIENT_NAME, patientName);
    }

    public String getPatientName() {
        return getInstance().getString(PREF_LAST_SELECTED_PATIENT_NAME, "");
    }

    public void setPatientType(String patientType) {
        SharedPrefManager.getInstance().setString(PREF_LAST_SELECTED_PATIENT_TYPE, patientType);
    }

    public String getPatientType() {
        return getInstance().getString(PREF_LAST_SELECTED_PATIENT_TYPE, "");
    }

    public void setPaymentSelectedMode(int modeId) {
        SharedPrefManager.getInstance().setInt(PREF_LAST_SELECTED_PAYMENT_MODE, modeId);
    }

    public int getLastSelectedPaymentModeId() {
        return getInstance().getInt(PREF_LAST_SELECTED_PAYMENT_MODE, -1);
    }

    public int getLastSelectedPaymentModeId(int defaultID) {
        return getInstance().getInt(PREF_LAST_SELECTED_PAYMENT_MODE, defaultID);
    }

    /*public int getOrderCompletedPaymentID() {
        return getInstance().getInt(PREF_LAST_COMPLETED_ORDER_PAYMENT_MODE, -1);
    }

    public void setOrderCompletedPaymentID(int modeId) {
        SharedPrefManager.getInstance().setInt(PREF_LAST_COMPLETED_ORDER_PAYMENT_MODE, modeId);
    }

    public int getOrderCompletedAddressID() {
        return getInstance().getInt(PREF_LAST_COMPLETED_ORDER_ADDRESS_ID, -1);
    }

    public void setOrderCompletedAddressID(int id) {
        SharedPrefManager.getInstance().setInt(PREF_LAST_COMPLETED_ORDER_ADDRESS_ID, id);
    }*/

    public int getOrderCompletedPatientID() {
        return getInstance().getInt(LAST_COMPLETED_ORDER_PATIENT_ID, -1);
    }

    public void setOrderCompletedPatientID(int id) {
        SharedPrefManager.getInstance().setInt(LAST_COMPLETED_ORDER_PATIENT_ID, id);
    }

    public String getGoogleAdId() {
        return getInstance().getString(PREF_GOOGLE_ADID, null);
    }

    public void setGoogleAdId(String adId) {
        getInstance().setString(PREF_GOOGLE_ADID, adId);
    }

    public int getCustomerTmCash() {
        return (int) getInstance().getFloat(PREF_IS_CUSTOMER_TMCASH, 0);
    }

    public double getCustomerTmCashDouble() {
        return (double) getInstance().getFloat(PREF_IS_CUSTOMER_TMCASH, 0);
    }

    public void setCustomerTmCash(double value) {
        getInstance().setFloat(PREF_IS_CUSTOMER_TMCASH, (float) value);
    }
    public int getCustomerTmCredit() {
        return (int) getInstance().getFloat(PREF_IS_CUSTOMER_TMCREDIT, 0);
    }
    public void setCustomerDeliveryCharge(double value) {
        getInstance().setFloat(PREF_IS_CUSTOMER_DELIVERY_CHARGE, (float) value);
    }
    public int getCustomerDeliveryCharge() {
        return (int) getInstance().getFloat(PREF_IS_CUSTOMER_DELIVERY_CHARGE, 0);
    }
    public void setCustomerPackagingCharge(double value) {
        getInstance().setFloat(PREF_IS_CUSTOMER_PACKAGING_CHARGE, (float) value);
    }

    public int getCustomerPackagingCharge() {
        return (int) getInstance().getFloat(PREF_IS_CUSTOMER_PACKAGING_CHARGE, 0);
    }

    public double getCustomerTmCreditDouble() {
        return (double) getInstance().getFloat(PREF_IS_CUSTOMER_TMCREDIT, 0);
    }

    public void setCustomerTmCredit(double value) {
        getInstance().setFloat(PREF_IS_CUSTOMER_TMCREDIT, (float) (value));
    }

    public float getAccountTmCredit() {
        return getInstance().getFloat(PREF_ACCOUNT_TM_CREDIT, 0f);
    }

    public void setAccountTmCredit(float value) {
        getInstance().setFloat(PREF_ACCOUNT_TM_CREDIT, value);
    }

    public String getFinalAmountValue() {
        return getInstance().getString(PREF_BILL_AMOUNT, "");
    }

    public void setFinalAmountValue(String value) {
        getInstance().setString(PREF_BILL_AMOUNT, value);
    }

    public int getAppLang() {
        return getInstance().getInt(PREF_CURRENT_APP_LANGUAGE, 42);
    }

    public void setAppLang(int languageId) {
        getInstance().setInt(PREF_CURRENT_APP_LANGUAGE, languageId);
    }

    /*public boolean isDeviceDataSent() {
        return getInstance().getBoolean(IS_DEVICE_SENT, false);
    }

    public void setDeviceDataSent(boolean sent) {
        getInstance().setBoolean(IS_DEVICE_SENT, sent);
    }*/

    public void saveFcm(String fcm) {
        getInstance().setString(DEVICE_FCM, fcm);
    }

    public String getFcm() {
        return getInstance().getString(DEVICE_FCM, "");
    }

    public void setMasterDataSavedOnSplash(boolean b) {
        getInstance().setBoolean(MASTER_DATA_SPLASH, b);
    }

    public boolean getMasterDataSavedOnSplash() {
        return getInstance().getBoolean(MASTER_DATA_SPLASH, false);
    }

    /*public void setFirstInsallUpdate() {
        getInstance().setBoolean(IS_FIRST_INSTALL_MOENGAGE_UPDATED, true);
    }

    public boolean isFirstInstallUpdate() {
        return getInstance().getBoolean(IS_FIRST_INSTALL_MOENGAGE_UPDATED, false);
    }

    public String getLastVisitedPage() {
        return getInstance().getString(PREF_LAST_VISITED_PAGE, null);
    }

    public void setLastVisitedPage(String lastPage) {
        getInstance().setString(PREF_LAST_VISITED_PAGE, lastPage);
    }*/

    public String getUserCategory() {
        return getInstance().getString(USER_DEFAULT_CATEGORY, "A");
    }

    public void setUserCategory(String category) {
        getInstance().setString(USER_DEFAULT_CATEGORY, category);
    }


    public void setDefaultPaymentVariant(String category) {
        getInstance().setString(PREF_DEFAULT_PAYMENT_VARIANT, category);
    }

    public String getDefaultPaymentVariant() {
        return getInstance().getString(PREF_DEFAULT_PAYMENT_VARIANT, "A");
    }

    public int getDefaultPaymentVariantId() {
        return getInstance().getInt(PREF_DEFAULT_PAYMENT_VARIANT, -1);
    }

    public void setDefaultPaymentVariantId(int categoryId) {
        getInstance().setInt(PREF_DEFAULT_PAYMENT_VARIANT, categoryId);
    }

    public void setSubToAddCartCategory(String category) {
        getInstance().setString(PREF_SUBS_ADD_TO_CART_CATEGORY, category);
    }

    public String getSubsAddToCartCategory() {
        return getInstance().getString(PREF_SUBS_ADD_TO_CART_CATEGORY, "");
    }


    public int getSubaAddToCartCategoryId() {
        return getInstance().getInt(SUBS_ADD_TO_CART_CATEGORY_ID, -1);
    }

    public void setSubToAddCartCategoryId(int categoryId) {
        getInstance().setInt(SUBS_ADD_TO_CART_CATEGORY_ID, categoryId);
    }


    public void setPDSearch_BlueGreenVariant(String category) {

        getInstance().setString(PRE_PDSearch_BlueGreenVariant, category);
    }

    public String getPDSearch_BlueGreenVariant() {
        //return Constants.PD_SEARCH_BLUE_WITH_POPUP;
        return getInstance().getString(PRE_PDSearch_BlueGreenVariant, "PD_SEARCH_BLUE_WITH_POPUP");
    }

    public int getPDSearch_BlueGreenVariantId() {
        return getInstance().getInt(PRE_PDSearch_BlueGreenVariantId, -1);
    }

    public void setPDSearch_BlueGreenVariantId(int categoryId) {
        getInstance().setInt(PRE_PDSearch_BlueGreenVariantId, categoryId);
    }

    public void setFtcCouponUrgencyVariant(String category) {
        getInstance().setString(PRE_FTC_Coupon_Urgency_Variant, category);
    }

    public String getFtcCouponUrgencyVariant() {
        //return Constants.FTC_COUPON_URGENCY_VARIANT_C;
        return getInstance().getString(PRE_FTC_Coupon_Urgency_Variant, "A");
    }

    public void setFtcVariantCCouponExpiryTime(long currentTime) {
        //current time + 1hr
        long time = currentTime + 3600000;
        getInstance().setLong(PREF_FTC_Variant_C_Coupon_Expiry_Time, time);
    }

    public void setFtcVariantCCouponExpiryTimeRestart(long currentTime) {
        getInstance().setLong(PREF_FTC_Variant_C_Coupon_Expiry_Time, currentTime);
    }

    public long getFtcVariantCCouponExpiryTime() {
        /*long time = System.currentTimeMillis() + 3600000;
        return time;*/
        return getInstance().getLong(PREF_FTC_Variant_C_Coupon_Expiry_Time, -1);
    }

    public void setFtcCouponUrgencyVariantId(int category) {
        getInstance().setInt(PRE_FTC_Coupon_Urgency_Variant_ID, category);
    }

    public int getFtcCouponUrgencyVariantId() {
        return getInstance().getInt(PRE_FTC_Coupon_Urgency_Variant_ID, -1);
    }

    public void setIsFtcCouponTimerMixpanelEventCalled(boolean bool) {
        getInstance().setBoolean(PREF_IS_FTC_Coupon_Timer_Mixpanel_Event_Called, bool);
    }

    public boolean getIsFtcCouponTimerMixpanelEventCalled() {
        return getInstance().getBoolean(PREF_IS_FTC_Coupon_Timer_Mixpanel_Event_Called, false);
    }

    //Cancellation flow variant
    public void setCancellationFlowVariant(String category) {
        getInstance().setString(PREF_CANCELLATION_FLOW_VARIANT, category);
    }

    public String getCancellationFlowVariant() {
        return getInstance().getString(PREF_CANCELLATION_FLOW_VARIANT, "B");
    }

    public int getCancellationFlowVariantId() {
        return getInstance().getInt(PREF_CANCELLATION_FLOW_VARIANT_ID, -1);
    }

    public void setCancellationFlowVariantId(int categoryId) {
        getInstance().setInt(PREF_CANCELLATION_FLOW_VARIANT_ID, categoryId);
    }

    //PSP variant
    public void setPrefPspExperimentVariant(@NonNull String category) {
        getInstance().setString(PREF_PSP_EXPERIMENT_VARIANT, category);
    }

    @NonNull
    public String getPrefPspExperimentVariant() {
        return getInstance().getString(PREF_PSP_EXPERIMENT_VARIANT, "A");
    }

    public int getPrefPspExperimentVariantId() {
        return getInstance().getInt(PREF_PSP_EXPERIMENT_VARIANT_ID, -1);
    }

    public void setPrefPspExperimentVariantId(int categoryId) {
        getInstance().setInt(PREF_PSP_EXPERIMENT_VARIANT_ID, categoryId);
    }

    /*public boolean getIsPspViewed() {
        return getInstance().getBoolean(PREF_PSP_IS_VIEWED, false);
    }

    public void setIsPspViewed(boolean isPSPViewed) {
        getInstance().setBoolean(PREF_PSP_IS_VIEWED, isPSPViewed);
    }*/

    public void setFTCPrefDynamicDiscountExperimentVariant(@NonNull String category) {
        getInstance().setString(FTC_PREF_DYNAMIC_DISCOUNT_EXPERIMENT_VARIANT, category);
    }

    @NonNull
    public String getFTCPrefDynamicDiscountExperimentVariant() {
        return getInstance().getString(FTC_PREF_DYNAMIC_DISCOUNT_EXPERIMENT_VARIANT, "");
    }

    public int getFTCPrefDynamicDiscountExperimentVariantId() {
        return getInstance().getInt(FTC_PREF_DYNAMIC_DISCOUNT_EXPERIMENT_VARIANT_ID, -1);
    }

    public void setFTCPrefDynamicDiscountExperimentVariantId(int categoryId) {
        getInstance().setInt(FTC_PREF_DYNAMIC_DISCOUNT_EXPERIMENT_VARIANT_ID, categoryId);
    }

    //
    public void setNFTCPrefDynamicDiscountExperimentVariant(@NonNull String category) {
        getInstance().setString(NFTC_PREF_DYNAMIC_DISCOUNT_EXPERIMENT_VARIANT, category);
    }

    @NonNull
    public String getNFTCPrefDynamicDiscountExperimentVariant() {
        //return "A";
        return getInstance().getString(NFTC_PREF_DYNAMIC_DISCOUNT_EXPERIMENT_VARIANT, "");
    }

    public int getNFTCPrefDynamicDiscountExperimentVariantId() {
        return getInstance().getInt(NFTC_PREF_DYNAMIC_DISCOUNT_EXPERIMENT_VARIANT_ID, -1);
    }

    public void setNFTCPrefDynamicDiscountExperimentVariantId(int categoryId) {
        getInstance().setInt(NFTC_PREF_DYNAMIC_DISCOUNT_EXPERIMENT_VARIANT_ID, categoryId);
    }


    public void setProcessingFeeVariant(String processingFee) {
        getInstance().setString(PREF_PROCESSING_FEE_VARIANT, processingFee);
    }

    public String getProcessingFeeVariant() {
        return getInstance().getString(PREF_PROCESSING_FEE_VARIANT, "F");
    }

    //pill reminder
    public void setPillReminderVariant(String variant) {
        getInstance().setString(PREF_PILL_REMINDER_VARIANT, variant);
    }

    public String getPillReminderVariant() {
        return getInstance().getString(PREF_PILL_REMINDER_VARIANT, "A");
    }

    public void setOneClickSubstitutionVariant(String variant) {
        getInstance().setString(PREF_ONE_CLICK_SUBSTITUTION_EXPERIMENT, variant);
    }

    public String getOneClickSubstitutionVariant() {
        return getInstance().getString(PREF_ONE_CLICK_SUBSTITUTION_EXPERIMENT, "A");
    }

    public void setOneClickSubstitutionVariantId(int variantId) {
        getInstance().setInt(PREF_ONE_CLICK_SUBSTITUTION_EXPERIMENT_ID, variantId);
    }

    public int getOneClickSubstitutionVariantId() {
        return getInstance().getInt(PREF_ONE_CLICK_SUBSTITUTION_EXPERIMENT_ID, 0);
    }

    public void setReorderDesignVariant(String variant) {
        getInstance().setString(PREF_REORDER_DESIGN_EXPERIMENT, variant);
    }

    public String getReorderDesignVariant() {
        return getInstance().getString(PREF_REORDER_DESIGN_EXPERIMENT, "A");
    }

    public void setIsReOder(boolean isReOrder) {
        getInstance().setBoolean(PREF_IS_REORDER, isReOrder);
    }

    public boolean getIsReOrder() {
        return getInstance().getBoolean(PREF_IS_REORDER, false);
    }

    public void setReOrderDesignVariantId(int variantId) {
        getInstance().setInt(PREF_REORDER_DESIGN_EXPERIMENT_ID, variantId);
    }

    public int getReOrderDesignVariantId() {
        return getInstance().getInt(PREF_REORDER_DESIGN_EXPERIMENT_ID, 0);
    }


    public void setPillReminderVariantId(int variantId) {
        getInstance().setInt(PREF_PILL_REMINDER_VARIANT_ID, variantId);
    }

    public int getPillReminderVariantId() {
        return getInstance().getInt(PREF_PILL_REMINDER_VARIANT_ID, -1);
    }


    public void setProcessingFeeVariantId(int processingFeeId) {
        getInstance().setInt(PREF_PROCESSING_FEE_VARIANT_ID, processingFeeId);
    }

    public int getProcessingFeeVariantId() {
        return getInstance().getInt(PREF_PROCESSING_FEE_VARIANT_ID, -1);
    }

    public void setCreditRewardVariant(String creditReward) {
        getInstance().setString(PREF_CREDIT_REWARD_VARIANT, creditReward);
    }

    public String getCreditRewardVariant() {
        return getInstance().getString(PREF_CREDIT_REWARD_VARIANT, "A");
    }

    public void setDefaultPaymentMode(String paymentMode) {
        getInstance().setString(PREF_DEFAULT_PAYMENT_MODE, paymentMode);
    }

    public String getDefaultPaymentMode() {
        return getInstance().getString(PREF_DEFAULT_PAYMENT_MODE, "");
    }

    public void setDefaultPaymentModeId(int paymentModeId) {
        getInstance().setInt(PREF_DEFAULT_PAYMENT_MODE_ID, paymentModeId);
    }

    public int getDefaultPaymentModeId() {
        return getInstance().getInt(PREF_DEFAULT_PAYMENT_MODE_ID, -1);
    }

    public void setCreditRewardVariantId(int creditRewardVariantId) {
        getInstance().setInt(PREF_CREDIT_REWARD_VARIANT_ID, creditRewardVariantId);
    }

    public int getCreditRewardVariantId() {
        return getInstance().getInt(PREF_CREDIT_REWARD_VARIANT_ID, -1);
    }

    public void setVideoOnOrderStatus(String status) {
        getInstance().setString(PREF_VIDEO_ORDER_STATUS, status);
    }

    public String getVideoOnOrderStatus() {
        return getInstance().getString(PREF_VIDEO_ORDER_STATUS, "");
    }

    public void setVideoOnOrderStatusId(int statusId) {
        getInstance().setInt(PREF_VIDEO_ORDER_STATUS_ID, statusId);
    }

    public int getVideoOnOrderStatusId() {
        return getInstance().getInt(PREF_VIDEO_ORDER_STATUS_ID, -1);
    }

    /*public int getReorderCategoryId() {
        return getInstance().getInt(REORDER_CATEGORY_ID, -1);
    }

    public void setReorderCategoryId(int categoryId) {
        getInstance().setInt(REORDER_CATEGORY_ID, categoryId);
    }*/


    public void setReOrderCategory(String category) {
        getInstance().setString(PREF_REORDER_CATEGORY, category);
    }

    public String getReOrderCategory() {
        return getInstance().getString(PREF_REORDER_CATEGORY, "");
    }

    public void setReferrerData(String referrerData) {
        getInstance().setString(REFERRER_DATA, referrerData);
    }

    public String getReferrerData() {
        return getInstance().getString(REFERRER_DATA, "");
    }

    public String getSelectedCity() {
        return getInstance().getString(SELECTED_CITY, "");
    }

    public void setSelectedCity(String city) {
        getInstance().setString(SELECTED_CITY, city);
    }

    public String getSelectedState() {
        return getInstance().getString(SELECTED_STATE, "");
    }

    public void setSelectedState(String city) {
        getInstance().setString(SELECTED_STATE, city);
    }

    /*public String getSelectedPincode() {
        return getInstance().getString(SELECTED_PINCODE, "");
    }

    public void setSelectedPincode(String pincode) {
        getInstance().setString(SELECTED_PINCODE, pincode);
    }*/

    public String getSelectedWarehouseID() {
        return getInstance().getString(SELECTED_WAREHOUSEID, "");
    }

    public void setSelectedWarehouseID(String warehouseID) {
        getInstance().setString(SELECTED_WAREHOUSEID, warehouseID);
    }

    public String getAddress() {
        return getInstance().getString(PREF_ORDER_ADDRESS, "");
    }

    public void setAddress(String address) {
        getInstance().setString(PREF_ORDER_ADDRESS, address);
    }

    public String getEdd() {
        return getInstance().getString(PREF_EDD, null);
    }

    public void setEdd(String edd) {
        getInstance().setString(PREF_EDD, edd);
    }

    public String getMyMedicine() {
        return getInstance().getString(PREF_MY_MEDICINE_LIST, null);
    }

    public void setMyMedicine(String medicineList) {
        getInstance().setString(PREF_MY_MEDICINE_LIST, medicineList);
    }

    public String getShareLink() {
        return getInstance().getString(PREF_SHARE_LINK, null);
    }

    public void setShareLink(String link) {
        getInstance().setString(PREF_SHARE_LINK, link);
    }

    public String getPrefShareReferCode() {
        return getInstance().getString(PREF_SHARE_REFER_CODE, null);
    }

    public void setPrefShareReferCode(String code) {
        getInstance().setString(PREF_SHARE_REFER_CODE, code);
    }

    public long getIncompleteOrderId() {
        long val = 0L;
        try {
            val = getInstance().getLong(PREF_IS_INCOMPLETE_ORDER_ID, 0L);
        } catch (Exception e) {
            val = getInstance().getInt(PREF_IS_INCOMPLETE_ORDER_ID);
        }
        return val;
    }

    public void setIncompleteOrderId(long incompleteOrderId) {
        getInstance().setLong(PREF_IS_INCOMPLETE_ORDER_ID, incompleteOrderId);
        if (incompleteOrderId <= 0) {
            resetCurrentOrderAmount();
            SharedPrefManager.getInstance().setIsReOder(false);
        }
    }

    /*public void setIfNewUser(boolean value) {
        getInstance().setBoolean(IS_NEW_USER, value);
    }

    public boolean isNewUser() {
        return getInstance().getBoolean(IS_NEW_USER, false);
    }*/

    public int getPincode() {
        return getInstance().getInt(LAST_SELECTED_PINCODE, 0);
    }

    public void setPincode(int pincode) {
        getInstance().setInt(LAST_SELECTED_PINCODE, pincode);
    }
    public Boolean getNewSelectedPinCode() {
        return getInstance().getBoolean(NEW_SELECTED_PINCODE, false);
    }

    public void setNewSelectedPinCode(Boolean pincode) {
        getInstance().setBoolean(NEW_SELECTED_PINCODE, pincode);
    }


    public int getCxAcceptedCount() {
        return getInstance().getInt(CX_ACCEPTED_COUNT, 0);
    }

    public void setCxAcceptedCount(int pincode) {
        getInstance().setInt(CX_ACCEPTED_COUNT, pincode);
    }

    public int getDeliveryOnAmount() {
        return getInstance().getInt(DELIVERY_ON_AMOUNT, 0);
    }

    public void setDeliveryOnAmount(int deliveryOnAmount) {
        getInstance().setInt(DELIVERY_ON_AMOUNT, deliveryOnAmount);
    }

    public int getDeliveryCharge() {
        return getInstance().getInt(DELIVERY_CHARGE, 0);
    }

    public void setDeliveryCharge(int deliveryCharges) {
        getInstance().setInt(DELIVERY_CHARGE, deliveryCharges);
    }

    public int getDeliveryOnAmountSubs() {
        return getInstance().getInt(DELIVERY_ON_AMOUNT_SUBS, 0);
    }

    public void setDeliveryOnAmountSubs(int deliveryOnAmount) {
        getInstance().setInt(DELIVERY_ON_AMOUNT_SUBS, deliveryOnAmount);
    }

    public int getDeliveryChargeSubs() {
        return getInstance().getInt(DELIVERY_CHARGE_SUBS, 0);
    }

    public void setDeliveryChargeSubs(int deliveryCharges) {
        getInstance().setInt(DELIVERY_CHARGE_SUBS, deliveryCharges);
    }

    public int getBaseDiscount() {
        return getInstance().getInt(BASE_DISCOUNT, 0);
    }

    public void setBaseDiscount(int baseDiscount) {
        getInstance().setInt(BASE_DISCOUNT, baseDiscount);
    }


    public String getRedirectionPageName() {
        return getInstance().getString(REDIRECTION_PAGE_NAME, null);
    }

    public void setRedirectionPageName(String pageName) {
        getInstance().setString(REDIRECTION_PAGE_NAME, pageName);
    }

    public void updateCrossSellingProductsIds(Set<String> list) {
        getInstance().setList(CROSS_SELLING_PRODUCT_IDS, list);
    }

    public Set<String> getCrossSellingProductList() {
        return getInstance().getSetData(CROSS_SELLING_PRODUCT_IDS);
    }

    /*public void updateCouponDetails(String couponCodeId, String couponCode, String percentageSaving, int minCartValue, String paymentMode, int couponTypeId,
                                    int maxCartValue, String discountTypeValue, String offerId, String cashbackValue, int cashbackActiveAfter,
                                    int cashbackValidTill, long couponValidity, String description, String paymentMethod, Long paymentMethodId, String paymentMethodIconUrl) {
        getInstance().setString(COUPON_ID, couponCodeId);
        getInstance().setString(COUPON_CODE, couponCode);
        getInstance().setString(COUPON_SAVING_PERCENTAGE, percentageSaving);
        getInstance().setInt(COUPON_MIN_CART_VALUE, minCartValue);
        getInstance().setString(COUPON_PAYMENT_MODE, paymentMode);
        getInstance().setInt(COUPON_TYPE_ID, couponTypeId);
        getInstance().setInt(COUPON_MAX_CART_VALUE, maxCartValue);
        getInstance().setString(COUPON_DISCOUNT_TYPE_VALUE, discountTypeValue);
        getInstance().setString(OFFER_ID, offerId);
        getInstance().setString(CASHBACK_VALUE, cashbackValue);
        getInstance().setInt(CASHBACK_ACTIVE_AFTER, cashbackActiveAfter);
        getInstance().setInt(CASHBACK_VALID_TILL, cashbackValidTill);
        getInstance().setLong(COUPON_VALIDITY, couponValidity);
        getInstance().setString(COUPON_DESCRIPTION, description);
        getInstance().setString(COUPON_PAYMENT_METHOD, paymentMethod);
        getInstance().setLong(COUPON_PAYMENT_METHOD_ID, paymentMethodId);
        getInstance().setString(COUPON_PAYMENT_METHOD_ICON_URL, paymentMethodIconUrl);
    }*/

    public void setCouponModel(CouponCodeResponse.Coupon couponModel) {
        getInstance().setString(COUPON_MODEL, new Gson().toJson(couponModel));
    }

    public CouponCodeResponse.Coupon getCouponModel() {
        String couponString = getInstance().getString(COUPON_MODEL, "");
        if (couponString.equals("")) return null;
        else return new Gson().fromJson(couponString, CouponCodeResponse.Coupon.class);
    }

    public CouponCodeDataModel getSessionCouponModel() {
        try {
            double cashbackValue;
            long paymentMethodId = -1L;
            String paymentMethod, paymentMethodIconUrl;
            try {
                cashbackValue = Double.parseDouble(getInstance().getString(CASHBACK_VALUE));
                paymentMethod = getInstance().getString(COUPON_PAYMENT_METHOD);
                paymentMethodId = getInstance().getLong(COUPON_PAYMENT_METHOD_ID);
                paymentMethodIconUrl = getInstance().getString(COUPON_PAYMENT_METHOD_ICON_URL);
            } catch (Exception ex) {
                cashbackValue = 0;
                paymentMethodId = -1L;
                paymentMethod = "";
                paymentMethodIconUrl = "";
            }

            return new CouponCodeDataModel(getInstance().getString(COUPON_CODE), "",
                    "",
                    getInstance().getString(COUPON_DESCRIPTION),
                    getInstance().getString(COUPON_ID),
                    getInstance().getLong(COUPON_VALIDITY),
                    true,
                    true,
                    Integer.parseInt(getInstance().getString(COUPON_SAVING_PERCENTAGE)),
                    getInstance().getString(COUPON_PAYMENT_MODE),
                    getInstance().getInt(COUPON_MIN_CART_VALUE),
                    getInstance().getInt(COUPON_TYPE_ID), "", "",
                    getInstance().getString(COUPON_DISCOUNT_TYPE_VALUE),
                    getInstance().getInt(COUPON_MAX_CART_VALUE),
                    getInstance().getString(OFFER_ID), "", cashbackValue,
                    getInstance().getInt(CASHBACK_ACTIVE_AFTER, 0),
                    getInstance().getInt(CASHBACK_VALID_TILL, 0), false, false, "", "", "", paymentMethod, paymentMethodId, paymentMethodIconUrl);
        } catch (Exception ex) {
            return null;
        }
    }

    /*public void setTmRecommendBottomSheetOpened(boolean b) {
        getInstance().setBoolean(TM_RECOMMEND_BS_OPENED, b);
    }

    public boolean getTmRecommendBottomSheetOpened() {
        return getInstance().getBoolean(TM_RECOMMEND_BS_OPENED, false);
    }*/


    public String getCouponCode() {
        return getInstance().getString(COUPON_CODE, null);
    }

    @NonNull
    public String getCouponPaymentMethod() {
        return getInstance().getString(COUPON_PAYMENT_METHOD, "");
    }

    @NonNull
    public Long getCouponPaymentMethodId() {
        return getInstance().getLong(COUPON_PAYMENT_METHOD_ID, -1);
    }

    @NonNull
    public String getCouponPaymentMethodIconUrl() {
        return getInstance().getString(COUPON_PAYMENT_METHOD_ICON_URL, "");
    }

    public void setSelectedPaymentMethod(@NonNull String method) {
        getInstance().setString(SELECTED_PAYMENT_METHOD, method);
    }

    @NonNull
    public String getSelectedPaymentMethod() {
        return getInstance().getString(SELECTED_PAYMENT_METHOD, "");
    }

    public void setSelectedPaymentMethodId(@NonNull Long method) {
        getInstance().setLong(SELECTED_PAYMENT_METHOD_ID, method);
    }

    @NonNull
    public Boolean getIsPaymentSpecificCouponApplied() {
        return getInstance().getBoolean(IS_PAYMENT_SPECIFIC_COUPON_APPLIED, false);
    }

    public void setIsPaymentSpecificCouponApplied(@NonNull Boolean isPaymentSpecificCouponApplied) {
        getInstance().setBoolean(IS_PAYMENT_SPECIFIC_COUPON_APPLIED, isPaymentSpecificCouponApplied);
    }

    @NonNull
    public Long getSelectedPaymentMethodId() {
        return getInstance().getLong(SELECTED_PAYMENT_METHOD_ID, -1);
    }

    public void setSelectedPaymentMethodIconUrl(@NonNull String url) {
        getInstance().setString(SELECTED_PAYMENT_METHOD_ICON_URL, url);
    }

    @NonNull
    public String getSelectedPaymentMethodIconUrl() {
        return getInstance().getString(SELECTED_PAYMENT_METHOD_ICON_URL, "");
    }

    public String getCouponId() {
        return getInstance().getString(COUPON_ID, null);
    }

    public String getOfferId() {
        return getInstance().getString(OFFER_ID, "0");
    }

    public void setOfferId(String offerId) {
        getInstance().setString(OFFER_ID, offerId);
    }

    /*public String getCouponSavingPercentage() {
        return getInstance().getString(COUPON_SAVING_PERCENTAGE, null);
    }

    public int getCouponMinCartValue() {
        return getInstance().getInt(COUPON_MIN_CART_VALUE, 0);
    }*/

    public String getCouponPaymentMode() {
        return getInstance().getString(COUPON_PAYMENT_MODE, null);
    }

    public int getCouponTypeId() {
        return getInstance().getInt(COUPON_TYPE_ID, 0);
    }

    public void updateLoggedInUserDetails(String mobileNumber, String accessToken, String email, String profileImageUrl, String name, String gender, String age, String customerId, int langyuageId) {
        getInstance().setUserAccessToken(accessToken);
        getInstance().setUserMobile(mobileNumber);
        getInstance().setUserEmail(email);
        getInstance().setUserProfileImageUrl(profileImageUrl);
        getInstance().setUserName(name);
        getInstance().setCurrentUserGender(gender);
        getInstance().setCurrentUserAge(age);
        getInstance().setUserId(customerId);
        getInstance().setAppLang(langyuageId);
    }

    public void clearLoggedInUserDetails() {
        /*getInstance().setUserAccessToken(null);
        getInstance().setUserMobile(null);
        getInstance().setUserEmail(null);
        getInstance().setUserProfileImageUrl(null);
        getInstance().setUserName(null);
        getInstance().setCurrentUserGender(null);
        getInstance().setCurrentUserAge(null);
        getInstance().setUserId(null);
        getInstance().setReferryFullName(null);
        getInstance().setReferryId(null);
        getInstance().setAddress(null);
        getInstance().setEdd(null);
        getInstance().setLastVisitedPage(null);
        getInstance().setIncompleteOrderId(0);
        getInstance().setMyMedicine(null);
        getInstance().setShareLink(null);
        getInstance().setNotification(false);
        saveFcm(null);
        setIfNewUser(false);
        setDeviceDataSent(false);
        setSelectedWarehouseID("");*/
        getInstance().getEditor().clear().commit();
    }

    public int getMaximumApiResponseTimeToPutLog() {
        return getInstance().getInt(MAXIMUM_API_RESPONSE_TIME_TO_PUT_LOG, 10);
    }

    public void setMaximumApiResponseTimeToPutLog(int delayTimeInSecs) {
        getInstance().setInt(MAXIMUM_API_RESPONSE_TIME_TO_PUT_LOG, delayTimeInSecs);
    }

    public void setRefreshOrder(boolean b) {
        getInstance().setBoolean(REFRESH_ORDERS, b);
    }

    public boolean getRefreshOrder() {
        return getInstance().getBoolean(REFRESH_ORDERS, false);
    }

    public boolean getColdChainDeliverable() {
        return getInstance().getBoolean(COLD_CHAIN_DELIVERABLE, true);
    }

    public void setColdChainDeliverable(boolean isDeliverable) {
        getInstance().setBoolean(COLD_CHAIN_DELIVERABLE, isDeliverable);
    }

    public void setCustomerCareNumber(String number) {
        getInstance().setString(CUSTOMER_CARE_NUMBER, number);
    }

    public String getCustomerCareNumber() {
        return getInstance().getString(CUSTOMER_CARE_NUMBER, "8069808861");
    }

    public void setSupportEmailId(String number) {
        getInstance().setString(SUPPORT_EMAIL_ID, number);
    }

    public String getSupportEmailId() {
        return getInstance().getString(SUPPORT_EMAIL_ID, "support@truemeds.in");
    }

    public void setSrcType(long number) {
        getInstance().setLong("SRC_TYPE", number);
    }

    public Long getSrcType() {
        return getInstance().getLong("SRC_TYPE", 302);
    }

    public void setOrderEditedInMyOrders(boolean b) {
        getInstance().setBoolean(MY_ORDER_REFRESH, b);
    }

    public boolean getOrderEditedInMyOrders() {
        return getInstance().getBoolean(MY_ORDER_REFRESH, false);
    }

    public void setLoggedInFromBottomSheet(boolean b) {
        getInstance().setBoolean(PREF_LOGGED_IN_FROM_BOTTOMSHEET, b);
    }

    public boolean isLoggedInFromBottomSheet() {
        return getInstance().getBoolean(PREF_LOGGED_IN_FROM_BOTTOMSHEET, false);
    }

    public void setCurrentOrderAmountDetails(float tmCash, float tmCredit, float deliveryCharge,
                                             float couponCode, float packageCharge, float apiFinalCalc,  float couponDiscountAmtEvent, float discountEvent,float mrpEvent) {
        getInstance().setFloat(PREF_CURRENT_ORDER_TM_CASH, tmCash);
        getInstance().setFloat(PREF_CURRENT_ORDER_TM_CREDIT, tmCredit);
        getInstance().setFloat(PREF_CURRENT_ORDER_DELIVERY_CHARGE, deliveryCharge);
        getInstance().setFloat(PREF_CURRENT_ORDER_COUPON_CHARGE, couponCode);
        getInstance().setFloat(PREF_CURRENT_ORDER_PACKAGE_CHARGE, packageCharge);
        getInstance().setFloat(PREF_API_FINAL_CALC_PAYABLE, apiFinalCalc);
        getInstance().setFloat(PREF_COUPON_DISCOUNT_AMT_EVENT, couponDiscountAmtEvent); //event required extra parameters
        getInstance().setFloat(PREF_DISCOUNT_EVENT, discountEvent);
        getInstance().setFloat(PREF_MRP_EVENT, mrpEvent);

        //getInstance().
    }

    public HashMap<String, Float> getCurrentOrderAmountDetails() {
        HashMap<String, Float> map = new HashMap<>();

        float cash = getInstance().getFloat(PREF_CURRENT_ORDER_TM_CASH);
        float credit = getInstance().getFloat(PREF_CURRENT_ORDER_TM_CREDIT);
        float delivery = getInstance().getFloat(PREF_CURRENT_ORDER_DELIVERY_CHARGE);
        float packageCharge = getInstance().getFloat(PREF_CURRENT_ORDER_PACKAGE_CHARGE);
        float couponCharge = getInstance().getFloat(PREF_CURRENT_ORDER_COUPON_CHARGE);
        float apiFinalCalc = getInstance().getFloat(PREF_API_FINAL_CALC_PAYABLE);
        float couponDiscountAmtEvent = getInstance().getFloat(PREF_COUPON_DISCOUNT_AMT_EVENT);  //event required extra parameters
        float discountEvent = getInstance().getFloat(PREF_DISCOUNT_EVENT);
        float mrpEvent = getInstance().getFloat(PREF_MRP_EVENT);


        map.put(PREF_CURRENT_ORDER_TM_CASH, cash);
        map.put(PREF_CURRENT_ORDER_TM_CREDIT, credit);
        map.put(PREF_CURRENT_ORDER_DELIVERY_CHARGE, delivery);
        map.put(PREF_CURRENT_ORDER_PACKAGE_CHARGE, packageCharge);
        map.put(PREF_CURRENT_ORDER_COUPON_CHARGE, couponCharge);
        map.put(PREF_API_FINAL_CALC_PAYABLE, apiFinalCalc);
        map.put(PREF_COUPON_DISCOUNT_AMT_EVENT, couponDiscountAmtEvent);
        map.put(PREF_DISCOUNT_EVENT, discountEvent);
        map.put(PREF_MRP_EVENT, mrpEvent);

        return map;
    }

    public void resetCurrentOrderAmount() {
        getInstance().setFloat(PREF_CURRENT_ORDER_TM_CASH, 0f);
        getInstance().setFloat(PREF_CURRENT_ORDER_TM_CREDIT, 0f);
        getInstance().setFloat(PREF_CURRENT_ORDER_DELIVERY_CHARGE, 0f);
        getInstance().setFloat(PREF_CURRENT_ORDER_COUPON_CHARGE, 0f);
        getInstance().setFloat(PREF_CURRENT_ORDER_PACKAGE_CHARGE, 0f);
        getInstance().setFloat(PREF_API_FINAL_CALC_PAYABLE, 0f);
        getInstance().setBoolean(PREF_IS_AUTO_REPLACE, false);

    }

    /*public String getOrderPatientRelationship() {
        return getInstance().getString(PREF_ORDER_PATIENT_RELATION, "");
    }

    public void setOrderPatientRelationship(String relationshipName) {
        getInstance().setString(PREF_ORDER_PATIENT_RELATION, relationshipName);
    }*/

    public void setReOrderClickedOnPage(String clickedOnPage) {
        SharedPrefManager.getInstance().setString(PREF_REORDER_CLICKED_ON_PAGE, clickedOnPage);
    }

    public String getReOrderClickedOnPage() {
        return getInstance().getString(PREF_REORDER_CLICKED_ON_PAGE, "");
    }

    public void setReOrderPreviousStage(String previousStage) {
        SharedPrefManager.getInstance().setString(PREF_REORDER_PREVIOUS_STAGE, previousStage);
    }

    public String getReOrderPreviousStage() {
        return getInstance().getString(PREF_REORDER_PREVIOUS_STAGE, "");
    }

    public void setIsAddressPatientAddedInflow(boolean value) {
        SharedPrefManager.getInstance().setBoolean(PREF_IS_ADDRESS_PATIENT_ADDED_INFLOW, value);
    }

    public boolean isAddressPatientAddedInflow() {
        return getInstance().getBoolean(PREF_IS_ADDRESS_PATIENT_ADDED_INFLOW, false);
    }

    public void setDBMigrationCompleted(boolean value) {
        SharedPrefManager.getInstance().setBoolean(PERF_DB_MIGRATION_COMPLETED, value);
    }

    public boolean isDBMigrationCompleted() {
        return getInstance().getBoolean(PERF_DB_MIGRATION_COMPLETED, false);
    }

    public void setTraditionalBaseDiscountVariantId(long categoryId) {
        getInstance().setLong(PREF_TRADITIONAL_BASE_DISCOUNT_VARIANT_ID, categoryId);
    }

    public long getTraditionalBaseDiscountVariantId() {
        return getInstance().getLong(PREF_TRADITIONAL_BASE_DISCOUNT_VARIANT_ID, -1L);
    }

    public void setAlgoSpecificVariantId(long categoryId) {
        getInstance().setLong(PREF_ALGO_SPECIFIC_VARIANT_ID, categoryId);
    }

    public Long getAlgoSpecificVariantId() {
        return getInstance().getLong(PREF_ALGO_SPECIFIC_VARIANT_ID, -1L);
    }

    public void setFirebaseAppInstanceId(String fcm) {
        getInstance().setString(FIREBASE_APP_INSTANCE_ID, fcm);
    }

    public String getFirebaseAppInstanceId() {
        return getInstance().getString(FIREBASE_APP_INSTANCE_ID, "");
    }

    public void setAutoReplaced(boolean flag) {
        getInstance().setBoolean(PREF_IS_AUTO_REPLACE, flag);
    }

    public boolean getAutoReplaced() {
        return getInstance().getBoolean(PREF_IS_AUTO_REPLACE, false);
    }

    public void setActiveOrderCount(int activeOrderCount) {
        getInstance().setInt(ACTIVE_ORDER_COUNT, activeOrderCount);
    }

    public int getActiveOrderCount() {
        return getInstance().getInt(ACTIVE_ORDER_COUNT);
    }

    public void setDeliveredOrderCount(int deliveredOrderCount) {
        getInstance().setInt(DELIVERED_ORDER_COUNT, deliveredOrderCount);
    }

    public int getDeliveredOrderCount() {
        return getInstance().getInt(DELIVERED_ORDER_COUNT);
    }

    public void setContactSheetClosed(boolean isClosed) {
        getInstance().setBoolean(PREF_CONTACT_BS_CLOSED, isClosed);
    }
    public boolean isContactSheetClosed() {
        return getInstance().getBoolean(PREF_CONTACT_BS_CLOSED, false);
    }

    public void setFtcCouponExpiryTime(long time) {
        getInstance().setLong(PREF_FTC_Coupon_Expiry_Time, time);
    }

    public long getFtcCouponExpiryTime() {
        return getInstance().getLong(PREF_FTC_Coupon_Expiry_Time, 0L);
    }
    
    public void setIsUserSkippedReplace(Boolean name) {
        getInstance().setBoolean(PREF_IS_USER_SKIPPED_REPLACE, name);
    }
    
    public Boolean getIsUserSkippedReplace() {
        return getInstance().getBoolean(PREF_IS_USER_SKIPPED_REPLACE, false);
    }

    public void setCouponDiscount(Float discount) {
        getInstance().setFloat(PREF_CURRENT_ORDER_COUPON_CHARGE, discount);
    }
    public Float getCouponDiscount() {
        return getInstance().getFloat(PREF_CURRENT_ORDER_COUPON_CHARGE, 0f);

    }
    public Long getRatingOrderIdSkipFlag() {
        return getInstance().getLong(RATING_ORDER_ID_SKIP, 0L);
    }

    public void setRatingOrderIdSkipFlag(Long orderId) {
        getInstance().setLong(RATING_ORDER_ID_SKIP, orderId);
    }

    public void setDeviceID(String name) {
        getInstance().setString(ANDROID_DEVICE_ID, name);
    }

    public String getDeviceID() {
        return getInstance().getString(ANDROID_DEVICE_ID, "");
    }
}