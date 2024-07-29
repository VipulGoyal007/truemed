package com.intellihealth.truemeds.data.repository.datasource.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "saveVideoFaq")
data class SaveVideoFAQ(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Long,
    @ColumnInfo(name = "orderId") val orderId: Long,
    @ColumnInfo(name = "patientId") val patientId: String
)

