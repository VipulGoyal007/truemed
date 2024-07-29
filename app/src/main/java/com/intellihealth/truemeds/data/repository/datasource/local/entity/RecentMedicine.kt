package com.intellihealth.truemeds.data.repository.datasource.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "recentlySearched")
class RecentMedicine(
    @PrimaryKey
    @ColumnInfo(name = "id") val id: Long?,
    @ColumnInfo(name = "medicineName") val medicineName: String,
    @ColumnInfo(name = "productCode") val productCode: String,
    @ColumnInfo(name = "iconType") val iconType: Int,
    @ColumnInfo(name = "customerId") val customerId: String?,
    @ColumnInfo(name = "addedDateTime") val addedDateTime: Long,
    @ColumnInfo(name = "elastic_search_type") val keyName: String,
    @ColumnInfo(name = "showHistoryIcon") val showHistoryIcon: Boolean,
    @ColumnInfo(name = "productImage") var productImage: String,
    @ColumnInfo(name = "drugType") val drugType: String
)