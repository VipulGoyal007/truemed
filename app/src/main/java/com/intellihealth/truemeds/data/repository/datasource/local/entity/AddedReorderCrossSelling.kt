package com.intellihealth.truemeds.data.repository.datasource.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "addedReorderCrossSelling")
data class AddedReorderCrossSelling(
    @PrimaryKey(autoGenerate = true)
    val id: Long?,
    @ColumnInfo(name = "ProductCode") val productCode: String)