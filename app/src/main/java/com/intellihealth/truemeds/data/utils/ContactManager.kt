package com.intellihealth.truemeds.data.utils

import android.annotation.SuppressLint
import android.content.ContentProviderOperation
import android.content.ContentValues
import android.content.Context
import android.provider.ContactsContract
import android.provider.ContactsContract.RawContacts
import android.widget.Toast


object ContactManager {
    fun addContact(context: Context, displayName: String?, phoneNumber: List<String>) {
        val ops = ArrayList<ContentProviderOperation>()
        ops.add(
            ContentProviderOperation.newInsert(RawContacts.CONTENT_URI)
                .withValue(RawContacts.ACCOUNT_TYPE, null)
                .withValue(RawContacts.ACCOUNT_NAME, null)
                .build()
        )

        ops.add(
            ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI)
                .withValueBackReference(ContactsContract.Data.RAW_CONTACT_ID, 0)
                .withValue(
                    ContactsContract.Data.MIMETYPE,
                    ContactsContract.CommonDataKinds.StructuredName.CONTENT_ITEM_TYPE
                )
                .withValue(
                    ContactsContract.CommonDataKinds.StructuredName.DISPLAY_NAME,
                    displayName
                )
                .build()
        )

        ops.add(
            ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI)
                .withValueBackReference(ContactsContract.Data.RAW_CONTACT_ID, 0)
                .withValue(
                    ContactsContract.Data.MIMETYPE,
                    ContactsContract.CommonDataKinds.Phone.CONTENT_ITEM_TYPE
                )
                .withValue(ContactsContract.CommonDataKinds.Phone.NUMBER, phoneNumber)
                .withValue(
                    ContactsContract.CommonDataKinds.Phone.TYPE,
                    ContactsContract.CommonDataKinds.Phone.TYPE_MOBILE
                )
                .build()
        )
        try {
            val contentResolver = context.contentResolver
            contentResolver.applyBatch(ContactsContract.AUTHORITY, ops)

        } catch (e: java.lang.Exception) {
            e.printStackTrace()
        }
    }

    fun addPhoneNumberToContact(context: Context, contactId: Long, newPhoneNumber: String?) {
        val ops = ArrayList<ContentProviderOperation>()
        ops.add(
            ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI)
                .withValue(ContactsContract.Data.RAW_CONTACT_ID, contactId)
                .withValue(
                    ContactsContract.Data.MIMETYPE,
                    ContactsContract.CommonDataKinds.Phone.CONTENT_ITEM_TYPE
                )
                .withValue(ContactsContract.CommonDataKinds.Phone.NUMBER, newPhoneNumber)
                .withValue(
                    ContactsContract.CommonDataKinds.Phone.TYPE,
                    ContactsContract.CommonDataKinds.Phone.TYPE_WORK
                )
                .build()
        )
        try {
            val contentResolver = context.contentResolver
            contentResolver.applyBatch(ContactsContract.AUTHORITY, ops)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun editContact(
        context: Context,
        contactId: Long,
        newDisplayName: String?,
        newPhoneNumber: String?
    ) {
        val ops = ArrayList<ContentProviderOperation>()

        // Update display name
        ops.add(
            ContentProviderOperation.newUpdate(ContactsContract.Data.CONTENT_URI)
                .withSelection(
                    ContactsContract.Data.CONTACT_ID + "=? AND " + ContactsContract.Data.MIMETYPE + "=?",
                    arrayOf(
                        contactId.toString(),
                        ContactsContract.CommonDataKinds.StructuredName.CONTENT_ITEM_TYPE
                    )
                )
                .withValue(
                    ContactsContract.CommonDataKinds.StructuredName.DISPLAY_NAME,
                    newDisplayName
                )
                .build()
        )

        // Update phone number
        ops.add(
            ContentProviderOperation.newUpdate(ContactsContract.Data.CONTENT_URI)
                .withSelection(
                    ContactsContract.Data.CONTACT_ID + "=? AND " + ContactsContract.Data.MIMETYPE + "=?",
                    arrayOf(
                        contactId.toString(),
                        ContactsContract.CommonDataKinds.Phone.CONTENT_ITEM_TYPE
                    )
                )
                .withValue(ContactsContract.CommonDataKinds.Phone.NUMBER, newPhoneNumber)
                .build()
        )
        try {
            val contentResolver = context.contentResolver
            contentResolver.applyBatch(ContactsContract.AUTHORITY, ops)
        } catch (e: java.lang.Exception) {
            e.printStackTrace()
        }
    }

    @SuppressLint("Range")
    fun getContactIdByName(context: Context, contactName: String): Long {
        val contentResolver = context.contentResolver

        // Define the columns to be retrieved
        val projection = arrayOf(ContactsContract.Contacts._ID)

        // Specify the search criteria
        val selection = ContactsContract.Contacts.DISPLAY_NAME_PRIMARY + "=?"
        val selectionArgs = arrayOf(contactName)

        // Query the Contacts content provider
        val uri = ContactsContract.Contacts.CONTENT_URI
        val cursor = contentResolver.query(uri, projection, selection, selectionArgs, null)
        var contactId: Long = -1
        if (cursor != null && cursor.moveToFirst()) {
            // Retrieve the contact ID
            contactId = cursor.getLong(cursor.getColumnIndex(ContactsContract.Contacts._ID))
            cursor.close()
        }
        return contactId
    }


    fun saveContact(context: Context,name: String): String? {
        val ops = ArrayList<ContentProviderOperation>()
        val contentResolver = context.contentResolver
        ops.add(
            ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI)
                .withValue(ContactsContract.RawContacts.ACCOUNT_TYPE, null)
                .withValue(ContactsContract.RawContacts.ACCOUNT_NAME, null)
                .build()
        )

        ops.add(
            ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI)
                .withValueBackReference(ContactsContract.Data.RAW_CONTACT_ID, 0)
                .withValue(
                    ContactsContract.Data.MIMETYPE,
                    ContactsContract.CommonDataKinds.StructuredName.CONTENT_ITEM_TYPE
                )
                .withValue(ContactsContract.CommonDataKinds.StructuredName.DISPLAY_NAME, name)
                .build()
        )

        val results = contentResolver.applyBatch(ContactsContract.AUTHORITY, ops)
        return results[0].uri?.lastPathSegment // Returns the contact ID
    }

    fun addPhoneNumbersToContact(context: Context,contactId: String, phoneNumbers: List<String>) {
        val contentResolver = context.contentResolver
        for (phoneNumber in phoneNumbers) {
            val values = ContentValues().apply {
                put(ContactsContract.Data.RAW_CONTACT_ID, contactId)
                put(ContactsContract.Data.MIMETYPE, ContactsContract.CommonDataKinds.Phone.CONTENT_ITEM_TYPE)
                put(ContactsContract.CommonDataKinds.Phone.NUMBER, phoneNumber)
                put(ContactsContract.CommonDataKinds.Phone.TYPE, ContactsContract.CommonDataKinds.Phone.TYPE_MOBILE)
            }

            contentResolver.insert(ContactsContract.Data.CONTENT_URI, values)
        }
    }

}