package com.intellihealth.truemeds.data.utils

import android.content.ContentProvider
import android.content.ContentValues
import android.database.Cursor
import android.net.Uri
import android.os.ParcelFileDescriptor
import java.io.File
import java.io.FileNotFoundException

class MyFileContentProvider: ContentProvider() {

    companion object {
        var CONTENT_URI: Uri = Uri.parse("content://com.intellihealth.truemeds/")
        var MIME_TYPES = HashMap<String, String>()
        const val photoFileName = "photo.jpg"

    }

    override fun onCreate(): Boolean {
        MIME_TYPES[".jpg"] = "image/jpeg"
        MIME_TYPES[".jpeg"] = "image/jpeg"
        return try {
            CONTENT_URI =
                Uri.parse("content://" + context!!.packageName + "/")
            val mFile = File(context!!.filesDir, photoFileName)
            if (!mFile.exists()) {
                mFile.createNewFile()
            }
            context!!.contentResolver.notifyChange(CONTENT_URI, null)
            true
        } catch (e: Exception) {
            //e.printStackTrace();
            false
        }
    }

    override fun query(
        uri: Uri,
        projection: Array<out String>?,
        selection: String?,
        selectionArgs: Array<out String>?,
        sortOrder: String?
    ): Cursor? {
        return null
    }

    override fun getType(uri: Uri): String? {
        val path = uri.toString()
        for (extension in MIME_TYPES.keys) {
            if (path.endsWith(extension)) {
                return MIME_TYPES[extension]
            }
        }
        return null
    }

    override fun openFile(uri: Uri, mode: String): ParcelFileDescriptor? {
        val f = File(context!!.filesDir, photoFileName)
        if (f.exists()) {
            return ParcelFileDescriptor.open(
                f,
                ParcelFileDescriptor.MODE_READ_WRITE
            )
        }
        throw FileNotFoundException(uri.path)
    }

    override fun insert(uri: Uri, values: ContentValues?): Uri? {
        return null
    }

    override fun delete(uri: Uri, selection: String?, selectionArgs: Array<out String>?): Int {
        return 0
    }

    override fun update(
        uri: Uri,
        values: ContentValues?,
        selection: String?,
        selectionArgs: Array<out String>?
    ): Int {
        return 0
    }

}