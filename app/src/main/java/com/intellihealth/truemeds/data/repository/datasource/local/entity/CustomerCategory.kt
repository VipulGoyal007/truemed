package com.intellihealth.truemeds.data.repository.datasource.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "customer_category")
data class CustomerCategory(
    @PrimaryKey
    @ColumnInfo(name="id")val id: Long?,
    @ColumnInfo(name = "categoryType") val categoryType: String,
    @ColumnInfo(name = "category") val category: String
)