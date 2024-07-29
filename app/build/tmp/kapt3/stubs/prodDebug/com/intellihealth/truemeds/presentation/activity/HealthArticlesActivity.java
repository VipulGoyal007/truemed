package com.intellihealth.truemeds.presentation.activity;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001fB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\u0012\u0010\u0019\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\b\u0010\u001c\u001a\u00020\u0017H\u0014J\b\u0010\u001d\u001a\u00020\u0017H\u0002J\b\u0010\u001e\u001a\u00020\u0017H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/intellihealth/truemeds/presentation/activity/HealthArticlesActivity;", "Lcom/intellihealth/truemeds/presentation/activity/BaseActivity;", "()V", "binding", "Lcom/intellihealth/truemeds/databinding/ActivityHealthArticlesBinding;", "getBinding", "()Lcom/intellihealth/truemeds/databinding/ActivityHealthArticlesBinding;", "binding$delegate", "Lcom/intellihealth/truemeds/presentation/utils/ActivityViewBindingDelegate;", "filterCategory", "", "filterCategoryId", "healthArticleBottomSheet", "Lcom/intellihealth/truemeds/presentation/bottomsheet/HealthArticleBottomSheet;", "healthArticlesViewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/HealthArticlesViewModel;", "isFilterApplied", "", "pageCounter", "", "selectedCategoryId", "selectedCategoryName", "extractIntentData", "", "getArticles", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "setEventListener", "setHeaderData", "CustomTypefaceSpan", "app_prodDebug"})
public final class HealthArticlesActivity extends com.intellihealth.truemeds.presentation.activity.BaseActivity {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.presentation.utils.ActivityViewBindingDelegate binding$delegate = null;
    private com.intellihealth.truemeds.presentation.viewmodel.HealthArticlesViewModel healthArticlesViewModel;
    private int pageCounter = 0;
    private boolean isFilterApplied = false;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String selectedCategoryId;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String selectedCategoryName;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String filterCategoryId;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String filterCategory;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.bottomsheet.HealthArticleBottomSheet healthArticleBottomSheet;
    
    public HealthArticlesActivity() {
        super();
    }
    
    private final com.intellihealth.truemeds.databinding.ActivityHealthArticlesBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void extractIntentData() {
    }
    
    private final void getArticles() {
    }
    
    private final void setEventListener() {
    }
    
    private final void setHeaderData() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/intellihealth/truemeds/presentation/activity/HealthArticlesActivity$CustomTypefaceSpan;", "Landroid/text/style/TypefaceSpan;", "family", "", "newType", "Landroid/graphics/Typeface;", "(Ljava/lang/String;Landroid/graphics/Typeface;)V", "updateDrawState", "", "ds", "Landroid/text/TextPaint;", "updateMeasureState", "paint", "Companion", "app_prodDebug"})
    public static final class CustomTypefaceSpan extends android.text.style.TypefaceSpan {
        @org.jetbrains.annotations.NotNull()
        private final android.graphics.Typeface newType = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.intellihealth.truemeds.presentation.activity.HealthArticlesActivity.CustomTypefaceSpan.Companion Companion = null;
        
        public CustomTypefaceSpan(@org.jetbrains.annotations.Nullable()
        java.lang.String family, @org.jetbrains.annotations.NotNull()
        android.graphics.Typeface newType) {
            super(null);
        }
        
        @java.lang.Override()
        public void updateDrawState(@org.jetbrains.annotations.NotNull()
        android.text.TextPaint ds) {
        }
        
        @java.lang.Override()
        public void updateMeasureState(@org.jetbrains.annotations.NotNull()
        android.text.TextPaint paint) {
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002\u00a8\u0006\t"}, d2 = {"Lcom/intellihealth/truemeds/presentation/activity/HealthArticlesActivity$CustomTypefaceSpan$Companion;", "", "()V", "applyCustomTypeFace", "", "paint", "Landroid/graphics/Paint;", "tf", "Landroid/graphics/Typeface;", "app_prodDebug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            private final void applyCustomTypeFace(android.graphics.Paint paint, android.graphics.Typeface tf) {
            }
        }
    }
}