package com.intellihealth.truemeds.domain.usecase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00b8\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J(\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0086@\u00a2\u0006\u0002\u0010\u001dJ\"\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010 \u001a\u0004\u0018\u00010\u001bH\u0086@\u00a2\u0006\u0002\u0010!J<\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\b\u0010\'\u001a\u0004\u0018\u00010\u001bH\u0086@\u00a2\u0006\u0002\u0010(J \u0010)\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010*\u001a\u00020\u001bH\u0086@\u00a2\u0006\u0002\u0010!J\f\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,JJ\u0010.\u001a\u0004\u0018\u00010/2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\u0010\u00100\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0018\u0001012\u0006\u00102\u001a\u00020\u001bH\u0086@\u00a2\u0006\u0002\u00103J6\u00104\u001a\u0004\u0018\u0001052\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u001b012\u0006\u0010$\u001a\u000207H\u0086@\u00a2\u0006\u0002\u00108J\"\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010>2\b\b\u0002\u0010?\u001a\u00020\u001bJ\b\u0010@\u001a\u00020AH\u0002J\u0018\u0010B\u001a\b\u0012\u0004\u0012\u00020C0,2\b\u0010=\u001a\u0004\u0018\u00010>H\u0002J\b\u0010D\u001a\u00020EH\u0002J\b\u0010F\u001a\u00020EH\u0002J\b\u0010G\u001a\u00020EH\u0002J\u001c\u0010H\u001a\b\u0012\u0004\u0012\u00020I0,2\u0006\u0010J\u001a\u00020\u00122\u0006\u0010K\u001a\u00020\u0012J<\u0010L\u001a\u0016\u0012\u0004\u0012\u00020N\u0018\u00010Mj\n\u0012\u0004\u0012\u00020N\u0018\u0001`O2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010P\u001a\u00020\u001b2\b\u0010Q\u001a\u0004\u0018\u00010\u001bH\u0086@\u00a2\u0006\u0002\u0010\u001dJ0\u0010R\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010S2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010P\u001a\u00020\u001b2\b\u0010Q\u001a\u0004\u0018\u00010\u001bH\u0086@\u00a2\u0006\u0002\u0010\u001dJ\u0018\u0010T\u001a\u0004\u0018\u00010U2\u0006\u0010\u0018\u001a\u00020\u0019H\u0086@\u00a2\u0006\u0002\u0010VJ\u0016\u0010W\u001a\u00020X2\u0006\u0010\u0018\u001a\u00020\u0019H\u0086@\u00a2\u0006\u0002\u0010VJ\u0018\u0010Y\u001a\u0004\u0018\u00010Z2\u0006\u0010\u0018\u001a\u00020\u0019H\u0086@\u00a2\u0006\u0002\u0010VJ\u0012\u0010[\u001a\u00020\\2\b\u0010=\u001a\u0004\u0018\u00010>H\u0003J(\u0010]\u001a\u0004\u0018\u00010^2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010_\u001a\u00020\u001b2\u0006\u0010`\u001a\u00020\u001bH\u0086@\u00a2\u0006\u0002\u0010\u001dJ \u0010a\u001a\u0004\u0018\u00010U2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010b\u001a\u00020\u0012H\u0086@\u00a2\u0006\u0002\u0010cJ\u0016\u0010d\u001a\u00020X2\u0006\u0010\u0018\u001a\u00020\u0019H\u0086@\u00a2\u0006\u0002\u0010VJ\u0006\u0010e\u001a\u00020fJ0\u0010g\u001a\u0004\u0018\u00010h2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u001b2\u0006\u0010i\u001a\u00020\u001b2\u0006\u0010j\u001a\u00020\u001bH\u0086@\u00a2\u0006\u0002\u0010kJ.\u0010l\u001a\b\u0012\u0004\u0012\u00020m0,2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010P\u001a\u00020\u001b2\b\u0010Q\u001a\u0004\u0018\u00010\u001bH\u0086@\u00a2\u0006\u0002\u0010\u001dJ,\u0010n\u001a\u0004\u0018\u00010o2\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010p\u001a\u0004\u0018\u00010q2\b\u0010r\u001a\u0004\u0018\u00010\u001bH\u0086@\u00a2\u0006\u0002\u0010sJ\u000e\u0010t\u001a\u00020uH\u0086@\u00a2\u0006\u0002\u0010vJ\u0083\u0001\u0010w\u001a\u0004\u0018\u00010x2\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010p\u001a\u0004\u0018\u00010q2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u001e\u0010y\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010q\u0018\u00010Mj\f\u0012\u0006\u0012\u0004\u0018\u00010q\u0018\u0001`O2\b\u0010z\u001a\u0004\u0018\u00010\u001b2\u0006\u0010{\u001a\u00020\u00122\u0006\u0010|\u001a\u00020\u00122\b\u0010}\u001a\u0004\u0018\u00010%2\u0006\u0010~\u001a\u00020\u00122\b\u0010\u007f\u001a\u0004\u0018\u00010qH\u0086@\u00a2\u0006\u0003\u0010\u0080\u0001J\"\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0007\u0010\u0082\u0001\u001a\u00020\u001bH\u0086@\u00a2\u0006\u0002\u0010!J4\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010p\u001a\u00020q2\u0007\u0010\u0084\u0001\u001a\u00020q2\u0007\u0010\u0085\u0001\u001a\u00020\u001bH\u0086@\u00a2\u0006\u0003\u0010\u0086\u0001J6\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010p\u001a\u00020q2\n\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0089\u0001H\u0086@\u00a2\u0006\u0003\u0010\u008a\u0001J,\u0010\u008b\u0001\u001a\u00030\u008c\u00012\u0007\u0010\u008d\u0001\u001a\u00020%2\u0007\u0010\u008e\u0001\u001a\u00020\u00172\u0007\u0010\u008f\u0001\u001a\u00020\u0012H\u0086@\u00a2\u0006\u0003\u0010\u0090\u0001J\u0010\u0010\u0091\u0001\u001a\u00020A2\u0007\u0010\u0092\u0001\u001a\u00020AR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0093\u0001"}, d2 = {"Lcom/intellihealth/truemeds/domain/usecase/HomePageUseCase;", "", "homePageRepository", "Lcom/intellihealth/truemeds/domain/repository/HomePageRepository;", "orderFlowRepository", "Lcom/intellihealth/truemeds/domain/repository/OrderFlowRepository;", "productListAndDetailsRepository", "Lcom/intellihealth/truemeds/domain/repository/ProductListAndDetailsRepository;", "dbUseCase", "Lcom/intellihealth/truemeds/domain/usecase/LocalDbUseCase;", "helpFaqAndTnCRepository", "Lcom/intellihealth/truemeds/domain/repository/HelpFaqAndTnCRepository;", "sdkEventUseCase", "Lcom/intellihealth/truemeds/domain/usecase/analytics/SdkEventUseCase;", "context", "Landroid/content/Context;", "(Lcom/intellihealth/truemeds/domain/repository/HomePageRepository;Lcom/intellihealth/truemeds/domain/repository/OrderFlowRepository;Lcom/intellihealth/truemeds/domain/repository/ProductListAndDetailsRepository;Lcom/intellihealth/truemeds/domain/usecase/LocalDbUseCase;Lcom/intellihealth/truemeds/domain/repository/HelpFaqAndTnCRepository;Lcom/intellihealth/truemeds/domain/usecase/analytics/SdkEventUseCase;Landroid/content/Context;)V", "isColdStoragePincode", "", "()Z", "setColdStoragePincode", "(Z)V", "acceptPpAndTnc", "Lokhttp3/ResponseBody;", "mxInternalErrorOccurred", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "customerId", "", "type", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkPinCodeServiceability", "Lcom/intellihealth/truemeds/data/model/home/PinCodeServiceabilityResponse;", "pincode", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchMedicineDetailsOfPatient", "Lcom/intellihealth/truemeds/data/model/home/CustomerMedicinesResponseModel;", "page", "", "result", "patientId", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchTruemedsContactByName", "name", "getAccountTabMenus", "", "Lcom/intellihealth/truemeds/data/model/bottomnav/AccountTabModel;", "getAllCustomerOrders", "Lcom/intellihealth/truemeds/data/model/home/AllCustomersOrdersResponseModel;", "statusIds", "", "patientIds", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;IILjava/util/Set;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBannersForHomePage", "Lcom/intellihealth/truemeds/data/model/home/HomePageBannersResponse;", "subType", "Lcom/intellihealth/truemeds/domain/enums/Banner;", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;Ljava/util/Set;Lcom/intellihealth/truemeds/domain/enums/Banner;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBottomSheetData", "Lcom/intellihealth/truemeds/presentation/model/HomePageBottomSheetInfo;", "bottomSheetType", "Lcom/intellihealth/truemeds/presentation/model/BottomSheetType;", "productNameList", "Lcom/intellihealth/truemeds/data/model/home/AllCustomersOrdersResponseModel$ResponseData$Orders;", "header", "getCompareAndUnderstandSubstituteData", "Lcom/intellihealth/salt/models/ProductComparisonModel;", "getDeliverDetailsProductList", "Lcom/intellihealth/salt/models/ProductInfoModel;", "getDoctorCallMissedBack", "Lcom/intellihealth/truemeds/data/model/home/DeliveryDelayModel;", "getDoctorCallMissedNow", "getDoctorCallMissedNowWithoutTimer", "getFeatureList", "Lcom/intellihealth/truemeds/presentation/fragment/HomePageFeatureName;", "isFtc", "shouldAddReOrderSection", "getHealthArticlesFilterCategoryList", "Ljava/util/ArrayList;", "Lcom/intellihealth/truemeds/data/model/home/CategoryListModel;", "Lkotlin/collections/ArrayList;", "userAgent", "urlParam", "getHealthArticlesResult", "Lretrofit2/Response;", "getPP", "Lcom/intellihealth/truemeds/data/model/helpfaqtnc/PrivacyPolicyAndTnCResponse;", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPrivacyPolicyData", "Lcom/intellihealth/truemeds/data/model/home/PrivacyPolicyBottomSheetModel;", "getRatingDetails", "Lcom/intellihealth/truemeds/data/model/home/RatingDetailsResponseModel;", "getReorderData", "Lcom/intellihealth/truemeds/data/model/home/HomeReorderBottomSheetModel;", "getSuperCategoryList", "Lcom/intellihealth/truemeds/data/model/home/HomePageOtcResponse;", "sessionToken", "selectedWarehouseID", "getTNC", "isPrimary", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTermsAndConditionsData", "getTestimonials", "Lcom/intellihealth/truemeds/data/model/home/TestimonialSectionDataModel;", "getVideoFaq", "Lcom/intellihealth/truemeds/data/model/home/VideoFaqAllResponse;", "limit", "source", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWordpressArticle", "Lcom/intellihealth/truemeds/data/model/healtharticles/HealthArticlesDataModel;", "increaseDigitizedOrderRank", "Lcom/intellihealth/truemeds/data/model/home/IncreaseDigitizedOrderRankModel;", "orderId", "", "transactionId", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/Long;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logout", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reOrder", "Lcom/intellihealth/truemeds/data/model/home/ReorderResponse;", "patientListDto", "variant", "checkAutoConfirmEligibility", "newAlgo", "serialId", "reOrderMedCheck", "variantId", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/Long;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;ZZLjava/lang/Integer;ZLjava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveContactMappingInfo", "version", "savePopUpReasons", "optionReasonId", "optionType", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;JJLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveRatingDetails", "saveRatingDetailsRequestDataModel", "Lcom/intellihealth/truemeds/data/model/orderflow/SaveRatingDetailsRequestDataModel;", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;JLcom/intellihealth/truemeds/data/model/orderflow/SaveRatingDetailsRequestDataModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setErrorResponseBody", "Lcom/intellihealth/truemeds/data/utils/ResponseData;", "errorCode", "errorBody", "isNetworkError", "(ILokhttp3/ResponseBody;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setProductComparison", "data", "app_stageAndroidDebug"})
public final class HomePageUseCase {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.repository.HomePageRepository homePageRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.repository.OrderFlowRepository orderFlowRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.repository.ProductListAndDetailsRepository productListAndDetailsRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.LocalDbUseCase dbUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.repository.HelpFaqAndTnCRepository helpFaqAndTnCRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.analytics.SdkEventUseCase sdkEventUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    private boolean isColdStoragePincode = true;
    
    @javax.inject.Inject()
    public HomePageUseCase(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.repository.HomePageRepository homePageRepository, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.repository.OrderFlowRepository orderFlowRepository, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.repository.ProductListAndDetailsRepository productListAndDetailsRepository, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.LocalDbUseCase dbUseCase, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.repository.HelpFaqAndTnCRepository helpFaqAndTnCRepository, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.analytics.SdkEventUseCase sdkEventUseCase, @dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    public final boolean isColdStoragePincode() {
        return false;
    }
    
    public final void setColdStoragePincode(boolean p0) {
    }
    
    /**
     * Api call for all banners in home
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getBannersForHomePage(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> subType, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.enums.Banner page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.home.HomePageBannersResponse> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.truemeds.data.model.bottomnav.AccountTabModel> getAccountTabMenus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.truemeds.presentation.fragment.HomePageFeatureName> getFeatureList(boolean isFtc, boolean shouldAddReOrderSection) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getRatingDetails(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.home.RatingDetailsResponseModel> $completion) {
        return null;
    }
    
    /**
     * Show article data from this api
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getWordpressArticle(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String userAgent, @org.jetbrains.annotations.Nullable()
    java.lang.String urlParam, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.intellihealth.truemeds.data.model.healtharticles.HealthArticlesDataModel>> $completion) {
        return null;
    }
    
    /**
     * Fetch video faq data
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getVideoFaq(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String page, @org.jetbrains.annotations.NotNull()
    java.lang.String limit, @org.jetbrains.annotations.NotNull()
    java.lang.String source, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.home.VideoFaqAllResponse> $completion) {
        return null;
    }
    
    /**
     * Save order rating deatils
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveRatingDetails(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String customerId, long orderId, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.orderflow.SaveRatingDetailsRequestDataModel saveRatingDetailsRequestDataModel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super okhttp3.ResponseBody> $completion) {
        return null;
    }
    
    /**
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object savePopUpReasons(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, long orderId, long optionReasonId, @org.jetbrains.annotations.NotNull()
    java.lang.String optionType, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super okhttp3.ResponseBody> $completion) {
        return null;
    }
    
    /**
     * Check pin code is serviceable or not
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object checkPinCodeServiceability(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.Nullable()
    java.lang.String pincode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.home.PinCodeServiceabilityResponse> $completion) {
        return null;
    }
    
    /**
     * API call for Doctor Call me
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object increaseDigitizedOrderRank(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, @org.jetbrains.annotations.Nullable()
    java.lang.String transactionId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.home.IncreaseDigitizedOrderRankModel> $completion) {
        return null;
    }
    
    /**
     * Fetch all order of customer
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllCustomerOrders(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String customerId, int page, int result, @org.jetbrains.annotations.Nullable()
    java.util.Set<java.lang.String> statusIds, @org.jetbrains.annotations.NotNull()
    java.lang.String patientIds, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object reOrder(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, @org.jetbrains.annotations.Nullable()
    java.lang.String customerId, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.Long> patientListDto, @org.jetbrains.annotations.Nullable()
    java.lang.String variant, boolean checkAutoConfirmEligibility, boolean newAlgo, @org.jetbrains.annotations.Nullable()
    java.lang.Integer serialId, boolean reOrderMedCheck, @org.jetbrains.annotations.Nullable()
    java.lang.Long variantId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.home.ReorderResponse> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchMedicineDetailsOfPatient(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.Nullable()
    java.lang.String customerId, int page, int result, @org.jetbrains.annotations.Nullable()
    java.lang.String patientId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.home.CustomerMedicinesResponseModel> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object setErrorResponseBody(int errorCode, @org.jetbrains.annotations.NotNull()
    okhttp3.ResponseBody errorBody, boolean isNetworkError, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.ResponseData> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getHealthArticlesResult(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String userAgent, @org.jetbrains.annotations.Nullable()
    java.lang.String urlParam, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getHealthArticlesFilterCategoryList(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String userAgent, @org.jetbrains.annotations.Nullable()
    java.lang.String urlParam, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.ArrayList<com.intellihealth.truemeds.data.model.home.CategoryListModel>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.home.TestimonialSectionDataModel getTestimonials() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.model.HomePageBottomSheetInfo getBottomSheetData(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.model.BottomSheetType bottomSheetType, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel.ResponseData.Orders productNameList, @org.jetbrains.annotations.NotNull()
    java.lang.String header) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.salt.models.ProductComparisonModel setProductComparison(@org.jetbrains.annotations.NotNull()
    com.intellihealth.salt.models.ProductComparisonModel data) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"SuspiciousIndentation"})
    private final com.intellihealth.truemeds.data.model.home.HomeReorderBottomSheetModel getReorderData(com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel.ResponseData.Orders productNameList) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPrivacyPolicyData(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.home.PrivacyPolicyBottomSheetModel> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTermsAndConditionsData(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.home.PrivacyPolicyBottomSheetModel> $completion) {
        return null;
    }
    
    private final com.intellihealth.truemeds.data.model.home.DeliveryDelayModel getDoctorCallMissedNow() {
        return null;
    }
    
    private final com.intellihealth.truemeds.data.model.home.DeliveryDelayModel getDoctorCallMissedNowWithoutTimer() {
        return null;
    }
    
    private final com.intellihealth.truemeds.data.model.home.DeliveryDelayModel getDoctorCallMissedBack() {
        return null;
    }
    
    private final com.intellihealth.salt.models.ProductComparisonModel getCompareAndUnderstandSubstituteData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSuperCategoryList(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String sessionToken, @org.jetbrains.annotations.NotNull()
    java.lang.String selectedWarehouseID, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.home.HomePageOtcResponse> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object logout(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.util.List<com.intellihealth.salt.models.ProductInfoModel> getDeliverDetailsProductList(com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel.ResponseData.Orders productNameList) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPP(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.helpfaqtnc.PrivacyPolicyAndTnCResponse> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTNC(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, boolean isPrimary, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.helpfaqtnc.PrivacyPolicyAndTnCResponse> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object acceptPpAndTnc(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super okhttp3.ResponseBody> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchTruemedsContactByName(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super okhttp3.ResponseBody> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveContactMappingInfo(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String version, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super okhttp3.ResponseBody> $completion) {
        return null;
    }
}