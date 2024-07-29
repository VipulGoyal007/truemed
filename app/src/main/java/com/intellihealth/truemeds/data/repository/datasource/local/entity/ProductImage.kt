package com.intellihealth.truemeds.data.repository.datasource.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "productImage")
data class ProductImage(
    @PrimaryKey(autoGenerate = true) val id: Int?,
    @ColumnInfo(name = "productCode") var productCode: String,
    @ColumnInfo(name = "images") var images: String,
    @ColumnInfo(name = "addedDateTime") var addedDateTime: Long
)
