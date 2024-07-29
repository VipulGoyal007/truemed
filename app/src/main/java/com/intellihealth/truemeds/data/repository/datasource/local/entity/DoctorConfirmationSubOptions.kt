package com.intellihealth.truemeds.data.repository.datasource.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "doctor_confirmation_sub_options")
data class DoctorConfirmationSubOptions(
    @PrimaryKey(autoGenerate = true) val id: Long?,
    @ColumnInfo(name = "key_name") val keyName: String,
    @ColumnInfo(name = "key_value") val keyValue: String,
    @ColumnInfo(name = "reasonId") val reasonId: Long
)