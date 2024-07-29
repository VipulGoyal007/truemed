package com.intellihealth.truemeds.data.repository.datasource.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "search_category")
data class SearchCategory(
    @PrimaryKey(autoGenerate = true) val id: Long?,
    @SerializedName("name")
    @ColumnInfo(name = "key_name") val keyName: String,
    @SerializedName("value")
    @ColumnInfo(name = "key_value") val keyValue: String
)
