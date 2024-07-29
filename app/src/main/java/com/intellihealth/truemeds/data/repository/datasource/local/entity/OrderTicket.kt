package com.intellihealth.truemeds.data.repository.datasource.local.entity

import androidx.annotation.ColorInt
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "raise_ticket")
data class OrderTicket(
    @PrimaryKey(autoGenerate = true) val id: Int?,
    @ColumnInfo(name = "issueId") var issueId: Int,
    @ColumnInfo(name = "description") var description: String,
    @ColumnInfo(name = "orderProductName") var orderProductName: String,
    @ColumnInfo(name = "medicineId") var medicineId: String,
    @ColumnInfo(name = "orderProductQty") var orderProductQty: Int,
    @ColumnInfo(name = "orderProductPrice") var orderProductPrice: Double
)
