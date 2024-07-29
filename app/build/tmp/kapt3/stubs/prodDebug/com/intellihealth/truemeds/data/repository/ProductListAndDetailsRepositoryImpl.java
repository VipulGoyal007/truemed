package com.intellihealth.truemeds.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006JX\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096@\u00a2\u0006\u0002\u0010\u0017J2\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0002\u0010\u001bJF\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010\u000eH\u0096@\u00a2\u0006\u0002\u0010\"JR\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0010\u0010%\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010&2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000e2\b\u0010!\u001a\u0004\u0018\u00010\u000e2\b\u0010\'\u001a\u0004\u0018\u00010\u0014H\u0096@\u00a2\u0006\u0002\u0010(Jx\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010+\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010,\u001a\u0004\u0018\u00010\u00162\b\u0010-\u001a\u0004\u0018\u00010\u00162\b\u0010.\u001a\u0004\u0018\u00010\u000e2\b\u0010/\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u000e\u00100\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010&H\u0096@\u00a2\u0006\u0002\u00101JJ\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010+\u001a\u0004\u0018\u00010\u000e2\b\u0010,\u001a\u0004\u0018\u00010\u00162\b\u0010-\u001a\u0004\u0018\u00010\u0016H\u0096@\u00a2\u0006\u0002\u00104J@\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\b\u00107\u001a\u0004\u0018\u00010\u000e2\b\u0010/\u001a\u0004\u0018\u00010\u000e2\b\u00108\u001a\u0004\u0018\u00010\u000eH\u0096@\u00a2\u0006\u0002\u00109J:\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u000e2\u0006\u00108\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0002\u00109R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006;"}, d2 = {"Lcom/intellihealth/truemeds/data/repository/ProductListAndDetailsRepositoryImpl;", "Lcom/intellihealth/truemeds/domain/repository/ProductListAndDetailsRepository;", "productListAndDetailsRemoteDataSource", "Lcom/intellihealth/truemeds/data/repository/datasource/remote/ProductListAndDetailsRemoteDataSource;", "apiCallInitClass", "Lcom/intellihealth/truemeds/data/utils/ApiCallInitClass;", "(Lcom/intellihealth/truemeds/data/repository/datasource/remote/ProductListAndDetailsRemoteDataSource;Lcom/intellihealth/truemeds/data/utils/ApiCallInitClass;)V", "fetchElasticSearch", "Lcom/intellihealth/truemeds/data/utils/Resource;", "Lretrofit2/Response;", "Lcom/intellihealth/truemeds/data/model/productlistanddetails/ElasticSearchResponse;", "mxInternalErrorOccurred", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "warehouseId", "", "elasticSearchType", "searchString", "isMultiSearch", "", "variantId", "", "sizeCount", "", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Long;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchMedicineDetails", "Lcom/intellihealth/truemeds/presentation/model/MedicineDetailsResultResponse;", "productCd", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchMedicineDetailsOfPatient", "Lcom/intellihealth/truemeds/data/model/home/CustomerMedicinesResponseModel;", "customerId", "page", "result", "patientId", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchReOrderOTCProduct", "Lcom/intellihealth/truemeds/data/model/productlistanddetails/ReorderOtcProductResponse;", "productCodes", "", "orderId", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCrossSellingRecommendedProducts", "Lcom/intellihealth/truemeds/data/model/productlistanddetails/CrossSellingRecommendedProductResponse;", "sessionToken", "pageNumber", "pageSize", "type", "productCode", "subType", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTrendingSearches", "Lcom/intellihealth/truemeds/data/model/search/TrendingSearchResponse;", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveCrossProductAddedData", "Lokhttp3/ResponseBody;", "crossProductCode", "wareHouseId", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveProductSearchData", "app_prodDebug"})
public final class ProductListAndDetailsRepositoryImpl implements com.intellihealth.truemeds.domain.repository.ProductListAndDetailsRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.data.repository.datasource.remote.ProductListAndDetailsRemoteDataSource productListAndDetailsRemoteDataSource = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.data.utils.ApiCallInitClass apiCallInitClass = null;
    
    @javax.inject.Inject()
    public ProductListAndDetailsRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.datasource.remote.ProductListAndDetailsRemoteDataSource productListAndDetailsRemoteDataSource, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.utils.ApiCallInitClass apiCallInitClass) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object fetchElasticSearch(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String warehouseId, @org.jetbrains.annotations.NotNull()
    java.lang.String elasticSearchType, @org.jetbrains.annotations.Nullable()
    java.lang.String searchString, boolean isMultiSearch, @org.jetbrains.annotations.Nullable()
    java.lang.Long variantId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer sizeCount, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.productlistanddetails.ElasticSearchResponse>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object fetchMedicineDetails(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String productCd, @org.jetbrains.annotations.NotNull()
    java.lang.String warehouseId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.presentation.model.MedicineDetailsResultResponse>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object fetchReOrderOTCProduct(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.Nullable()
    java.util.Set<java.lang.String> productCodes, @org.jetbrains.annotations.Nullable()
    java.lang.String customerId, @org.jetbrains.annotations.Nullable()
    java.lang.String patientId, @org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.productlistanddetails.ReorderOtcProductResponse>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getCrossSellingRecommendedProducts(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.Nullable()
    java.lang.String sessionToken, @org.jetbrains.annotations.Nullable()
    java.lang.String warehouseId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer pageNumber, @org.jetbrains.annotations.Nullable()
    java.lang.Integer pageSize, @org.jetbrains.annotations.Nullable()
    java.lang.String type, @org.jetbrains.annotations.Nullable()
    java.lang.String productCode, @org.jetbrains.annotations.Nullable()
    java.lang.Long variantId, @org.jetbrains.annotations.Nullable()
    java.util.Set<java.lang.String> subType, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.productlistanddetails.CrossSellingRecommendedProductResponse>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object saveProductSearchData(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String sessionToken, @org.jetbrains.annotations.NotNull()
    java.lang.String wareHouseId, @org.jetbrains.annotations.NotNull()
    java.lang.String productCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<okhttp3.ResponseBody>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object saveCrossProductAddedData(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.Nullable()
    java.lang.String crossProductCode, @org.jetbrains.annotations.Nullable()
    java.lang.String productCode, @org.jetbrains.annotations.Nullable()
    java.lang.String wareHouseId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<okhttp3.ResponseBody>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getTrendingSearches(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.Nullable()
    java.lang.String warehouseId, @org.jetbrains.annotations.Nullable()
    java.lang.String sessionToken, @org.jetbrains.annotations.Nullable()
    java.lang.Integer pageNumber, @org.jetbrains.annotations.Nullable()
    java.lang.Integer pageSize, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.search.TrendingSearchResponse>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object fetchMedicineDetailsOfPatient(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.Nullable()
    java.lang.String customerId, int page, int result, @org.jetbrains.annotations.Nullable()
    java.lang.String patientId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.home.CustomerMedicinesResponseModel>>> $completion) {
        return null;
    }
}