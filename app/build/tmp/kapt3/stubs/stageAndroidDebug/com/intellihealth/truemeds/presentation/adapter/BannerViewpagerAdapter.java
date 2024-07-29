package com.intellihealth.truemeds.presentation.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001)B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\fJ \u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020!H\u0016J\u0018\u0010%\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\u0018\u0010&\u001a\u00020\u00192\u0006\u0010\'\u001a\u00020(2\u0006\u0010\"\u001a\u00020#H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R*\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R*\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/BannerViewpagerAdapter;", "Landroidx/viewpager/widget/PagerAdapter;", "context", "Landroid/content/Context;", "bannerImageModel", "Ljava/util/ArrayList;", "Lcom/intellihealth/salt/models/BannerItemModel;", "Lkotlin/collections/ArrayList;", "bannerClickCallback", "Lcom/intellihealth/truemeds/presentation/adapter/BannerViewpagerAdapter$BannerViewPagerClickCallback;", "title", "", "(Landroid/content/Context;Ljava/util/ArrayList;Lcom/intellihealth/truemeds/presentation/adapter/BannerViewpagerAdapter$BannerViewPagerClickCallback;Ljava/lang/String;)V", "bannerImageList", "getBannerImageList", "()Ljava/util/ArrayList;", "setBannerImageList", "(Ljava/util/ArrayList;)V", "getBannerImageModel", "setBannerImageModel", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "isImageLoadingSuccess", "", "layoutInflater", "Landroid/view/LayoutInflater;", "destroyItem", "", "container", "Landroid/view/ViewGroup;", "position", "", "object", "", "getCount", "instantiateItem", "isViewFromObject", "view", "Landroid/view/View;", "BannerViewPagerClickCallback", "app_stageAndroidDebug"})
public final class BannerViewpagerAdapter extends androidx.viewpager.widget.PagerAdapter {
    @org.jetbrains.annotations.NotNull()
    private android.content.Context context;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.intellihealth.salt.models.BannerItemModel> bannerImageModel;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.presentation.adapter.BannerViewpagerAdapter.BannerViewPagerClickCallback bannerClickCallback = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String title = null;
    @org.jetbrains.annotations.NotNull()
    private final android.view.LayoutInflater layoutInflater = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.intellihealth.salt.models.BannerItemModel> bannerImageList;
    private boolean isImageLoadingSuccess = true;
    
    public BannerViewpagerAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.intellihealth.salt.models.BannerItemModel> bannerImageModel, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.adapter.BannerViewpagerAdapter.BannerViewPagerClickCallback bannerClickCallback, @org.jetbrains.annotations.Nullable()
    java.lang.String title) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.intellihealth.salt.models.BannerItemModel> getBannerImageModel() {
        return null;
    }
    
    public final void setBannerImageModel(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.intellihealth.salt.models.BannerItemModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.intellihealth.salt.models.BannerItemModel> getBannerImageList() {
        return null;
    }
    
    public final void setBannerImageList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.intellihealth.salt.models.BannerItemModel> p0) {
    }
    
    @java.lang.Override()
    public int getCount() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean isViewFromObject(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    java.lang.Object object) {
        return false;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.Object instantiateItem(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup container, int position) {
        return null;
    }
    
    @java.lang.Override()
    public void destroyItem(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup container, int position, @org.jetbrains.annotations.NotNull()
    java.lang.Object object) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tH&\u00a8\u0006\n"}, d2 = {"Lcom/intellihealth/truemeds/presentation/adapter/BannerViewpagerAdapter$BannerViewPagerClickCallback;", "", "onBannerClick", "", "position", "", "imgList", "Ljava/util/ArrayList;", "Lcom/intellihealth/salt/models/BannerItemModel;", "Lkotlin/collections/ArrayList;", "app_stageAndroidDebug"})
    public static abstract interface BannerViewPagerClickCallback {
        
        public abstract void onBannerClick(int position, @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.intellihealth.salt.models.BannerItemModel> imgList);
    }
}