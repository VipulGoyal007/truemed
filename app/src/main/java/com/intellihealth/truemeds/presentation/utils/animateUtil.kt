package com.intellihealth.truemeds.presentation.utils

import android.animation.ObjectAnimator
import android.view.View
import android.view.animation.AccelerateDecelerateInterpolator
import androidx.core.animation.doOnEnd
import androidx.core.animation.doOnStart

fun View.animateFling() {
    animateFling(700, 50, object : AnimationCallback {
        override fun doOnStart() {
        }

        override fun doOnEnd() {
        }
    })
}

fun View.animateFling(vDuration: Long, vStartDelay: Long, callback: AnimationCallback) {

    val animator = ObjectAnimator.ofFloat(this, "translationX", -2000f)
    animator.apply {
        duration = vDuration
        startDelay = vStartDelay
        addListener(doOnStart {
            callback.doOnStart()
        })
        addListener(doOnEnd {
            callback.doOnEnd()
        })
        AccelerateDecelerateInterpolator()
        start()
    }
}

interface AnimationCallback {
    fun doOnStart()
    fun doOnEnd()
}