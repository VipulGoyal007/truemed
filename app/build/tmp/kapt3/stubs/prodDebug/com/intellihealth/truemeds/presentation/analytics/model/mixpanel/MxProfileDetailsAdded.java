package com.intellihealth.truemeds.presentation.analytics.model.mixpanel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\rJ\u000b\u0010&\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010 J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u000b\u0010,\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003Jn\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010/J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00103\u001a\u00020\nH\u00d6\u0001J\u0006\u00104\u001a\u000205J\t\u00106\u001a\u00020\u0003H\u00d6\u0001R\"\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R \u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010#\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R \u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0014\"\u0004\b%\u0010\u0016\u00a8\u00067"}, d2 = {"Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxProfileDetailsAdded;", "", "clickedOnPage", "", "firstNameAdded", "lastNameAdded", "mobileNumber", "", "emailAdded", "ageAdded", "", "genderAdded", "whId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getAgeAdded", "()Ljava/lang/Integer;", "setAgeAdded", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getClickedOnPage", "()Ljava/lang/String;", "setClickedOnPage", "(Ljava/lang/String;)V", "getEmailAdded", "setEmailAdded", "getFirstNameAdded", "setFirstNameAdded", "getGenderAdded", "setGenderAdded", "getLastNameAdded", "setLastNameAdded", "getMobileNumber", "()Ljava/lang/Long;", "setMobileNumber", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getWhId", "setWhId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxProfileDetailsAdded;", "equals", "", "other", "hashCode", "toCleverTap", "Lcom/intellihealth/truemeds/presentation/analytics/model/clevertap/CtPatientAdded;", "toString", "app_prodDebug"})
public final class MxProfileDetailsAdded {
    @com.google.gson.annotations.SerializedName(value = "clicked_on_page")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String clickedOnPage;
    @com.google.gson.annotations.SerializedName(value = "first_name_added")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String firstNameAdded;
    @com.google.gson.annotations.SerializedName(value = "last_name_added")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String lastNameAdded;
    @com.google.gson.annotations.SerializedName(value = "mobile_number")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long mobileNumber;
    @com.google.gson.annotations.SerializedName(value = "email_added")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String emailAdded;
    @com.google.gson.annotations.SerializedName(value = "age_added")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer ageAdded;
    @com.google.gson.annotations.SerializedName(value = "gender_added")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String genderAdded;
    @com.google.gson.annotations.SerializedName(value = "wh_id")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String whId;
    
    public MxProfileDetailsAdded(@org.jetbrains.annotations.Nullable()
    java.lang.String clickedOnPage, @org.jetbrains.annotations.Nullable()
    java.lang.String firstNameAdded, @org.jetbrains.annotations.Nullable()
    java.lang.String lastNameAdded, @org.jetbrains.annotations.Nullable()
    java.lang.Long mobileNumber, @org.jetbrains.annotations.Nullable()
    java.lang.String emailAdded, @org.jetbrains.annotations.Nullable()
    java.lang.Integer ageAdded, @org.jetbrains.annotations.Nullable()
    java.lang.String genderAdded, @org.jetbrains.annotations.Nullable()
    java.lang.String whId) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getClickedOnPage() {
        return null;
    }
    
    public final void setClickedOnPage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFirstNameAdded() {
        return null;
    }
    
    public final void setFirstNameAdded(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLastNameAdded() {
        return null;
    }
    
    public final void setLastNameAdded(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getMobileNumber() {
        return null;
    }
    
    public final void setMobileNumber(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEmailAdded() {
        return null;
    }
    
    public final void setEmailAdded(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getAgeAdded() {
        return null;
    }
    
    public final void setAgeAdded(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGenderAdded() {
        return null;
    }
    
    public final void setGenderAdded(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getWhId() {
        return null;
    }
    
    public final void setWhId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.analytics.model.clevertap.CtPatientAdded toCleverTap() {
        return null;
    }
    
    public MxProfileDetailsAdded() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxProfileDetailsAdded copy(@org.jetbrains.annotations.Nullable()
    java.lang.String clickedOnPage, @org.jetbrains.annotations.Nullable()
    java.lang.String firstNameAdded, @org.jetbrains.annotations.Nullable()
    java.lang.String lastNameAdded, @org.jetbrains.annotations.Nullable()
    java.lang.Long mobileNumber, @org.jetbrains.annotations.Nullable()
    java.lang.String emailAdded, @org.jetbrains.annotations.Nullable()
    java.lang.Integer ageAdded, @org.jetbrains.annotations.Nullable()
    java.lang.String genderAdded, @org.jetbrains.annotations.Nullable()
    java.lang.String whId) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}