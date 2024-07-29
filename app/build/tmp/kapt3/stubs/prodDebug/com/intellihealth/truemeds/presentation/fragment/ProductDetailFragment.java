package com.intellihealth.truemeds.presentation.fragment;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00f8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 \u00b2\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u00b2\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010f\u001a\u00020gH\u0002J\b\u0010h\u001a\u00020gH\u0002J\u000e\u0010i\u001a\u00020g2\u0006\u0010\u001a\u001a\u00020jJ\u0010\u0010k\u001a\u00020g2\u0006\u0010N\u001a\u00020OH\u0016J\u0018\u0010l\u001a\u00020m2\b\u0010n\u001a\u0004\u0018\u00010o2\u0006\u0010p\u001a\u00020mJ\u000e\u0010q\u001a\u00020g2\u0006\u0010\u001a\u001a\u00020jJ\b\u0010r\u001a\u00020gH\u0002J.\u0010s\u001a\u00020g2\u0006\u0010t\u001a\u00020O2\u0006\u0010u\u001a\u00020O2\u0006\u0010v\u001a\u00020O2\u0006\u0010w\u001a\u00020O2\u0006\u0010n\u001a\u00020oJ\b\u0010x\u001a\u00020gH\u0002J\u0010\u0010y\u001a\u00020g2\u0006\u0010z\u001a\u00020-H\u0002J\b\u0010{\u001a\u00020gH\u0002J\b\u0010|\u001a\u00020gH\u0002J\b\u0010}\u001a\u00020-H\u0002J\b\u0010~\u001a\u00020-H\u0002J\b\u0010\u007f\u001a\u00020gH\u0002J/\u0010\u0080\u0001\u001a\u00020g2\u0007\u0010\u0081\u0001\u001a\u00020\u00172\u001b\u0010\u0082\u0001\u001a\u0016\u0012\u0005\u0012\u00030\u0084\u00010\u0083\u0001j\n\u0012\u0005\u0012\u00030\u0084\u0001`\u0085\u0001H\u0016J\u0015\u0010\u0086\u0001\u001a\u00020g2\n\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0088\u0001H\u0016J\t\u0010\u0089\u0001\u001a\u00020gH\u0016J\t\u0010\u008a\u0001\u001a\u00020gH\u0016J\t\u0010\u008b\u0001\u001a\u00020gH\u0016J\u001f\u0010\u008c\u0001\u001a\u00020g2\b\u0010\u008d\u0001\u001a\u00030\u008e\u00012\n\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0088\u0001H\u0016J\u0013\u0010\u008f\u0001\u001a\u00020g2\n\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u0091\u0001J!\u0010\u0092\u0001\u001a\u00020g2\n\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u0091\u00012\n\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u0094\u0001H\u0002J\t\u0010\u0095\u0001\u001a\u00020gH\u0002J\u0007\u0010\u0096\u0001\u001a\u00020gJ\u0010\u0010\u0097\u0001\u001a\u00020g2\u0007\u0010\u0098\u0001\u001a\u00020HJ\u0010\u0010\u0099\u0001\u001a\u00020g2\u0007\u0010\u009a\u0001\u001a\u00020-J\t\u0010\u009b\u0001\u001a\u00020gH\u0002J\t\u0010\u009c\u0001\u001a\u00020gH\u0002J\t\u0010\u009d\u0001\u001a\u00020gH\u0002J\u0007\u0010\u009e\u0001\u001a\u00020gJ&\u0010\u009f\u0001\u001a\u00020g2\b\u0010\u00a0\u0001\u001a\u00030\u00a1\u00012\b\u0010\u00a2\u0001\u001a\u00030\u00a3\u00012\u0007\u0010\u00a4\u0001\u001a\u00020\u0017H\u0002J\u001b\u0010\u00a5\u0001\u001a\u00020g2\u0007\u0010\u00a6\u0001\u001a\u00020O2\u0007\u0010\u00a7\u0001\u001a\u00020OH\u0002J\u001a\u0010\u00a8\u0001\u001a\u00020g2\u0006\u0010N\u001a\u00020O2\u0007\u0010\u00a9\u0001\u001a\u00020-H\u0002J\u0011\u0010\u00aa\u0001\u001a\u00020g2\b\u0010\u008d\u0001\u001a\u00030\u008e\u0001J\u001e\u0010\u00ab\u0001\u001a\u00020g2\n\u0010\u00ac\u0001\u001a\u0005\u0018\u00010\u0091\u00012\u0007\u0010\u00ad\u0001\u001a\u00020OH\u0002J\u0012\u0010\u00ae\u0001\u001a\u00020g2\u0007\u0010\u00af\u0001\u001a\u00020-H\u0002J\u0018\u0010\u00b0\u0001\u001a\u00020g2\u0006\u0010D\u001a\u00020#H\u0082@\u00a2\u0006\u0003\u0010\u00b1\u0001R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R#\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b(\u0010\u0015\u001a\u0004\b&\u0010\'R\u000e\u0010)\u001a\u00020*X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010.\u001a\u00020-X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u00102\u001a\u00020-X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010/\"\u0004\b3\u00101R\u001a\u00104\u001a\u00020-X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010/\"\u0004\b5\u00101R\u000e\u00106\u001a\u00020-X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020-X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u00108\u001a\u00020-X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010/\"\u0004\b9\u00101R\u001a\u0010:\u001a\u00020-X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010/\"\u0004\b;\u00101R\u000e\u0010<\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010>\u001a\u0004\u0018\u00010?X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0010\u0010D\u001a\u0004\u0018\u00010#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010E\u001a\u0004\u0018\u00010#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010F\u001a\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010G\u001a\u0004\u0018\u00010HX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010I\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u000e\u0010N\u001a\u00020OX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010P\u001a\u00020OX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u000e\u0010U\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010V\u001a\u0004\u0018\u00010WX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u00020OX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010Y\u001a\u0004\u0018\u00010OX\u0082\u000e\u00a2\u0006\u0002\n\u0000R,\u0010Z\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020O\u0012\u0004\u0012\u00020\u00170\\0[X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u001b\u0010a\u001a\u00020b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\be\u0010\u0015\u001a\u0004\bc\u0010d\u00a8\u0006\u00b3\u0001"}, d2 = {"Lcom/intellihealth/truemeds/presentation/fragment/ProductDetailFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/intellihealth/truemeds/presentation/adapter/BannerViewpagerAdapter$BannerViewPagerClickCallback;", "Lcom/intellihealth/truemeds/presentation/bottomsheet/productdetail/ProductDetailBottomSheet$CrossSellingProductBSCallback;", "()V", "GET_DATA_INTERVAL", "", "applyCouponCallBack", "Lcom/intellihealth/truemeds/presentation/callbacks/ApplyCouponCallback;", "binding", "Lcom/intellihealth/truemeds/databinding/FragmentProductDetailBinding;", "kotlin.jvm.PlatformType", "getBinding", "()Lcom/intellihealth/truemeds/databinding/FragmentProductDetailBinding;", "binding$delegate", "Lcom/intellihealth/truemeds/presentation/utils/FragmentViewBindingDelegate;", "cartViewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/CartViewModel;", "getCartViewModel", "()Lcom/intellihealth/truemeds/presentation/viewmodel/CartViewModel;", "cartViewModel$delegate", "Lkotlin/Lazy;", "coolDownSeconds", "", "couponSavingPopUp", "Lcom/intellihealth/truemeds/presentation/dialog/CouponSavingPopUp;", "dialog", "Landroidx/fragment/app/DialogFragment;", "getDialog", "()Landroidx/fragment/app/DialogFragment;", "setDialog", "(Landroidx/fragment/app/DialogFragment;)V", "editDeleteAddressBottomSheet", "Lcom/intellihealth/truemeds/presentation/bottomsheet/cart/RemoveProductBottomSheet;", "eventOrgProductForThisPage", "Lcom/intellihealth/truemeds/presentation/model/ProductInfoModel;", "ftcViewModel", "Lcom/intellihealth/truemeds/mvvm/viewmodel/CountDownTimerViewModel;", "getFtcViewModel", "()Lcom/intellihealth/truemeds/mvvm/viewmodel/CountDownTimerViewModel;", "ftcViewModel$delegate", "hand1", "Landroid/os/Handler;", "index", "isBottomSheetBahaviour", "", "isDeleteBSFromDoubleStack", "()Z", "setDeleteBSFromDoubleStack", "(Z)V", "isDeleteBSFromProduct", "setDeleteBSFromProduct", "isDeleteBSFromSuggestion", "setDeleteBSFromSuggestion", "isDivideMRPCrossSellingWithQty", "isFromCrossSelling", "isFromOTC", "setFromOTC", "isFromSearch", "setFromSearch", "lastClickTime", "mLastClickTime", "mViewPagerAdapter", "Lcom/intellihealth/truemeds/presentation/adapter/BannerViewpagerAdapter;", "getMViewPagerAdapter", "()Lcom/intellihealth/truemeds/presentation/adapter/BannerViewpagerAdapter;", "setMViewPagerAdapter", "(Lcom/intellihealth/truemeds/presentation/adapter/BannerViewpagerAdapter;)V", "orgProductForThisPage", "orgProductOfSubs", "pdBottomsheetCallbackListener", "pdInternalServerErrorCallback", "Lcom/intellihealth/truemeds/presentation/fragment/InternalServerErrorCallback;", "posDeleteBSFromDoubleStack", "getPosDeleteBSFromDoubleStack", "()I", "setPosDeleteBSFromDoubleStack", "(I)V", "productCode", "", "productCodeToDelete", "getProductCodeToDelete", "()Ljava/lang/String;", "setProductCodeToDelete", "(Ljava/lang/String;)V", "resumeCount", "run1", "Ljava/lang/Runnable;", "searchType", "switchBackSkuNameForSubs", "tooltipList", "", "Lkotlin/Pair;", "getTooltipList", "()Ljava/util/List;", "setTooltipList", "(Ljava/util/List;)V", "viewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/ProductDetailViewModel;", "getViewModel", "()Lcom/intellihealth/truemeds/presentation/viewmodel/ProductDetailViewModel;", "viewModel$delegate", "addObservers", "", "deleteProductOrSuggestionFromDatabase", "disableLoadingView", "Landroid/app/Dialog;", "dismissProductDetailBottomsheet", "dpToPixel", "", "context", "Landroid/content/Context;", "dp", "enableLoadingView", "getScrollPosition", "getTrueCallerUserDetails", "textAuthorizationCode", "clientId", "authorizationCode", "codeVerifier", "handleViewVisibility", "initBottomSheetBehavior", "isBottomSheetBehavior", "initClickListeners", "initData", "isSingleClick", "isSingleClickHandle", "launchCompositionDetailsBottomsheet", "onBannerClick", "position", "bannerList", "Ljava/util/ArrayList;", "Lcom/intellihealth/salt/models/BannerItemModel;", "Lkotlin/collections/ArrayList;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "onResume", "onViewCreated", "view", "Landroid/view/View;", "openApplyCouponBottomSheet", "couponResponse", "Lcom/intellihealth/truemeds/data/model/coupon/CouponCodeResponse$Coupon;", "openApplyCouponValidationPopup", "couponResponse2", "Lcom/intellihealth/truemeds/data/model/coupon/CouponSaveRemoveResponse;", "resetRecommendedSectionCollapseState", "sendLoginPageViewedEvent", "setInternalServerErrorCallback", "mContext", "setIsTruecaller", "isTruecaller", "setMedicineDetailHeader", "setMedicineInfoStickyHeader", "setPDPheaders", "setToolBarAnimation", "setUpUpdatingViews", "tv", "Landroidx/appcompat/widget/AppCompatTextView;", "iv", "Landroidx/appcompat/widget/AppCompatImageView;", "count", "setUserToolTip", "customerAlsoBought", "composition", "showConfirmationDialog", "isSubs", "slideToTop", "stickyNotificationWithCallBack", "couponResp", "time", "updateFtcLayoutConstraints", "setToToolbar", "updateUIWithOrgProductForThis", "(Lcom/intellihealth/truemeds/presentation/model/ProductInfoModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_prodDebug"})
public final class ProductDetailFragment extends androidx.fragment.app.Fragment implements com.intellihealth.truemeds.presentation.adapter.BannerViewpagerAdapter.BannerViewPagerClickCallback, com.intellihealth.truemeds.presentation.bottomsheet.productdetail.ProductDetailBottomSheet.CrossSellingProductBSCallback {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.presentation.utils.FragmentViewBindingDelegate binding$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy cartViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy ftcViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String searchType = "";
    private boolean isBottomSheetBahaviour = false;
    private boolean isFromCrossSelling = false;
    private boolean isDivideMRPCrossSellingWithQty = true;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String productCode = "";
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.adapter.BannerViewpagerAdapter mViewPagerAdapter;
    private boolean isDeleteBSFromSuggestion = false;
    private boolean isDeleteBSFromProduct = false;
    private boolean isDeleteBSFromDoubleStack = false;
    private int posDeleteBSFromDoubleStack = 0;
    private com.intellihealth.truemeds.presentation.dialog.CouponSavingPopUp couponSavingPopUp;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.callbacks.ApplyCouponCallback applyCouponCallBack;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.presentation.bottomsheet.cart.RemoveProductBottomSheet editDeleteAddressBottomSheet;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.bottomsheet.productdetail.ProductDetailBottomSheet.CrossSellingProductBSCallback pdBottomsheetCallbackListener;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Runnable run1;
    private int index = 0;
    private int resumeCount = 0;
    @org.jetbrains.annotations.NotNull()
    private final android.os.Handler hand1 = null;
    private final long GET_DATA_INTERVAL = 3000L;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String productCodeToDelete = "";
    private boolean isFromOTC = false;
    private boolean isFromSearch = false;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<kotlin.Pair<java.lang.String, java.lang.Integer>> tooltipList;
    
    /**
     * Below variable is used when 'isSubs' true and to keep it's Original product information for Substitute Pdp page
     */
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.model.ProductInfoModel orgProductOfSubs;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.model.ProductInfoModel orgProductForThisPage;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.model.ProductInfoModel eventOrgProductForThisPage;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String switchBackSkuNameForSubs;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.fragment.InternalServerErrorCallback pdInternalServerErrorCallback;
    private long lastClickTime = 0L;
    private final int coolDownSeconds = 2;
    @org.jetbrains.annotations.Nullable()
    private androidx.fragment.app.DialogFragment dialog;
    private static final long MIN_DELAY_MS = 500L;
    private long mLastClickTime = 0L;
    @org.jetbrains.annotations.NotNull()
    public static final com.intellihealth.truemeds.presentation.fragment.ProductDetailFragment.Companion Companion = null;
    
    public ProductDetailFragment() {
        super();
    }
    
    private final com.intellihealth.truemeds.databinding.FragmentProductDetailBinding getBinding() {
        return null;
    }
    
    private final com.intellihealth.truemeds.presentation.viewmodel.ProductDetailViewModel getViewModel() {
        return null;
    }
    
    private final com.intellihealth.truemeds.presentation.viewmodel.CartViewModel getCartViewModel() {
        return null;
    }
    
    private final com.intellihealth.truemeds.mvvm.viewmodel.CountDownTimerViewModel getFtcViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.presentation.adapter.BannerViewpagerAdapter getMViewPagerAdapter() {
        return null;
    }
    
    public final void setMViewPagerAdapter(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.presentation.adapter.BannerViewpagerAdapter p0) {
    }
    
    public final boolean isDeleteBSFromSuggestion() {
        return false;
    }
    
    public final void setDeleteBSFromSuggestion(boolean p0) {
    }
    
    public final boolean isDeleteBSFromProduct() {
        return false;
    }
    
    public final void setDeleteBSFromProduct(boolean p0) {
    }
    
    public final boolean isDeleteBSFromDoubleStack() {
        return false;
    }
    
    public final void setDeleteBSFromDoubleStack(boolean p0) {
    }
    
    public final int getPosDeleteBSFromDoubleStack() {
        return 0;
    }
    
    public final void setPosDeleteBSFromDoubleStack(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProductCodeToDelete() {
        return null;
    }
    
    public final void setProductCodeToDelete(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean isFromOTC() {
        return false;
    }
    
    public final void setFromOTC(boolean p0) {
    }
    
    public final boolean isFromSearch() {
        return false;
    }
    
    public final void setFromSearch(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<kotlin.Pair<java.lang.String, java.lang.Integer>> getTooltipList() {
        return null;
    }
    
    public final void setTooltipList(@org.jetbrains.annotations.NotNull()
    java.util.List<kotlin.Pair<java.lang.String, java.lang.Integer>> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.fragment.app.DialogFragment getDialog() {
        return null;
    }
    
    public final void setDialog(@org.jetbrains.annotations.Nullable()
    androidx.fragment.app.DialogFragment p0) {
    }
    
    public final void setIsTruecaller(boolean isTruecaller) {
    }
    
    public final void getTrueCallerUserDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String textAuthorizationCode, @org.jetbrains.annotations.NotNull()
    java.lang.String clientId, @org.jetbrains.annotations.NotNull()
    java.lang.String authorizationCode, @org.jetbrains.annotations.NotNull()
    java.lang.String codeVerifier, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void sendLoginPageViewedEvent() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void getScrollPosition() {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void setInternalServerErrorCallback(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.fragment.InternalServerErrorCallback mContext) {
    }
    
    private final void initData() {
    }
    
    private final void handleViewVisibility() {
    }
    
    private final void setPDPheaders() {
    }
    
    public final void setToolBarAnimation() {
    }
    
    private final void updateFtcLayoutConstraints(boolean setToToolbar) {
    }
    
    private final void setMedicineInfoStickyHeader() {
    }
    
    private final void setMedicineDetailHeader() {
    }
    
    private final java.lang.Object updateUIWithOrgProductForThis(com.intellihealth.truemeds.presentation.model.ProductInfoModel orgProductForThisPage, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    public final float dpToPixel(@org.jetbrains.annotations.Nullable()
    android.content.Context context, float dp) {
        return 0.0F;
    }
    
    private final void initClickListeners() {
    }
    
    private final void launchCompositionDetailsBottomsheet() {
    }
    
    private final void addObservers() {
    }
    
    private final void resetRecommendedSectionCollapseState() {
    }
    
    private final void deleteProductOrSuggestionFromDatabase() {
    }
    
    private final void initBottomSheetBehavior(boolean isBottomSheetBehavior) {
    }
    
    @java.lang.Override()
    public void onBannerClick(int position, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.intellihealth.salt.models.BannerItemModel> bannerList) {
    }
    
    private final void showConfirmationDialog(java.lang.String productCode, boolean isSubs) {
    }
    
    @java.lang.Override()
    public void dismissProductDetailBottomsheet(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode) {
    }
    
    private final boolean isSingleClick() {
        return false;
    }
    
    private final void setUserToolTip(java.lang.String customerAlsoBought, java.lang.String composition) {
    }
    
    private final void setUpUpdatingViews(androidx.appcompat.widget.AppCompatTextView tv, androidx.appcompat.widget.AppCompatImageView iv, int count) {
    }
    
    public final void slideToTop(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    public final void openApplyCouponBottomSheet(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon couponResponse) {
    }
    
    private final void openApplyCouponValidationPopup(com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon couponResponse2, com.intellihealth.truemeds.data.model.coupon.CouponSaveRemoveResponse couponResponse) {
    }
    
    private final void stickyNotificationWithCallBack(com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon couponResp, java.lang.String time) {
    }
    
    public final void disableLoadingView(@org.jetbrains.annotations.NotNull()
    android.app.Dialog dialog) {
    }
    
    public final void enableLoadingView(@org.jetbrains.annotations.NotNull()
    android.app.Dialog dialog) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    private final boolean isSingleClickHandle() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u00f5\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010*R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lcom/intellihealth/truemeds/presentation/fragment/ProductDetailFragment$Companion;", "", "()V", "MIN_DELAY_MS", "", "getInstance", "Lcom/intellihealth/truemeds/presentation/fragment/ProductDetailFragment;", "isSubs", "", "isBottomSheetBahaviour", "searchText", "", "searchType", "productCode", "isFromCrossSelling", "orgProductOfSubs", "isFromOrderStatus", "isAlreadyAddedToCart", "orgProductForThisPage", "switchBackSkuNameForBottomSheetSubs", "isFromOTC", "isFromSearch", "isDivideMRPSellingWithQty", "item_qc", "item_rt", "term_searched", "suggestion_term_clicked", "suggestion_term_clicked_position", "", "elastic_search_type", "clickedOnPage", "section", "sectionIndex", "subsFoundEventOrderSummary", "crossSellingSectionHeadingEvent", "eventOrgProductForThisPage", "sectionRow", "clickedSuggestionType", "otcSuperCategoryName", "otcCategoryName", "otcSubCategoryName", "deepLinkActionType", "(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/intellihealth/truemeds/presentation/fragment/ProductDetailFragment;", "app_prodDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.intellihealth.truemeds.presentation.fragment.ProductDetailFragment getInstance(boolean isSubs, boolean isBottomSheetBahaviour, @org.jetbrains.annotations.NotNull()
        java.lang.String searchText, @org.jetbrains.annotations.NotNull()
        java.lang.String searchType, @org.jetbrains.annotations.NotNull()
        java.lang.String productCode, boolean isFromCrossSelling, @org.jetbrains.annotations.Nullable()
        java.lang.String orgProductOfSubs, boolean isFromOrderStatus, @org.jetbrains.annotations.Nullable()
        java.lang.String isAlreadyAddedToCart, @org.jetbrains.annotations.Nullable()
        java.lang.String orgProductForThisPage, @org.jetbrains.annotations.Nullable()
        java.lang.String switchBackSkuNameForBottomSheetSubs, boolean isFromOTC, boolean isFromSearch, boolean isDivideMRPSellingWithQty, @org.jetbrains.annotations.Nullable()
        java.lang.String item_qc, @org.jetbrains.annotations.Nullable()
        java.lang.String item_rt, @org.jetbrains.annotations.Nullable()
        java.lang.String term_searched, @org.jetbrains.annotations.Nullable()
        java.lang.String suggestion_term_clicked, @org.jetbrains.annotations.Nullable()
        java.lang.Integer suggestion_term_clicked_position, @org.jetbrains.annotations.Nullable()
        java.lang.String elastic_search_type, @org.jetbrains.annotations.Nullable()
        java.lang.String clickedOnPage, @org.jetbrains.annotations.Nullable()
        java.lang.String section, @org.jetbrains.annotations.Nullable()
        java.lang.Integer sectionIndex, @org.jetbrains.annotations.Nullable()
        java.lang.String subsFoundEventOrderSummary, @org.jetbrains.annotations.Nullable()
        java.lang.String crossSellingSectionHeadingEvent, @org.jetbrains.annotations.Nullable()
        java.lang.String eventOrgProductForThisPage, @org.jetbrains.annotations.Nullable()
        java.lang.Integer sectionRow, @org.jetbrains.annotations.Nullable()
        java.lang.String clickedSuggestionType, @org.jetbrains.annotations.Nullable()
        java.lang.String otcSuperCategoryName, @org.jetbrains.annotations.Nullable()
        java.lang.String otcCategoryName, @org.jetbrains.annotations.Nullable()
        java.lang.String otcSubCategoryName, @org.jetbrains.annotations.Nullable()
        java.lang.String deepLinkActionType) {
            return null;
        }
    }
}