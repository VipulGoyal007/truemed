package com.intellihealth.truemeds.presentation.utils

import android.graphics.Rect
import android.util.Log
import android.view.View
import com.google.gson.Gson
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager


fun Any.logD(eventName:String, message: String) {
    try {
        Log.d("ETX_TESTING", "$eventName : $message")
    } catch (e:Exception){
        Log.e("ETX_TESTING", "exception : ${e.message}")
    }
}
fun Any.logD(eventName:String, message: Any) {
    try {
        Log.d("ETX_TESTING", "$eventName : ${Gson().toJson(message)}")
    } catch (e:Exception){
        Log.e("ETX_TESTING", "exception : ${e.message}")
    }
}

fun getVisibleViewIndexOnBasisOfHeight(view: View?, lastVisibleItemPosition: Int): Int {
    if (view == null) return 0
    val globalVisibilityRectangle = Rect()
    view.getGlobalVisibleRect(globalVisibilityRectangle)
    val actualHeight = view.measuredHeight
    val visibleHeight = globalVisibilityRectangle.bottom - globalVisibilityRectangle.top
    return if (visibleHeight > actualHeight / 2) {
        lastVisibleItemPosition + 1
    } else {
        lastVisibleItemPosition - 1
    }
}



fun <T> applyTryCatch(block: () -> T) =
    try {
        block()
    } catch (e: Exception) {
        e.printStackTrace()
    }