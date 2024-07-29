package com.intellihealth.truemeds.data.repository.datasource.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "variant")
data class Variant(
    @ColumnInfo(name="variantId")val variantId: Long?,
    @ColumnInfo(name = "variantName") val variantName: String,
    @ColumnInfo(name = "variantType") val variantType: String
)