package com.intellihealth.truemeds.domain.enums;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b\u00a8\u0006\f"}, d2 = {"Lcom/intellihealth/truemeds/domain/enums/NetworkResponseType;", "", "code", "", "(Ljava/lang/String;II)V", "getCode", "()I", "SUCCESS", "FAILURE", "EXCEPTION", "UNEXPECTED", "BADREQUEST", "app_prodDebug"})
public enum NetworkResponseType {
    /*public static final*/ SUCCESS /* = new SUCCESS(0) */,
    /*public static final*/ FAILURE /* = new FAILURE(0) */,
    /*public static final*/ EXCEPTION /* = new EXCEPTION(0) */,
    /*public static final*/ UNEXPECTED /* = new UNEXPECTED(0) */,
    /*public static final*/ BADREQUEST /* = new BADREQUEST(0) */;
    private final int code = 0;
    
    NetworkResponseType(int code) {
    }
    
    public final int getCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<com.intellihealth.truemeds.domain.enums.NetworkResponseType> getEntries() {
        return null;
    }
}