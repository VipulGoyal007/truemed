package com.intellihealth.truemeds.data.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005\u00a2\u0006\u0002\u0010\u0002J1\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\u0010\t\u001a\f\u0012\u0006\b\u0001\u0012\u00020\b\u0018\u00010\nH\u0016\u00a2\u0006\u0002\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001c\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\bH\u0016JO\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0005\u001a\u00020\u00062\u0010\u0010\u0017\u001a\f\u0012\u0006\b\u0001\u0012\u00020\b\u0018\u00010\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\u0010\t\u001a\f\u0012\u0006\b\u0001\u0012\u00020\b\u0018\u00010\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\bH\u0016\u00a2\u0006\u0002\u0010\u0019J;\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\u0010\t\u001a\f\u0012\u0006\b\u0001\u0012\u00020\b\u0018\u00010\nH\u0016\u00a2\u0006\u0002\u0010\u001b\u00a8\u0006\u001d"}, d2 = {"Lcom/intellihealth/truemeds/data/utils/MyFileContentProvider;", "Landroid/content/ContentProvider;", "()V", "delete", "", "uri", "Landroid/net/Uri;", "selection", "", "selectionArgs", "", "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "getType", "insert", "values", "Landroid/content/ContentValues;", "onCreate", "", "openFile", "Landroid/os/ParcelFileDescriptor;", "mode", "query", "Landroid/database/Cursor;", "projection", "sortOrder", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "update", "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "Companion", "app_stageAndroidDebug"})
public final class MyFileContentProvider extends android.content.ContentProvider {
    @org.jetbrains.annotations.NotNull()
    private static android.net.Uri CONTENT_URI;
    @org.jetbrains.annotations.NotNull()
    private static java.util.HashMap<java.lang.String, java.lang.String> MIME_TYPES;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String photoFileName = "photo.jpg";
    @org.jetbrains.annotations.NotNull()
    public static final com.intellihealth.truemeds.data.utils.MyFileContentProvider.Companion Companion = null;
    
    public MyFileContentProvider() {
        super();
    }
    
    @java.lang.Override()
    public boolean onCreate() {
        return false;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public android.database.Cursor query(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri, @org.jetbrains.annotations.Nullable()
    java.lang.String[] projection, @org.jetbrains.annotations.Nullable()
    java.lang.String selection, @org.jetbrains.annotations.Nullable()
    java.lang.String[] selectionArgs, @org.jetbrains.annotations.Nullable()
    java.lang.String sortOrder) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getType(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public android.os.ParcelFileDescriptor openFile(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri, @org.jetbrains.annotations.NotNull()
    java.lang.String mode) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public android.net.Uri insert(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri, @org.jetbrains.annotations.Nullable()
    android.content.ContentValues values) {
        return null;
    }
    
    @java.lang.Override()
    public int delete(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri, @org.jetbrains.annotations.Nullable()
    java.lang.String selection, @org.jetbrains.annotations.Nullable()
    java.lang.String[] selectionArgs) {
        return 0;
    }
    
    @java.lang.Override()
    public int update(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri, @org.jetbrains.annotations.Nullable()
    android.content.ContentValues values, @org.jetbrains.annotations.Nullable()
    java.lang.String selection, @org.jetbrains.annotations.Nullable()
    java.lang.String[] selectionArgs) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u000bX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/intellihealth/truemeds/data/utils/MyFileContentProvider$Companion;", "", "()V", "CONTENT_URI", "Landroid/net/Uri;", "getCONTENT_URI", "()Landroid/net/Uri;", "setCONTENT_URI", "(Landroid/net/Uri;)V", "MIME_TYPES", "Ljava/util/HashMap;", "", "getMIME_TYPES", "()Ljava/util/HashMap;", "setMIME_TYPES", "(Ljava/util/HashMap;)V", "photoFileName", "app_stageAndroidDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.net.Uri getCONTENT_URI() {
            return null;
        }
        
        public final void setCONTENT_URI(@org.jetbrains.annotations.NotNull()
        android.net.Uri p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.HashMap<java.lang.String, java.lang.String> getMIME_TYPES() {
            return null;
        }
        
        public final void setMIME_TYPES(@org.jetbrains.annotations.NotNull()
        java.util.HashMap<java.lang.String, java.lang.String> p0) {
        }
    }
}