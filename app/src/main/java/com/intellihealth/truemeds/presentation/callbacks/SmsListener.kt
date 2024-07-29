package com.intellihealth.truemeds.presentation.callbacks

interface SmsListener {
    fun messageReceived(messageText: String?)
    fun onSmsTimeOut()
}