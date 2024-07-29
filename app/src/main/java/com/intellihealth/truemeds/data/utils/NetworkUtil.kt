package com.intellihealth.truemeds.data.utils

import android.Manifest
import android.content.Context
import android.content.pm.PackageManager
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import androidx.core.content.ContextCompat
import okhttp3.ResponseBody
import org.json.JSONObject
import retrofit2.Response
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.text.SimpleDateFormat
import java.util.Date


fun isNetworkAvailable(context: Context): Boolean {
    // register activity with the connectivity manager service
    val connectivityManager =
        context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
        val network = connectivityManager.activeNetwork ?: return false
        // Representation of the capabilities of an active network.
        val activeNetwork = connectivityManager.getNetworkCapabilities(network) ?: return false

        return when {
            activeNetwork.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> true

            activeNetwork.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> true

            else -> false
        }
    } else {
        // if the android version is below M
        @Suppress("DEPRECATION") val networkInfo =
            connectivityManager.activeNetworkInfo ?: return false
        @Suppress("DEPRECATION")
        return networkInfo.isConnected
    }

}
fun getJsonResponseFromRaw(response: Response<ResponseBody>): JSONObject? {
    return try {
        JSONObject(getStringResponseFromRaw(response))
    } catch (ex: Exception) {
        null
    }
}

fun getStringResponseFromRaw(response: Response<ResponseBody>): String? {
    var reader: BufferedReader? = null
    val sb = StringBuilder()
    try {
        reader = BufferedReader(InputStreamReader(response.body()!!.byteStream()))
        var line: String?
        try {
            while (reader.readLine().also { line = it } != null) {
                sb.append(line)
            }
        } catch (e: IOException) {
            //e.printStackTrace();
        }
    } catch (e: java.lang.Exception) {
        //e.printStackTrace();
    }
    var finalText = sb.toString()
    val char1 = finalText.substring(0, 1)
    if (char1.equals("[", ignoreCase = true)) {
        finalText = "{\"array\": $finalText}"
    }
    //Constants.printText("finalText: " + finalText);
    return finalText
}

fun strDateTimeToDate(strDateTime: String?): Date? {
    return try {
        SimpleDateFormat("yyyy-MM-dd").parse(strDateTime)
    } catch (ex: java.lang.Exception) {
        null
    }
}


fun checkPermissionsForContact(context: Context): Boolean {
    for (permission in getContactPermissionArray) {
        if (ContextCompat.checkSelfPermission(
                context,
                permission
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            return false
        }
    }
    return true
}

val getContactPermissionArray =  arrayOf(
    Manifest.permission.WRITE_CONTACTS,
    Manifest.permission.READ_CONTACTS
)