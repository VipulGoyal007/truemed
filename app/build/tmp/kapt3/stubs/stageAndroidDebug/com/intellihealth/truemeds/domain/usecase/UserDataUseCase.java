package com.intellihealth.truemeds.domain.usecase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u008e\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ(\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@\u00a2\u0006\u0002\u0010\u0011J>\u0010\u0012\u001a\u00020\u00132\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0082@\u00a2\u0006\u0002\u0010\u001cJ\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0019H\u0086@\u00a2\u0006\u0002\u0010 J\u001e\u0010!\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u0010H\u0082@\u00a2\u0006\u0002\u0010#J(\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@\u00a2\u0006\u0002\u0010\'J\u0018\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010\u000b\u001a\u00020\fH\u0086@\u00a2\u0006\u0002\u0010*J\f\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,J(\u0010.\u001a\f\u0012\u0006\u0012\u0004\u0018\u000100\u0018\u00010/2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@\u00a2\u0006\u0002\u0010#J(\u00101\u001a\u0004\u0018\u00010)2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u00102\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@\u00a2\u0006\u0002\u00103J \u00104\u001a\u0004\u0018\u0001052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@\u00a2\u0006\u0002\u0010#J\u0016\u00106\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\fH\u0086@\u00a2\u0006\u0002\u0010*J \u00107\u001a\u0004\u0018\u0001082\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@\u00a2\u0006\u0002\u0010#J\"\u00109\u001a\u0004\u0018\u00010:2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0086@\u00a2\u0006\u0002\u0010;J\u000e\u0010<\u001a\u00020\u0019H\u0086@\u00a2\u0006\u0002\u0010=J\u0014\u0010>\u001a\b\u0012\u0004\u0012\u00020?0/H\u0082@\u00a2\u0006\u0002\u0010=J0\u0010@\u001a\u0004\u0018\u00010A2\u0006\u0010\u000b\u001a\u00020\f2\u0016\u0010B\u001a\u0012\u0012\u0004\u0012\u00020\u00190\u0015j\b\u0012\u0004\u0012\u00020\u0019`\u0017H\u0086@\u00a2\u0006\u0002\u0010CJ\f\u0010D\u001a\b\u0012\u0004\u0012\u00020-0,J.\u0010E\u001a\u0012\u0012\u0004\u0012\u00020F0\u0015j\b\u0012\u0004\u0012\u00020F`\u00172\f\u0010G\u001a\b\u0012\u0004\u0012\u00020H0,2\b\u0010I\u001a\u0004\u0018\u00010\u0019J\u0016\u0010J\u001a\u00020\u00192\u0006\u0010K\u001a\u00020\u0019H\u0082@\u00a2\u0006\u0002\u0010 J \u0010L\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010M\u0018\u00010/2\u0006\u0010N\u001a\u00020)H\u0086@\u00a2\u0006\u0002\u0010OJ4\u0010P\u001a\u0004\u0018\u00010Q2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010R\u001a\u00020\u00192\b\u0010S\u001a\u0004\u0018\u00010\u0019H\u0086@\u00a2\u0006\u0002\u0010TJ(\u0010U\u001a\u0004\u0018\u00010V2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010W\u001a\u00020X2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@\u00a2\u0006\u0002\u0010YJ\u000e\u0010Z\u001a\u00020\u00132\u0006\u0010N\u001a\u000208J&\u0010[\u001a\u00020\u00132\u0006\u0010\\\u001a\u00020]2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0086@\u00a2\u0006\u0002\u0010^J\u0016\u0010_\u001a\u00020\u00132\u0006\u0010`\u001a\u00020aH\u0082@\u00a2\u0006\u0002\u0010bJ.\u0010c\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020\u00192\u0006\u0010g\u001a\u00020\u0019H\u0086@\u00a2\u0006\u0002\u0010hJ \u0010i\u001a\u0004\u0018\u00010Q2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010j\u001a\u00020kH\u0086@\u00a2\u0006\u0002\u0010lJ&\u0010m\u001a\u0004\u0018\u00010Q2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010n\u001a\b\u0012\u0004\u0012\u00020o0/H\u0086@\u00a2\u0006\u0002\u0010pJ\u001e\u0010q\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\fH\u0086@\u00a2\u0006\u0002\u0010rJ.\u0010s\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\f2\u000e\u0010t\u001a\n\u0012\u0004\u0012\u00020a\u0018\u00010/2\u0006\u0010u\u001a\u00020\u001bH\u0086@\u00a2\u0006\u0002\u0010vJ(\u0010w\u001a\u0004\u0018\u00010x2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010y\u001a\u00020z2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@\u00a2\u0006\u0002\u0010{J\u001e\u0010|\u001a\u00020\u00132\u0006\u0010\\\u001a\u00020]2\u0006\u0010\u000b\u001a\u00020\fH\u0086@\u00a2\u0006\u0002\u0010}R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006~"}, d2 = {"Lcom/intellihealth/truemeds/domain/usecase/UserDataUseCase;", "", "localDbUseCase", "Lcom/intellihealth/truemeds/domain/usecase/LocalDbUseCase;", "userDataRepository", "Lcom/intellihealth/truemeds/domain/repository/UserDataRepository;", "sdkEventUseCase", "Lcom/intellihealth/truemeds/domain/usecase/analytics/SdkEventUseCase;", "(Lcom/intellihealth/truemeds/domain/usecase/LocalDbUseCase;Lcom/intellihealth/truemeds/domain/repository/UserDataRepository;Lcom/intellihealth/truemeds/domain/usecase/analytics/SdkEventUseCase;)V", "addPatient", "Lcom/intellihealth/truemeds/data/model/user/SavePatientResponse;", "mxInternalErrorOccurred", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "patientDetails", "Lcom/intellihealth/truemeds/domain/model/PatientDetails;", "customerId", "", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Lcom/intellihealth/truemeds/domain/model/PatientDetails;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "callSaveVariantInfoApi", "", "experimentMappings", "Ljava/util/ArrayList;", "Lcom/intellihealth/truemeds/data/model/home/SaveVariantInfoRequest$ExperimentMapping;", "Lkotlin/collections/ArrayList;", "sessionToken", "", "triggerExperimentStarted", "", "(Ljava/util/ArrayList;Ljava/lang/String;Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkNameExist", "", "name", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deactivateCustomerCategory", "categoryId", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAddress", "Lcom/intellihealth/truemeds/data/model/home/ApiCoreResponse;", "addressId", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getALlPatientList", "Lcom/intellihealth/truemeds/data/model/user/GetAllPatientResponse;", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAddressList", "", "Lcom/intellihealth/salt/models/AddressPatientDetailsCardModel;", "getAllAddresses", "", "Lcom/intellihealth/truemeds/data/model/user/GetAllAddressResponse$ResponseObj;", "getAllPatients", "showMyself", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;ZJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCustomerAndOrderDetailsForHome", "Lcom/intellihealth/truemeds/data/model/home/CustomerHomeDetailsResponseModel;", "getCustomerCategoryDetails", "getCustomerDeliveryCharge", "Lcom/intellihealth/truemeds/data/model/user/CustomerDeliveryChargeDataResponse;", "getCustomerDetails", "Lcom/intellihealth/truemeds/data/model/user/CustomerDetailsResponse;", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getInternetIp", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMissingVariant", "Lcom/intellihealth/truemeds/domain/enums/UserCategoryServerEnum;", "getNameValidationList", "Lcom/intellihealth/truemeds/data/model/user/NameValidationResponse;", "typeList", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/util/ArrayList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPatientList", "getSubCategoryTypeList", "Lcom/intellihealth/truemeds/data/model/user/GetAllSubCategoryTypeResponse$SubCategoryType;", "subList", "Lcom/intellihealth/truemeds/data/model/home/ChildCategoryModel;", "category", "getVariantFromFirebase", "firebaseParameterKey", "processPatientsResponse", "Lcom/intellihealth/truemeds/data/model/user/GetAllPatientResponse$Patient;", "response", "(Lcom/intellihealth/truemeds/data/model/user/GetAllPatientResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveAaIdAndFcm", "Lokhttp3/ResponseBody;", "aaid", "deviceKey", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveAddress", "Lcom/intellihealth/truemeds/data/model/user/SaveAddressResponse;", "jsonBody", "Lcom/google/gson/JsonObject;", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Lcom/google/gson/JsonObject;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveDeliveryChargeAndBaseDiscount", "saveVariantInfo", "saveVariantInfoRequest", "Lcom/intellihealth/truemeds/data/model/home/SaveVariantInfoRequest;", "(Lcom/intellihealth/truemeds/data/model/home/SaveVariantInfoRequest;Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setAlgoSpecificData", "userCategoryItem", "Lcom/intellihealth/truemeds/data/model/home/CustomerHomeDetailsResponseModel$ResponseData$CustomerDetails$Category;", "(Lcom/intellihealth/truemeds/data/model/home/CustomerHomeDetailsResponseModel$ResponseData$CustomerDetails$Category;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setCustomerCategory", "userCategoryEnum", "Lcom/intellihealth/truemeds/domain/enums/UserCategoryEnum;", "ipVariant", "sourceVersion", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Lcom/intellihealth/truemeds/domain/enums/UserCategoryEnum;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setCustomerDeviceInfo", "addressObj", "Lcom/example/example/CustomerDeviceInfoRequest;", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Lcom/example/example/CustomerDeviceInfoRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setEventIdForCustomer", "jsonArray", "Lcom/example/example/EventIdForCustomerRequest;", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setVariantInfo", "(Ljava/lang/String;Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setupUserCategory", "customerCategoryList", "hasDeliveredOrder", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateProfile", "Lcom/intellihealth/truemeds/data/model/user/UpdateProfileResponse;", "customerDetail", "Lcom/intellihealth/truemeds/domain/model/CustomerDetails;", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Lcom/intellihealth/truemeds/domain/model/CustomerDetails;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateVariantInfo", "(Lcom/intellihealth/truemeds/data/model/home/SaveVariantInfoRequest;Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_stageAndroidDebug"})
public final class UserDataUseCase {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.LocalDbUseCase localDbUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.repository.UserDataRepository userDataRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.analytics.SdkEventUseCase sdkEventUseCase = null;
    
    @javax.inject.Inject()
    public UserDataUseCase(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.LocalDbUseCase localDbUseCase, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.repository.UserDataRepository userDataRepository, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.analytics.SdkEventUseCase sdkEventUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCustomerAndOrderDetailsForHome(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.home.CustomerHomeDetailsResponseModel> $completion) {
        return null;
    }
    
    /**
     * This function is used to get the details of the customer
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCustomerDetails(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.Nullable()
    java.lang.Long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.user.CustomerDetailsResponse> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getInternetIp(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object setCustomerDeviceInfo(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    com.example.example.CustomerDeviceInfoRequest addressObj, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super okhttp3.ResponseBody> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveAaIdAndFcm(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.Nullable()
    java.lang.Long customerId, @org.jetbrains.annotations.NotNull()
    java.lang.String aaid, @org.jetbrains.annotations.Nullable()
    java.lang.String deviceKey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super okhttp3.ResponseBody> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object setEventIdForCustomer(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.example.EventIdForCustomerRequest> jsonArray, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super okhttp3.ResponseBody> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCustomerCategoryDetails(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object setupUserCategory(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.Nullable()
    java.util.List<com.intellihealth.truemeds.data.model.home.CustomerHomeDetailsResponseModel.ResponseData.CustomerDetails.Category> customerCategoryList, boolean hasDeliveredOrder, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.lang.Object setAlgoSpecificData(com.intellihealth.truemeds.data.model.home.CustomerHomeDetailsResponseModel.ResponseData.CustomerDetails.Category userCategoryItem, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.lang.Object deactivateCustomerCategory(com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, long categoryId, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object setCustomerCategory(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.enums.UserCategoryEnum userCategoryEnum, @org.jetbrains.annotations.NotNull()
    java.lang.String ipVariant, @org.jetbrains.annotations.NotNull()
    java.lang.String sourceVersion, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    /**
     * This method will fetch variant from firebase
     */
    private final java.lang.Object getVariantFromFirebase(java.lang.String firebaseParameterKey, kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCustomerDeliveryCharge(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.user.CustomerDeliveryChargeDataResponse> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllPatients(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, boolean showMyself, long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.user.GetAllPatientResponse> $completion) {
        return null;
    }
    
    public final void saveDeliveryChargeAndBaseDiscount(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.user.CustomerDeliveryChargeDataResponse response) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllAddresses(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.intellihealth.truemeds.data.model.user.GetAllAddressResponse.ResponseObj>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteAddress(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String addressId, long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.home.ApiCoreResponse> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveAddress(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    com.google.gson.JsonObject jsonBody, long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.user.SaveAddressResponse> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getALlPatientList(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.user.GetAllPatientResponse> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object processPatientsResponse(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.user.GetAllPatientResponse response, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.intellihealth.truemeds.data.model.user.GetAllPatientResponse.Patient>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.salt.models.AddressPatientDetailsCardModel> getPatientList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.salt.models.AddressPatientDetailsCardModel> getAddressList() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateProfile(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.model.CustomerDetails customerDetail, long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.user.UpdateProfileResponse> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addPatient(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.model.PatientDetails patientDetails, long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.user.SavePatientResponse> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.intellihealth.truemeds.data.model.user.GetAllSubCategoryTypeResponse.SubCategoryType> getSubCategoryTypeList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.home.ChildCategoryModel> subList, @org.jetbrains.annotations.Nullable()
    java.lang.String category) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getNameValidationList(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> typeList, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.user.NameValidationResponse> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object checkNameExist(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveVariantInfo(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.home.SaveVariantInfoRequest saveVariantInfoRequest, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, boolean triggerExperimentStarted, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateVariantInfo(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.home.SaveVariantInfoRequest saveVariantInfoRequest, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.lang.Object getMissingVariant(kotlin.coroutines.Continuation<? super java.util.List<? extends com.intellihealth.truemeds.domain.enums.UserCategoryServerEnum>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object setVariantInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String sessionToken, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.lang.Object callSaveVariantInfoApi(java.util.ArrayList<com.intellihealth.truemeds.data.model.home.SaveVariantInfoRequest.ExperimentMapping> experimentMappings, java.lang.String sessionToken, com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, boolean triggerExperimentStarted, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}