package com.intellihealth.truemeds.data.repository.datasource.local.entity

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "customer_details")
data class CustomerDetails(
    @PrimaryKey
    @ColumnInfo(name = "customerId") val customerId: Long?,
    @ColumnInfo(name = "mobileNo") val mobileNo: String,
    @ColumnInfo(name = "emailAddress") val emailAddress: String?,
    @ColumnInfo(name = "profileImageUrl") val profileImageUrl: String?,
    @ColumnInfo(name = "customerName") val customerName: String?,
    @ColumnInfo(name = "genderName") val genderName: String?,
    @ColumnInfo(name = "age") val age: String?,
    @ColumnInfo(name = "languageId") val languageId: Int?,
    @ColumnInfo(name = "customerLastName") val customerLastName: String?
) : Parcelable

