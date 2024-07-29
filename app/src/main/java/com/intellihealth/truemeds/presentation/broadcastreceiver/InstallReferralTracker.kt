package com.intellihealth.truemeds.presentation.broadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager

class InstallReferralTracker : BroadcastReceiver() {
    private var referrer = ""
    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action == "com.intellihealth.truemeds.INSTALL_REFERRER") {
            val extras: Bundle? = intent.extras
            if (extras != null) {
                referrer = extras.getString("referrer").toString()
            }
            SharedPrefManager.getInstance().referrerData = referrer
        }
    }
}