package com.intellihealth.truemeds.data.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t\u00a8\u0006\n"}, d2 = {"Lcom/intellihealth/truemeds/data/utils/Resource;", "T", "", "()V", "Failure", "Loading", "Success", "Lcom/intellihealth/truemeds/data/utils/Resource$Failure;", "Lcom/intellihealth/truemeds/data/utils/Resource$Loading;", "Lcom/intellihealth/truemeds/data/utils/Resource$Success;", "app_stageAndroidDebug"})
public abstract class Resource<T extends java.lang.Object> {
    
    private Resource() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0004H\u00c6\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bH\u00c6\u0003J0\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00c6\u0001\u00a2\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u000f\u00a8\u0006\u001b"}, d2 = {"Lcom/intellihealth/truemeds/data/utils/Resource$Failure;", "Lcom/intellihealth/truemeds/data/utils/Resource;", "", "isNetworkError", "", "errorCode", "", "errorBody", "Lokhttp3/ResponseBody;", "(ZLjava/lang/Integer;Lokhttp3/ResponseBody;)V", "getErrorBody", "()Lokhttp3/ResponseBody;", "getErrorCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Z", "component1", "component2", "component3", "copy", "(ZLjava/lang/Integer;Lokhttp3/ResponseBody;)Lcom/intellihealth/truemeds/data/utils/Resource$Failure;", "equals", "other", "", "hashCode", "toString", "", "app_stageAndroidDebug"})
    public static final class Failure extends com.intellihealth.truemeds.data.utils.Resource {
        private final boolean isNetworkError = false;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer errorCode = null;
        @org.jetbrains.annotations.Nullable()
        private final okhttp3.ResponseBody errorBody = null;
        
        public Failure(boolean isNetworkError, @org.jetbrains.annotations.Nullable()
        java.lang.Integer errorCode, @org.jetbrains.annotations.Nullable()
        okhttp3.ResponseBody errorBody) {
        }
        
        public final boolean isNetworkError() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getErrorCode() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final okhttp3.ResponseBody getErrorBody() {
            return null;
        }
        
        public final boolean component1() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final okhttp3.ResponseBody component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.intellihealth.truemeds.data.utils.Resource.Failure copy(boolean isNetworkError, @org.jetbrains.annotations.Nullable()
        java.lang.Integer errorCode, @org.jetbrains.annotations.Nullable()
        okhttp3.ResponseBody errorBody) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/intellihealth/truemeds/data/utils/Resource$Loading;", "Lcom/intellihealth/truemeds/data/utils/Resource;", "", "()V", "app_stageAndroidDebug"})
    public static final class Loading extends com.intellihealth.truemeds.data.utils.Resource {
        @org.jetbrains.annotations.NotNull()
        public static final com.intellihealth.truemeds.data.utils.Resource.Loading INSTANCE = null;
        
        private Loading() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00018\u0001H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0006J \u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0001H\u00c6\u0001\u00a2\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0015\u0010\u0003\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0013"}, d2 = {"Lcom/intellihealth/truemeds/data/utils/Resource$Success;", "T", "Lcom/intellihealth/truemeds/data/utils/Resource;", "value", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/intellihealth/truemeds/data/utils/Resource$Success;", "equals", "", "other", "", "hashCode", "", "toString", "", "app_stageAndroidDebug"})
    public static final class Success<T extends java.lang.Object> extends com.intellihealth.truemeds.data.utils.Resource<T> {
        @org.jetbrains.annotations.Nullable()
        private final T value = null;
        
        public Success(@org.jetbrains.annotations.Nullable()
        T value) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final T getValue() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final T component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.intellihealth.truemeds.data.utils.Resource.Success<T> copy(@org.jetbrains.annotations.Nullable()
        T value) {
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
}