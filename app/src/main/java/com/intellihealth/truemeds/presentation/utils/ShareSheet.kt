package com.intellihealth.truemeds.presentation.utils

import android.content.Context
import android.content.Intent

object ShareSheet {

    fun shareText(context: Context, title: String, text: String, ) {
        val shareIntent = Intent(Intent.ACTION_SEND)
        shareIntent.type = "text/plain"
        shareIntent.putExtra(Intent.EXTRA_SUBJECT, title)
        shareIntent.putExtra(Intent.EXTRA_TEXT, text)
        context.startActivity(Intent.createChooser(shareIntent, "Share using"))
    }

}