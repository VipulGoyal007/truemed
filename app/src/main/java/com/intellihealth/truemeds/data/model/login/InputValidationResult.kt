package com.intellihealth.truemeds.data.model.login

import com.intellihealth.truemeds.data.utils.ERRORS


data class InputValidationResult(
    var isValid: Boolean = true,
    var errorMessage: ERRORS
)