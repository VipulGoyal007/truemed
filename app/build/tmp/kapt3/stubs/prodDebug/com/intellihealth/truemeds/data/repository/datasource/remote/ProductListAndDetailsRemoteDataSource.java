package com.intellihealth.truemeds.data.repository.datasource.remote;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001JJ\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00a6@\u00a2\u0006\u0002\u0010\u000fJ$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00a2\u0006\u0002\u0010\u0013J8\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u00a6@\u00a2\u0006\u0002\u0010\u001aJD\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00032\u0010\u0010\u001d\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u001e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\fH\u00a6@\u00a2\u0006\u0002\u0010 Jj\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010#\u001a\u0004\u0018\u00010\u00062\b\u0010$\u001a\u0004\u0018\u00010\u000e2\b\u0010%\u001a\u0004\u0018\u00010\u00062\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001e2\b\u0010\'\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010(\u001a\u0004\u0018\u00010\u0006H\u00a6@\u00a2\u0006\u0002\u0010)J<\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010#\u001a\u0004\u0018\u00010\u00062\b\u0010$\u001a\u0004\u0018\u00010\u000e2\b\u0010\'\u001a\u0004\u0018\u00010\u000eH\u00a6@\u00a2\u0006\u0002\u0010,J2\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u00032\b\u0010/\u001a\u0004\u0018\u00010\u00062\b\u0010(\u001a\u0004\u0018\u00010\u00062\b\u00100\u001a\u0004\u0018\u00010\u0006H\u00a6@\u00a2\u0006\u0002\u00101J,\u00102\u001a\b\u0012\u0004\u0012\u00020.0\u00032\u0006\u0010#\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0006H\u00a6@\u00a2\u0006\u0002\u00101\u00a8\u00063"}, d2 = {"Lcom/intellihealth/truemeds/data/repository/datasource/remote/ProductListAndDetailsRemoteDataSource;", "", "fetchElasticSearch", "Lretrofit2/Response;", "Lcom/intellihealth/truemeds/data/model/productlistanddetails/ElasticSearchResponse;", "warehouseId", "", "elasticSearchType", "searchString", "isMultiSearch", "", "variantId", "", "sizeCount", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Long;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchMedicineDetails", "Lcom/intellihealth/truemeds/presentation/model/MedicineDetailsResultResponse;", "productCd", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchMedicineDetailsOfPatient", "Lcom/intellihealth/truemeds/data/model/home/CustomerMedicinesResponseModel;", "customerId", "page", "result", "patientId", "(Ljava/lang/String;IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchReOrderOTCProduct", "Lcom/intellihealth/truemeds/data/model/productlistanddetails/ReorderOtcProductResponse;", "productCodes", "", "orderId", "(Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCrossSellingRecommendedProducts", "Lcom/intellihealth/truemeds/data/model/productlistanddetails/CrossSellingRecommendedProductResponse;", "sessionToken", "pageNumber", "type", "subType", "pageSize", "productCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Set;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTrendingSearches", "Lcom/intellihealth/truemeds/data/model/search/TrendingSearchResponse;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveCrossProductAddedData", "Lokhttp3/ResponseBody;", "crossProductCode", "wareHouseId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveProductSearchData", "app_prodDebug"})
public abstract interface ProductListAndDetailsRemoteDataSource {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchElasticSearch(@org.jetbrains.annotations.NotNull()
    java.lang.String warehouseId, @org.jetbrains.annotations.NotNull()
    java.lang.String elasticSearchType, @org.jetbrains.annotations.Nullable()
    java.lang.String searchString, boolean isMultiSearch, @org.jetbrains.annotations.Nullable()
    java.lang.Long variantId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer sizeCount, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.productlistanddetails.ElasticSearchResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchMedicineDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String productCd, @org.jetbrains.annotations.NotNull()
    java.lang.String warehouseId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.presentation.model.MedicineDetailsResultResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchReOrderOTCProduct(@org.jetbrains.annotations.Nullable()
    java.util.Set<java.lang.String> productCodes, @org.jetbrains.annotations.Nullable()
    java.lang.String customerId, @org.jetbrains.annotations.Nullable()
    java.lang.String patientId, @org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.productlistanddetails.ReorderOtcProductResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCrossSellingRecommendedProducts(@org.jetbrains.annotations.Nullable()
    java.lang.String warehouseId, @org.jetbrains.annotations.Nullable()
    java.lang.String sessionToken, @org.jetbrains.annotations.Nullable()
    java.lang.Integer pageNumber, @org.jetbrains.annotations.Nullable()
    java.lang.String type, @org.jetbrains.annotations.Nullable()
    java.util.Set<java.lang.String> subType, @org.jetbrains.annotations.Nullable()
    java.lang.Integer pageSize, @org.jetbrains.annotations.Nullable()
    java.lang.Long variantId, @org.jetbrains.annotations.Nullable()
    java.lang.String productCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.productlistanddetails.CrossSellingRecommendedProductResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object saveProductSearchData(@org.jetbrains.annotations.NotNull()
    java.lang.String sessionToken, @org.jetbrains.annotations.NotNull()
    java.lang.String wareHouseId, @org.jetbrains.annotations.NotNull()
    java.lang.String productCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object saveCrossProductAddedData(@org.jetbrains.annotations.Nullable()
    java.lang.String crossProductCode, @org.jetbrains.annotations.Nullable()
    java.lang.String productCode, @org.jetbrains.annotations.Nullable()
    java.lang.String wareHouseId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchMedicineDetailsOfPatient(@org.jetbrains.annotations.Nullable()
    java.lang.String customerId, int page, int result, @org.jetbrains.annotations.Nullable()
    java.lang.String patientId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.home.CustomerMedicinesResponseModel>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTrendingSearches(@org.jetbrains.annotations.Nullable()
    java.lang.String warehouseId, @org.jetbrains.annotations.Nullable()
    java.lang.String sessionToken, @org.jetbrains.annotations.Nullable()
    java.lang.Integer pageNumber, @org.jetbrains.annotations.Nullable()
    java.lang.Integer pageSize, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.search.TrendingSearchResponse>> $completion);
}