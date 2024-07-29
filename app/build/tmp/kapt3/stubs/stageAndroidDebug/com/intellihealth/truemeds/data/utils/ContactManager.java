package com.intellihealth.truemeds.data.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nJ \u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\bJ$\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\nJ*\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\bJ\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\bH\u0007J\u0018\u0010\u0015\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\b\u00a8\u0006\u0017"}, d2 = {"Lcom/intellihealth/truemeds/data/utils/ContactManager;", "", "()V", "addContact", "", "context", "Landroid/content/Context;", "displayName", "", "phoneNumber", "", "addPhoneNumberToContact", "contactId", "", "newPhoneNumber", "addPhoneNumbersToContact", "phoneNumbers", "editContact", "newDisplayName", "getContactIdByName", "contactName", "saveContact", "name", "app_stageAndroidDebug"})
public final class ContactManager {
    @org.jetbrains.annotations.NotNull()
    public static final com.intellihealth.truemeds.data.utils.ContactManager INSTANCE = null;
    
    private ContactManager() {
        super();
    }
    
    public final void addContact(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String displayName, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> phoneNumber) {
    }
    
    public final void addPhoneNumberToContact(@org.jetbrains.annotations.NotNull()
    android.content.Context context, long contactId, @org.jetbrains.annotations.Nullable()
    java.lang.String newPhoneNumber) {
    }
    
    public final void editContact(@org.jetbrains.annotations.NotNull()
    android.content.Context context, long contactId, @org.jetbrains.annotations.Nullable()
    java.lang.String newDisplayName, @org.jetbrains.annotations.Nullable()
    java.lang.String newPhoneNumber) {
    }
    
    @android.annotation.SuppressLint(value = {"Range"})
    public final long getContactIdByName(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String contactName) {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String saveContact(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    public final void addPhoneNumbersToContact(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String contactId, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> phoneNumbers) {
    }
}