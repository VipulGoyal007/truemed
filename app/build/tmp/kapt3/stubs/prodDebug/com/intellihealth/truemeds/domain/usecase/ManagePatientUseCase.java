package com.intellihealth.truemeds.domain.usecase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J \u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0086@\u00a2\u0006\u0002\u0010\rJ \u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\fH\u0086@\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/intellihealth/truemeds/domain/usecase/ManagePatientUseCase;", "", "localDbUseCase", "Lcom/intellihealth/truemeds/domain/usecase/LocalDbUseCase;", "userDataRepository", "Lcom/intellihealth/truemeds/domain/repository/UserDataRepository;", "(Lcom/intellihealth/truemeds/domain/usecase/LocalDbUseCase;Lcom/intellihealth/truemeds/domain/repository/UserDataRepository;)V", "deletePatient", "Lcom/intellihealth/truemeds/data/model/home/ApiCoreResponse;", "patientId", "", "customerId", "", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllPatients", "Lcom/intellihealth/truemeds/data/model/user/GetAllPatientResponse;", "showMyself", "", "(ZJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_prodDebug"})
public final class ManagePatientUseCase {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.LocalDbUseCase localDbUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.repository.UserDataRepository userDataRepository = null;
    
    @javax.inject.Inject()
    public ManagePatientUseCase(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.LocalDbUseCase localDbUseCase, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.repository.UserDataRepository userDataRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllPatients(boolean showMyself, long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.user.GetAllPatientResponse> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deletePatient(@org.jetbrains.annotations.NotNull()
    java.lang.String patientId, long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.home.ApiCoreResponse> $completion) {
        return null;
    }
}