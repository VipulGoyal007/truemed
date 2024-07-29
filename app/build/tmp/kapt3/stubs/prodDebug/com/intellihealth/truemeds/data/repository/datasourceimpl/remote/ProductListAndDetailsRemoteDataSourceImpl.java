package com.intellihealth.truemeds.data.repository.datasourceimpl.remote;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006JJ\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096@\u00a2\u0006\u0002\u0010\u0013J$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\b2\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0096@\u00a2\u0006\u0002\u0010\u0017J8\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u0096@\u00a2\u0006\u0002\u0010\u001eJD\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\b2\u0010\u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\"2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u00052\b\u0010#\u001a\u0004\u0018\u00010\u0010H\u0096@\u00a2\u0006\u0002\u0010$Jj\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\b2\b\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\'\u001a\u0004\u0018\u00010\u00052\b\u0010(\u001a\u0004\u0018\u00010\u00122\b\u0010)\u001a\u0004\u0018\u00010\u00052\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\"2\b\u0010+\u001a\u0004\u0018\u00010\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010,\u001a\u0004\u0018\u00010\u0005H\u0096@\u00a2\u0006\u0002\u0010-J<\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\b2\b\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\'\u001a\u0004\u0018\u00010\u00052\b\u0010(\u001a\u0004\u0018\u00010\u00122\b\u0010+\u001a\u0004\u0018\u00010\u0012H\u0096@\u00a2\u0006\u0002\u00100J2\u00101\u001a\b\u0012\u0004\u0012\u0002020\b2\b\u00103\u001a\u0004\u0018\u00010\u00052\b\u0010,\u001a\u0004\u0018\u00010\u00052\b\u00104\u001a\u0004\u0018\u00010\u0005H\u0096@\u00a2\u0006\u0002\u00105J,\u00106\u001a\b\u0012\u0004\u0012\u0002020\b2\u0006\u0010\'\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u0005H\u0096@\u00a2\u0006\u0002\u00105R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00067"}, d2 = {"Lcom/intellihealth/truemeds/data/repository/datasourceimpl/remote/ProductListAndDetailsRemoteDataSourceImpl;", "Lcom/intellihealth/truemeds/data/repository/datasource/remote/ProductListAndDetailsRemoteDataSource;", "productListAndDetailsApi", "Lcom/intellihealth/truemeds/data/api/ProductListAndDetailsApi;", "contentType", "", "(Lcom/intellihealth/truemeds/data/api/ProductListAndDetailsApi;Ljava/lang/String;)V", "fetchElasticSearch", "Lretrofit2/Response;", "Lcom/intellihealth/truemeds/data/model/productlistanddetails/ElasticSearchResponse;", "warehouseId", "elasticSearchType", "searchString", "isMultiSearch", "", "variantId", "", "sizeCount", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Long;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchMedicineDetails", "Lcom/intellihealth/truemeds/presentation/model/MedicineDetailsResultResponse;", "productCd", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchMedicineDetailsOfPatient", "Lcom/intellihealth/truemeds/data/model/home/CustomerMedicinesResponseModel;", "customerId", "page", "result", "patientId", "(Ljava/lang/String;IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchReOrderOTCProduct", "Lcom/intellihealth/truemeds/data/model/productlistanddetails/ReorderOtcProductResponse;", "productCodes", "", "orderId", "(Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCrossSellingRecommendedProducts", "Lcom/intellihealth/truemeds/data/model/productlistanddetails/CrossSellingRecommendedProductResponse;", "sessionToken", "pageNumber", "type", "subType", "pageSize", "productCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Set;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTrendingSearches", "Lcom/intellihealth/truemeds/data/model/search/TrendingSearchResponse;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveCrossProductAddedData", "Lokhttp3/ResponseBody;", "crossProductCode", "wareHouseId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveProductSearchData", "app_prodDebug"})
public final class ProductListAndDetailsRemoteDataSourceImpl implements com.intellihealth.truemeds.data.repository.datasource.remote.ProductListAndDetailsRemoteDataSource {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.data.api.ProductListAndDetailsApi productListAndDetailsApi = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String contentType = null;
    
    @javax.inject.Inject()
    public ProductListAndDetailsRemoteDataSourceImpl(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.api.ProductListAndDetailsApi productListAndDetailsApi, @javax.inject.Named(value = "content_type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String contentType) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object fetchElasticSearch(@org.jetbrains.annotations.NotNull()
    java.lang.String warehouseId, @org.jetbrains.annotations.NotNull()
    java.lang.String elasticSearchType, @org.jetbrains.annotations.Nullable()
    java.lang.String searchString, boolean isMultiSearch, @org.jetbrains.annotations.Nullable()
    java.lang.Long variantId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer sizeCount, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.productlistanddetails.ElasticSearchResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object fetchMedicineDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String productCd, @org.jetbrains.annotations.NotNull()
    java.lang.String warehouseId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.presentation.model.MedicineDetailsResultResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object fetchReOrderOTCProduct(@org.jetbrains.annotations.Nullable()
    java.util.Set<java.lang.String> productCodes, @org.jetbrains.annotations.Nullable()
    java.lang.String customerId, @org.jetbrains.annotations.Nullable()
    java.lang.String patientId, @org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.productlistanddetails.ReorderOtcProductResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getCrossSellingRecommendedProducts(@org.jetbrains.annotations.Nullable()
    java.lang.String warehouseId, @org.jetbrains.annotations.Nullable()
    java.lang.String sessionToken, @org.jetbrains.annotations.Nullable()
    java.lang.Integer pageNumber, @org.jetbrains.annotations.Nullable()
    java.lang.String type, @org.jetbrains.annotations.Nullable()
    java.util.Set<java.lang.String> subType, @org.jetbrains.annotations.Nullable()
    java.lang.Integer pageSize, @org.jetbrains.annotations.Nullable()
    java.lang.Long variantId, @org.jetbrains.annotations.Nullable()
    java.lang.String productCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.productlistanddetails.CrossSellingRecommendedProductResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object saveProductSearchData(@org.jetbrains.annotations.NotNull()
    java.lang.String sessionToken, @org.jetbrains.annotations.NotNull()
    java.lang.String wareHouseId, @org.jetbrains.annotations.NotNull()
    java.lang.String productCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object saveCrossProductAddedData(@org.jetbrains.annotations.Nullable()
    java.lang.String crossProductCode, @org.jetbrains.annotations.Nullable()
    java.lang.String productCode, @org.jetbrains.annotations.Nullable()
    java.lang.String wareHouseId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object fetchMedicineDetailsOfPatient(@org.jetbrains.annotations.Nullable()
    java.lang.String customerId, int page, int result, @org.jetbrains.annotations.Nullable()
    java.lang.String patientId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.home.CustomerMedicinesResponseModel>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getTrendingSearches(@org.jetbrains.annotations.Nullable()
    java.lang.String warehouseId, @org.jetbrains.annotations.Nullable()
    java.lang.String sessionToken, @org.jetbrains.annotations.Nullable()
    java.lang.Integer pageNumber, @org.jetbrains.annotations.Nullable()
    java.lang.Integer pageSize, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.search.TrendingSearchResponse>> $completion) {
        return null;
    }
}