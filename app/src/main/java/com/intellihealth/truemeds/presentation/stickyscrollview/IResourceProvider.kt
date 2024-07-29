package com.intellihealth.truemeds.presentation.stickyscrollview

import androidx.annotation.StyleableRes

internal interface IResourceProvider {
    fun getResourceId(@StyleableRes styleResId: Int): Int
    fun recycle()
}