package com.intellihealth.truemeds.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0089\u0001\u001a\u00030\u008a\u0001J\u001a\u0010\u008b\u0001\u001a\u00030\u008a\u00012\u0007\u0010\u008c\u0001\u001a\u00020\n2\u0007\u0010\u008d\u0001\u001a\u00020\nJ\"\u0010\u008e\u0001\u001a\u00030\u008a\u00012\u0007\u0010\u008c\u0001\u001a\u00020\n2\u0007\u0010\u008d\u0001\u001a\u00020\n2\u0006\u0010\u007f\u001a\u00020\nJ\u001a\u0010\u008f\u0001\u001a\u00030\u008a\u00012\u0007\u0010\u008c\u0001\u001a\u00020\n2\u0007\u0010\u008d\u0001\u001a\u00020\nJ\u0011\u0010\u0090\u0001\u001a\u00030\u008a\u00012\u0007\u0010\u0091\u0001\u001a\u00020EJ\u001a\u0010\u0092\u0001\u001a\u00030\u008a\u00012\u0007\u0010\u008c\u0001\u001a\u00020\n2\u0007\u0010\u008d\u0001\u001a\u00020\nJ\u0013\u0010\u0093\u0001\u001a\u00030\u008a\u00012\t\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u001aJ\u0013\u0010\u0093\u0001\u001a\u00030\u008a\u00012\t\u0010\u0094\u0001\u001a\u0004\u0018\u00010-J\n\u0010\u0095\u0001\u001a\u00030\u008a\u0001H\u0002J#\u0010\u0096\u0001\u001a\u00030\u008a\u00012\u0007\u0010\u0097\u0001\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\n2\u0006\u0010a\u001a\u00020\nJ\u0019\u0010\u0098\u0001\u001a\u00030\u008a\u00012\u0006\u0010a\u001a\u00020\n2\u0007\u0010\u0083\u0001\u001a\u00020\nR\u001c\u0010\b\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\u0011R \u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\"\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u000f\"\u0004\b+\u0010\u0011R\"\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001c\"\u0004\b/\u0010\u001eR\u000e\u00100\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u00101\u001a\b\u0012\u0004\u0012\u00020$0\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001c\"\u0004\b3\u0010\u001eR \u00104\u001a\b\u0012\u0004\u0012\u00020$0\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u001c\"\u0004\b6\u0010\u001eR\u001a\u00107\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R \u0010<\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u000f\"\u0004\b>\u0010\u0011R \u0010?\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u000f\"\u0004\bA\u0010\u0011R\u001d\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020E0D0C8F\u00a2\u0006\u0006\u001a\u0004\bF\u0010GR\u001d\u0010H\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020E0I0C\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010GR\u001a\u0010K\u001a\u00020LX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR \u0010Q\u001a\b\u0012\u0004\u0012\u00020R0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010\u000f\"\u0004\bT\u0010\u0011R \u0010U\u001a\b\u0012\u0004\u0012\u00020-0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bV\u0010\u000f\"\u0004\bW\u0010\u0011R \u0010X\u001a\b\u0012\u0004\u0012\u00020\u001a0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bY\u0010\u000f\"\u0004\bZ\u0010\u0011R\u001d\u0010[\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020E0I0C\u00a2\u0006\b\n\u0000\u001a\u0004\b\\\u0010GR\u001a\u0010]\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020E0I0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010^\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020E0I0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010_\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010-0I0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b`\u0010\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010a\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bb\u0010\u000f\"\u0004\bc\u0010\u0011R\u001a\u0010d\u001a\u00020LX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bd\u0010N\"\u0004\be\u0010PR \u0010f\u001a\b\u0012\u0004\u0012\u00020g0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bf\u0010\u000f\"\u0004\bh\u0010\u0011R(\u0010i\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010L0L0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bj\u0010\u000f\"\u0004\bk\u0010\u0011R\u001a\u0010l\u001a\u00020mX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\u0017\u0010r\u001a\b\u0012\u0004\u0012\u00020s0C\u00a2\u0006\b\n\u0000\u001a\u0004\bt\u0010GR\u001c\u0010u\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bv\u00109\"\u0004\bw\u0010;R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010x\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020E0D0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010y\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\bz\u0010\u000fR\u0017\u0010{\u001a\b\u0012\u0004\u0012\u00020\n0C8F\u00a2\u0006\u0006\u001a\u0004\b|\u0010GR\u0017\u0010}\u001a\b\u0012\u0004\u0012\u00020s0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b~\u0010\u000fR\u001e\u0010\u007f\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0080\u0001\u00109\"\u0005\b\u0081\u0001\u0010;R\u000f\u0010\u0082\u0001\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R#\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0084\u0001\u0010\u000f\"\u0005\b\u0085\u0001\u0010\u0011R#\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0087\u0001\u0010\u000f\"\u0005\b\u0088\u0001\u0010\u0011\u00a8\u0006\u0099\u0001"}, d2 = {"Lcom/intellihealth/truemeds/presentation/viewmodel/HealthArticlesViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "homePageUseCase", "Lcom/intellihealth/truemeds/domain/usecase/HomePageUseCase;", "sdkEventUseCase", "Lcom/intellihealth/truemeds/domain/usecase/analytics/SdkEventUseCase;", "(Lcom/intellihealth/truemeds/domain/usecase/HomePageUseCase;Lcom/intellihealth/truemeds/domain/usecase/analytics/SdkEventUseCase;)V", "_showInternalServerError", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "aname", "author", "getAuthor", "()Landroidx/lifecycle/MutableLiveData;", "setAuthor", "(Landroidx/lifecycle/MutableLiveData;)V", "blogDataModel", "Lcom/intellihealth/salt/models/BlogModel;", "getBlogDataModel", "()Lcom/intellihealth/salt/models/BlogModel;", "setBlogDataModel", "(Lcom/intellihealth/salt/models/BlogModel;)V", "blogs", "Ljava/util/ArrayList;", "Lcom/intellihealth/salt/models/BlogCardModel;", "getBlogs", "()Ljava/util/ArrayList;", "setBlogs", "(Ljava/util/ArrayList;)V", "category", "getCategory", "setCategory", "categoryChipList", "", "Lcom/intellihealth/salt/models/HealthArticleChipCategoryData;", "getCategoryChipList", "()Ljava/util/List;", "setCategoryChipList", "(Ljava/util/List;)V", "categoryId", "getCategoryId", "setCategoryId", "categoryListModels", "Lcom/intellihealth/truemeds/presentation/model/BlogCardModel;", "getCategoryListModels", "setCategoryListModels", "categoryName", "categoryNameChipList", "getCategoryNameChipList", "setCategoryNameChipList", "categoryNameChipListSdk", "getCategoryNameChipListSdk", "setCategoryNameChipListSdk", "clickedOnPage", "getClickedOnPage", "()Ljava/lang/String;", "setClickedOnPage", "(Ljava/lang/String;)V", "date", "getDate", "setDate", "description", "getDescription", "setDescription", "eventSelectedCategory", "Landroidx/lifecycle/LiveData;", "Lcom/intellihealth/truemeds/presentation/utils/Event;", "Lcom/intellihealth/truemeds/data/model/home/CategoryListModel;", "getEventSelectedCategory", "()Landroidx/lifecycle/LiveData;", "getHealthArticleFilterCategoryList", "", "getGetHealthArticleFilterCategoryList", "hasMoreData", "", "getHasMoreData", "()Z", "setHasMoreData", "(Z)V", "healthArticleBlogModel", "Lcom/intellihealth/truemeds/data/model/home/BlogSectionDataModel;", "getHealthArticleBlogModel", "setHealthArticleBlogModel", "healthArticleData", "getHealthArticleData", "setHealthArticleData", "healthArticleData2", "getHealthArticleData2", "setHealthArticleData2", "healthArticleDetailsLiveData", "getHealthArticleDetailsLiveData", "healthArticleDetailsMutableLiveData", "healthArticleFilterCategoryList", "healthArticleList", "getHealthArticleList", "id", "getId", "setId", "isDataLoading", "setDataLoading", "isItemClick", "Lcom/intellihealth/truemeds/data/model/healtharticles/HealthArticleChipCategoryData;", "setItemClick", "loaderValue", "getLoaderValue", "setLoaderValue", "mxInternalErrorOccurred", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "getMxInternalErrorOccurred", "()Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "setMxInternalErrorOccurred", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;)V", "progressState", "Lcom/intellihealth/truemeds/data/utils/PROGRESS;", "getProgressState", "rendered", "getRendered", "setRendered", "selectedCategory", "showImageUrl", "getShowImageUrl", "showInternalServerError", "getShowInternalServerError", "showProgressBarState", "getShowProgressBarState", "slug", "getSlug", "setSlug", "sourceUrl", "title", "getTitle", "setTitle", "type", "getType", "setType", "addLoadingItem", "", "callHealthArticlesListApi", "userAgent", "urlParam", "getHealthArticleDetail", "getHealthArticles", "getHealthArticlesCategoryDetails", "data", "getHealthArticlesFilterCategory", "healthArticleClick", "item", "removeLoadingItemAndPostResult", "sendArticlesCategorySectionViewedEventToMixpanel", "page", "sendArticlesSharedEventToMixpanel", "app_prodDebug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class HealthArticlesViewModel extends androidx.lifecycle.ViewModel implements androidx.lifecycle.DefaultLifecycleObserver {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.HomePageUseCase homePageUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.analytics.SdkEventUseCase sdkEventUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.intellihealth.salt.models.BlogCardModel> blogs;
    public com.intellihealth.salt.models.BlogModel blogDataModel;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.home.BlogSectionDataModel> healthArticleBlogModel;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.presentation.model.BlogCardModel>> healthArticleList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.home.CategoryListModel>> healthArticleFilterCategoryList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.intellihealth.truemeds.data.model.home.CategoryListModel>> getHealthArticleFilterCategoryList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.utils.PROGRESS> showProgressBarState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.intellihealth.truemeds.data.utils.PROGRESS> progressState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.home.CategoryListModel>> healthArticleDetailsMutableLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.intellihealth.truemeds.data.model.home.CategoryListModel>> healthArticleDetailsLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.utils.Event<com.intellihealth.truemeds.data.model.home.CategoryListModel>> selectedCategory = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.intellihealth.salt.models.HealthArticleChipCategoryData> categoryChipList;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String categoryName = "";
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.intellihealth.salt.models.HealthArticleChipCategoryData> categoryNameChipList;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.intellihealth.salt.models.HealthArticleChipCategoryData> categoryNameChipListSdk;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String sourceUrl = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String aname = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String clickedOnPage = "";
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.intellihealth.truemeds.presentation.model.BlogCardModel> categoryListModels;
    private boolean hasMoreData = true;
    private boolean isDataLoading = false;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> title;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> category;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> categoryId;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> author;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> date;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> type;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> id;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> description;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> loaderValue;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> showImageUrl = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _showInternalServerError = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.model.BlogCardModel> healthArticleData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.BlogCardModel> healthArticleData2;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.healtharticles.HealthArticleChipCategoryData> isItemClick;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String rendered;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String slug;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred;
    
    @javax.inject.Inject()
    public HealthArticlesViewModel(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.HomePageUseCase homePageUseCase, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.analytics.SdkEventUseCase sdkEventUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.intellihealth.salt.models.BlogCardModel> getBlogs() {
        return null;
    }
    
    public final void setBlogs(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.intellihealth.salt.models.BlogCardModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.salt.models.BlogModel getBlogDataModel() {
        return null;
    }
    
    public final void setBlogDataModel(@org.jetbrains.annotations.NotNull()
    com.intellihealth.salt.models.BlogModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.home.BlogSectionDataModel> getHealthArticleBlogModel() {
        return null;
    }
    
    public final void setHealthArticleBlogModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.home.BlogSectionDataModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.presentation.model.BlogCardModel>> getHealthArticleList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.intellihealth.truemeds.data.model.home.CategoryListModel>> getGetHealthArticleFilterCategoryList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.utils.PROGRESS> getShowProgressBarState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.data.utils.PROGRESS> getProgressState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.intellihealth.truemeds.data.model.home.CategoryListModel>> getHealthArticleDetailsLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.salt.models.HealthArticleChipCategoryData> getCategoryChipList() {
        return null;
    }
    
    public final void setCategoryChipList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.salt.models.HealthArticleChipCategoryData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.utils.Event<com.intellihealth.truemeds.data.model.home.CategoryListModel>> getEventSelectedCategory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.intellihealth.salt.models.HealthArticleChipCategoryData> getCategoryNameChipList() {
        return null;
    }
    
    public final void setCategoryNameChipList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.intellihealth.salt.models.HealthArticleChipCategoryData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.intellihealth.salt.models.HealthArticleChipCategoryData> getCategoryNameChipListSdk() {
        return null;
    }
    
    public final void setCategoryNameChipListSdk(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.intellihealth.salt.models.HealthArticleChipCategoryData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getClickedOnPage() {
        return null;
    }
    
    public final void setClickedOnPage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.intellihealth.truemeds.presentation.model.BlogCardModel> getCategoryListModels() {
        return null;
    }
    
    public final void setCategoryListModels(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.intellihealth.truemeds.presentation.model.BlogCardModel> p0) {
    }
    
    public final boolean getHasMoreData() {
        return false;
    }
    
    public final void setHasMoreData(boolean p0) {
    }
    
    public final boolean isDataLoading() {
        return false;
    }
    
    public final void setDataLoading(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getCategory() {
        return null;
    }
    
    public final void setCategory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getCategoryId() {
        return null;
    }
    
    public final void setCategoryId(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getAuthor() {
        return null;
    }
    
    public final void setAuthor(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getDate() {
        return null;
    }
    
    public final void setDate(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLoaderValue() {
        return null;
    }
    
    public final void setLoaderValue(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getShowImageUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getShowInternalServerError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.model.BlogCardModel> getHealthArticleData() {
        return null;
    }
    
    public final void setHealthArticleData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.model.BlogCardModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.BlogCardModel> getHealthArticleData2() {
        return null;
    }
    
    public final void setHealthArticleData2(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.BlogCardModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.healtharticles.HealthArticleChipCategoryData> isItemClick() {
        return null;
    }
    
    public final void setItemClick(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.healtharticles.HealthArticleChipCategoryData> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRendered() {
        return null;
    }
    
    public final void setRendered(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSlug() {
        return null;
    }
    
    public final void setSlug(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred getMxInternalErrorOccurred() {
        return null;
    }
    
    public final void setMxInternalErrorOccurred(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred p0) {
    }
    
    public final void getHealthArticles(@org.jetbrains.annotations.NotNull()
    java.lang.String userAgent, @org.jetbrains.annotations.NotNull()
    java.lang.String urlParam) {
    }
    
    public final void addLoadingItem() {
    }
    
    private final void removeLoadingItemAndPostResult() {
    }
    
    public final void getHealthArticlesFilterCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String userAgent, @org.jetbrains.annotations.NotNull()
    java.lang.String urlParam) {
    }
    
    public final void getHealthArticlesCategoryDetails(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.home.CategoryListModel data) {
    }
    
    public final void getHealthArticleDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String userAgent, @org.jetbrains.annotations.NotNull()
    java.lang.String urlParam, @org.jetbrains.annotations.NotNull()
    java.lang.String slug) {
    }
    
    public final void healthArticleClick(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.presentation.model.BlogCardModel item) {
    }
    
    public final void healthArticleClick(@org.jetbrains.annotations.Nullable()
    com.intellihealth.salt.models.BlogCardModel item) {
    }
    
    public final void callHealthArticlesListApi(@org.jetbrains.annotations.NotNull()
    java.lang.String userAgent, @org.jetbrains.annotations.NotNull()
    java.lang.String urlParam) {
    }
    
    public final void sendArticlesCategorySectionViewedEventToMixpanel(@org.jetbrains.annotations.NotNull()
    java.lang.String page, @org.jetbrains.annotations.Nullable()
    java.lang.String category, @org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    public final void sendArticlesSharedEventToMixpanel(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String title) {
    }
}