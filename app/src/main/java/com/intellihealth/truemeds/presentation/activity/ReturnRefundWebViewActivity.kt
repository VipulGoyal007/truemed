package com.intellihealth.truemeds.presentation.activity

import android.app.Activity
import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.content.pm.ResolveInfo
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import android.provider.MediaStore.Files.FileColumns.MEDIA_TYPE_IMAGE
import android.util.Log
import android.view.View
import android.webkit.CookieManager
import android.webkit.ValueCallback
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebStorage
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.content.FileProvider
import androidx.databinding.DataBindingUtil
import com.intellihealth.truemeds.BuildConfig
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.utils.ImageUtil
import com.intellihealth.truemeds.data.utils.MyFileContentProvider
import com.intellihealth.truemeds.databinding.ActivityReferAndEarnBinding
import com.intellihealth.truemeds.databinding.ActivityReturnRefundWebBinding


import com.intellihealth.truemeds.presentation.utils.CommonFunc
import com.intellihealth.truemeds.presentation.utils.viewBinding
import java.io.File
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class ReturnRefundWebViewActivity : BaseActivity() {

    private val binding by viewBinding(ActivityReturnRefundWebBinding::inflate)
    private var mContext: Context? = null
    private var mUploadMessage: ValueCallback<Uri>? = null
    var uploadMessage: ValueCallback<Array<Uri>>? = null
    private var mMediaUri: Uri? = null
    private var url: String? = null
    private var mCurrentPhotoPath = ""
    override fun extractIntentData(){

    }
   override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        mContext = this
//        updateStatusBarColor()
        val intent: Intent = getIntent()
        if (intent.hasExtra("ExtUrl")) {
            url = intent.getStringExtra("ExtUrl")
            if (url != null && url!!.contains("clickpost")) {
                binding.clToolbar.setVisibility(View.GONE)
            }
        }
       binding.ivBack.setOnClickListener { view -> finish() }
        initWebView()
    }

    private fun initWebView() {
        if (Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(binding.webView, true)
            CookieManager.getInstance().removeAllCookies(null)
            CookieManager.getInstance().flush()
        } else {
            CookieManager.getInstance().setAcceptCookie(true)
            CookieManager.getInstance().removeAllCookie()
            CookieManager.getInstance().removeSessionCookie()
        }

        // Clear all the Application Cache, Web SQL Database and the HTML5 Web Storage
        WebStorage.getInstance().deleteAllData()


        /*WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);*/
        //binding.webView.setWebChromeClient(new WebChromeClient());
        binding.webView.getSettings().setJavaScriptEnabled(true)
        binding.webView.getSettings().setDomStorageEnabled(true)
        binding.webView.getSettings().setAllowContentAccess(true)
        binding.webView.getSettings().setAllowFileAccess(true)
        binding.webView.getSettings().setAllowFileAccessFromFileURLs(true)
        binding.webView.getSettings().setAllowUniversalAccessFromFileURLs(true)
        binding.webView.getSettings().setSupportZoom(false)
        binding.webView.setClickable(true)

        //Make sure no caching is done
        //binding.webView.getSettings().setAppCacheEnabled(false);
        binding.webView.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE)
        binding.webView.clearHistory()
        binding.webView.clearCache(true)
        binding.webView.clearSslPreferences()
        deleteDatabase("webview.db")
        deleteDatabase("webviewCache.db")

        //Make sure no autofill for Forms/ user-name password happens for the app
        binding.webView.clearFormData()
        binding.webView.getSettings().setSavePassword(false)
        binding.webView.getSettings().setSaveFormData(false)
        binding.webView.setWebViewClient(object : WebViewClient() {
            override fun onPageCommitVisible(view: WebView, url: String) {
                super.onPageCommitVisible(view, url)
                try {
                    val host = Uri.parse(url).scheme + "://" + Uri.parse(url).host
                    val urlAfterHost = url.replace(host, "")
                    if (Uri.parse(url).host == "truemeds.in") {
                        if (!urlAfterHost.startsWith("/return-refund")
                            && !urlAfterHost.startsWith("/return-order")
                            && !urlAfterHost.startsWith("/return-details")
                            && !urlAfterHost.startsWith("/orderstatus")
                        ) {
                            // reject anything other
                            finish()
                        }
                    }
                } catch (ignore: Exception) {
                }
            }

            override fun onPageFinished(view: WebView, url: String) {
                super.onPageFinished(view, url)
            }
        })
        binding.webView.loadUrl(url!!)
        binding.ivBack.setOnClickListener { view -> finish() }
    }

//     fun updateStatusBarColor() {
//        try {
//            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//                getWindow().getDecorView()
//                    .setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR) //  set status text dark
//                getWindow().setStatusBarColor(
//                    ContextCompat.getColor(
//                        this,
//                        R.color.white
//                    )
//                ) // set status background white
//            }
//        } catch (ignore: Exception) {
//        }
//    }

    protected override fun onActivityResult(requestCode: Int, resultCode: Int, intent: Intent?) {
        super.onActivityResult(requestCode, resultCode, intent)
        if (resultCode != Activity.RESULT_OK) {
            Toast.makeText(this, R.string.error_occurred, Toast.LENGTH_SHORT).show()
            return
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            if (requestCode == REQUEST_FILE_CHOOSER) {
                if (uploadMessage == null) return
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    mMediaUri = Uri.parse(mCurrentPhotoPath)
                } else {
                    if (intent != null) {
                        mMediaUri = intent.getData()
                    }
                }
                if (mMediaUri != null) {
                    Log.d(TAG, "Media Uri: " + mMediaUri.toString())
                }
                uploadMessage!!.onReceiveValue(
                    WebChromeClient.FileChooserParams.parseResult(
                        resultCode,
                        intent
                    )
                )
                uploadMessage = null
                return
            }
            if (requestCode == REQUEST_CAMERA) {
                if (imageFilePath == null) return
                if (uploadMessage == null) return
                val mUris = arrayOf(Uri.parse(imageFilePath))
                uploadMessage!!.onReceiveValue(mUris)
                uploadMessage = null
            }
            if (requestCode == REQUEST_CAMERA_1) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    mMediaUri = Uri.parse(mCurrentPhotoPath)
                } else {
                    if (intent != null) {
                        mMediaUri = intent.getData()
                    }
                }
                if (mMediaUri != null) {
                    Log.d(TAG, "Media Uri: " + mMediaUri.toString())
                    val file = File(mMediaUri!!.path)
                    if (file.exists()) {
                        val fileSizeInBytes = file.length().toDouble()
                        val fileSizeInKB = fileSizeInBytes / 1024
                        val fileSizeInMB = fileSizeInKB / 1024
                        //Log.d(TAG, "FileSize: " + fileSizeInBytes + "Bytes");
                        Log.d(TAG, "FileSize: " + String.format("%.2f", fileSizeInKB) + "KB")
                        //Log.d(TAG, "FileSize: " + String.format("%.2f", fileSizeInMB) + "MB");
                        val mUris = arrayOf(
                            mMediaUri!!
                        )
                        uploadMessage?.onReceiveValue(mUris)
                        uploadMessage = null
                    }
                } else {
                    Toast.makeText(mContext, "Unable to fetch Media", Toast.LENGTH_SHORT).show()
                }
            }
        } else {
            if (null == mUploadMessage) return
            val result: Uri? = if (intent == null) null else intent.getData()
            mUploadMessage!!.onReceiveValue(result)
            mUploadMessage = null
        }
    }

    /*@RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private fun launchFileChooser(fileChooserParams: WebChromeClient.FileChooserParams) {
        val intent: Intent = fileChooserParams.createIntent()
        intent.putExtra(
            Intent.EXTRA_ALLOW_MULTIPLE,
            false
        ) //For single file selection set EXTRA_ALLOW_MULTIPLE property to 'false'.
        try {
            startActivityForResult(intent, REQUEST_FILE_CHOOSER)
        } catch (e: ActivityNotFoundException) {
            uploadMessage = null
            Toast.makeText(
                getApplicationContext(),
                R.string.error_open_file_chooser,
                Toast.LENGTH_SHORT
            ).show()
        }
    }*/

    fun getPhotoFileUri(fileName: String?): File {
        return File(getFilesDir(), fileName)
    }

    private fun openCameraIntent1() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            var photoFile: File? = null
            photoFile = try {
                ImageUtil().getOutputMediaFile(MEDIA_TYPE_IMAGE, this)
            } catch (ex: Exception) {
                return
            }
            if (photoFile != null) {
                mCurrentPhotoPath = photoFile.absolutePath
                mMediaUri = FileProvider.getUriForFile(
                    this,
                    BuildConfig.APPLICATION_ID + ".provider",
                    photoFile
                )
                Log.d(TAG, "URI: $mMediaUri")
                val takePhotoIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                takePhotoIntent.putExtra(MediaStore.EXTRA_OUTPUT, mMediaUri)
                startActivityForResult(takePhotoIntent, REQUEST_CAMERA_1)
            } else {
                Toast.makeText(this, "Unable to create file", Toast.LENGTH_SHORT).show()
            }
        } else {
            mMediaUri = ImageUtil().getOutputMediaFileUri(MEDIA_TYPE_IMAGE, this)
            if (mMediaUri == null) {
                Toast.makeText(
                    this,
                    "There was a problem accessing your device's external storage.",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                Log.d(TAG, "URI: $mMediaUri")
                val takePhotoIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                takePhotoIntent.putExtra(MediaStore.EXTRA_OUTPUT, mMediaUri)
                startActivityForResult(takePhotoIntent, REQUEST_CAMERA_1)
            }
        }
    }

    private fun openCameraIntent() {
        val pictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        if (pictureIntent.resolveActivity(getPackageManager()) != null) {
            //Create a file to store the image
            var photoFile: File? = null
            try {
                photoFile = createImageFile()
            } catch (ex: IOException) {
                // Error occurred while creating the File
                Toast.makeText(this, "Error occurred while creating the File", Toast.LENGTH_SHORT)
                    .show()
            }
            if (photoFile != null) {
                pictureIntent.putExtra(MediaStore.EXTRA_OUTPUT, imageFilePath)
                val resInfoList: List<ResolveInfo> = getPackageManager().queryIntentActivities(
                    pictureIntent,
                    PackageManager.MATCH_DEFAULT_ONLY
                )
                for (resolveInfo in resInfoList) {
                    val packageName: String = resolveInfo.activityInfo.packageName
                    grantUriPermission(
                        packageName, MyFileContentProvider.CONTENT_URI,
                        Intent.FLAG_GRANT_WRITE_URI_PERMISSION or Intent.FLAG_GRANT_READ_URI_PERMISSION
                    )
                }

//                Uri photoURI = FileProvider.getUriForFile(this, "com.intellihealth.truemeds.provider", photoFile);
//                pictureIntent.putExtra(MediaStore.EXTRA_OUTPUT, photoURI);
                startActivityForResult(pictureIntent, REQUEST_CAMERA)
            }
        }
    }

    var imageFilePath: String? = null
    @Throws(IOException::class)
    private fun createImageFile(): File {
        val timeStamp = SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault())
            .format(Date())
        val imageFileName = "IMG_" + timeStamp + "_"
        var storageDir: File? = null
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            storageDir = getDataDir()
        } else {
            storageDir = getExternalFilesDir(Environment.DIRECTORY_PICTURES)
        }
        val image = File.createTempFile(imageFileName, ".jpg", storageDir)
        imageFilePath = image.absolutePath
        return image
    }

    override fun onBackPressed() {
        if (binding.webView.canGoBack()) {
            binding.webView.goBack()
        } else {
            super.onBackPressed()
        }
    }

    protected override fun onDestroy() {
        super.onDestroy()
        CommonFunc.freeMemory()
    }

    companion object {
        private const val TAG = "ReturnRefund"
        private const val REQUEST_FILE_CHOOSER = 100
        private const val REQUEST_CAMERA = 200
        private const val REQUEST_CAMERA_1 = 300
    }
}