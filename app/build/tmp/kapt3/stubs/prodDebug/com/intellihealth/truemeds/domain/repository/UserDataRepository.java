package com.intellihealth.truemeds.domain.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00c4\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J4\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u00a6@\u00a2\u0006\u0002\u0010\fJ*\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000bH\u00a6@\u00a2\u0006\u0002\u0010\u0010J4\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u000bH\u00a6@\u00a2\u0006\u0002\u0010\u0015J6\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00142\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u00a6@\u00a2\u0006\u0002\u0010\u0018J>\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000bH\u00a6@\u00a2\u0006\u0002\u0010\u001aJ:\u0010\u001b\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0014H\u00a6@\u00a2\u0006\u0002\u0010\u001fJ,\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u00a6@\u00a2\u0006\u0002\u0010\"J6\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u00a6@\u00a2\u0006\u0002\u0010\'J,\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u00a6@\u00a2\u0006\u0002\u0010\"J,\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u00a6@\u00a2\u0006\u0002\u0010\"J,\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u00a6@\u00a2\u0006\u0002\u0010\"J:\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0016\u00100\u001a\u0012\u0012\u0004\u0012\u00020\u001401j\b\u0012\u0004\u0012\u00020\u0014`2H\u00a6@\u00a2\u0006\u0002\u00103J6\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00142\b\u00105\u001a\u0004\u0018\u00010\u000bH\u00a6@\u00a2\u0006\u0002\u0010\u0018J>\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u00107\u001a\u00020\u00142\b\u00108\u001a\u0004\u0018\u00010\u0014H\u00a6@\u00a2\u0006\u0002\u00109J6\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010<\u001a\u0004\u0018\u00010\u001d2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u00a6@\u00a2\u0006\u0002\u0010=J*\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0\u00040\u00032\u0006\u0010@\u001a\u00020A2\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00a2\u0006\u0002\u0010BJ>\u0010C\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010D0\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010E\u001a\u00020\u00142\u0006\u0010F\u001a\u00020\u00142\u0006\u0010G\u001a\u00020\u0014H\u00a6@\u00a2\u0006\u0002\u0010HJ*\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010<\u001a\u00020JH\u00a6@\u00a2\u0006\u0002\u0010KJ0\u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010M\u001a\b\u0012\u0004\u0012\u00020O0NH\u00a6@\u00a2\u0006\u0002\u0010PJ2\u0010Q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020R0\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010S\u001a\u00020T2\u0006\u0010\n\u001a\u00020\u000bH\u00a6@\u00a2\u0006\u0002\u0010UJ2\u0010V\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020R0\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u00a6@\u00a2\u0006\u0002\u0010WJ*\u0010X\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0\u00040\u00032\u0006\u0010@\u001a\u00020A2\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00a2\u0006\u0002\u0010B\u00a8\u0006Y"}, d2 = {"Lcom/intellihealth/truemeds/domain/repository/UserDataRepository;", "", "addPatient", "Lcom/intellihealth/truemeds/data/utils/Resource;", "Lretrofit2/Response;", "Lcom/intellihealth/truemeds/data/model/user/SavePatientResponse;", "mxInternalErrorOccurred", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "patientDetails", "Lcom/intellihealth/truemeds/domain/model/PatientDetails;", "customerId", "", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Lcom/intellihealth/truemeds/domain/model/PatientDetails;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deactivateCustomerCategory", "Lokhttp3/ResponseBody;", "categoryId", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAddress", "Lcom/intellihealth/truemeds/data/model/home/ApiCoreResponse;", "addressId", "", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deletePatient", "patientId", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "editPatient", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Lcom/intellihealth/truemeds/domain/model/PatientDetails;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "generateNewToken", "mobileOtpRequest", "Lcom/google/gson/JsonObject;", "source", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Lcom/google/gson/JsonObject;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllAddresses", "Lcom/intellihealth/truemeds/data/model/user/GetAllAddressResponse;", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllPatient", "Lcom/intellihealth/truemeds/data/model/user/GetAllPatientResponse;", "showMyself", "", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/Boolean;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCustomerAndOrderDetailsForHome", "Lcom/intellihealth/truemeds/data/model/home/CustomerHomeDetailsResponseModel;", "getCustomerDeliveryCharge", "Lcom/intellihealth/truemeds/data/model/user/CustomerDeliveryChargeDataResponse;", "getCustomerDetails", "Lcom/intellihealth/truemeds/data/model/user/CustomerDetailsResponse;", "getNameValidationList", "Lcom/intellihealth/truemeds/data/model/user/NameValidationResponse;", "typeList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/util/ArrayList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPatientById", "orderId", "saveAaIdAndFcm", "aaid", "deviceKey", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveAddress", "Lcom/intellihealth/truemeds/data/model/user/SaveAddressResponse;", "addressObj", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Lcom/google/gson/JsonObject;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveVariantInfo", "Lcom/intellihealth/truemeds/data/model/home/SaveVariantInfoResponse;", "saveVariantInfoRequest", "Lcom/intellihealth/truemeds/data/model/home/SaveVariantInfoRequest;", "(Lcom/intellihealth/truemeds/data/model/home/SaveVariantInfoRequest;Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setCustomerCategory", "Lcom/intellihealth/truemeds/data/model/home/CustomerHomeDetailsResponseModel$ResponseData$CustomerDetails$Category;", "category", "categoryType", "sourceVersion", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setCustomerDeviceInfo", "Lcom/example/example/CustomerDeviceInfoRequest;", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Lcom/example/example/CustomerDeviceInfoRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setEventIdForCustomer", "jsonArray", "", "Lcom/example/example/EventIdForCustomerRequest;", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateProfile", "Lcom/intellihealth/truemeds/data/model/user/UpdateProfileResponse;", "nameObj", "Lcom/intellihealth/truemeds/domain/model/CustomerDetails;", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Lcom/intellihealth/truemeds/domain/model/CustomerDetails;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateProfileForFreshUser", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Lcom/intellihealth/truemeds/domain/model/PatientDetails;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateVariantInfo", "app_prodDebug"})
public abstract interface UserDataRepository {
    
    /**
     * This service save customer device information ie deviceModel,manufacturerName,osVersion,customerId etc...
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object setCustomerDeviceInfo(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    com.example.example.CustomerDeviceInfoRequest addressObj, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<okhttp3.ResponseBody>>> $completion);
    
    /**
     * This service save customer device GoogleAdId,sdkVersion,customerId,sdkSource etc..
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object setEventIdForCustomer(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.example.EventIdForCustomerRequest> jsonArray, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<okhttp3.ResponseBody>>> $completion);
    
    /**
     * This service save customer GoogleAdId and Firebase id
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object saveAaIdAndFcm(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.Nullable()
    java.lang.Long customerId, @org.jetbrains.annotations.NotNull()
    java.lang.String aaid, @org.jetbrains.annotations.Nullable()
    java.lang.String deviceKey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<okhttp3.ResponseBody>>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateProfile(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.model.CustomerDetails nameObj, long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.user.UpdateProfileResponse>>> $completion);
    
    /**
     * This service save customer address that customer enter data from address detail
     * This used for Edit address also
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object saveAddress(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.Nullable()
    com.google.gson.JsonObject addressObj, @org.jetbrains.annotations.Nullable()
    java.lang.Long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.user.SaveAddressResponse>>> $completion);
    
    /**
     * This service use for delete address
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteAddress(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String addressId, long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.home.ApiCoreResponse>>> $completion);
    
    /**
     * Fetch all saved customer address
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAllAddresses(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.Nullable()
    java.lang.Long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.user.GetAllAddressResponse>>> $completion);
    
    /**
     * This service create and save patient with patientName,age,gender,relationId,patientId..in object
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object addPatient(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.model.PatientDetails patientDetails, @org.jetbrains.annotations.Nullable()
    java.lang.Long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.user.SavePatientResponse>>> $completion);
    
    /**
     * update profile for fresh user
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateProfileForFreshUser(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.model.PatientDetails patientDetails, long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.user.UpdateProfileResponse>>> $completion);
    
    /**
     * This service edit patient with patientName,age,gender,relationId,patientId..in object
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object editPatient(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.model.PatientDetails patientDetails, @org.jetbrains.annotations.Nullable()
    java.lang.Long customerId, @org.jetbrains.annotations.Nullable()
    java.lang.Long patientId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.user.SavePatientResponse>>> $completion);
    
    /**
     * This service use for delete patient
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deletePatient(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.Nullable()
    java.lang.String patientId, @org.jetbrains.annotations.Nullable()
    java.lang.Long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.home.ApiCoreResponse>>> $completion);
    
    /**
     * This service provides all patient list of customer
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAllPatient(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean showMyself, @org.jetbrains.annotations.Nullable()
    java.lang.Long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.user.GetAllPatientResponse>>> $completion);
    
    /**
     * This service provides patient details using patient id
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPatientById(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.Nullable()
    java.lang.String patientId, @org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<okhttp3.ResponseBody>>> $completion);
    
    /**
     * This service provides customer details using customer id
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCustomerDetails(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.Nullable()
    java.lang.Long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.user.CustomerDetailsResponse>>> $completion);
    
    /**
     * This service provides customer and order details
     * Live orders, incomplete order id, list of all variants for the users comes in this api
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCustomerAndOrderDetailsForHome(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.Nullable()
    java.lang.Long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.home.CustomerHomeDetailsResponseModel>>> $completion);
    
    /**
     * This service provides customer order number based delivery charge and minimum cart value data
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCustomerDeliveryCharge(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.Nullable()
    java.lang.Long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.user.CustomerDeliveryChargeDataResponse>>> $completion);
    
    /**
     * This service generate new token
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object generateNewToken(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.Nullable()
    com.google.gson.JsonObject mobileOtpRequest, @org.jetbrains.annotations.Nullable()
    java.lang.String source, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<okhttp3.ResponseBody>>> $completion);
    
    /**
     * This service creates customer category for variant
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object setCustomerCategory(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String category, @org.jetbrains.annotations.NotNull()
    java.lang.String categoryType, @org.jetbrains.annotations.NotNull()
    java.lang.String sourceVersion, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.home.CustomerHomeDetailsResponseModel.ResponseData.CustomerDetails.Category>>> $completion);
    
    /**
     * This service deactivate category for variant
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deactivateCustomerCategory(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, long categoryId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<okhttp3.ResponseBody>>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getNameValidationList(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> typeList, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.user.NameValidationResponse>>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object saveVariantInfo(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.home.SaveVariantInfoRequest saveVariantInfoRequest, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.home.SaveVariantInfoResponse>>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateVariantInfo(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.home.SaveVariantInfoRequest saveVariantInfoRequest, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.home.SaveVariantInfoResponse>>> $completion);
}