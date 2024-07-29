package com.intellihealth.truemeds.data.repository.datasource.local.entity

import androidx.annotation.Keep
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Keep
@Entity(tableName = "item_added_attributes")
data class ItemAddedEventAttributes(
    @PrimaryKey(autoGenerate = true) val id: Int?,
    @ColumnInfo(name = "productCode") var productCode: String,
    @ColumnInfo(name = "clicked_on_page") var clickedPage: String,
    @ColumnInfo(name = "page_section") var pageSection: String,
    @ColumnInfo(name = "section_heading") var sectionHeading: String,
    @ColumnInfo(name = "section_index") var sectionIndex: Int
)




