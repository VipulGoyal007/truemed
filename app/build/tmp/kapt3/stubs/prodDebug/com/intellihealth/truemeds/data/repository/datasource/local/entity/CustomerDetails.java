package com.intellihealth.truemeds.data.repository.datasource.local.entity;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J\t\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003Jx\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\'J\t\u0010(\u001a\u00020\fH\u00d6\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u00d6\u0003J\t\u0010-\u001a\u00020\fH\u00d6\u0001J\t\u0010.\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\fH\u00d6\u0001R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0010\u00a8\u00064"}, d2 = {"Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/CustomerDetails;", "Landroid/os/Parcelable;", "customerId", "", "mobileNo", "", "emailAddress", "profileImageUrl", "customerName", "genderName", "age", "languageId", "", "customerLastName", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getAge", "()Ljava/lang/String;", "getCustomerId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCustomerLastName", "getCustomerName", "getEmailAddress", "getGenderName", "getLanguageId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMobileNo", "getProfileImageUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/CustomerDetails;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_prodDebug"})
@kotlinx.parcelize.Parcelize()
@androidx.room.Entity(tableName = "customer_details")
public final class CustomerDetails implements android.os.Parcelable {
    @androidx.room.PrimaryKey()
    @androidx.room.ColumnInfo(name = "customerId")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long customerId = null;
    @androidx.room.ColumnInfo(name = "mobileNo")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String mobileNo = null;
    @androidx.room.ColumnInfo(name = "emailAddress")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String emailAddress = null;
    @androidx.room.ColumnInfo(name = "profileImageUrl")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String profileImageUrl = null;
    @androidx.room.ColumnInfo(name = "customerName")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String customerName = null;
    @androidx.room.ColumnInfo(name = "genderName")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String genderName = null;
    @androidx.room.ColumnInfo(name = "age")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String age = null;
    @androidx.room.ColumnInfo(name = "languageId")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer languageId = null;
    @androidx.room.ColumnInfo(name = "customerLastName")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String customerLastName = null;
    
    public CustomerDetails(@org.jetbrains.annotations.Nullable()
    java.lang.Long customerId, @org.jetbrains.annotations.NotNull()
    java.lang.String mobileNo, @org.jetbrains.annotations.Nullable()
    java.lang.String emailAddress, @org.jetbrains.annotations.Nullable()
    java.lang.String profileImageUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String customerName, @org.jetbrains.annotations.Nullable()
    java.lang.String genderName, @org.jetbrains.annotations.Nullable()
    java.lang.String age, @org.jetbrains.annotations.Nullable()
    java.lang.Integer languageId, @org.jetbrains.annotations.Nullable()
    java.lang.String customerLastName) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getCustomerId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMobileNo() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEmailAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getProfileImageUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCustomerName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGenderName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAge() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getLanguageId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCustomerLastName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.repository.datasource.local.entity.CustomerDetails copy(@org.jetbrains.annotations.Nullable()
    java.lang.Long customerId, @org.jetbrains.annotations.NotNull()
    java.lang.String mobileNo, @org.jetbrains.annotations.Nullable()
    java.lang.String emailAddress, @org.jetbrains.annotations.Nullable()
    java.lang.String profileImageUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String customerName, @org.jetbrains.annotations.Nullable()
    java.lang.String genderName, @org.jetbrains.annotations.Nullable()
    java.lang.String age, @org.jetbrains.annotations.Nullable()
    java.lang.Integer languageId, @org.jetbrains.annotations.Nullable()
    java.lang.String customerLastName) {
        return null;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
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
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
}