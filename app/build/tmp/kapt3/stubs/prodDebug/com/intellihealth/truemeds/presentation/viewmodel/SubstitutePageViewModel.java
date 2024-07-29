package com.intellihealth.truemeds.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005R\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00078F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/intellihealth/truemeds/presentation/viewmodel/SubstitutePageViewModel;", "Lcom/intellihealth/truemeds/presentation/viewmodel/BaseViewModelWithLogin;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "loginUseCase", "Lcom/intellihealth/truemeds/domain/usecase/LoginUseCase;", "(Lcom/intellihealth/truemeds/domain/usecase/LoginUseCase;)V", "eventLoginOpenBottomSheet", "Landroidx/lifecycle/LiveData;", "Lcom/intellihealth/truemeds/presentation/viewmodel/events/Event;", "", "getEventLoginOpenBottomSheet", "()Landroidx/lifecycle/LiveData;", "openLoginBottomSheet", "Landroidx/lifecycle/MutableLiveData;", "app_prodDebug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class SubstitutePageViewModel extends com.intellihealth.truemeds.presentation.viewmodel.BaseViewModelWithLogin implements androidx.lifecycle.DefaultLifecycleObserver {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.LoginUseCase loginUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> openLoginBottomSheet = null;
    
    @javax.inject.Inject()
    public SubstitutePageViewModel(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.LoginUseCase loginUseCase) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> getEventLoginOpenBottomSheet() {
        return null;
    }
}