package com.intellihealth.truemeds.data.repository.datasource.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "sub_opt_reasons")
data class SubOptReasons(
    @PrimaryKey(autoGenerate = true) val id: Int?,
    @ColumnInfo(name = "reasonId") val reasonId: Int?,
    @ColumnInfo(name = "name") var name: String,
    @ColumnInfo(name = "value") var value: String,
)