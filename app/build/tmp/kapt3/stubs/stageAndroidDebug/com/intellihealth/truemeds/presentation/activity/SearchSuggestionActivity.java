package com.intellihealth.truemeds.presentation.activity;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u00105\u001a\u000206H\u0002J\b\u00107\u001a\u000206H\u0016J\b\u00108\u001a\u000206H\u0016J\b\u00109\u001a\u000206H\u0016J\u001a\u0010:\u001a\u00020*2\b\u0010;\u001a\u0004\u0018\u00010<2\u0006\u0010=\u001a\u00020*H\u0002J\b\u0010>\u001a\u000206H\u0002J\b\u0010?\u001a\u000206H\u0002J\"\u0010@\u001a\u0002062\u0006\u0010A\u001a\u00020*2\u0006\u0010B\u001a\u00020*2\b\u0010C\u001a\u0004\u0018\u00010!H\u0014J\u0012\u0010D\u001a\u0002062\b\u0010E\u001a\u0004\u0018\u00010FH\u0014J\u0012\u0010G\u001a\u0002062\b\u0010H\u001a\u0004\u0018\u00010!H\u0014J\b\u0010I\u001a\u000206H\u0014J\b\u0010J\u001a\u000206H\u0014J\b\u0010K\u001a\u000206H\u0016J\u0006\u0010L\u001a\u000206J\b\u0010M\u001a\u000206H\u0016J\b\u0010N\u001a\u000206H\u0002J\u0010\u0010O\u001a\u0002062\u0006\u0010P\u001a\u00020\u0004H\u0016J\b\u0010Q\u001a\u000206H\u0002J\b\u0010R\u001a\u000206H\u0002J\u0016\u0010S\u001a\u0002062\u0006\u0010T\u001a\u00020\u00142\u0006\u0010U\u001a\u00020\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0006\"\u0004\b(\u0010\bR\u001a\u0010)\u001a\u00020*X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001b\u0010/\u001a\u0002008BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b3\u00104\u001a\u0004\b1\u00102\u00a8\u0006V"}, d2 = {"Lcom/intellihealth/truemeds/presentation/activity/SearchSuggestionActivity;", "Lcom/intellihealth/truemeds/presentation/activity/BaseActivityWithLogin;", "()V", "backpressed", "", "getBackpressed", "()Z", "setBackpressed", "(Z)V", "binding", "Lcom/intellihealth/truemeds/databinding/ActivitySearchSuggestionBinding;", "getBinding", "()Lcom/intellihealth/truemeds/databinding/ActivitySearchSuggestionBinding;", "binding$delegate", "Lcom/intellihealth/truemeds/presentation/utils/ActivityViewBindingDelegate;", "bottomSheet", "Lcom/intellihealth/truemeds/presentation/bottomsheet/login/LoginBottomSheet;", "context", "Landroid/content/Context;", "deepLinkSearchQuery", "", "getDeepLinkSearchQuery", "()Ljava/lang/String;", "setDeepLinkSearchQuery", "(Ljava/lang/String;)V", "layoutManager", "Landroidx/recyclerview/widget/StaggeredGridLayoutManager;", "getLayoutManager", "()Landroidx/recyclerview/widget/StaggeredGridLayoutManager;", "setLayoutManager", "(Landroidx/recyclerview/widget/StaggeredGridLayoutManager;)V", "resultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "getResultLauncher", "()Landroidx/activity/result/ActivityResultLauncher;", "setResultLauncher", "(Landroidx/activity/result/ActivityResultLauncher;)V", "searchbarClearPressed", "getSearchbarClearPressed", "setSearchbarClearPressed", "sspResumeCount", "", "getSspResumeCount", "()I", "setSspResumeCount", "(I)V", "viewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/SearchViewModel;", "getViewModel", "()Lcom/intellihealth/truemeds/presentation/viewmodel/SearchViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "addEditTextChangeListener", "", "closeLoginBottomSheet", "extractIntentData", "getTrueCallerUserDetails", "getVisibleViewIndexOnBasisOfHeight", "view", "Landroid/view/View;", "lastVisibleItemPosition", "hideKeyboard", "initializeData", "onActivityResult", "requestCode", "resultCode", "data", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onNewIntent", "intent", "onPause", "onResume", "openLoginBottomSheet", "removeItemsFromRV", "sendLoginPageViewedEvent", "setEventListener", "setIsTruecaller", "isTruecaller", "setLastVisibleItemIndex", "setupOnBackPresses", "triggerItemSearchedEvent", "pastSearchTermClicked", "clickedPastSearchType", "app_stageAndroidDebug"})
public final class SearchSuggestionActivity extends com.intellihealth.truemeds.presentation.activity.BaseActivityWithLogin {
    private android.content.Context context;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.presentation.utils.ActivityViewBindingDelegate binding$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private androidx.recyclerview.widget.StaggeredGridLayoutManager layoutManager;
    private int sspResumeCount = 1;
    @org.jetbrains.annotations.Nullable()
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> resultLauncher;
    private boolean backpressed = false;
    private boolean searchbarClearPressed = false;
    private com.intellihealth.truemeds.presentation.bottomsheet.login.LoginBottomSheet bottomSheet;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String deepLinkSearchQuery = "";
    
    public SearchSuggestionActivity() {
        super();
    }
    
    private final com.intellihealth.truemeds.presentation.viewmodel.SearchViewModel getViewModel() {
        return null;
    }
    
    private final com.intellihealth.truemeds.databinding.ActivitySearchSuggestionBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.recyclerview.widget.StaggeredGridLayoutManager getLayoutManager() {
        return null;
    }
    
    public final void setLayoutManager(@org.jetbrains.annotations.Nullable()
    androidx.recyclerview.widget.StaggeredGridLayoutManager p0) {
    }
    
    public final int getSspResumeCount() {
        return 0;
    }
    
    public final void setSspResumeCount(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.activity.result.ActivityResultLauncher<android.content.Intent> getResultLauncher() {
        return null;
    }
    
    public final void setResultLauncher(@org.jetbrains.annotations.Nullable()
    androidx.activity.result.ActivityResultLauncher<android.content.Intent> p0) {
    }
    
    public final boolean getBackpressed() {
        return false;
    }
    
    public final void setBackpressed(boolean p0) {
    }
    
    public final boolean getSearchbarClearPressed() {
        return false;
    }
    
    public final void setSearchbarClearPressed(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDeepLinkSearchQuery() {
        return null;
    }
    
    public final void setDeepLinkSearchQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    public void extractIntentData() {
    }
    
    @java.lang.Override()
    public void sendLoginPageViewedEvent() {
    }
    
    @java.lang.Override()
    public void setIsTruecaller(boolean isTruecaller) {
    }
    
    @java.lang.Override()
    public void getTrueCallerUserDetails() {
    }
    
    @java.lang.Override()
    public void openLoginBottomSheet() {
    }
    
    @java.lang.Override()
    public void closeLoginBottomSheet() {
    }
    
    /**
     * 1) Setup binding and viewmodel
     * 2) Set viewmodel as lifecycle observer of the activity
     * 3) Set edittext to block backslash input & set focus on edittext to show keyboard on screen launch
     * 4) Load searching gif using Glide into imageview
     * 5) Update status bar color
     * 6) Set event listener
     * 7) set onBackPressed callback
     * 8) Initialize data: initialize variables, get extras, offline recently searched, previously viewed,
     * trending searches(shared preference) & Call api to get trending searches data
     */
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * 1) Get extras and update variable data
     * 2) Initialize variables
     * 3) offline data: recently searched, previously viewed, trending searches(shared preference)
     * 4) Call api to get trending searches data
     */
    private final void initializeData() {
    }
    
    /**
     * as onBackPressed is deprecated, onBackPressedDispatcher is used to handle onBackPresses event
     */
    private final void setupOnBackPresses() {
    }
    
    private final void setEventListener() {
    }
    
    public final void triggerItemSearchedEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String pastSearchTermClicked, @org.jetbrains.annotations.NotNull()
    java.lang.String clickedPastSearchType) {
    }
    
    private final void setLastVisibleItemIndex() {
    }
    
    private final void addEditTextChangeListener() {
    }
    
    public final void removeItemsFromRV() {
    }
    
    private final void hideKeyboard() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onNewIntent(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    private final int getVisibleViewIndexOnBasisOfHeight(android.view.View view, int lastVisibleItemPosition) {
        return 0;
    }
}