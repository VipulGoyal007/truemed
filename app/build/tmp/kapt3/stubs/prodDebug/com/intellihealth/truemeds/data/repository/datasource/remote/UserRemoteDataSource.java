package com.intellihealth.truemeds.data.repository.datasource.remote;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00ba\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00a6@\u00a2\u0006\u0002\u0010\tJ\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0006\u0010\f\u001a\u00020\bH\u00a6@\u00a2\u0006\u0002\u0010\rJ$\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\bH\u00a6@\u00a2\u0006\u0002\u0010\u0012J(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u00112\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00a6@\u00a2\u0006\u0002\u0010\u0015J0\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\bH\u00a6@\u00a2\u0006\u0002\u0010\u0017J*\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0011H\u00a6@\u00a2\u0006\u0002\u0010\u001cJ\u001e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00a6@\u00a2\u0006\u0002\u0010\u001fJ(\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00032\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00a6@\u00a2\u0006\u0002\u0010$J\u001e\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00a6@\u00a2\u0006\u0002\u0010\u001fJ\u001e\u0010\'\u001a\b\u0012\u0004\u0012\u00020(0\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00a6@\u00a2\u0006\u0002\u0010\u001fJ\u001e\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00a6@\u00a2\u0006\u0002\u0010\u001fJ,\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u00032\u0016\u0010-\u001a\u0012\u0012\u0004\u0012\u00020\u00110.j\b\u0012\u0004\u0012\u00020\u0011`/H\u00a6@\u00a2\u0006\u0002\u00100J(\u00101\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u00112\b\u00102\u001a\u0004\u0018\u00010\bH\u00a6@\u00a2\u0006\u0002\u0010\u0015J2\u00103\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u00104\u001a\u0004\u0018\u00010\u00112\b\u00105\u001a\u0004\u0018\u00010\u0011H\u00a6@\u00a2\u0006\u0002\u00106J(\u00107\u001a\b\u0012\u0004\u0012\u0002080\u00032\b\u00109\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00a6@\u00a2\u0006\u0002\u0010:J\u001c\u0010;\u001a\b\u0012\u0004\u0012\u00020<0\u00032\u0006\u0010=\u001a\u00020>H\u00a6@\u00a2\u0006\u0002\u0010?J.\u0010@\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010A0\u00032\u0006\u0010B\u001a\u00020\u00112\u0006\u0010C\u001a\u00020\u00112\u0006\u0010D\u001a\u00020\u0011H\u00a6@\u00a2\u0006\u0002\u0010EJ\u001c\u0010F\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0006\u00109\u001a\u00020GH\u00a6@\u00a2\u0006\u0002\u0010HJ\"\u0010I\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\f\u0010J\u001a\b\u0012\u0004\u0012\u00020L0KH\u00a6@\u00a2\u0006\u0002\u0010MJ$\u0010N\u001a\b\u0012\u0004\u0012\u00020O0\u00032\u0006\u0010P\u001a\u00020Q2\u0006\u0010\u0007\u001a\u00020\bH\u00a6@\u00a2\u0006\u0002\u0010RJ&\u0010S\u001a\b\u0012\u0004\u0012\u00020O0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00a6@\u00a2\u0006\u0002\u0010\tJ\u001c\u0010T\u001a\b\u0012\u0004\u0012\u00020<0\u00032\u0006\u0010=\u001a\u00020>H\u00a6@\u00a2\u0006\u0002\u0010?\u00a8\u0006U"}, d2 = {"Lcom/intellihealth/truemeds/data/repository/datasource/remote/UserRemoteDataSource;", "", "addPatient", "Lretrofit2/Response;", "Lcom/intellihealth/truemeds/data/model/user/SavePatientResponse;", "patientDetails", "Lcom/intellihealth/truemeds/domain/model/PatientDetails;", "customerId", "", "(Lcom/intellihealth/truemeds/domain/model/PatientDetails;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deactivateCustomerCategory", "Lokhttp3/ResponseBody;", "categoryId", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAddress", "Lcom/intellihealth/truemeds/data/model/home/ApiCoreResponse;", "addressId", "", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deletePatient", "patientId", "(Ljava/lang/String;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "editPatient", "(Lcom/intellihealth/truemeds/domain/model/PatientDetails;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "generateNewToken", "mobileOtpRequest", "Lcom/google/gson/JsonObject;", "source", "(Lcom/google/gson/JsonObject;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllAddresses", "Lcom/intellihealth/truemeds/data/model/user/GetAllAddressResponse;", "(Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllPatient", "Lcom/intellihealth/truemeds/data/model/user/GetAllPatientResponse;", "showMyself", "", "(Ljava/lang/Boolean;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCustomerAndOrderDetailsForHome", "Lcom/intellihealth/truemeds/data/model/home/CustomerHomeDetailsResponseModel;", "getCustomerDeliveryCharge", "Lcom/intellihealth/truemeds/data/model/user/CustomerDeliveryChargeDataResponse;", "getCustomerDetails", "Lcom/intellihealth/truemeds/data/model/user/CustomerDetailsResponse;", "getNameValidationList", "Lcom/intellihealth/truemeds/data/model/user/NameValidationResponse;", "typeList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPatientById", "orderId", "saveAaIdAndFcm", "aaid", "deviceKey", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveAddress", "Lcom/intellihealth/truemeds/data/model/user/SaveAddressResponse;", "addressObj", "(Lcom/google/gson/JsonObject;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveVariantInfo", "Lcom/intellihealth/truemeds/data/model/home/SaveVariantInfoResponse;", "saveVariantInfoRequest", "Lcom/intellihealth/truemeds/data/model/home/SaveVariantInfoRequest;", "(Lcom/intellihealth/truemeds/data/model/home/SaveVariantInfoRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setCustomerCategory", "Lcom/intellihealth/truemeds/data/model/home/CustomerHomeDetailsResponseModel$ResponseData$CustomerDetails$Category;", "category", "categoryType", "sourceVersion", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setCustomerDeviceInfo", "Lcom/example/example/CustomerDeviceInfoRequest;", "(Lcom/example/example/CustomerDeviceInfoRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setEventIdForCustomer", "jsonArray", "", "Lcom/example/example/EventIdForCustomerRequest;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateProfile", "Lcom/intellihealth/truemeds/data/model/user/UpdateProfileResponse;", "nameObj", "Lcom/intellihealth/truemeds/domain/model/CustomerDetails;", "(Lcom/intellihealth/truemeds/domain/model/CustomerDetails;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateProfileForFreshUser", "updateVariantInfo", "app_prodDebug"})
public abstract interface UserRemoteDataSource {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object setCustomerDeviceInfo(@org.jetbrains.annotations.NotNull()
    com.example.example.CustomerDeviceInfoRequest addressObj, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object setEventIdForCustomer(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.example.EventIdForCustomerRequest> jsonArray, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object saveAaIdAndFcm(@org.jetbrains.annotations.Nullable()
    java.lang.Long customerId, @org.jetbrains.annotations.Nullable()
    java.lang.String aaid, @org.jetbrains.annotations.Nullable()
    java.lang.String deviceKey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateProfile(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.model.CustomerDetails nameObj, long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.user.UpdateProfileResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object saveAddress(@org.jetbrains.annotations.Nullable()
    com.google.gson.JsonObject addressObj, @org.jetbrains.annotations.Nullable()
    java.lang.Long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.user.SaveAddressResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String addressId, long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.home.ApiCoreResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAllAddresses(@org.jetbrains.annotations.Nullable()
    java.lang.Long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.user.GetAllAddressResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object addPatient(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.model.PatientDetails patientDetails, @org.jetbrains.annotations.Nullable()
    java.lang.Long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.user.SavePatientResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateProfileForFreshUser(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.model.PatientDetails patientDetails, @org.jetbrains.annotations.Nullable()
    java.lang.Long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.user.UpdateProfileResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object editPatient(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.model.PatientDetails patientDetails, @org.jetbrains.annotations.Nullable()
    java.lang.Long customerId, @org.jetbrains.annotations.Nullable()
    java.lang.Long patientId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.user.SavePatientResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deletePatient(@org.jetbrains.annotations.Nullable()
    java.lang.String patientId, @org.jetbrains.annotations.Nullable()
    java.lang.Long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.home.ApiCoreResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAllPatient(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean showMyself, @org.jetbrains.annotations.Nullable()
    java.lang.Long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.user.GetAllPatientResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPatientById(@org.jetbrains.annotations.Nullable()
    java.lang.String patientId, @org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCustomerDetails(@org.jetbrains.annotations.Nullable()
    java.lang.Long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.user.CustomerDetailsResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCustomerAndOrderDetailsForHome(@org.jetbrains.annotations.Nullable()
    java.lang.Long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.home.CustomerHomeDetailsResponseModel>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCustomerDeliveryCharge(@org.jetbrains.annotations.Nullable()
    java.lang.Long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.user.CustomerDeliveryChargeDataResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object generateNewToken(@org.jetbrains.annotations.Nullable()
    com.google.gson.JsonObject mobileOtpRequest, @org.jetbrains.annotations.Nullable()
    java.lang.String source, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object setCustomerCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String category, @org.jetbrains.annotations.NotNull()
    java.lang.String categoryType, @org.jetbrains.annotations.NotNull()
    java.lang.String sourceVersion, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.home.CustomerHomeDetailsResponseModel.ResponseData.CustomerDetails.Category>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deactivateCustomerCategory(long categoryId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getNameValidationList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> typeList, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.user.NameValidationResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object saveVariantInfo(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.home.SaveVariantInfoRequest saveVariantInfoRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.home.SaveVariantInfoResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateVariantInfo(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.home.SaveVariantInfoRequest saveVariantInfoRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.home.SaveVariantInfoResponse>> $completion);
}