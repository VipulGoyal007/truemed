package com.intellihealth.truemeds.data.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u00004\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t\u001a\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u001a\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u001a\u000e\u0010\u0010\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t\u001a\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\"\u0019\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a2\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0003\u0010\u0004\u00a8\u0006\u0014"}, d2 = {"getContactPermissionArray", "", "", "getGetContactPermissionArray", "()[Ljava/lang/String;", "[Ljava/lang/String;", "checkPermissionsForContact", "", "context", "Landroid/content/Context;", "getJsonResponseFromRaw", "Lorg/json/JSONObject;", "response", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "getStringResponseFromRaw", "isNetworkAvailable", "strDateTimeToDate", "Ljava/util/Date;", "strDateTime", "app_prodDebug"})
public final class NetworkUtilKt {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String[] getContactPermissionArray = {"android.permission.WRITE_CONTACTS", "android.permission.READ_CONTACTS"};
    
    public static final boolean isNetworkAvailable(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final org.json.JSONObject getJsonResponseFromRaw(@org.jetbrains.annotations.NotNull()
    retrofit2.Response<okhttp3.ResponseBody> response) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String getStringResponseFromRaw(@org.jetbrains.annotations.NotNull()
    retrofit2.Response<okhttp3.ResponseBody> response) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.util.Date strDateTimeToDate(@org.jetbrains.annotations.Nullable()
    java.lang.String strDateTime) {
        return null;
    }
    
    public static final boolean checkPermissionsForContact(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String[] getGetContactPermissionArray() {
        return null;
    }
}