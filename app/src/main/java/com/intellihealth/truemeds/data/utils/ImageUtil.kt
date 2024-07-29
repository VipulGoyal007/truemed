package com.intellihealth.truemeds.data.utils

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Matrix
import android.media.ExifInterface
import android.net.Uri
import android.os.Environment
import android.provider.MediaStore
import android.provider.MediaStore.Files.FileColumns
import android.provider.MediaStore.Files.FileColumns.MEDIA_TYPE_IMAGE
import android.provider.MediaStore.Files.FileColumns.MEDIA_TYPE_VIDEO
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.Date


class ImageUtil {

    fun getRotatedBitmap(bitmap: Bitmap, photoPath: String): Bitmap? {
        var rotatedBitmap: Bitmap? = null
        try {
            val ei = ExifInterface(photoPath)
            val orientation = ei.getAttributeInt(
                ExifInterface.TAG_ORIENTATION,
                ExifInterface.ORIENTATION_UNDEFINED
            )
            rotatedBitmap = when (orientation) {
                ExifInterface.ORIENTATION_ROTATE_90 -> rotateImage(
                    bitmap,
                    90f
                )

                ExifInterface.ORIENTATION_ROTATE_180 -> rotateImage(
                    bitmap,
                    180f
                )

                ExifInterface.ORIENTATION_ROTATE_270 -> rotateImage(
                    bitmap,
                    270f
                )

                ExifInterface.ORIENTATION_NORMAL -> bitmap
                else -> bitmap
            }
        } catch (ex: IOException) {
            ex.printStackTrace()
        }
        return rotatedBitmap
    }

    private fun rotateImage(source: Bitmap, angle: Float): Bitmap {
        val matrix = Matrix()
        matrix.postRotate(angle)
        return Bitmap.createBitmap(
            source,
            0,
            0,
            source.width,
            source.height,
            matrix,
            true
        )

    }

    fun getByteArrayFromBitmap(bitmap: Bitmap): ByteArray? {
        return try {
            val stream = ByteArrayOutputStream()
            bitmap.compress(Bitmap.CompressFormat.JPEG, 80, stream)
            val byteArray = stream.toByteArray()
            bitmap.recycle()
            byteArray
        } catch (e: Exception) {
            null
        }
    }

    fun convertUriToBitmap(context: Context,uri: Uri): ByteArray? {
        try {
            var bitmap = MediaStore.Images.Media.getBitmap(context.contentResolver, uri)
            val w = bitmap.width.toFloat()
            val h = bitmap.height.toFloat()
            var byteArray: ByteArray? = null
            byteArray = if (bitmap.byteCount > 20 * 1024 * 1024) {
                val W = (w / 4).toInt() //10
                val H = (h * W / w).toInt()
                val b = Bitmap.createScaledBitmap(bitmap, W, H, false)
                getByteArrayFromBitmap(b)
            } else {
                getByteArrayFromBitmap(bitmap)
            }
            bitmap = null
            return byteArray
        } catch (e: OutOfMemoryError) {
        } catch (e: java.lang.Exception) {
        }
        return null
    }

    fun isExternalStorageAvailable(): Boolean {
        val state: String = Environment.getExternalStorageState()
        return if (Environment.MEDIA_MOUNTED.equals(state)) {
            true
        } else {
            false
        }
    }
    fun getDirectory(mContext: Context): File {

        //File file = new File(Environment.getExternalStorageDirectory().getPath(), "Truemeds/Media/Images");
        val file = File(
            mContext.getExternalFilesDir(Environment.DIRECTORY_PICTURES)!!.path,
            "Truemeds/Media/Images"
        )
        if (!file.exists()) {
            file.mkdirs()
        }
        return file
    }
    /*fun getOutputMediaFileUri(mediaType: Int, context: Context): Uri? {
        // check for external storage
        if (isExternalStorageAvailable()) {

            // get the URI

            // 1. Get the external storage directory
            //File mediaStorageDir = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
            val mediaStorageDir: File = getDirectory(context)

            // 2. Create a unique file name
            var fileName = ""
            var fileType = ""
            val timeStamp: String = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
            if (mediaType == FileColumns.MEDIA_TYPE_IMAGE) {
                fileName = "IMG_$timeStamp"
                fileType = ".jpg"
            } else if (mediaType == MEDIA_TYPE_VIDEO) {
                fileName = "VID_$timeStamp"
                fileType = ".mp4"
            } else {
                return Uri.parse("")
            }

            // 3. Create the file
            val mediaFile: File
            try {
                mediaFile = File.createTempFile(fileName, fileType, mediaStorageDir)
                //Log.i(TAG, "File: " + Uri.fromFile(mediaFile));
                // 4. Return the file's URI
                return Uri.fromFile(mediaFile)
            } catch (e: IOException) {

            }
        }

        // something went wrong
        return Uri.parse("")
    }*/

    fun getOutputMediaFileUri(mediaType: Int, context: Context?): Uri? {
        // check for external storage
        if (isExternalStorageAvailable()) {

            // get the URI

            // 1. Get the external storage directory
            //File mediaStorageDir = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
            val mediaStorageDir = getDirectory(context!!)

            // 2. Create a unique file name
            var fileName = ""
            var fileType = ""
            val timeStamp = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
            if (mediaType == MEDIA_TYPE_IMAGE) {
                fileName = "IMG_$timeStamp"
                fileType = ".jpg"
            } else if (mediaType == MEDIA_TYPE_VIDEO) {
                fileName = "VID_$timeStamp"
                fileType = ".mp4"
            } else {
                return null
            }

            // 3. Create the file
            val mediaFile: File
            try {
                mediaFile = File.createTempFile(fileName, fileType, mediaStorageDir)
                //Log.i(TAG, "File: " + Uri.fromFile(mediaFile));
                // 4. Return the file's URI
                return Uri.fromFile(mediaFile)
            } catch (e: IOException) {
            }
        }

        // something went wrong
        return null
    }
    fun getOutputMediaFile(mediaType: Int, context: Context?): File? {
        // check for external storage
        if (isExternalStorageAvailable()) {

            // get the URI

            // 1. Get the external storage directory
            //File mediaStorageDir = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
            val mediaStorageDir = getDirectory(context!!)

            // 2. Create a unique file name
            var fileName = ""
            var fileType = ""
            val timeStamp = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
            if (mediaType == MEDIA_TYPE_IMAGE) {
                fileName = "IMG_$timeStamp"
                fileType = ".jpg"
            } else if (mediaType == MEDIA_TYPE_VIDEO) {
                fileName = "VID_$timeStamp"
                fileType = ".mp4"
            } else {
                return null
            }

            // 3. Create the file
            val mediaFile: File
            try {
                mediaFile = File.createTempFile(fileName, fileType, mediaStorageDir)
                //Log.i(TAG, "File: " + Uri.fromFile(mediaFile));
                return mediaFile
            } catch (e: IOException) {

            }
        }

        // something went wrong
        return null
    }
}