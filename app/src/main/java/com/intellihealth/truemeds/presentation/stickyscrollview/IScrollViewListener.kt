package com.intellihealth.truemeds.presentation.stickyscrollview

interface IScrollViewListener {
    fun onScrollChanged(l: Int, t: Int, oldl: Int, oldt: Int){}
    fun onScrollStopped(isStopped: Boolean){}
}