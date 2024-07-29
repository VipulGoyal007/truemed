package com.intellihealth.truemeds.data.repository.datasource.local.entity

import androidx.annotation.ColorInt
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "cartReplaceStatus")
data class CartReplaceStatus(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Int?,
    @ColumnInfo(name = "medicineId") val medicineId: String,
    @ColumnInfo(name = "isAutoReplace") val isAutoReplace: Boolean
)
