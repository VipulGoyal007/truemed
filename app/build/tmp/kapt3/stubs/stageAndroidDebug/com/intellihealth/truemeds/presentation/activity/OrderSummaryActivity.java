package com.intellihealth.truemeds.presentation.activity;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00da\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010d\u001a\u00020eJ\b\u0010f\u001a\u00020eH\u0002J\b\u0010g\u001a\u00020eH\u0016J\b\u0010h\u001a\u00020eH\u0002J\b\u0010i\u001a\u00020eH\u0002J\u0010\u0010j\u001a\u00020e2\u0006\u0010k\u001a\u00020\u0004H\u0002J\b\u0010l\u001a\u00020eH\u0002J\b\u0010m\u001a\u00020eH\u0002J\b\u0010n\u001a\u00020eH\u0002J\"\u0010o\u001a\u00020e2\u0006\u0010p\u001a\u00020\u00042\u0006\u0010q\u001a\u00020\u00042\b\u0010r\u001a\u0004\u0018\u00010\bH\u0014J\b\u0010s\u001a\u00020eH\u0002J\u0012\u0010t\u001a\u00020e2\b\u0010u\u001a\u0004\u0018\u00010vH\u0014J\b\u0010w\u001a\u00020eH\u0014J\b\u0010x\u001a\u00020eH\u0002J\u0012\u0010y\u001a\u00020e2\b\u0010z\u001a\u0004\u0018\u00010\bH\u0014J\b\u0010{\u001a\u00020eH\u0014J\b\u0010|\u001a\u00020eH\u0014J\u001e\u0010}\u001a\u00020e2\b\u0010~\u001a\u0004\u0018\u00010\u007f2\n\u0010\u0080\u0001\u001a\u0005\u0018\u00010\u0081\u0001H\u0002J\t\u0010\u0082\u0001\u001a\u00020eH\u0002J\t\u0010\u0083\u0001\u001a\u00020eH\u0002J.\u0010\u0084\u0001\u001a\u00020e2\b\u0010\u0085\u0001\u001a\u00030\u0086\u00012\b\u0010\u0087\u0001\u001a\u00030\u0088\u00012\b\u0010\u0089\u0001\u001a\u00030\u0088\u00012\u0007\u0010\u008a\u0001\u001a\u000202J\t\u0010\u008b\u0001\u001a\u00020eH\u0002J\t\u0010\u008c\u0001\u001a\u00020eH\u0002J\t\u0010\u008d\u0001\u001a\u00020eH\u0002J\t\u0010\u008e\u0001\u001a\u00020eH\u0002J\t\u0010\u008f\u0001\u001a\u00020eH\u0002J\t\u0010\u0090\u0001\u001a\u00020eH\u0002J\t\u0010\u0091\u0001\u001a\u00020eH\u0002J\t\u0010\u0092\u0001\u001a\u00020eH\u0002J\t\u0010\u0093\u0001\u001a\u00020eH\u0002J\t\u0010\u0094\u0001\u001a\u00020eH\u0002J\u0012\u0010\u0095\u0001\u001a\u00020e2\u0007\u0010\u0096\u0001\u001a\u00020PH\u0002J%\u0010\u0097\u0001\u001a\u00020e2\b\u0010\u0098\u0001\u001a\u00030\u0099\u00012\u0007\u0010\u009a\u0001\u001a\u00020\u00042\t\b\u0002\u0010\u009b\u0001\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010 \u001a\u00020!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u000e\u0010&\u001a\u00020\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010*\u001a\u00020+8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b.\u0010\u001f\u001a\u0004\b,\u0010-R\u000e\u0010/\u001a\u000200X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u00101\u001a\u000202X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u000e\u00107\u001a\u000208X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00109\u001a\u000208X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u000208X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u000208X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u000208X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010=\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010>\u001a\u00020?X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001a\u0010D\u001a\u000208X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001a\u0010I\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR.\u0010N\u001a\"\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020\u0004\u0018\u00010Oj\u0010\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020\u0004\u0018\u0001`QX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010R\u001a\u000202X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u00104\"\u0004\bT\u00106R\u0011\u0010U\u001a\u00020V\u00a2\u0006\b\n\u0000\u001a\u0004\bW\u0010XR\u001a\u0010Y\u001a\u00020ZX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u001b\u0010_\u001a\u00020`8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bc\u0010\u001f\u001a\u0004\ba\u0010b\u00a8\u0006\u009c\u0001"}, d2 = {"Lcom/intellihealth/truemeds/presentation/activity/OrderSummaryActivity;", "Lcom/intellihealth/truemeds/presentation/activity/BaseActivity;", "()V", "REQUEST_CODE", "", "REQUEST_CODE_PSP", "activityLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "applyCouponCallBack", "Lcom/intellihealth/truemeds/presentation/callbacks/CouponBottomSheetCallback;", "binding", "Lcom/intellihealth/truemeds/databinding/ActivityOrderSummaryBinding;", "getBinding", "()Lcom/intellihealth/truemeds/databinding/ActivityOrderSummaryBinding;", "binding$delegate", "Lcom/intellihealth/truemeds/presentation/utils/ActivityViewBindingDelegate;", "bottomSheet", "Lcom/intellihealth/truemeds/presentation/bottomsheet/UploadPrescriptionBottomSheet;", "getBottomSheet", "()Lcom/intellihealth/truemeds/presentation/bottomsheet/UploadPrescriptionBottomSheet;", "setBottomSheet", "(Lcom/intellihealth/truemeds/presentation/bottomsheet/UploadPrescriptionBottomSheet;)V", "context", "Landroid/content/Context;", "couponViewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/CouponViewModel;", "getCouponViewModel", "()Lcom/intellihealth/truemeds/presentation/viewmodel/CouponViewModel;", "couponViewModel$delegate", "Lkotlin/Lazy;", "currentCartValueD", "", "getCurrentCartValueD", "()D", "setCurrentCartValueD", "(D)V", "deleteImageBottomSheet", "Lcom/intellihealth/truemeds/presentation/bottomsheet/DeleteImageBottomSheet;", "editDeleteAddressBottomSheet", "Lcom/intellihealth/truemeds/presentation/bottomsheet/cart/RemoveProductBottomSheet;", "ftcViewModel", "Lcom/intellihealth/truemeds/mvvm/viewmodel/CountDownTimerViewModel;", "getFtcViewModel", "()Lcom/intellihealth/truemeds/mvvm/viewmodel/CountDownTimerViewModel;", "ftcViewModel$delegate", "itemNoLongerAvailableBottomSheet", "Lcom/intellihealth/truemeds/presentation/bottomsheet/ordersummary/ItemNoLongerAvailableBottomSheet;", "lastMinuteBuyViewed", "", "getLastMinuteBuyViewed", "()Z", "setLastMinuteBuyViewed", "(Z)V", "mLastClickTime", "", "mLastClickTimeForDeletBottomSheet", "mLocationLastClickTimePaymentOffer", "mOTCItemLastClick", "orderId", "orderSummaryActivityLauncher", "otcLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getOtcLayoutManager", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "setOtcLayoutManager", "(Landroidx/recyclerview/widget/LinearLayoutManager;)V", "prescriptionImageId", "getPrescriptionImageId", "()J", "setPrescriptionImageId", "(J)V", "prevPos", "getPrevPos", "()I", "setPrevPos", "(I)V", "previousMap", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "reorderOtcClicked", "getReorderOtcClicked", "setReorderOtcClicked", "replaceBottomSheet", "Lcom/intellihealth/truemeds/presentation/bottomsheet/ReplaceBottomSheet;", "getReplaceBottomSheet", "()Lcom/intellihealth/truemeds/presentation/bottomsheet/ReplaceBottomSheet;", "topDealProduct", "Lcom/intellihealth/truemeds/presentation/model/ProductInfoModel;", "getTopDealProduct", "()Lcom/intellihealth/truemeds/presentation/model/ProductInfoModel;", "setTopDealProduct", "(Lcom/intellihealth/truemeds/presentation/model/ProductInfoModel;)V", "viewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/CartViewModel;", "getViewModel", "()Lcom/intellihealth/truemeds/presentation/viewmodel/CartViewModel;", "viewModel$delegate", "callPSPActivity", "", "couponSavedData", "extractIntentData", "getApiData", "getScrollPosition", "highlightReOrderOtcIndex", "index", "initOtcRv", "initView", "initializeBottomSheet", "onActivityResult", "requestCode", "resultCode", "data", "onCameraClick", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onGalleryClick", "onNewIntent", "intent", "onPause", "onResume", "openApplyCouponValidationPopup", "couponResponse2", "Lcom/intellihealth/truemeds/data/model/coupon/CouponCodeResponse$Coupon;", "couponResponse", "Lcom/intellihealth/truemeds/data/model/coupon/CouponSaveRemoveResponse;", "openPrescriptionActivity", "openUploadPrescriptionBottomSheet", "scaleView", "v", "Landroid/view/View;", "startScale", "", "endScale", "withAnimation", "setApiCall", "setCallbacks", "setDynamicHeightForViewSpace", "setObservers", "setSavingSpectacularData", "setUpDoctorCard", "setUpLastMinuteBuy", "setUpOTCData", "setupBackPressedAction", "showConfirmationBottomSheet", "showConfirmationUnavailableMedicine", "type", "smoothSnapToPosition", "rv", "Landroidx/recyclerview/widget/RecyclerView;", "position", "snapMode", "app_stageAndroidDebug"})
public final class OrderSummaryActivity extends com.intellihealth.truemeds.presentation.activity.BaseActivity {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.presentation.utils.ActivityViewBindingDelegate binding$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy couponViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy ftcViewModel$delegate = null;
    private android.content.Context context;
    private long prescriptionImageId = 0L;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.presentation.bottomsheet.cart.RemoveProductBottomSheet editDeleteAddressBottomSheet;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.presentation.bottomsheet.DeleteImageBottomSheet deleteImageBottomSheet;
    private com.intellihealth.truemeds.presentation.bottomsheet.ordersummary.ItemNoLongerAvailableBottomSheet itemNoLongerAvailableBottomSheet;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.callbacks.CouponBottomSheetCallback applyCouponCallBack;
    private long orderId = 0L;
    private double currentCartValueD = 0.0;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.bottomsheet.UploadPrescriptionBottomSheet bottomSheet;
    public com.intellihealth.truemeds.presentation.model.ProductInfoModel topDealProduct;
    @org.jetbrains.annotations.Nullable()
    private java.util.HashMap<java.lang.String, java.lang.Integer> previousMap;
    private long mLastClickTime = 0L;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.presentation.bottomsheet.ReplaceBottomSheet replaceBottomSheet = null;
    private long mOTCItemLastClick = 0L;
    private long mLastClickTimeForDeletBottomSheet = 0L;
    private final int REQUEST_CODE = 1;
    private final int REQUEST_CODE_PSP = 1;
    private boolean lastMinuteBuyViewed = false;
    private boolean reorderOtcClicked = false;
    private long mLocationLastClickTimePaymentOffer = 0L;
    public androidx.recyclerview.widget.LinearLayoutManager otcLayoutManager;
    private int prevPos = -1;
    @org.jetbrains.annotations.NotNull()
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> activityLauncher;
    @org.jetbrains.annotations.NotNull()
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> orderSummaryActivityLauncher;
    
    public OrderSummaryActivity() {
        super();
    }
    
    private final com.intellihealth.truemeds.databinding.ActivityOrderSummaryBinding getBinding() {
        return null;
    }
    
    private final com.intellihealth.truemeds.presentation.viewmodel.CartViewModel getViewModel() {
        return null;
    }
    
    private final com.intellihealth.truemeds.presentation.viewmodel.CouponViewModel getCouponViewModel() {
        return null;
    }
    
    private final com.intellihealth.truemeds.mvvm.viewmodel.CountDownTimerViewModel getFtcViewModel() {
        return null;
    }
    
    public final long getPrescriptionImageId() {
        return 0L;
    }
    
    public final void setPrescriptionImageId(long p0) {
    }
    
    public final double getCurrentCartValueD() {
        return 0.0;
    }
    
    public final void setCurrentCartValueD(double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.presentation.bottomsheet.UploadPrescriptionBottomSheet getBottomSheet() {
        return null;
    }
    
    public final void setBottomSheet(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.presentation.bottomsheet.UploadPrescriptionBottomSheet p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.model.ProductInfoModel getTopDealProduct() {
        return null;
    }
    
    public final void setTopDealProduct(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.model.ProductInfoModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.bottomsheet.ReplaceBottomSheet getReplaceBottomSheet() {
        return null;
    }
    
    public final boolean getLastMinuteBuyViewed() {
        return false;
    }
    
    public final void setLastMinuteBuyViewed(boolean p0) {
    }
    
    public final boolean getReorderOtcClicked() {
        return false;
    }
    
    public final void setReorderOtcClicked(boolean p0) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    private final void couponSavedData() {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void extractIntentData() {
    }
    
    private final void setDynamicHeightForViewSpace() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void setUpDoctorCard() {
    }
    
    private final void getApiData() {
    }
    
    private final void initView() {
    }
    
    private final void setUpLastMinuteBuy() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.LinearLayoutManager getOtcLayoutManager() {
        return null;
    }
    
    public final void setOtcLayoutManager(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.LinearLayoutManager p0) {
    }
    
    public final int getPrevPos() {
        return 0;
    }
    
    public final void setPrevPos(int p0) {
    }
    
    private final void initOtcRv() {
    }
    
    private final void setUpOTCData() {
    }
    
    private final void highlightReOrderOtcIndex(int index) {
    }
    
    public final void smoothSnapToPosition(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView rv, int position, int snapMode) {
    }
    
    public final void scaleView(@org.jetbrains.annotations.NotNull()
    android.view.View v, float startScale, float endScale, boolean withAnimation) {
    }
    
    private final void setCallbacks() {
    }
    
    private final void setObservers() {
    }
    
    private final void initializeBottomSheet() {
    }
    
    private final void openApplyCouponValidationPopup(com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon couponResponse2, com.intellihealth.truemeds.data.model.coupon.CouponSaveRemoveResponse couponResponse) {
    }
    
    private final void setSavingSpectacularData() {
    }
    
    private final void showConfirmationUnavailableMedicine(java.lang.String type) {
    }
    
    public final void callPSPActivity() {
    }
    
    private final void showConfirmationBottomSheet() {
    }
    
    private final void openPrescriptionActivity() {
    }
    
    private final void openUploadPrescriptionBottomSheet() {
    }
    
    private final void onCameraClick() {
    }
    
    private final void onGalleryClick() {
    }
    
    private final void setApiCall() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    private final void getScrollPosition() {
    }
    
    private final void setupBackPressedAction() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    protected void onNewIntent(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
    }
}