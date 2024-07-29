package com.intellihealth.truemeds.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00c0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0013\u0010\u0087\u0001\u001a\u00030\u0088\u00012\t\b\u0002\u0010\u0089\u0001\u001a\u00020\u0015J\u001a\u0010\u008a\u0001\u001a\u00030\u0088\u00012\u0007\u0010\u008b\u0001\u001a\u00020%2\u0007\u0010\u008c\u0001\u001a\u00020\u0015J\u001a\u0010\u008d\u0001\u001a\u00030\u008e\u00012\u0007\u0010\u008f\u0001\u001a\u00020\u000b2\u0007\u0010\u0090\u0001\u001a\u000201J\u0018\u0010\u0091\u0001\u001a\u00020\u00152\u0006\u0010O\u001a\u00020%H\u0086@\u00a2\u0006\u0003\u0010\u0092\u0001J\u001a\u0010\u0093\u0001\u001a\u00030\u0088\u00012\u0007\u0010\u0094\u0001\u001a\u0002012\u0007\u0010\u0095\u0001\u001a\u00020%J\b\u0010\u0096\u0001\u001a\u00030\u0088\u0001J\u0014\u0010\u0097\u0001\u001a\u00030\u0088\u00012\b\u0010\u0098\u0001\u001a\u00030\u0099\u0001H\u0016J\u0019\u0010\u009a\u0001\u001a\u00030\u0088\u00012\u000f\b\u0002\u0010\u009b\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0RJ$\u0010\u009c\u0001\u001a\u00030\u0088\u00012\b\u0010\u009d\u0001\u001a\u00030\u009e\u00012\u0007\u0010\u009f\u0001\u001a\u0002012\u0007\u0010\u00a0\u0001\u001a\u00020\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001d\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120+8F\u00a2\u0006\u0006\u001a\u0004\b,\u0010-R\u001d\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120+8F\u00a2\u0006\u0006\u001a\u0004\b/\u0010-R\u001a\u00100\u001a\u000201X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u00106\u001a\u0010\u0012\f\u0012\n 7*\u0004\u0018\u000101010\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010\u0017R\u001a\u00108\u001a\u000201X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u00103\"\u0004\b9\u00105R\u001a\u0010:\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010?\u001a\u00020@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001a\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010F\u001a\b\u0012\u0004\u0012\u00020G0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u0010\u0017R\u001a\u0010I\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010<\"\u0004\bK\u0010>R\u001a\u0010L\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010<\"\u0004\bN\u0010>R\u0017\u0010O\u001a\b\u0012\u0004\u0012\u00020%0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u0010\u0017R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010Q\u001a\b\u0012\u0004\u0012\u00020\u000b0RX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR+\u0010W\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000b 7*\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010X0X0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\bY\u0010\u0017R\u001c\u0010Z\u001a\u0004\u0018\u00010[X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u001c\u0010`\u001a\u0004\u0018\u00010aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u001a\u0010f\u001a\u00020%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bg\u0010\'\"\u0004\bh\u0010)R\u001a\u0010i\u001a\u00020%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bj\u0010\'\"\u0004\bk\u0010)R\u001a\u0010l\u001a\u00020%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bm\u0010\'\"\u0004\bn\u0010)R \u0010o\u001a\b\u0012\u0004\u0012\u0002010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bp\u0010\u0017\"\u0004\bq\u0010\u0019R \u0010r\u001a\b\u0012\u0004\u0012\u0002010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bs\u0010\u0017\"\u0004\bt\u0010\u0019R \u0010u\u001a\b\u0012\u0004\u0012\u0002010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bv\u0010\u0017\"\u0004\bw\u0010\u0019R\u0017\u0010x\u001a\b\u0012\u0004\u0012\u0002010+8F\u00a2\u0006\u0006\u001a\u0004\by\u0010-R\u001a\u0010z\u001a\u000201X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b{\u00103\"\u0004\b|\u00105R\u001c\u0010}\u001a\u0004\u0018\u00010%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b~\u0010\'\"\u0004\b\u007f\u0010)R$\u0010\u0080\u0001\u001a\t\u0012\u0005\u0012\u00030\u0081\u00010RX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0082\u0001\u0010T\"\u0005\b\u0083\u0001\u0010VR\u001d\u0010\u0084\u0001\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0085\u0001\u0010<\"\u0005\b\u0086\u0001\u0010>\u00a8\u0006\u00a1\u0001"}, d2 = {"Lcom/intellihealth/truemeds/presentation/viewmodel/ProductListViewAllViewModel;", "Lcom/intellihealth/truemeds/presentation/viewmodel/BaseViewModelWithLogin;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "loginUseCase", "Lcom/intellihealth/truemeds/domain/usecase/LoginUseCase;", "productListAndDetailsUseCase", "Lcom/intellihealth/truemeds/domain/usecase/ProductListAndDetailsUseCase;", "homePageUseCase", "Lcom/intellihealth/truemeds/domain/usecase/HomePageUseCase;", "(Lcom/intellihealth/truemeds/domain/usecase/LoginUseCase;Lcom/intellihealth/truemeds/domain/usecase/ProductListAndDetailsUseCase;Lcom/intellihealth/truemeds/domain/usecase/HomePageUseCase;)V", "adapterCartModel", "Lcom/intellihealth/truemeds/presentation/model/ProductInfoModel;", "getAdapterCartModel", "()Lcom/intellihealth/truemeds/presentation/model/ProductInfoModel;", "setAdapterCartModel", "(Lcom/intellihealth/truemeds/presentation/model/ProductInfoModel;)V", "callPharmacist", "Landroidx/lifecycle/MutableLiveData;", "Lcom/intellihealth/truemeds/presentation/viewmodel/events/Event;", "", "cartCount", "", "getCartCount", "()Landroidx/lifecycle/MutableLiveData;", "setCartCount", "(Landroidx/lifecycle/MutableLiveData;)V", "cartData", "Lcom/intellihealth/salt/models/CartModel;", "getCartData", "setCartData", "cartTotal", "", "getCartTotal", "()D", "setCartTotal", "(D)V", "clickedOnPage", "", "getClickedOnPage", "()Ljava/lang/String;", "setClickedOnPage", "(Ljava/lang/String;)V", "eventCallPharmacist", "Landroidx/lifecycle/LiveData;", "getEventCallPharmacist", "()Landroidx/lifecycle/LiveData;", "eventLoginOpenBottomSheet", "getEventLoginOpenBottomSheet", "hasMoreData", "", "getHasMoreData", "()Z", "setHasMoreData", "(Z)V", "isEmptyData", "kotlin.jvm.PlatformType", "isLoadingMore", "setLoadingMore", "lastScrollPosition", "getLastScrollPosition", "()I", "setLastScrollPosition", "(I)V", "mxInternalErrorOccurred", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "getMxInternalErrorOccurred", "()Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "setMxInternalErrorOccurred", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;)V", "openLoginBottomSheet", "orgCount", "Lcom/intellihealth/truemeds/data/model/productlistanddetails/OrgQtyUpdate;", "getOrgCount", "pageIndexYourMedicines", "getPageIndexYourMedicines", "setPageIndexYourMedicines", "pageNumber", "getPageNumber", "setPageNumber", "productCode", "getProductCode", "productListData", "", "getProductListData", "()Ljava/util/List;", "setProductListData", "(Ljava/util/List;)V", "productListObserved", "", "getProductListObserved", "productListResponse", "Lcom/intellihealth/truemeds/data/model/productlistanddetails/CrossSellingRecommendedProductResponse;", "getProductListResponse", "()Lcom/intellihealth/truemeds/data/model/productlistanddetails/CrossSellingRecommendedProductResponse;", "setProductListResponse", "(Lcom/intellihealth/truemeds/data/model/productlistanddetails/CrossSellingRecommendedProductResponse;)V", "responsePatientMedicinesList", "Lcom/intellihealth/truemeds/data/model/home/CustomerMedicinesResponseModel;", "getResponsePatientMedicinesList", "()Lcom/intellihealth/truemeds/data/model/home/CustomerMedicinesResponseModel;", "setResponsePatientMedicinesList", "(Lcom/intellihealth/truemeds/data/model/home/CustomerMedicinesResponseModel;)V", "section", "getSection", "setSection", "sectionHeading", "getSectionHeading", "setSectionHeading", "sessionToken", "getSessionToken", "setSessionToken", "showProductListView", "getShowProductListView", "setShowProductListView", "showProgressBar", "getShowProgressBar", "setShowProgressBar", "showShimmer", "getShowShimmer", "setShowShimmer", "showShimmerLiveData", "getShowShimmerLiveData", "stopPagging", "getStopPagging", "setStopPagging", "yourMedicinePatientId", "getYourMedicinePatientId", "setYourMedicinePatientId", "yourMedicinePatientList", "Lcom/intellihealth/truemeds/data/model/home/CustomerMedicinesResponseModel$ResponseData$PatientDetail;", "getYourMedicinePatientList", "setYourMedicinePatientList", "yourMedicineSelectedPos", "getYourMedicineSelectedPos", "setYourMedicineSelectedPos", "callPatientListMedicineListApi", "", "pageIndex", "callTrendingListApi", "subType", "page", "deleteProductFromCart", "Lkotlinx/coroutines/Job;", "it", "isSubs", "getMedicineCount", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadMoreResults", "hidePrimaryLoader", "listType", "loadMoreYourMedicinesResults", "onResume", "owner", "Landroidx/lifecycle/LifecycleOwner;", "syncExistingCartProducts", "preSyncProducts", "updateCart", "orgCartItem", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/CartMedicine;", "isFirstEntry", "quantity", "app_prodDebug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class ProductListViewAllViewModel extends com.intellihealth.truemeds.presentation.viewmodel.BaseViewModelWithLogin implements androidx.lifecycle.DefaultLifecycleObserver {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.LoginUseCase loginUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.ProductListAndDetailsUseCase productListAndDetailsUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.HomePageUseCase homePageUseCase = null;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.model.ProductInfoModel adapterCartModel;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String sessionToken = "";
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showProductListView;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isEmptyData = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showProgressBar;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showShimmer;
    private int pageNumber = 1;
    private int pageIndexYourMedicines = 0;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.data.model.productlistanddetails.CrossSellingRecommendedProductResponse productListResponse;
    private boolean hasMoreData = true;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel>> productListObserved = null;
    private int lastScrollPosition = 0;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String sectionHeading = "";
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> productListData;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String clickedOnPage = "homepage";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String section = "tray";
    private double cartTotal = 0.0;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> cartCount;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.productlistanddetails.OrgQtyUpdate> orgCount = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> productCode = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.CartModel> cartData;
    private boolean isLoadingMore = false;
    private boolean stopPagging = false;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> callPharmacist = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> openLoginBottomSheet = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String yourMedicinePatientId;
    private int yourMedicineSelectedPos = 0;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.data.model.home.CustomerMedicinesResponseModel responsePatientMedicinesList;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.intellihealth.truemeds.data.model.home.CustomerMedicinesResponseModel.ResponseData.PatientDetail> yourMedicinePatientList;
    
    @javax.inject.Inject()
    public ProductListViewAllViewModel(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.LoginUseCase loginUseCase, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.ProductListAndDetailsUseCase productListAndDetailsUseCase, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.HomePageUseCase homePageUseCase) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.presentation.model.ProductInfoModel getAdapterCartModel() {
        return null;
    }
    
    public final void setAdapterCartModel(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.presentation.model.ProductInfoModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSessionToken() {
        return null;
    }
    
    public final void setSessionToken(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowProductListView() {
        return null;
    }
    
    public final void setShowProductListView(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isEmptyData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowProgressBar() {
        return null;
    }
    
    public final void setShowProgressBar(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowShimmer() {
        return null;
    }
    
    public final void setShowShimmer(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    public final int getPageNumber() {
        return 0;
    }
    
    public final void setPageNumber(int p0) {
    }
    
    public final int getPageIndexYourMedicines() {
        return 0;
    }
    
    public final void setPageIndexYourMedicines(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getShowShimmerLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.productlistanddetails.CrossSellingRecommendedProductResponse getProductListResponse() {
        return null;
    }
    
    public final void setProductListResponse(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.productlistanddetails.CrossSellingRecommendedProductResponse p0) {
    }
    
    public final boolean getHasMoreData() {
        return false;
    }
    
    public final void setHasMoreData(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel>> getProductListObserved() {
        return null;
    }
    
    public final int getLastScrollPosition() {
        return 0;
    }
    
    public final void setLastScrollPosition(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSectionHeading() {
        return null;
    }
    
    public final void setSectionHeading(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> getProductListData() {
        return null;
    }
    
    public final void setProductListData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getClickedOnPage() {
        return null;
    }
    
    public final void setClickedOnPage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSection() {
        return null;
    }
    
    public final void setSection(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final double getCartTotal() {
        return 0.0;
    }
    
    public final void setCartTotal(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getCartCount() {
        return null;
    }
    
    public final void setCartCount(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.productlistanddetails.OrgQtyUpdate> getOrgCount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getProductCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.CartModel> getCartData() {
        return null;
    }
    
    public final void setCartData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.CartModel> p0) {
    }
    
    public final boolean isLoadingMore() {
        return false;
    }
    
    public final void setLoadingMore(boolean p0) {
    }
    
    public final boolean getStopPagging() {
        return false;
    }
    
    public final void setStopPagging(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred getMxInternalErrorOccurred() {
        return null;
    }
    
    public final void setMxInternalErrorOccurred(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> getEventCallPharmacist() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> getEventLoginOpenBottomSheet() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getYourMedicinePatientId() {
        return null;
    }
    
    public final void setYourMedicinePatientId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int getYourMedicineSelectedPos() {
        return 0;
    }
    
    public final void setYourMedicineSelectedPos(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.home.CustomerMedicinesResponseModel getResponsePatientMedicinesList() {
        return null;
    }
    
    public final void setResponsePatientMedicinesList(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.CustomerMedicinesResponseModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.truemeds.data.model.home.CustomerMedicinesResponseModel.ResponseData.PatientDetail> getYourMedicinePatientList() {
        return null;
    }
    
    public final void setYourMedicinePatientList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.home.CustomerMedicinesResponseModel.ResponseData.PatientDetail> p0) {
    }
    
    /**
     * Initialize Login
     * If TrueCaller bottomsheet can't be shown(this is returned by TrueCaller SDK), then open OTP based login bottomsheet
     */
    public final void loadMoreResults(boolean hidePrimaryLoader, @org.jetbrains.annotations.NotNull()
    java.lang.String listType) {
    }
    
    public final void loadMoreYourMedicinesResults() {
    }
    
    public final void callTrendingListApi(@org.jetbrains.annotations.NotNull()
    java.lang.String subType, int page) {
    }
    
    public final void callPatientListMedicineListApi(int pageIndex) {
    }
    
    @java.lang.Override()
    public void onResume(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner owner) {
    }
    
    public final void syncExistingCartProducts(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> preSyncProducts) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getMedicineCount(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    public final void updateCart(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.datasource.local.entity.CartMedicine orgCartItem, boolean isFirstEntry, int quantity) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteProductFromCart(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.model.ProductInfoModel it, boolean isSubs) {
        return null;
    }
}