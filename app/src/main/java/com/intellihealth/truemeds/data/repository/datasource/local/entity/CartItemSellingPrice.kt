package com.intellihealth.truemeds.data.repository.datasource.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "cart_item_price")
class CartItemSellingPrice(
    @PrimaryKey
    @ColumnInfo(name = "productCode") val productCode: String,
    @ColumnInfo(name = "sellingPrice") val sellingPrice: Double
)
