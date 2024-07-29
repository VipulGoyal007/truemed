package com.intellihealth.truemeds.domain.usecase.analytics

import android.os.Bundle
import androidx.core.os.bundleOf
import com.google.firebase.analytics.FirebaseAnalytics
import com.intellihealth.truemeds.presentation.analytics.FirebaseEvent
import com.intellihealth.truemeds.presentation.analytics.model.firebase.FbHomePageHealthArticle
import com.intellihealth.truemeds.presentation.analytics.model.firebase.FbPurchaseEvent
import com.intellihealth.truemeds.presentation.analytics.model.firebase.FbReplaceAllToSubstitute
import com.intellihealth.truemeds.presentation.analytics.model.firebase.FbSubsView
import com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.applyTryCatch
import javax.inject.Inject


class FirebaseEventUseCase @Inject constructor(private val firebaseEvent: FirebaseEvent) {

    /*fun errorTracking(fbErrorTracking: FbErrorTracking) {
        val params = Bundle()
        params.putString("deviceTag", fbErrorTracking.deviceTag)
        params.putString("screen", fbErrorTracking.screen)
        params.putString("errorLog", fbErrorTracking.errorLog)
        params.putString("manufacturer", fbErrorTracking.manufacturer)
        params.putString("model", fbErrorTracking.model)
        params.putString("apiLevel", fbErrorTracking.apiLevel)
        params.putString("dateTime", fbErrorTracking.dateTime)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_ERROR_TRACKING, params)
    }*/

    fun orderSummaryConfirmOrder(ftPurchaseEvent: FbPurchaseEvent) = applyTryCatch {
        val bundle = Bundle()
        bundle.putString("customer_id", ftPurchaseEvent.customerId)
        bundle.putString("order_id", ftPurchaseEvent.orderId)
        bundle.putString(FirebaseAnalytics.Param.CURRENCY, "INR")
        bundle.putDouble(FirebaseAnalytics.Param.VALUE, ftPurchaseEvent.estimatedPayableAmount)
        firebaseEvent.logFirebasePurchaseEvent(bundle)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_ORDER_SUMMARY_CONFIRM_ORDER, bundle)
    }

    fun loginResendOtp(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("page_name", firebaseEventModel.pageName!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_LOGIN_RESEND_OTP, params)
    }

    fun registrationMobileNoEdit(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("page_name", firebaseEventModel.pageName!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_REGISTRATION_MOBILE_NO_EDIT, params)
    }

    fun loginMobileNoEdit(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = bundleOf(
            "mobile" to firebaseEventModel.mobile,
            "page_name" to firebaseEventModel.pageName
        )
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_LOGIN_MOBILE_NO_EDIT, params)
    }

    fun homePageUploadPrescription(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_HOMEPAGE_UPLOAD_PRESCRIPTION, params)
    }

    fun homePageCallToOrder(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        params.putString("callUsNumber", firebaseEventModel.callUsNumber)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_HOMEPAGE_CALL_TO_ORDER, params)
    }

    fun homePageHealthArticle(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_HOMEPAGE_HEALTH_ARTICLES, params)
    }

    fun homePageSearch(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_HOMEPAGE_SEARCH, params)
    }

    fun homePageReorderCard(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_HOMEPAGE_REORDER_CARD, params)
    }

    fun homePageExample(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        params.putString("page_name", firebaseEventModel.pageName!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_HOMEPAGE_EXAMPLE, params)
    }

    fun homePageLocation(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        params.putString("page_name", firebaseEventModel.pageName!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_HOMEPAGE_LOCATION, params)
    }

    fun homePageViewed(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        /*params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        params.putString("page_name", firebaseEventModel.pageName!!)
        params.putString("exp_id", firebaseEventModel.expId!!)
        params.putInt("variant_id", firebaseEventModel.variantId!!)*/
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_HOMEPAGE_VIEWED, params)
    }

    fun homePageNav(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_HOMEPAGE_NAV, params)
    }

    fun tmWalletTransactionDate(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        params.putString("page_name", firebaseEventModel.pageName!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_TM_WALLET_TRANSACTION_DATE, params)
    }

    fun tmRewardsFaqsViewMore(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        params.putString("page_name", firebaseEventModel.pageName!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_TM_REWARDS_FAQS_VIEW_MORE, params)
    }

    fun tmCreditsFaqsViewMore(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        params.putString("page_name", firebaseEventModel.pageName!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_TM_CREDIT_FAQ_VIEW_MORE, params)
    }

    fun tmWalletFaqsViewMore(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        params.putString("page_name", firebaseEventModel.pageName!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_TM_WALLET_FAQS_VIEW_MORE, params)
    }

    fun tmRewardsFaqs(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        params.putString("page_name", firebaseEventModel.pageName!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_TM_REWARDS_FAQS, params)
    }

    fun tmWalletReferAndEarn(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        params.putString("page_name", firebaseEventModel.pageName!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_TM_WALLET_REFER_AND_EARN, params)
    }

    fun tmWalletBack(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        params.putString("page_name", firebaseEventModel.pageName!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_TM_WALLET_BACK, params)
    }

    fun tmWalletFaqs(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        params.putString("page_name", firebaseEventModel.pageName!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_TM_WALLET_FAQS, params)
    }

    fun tmCreditsFaqs(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        params.putString("page_name", firebaseEventModel.pageName!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_TM_CREDIT_FAQS, params)
    }

    fun tmRewardsBack(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        params.putString("page_name", firebaseEventModel.pageName!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_TM_REWARDS_BACK, params)
    }

    fun tmCreditBack(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        params.putString("page_name", firebaseEventModel.pageName!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_TM_CREDIT_BACK, params)
    }

    fun cartRemoveCoupon(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_CART_REMOVE_COUPON, params)
    }

    fun locationEnterPinCode(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_LOCATION_ENTER_PIN_CODE, params)
    }

    fun delayInApiResponse(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("url", firebaseEventModel.url!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_DELAY_IN_API_RESPONSE, params)
    }

    fun error400(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("url", firebaseEventModel.url!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_ERROR400, params)
    }

    fun error401(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("url", firebaseEventModel.url!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_ERROR401, params)
    }

    fun error403(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("url", firebaseEventModel.url!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_ERROR403, params)
    }

    fun error500(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("url", firebaseEventModel.url!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_ERROR500, params)
    }

    fun apiFailure(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("url", firebaseEventModel.url!!)
        params.putString("message", firebaseEventModel.url!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_API_FAILURE, params)
    }

    fun pdpViewed(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        params.putInt("variant_id", firebaseEventModel.variantId!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_PDP_VIEWED, params)
    }

    fun uploadPrescriptionCamera(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_UPLOAD_PRESCRIPTION_CAMERA, params)
    }

    fun uploadPrescriptionUpload(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        params.putString("page_name", firebaseEventModel.pageName!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_UPLOAD_PRESCRIPTION_UPLOAD, params)
    }

    fun orderPrescriptionUploaded(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        params.putString("page_name", firebaseEventModel.pageName!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_ORDER_PRESCRIPTION_UPLOADED, params)
    }

    fun uploadPrescriptionPrescriptionSelected(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        params.putString("page_name", firebaseEventModel.pageName!!)
        firebaseEvent.logFirebaseEvent(
            FirebaseEvent.FIREBASE_UPLOAD_PRESCRIPTION_PRESCRIPTION_SELECTED,
            params
        )
    }

    fun registrationMobileNo(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)

        if (!firebaseEventModel.customerId.equals("0"))
            params.putString("customer_id", firebaseEventModel.customerId!!)

        params.putString("page_name", firebaseEventModel.pageName!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_REGISTRATION_MOBILE_NO, params)
    }

    fun searchViewCart(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        params.putString("page_name", firebaseEventModel.pageName!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_SEARCH_VIEW_CART, params)
    }

    fun updateProfileSave(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        params.putString("page_name", firebaseEventModel.pageName!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_UPDATE_PROFILE_SAVE, params)
    }

    fun substituteDropdownClosed(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        params.putInt("variant_id", firebaseEventModel.variantId!!)
        params.putString("page_name", firebaseEventModel.pageName!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_SUBSTITUTE_DROPDOWN_CLOSED, params)
    }

    fun substituteDropdownViewed(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        params.putInt("variant_id", firebaseEventModel.variantId!!)
        params.putString("page_name", firebaseEventModel.pageName!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_SUBSTITUTE_DROPDOWN_VIEWED, params)
    }

    fun pdPageSubView(fbSubsView: FbSubsView) = applyTryCatch {
        val params = Bundle()
        params.putDouble("product_selling_price", fbSubsView.productSellingPrice!!)
        params.putDouble("product_mrp", fbSubsView.productMrp!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_PD_PAGE_SUB_VIEW, params)
    }

    fun pdPageSubsPd(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        params.putString("page_name", firebaseEventModel.pageName!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_PD_PAGE_SUBS_PD, params)
    }

    fun pdPageIntroduction(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        params.putString("product_code", firebaseEventModel.productCode!!)
        params.putString("product_name", firebaseEventModel.productName!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_PD_PAGE_INTRODUCTION, params)
    }

    fun pdPageMedicineActivity(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        params.putString("product_code", firebaseEventModel.productCode!!)
        params.putString("product_name", firebaseEventModel.productName!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_PD_PAGE_MEDICINE_ACTIVITY, params)
    }

    fun pdPageUese(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        params.putString("product_code", firebaseEventModel.productCode!!)
        params.putString("product_name", firebaseEventModel.productName!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_PD_PAGE_USES, params)
    }

    fun pdPageDirectionsForUse(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        params.putString("product_code", firebaseEventModel.productCode!!)
        params.putString("product_name", firebaseEventModel.productName!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_PD_PAGE_DIRECTIONS_FOR_USE, params)
    }

    fun pdPageSideEffects(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = bundleOf("mobile" to firebaseEventModel.mobile,
            "customer_id" to firebaseEventModel.customerId,
            "product_code" to firebaseEventModel.productCode,
            "product_name" to firebaseEventModel.productName,
            )
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_PD_PAGE_SIDE_EFFECTS, params)
    }

    fun pdPageAdditionalInformation(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        params.putString("product_code", firebaseEventModel.productCode!!)
        params.putString("product_name", firebaseEventModel.productName!!)
        firebaseEvent.logFirebaseEvent(
            FirebaseEvent.FIREBASE_PD_PAGE_ADDITIONAL_INFORMATION,
            params
        )
    }

    fun pdPageSearch(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        params.putString("page_name", firebaseEventModel.pageName!!)
        params.putInt("variant_id", firebaseEventModel.variantId!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_PD_PAGE_SEARCH, params)
    }

    fun pdPageCart(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        params.putString("product_code", firebaseEventModel.productCode!!)
        params.putString("product_name", firebaseEventModel.productName!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_PD_PAGE_CART, params)
    }

    fun pdPageViewCart(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        params.putString("product_code", firebaseEventModel.productCode!!)
        params.putString("product_name", firebaseEventModel.productName!!)
        params.putInt("variant_id", firebaseEventModel.variantId!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_PD_PAGE_VIEW_CART, params)
    }

    fun pdPageSubsAdd(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        params.putString("product_code", firebaseEventModel.productCode!!)
        params.putString("product_name", firebaseEventModel.productName!!)
        params.putInt("variant_id", firebaseEventModel.variantId!!)
        params.putString("orgPackSize", firebaseEventModel.orgPackSize!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_PD_PAGE_SUBS_ADD, params)
    }

    fun pdPageNoSubs(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        params.putString("product_code", firebaseEventModel.productCode!!)
        params.putString("product_name", firebaseEventModel.productName!!)
        params.putString("orgPackSize", firebaseEventModel.orgPackSize!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_PD_PAGE_NO_SUBS, params)
    }

    fun pdPageOrgAdd(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        params.putString("product_code", firebaseEventModel.productCode!!)
        params.putString("product_name", firebaseEventModel.productName!!)
        params.putString("orgPackSize", firebaseEventModel.orgPackSize!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_PD_PAGE_ORG_ADD, params)
    }

    fun pdPageDelete(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        params.putString("product_code", firebaseEventModel.productCode!!)
        params.putString("product_name", firebaseEventModel.productName!!)

        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_PD_PAGE_DELETE, params)
    }

    fun referAndEarnView(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        params.putString("page_name", firebaseEventModel.pageName!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_REFER_AND_EARN_VIEW, params)
    }

    fun referAndEarnOrderNow(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        params.putString("page_name", firebaseEventModel.pageName!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_REFER_AND_EARN_ORDER_NOW, params)
    }

    fun referAndEarnCopy(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        params.putString("page_name", firebaseEventModel.pageName!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_REFER_AND_EARN_COPY, params)
    }

    fun referAndEarnFaq(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        params.putString("page_name", firebaseEventModel.pageName!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_REFER_AND_EARN_FAQ, params)
    }

    fun referAndEarnReferAFriend(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        params.putString("page_name", firebaseEventModel.pageName!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_REFER_AND_EARN_REFER_A_FRIEND, params)
    }

    fun registrationResendOtp(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("page_name", firebaseEventModel.pageName!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_REGISTRATION_RESEND_OTP, params)
    }

    fun patientAndReminderSetButtonOrderStatus(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        firebaseEvent.logFirebaseEvent(
            FirebaseEvent.FIREBASE_PATIENT_AND_REMINDER_SET_BUTTON_ORDER_STATUS,
            params
        )
    }

    fun orderStatusAddAlternateContact(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        firebaseEvent.logFirebaseEvent(
            FirebaseEvent.FIREBASE_ORDER_STATUS_ADD_ALTERNATE_CONTACT,
            params
        )
    }

    fun orderStatusDoctorDetails(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_ORDER_STATUS_DOCTOR_DETAILS, params)
    }

    fun orderPharmacistCall(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_ORDER_PHARMACIST_CALL, params)
    }

    fun orderDoctorCall(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_ORDER_DOCTOR_CALL, params)
    }

    fun orderDoctorMissedCall(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_ORDER_DOCTOR_MISSED_CALL, params)
    }

    fun orderProcessing(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_ORDER_PROCESSING, params)
    }

    fun orderOutForDelivery(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_ORDER_OUT_FOR_DELIVERY, params)
    }

    fun orderDispatched(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_ORDER_DISPATCHED, params)
    }

    fun walletTopBar(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_WALLET_TOP_BAR, params)
    }

    fun cartAddMedicines(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_CART_ADD_MEDICINES, params)
    }

    fun cartSearch(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_CART_SEARCH, params)
    }

    fun cartRemove(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_CART_REMOVE, params)
    }

    fun cartPdPage(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        params.putString("product_code", firebaseEventModel.productCode!!)
        params.putString("product_name", firebaseEventModel.productName!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_CART_PD_PAGE, params)
    }

    fun cartPrescription(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_CART_PRESCRIPTION, params)
    }

    fun cartApplyCoupon(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_CART_APPLY_COUPON, params)
    }

    fun uploadPrescriptionRemove(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_UPLOAD_PRESCRIPTION_REMOVE, params)
    }

    fun uploadPrescriptionGallery(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        params.putString("page_name", firebaseEventModel.pageName!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_UPLOAD_PRESCRIPTION_GALLERY, params)
    }
    fun uploadPrescriptionGalleryFromOrder(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        params.putString("page_name", firebaseEventModel.pageName!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_ORDER_PRESCRIPTION_GALLERY, params)
    }

    fun cartBack(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_CART_BACK, params)
    }

    fun cartProceed(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_CART_PROCEED, params)
    }

    fun referAndEarnNav(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_REFER_AND_EARN_NAV, params)
    }

    fun ordersNav(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_ORDERS_NAV, params)
    }

    fun accountNav(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_ACCOUNT_NAV, params)
    }

    fun tmWalletViewed(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        params.putString("page_name", firebaseEventModel.pageName!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_TM_WALLET_VIEWED, params)
    }

    fun tmWalletTAndC(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        params.putString("page_name", firebaseEventModel.pageName!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_TM_WALLET_T_AND_C, params)
    }

    fun tmWalletRewardTransactions(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        params.putString("page_name", firebaseEventModel.pageName!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_TM_WALLET_REWARD_TRANSACTIONS, params)
    }

    fun tmWalletCreditTransactions(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        params.putString("page_name", firebaseEventModel.pageName!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_TM_WALLET_CREDIT_TRANSACTIONS, params)
    }

    fun subsPopup(fbSubsView: FbSubsView) = applyTryCatch {
        val params = Bundle()
        params.putDouble("product_selling_price", fbSubsView.productSellingPrice!!)
        params.putDouble("product_mrp", fbSubsView.productMrp!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_SUBS_POPUP, params)
    }

    fun pdPageSubsAdded(fbSubsView: FbSubsView) = applyTryCatch {
        val params = Bundle()
        params.putDouble("product_selling_price", fbSubsView.productSellingPrice!!)
        params.putDouble("product_mrp", fbSubsView.productMrp!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_PD_PAGE_SUB_ADDED, params)
    }

    fun subsAdded(fbSubsView: FbSubsView) = applyTryCatch {
        val params = Bundle()
        params.putDouble("product_selling_price", fbSubsView.productSellingPrice!!)
        params.putDouble("product_mrp", fbSubsView.productMrp!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_SUB_ADDED, params)
    }

    fun searchSubsView(fbSubsView: FbSubsView) = applyTryCatch {
        val params = Bundle()
        params.putDouble("product_selling_price", fbSubsView.productSellingPrice!!)
        params.putDouble("product_mrp", fbSubsView.productMrp!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_SEARCH_SUBS_VIEW, params)
    }

    fun searchSubsAdded(fbSubsView: FbSubsView) = applyTryCatch {
        val params = Bundle()
        params.putDouble("product_selling_price", fbSubsView.productSellingPrice!!)
        params.putDouble("product_mrp", fbSubsView.productMrp!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_SEARCH_SUBS_ADDED, params)
    }

    fun replaceAllSubstitute(fbReplaceAllToSubstitute: FbReplaceAllToSubstitute) = applyTryCatch {
        val params = Bundle()
        params.putString("subs_source", fbReplaceAllToSubstitute.subsSource)
        params.putDouble(
            "estimated_payable_amount", fbReplaceAllToSubstitute.estimatedPayableAmount!!
        )
        params.putDouble(
            "coupon_discount_amount", fbReplaceAllToSubstitute.couponDiscountAmount!!
        )
        params.putDouble(
            "mrp_total_amount", fbReplaceAllToSubstitute.mrpTotalAmount!!
        )
        params.putDouble(
            "savings_amount", fbReplaceAllToSubstitute.savingsAmount!!
        )
        params.putDouble("no_of_item", fbReplaceAllToSubstitute.noOfItem!!)
        params.putString("customer_id", fbReplaceAllToSubstitute.customerId)
        params.putString(
            "order_id", fbReplaceAllToSubstitute.orderId
        )
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_REPLACE_ALL_TO_SUBSTITUTE, params)
    }

    fun chooseLocation(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_LOCATION_CHOOSE_LOCATION, params)
    }

    fun searchViewed(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        params.putString("clicked_on_page", firebaseEventModel.clickedOnPage!!)
        params.putString("page_section", firebaseEventModel.pageSection!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_SEARCH_VIEWED, params)

    }

    fun registrationMobileNoSkip(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("page_name", firebaseEventModel.pageName!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_REGISTRATION_MOBILE_NO_SKIP, params)

    }

    fun registrationOtpSkip(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        try {
            val params = Bundle()
            params.putString("mobile", firebaseEventModel.mobile!!)
            params.putString("customer_id", firebaseEventModel.customerId!!)
            params.putString("page_name", firebaseEventModel.pageName!!)
            firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_REGISTRATION_OTP_SKIP, params)
        } catch (_: Exception) {
        }
    }

    fun registrationTermsAndConditions() = applyTryCatch {
        firebaseEvent.logFirebaseEvent(
            FirebaseEvent.FIREBASE_REGISTRATION_TERMS_AND_CONDITIONS,
            Bundle()
        )
    }

    fun registrationOtpRequested(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("page_name", firebaseEventModel.pageName!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_REGISTRATION_OTP_REQUESTED, params)

    }

    fun loginOtpRequested(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("page_name", firebaseEventModel.pageName!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_LOGIN_OTP_REQUESTED, params)
    }

    fun onboardingInitiated(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        params.putString("page_name", firebaseEventModel.pageName!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_ONBOARDING_INITIATED, params)

    }

    fun registrationSuccessful(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("page_name", firebaseEventModel.pageName!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_REGISTRATION_SUCCESSFUL, params)
    }

    fun loginSuccessful(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("page_name", firebaseEventModel.pageName!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_LOGIN_SUCCESSFUL, params)
    }

    fun homePageHealthArticle(fbHomePageHealthArticle: FbHomePageHealthArticle) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", fbHomePageHealthArticle.mobile!!)
        params.putString("customer_id", fbHomePageHealthArticle.customerId!!)
        params.putString("category_id", fbHomePageHealthArticle.categoryId!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_HOME_PAGE_HEALTH_ARTICLES, params)
    }

    fun faqBack(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        params.putString("page_name", firebaseEventModel.pageName!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_FAQ_BACK, params)
    }

    fun privacyPolicyViewed(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        params.putString("page_name", firebaseEventModel.pageName!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_PRIVACY_POLICY_VIEWED, params)
    }

    fun tncViewed(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        params.putString("page_name", firebaseEventModel.pageName!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_TNC_VIEWED, params)
    }

    fun bannerSearch(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        params.putString("page_name", firebaseEventModel.pageName!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_BANNER_SEARCH, params)
    }

    fun orderStatusViewModification(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        firebaseEvent.logFirebaseEvent(
            FirebaseEvent.FIREBASE_ORDER_STATUS_VIEW_MODIFICATION,
            params
        )
    }

    fun paymentFailed(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        params.putString("orderId", firebaseEventModel.orderId!!)
        params.putString("page_name", firebaseEventModel.pageName!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_PAYMENT_FAILED, params)
    }

    fun flaggedPayment(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        params.putString("orderId", firebaseEventModel.orderId!!)
        params.putString("page_name", firebaseEventModel.pageName!!)
        params.putString("Payment_flagged", firebaseEventModel.paymentFlagged!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_FLAGGED_PAYMENT, params)
    }

    fun errorPayment(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        params.putString("orderId", firebaseEventModel.orderId!!)
        params.putString("Payment_error", firebaseEventModel.paymentError!!)
        params.putString("page_name", firebaseEventModel.pageName!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_ERROR_PAYMENT, params)
    }

    fun paymentSuccessful(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        params.putString("orderId", firebaseEventModel.orderId!!)
        params.putString("page_name", firebaseEventModel.pageName!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_PAYMENT_SUCCESSFUL, params)
    }

    fun homePagePaymentCancelled(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        params.putString("orderId", firebaseEventModel.orderId!!)
        params.putString("page_name", firebaseEventModel.pageName!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_HOMEPAGE_PAYMENT_CANCELLED, params)
    }

    fun orderPrescriptionCamera(firebaseEventModel: FirebaseEventModel) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", firebaseEventModel.mobile!!)
        params.putString("customer_id", firebaseEventModel.customerId!!)
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_ORDER_PRESCRIPTION_CAMERA, params)
    }

    /*fun registrationScreen(bundle: Bundle) = applyTryCatch {
        firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_REGISTRATION_SCREEN, bundle)
    }*/

    fun logFirebaseEvent(eventName: String, pageName: String?) = applyTryCatch {
        val params = Bundle()
        params.putString("mobile", SharedPrefManager.getInstance().loggedInUserMobile)
        if (!SharedPrefManager.getInstance().loggedInUserId.equals("0"))
            params.putString("customer_id", SharedPrefManager.getInstance().loggedInUserId)
        if (!pageName.isNullOrEmpty()) params.putString("page_name", pageName ?:"")
        firebaseEvent.logFirebaseEvent(eventName, params)
    }
}