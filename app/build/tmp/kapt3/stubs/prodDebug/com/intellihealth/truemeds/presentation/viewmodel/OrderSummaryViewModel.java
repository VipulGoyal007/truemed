package com.intellihealth.truemeds.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0015\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u008f\u0001\u001a\u00030\u0090\u0001J\b\u0010\u0091\u0001\u001a\u00030\u0090\u0001R(\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR(\u0010\f\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\r0\r0\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\t\"\u0004\b\u0013\u0010\u000bR\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00158F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00160\u00158F\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u0019R\u001d\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00160\u00158F\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010\u0019R\u001d\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00160\u00158F\u00a2\u0006\u0006\u001a\u0004\b\"\u0010\u0019R(\u0010#\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00170\u00170\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\t\"\u0004\b$\u0010\u000bR\u001e\u0010%\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010)\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001a\u0010*\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010+\"\u0004\b/\u0010-R(\u00100\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00170\u00170\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\t\"\u0004\b1\u0010\u000bR\u001e\u00102\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010)\u001a\u0004\b2\u0010&\"\u0004\b3\u0010(R\u001d\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010\tR\u001f\u00106\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00160\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010\tR(\u00108\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u000109090\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\t\"\u0004\b;\u0010\u000bR\u001a\u0010<\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R(\u0010A\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010B0B0\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\t\"\u0004\bD\u0010\u000bR \u0010E\u001a\b\u0012\u0004\u0012\u00020\u00170\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\t\"\u0004\bG\u0010\u000bR \u0010H\u001a\b\u0012\u0004\u0012\u00020\u00170\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\t\"\u0004\bJ\u0010\u000bR(\u0010K\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010B0B0\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\t\"\u0004\bM\u0010\u000bR(\u0010N\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010B0B0\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\t\"\u0004\bP\u0010\u000bR(\u0010Q\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\r0\r0\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\t\"\u0004\bS\u0010\u000bR(\u0010T\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\r0\r0\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\t\"\u0004\bV\u0010\u000bR \u0010W\u001a\b\u0012\u0004\u0012\u00020B0XX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R&\u0010]\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020^0X0\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b_\u0010\t\"\u0004\b`\u0010\u000bR$\u0010a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010B0bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010g\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR \u0010h\u001a\b\u0012\u0004\u0012\u00020\u001b0iX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bj\u0010Z\"\u0004\bk\u0010\\R\u001d\u0010l\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0i0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bm\u0010\tR$\u0010n\u001a\n\u0012\u0004\u0012\u00020B\u0018\u00010bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010g\u001a\u0004\bo\u0010d\"\u0004\bp\u0010fR(\u0010q\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00170\u00170\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\br\u0010\t\"\u0004\bs\u0010\u000bR\u0014\u0010t\u001a\u00020\u0017X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\bu\u0010+R\u001a\u0010v\u001a\u00020BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR\u001a\u0010{\u001a\u00020BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b|\u0010x\"\u0004\b}\u0010zR\u001e\u0010~\u001a\u00020\u007fX\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R#\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020\u00170\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0085\u0001\u0010\t\"\u0005\b\u0086\u0001\u0010\u000bR\u001b\u0010\u0087\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00160\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0088\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00160\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0089\u0001\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008a\u0001\u0010>\"\u0005\b\u008b\u0001\u0010@R)\u0010\u008c\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020^0X0\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008d\u0001\u0010\t\"\u0005\b\u008e\u0001\u0010\u000b\u00a8\u0006\u0092\u0001"}, d2 = {"Lcom/intellihealth/truemeds/presentation/viewmodel/OrderSummaryViewModel;", "Lcom/intellihealth/truemeds/presentation/viewmodel/BaseViewModel;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "()V", "addMoreForCod", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "getAddMoreForCod", "()Landroidx/lifecycle/MutableLiveData;", "setAddMoreForCod", "(Landroidx/lifecycle/MutableLiveData;)V", "cartCount", "", "getCartCount", "setCartCount", "couponCodeDataModel", "Lcom/intellihealth/truemeds/data/model/orderflow/CouponCodeDataModel;", "getCouponCodeDataModel", "setCouponCodeDataModel", "eventLaunchOrderStatus", "Landroidx/lifecycle/LiveData;", "Lcom/intellihealth/truemeds/presentation/viewmodel/events/Event;", "", "getEventLaunchOrderStatus", "()Landroidx/lifecycle/LiveData;", "eventLaunchPDPage", "Lcom/intellihealth/salt/models/ProductInfoModel;", "getEventLaunchPDPage", "eventMessage", "Lcom/intellihealth/truemeds/data/utils/MESSAGES;", "getEventMessage", "eventShowError", "Lcom/intellihealth/truemeds/data/utils/ERRORS;", "getEventShowError", "isAppliedCoupon", "setAppliedCoupon", "isChronicAdded", "()Ljava/lang/Boolean;", "setChronicAdded", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "isExpanded", "()Z", "setExpanded", "(Z)V", "isGenericAdded", "setGenericAdded", "isOrderAddressServiceable", "setOrderAddressServiceable", "isOtcAdded", "setOtcAdded", "launchOrderStatus", "getLaunchOrderStatus", "launchPDPage", "getLaunchPDPage", "mrpValue", "", "getMrpValue", "setMrpValue", "notDeliverableCount", "getNotDeliverableCount", "()I", "setNotDeliverableCount", "(I)V", "orderAddress", "", "getOrderAddress", "setOrderAddress", "orderIsBeingPlacedView", "getOrderIsBeingPlacedView", "setOrderIsBeingPlacedView", "orderPlacedView", "getOrderPlacedView", "setOrderPlacedView", "patientID", "getPatientID", "setPatientID", "patientName", "getPatientName", "setPatientName", "paymentMode", "getPaymentMode", "setPaymentMode", "paymentRestrictedType", "getPaymentRestrictedType", "setPaymentRestrictedType", "prescriptionList", "", "getPrescriptionList", "()Ljava/util/List;", "setPrescriptionList", "(Ljava/util/List;)V", "prescriptionUploadedImgList", "Lcom/intellihealth/truemeds/data/model/search/ProductList;", "getPrescriptionUploadedImgList", "setPrescriptionUploadedImgList", "productIds", "", "getProductIds", "()[Ljava/lang/String;", "setProductIds", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "productList", "", "getProductList", "setProductList", "productListUsed", "getProductListUsed", "productNames", "getProductNames", "setProductNames", "restrictCod", "getRestrictCod", "setRestrictCod", "rxRequired", "getRxRequired", "selectedPaymentMethod", "getSelectedPaymentMethod", "()Ljava/lang/String;", "setSelectedPaymentMethod", "(Ljava/lang/String;)V", "selectedPaymentMethodIconUrl", "getSelectedPaymentMethodIconUrl", "setSelectedPaymentMethodIconUrl", "selectedPaymentMethodId", "", "getSelectedPaymentMethodId", "()J", "setSelectedPaymentMethodId", "(J)V", "setMainDataView", "getSetMainDataView", "setSetMainDataView", "showError", "showMessage", "totalOutOfStockCount", "getTotalOutOfStockCount", "setTotalOutOfStockCount", "visibleMedicineList", "getVisibleMedicineList", "setVisibleMedicineList", "applyCouponClick", "", "viewMoreClick", "app_prodDebug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class OrderSummaryViewModel extends com.intellihealth.truemeds.presentation.viewmodel.BaseViewModel implements androidx.lifecycle.DefaultLifecycleObserver {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.utils.ERRORS>> showError = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.utils.MESSAGES>> showMessage = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.intellihealth.salt.models.ProductInfoModel> productList;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.salt.models.ProductInfoModel>> productListUsed = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.String> prescriptionList;
    private boolean isExpanded = true;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> patientID;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> patientName;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> orderAddress;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isOrderAddressServiceable;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Float> mrpValue;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> paymentMode;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.salt.models.ProductInfoModel>> launchPDPage = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Boolean>> launchOrderStatus = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> orderIsBeingPlacedView;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> orderPlacedView;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> setMainDataView;
    
    /**
     * Below variable values are needed for PSP activity / MixPanel / AppsFlyer Events
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean isOtcAdded;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean isChronicAdded;
    private int totalOutOfStockCount = 0;
    private int notDeliverableCount = 0;
    private boolean isGenericAdded = false;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Double> addMoreForCod;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> restrictCod;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> paymentRestrictedType;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> cartCount;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String[] productIds;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String[] productNames;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String selectedPaymentMethod = "";
    private long selectedPaymentMethodId = -1L;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String selectedPaymentMethodIconUrl = "";
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isAppliedCoupon;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.orderflow.CouponCodeDataModel> couponCodeDataModel;
    private final boolean rxRequired = false;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.search.ProductList>> visibleMedicineList;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.search.ProductList>> prescriptionUploadedImgList;
    
    @javax.inject.Inject()
    public OrderSummaryViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.utils.ERRORS>> getEventShowError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.utils.MESSAGES>> getEventMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.salt.models.ProductInfoModel> getProductList() {
        return null;
    }
    
    public final void setProductList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.salt.models.ProductInfoModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.salt.models.ProductInfoModel>> getProductListUsed() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getPrescriptionList() {
        return null;
    }
    
    public final void setPrescriptionList(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> p0) {
    }
    
    public final boolean isExpanded() {
        return false;
    }
    
    public final void setExpanded(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPatientID() {
        return null;
    }
    
    public final void setPatientID(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPatientName() {
        return null;
    }
    
    public final void setPatientName(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getOrderAddress() {
        return null;
    }
    
    public final void setOrderAddress(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isOrderAddressServiceable() {
        return null;
    }
    
    public final void setOrderAddressServiceable(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Float> getMrpValue() {
        return null;
    }
    
    public final void setMrpValue(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Float> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getPaymentMode() {
        return null;
    }
    
    public final void setPaymentMode(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.salt.models.ProductInfoModel>> getLaunchPDPage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.salt.models.ProductInfoModel>> getEventLaunchPDPage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Boolean>> getLaunchOrderStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Boolean>> getEventLaunchOrderStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getOrderIsBeingPlacedView() {
        return null;
    }
    
    public final void setOrderIsBeingPlacedView(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getOrderPlacedView() {
        return null;
    }
    
    public final void setOrderPlacedView(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getSetMainDataView() {
        return null;
    }
    
    public final void setSetMainDataView(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    /**
     * Below variable values are needed for PSP activity / MixPanel / AppsFlyer Events
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isOtcAdded() {
        return null;
    }
    
    /**
     * Below variable values are needed for PSP activity / MixPanel / AppsFlyer Events
     */
    public final void setOtcAdded(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isChronicAdded() {
        return null;
    }
    
    public final void setChronicAdded(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    public final int getTotalOutOfStockCount() {
        return 0;
    }
    
    public final void setTotalOutOfStockCount(int p0) {
    }
    
    public final int getNotDeliverableCount() {
        return 0;
    }
    
    public final void setNotDeliverableCount(int p0) {
    }
    
    public final boolean isGenericAdded() {
        return false;
    }
    
    public final void setGenericAdded(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Double> getAddMoreForCod() {
        return null;
    }
    
    public final void setAddMoreForCod(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Double> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getRestrictCod() {
        return null;
    }
    
    public final void setRestrictCod(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getPaymentRestrictedType() {
        return null;
    }
    
    public final void setPaymentRestrictedType(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getCartCount() {
        return null;
    }
    
    public final void setCartCount(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String[] getProductIds() {
        return null;
    }
    
    public final void setProductIds(@org.jetbrains.annotations.NotNull()
    java.lang.String[] p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String[] getProductNames() {
        return null;
    }
    
    public final void setProductNames(@org.jetbrains.annotations.Nullable()
    java.lang.String[] p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSelectedPaymentMethod() {
        return null;
    }
    
    public final void setSelectedPaymentMethod(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final long getSelectedPaymentMethodId() {
        return 0L;
    }
    
    public final void setSelectedPaymentMethodId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSelectedPaymentMethodIconUrl() {
        return null;
    }
    
    public final void setSelectedPaymentMethodIconUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isAppliedCoupon() {
        return null;
    }
    
    public final void setAppliedCoupon(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.orderflow.CouponCodeDataModel> getCouponCodeDataModel() {
        return null;
    }
    
    public final void setCouponCodeDataModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.orderflow.CouponCodeDataModel> p0) {
    }
    
    public final boolean getRxRequired() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.search.ProductList>> getVisibleMedicineList() {
        return null;
    }
    
    public final void setVisibleMedicineList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.search.ProductList>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.search.ProductList>> getPrescriptionUploadedImgList() {
        return null;
    }
    
    public final void setPrescriptionUploadedImgList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.search.ProductList>> p0) {
    }
    
    public final void applyCouponClick() {
    }
    
    public final void viewMoreClick() {
    }
}