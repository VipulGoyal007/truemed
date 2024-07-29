package com.intellihealth.truemeds.data.utils

import okhttp3.ResponseBody

data class ResponseData(
    val errorCode : Int,
    val errorBody : ResponseBody,
    val isNetworkError : Boolean
)