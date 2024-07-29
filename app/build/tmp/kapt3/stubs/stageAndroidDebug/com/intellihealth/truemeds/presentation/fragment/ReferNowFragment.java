package com.intellihealth.truemeds.presentation.fragment;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 42\u00020\u0001:\u00014B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u001e\u001a\u00020\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!H\u0002J\u0010\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020\u001fH\u0002J\u0012\u0010\'\u001a\u00020\u001f2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u001a\u0010*\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020,2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010-\u001a\u00020\u001fH\u0002J\b\u0010.\u001a\u00020\u001fH\u0002J\u0018\u0010/\u001a\u00020\u001f2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0002R#\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001b\u00a8\u00065"}, d2 = {"Lcom/intellihealth/truemeds/presentation/fragment/ReferNowFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/intellihealth/truemeds/databinding/FragmentReferNowBinding;", "kotlin.jvm.PlatformType", "getBinding", "()Lcom/intellihealth/truemeds/databinding/FragmentReferNowBinding;", "binding$delegate", "Lcom/intellihealth/truemeds/presentation/utils/FragmentViewBindingDelegate;", "firebaseEventUseCase", "Lcom/intellihealth/truemeds/domain/usecase/analytics/FirebaseEventUseCase;", "getFirebaseEventUseCase", "()Lcom/intellihealth/truemeds/domain/usecase/analytics/FirebaseEventUseCase;", "setFirebaseEventUseCase", "(Lcom/intellihealth/truemeds/domain/usecase/analytics/FirebaseEventUseCase;)V", "handler", "Landroid/os/Handler;", "headerList", "Ljava/util/ArrayList;", "Lcom/intellihealth/salt/models/HeaderModel;", "Lkotlin/collections/ArrayList;", "referCallback", "Lcom/intellihealth/truemeds/presentation/callbacks/ReferCallback;", "viewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/ReferNEarnViewModel;", "getViewModel", "()Lcom/intellihealth/truemeds/presentation/viewmodel/ReferNEarnViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "addFaq", "", "faqlist", "", "Lcom/intellihealth/truemeds/data/model/helpfaqtnc/FaqCategoryResponse$Payload;", "dismissPopup", "dialog", "Lcom/intellihealth/truemeds/presentation/dialog/PopUpDialog;", "initViewModelApi", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "setAndObserveData", "setUpListener", "updateErrorState", "msg", "", "stateError", "Lcom/intellihealth/salt/constants/InputFieldConstants;", "Companion", "app_stageAndroidDebug"})
public final class ReferNowFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.intellihealth.salt.models.HeaderModel> headerList = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.presentation.utils.FragmentViewBindingDelegate binding$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final android.os.Handler handler = null;
    private com.intellihealth.truemeds.presentation.callbacks.ReferCallback referCallback;
    @javax.inject.Inject()
    public com.intellihealth.truemeds.domain.usecase.analytics.FirebaseEventUseCase firebaseEventUseCase;
    @org.jetbrains.annotations.NotNull()
    public static final com.intellihealth.truemeds.presentation.fragment.ReferNowFragment.Companion Companion = null;
    
    public ReferNowFragment() {
        super();
    }
    
    private final com.intellihealth.truemeds.databinding.FragmentReferNowBinding getBinding() {
        return null;
    }
    
    private final com.intellihealth.truemeds.presentation.viewmodel.ReferNEarnViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.domain.usecase.analytics.FirebaseEventUseCase getFirebaseEventUseCase() {
        return null;
    }
    
    public final void setFirebaseEventUseCase(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.analytics.FirebaseEventUseCase p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initViewModelApi() {
    }
    
    private final void addFaq(java.util.List<com.intellihealth.truemeds.data.model.helpfaqtnc.FaqCategoryResponse.Payload> faqlist) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUpListener() {
    }
    
    private final void updateErrorState(java.lang.String msg, com.intellihealth.salt.constants.InputFieldConstants stateError) {
    }
    
    private final void setAndObserveData() {
    }
    
    private final void dismissPopup(com.intellihealth.truemeds.presentation.dialog.PopUpDialog dialog) {
    }
    
    @kotlin.jvm.JvmStatic()
    @org.jetbrains.annotations.NotNull()
    public static final com.intellihealth.truemeds.presentation.fragment.ReferNowFragment newInstance(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.callbacks.ReferCallback referCallback) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/intellihealth/truemeds/presentation/fragment/ReferNowFragment$Companion;", "", "()V", "newInstance", "Lcom/intellihealth/truemeds/presentation/fragment/ReferNowFragment;", "referCallback", "Lcom/intellihealth/truemeds/presentation/callbacks/ReferCallback;", "app_stageAndroidDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.jvm.JvmStatic()
        @org.jetbrains.annotations.NotNull()
        public final com.intellihealth.truemeds.presentation.fragment.ReferNowFragment newInstance(@org.jetbrains.annotations.NotNull()
        com.intellihealth.truemeds.presentation.callbacks.ReferCallback referCallback) {
            return null;
        }
    }
}