package com.intellihealth.truemeds.presentation.model

import com.intellihealth.salt.models.ProductComparisonModel
import com.intellihealth.truemeds.data.model.home.ApplyCouponBottomSheetModel
import com.intellihealth.truemeds.data.model.home.BottomSheetDefaultModel
import com.intellihealth.truemeds.data.model.home.DeliveryDelayModel
import com.intellihealth.truemeds.data.model.home.DoctorCallBottomSheetModel
import com.intellihealth.truemeds.data.model.home.HomeReorderBottomSheetModel
import com.intellihealth.truemeds.data.model.home.PrivacyPolicyBottomSheetModel
import com.intellihealth.truemeds.data.model.home.SavedAddressModel
import com.intellihealth.truemeds.data.model.orderflow.AllOffersResponse

data class HomePageBottomSheetInfo(
    var type: BottomSheetType,
    var priority: Int,
    var doctorCallMissed: DeliveryDelayModel? = null,
    var applyCoupon: ApplyCouponBottomSheetModel? = null,
    var doctorCall: DoctorCallBottomSheetModel? = null,
    var doctorFraud: BottomSheetDefaultModel? = null,
    var error: BottomSheetDefaultModel? = null,
    var location: List<SavedAddressModel>? = null,
    var paymentPending: BottomSheetDefaultModel? = null,
    var privacyPolicy: PrivacyPolicyBottomSheetModel? = null,
    var termsAndCondition: PrivacyPolicyBottomSheetModel? = null,
    var ratings: BottomSheetDefaultModel? = null,
    var reOrder: HomeReorderBottomSheetModel? = null,
    var compareAndUnderstand: ProductComparisonModel? = null,
    var isBottomSheetDisplayed: Boolean = false,
    )

enum class BottomSheetType {
    EMPTY, REORDER, COMPARE_AND_UNDERSTAND, TERMS_AND_CONDITION, PAYMENT_PENDING, PRIVACY_POLICY, DOCTOR_CALL_MISSED_CALL_NOW, DOCTOR_CALL_MISSED_CALL_NOW_WITHOUT_TIMER, DOCTOR_WILL_CALL, DOCTOR_CALL_MISSED_CALL_BACK, SORRY_FOR_INCONVENIENCE, CHOOSE_LOCATION, RATING, SAVE_CONTACT
}

//DOCTOR_FRAUD
