package com.intellihealth.truemeds.presentation.activity;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u0012\u0010\u0015\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\b\u0010\u0018\u001a\u00020\u0013H\u0014J\u0018\u0010\u0019\u001a\u00020\u00132\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0002J\b\u0010\u001a\u001a\u00020\u0013H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001b"}, d2 = {"Lcom/intellihealth/truemeds/presentation/activity/FaqViewAllActivity;", "Lcom/intellihealth/truemeds/presentation/activity/BaseActivity;", "()V", "binding", "Lcom/intellihealth/truemeds/databinding/ActivityFaqViewAllBinding;", "getBinding", "()Lcom/intellihealth/truemeds/databinding/ActivityFaqViewAllBinding;", "binding$delegate", "Lcom/intellihealth/truemeds/presentation/utils/ActivityViewBindingDelegate;", "faqList", "", "Lcom/intellihealth/truemeds/data/model/helpfaqtnc/FaqCategoryResponse$Payload;", "listDataHeader", "", "getListDataHeader", "()Ljava/util/List;", "setListDataHeader", "(Ljava/util/List;)V", "addClickListener", "", "extractIntentData", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "setFaqList", "setMobileSectionHeander", "app_stageAndroidDebug"})
public final class FaqViewAllActivity extends com.intellihealth.truemeds.presentation.activity.BaseActivity {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.presentation.utils.ActivityViewBindingDelegate binding$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.intellihealth.truemeds.data.model.helpfaqtnc.FaqCategoryResponse.Payload> faqList;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.String> listDataHeader;
    
    public FaqViewAllActivity() {
        super();
    }
    
    private final com.intellihealth.truemeds.databinding.ActivityFaqViewAllBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getListDataHeader() {
        return null;
    }
    
    public final void setListDataHeader(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void extractIntentData() {
    }
    
    private final void addClickListener() {
    }
    
    private final void setFaqList(java.util.List<com.intellihealth.truemeds.data.model.helpfaqtnc.FaqCategoryResponse.Payload> faqList) {
    }
    
    private final void setMobileSectionHeander() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
}