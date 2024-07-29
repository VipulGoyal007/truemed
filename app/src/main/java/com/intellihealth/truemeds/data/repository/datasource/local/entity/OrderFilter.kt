package com.intellihealth.truemeds.data.repository.datasource.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "OrderFilter")
data class OrderFilter(
    @PrimaryKey
    @ColumnInfo(name = "id") var id: Int? = 0,
    @ColumnInfo(name = "name") var name: String? = "",
    @ColumnInfo(name = "displayName") var displayName: String? = ""
)