package com.intellihealth.truemeds.presentation.utils

class Validator {
    private val ALLOWED_CHARACTERS_REGEX = Regex("^[a-zA-Z\\- ]+\$")
    private val MIN_AGE = 1
    private val MAX_AGE = 100
    private val MIN_AGE_MYSELF = 18
    private val MAX_AGE_MYSELF = 100
    private val PIN_CODE = 6
    private val ADDRESS_LENGTH = 4
    private val CITY_LENGTH = 2
//    private val EMAIL_REGEX = Regex("[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")
    private val EMAIL_REGEX = Regex("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9]+\\.)+[a-zA-Z]{2,7}$")

    private val ADDRESS_REGEX = Regex("^[a-zA-Z0-9-/.,()\\s*]{1,255}$")
    private val OTHER_Regex=  Regex("^[a-zA-Z 0-9 _/-]+\$")

    fun isValidName(name: String): Boolean {
        return name.trim()
            .isNotEmpty() && ALLOWED_CHARACTERS_REGEX.matches(name) && name.trim().length > 1
    }

    fun isValidLastName(name: String): Boolean {
        return ALLOWED_CHARACTERS_REGEX.matches(name.trim())
    }

    fun isValidAddress(address: String): Boolean {
        return address.trim().isNotEmpty() && address.length > ADDRESS_LENGTH && address.matches(
            ADDRESS_REGEX
        )
    }

    fun isValidCityState(address: String): Boolean {
        return address.trim().isNotEmpty() && address.length > CITY_LENGTH && address.matches(
            ADDRESS_REGEX
        )
    }

    fun isValidPinCode(pinCode: String): Boolean {
        return pinCode.length == PIN_CODE
    }

    fun isPinCodeEntered(pinCode: String): Boolean {
        return pinCode.isNotEmpty()
    }

    fun isValidAge(ageText: String): Boolean {
        return try {
            val age = ageText.toInt()
            age in MIN_AGE..MAX_AGE
        } catch (e: NumberFormatException) {
            false
        }
    }
    fun otherText(name: String): Boolean {
        return name.trim()
            .isNotEmpty() && OTHER_Regex.matches(name)
    }

    fun isValidAgeMySelf(ageText: String): Boolean {
        return try {
            val age = ageText.toInt()
            age in MIN_AGE_MYSELF..MAX_AGE_MYSELF
        } catch (e: NumberFormatException) {
            false
        }
    }

    fun isValidEmail(email: String): Boolean {
        return email.matches(EMAIL_REGEX)
    }

    fun isValidAddressType(type: Int): Boolean {
        return type == 0
    }

}
