package com.intellihealth.truemeds.data.model.login


data class TruecallerTokenResponse(
    var access_token: String?,
    var expires_in: Int?,
    var scope: String?,
    var token_type: String?,
    var id_token: String?
)