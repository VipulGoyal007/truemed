package com.intellihealth.truemeds.presentation.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0013J\u000e\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0004J\u000e\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0013J\u000e\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0013J\u000e\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0013J\u000e\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0013J\u000e\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u0013J\u000e\u0010 \u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u0013J\u000e\u0010!\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\"\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/intellihealth/truemeds/presentation/utils/Validator;", "", "()V", "ADDRESS_LENGTH", "", "ADDRESS_REGEX", "Lkotlin/text/Regex;", "ALLOWED_CHARACTERS_REGEX", "CITY_LENGTH", "EMAIL_REGEX", "MAX_AGE", "MAX_AGE_MYSELF", "MIN_AGE", "MIN_AGE_MYSELF", "OTHER_Regex", "PIN_CODE", "isPinCodeEntered", "", "pinCode", "", "isValidAddress", "address", "isValidAddressType", "type", "isValidAge", "ageText", "isValidAgeMySelf", "isValidCityState", "isValidEmail", "email", "isValidLastName", "name", "isValidName", "isValidPinCode", "otherText", "app_prodDebug"})
public final class Validator {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.text.Regex ALLOWED_CHARACTERS_REGEX = null;
    private final int MIN_AGE = 1;
    private final int MAX_AGE = 100;
    private final int MIN_AGE_MYSELF = 18;
    private final int MAX_AGE_MYSELF = 100;
    private final int PIN_CODE = 6;
    private final int ADDRESS_LENGTH = 4;
    private final int CITY_LENGTH = 2;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.text.Regex EMAIL_REGEX = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.text.Regex ADDRESS_REGEX = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.text.Regex OTHER_Regex = null;
    
    public Validator() {
        super();
    }
    
    public final boolean isValidName(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return false;
    }
    
    public final boolean isValidLastName(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return false;
    }
    
    public final boolean isValidAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
        return false;
    }
    
    public final boolean isValidCityState(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
        return false;
    }
    
    public final boolean isValidPinCode(@org.jetbrains.annotations.NotNull()
    java.lang.String pinCode) {
        return false;
    }
    
    public final boolean isPinCodeEntered(@org.jetbrains.annotations.NotNull()
    java.lang.String pinCode) {
        return false;
    }
    
    public final boolean isValidAge(@org.jetbrains.annotations.NotNull()
    java.lang.String ageText) {
        return false;
    }
    
    public final boolean otherText(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return false;
    }
    
    public final boolean isValidAgeMySelf(@org.jetbrains.annotations.NotNull()
    java.lang.String ageText) {
        return false;
    }
    
    public final boolean isValidEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
        return false;
    }
    
    public final boolean isValidAddressType(int type) {
        return false;
    }
}