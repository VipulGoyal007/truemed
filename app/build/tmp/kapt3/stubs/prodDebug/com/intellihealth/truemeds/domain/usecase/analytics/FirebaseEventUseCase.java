package com.intellihealth.truemeds.domain.usecase.analytics;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b!\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\t\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\n\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001f\u001a\u00020 J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010!\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\"\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010#\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010$\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010%\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010&\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\'\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010(\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u001a\u0010)\u001a\u0004\u0018\u00010\u00012\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010+J\u0010\u0010-\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010.\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010/\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u00100\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u00101\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u00102\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u00103\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u00104\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u00105\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u00106\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u00107\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u00108\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u00109\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010:\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010;\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010<\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010=\u001a\u0004\u0018\u00010\u00012\u0006\u0010>\u001a\u00020?J\u0010\u0010@\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010A\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010B\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010C\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010D\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010E\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010F\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010G\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010H\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010I\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010J\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010K\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010L\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010M\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010N\u001a\u0004\u0018\u00010\u00012\u0006\u0010O\u001a\u00020PJ\u0010\u0010Q\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010R\u001a\u0004\u0018\u00010\u00012\u0006\u0010O\u001a\u00020PJ\u0010\u0010S\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010T\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010U\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010V\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010W\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010X\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010Y\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010Z\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010[\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\\\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010]\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010^\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010_\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010`\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010a\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010c\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010d\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\b\u0010e\u001a\u0004\u0018\u00010\u0001J\u0010\u0010f\u001a\u0004\u0018\u00010\u00012\u0006\u0010g\u001a\u00020hJ\u0010\u0010i\u001a\u0004\u0018\u00010\u00012\u0006\u0010O\u001a\u00020PJ\u0010\u0010j\u001a\u0004\u0018\u00010\u00012\u0006\u0010O\u001a\u00020PJ\u0010\u0010k\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010l\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010m\u001a\u0004\u0018\u00010\u00012\u0006\u0010O\u001a\u00020PJ\u0010\u0010n\u001a\u0004\u0018\u00010\u00012\u0006\u0010O\u001a\u00020PJ\u0010\u0010o\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010p\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010q\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010r\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010s\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010t\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010u\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010v\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010w\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010x\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010y\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010z\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010{\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010|\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010}\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010~\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\u007f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0011\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0011\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0011\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0011\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0011\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0011\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0011\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0011\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u0011\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0089\u0001"}, d2 = {"Lcom/intellihealth/truemeds/domain/usecase/analytics/FirebaseEventUseCase;", "", "firebaseEvent", "Lcom/intellihealth/truemeds/presentation/analytics/FirebaseEvent;", "(Lcom/intellihealth/truemeds/presentation/analytics/FirebaseEvent;)V", "accountNav", "firebaseEventModel", "Lcom/intellihealth/truemeds/presentation/analytics/model/firebase/FirebaseEventModel;", "apiFailure", "bannerSearch", "cartAddMedicines", "cartApplyCoupon", "cartBack", "cartPdPage", "cartPrescription", "cartProceed", "cartRemove", "cartRemoveCoupon", "cartSearch", "chooseLocation", "delayInApiResponse", "error400", "error401", "error403", "error500", "errorPayment", "faqBack", "flaggedPayment", "homePageCallToOrder", "homePageExample", "homePageHealthArticle", "fbHomePageHealthArticle", "Lcom/intellihealth/truemeds/presentation/analytics/model/firebase/FbHomePageHealthArticle;", "homePageLocation", "homePageNav", "homePagePaymentCancelled", "homePageReorderCard", "homePageSearch", "homePageUploadPrescription", "homePageViewed", "locationEnterPinCode", "logFirebaseEvent", "eventName", "", "pageName", "loginMobileNoEdit", "loginOtpRequested", "loginResendOtp", "loginSuccessful", "onboardingInitiated", "orderDispatched", "orderDoctorCall", "orderDoctorMissedCall", "orderOutForDelivery", "orderPharmacistCall", "orderPrescriptionCamera", "orderPrescriptionUploaded", "orderProcessing", "orderStatusAddAlternateContact", "orderStatusDoctorDetails", "orderStatusViewModification", "orderSummaryConfirmOrder", "ftPurchaseEvent", "Lcom/intellihealth/truemeds/presentation/analytics/model/firebase/FbPurchaseEvent;", "ordersNav", "patientAndReminderSetButtonOrderStatus", "paymentFailed", "paymentSuccessful", "pdPageAdditionalInformation", "pdPageCart", "pdPageDelete", "pdPageDirectionsForUse", "pdPageIntroduction", "pdPageMedicineActivity", "pdPageNoSubs", "pdPageOrgAdd", "pdPageSearch", "pdPageSideEffects", "pdPageSubView", "fbSubsView", "Lcom/intellihealth/truemeds/presentation/analytics/model/firebase/FbSubsView;", "pdPageSubsAdd", "pdPageSubsAdded", "pdPageSubsPd", "pdPageUese", "pdPageViewCart", "pdpViewed", "privacyPolicyViewed", "referAndEarnCopy", "referAndEarnFaq", "referAndEarnNav", "referAndEarnOrderNow", "referAndEarnReferAFriend", "referAndEarnView", "registrationMobileNo", "registrationMobileNoEdit", "registrationMobileNoSkip", "registrationOtpRequested", "registrationOtpSkip", "registrationResendOtp", "registrationSuccessful", "registrationTermsAndConditions", "replaceAllSubstitute", "fbReplaceAllToSubstitute", "Lcom/intellihealth/truemeds/presentation/analytics/model/firebase/FbReplaceAllToSubstitute;", "searchSubsAdded", "searchSubsView", "searchViewCart", "searchViewed", "subsAdded", "subsPopup", "substituteDropdownClosed", "substituteDropdownViewed", "tmCreditBack", "tmCreditsFaqs", "tmCreditsFaqsViewMore", "tmRewardsBack", "tmRewardsFaqs", "tmRewardsFaqsViewMore", "tmWalletBack", "tmWalletCreditTransactions", "tmWalletFaqs", "tmWalletFaqsViewMore", "tmWalletReferAndEarn", "tmWalletRewardTransactions", "tmWalletTAndC", "tmWalletTransactionDate", "tmWalletViewed", "tncViewed", "updateProfileSave", "uploadPrescriptionCamera", "uploadPrescriptionGallery", "uploadPrescriptionGalleryFromOrder", "uploadPrescriptionPrescriptionSelected", "uploadPrescriptionRemove", "uploadPrescriptionUpload", "walletTopBar", "app_prodDebug"})
public final class FirebaseEventUseCase {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.presentation.analytics.FirebaseEvent firebaseEvent = null;
    
    @javax.inject.Inject()
    public FirebaseEventUseCase(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.FirebaseEvent firebaseEvent) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object orderSummaryConfirmOrder(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FbPurchaseEvent ftPurchaseEvent) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object loginResendOtp(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object registrationMobileNoEdit(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object loginMobileNoEdit(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object homePageUploadPrescription(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object homePageCallToOrder(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object homePageHealthArticle(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object homePageSearch(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object homePageReorderCard(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object homePageExample(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object homePageLocation(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object homePageViewed(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object homePageNav(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object tmWalletTransactionDate(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object tmRewardsFaqsViewMore(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object tmCreditsFaqsViewMore(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object tmWalletFaqsViewMore(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object tmRewardsFaqs(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object tmWalletReferAndEarn(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object tmWalletBack(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object tmWalletFaqs(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object tmCreditsFaqs(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object tmRewardsBack(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object tmCreditBack(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object cartRemoveCoupon(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object locationEnterPinCode(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object delayInApiResponse(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object error400(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object error401(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object error403(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object error500(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object apiFailure(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object pdpViewed(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object uploadPrescriptionCamera(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object uploadPrescriptionUpload(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object orderPrescriptionUploaded(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object uploadPrescriptionPrescriptionSelected(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object registrationMobileNo(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object searchViewCart(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateProfileSave(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object substituteDropdownClosed(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object substituteDropdownViewed(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object pdPageSubView(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FbSubsView fbSubsView) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object pdPageSubsPd(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object pdPageIntroduction(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object pdPageMedicineActivity(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object pdPageUese(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object pdPageDirectionsForUse(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object pdPageSideEffects(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object pdPageAdditionalInformation(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object pdPageSearch(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object pdPageCart(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object pdPageViewCart(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object pdPageSubsAdd(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object pdPageNoSubs(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object pdPageOrgAdd(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object pdPageDelete(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object referAndEarnView(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object referAndEarnOrderNow(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object referAndEarnCopy(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object referAndEarnFaq(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object referAndEarnReferAFriend(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object registrationResendOtp(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object patientAndReminderSetButtonOrderStatus(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object orderStatusAddAlternateContact(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object orderStatusDoctorDetails(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object orderPharmacistCall(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object orderDoctorCall(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object orderDoctorMissedCall(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object orderProcessing(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object orderOutForDelivery(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object orderDispatched(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object walletTopBar(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object cartAddMedicines(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object cartSearch(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object cartRemove(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object cartPdPage(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object cartPrescription(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object cartApplyCoupon(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object uploadPrescriptionRemove(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object uploadPrescriptionGallery(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object uploadPrescriptionGalleryFromOrder(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object cartBack(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object cartProceed(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object referAndEarnNav(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object ordersNav(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object accountNav(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object tmWalletViewed(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object tmWalletTAndC(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object tmWalletRewardTransactions(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object tmWalletCreditTransactions(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object subsPopup(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FbSubsView fbSubsView) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object pdPageSubsAdded(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FbSubsView fbSubsView) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object subsAdded(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FbSubsView fbSubsView) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object searchSubsView(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FbSubsView fbSubsView) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object searchSubsAdded(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FbSubsView fbSubsView) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object replaceAllSubstitute(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FbReplaceAllToSubstitute fbReplaceAllToSubstitute) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object chooseLocation(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object searchViewed(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object registrationMobileNoSkip(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object registrationOtpSkip(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object registrationTermsAndConditions() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object registrationOtpRequested(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object loginOtpRequested(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object onboardingInitiated(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object registrationSuccessful(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object loginSuccessful(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object homePageHealthArticle(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FbHomePageHealthArticle fbHomePageHealthArticle) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object faqBack(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object privacyPolicyViewed(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object tncViewed(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object bannerSearch(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object orderStatusViewModification(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object paymentFailed(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object flaggedPayment(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object errorPayment(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object paymentSuccessful(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object homePagePaymentCancelled(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object orderPrescriptionCamera(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object logFirebaseEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String eventName, @org.jetbrains.annotations.Nullable()
    java.lang.String pageName) {
        return null;
    }
}