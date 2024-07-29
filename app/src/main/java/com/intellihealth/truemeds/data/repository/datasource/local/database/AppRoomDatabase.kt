package com.intellihealth.truemeds.data.repository.datasource.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.intellihealth.truemeds.data.repository.datasource.local.TruemedsDao
import com.intellihealth.truemeds.data.repository.datasource.local.entity.AddedCrossSelling
import com.intellihealth.truemeds.data.repository.datasource.local.entity.AddedReorderCrossSelling
import com.intellihealth.truemeds.data.repository.datasource.local.entity.CartItemSellingPrice
import com.intellihealth.truemeds.data.repository.datasource.local.entity.CartItemSequence
import com.intellihealth.truemeds.data.repository.datasource.local.entity.CartMedicine
import com.intellihealth.truemeds.data.repository.datasource.local.entity.CartReplaceStatus
import com.intellihealth.truemeds.data.repository.datasource.local.entity.CustomerCategory
import com.intellihealth.truemeds.data.repository.datasource.local.entity.CustomerDetails
import com.intellihealth.truemeds.data.repository.datasource.local.entity.DoctorConfirmationSubOptions
import com.intellihealth.truemeds.data.repository.datasource.local.entity.ItemAddedEventAttributes
import com.intellihealth.truemeds.data.repository.datasource.local.entity.OrderFilter
import com.intellihealth.truemeds.data.repository.datasource.local.entity.OrderTicket
import com.intellihealth.truemeds.data.repository.datasource.local.entity.OrgSubsInfo
import com.intellihealth.truemeds.data.repository.datasource.local.entity.PatientNameEntity
import com.intellihealth.truemeds.data.repository.datasource.local.entity.PillReminder
import com.intellihealth.truemeds.data.repository.datasource.local.entity.ProductImage
import com.intellihealth.truemeds.data.repository.datasource.local.entity.RecentMedicine
import com.intellihealth.truemeds.data.repository.datasource.local.entity.ReferReminder
import com.intellihealth.truemeds.data.repository.datasource.local.entity.ReorderAlternateSubs
import com.intellihealth.truemeds.data.repository.datasource.local.entity.SaveVideoFAQ
import com.intellihealth.truemeds.data.repository.datasource.local.entity.SearchCategory
import com.intellihealth.truemeds.data.repository.datasource.local.entity.SubOptReasons
import com.intellihealth.truemeds.data.repository.datasource.local.entity.TmContactVersion


@Database(
    entities = [CartMedicine::class,
        ReorderAlternateSubs::class,
        OrgSubsInfo::class,
        RecentMedicine::class,
        PillReminder::class,
        ReferReminder::class,
        SaveVideoFAQ::class,
        CartReplaceStatus::class,
        CartItemSequence::class,
        DoctorConfirmationSubOptions::class,
        SearchCategory::class,
        AddedCrossSelling::class,
        OrderTicket::class,
        ProductImage::class,
        CustomerCategory::class,
        CustomerDetails::class,
        OrderFilter::class,
        TmContactVersion::class,
        SubOptReasons::class,
        CartItemSellingPrice::class,
        PatientNameEntity::class,
        ItemAddedEventAttributes::class,
        AddedReorderCrossSelling::class], version = 5, exportSchema = false
)
abstract class AppRoomDatabase : RoomDatabase() {
    abstract fun getAppDao(): TruemedsDao

}

/*companion object {
    val MIGRATION_1_2: Migration = object : Migration(1, 2) {
        override fun migrate(database: SupportSQLiteDatabase) {
            // SQL statements to alter the table and add the new column
//                database.execSQL("ALTER TABLE addedMedsTable12 ADD COLUMN orgSellingPrice INTEGER DEFAULT 0")
//                database.execSQL("ALTER TABLE addedSubsOrgInfo ADD COLUMN orgSellingPrice INTEGER DEFAULT 0")
        }
    }
}*/
