package com.intellihealth.truemeds.presentation.model

import com.intellihealth.truemeds.domain.enums.LoginStatus

data class ProcessUserLoginResult(var loginStatus: LoginStatus, var message: String = "")