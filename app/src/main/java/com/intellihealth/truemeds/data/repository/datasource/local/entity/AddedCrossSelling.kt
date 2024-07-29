package com.intellihealth.truemeds.data.repository.datasource.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "AddedCrossSelling")
data class AddedCrossSelling(
    @PrimaryKey(autoGenerate = true)
    val id: Long?,
    @ColumnInfo(name = "ProductCode") val productCode: String
)
