package com.intellihealth.truemeds.data.model.errormessage

import com.intellihealth.salt.constants.InputFieldConstants

data class ErrorMessageData(
    var message: String ?= "",
    var errorStatus : InputFieldConstants = InputFieldConstants.STATE_DEFAULT
    )
