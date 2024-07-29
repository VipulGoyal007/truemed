package com.intellihealth.truemeds.presentation.utils

import android.view.View

/**
 * This class allows a single click and prevents multiple clicks on
 * the same button in rapid succession. Setting unclickable is not enough
 * because click events may still be queued up.
 *
 * Override onSingleClick() to handle single clicks.
 */
abstract class OnSingleClickListener : View.OnClickListener {

    companion object {
        public const val MIN_DELAY_MS: Long = 1000L
    }

    private var mLastClickTime = 0L

    abstract fun onSingleClick(v: View)

    override fun onClick(v: View) {
        val lastClickTime: Long = mLastClickTime
        val now = System.currentTimeMillis()
        mLastClickTime = now
        if (now - lastClickTime < MIN_DELAY_MS) {

        } else {
            // Register the click
            onSingleClick(v)
        }
    }
}

fun View.setOnSingleClickListener(callback: (View) -> Unit) {
    setOnClickListener(object: OnSingleClickListener() {
        override fun onSingleClick(v: View) {
            callback.invoke(v)
        }
    })
}