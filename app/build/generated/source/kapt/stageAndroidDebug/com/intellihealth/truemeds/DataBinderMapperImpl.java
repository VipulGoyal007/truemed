package com.intellihealth.truemeds;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.intellihealth.truemeds.databinding.ActivityAddAddressBindingImpl;
import com.intellihealth.truemeds.databinding.ActivityAddPatientBindingImpl;
import com.intellihealth.truemeds.databinding.ActivityCancelOrderBindingImpl;
import com.intellihealth.truemeds.databinding.ActivityCancelSubOrderBindingImpl;
import com.intellihealth.truemeds.databinding.ActivityCartBindingImpl;
import com.intellihealth.truemeds.databinding.ActivityCouponBindingImpl;
import com.intellihealth.truemeds.databinding.ActivityDeliveryDetailsBindingImpl;
import com.intellihealth.truemeds.databinding.ActivityEditProfileBindingImpl;
import com.intellihealth.truemeds.databinding.ActivityFaqViewAllBindingImpl;
import com.intellihealth.truemeds.databinding.ActivityHealthArticleDetailBindingImpl;
import com.intellihealth.truemeds.databinding.ActivityHealthArticlesBindingImpl;
import com.intellihealth.truemeds.databinding.ActivityHelpBindingImpl;
import com.intellihealth.truemeds.databinding.ActivityHelpSubcategoryBindingImpl;
import com.intellihealth.truemeds.databinding.ActivityHelpSubcategoryDetailBindingImpl;
import com.intellihealth.truemeds.databinding.ActivityHomePageBindingImpl;
import com.intellihealth.truemeds.databinding.ActivityLoginBindingImpl;
import com.intellihealth.truemeds.databinding.ActivityManageAddressBindingImpl;
import com.intellihealth.truemeds.databinding.ActivityManagePatientBindingImpl;
import com.intellihealth.truemeds.databinding.ActivityMyOrdersBindingImpl;
import com.intellihealth.truemeds.databinding.ActivityNonActiveOrderStatusBindingImpl;
import com.intellihealth.truemeds.databinding.ActivityOrderStatusBindingImpl;
import com.intellihealth.truemeds.databinding.ActivityOrderSummaryBindingImpl;
import com.intellihealth.truemeds.databinding.ActivityOtcCategoryBindingImpl;
import com.intellihealth.truemeds.databinding.ActivityPatientReminderBindingImpl;
import com.intellihealth.truemeds.databinding.ActivityPaymentBindingImpl;
import com.intellihealth.truemeds.databinding.ActivityPaymentOptionBindingImpl;
import com.intellihealth.truemeds.databinding.ActivityPaymentStatusBindingImpl;
import com.intellihealth.truemeds.databinding.ActivityPoliciesPageBindingImpl;
import com.intellihealth.truemeds.databinding.ActivityPolicyDetailBindingImpl;
import com.intellihealth.truemeds.databinding.ActivityPrescriptionBindingImpl;
import com.intellihealth.truemeds.databinding.ActivityProductDetailBindingImpl;
import com.intellihealth.truemeds.databinding.ActivityProductListViewAllBindingImpl;
import com.intellihealth.truemeds.databinding.ActivityReferAndEarnBindingImpl;
import com.intellihealth.truemeds.databinding.ActivityReturnRefundWebBindingImpl;
import com.intellihealth.truemeds.databinding.ActivitySearchResultBindingImpl;
import com.intellihealth.truemeds.databinding.ActivitySearchSuggestionBindingImpl;
import com.intellihealth.truemeds.databinding.ActivitySplashScreenBindingImpl;
import com.intellihealth.truemeds.databinding.ActivitySubstitutesBindingImpl;
import com.intellihealth.truemeds.databinding.ActivityVideoFaqBindingImpl;
import com.intellihealth.truemeds.databinding.ActivityWalletBindingImpl;
import com.intellihealth.truemeds.databinding.ActivityWalletTranasctionsBindingImpl;
import com.intellihealth.truemeds.databinding.ActivityWebBrowserBindingImpl;
import com.intellihealth.truemeds.databinding.AdapterAddmorePrescriptionOrderSummaryBindingImpl;
import com.intellihealth.truemeds.databinding.AdapterBannerItemBindingImpl;
import com.intellihealth.truemeds.databinding.AdapterBlogSectionItemBindingImpl;
import com.intellihealth.truemeds.databinding.AdapterCallorderActionCardItemBindingImpl;
import com.intellihealth.truemeds.databinding.AdapterCartItemBindingImpl;
import com.intellihealth.truemeds.databinding.AdapterChipsReminderItemBindingImpl;
import com.intellihealth.truemeds.databinding.AdapterCouponItemBindingImpl;
import com.intellihealth.truemeds.databinding.AdapterDoctorPrescriptionBindingImpl;
import com.intellihealth.truemeds.databinding.AdapterDoctorPrescriptionOrderSummaryBindingImpl;
import com.intellihealth.truemeds.databinding.AdapterFooterItemBindingImpl;
import com.intellihealth.truemeds.databinding.AdapterHomepageAlertItemBindingImpl;
import com.intellihealth.truemeds.databinding.AdapterModificationItemBindingImpl;
import com.intellihealth.truemeds.databinding.AdapterOrderSummaryCartItemBindingImpl;
import com.intellihealth.truemeds.databinding.AdapterPatientMedicinesChipsItemBindingImpl;
import com.intellihealth.truemeds.databinding.AdapterPersonalCareCategoryBindingImpl;
import com.intellihealth.truemeds.databinding.AdapterPersonalCareProductBindingImpl;
import com.intellihealth.truemeds.databinding.AdapterPrescriptionActionCardItemBindingImpl;
import com.intellihealth.truemeds.databinding.AdapterProductCardItemBindingImpl;
import com.intellihealth.truemeds.databinding.AdapterProductCardStackedItemBindingImpl;
import com.intellihealth.truemeds.databinding.AdapterReminderBindingImpl;
import com.intellihealth.truemeds.databinding.AdapterReminderTimeItemBindingImpl;
import com.intellihealth.truemeds.databinding.AdapterReorderBindingImpl;
import com.intellihealth.truemeds.databinding.AdapterSubstituteInfoCardItemBindingImpl;
import com.intellihealth.truemeds.databinding.AdapterSuperCategoryBindingImpl;
import com.intellihealth.truemeds.databinding.AdapterTestimonialSectionItemBindingImpl;
import com.intellihealth.truemeds.databinding.AdapterTimeIntervalItemDefaultBindingImpl;
import com.intellihealth.truemeds.databinding.AdapterTransactionItemBindingImpl;
import com.intellihealth.truemeds.databinding.AdapterViewPrescriptionBindingImpl;
import com.intellihealth.truemeds.databinding.AuthorCardItemBindingImpl;
import com.intellihealth.truemeds.databinding.BannerViewpagerItemBindingImpl;
import com.intellihealth.truemeds.databinding.BottomsheetAlternateNumberBindingImpl;
import com.intellihealth.truemeds.databinding.BottomsheetApplyCouponBindingImpl;
import com.intellihealth.truemeds.databinding.BottomsheetChooseCustomDatesBindingImpl;
import com.intellihealth.truemeds.databinding.BottomsheetChooseTimeIntervalBindingImpl;
import com.intellihealth.truemeds.databinding.BottomsheetCompareAndUnderstandBindingImpl;
import com.intellihealth.truemeds.databinding.BottomsheetCompositionDetailsBindingImpl;
import com.intellihealth.truemeds.databinding.BottomsheetCouponOfferBindingImpl;
import com.intellihealth.truemeds.databinding.BottomsheetDetailedStatusBindingImpl;
import com.intellihealth.truemeds.databinding.BottomsheetDoctorCallBindingImpl;
import com.intellihealth.truemeds.databinding.BottomsheetDoctorCallMissedBindingImpl;
import com.intellihealth.truemeds.databinding.BottomsheetDoctorFraudBindingImpl;
import com.intellihealth.truemeds.databinding.BottomsheetErrorBindingImpl;
import com.intellihealth.truemeds.databinding.BottomsheetFilterBindingImpl;
import com.intellihealth.truemeds.databinding.BottomsheetHelpBindingImpl;
import com.intellihealth.truemeds.databinding.BottomsheetItemNoLongerAvailableBindingImpl;
import com.intellihealth.truemeds.databinding.BottomsheetLocationBindingImpl;
import com.intellihealth.truemeds.databinding.BottomsheetLoginBindingImpl;
import com.intellihealth.truemeds.databinding.BottomsheetModificationItemBindingImpl;
import com.intellihealth.truemeds.databinding.BottomsheetMyorderBindingImpl;
import com.intellihealth.truemeds.databinding.BottomsheetPaymentCarouselBindingImpl;
import com.intellihealth.truemeds.databinding.BottomsheetPaymentChangeSelectionBindingImpl;
import com.intellihealth.truemeds.databinding.BottomsheetPaymentPendingBindingImpl;
import com.intellihealth.truemeds.databinding.BottomsheetPaymentUnsuccessfulBindingImpl;
import com.intellihealth.truemeds.databinding.BottomsheetPrivacyPolicyBindingImpl;
import com.intellihealth.truemeds.databinding.BottomsheetProductDetailBindingImpl;
import com.intellihealth.truemeds.databinding.BottomsheetRatingsBindingImpl;
import com.intellihealth.truemeds.databinding.BottomsheetRemoveUnavailableProductBindingImpl;
import com.intellihealth.truemeds.databinding.BottomsheetReorderBindingImpl;
import com.intellihealth.truemeds.databinding.BottomsheetReorderFooterBindingImpl;
import com.intellihealth.truemeds.databinding.BottomsheetReorderHeaderBindingImpl;
import com.intellihealth.truemeds.databinding.BottomsheetReorderItemBindingImpl;
import com.intellihealth.truemeds.databinding.BottomsheetReplaceAllCompanyItemBindingImpl;
import com.intellihealth.truemeds.databinding.BottomsheetReplaceAllRecocommendedBindingImpl;
import com.intellihealth.truemeds.databinding.BottomsheetReplaceAllRecocommendedItemBindingImpl;
import com.intellihealth.truemeds.databinding.BottomsheetReplacingBindingImpl;
import com.intellihealth.truemeds.databinding.BottomsheetRxPrescriptionBindingImpl;
import com.intellihealth.truemeds.databinding.BottomsheetSaveNumberBindingImpl;
import com.intellihealth.truemeds.databinding.BottomsheetSwitchBackOgBindingImpl;
import com.intellihealth.truemeds.databinding.BottomsheetViewBillBindingImpl;
import com.intellihealth.truemeds.databinding.BottomsheetViewBillDetailsBindingImpl;
import com.intellihealth.truemeds.databinding.BottomsheetViewPrescriptionBindingImpl;
import com.intellihealth.truemeds.databinding.BrandTypeItemBindingImpl;
import com.intellihealth.truemeds.databinding.CalendarLayoutBindingImpl;
import com.intellihealth.truemeds.databinding.CancelOrderBottomsheetBindingImpl;
import com.intellihealth.truemeds.databinding.CancelOrderItemBindingImpl;
import com.intellihealth.truemeds.databinding.CategoryShopItemBindingImpl;
import com.intellihealth.truemeds.databinding.CategoryTypeItemBindingImpl;
import com.intellihealth.truemeds.databinding.CompositionBottomsheetItemBindingImpl;
import com.intellihealth.truemeds.databinding.DeleteImageBottomSheetBindingImpl;
import com.intellihealth.truemeds.databinding.DeliveryDetailsPatientItemBindingImpl;
import com.intellihealth.truemeds.databinding.DialogCouponErrorBindingImpl;
import com.intellihealth.truemeds.databinding.DialogCouponSavingBindingImpl;
import com.intellihealth.truemeds.databinding.DialogCouponSuceessBindingImpl;
import com.intellihealth.truemeds.databinding.DialogRatingSubmittedBindingImpl;
import com.intellihealth.truemeds.databinding.DialogReplaceSavingsBindingImpl;
import com.intellihealth.truemeds.databinding.DialogRoundedCornerBindingImpl;
import com.intellihealth.truemeds.databinding.DialogRxCouponSuceessBindingImpl;
import com.intellihealth.truemeds.databinding.DoNotHaveBottomsheetBindingImpl;
import com.intellihealth.truemeds.databinding.EditDeleteBottomsheetBindingImpl;
import com.intellihealth.truemeds.databinding.FragmentAccountBindingImpl;
import com.intellihealth.truemeds.databinding.FragmentBottomSheetBindingImpl;
import com.intellihealth.truemeds.databinding.FragmentEditReminderBindingImpl;
import com.intellihealth.truemeds.databinding.FragmentHomeBindingImpl;
import com.intellihealth.truemeds.databinding.FragmentLoginMobileNumberBindingImpl;
import com.intellihealth.truemeds.databinding.FragmentLoginOtpBindingImpl;
import com.intellihealth.truemeds.databinding.FragmentLogoutBottomSheetBindingImpl;
import com.intellihealth.truemeds.databinding.FragmentMyReferralsBindingImpl;
import com.intellihealth.truemeds.databinding.FragmentOrdersBindingImpl;
import com.intellihealth.truemeds.databinding.FragmentOrgSubCompareBindingImpl;
import com.intellihealth.truemeds.databinding.FragmentProductDetailBindingImpl;
import com.intellihealth.truemeds.databinding.FragmentReferAndEarnBindingImpl;
import com.intellihealth.truemeds.databinding.FragmentReferNowBindingImpl;
import com.intellihealth.truemeds.databinding.FragmentReminderAlertBindingImpl;
import com.intellihealth.truemeds.databinding.FragmentReminderBottomSheetBindingImpl;
import com.intellihealth.truemeds.databinding.FragmentReminderDeleteBindingImpl;
import com.intellihealth.truemeds.databinding.FragmentRemoveProductBottomSheetBindingImpl;
import com.intellihealth.truemeds.databinding.FragmentReplaceBottomSheetBindingImpl;
import com.intellihealth.truemeds.databinding.FragmentSubsBottomSheetBindingImpl;
import com.intellihealth.truemeds.databinding.HealthArticleBottomsheetBindingImpl;
import com.intellihealth.truemeds.databinding.HealthArticleBottomsheetItemBindingImpl;
import com.intellihealth.truemeds.databinding.HealthArticleChipItemBindingImpl;
import com.intellihealth.truemeds.databinding.HealthArticlesItemBindingImpl;
import com.intellihealth.truemeds.databinding.HelpCategoryItemBindingImpl;
import com.intellihealth.truemeds.databinding.HelpSubcategoryItemBindingImpl;
import com.intellihealth.truemeds.databinding.HomeAdapterItemBindingImpl;
import com.intellihealth.truemeds.databinding.ItemTabAccountBindingImpl;
import com.intellihealth.truemeds.databinding.ItemVideoP2BindingImpl;
import com.intellihealth.truemeds.databinding.ItemVideoVerticalP2BindingImpl;
import com.intellihealth.truemeds.databinding.LoginBannerItemBindingImpl;
import com.intellihealth.truemeds.databinding.ManageAddressCardItemBindingImpl;
import com.intellihealth.truemeds.databinding.ManagePatientItemBindingImpl;
import com.intellihealth.truemeds.databinding.MyOrdersItemBindingImpl;
import com.intellihealth.truemeds.databinding.OptForSubsBottomSheetBindingImpl;
import com.intellihealth.truemeds.databinding.OrderTypeItemBindingImpl;
import com.intellihealth.truemeds.databinding.PastPrescriptionAllPatientItemBindingImpl;
import com.intellihealth.truemeds.databinding.PastPrescriptionBottomsheetBindingImpl;
import com.intellihealth.truemeds.databinding.PastPrescriptionDetailsBindingImpl;
import com.intellihealth.truemeds.databinding.PatientTypeItemBindingImpl;
import com.intellihealth.truemeds.databinding.PaymentOptionsListItemBindingImpl;
import com.intellihealth.truemeds.databinding.PrescriptionDetailsBindingImpl;
import com.intellihealth.truemeds.databinding.PrivacyPolicyBottomsheetBindingImpl;
import com.intellihealth.truemeds.databinding.ProductListViewAllItemBindingImpl;
import com.intellihealth.truemeds.databinding.ProgressBarItemBindingImpl;
import com.intellihealth.truemeds.databinding.ReminderItemBindingImpl;
import com.intellihealth.truemeds.databinding.ResPatientItemBindingImpl;
import com.intellihealth.truemeds.databinding.RvOtcItemBindingImpl;
import com.intellihealth.truemeds.databinding.SavedAddressItemBindingImpl;
import com.intellihealth.truemeds.databinding.SearchPreviousViewedItemBindingImpl;
import com.intellihealth.truemeds.databinding.SearchResultItemBindingImpl;
import com.intellihealth.truemeds.databinding.SearchResultRvItemBindingImpl;
import com.intellihealth.truemeds.databinding.SearchResultUpdatedUiItemBindingImpl;
import com.intellihealth.truemeds.databinding.SearchSuggestionRecentRvItemBindingImpl;
import com.intellihealth.truemeds.databinding.SearchTrendingUpdatedUiItemBindingImpl;
import com.intellihealth.truemeds.databinding.ShimmerAccountScreenBindingImpl;
import com.intellihealth.truemeds.databinding.ShimmerCompareBindingImpl;
import com.intellihealth.truemeds.databinding.ShimmerHorizontalProductsBindingImpl;
import com.intellihealth.truemeds.databinding.ShimmerManagePatientBindingImpl;
import com.intellihealth.truemeds.databinding.ShimmerMedicineDetailsBindingImpl;
import com.intellihealth.truemeds.databinding.ShimmerMyOrderBindingImpl;
import com.intellihealth.truemeds.databinding.ShimmerOrderStatusBindingImpl;
import com.intellihealth.truemeds.databinding.ShimmerOrderSummaryBindingImpl;
import com.intellihealth.truemeds.databinding.ShimmerSearchBindingImpl;
import com.intellihealth.truemeds.databinding.ShimmerSearchResultPageWithItemInCardBindingImpl;
import com.intellihealth.truemeds.databinding.ShimmerWalletBindingImpl;
import com.intellihealth.truemeds.databinding.SubCategoryCategoryTypeItemBindingImpl;
import com.intellihealth.truemeds.databinding.SubCategoryTypeItemBindingImpl;
import com.intellihealth.truemeds.databinding.SubsItemBindingImpl;
import com.intellihealth.truemeds.databinding.SubsMedItemBindingImpl;
import com.intellihealth.truemeds.databinding.SuperCategoryShopItemBindingImpl;
import com.intellihealth.truemeds.databinding.TermsAndConditionBottomsheetBindingImpl;
import com.intellihealth.truemeds.databinding.TrendingSearchItemBindingImpl;
import com.intellihealth.truemeds.databinding.UploadPrescriptionBottomsheetBindingImpl;
import com.intellihealth.truemeds.databinding.UploadPrescriptionItemLayBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYADDADDRESS = 1;

  private static final int LAYOUT_ACTIVITYADDPATIENT = 2;

  private static final int LAYOUT_ACTIVITYCANCELORDER = 3;

  private static final int LAYOUT_ACTIVITYCANCELSUBORDER = 4;

  private static final int LAYOUT_ACTIVITYCART = 5;

  private static final int LAYOUT_ACTIVITYCOUPON = 6;

  private static final int LAYOUT_ACTIVITYDELIVERYDETAILS = 7;

  private static final int LAYOUT_ACTIVITYEDITPROFILE = 8;

  private static final int LAYOUT_ACTIVITYFAQVIEWALL = 9;

  private static final int LAYOUT_ACTIVITYHEALTHARTICLEDETAIL = 10;

  private static final int LAYOUT_ACTIVITYHEALTHARTICLES = 11;

  private static final int LAYOUT_ACTIVITYHELP = 12;

  private static final int LAYOUT_ACTIVITYHELPSUBCATEGORY = 13;

  private static final int LAYOUT_ACTIVITYHELPSUBCATEGORYDETAIL = 14;

  private static final int LAYOUT_ACTIVITYHOMEPAGE = 15;

  private static final int LAYOUT_ACTIVITYLOGIN = 16;

  private static final int LAYOUT_ACTIVITYMANAGEADDRESS = 17;

  private static final int LAYOUT_ACTIVITYMANAGEPATIENT = 18;

  private static final int LAYOUT_ACTIVITYMYORDERS = 19;

  private static final int LAYOUT_ACTIVITYNONACTIVEORDERSTATUS = 20;

  private static final int LAYOUT_ACTIVITYORDERSTATUS = 21;

  private static final int LAYOUT_ACTIVITYORDERSUMMARY = 22;

  private static final int LAYOUT_ACTIVITYOTCCATEGORY = 23;

  private static final int LAYOUT_ACTIVITYPATIENTREMINDER = 24;

  private static final int LAYOUT_ACTIVITYPAYMENT = 25;

  private static final int LAYOUT_ACTIVITYPAYMENTOPTION = 26;

  private static final int LAYOUT_ACTIVITYPAYMENTSTATUS = 27;

  private static final int LAYOUT_ACTIVITYPOLICIESPAGE = 28;

  private static final int LAYOUT_ACTIVITYPOLICYDETAIL = 29;

  private static final int LAYOUT_ACTIVITYPRESCRIPTION = 30;

  private static final int LAYOUT_ACTIVITYPRODUCTDETAIL = 31;

  private static final int LAYOUT_ACTIVITYPRODUCTLISTVIEWALL = 32;

  private static final int LAYOUT_ACTIVITYREFERANDEARN = 33;

  private static final int LAYOUT_ACTIVITYRETURNREFUNDWEB = 34;

  private static final int LAYOUT_ACTIVITYSEARCHRESULT = 35;

  private static final int LAYOUT_ACTIVITYSEARCHSUGGESTION = 36;

  private static final int LAYOUT_ACTIVITYSPLASHSCREEN = 37;

  private static final int LAYOUT_ACTIVITYSUBSTITUTES = 38;

  private static final int LAYOUT_ACTIVITYVIDEOFAQ = 39;

  private static final int LAYOUT_ACTIVITYWALLET = 40;

  private static final int LAYOUT_ACTIVITYWALLETTRANASCTIONS = 41;

  private static final int LAYOUT_ACTIVITYWEBBROWSER = 42;

  private static final int LAYOUT_ADAPTERADDMOREPRESCRIPTIONORDERSUMMARY = 43;

  private static final int LAYOUT_ADAPTERBANNERITEM = 44;

  private static final int LAYOUT_ADAPTERBLOGSECTIONITEM = 45;

  private static final int LAYOUT_ADAPTERCALLORDERACTIONCARDITEM = 46;

  private static final int LAYOUT_ADAPTERCARTITEM = 47;

  private static final int LAYOUT_ADAPTERCHIPSREMINDERITEM = 48;

  private static final int LAYOUT_ADAPTERCOUPONITEM = 49;

  private static final int LAYOUT_ADAPTERDOCTORPRESCRIPTION = 50;

  private static final int LAYOUT_ADAPTERDOCTORPRESCRIPTIONORDERSUMMARY = 51;

  private static final int LAYOUT_ADAPTERFOOTERITEM = 52;

  private static final int LAYOUT_ADAPTERHOMEPAGEALERTITEM = 53;

  private static final int LAYOUT_ADAPTERMODIFICATIONITEM = 54;

  private static final int LAYOUT_ADAPTERORDERSUMMARYCARTITEM = 55;

  private static final int LAYOUT_ADAPTERPATIENTMEDICINESCHIPSITEM = 56;

  private static final int LAYOUT_ADAPTERPERSONALCARECATEGORY = 57;

  private static final int LAYOUT_ADAPTERPERSONALCAREPRODUCT = 58;

  private static final int LAYOUT_ADAPTERPRESCRIPTIONACTIONCARDITEM = 59;

  private static final int LAYOUT_ADAPTERPRODUCTCARDITEM = 60;

  private static final int LAYOUT_ADAPTERPRODUCTCARDSTACKEDITEM = 61;

  private static final int LAYOUT_ADAPTERREMINDER = 62;

  private static final int LAYOUT_ADAPTERREMINDERTIMEITEM = 63;

  private static final int LAYOUT_ADAPTERREORDER = 64;

  private static final int LAYOUT_ADAPTERSUBSTITUTEINFOCARDITEM = 65;

  private static final int LAYOUT_ADAPTERSUPERCATEGORY = 66;

  private static final int LAYOUT_ADAPTERTESTIMONIALSECTIONITEM = 67;

  private static final int LAYOUT_ADAPTERTIMEINTERVALITEMDEFAULT = 68;

  private static final int LAYOUT_ADAPTERTRANSACTIONITEM = 69;

  private static final int LAYOUT_ADAPTERVIEWPRESCRIPTION = 70;

  private static final int LAYOUT_AUTHORCARDITEM = 71;

  private static final int LAYOUT_BANNERVIEWPAGERITEM = 72;

  private static final int LAYOUT_BOTTOMSHEETALTERNATENUMBER = 73;

  private static final int LAYOUT_BOTTOMSHEETAPPLYCOUPON = 74;

  private static final int LAYOUT_BOTTOMSHEETCHOOSECUSTOMDATES = 75;

  private static final int LAYOUT_BOTTOMSHEETCHOOSETIMEINTERVAL = 76;

  private static final int LAYOUT_BOTTOMSHEETCOMPAREANDUNDERSTAND = 77;

  private static final int LAYOUT_BOTTOMSHEETCOMPOSITIONDETAILS = 78;

  private static final int LAYOUT_BOTTOMSHEETCOUPONOFFER = 79;

  private static final int LAYOUT_BOTTOMSHEETDETAILEDSTATUS = 80;

  private static final int LAYOUT_BOTTOMSHEETDOCTORCALL = 81;

  private static final int LAYOUT_BOTTOMSHEETDOCTORCALLMISSED = 82;

  private static final int LAYOUT_BOTTOMSHEETDOCTORFRAUD = 83;

  private static final int LAYOUT_BOTTOMSHEETERROR = 84;

  private static final int LAYOUT_BOTTOMSHEETFILTER = 85;

  private static final int LAYOUT_BOTTOMSHEETHELP = 86;

  private static final int LAYOUT_BOTTOMSHEETITEMNOLONGERAVAILABLE = 87;

  private static final int LAYOUT_BOTTOMSHEETLOCATION = 88;

  private static final int LAYOUT_BOTTOMSHEETLOGIN = 89;

  private static final int LAYOUT_BOTTOMSHEETMODIFICATIONITEM = 90;

  private static final int LAYOUT_BOTTOMSHEETMYORDER = 91;

  private static final int LAYOUT_BOTTOMSHEETPAYMENTCAROUSEL = 92;

  private static final int LAYOUT_BOTTOMSHEETPAYMENTCHANGESELECTION = 93;

  private static final int LAYOUT_BOTTOMSHEETPAYMENTPENDING = 94;

  private static final int LAYOUT_BOTTOMSHEETPAYMENTUNSUCCESSFUL = 95;

  private static final int LAYOUT_BOTTOMSHEETPRIVACYPOLICY = 96;

  private static final int LAYOUT_BOTTOMSHEETPRODUCTDETAIL = 97;

  private static final int LAYOUT_BOTTOMSHEETRATINGS = 98;

  private static final int LAYOUT_BOTTOMSHEETREMOVEUNAVAILABLEPRODUCT = 99;

  private static final int LAYOUT_BOTTOMSHEETREORDER = 100;

  private static final int LAYOUT_BOTTOMSHEETREORDERFOOTER = 101;

  private static final int LAYOUT_BOTTOMSHEETREORDERHEADER = 102;

  private static final int LAYOUT_BOTTOMSHEETREORDERITEM = 103;

  private static final int LAYOUT_BOTTOMSHEETREPLACEALLCOMPANYITEM = 104;

  private static final int LAYOUT_BOTTOMSHEETREPLACEALLRECOCOMMENDED = 105;

  private static final int LAYOUT_BOTTOMSHEETREPLACEALLRECOCOMMENDEDITEM = 106;

  private static final int LAYOUT_BOTTOMSHEETREPLACING = 107;

  private static final int LAYOUT_BOTTOMSHEETRXPRESCRIPTION = 108;

  private static final int LAYOUT_BOTTOMSHEETSAVENUMBER = 109;

  private static final int LAYOUT_BOTTOMSHEETSWITCHBACKOG = 110;

  private static final int LAYOUT_BOTTOMSHEETVIEWBILL = 111;

  private static final int LAYOUT_BOTTOMSHEETVIEWBILLDETAILS = 112;

  private static final int LAYOUT_BOTTOMSHEETVIEWPRESCRIPTION = 113;

  private static final int LAYOUT_BRANDTYPEITEM = 114;

  private static final int LAYOUT_CALENDARLAYOUT = 115;

  private static final int LAYOUT_CANCELORDERBOTTOMSHEET = 116;

  private static final int LAYOUT_CANCELORDERITEM = 117;

  private static final int LAYOUT_CATEGORYSHOPITEM = 118;

  private static final int LAYOUT_CATEGORYTYPEITEM = 119;

  private static final int LAYOUT_COMPOSITIONBOTTOMSHEETITEM = 120;

  private static final int LAYOUT_DELETEIMAGEBOTTOMSHEET = 121;

  private static final int LAYOUT_DELIVERYDETAILSPATIENTITEM = 122;

  private static final int LAYOUT_DIALOGCOUPONERROR = 123;

  private static final int LAYOUT_DIALOGCOUPONSAVING = 124;

  private static final int LAYOUT_DIALOGCOUPONSUCEESS = 125;

  private static final int LAYOUT_DIALOGRATINGSUBMITTED = 126;

  private static final int LAYOUT_DIALOGREPLACESAVINGS = 127;

  private static final int LAYOUT_DIALOGROUNDEDCORNER = 128;

  private static final int LAYOUT_DIALOGRXCOUPONSUCEESS = 129;

  private static final int LAYOUT_DONOTHAVEBOTTOMSHEET = 130;

  private static final int LAYOUT_EDITDELETEBOTTOMSHEET = 131;

  private static final int LAYOUT_FRAGMENTACCOUNT = 132;

  private static final int LAYOUT_FRAGMENTBOTTOMSHEET = 133;

  private static final int LAYOUT_FRAGMENTEDITREMINDER = 134;

  private static final int LAYOUT_FRAGMENTHOME = 135;

  private static final int LAYOUT_FRAGMENTLOGINMOBILENUMBER = 136;

  private static final int LAYOUT_FRAGMENTLOGINOTP = 137;

  private static final int LAYOUT_FRAGMENTLOGOUTBOTTOMSHEET = 138;

  private static final int LAYOUT_FRAGMENTMYREFERRALS = 139;

  private static final int LAYOUT_FRAGMENTORDERS = 140;

  private static final int LAYOUT_FRAGMENTORGSUBCOMPARE = 141;

  private static final int LAYOUT_FRAGMENTPRODUCTDETAIL = 142;

  private static final int LAYOUT_FRAGMENTREFERANDEARN = 143;

  private static final int LAYOUT_FRAGMENTREFERNOW = 144;

  private static final int LAYOUT_FRAGMENTREMINDERALERT = 145;

  private static final int LAYOUT_FRAGMENTREMINDERBOTTOMSHEET = 146;

  private static final int LAYOUT_FRAGMENTREMINDERDELETE = 147;

  private static final int LAYOUT_FRAGMENTREMOVEPRODUCTBOTTOMSHEET = 148;

  private static final int LAYOUT_FRAGMENTREPLACEBOTTOMSHEET = 149;

  private static final int LAYOUT_FRAGMENTSUBSBOTTOMSHEET = 150;

  private static final int LAYOUT_HEALTHARTICLEBOTTOMSHEET = 151;

  private static final int LAYOUT_HEALTHARTICLEBOTTOMSHEETITEM = 152;

  private static final int LAYOUT_HEALTHARTICLECHIPITEM = 153;

  private static final int LAYOUT_HEALTHARTICLESITEM = 154;

  private static final int LAYOUT_HELPCATEGORYITEM = 155;

  private static final int LAYOUT_HELPSUBCATEGORYITEM = 156;

  private static final int LAYOUT_HOMEADAPTERITEM = 157;

  private static final int LAYOUT_ITEMTABACCOUNT = 158;

  private static final int LAYOUT_ITEMVIDEOP2 = 159;

  private static final int LAYOUT_ITEMVIDEOVERTICALP2 = 160;

  private static final int LAYOUT_LOGINBANNERITEM = 161;

  private static final int LAYOUT_MANAGEADDRESSCARDITEM = 162;

  private static final int LAYOUT_MANAGEPATIENTITEM = 163;

  private static final int LAYOUT_MYORDERSITEM = 164;

  private static final int LAYOUT_OPTFORSUBSBOTTOMSHEET = 165;

  private static final int LAYOUT_ORDERTYPEITEM = 166;

  private static final int LAYOUT_PASTPRESCRIPTIONALLPATIENTITEM = 167;

  private static final int LAYOUT_PASTPRESCRIPTIONBOTTOMSHEET = 168;

  private static final int LAYOUT_PASTPRESCRIPTIONDETAILS = 169;

  private static final int LAYOUT_PATIENTTYPEITEM = 170;

  private static final int LAYOUT_PAYMENTOPTIONSLISTITEM = 171;

  private static final int LAYOUT_PRESCRIPTIONDETAILS = 172;

  private static final int LAYOUT_PRIVACYPOLICYBOTTOMSHEET = 173;

  private static final int LAYOUT_PRODUCTLISTVIEWALLITEM = 174;

  private static final int LAYOUT_PROGRESSBARITEM = 175;

  private static final int LAYOUT_REMINDERITEM = 176;

  private static final int LAYOUT_RESPATIENTITEM = 177;

  private static final int LAYOUT_RVOTCITEM = 178;

  private static final int LAYOUT_SAVEDADDRESSITEM = 179;

  private static final int LAYOUT_SEARCHPREVIOUSVIEWEDITEM = 180;

  private static final int LAYOUT_SEARCHRESULTITEM = 181;

  private static final int LAYOUT_SEARCHRESULTRVITEM = 182;

  private static final int LAYOUT_SEARCHRESULTUPDATEDUIITEM = 183;

  private static final int LAYOUT_SEARCHSUGGESTIONRECENTRVITEM = 184;

  private static final int LAYOUT_SEARCHTRENDINGUPDATEDUIITEM = 185;

  private static final int LAYOUT_SHIMMERACCOUNTSCREEN = 186;

  private static final int LAYOUT_SHIMMERCOMPARE = 187;

  private static final int LAYOUT_SHIMMERHORIZONTALPRODUCTS = 188;

  private static final int LAYOUT_SHIMMERMANAGEPATIENT = 189;

  private static final int LAYOUT_SHIMMERMEDICINEDETAILS = 190;

  private static final int LAYOUT_SHIMMERMYORDER = 191;

  private static final int LAYOUT_SHIMMERORDERSTATUS = 192;

  private static final int LAYOUT_SHIMMERORDERSUMMARY = 193;

  private static final int LAYOUT_SHIMMERSEARCH = 194;

  private static final int LAYOUT_SHIMMERSEARCHRESULTPAGEWITHITEMINCARD = 195;

  private static final int LAYOUT_SHIMMERWALLET = 196;

  private static final int LAYOUT_SUBCATEGORYCATEGORYTYPEITEM = 197;

  private static final int LAYOUT_SUBCATEGORYTYPEITEM = 198;

  private static final int LAYOUT_SUBSITEM = 199;

  private static final int LAYOUT_SUBSMEDITEM = 200;

  private static final int LAYOUT_SUPERCATEGORYSHOPITEM = 201;

  private static final int LAYOUT_TERMSANDCONDITIONBOTTOMSHEET = 202;

  private static final int LAYOUT_TRENDINGSEARCHITEM = 203;

  private static final int LAYOUT_UPLOADPRESCRIPTIONBOTTOMSHEET = 204;

  private static final int LAYOUT_UPLOADPRESCRIPTIONITEMLAY = 205;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(205);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.activity_add_address, LAYOUT_ACTIVITYADDADDRESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.activity_add_patient, LAYOUT_ACTIVITYADDPATIENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.activity_cancel_order, LAYOUT_ACTIVITYCANCELORDER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.activity_cancel_sub_order, LAYOUT_ACTIVITYCANCELSUBORDER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.activity_cart, LAYOUT_ACTIVITYCART);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.activity_coupon, LAYOUT_ACTIVITYCOUPON);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.activity_delivery_details, LAYOUT_ACTIVITYDELIVERYDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.activity_edit_profile, LAYOUT_ACTIVITYEDITPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.activity_faq_view_all, LAYOUT_ACTIVITYFAQVIEWALL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.activity_health_article_detail, LAYOUT_ACTIVITYHEALTHARTICLEDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.activity_health_articles, LAYOUT_ACTIVITYHEALTHARTICLES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.activity_help, LAYOUT_ACTIVITYHELP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.activity_help_subcategory, LAYOUT_ACTIVITYHELPSUBCATEGORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.activity_help_subcategory_detail, LAYOUT_ACTIVITYHELPSUBCATEGORYDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.activity_home_page, LAYOUT_ACTIVITYHOMEPAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.activity_login, LAYOUT_ACTIVITYLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.activity_manage_address, LAYOUT_ACTIVITYMANAGEADDRESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.activity_manage_patient, LAYOUT_ACTIVITYMANAGEPATIENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.activity_my_orders, LAYOUT_ACTIVITYMYORDERS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.activity_non_active_order_status, LAYOUT_ACTIVITYNONACTIVEORDERSTATUS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.activity_order_status, LAYOUT_ACTIVITYORDERSTATUS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.activity_order_summary, LAYOUT_ACTIVITYORDERSUMMARY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.activity_otc_category, LAYOUT_ACTIVITYOTCCATEGORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.activity_patient_reminder, LAYOUT_ACTIVITYPATIENTREMINDER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.activity_payment, LAYOUT_ACTIVITYPAYMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.activity_payment_option, LAYOUT_ACTIVITYPAYMENTOPTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.activity_payment_status, LAYOUT_ACTIVITYPAYMENTSTATUS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.activity_policies_page, LAYOUT_ACTIVITYPOLICIESPAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.activity_policy_detail, LAYOUT_ACTIVITYPOLICYDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.activity_prescription, LAYOUT_ACTIVITYPRESCRIPTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.activity_product_detail, LAYOUT_ACTIVITYPRODUCTDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.activity_product_list_view_all, LAYOUT_ACTIVITYPRODUCTLISTVIEWALL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.activity_refer_and_earn, LAYOUT_ACTIVITYREFERANDEARN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.activity_return_refund_web, LAYOUT_ACTIVITYRETURNREFUNDWEB);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.activity_search_result, LAYOUT_ACTIVITYSEARCHRESULT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.activity_search_suggestion, LAYOUT_ACTIVITYSEARCHSUGGESTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.activity_splash_screen, LAYOUT_ACTIVITYSPLASHSCREEN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.activity_substitutes, LAYOUT_ACTIVITYSUBSTITUTES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.activity_video_faq, LAYOUT_ACTIVITYVIDEOFAQ);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.activity_wallet, LAYOUT_ACTIVITYWALLET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.activity_wallet_tranasctions, LAYOUT_ACTIVITYWALLETTRANASCTIONS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.activity_web_browser, LAYOUT_ACTIVITYWEBBROWSER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.adapter_addmore_prescription_order_summary, LAYOUT_ADAPTERADDMOREPRESCRIPTIONORDERSUMMARY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.adapter_banner_item, LAYOUT_ADAPTERBANNERITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.adapter_blog_section_item, LAYOUT_ADAPTERBLOGSECTIONITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.adapter_callorder_action_card_item, LAYOUT_ADAPTERCALLORDERACTIONCARDITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.adapter_cart_item, LAYOUT_ADAPTERCARTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.adapter_chips_reminder_item, LAYOUT_ADAPTERCHIPSREMINDERITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.adapter_coupon_item, LAYOUT_ADAPTERCOUPONITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.adapter_doctor_prescription, LAYOUT_ADAPTERDOCTORPRESCRIPTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.adapter_doctor_prescription_order_summary, LAYOUT_ADAPTERDOCTORPRESCRIPTIONORDERSUMMARY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.adapter_footer_item, LAYOUT_ADAPTERFOOTERITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.adapter_homepage_alert_item, LAYOUT_ADAPTERHOMEPAGEALERTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.adapter_modification_item, LAYOUT_ADAPTERMODIFICATIONITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.adapter_order_summary_cart_item, LAYOUT_ADAPTERORDERSUMMARYCARTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.adapter_patient_medicines_chips_item, LAYOUT_ADAPTERPATIENTMEDICINESCHIPSITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.adapter_personal_care_category, LAYOUT_ADAPTERPERSONALCARECATEGORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.adapter_personal_care_product, LAYOUT_ADAPTERPERSONALCAREPRODUCT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.adapter_prescription_action_card_item, LAYOUT_ADAPTERPRESCRIPTIONACTIONCARDITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.adapter_product_card_item, LAYOUT_ADAPTERPRODUCTCARDITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.adapter_product_card_stacked_item, LAYOUT_ADAPTERPRODUCTCARDSTACKEDITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.adapter_reminder, LAYOUT_ADAPTERREMINDER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.adapter_reminder_time_item, LAYOUT_ADAPTERREMINDERTIMEITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.adapter_reorder, LAYOUT_ADAPTERREORDER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.adapter_substitute_info_card_item, LAYOUT_ADAPTERSUBSTITUTEINFOCARDITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.adapter_super_category, LAYOUT_ADAPTERSUPERCATEGORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.adapter_testimonial_section_item, LAYOUT_ADAPTERTESTIMONIALSECTIONITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.adapter_time_interval_item_default, LAYOUT_ADAPTERTIMEINTERVALITEMDEFAULT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.adapter_transaction_item, LAYOUT_ADAPTERTRANSACTIONITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.adapter_view_prescription, LAYOUT_ADAPTERVIEWPRESCRIPTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.author_card_item, LAYOUT_AUTHORCARDITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.banner_viewpager_item, LAYOUT_BANNERVIEWPAGERITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.bottomsheet_alternate_number, LAYOUT_BOTTOMSHEETALTERNATENUMBER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.bottomsheet_apply_coupon, LAYOUT_BOTTOMSHEETAPPLYCOUPON);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.bottomsheet_choose_custom_dates, LAYOUT_BOTTOMSHEETCHOOSECUSTOMDATES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.bottomsheet_choose_time_interval, LAYOUT_BOTTOMSHEETCHOOSETIMEINTERVAL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.bottomsheet_compare_and_understand, LAYOUT_BOTTOMSHEETCOMPAREANDUNDERSTAND);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.bottomsheet_composition_details, LAYOUT_BOTTOMSHEETCOMPOSITIONDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.bottomsheet_coupon_offer, LAYOUT_BOTTOMSHEETCOUPONOFFER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.bottomsheet_detailed_status, LAYOUT_BOTTOMSHEETDETAILEDSTATUS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.bottomsheet_doctor_call, LAYOUT_BOTTOMSHEETDOCTORCALL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.bottomsheet_doctor_call_missed, LAYOUT_BOTTOMSHEETDOCTORCALLMISSED);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.bottomsheet_doctor_fraud, LAYOUT_BOTTOMSHEETDOCTORFRAUD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.bottomsheet_error, LAYOUT_BOTTOMSHEETERROR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.bottomsheet_filter, LAYOUT_BOTTOMSHEETFILTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.bottomsheet_help, LAYOUT_BOTTOMSHEETHELP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.bottomsheet_item_no_longer_available, LAYOUT_BOTTOMSHEETITEMNOLONGERAVAILABLE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.bottomsheet_location, LAYOUT_BOTTOMSHEETLOCATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.bottomsheet_login, LAYOUT_BOTTOMSHEETLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.bottomsheet_modification_item, LAYOUT_BOTTOMSHEETMODIFICATIONITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.bottomsheet_myorder, LAYOUT_BOTTOMSHEETMYORDER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.bottomsheet_payment_carousel, LAYOUT_BOTTOMSHEETPAYMENTCAROUSEL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.bottomsheet_payment_change_selection, LAYOUT_BOTTOMSHEETPAYMENTCHANGESELECTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.bottomsheet_payment_pending, LAYOUT_BOTTOMSHEETPAYMENTPENDING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.bottomsheet_payment_unsuccessful, LAYOUT_BOTTOMSHEETPAYMENTUNSUCCESSFUL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.bottomsheet_privacy_policy, LAYOUT_BOTTOMSHEETPRIVACYPOLICY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.bottomsheet_product_detail, LAYOUT_BOTTOMSHEETPRODUCTDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.bottomsheet_ratings, LAYOUT_BOTTOMSHEETRATINGS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.bottomsheet_remove_unavailable_product, LAYOUT_BOTTOMSHEETREMOVEUNAVAILABLEPRODUCT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.bottomsheet_reorder, LAYOUT_BOTTOMSHEETREORDER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.bottomsheet_reorder_footer, LAYOUT_BOTTOMSHEETREORDERFOOTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.bottomsheet_reorder_header, LAYOUT_BOTTOMSHEETREORDERHEADER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.bottomsheet_reorder_item, LAYOUT_BOTTOMSHEETREORDERITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.bottomsheet_replace_all_company_item, LAYOUT_BOTTOMSHEETREPLACEALLCOMPANYITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.bottomsheet_replace_all_recocommended, LAYOUT_BOTTOMSHEETREPLACEALLRECOCOMMENDED);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.bottomsheet_replace_all_recocommended_item, LAYOUT_BOTTOMSHEETREPLACEALLRECOCOMMENDEDITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.bottomsheet_replacing, LAYOUT_BOTTOMSHEETREPLACING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.bottomsheet_rx_prescription, LAYOUT_BOTTOMSHEETRXPRESCRIPTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.bottomsheet_save_number, LAYOUT_BOTTOMSHEETSAVENUMBER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.bottomsheet_switch_back_og, LAYOUT_BOTTOMSHEETSWITCHBACKOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.bottomsheet_view_bill, LAYOUT_BOTTOMSHEETVIEWBILL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.bottomsheet_view_bill_details, LAYOUT_BOTTOMSHEETVIEWBILLDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.bottomsheet_view_prescription, LAYOUT_BOTTOMSHEETVIEWPRESCRIPTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.brand_type_item, LAYOUT_BRANDTYPEITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.calendar_layout, LAYOUT_CALENDARLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.cancel_order_bottomsheet, LAYOUT_CANCELORDERBOTTOMSHEET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.cancel_order_item, LAYOUT_CANCELORDERITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.category_shop_item, LAYOUT_CATEGORYSHOPITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.category_type_item, LAYOUT_CATEGORYTYPEITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.composition_bottomsheet_item, LAYOUT_COMPOSITIONBOTTOMSHEETITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.delete_image_bottom_sheet, LAYOUT_DELETEIMAGEBOTTOMSHEET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.delivery_details_patient_item, LAYOUT_DELIVERYDETAILSPATIENTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.dialog_coupon_error, LAYOUT_DIALOGCOUPONERROR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.dialog_coupon_saving, LAYOUT_DIALOGCOUPONSAVING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.dialog_coupon_suceess, LAYOUT_DIALOGCOUPONSUCEESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.dialog_rating_submitted, LAYOUT_DIALOGRATINGSUBMITTED);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.dialog_replace_savings, LAYOUT_DIALOGREPLACESAVINGS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.dialog_rounded_corner, LAYOUT_DIALOGROUNDEDCORNER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.dialog_rx_coupon_suceess, LAYOUT_DIALOGRXCOUPONSUCEESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.do_not_have_bottomsheet, LAYOUT_DONOTHAVEBOTTOMSHEET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.edit_delete_bottomsheet, LAYOUT_EDITDELETEBOTTOMSHEET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.fragment_account, LAYOUT_FRAGMENTACCOUNT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.fragment_bottom_sheet, LAYOUT_FRAGMENTBOTTOMSHEET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.fragment_edit_reminder, LAYOUT_FRAGMENTEDITREMINDER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.fragment_login_mobile_number, LAYOUT_FRAGMENTLOGINMOBILENUMBER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.fragment_login_otp, LAYOUT_FRAGMENTLOGINOTP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.fragment_logout_bottom_sheet, LAYOUT_FRAGMENTLOGOUTBOTTOMSHEET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.fragment_my_referrals, LAYOUT_FRAGMENTMYREFERRALS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.fragment_orders, LAYOUT_FRAGMENTORDERS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.fragment_org_sub_compare, LAYOUT_FRAGMENTORGSUBCOMPARE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.fragment_product_detail, LAYOUT_FRAGMENTPRODUCTDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.fragment_refer_and_earn, LAYOUT_FRAGMENTREFERANDEARN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.fragment_refer_now, LAYOUT_FRAGMENTREFERNOW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.fragment_reminder_alert, LAYOUT_FRAGMENTREMINDERALERT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.fragment_reminder_bottom_sheet, LAYOUT_FRAGMENTREMINDERBOTTOMSHEET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.fragment_reminder_delete, LAYOUT_FRAGMENTREMINDERDELETE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.fragment_remove_product_bottom_sheet, LAYOUT_FRAGMENTREMOVEPRODUCTBOTTOMSHEET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.fragment_replace_bottom_sheet, LAYOUT_FRAGMENTREPLACEBOTTOMSHEET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.fragment_subs_bottom_sheet, LAYOUT_FRAGMENTSUBSBOTTOMSHEET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.health_article_bottomsheet, LAYOUT_HEALTHARTICLEBOTTOMSHEET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.health_article_bottomsheet_item, LAYOUT_HEALTHARTICLEBOTTOMSHEETITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.health_article_chip_item, LAYOUT_HEALTHARTICLECHIPITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.health_articles_item, LAYOUT_HEALTHARTICLESITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.help_category_item, LAYOUT_HELPCATEGORYITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.help_subcategory_item, LAYOUT_HELPSUBCATEGORYITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.home_adapter_item, LAYOUT_HOMEADAPTERITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.item_tab_account, LAYOUT_ITEMTABACCOUNT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.item_video_p2, LAYOUT_ITEMVIDEOP2);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.item_video_vertical_p2, LAYOUT_ITEMVIDEOVERTICALP2);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.login_banner_item, LAYOUT_LOGINBANNERITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.manage_address_card_item, LAYOUT_MANAGEADDRESSCARDITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.manage_patient_item, LAYOUT_MANAGEPATIENTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.my_orders_item, LAYOUT_MYORDERSITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.opt_for_subs_bottom_sheet, LAYOUT_OPTFORSUBSBOTTOMSHEET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.order_type_item, LAYOUT_ORDERTYPEITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.past_prescription_all_patient_item, LAYOUT_PASTPRESCRIPTIONALLPATIENTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.past_prescription_bottomsheet, LAYOUT_PASTPRESCRIPTIONBOTTOMSHEET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.past_prescription_details, LAYOUT_PASTPRESCRIPTIONDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.patient_type_item, LAYOUT_PATIENTTYPEITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.payment_options_list_item, LAYOUT_PAYMENTOPTIONSLISTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.prescription_details, LAYOUT_PRESCRIPTIONDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.privacy_policy_bottomsheet, LAYOUT_PRIVACYPOLICYBOTTOMSHEET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.product_list_view_all_item, LAYOUT_PRODUCTLISTVIEWALLITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.progress_bar_item, LAYOUT_PROGRESSBARITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.reminder_item, LAYOUT_REMINDERITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.res_patient_item, LAYOUT_RESPATIENTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.rv_otc_item, LAYOUT_RVOTCITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.saved_address_item, LAYOUT_SAVEDADDRESSITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.search_previous_viewed_item, LAYOUT_SEARCHPREVIOUSVIEWEDITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.search_result_item, LAYOUT_SEARCHRESULTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.search_result_rv_item, LAYOUT_SEARCHRESULTRVITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.search_result_updated_ui_item, LAYOUT_SEARCHRESULTUPDATEDUIITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.search_suggestion_recent_rv_item, LAYOUT_SEARCHSUGGESTIONRECENTRVITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.search_trending_updated_ui_item, LAYOUT_SEARCHTRENDINGUPDATEDUIITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.shimmer_account_screen, LAYOUT_SHIMMERACCOUNTSCREEN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.shimmer_compare, LAYOUT_SHIMMERCOMPARE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.shimmer_horizontal_products, LAYOUT_SHIMMERHORIZONTALPRODUCTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.shimmer_manage_patient, LAYOUT_SHIMMERMANAGEPATIENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.shimmer_medicine_details, LAYOUT_SHIMMERMEDICINEDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.shimmer_my_order, LAYOUT_SHIMMERMYORDER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.shimmer_order_status, LAYOUT_SHIMMERORDERSTATUS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.shimmer_order_summary, LAYOUT_SHIMMERORDERSUMMARY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.shimmer_search, LAYOUT_SHIMMERSEARCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.shimmer_search_result_page_with_item_in_card, LAYOUT_SHIMMERSEARCHRESULTPAGEWITHITEMINCARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.shimmer_wallet, LAYOUT_SHIMMERWALLET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.sub_category_category_type_item, LAYOUT_SUBCATEGORYCATEGORYTYPEITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.sub_category_type_item, LAYOUT_SUBCATEGORYTYPEITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.subs_item, LAYOUT_SUBSITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.subs_med_item, LAYOUT_SUBSMEDITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.super_category_shop_item, LAYOUT_SUPERCATEGORYSHOPITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.terms_and_condition_bottomsheet, LAYOUT_TERMSANDCONDITIONBOTTOMSHEET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.trending_search_item, LAYOUT_TRENDINGSEARCHITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.upload_prescription_bottomsheet, LAYOUT_UPLOADPRESCRIPTIONBOTTOMSHEET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellihealth.truemeds.R.layout.upload_prescription_item_lay, LAYOUT_UPLOADPRESCRIPTIONITEMLAY);
  }

  private final ViewDataBinding internalGetViewDataBinding0(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
      case  LAYOUT_ACTIVITYADDADDRESS: {
        if ("layout/activity_add_address_0".equals(tag)) {
          return new ActivityAddAddressBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_add_address is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYADDPATIENT: {
        if ("layout/activity_add_patient_0".equals(tag)) {
          return new ActivityAddPatientBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_add_patient is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYCANCELORDER: {
        if ("layout/activity_cancel_order_0".equals(tag)) {
          return new ActivityCancelOrderBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_cancel_order is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYCANCELSUBORDER: {
        if ("layout/activity_cancel_sub_order_0".equals(tag)) {
          return new ActivityCancelSubOrderBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_cancel_sub_order is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYCART: {
        if ("layout/activity_cart_0".equals(tag)) {
          return new ActivityCartBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_cart is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYCOUPON: {
        if ("layout/activity_coupon_0".equals(tag)) {
          return new ActivityCouponBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_coupon is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYDELIVERYDETAILS: {
        if ("layout/activity_delivery_details_0".equals(tag)) {
          return new ActivityDeliveryDetailsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_delivery_details is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYEDITPROFILE: {
        if ("layout/activity_edit_profile_0".equals(tag)) {
          return new ActivityEditProfileBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_edit_profile is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYFAQVIEWALL: {
        if ("layout/activity_faq_view_all_0".equals(tag)) {
          return new ActivityFaqViewAllBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_faq_view_all is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYHEALTHARTICLEDETAIL: {
        if ("layout/activity_health_article_detail_0".equals(tag)) {
          return new ActivityHealthArticleDetailBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_health_article_detail is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYHEALTHARTICLES: {
        if ("layout/activity_health_articles_0".equals(tag)) {
          return new ActivityHealthArticlesBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_health_articles is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYHELP: {
        if ("layout/activity_help_0".equals(tag)) {
          return new ActivityHelpBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_help is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYHELPSUBCATEGORY: {
        if ("layout/activity_help_subcategory_0".equals(tag)) {
          return new ActivityHelpSubcategoryBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_help_subcategory is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYHELPSUBCATEGORYDETAIL: {
        if ("layout/activity_help_subcategory_detail_0".equals(tag)) {
          return new ActivityHelpSubcategoryDetailBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_help_subcategory_detail is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYHOMEPAGE: {
        if ("layout/activity_home_page_0".equals(tag)) {
          return new ActivityHomePageBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_home_page is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYLOGIN: {
        if ("layout/activity_login_0".equals(tag)) {
          return new ActivityLoginBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_login is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYMANAGEADDRESS: {
        if ("layout/activity_manage_address_0".equals(tag)) {
          return new ActivityManageAddressBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_manage_address is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYMANAGEPATIENT: {
        if ("layout/activity_manage_patient_0".equals(tag)) {
          return new ActivityManagePatientBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_manage_patient is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYMYORDERS: {
        if ("layout/activity_my_orders_0".equals(tag)) {
          return new ActivityMyOrdersBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_my_orders is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYNONACTIVEORDERSTATUS: {
        if ("layout/activity_non_active_order_status_0".equals(tag)) {
          return new ActivityNonActiveOrderStatusBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_non_active_order_status is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYORDERSTATUS: {
        if ("layout/activity_order_status_0".equals(tag)) {
          return new ActivityOrderStatusBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_order_status is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYORDERSUMMARY: {
        if ("layout/activity_order_summary_0".equals(tag)) {
          return new ActivityOrderSummaryBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_order_summary is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYOTCCATEGORY: {
        if ("layout/activity_otc_category_0".equals(tag)) {
          return new ActivityOtcCategoryBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_otc_category is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYPATIENTREMINDER: {
        if ("layout/activity_patient_reminder_0".equals(tag)) {
          return new ActivityPatientReminderBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_patient_reminder is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYPAYMENT: {
        if ("layout/activity_payment_0".equals(tag)) {
          return new ActivityPaymentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_payment is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYPAYMENTOPTION: {
        if ("layout/activity_payment_option_0".equals(tag)) {
          return new ActivityPaymentOptionBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_payment_option is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYPAYMENTSTATUS: {
        if ("layout/activity_payment_status_0".equals(tag)) {
          return new ActivityPaymentStatusBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_payment_status is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYPOLICIESPAGE: {
        if ("layout/activity_policies_page_0".equals(tag)) {
          return new ActivityPoliciesPageBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_policies_page is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYPOLICYDETAIL: {
        if ("layout/activity_policy_detail_0".equals(tag)) {
          return new ActivityPolicyDetailBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_policy_detail is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYPRESCRIPTION: {
        if ("layout/activity_prescription_0".equals(tag)) {
          return new ActivityPrescriptionBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_prescription is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYPRODUCTDETAIL: {
        if ("layout/activity_product_detail_0".equals(tag)) {
          return new ActivityProductDetailBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_product_detail is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYPRODUCTLISTVIEWALL: {
        if ("layout/activity_product_list_view_all_0".equals(tag)) {
          return new ActivityProductListViewAllBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_product_list_view_all is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYREFERANDEARN: {
        if ("layout/activity_refer_and_earn_0".equals(tag)) {
          return new ActivityReferAndEarnBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_refer_and_earn is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYRETURNREFUNDWEB: {
        if ("layout/activity_return_refund_web_0".equals(tag)) {
          return new ActivityReturnRefundWebBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_return_refund_web is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYSEARCHRESULT: {
        if ("layout/activity_search_result_0".equals(tag)) {
          return new ActivitySearchResultBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_search_result is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYSEARCHSUGGESTION: {
        if ("layout/activity_search_suggestion_0".equals(tag)) {
          return new ActivitySearchSuggestionBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_search_suggestion is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYSPLASHSCREEN: {
        if ("layout/activity_splash_screen_0".equals(tag)) {
          return new ActivitySplashScreenBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_splash_screen is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYSUBSTITUTES: {
        if ("layout/activity_substitutes_0".equals(tag)) {
          return new ActivitySubstitutesBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_substitutes is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYVIDEOFAQ: {
        if ("layout/activity_video_faq_0".equals(tag)) {
          return new ActivityVideoFaqBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_video_faq is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYWALLET: {
        if ("layout/activity_wallet_0".equals(tag)) {
          return new ActivityWalletBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_wallet is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYWALLETTRANASCTIONS: {
        if ("layout/activity_wallet_tranasctions_0".equals(tag)) {
          return new ActivityWalletTranasctionsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_wallet_tranasctions is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYWEBBROWSER: {
        if ("layout/activity_web_browser_0".equals(tag)) {
          return new ActivityWebBrowserBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_web_browser is invalid. Received: " + tag);
      }
      case  LAYOUT_ADAPTERADDMOREPRESCRIPTIONORDERSUMMARY: {
        if ("layout/adapter_addmore_prescription_order_summary_0".equals(tag)) {
          return new AdapterAddmorePrescriptionOrderSummaryBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for adapter_addmore_prescription_order_summary is invalid. Received: " + tag);
      }
      case  LAYOUT_ADAPTERBANNERITEM: {
        if ("layout/adapter_banner_item_0".equals(tag)) {
          return new AdapterBannerItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for adapter_banner_item is invalid. Received: " + tag);
      }
      case  LAYOUT_ADAPTERBLOGSECTIONITEM: {
        if ("layout/adapter_blog_section_item_0".equals(tag)) {
          return new AdapterBlogSectionItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for adapter_blog_section_item is invalid. Received: " + tag);
      }
      case  LAYOUT_ADAPTERCALLORDERACTIONCARDITEM: {
        if ("layout/adapter_callorder_action_card_item_0".equals(tag)) {
          return new AdapterCallorderActionCardItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for adapter_callorder_action_card_item is invalid. Received: " + tag);
      }
      case  LAYOUT_ADAPTERCARTITEM: {
        if ("layout/adapter_cart_item_0".equals(tag)) {
          return new AdapterCartItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for adapter_cart_item is invalid. Received: " + tag);
      }
      case  LAYOUT_ADAPTERCHIPSREMINDERITEM: {
        if ("layout/adapter_chips_reminder_item_0".equals(tag)) {
          return new AdapterChipsReminderItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for adapter_chips_reminder_item is invalid. Received: " + tag);
      }
      case  LAYOUT_ADAPTERCOUPONITEM: {
        if ("layout/adapter_coupon_item_0".equals(tag)) {
          return new AdapterCouponItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for adapter_coupon_item is invalid. Received: " + tag);
      }
      case  LAYOUT_ADAPTERDOCTORPRESCRIPTION: {
        if ("layout/adapter_doctor_prescription_0".equals(tag)) {
          return new AdapterDoctorPrescriptionBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for adapter_doctor_prescription is invalid. Received: " + tag);
      }
    }
    return null;
  }

  private final ViewDataBinding internalGetViewDataBinding1(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
      case  LAYOUT_ADAPTERDOCTORPRESCRIPTIONORDERSUMMARY: {
        if ("layout/adapter_doctor_prescription_order_summary_0".equals(tag)) {
          return new AdapterDoctorPrescriptionOrderSummaryBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for adapter_doctor_prescription_order_summary is invalid. Received: " + tag);
      }
      case  LAYOUT_ADAPTERFOOTERITEM: {
        if ("layout/adapter_footer_item_0".equals(tag)) {
          return new AdapterFooterItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for adapter_footer_item is invalid. Received: " + tag);
      }
      case  LAYOUT_ADAPTERHOMEPAGEALERTITEM: {
        if ("layout/adapter_homepage_alert_item_0".equals(tag)) {
          return new AdapterHomepageAlertItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for adapter_homepage_alert_item is invalid. Received: " + tag);
      }
      case  LAYOUT_ADAPTERMODIFICATIONITEM: {
        if ("layout/adapter_modification_item_0".equals(tag)) {
          return new AdapterModificationItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for adapter_modification_item is invalid. Received: " + tag);
      }
      case  LAYOUT_ADAPTERORDERSUMMARYCARTITEM: {
        if ("layout/adapter_order_summary_cart_item_0".equals(tag)) {
          return new AdapterOrderSummaryCartItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for adapter_order_summary_cart_item is invalid. Received: " + tag);
      }
      case  LAYOUT_ADAPTERPATIENTMEDICINESCHIPSITEM: {
        if ("layout/adapter_patient_medicines_chips_item_0".equals(tag)) {
          return new AdapterPatientMedicinesChipsItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for adapter_patient_medicines_chips_item is invalid. Received: " + tag);
      }
      case  LAYOUT_ADAPTERPERSONALCARECATEGORY: {
        if ("layout/adapter_personal_care_category_0".equals(tag)) {
          return new AdapterPersonalCareCategoryBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for adapter_personal_care_category is invalid. Received: " + tag);
      }
      case  LAYOUT_ADAPTERPERSONALCAREPRODUCT: {
        if ("layout/adapter_personal_care_product_0".equals(tag)) {
          return new AdapterPersonalCareProductBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for adapter_personal_care_product is invalid. Received: " + tag);
      }
      case  LAYOUT_ADAPTERPRESCRIPTIONACTIONCARDITEM: {
        if ("layout/adapter_prescription_action_card_item_0".equals(tag)) {
          return new AdapterPrescriptionActionCardItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for adapter_prescription_action_card_item is invalid. Received: " + tag);
      }
      case  LAYOUT_ADAPTERPRODUCTCARDITEM: {
        if ("layout/adapter_product_card_item_0".equals(tag)) {
          return new AdapterProductCardItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for adapter_product_card_item is invalid. Received: " + tag);
      }
      case  LAYOUT_ADAPTERPRODUCTCARDSTACKEDITEM: {
        if ("layout/adapter_product_card_stacked_item_0".equals(tag)) {
          return new AdapterProductCardStackedItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for adapter_product_card_stacked_item is invalid. Received: " + tag);
      }
      case  LAYOUT_ADAPTERREMINDER: {
        if ("layout/adapter_reminder_0".equals(tag)) {
          return new AdapterReminderBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for adapter_reminder is invalid. Received: " + tag);
      }
      case  LAYOUT_ADAPTERREMINDERTIMEITEM: {
        if ("layout/adapter_reminder_time_item_0".equals(tag)) {
          return new AdapterReminderTimeItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for adapter_reminder_time_item is invalid. Received: " + tag);
      }
      case  LAYOUT_ADAPTERREORDER: {
        if ("layout/adapter_reorder_0".equals(tag)) {
          return new AdapterReorderBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for adapter_reorder is invalid. Received: " + tag);
      }
      case  LAYOUT_ADAPTERSUBSTITUTEINFOCARDITEM: {
        if ("layout/adapter_substitute_info_card_item_0".equals(tag)) {
          return new AdapterSubstituteInfoCardItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for adapter_substitute_info_card_item is invalid. Received: " + tag);
      }
      case  LAYOUT_ADAPTERSUPERCATEGORY: {
        if ("layout/adapter_super_category_0".equals(tag)) {
          return new AdapterSuperCategoryBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for adapter_super_category is invalid. Received: " + tag);
      }
      case  LAYOUT_ADAPTERTESTIMONIALSECTIONITEM: {
        if ("layout/adapter_testimonial_section_item_0".equals(tag)) {
          return new AdapterTestimonialSectionItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for adapter_testimonial_section_item is invalid. Received: " + tag);
      }
      case  LAYOUT_ADAPTERTIMEINTERVALITEMDEFAULT: {
        if ("layout/adapter_time_interval_item_default_0".equals(tag)) {
          return new AdapterTimeIntervalItemDefaultBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for adapter_time_interval_item_default is invalid. Received: " + tag);
      }
      case  LAYOUT_ADAPTERTRANSACTIONITEM: {
        if ("layout/adapter_transaction_item_0".equals(tag)) {
          return new AdapterTransactionItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for adapter_transaction_item is invalid. Received: " + tag);
      }
      case  LAYOUT_ADAPTERVIEWPRESCRIPTION: {
        if ("layout/adapter_view_prescription_0".equals(tag)) {
          return new AdapterViewPrescriptionBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for adapter_view_prescription is invalid. Received: " + tag);
      }
      case  LAYOUT_AUTHORCARDITEM: {
        if ("layout/author_card_item_0".equals(tag)) {
          return new AuthorCardItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for author_card_item is invalid. Received: " + tag);
      }
      case  LAYOUT_BANNERVIEWPAGERITEM: {
        if ("layout/banner_viewpager_item_0".equals(tag)) {
          return new BannerViewpagerItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for banner_viewpager_item is invalid. Received: " + tag);
      }
      case  LAYOUT_BOTTOMSHEETALTERNATENUMBER: {
        if ("layout/bottomsheet_alternate_number_0".equals(tag)) {
          return new BottomsheetAlternateNumberBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for bottomsheet_alternate_number is invalid. Received: " + tag);
      }
      case  LAYOUT_BOTTOMSHEETAPPLYCOUPON: {
        if ("layout/bottomsheet_apply_coupon_0".equals(tag)) {
          return new BottomsheetApplyCouponBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for bottomsheet_apply_coupon is invalid. Received: " + tag);
      }
      case  LAYOUT_BOTTOMSHEETCHOOSECUSTOMDATES: {
        if ("layout/bottomsheet_choose_custom_dates_0".equals(tag)) {
          return new BottomsheetChooseCustomDatesBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for bottomsheet_choose_custom_dates is invalid. Received: " + tag);
      }
      case  LAYOUT_BOTTOMSHEETCHOOSETIMEINTERVAL: {
        if ("layout/bottomsheet_choose_time_interval_0".equals(tag)) {
          return new BottomsheetChooseTimeIntervalBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for bottomsheet_choose_time_interval is invalid. Received: " + tag);
      }
      case  LAYOUT_BOTTOMSHEETCOMPAREANDUNDERSTAND: {
        if ("layout/bottomsheet_compare_and_understand_0".equals(tag)) {
          return new BottomsheetCompareAndUnderstandBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for bottomsheet_compare_and_understand is invalid. Received: " + tag);
      }
      case  LAYOUT_BOTTOMSHEETCOMPOSITIONDETAILS: {
        if ("layout/bottomsheet_composition_details_0".equals(tag)) {
          return new BottomsheetCompositionDetailsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for bottomsheet_composition_details is invalid. Received: " + tag);
      }
      case  LAYOUT_BOTTOMSHEETCOUPONOFFER: {
        if ("layout/bottomsheet_coupon_offer_0".equals(tag)) {
          return new BottomsheetCouponOfferBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for bottomsheet_coupon_offer is invalid. Received: " + tag);
      }
      case  LAYOUT_BOTTOMSHEETDETAILEDSTATUS: {
        if ("layout/bottomsheet_detailed_status_0".equals(tag)) {
          return new BottomsheetDetailedStatusBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for bottomsheet_detailed_status is invalid. Received: " + tag);
      }
      case  LAYOUT_BOTTOMSHEETDOCTORCALL: {
        if ("layout/bottomsheet_doctor_call_0".equals(tag)) {
          return new BottomsheetDoctorCallBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for bottomsheet_doctor_call is invalid. Received: " + tag);
      }
      case  LAYOUT_BOTTOMSHEETDOCTORCALLMISSED: {
        if ("layout/bottomsheet_doctor_call_missed_0".equals(tag)) {
          return new BottomsheetDoctorCallMissedBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for bottomsheet_doctor_call_missed is invalid. Received: " + tag);
      }
      case  LAYOUT_BOTTOMSHEETDOCTORFRAUD: {
        if ("layout/bottomsheet_doctor_fraud_0".equals(tag)) {
          return new BottomsheetDoctorFraudBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for bottomsheet_doctor_fraud is invalid. Received: " + tag);
      }
      case  LAYOUT_BOTTOMSHEETERROR: {
        if ("layout/bottomsheet_error_0".equals(tag)) {
          return new BottomsheetErrorBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for bottomsheet_error is invalid. Received: " + tag);
      }
      case  LAYOUT_BOTTOMSHEETFILTER: {
        if ("layout/bottomsheet_filter_0".equals(tag)) {
          return new BottomsheetFilterBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for bottomsheet_filter is invalid. Received: " + tag);
      }
      case  LAYOUT_BOTTOMSHEETHELP: {
        if ("layout/bottomsheet_help_0".equals(tag)) {
          return new BottomsheetHelpBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for bottomsheet_help is invalid. Received: " + tag);
      }
      case  LAYOUT_BOTTOMSHEETITEMNOLONGERAVAILABLE: {
        if ("layout/bottomsheet_item_no_longer_available_0".equals(tag)) {
          return new BottomsheetItemNoLongerAvailableBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for bottomsheet_item_no_longer_available is invalid. Received: " + tag);
      }
      case  LAYOUT_BOTTOMSHEETLOCATION: {
        if ("layout/bottomsheet_location_0".equals(tag)) {
          return new BottomsheetLocationBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for bottomsheet_location is invalid. Received: " + tag);
      }
      case  LAYOUT_BOTTOMSHEETLOGIN: {
        if ("layout/bottomsheet_login_0".equals(tag)) {
          return new BottomsheetLoginBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for bottomsheet_login is invalid. Received: " + tag);
      }
      case  LAYOUT_BOTTOMSHEETMODIFICATIONITEM: {
        if ("layout/bottomsheet_modification_item_0".equals(tag)) {
          return new BottomsheetModificationItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for bottomsheet_modification_item is invalid. Received: " + tag);
      }
      case  LAYOUT_BOTTOMSHEETMYORDER: {
        if ("layout/bottomsheet_myorder_0".equals(tag)) {
          return new BottomsheetMyorderBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for bottomsheet_myorder is invalid. Received: " + tag);
      }
      case  LAYOUT_BOTTOMSHEETPAYMENTCAROUSEL: {
        if ("layout/bottomsheet_payment_carousel_0".equals(tag)) {
          return new BottomsheetPaymentCarouselBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for bottomsheet_payment_carousel is invalid. Received: " + tag);
      }
      case  LAYOUT_BOTTOMSHEETPAYMENTCHANGESELECTION: {
        if ("layout/bottomsheet_payment_change_selection_0".equals(tag)) {
          return new BottomsheetPaymentChangeSelectionBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for bottomsheet_payment_change_selection is invalid. Received: " + tag);
      }
      case  LAYOUT_BOTTOMSHEETPAYMENTPENDING: {
        if ("layout/bottomsheet_payment_pending_0".equals(tag)) {
          return new BottomsheetPaymentPendingBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for bottomsheet_payment_pending is invalid. Received: " + tag);
      }
      case  LAYOUT_BOTTOMSHEETPAYMENTUNSUCCESSFUL: {
        if ("layout/bottomsheet_payment_unsuccessful_0".equals(tag)) {
          return new BottomsheetPaymentUnsuccessfulBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for bottomsheet_payment_unsuccessful is invalid. Received: " + tag);
      }
      case  LAYOUT_BOTTOMSHEETPRIVACYPOLICY: {
        if ("layout/bottomsheet_privacy_policy_0".equals(tag)) {
          return new BottomsheetPrivacyPolicyBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for bottomsheet_privacy_policy is invalid. Received: " + tag);
      }
      case  LAYOUT_BOTTOMSHEETPRODUCTDETAIL: {
        if ("layout/bottomsheet_product_detail_0".equals(tag)) {
          return new BottomsheetProductDetailBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for bottomsheet_product_detail is invalid. Received: " + tag);
      }
      case  LAYOUT_BOTTOMSHEETRATINGS: {
        if ("layout/bottomsheet_ratings_0".equals(tag)) {
          return new BottomsheetRatingsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for bottomsheet_ratings is invalid. Received: " + tag);
      }
      case  LAYOUT_BOTTOMSHEETREMOVEUNAVAILABLEPRODUCT: {
        if ("layout/bottomsheet_remove_unavailable_product_0".equals(tag)) {
          return new BottomsheetRemoveUnavailableProductBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for bottomsheet_remove_unavailable_product is invalid. Received: " + tag);
      }
      case  LAYOUT_BOTTOMSHEETREORDER: {
        if ("layout/bottomsheet_reorder_0".equals(tag)) {
          return new BottomsheetReorderBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for bottomsheet_reorder is invalid. Received: " + tag);
      }
    }
    return null;
  }

  private final ViewDataBinding internalGetViewDataBinding2(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
      case  LAYOUT_BOTTOMSHEETREORDERFOOTER: {
        if ("layout/bottomsheet_reorder_footer_0".equals(tag)) {
          return new BottomsheetReorderFooterBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for bottomsheet_reorder_footer is invalid. Received: " + tag);
      }
      case  LAYOUT_BOTTOMSHEETREORDERHEADER: {
        if ("layout/bottomsheet_reorder_header_0".equals(tag)) {
          return new BottomsheetReorderHeaderBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for bottomsheet_reorder_header is invalid. Received: " + tag);
      }
      case  LAYOUT_BOTTOMSHEETREORDERITEM: {
        if ("layout/bottomsheet_reorder_item_0".equals(tag)) {
          return new BottomsheetReorderItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for bottomsheet_reorder_item is invalid. Received: " + tag);
      }
      case  LAYOUT_BOTTOMSHEETREPLACEALLCOMPANYITEM: {
        if ("layout/bottomsheet_replace_all_company_item_0".equals(tag)) {
          return new BottomsheetReplaceAllCompanyItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for bottomsheet_replace_all_company_item is invalid. Received: " + tag);
      }
      case  LAYOUT_BOTTOMSHEETREPLACEALLRECOCOMMENDED: {
        if ("layout/bottomsheet_replace_all_recocommended_0".equals(tag)) {
          return new BottomsheetReplaceAllRecocommendedBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for bottomsheet_replace_all_recocommended is invalid. Received: " + tag);
      }
      case  LAYOUT_BOTTOMSHEETREPLACEALLRECOCOMMENDEDITEM: {
        if ("layout/bottomsheet_replace_all_recocommended_item_0".equals(tag)) {
          return new BottomsheetReplaceAllRecocommendedItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for bottomsheet_replace_all_recocommended_item is invalid. Received: " + tag);
      }
      case  LAYOUT_BOTTOMSHEETREPLACING: {
        if ("layout/bottomsheet_replacing_0".equals(tag)) {
          return new BottomsheetReplacingBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for bottomsheet_replacing is invalid. Received: " + tag);
      }
      case  LAYOUT_BOTTOMSHEETRXPRESCRIPTION: {
        if ("layout/bottomsheet_rx_prescription_0".equals(tag)) {
          return new BottomsheetRxPrescriptionBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for bottomsheet_rx_prescription is invalid. Received: " + tag);
      }
      case  LAYOUT_BOTTOMSHEETSAVENUMBER: {
        if ("layout/bottomsheet_save_number_0".equals(tag)) {
          return new BottomsheetSaveNumberBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for bottomsheet_save_number is invalid. Received: " + tag);
      }
      case  LAYOUT_BOTTOMSHEETSWITCHBACKOG: {
        if ("layout/bottomsheet_switch_back_og_0".equals(tag)) {
          return new BottomsheetSwitchBackOgBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for bottomsheet_switch_back_og is invalid. Received: " + tag);
      }
      case  LAYOUT_BOTTOMSHEETVIEWBILL: {
        if ("layout/bottomsheet_view_bill_0".equals(tag)) {
          return new BottomsheetViewBillBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for bottomsheet_view_bill is invalid. Received: " + tag);
      }
      case  LAYOUT_BOTTOMSHEETVIEWBILLDETAILS: {
        if ("layout/bottomsheet_view_bill_details_0".equals(tag)) {
          return new BottomsheetViewBillDetailsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for bottomsheet_view_bill_details is invalid. Received: " + tag);
      }
      case  LAYOUT_BOTTOMSHEETVIEWPRESCRIPTION: {
        if ("layout/bottomsheet_view_prescription_0".equals(tag)) {
          return new BottomsheetViewPrescriptionBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for bottomsheet_view_prescription is invalid. Received: " + tag);
      }
      case  LAYOUT_BRANDTYPEITEM: {
        if ("layout/brand_type_item_0".equals(tag)) {
          return new BrandTypeItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for brand_type_item is invalid. Received: " + tag);
      }
      case  LAYOUT_CALENDARLAYOUT: {
        if ("layout/calendar_layout_0".equals(tag)) {
          return new CalendarLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for calendar_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_CANCELORDERBOTTOMSHEET: {
        if ("layout/cancel_order_bottomsheet_0".equals(tag)) {
          return new CancelOrderBottomsheetBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for cancel_order_bottomsheet is invalid. Received: " + tag);
      }
      case  LAYOUT_CANCELORDERITEM: {
        if ("layout/cancel_order_item_0".equals(tag)) {
          return new CancelOrderItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for cancel_order_item is invalid. Received: " + tag);
      }
      case  LAYOUT_CATEGORYSHOPITEM: {
        if ("layout/category_shop_item_0".equals(tag)) {
          return new CategoryShopItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for category_shop_item is invalid. Received: " + tag);
      }
      case  LAYOUT_CATEGORYTYPEITEM: {
        if ("layout/category_type_item_0".equals(tag)) {
          return new CategoryTypeItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for category_type_item is invalid. Received: " + tag);
      }
      case  LAYOUT_COMPOSITIONBOTTOMSHEETITEM: {
        if ("layout/composition_bottomsheet_item_0".equals(tag)) {
          return new CompositionBottomsheetItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for composition_bottomsheet_item is invalid. Received: " + tag);
      }
      case  LAYOUT_DELETEIMAGEBOTTOMSHEET: {
        if ("layout/delete_image_bottom_sheet_0".equals(tag)) {
          return new DeleteImageBottomSheetBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for delete_image_bottom_sheet is invalid. Received: " + tag);
      }
      case  LAYOUT_DELIVERYDETAILSPATIENTITEM: {
        if ("layout/delivery_details_patient_item_0".equals(tag)) {
          return new DeliveryDetailsPatientItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for delivery_details_patient_item is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGCOUPONERROR: {
        if ("layout/dialog_coupon_error_0".equals(tag)) {
          return new DialogCouponErrorBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_coupon_error is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGCOUPONSAVING: {
        if ("layout/dialog_coupon_saving_0".equals(tag)) {
          return new DialogCouponSavingBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_coupon_saving is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGCOUPONSUCEESS: {
        if ("layout/dialog_coupon_suceess_0".equals(tag)) {
          return new DialogCouponSuceessBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_coupon_suceess is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGRATINGSUBMITTED: {
        if ("layout/dialog_rating_submitted_0".equals(tag)) {
          return new DialogRatingSubmittedBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_rating_submitted is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGREPLACESAVINGS: {
        if ("layout/dialog_replace_savings_0".equals(tag)) {
          return new DialogReplaceSavingsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_replace_savings is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGROUNDEDCORNER: {
        if ("layout/dialog_rounded_corner_0".equals(tag)) {
          return new DialogRoundedCornerBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_rounded_corner is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGRXCOUPONSUCEESS: {
        if ("layout/dialog_rx_coupon_suceess_0".equals(tag)) {
          return new DialogRxCouponSuceessBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_rx_coupon_suceess is invalid. Received: " + tag);
      }
      case  LAYOUT_DONOTHAVEBOTTOMSHEET: {
        if ("layout/do_not_have_bottomsheet_0".equals(tag)) {
          return new DoNotHaveBottomsheetBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for do_not_have_bottomsheet is invalid. Received: " + tag);
      }
      case  LAYOUT_EDITDELETEBOTTOMSHEET: {
        if ("layout/edit_delete_bottomsheet_0".equals(tag)) {
          return new EditDeleteBottomsheetBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for edit_delete_bottomsheet is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTACCOUNT: {
        if ("layout/fragment_account_0".equals(tag)) {
          return new FragmentAccountBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_account is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTBOTTOMSHEET: {
        if ("layout/fragment_bottom_sheet_0".equals(tag)) {
          return new FragmentBottomSheetBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_bottom_sheet is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTEDITREMINDER: {
        if ("layout/fragment_edit_reminder_0".equals(tag)) {
          return new FragmentEditReminderBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_edit_reminder is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTHOME: {
        if ("layout/fragment_home_0".equals(tag)) {
          return new FragmentHomeBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTLOGINMOBILENUMBER: {
        if ("layout/fragment_login_mobile_number_0".equals(tag)) {
          return new FragmentLoginMobileNumberBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_login_mobile_number is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTLOGINOTP: {
        if ("layout/fragment_login_otp_0".equals(tag)) {
          return new FragmentLoginOtpBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_login_otp is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTLOGOUTBOTTOMSHEET: {
        if ("layout/fragment_logout_bottom_sheet_0".equals(tag)) {
          return new FragmentLogoutBottomSheetBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_logout_bottom_sheet is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTMYREFERRALS: {
        if ("layout/fragment_my_referrals_0".equals(tag)) {
          return new FragmentMyReferralsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_my_referrals is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTORDERS: {
        if ("layout/fragment_orders_0".equals(tag)) {
          return new FragmentOrdersBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_orders is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTORGSUBCOMPARE: {
        if ("layout/fragment_org_sub_compare_0".equals(tag)) {
          return new FragmentOrgSubCompareBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_org_sub_compare is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTPRODUCTDETAIL: {
        if ("layout/fragment_product_detail_0".equals(tag)) {
          return new FragmentProductDetailBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_product_detail is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTREFERANDEARN: {
        if ("layout/fragment_refer_and_earn_0".equals(tag)) {
          return new FragmentReferAndEarnBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_refer_and_earn is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTREFERNOW: {
        if ("layout/fragment_refer_now_0".equals(tag)) {
          return new FragmentReferNowBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_refer_now is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTREMINDERALERT: {
        if ("layout/fragment_reminder_alert_0".equals(tag)) {
          return new FragmentReminderAlertBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_reminder_alert is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTREMINDERBOTTOMSHEET: {
        if ("layout/fragment_reminder_bottom_sheet_0".equals(tag)) {
          return new FragmentReminderBottomSheetBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_reminder_bottom_sheet is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTREMINDERDELETE: {
        if ("layout/fragment_reminder_delete_0".equals(tag)) {
          return new FragmentReminderDeleteBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_reminder_delete is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTREMOVEPRODUCTBOTTOMSHEET: {
        if ("layout/fragment_remove_product_bottom_sheet_0".equals(tag)) {
          return new FragmentRemoveProductBottomSheetBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_remove_product_bottom_sheet is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTREPLACEBOTTOMSHEET: {
        if ("layout/fragment_replace_bottom_sheet_0".equals(tag)) {
          return new FragmentReplaceBottomSheetBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_replace_bottom_sheet is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTSUBSBOTTOMSHEET: {
        if ("layout/fragment_subs_bottom_sheet_0".equals(tag)) {
          return new FragmentSubsBottomSheetBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_subs_bottom_sheet is invalid. Received: " + tag);
      }
    }
    return null;
  }

  private final ViewDataBinding internalGetViewDataBinding3(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
      case  LAYOUT_HEALTHARTICLEBOTTOMSHEET: {
        if ("layout/health_article_bottomsheet_0".equals(tag)) {
          return new HealthArticleBottomsheetBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for health_article_bottomsheet is invalid. Received: " + tag);
      }
      case  LAYOUT_HEALTHARTICLEBOTTOMSHEETITEM: {
        if ("layout/health_article_bottomsheet_item_0".equals(tag)) {
          return new HealthArticleBottomsheetItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for health_article_bottomsheet_item is invalid. Received: " + tag);
      }
      case  LAYOUT_HEALTHARTICLECHIPITEM: {
        if ("layout/health_article_chip_item_0".equals(tag)) {
          return new HealthArticleChipItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for health_article_chip_item is invalid. Received: " + tag);
      }
      case  LAYOUT_HEALTHARTICLESITEM: {
        if ("layout/health_articles_item_0".equals(tag)) {
          return new HealthArticlesItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for health_articles_item is invalid. Received: " + tag);
      }
      case  LAYOUT_HELPCATEGORYITEM: {
        if ("layout/help_category_item_0".equals(tag)) {
          return new HelpCategoryItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for help_category_item is invalid. Received: " + tag);
      }
      case  LAYOUT_HELPSUBCATEGORYITEM: {
        if ("layout/help_subcategory_item_0".equals(tag)) {
          return new HelpSubcategoryItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for help_subcategory_item is invalid. Received: " + tag);
      }
      case  LAYOUT_HOMEADAPTERITEM: {
        if ("layout/home_adapter_item_0".equals(tag)) {
          return new HomeAdapterItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for home_adapter_item is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMTABACCOUNT: {
        if ("layout/item_tab_account_0".equals(tag)) {
          return new ItemTabAccountBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_tab_account is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMVIDEOP2: {
        if ("layout/item_video_p2_0".equals(tag)) {
          return new ItemVideoP2BindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_video_p2 is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMVIDEOVERTICALP2: {
        if ("layout/item_video_vertical_p2_0".equals(tag)) {
          return new ItemVideoVerticalP2BindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_video_vertical_p2 is invalid. Received: " + tag);
      }
      case  LAYOUT_LOGINBANNERITEM: {
        if ("layout/login_banner_item_0".equals(tag)) {
          return new LoginBannerItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for login_banner_item is invalid. Received: " + tag);
      }
      case  LAYOUT_MANAGEADDRESSCARDITEM: {
        if ("layout/manage_address_card_item_0".equals(tag)) {
          return new ManageAddressCardItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for manage_address_card_item is invalid. Received: " + tag);
      }
      case  LAYOUT_MANAGEPATIENTITEM: {
        if ("layout/manage_patient_item_0".equals(tag)) {
          return new ManagePatientItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for manage_patient_item is invalid. Received: " + tag);
      }
      case  LAYOUT_MYORDERSITEM: {
        if ("layout/my_orders_item_0".equals(tag)) {
          return new MyOrdersItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for my_orders_item is invalid. Received: " + tag);
      }
      case  LAYOUT_OPTFORSUBSBOTTOMSHEET: {
        if ("layout/opt_for_subs_bottom_sheet_0".equals(tag)) {
          return new OptForSubsBottomSheetBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for opt_for_subs_bottom_sheet is invalid. Received: " + tag);
      }
      case  LAYOUT_ORDERTYPEITEM: {
        if ("layout/order_type_item_0".equals(tag)) {
          return new OrderTypeItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for order_type_item is invalid. Received: " + tag);
      }
      case  LAYOUT_PASTPRESCRIPTIONALLPATIENTITEM: {
        if ("layout/past_prescription_all_patient_item_0".equals(tag)) {
          return new PastPrescriptionAllPatientItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for past_prescription_all_patient_item is invalid. Received: " + tag);
      }
      case  LAYOUT_PASTPRESCRIPTIONBOTTOMSHEET: {
        if ("layout/past_prescription_bottomsheet_0".equals(tag)) {
          return new PastPrescriptionBottomsheetBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for past_prescription_bottomsheet is invalid. Received: " + tag);
      }
      case  LAYOUT_PASTPRESCRIPTIONDETAILS: {
        if ("layout/past_prescription_details_0".equals(tag)) {
          return new PastPrescriptionDetailsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for past_prescription_details is invalid. Received: " + tag);
      }
      case  LAYOUT_PATIENTTYPEITEM: {
        if ("layout/patient_type_item_0".equals(tag)) {
          return new PatientTypeItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for patient_type_item is invalid. Received: " + tag);
      }
      case  LAYOUT_PAYMENTOPTIONSLISTITEM: {
        if ("layout/payment_options_list_item_0".equals(tag)) {
          return new PaymentOptionsListItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for payment_options_list_item is invalid. Received: " + tag);
      }
      case  LAYOUT_PRESCRIPTIONDETAILS: {
        if ("layout/prescription_details_0".equals(tag)) {
          return new PrescriptionDetailsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for prescription_details is invalid. Received: " + tag);
      }
      case  LAYOUT_PRIVACYPOLICYBOTTOMSHEET: {
        if ("layout/privacy_policy_bottomsheet_0".equals(tag)) {
          return new PrivacyPolicyBottomsheetBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for privacy_policy_bottomsheet is invalid. Received: " + tag);
      }
      case  LAYOUT_PRODUCTLISTVIEWALLITEM: {
        if ("layout/product_list_view_all_item_0".equals(tag)) {
          return new ProductListViewAllItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for product_list_view_all_item is invalid. Received: " + tag);
      }
      case  LAYOUT_PROGRESSBARITEM: {
        if ("layout/progress_bar_item_0".equals(tag)) {
          return new ProgressBarItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for progress_bar_item is invalid. Received: " + tag);
      }
      case  LAYOUT_REMINDERITEM: {
        if ("layout/reminder_item_0".equals(tag)) {
          return new ReminderItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for reminder_item is invalid. Received: " + tag);
      }
      case  LAYOUT_RESPATIENTITEM: {
        if ("layout/res_patient_item_0".equals(tag)) {
          return new ResPatientItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for res_patient_item is invalid. Received: " + tag);
      }
      case  LAYOUT_RVOTCITEM: {
        if ("layout/rv_otc_item_0".equals(tag)) {
          return new RvOtcItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for rv_otc_item is invalid. Received: " + tag);
      }
      case  LAYOUT_SAVEDADDRESSITEM: {
        if ("layout/saved_address_item_0".equals(tag)) {
          return new SavedAddressItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for saved_address_item is invalid. Received: " + tag);
      }
      case  LAYOUT_SEARCHPREVIOUSVIEWEDITEM: {
        if ("layout/search_previous_viewed_item_0".equals(tag)) {
          return new SearchPreviousViewedItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for search_previous_viewed_item is invalid. Received: " + tag);
      }
      case  LAYOUT_SEARCHRESULTITEM: {
        if ("layout/search_result_item_0".equals(tag)) {
          return new SearchResultItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for search_result_item is invalid. Received: " + tag);
      }
      case  LAYOUT_SEARCHRESULTRVITEM: {
        if ("layout/search_result_rv_item_0".equals(tag)) {
          return new SearchResultRvItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for search_result_rv_item is invalid. Received: " + tag);
      }
      case  LAYOUT_SEARCHRESULTUPDATEDUIITEM: {
        if ("layout/search_result_updated_ui_item_0".equals(tag)) {
          return new SearchResultUpdatedUiItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for search_result_updated_ui_item is invalid. Received: " + tag);
      }
      case  LAYOUT_SEARCHSUGGESTIONRECENTRVITEM: {
        if ("layout/search_suggestion_recent_rv_item_0".equals(tag)) {
          return new SearchSuggestionRecentRvItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for search_suggestion_recent_rv_item is invalid. Received: " + tag);
      }
      case  LAYOUT_SEARCHTRENDINGUPDATEDUIITEM: {
        if ("layout/search_trending_updated_ui_item_0".equals(tag)) {
          return new SearchTrendingUpdatedUiItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for search_trending_updated_ui_item is invalid. Received: " + tag);
      }
      case  LAYOUT_SHIMMERACCOUNTSCREEN: {
        if ("layout/shimmer_account_screen_0".equals(tag)) {
          return new ShimmerAccountScreenBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for shimmer_account_screen is invalid. Received: " + tag);
      }
      case  LAYOUT_SHIMMERCOMPARE: {
        if ("layout/shimmer_compare_0".equals(tag)) {
          return new ShimmerCompareBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for shimmer_compare is invalid. Received: " + tag);
      }
      case  LAYOUT_SHIMMERHORIZONTALPRODUCTS: {
        if ("layout/shimmer_horizontal_products_0".equals(tag)) {
          return new ShimmerHorizontalProductsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for shimmer_horizontal_products is invalid. Received: " + tag);
      }
      case  LAYOUT_SHIMMERMANAGEPATIENT: {
        if ("layout/shimmer_manage_patient_0".equals(tag)) {
          return new ShimmerManagePatientBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for shimmer_manage_patient is invalid. Received: " + tag);
      }
      case  LAYOUT_SHIMMERMEDICINEDETAILS: {
        if ("layout/shimmer_medicine_details_0".equals(tag)) {
          return new ShimmerMedicineDetailsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for shimmer_medicine_details is invalid. Received: " + tag);
      }
      case  LAYOUT_SHIMMERMYORDER: {
        if ("layout/shimmer_my_order_0".equals(tag)) {
          return new ShimmerMyOrderBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for shimmer_my_order is invalid. Received: " + tag);
      }
      case  LAYOUT_SHIMMERORDERSTATUS: {
        if ("layout/shimmer_order_status_0".equals(tag)) {
          return new ShimmerOrderStatusBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for shimmer_order_status is invalid. Received: " + tag);
      }
      case  LAYOUT_SHIMMERORDERSUMMARY: {
        if ("layout/shimmer_order_summary_0".equals(tag)) {
          return new ShimmerOrderSummaryBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for shimmer_order_summary is invalid. Received: " + tag);
      }
      case  LAYOUT_SHIMMERSEARCH: {
        if ("layout/shimmer_search_0".equals(tag)) {
          return new ShimmerSearchBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for shimmer_search is invalid. Received: " + tag);
      }
      case  LAYOUT_SHIMMERSEARCHRESULTPAGEWITHITEMINCARD: {
        if ("layout/shimmer_search_result_page_with_item_in_card_0".equals(tag)) {
          return new ShimmerSearchResultPageWithItemInCardBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for shimmer_search_result_page_with_item_in_card is invalid. Received: " + tag);
      }
      case  LAYOUT_SHIMMERWALLET: {
        if ("layout/shimmer_wallet_0".equals(tag)) {
          return new ShimmerWalletBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for shimmer_wallet is invalid. Received: " + tag);
      }
      case  LAYOUT_SUBCATEGORYCATEGORYTYPEITEM: {
        if ("layout/sub_category_category_type_item_0".equals(tag)) {
          return new SubCategoryCategoryTypeItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for sub_category_category_type_item is invalid. Received: " + tag);
      }
      case  LAYOUT_SUBCATEGORYTYPEITEM: {
        if ("layout/sub_category_type_item_0".equals(tag)) {
          return new SubCategoryTypeItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for sub_category_type_item is invalid. Received: " + tag);
      }
      case  LAYOUT_SUBSITEM: {
        if ("layout/subs_item_0".equals(tag)) {
          return new SubsItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for subs_item is invalid. Received: " + tag);
      }
      case  LAYOUT_SUBSMEDITEM: {
        if ("layout/subs_med_item_0".equals(tag)) {
          return new SubsMedItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for subs_med_item is invalid. Received: " + tag);
      }
    }
    return null;
  }

  private final ViewDataBinding internalGetViewDataBinding4(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
      case  LAYOUT_SUPERCATEGORYSHOPITEM: {
        if ("layout/super_category_shop_item_0".equals(tag)) {
          return new SuperCategoryShopItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for super_category_shop_item is invalid. Received: " + tag);
      }
      case  LAYOUT_TERMSANDCONDITIONBOTTOMSHEET: {
        if ("layout/terms_and_condition_bottomsheet_0".equals(tag)) {
          return new TermsAndConditionBottomsheetBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for terms_and_condition_bottomsheet is invalid. Received: " + tag);
      }
      case  LAYOUT_TRENDINGSEARCHITEM: {
        if ("layout/trending_search_item_0".equals(tag)) {
          return new TrendingSearchItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for trending_search_item is invalid. Received: " + tag);
      }
      case  LAYOUT_UPLOADPRESCRIPTIONBOTTOMSHEET: {
        if ("layout/upload_prescription_bottomsheet_0".equals(tag)) {
          return new UploadPrescriptionBottomsheetBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for upload_prescription_bottomsheet is invalid. Received: " + tag);
      }
      case  LAYOUT_UPLOADPRESCRIPTIONITEMLAY: {
        if ("layout/upload_prescription_item_lay_0".equals(tag)) {
          return new UploadPrescriptionItemLayBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for upload_prescription_item_lay is invalid. Received: " + tag);
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      // find which method will have it. -1 is necessary becausefirst id starts with 1;
      int methodIndex = (localizedLayoutId - 1) / 50;
      switch(methodIndex) {
        case 0: {
          return internalGetViewDataBinding0(component, view, localizedLayoutId, tag);
        }
        case 1: {
          return internalGetViewDataBinding1(component, view, localizedLayoutId, tag);
        }
        case 2: {
          return internalGetViewDataBinding2(component, view, localizedLayoutId, tag);
        }
        case 3: {
          return internalGetViewDataBinding3(component, view, localizedLayoutId, tag);
        }
        case 4: {
          return internalGetViewDataBinding4(component, view, localizedLayoutId, tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(2);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    result.add(new com.intellihealth.salt.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(170);

    static {
      sKeys.put(1, "OrderModel");
      sKeys.put(0, "_all");
      sKeys.put(2, "addressCallback");
      sKeys.put(3, "addressCardData");
      sKeys.put(4, "applyCouponData");
      sKeys.put(5, "applyCouponModel");
      sKeys.put(6, "authorData");
      sKeys.put(7, "bannerItem");
      sKeys.put(8, "bannerList");
      sKeys.put(9, "billDetails");
      sKeys.put(10, "blogCallback");
      sKeys.put(11, "blogCardModel");
      sKeys.put(12, "blogModel");
      sKeys.put(13, "blogmodel");
      sKeys.put(14, "bottomSheetCloseCallBAck");
      sKeys.put(15, "callback");
      sKeys.put(16, "callbackLocation");
      sKeys.put(17, "cardColor");
      sKeys.put(18, "cardData");
      sKeys.put(19, "cardType");
      sKeys.put(20, "carousel");
      sKeys.put(21, "carouselsCallback");
      sKeys.put(22, "cartData");
      sKeys.put(23, "cartValue");
      sKeys.put(24, "category");
      sKeys.put(25, "categoryLevel2List");
      sKeys.put(26, "categoryListener");
      sKeys.put(27, "categoryModel");
      sKeys.put(28, "childData");
      sKeys.put(29, "childIndex");
      sKeys.put(30, "chipData");
      sKeys.put(31, "chipName");
      sKeys.put(32, "city");
      sKeys.put(33, "closeIconClickCallback");
      sKeys.put(34, "comingFromAccountFragment");
      sKeys.put(35, "compositionModel");
      sKeys.put(36, "couponCallback");
      sKeys.put(37, "couponCode");
      sKeys.put(38, "couponModel");
      sKeys.put(39, "couponViewModel");
      sKeys.put(40, "currentCartValue");
      sKeys.put(41, "data");
      sKeys.put(42, "deliveryData");
      sKeys.put(43, "description");
      sKeys.put(44, "discount");
      sKeys.put(45, "discountPercentage");
      sKeys.put(46, "doctorCallCardData");
      sKeys.put(47, "doctorCallData");
      sKeys.put(48, "etCallback");
      sKeys.put(49, "expires");
      sKeys.put(50, "faqData");
      sKeys.put(51, "fragmentManager");
      sKeys.put(52, "ftcCouponAppliedData");
      sKeys.put(53, "headerModel");
      sKeys.put(54, "healthArticlesViewModel");
      sKeys.put(55, "imgUrl");
      sKeys.put(56, "index");
      sKeys.put(57, "isAlertIconVisibility");
      sKeys.put(58, "isBottomsheetBehaviour");
      sKeys.put(59, "isCloseButtonShow");
      sKeys.put(60, "isFeedbackSubmitted");
      sKeys.put(61, "isFromPDPage");
      sKeys.put(62, "isLoading");
      sKeys.put(63, "isLoggedIn");
      sKeys.put(64, "isRatingsClicked");
      sKeys.put(65, "isRewardTransaction");
      sKeys.put(66, "isSubs");
      sKeys.put(67, "isSubsFound");
      sKeys.put(68, "isUpload");
      sKeys.put(69, "isUserLoggedIn");
      sKeys.put(70, "isViewAll");
      sKeys.put(71, "item");
      sKeys.put(72, "itemCounts");
      sKeys.put(73, "itemData");
      sKeys.put(74, "itemPosition");
      sKeys.put(75, "lifeCycle");
      sKeys.put(76, "list");
      sKeys.put(77, "manageAddressModel");
      sKeys.put(78, "manageAddressViewModel");
      sKeys.put(79, "maxLength");
      sKeys.put(80, "message");
      sKeys.put(81, "model");
      sKeys.put(82, "mutableMedData");
      sKeys.put(83, "notificationData");
      sKeys.put(84, "orderID");
      sKeys.put(85, "orderStatusCardModel");
      sKeys.put(86, "orderStatusCardsCallback");
      sKeys.put(87, "orderStatusCardsModel");
      sKeys.put(88, "orderStatusResponseData");
      sKeys.put(89, "orderTrackingCallback");
      sKeys.put(90, "orderTrackingData");
      sKeys.put(91, "orderedItemCallback");
      sKeys.put(92, "orgModel");
      sKeys.put(93, "otpCardCallBack");
      sKeys.put(94, "otpCardData");
      sKeys.put(95, "otpViewCallBack");
      sKeys.put(96, "pastPrescriptionModel");
      sKeys.put(97, "patientCallback");
      sKeys.put(98, "patientId");
      sKeys.put(99, "paymentCardData");
      sKeys.put(100, "paymentContainerType");
      sKeys.put(101, "paymentDetailsData");
      sKeys.put(102, "personalDetail");
      sKeys.put(103, "position");
      sKeys.put(104, "prescriptionViewModel");
      sKeys.put(105, "privacyPolicyData");
      sKeys.put(106, "privacyTncData");
      sKeys.put(107, "productCardCallback");
      sKeys.put(108, "productCardSectionData");
      sKeys.put(109, "productComparisonData");
      sKeys.put(110, "productInfoModel");
      sKeys.put(111, "productInfoModelReplaced");
      sKeys.put(112, "radioModel");
      sKeys.put(113, "ratings");
      sKeys.put(114, "referralCallback");
      sKeys.put(115, "referralStageData");
      sKeys.put(116, "reminderCardModel");
      sKeys.put(117, "reminderItem");
      sKeys.put(118, "reminderViewModel");
      sKeys.put(119, "reorderCallback");
      sKeys.put(120, "reorderData");
      sKeys.put(121, "replaceAllBottomSheetModel");
      sKeys.put(122, "savedAddressData");
      sKeys.put(123, "saving");
      sKeys.put(124, "savingCardData");
      sKeys.put(125, "savingPercent");
      sKeys.put(126, "savings");
      sKeys.put(127, "searchSuggestionModel");
      sKeys.put(128, "searchText");
      sKeys.put(129, "searchUIStateConstants");
      sKeys.put(130, "searchViewModel");
      sKeys.put(131, "selected");
      sKeys.put(132, "selectedChild");
      sKeys.put(133, "selectedNext");
      sKeys.put(134, "selectedValue");
      sKeys.put(135, "sellingPrice");
      sKeys.put(136, "setInputDigits");
      sKeys.put(137, "showDiscount");
      sKeys.put(138, "stepperCallback");
      sKeys.put(139, "stepperConstants");
      sKeys.put(140, "subsModel");
      sKeys.put(141, "summaryLine");
      sKeys.put(142, "superCategory");
      sKeys.put(143, "superCategoryList");
      sKeys.put(144, "textSwitcherText");
      sKeys.put(145, "timeIntervalData");
      sKeys.put(146, "timer");
      sKeys.put(147, "title");
      sKeys.put(148, "tmOtpViewCallBack");
      sKeys.put(149, "tmPaymentContainerCallback");
      sKeys.put(150, "tmPaymentContainerConstants");
      sKeys.put(151, "toolTipEnum");
      sKeys.put(152, "totalPages");
      sKeys.put(153, "transactionData");
      sKeys.put(154, "txtHint");
      sKeys.put(155, "url");
      sKeys.put(156, "videoCarousel");
      sKeys.put(157, "videoCarouselsCallback");
      sKeys.put(158, "videoData");
      sKeys.put(159, "videoItemCarousel");
      sKeys.put(160, "view");
      sKeys.put(161, "viewModel");
      sKeys.put(162, "viewModell");
      sKeys.put(163, "viewType");
      sKeys.put(164, "viewmodel");
      sKeys.put(165, "walletBalance");
      sKeys.put(166, "walletBalanceModel");
      sKeys.put(167, "walletInfoResponse");
      sKeys.put(168, "warningOg");
      sKeys.put(169, "warningSubs");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(205);

    static {
      sKeys.put("layout/activity_add_address_0", com.intellihealth.truemeds.R.layout.activity_add_address);
      sKeys.put("layout/activity_add_patient_0", com.intellihealth.truemeds.R.layout.activity_add_patient);
      sKeys.put("layout/activity_cancel_order_0", com.intellihealth.truemeds.R.layout.activity_cancel_order);
      sKeys.put("layout/activity_cancel_sub_order_0", com.intellihealth.truemeds.R.layout.activity_cancel_sub_order);
      sKeys.put("layout/activity_cart_0", com.intellihealth.truemeds.R.layout.activity_cart);
      sKeys.put("layout/activity_coupon_0", com.intellihealth.truemeds.R.layout.activity_coupon);
      sKeys.put("layout/activity_delivery_details_0", com.intellihealth.truemeds.R.layout.activity_delivery_details);
      sKeys.put("layout/activity_edit_profile_0", com.intellihealth.truemeds.R.layout.activity_edit_profile);
      sKeys.put("layout/activity_faq_view_all_0", com.intellihealth.truemeds.R.layout.activity_faq_view_all);
      sKeys.put("layout/activity_health_article_detail_0", com.intellihealth.truemeds.R.layout.activity_health_article_detail);
      sKeys.put("layout/activity_health_articles_0", com.intellihealth.truemeds.R.layout.activity_health_articles);
      sKeys.put("layout/activity_help_0", com.intellihealth.truemeds.R.layout.activity_help);
      sKeys.put("layout/activity_help_subcategory_0", com.intellihealth.truemeds.R.layout.activity_help_subcategory);
      sKeys.put("layout/activity_help_subcategory_detail_0", com.intellihealth.truemeds.R.layout.activity_help_subcategory_detail);
      sKeys.put("layout/activity_home_page_0", com.intellihealth.truemeds.R.layout.activity_home_page);
      sKeys.put("layout/activity_login_0", com.intellihealth.truemeds.R.layout.activity_login);
      sKeys.put("layout/activity_manage_address_0", com.intellihealth.truemeds.R.layout.activity_manage_address);
      sKeys.put("layout/activity_manage_patient_0", com.intellihealth.truemeds.R.layout.activity_manage_patient);
      sKeys.put("layout/activity_my_orders_0", com.intellihealth.truemeds.R.layout.activity_my_orders);
      sKeys.put("layout/activity_non_active_order_status_0", com.intellihealth.truemeds.R.layout.activity_non_active_order_status);
      sKeys.put("layout/activity_order_status_0", com.intellihealth.truemeds.R.layout.activity_order_status);
      sKeys.put("layout/activity_order_summary_0", com.intellihealth.truemeds.R.layout.activity_order_summary);
      sKeys.put("layout/activity_otc_category_0", com.intellihealth.truemeds.R.layout.activity_otc_category);
      sKeys.put("layout/activity_patient_reminder_0", com.intellihealth.truemeds.R.layout.activity_patient_reminder);
      sKeys.put("layout/activity_payment_0", com.intellihealth.truemeds.R.layout.activity_payment);
      sKeys.put("layout/activity_payment_option_0", com.intellihealth.truemeds.R.layout.activity_payment_option);
      sKeys.put("layout/activity_payment_status_0", com.intellihealth.truemeds.R.layout.activity_payment_status);
      sKeys.put("layout/activity_policies_page_0", com.intellihealth.truemeds.R.layout.activity_policies_page);
      sKeys.put("layout/activity_policy_detail_0", com.intellihealth.truemeds.R.layout.activity_policy_detail);
      sKeys.put("layout/activity_prescription_0", com.intellihealth.truemeds.R.layout.activity_prescription);
      sKeys.put("layout/activity_product_detail_0", com.intellihealth.truemeds.R.layout.activity_product_detail);
      sKeys.put("layout/activity_product_list_view_all_0", com.intellihealth.truemeds.R.layout.activity_product_list_view_all);
      sKeys.put("layout/activity_refer_and_earn_0", com.intellihealth.truemeds.R.layout.activity_refer_and_earn);
      sKeys.put("layout/activity_return_refund_web_0", com.intellihealth.truemeds.R.layout.activity_return_refund_web);
      sKeys.put("layout/activity_search_result_0", com.intellihealth.truemeds.R.layout.activity_search_result);
      sKeys.put("layout/activity_search_suggestion_0", com.intellihealth.truemeds.R.layout.activity_search_suggestion);
      sKeys.put("layout/activity_splash_screen_0", com.intellihealth.truemeds.R.layout.activity_splash_screen);
      sKeys.put("layout/activity_substitutes_0", com.intellihealth.truemeds.R.layout.activity_substitutes);
      sKeys.put("layout/activity_video_faq_0", com.intellihealth.truemeds.R.layout.activity_video_faq);
      sKeys.put("layout/activity_wallet_0", com.intellihealth.truemeds.R.layout.activity_wallet);
      sKeys.put("layout/activity_wallet_tranasctions_0", com.intellihealth.truemeds.R.layout.activity_wallet_tranasctions);
      sKeys.put("layout/activity_web_browser_0", com.intellihealth.truemeds.R.layout.activity_web_browser);
      sKeys.put("layout/adapter_addmore_prescription_order_summary_0", com.intellihealth.truemeds.R.layout.adapter_addmore_prescription_order_summary);
      sKeys.put("layout/adapter_banner_item_0", com.intellihealth.truemeds.R.layout.adapter_banner_item);
      sKeys.put("layout/adapter_blog_section_item_0", com.intellihealth.truemeds.R.layout.adapter_blog_section_item);
      sKeys.put("layout/adapter_callorder_action_card_item_0", com.intellihealth.truemeds.R.layout.adapter_callorder_action_card_item);
      sKeys.put("layout/adapter_cart_item_0", com.intellihealth.truemeds.R.layout.adapter_cart_item);
      sKeys.put("layout/adapter_chips_reminder_item_0", com.intellihealth.truemeds.R.layout.adapter_chips_reminder_item);
      sKeys.put("layout/adapter_coupon_item_0", com.intellihealth.truemeds.R.layout.adapter_coupon_item);
      sKeys.put("layout/adapter_doctor_prescription_0", com.intellihealth.truemeds.R.layout.adapter_doctor_prescription);
      sKeys.put("layout/adapter_doctor_prescription_order_summary_0", com.intellihealth.truemeds.R.layout.adapter_doctor_prescription_order_summary);
      sKeys.put("layout/adapter_footer_item_0", com.intellihealth.truemeds.R.layout.adapter_footer_item);
      sKeys.put("layout/adapter_homepage_alert_item_0", com.intellihealth.truemeds.R.layout.adapter_homepage_alert_item);
      sKeys.put("layout/adapter_modification_item_0", com.intellihealth.truemeds.R.layout.adapter_modification_item);
      sKeys.put("layout/adapter_order_summary_cart_item_0", com.intellihealth.truemeds.R.layout.adapter_order_summary_cart_item);
      sKeys.put("layout/adapter_patient_medicines_chips_item_0", com.intellihealth.truemeds.R.layout.adapter_patient_medicines_chips_item);
      sKeys.put("layout/adapter_personal_care_category_0", com.intellihealth.truemeds.R.layout.adapter_personal_care_category);
      sKeys.put("layout/adapter_personal_care_product_0", com.intellihealth.truemeds.R.layout.adapter_personal_care_product);
      sKeys.put("layout/adapter_prescription_action_card_item_0", com.intellihealth.truemeds.R.layout.adapter_prescription_action_card_item);
      sKeys.put("layout/adapter_product_card_item_0", com.intellihealth.truemeds.R.layout.adapter_product_card_item);
      sKeys.put("layout/adapter_product_card_stacked_item_0", com.intellihealth.truemeds.R.layout.adapter_product_card_stacked_item);
      sKeys.put("layout/adapter_reminder_0", com.intellihealth.truemeds.R.layout.adapter_reminder);
      sKeys.put("layout/adapter_reminder_time_item_0", com.intellihealth.truemeds.R.layout.adapter_reminder_time_item);
      sKeys.put("layout/adapter_reorder_0", com.intellihealth.truemeds.R.layout.adapter_reorder);
      sKeys.put("layout/adapter_substitute_info_card_item_0", com.intellihealth.truemeds.R.layout.adapter_substitute_info_card_item);
      sKeys.put("layout/adapter_super_category_0", com.intellihealth.truemeds.R.layout.adapter_super_category);
      sKeys.put("layout/adapter_testimonial_section_item_0", com.intellihealth.truemeds.R.layout.adapter_testimonial_section_item);
      sKeys.put("layout/adapter_time_interval_item_default_0", com.intellihealth.truemeds.R.layout.adapter_time_interval_item_default);
      sKeys.put("layout/adapter_transaction_item_0", com.intellihealth.truemeds.R.layout.adapter_transaction_item);
      sKeys.put("layout/adapter_view_prescription_0", com.intellihealth.truemeds.R.layout.adapter_view_prescription);
      sKeys.put("layout/author_card_item_0", com.intellihealth.truemeds.R.layout.author_card_item);
      sKeys.put("layout/banner_viewpager_item_0", com.intellihealth.truemeds.R.layout.banner_viewpager_item);
      sKeys.put("layout/bottomsheet_alternate_number_0", com.intellihealth.truemeds.R.layout.bottomsheet_alternate_number);
      sKeys.put("layout/bottomsheet_apply_coupon_0", com.intellihealth.truemeds.R.layout.bottomsheet_apply_coupon);
      sKeys.put("layout/bottomsheet_choose_custom_dates_0", com.intellihealth.truemeds.R.layout.bottomsheet_choose_custom_dates);
      sKeys.put("layout/bottomsheet_choose_time_interval_0", com.intellihealth.truemeds.R.layout.bottomsheet_choose_time_interval);
      sKeys.put("layout/bottomsheet_compare_and_understand_0", com.intellihealth.truemeds.R.layout.bottomsheet_compare_and_understand);
      sKeys.put("layout/bottomsheet_composition_details_0", com.intellihealth.truemeds.R.layout.bottomsheet_composition_details);
      sKeys.put("layout/bottomsheet_coupon_offer_0", com.intellihealth.truemeds.R.layout.bottomsheet_coupon_offer);
      sKeys.put("layout/bottomsheet_detailed_status_0", com.intellihealth.truemeds.R.layout.bottomsheet_detailed_status);
      sKeys.put("layout/bottomsheet_doctor_call_0", com.intellihealth.truemeds.R.layout.bottomsheet_doctor_call);
      sKeys.put("layout/bottomsheet_doctor_call_missed_0", com.intellihealth.truemeds.R.layout.bottomsheet_doctor_call_missed);
      sKeys.put("layout/bottomsheet_doctor_fraud_0", com.intellihealth.truemeds.R.layout.bottomsheet_doctor_fraud);
      sKeys.put("layout/bottomsheet_error_0", com.intellihealth.truemeds.R.layout.bottomsheet_error);
      sKeys.put("layout/bottomsheet_filter_0", com.intellihealth.truemeds.R.layout.bottomsheet_filter);
      sKeys.put("layout/bottomsheet_help_0", com.intellihealth.truemeds.R.layout.bottomsheet_help);
      sKeys.put("layout/bottomsheet_item_no_longer_available_0", com.intellihealth.truemeds.R.layout.bottomsheet_item_no_longer_available);
      sKeys.put("layout/bottomsheet_location_0", com.intellihealth.truemeds.R.layout.bottomsheet_location);
      sKeys.put("layout/bottomsheet_login_0", com.intellihealth.truemeds.R.layout.bottomsheet_login);
      sKeys.put("layout/bottomsheet_modification_item_0", com.intellihealth.truemeds.R.layout.bottomsheet_modification_item);
      sKeys.put("layout/bottomsheet_myorder_0", com.intellihealth.truemeds.R.layout.bottomsheet_myorder);
      sKeys.put("layout/bottomsheet_payment_carousel_0", com.intellihealth.truemeds.R.layout.bottomsheet_payment_carousel);
      sKeys.put("layout/bottomsheet_payment_change_selection_0", com.intellihealth.truemeds.R.layout.bottomsheet_payment_change_selection);
      sKeys.put("layout/bottomsheet_payment_pending_0", com.intellihealth.truemeds.R.layout.bottomsheet_payment_pending);
      sKeys.put("layout/bottomsheet_payment_unsuccessful_0", com.intellihealth.truemeds.R.layout.bottomsheet_payment_unsuccessful);
      sKeys.put("layout/bottomsheet_privacy_policy_0", com.intellihealth.truemeds.R.layout.bottomsheet_privacy_policy);
      sKeys.put("layout/bottomsheet_product_detail_0", com.intellihealth.truemeds.R.layout.bottomsheet_product_detail);
      sKeys.put("layout/bottomsheet_ratings_0", com.intellihealth.truemeds.R.layout.bottomsheet_ratings);
      sKeys.put("layout/bottomsheet_remove_unavailable_product_0", com.intellihealth.truemeds.R.layout.bottomsheet_remove_unavailable_product);
      sKeys.put("layout/bottomsheet_reorder_0", com.intellihealth.truemeds.R.layout.bottomsheet_reorder);
      sKeys.put("layout/bottomsheet_reorder_footer_0", com.intellihealth.truemeds.R.layout.bottomsheet_reorder_footer);
      sKeys.put("layout/bottomsheet_reorder_header_0", com.intellihealth.truemeds.R.layout.bottomsheet_reorder_header);
      sKeys.put("layout/bottomsheet_reorder_item_0", com.intellihealth.truemeds.R.layout.bottomsheet_reorder_item);
      sKeys.put("layout/bottomsheet_replace_all_company_item_0", com.intellihealth.truemeds.R.layout.bottomsheet_replace_all_company_item);
      sKeys.put("layout/bottomsheet_replace_all_recocommended_0", com.intellihealth.truemeds.R.layout.bottomsheet_replace_all_recocommended);
      sKeys.put("layout/bottomsheet_replace_all_recocommended_item_0", com.intellihealth.truemeds.R.layout.bottomsheet_replace_all_recocommended_item);
      sKeys.put("layout/bottomsheet_replacing_0", com.intellihealth.truemeds.R.layout.bottomsheet_replacing);
      sKeys.put("layout/bottomsheet_rx_prescription_0", com.intellihealth.truemeds.R.layout.bottomsheet_rx_prescription);
      sKeys.put("layout/bottomsheet_save_number_0", com.intellihealth.truemeds.R.layout.bottomsheet_save_number);
      sKeys.put("layout/bottomsheet_switch_back_og_0", com.intellihealth.truemeds.R.layout.bottomsheet_switch_back_og);
      sKeys.put("layout/bottomsheet_view_bill_0", com.intellihealth.truemeds.R.layout.bottomsheet_view_bill);
      sKeys.put("layout/bottomsheet_view_bill_details_0", com.intellihealth.truemeds.R.layout.bottomsheet_view_bill_details);
      sKeys.put("layout/bottomsheet_view_prescription_0", com.intellihealth.truemeds.R.layout.bottomsheet_view_prescription);
      sKeys.put("layout/brand_type_item_0", com.intellihealth.truemeds.R.layout.brand_type_item);
      sKeys.put("layout/calendar_layout_0", com.intellihealth.truemeds.R.layout.calendar_layout);
      sKeys.put("layout/cancel_order_bottomsheet_0", com.intellihealth.truemeds.R.layout.cancel_order_bottomsheet);
      sKeys.put("layout/cancel_order_item_0", com.intellihealth.truemeds.R.layout.cancel_order_item);
      sKeys.put("layout/category_shop_item_0", com.intellihealth.truemeds.R.layout.category_shop_item);
      sKeys.put("layout/category_type_item_0", com.intellihealth.truemeds.R.layout.category_type_item);
      sKeys.put("layout/composition_bottomsheet_item_0", com.intellihealth.truemeds.R.layout.composition_bottomsheet_item);
      sKeys.put("layout/delete_image_bottom_sheet_0", com.intellihealth.truemeds.R.layout.delete_image_bottom_sheet);
      sKeys.put("layout/delivery_details_patient_item_0", com.intellihealth.truemeds.R.layout.delivery_details_patient_item);
      sKeys.put("layout/dialog_coupon_error_0", com.intellihealth.truemeds.R.layout.dialog_coupon_error);
      sKeys.put("layout/dialog_coupon_saving_0", com.intellihealth.truemeds.R.layout.dialog_coupon_saving);
      sKeys.put("layout/dialog_coupon_suceess_0", com.intellihealth.truemeds.R.layout.dialog_coupon_suceess);
      sKeys.put("layout/dialog_rating_submitted_0", com.intellihealth.truemeds.R.layout.dialog_rating_submitted);
      sKeys.put("layout/dialog_replace_savings_0", com.intellihealth.truemeds.R.layout.dialog_replace_savings);
      sKeys.put("layout/dialog_rounded_corner_0", com.intellihealth.truemeds.R.layout.dialog_rounded_corner);
      sKeys.put("layout/dialog_rx_coupon_suceess_0", com.intellihealth.truemeds.R.layout.dialog_rx_coupon_suceess);
      sKeys.put("layout/do_not_have_bottomsheet_0", com.intellihealth.truemeds.R.layout.do_not_have_bottomsheet);
      sKeys.put("layout/edit_delete_bottomsheet_0", com.intellihealth.truemeds.R.layout.edit_delete_bottomsheet);
      sKeys.put("layout/fragment_account_0", com.intellihealth.truemeds.R.layout.fragment_account);
      sKeys.put("layout/fragment_bottom_sheet_0", com.intellihealth.truemeds.R.layout.fragment_bottom_sheet);
      sKeys.put("layout/fragment_edit_reminder_0", com.intellihealth.truemeds.R.layout.fragment_edit_reminder);
      sKeys.put("layout/fragment_home_0", com.intellihealth.truemeds.R.layout.fragment_home);
      sKeys.put("layout/fragment_login_mobile_number_0", com.intellihealth.truemeds.R.layout.fragment_login_mobile_number);
      sKeys.put("layout/fragment_login_otp_0", com.intellihealth.truemeds.R.layout.fragment_login_otp);
      sKeys.put("layout/fragment_logout_bottom_sheet_0", com.intellihealth.truemeds.R.layout.fragment_logout_bottom_sheet);
      sKeys.put("layout/fragment_my_referrals_0", com.intellihealth.truemeds.R.layout.fragment_my_referrals);
      sKeys.put("layout/fragment_orders_0", com.intellihealth.truemeds.R.layout.fragment_orders);
      sKeys.put("layout/fragment_org_sub_compare_0", com.intellihealth.truemeds.R.layout.fragment_org_sub_compare);
      sKeys.put("layout/fragment_product_detail_0", com.intellihealth.truemeds.R.layout.fragment_product_detail);
      sKeys.put("layout/fragment_refer_and_earn_0", com.intellihealth.truemeds.R.layout.fragment_refer_and_earn);
      sKeys.put("layout/fragment_refer_now_0", com.intellihealth.truemeds.R.layout.fragment_refer_now);
      sKeys.put("layout/fragment_reminder_alert_0", com.intellihealth.truemeds.R.layout.fragment_reminder_alert);
      sKeys.put("layout/fragment_reminder_bottom_sheet_0", com.intellihealth.truemeds.R.layout.fragment_reminder_bottom_sheet);
      sKeys.put("layout/fragment_reminder_delete_0", com.intellihealth.truemeds.R.layout.fragment_reminder_delete);
      sKeys.put("layout/fragment_remove_product_bottom_sheet_0", com.intellihealth.truemeds.R.layout.fragment_remove_product_bottom_sheet);
      sKeys.put("layout/fragment_replace_bottom_sheet_0", com.intellihealth.truemeds.R.layout.fragment_replace_bottom_sheet);
      sKeys.put("layout/fragment_subs_bottom_sheet_0", com.intellihealth.truemeds.R.layout.fragment_subs_bottom_sheet);
      sKeys.put("layout/health_article_bottomsheet_0", com.intellihealth.truemeds.R.layout.health_article_bottomsheet);
      sKeys.put("layout/health_article_bottomsheet_item_0", com.intellihealth.truemeds.R.layout.health_article_bottomsheet_item);
      sKeys.put("layout/health_article_chip_item_0", com.intellihealth.truemeds.R.layout.health_article_chip_item);
      sKeys.put("layout/health_articles_item_0", com.intellihealth.truemeds.R.layout.health_articles_item);
      sKeys.put("layout/help_category_item_0", com.intellihealth.truemeds.R.layout.help_category_item);
      sKeys.put("layout/help_subcategory_item_0", com.intellihealth.truemeds.R.layout.help_subcategory_item);
      sKeys.put("layout/home_adapter_item_0", com.intellihealth.truemeds.R.layout.home_adapter_item);
      sKeys.put("layout/item_tab_account_0", com.intellihealth.truemeds.R.layout.item_tab_account);
      sKeys.put("layout/item_video_p2_0", com.intellihealth.truemeds.R.layout.item_video_p2);
      sKeys.put("layout/item_video_vertical_p2_0", com.intellihealth.truemeds.R.layout.item_video_vertical_p2);
      sKeys.put("layout/login_banner_item_0", com.intellihealth.truemeds.R.layout.login_banner_item);
      sKeys.put("layout/manage_address_card_item_0", com.intellihealth.truemeds.R.layout.manage_address_card_item);
      sKeys.put("layout/manage_patient_item_0", com.intellihealth.truemeds.R.layout.manage_patient_item);
      sKeys.put("layout/my_orders_item_0", com.intellihealth.truemeds.R.layout.my_orders_item);
      sKeys.put("layout/opt_for_subs_bottom_sheet_0", com.intellihealth.truemeds.R.layout.opt_for_subs_bottom_sheet);
      sKeys.put("layout/order_type_item_0", com.intellihealth.truemeds.R.layout.order_type_item);
      sKeys.put("layout/past_prescription_all_patient_item_0", com.intellihealth.truemeds.R.layout.past_prescription_all_patient_item);
      sKeys.put("layout/past_prescription_bottomsheet_0", com.intellihealth.truemeds.R.layout.past_prescription_bottomsheet);
      sKeys.put("layout/past_prescription_details_0", com.intellihealth.truemeds.R.layout.past_prescription_details);
      sKeys.put("layout/patient_type_item_0", com.intellihealth.truemeds.R.layout.patient_type_item);
      sKeys.put("layout/payment_options_list_item_0", com.intellihealth.truemeds.R.layout.payment_options_list_item);
      sKeys.put("layout/prescription_details_0", com.intellihealth.truemeds.R.layout.prescription_details);
      sKeys.put("layout/privacy_policy_bottomsheet_0", com.intellihealth.truemeds.R.layout.privacy_policy_bottomsheet);
      sKeys.put("layout/product_list_view_all_item_0", com.intellihealth.truemeds.R.layout.product_list_view_all_item);
      sKeys.put("layout/progress_bar_item_0", com.intellihealth.truemeds.R.layout.progress_bar_item);
      sKeys.put("layout/reminder_item_0", com.intellihealth.truemeds.R.layout.reminder_item);
      sKeys.put("layout/res_patient_item_0", com.intellihealth.truemeds.R.layout.res_patient_item);
      sKeys.put("layout/rv_otc_item_0", com.intellihealth.truemeds.R.layout.rv_otc_item);
      sKeys.put("layout/saved_address_item_0", com.intellihealth.truemeds.R.layout.saved_address_item);
      sKeys.put("layout/search_previous_viewed_item_0", com.intellihealth.truemeds.R.layout.search_previous_viewed_item);
      sKeys.put("layout/search_result_item_0", com.intellihealth.truemeds.R.layout.search_result_item);
      sKeys.put("layout/search_result_rv_item_0", com.intellihealth.truemeds.R.layout.search_result_rv_item);
      sKeys.put("layout/search_result_updated_ui_item_0", com.intellihealth.truemeds.R.layout.search_result_updated_ui_item);
      sKeys.put("layout/search_suggestion_recent_rv_item_0", com.intellihealth.truemeds.R.layout.search_suggestion_recent_rv_item);
      sKeys.put("layout/search_trending_updated_ui_item_0", com.intellihealth.truemeds.R.layout.search_trending_updated_ui_item);
      sKeys.put("layout/shimmer_account_screen_0", com.intellihealth.truemeds.R.layout.shimmer_account_screen);
      sKeys.put("layout/shimmer_compare_0", com.intellihealth.truemeds.R.layout.shimmer_compare);
      sKeys.put("layout/shimmer_horizontal_products_0", com.intellihealth.truemeds.R.layout.shimmer_horizontal_products);
      sKeys.put("layout/shimmer_manage_patient_0", com.intellihealth.truemeds.R.layout.shimmer_manage_patient);
      sKeys.put("layout/shimmer_medicine_details_0", com.intellihealth.truemeds.R.layout.shimmer_medicine_details);
      sKeys.put("layout/shimmer_my_order_0", com.intellihealth.truemeds.R.layout.shimmer_my_order);
      sKeys.put("layout/shimmer_order_status_0", com.intellihealth.truemeds.R.layout.shimmer_order_status);
      sKeys.put("layout/shimmer_order_summary_0", com.intellihealth.truemeds.R.layout.shimmer_order_summary);
      sKeys.put("layout/shimmer_search_0", com.intellihealth.truemeds.R.layout.shimmer_search);
      sKeys.put("layout/shimmer_search_result_page_with_item_in_card_0", com.intellihealth.truemeds.R.layout.shimmer_search_result_page_with_item_in_card);
      sKeys.put("layout/shimmer_wallet_0", com.intellihealth.truemeds.R.layout.shimmer_wallet);
      sKeys.put("layout/sub_category_category_type_item_0", com.intellihealth.truemeds.R.layout.sub_category_category_type_item);
      sKeys.put("layout/sub_category_type_item_0", com.intellihealth.truemeds.R.layout.sub_category_type_item);
      sKeys.put("layout/subs_item_0", com.intellihealth.truemeds.R.layout.subs_item);
      sKeys.put("layout/subs_med_item_0", com.intellihealth.truemeds.R.layout.subs_med_item);
      sKeys.put("layout/super_category_shop_item_0", com.intellihealth.truemeds.R.layout.super_category_shop_item);
      sKeys.put("layout/terms_and_condition_bottomsheet_0", com.intellihealth.truemeds.R.layout.terms_and_condition_bottomsheet);
      sKeys.put("layout/trending_search_item_0", com.intellihealth.truemeds.R.layout.trending_search_item);
      sKeys.put("layout/upload_prescription_bottomsheet_0", com.intellihealth.truemeds.R.layout.upload_prescription_bottomsheet);
      sKeys.put("layout/upload_prescription_item_lay_0", com.intellihealth.truemeds.R.layout.upload_prescription_item_lay);
    }
  }
}
