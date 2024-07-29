package com.intellihealth.truemeds.domain.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001JX\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00a6@\u00a2\u0006\u0002\u0010\u0012J2\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00a2\u0006\u0002\u0010\u0016JF\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\tH\u00a6@\u00a2\u0006\u0002\u0010\u001dJR\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0010\u0010 \u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010!2\b\u0010\u0019\u001a\u0004\u0018\u00010\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\t2\b\u0010\"\u001a\u0004\u0018\u00010\u000fH\u00a6@\u00a2\u0006\u0002\u0010#Jx\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010&\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\'\u001a\u0004\u0018\u00010\u00112\b\u0010(\u001a\u0004\u0018\u00010\u00112\b\u0010)\u001a\u0004\u0018\u00010\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010!H\u00a6@\u00a2\u0006\u0002\u0010+JJ\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010&\u001a\u0004\u0018\u00010\t2\b\u0010\'\u001a\u0004\u0018\u00010\u00112\b\u0010(\u001a\u0004\u0018\u00010\u0011H\u00a6@\u00a2\u0006\u0002\u0010.J@\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\u00101\u001a\u0004\u0018\u00010\t2\b\u00102\u001a\u0004\u0018\u00010\t2\b\u00103\u001a\u0004\u0018\u00010\tH\u00a6@\u00a2\u0006\u0002\u00104J:\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\t2\u0006\u00103\u001a\u00020\t2\u0006\u00102\u001a\u00020\tH\u00a6@\u00a2\u0006\u0002\u00104\u00a8\u00066"}, d2 = {"Lcom/intellihealth/truemeds/domain/repository/ProductListAndDetailsRepository;", "", "fetchElasticSearch", "Lcom/intellihealth/truemeds/data/utils/Resource;", "Lretrofit2/Response;", "Lcom/intellihealth/truemeds/data/model/productlistanddetails/ElasticSearchResponse;", "mxInternalErrorOccurred", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "warehouseId", "", "elasticSearchType", "searchString", "isMultiSearch", "", "variantId", "", "sizeCount", "", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Long;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchMedicineDetails", "Lcom/intellihealth/truemeds/presentation/model/MedicineDetailsResultResponse;", "productCd", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchMedicineDetailsOfPatient", "Lcom/intellihealth/truemeds/data/model/home/CustomerMedicinesResponseModel;", "customerId", "page", "result", "patientId", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchReOrderOTCProduct", "Lcom/intellihealth/truemeds/data/model/productlistanddetails/ReorderOtcProductResponse;", "productCodes", "", "orderId", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCrossSellingRecommendedProducts", "Lcom/intellihealth/truemeds/data/model/productlistanddetails/CrossSellingRecommendedProductResponse;", "sessionToken", "pageNumber", "pageSize", "type", "subType", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTrendingSearches", "Lcom/intellihealth/truemeds/data/model/search/TrendingSearchResponse;", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveCrossProductAddedData", "Lokhttp3/ResponseBody;", "crossProductCode", "productCode", "wareHouseId", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveProductSearchData", "app_prodDebug"})
public abstract interface ProductListAndDetailsRepository {
    
    /**
     * This service provides list of products available for particular mother brand or disease
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchElasticSearch(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String warehouseId, @org.jetbrains.annotations.NotNull()
    java.lang.String elasticSearchType, @org.jetbrains.annotations.Nullable()
    java.lang.String searchString, boolean isMultiSearch, @org.jetbrains.annotations.Nullable()
    java.lang.Long variantId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer sizeCount, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.productlistanddetails.ElasticSearchResponse>>> $completion);
    
    /**
     * This service provides medicine details like manufactures and medicine info
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchMedicineDetails(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String productCd, @org.jetbrains.annotations.NotNull()
    java.lang.String warehouseId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.presentation.model.MedicineDetailsResultResponse>>> $completion);
    
    /**
     * This service provides OTC product list to display on infinite scroll card on Order Summary page
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchReOrderOTCProduct(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.Nullable()
    java.util.Set<java.lang.String> productCodes, @org.jetbrains.annotations.Nullable()
    java.lang.String customerId, @org.jetbrains.annotations.Nullable()
    java.lang.String patientId, @org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.productlistanddetails.ReorderOtcProductResponse>>> $completion);
    
    /**
     * This service provides cross selling products list
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCrossSellingRecommendedProducts(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.Nullable()
    java.lang.String sessionToken, @org.jetbrains.annotations.Nullable()
    java.lang.String warehouseId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer pageNumber, @org.jetbrains.annotations.Nullable()
    java.lang.Integer pageSize, @org.jetbrains.annotations.Nullable()
    java.lang.String type, @org.jetbrains.annotations.Nullable()
    java.lang.String productCd, @org.jetbrains.annotations.Nullable()
    java.lang.Long variantId, @org.jetbrains.annotations.Nullable()
    java.util.Set<java.lang.String> subType, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.productlistanddetails.CrossSellingRecommendedProductResponse>>> $completion);
    
    /**
     * This service is used to store product code of the medicine when we add it in cart
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object saveProductSearchData(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String sessionToken, @org.jetbrains.annotations.NotNull()
    java.lang.String wareHouseId, @org.jetbrains.annotations.NotNull()
    java.lang.String productCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<okhttp3.ResponseBody>>> $completion);
    
    /**
     * This service is used to store product code of Cross selling medicine when we add it in cart
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object saveCrossProductAddedData(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.Nullable()
    java.lang.String crossProductCode, @org.jetbrains.annotations.Nullable()
    java.lang.String productCode, @org.jetbrains.annotations.Nullable()
    java.lang.String wareHouseId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<okhttp3.ResponseBody>>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTrendingSearches(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.Nullable()
    java.lang.String warehouseId, @org.jetbrains.annotations.Nullable()
    java.lang.String sessionToken, @org.jetbrains.annotations.Nullable()
    java.lang.Integer pageNumber, @org.jetbrains.annotations.Nullable()
    java.lang.Integer pageSize, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.search.TrendingSearchResponse>>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchMedicineDetailsOfPatient(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.Nullable()
    java.lang.String customerId, int page, int result, @org.jetbrains.annotations.Nullable()
    java.lang.String patientId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.home.CustomerMedicinesResponseModel>>> $completion);
}