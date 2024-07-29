package com.intellihealth.truemeds.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010N\u001a\u00020OJ\u000e\u0010P\u001a\u00020O2\u0006\u0010Q\u001a\u00020RJ\u000e\u0010S\u001a\u00020O2\u0006\u0010T\u001a\u00020\u0007J\u000e\u0010U\u001a\u00020O2\u0006\u0010V\u001a\u00020\u001dJ\u000e\u0010U\u001a\u00020O2\u0006\u0010T\u001a\u00020\u0007J\u000e\u0010W\u001a\u00020O2\u0006\u0010X\u001a\u00020\rJ\u000e\u0010Y\u001a\u00020O2\u0006\u0010Q\u001a\u00020RR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00140\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u0017R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u000f\"\u0004\b$\u0010\u0011R\u001a\u0010%\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u000f\"\u0004\b\'\u0010\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0)\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\"\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001f\"\u0004\b.\u0010!R \u0010/\u001a\b\u0012\u0004\u0012\u00020\u001d00X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001f\"\u0004\b2\u0010!R\u001a\u00103\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\t\"\u0004\b5\u0010\u000bR\u001a\u00106\u001a\u000207X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001c\u0010<\u001a\u0004\u0018\u00010\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001a\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00140)X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010B\u001a\u0010\u0012\f\u0012\n D*\u0004\u0018\u00010C0C0)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010+\"\u0004\bF\u0010GR\u001a\u0010H\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140)X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010I\u001a\u0010\u0012\f\u0012\n D*\u0004\u0018\u00010C0C0)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010+\"\u0004\bK\u0010GR\u0017\u0010L\u001a\b\u0012\u0004\u0012\u00020C0\u00138F\u00a2\u0006\u0006\u001a\u0004\bM\u0010\u0017\u00a8\u0006Z"}, d2 = {"Lcom/intellihealth/truemeds/presentation/viewmodel/HelpViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "helpFaqTncUseCase", "Lcom/intellihealth/truemeds/domain/usecase/HelpFaqTncUseCase;", "(Lcom/intellihealth/truemeds/domain/usecase/HelpFaqTncUseCase;)V", "apiType", "", "getApiType", "()I", "setApiType", "(I)V", "categoryId", "", "getCategoryId", "()Ljava/lang/String;", "setCategoryId", "(Ljava/lang/String;)V", "eventMessage", "Landroidx/lifecycle/LiveData;", "Lcom/intellihealth/truemeds/presentation/viewmodel/events/Event;", "Lcom/intellihealth/truemeds/data/utils/MESSAGES;", "getEventMessage", "()Landroidx/lifecycle/LiveData;", "eventShowError", "Lcom/intellihealth/truemeds/data/utils/ERRORS;", "getEventShowError", "filteredlist", "", "Lcom/intellihealth/truemeds/data/model/helpfaqtnc/HelpCategoryResponse$CategoryList;", "getFilteredlist", "()Ljava/util/List;", "setFilteredlist", "(Ljava/util/List;)V", "helpContactNo", "getHelpContactNo", "setHelpContactNo", "helpEmailAddress", "getHelpEmailAddress", "setHelpEmailAddress", "helpList", "Landroidx/lifecycle/MutableLiveData;", "getHelpList", "()Landroidx/lifecycle/MutableLiveData;", "helpListApiResponse", "getHelpListApiResponse", "setHelpListApiResponse", "helpListOriginal", "", "getHelpListOriginal", "setHelpListOriginal", "itemClickedPosition", "getItemClickedPosition", "setItemClickedPosition", "mxInternalErrorOccurred", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "getMxInternalErrorOccurred", "()Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "setMxInternalErrorOccurred", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;)V", "selectedCategory", "getSelectedCategory", "()Lcom/intellihealth/truemeds/data/model/helpfaqtnc/HelpCategoryResponse$CategoryList;", "setSelectedCategory", "(Lcom/intellihealth/truemeds/data/model/helpfaqtnc/HelpCategoryResponse$CategoryList;)V", "showError", "showHelpListView", "", "kotlin.jvm.PlatformType", "getShowHelpListView", "setShowHelpListView", "(Landroidx/lifecycle/MutableLiveData;)V", "showMessage", "showShimmer", "getShowShimmer", "setShowShimmer", "showShimmerLiveData", "getShowShimmerLiveData", "contactCustomerSupportClick", "", "getAllHelpCategory", "mContext", "Landroid/content/Context;", "helpListItemClick", "position", "helpSubCategoryListItemClick", "category", "performFilterOperation", "text", "subCategoryApiCalling", "app_prodDebug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class HelpViewModel extends androidx.lifecycle.ViewModel implements androidx.lifecycle.DefaultLifecycleObserver {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.HelpFaqTncUseCase helpFaqTncUseCase = null;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.data.model.helpfaqtnc.HelpCategoryResponse.CategoryList selectedCategory;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.utils.ERRORS>> showError = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.helpfaqtnc.HelpCategoryResponse.CategoryList>> helpList = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.intellihealth.truemeds.data.model.helpfaqtnc.HelpCategoryResponse.CategoryList> helpListOriginal;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.intellihealth.truemeds.data.model.helpfaqtnc.HelpCategoryResponse.CategoryList> filteredlist;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showHelpListView;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showShimmer;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.utils.MESSAGES>> showMessage = null;
    private int itemClickedPosition = -1;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String helpContactNo;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String helpEmailAddress;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.intellihealth.truemeds.data.model.helpfaqtnc.HelpCategoryResponse.CategoryList> helpListApiResponse;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String categoryId = "";
    private int apiType = 0;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred;
    
    @javax.inject.Inject()
    public HelpViewModel(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.HelpFaqTncUseCase helpFaqTncUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.helpfaqtnc.HelpCategoryResponse.CategoryList getSelectedCategory() {
        return null;
    }
    
    public final void setSelectedCategory(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.helpfaqtnc.HelpCategoryResponse.CategoryList p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.utils.ERRORS>> getEventShowError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.helpfaqtnc.HelpCategoryResponse.CategoryList>> getHelpList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.truemeds.data.model.helpfaqtnc.HelpCategoryResponse.CategoryList> getHelpListOriginal() {
        return null;
    }
    
    public final void setHelpListOriginal(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.helpfaqtnc.HelpCategoryResponse.CategoryList> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.truemeds.data.model.helpfaqtnc.HelpCategoryResponse.CategoryList> getFilteredlist() {
        return null;
    }
    
    public final void setFilteredlist(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.helpfaqtnc.HelpCategoryResponse.CategoryList> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowHelpListView() {
        return null;
    }
    
    public final void setShowHelpListView(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowShimmer() {
        return null;
    }
    
    public final void setShowShimmer(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getShowShimmerLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.utils.MESSAGES>> getEventMessage() {
        return null;
    }
    
    public final int getItemClickedPosition() {
        return 0;
    }
    
    public final void setItemClickedPosition(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHelpContactNo() {
        return null;
    }
    
    public final void setHelpContactNo(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHelpEmailAddress() {
        return null;
    }
    
    public final void setHelpEmailAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.truemeds.data.model.helpfaqtnc.HelpCategoryResponse.CategoryList> getHelpListApiResponse() {
        return null;
    }
    
    public final void setHelpListApiResponse(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.helpfaqtnc.HelpCategoryResponse.CategoryList> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCategoryId() {
        return null;
    }
    
    public final void setCategoryId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getApiType() {
        return 0;
    }
    
    public final void setApiType(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred getMxInternalErrorOccurred() {
        return null;
    }
    
    public final void setMxInternalErrorOccurred(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred p0) {
    }
    
    public final void contactCustomerSupportClick() {
    }
    
    public final void helpListItemClick(int position) {
    }
    
    public final void getAllHelpCategory(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext) {
    }
    
    public final void performFilterOperation(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    public final void helpSubCategoryListItemClick(int position) {
    }
    
    public final void helpSubCategoryListItemClick(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.helpfaqtnc.HelpCategoryResponse.CategoryList category) {
    }
    
    public final void subCategoryApiCalling(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext) {
    }
}