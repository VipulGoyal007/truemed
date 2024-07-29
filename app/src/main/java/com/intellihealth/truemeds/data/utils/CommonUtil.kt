package com.intellihealth.truemeds.data.utils

import android.app.Activity
import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.graphics.Outline
import android.util.Log
import android.view.View
import android.view.ViewOutlineProvider
import android.view.inputmethod.InputMethodManager
import androidx.activity.result.ActivityResult
import androidx.activity.result.ActivityResultLauncher
import com.google.android.material.bottomnavigation.BottomNavigationView
import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.util.Locale


fun removeExtraZeros(value: Double): Double {
    val symbols = DecimalFormatSymbols(Locale.US)
    return DecimalFormat("##.##", symbols).format(value).toDouble()
}
fun isSingleClick(mLastClickTime:Long): Pair<Boolean,Long> {
    val now = System.currentTimeMillis()
    return Pair(now - mLastClickTime >= 1000L,now)
}

fun removeExtraZerosWithValidation(value: Double): String {

    val symbols = DecimalFormatSymbols(Locale.US)
    var tempData=DecimalFormat("##.##", symbols).format(value).toDouble().toString()

    val separated: List<String> =  tempData.split(".")
    val listItem1=separated[0] // this will contain "before decimal value"

    val listItem2=separated[1] // this will contain "After decimal value"

    if(!listItem2.isNullOrEmpty() && listItem2.trim().toInt()>0)
        return tempData // return full decimal value
    else
        return listItem1 //return before decimal value


}

fun hasNumber(input: String): Boolean {
    val regex = "\\d+".toRegex()
    return regex.containsMatchIn(input)
}

fun hideKeyboard(activity: Activity) {

    val imm = activity.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
    //Find the currently focused view, so we can grab the correct window token from it.
    //Find the currently focused view, so we can grab the correct window token from it.
    var view = activity.currentFocus
    //If no view currently has focus, create a new one, just so we can grab a window token from it
    //If no view currently has focus, create a new one, just so we can grab a window token from it
    if (view == null) {
        view = View(activity)
    }
    imm.hideSoftInputFromWindow(view.windowToken, 0)


}

private fun getNumberFormat(): DecimalFormat {
    val symbols = DecimalFormatSymbols(Locale.US)
    return DecimalFormat("#0.00", symbols)
}

fun progressStringToLimit(inputString: String, limit: Int): String {
    if (inputString.length <= limit) {
        return inputString
    }

    val keepCount = limit - 3

    val progressedString = inputString.substring(0, keepCount) + "..."

    return progressedString
}

fun asciiWordSum(str: String?): Long {
    if (str == null || str.isEmpty()) return 0

    // Counting the number of words in the input sentence
    var ctr = 0
    for (i in 0 until str.length) if (str[i] == ' ') ctr++
    val sumArr = LongArray(ctr + 1)
    val l = str.length
    var pos = 0
    var sum: Long = 0
    var bigSum: Long = 0
    for (i in 0 until l) {

        // Separate each word by
        // a space and store values
        // corresponding to each word
        if (str[i] == ' ') {
            bigSum += sum
            sumArr[pos++] = sum
            sum = 0
        } else  // Implicit type casting
            sum += str[i].code.toLong()
    }

    // Storing the sum of last word
    sumArr[pos] = sum
    bigSum += sum
    return bigSum
}

fun getClipboardText(context:Context): String? {
    val clipboard = context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
    if (clipboard.hasPrimaryClip()) {
        val item: ClipData.Item? = clipboard.primaryClip?.getItemAt(0)
        return item?.text?.toString()
    }
    return null
}

fun clearClipboard(context:Context) {
    val clipboardManager = context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
    clipboardManager.setPrimaryClip(ClipData.newPlainText(null, ""))
}
fun applyRegex(number: String): String? {
    if(number.isNullOrEmpty()) return null
    // Regular expression to match parentheses, hyphens, and whitespace
    val regex = Regex("[()\\-\\s]")
    // Replace the matched characters with an empty string
    val formattedNumber= number.replace(regex, "")
    return when {
        formattedNumber.startsWith("0") -> formattedNumber.substring(1)
        formattedNumber.startsWith("+91") ->  formattedNumber.replace("+91","")
        else -> formattedNumber
    }
}

fun Int.dpToPx(context: Context): Int {
    val density = context.resources.displayMetrics.density
    return (this * density).toInt()
}

fun Activity.setBottomNavigationViewCorners(
    bottomNavigationView: BottomNavigationView,
    radius: Float = 18.dpToPx(this).toFloat()
) {
    bottomNavigationView.outlineProvider = object : ViewOutlineProvider() {
        override fun getOutline(view: View, outline: Outline) {
            outline.setRoundRect(0, 0, view.width, view.height + radius.toInt(), radius)
        }
    }
    bottomNavigationView.clipToOutline = true
}

fun Activity.startActivityForResult(
    intent: Intent,
    requestCode : Int,
    callback: (ActivityResult) -> Unit,
    activityResultLauncher: ActivityResultLauncher<Intent>,
    activityResultHandlers : MutableMap<Int, (ActivityResult) -> Unit>
) {
    intent.putExtra("requestCode", requestCode)
    activityResultHandlers[requestCode] = callback
    activityResultLauncher.launch(intent)
}