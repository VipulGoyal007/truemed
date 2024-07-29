package com.intellihealth.truemeds.presentation.activity

import android.Manifest
import android.app.Activity
import android.app.AlertDialog
import android.app.Dialog
import android.content.Intent
import android.content.pm.PackageManager
import android.content.res.Configuration
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.MediaStore
import android.provider.Settings
import android.text.TextUtils
import android.view.View
import android.view.WindowManager
import android.view.inputmethod.InputMethodManager
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModelProvider
import com.intellihealth.salt.views.Toast
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.utils.ImageUtil
import com.intellihealth.truemeds.data.utils.MyFileContentProvider
import com.intellihealth.truemeds.data.utils.PopUpManager
import com.intellihealth.truemeds.data.utils.PopUpType
import com.intellihealth.truemeds.presentation.callbacks.PopUpDialogCallback
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.viewmodel.BaseViewModel
import java.io.File

open abstract class BaseActivity : AppCompatActivity() {
    var resumeCount = 0
    private lateinit var photoFile: File
    private lateinit var event: (ByteArray) -> Unit
    private lateinit var isPermissionGranted: (Boolean) -> Unit
    private var isBaseUserLoggedIn = false

    private val viewModel: BaseViewModel by lazy { ViewModelProvider(this)[BaseViewModel::class.java] }
    abstract fun extractIntentData()
    companion object {
        var isReminderPendingToShow: Boolean = false
        var isCancelled = true
    }

    open fun notificationPermissionReceived() {}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        adjustFontScale(resources.configuration)
        //isBaseUserLoggedIn = SharedPrefManager.getInstance().loggedInUserAccessToken != null
        isBaseUserLoggedIn = SharedPrefManager.getInstance().loggedInUserAccessToken.isNotEmpty()
    }

    open fun updateStatusBarColor() {
        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                window.decorView.systemUiVisibility =
                    View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR //  set status text dark
                window.statusBarColor =
                    ContextCompat.getColor(this, R.color.white) // set status background white
            }
        } catch (ignore: java.lang.Exception) {
        }
    }

    open fun updateHomePageStatusBarColor() {
        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                window.decorView.systemUiVisibility =
                    View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR //  set status text dark
                window.statusBarColor =
                    ContextCompat.getColor(
                        this,
                        R.color.tm_core_color_light_blue_200
                    ) // set status background white
            }
        } catch (ignore: java.lang.Exception) {
        }
    }

    fun showDialogBox(
        popUpType: PopUpType,
        popUpDialogCallback: PopUpDialogCallback,
        isCancelable: Boolean,
        header: String = "",
        message: String = ""
    ) {
        PopUpManager.showPopUp(
            supportFragmentManager,
            popUpType,
            popUpDialogCallback,
            isCancelable,
            header,
            message
        )
    }

    fun disableLoadingView(dialog: Dialog) {
        dialog.dismiss()
    }

    fun enableLoadingView(dialog: Dialog?) {
        dialog?.let {
            with(it) {
                setContentView(R.layout.dialog_progressbar)
                setCancelable(false)
                window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
                window?.setDimAmount(0f)
                window?.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE)
                show()
            }
        }
    }

    open fun getNotificationPermission() {
        if (Build.VERSION.SDK_INT > 32) {
            requestPermission.launch(Manifest.permission.POST_NOTIFICATIONS)
        }
    }

    override fun onResume() {
        super.onResume()
        resumeCount++
    }

    fun startCamera(imageUpload: (ByteArray) -> Unit) {
        try {
            event = imageUpload
            photoFile = getPhotoFileUri(MyFileContentProvider.photoFileName)
            val pm = packageManager
            if (pm.hasSystemFeature(PackageManager.FEATURE_CAMERA_ANY)) {
                val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                intent.putExtra(MediaStore.EXTRA_OUTPUT, MyFileContentProvider.CONTENT_URI)
                val resInfoList =
                    packageManager.queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY)
                for (resolveInfo in resInfoList) {
                    val packageName = resolveInfo.activityInfo.packageName
                    grantUriPermission(
                        packageName,
                        MyFileContentProvider.CONTENT_URI,
                        Intent.FLAG_GRANT_WRITE_URI_PERMISSION or Intent.FLAG_GRANT_READ_URI_PERMISSION
                    )
                }
                cameraLauncher.launch(intent)
            } else {
                Toast().showCustomToastMessage(this, "Camera is not available")
            }
        } catch (_: Exception) {
        }
    }


    private val cameraLauncher =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == Activity.RESULT_OK) {
                val out = File(filesDir, MyFileContentProvider.photoFileName)
                if (!out.exists()) {
                    Toast().showCustomToastMessage(this, "Error while capturing image")
                    return@registerForActivityResult
                }
                try {
                    if (!this@BaseActivity::photoFile.isInitialized) {
                        Toast().showCustomToastMessage(
                            this,
                            resources.getString(R.string.camera_error_msg)
                        )
                    }
                    if (photoFile == null) {
                        return@registerForActivityResult
                    }

                    var bitmap = BitmapFactory.decodeFile(photoFile.absolutePath)
                    val portraitImage: Bitmap? =
                        ImageUtil().getRotatedBitmap(bitmap, photoFile.absolutePath)
                    bitmap = portraitImage ?: bitmap
                    val w = bitmap.width.toFloat()
                    val h = bitmap.height.toFloat()
                    val byteArray: ByteArray? = if (bitmap.allocationByteCount > 20 * 1024 * 1024) {
                        val W = (w / 4).toInt()
                        val H = (h * W / w).toInt()
                        val b = Bitmap.createScaledBitmap(bitmap, W, H, false)
                        ImageUtil().getByteArrayFromBitmap(b)
                    } else {
                        ImageUtil().getByteArrayFromBitmap(bitmap)
                    }

                    if (byteArray != null) {
                        event.invoke(byteArray)
                    }


                } catch (_: Exception) {
                }

            }
        }

    fun pickImageFromGallery(imageUpload: (ByteArray) -> Unit) {
        event = imageUpload
        photoFile = getPhotoFileUri(MyFileContentProvider.photoFileName)
        val intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
        intent.setType("image/*")
        launcher.launch(intent)
    }

    private val launcher =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == Activity.RESULT_OK) {
                result.data?.data?.let { uri ->
                    val byteArray = ImageUtil().convertUriToBitmap(this, uri)
                    if (byteArray != null && ::event.isInitialized) {
                        event.invoke(byteArray)
                    }
                }

            }
        }

    fun verifyPermissionsAndProceed(permissionList: Array<String>, isGranted: (Boolean) -> Unit) {
        isPermissionGranted = isGranted
        permissionLauncher.launch(permissionList)
    }

    private val permissionLauncher = registerForActivityResult(
        ActivityResultContracts.RequestMultiplePermissions()
    )
    { permissions ->
        var permissionGranted = true
        permissions.entries.forEach {
            if (it.key in Manifest.permission.CAMERA && !it.value)
                permissionGranted = false
        }
        if (!permissionGranted) {
            notifyUser("You have denied camera permission which is required for this action. Please open settings, go to permissions and allow them.")
        } else {
            isPermissionGranted.invoke(true)
        }
    }

    private fun notifyUser(message: String?) {
        AlertDialog.Builder(this)
            .setTitle("Permissions Required")
            .setMessage(message)
            .setPositiveButton(android.R.string.ok) { dialog, _ ->
                dialog.dismiss()
                val intent = Intent(
                    Settings.ACTION_APPLICATION_DETAILS_SETTINGS,
                    Uri.fromParts("package", this.packageName, null)
                )
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                startActivity(intent)
            }
            .setCancelable(false)
            .show()
    }

    private fun getPhotoFileUri(fileName: String): File {
        return File(filesDir, fileName)
    }

    open fun checkAndAskNotificationPermission() {
        if (Build.VERSION.SDK_INT > 32) {
            if (!shouldShowRequestPermissionRationale("1230")) {
                getNotificationPermission()
            }
        }
    }

    open fun adjustFontScale(configuration: Configuration) {
        if (configuration.fontScale > 1.10) {
            configuration.fontScale = 1.00f
            val metrics = resources.displayMetrics
            val wm = getSystemService(WINDOW_SERVICE) as WindowManager
            wm.defaultDisplay.getMetrics(metrics)
            metrics.scaledDensity = configuration.fontScale * metrics.density
            baseContext.resources.updateConfiguration(configuration, metrics)
        }
    }

    fun callCustomerCareIntent() {
        try {
            val number = SharedPrefManager.getInstance().customerCareNumber
            if (!TextUtils.isEmpty(number)) {
                val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", number, null))
                startActivity(intent)
            } else {
                Toast().showCustomToastMessage(
                    this,
                    "Something went wrong"
                )
            }
        } catch (ignore: java.lang.Exception) {
        }
    }

    private val requestPermission =
        registerForActivityResult(ActivityResultContracts.RequestPermission()) {
            notificationPermissionReceived()
        }

    fun showKeyboard() {
        try {
            val inputMethodManager =
                applicationContext.getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.toggleSoftInput(InputMethodManager.SHOW_FORCED, 0)
        } catch (_: Exception) {
        }
    }
}