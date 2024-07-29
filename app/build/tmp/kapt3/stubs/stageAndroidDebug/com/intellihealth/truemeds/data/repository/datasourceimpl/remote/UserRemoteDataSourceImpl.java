package com.intellihealth.truemeds.data.repository.datasourceimpl.remote;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00c2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096@\u00a2\u0006\u0002\u0010\u000eJ\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\u0006\u0010\u0011\u001a\u00020\rH\u0096@\u00a2\u0006\u0002\u0010\u0012J$\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\b2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0096@\u00a2\u0006\u0002\u0010\u0016J(\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096@\u00a2\u0006\u0002\u0010\u0019J0\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\rH\u0096@\u00a2\u0006\u0002\u0010\u001bJ*\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u0096@\u00a2\u0006\u0002\u0010 J\u001e\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096@\u00a2\u0006\u0002\u0010#J(\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\b2\b\u0010&\u001a\u0004\u0018\u00010\'2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096@\u00a2\u0006\u0002\u0010(J\u001e\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096@\u00a2\u0006\u0002\u0010#J\u001e\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096@\u00a2\u0006\u0002\u0010#J\u001e\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096@\u00a2\u0006\u0002\u0010#J,\u0010/\u001a\b\u0012\u0004\u0012\u0002000\b2\u0016\u00101\u001a\u0012\u0012\u0004\u0012\u00020\u000502j\b\u0012\u0004\u0012\u00020\u0005`3H\u0096@\u00a2\u0006\u0002\u00104J(\u00105\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00052\b\u00106\u001a\u0004\u0018\u00010\rH\u0096@\u00a2\u0006\u0002\u0010\u0019J2\u00107\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u00108\u001a\u0004\u0018\u00010\u00052\b\u00109\u001a\u0004\u0018\u00010\u0005H\u0096@\u00a2\u0006\u0002\u0010:J(\u0010;\u001a\b\u0012\u0004\u0012\u00020<0\b2\b\u0010=\u001a\u0004\u0018\u00010\u001e2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096@\u00a2\u0006\u0002\u0010>J\u001c\u0010?\u001a\b\u0012\u0004\u0012\u00020@0\b2\u0006\u0010A\u001a\u00020BH\u0096@\u00a2\u0006\u0002\u0010CJ.\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010E0\b2\u0006\u0010F\u001a\u00020\u00052\u0006\u0010G\u001a\u00020\u00052\u0006\u0010H\u001a\u00020\u0005H\u0096@\u00a2\u0006\u0002\u0010IJ\u001c\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\u0006\u0010=\u001a\u00020KH\u0096@\u00a2\u0006\u0002\u0010LJ\"\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020P0OH\u0096@\u00a2\u0006\u0002\u0010QJ$\u0010R\u001a\b\u0012\u0004\u0012\u00020S0\b2\u0006\u0010T\u001a\u00020U2\u0006\u0010\f\u001a\u00020\rH\u0096@\u00a2\u0006\u0002\u0010VJ&\u0010W\u001a\b\u0012\u0004\u0012\u00020S0\b2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096@\u00a2\u0006\u0002\u0010\u000eJ\u001c\u0010X\u001a\b\u0012\u0004\u0012\u00020@0\b2\u0006\u0010A\u001a\u00020BH\u0096@\u00a2\u0006\u0002\u0010CR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006Y"}, d2 = {"Lcom/intellihealth/truemeds/data/repository/datasourceimpl/remote/UserRemoteDataSourceImpl;", "Lcom/intellihealth/truemeds/data/repository/datasource/remote/UserRemoteDataSource;", "userDataApi", "Lcom/intellihealth/truemeds/data/api/UserDataApi;", "contentType", "", "(Lcom/intellihealth/truemeds/data/api/UserDataApi;Ljava/lang/String;)V", "addPatient", "Lretrofit2/Response;", "Lcom/intellihealth/truemeds/data/model/user/SavePatientResponse;", "patientDetails", "Lcom/intellihealth/truemeds/domain/model/PatientDetails;", "customerId", "", "(Lcom/intellihealth/truemeds/domain/model/PatientDetails;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deactivateCustomerCategory", "Lokhttp3/ResponseBody;", "categoryId", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAddress", "Lcom/intellihealth/truemeds/data/model/home/ApiCoreResponse;", "addressId", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deletePatient", "patientId", "(Ljava/lang/String;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "editPatient", "(Lcom/intellihealth/truemeds/domain/model/PatientDetails;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "generateNewToken", "mobileOtpRequest", "Lcom/google/gson/JsonObject;", "source", "(Lcom/google/gson/JsonObject;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllAddresses", "Lcom/intellihealth/truemeds/data/model/user/GetAllAddressResponse;", "(Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllPatient", "Lcom/intellihealth/truemeds/data/model/user/GetAllPatientResponse;", "showMyself", "", "(Ljava/lang/Boolean;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCustomerAndOrderDetailsForHome", "Lcom/intellihealth/truemeds/data/model/home/CustomerHomeDetailsResponseModel;", "getCustomerDeliveryCharge", "Lcom/intellihealth/truemeds/data/model/user/CustomerDeliveryChargeDataResponse;", "getCustomerDetails", "Lcom/intellihealth/truemeds/data/model/user/CustomerDetailsResponse;", "getNameValidationList", "Lcom/intellihealth/truemeds/data/model/user/NameValidationResponse;", "typeList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPatientById", "orderId", "saveAaIdAndFcm", "aaid", "deviceKey", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveAddress", "Lcom/intellihealth/truemeds/data/model/user/SaveAddressResponse;", "addressObj", "(Lcom/google/gson/JsonObject;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveVariantInfo", "Lcom/intellihealth/truemeds/data/model/home/SaveVariantInfoResponse;", "saveVariantInfoRequest", "Lcom/intellihealth/truemeds/data/model/home/SaveVariantInfoRequest;", "(Lcom/intellihealth/truemeds/data/model/home/SaveVariantInfoRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setCustomerCategory", "Lcom/intellihealth/truemeds/data/model/home/CustomerHomeDetailsResponseModel$ResponseData$CustomerDetails$Category;", "category", "categoryType", "sourceVersion", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setCustomerDeviceInfo", "Lcom/example/example/CustomerDeviceInfoRequest;", "(Lcom/example/example/CustomerDeviceInfoRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setEventIdForCustomer", "jsonArray", "", "Lcom/example/example/EventIdForCustomerRequest;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateProfile", "Lcom/intellihealth/truemeds/data/model/user/UpdateProfileResponse;", "nameObj", "Lcom/intellihealth/truemeds/domain/model/CustomerDetails;", "(Lcom/intellihealth/truemeds/domain/model/CustomerDetails;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateProfileForFreshUser", "updateVariantInfo", "app_stageAndroidDebug"})
public final class UserRemoteDataSourceImpl implements com.intellihealth.truemeds.data.repository.datasource.remote.UserRemoteDataSource {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.data.api.UserDataApi userDataApi = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String contentType = null;
    
    @javax.inject.Inject()
    public UserRemoteDataSourceImpl(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.api.UserDataApi userDataApi, @javax.inject.Named(value = "content_type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String contentType) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object setCustomerDeviceInfo(@org.jetbrains.annotations.NotNull()
    com.example.example.CustomerDeviceInfoRequest addressObj, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object setEventIdForCustomer(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.example.EventIdForCustomerRequest> jsonArray, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object saveAaIdAndFcm(@org.jetbrains.annotations.Nullable()
    java.lang.Long customerId, @org.jetbrains.annotations.Nullable()
    java.lang.String aaid, @org.jetbrains.annotations.Nullable()
    java.lang.String deviceKey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object updateProfile(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.model.CustomerDetails nameObj, long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.user.UpdateProfileResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object saveAddress(@org.jetbrains.annotations.Nullable()
    com.google.gson.JsonObject addressObj, @org.jetbrains.annotations.Nullable()
    java.lang.Long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.user.SaveAddressResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object deleteAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String addressId, long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.home.ApiCoreResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getAllAddresses(@org.jetbrains.annotations.Nullable()
    java.lang.Long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.user.GetAllAddressResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object addPatient(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.model.PatientDetails patientDetails, @org.jetbrains.annotations.Nullable()
    java.lang.Long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.user.SavePatientResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object updateProfileForFreshUser(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.model.PatientDetails patientDetails, @org.jetbrains.annotations.Nullable()
    java.lang.Long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.user.UpdateProfileResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object editPatient(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.model.PatientDetails patientDetails, @org.jetbrains.annotations.Nullable()
    java.lang.Long customerId, @org.jetbrains.annotations.Nullable()
    java.lang.Long patientId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.user.SavePatientResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object deletePatient(@org.jetbrains.annotations.Nullable()
    java.lang.String patientId, @org.jetbrains.annotations.Nullable()
    java.lang.Long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.home.ApiCoreResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getAllPatient(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean showMyself, @org.jetbrains.annotations.Nullable()
    java.lang.Long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.user.GetAllPatientResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getPatientById(@org.jetbrains.annotations.Nullable()
    java.lang.String patientId, @org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getCustomerDetails(@org.jetbrains.annotations.Nullable()
    java.lang.Long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.user.CustomerDetailsResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getCustomerAndOrderDetailsForHome(@org.jetbrains.annotations.Nullable()
    java.lang.Long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.home.CustomerHomeDetailsResponseModel>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getCustomerDeliveryCharge(@org.jetbrains.annotations.Nullable()
    java.lang.Long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.user.CustomerDeliveryChargeDataResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object generateNewToken(@org.jetbrains.annotations.Nullable()
    com.google.gson.JsonObject mobileOtpRequest, @org.jetbrains.annotations.Nullable()
    java.lang.String source, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object setCustomerCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String category, @org.jetbrains.annotations.NotNull()
    java.lang.String categoryType, @org.jetbrains.annotations.NotNull()
    java.lang.String sourceVersion, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.home.CustomerHomeDetailsResponseModel.ResponseData.CustomerDetails.Category>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object deactivateCustomerCategory(long categoryId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getNameValidationList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> typeList, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.user.NameValidationResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object saveVariantInfo(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.home.SaveVariantInfoRequest saveVariantInfoRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.home.SaveVariantInfoResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object updateVariantInfo(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.home.SaveVariantInfoRequest saveVariantInfoRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.home.SaveVariantInfoResponse>> $completion) {
        return null;
    }
}