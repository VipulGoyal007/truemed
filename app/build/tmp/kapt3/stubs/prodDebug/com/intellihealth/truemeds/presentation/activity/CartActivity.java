package com.intellihealth.truemeds.presentation.activity;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010>\u001a\u00020?H\u0002J\b\u0010@\u001a\u00020?H\u0002J\b\u0010A\u001a\u00020?H\u0002J\u0006\u0010B\u001a\u00020?J\u0019\u0010C\u001a\u00020?2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010%H\u0002\u00a2\u0006\u0002\u0010EJ\b\u0010F\u001a\u00020?H\u0016J\b\u0010G\u001a\u00020?H\u0002J\b\u0010H\u001a\u00020%H\u0002J\b\u0010I\u001a\u00020?H\u0002J\"\u0010J\u001a\u00020?2\u0006\u0010K\u001a\u00020\u00062\u0006\u0010L\u001a\u00020\u00062\b\u0010M\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010N\u001a\u00020?H\u0002J\u0012\u0010O\u001a\u00020?2\b\u0010P\u001a\u0004\u0018\u00010QH\u0014J\b\u0010R\u001a\u00020?H\u0014J\b\u0010S\u001a\u00020?H\u0002J\u0012\u0010T\u001a\u00020?2\b\u0010U\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010V\u001a\u00020?H\u0014J\b\u0010W\u001a\u00020?H\u0014J\b\u0010X\u001a\u00020?H\u0002J\b\u0010Y\u001a\u00020?H\u0002J\b\u0010Z\u001a\u00020?H\u0002J\b\u0010[\u001a\u00020?H\u0002J\b\u0010\\\u001a\u00020?H\u0002J\b\u0010]\u001a\u00020?H\u0002J\b\u0010^\u001a\u00020?H\u0002J\b\u0010_\u001a\u00020?H\u0002J\b\u0010`\u001a\u00020?H\u0002J\b\u0010a\u001a\u00020?H\u0002J\b\u0010b\u001a\u00020?H\u0002J\u001e\u0010c\u001a\u00020?2\u0006\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020\u00062\u0006\u0010g\u001a\u00020%J\u001e\u0010h\u001a\u00020?2\u0006\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020\u00062\u0006\u0010g\u001a\u00020%J \u0010i\u001a\u00020?2\u0006\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020\u00062\u0006\u0010g\u001a\u00020%H\u0002J\u001e\u0010j\u001a\u00020?2\u0006\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020\u00062\u0006\u0010g\u001a\u00020%J \u0010k\u001a\u00020?2\u0006\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020\u00062\u0006\u0010g\u001a\u00020%H\u0002J\u001e\u0010l\u001a\u00020?2\u0006\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020\u00062\u0006\u0010g\u001a\u00020%J\b\u0010m\u001a\u00020?H\u0002J\u0006\u0010n\u001a\u00020?R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u000e\u0010$\u001a\u00020%X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010(\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00060.X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010/\u001a\u000200X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u000e\u00105\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u000107X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u00108\u001a\u0002098BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b:\u0010;\u00a8\u0006o"}, d2 = {"Lcom/intellihealth/truemeds/presentation/activity/CartActivity;", "Lcom/intellihealth/truemeds/presentation/activity/BaseActivity;", "()V", "MIN_DELAY_MS", "", "REQUEST_CODE", "", "activityLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "actualReplaceCounter", "binding", "Lcom/intellihealth/truemeds/databinding/ActivityCartBinding;", "getBinding", "()Lcom/intellihealth/truemeds/databinding/ActivityCartBinding;", "binding$delegate", "Lcom/intellihealth/truemeds/presentation/utils/ActivityViewBindingDelegate;", "bottomSheet", "Lcom/intellihealth/truemeds/presentation/bottomsheet/UploadPrescriptionBottomSheet;", "getBottomSheet", "()Lcom/intellihealth/truemeds/presentation/bottomsheet/UploadPrescriptionBottomSheet;", "setBottomSheet", "(Lcom/intellihealth/truemeds/presentation/bottomsheet/UploadPrescriptionBottomSheet;)V", "clickedOnPage", "", "deleteImageBottomSheet", "Lcom/intellihealth/truemeds/presentation/bottomsheet/DeleteImageBottomSheet;", "editDeleteAddressBottomSheet", "Lcom/intellihealth/truemeds/presentation/bottomsheet/cart/RemoveProductBottomSheet;", "firebaseEvent", "Lcom/intellihealth/truemeds/domain/usecase/analytics/FirebaseEventUseCase;", "getFirebaseEvent", "()Lcom/intellihealth/truemeds/domain/usecase/analytics/FirebaseEventUseCase;", "setFirebaseEvent", "(Lcom/intellihealth/truemeds/domain/usecase/analytics/FirebaseEventUseCase;)V", "isStepThreeAnimationDone", "", "mLastClickTime", "pincode", "prescriptionImageId", "getPrescriptionImageId", "()J", "setPrescriptionImageId", "(J)V", "previousMap", "Ljava/util/HashMap;", "replaceBottomSheet", "Lcom/intellihealth/truemeds/presentation/bottomsheet/ReplaceBottomSheet;", "getReplaceBottomSheet", "()Lcom/intellihealth/truemeds/presentation/bottomsheet/ReplaceBottomSheet;", "setReplaceBottomSheet", "(Lcom/intellihealth/truemeds/presentation/bottomsheet/ReplaceBottomSheet;)V", "replaceableCount", "replacingBottomSheet", "Lcom/intellihealth/truemeds/presentation/bottomsheet/ReplacingItemBottomSheet;", "viewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/CartViewModel;", "getViewModel", "()Lcom/intellihealth/truemeds/presentation/viewmodel/CartViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "addAddressFlow", "", "animateIndividualProductReplace", "animateIndividualUndoReplace", "clearPrefrences", "couponSavedData", "isCouponRemoved", "(Ljava/lang/Boolean;)V", "extractIntentData", "initUI", "isSingleClick", "launchSearchSuggestionPage", "onActivityResult", "requestCode", "resultCode", "data", "onCameraClick", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onGalleryClick", "onNewIntent", "intent", "onPause", "onResume", "openPrescriptionActivity", "openUploadPrescriptionBottomSheet", "replaceMedicineAnimation", "setApiCall", "setClickListeners", "setDynamicHeightForViewSpace", "setListener", "setListenerObserver", "showConfirmationBottomSheet", "showReplaceAllSavings", "showReplacingBottomSheet", "stepFourAnimForReplace", "hBinding", "Lcom/intellihealth/truemeds/databinding/AdapterCartItemBinding;", "index", "isLastItem", "stepFourAnimForUndo", "stepOneAnimForReplace", "stepThreeAnimForReplace", "stepThreeAnimForUndo", "stepTowAnimForReplace", "undoReplaceAnimation", "viewBillClick", "app_prodDebug"})
public final class CartActivity extends com.intellihealth.truemeds.presentation.activity.BaseActivity {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.presentation.utils.ActivityViewBindingDelegate binding$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @javax.inject.Inject()
    public com.intellihealth.truemeds.domain.usecase.analytics.FirebaseEventUseCase firebaseEvent;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.presentation.bottomsheet.cart.RemoveProductBottomSheet editDeleteAddressBottomSheet;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.presentation.bottomsheet.ReplaceBottomSheet replaceBottomSheet;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.presentation.bottomsheet.DeleteImageBottomSheet deleteImageBottomSheet;
    private long prescriptionImageId = 0L;
    private final int REQUEST_CODE = 1;
    @org.jetbrains.annotations.NotNull()
    private java.util.HashMap<java.lang.String, java.lang.Integer> previousMap;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String clickedOnPage = "Cart_Activity";
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.bottomsheet.ReplacingItemBottomSheet replacingBottomSheet;
    private int actualReplaceCounter = 0;
    private int replaceableCount = 0;
    private boolean isStepThreeAnimationDone = false;
    private int pincode;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.bottomsheet.UploadPrescriptionBottomSheet bottomSheet;
    @org.jetbrains.annotations.NotNull()
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> activityLauncher;
    private long mLastClickTime = 0L;
    private final long MIN_DELAY_MS = 500L;
    
    public CartActivity() {
        super();
    }
    
    private final com.intellihealth.truemeds.databinding.ActivityCartBinding getBinding() {
        return null;
    }
    
    private final com.intellihealth.truemeds.presentation.viewmodel.CartViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.domain.usecase.analytics.FirebaseEventUseCase getFirebaseEvent() {
        return null;
    }
    
    public final void setFirebaseEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.analytics.FirebaseEventUseCase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.bottomsheet.ReplaceBottomSheet getReplaceBottomSheet() {
        return null;
    }
    
    public final void setReplaceBottomSheet(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.bottomsheet.ReplaceBottomSheet p0) {
    }
    
    public final long getPrescriptionImageId() {
        return 0L;
    }
    
    public final void setPrescriptionImageId(long p0) {
    }
    
    @java.lang.Override()
    public void extractIntentData() {
    }
    
    private final void couponSavedData(java.lang.Boolean isCouponRemoved) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.presentation.bottomsheet.UploadPrescriptionBottomSheet getBottomSheet() {
        return null;
    }
    
    public final void setBottomSheet(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.presentation.bottomsheet.UploadPrescriptionBottomSheet p0) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setDynamicHeightForViewSpace() {
    }
    
    private final void setListener() {
    }
    
    public final void viewBillClick() {
    }
    
    private final void addAddressFlow() {
    }
    
    private final void initUI() {
    }
    
    private final void setClickListeners() {
    }
    
    private final void showReplacingBottomSheet() {
    }
    
    private final void setListenerObserver() {
    }
    
    public final void clearPrefrences() {
    }
    
    private final void openPrescriptionActivity() {
    }
    
    private final void onCameraClick() {
    }
    
    private final void onGalleryClick() {
    }
    
    private final void launchSearchSuggestionPage() {
    }
    
    private final void showConfirmationBottomSheet() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final boolean isSingleClick() {
        return false;
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    private final void openUploadPrescriptionBottomSheet() {
    }
    
    private final void setApiCall() {
    }
    
    private final void showReplaceAllSavings() {
    }
    
    /**
     * Undo animation
     */
    private final void undoReplaceAnimation() {
    }
    
    private final void animateIndividualUndoReplace() {
    }
    
    private final void stepThreeAnimForUndo(com.intellihealth.truemeds.databinding.AdapterCartItemBinding hBinding, int index, boolean isLastItem) {
    }
    
    public final void stepFourAnimForUndo(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.databinding.AdapterCartItemBinding hBinding, int index, boolean isLastItem) {
    }
    
    /**
     * Replace all animation
     */
    private final void replaceMedicineAnimation() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    private final void animateIndividualProductReplace() {
    }
    
    private final void stepOneAnimForReplace(com.intellihealth.truemeds.databinding.AdapterCartItemBinding hBinding, int index, boolean isLastItem) {
    }
    
    public final void stepTowAnimForReplace(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.databinding.AdapterCartItemBinding hBinding, int index, boolean isLastItem) {
    }
    
    public final void stepThreeAnimForReplace(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.databinding.AdapterCartItemBinding hBinding, int index, boolean isLastItem) {
    }
    
    public final void stepFourAnimForReplace(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.databinding.AdapterCartItemBinding hBinding, int index, boolean isLastItem) {
    }
    
    @java.lang.Override()
    protected void onNewIntent(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
    }
}