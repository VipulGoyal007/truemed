package com.intellihealth.truemeds.data.repository.datasource.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "TmContactVersion")
data class TmContactVersion(
    @PrimaryKey(autoGenerate = true) val id: Long?,
    @ColumnInfo(name = "contactName") val contactName: String,
    @ColumnInfo(name = "version") val version: Double
)
