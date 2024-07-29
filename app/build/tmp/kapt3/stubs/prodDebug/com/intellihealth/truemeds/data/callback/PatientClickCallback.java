package com.intellihealth.truemeds.data.callback;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/intellihealth/truemeds/data/callback/PatientClickCallback;", "", "editClick", "", "patient", "Lcom/intellihealth/truemeds/data/model/user/GetAllPatientResponse$Patient;", "app_prodDebug"})
public abstract interface PatientClickCallback {
    
    public abstract void editClick(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.user.GetAllPatientResponse.Patient patient);
}