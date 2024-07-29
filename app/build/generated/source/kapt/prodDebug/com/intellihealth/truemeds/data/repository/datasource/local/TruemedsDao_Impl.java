package com.intellihealth.truemeds.data.repository.datasource.local;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.intellihealth.truemeds.data.model.LocalCartDBMrpCalculations;
import com.intellihealth.truemeds.data.model.LocalCartDBSellingPriceCalculations;
import com.intellihealth.truemeds.data.repository.datasource.local.entity.AddedCrossSelling;
import com.intellihealth.truemeds.data.repository.datasource.local.entity.AddedReorderCrossSelling;
import com.intellihealth.truemeds.data.repository.datasource.local.entity.CartItemSellingPrice;
import com.intellihealth.truemeds.data.repository.datasource.local.entity.CartItemSequence;
import com.intellihealth.truemeds.data.repository.datasource.local.entity.CartMedicine;
import com.intellihealth.truemeds.data.repository.datasource.local.entity.CartReplaceStatus;
import com.intellihealth.truemeds.data.repository.datasource.local.entity.CustomerCategory;
import com.intellihealth.truemeds.data.repository.datasource.local.entity.CustomerDetails;
import com.intellihealth.truemeds.data.repository.datasource.local.entity.DoctorConfirmationSubOptions;
import com.intellihealth.truemeds.data.repository.datasource.local.entity.ItemAddedEventAttributes;
import com.intellihealth.truemeds.data.repository.datasource.local.entity.OrderFilter;
import com.intellihealth.truemeds.data.repository.datasource.local.entity.OrderTicket;
import com.intellihealth.truemeds.data.repository.datasource.local.entity.OrgSubsInfo;
import com.intellihealth.truemeds.data.repository.datasource.local.entity.PatientNameEntity;
import com.intellihealth.truemeds.data.repository.datasource.local.entity.PillReminder;
import com.intellihealth.truemeds.data.repository.datasource.local.entity.ProductImage;
import com.intellihealth.truemeds.data.repository.datasource.local.entity.RecentMedicine;
import com.intellihealth.truemeds.data.repository.datasource.local.entity.ReferReminder;
import com.intellihealth.truemeds.data.repository.datasource.local.entity.ReorderAlternateSubs;
import com.intellihealth.truemeds.data.repository.datasource.local.entity.SaveVideoFAQ;
import com.intellihealth.truemeds.data.repository.datasource.local.entity.SearchCategory;
import com.intellihealth.truemeds.data.repository.datasource.local.entity.SubOptReasons;
import com.intellihealth.truemeds.data.repository.datasource.local.entity.TmContactVersion;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class TruemedsDao_Impl implements TruemedsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<CartMedicine> __insertionAdapterOfCartMedicine;

  private final EntityInsertionAdapter<OrgSubsInfo> __insertionAdapterOfOrgSubsInfo;

  private final EntityInsertionAdapter<ReorderAlternateSubs> __insertionAdapterOfReorderAlternateSubs;

  private final EntityInsertionAdapter<ReferReminder> __insertionAdapterOfReferReminder;

  private final EntityInsertionAdapter<PillReminder> __insertionAdapterOfPillReminder;

  private final EntityInsertionAdapter<SaveVideoFAQ> __insertionAdapterOfSaveVideoFAQ;

  private final EntityInsertionAdapter<TmContactVersion> __insertionAdapterOfTmContactVersion;

  private final EntityInsertionAdapter<RecentMedicine> __insertionAdapterOfRecentMedicine;

  private final EntityInsertionAdapter<CartItemSequence> __insertionAdapterOfCartItemSequence;

  private final EntityInsertionAdapter<SubOptReasons> __insertionAdapterOfSubOptReasons;

  private final EntityInsertionAdapter<CartReplaceStatus> __insertionAdapterOfCartReplaceStatus;

  private final EntityInsertionAdapter<AddedCrossSelling> __insertionAdapterOfAddedCrossSelling;

  private final EntityInsertionAdapter<SearchCategory> __insertionAdapterOfSearchCategory;

  private final EntityInsertionAdapter<DoctorConfirmationSubOptions> __insertionAdapterOfDoctorConfirmationSubOptions;

  private final EntityInsertionAdapter<OrderTicket> __insertionAdapterOfOrderTicket;

  private final EntityInsertionAdapter<ProductImage> __insertionAdapterOfProductImage;

  private final EntityInsertionAdapter<CustomerCategory> __insertionAdapterOfCustomerCategory;

  private final EntityInsertionAdapter<CustomerDetails> __insertionAdapterOfCustomerDetails;

  private final EntityInsertionAdapter<OrderFilter> __insertionAdapterOfOrderFilter;

  private final EntityInsertionAdapter<CartItemSellingPrice> __insertionAdapterOfCartItemSellingPrice;

  private final EntityInsertionAdapter<ItemAddedEventAttributes> __insertionAdapterOfItemAddedEventAttributes;

  private final EntityInsertionAdapter<PatientNameEntity> __insertionAdapterOfPatientNameEntity;

  private final EntityInsertionAdapter<AddedReorderCrossSelling> __insertionAdapterOfAddedReorderCrossSelling;

  private final SharedSQLiteStatement __preparedStmtOfInsertReplaceMed;

  private final SharedSQLiteStatement __preparedStmtOfInsertSwitchToOrgMed;

  private final SharedSQLiteStatement __preparedStmtOfInsertOrgSubFromCart;

  private final SharedSQLiteStatement __preparedStmtOfDeletePatientNameEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteCartItemSellingPrice;

  private final SharedSQLiteStatement __preparedStmtOfDeleteSubOptReasons;

  private final SharedSQLiteStatement __preparedStmtOfDeleteOrderFilter;

  private final SharedSQLiteStatement __preparedStmtOfDeleteCustomerCategory;

  private final SharedSQLiteStatement __preparedStmtOfDeleteCustomerCategory_1;

  private final SharedSQLiteStatement __preparedStmtOfDeleteProductImage;

  private final SharedSQLiteStatement __preparedStmtOfDeleteOrderTicket;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAddedCrossSelling;

  private final SharedSQLiteStatement __preparedStmtOfDeleteDoctorConfirmationSubOptions;

  private final SharedSQLiteStatement __preparedStmtOfDeleteSaveVideoFAQ;

  private final SharedSQLiteStatement __preparedStmtOfDeleteReferReminder;

  private final SharedSQLiteStatement __preparedStmtOfDeletePillReminder;

  private final SharedSQLiteStatement __preparedStmtOfDeleteCustomerDetails;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllRecentSearch;

  private final SharedSQLiteStatement __preparedStmtOfRemoveAddedMedicineFromCart;

  private final SharedSQLiteStatement __preparedStmtOfRemoveCartItemPrice;

  private final SharedSQLiteStatement __preparedStmtOfRemoveOrgSubsMedicineFromCart;

  private final SharedSQLiteStatement __preparedStmtOfClearCartTable;

  private final SharedSQLiteStatement __preparedStmtOfClearOrgSubsTable;

  private final SharedSQLiteStatement __preparedStmtOfClearReorderAltSubsTable;

  private final SharedSQLiteStatement __preparedStmtOfDeleteCartReplaceStatus;

  private final SharedSQLiteStatement __preparedStmtOfDeleteCartReplaceStatus_1;

  private final SharedSQLiteStatement __preparedStmtOfClearCrossSellingTable;

  private final SharedSQLiteStatement __preparedStmtOfDeleteCartItemSequence;

  private final SharedSQLiteStatement __preparedStmtOfDeleteReorderMedItem;

  private final SharedSQLiteStatement __preparedStmtOfDeleteSearchCategory;

  private final SharedSQLiteStatement __preparedStmtOfDeleteCrossSellingUsingId;

  private final SharedSQLiteStatement __preparedStmtOfDeleteOrderTicketFromMedId;

  private final SharedSQLiteStatement __preparedStmtOfDeleteTmContactVersion;

  private final SharedSQLiteStatement __preparedStmtOfUpdateImageAndDrugTypeInRecentlySearch;

  private final SharedSQLiteStatement __preparedStmtOfUpdateTimeInRecentlySearch;

  private final SharedSQLiteStatement __preparedStmtOfUpdateAddedMedicine;

  private final SharedSQLiteStatement __preparedStmtOfUpdateOrgSubInfoMedicine;

  private final SharedSQLiteStatement __preparedStmtOfUpdateOrgAvailableInAddedMedicine;

  private final SharedSQLiteStatement __preparedStmtOfUpdateProductDetailIdnAddedMedicine;

  private final SharedSQLiteStatement __preparedStmtOfUpdateProductImageInAddedMedicine;

  private final SharedSQLiteStatement __preparedStmtOfUpdateSubsImageInReorder;

  private final SharedSQLiteStatement __preparedStmtOfUpdateAltSubsImageInReorder;

  private final SharedSQLiteStatement __preparedStmtOfUpdatePrevOrderId;

  private final SharedSQLiteStatement __preparedStmtOfUpdateSubsMedProductCode;

  private final SharedSQLiteStatement __preparedStmtOfUpdatePrevOrgProductId;

  private final SharedSQLiteStatement __preparedStmtOfUpdateProductDetailsId;

  private final SharedSQLiteStatement __preparedStmtOfUpdateAltSubsAvailableInReorder;

  private final SharedSQLiteStatement __preparedStmtOfUpdateSubsAvailableInReorder;

  private final SharedSQLiteStatement __preparedStmtOfUpdateOrgDisabledInReorder;

  private final SharedSQLiteStatement __preparedStmtOfUpdateSubsPitchedInReorder;

  private final SharedSQLiteStatement __preparedStmtOfUpdateCxAcceptedSubsInReorder;

  private final SharedSQLiteStatement __preparedStmtOfUpdateCxKeepOriginalInReorder;

  private final SharedSQLiteStatement __preparedStmtOfUpdateOrgCompanyAddressInAddedMad;

  private final SharedSQLiteStatement __preparedStmtOfUpdateOrgDetailsInAddedMed;

  private final SharedSQLiteStatement __preparedStmtOfUpdateOrgAndSubDetailsInAddedMed;

  private final SharedSQLiteStatement __preparedStmtOfUpdateAltSubsDiscountPercentageInReorder;

  private final SharedSQLiteStatement __preparedStmtOfUpdateAltSubsSellingPriceInReorder;

  private final SharedSQLiteStatement __preparedStmtOfUpdateAltSubsMrpInReorder;

  private final SharedSQLiteStatement __preparedStmtOfUpdateColdChainInReorder;

  private final SharedSQLiteStatement __preparedStmtOfUpdateOrderAddressInReorder;

  private final SharedSQLiteStatement __preparedStmtOfUpdateIsReplaceInReorder;

  private final SharedSQLiteStatement __preparedStmtOfUpdateMrpOfAddedMedicine;

  private final SharedSQLiteStatement __preparedStmtOfUpdateDiscountOfAddedMedicine;

  private final SharedSQLiteStatement __preparedStmtOfUpdateOrgAddedQuantityInReorder;

  private final SharedSQLiteStatement __preparedStmtOfUpdateShowOnlyOrgInReorder;

  private final SharedSQLiteStatement __preparedStmtOfUpdateDescriptionInOrderTicket;

  private final SharedSQLiteStatement __preparedStmtOfUpdateProductImage;

  private final SharedSQLiteStatement __preparedStmtOfUpdateSellingPriceInCart;

  private final SharedSQLiteStatement __preparedStmtOfDeleteItemAddedAttribute;

  private final SharedSQLiteStatement __preparedStmtOfClearItemAddedAttributes;

  public TruemedsDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCartMedicine = new EntityInsertionAdapter<CartMedicine>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `addedMedsTable12` (`id`,`medicineId`,`medicineName`,`companyName`,`discount`,`mrp`,`addedQty`,`composition`,`subDiscountPercentage`,`subsSellingPrice`,`isSubFound`,`isFromApi`,`subsMedProductCode`,`subsMrp`,`subsMedName`,`subCompanyName`,`isColdStorage`,`drugType`,`originalPackSize`,`substitutePackSize`,`prescriptionRequired`,`maxCapped`,`subsReccommendedQty`,`originalCountryNm`,`subs_country_nm`,`subs_unit`,`original_unit`,`product_image_urls`,`original_company_addr`,`orgAvailable`,`productDetailsId`,`prevOrderId`,`prevOrgProductId`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final CartMedicine entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindLong(1, entity.getId());
        }
        if (entity.getMedicineId() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getMedicineId());
        }
        if (entity.getMedicineName() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getMedicineName());
        }
        if (entity.getCompanyName() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getCompanyName());
        }
        statement.bindDouble(5, entity.getDiscount());
        statement.bindDouble(6, entity.getMrp());
        statement.bindLong(7, entity.getAddedQty());
        if (entity.getComposition() == null) {
          statement.bindNull(8);
        } else {
          statement.bindString(8, entity.getComposition());
        }
        if (entity.getSubsDiscountPercentage() == null) {
          statement.bindNull(9);
        } else {
          statement.bindString(9, entity.getSubsDiscountPercentage());
        }
        statement.bindDouble(10, entity.getSubsSellingPrice());
        final int _tmp = entity.getSubsFound() ? 1 : 0;
        statement.bindLong(11, _tmp);
        final int _tmp_1 = entity.getFromApi() ? 1 : 0;
        statement.bindLong(12, _tmp_1);
        if (entity.getSubsMedProductCode() == null) {
          statement.bindNull(13);
        } else {
          statement.bindString(13, entity.getSubsMedProductCode());
        }
        statement.bindDouble(14, entity.getSubsMrp());
        if (entity.getSubsMedName() == null) {
          statement.bindNull(15);
        } else {
          statement.bindString(15, entity.getSubsMedName());
        }
        if (entity.getSubCompanyName() == null) {
          statement.bindNull(16);
        } else {
          statement.bindString(16, entity.getSubCompanyName());
        }
        final int _tmp_2 = entity.getColdStorage() ? 1 : 0;
        statement.bindLong(17, _tmp_2);
        if (entity.getDrugType() == null) {
          statement.bindNull(18);
        } else {
          statement.bindString(18, entity.getDrugType());
        }
        statement.bindDouble(19, entity.getOriginalPackSize());
        statement.bindDouble(20, entity.getSubstitutePackSize());
        final int _tmp_3 = entity.getRxRequired() ? 1 : 0;
        statement.bindLong(21, _tmp_3);
        statement.bindLong(22, entity.getMaxCapped());
        statement.bindLong(23, entity.getSubsRecommendedQty());
        if (entity.getOriginalCountryNm() == null) {
          statement.bindNull(24);
        } else {
          statement.bindString(24, entity.getOriginalCountryNm());
        }
        if (entity.getSubsCountryNm() == null) {
          statement.bindNull(25);
        } else {
          statement.bindString(25, entity.getSubsCountryNm());
        }
        if (entity.getSubsUnit() == null) {
          statement.bindNull(26);
        } else {
          statement.bindString(26, entity.getSubsUnit());
        }
        if (entity.getOriginalUnit() == null) {
          statement.bindNull(27);
        } else {
          statement.bindString(27, entity.getOriginalUnit());
        }
        if (entity.getProductImageUrls() == null) {
          statement.bindNull(28);
        } else {
          statement.bindString(28, entity.getProductImageUrls());
        }
        if (entity.getOriginalCompanyAddress() == null) {
          statement.bindNull(29);
        } else {
          statement.bindString(29, entity.getOriginalCompanyAddress());
        }
        final int _tmp_4 = entity.getOrgAvailable() ? 1 : 0;
        statement.bindLong(30, _tmp_4);
        statement.bindLong(31, entity.getProductDetailsId());
        statement.bindLong(32, entity.getPrevOrderId());
        statement.bindLong(33, entity.getPrevOrgProductId());
      }
    };
    this.__insertionAdapterOfOrgSubsInfo = new EntityInsertionAdapter<OrgSubsInfo>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `addedSubsOrgInfo` (`id`,`medicineId`,`medicineName`,`companyName`,`discount`,`mrp`,`addedQty`,`composition`,`subDiscountPercentage`,`subsSellingPrice`,`isSubFound`,`isFromApi`,`subsMedProductCode`,`subsMrp`,`subsMedName`,`subCompanyName`,`isColdStorage`,`drugType`,`originalPackSize`,`substitutePackSize`,`prescriptionRequired`,`maxCapped`,`subsReccommendedQty`,`originalCountryNm`,`subs_country_nm`,`subs_unit`,`original_unit`,`product_image_urls`,`original_company_addr`,`orgAvailable`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final OrgSubsInfo entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindLong(1, entity.getId());
        }
        if (entity.getMedicineId() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getMedicineId());
        }
        if (entity.getMedicineName() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getMedicineName());
        }
        if (entity.getCompanyName() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getCompanyName());
        }
        statement.bindDouble(5, entity.getDiscount());
        statement.bindDouble(6, entity.getMrp());
        statement.bindLong(7, entity.getAddedQty());
        if (entity.getComposition() == null) {
          statement.bindNull(8);
        } else {
          statement.bindString(8, entity.getComposition());
        }
        if (entity.getSubsDiscountPercentage() == null) {
          statement.bindNull(9);
        } else {
          statement.bindString(9, entity.getSubsDiscountPercentage());
        }
        statement.bindDouble(10, entity.getSubsSellingPrice());
        final int _tmp = entity.getSubsFound() ? 1 : 0;
        statement.bindLong(11, _tmp);
        final int _tmp_1 = entity.getFromApi() ? 1 : 0;
        statement.bindLong(12, _tmp_1);
        if (entity.getSubsMedProductCode() == null) {
          statement.bindNull(13);
        } else {
          statement.bindString(13, entity.getSubsMedProductCode());
        }
        statement.bindDouble(14, entity.getSubsMrp());
        if (entity.getSubsMedName() == null) {
          statement.bindNull(15);
        } else {
          statement.bindString(15, entity.getSubsMedName());
        }
        if (entity.getSubCompanyName() == null) {
          statement.bindNull(16);
        } else {
          statement.bindString(16, entity.getSubCompanyName());
        }
        final int _tmp_2 = entity.getColdStorage() ? 1 : 0;
        statement.bindLong(17, _tmp_2);
        if (entity.getDrugType() == null) {
          statement.bindNull(18);
        } else {
          statement.bindString(18, entity.getDrugType());
        }
        statement.bindDouble(19, entity.getOriginalPackSize());
        statement.bindDouble(20, entity.getSubstitutePackSize());
        final int _tmp_3 = entity.getRxRequired() ? 1 : 0;
        statement.bindLong(21, _tmp_3);
        statement.bindLong(22, entity.getMaxCapped());
        statement.bindLong(23, entity.getSubsRecommendedQty());
        if (entity.getOriginalCountryNm() == null) {
          statement.bindNull(24);
        } else {
          statement.bindString(24, entity.getOriginalCountryNm());
        }
        if (entity.getSubsCountryNm() == null) {
          statement.bindNull(25);
        } else {
          statement.bindString(25, entity.getSubsCountryNm());
        }
        if (entity.getSubsUnit() == null) {
          statement.bindNull(26);
        } else {
          statement.bindString(26, entity.getSubsUnit());
        }
        if (entity.getOriginalUnit() == null) {
          statement.bindNull(27);
        } else {
          statement.bindString(27, entity.getOriginalUnit());
        }
        if (entity.getProductImageUrls() == null) {
          statement.bindNull(28);
        } else {
          statement.bindString(28, entity.getProductImageUrls());
        }
        if (entity.getOriginalCompanyAddress() == null) {
          statement.bindNull(29);
        } else {
          statement.bindString(29, entity.getOriginalCompanyAddress());
        }
        final int _tmp_4 = entity.getOrgAvailable() ? 1 : 0;
        statement.bindLong(30, _tmp_4);
      }
    };
    this.__insertionAdapterOfReorderAlternateSubs = new EntityInsertionAdapter<ReorderAlternateSubs>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `reorder_alternate_subs` (`id`,`medicineId`,`patientID`,`patientName`,`orderAddress`,`addressID`,`orderID`,`SubsMedProductCode`,`isSubAvailable`,`subImageUrl`,`orgAddedQuantity`,`altSubsMedProductCode`,`altSubsDiscountPercentage`,`altSubsSellingPrice`,`altSubsMrp`,`altSubsMedName`,`altSubsCompanyName`,`isAltSubsColdStorage`,`altSubsDrugType`,`altSubsRecommendedQty`,`altSubsCountryName`,`altSubsUnit`,`altSubsImageUrl`,`altSubsCompanyAddress`,`isReplace`,`subsPitched`,`altSubsPackSize`,`altSubsSavingPercentage`,`coldChainDisabled`,`isAltSubAvailable`,`isOrgDisabled`,`cxAcceptedSubs`,`cxKeepOriginal`,`showOnlyOrg`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final ReorderAlternateSubs entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindLong(1, entity.getId());
        }
        if (entity.getMedicineId() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getMedicineId());
        }
        statement.bindLong(3, entity.getPatientId());
        if (entity.getPatientName() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getPatientName());
        }
        if (entity.getOrderAddress() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getOrderAddress());
        }
        statement.bindLong(6, entity.getAddressId());
        statement.bindLong(7, entity.getOrderId());
        if (entity.getSubsMedProductCode() == null) {
          statement.bindNull(8);
        } else {
          statement.bindString(8, entity.getSubsMedProductCode());
        }
        final Integer _tmp = entity.getSubAvailable() == null ? null : (entity.getSubAvailable() ? 1 : 0);
        if (_tmp == null) {
          statement.bindNull(9);
        } else {
          statement.bindLong(9, _tmp);
        }
        if (entity.getProductImageUrls() == null) {
          statement.bindNull(10);
        } else {
          statement.bindString(10, entity.getProductImageUrls());
        }
        statement.bindLong(11, entity.getAddedQty());
        if (entity.getAltSubsMedProductCode() == null) {
          statement.bindNull(12);
        } else {
          statement.bindString(12, entity.getAltSubsMedProductCode());
        }
        statement.bindDouble(13, entity.getAltSubsDiscountPercentage());
        statement.bindDouble(14, entity.getAltSubsSellingPrice());
        statement.bindDouble(15, entity.getAltSubsMrp());
        if (entity.getAltSubsMedName() == null) {
          statement.bindNull(16);
        } else {
          statement.bindString(16, entity.getAltSubsMedName());
        }
        if (entity.getAltSubsCompanyName() == null) {
          statement.bindNull(17);
        } else {
          statement.bindString(17, entity.getAltSubsCompanyName());
        }
        final int _tmp_1 = entity.getAltSubsColdStorage() ? 1 : 0;
        statement.bindLong(18, _tmp_1);
        if (entity.getAltSubsDrugType() == null) {
          statement.bindNull(19);
        } else {
          statement.bindString(19, entity.getAltSubsDrugType());
        }
        statement.bindLong(20, entity.getAltSubsRecommendedQty());
        if (entity.getAltSubsCountryName() == null) {
          statement.bindNull(21);
        } else {
          statement.bindString(21, entity.getAltSubsCountryName());
        }
        if (entity.getAltSubsUnit() == null) {
          statement.bindNull(22);
        } else {
          statement.bindString(22, entity.getAltSubsUnit());
        }
        if (entity.getAltSubsImageUrl() == null) {
          statement.bindNull(23);
        } else {
          statement.bindString(23, entity.getAltSubsImageUrl());
        }
        if (entity.getAltSubsCompanyAddress() == null) {
          statement.bindNull(24);
        } else {
          statement.bindString(24, entity.getAltSubsCompanyAddress());
        }
        final int _tmp_2 = entity.getReplace() ? 1 : 0;
        statement.bindLong(25, _tmp_2);
        final int _tmp_3 = entity.getSubsPitched() ? 1 : 0;
        statement.bindLong(26, _tmp_3);
        statement.bindDouble(27, entity.getAltSubsPackSize());
        if (entity.getAltSubsSavingPercentage() == null) {
          statement.bindNull(28);
        } else {
          statement.bindString(28, entity.getAltSubsSavingPercentage());
        }
        final int _tmp_4 = entity.getColdChainDisabled() ? 1 : 0;
        statement.bindLong(29, _tmp_4);
        final int _tmp_5 = entity.getAltSubAvailable() ? 1 : 0;
        statement.bindLong(30, _tmp_5);
        final int _tmp_6 = entity.getOrgDisabled() ? 1 : 0;
        statement.bindLong(31, _tmp_6);
        final int _tmp_7 = entity.getCxAcceptedSubs() ? 1 : 0;
        statement.bindLong(32, _tmp_7);
        final int _tmp_8 = entity.getCxKeepOriginal() ? 1 : 0;
        statement.bindLong(33, _tmp_8);
        final int _tmp_9 = entity.getShowOnlyOrg() ? 1 : 0;
        statement.bindLong(34, _tmp_9);
      }
    };
    this.__insertionAdapterOfReferReminder = new EntityInsertionAdapter<ReferReminder>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `refferReminder` (`id`,`mobile`,`referTime`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final ReferReminder entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getMobile() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getMobile());
        }
        statement.bindLong(3, entity.getReferTime());
      }
    };
    this.__insertionAdapterOfPillReminder = new EntityInsertionAdapter<PillReminder>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `savePillReminder` (`od`,`orderId`,`patientId`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final PillReminder entity) {
        statement.bindLong(1, entity.getId());
        statement.bindLong(2, entity.getOrderId());
        if (entity.getPatientId() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getPatientId());
        }
      }
    };
    this.__insertionAdapterOfSaveVideoFAQ = new EntityInsertionAdapter<SaveVideoFAQ>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `saveVideoFaq` (`id`,`orderId`,`patientId`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final SaveVideoFAQ entity) {
        statement.bindLong(1, entity.getId());
        statement.bindLong(2, entity.getOrderId());
        if (entity.getPatientId() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getPatientId());
        }
      }
    };
    this.__insertionAdapterOfTmContactVersion = new EntityInsertionAdapter<TmContactVersion>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `TmContactVersion` (`id`,`contactName`,`version`) VALUES (?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final TmContactVersion entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindLong(1, entity.getId());
        }
        if (entity.getContactName() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getContactName());
        }
        statement.bindDouble(3, entity.getVersion());
      }
    };
    this.__insertionAdapterOfRecentMedicine = new EntityInsertionAdapter<RecentMedicine>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `recentlySearched` (`id`,`medicineName`,`productCode`,`iconType`,`customerId`,`addedDateTime`,`elastic_search_type`,`showHistoryIcon`,`productImage`,`drugType`) VALUES (?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final RecentMedicine entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindLong(1, entity.getId());
        }
        if (entity.getMedicineName() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getMedicineName());
        }
        if (entity.getProductCode() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getProductCode());
        }
        statement.bindLong(4, entity.getIconType());
        if (entity.getCustomerId() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getCustomerId());
        }
        statement.bindLong(6, entity.getAddedDateTime());
        if (entity.getKeyName() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getKeyName());
        }
        final int _tmp = entity.getShowHistoryIcon() ? 1 : 0;
        statement.bindLong(8, _tmp);
        if (entity.getProductImage() == null) {
          statement.bindNull(9);
        } else {
          statement.bindString(9, entity.getProductImage());
        }
        if (entity.getDrugType() == null) {
          statement.bindNull(10);
        } else {
          statement.bindString(10, entity.getDrugType());
        }
      }
    };
    this.__insertionAdapterOfCartItemSequence = new EntityInsertionAdapter<CartItemSequence>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `cartItemSequence` (`id`,`medicineId`,`sequence`) VALUES (?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final CartItemSequence entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindLong(1, entity.getId());
        }
        if (entity.getMedicineId() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getMedicineId());
        }
        statement.bindLong(3, entity.getSequence());
      }
    };
    this.__insertionAdapterOfSubOptReasons = new EntityInsertionAdapter<SubOptReasons>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `sub_opt_reasons` (`id`,`reasonId`,`name`,`value`) VALUES (?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final SubOptReasons entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindLong(1, entity.getId());
        }
        if (entity.getReasonId() == null) {
          statement.bindNull(2);
        } else {
          statement.bindLong(2, entity.getReasonId());
        }
        if (entity.getName() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getName());
        }
        if (entity.getValue() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getValue());
        }
      }
    };
    this.__insertionAdapterOfCartReplaceStatus = new EntityInsertionAdapter<CartReplaceStatus>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `cartReplaceStatus` (`id`,`medicineId`,`isAutoReplace`) VALUES (?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final CartReplaceStatus entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindLong(1, entity.getId());
        }
        if (entity.getMedicineId() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getMedicineId());
        }
        final int _tmp = entity.isAutoReplace() ? 1 : 0;
        statement.bindLong(3, _tmp);
      }
    };
    this.__insertionAdapterOfAddedCrossSelling = new EntityInsertionAdapter<AddedCrossSelling>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `AddedCrossSelling` (`id`,`ProductCode`) VALUES (?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final AddedCrossSelling entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindLong(1, entity.getId());
        }
        if (entity.getProductCode() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getProductCode());
        }
      }
    };
    this.__insertionAdapterOfSearchCategory = new EntityInsertionAdapter<SearchCategory>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `search_category` (`id`,`key_name`,`key_value`) VALUES (?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final SearchCategory entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindLong(1, entity.getId());
        }
        if (entity.getKeyName() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getKeyName());
        }
        if (entity.getKeyValue() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getKeyValue());
        }
      }
    };
    this.__insertionAdapterOfDoctorConfirmationSubOptions = new EntityInsertionAdapter<DoctorConfirmationSubOptions>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `doctor_confirmation_sub_options` (`id`,`key_name`,`key_value`,`reasonId`) VALUES (?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final DoctorConfirmationSubOptions entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindLong(1, entity.getId());
        }
        if (entity.getKeyName() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getKeyName());
        }
        if (entity.getKeyValue() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getKeyValue());
        }
        statement.bindLong(4, entity.getReasonId());
      }
    };
    this.__insertionAdapterOfOrderTicket = new EntityInsertionAdapter<OrderTicket>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `raise_ticket` (`id`,`issueId`,`description`,`orderProductName`,`medicineId`,`orderProductQty`,`orderProductPrice`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final OrderTicket entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindLong(1, entity.getId());
        }
        statement.bindLong(2, entity.getIssueId());
        if (entity.getDescription() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getDescription());
        }
        if (entity.getOrderProductName() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getOrderProductName());
        }
        if (entity.getMedicineId() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getMedicineId());
        }
        statement.bindLong(6, entity.getOrderProductQty());
        statement.bindDouble(7, entity.getOrderProductPrice());
      }
    };
    this.__insertionAdapterOfProductImage = new EntityInsertionAdapter<ProductImage>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `productImage` (`id`,`productCode`,`images`,`addedDateTime`) VALUES (?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final ProductImage entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindLong(1, entity.getId());
        }
        if (entity.getProductCode() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getProductCode());
        }
        if (entity.getImages() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getImages());
        }
        statement.bindLong(4, entity.getAddedDateTime());
      }
    };
    this.__insertionAdapterOfCustomerCategory = new EntityInsertionAdapter<CustomerCategory>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `customer_category` (`id`,`categoryType`,`category`) VALUES (?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final CustomerCategory entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindLong(1, entity.getId());
        }
        if (entity.getCategoryType() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getCategoryType());
        }
        if (entity.getCategory() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getCategory());
        }
      }
    };
    this.__insertionAdapterOfCustomerDetails = new EntityInsertionAdapter<CustomerDetails>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `customer_details` (`customerId`,`mobileNo`,`emailAddress`,`profileImageUrl`,`customerName`,`genderName`,`age`,`languageId`,`customerLastName`) VALUES (?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final CustomerDetails entity) {
        if (entity.getCustomerId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindLong(1, entity.getCustomerId());
        }
        if (entity.getMobileNo() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getMobileNo());
        }
        if (entity.getEmailAddress() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getEmailAddress());
        }
        if (entity.getProfileImageUrl() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getProfileImageUrl());
        }
        if (entity.getCustomerName() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getCustomerName());
        }
        if (entity.getGenderName() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getGenderName());
        }
        if (entity.getAge() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getAge());
        }
        if (entity.getLanguageId() == null) {
          statement.bindNull(8);
        } else {
          statement.bindLong(8, entity.getLanguageId());
        }
        if (entity.getCustomerLastName() == null) {
          statement.bindNull(9);
        } else {
          statement.bindString(9, entity.getCustomerLastName());
        }
      }
    };
    this.__insertionAdapterOfOrderFilter = new EntityInsertionAdapter<OrderFilter>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `OrderFilter` (`id`,`name`,`displayName`) VALUES (?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final OrderFilter entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindLong(1, entity.getId());
        }
        if (entity.getName() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getName());
        }
        if (entity.getDisplayName() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getDisplayName());
        }
      }
    };
    this.__insertionAdapterOfCartItemSellingPrice = new EntityInsertionAdapter<CartItemSellingPrice>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `cart_item_price` (`productCode`,`sellingPrice`) VALUES (?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final CartItemSellingPrice entity) {
        if (entity.getProductCode() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getProductCode());
        }
        statement.bindDouble(2, entity.getSellingPrice());
      }
    };
    this.__insertionAdapterOfItemAddedEventAttributes = new EntityInsertionAdapter<ItemAddedEventAttributes>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `item_added_attributes` (`id`,`productCode`,`clicked_on_page`,`page_section`,`section_heading`,`section_index`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final ItemAddedEventAttributes entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindLong(1, entity.getId());
        }
        if (entity.getProductCode() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getProductCode());
        }
        if (entity.getClickedPage() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getClickedPage());
        }
        if (entity.getPageSection() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getPageSection());
        }
        if (entity.getSectionHeading() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getSectionHeading());
        }
        statement.bindLong(6, entity.getSectionIndex());
      }
    };
    this.__insertionAdapterOfPatientNameEntity = new EntityInsertionAdapter<PatientNameEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `patientName` (`id`,`PatientName`,`SaveDate`) VALUES (?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final PatientNameEntity entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindLong(1, entity.getId());
        }
        if (entity.getPatientName() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getPatientName());
        }
        if (entity.getDate() == null) {
          statement.bindNull(3);
        } else {
          statement.bindLong(3, entity.getDate());
        }
      }
    };
    this.__insertionAdapterOfAddedReorderCrossSelling = new EntityInsertionAdapter<AddedReorderCrossSelling>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `addedReorderCrossSelling` (`id`,`ProductCode`) VALUES (?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final AddedReorderCrossSelling entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindLong(1, entity.getId());
        }
        if (entity.getProductCode() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getProductCode());
        }
      }
    };
    this.__preparedStmtOfInsertReplaceMed = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "INSERT INTO addedSubsOrgInfo SELECT id, medicineId, medicineName, companyName, discount, mrp, addedQty, composition,  ? AS subDiscountPercentage,  ? AS subsSellingPrice, isSubFound, isFromApi,  ? AS subsMedProductCode, ? AS subsMrp, ? AS subsMedName, ? AS subCompanyName, isColdStorage ,drugType, originalPackSize, substitutePackSize, prescriptionRequired, maxCapped, subsReccommendedQty, originalCountryNm, subs_country_nm, subs_unit, original_unit, product_image_urls, original_company_addr, orgAvailable FROM addedMedsTable12 WHERE medicineId = ? ";
        return _query;
      }
    };
    this.__preparedStmtOfInsertSwitchToOrgMed = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "INSERT INTO addedMedsTable12 SELECT null, medicineId, medicineName, companyName, discount, mrp, addedQty, composition, subDiscountPercentage, subsSellingPrice, \n"
                + "isSubFound, isFromApi, subsMedProductCode,subsMrp, subsMedName, subCompanyName, isColdStorage, drugType, originalPackSize, \n"
                + "substitutePackSize, prescriptionRequired, maxCapped, subsReccommendedQty, originalCountryNm, subs_country_nm, subs_unit, original_unit, \n"
                + "product_image_urls,original_company_addr, orgAvailable, ? AS productDetailsId, ? AS prevOrderId, ? AS prevOrgProductId  FROM addedSubsOrgInfo  WHERE subsMedProductCode = ? ";
        return _query;
      }
    };
    this.__preparedStmtOfInsertOrgSubFromCart = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "INSERT INTO addedSubsOrgInfo SELECT null, medicineId,medicineName,companyName,discount,mrp,addedQty,composition,subDiscountPercentage,subsSellingPrice,isSubFound,isFromApi,subsMedProductCode,subsMrp,subsMedName,subCompanyName,isColdStorage,drugType,originalPackSize,substitutePackSize,prescriptionRequired,maxCapped,subsReccommendedQty,originalCountryNm,subs_country_nm,subs_unit,original_unit, product_image_urls, original_company_addr, orgAvailable FROM addedMedsTable12 WHERE medicineId = ? ";
        return _query;
      }
    };
    this.__preparedStmtOfDeletePatientNameEntity = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "delete from patientName";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteCartItemSellingPrice = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "delete from cart_item_price";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteSubOptReasons = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "delete from sub_opt_reasons";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteOrderFilter = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "delete from OrderFilter";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteCustomerCategory = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "delete from customer_category";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteCustomerCategory_1 = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "delete from customer_category where categoryType = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteProductImage = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "delete from productImage";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteOrderTicket = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "delete from raise_ticket";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAddedCrossSelling = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "delete from AddedCrossSelling";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteDoctorConfirmationSubOptions = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "delete from doctor_confirmation_sub_options";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteSaveVideoFAQ = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "delete from saveVideoFaq";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteReferReminder = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "delete from refferReminder";
        return _query;
      }
    };
    this.__preparedStmtOfDeletePillReminder = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "delete from savePillReminder";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteCustomerDetails = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "delete from customer_details";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAllRecentSearch = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "delete from recentlySearched";
        return _query;
      }
    };
    this.__preparedStmtOfRemoveAddedMedicineFromCart = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "delete from addedMedsTable12 where medicineId = ?";
        return _query;
      }
    };
    this.__preparedStmtOfRemoveCartItemPrice = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "delete from cart_item_price where productCode = ?";
        return _query;
      }
    };
    this.__preparedStmtOfRemoveOrgSubsMedicineFromCart = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "delete from addedSubsOrgInfo where subsMedProductCode= ? ";
        return _query;
      }
    };
    this.__preparedStmtOfClearCartTable = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "delete from addedMedsTable12";
        return _query;
      }
    };
    this.__preparedStmtOfClearOrgSubsTable = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "delete from addedSubsOrgInfo";
        return _query;
      }
    };
    this.__preparedStmtOfClearReorderAltSubsTable = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "delete from reorder_alternate_subs";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteCartReplaceStatus = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "delete from cartReplaceStatus";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteCartReplaceStatus_1 = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "delete from cartReplaceStatus where medicineId = ? ";
        return _query;
      }
    };
    this.__preparedStmtOfClearCrossSellingTable = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "delete from addedcrossselling";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteCartItemSequence = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM cartItemSequence";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteReorderMedItem = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "delete from reorder_alternate_subs where medicineId= ? ";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteSearchCategory = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "delete from search_category";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteCrossSellingUsingId = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "delete from AddedCrossSelling where ProductCode = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteOrderTicketFromMedId = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "delete from raise_ticket where medicineId = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteTmContactVersion = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "delete from TmContactVersion";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateImageAndDrugTypeInRecentlySearch = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "UPDATE recentlySearched SET productImage = ?, drugType = ? WHERE productCode =?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateTimeInRecentlySearch = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "UPDATE recentlySearched SET addedDateTime = ? WHERE medicineName = ? ";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateAddedMedicine = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "update addedMedsTable12 set addedQty = ? where medicineId = ? ";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateOrgSubInfoMedicine = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "update addedSubsOrgInfo set addedQty = ? where medicineId = ? ";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateOrgAvailableInAddedMedicine = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "update addedMedsTable12 set orgAvailable = ?  where medicineId = ? ";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateProductDetailIdnAddedMedicine = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "update addedMedsTable12 set productDetailsId = ?  where medicineId = ? ";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateProductImageInAddedMedicine = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "update addedMedsTable12 set product_image_urls = ?  where medicineId = ? ";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateSubsImageInReorder = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "update reorder_alternate_subs set subImageUrl = ?  where SubsMedProductCode = ? ";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateAltSubsImageInReorder = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "update reorder_alternate_subs set altSubsImageUrl = ?  where altSubsMedProductCode = ? ";
        return _query;
      }
    };
    this.__preparedStmtOfUpdatePrevOrderId = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "update addedMedsTable12 set prevOrderId = ? where medicineId = ? ";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateSubsMedProductCode = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "update addedMedsTable12 set subsMedProductCode = ? where medicineId = ? ";
        return _query;
      }
    };
    this.__preparedStmtOfUpdatePrevOrgProductId = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "update addedMedsTable12 set prevOrgProductId = ? where medicineId = ? ";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateProductDetailsId = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "update addedMedsTable12 set productDetailsId = ? where medicineId = ? ";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateAltSubsAvailableInReorder = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "update reorder_alternate_subs set isAltSubAvailable = ? where medicineId = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateSubsAvailableInReorder = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "update reorder_alternate_subs set isSubAvailable = ? where medicineId = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateOrgDisabledInReorder = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "update reorder_alternate_subs set isOrgDisabled = ? where medicineId = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateSubsPitchedInReorder = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "update reorder_alternate_subs set subsPitched = ? where medicineId = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateCxAcceptedSubsInReorder = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "update reorder_alternate_subs set cxAcceptedSubs = ? where medicineId = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateCxKeepOriginalInReorder = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "update reorder_alternate_subs set cxKeepOriginal =? where medicineId = ? ";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateOrgCompanyAddressInAddedMad = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "update addedMedsTable12 set original_company_addr = ? where medicineId = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateOrgDetailsInAddedMed = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "update addedMedsTable12 set mrp = ? , discount = ? , orgAvailable = ?  where medicineId = ? ";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateOrgAndSubDetailsInAddedMed = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "update addedMedsTable12 set mrp = ? , discount = ? , subDiscountPercentage = ? , subsSellingPrice = ? , subsMedProductCode = ? , subsMrp = ? , subsMedName = ? , subCompanyName = ? , substitutePackSize = ? , subsReccommendedQty = ?  where medicineId = ? ";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateAltSubsDiscountPercentageInReorder = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "update reorder_alternate_subs set altSubsDiscountPercentage = ?  where medicineId = ? ";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateAltSubsSellingPriceInReorder = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "update reorder_alternate_subs set altSubsSellingPrice = ?  where medicineId = ? ";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateAltSubsMrpInReorder = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "update reorder_alternate_subs set altSubsMrp = ?  where medicineId = ? ";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateColdChainInReorder = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "update reorder_alternate_subs set coldChainDisabled = ?  where medicineId = ? ";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateOrderAddressInReorder = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "update reorder_alternate_subs set orderAddress = ?, addressID = ? ";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateIsReplaceInReorder = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "update reorder_alternate_subs set isReplace = ? where medicineId = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateMrpOfAddedMedicine = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "update addedMedsTable12 set mrp = ? where medicineId = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateDiscountOfAddedMedicine = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "update addedMedsTable12 set discount = ? where medicineId = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateOrgAddedQuantityInReorder = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "update reorder_alternate_subs set orgAddedQuantity = ? where medicineId = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateShowOnlyOrgInReorder = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "update reorder_alternate_subs set showOnlyOrg = ? where medicineId = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateDescriptionInOrderTicket = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "update raise_ticket set description = ? where medicineId = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateProductImage = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "update productImage set addedDateTime = ? where productCode = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateSellingPriceInCart = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "update cart_item_price set sellingPrice = ? where productCode = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteItemAddedAttribute = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "delete from item_added_attributes where productCode = ?";
        return _query;
      }
    };
    this.__preparedStmtOfClearItemAddedAttributes = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "delete from item_added_attributes";
        return _query;
      }
    };
  }

  @Override
  public void insertOriginalMedicine(final CartMedicine medicine) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfCartMedicine.insert(medicine);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertSubsOrgInfo(final OrgSubsInfo medicine) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfOrgSubsInfo.insert(medicine);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertReorderAltSubs(final ReorderAlternateSubs medicine) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfReorderAlternateSubs.insert(medicine);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertReferReminder(final ReferReminder referReminder) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfReferReminder.insert(referReminder);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertPillReminder(final PillReminder pillReminder) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfPillReminder.insert(pillReminder);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertSaveVideoFAQ(final SaveVideoFAQ videoFAQ) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfSaveVideoFAQ.insert(videoFAQ);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertContactList(final List<TmContactVersion> contactEntityList) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfTmContactVersion.insert(contactEntityList);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertRecentlySearch(final RecentMedicine recentSearch) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfRecentMedicine.insert(recentSearch);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void addCartItemSequence(final CartItemSequence cartItemSequence) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfCartItemSequence.insert(cartItemSequence);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertSubOptReasons(final List<SubOptReasons> subOptReasons) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfSubOptReasons.insert(subOptReasons);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertReplaceMedNormalFlow(final OrgSubsInfo orgSubsInfo) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfOrgSubsInfo.insert(orgSubsInfo);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertCartReplaceStatus(final CartReplaceStatus cartReplaceStatus) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfCartReplaceStatus.insert(cartReplaceStatus);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertCrossSellingProduct(final AddedCrossSelling addedCrossSelling) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfAddedCrossSelling.insert(addedCrossSelling);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertSearchCategory(final SearchCategory searchCategory) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfSearchCategory.insert(searchCategory);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertSearchCategory(final List<SearchCategory> searchCategoryList) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfSearchCategory.insert(searchCategoryList);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertDoctorConfirmationSubOptions(
      final DoctorConfirmationSubOptions doctorConfirmationSubOptions) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfDoctorConfirmationSubOptions.insert(doctorConfirmationSubOptions);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertOrderTicket(final OrderTicket ticket) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfOrderTicket.insert(ticket);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertProductImage(final ProductImage image) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfProductImage.insert(image);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertCustomerCategory(final CustomerCategory variant) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfCustomerCategory.insert(variant);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertCustomerDetails(final CustomerDetails customerDetails) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfCustomerDetails.insert(customerDetails);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertOrderFilterDetails(final List<OrderFilter> orderFilter) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfOrderFilter.insert(orderFilter);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertTmContactVersionDetails(final List<TmContactVersion> tmContactVersions) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfTmContactVersion.insert(tmContactVersions);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertCartItemSellingPrice(final CartItemSellingPrice cartItemSellingPrice) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfCartItemSellingPrice.insert(cartItemSellingPrice);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertItemAddedAttributes(final ItemAddedEventAttributes item) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfItemAddedEventAttributes.insert(item);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertPatientNameList(final List<PatientNameEntity> patientNameEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfPatientNameEntity.insert(patientNameEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertReorderCrossSellingProduct(final AddedReorderCrossSelling addedCrossSelling) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfAddedReorderCrossSelling.insert(addedCrossSelling);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertReplaceMed(final String orgProductCode, final String savingPercentage,
      final double subsSellingPrice, final String originalProductCode, final double subsMrp,
      final String originalSkuName, final String originalCompanyName) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfInsertReplaceMed.acquire();
    int _argIndex = 1;
    if (savingPercentage == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, savingPercentage);
    }
    _argIndex = 2;
    _stmt.bindDouble(_argIndex, subsSellingPrice);
    _argIndex = 3;
    if (originalProductCode == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, originalProductCode);
    }
    _argIndex = 4;
    _stmt.bindDouble(_argIndex, subsMrp);
    _argIndex = 5;
    if (originalSkuName == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, originalSkuName);
    }
    _argIndex = 6;
    if (originalCompanyName == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, originalCompanyName);
    }
    _argIndex = 7;
    if (orgProductCode == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, orgProductCode);
    }
    try {
      __db.beginTransaction();
      try {
        _stmt.executeInsert();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfInsertReplaceMed.release(_stmt);
    }
  }

  @Override
  public void insertSwitchToOrgMed(final long productDetailsId, final long prevOrderId,
      final long prevOrgProductId, final String orgInfoProductCode) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfInsertSwitchToOrgMed.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, productDetailsId);
    _argIndex = 2;
    _stmt.bindLong(_argIndex, prevOrderId);
    _argIndex = 3;
    _stmt.bindLong(_argIndex, prevOrgProductId);
    _argIndex = 4;
    if (orgInfoProductCode == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, orgInfoProductCode);
    }
    try {
      __db.beginTransaction();
      try {
        _stmt.executeInsert();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfInsertSwitchToOrgMed.release(_stmt);
    }
  }

  @Override
  public void insertOrgSubFromCart(final String orgProductCode) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfInsertOrgSubFromCart.acquire();
    int _argIndex = 1;
    if (orgProductCode == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, orgProductCode);
    }
    try {
      __db.beginTransaction();
      try {
        _stmt.executeInsert();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfInsertOrgSubFromCart.release(_stmt);
    }
  }

  @Override
  public void deletePatientNameEntity() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeletePatientNameEntity.acquire();
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfDeletePatientNameEntity.release(_stmt);
    }
  }

  @Override
  public void deleteCartItemSellingPrice() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteCartItemSellingPrice.acquire();
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfDeleteCartItemSellingPrice.release(_stmt);
    }
  }

  @Override
  public void deleteSubOptReasons() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteSubOptReasons.acquire();
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfDeleteSubOptReasons.release(_stmt);
    }
  }

  @Override
  public void deleteOrderFilter() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteOrderFilter.acquire();
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfDeleteOrderFilter.release(_stmt);
    }
  }

  @Override
  public void deleteCustomerCategory() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteCustomerCategory.acquire();
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfDeleteCustomerCategory.release(_stmt);
    }
  }

  @Override
  public void deleteCustomerCategory(final String categoryType) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteCustomerCategory_1.acquire();
    int _argIndex = 1;
    if (categoryType == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, categoryType);
    }
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfDeleteCustomerCategory_1.release(_stmt);
    }
  }

  @Override
  public void deleteProductImage() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteProductImage.acquire();
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfDeleteProductImage.release(_stmt);
    }
  }

  @Override
  public void deleteOrderTicket() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteOrderTicket.acquire();
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfDeleteOrderTicket.release(_stmt);
    }
  }

  @Override
  public void deleteAddedCrossSelling() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAddedCrossSelling.acquire();
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfDeleteAddedCrossSelling.release(_stmt);
    }
  }

  @Override
  public void deleteDoctorConfirmationSubOptions() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteDoctorConfirmationSubOptions.acquire();
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfDeleteDoctorConfirmationSubOptions.release(_stmt);
    }
  }

  @Override
  public void deleteSaveVideoFAQ() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteSaveVideoFAQ.acquire();
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfDeleteSaveVideoFAQ.release(_stmt);
    }
  }

  @Override
  public void deleteReferReminder() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteReferReminder.acquire();
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfDeleteReferReminder.release(_stmt);
    }
  }

  @Override
  public void deletePillReminder() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeletePillReminder.acquire();
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfDeletePillReminder.release(_stmt);
    }
  }

  @Override
  public void deleteCustomerDetails() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteCustomerDetails.acquire();
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfDeleteCustomerDetails.release(_stmt);
    }
  }

  @Override
  public void deleteAllRecentSearch() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllRecentSearch.acquire();
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfDeleteAllRecentSearch.release(_stmt);
    }
  }

  @Override
  public void removeAddedMedicineFromCart(final String medicineId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfRemoveAddedMedicineFromCart.acquire();
    int _argIndex = 1;
    if (medicineId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, medicineId);
    }
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfRemoveAddedMedicineFromCart.release(_stmt);
    }
  }

  @Override
  public void removeCartItemPrice(final String productCode) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfRemoveCartItemPrice.acquire();
    int _argIndex = 1;
    if (productCode == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, productCode);
    }
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfRemoveCartItemPrice.release(_stmt);
    }
  }

  @Override
  public void removeOrgSubsMedicineFromCart(final String medicineId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfRemoveOrgSubsMedicineFromCart.acquire();
    int _argIndex = 1;
    if (medicineId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, medicineId);
    }
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfRemoveOrgSubsMedicineFromCart.release(_stmt);
    }
  }

  @Override
  public void clearCartTable() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfClearCartTable.acquire();
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfClearCartTable.release(_stmt);
    }
  }

  @Override
  public void clearOrgSubsTable() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfClearOrgSubsTable.acquire();
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfClearOrgSubsTable.release(_stmt);
    }
  }

  @Override
  public void clearReorderAltSubsTable() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfClearReorderAltSubsTable.acquire();
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfClearReorderAltSubsTable.release(_stmt);
    }
  }

  @Override
  public void deleteCartReplaceStatus() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteCartReplaceStatus.acquire();
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfDeleteCartReplaceStatus.release(_stmt);
    }
  }

  @Override
  public void deleteCartReplaceStatus(final String orgProductCode) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteCartReplaceStatus_1.acquire();
    int _argIndex = 1;
    if (orgProductCode == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, orgProductCode);
    }
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfDeleteCartReplaceStatus_1.release(_stmt);
    }
  }

  @Override
  public void clearCrossSellingTable() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfClearCrossSellingTable.acquire();
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfClearCrossSellingTable.release(_stmt);
    }
  }

  @Override
  public void deleteCartItemSequence() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteCartItemSequence.acquire();
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfDeleteCartItemSequence.release(_stmt);
    }
  }

  @Override
  public void deleteReorderMedItem(final String medicineId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteReorderMedItem.acquire();
    int _argIndex = 1;
    if (medicineId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, medicineId);
    }
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfDeleteReorderMedItem.release(_stmt);
    }
  }

  @Override
  public void deleteSearchCategory() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteSearchCategory.acquire();
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfDeleteSearchCategory.release(_stmt);
    }
  }

  @Override
  public void deleteDoctorConfirmation() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteDoctorConfirmationSubOptions.acquire();
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfDeleteDoctorConfirmationSubOptions.release(_stmt);
    }
  }

  @Override
  public void deleteCrossSellingUsingId(final String productCode) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteCrossSellingUsingId.acquire();
    int _argIndex = 1;
    if (productCode == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, productCode);
    }
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfDeleteCrossSellingUsingId.release(_stmt);
    }
  }

  @Override
  public void deleteOrderTicketFromMedId(final String medicineId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteOrderTicketFromMedId.acquire();
    int _argIndex = 1;
    if (medicineId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, medicineId);
    }
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfDeleteOrderTicketFromMedId.release(_stmt);
    }
  }

  @Override
  public void deleteOrderFilterDetails() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteOrderFilter.acquire();
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfDeleteOrderFilter.release(_stmt);
    }
  }

  @Override
  public void deleteTmContactVersion() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteTmContactVersion.acquire();
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfDeleteTmContactVersion.release(_stmt);
    }
  }

  @Override
  public void updateImageAndDrugTypeInRecentlySearch(final String image, final String drugType,
      final String id) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateImageAndDrugTypeInRecentlySearch.acquire();
    int _argIndex = 1;
    if (image == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, image);
    }
    _argIndex = 2;
    if (drugType == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, drugType);
    }
    _argIndex = 3;
    if (id == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, id);
    }
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfUpdateImageAndDrugTypeInRecentlySearch.release(_stmt);
    }
  }

  @Override
  public void updateTimeInRecentlySearch(final long addedTime, final String medName) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateTimeInRecentlySearch.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, addedTime);
    _argIndex = 2;
    if (medName == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, medName);
    }
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfUpdateTimeInRecentlySearch.release(_stmt);
    }
  }

  @Override
  public void updateAddedMedicine(final String medicineId, final int qty) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateAddedMedicine.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, qty);
    _argIndex = 2;
    if (medicineId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, medicineId);
    }
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfUpdateAddedMedicine.release(_stmt);
    }
  }

  @Override
  public void updateOrgSubInfoMedicine(final String medicineId, final int qty) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateOrgSubInfoMedicine.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, qty);
    _argIndex = 2;
    if (medicineId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, medicineId);
    }
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfUpdateOrgSubInfoMedicine.release(_stmt);
    }
  }

  @Override
  public void updateOrgAvailableInAddedMedicine(final boolean orgAvailable,
      final String medicineId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateOrgAvailableInAddedMedicine.acquire();
    int _argIndex = 1;
    final int _tmp = orgAvailable ? 1 : 0;
    _stmt.bindLong(_argIndex, _tmp);
    _argIndex = 2;
    if (medicineId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, medicineId);
    }
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfUpdateOrgAvailableInAddedMedicine.release(_stmt);
    }
  }

  @Override
  public void updateProductDetailIdnAddedMedicine(final long detailId, final String medicineId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateProductDetailIdnAddedMedicine.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, detailId);
    _argIndex = 2;
    if (medicineId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, medicineId);
    }
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfUpdateProductDetailIdnAddedMedicine.release(_stmt);
    }
  }

  @Override
  public void updateProductImageInAddedMedicine(final String imageUrl, final String medicineId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateProductImageInAddedMedicine.acquire();
    int _argIndex = 1;
    if (imageUrl == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, imageUrl);
    }
    _argIndex = 2;
    if (medicineId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, medicineId);
    }
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfUpdateProductImageInAddedMedicine.release(_stmt);
    }
  }

  @Override
  public void updateSubsImageInReorder(final String imageUrl, final String medicineId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateSubsImageInReorder.acquire();
    int _argIndex = 1;
    if (imageUrl == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, imageUrl);
    }
    _argIndex = 2;
    if (medicineId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, medicineId);
    }
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfUpdateSubsImageInReorder.release(_stmt);
    }
  }

  @Override
  public void updateAltSubsImageInReorder(final String imageUrl, final String medicineId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateAltSubsImageInReorder.acquire();
    int _argIndex = 1;
    if (imageUrl == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, imageUrl);
    }
    _argIndex = 2;
    if (medicineId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, medicineId);
    }
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfUpdateAltSubsImageInReorder.release(_stmt);
    }
  }

  @Override
  public void updatePrevOrderId(final long prevOrderId, final String medicineId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdatePrevOrderId.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, prevOrderId);
    _argIndex = 2;
    if (medicineId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, medicineId);
    }
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfUpdatePrevOrderId.release(_stmt);
    }
  }

  @Override
  public void updateSubsMedProductCode(final String medicineId, final String subsProductCode) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateSubsMedProductCode.acquire();
    int _argIndex = 1;
    if (subsProductCode == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, subsProductCode);
    }
    _argIndex = 2;
    if (medicineId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, medicineId);
    }
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfUpdateSubsMedProductCode.release(_stmt);
    }
  }

  @Override
  public void updatePrevOrgProductId(final long prevOrgProductId, final String medicineId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdatePrevOrgProductId.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, prevOrgProductId);
    _argIndex = 2;
    if (medicineId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, medicineId);
    }
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfUpdatePrevOrgProductId.release(_stmt);
    }
  }

  @Override
  public void updateProductDetailsId(final long productDetailsId, final String medicineId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateProductDetailsId.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, productDetailsId);
    _argIndex = 2;
    if (medicineId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, medicineId);
    }
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfUpdateProductDetailsId.release(_stmt);
    }
  }

  @Override
  public void updateAltSubsAvailableInReorder(final boolean altSubsAvailable,
      final String medicineId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateAltSubsAvailableInReorder.acquire();
    int _argIndex = 1;
    final int _tmp = altSubsAvailable ? 1 : 0;
    _stmt.bindLong(_argIndex, _tmp);
    _argIndex = 2;
    if (medicineId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, medicineId);
    }
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfUpdateAltSubsAvailableInReorder.release(_stmt);
    }
  }

  @Override
  public void updateSubsAvailableInReorder(final boolean subsAvailable, final String medicineId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateSubsAvailableInReorder.acquire();
    int _argIndex = 1;
    final int _tmp = subsAvailable ? 1 : 0;
    _stmt.bindLong(_argIndex, _tmp);
    _argIndex = 2;
    if (medicineId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, medicineId);
    }
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfUpdateSubsAvailableInReorder.release(_stmt);
    }
  }

  @Override
  public void updateOrgDisabledInReorder(final boolean orgDisabled, final String medicineId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateOrgDisabledInReorder.acquire();
    int _argIndex = 1;
    final int _tmp = orgDisabled ? 1 : 0;
    _stmt.bindLong(_argIndex, _tmp);
    _argIndex = 2;
    if (medicineId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, medicineId);
    }
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfUpdateOrgDisabledInReorder.release(_stmt);
    }
  }

  @Override
  public void updateSubsPitchedInReorder(final boolean subsPitched, final String medicineId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateSubsPitchedInReorder.acquire();
    int _argIndex = 1;
    final int _tmp = subsPitched ? 1 : 0;
    _stmt.bindLong(_argIndex, _tmp);
    _argIndex = 2;
    if (medicineId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, medicineId);
    }
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfUpdateSubsPitchedInReorder.release(_stmt);
    }
  }

  @Override
  public void updateCxAcceptedSubsInReorder(final boolean cxAcceptedSubs, final String medicineId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateCxAcceptedSubsInReorder.acquire();
    int _argIndex = 1;
    final int _tmp = cxAcceptedSubs ? 1 : 0;
    _stmt.bindLong(_argIndex, _tmp);
    _argIndex = 2;
    if (medicineId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, medicineId);
    }
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfUpdateCxAcceptedSubsInReorder.release(_stmt);
    }
  }

  @Override
  public void updateCxKeepOriginalInReorder(final boolean cxKeepOriginal, final String medicineId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateCxKeepOriginalInReorder.acquire();
    int _argIndex = 1;
    final int _tmp = cxKeepOriginal ? 1 : 0;
    _stmt.bindLong(_argIndex, _tmp);
    _argIndex = 2;
    if (medicineId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, medicineId);
    }
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfUpdateCxKeepOriginalInReorder.release(_stmt);
    }
  }

  @Override
  public void updateOrgCompanyAddressInAddedMad(final String address, final String medicineId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateOrgCompanyAddressInAddedMad.acquire();
    int _argIndex = 1;
    if (address == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, address);
    }
    _argIndex = 2;
    if (medicineId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, medicineId);
    }
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfUpdateOrgCompanyAddressInAddedMad.release(_stmt);
    }
  }

  @Override
  public void updateOrgDetailsInAddedMed(final double orgMrp, final double orgDiscountPercentage,
      final boolean orgAvailable, final String medicineId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateOrgDetailsInAddedMed.acquire();
    int _argIndex = 1;
    _stmt.bindDouble(_argIndex, orgMrp);
    _argIndex = 2;
    _stmt.bindDouble(_argIndex, orgDiscountPercentage);
    _argIndex = 3;
    final int _tmp = orgAvailable ? 1 : 0;
    _stmt.bindLong(_argIndex, _tmp);
    _argIndex = 4;
    if (medicineId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, medicineId);
    }
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfUpdateOrgDetailsInAddedMed.release(_stmt);
    }
  }

  @Override
  public void updateOrgAndSubDetailsInAddedMed(final double orgMrp,
      final double orgDiscountPercentage, final String subDiscountPercentage,
      final double subsSellingPrice, final String subsMedProductCode, final double subsMrp,
      final String subsMedName, final String subCompanyName, final double substitutePackSize,
      final int subsRecommendedQty, final String medicineId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateOrgAndSubDetailsInAddedMed.acquire();
    int _argIndex = 1;
    _stmt.bindDouble(_argIndex, orgMrp);
    _argIndex = 2;
    _stmt.bindDouble(_argIndex, orgDiscountPercentage);
    _argIndex = 3;
    if (subDiscountPercentage == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, subDiscountPercentage);
    }
    _argIndex = 4;
    _stmt.bindDouble(_argIndex, subsSellingPrice);
    _argIndex = 5;
    if (subsMedProductCode == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, subsMedProductCode);
    }
    _argIndex = 6;
    _stmt.bindDouble(_argIndex, subsMrp);
    _argIndex = 7;
    if (subsMedName == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, subsMedName);
    }
    _argIndex = 8;
    if (subCompanyName == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, subCompanyName);
    }
    _argIndex = 9;
    _stmt.bindDouble(_argIndex, substitutePackSize);
    _argIndex = 10;
    _stmt.bindLong(_argIndex, subsRecommendedQty);
    _argIndex = 11;
    if (medicineId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, medicineId);
    }
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfUpdateOrgAndSubDetailsInAddedMed.release(_stmt);
    }
  }

  @Override
  public void updateAltSubsDiscountPercentageInReorder(final double discount,
      final String medicineId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateAltSubsDiscountPercentageInReorder.acquire();
    int _argIndex = 1;
    _stmt.bindDouble(_argIndex, discount);
    _argIndex = 2;
    if (medicineId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, medicineId);
    }
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfUpdateAltSubsDiscountPercentageInReorder.release(_stmt);
    }
  }

  @Override
  public void updateAltSubsSellingPriceInReorder(final double sellingPrice,
      final String medicineId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateAltSubsSellingPriceInReorder.acquire();
    int _argIndex = 1;
    _stmt.bindDouble(_argIndex, sellingPrice);
    _argIndex = 2;
    if (medicineId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, medicineId);
    }
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfUpdateAltSubsSellingPriceInReorder.release(_stmt);
    }
  }

  @Override
  public void updateAltSubsMrpInReorder(final double subsMrp, final String medicineId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateAltSubsMrpInReorder.acquire();
    int _argIndex = 1;
    _stmt.bindDouble(_argIndex, subsMrp);
    _argIndex = 2;
    if (medicineId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, medicineId);
    }
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfUpdateAltSubsMrpInReorder.release(_stmt);
    }
  }

  @Override
  public void updateColdChainInReorder(final boolean coldChainDisabled, final String medicineId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateColdChainInReorder.acquire();
    int _argIndex = 1;
    final int _tmp = coldChainDisabled ? 1 : 0;
    _stmt.bindLong(_argIndex, _tmp);
    _argIndex = 2;
    if (medicineId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, medicineId);
    }
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfUpdateColdChainInReorder.release(_stmt);
    }
  }

  @Override
  public void updateOrderAddressInReorder(final String orderAddress, final int addressId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateOrderAddressInReorder.acquire();
    int _argIndex = 1;
    if (orderAddress == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, orderAddress);
    }
    _argIndex = 2;
    _stmt.bindLong(_argIndex, addressId);
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfUpdateOrderAddressInReorder.release(_stmt);
    }
  }

  @Override
  public void updateIsReplaceInReorder(final String medicineId, final boolean isReplace) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateIsReplaceInReorder.acquire();
    int _argIndex = 1;
    final int _tmp = isReplace ? 1 : 0;
    _stmt.bindLong(_argIndex, _tmp);
    _argIndex = 2;
    if (medicineId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, medicineId);
    }
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfUpdateIsReplaceInReorder.release(_stmt);
    }
  }

  @Override
  public void updateMrpOfAddedMedicine(final String medicineId, final double mrp) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateMrpOfAddedMedicine.acquire();
    int _argIndex = 1;
    _stmt.bindDouble(_argIndex, mrp);
    _argIndex = 2;
    if (medicineId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, medicineId);
    }
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfUpdateMrpOfAddedMedicine.release(_stmt);
    }
  }

  @Override
  public void updateDiscountOfAddedMedicine(final String medicineId, final double discount) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateDiscountOfAddedMedicine.acquire();
    int _argIndex = 1;
    _stmt.bindDouble(_argIndex, discount);
    _argIndex = 2;
    if (medicineId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, medicineId);
    }
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfUpdateDiscountOfAddedMedicine.release(_stmt);
    }
  }

  @Override
  public void updateOrgAddedQuantityInReorder(final String medicineId, final int orgAddedQuantity) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateOrgAddedQuantityInReorder.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, orgAddedQuantity);
    _argIndex = 2;
    if (medicineId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, medicineId);
    }
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfUpdateOrgAddedQuantityInReorder.release(_stmt);
    }
  }

  @Override
  public void updateShowOnlyOrgInReorder(final String medicineId, final boolean showOnlyOrg) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateShowOnlyOrgInReorder.acquire();
    int _argIndex = 1;
    final int _tmp = showOnlyOrg ? 1 : 0;
    _stmt.bindLong(_argIndex, _tmp);
    _argIndex = 2;
    if (medicineId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, medicineId);
    }
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfUpdateShowOnlyOrgInReorder.release(_stmt);
    }
  }

  @Override
  public void updateDescriptionInOrderTicket(final String medicineId, final String description) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateDescriptionInOrderTicket.acquire();
    int _argIndex = 1;
    if (description == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, description);
    }
    _argIndex = 2;
    if (medicineId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, medicineId);
    }
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfUpdateDescriptionInOrderTicket.release(_stmt);
    }
  }

  @Override
  public void updateProductImage(final long dateTime, final String medicineId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateProductImage.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, dateTime);
    _argIndex = 2;
    if (medicineId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, medicineId);
    }
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfUpdateProductImage.release(_stmt);
    }
  }

  @Override
  public void updateSellingPriceInCart(final double orgSellingPrice, final String productCode) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateSellingPriceInCart.acquire();
    int _argIndex = 1;
    _stmt.bindDouble(_argIndex, orgSellingPrice);
    _argIndex = 2;
    if (productCode == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, productCode);
    }
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfUpdateSellingPriceInCart.release(_stmt);
    }
  }

  @Override
  public void deleteItemAddedAttribute(final String medicineId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteItemAddedAttribute.acquire();
    int _argIndex = 1;
    if (medicineId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, medicineId);
    }
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfDeleteItemAddedAttribute.release(_stmt);
    }
  }

  @Override
  public void clearItemAddedAttributes() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfClearItemAddedAttributes.acquire();
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfClearItemAddedAttributes.release(_stmt);
    }
  }

  @Override
  public long getCartTableCount() {
    final String _sql = "SELECT COUNT(medicineId) FROM addedMedsTable12";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final long _result;
      if (_cursor.moveToFirst()) {
        _result = _cursor.getLong(0);
      } else {
        _result = 0L;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int getOrgSubTableCount() {
    final String _sql = "SELECT COUNT(medicineId) FROM addedSubsOrgInfo";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if (_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int getReorderTableCount() {
    final String _sql = "SELECT COUNT(medicineId) FROM reorder_alternate_subs";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if (_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int getMedicineItemCount(final String medicineId) {
    final String _sql = "SELECT addedQty FROM addedMedsTable12 WHERE medicineId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (medicineId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, medicineId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if (_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int getMaxCappedCount(final String medicineId) {
    final String _sql = "SELECT maxCapped FROM addedMedsTable12 WHERE medicineId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (medicineId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, medicineId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if (_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int subsAddedMedCount(final String medicineId) {
    final String _sql = "SELECT cart.addedQty FROM addedMedsTable12 cart INNER JOIN addedSubsOrgInfo subOrgInfo ON cart.medicineId = subOrgInfo.subsMedProductCode WHERE subOrgInfo.medicineId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (medicineId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, medicineId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if (_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int getSubsMedicineItemCount(final String medicineId, final String subsMedicineId) {
    final String _sql = "SELECT addedQty FROM addedSubsOrgInfo WHERE medicineId = ? AND subsMedProductCode = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (medicineId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, medicineId);
    }
    _argIndex = 2;
    if (subsMedicineId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, subsMedicineId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if (_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int checkAlreadyAddedAsSubs(final String subsProductCode) {
    final String _sql = "SELECT 1 FROM addedMedsTable12 WHERE medicineId = ? AND (subsMedProductCode = ? AND NOT EXISTS (SELECT 1 FROM addedSubsOrgInfo WHERE subsMedProductCode = ? AND medicineId != ? ))";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 4);
    int _argIndex = 1;
    if (subsProductCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, subsProductCode);
    }
    _argIndex = 2;
    if (subsProductCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, subsProductCode);
    }
    _argIndex = 3;
    if (subsProductCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, subsProductCode);
    }
    _argIndex = 4;
    if (subsProductCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, subsProductCode);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if (_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int getSubsInfoFromProductCode(final String productCode, final String subsProductCode) {
    final String _sql = "SELECT 1 FROM addedSubsOrgInfo WHERE medicineId != ? and subsMedProductCode = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (productCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, productCode);
    }
    _argIndex = 2;
    if (subsProductCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, subsProductCode);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if (_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int getSubsInfoFromSubsCode(final String subsProductCode) {
    final String _sql = "SELECT 1 FROM addedSubsOrgInfo WHERE subsMedProductCode = ? ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (subsProductCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, subsProductCode);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if (_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public OrgSubsInfo getSubsOrgInfo(final String subsMedProductCode) {
    final String _sql = "select * from addedSubsOrgInfo WHERE subsMedProductCode = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (subsMedProductCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, subsMedProductCode);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfMedicineId = CursorUtil.getColumnIndexOrThrow(_cursor, "medicineId");
      final int _cursorIndexOfMedicineName = CursorUtil.getColumnIndexOrThrow(_cursor, "medicineName");
      final int _cursorIndexOfCompanyName = CursorUtil.getColumnIndexOrThrow(_cursor, "companyName");
      final int _cursorIndexOfDiscount = CursorUtil.getColumnIndexOrThrow(_cursor, "discount");
      final int _cursorIndexOfMrp = CursorUtil.getColumnIndexOrThrow(_cursor, "mrp");
      final int _cursorIndexOfAddedQty = CursorUtil.getColumnIndexOrThrow(_cursor, "addedQty");
      final int _cursorIndexOfComposition = CursorUtil.getColumnIndexOrThrow(_cursor, "composition");
      final int _cursorIndexOfSubsDiscountPercentage = CursorUtil.getColumnIndexOrThrow(_cursor, "subDiscountPercentage");
      final int _cursorIndexOfSubsSellingPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "subsSellingPrice");
      final int _cursorIndexOfSubsFound = CursorUtil.getColumnIndexOrThrow(_cursor, "isSubFound");
      final int _cursorIndexOfFromApi = CursorUtil.getColumnIndexOrThrow(_cursor, "isFromApi");
      final int _cursorIndexOfSubsMedProductCode = CursorUtil.getColumnIndexOrThrow(_cursor, "subsMedProductCode");
      final int _cursorIndexOfSubsMrp = CursorUtil.getColumnIndexOrThrow(_cursor, "subsMrp");
      final int _cursorIndexOfSubsMedName = CursorUtil.getColumnIndexOrThrow(_cursor, "subsMedName");
      final int _cursorIndexOfSubCompanyName = CursorUtil.getColumnIndexOrThrow(_cursor, "subCompanyName");
      final int _cursorIndexOfColdStorage = CursorUtil.getColumnIndexOrThrow(_cursor, "isColdStorage");
      final int _cursorIndexOfDrugType = CursorUtil.getColumnIndexOrThrow(_cursor, "drugType");
      final int _cursorIndexOfOriginalPackSize = CursorUtil.getColumnIndexOrThrow(_cursor, "originalPackSize");
      final int _cursorIndexOfSubstitutePackSize = CursorUtil.getColumnIndexOrThrow(_cursor, "substitutePackSize");
      final int _cursorIndexOfRxRequired = CursorUtil.getColumnIndexOrThrow(_cursor, "prescriptionRequired");
      final int _cursorIndexOfMaxCapped = CursorUtil.getColumnIndexOrThrow(_cursor, "maxCapped");
      final int _cursorIndexOfSubsRecommendedQty = CursorUtil.getColumnIndexOrThrow(_cursor, "subsReccommendedQty");
      final int _cursorIndexOfOriginalCountryNm = CursorUtil.getColumnIndexOrThrow(_cursor, "originalCountryNm");
      final int _cursorIndexOfSubsCountryNm = CursorUtil.getColumnIndexOrThrow(_cursor, "subs_country_nm");
      final int _cursorIndexOfSubsUnit = CursorUtil.getColumnIndexOrThrow(_cursor, "subs_unit");
      final int _cursorIndexOfOriginalUnit = CursorUtil.getColumnIndexOrThrow(_cursor, "original_unit");
      final int _cursorIndexOfProductImageUrls = CursorUtil.getColumnIndexOrThrow(_cursor, "product_image_urls");
      final int _cursorIndexOfOriginalCompanyAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "original_company_addr");
      final int _cursorIndexOfOrgAvailable = CursorUtil.getColumnIndexOrThrow(_cursor, "orgAvailable");
      final OrgSubsInfo _result;
      if (_cursor.moveToFirst()) {
        final Long _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getLong(_cursorIndexOfId);
        }
        final String _tmpMedicineId;
        if (_cursor.isNull(_cursorIndexOfMedicineId)) {
          _tmpMedicineId = null;
        } else {
          _tmpMedicineId = _cursor.getString(_cursorIndexOfMedicineId);
        }
        final String _tmpMedicineName;
        if (_cursor.isNull(_cursorIndexOfMedicineName)) {
          _tmpMedicineName = null;
        } else {
          _tmpMedicineName = _cursor.getString(_cursorIndexOfMedicineName);
        }
        final String _tmpCompanyName;
        if (_cursor.isNull(_cursorIndexOfCompanyName)) {
          _tmpCompanyName = null;
        } else {
          _tmpCompanyName = _cursor.getString(_cursorIndexOfCompanyName);
        }
        final double _tmpDiscount;
        _tmpDiscount = _cursor.getDouble(_cursorIndexOfDiscount);
        final double _tmpMrp;
        _tmpMrp = _cursor.getDouble(_cursorIndexOfMrp);
        final int _tmpAddedQty;
        _tmpAddedQty = _cursor.getInt(_cursorIndexOfAddedQty);
        final String _tmpComposition;
        if (_cursor.isNull(_cursorIndexOfComposition)) {
          _tmpComposition = null;
        } else {
          _tmpComposition = _cursor.getString(_cursorIndexOfComposition);
        }
        final String _tmpSubsDiscountPercentage;
        if (_cursor.isNull(_cursorIndexOfSubsDiscountPercentage)) {
          _tmpSubsDiscountPercentage = null;
        } else {
          _tmpSubsDiscountPercentage = _cursor.getString(_cursorIndexOfSubsDiscountPercentage);
        }
        final double _tmpSubsSellingPrice;
        _tmpSubsSellingPrice = _cursor.getDouble(_cursorIndexOfSubsSellingPrice);
        final boolean _tmpSubsFound;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfSubsFound);
        _tmpSubsFound = _tmp != 0;
        final boolean _tmpFromApi;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfFromApi);
        _tmpFromApi = _tmp_1 != 0;
        final String _tmpSubsMedProductCode;
        if (_cursor.isNull(_cursorIndexOfSubsMedProductCode)) {
          _tmpSubsMedProductCode = null;
        } else {
          _tmpSubsMedProductCode = _cursor.getString(_cursorIndexOfSubsMedProductCode);
        }
        final double _tmpSubsMrp;
        _tmpSubsMrp = _cursor.getDouble(_cursorIndexOfSubsMrp);
        final String _tmpSubsMedName;
        if (_cursor.isNull(_cursorIndexOfSubsMedName)) {
          _tmpSubsMedName = null;
        } else {
          _tmpSubsMedName = _cursor.getString(_cursorIndexOfSubsMedName);
        }
        final String _tmpSubCompanyName;
        if (_cursor.isNull(_cursorIndexOfSubCompanyName)) {
          _tmpSubCompanyName = null;
        } else {
          _tmpSubCompanyName = _cursor.getString(_cursorIndexOfSubCompanyName);
        }
        final boolean _tmpColdStorage;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfColdStorage);
        _tmpColdStorage = _tmp_2 != 0;
        final String _tmpDrugType;
        if (_cursor.isNull(_cursorIndexOfDrugType)) {
          _tmpDrugType = null;
        } else {
          _tmpDrugType = _cursor.getString(_cursorIndexOfDrugType);
        }
        final double _tmpOriginalPackSize;
        _tmpOriginalPackSize = _cursor.getDouble(_cursorIndexOfOriginalPackSize);
        final double _tmpSubstitutePackSize;
        _tmpSubstitutePackSize = _cursor.getDouble(_cursorIndexOfSubstitutePackSize);
        final boolean _tmpRxRequired;
        final int _tmp_3;
        _tmp_3 = _cursor.getInt(_cursorIndexOfRxRequired);
        _tmpRxRequired = _tmp_3 != 0;
        final int _tmpMaxCapped;
        _tmpMaxCapped = _cursor.getInt(_cursorIndexOfMaxCapped);
        final int _tmpSubsRecommendedQty;
        _tmpSubsRecommendedQty = _cursor.getInt(_cursorIndexOfSubsRecommendedQty);
        final String _tmpOriginalCountryNm;
        if (_cursor.isNull(_cursorIndexOfOriginalCountryNm)) {
          _tmpOriginalCountryNm = null;
        } else {
          _tmpOriginalCountryNm = _cursor.getString(_cursorIndexOfOriginalCountryNm);
        }
        final String _tmpSubsCountryNm;
        if (_cursor.isNull(_cursorIndexOfSubsCountryNm)) {
          _tmpSubsCountryNm = null;
        } else {
          _tmpSubsCountryNm = _cursor.getString(_cursorIndexOfSubsCountryNm);
        }
        final String _tmpSubsUnit;
        if (_cursor.isNull(_cursorIndexOfSubsUnit)) {
          _tmpSubsUnit = null;
        } else {
          _tmpSubsUnit = _cursor.getString(_cursorIndexOfSubsUnit);
        }
        final String _tmpOriginalUnit;
        if (_cursor.isNull(_cursorIndexOfOriginalUnit)) {
          _tmpOriginalUnit = null;
        } else {
          _tmpOriginalUnit = _cursor.getString(_cursorIndexOfOriginalUnit);
        }
        final String _tmpProductImageUrls;
        if (_cursor.isNull(_cursorIndexOfProductImageUrls)) {
          _tmpProductImageUrls = null;
        } else {
          _tmpProductImageUrls = _cursor.getString(_cursorIndexOfProductImageUrls);
        }
        final String _tmpOriginalCompanyAddress;
        if (_cursor.isNull(_cursorIndexOfOriginalCompanyAddress)) {
          _tmpOriginalCompanyAddress = null;
        } else {
          _tmpOriginalCompanyAddress = _cursor.getString(_cursorIndexOfOriginalCompanyAddress);
        }
        final boolean _tmpOrgAvailable;
        final int _tmp_4;
        _tmp_4 = _cursor.getInt(_cursorIndexOfOrgAvailable);
        _tmpOrgAvailable = _tmp_4 != 0;
        _result = new OrgSubsInfo(_tmpId,_tmpMedicineId,_tmpMedicineName,_tmpCompanyName,_tmpDiscount,_tmpMrp,_tmpAddedQty,_tmpComposition,_tmpSubsDiscountPercentage,_tmpSubsSellingPrice,_tmpSubsFound,_tmpFromApi,_tmpSubsMedProductCode,_tmpSubsMrp,_tmpSubsMedName,_tmpSubCompanyName,_tmpColdStorage,_tmpDrugType,_tmpOriginalPackSize,_tmpSubstitutePackSize,_tmpRxRequired,_tmpMaxCapped,_tmpSubsRecommendedQty,_tmpOriginalCountryNm,_tmpSubsCountryNm,_tmpSubsUnit,_tmpOriginalUnit,_tmpProductImageUrls,_tmpOriginalCompanyAddress,_tmpOrgAvailable);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public String getSubsProductCodeFromOrgCode(final String orgProductCode) {
    final String _sql = "select subsMedProductCode from addedSubsOrgInfo WHERE medicineId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (orgProductCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, orgProductCode);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final String _result;
      if (_cursor.moveToFirst()) {
        if (_cursor.isNull(0)) {
          _result = null;
        } else {
          _result = _cursor.getString(0);
        }
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int subsAsOrgCount(final String subsProductCode) {
    final String _sql = "SELECT 1 FROM addedMedsTable12 WHERE medicineId = ? AND (subsMedProductCode = ? AND NOT EXISTS (SELECT 1 FROM addedSubsOrgInfo WHERE subsMedProductCode = ? AND medicineId != ? ))";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 4);
    int _argIndex = 1;
    if (subsProductCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, subsProductCode);
    }
    _argIndex = 2;
    if (subsProductCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, subsProductCode);
    }
    _argIndex = 3;
    if (subsProductCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, subsProductCode);
    }
    _argIndex = 4;
    if (subsProductCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, subsProductCode);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if (_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int getAddedSubsAsOrgCount(final String productCode) {
    final String _sql = "SELECT 1 FROM addedMedsTable12 WHERE medicineId = ? AND subsMedProductCode = ? AND EXISTS (SELECT 1 FROM addedSubsOrgInfo WHERE subsMedProductCode = ? AND medicineId != ? )";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 4);
    int _argIndex = 1;
    if (productCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, productCode);
    }
    _argIndex = 2;
    if (productCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, productCode);
    }
    _argIndex = 3;
    if (productCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, productCode);
    }
    _argIndex = 4;
    if (productCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, productCode);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if (_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int getSubsInReorder(final String productId) {
    final String _sql = "SELECT 1 FROM reorder_alternate_subs WHERE (SubsMedProductCode = ? OR altSubsMedProductCode = ?) AND (isReplace = '1' OR isReplace = 'true')";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (productId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, productId);
    }
    _argIndex = 2;
    if (productId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, productId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if (_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<PillReminder> getPillReminderUsingOrderId(final long orderId) {
    final String _sql = "SELECT * FROM savePillReminder WHERE orderId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, orderId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "od");
      final int _cursorIndexOfOrderId = CursorUtil.getColumnIndexOrThrow(_cursor, "orderId");
      final int _cursorIndexOfPatientId = CursorUtil.getColumnIndexOrThrow(_cursor, "patientId");
      final List<PillReminder> _result = new ArrayList<PillReminder>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final PillReminder _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final long _tmpOrderId;
        _tmpOrderId = _cursor.getLong(_cursorIndexOfOrderId);
        final String _tmpPatientId;
        if (_cursor.isNull(_cursorIndexOfPatientId)) {
          _tmpPatientId = null;
        } else {
          _tmpPatientId = _cursor.getString(_cursorIndexOfPatientId);
        }
        _item = new PillReminder(_tmpId,_tmpOrderId,_tmpPatientId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<SaveVideoFAQ> getSavedVideOFAQ(final long orderId) {
    final String _sql = "SELECT * FROM saveVideoFaq WHERE orderId = ? ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, orderId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfOrderId = CursorUtil.getColumnIndexOrThrow(_cursor, "orderId");
      final int _cursorIndexOfPatientId = CursorUtil.getColumnIndexOrThrow(_cursor, "patientId");
      final List<SaveVideoFAQ> _result = new ArrayList<SaveVideoFAQ>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final SaveVideoFAQ _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final long _tmpOrderId;
        _tmpOrderId = _cursor.getLong(_cursorIndexOfOrderId);
        final String _tmpPatientId;
        if (_cursor.isNull(_cursorIndexOfPatientId)) {
          _tmpPatientId = null;
        } else {
          _tmpPatientId = _cursor.getString(_cursorIndexOfPatientId);
        }
        _item = new SaveVideoFAQ(_tmpId,_tmpOrderId,_tmpPatientId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int isRxRequired() {
    final String _sql = "select 1 from addedMedsTable12 where prescriptionRequired = 'true' OR prescriptionRequired = '1'";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if (_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<RecentMedicine> getRecentlySearchMeds() {
    final String _sql = "select * from recentlySearched where productCode IS NOT NULL AND productCode !='' AND productCode!='null' order by addedDateTime desc";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfMedicineName = CursorUtil.getColumnIndexOrThrow(_cursor, "medicineName");
      final int _cursorIndexOfProductCode = CursorUtil.getColumnIndexOrThrow(_cursor, "productCode");
      final int _cursorIndexOfIconType = CursorUtil.getColumnIndexOrThrow(_cursor, "iconType");
      final int _cursorIndexOfCustomerId = CursorUtil.getColumnIndexOrThrow(_cursor, "customerId");
      final int _cursorIndexOfAddedDateTime = CursorUtil.getColumnIndexOrThrow(_cursor, "addedDateTime");
      final int _cursorIndexOfKeyName = CursorUtil.getColumnIndexOrThrow(_cursor, "elastic_search_type");
      final int _cursorIndexOfShowHistoryIcon = CursorUtil.getColumnIndexOrThrow(_cursor, "showHistoryIcon");
      final int _cursorIndexOfProductImage = CursorUtil.getColumnIndexOrThrow(_cursor, "productImage");
      final int _cursorIndexOfDrugType = CursorUtil.getColumnIndexOrThrow(_cursor, "drugType");
      final List<RecentMedicine> _result = new ArrayList<RecentMedicine>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final RecentMedicine _item;
        final Long _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getLong(_cursorIndexOfId);
        }
        final String _tmpMedicineName;
        if (_cursor.isNull(_cursorIndexOfMedicineName)) {
          _tmpMedicineName = null;
        } else {
          _tmpMedicineName = _cursor.getString(_cursorIndexOfMedicineName);
        }
        final String _tmpProductCode;
        if (_cursor.isNull(_cursorIndexOfProductCode)) {
          _tmpProductCode = null;
        } else {
          _tmpProductCode = _cursor.getString(_cursorIndexOfProductCode);
        }
        final int _tmpIconType;
        _tmpIconType = _cursor.getInt(_cursorIndexOfIconType);
        final String _tmpCustomerId;
        if (_cursor.isNull(_cursorIndexOfCustomerId)) {
          _tmpCustomerId = null;
        } else {
          _tmpCustomerId = _cursor.getString(_cursorIndexOfCustomerId);
        }
        final long _tmpAddedDateTime;
        _tmpAddedDateTime = _cursor.getLong(_cursorIndexOfAddedDateTime);
        final String _tmpKeyName;
        if (_cursor.isNull(_cursorIndexOfKeyName)) {
          _tmpKeyName = null;
        } else {
          _tmpKeyName = _cursor.getString(_cursorIndexOfKeyName);
        }
        final boolean _tmpShowHistoryIcon;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfShowHistoryIcon);
        _tmpShowHistoryIcon = _tmp != 0;
        final String _tmpProductImage;
        if (_cursor.isNull(_cursorIndexOfProductImage)) {
          _tmpProductImage = null;
        } else {
          _tmpProductImage = _cursor.getString(_cursorIndexOfProductImage);
        }
        final String _tmpDrugType;
        if (_cursor.isNull(_cursorIndexOfDrugType)) {
          _tmpDrugType = null;
        } else {
          _tmpDrugType = _cursor.getString(_cursorIndexOfDrugType);
        }
        _item = new RecentMedicine(_tmpId,_tmpMedicineName,_tmpProductCode,_tmpIconType,_tmpCustomerId,_tmpAddedDateTime,_tmpKeyName,_tmpShowHistoryIcon,_tmpProductImage,_tmpDrugType);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<RecentMedicine> getRecentlySearch() {
    final String _sql = "select * from recentlySearched where productCode IS NULL OR productCode='' OR productCode='null' OR productCode=null order by addedDateTime desc";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfMedicineName = CursorUtil.getColumnIndexOrThrow(_cursor, "medicineName");
      final int _cursorIndexOfProductCode = CursorUtil.getColumnIndexOrThrow(_cursor, "productCode");
      final int _cursorIndexOfIconType = CursorUtil.getColumnIndexOrThrow(_cursor, "iconType");
      final int _cursorIndexOfCustomerId = CursorUtil.getColumnIndexOrThrow(_cursor, "customerId");
      final int _cursorIndexOfAddedDateTime = CursorUtil.getColumnIndexOrThrow(_cursor, "addedDateTime");
      final int _cursorIndexOfKeyName = CursorUtil.getColumnIndexOrThrow(_cursor, "elastic_search_type");
      final int _cursorIndexOfShowHistoryIcon = CursorUtil.getColumnIndexOrThrow(_cursor, "showHistoryIcon");
      final int _cursorIndexOfProductImage = CursorUtil.getColumnIndexOrThrow(_cursor, "productImage");
      final int _cursorIndexOfDrugType = CursorUtil.getColumnIndexOrThrow(_cursor, "drugType");
      final List<RecentMedicine> _result = new ArrayList<RecentMedicine>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final RecentMedicine _item;
        final Long _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getLong(_cursorIndexOfId);
        }
        final String _tmpMedicineName;
        if (_cursor.isNull(_cursorIndexOfMedicineName)) {
          _tmpMedicineName = null;
        } else {
          _tmpMedicineName = _cursor.getString(_cursorIndexOfMedicineName);
        }
        final String _tmpProductCode;
        if (_cursor.isNull(_cursorIndexOfProductCode)) {
          _tmpProductCode = null;
        } else {
          _tmpProductCode = _cursor.getString(_cursorIndexOfProductCode);
        }
        final int _tmpIconType;
        _tmpIconType = _cursor.getInt(_cursorIndexOfIconType);
        final String _tmpCustomerId;
        if (_cursor.isNull(_cursorIndexOfCustomerId)) {
          _tmpCustomerId = null;
        } else {
          _tmpCustomerId = _cursor.getString(_cursorIndexOfCustomerId);
        }
        final long _tmpAddedDateTime;
        _tmpAddedDateTime = _cursor.getLong(_cursorIndexOfAddedDateTime);
        final String _tmpKeyName;
        if (_cursor.isNull(_cursorIndexOfKeyName)) {
          _tmpKeyName = null;
        } else {
          _tmpKeyName = _cursor.getString(_cursorIndexOfKeyName);
        }
        final boolean _tmpShowHistoryIcon;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfShowHistoryIcon);
        _tmpShowHistoryIcon = _tmp != 0;
        final String _tmpProductImage;
        if (_cursor.isNull(_cursorIndexOfProductImage)) {
          _tmpProductImage = null;
        } else {
          _tmpProductImage = _cursor.getString(_cursorIndexOfProductImage);
        }
        final String _tmpDrugType;
        if (_cursor.isNull(_cursorIndexOfDrugType)) {
          _tmpDrugType = null;
        } else {
          _tmpDrugType = _cursor.getString(_cursorIndexOfDrugType);
        }
        _item = new RecentMedicine(_tmpId,_tmpMedicineName,_tmpProductCode,_tmpIconType,_tmpCustomerId,_tmpAddedDateTime,_tmpKeyName,_tmpShowHistoryIcon,_tmpProductImage,_tmpDrugType);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int getCartCountFromRecentlySearch(final String medName) {
    final String _sql = "SELECT 1 FROM recentlySearched WHERE medicineName = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (medName == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, medName);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if (_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int getSubsReorderReplaceCount(final String productId, final String subsProductCode) {
    final String _sql = "SELECT 1 FROM reorder_alternate_subs WHERE medicineId = ? AND (SubsMedProductCode = ? OR altSubsMedProductCode = ?) AND (isReplace = '1' OR isReplace = 'true')";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 3);
    int _argIndex = 1;
    if (productId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, productId);
    }
    _argIndex = 2;
    if (subsProductCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, subsProductCode);
    }
    _argIndex = 3;
    if (subsProductCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, subsProductCode);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if (_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int isProductReplacedInReorder(final String productCode) {
    final String _sql = "SELECT 1 FROM reorder_alternate_subs WHERE medicineId = ? AND (isReplace = '1' OR isReplace = 'true')";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (productCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, productCode);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if (_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public String getOrgProductCodeToMerge(final String productCode) {
    final String _sql = "select medicineId from addedMedsTable12 where subsMedProductCode = ? AND medicineId!= ? AND EXISTS ( SELECT 1 FROM addedMedsTable12 WHERE medicineId = ? ) AND EXISTS ( SELECT 1 FROM addedSubsOrgInfo WHERE subsMedProductCode = ?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 4);
    int _argIndex = 1;
    if (productCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, productCode);
    }
    _argIndex = 2;
    if (productCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, productCode);
    }
    _argIndex = 3;
    if (productCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, productCode);
    }
    _argIndex = 4;
    if (productCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, productCode);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final String _result;
      if (_cursor.moveToFirst()) {
        if (_cursor.isNull(0)) {
          _result = null;
        } else {
          _result = _cursor.getString(0);
        }
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int isProductInOrgInfoAdded(final String originalProductCode,
      final String subsProductCode) {
    final String _sql = "SELECT 1 FROM addedMedsTable12 cart INNER JOIN addedSubsOrgInfo orgInfo ON cart.medicineId = orgInfo.subsMedProductCode AND cart.medicineId = ? AND orgInfo.medicineId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (subsProductCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, subsProductCode);
    }
    _argIndex = 2;
    if (originalProductCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, originalProductCode);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if (_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int isItemThereInReOrderReplace(final String itemCode) {
    final String _sql = "SELECT 1 FROM reorder_alternate_subs WHERE SubsMedProductCode = ? AND (isReplace = '1' OR isReplace = 'true')";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (itemCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, itemCode);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if (_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<CartMedicine> getMedsList() {
    final String _sql = "select * from addedMedsTable12 ORDER BY (subsMedProductCode != medicineId AND subsMedProductCode IS NOT NULL AND subsMedProductCode != '' AND subsMedProductCode != 'null') DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfMedicineId = CursorUtil.getColumnIndexOrThrow(_cursor, "medicineId");
      final int _cursorIndexOfMedicineName = CursorUtil.getColumnIndexOrThrow(_cursor, "medicineName");
      final int _cursorIndexOfCompanyName = CursorUtil.getColumnIndexOrThrow(_cursor, "companyName");
      final int _cursorIndexOfDiscount = CursorUtil.getColumnIndexOrThrow(_cursor, "discount");
      final int _cursorIndexOfMrp = CursorUtil.getColumnIndexOrThrow(_cursor, "mrp");
      final int _cursorIndexOfAddedQty = CursorUtil.getColumnIndexOrThrow(_cursor, "addedQty");
      final int _cursorIndexOfComposition = CursorUtil.getColumnIndexOrThrow(_cursor, "composition");
      final int _cursorIndexOfSubsDiscountPercentage = CursorUtil.getColumnIndexOrThrow(_cursor, "subDiscountPercentage");
      final int _cursorIndexOfSubsSellingPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "subsSellingPrice");
      final int _cursorIndexOfSubsFound = CursorUtil.getColumnIndexOrThrow(_cursor, "isSubFound");
      final int _cursorIndexOfFromApi = CursorUtil.getColumnIndexOrThrow(_cursor, "isFromApi");
      final int _cursorIndexOfSubsMedProductCode = CursorUtil.getColumnIndexOrThrow(_cursor, "subsMedProductCode");
      final int _cursorIndexOfSubsMrp = CursorUtil.getColumnIndexOrThrow(_cursor, "subsMrp");
      final int _cursorIndexOfSubsMedName = CursorUtil.getColumnIndexOrThrow(_cursor, "subsMedName");
      final int _cursorIndexOfSubCompanyName = CursorUtil.getColumnIndexOrThrow(_cursor, "subCompanyName");
      final int _cursorIndexOfColdStorage = CursorUtil.getColumnIndexOrThrow(_cursor, "isColdStorage");
      final int _cursorIndexOfDrugType = CursorUtil.getColumnIndexOrThrow(_cursor, "drugType");
      final int _cursorIndexOfOriginalPackSize = CursorUtil.getColumnIndexOrThrow(_cursor, "originalPackSize");
      final int _cursorIndexOfSubstitutePackSize = CursorUtil.getColumnIndexOrThrow(_cursor, "substitutePackSize");
      final int _cursorIndexOfRxRequired = CursorUtil.getColumnIndexOrThrow(_cursor, "prescriptionRequired");
      final int _cursorIndexOfMaxCapped = CursorUtil.getColumnIndexOrThrow(_cursor, "maxCapped");
      final int _cursorIndexOfSubsRecommendedQty = CursorUtil.getColumnIndexOrThrow(_cursor, "subsReccommendedQty");
      final int _cursorIndexOfOriginalCountryNm = CursorUtil.getColumnIndexOrThrow(_cursor, "originalCountryNm");
      final int _cursorIndexOfSubsCountryNm = CursorUtil.getColumnIndexOrThrow(_cursor, "subs_country_nm");
      final int _cursorIndexOfSubsUnit = CursorUtil.getColumnIndexOrThrow(_cursor, "subs_unit");
      final int _cursorIndexOfOriginalUnit = CursorUtil.getColumnIndexOrThrow(_cursor, "original_unit");
      final int _cursorIndexOfProductImageUrls = CursorUtil.getColumnIndexOrThrow(_cursor, "product_image_urls");
      final int _cursorIndexOfOriginalCompanyAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "original_company_addr");
      final int _cursorIndexOfOrgAvailable = CursorUtil.getColumnIndexOrThrow(_cursor, "orgAvailable");
      final int _cursorIndexOfProductDetailsId = CursorUtil.getColumnIndexOrThrow(_cursor, "productDetailsId");
      final int _cursorIndexOfPrevOrderId = CursorUtil.getColumnIndexOrThrow(_cursor, "prevOrderId");
      final int _cursorIndexOfPrevOrgProductId = CursorUtil.getColumnIndexOrThrow(_cursor, "prevOrgProductId");
      final List<CartMedicine> _result = new ArrayList<CartMedicine>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final CartMedicine _item;
        final Long _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getLong(_cursorIndexOfId);
        }
        final String _tmpMedicineId;
        if (_cursor.isNull(_cursorIndexOfMedicineId)) {
          _tmpMedicineId = null;
        } else {
          _tmpMedicineId = _cursor.getString(_cursorIndexOfMedicineId);
        }
        final String _tmpMedicineName;
        if (_cursor.isNull(_cursorIndexOfMedicineName)) {
          _tmpMedicineName = null;
        } else {
          _tmpMedicineName = _cursor.getString(_cursorIndexOfMedicineName);
        }
        final String _tmpCompanyName;
        if (_cursor.isNull(_cursorIndexOfCompanyName)) {
          _tmpCompanyName = null;
        } else {
          _tmpCompanyName = _cursor.getString(_cursorIndexOfCompanyName);
        }
        final double _tmpDiscount;
        _tmpDiscount = _cursor.getDouble(_cursorIndexOfDiscount);
        final double _tmpMrp;
        _tmpMrp = _cursor.getDouble(_cursorIndexOfMrp);
        final int _tmpAddedQty;
        _tmpAddedQty = _cursor.getInt(_cursorIndexOfAddedQty);
        final String _tmpComposition;
        if (_cursor.isNull(_cursorIndexOfComposition)) {
          _tmpComposition = null;
        } else {
          _tmpComposition = _cursor.getString(_cursorIndexOfComposition);
        }
        final String _tmpSubsDiscountPercentage;
        if (_cursor.isNull(_cursorIndexOfSubsDiscountPercentage)) {
          _tmpSubsDiscountPercentage = null;
        } else {
          _tmpSubsDiscountPercentage = _cursor.getString(_cursorIndexOfSubsDiscountPercentage);
        }
        final double _tmpSubsSellingPrice;
        _tmpSubsSellingPrice = _cursor.getDouble(_cursorIndexOfSubsSellingPrice);
        final boolean _tmpSubsFound;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfSubsFound);
        _tmpSubsFound = _tmp != 0;
        final boolean _tmpFromApi;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfFromApi);
        _tmpFromApi = _tmp_1 != 0;
        final String _tmpSubsMedProductCode;
        if (_cursor.isNull(_cursorIndexOfSubsMedProductCode)) {
          _tmpSubsMedProductCode = null;
        } else {
          _tmpSubsMedProductCode = _cursor.getString(_cursorIndexOfSubsMedProductCode);
        }
        final double _tmpSubsMrp;
        _tmpSubsMrp = _cursor.getDouble(_cursorIndexOfSubsMrp);
        final String _tmpSubsMedName;
        if (_cursor.isNull(_cursorIndexOfSubsMedName)) {
          _tmpSubsMedName = null;
        } else {
          _tmpSubsMedName = _cursor.getString(_cursorIndexOfSubsMedName);
        }
        final String _tmpSubCompanyName;
        if (_cursor.isNull(_cursorIndexOfSubCompanyName)) {
          _tmpSubCompanyName = null;
        } else {
          _tmpSubCompanyName = _cursor.getString(_cursorIndexOfSubCompanyName);
        }
        final boolean _tmpColdStorage;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfColdStorage);
        _tmpColdStorage = _tmp_2 != 0;
        final String _tmpDrugType;
        if (_cursor.isNull(_cursorIndexOfDrugType)) {
          _tmpDrugType = null;
        } else {
          _tmpDrugType = _cursor.getString(_cursorIndexOfDrugType);
        }
        final double _tmpOriginalPackSize;
        _tmpOriginalPackSize = _cursor.getDouble(_cursorIndexOfOriginalPackSize);
        final double _tmpSubstitutePackSize;
        _tmpSubstitutePackSize = _cursor.getDouble(_cursorIndexOfSubstitutePackSize);
        final boolean _tmpRxRequired;
        final int _tmp_3;
        _tmp_3 = _cursor.getInt(_cursorIndexOfRxRequired);
        _tmpRxRequired = _tmp_3 != 0;
        final int _tmpMaxCapped;
        _tmpMaxCapped = _cursor.getInt(_cursorIndexOfMaxCapped);
        final int _tmpSubsRecommendedQty;
        _tmpSubsRecommendedQty = _cursor.getInt(_cursorIndexOfSubsRecommendedQty);
        final String _tmpOriginalCountryNm;
        if (_cursor.isNull(_cursorIndexOfOriginalCountryNm)) {
          _tmpOriginalCountryNm = null;
        } else {
          _tmpOriginalCountryNm = _cursor.getString(_cursorIndexOfOriginalCountryNm);
        }
        final String _tmpSubsCountryNm;
        if (_cursor.isNull(_cursorIndexOfSubsCountryNm)) {
          _tmpSubsCountryNm = null;
        } else {
          _tmpSubsCountryNm = _cursor.getString(_cursorIndexOfSubsCountryNm);
        }
        final String _tmpSubsUnit;
        if (_cursor.isNull(_cursorIndexOfSubsUnit)) {
          _tmpSubsUnit = null;
        } else {
          _tmpSubsUnit = _cursor.getString(_cursorIndexOfSubsUnit);
        }
        final String _tmpOriginalUnit;
        if (_cursor.isNull(_cursorIndexOfOriginalUnit)) {
          _tmpOriginalUnit = null;
        } else {
          _tmpOriginalUnit = _cursor.getString(_cursorIndexOfOriginalUnit);
        }
        final String _tmpProductImageUrls;
        if (_cursor.isNull(_cursorIndexOfProductImageUrls)) {
          _tmpProductImageUrls = null;
        } else {
          _tmpProductImageUrls = _cursor.getString(_cursorIndexOfProductImageUrls);
        }
        final String _tmpOriginalCompanyAddress;
        if (_cursor.isNull(_cursorIndexOfOriginalCompanyAddress)) {
          _tmpOriginalCompanyAddress = null;
        } else {
          _tmpOriginalCompanyAddress = _cursor.getString(_cursorIndexOfOriginalCompanyAddress);
        }
        final boolean _tmpOrgAvailable;
        final int _tmp_4;
        _tmp_4 = _cursor.getInt(_cursorIndexOfOrgAvailable);
        _tmpOrgAvailable = _tmp_4 != 0;
        final long _tmpProductDetailsId;
        _tmpProductDetailsId = _cursor.getLong(_cursorIndexOfProductDetailsId);
        final long _tmpPrevOrderId;
        _tmpPrevOrderId = _cursor.getLong(_cursorIndexOfPrevOrderId);
        final long _tmpPrevOrgProductId;
        _tmpPrevOrgProductId = _cursor.getLong(_cursorIndexOfPrevOrgProductId);
        _item = new CartMedicine(_tmpId,_tmpMedicineId,_tmpMedicineName,_tmpCompanyName,_tmpDiscount,_tmpMrp,_tmpAddedQty,_tmpComposition,_tmpSubsDiscountPercentage,_tmpSubsSellingPrice,_tmpSubsFound,_tmpFromApi,_tmpSubsMedProductCode,_tmpSubsMrp,_tmpSubsMedName,_tmpSubCompanyName,_tmpColdStorage,_tmpDrugType,_tmpOriginalPackSize,_tmpSubstitutePackSize,_tmpRxRequired,_tmpMaxCapped,_tmpSubsRecommendedQty,_tmpOriginalCountryNm,_tmpSubsCountryNm,_tmpSubsUnit,_tmpOriginalUnit,_tmpProductImageUrls,_tmpOriginalCompanyAddress,_tmpOrgAvailable,_tmpProductDetailsId,_tmpPrevOrderId,_tmpPrevOrgProductId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int getCxOrgAdded(final String orgProductCode, final String subsProductCode) {
    final String _sql = "SELECT 1 FROM addedMedsTable12 WHERE medicineId = ? AND NOT EXISTS(SELECT 1 FROM addedSubsOrgInfo WHERE medicineId = ? )";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (subsProductCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, subsProductCode);
    }
    _argIndex = 2;
    if (orgProductCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, orgProductCode);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if (_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int isSubsAddedAsWell(final String orgProductCode) {
    final String _sql = "select 1 FROM addedMedsTable12 cart INNER JOIN addedSubsOrgInfo orgInfo ON cart.medicineId = orgInfo.medicineId where cart.medicineId = ? ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (orgProductCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, orgProductCode);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if (_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public long getProductsDetailId(final String orgProductCode) {
    final String _sql = "SELECT productDetailsId FROM addedMedsTable12 WHERE medicineId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (orgProductCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, orgProductCode);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final long _result;
      if (_cursor.moveToFirst()) {
        _result = _cursor.getLong(0);
      } else {
        _result = 0L;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public long getPrevOrderId(final String orgProductCode) {
    final String _sql = "SELECT prevOrderId FROM addedMedsTable12 WHERE medicineId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (orgProductCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, orgProductCode);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final long _result;
      if (_cursor.moveToFirst()) {
        _result = _cursor.getLong(0);
      } else {
        _result = 0L;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public long getPrevOrgProductId(final String orgProductCode) {
    final String _sql = "SELECT prevOrgProductId FROM addedMedsTable12 WHERE medicineId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (orgProductCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, orgProductCode);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final long _result;
      if (_cursor.moveToFirst()) {
        _result = _cursor.getLong(0);
      } else {
        _result = 0L;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Cursor fetchMedsOnCartPage(final String orderByString) {
    final String _sql = "SELECT DISTINCT org.*, IFNULL(subs.addedQty, 0) AS subsAddedQty, IFNULL(subs.subsSellingPrice, org.subsSellingPrice) AS subsSellingPrice, IFNULL(subs.subsReccommendedQty, org.subsReccommendedQty) AS subsReccommendedQty, IFNULL(subs.maxCapped, org.maxCapped) AS subsMaxCapped, subs.product_image_urls as subsProductImage, IFNULL(subs.drugType, org.drugType) as subsDrugType, IFNULL(subs.originalPackSize, org.substitutePackSize) as subsPackSize, (CASE WHEN IFNULL(orgInfo.medicineId, '') = '' THEN 'false' ELSE 'true' END) AS isReplaced, IFNULL(replaceStatus.isAutoReplace, 'false') as isAutoReplace, (CASE WHEN EXISTS(SELECT 1 FROM addedSubsOrgInfo WHERE subsMedProductCode = org.medicineId) THEN 1 ELSE 2 END ) AS location2, ( CASE WHEN (org.subsMedProductCode != org.medicineId AND org.subsMedProductCode IS NOT NULL AND org.subsMedProductCode !='' AND org.subsMedProductCode != 'null' AND IFNULL(subs.addedQty, 0) = 0) THEN 1 ELSE 2 END ) AS location1 FROM addedMedsTable12 org  LEFT JOIN (SELECT *, in_orgInfo.medicineId as OrgId FROM addedMedsTable12 in_subs INNER JOIN addedSubsOrgInfo in_orgInfo ON in_subs.medicineId = in_orgInfo.subsMedProductCode) subs ON org.subsMedProductCode = subs.medicineId AND org.subsMedProductCode != org.medicineId AND IFNULL(org.subsMedProductCode, '') != '' AND org.subsMedProductCode != 'null' AND org.medicineId = subs.OrgId LEFT JOIN addedSubsOrgInfo orgInfo ON org.medicineId = orgInfo.subsMedProductCode AND EXISTS (SELECT 1 FROM addedMedsTable12 WHERE medicineId = orgInfo.medicineId) LEFT JOIN cartReplaceStatus replaceStatus ON org.medicineId = replaceStatus.medicineId WHERE orgInfo.medicineId IS NULL ORDER BY ? ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (orderByString == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, orderByString);
    }
    final Cursor _tmpResult = __db.query(_statement);
    return _tmpResult;
  }

  @Override
  public List<String> fetchMedsSequenceOnCartPage() {
    final String _sql = "SELECT DISTINCT org.medicineId \n"
            + "FROM addedMedsTable12 org  LEFT JOIN (SELECT *, in_orgInfo.medicineId as OrgId FROM addedMedsTable12 in_subs INNER JOIN addedSubsOrgInfo in_orgInfo ON in_subs.medicineId = in_orgInfo.subsMedProductCode) subs ON org.subsMedProductCode = subs.medicineId AND org.subsMedProductCode != org.medicineId AND IFNULL(org.subsMedProductCode, '') != '' AND org.subsMedProductCode != 'null' AND org.medicineId = subs.OrgId LEFT JOIN addedSubsOrgInfo orgInfo ON org.medicineId = orgInfo.subsMedProductCode AND EXISTS (SELECT 1 FROM addedMedsTable12 WHERE medicineId = orgInfo.medicineId) LEFT JOIN cartReplaceStatus replaceStatus ON org.medicineId = replaceStatus.medicineId WHERE orgInfo.medicineId IS NULL ORDER BY \n"
            + " ( CASE WHEN (org.subsMedProductCode != org.medicineId AND org.subsMedProductCode IS NOT NULL AND org.subsMedProductCode !='' AND org.subsMedProductCode != 'null' AND IFNULL(subs.addedQty, 0) = 0) THEN 1 ELSE 2 END ) ASC, (CASE WHEN EXISTS(SELECT 1 FROM addedSubsOrgInfo WHERE subsMedProductCode = org.medicineId) THEN 1 ELSE 2 END ) ASC;";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final List<String> _result = new ArrayList<String>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final String _item;
        if (_cursor.isNull(0)) {
          _item = null;
        } else {
          _item = _cursor.getString(0);
        }
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<CartMedicine> getAddedMedListWithSubs() {
    final String _sql = "SELECT * FROM addedMedsTable12 cart WHERE medicineId!= subsMedProductCode AND subsMedProductCode IS NOT NULL AND subsMedProductCode!='null' AND subsMedProductCode!='' AND NOT EXISTS (SELECT 1 FROM addedMedsTable12 WHERE medicineId = cart.subsMedProductCode)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfMedicineId = CursorUtil.getColumnIndexOrThrow(_cursor, "medicineId");
      final int _cursorIndexOfMedicineName = CursorUtil.getColumnIndexOrThrow(_cursor, "medicineName");
      final int _cursorIndexOfCompanyName = CursorUtil.getColumnIndexOrThrow(_cursor, "companyName");
      final int _cursorIndexOfDiscount = CursorUtil.getColumnIndexOrThrow(_cursor, "discount");
      final int _cursorIndexOfMrp = CursorUtil.getColumnIndexOrThrow(_cursor, "mrp");
      final int _cursorIndexOfAddedQty = CursorUtil.getColumnIndexOrThrow(_cursor, "addedQty");
      final int _cursorIndexOfComposition = CursorUtil.getColumnIndexOrThrow(_cursor, "composition");
      final int _cursorIndexOfSubsDiscountPercentage = CursorUtil.getColumnIndexOrThrow(_cursor, "subDiscountPercentage");
      final int _cursorIndexOfSubsSellingPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "subsSellingPrice");
      final int _cursorIndexOfSubsFound = CursorUtil.getColumnIndexOrThrow(_cursor, "isSubFound");
      final int _cursorIndexOfFromApi = CursorUtil.getColumnIndexOrThrow(_cursor, "isFromApi");
      final int _cursorIndexOfSubsMedProductCode = CursorUtil.getColumnIndexOrThrow(_cursor, "subsMedProductCode");
      final int _cursorIndexOfSubsMrp = CursorUtil.getColumnIndexOrThrow(_cursor, "subsMrp");
      final int _cursorIndexOfSubsMedName = CursorUtil.getColumnIndexOrThrow(_cursor, "subsMedName");
      final int _cursorIndexOfSubCompanyName = CursorUtil.getColumnIndexOrThrow(_cursor, "subCompanyName");
      final int _cursorIndexOfColdStorage = CursorUtil.getColumnIndexOrThrow(_cursor, "isColdStorage");
      final int _cursorIndexOfDrugType = CursorUtil.getColumnIndexOrThrow(_cursor, "drugType");
      final int _cursorIndexOfOriginalPackSize = CursorUtil.getColumnIndexOrThrow(_cursor, "originalPackSize");
      final int _cursorIndexOfSubstitutePackSize = CursorUtil.getColumnIndexOrThrow(_cursor, "substitutePackSize");
      final int _cursorIndexOfRxRequired = CursorUtil.getColumnIndexOrThrow(_cursor, "prescriptionRequired");
      final int _cursorIndexOfMaxCapped = CursorUtil.getColumnIndexOrThrow(_cursor, "maxCapped");
      final int _cursorIndexOfSubsRecommendedQty = CursorUtil.getColumnIndexOrThrow(_cursor, "subsReccommendedQty");
      final int _cursorIndexOfOriginalCountryNm = CursorUtil.getColumnIndexOrThrow(_cursor, "originalCountryNm");
      final int _cursorIndexOfSubsCountryNm = CursorUtil.getColumnIndexOrThrow(_cursor, "subs_country_nm");
      final int _cursorIndexOfSubsUnit = CursorUtil.getColumnIndexOrThrow(_cursor, "subs_unit");
      final int _cursorIndexOfOriginalUnit = CursorUtil.getColumnIndexOrThrow(_cursor, "original_unit");
      final int _cursorIndexOfProductImageUrls = CursorUtil.getColumnIndexOrThrow(_cursor, "product_image_urls");
      final int _cursorIndexOfOriginalCompanyAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "original_company_addr");
      final int _cursorIndexOfOrgAvailable = CursorUtil.getColumnIndexOrThrow(_cursor, "orgAvailable");
      final int _cursorIndexOfProductDetailsId = CursorUtil.getColumnIndexOrThrow(_cursor, "productDetailsId");
      final int _cursorIndexOfPrevOrderId = CursorUtil.getColumnIndexOrThrow(_cursor, "prevOrderId");
      final int _cursorIndexOfPrevOrgProductId = CursorUtil.getColumnIndexOrThrow(_cursor, "prevOrgProductId");
      final List<CartMedicine> _result = new ArrayList<CartMedicine>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final CartMedicine _item;
        final Long _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getLong(_cursorIndexOfId);
        }
        final String _tmpMedicineId;
        if (_cursor.isNull(_cursorIndexOfMedicineId)) {
          _tmpMedicineId = null;
        } else {
          _tmpMedicineId = _cursor.getString(_cursorIndexOfMedicineId);
        }
        final String _tmpMedicineName;
        if (_cursor.isNull(_cursorIndexOfMedicineName)) {
          _tmpMedicineName = null;
        } else {
          _tmpMedicineName = _cursor.getString(_cursorIndexOfMedicineName);
        }
        final String _tmpCompanyName;
        if (_cursor.isNull(_cursorIndexOfCompanyName)) {
          _tmpCompanyName = null;
        } else {
          _tmpCompanyName = _cursor.getString(_cursorIndexOfCompanyName);
        }
        final double _tmpDiscount;
        _tmpDiscount = _cursor.getDouble(_cursorIndexOfDiscount);
        final double _tmpMrp;
        _tmpMrp = _cursor.getDouble(_cursorIndexOfMrp);
        final int _tmpAddedQty;
        _tmpAddedQty = _cursor.getInt(_cursorIndexOfAddedQty);
        final String _tmpComposition;
        if (_cursor.isNull(_cursorIndexOfComposition)) {
          _tmpComposition = null;
        } else {
          _tmpComposition = _cursor.getString(_cursorIndexOfComposition);
        }
        final String _tmpSubsDiscountPercentage;
        if (_cursor.isNull(_cursorIndexOfSubsDiscountPercentage)) {
          _tmpSubsDiscountPercentage = null;
        } else {
          _tmpSubsDiscountPercentage = _cursor.getString(_cursorIndexOfSubsDiscountPercentage);
        }
        final double _tmpSubsSellingPrice;
        _tmpSubsSellingPrice = _cursor.getDouble(_cursorIndexOfSubsSellingPrice);
        final boolean _tmpSubsFound;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfSubsFound);
        _tmpSubsFound = _tmp != 0;
        final boolean _tmpFromApi;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfFromApi);
        _tmpFromApi = _tmp_1 != 0;
        final String _tmpSubsMedProductCode;
        if (_cursor.isNull(_cursorIndexOfSubsMedProductCode)) {
          _tmpSubsMedProductCode = null;
        } else {
          _tmpSubsMedProductCode = _cursor.getString(_cursorIndexOfSubsMedProductCode);
        }
        final double _tmpSubsMrp;
        _tmpSubsMrp = _cursor.getDouble(_cursorIndexOfSubsMrp);
        final String _tmpSubsMedName;
        if (_cursor.isNull(_cursorIndexOfSubsMedName)) {
          _tmpSubsMedName = null;
        } else {
          _tmpSubsMedName = _cursor.getString(_cursorIndexOfSubsMedName);
        }
        final String _tmpSubCompanyName;
        if (_cursor.isNull(_cursorIndexOfSubCompanyName)) {
          _tmpSubCompanyName = null;
        } else {
          _tmpSubCompanyName = _cursor.getString(_cursorIndexOfSubCompanyName);
        }
        final boolean _tmpColdStorage;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfColdStorage);
        _tmpColdStorage = _tmp_2 != 0;
        final String _tmpDrugType;
        if (_cursor.isNull(_cursorIndexOfDrugType)) {
          _tmpDrugType = null;
        } else {
          _tmpDrugType = _cursor.getString(_cursorIndexOfDrugType);
        }
        final double _tmpOriginalPackSize;
        _tmpOriginalPackSize = _cursor.getDouble(_cursorIndexOfOriginalPackSize);
        final double _tmpSubstitutePackSize;
        _tmpSubstitutePackSize = _cursor.getDouble(_cursorIndexOfSubstitutePackSize);
        final boolean _tmpRxRequired;
        final int _tmp_3;
        _tmp_3 = _cursor.getInt(_cursorIndexOfRxRequired);
        _tmpRxRequired = _tmp_3 != 0;
        final int _tmpMaxCapped;
        _tmpMaxCapped = _cursor.getInt(_cursorIndexOfMaxCapped);
        final int _tmpSubsRecommendedQty;
        _tmpSubsRecommendedQty = _cursor.getInt(_cursorIndexOfSubsRecommendedQty);
        final String _tmpOriginalCountryNm;
        if (_cursor.isNull(_cursorIndexOfOriginalCountryNm)) {
          _tmpOriginalCountryNm = null;
        } else {
          _tmpOriginalCountryNm = _cursor.getString(_cursorIndexOfOriginalCountryNm);
        }
        final String _tmpSubsCountryNm;
        if (_cursor.isNull(_cursorIndexOfSubsCountryNm)) {
          _tmpSubsCountryNm = null;
        } else {
          _tmpSubsCountryNm = _cursor.getString(_cursorIndexOfSubsCountryNm);
        }
        final String _tmpSubsUnit;
        if (_cursor.isNull(_cursorIndexOfSubsUnit)) {
          _tmpSubsUnit = null;
        } else {
          _tmpSubsUnit = _cursor.getString(_cursorIndexOfSubsUnit);
        }
        final String _tmpOriginalUnit;
        if (_cursor.isNull(_cursorIndexOfOriginalUnit)) {
          _tmpOriginalUnit = null;
        } else {
          _tmpOriginalUnit = _cursor.getString(_cursorIndexOfOriginalUnit);
        }
        final String _tmpProductImageUrls;
        if (_cursor.isNull(_cursorIndexOfProductImageUrls)) {
          _tmpProductImageUrls = null;
        } else {
          _tmpProductImageUrls = _cursor.getString(_cursorIndexOfProductImageUrls);
        }
        final String _tmpOriginalCompanyAddress;
        if (_cursor.isNull(_cursorIndexOfOriginalCompanyAddress)) {
          _tmpOriginalCompanyAddress = null;
        } else {
          _tmpOriginalCompanyAddress = _cursor.getString(_cursorIndexOfOriginalCompanyAddress);
        }
        final boolean _tmpOrgAvailable;
        final int _tmp_4;
        _tmp_4 = _cursor.getInt(_cursorIndexOfOrgAvailable);
        _tmpOrgAvailable = _tmp_4 != 0;
        final long _tmpProductDetailsId;
        _tmpProductDetailsId = _cursor.getLong(_cursorIndexOfProductDetailsId);
        final long _tmpPrevOrderId;
        _tmpPrevOrderId = _cursor.getLong(_cursorIndexOfPrevOrderId);
        final long _tmpPrevOrgProductId;
        _tmpPrevOrgProductId = _cursor.getLong(_cursorIndexOfPrevOrgProductId);
        _item = new CartMedicine(_tmpId,_tmpMedicineId,_tmpMedicineName,_tmpCompanyName,_tmpDiscount,_tmpMrp,_tmpAddedQty,_tmpComposition,_tmpSubsDiscountPercentage,_tmpSubsSellingPrice,_tmpSubsFound,_tmpFromApi,_tmpSubsMedProductCode,_tmpSubsMrp,_tmpSubsMedName,_tmpSubCompanyName,_tmpColdStorage,_tmpDrugType,_tmpOriginalPackSize,_tmpSubstitutePackSize,_tmpRxRequired,_tmpMaxCapped,_tmpSubsRecommendedQty,_tmpOriginalCountryNm,_tmpSubsCountryNm,_tmpSubsUnit,_tmpOriginalUnit,_tmpProductImageUrls,_tmpOriginalCompanyAddress,_tmpOrgAvailable,_tmpProductDetailsId,_tmpPrevOrderId,_tmpPrevOrgProductId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int isAutoReplaceDone() {
    final String _sql = "SELECT Count(1) FROM cartReplaceStatus WHERE isAutoReplace='true' AND isAutoReplace='1'";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if (_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int isAutoReplace(final String medicineId) {
    final String _sql = "SELECT Count(1) FROM cartReplaceStatus WHERE medicineId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (medicineId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, medicineId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if (_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<OrgSubsInfo> getAddedSubsOrgInfo(final String subsMedProductCode) {
    final String _sql = "select * from addedSubsOrgInfo WHERE subsMedProductCode = ? ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (subsMedProductCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, subsMedProductCode);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfMedicineId = CursorUtil.getColumnIndexOrThrow(_cursor, "medicineId");
      final int _cursorIndexOfMedicineName = CursorUtil.getColumnIndexOrThrow(_cursor, "medicineName");
      final int _cursorIndexOfCompanyName = CursorUtil.getColumnIndexOrThrow(_cursor, "companyName");
      final int _cursorIndexOfDiscount = CursorUtil.getColumnIndexOrThrow(_cursor, "discount");
      final int _cursorIndexOfMrp = CursorUtil.getColumnIndexOrThrow(_cursor, "mrp");
      final int _cursorIndexOfAddedQty = CursorUtil.getColumnIndexOrThrow(_cursor, "addedQty");
      final int _cursorIndexOfComposition = CursorUtil.getColumnIndexOrThrow(_cursor, "composition");
      final int _cursorIndexOfSubsDiscountPercentage = CursorUtil.getColumnIndexOrThrow(_cursor, "subDiscountPercentage");
      final int _cursorIndexOfSubsSellingPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "subsSellingPrice");
      final int _cursorIndexOfSubsFound = CursorUtil.getColumnIndexOrThrow(_cursor, "isSubFound");
      final int _cursorIndexOfFromApi = CursorUtil.getColumnIndexOrThrow(_cursor, "isFromApi");
      final int _cursorIndexOfSubsMedProductCode = CursorUtil.getColumnIndexOrThrow(_cursor, "subsMedProductCode");
      final int _cursorIndexOfSubsMrp = CursorUtil.getColumnIndexOrThrow(_cursor, "subsMrp");
      final int _cursorIndexOfSubsMedName = CursorUtil.getColumnIndexOrThrow(_cursor, "subsMedName");
      final int _cursorIndexOfSubCompanyName = CursorUtil.getColumnIndexOrThrow(_cursor, "subCompanyName");
      final int _cursorIndexOfColdStorage = CursorUtil.getColumnIndexOrThrow(_cursor, "isColdStorage");
      final int _cursorIndexOfDrugType = CursorUtil.getColumnIndexOrThrow(_cursor, "drugType");
      final int _cursorIndexOfOriginalPackSize = CursorUtil.getColumnIndexOrThrow(_cursor, "originalPackSize");
      final int _cursorIndexOfSubstitutePackSize = CursorUtil.getColumnIndexOrThrow(_cursor, "substitutePackSize");
      final int _cursorIndexOfRxRequired = CursorUtil.getColumnIndexOrThrow(_cursor, "prescriptionRequired");
      final int _cursorIndexOfMaxCapped = CursorUtil.getColumnIndexOrThrow(_cursor, "maxCapped");
      final int _cursorIndexOfSubsRecommendedQty = CursorUtil.getColumnIndexOrThrow(_cursor, "subsReccommendedQty");
      final int _cursorIndexOfOriginalCountryNm = CursorUtil.getColumnIndexOrThrow(_cursor, "originalCountryNm");
      final int _cursorIndexOfSubsCountryNm = CursorUtil.getColumnIndexOrThrow(_cursor, "subs_country_nm");
      final int _cursorIndexOfSubsUnit = CursorUtil.getColumnIndexOrThrow(_cursor, "subs_unit");
      final int _cursorIndexOfOriginalUnit = CursorUtil.getColumnIndexOrThrow(_cursor, "original_unit");
      final int _cursorIndexOfProductImageUrls = CursorUtil.getColumnIndexOrThrow(_cursor, "product_image_urls");
      final int _cursorIndexOfOriginalCompanyAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "original_company_addr");
      final int _cursorIndexOfOrgAvailable = CursorUtil.getColumnIndexOrThrow(_cursor, "orgAvailable");
      final List<OrgSubsInfo> _result = new ArrayList<OrgSubsInfo>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final OrgSubsInfo _item;
        final Long _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getLong(_cursorIndexOfId);
        }
        final String _tmpMedicineId;
        if (_cursor.isNull(_cursorIndexOfMedicineId)) {
          _tmpMedicineId = null;
        } else {
          _tmpMedicineId = _cursor.getString(_cursorIndexOfMedicineId);
        }
        final String _tmpMedicineName;
        if (_cursor.isNull(_cursorIndexOfMedicineName)) {
          _tmpMedicineName = null;
        } else {
          _tmpMedicineName = _cursor.getString(_cursorIndexOfMedicineName);
        }
        final String _tmpCompanyName;
        if (_cursor.isNull(_cursorIndexOfCompanyName)) {
          _tmpCompanyName = null;
        } else {
          _tmpCompanyName = _cursor.getString(_cursorIndexOfCompanyName);
        }
        final double _tmpDiscount;
        _tmpDiscount = _cursor.getDouble(_cursorIndexOfDiscount);
        final double _tmpMrp;
        _tmpMrp = _cursor.getDouble(_cursorIndexOfMrp);
        final int _tmpAddedQty;
        _tmpAddedQty = _cursor.getInt(_cursorIndexOfAddedQty);
        final String _tmpComposition;
        if (_cursor.isNull(_cursorIndexOfComposition)) {
          _tmpComposition = null;
        } else {
          _tmpComposition = _cursor.getString(_cursorIndexOfComposition);
        }
        final String _tmpSubsDiscountPercentage;
        if (_cursor.isNull(_cursorIndexOfSubsDiscountPercentage)) {
          _tmpSubsDiscountPercentage = null;
        } else {
          _tmpSubsDiscountPercentage = _cursor.getString(_cursorIndexOfSubsDiscountPercentage);
        }
        final double _tmpSubsSellingPrice;
        _tmpSubsSellingPrice = _cursor.getDouble(_cursorIndexOfSubsSellingPrice);
        final boolean _tmpSubsFound;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfSubsFound);
        _tmpSubsFound = _tmp != 0;
        final boolean _tmpFromApi;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfFromApi);
        _tmpFromApi = _tmp_1 != 0;
        final String _tmpSubsMedProductCode;
        if (_cursor.isNull(_cursorIndexOfSubsMedProductCode)) {
          _tmpSubsMedProductCode = null;
        } else {
          _tmpSubsMedProductCode = _cursor.getString(_cursorIndexOfSubsMedProductCode);
        }
        final double _tmpSubsMrp;
        _tmpSubsMrp = _cursor.getDouble(_cursorIndexOfSubsMrp);
        final String _tmpSubsMedName;
        if (_cursor.isNull(_cursorIndexOfSubsMedName)) {
          _tmpSubsMedName = null;
        } else {
          _tmpSubsMedName = _cursor.getString(_cursorIndexOfSubsMedName);
        }
        final String _tmpSubCompanyName;
        if (_cursor.isNull(_cursorIndexOfSubCompanyName)) {
          _tmpSubCompanyName = null;
        } else {
          _tmpSubCompanyName = _cursor.getString(_cursorIndexOfSubCompanyName);
        }
        final boolean _tmpColdStorage;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfColdStorage);
        _tmpColdStorage = _tmp_2 != 0;
        final String _tmpDrugType;
        if (_cursor.isNull(_cursorIndexOfDrugType)) {
          _tmpDrugType = null;
        } else {
          _tmpDrugType = _cursor.getString(_cursorIndexOfDrugType);
        }
        final double _tmpOriginalPackSize;
        _tmpOriginalPackSize = _cursor.getDouble(_cursorIndexOfOriginalPackSize);
        final double _tmpSubstitutePackSize;
        _tmpSubstitutePackSize = _cursor.getDouble(_cursorIndexOfSubstitutePackSize);
        final boolean _tmpRxRequired;
        final int _tmp_3;
        _tmp_3 = _cursor.getInt(_cursorIndexOfRxRequired);
        _tmpRxRequired = _tmp_3 != 0;
        final int _tmpMaxCapped;
        _tmpMaxCapped = _cursor.getInt(_cursorIndexOfMaxCapped);
        final int _tmpSubsRecommendedQty;
        _tmpSubsRecommendedQty = _cursor.getInt(_cursorIndexOfSubsRecommendedQty);
        final String _tmpOriginalCountryNm;
        if (_cursor.isNull(_cursorIndexOfOriginalCountryNm)) {
          _tmpOriginalCountryNm = null;
        } else {
          _tmpOriginalCountryNm = _cursor.getString(_cursorIndexOfOriginalCountryNm);
        }
        final String _tmpSubsCountryNm;
        if (_cursor.isNull(_cursorIndexOfSubsCountryNm)) {
          _tmpSubsCountryNm = null;
        } else {
          _tmpSubsCountryNm = _cursor.getString(_cursorIndexOfSubsCountryNm);
        }
        final String _tmpSubsUnit;
        if (_cursor.isNull(_cursorIndexOfSubsUnit)) {
          _tmpSubsUnit = null;
        } else {
          _tmpSubsUnit = _cursor.getString(_cursorIndexOfSubsUnit);
        }
        final String _tmpOriginalUnit;
        if (_cursor.isNull(_cursorIndexOfOriginalUnit)) {
          _tmpOriginalUnit = null;
        } else {
          _tmpOriginalUnit = _cursor.getString(_cursorIndexOfOriginalUnit);
        }
        final String _tmpProductImageUrls;
        if (_cursor.isNull(_cursorIndexOfProductImageUrls)) {
          _tmpProductImageUrls = null;
        } else {
          _tmpProductImageUrls = _cursor.getString(_cursorIndexOfProductImageUrls);
        }
        final String _tmpOriginalCompanyAddress;
        if (_cursor.isNull(_cursorIndexOfOriginalCompanyAddress)) {
          _tmpOriginalCompanyAddress = null;
        } else {
          _tmpOriginalCompanyAddress = _cursor.getString(_cursorIndexOfOriginalCompanyAddress);
        }
        final boolean _tmpOrgAvailable;
        final int _tmp_4;
        _tmp_4 = _cursor.getInt(_cursorIndexOfOrgAvailable);
        _tmpOrgAvailable = _tmp_4 != 0;
        _item = new OrgSubsInfo(_tmpId,_tmpMedicineId,_tmpMedicineName,_tmpCompanyName,_tmpDiscount,_tmpMrp,_tmpAddedQty,_tmpComposition,_tmpSubsDiscountPercentage,_tmpSubsSellingPrice,_tmpSubsFound,_tmpFromApi,_tmpSubsMedProductCode,_tmpSubsMrp,_tmpSubsMedName,_tmpSubCompanyName,_tmpColdStorage,_tmpDrugType,_tmpOriginalPackSize,_tmpSubstitutePackSize,_tmpRxRequired,_tmpMaxCapped,_tmpSubsRecommendedQty,_tmpOriginalCountryNm,_tmpSubsCountryNm,_tmpSubsUnit,_tmpOriginalUnit,_tmpProductImageUrls,_tmpOriginalCompanyAddress,_tmpOrgAvailable);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public String getMedIdFromCartSequence(final String medicineId) {
    final String _sql = "select medicineId from cartItemSequence where medicineId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (medicineId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, medicineId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final String _result;
      if (_cursor.moveToFirst()) {
        if (_cursor.isNull(0)) {
          _result = null;
        } else {
          _result = _cursor.getString(0);
        }
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Cursor getAddedMedInfo(final String productCode) {
    final String _sql = "SELECT * FROM addedMedsTable12 WHERE medicineId = ?  ORDER BY (subsMedProductCode!=medicineId AND subsMedProductCode IS NOT NULL AND subsMedProductCode!='' AND subsMedProductCode!='null') DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (productCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, productCode);
    }
    final Cursor _tmpResult = __db.query(_statement);
    return _tmpResult;
  }

  @Override
  public int getAddedSubsMedCountFromMedicineId(final String orgProductCode) {
    final String _sql = "SELECT 1 FROM addedSubsOrgInfo WHERE medicineId = ? ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (orgProductCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, orgProductCode);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if (_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public boolean getCxAcceptedSubsFromReorderSubsTable(final String medicineId) {
    final String _sql = "SELECT cxAcceptedSubs FROM reorder_alternate_subs WHERE medicineId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (medicineId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, medicineId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final boolean _result;
      if (_cursor.moveToFirst()) {
        final int _tmp;
        _tmp = _cursor.getInt(0);
        _result = _tmp != 0;
      } else {
        _result = false;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public String getSubsMedCodeFromReorderSubsTable(final String medicineId) {
    final String _sql = "select SubsMedProductCode from reorder_alternate_subs where altSubsMedProductCode = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (medicineId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, medicineId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final String _result;
      if (_cursor.moveToFirst()) {
        if (_cursor.isNull(0)) {
          _result = null;
        } else {
          _result = _cursor.getString(0);
        }
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Cursor getExistingCartItems() {
    final String _sql = "select medicineId, addedQty from addedMedsTable12";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _tmpResult = __db.query(_statement);
    return _tmpResult;
  }

  @Override
  public Cursor checkSubExistsInReorder(final String subsProductCode) {
    final String _sql = "SELECT Count(1) FROM reorder_alternate_subs WHERE SubsMedProductCode = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (subsProductCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, subsProductCode);
    }
    final Cursor _tmpResult = __db.query(_statement);
    return _tmpResult;
  }

  @Override
  public Cursor getAltReOrderSubsCode(final String subsProductCode) {
    final String _sql = "SELECT altSubsMedProductCode FROM reorder_alternate_subs WHERE SubsMedProductCode = ? ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (subsProductCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, subsProductCode);
    }
    final Cursor _tmpResult = __db.query(_statement);
    return _tmpResult;
  }

  @Override
  public Cursor getSubsName(final String subsProductCode) {
    final String _sql = "SELECT subsMedName FROM addedMedsTable12 WHERE subsMedProductCode = ? ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (subsProductCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, subsProductCode);
    }
    final Cursor _tmpResult = __db.query(_statement);
    return _tmpResult;
  }

  @Override
  public String getAltSubsMedName(final String medicineId) {
    final String _sql = "SELECT altSubsMedName FROM reorder_alternate_subs WHERE medicineId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (medicineId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, medicineId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final String _result;
      if (_cursor.moveToFirst()) {
        if (_cursor.isNull(0)) {
          _result = null;
        } else {
          _result = _cursor.getString(0);
        }
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public String getAltSubsUnit(final String medicineId) {
    final String _sql = "SELECT altSubsUnit FROM reorder_alternate_subs WHERE medicineId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (medicineId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, medicineId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final String _result;
      if (_cursor.moveToFirst()) {
        if (_cursor.isNull(0)) {
          _result = null;
        } else {
          _result = _cursor.getString(0);
        }
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public double getAltSubsPack(final String medicineId) {
    final String _sql = "SELECT altSubsPackSize FROM reorder_alternate_subs WHERE medicineId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (medicineId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, medicineId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final double _result;
      if (_cursor.moveToFirst()) {
        _result = _cursor.getDouble(0);
      } else {
        _result = 0.0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public boolean getIsAltSubsAvailable(final String medicineId) {
    final String _sql = "SELECT isAltSubAvailable FROM reorder_alternate_subs WHERE medicineId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (medicineId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, medicineId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final boolean _result;
      if (_cursor.moveToFirst()) {
        final int _tmp;
        _tmp = _cursor.getInt(0);
        _result = _tmp != 0;
      } else {
        _result = false;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public boolean getShowOnlyOrg(final String medicineId) {
    final String _sql = "SELECT showOnlyOrg FROM reorder_alternate_subs WHERE medicineId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (medicineId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, medicineId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final boolean _result;
      if (_cursor.moveToFirst()) {
        final int _tmp;
        _tmp = _cursor.getInt(0);
        _result = _tmp != 0;
      } else {
        _result = false;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public String getAltSubsMedProductCode(final String medicineId) {
    final String _sql = "SELECT altSubsMedProductCode FROM reorder_alternate_subs WHERE medicineId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (medicineId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, medicineId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final String _result;
      if (_cursor.moveToFirst()) {
        if (_cursor.isNull(0)) {
          _result = null;
        } else {
          _result = _cursor.getString(0);
        }
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public String getAltSubsCompanyName(final String medicineId) {
    final String _sql = "SELECT altSubsCompanyName FROM reorder_alternate_subs WHERE medicineId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (medicineId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, medicineId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final String _result;
      if (_cursor.moveToFirst()) {
        if (_cursor.isNull(0)) {
          _result = null;
        } else {
          _result = _cursor.getString(0);
        }
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public double getAltSubsMrp(final String medicineId) {
    final String _sql = "SELECT altSubsMrp FROM reorder_alternate_subs WHERE medicineId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (medicineId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, medicineId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final double _result;
      if (_cursor.moveToFirst()) {
        _result = _cursor.getDouble(0);
      } else {
        _result = 0.0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public double getAltSubsSellingPrice(final String medicineId) {
    final String _sql = "SELECT altSubsSellingPrice FROM reorder_alternate_subs WHERE medicineId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (medicineId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, medicineId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final double _result;
      if (_cursor.moveToFirst()) {
        _result = _cursor.getDouble(0);
      } else {
        _result = 0.0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public double getAltSubsDiscountPercentage(final String medicineId) {
    final String _sql = "SELECT altSubsDiscountPercentage FROM reorder_alternate_subs WHERE medicineId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (medicineId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, medicineId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final double _result;
      if (_cursor.moveToFirst()) {
        _result = _cursor.getDouble(0);
      } else {
        _result = 0.0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public boolean getAltSubsAvailable(final String medicineId) {
    final String _sql = "SELECT isSubAvailable FROM reorder_alternate_subs WHERE SubsMedProductCode = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (medicineId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, medicineId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final boolean _result;
      if (_cursor.moveToFirst()) {
        final int _tmp;
        _tmp = _cursor.getInt(0);
        _result = _tmp != 0;
      } else {
        _result = false;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public boolean getOrgReplaceStatus(final String medicineId) {
    final String _sql = "select isReplace from reorder_alternate_subs where medicineId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (medicineId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, medicineId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final boolean _result;
      if (_cursor.moveToFirst()) {
        final int _tmp;
        _tmp = _cursor.getInt(0);
        _result = _tmp != 0;
      } else {
        _result = false;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public boolean getCxKeepOriginal(final String medicineId) {
    final String _sql = "select cxKeepOriginal from reorder_alternate_subs where medicineId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (medicineId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, medicineId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final boolean _result;
      if (_cursor.moveToFirst()) {
        final int _tmp;
        _tmp = _cursor.getInt(0);
        _result = _tmp != 0;
      } else {
        _result = false;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<CartMedicine> getAddedSubsInfoByOrg(final String orgProductCode) {
    final String _sql = "select * from addedMedsTable12 WHERE medicineId = (SELECT subsMedProductCode FROM addedSubsOrgInfo WHERE medicineId = ?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (orgProductCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, orgProductCode);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfMedicineId = CursorUtil.getColumnIndexOrThrow(_cursor, "medicineId");
      final int _cursorIndexOfMedicineName = CursorUtil.getColumnIndexOrThrow(_cursor, "medicineName");
      final int _cursorIndexOfCompanyName = CursorUtil.getColumnIndexOrThrow(_cursor, "companyName");
      final int _cursorIndexOfDiscount = CursorUtil.getColumnIndexOrThrow(_cursor, "discount");
      final int _cursorIndexOfMrp = CursorUtil.getColumnIndexOrThrow(_cursor, "mrp");
      final int _cursorIndexOfAddedQty = CursorUtil.getColumnIndexOrThrow(_cursor, "addedQty");
      final int _cursorIndexOfComposition = CursorUtil.getColumnIndexOrThrow(_cursor, "composition");
      final int _cursorIndexOfSubsDiscountPercentage = CursorUtil.getColumnIndexOrThrow(_cursor, "subDiscountPercentage");
      final int _cursorIndexOfSubsSellingPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "subsSellingPrice");
      final int _cursorIndexOfSubsFound = CursorUtil.getColumnIndexOrThrow(_cursor, "isSubFound");
      final int _cursorIndexOfFromApi = CursorUtil.getColumnIndexOrThrow(_cursor, "isFromApi");
      final int _cursorIndexOfSubsMedProductCode = CursorUtil.getColumnIndexOrThrow(_cursor, "subsMedProductCode");
      final int _cursorIndexOfSubsMrp = CursorUtil.getColumnIndexOrThrow(_cursor, "subsMrp");
      final int _cursorIndexOfSubsMedName = CursorUtil.getColumnIndexOrThrow(_cursor, "subsMedName");
      final int _cursorIndexOfSubCompanyName = CursorUtil.getColumnIndexOrThrow(_cursor, "subCompanyName");
      final int _cursorIndexOfColdStorage = CursorUtil.getColumnIndexOrThrow(_cursor, "isColdStorage");
      final int _cursorIndexOfDrugType = CursorUtil.getColumnIndexOrThrow(_cursor, "drugType");
      final int _cursorIndexOfOriginalPackSize = CursorUtil.getColumnIndexOrThrow(_cursor, "originalPackSize");
      final int _cursorIndexOfSubstitutePackSize = CursorUtil.getColumnIndexOrThrow(_cursor, "substitutePackSize");
      final int _cursorIndexOfRxRequired = CursorUtil.getColumnIndexOrThrow(_cursor, "prescriptionRequired");
      final int _cursorIndexOfMaxCapped = CursorUtil.getColumnIndexOrThrow(_cursor, "maxCapped");
      final int _cursorIndexOfSubsRecommendedQty = CursorUtil.getColumnIndexOrThrow(_cursor, "subsReccommendedQty");
      final int _cursorIndexOfOriginalCountryNm = CursorUtil.getColumnIndexOrThrow(_cursor, "originalCountryNm");
      final int _cursorIndexOfSubsCountryNm = CursorUtil.getColumnIndexOrThrow(_cursor, "subs_country_nm");
      final int _cursorIndexOfSubsUnit = CursorUtil.getColumnIndexOrThrow(_cursor, "subs_unit");
      final int _cursorIndexOfOriginalUnit = CursorUtil.getColumnIndexOrThrow(_cursor, "original_unit");
      final int _cursorIndexOfProductImageUrls = CursorUtil.getColumnIndexOrThrow(_cursor, "product_image_urls");
      final int _cursorIndexOfOriginalCompanyAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "original_company_addr");
      final int _cursorIndexOfOrgAvailable = CursorUtil.getColumnIndexOrThrow(_cursor, "orgAvailable");
      final int _cursorIndexOfProductDetailsId = CursorUtil.getColumnIndexOrThrow(_cursor, "productDetailsId");
      final int _cursorIndexOfPrevOrderId = CursorUtil.getColumnIndexOrThrow(_cursor, "prevOrderId");
      final int _cursorIndexOfPrevOrgProductId = CursorUtil.getColumnIndexOrThrow(_cursor, "prevOrgProductId");
      final List<CartMedicine> _result = new ArrayList<CartMedicine>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final CartMedicine _item;
        final Long _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getLong(_cursorIndexOfId);
        }
        final String _tmpMedicineId;
        if (_cursor.isNull(_cursorIndexOfMedicineId)) {
          _tmpMedicineId = null;
        } else {
          _tmpMedicineId = _cursor.getString(_cursorIndexOfMedicineId);
        }
        final String _tmpMedicineName;
        if (_cursor.isNull(_cursorIndexOfMedicineName)) {
          _tmpMedicineName = null;
        } else {
          _tmpMedicineName = _cursor.getString(_cursorIndexOfMedicineName);
        }
        final String _tmpCompanyName;
        if (_cursor.isNull(_cursorIndexOfCompanyName)) {
          _tmpCompanyName = null;
        } else {
          _tmpCompanyName = _cursor.getString(_cursorIndexOfCompanyName);
        }
        final double _tmpDiscount;
        _tmpDiscount = _cursor.getDouble(_cursorIndexOfDiscount);
        final double _tmpMrp;
        _tmpMrp = _cursor.getDouble(_cursorIndexOfMrp);
        final int _tmpAddedQty;
        _tmpAddedQty = _cursor.getInt(_cursorIndexOfAddedQty);
        final String _tmpComposition;
        if (_cursor.isNull(_cursorIndexOfComposition)) {
          _tmpComposition = null;
        } else {
          _tmpComposition = _cursor.getString(_cursorIndexOfComposition);
        }
        final String _tmpSubsDiscountPercentage;
        if (_cursor.isNull(_cursorIndexOfSubsDiscountPercentage)) {
          _tmpSubsDiscountPercentage = null;
        } else {
          _tmpSubsDiscountPercentage = _cursor.getString(_cursorIndexOfSubsDiscountPercentage);
        }
        final double _tmpSubsSellingPrice;
        _tmpSubsSellingPrice = _cursor.getDouble(_cursorIndexOfSubsSellingPrice);
        final boolean _tmpSubsFound;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfSubsFound);
        _tmpSubsFound = _tmp != 0;
        final boolean _tmpFromApi;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfFromApi);
        _tmpFromApi = _tmp_1 != 0;
        final String _tmpSubsMedProductCode;
        if (_cursor.isNull(_cursorIndexOfSubsMedProductCode)) {
          _tmpSubsMedProductCode = null;
        } else {
          _tmpSubsMedProductCode = _cursor.getString(_cursorIndexOfSubsMedProductCode);
        }
        final double _tmpSubsMrp;
        _tmpSubsMrp = _cursor.getDouble(_cursorIndexOfSubsMrp);
        final String _tmpSubsMedName;
        if (_cursor.isNull(_cursorIndexOfSubsMedName)) {
          _tmpSubsMedName = null;
        } else {
          _tmpSubsMedName = _cursor.getString(_cursorIndexOfSubsMedName);
        }
        final String _tmpSubCompanyName;
        if (_cursor.isNull(_cursorIndexOfSubCompanyName)) {
          _tmpSubCompanyName = null;
        } else {
          _tmpSubCompanyName = _cursor.getString(_cursorIndexOfSubCompanyName);
        }
        final boolean _tmpColdStorage;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfColdStorage);
        _tmpColdStorage = _tmp_2 != 0;
        final String _tmpDrugType;
        if (_cursor.isNull(_cursorIndexOfDrugType)) {
          _tmpDrugType = null;
        } else {
          _tmpDrugType = _cursor.getString(_cursorIndexOfDrugType);
        }
        final double _tmpOriginalPackSize;
        _tmpOriginalPackSize = _cursor.getDouble(_cursorIndexOfOriginalPackSize);
        final double _tmpSubstitutePackSize;
        _tmpSubstitutePackSize = _cursor.getDouble(_cursorIndexOfSubstitutePackSize);
        final boolean _tmpRxRequired;
        final int _tmp_3;
        _tmp_3 = _cursor.getInt(_cursorIndexOfRxRequired);
        _tmpRxRequired = _tmp_3 != 0;
        final int _tmpMaxCapped;
        _tmpMaxCapped = _cursor.getInt(_cursorIndexOfMaxCapped);
        final int _tmpSubsRecommendedQty;
        _tmpSubsRecommendedQty = _cursor.getInt(_cursorIndexOfSubsRecommendedQty);
        final String _tmpOriginalCountryNm;
        if (_cursor.isNull(_cursorIndexOfOriginalCountryNm)) {
          _tmpOriginalCountryNm = null;
        } else {
          _tmpOriginalCountryNm = _cursor.getString(_cursorIndexOfOriginalCountryNm);
        }
        final String _tmpSubsCountryNm;
        if (_cursor.isNull(_cursorIndexOfSubsCountryNm)) {
          _tmpSubsCountryNm = null;
        } else {
          _tmpSubsCountryNm = _cursor.getString(_cursorIndexOfSubsCountryNm);
        }
        final String _tmpSubsUnit;
        if (_cursor.isNull(_cursorIndexOfSubsUnit)) {
          _tmpSubsUnit = null;
        } else {
          _tmpSubsUnit = _cursor.getString(_cursorIndexOfSubsUnit);
        }
        final String _tmpOriginalUnit;
        if (_cursor.isNull(_cursorIndexOfOriginalUnit)) {
          _tmpOriginalUnit = null;
        } else {
          _tmpOriginalUnit = _cursor.getString(_cursorIndexOfOriginalUnit);
        }
        final String _tmpProductImageUrls;
        if (_cursor.isNull(_cursorIndexOfProductImageUrls)) {
          _tmpProductImageUrls = null;
        } else {
          _tmpProductImageUrls = _cursor.getString(_cursorIndexOfProductImageUrls);
        }
        final String _tmpOriginalCompanyAddress;
        if (_cursor.isNull(_cursorIndexOfOriginalCompanyAddress)) {
          _tmpOriginalCompanyAddress = null;
        } else {
          _tmpOriginalCompanyAddress = _cursor.getString(_cursorIndexOfOriginalCompanyAddress);
        }
        final boolean _tmpOrgAvailable;
        final int _tmp_4;
        _tmp_4 = _cursor.getInt(_cursorIndexOfOrgAvailable);
        _tmpOrgAvailable = _tmp_4 != 0;
        final long _tmpProductDetailsId;
        _tmpProductDetailsId = _cursor.getLong(_cursorIndexOfProductDetailsId);
        final long _tmpPrevOrderId;
        _tmpPrevOrderId = _cursor.getLong(_cursorIndexOfPrevOrderId);
        final long _tmpPrevOrgProductId;
        _tmpPrevOrgProductId = _cursor.getLong(_cursorIndexOfPrevOrgProductId);
        _item = new CartMedicine(_tmpId,_tmpMedicineId,_tmpMedicineName,_tmpCompanyName,_tmpDiscount,_tmpMrp,_tmpAddedQty,_tmpComposition,_tmpSubsDiscountPercentage,_tmpSubsSellingPrice,_tmpSubsFound,_tmpFromApi,_tmpSubsMedProductCode,_tmpSubsMrp,_tmpSubsMedName,_tmpSubCompanyName,_tmpColdStorage,_tmpDrugType,_tmpOriginalPackSize,_tmpSubstitutePackSize,_tmpRxRequired,_tmpMaxCapped,_tmpSubsRecommendedQty,_tmpOriginalCountryNm,_tmpSubsCountryNm,_tmpSubsUnit,_tmpOriginalUnit,_tmpProductImageUrls,_tmpOriginalCompanyAddress,_tmpOrgAvailable,_tmpProductDetailsId,_tmpPrevOrderId,_tmpPrevOrgProductId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Boolean isSubsAvailableInReOrderAltSubs(final String medicineId) {
    final String _sql = "SELECT isSubAvailable FROM reorder_alternate_subs WHERE medicineId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (medicineId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, medicineId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final Boolean _result;
      if (_cursor.moveToFirst()) {
        final Integer _tmp;
        if (_cursor.isNull(0)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getInt(0);
        }
        _result = _tmp == null ? null : _tmp != 0;
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public boolean isOrgAvailableFromAddedMeds(final String medicineId) {
    final String _sql = "SELECT orgAvailable FROM addedMedsTable12 WHERE medicineId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (medicineId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, medicineId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final boolean _result;
      if (_cursor.moveToFirst()) {
        final int _tmp;
        _tmp = _cursor.getInt(0);
        _result = _tmp != 0;
      } else {
        _result = false;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<AddedCrossSelling> getAddedCrossSellingProducts() {
    final String _sql = "select * from AddedCrossSelling";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfProductCode = CursorUtil.getColumnIndexOrThrow(_cursor, "ProductCode");
      final List<AddedCrossSelling> _result = new ArrayList<AddedCrossSelling>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final AddedCrossSelling _item;
        final Long _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getLong(_cursorIndexOfId);
        }
        final String _tmpProductCode;
        if (_cursor.isNull(_cursorIndexOfProductCode)) {
          _tmpProductCode = null;
        } else {
          _tmpProductCode = _cursor.getString(_cursorIndexOfProductCode);
        }
        _item = new AddedCrossSelling(_tmpId,_tmpProductCode);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int getPrevOrderIdItemCount() {
    final String _sql = "SELECT Count(prevOrgProductId) FROM addedMedsTable12 WHERE prevOrgProductId > 0 ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if (_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public boolean getOrgAvailableFromOrgSubs(final String medicineId) {
    final String _sql = "select orgAvailable from addedSubsOrgInfo where subsMedProductCode = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (medicineId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, medicineId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final boolean _result;
      if (_cursor.moveToFirst()) {
        final int _tmp;
        _tmp = _cursor.getInt(0);
        _result = _tmp != 0;
      } else {
        _result = false;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public String getReplacedMedId(final String medicineId) {
    final String _sql = "select medicineId from addedSubsOrgInfo where subsMedProductCode = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (medicineId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, medicineId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final String _result;
      if (_cursor.moveToFirst()) {
        if (_cursor.isNull(0)) {
          _result = null;
        } else {
          _result = _cursor.getString(0);
        }
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public String getReplacedMedName(final String medicineId) {
    final String _sql = "select medicineName from addedSubsOrgInfo where subsMedProductCode = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (medicineId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, medicineId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final String _result;
      if (_cursor.moveToFirst()) {
        if (_cursor.isNull(0)) {
          _result = null;
        } else {
          _result = _cursor.getString(0);
        }
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public String getSubsDiscountPercentage(final String medicineId) {
    final String _sql = "select subDiscountPercentage from addedSubsOrgInfo where subsMedProductCode = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (medicineId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, medicineId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final String _result;
      if (_cursor.moveToFirst()) {
        if (_cursor.isNull(0)) {
          _result = null;
        } else {
          _result = _cursor.getString(0);
        }
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int isSubsItselfAddedToCart() {
    final String _sql = "SELECT 1 FROM addedMedsTable12 WHERE medicineId = subsMedProductCode AND subsMedProductCode IS NOT NULL AND subsMedProductCode!='null' AND subsMedProductCode!=''";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if (_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int isOrgHavingSubsAddedToCart() {
    final String _sql = "SELECT 1 FROM addedMedsTable12 WHERE medicineId != subsMedProductCode AND subsMedProductCode IS NOT NULL AND subsMedProductCode!='null' AND subsMedProductCode!=''";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if (_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int isOrgHavingNoSubsAddedToCart() {
    final String _sql = "SELECT 1 FROM addedMedsTable12 WHERE subsMedProductCode IS NULL OR subsMedProductCode ='null' OR subsMedProductCode=''";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if (_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int isSubAddedFromOrgToCart() {
    final String _sql = "SELECT 1 FROM addedSubsOrgInfo";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if (_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Cursor getAddedSubsOrgInfoFromOrgId(final String medicineId) {
    final String _sql = "select * from addedSubsOrgInfo WHERE medicineId = ? ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (medicineId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, medicineId);
    }
    final Cursor _tmpResult = __db.query(_statement);
    return _tmpResult;
  }

  @Override
  public String getOrgInfoCodeInReorder(final String medicineId) {
    final String _sql = "SELECT SubsMedProductCode FROM reorder_alternate_subs WHERE medicineId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (medicineId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, medicineId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final String _result;
      if (_cursor.moveToFirst()) {
        if (_cursor.isNull(0)) {
          _result = null;
        } else {
          _result = _cursor.getString(0);
        }
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public long getAllDoctorConfirmationSubOption(final String value) {
    final String _sql = "SELECT reasonId FROM doctor_confirmation_sub_options WHERE key_value = ? ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (value == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, value);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final long _result;
      if (_cursor.moveToFirst()) {
        _result = _cursor.getLong(0);
      } else {
        _result = 0L;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Cursor getReorderPatientInfo() {
    final String _sql = "select patientID, patientName, orderAddress, addressID, orderID from reorder_alternate_subs;";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _tmpResult = __db.query(_statement);
    return _tmpResult;
  }

  @Override
  public Cursor getAddedMedListNotInOrgInfo() {
    final String _sql = "select * from addedMedsTable12 WHERE medicineId NOT IN (SELECT medicineId FROM addedSubsOrgInfo)ORDER BY (subsMedProductCode!=medicineId AND subsMedProductCode IS NOT NULL AND subsMedProductCode!='' AND subsMedProductCode!='null') DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _tmpResult = __db.query(_statement);
    return _tmpResult;
  }

  @Override
  public int isProductAddedAsReplacedInReorder(final String productCode) {
    final String _sql = "SELECT 1 FROM reorder_alternate_subs WHERE (SubsMedProductCode = ? OR altSubsMedProductCode = ? ) AND (isReplace = '1' OR isReplace = 'true')";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (productCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, productCode);
    }
    _argIndex = 2;
    if (productCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, productCode);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if (_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public String getProductCodeFromRecentlySearch(final String productCode) {
    final String _sql = "select productCode from recentlySearched where productCode = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (productCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, productCode);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final String _result;
      if (_cursor.moveToFirst()) {
        if (_cursor.isNull(0)) {
          _result = null;
        } else {
          _result = _cursor.getString(0);
        }
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public String getImageUrlFromAddedMeds(final String medicineId) {
    final String _sql = "select product_image_urls from addedMedsTable12 where medicineId=? ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (medicineId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, medicineId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final String _result;
      if (_cursor.moveToFirst()) {
        if (_cursor.isNull(0)) {
          _result = null;
        } else {
          _result = _cursor.getString(0);
        }
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public String getKeyValueFromSearchCategory(final String key) {
    final String _sql = "select key_value from search_category where key_name = ? ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (key == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, key);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final String _result;
      if (_cursor.moveToFirst()) {
        if (_cursor.isNull(0)) {
          _result = null;
        } else {
          _result = _cursor.getString(0);
        }
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public String getKeyValueFromSearchCategoryIgnoreCase(final String key) {
    final String _sql = "select key_value from search_category where key_name = ? LIMIT 1 COLLATE NOCASE";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (key == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, key);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final String _result;
      if (_cursor.moveToFirst()) {
        if (_cursor.isNull(0)) {
          _result = null;
        } else {
          _result = _cursor.getString(0);
        }
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public String getMedicineIdFromReorderMed(final String medicineId) {
    final String _sql = "SELECT medicineId FROM reorder_alternate_subs WHERE medicineId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (medicineId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, medicineId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final String _result;
      if (_cursor.moveToFirst()) {
        if (_cursor.isNull(0)) {
          _result = null;
        } else {
          _result = _cursor.getString(0);
        }
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public String getMedIdFromCartTable(final String medicineId) {
    final String _sql = "select medicineId from addedSubsOrgInfo where medicineId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (medicineId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, medicineId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final String _result;
      if (_cursor.moveToFirst()) {
        if (_cursor.isNull(0)) {
          _result = null;
        } else {
          _result = _cursor.getString(0);
        }
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public CartMedicine getAddedMedDetails(final String medicineId) {
    final String _sql = "SELECT * FROM addedMedsTable12 WHERE medicineId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (medicineId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, medicineId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfMedicineId = CursorUtil.getColumnIndexOrThrow(_cursor, "medicineId");
      final int _cursorIndexOfMedicineName = CursorUtil.getColumnIndexOrThrow(_cursor, "medicineName");
      final int _cursorIndexOfCompanyName = CursorUtil.getColumnIndexOrThrow(_cursor, "companyName");
      final int _cursorIndexOfDiscount = CursorUtil.getColumnIndexOrThrow(_cursor, "discount");
      final int _cursorIndexOfMrp = CursorUtil.getColumnIndexOrThrow(_cursor, "mrp");
      final int _cursorIndexOfAddedQty = CursorUtil.getColumnIndexOrThrow(_cursor, "addedQty");
      final int _cursorIndexOfComposition = CursorUtil.getColumnIndexOrThrow(_cursor, "composition");
      final int _cursorIndexOfSubsDiscountPercentage = CursorUtil.getColumnIndexOrThrow(_cursor, "subDiscountPercentage");
      final int _cursorIndexOfSubsSellingPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "subsSellingPrice");
      final int _cursorIndexOfSubsFound = CursorUtil.getColumnIndexOrThrow(_cursor, "isSubFound");
      final int _cursorIndexOfFromApi = CursorUtil.getColumnIndexOrThrow(_cursor, "isFromApi");
      final int _cursorIndexOfSubsMedProductCode = CursorUtil.getColumnIndexOrThrow(_cursor, "subsMedProductCode");
      final int _cursorIndexOfSubsMrp = CursorUtil.getColumnIndexOrThrow(_cursor, "subsMrp");
      final int _cursorIndexOfSubsMedName = CursorUtil.getColumnIndexOrThrow(_cursor, "subsMedName");
      final int _cursorIndexOfSubCompanyName = CursorUtil.getColumnIndexOrThrow(_cursor, "subCompanyName");
      final int _cursorIndexOfColdStorage = CursorUtil.getColumnIndexOrThrow(_cursor, "isColdStorage");
      final int _cursorIndexOfDrugType = CursorUtil.getColumnIndexOrThrow(_cursor, "drugType");
      final int _cursorIndexOfOriginalPackSize = CursorUtil.getColumnIndexOrThrow(_cursor, "originalPackSize");
      final int _cursorIndexOfSubstitutePackSize = CursorUtil.getColumnIndexOrThrow(_cursor, "substitutePackSize");
      final int _cursorIndexOfRxRequired = CursorUtil.getColumnIndexOrThrow(_cursor, "prescriptionRequired");
      final int _cursorIndexOfMaxCapped = CursorUtil.getColumnIndexOrThrow(_cursor, "maxCapped");
      final int _cursorIndexOfSubsRecommendedQty = CursorUtil.getColumnIndexOrThrow(_cursor, "subsReccommendedQty");
      final int _cursorIndexOfOriginalCountryNm = CursorUtil.getColumnIndexOrThrow(_cursor, "originalCountryNm");
      final int _cursorIndexOfSubsCountryNm = CursorUtil.getColumnIndexOrThrow(_cursor, "subs_country_nm");
      final int _cursorIndexOfSubsUnit = CursorUtil.getColumnIndexOrThrow(_cursor, "subs_unit");
      final int _cursorIndexOfOriginalUnit = CursorUtil.getColumnIndexOrThrow(_cursor, "original_unit");
      final int _cursorIndexOfProductImageUrls = CursorUtil.getColumnIndexOrThrow(_cursor, "product_image_urls");
      final int _cursorIndexOfOriginalCompanyAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "original_company_addr");
      final int _cursorIndexOfOrgAvailable = CursorUtil.getColumnIndexOrThrow(_cursor, "orgAvailable");
      final int _cursorIndexOfProductDetailsId = CursorUtil.getColumnIndexOrThrow(_cursor, "productDetailsId");
      final int _cursorIndexOfPrevOrderId = CursorUtil.getColumnIndexOrThrow(_cursor, "prevOrderId");
      final int _cursorIndexOfPrevOrgProductId = CursorUtil.getColumnIndexOrThrow(_cursor, "prevOrgProductId");
      final CartMedicine _result;
      if (_cursor.moveToFirst()) {
        final Long _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getLong(_cursorIndexOfId);
        }
        final String _tmpMedicineId;
        if (_cursor.isNull(_cursorIndexOfMedicineId)) {
          _tmpMedicineId = null;
        } else {
          _tmpMedicineId = _cursor.getString(_cursorIndexOfMedicineId);
        }
        final String _tmpMedicineName;
        if (_cursor.isNull(_cursorIndexOfMedicineName)) {
          _tmpMedicineName = null;
        } else {
          _tmpMedicineName = _cursor.getString(_cursorIndexOfMedicineName);
        }
        final String _tmpCompanyName;
        if (_cursor.isNull(_cursorIndexOfCompanyName)) {
          _tmpCompanyName = null;
        } else {
          _tmpCompanyName = _cursor.getString(_cursorIndexOfCompanyName);
        }
        final double _tmpDiscount;
        _tmpDiscount = _cursor.getDouble(_cursorIndexOfDiscount);
        final double _tmpMrp;
        _tmpMrp = _cursor.getDouble(_cursorIndexOfMrp);
        final int _tmpAddedQty;
        _tmpAddedQty = _cursor.getInt(_cursorIndexOfAddedQty);
        final String _tmpComposition;
        if (_cursor.isNull(_cursorIndexOfComposition)) {
          _tmpComposition = null;
        } else {
          _tmpComposition = _cursor.getString(_cursorIndexOfComposition);
        }
        final String _tmpSubsDiscountPercentage;
        if (_cursor.isNull(_cursorIndexOfSubsDiscountPercentage)) {
          _tmpSubsDiscountPercentage = null;
        } else {
          _tmpSubsDiscountPercentage = _cursor.getString(_cursorIndexOfSubsDiscountPercentage);
        }
        final double _tmpSubsSellingPrice;
        _tmpSubsSellingPrice = _cursor.getDouble(_cursorIndexOfSubsSellingPrice);
        final boolean _tmpSubsFound;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfSubsFound);
        _tmpSubsFound = _tmp != 0;
        final boolean _tmpFromApi;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfFromApi);
        _tmpFromApi = _tmp_1 != 0;
        final String _tmpSubsMedProductCode;
        if (_cursor.isNull(_cursorIndexOfSubsMedProductCode)) {
          _tmpSubsMedProductCode = null;
        } else {
          _tmpSubsMedProductCode = _cursor.getString(_cursorIndexOfSubsMedProductCode);
        }
        final double _tmpSubsMrp;
        _tmpSubsMrp = _cursor.getDouble(_cursorIndexOfSubsMrp);
        final String _tmpSubsMedName;
        if (_cursor.isNull(_cursorIndexOfSubsMedName)) {
          _tmpSubsMedName = null;
        } else {
          _tmpSubsMedName = _cursor.getString(_cursorIndexOfSubsMedName);
        }
        final String _tmpSubCompanyName;
        if (_cursor.isNull(_cursorIndexOfSubCompanyName)) {
          _tmpSubCompanyName = null;
        } else {
          _tmpSubCompanyName = _cursor.getString(_cursorIndexOfSubCompanyName);
        }
        final boolean _tmpColdStorage;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfColdStorage);
        _tmpColdStorage = _tmp_2 != 0;
        final String _tmpDrugType;
        if (_cursor.isNull(_cursorIndexOfDrugType)) {
          _tmpDrugType = null;
        } else {
          _tmpDrugType = _cursor.getString(_cursorIndexOfDrugType);
        }
        final double _tmpOriginalPackSize;
        _tmpOriginalPackSize = _cursor.getDouble(_cursorIndexOfOriginalPackSize);
        final double _tmpSubstitutePackSize;
        _tmpSubstitutePackSize = _cursor.getDouble(_cursorIndexOfSubstitutePackSize);
        final boolean _tmpRxRequired;
        final int _tmp_3;
        _tmp_3 = _cursor.getInt(_cursorIndexOfRxRequired);
        _tmpRxRequired = _tmp_3 != 0;
        final int _tmpMaxCapped;
        _tmpMaxCapped = _cursor.getInt(_cursorIndexOfMaxCapped);
        final int _tmpSubsRecommendedQty;
        _tmpSubsRecommendedQty = _cursor.getInt(_cursorIndexOfSubsRecommendedQty);
        final String _tmpOriginalCountryNm;
        if (_cursor.isNull(_cursorIndexOfOriginalCountryNm)) {
          _tmpOriginalCountryNm = null;
        } else {
          _tmpOriginalCountryNm = _cursor.getString(_cursorIndexOfOriginalCountryNm);
        }
        final String _tmpSubsCountryNm;
        if (_cursor.isNull(_cursorIndexOfSubsCountryNm)) {
          _tmpSubsCountryNm = null;
        } else {
          _tmpSubsCountryNm = _cursor.getString(_cursorIndexOfSubsCountryNm);
        }
        final String _tmpSubsUnit;
        if (_cursor.isNull(_cursorIndexOfSubsUnit)) {
          _tmpSubsUnit = null;
        } else {
          _tmpSubsUnit = _cursor.getString(_cursorIndexOfSubsUnit);
        }
        final String _tmpOriginalUnit;
        if (_cursor.isNull(_cursorIndexOfOriginalUnit)) {
          _tmpOriginalUnit = null;
        } else {
          _tmpOriginalUnit = _cursor.getString(_cursorIndexOfOriginalUnit);
        }
        final String _tmpProductImageUrls;
        if (_cursor.isNull(_cursorIndexOfProductImageUrls)) {
          _tmpProductImageUrls = null;
        } else {
          _tmpProductImageUrls = _cursor.getString(_cursorIndexOfProductImageUrls);
        }
        final String _tmpOriginalCompanyAddress;
        if (_cursor.isNull(_cursorIndexOfOriginalCompanyAddress)) {
          _tmpOriginalCompanyAddress = null;
        } else {
          _tmpOriginalCompanyAddress = _cursor.getString(_cursorIndexOfOriginalCompanyAddress);
        }
        final boolean _tmpOrgAvailable;
        final int _tmp_4;
        _tmp_4 = _cursor.getInt(_cursorIndexOfOrgAvailable);
        _tmpOrgAvailable = _tmp_4 != 0;
        final long _tmpProductDetailsId;
        _tmpProductDetailsId = _cursor.getLong(_cursorIndexOfProductDetailsId);
        final long _tmpPrevOrderId;
        _tmpPrevOrderId = _cursor.getLong(_cursorIndexOfPrevOrderId);
        final long _tmpPrevOrgProductId;
        _tmpPrevOrgProductId = _cursor.getLong(_cursorIndexOfPrevOrgProductId);
        _result = new CartMedicine(_tmpId,_tmpMedicineId,_tmpMedicineName,_tmpCompanyName,_tmpDiscount,_tmpMrp,_tmpAddedQty,_tmpComposition,_tmpSubsDiscountPercentage,_tmpSubsSellingPrice,_tmpSubsFound,_tmpFromApi,_tmpSubsMedProductCode,_tmpSubsMrp,_tmpSubsMedName,_tmpSubCompanyName,_tmpColdStorage,_tmpDrugType,_tmpOriginalPackSize,_tmpSubstitutePackSize,_tmpRxRequired,_tmpMaxCapped,_tmpSubsRecommendedQty,_tmpOriginalCountryNm,_tmpSubsCountryNm,_tmpSubsUnit,_tmpOriginalUnit,_tmpProductImageUrls,_tmpOriginalCompanyAddress,_tmpOrgAvailable,_tmpProductDetailsId,_tmpPrevOrderId,_tmpPrevOrgProductId);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int isSubsAlsoAddedForOrg(final String orgProductCode, final String subsProductCode) {
    final String _sql = "SELECT 1 FROM addedMedsTable12 WHERE medicineId = ? AND EXISTS(SELECT 1 FROM addedSubsOrgInfo WHERE medicineId = ? AND subsMedProductCode = ? )";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 3);
    int _argIndex = 1;
    if (subsProductCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, subsProductCode);
    }
    _argIndex = 2;
    if (orgProductCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, orgProductCode);
    }
    _argIndex = 3;
    if (subsProductCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, subsProductCode);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if (_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public double getOriginalPackSizeFromOrgSubs(final String medicineId) {
    final String _sql = "select originalPackSize from addedSubsOrgInfo where medicineId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (medicineId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, medicineId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final double _result;
      if (_cursor.moveToFirst()) {
        _result = _cursor.getDouble(0);
      } else {
        _result = 0.0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Cursor isSubsAvailable() {
    final String _sql = "SELECT medicineId, subsMedProductCode FROM addedMedsTable12 cart WHERE (medicineId!= subsMedProductCode AND subsMedProductCode IS NOT NULL AND subsMedProductCode!='null' AND subsMedProductCode!='' ) OR EXISTS (SELECT 1 FROM addedSubsOrgInfo WHERE subsMedProductCode = cart.medicineId AND (orgAvailable='true' OR orgAvailable='1'))";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _tmpResult = __db.query(_statement);
    return _tmpResult;
  }

  @Override
  public Cursor isSubsAvailableFromAddedMedId(final String notInAddedMedicineIds) {
    final String _sql = "SELECT medicineId, subsMedProductCode FROM addedMedsTable12 cart WHERE (medicineId NOT IN (?) AND medicineId!= subsMedProductCode AND subsMedProductCode IS NOT NULL AND subsMedProductCode!='null' AND subsMedProductCode!='') OR EXISTS (SELECT 1 FROM addedSubsOrgInfo WHERE subsMedProductCode = cart.medicineId);";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (notInAddedMedicineIds == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, notInAddedMedicineIds);
    }
    final Cursor _tmpResult = __db.query(_statement);
    return _tmpResult;
  }

  @Override
  public String getSubImageUrlInReorder(final String medicineId) {
    final String _sql = "Select subImageUrl from reorder_alternate_subs where SubsMedProductCode = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (medicineId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, medicineId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final String _result;
      if (_cursor.moveToFirst()) {
        if (_cursor.isNull(0)) {
          _result = null;
        } else {
          _result = _cursor.getString(0);
        }
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public String getSubImageUrlInReorderFromMedicineId(final String medicineId) {
    final String _sql = "Select subImageUrl from reorder_alternate_subs where medicineId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (medicineId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, medicineId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final String _result;
      if (_cursor.moveToFirst()) {
        if (_cursor.isNull(0)) {
          _result = null;
        } else {
          _result = _cursor.getString(0);
        }
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public boolean getSubsPitchedInReorder(final String medicineId) {
    final String _sql = "Select subsPitched from reorder_alternate_subs where medicineId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (medicineId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, medicineId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final boolean _result;
      if (_cursor.moveToFirst()) {
        final int _tmp;
        _tmp = _cursor.getInt(0);
        _result = _tmp != 0;
      } else {
        _result = false;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int getOrgAddedQtyFromReorder(final String medicineId) {
    final String _sql = "Select orgAddedQuantity from reorder_alternate_subs where medicineId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (medicineId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, medicineId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if (_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public String getAltSubsImageUrlFromReorder(final String medicineId) {
    final String _sql = "Select altSubsImageUrl from reorder_alternate_subs where medicineId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (medicineId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, medicineId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final String _result;
      if (_cursor.moveToFirst()) {
        if (_cursor.isNull(0)) {
          _result = null;
        } else {
          _result = _cursor.getString(0);
        }
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public String getAltSubsImageUrlFromSubMed(final String medicineId) {
    final String _sql = "Select altSubsImageUrl from reorder_alternate_subs where SubsMedProductCode = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (medicineId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, medicineId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final String _result;
      if (_cursor.moveToFirst()) {
        if (_cursor.isNull(0)) {
          _result = null;
        } else {
          _result = _cursor.getString(0);
        }
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public String getAltSubsSavingPercentage(final String medicineId) {
    final String _sql = "Select altSubsSavingPercentage from reorder_alternate_subs where medicineId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (medicineId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, medicineId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final String _result;
      if (_cursor.moveToFirst()) {
        if (_cursor.isNull(0)) {
          _result = null;
        } else {
          _result = _cursor.getString(0);
        }
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public long getEmptyPrevOrgProductId() {
    final String _sql = "SELECT prevOrgProductId FROM addedMedsTable12 WHERE prevOrgProductId = 0 ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final long _result;
      if (_cursor.moveToFirst()) {
        _result = _cursor.getLong(0);
      } else {
        _result = 0L;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Cursor getOrderTicketDetails() {
    final String _sql = "select * from raise_ticket";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _tmpResult = __db.query(_statement);
    return _tmpResult;
  }

  @Override
  public Cursor getProductImages(final String productCode) {
    final String _sql = "select * from productImage where productCode = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (productCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, productCode);
    }
    final Cursor _tmpResult = __db.query(_statement);
    return _tmpResult;
  }

  @Override
  public long getCustomerCategoryId(final String category) {
    final String _sql = "select id from customer_category where categoryType = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (category == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, category);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final long _result;
      if (_cursor.moveToFirst()) {
        _result = _cursor.getLong(0);
      } else {
        _result = 0L;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public String getCustomerCategory(final String categoryType) {
    final String _sql = "select category from customer_category where categoryType = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (categoryType == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, categoryType);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final String _result;
      if (_cursor.moveToFirst()) {
        if (_cursor.isNull(0)) {
          _result = null;
        } else {
          _result = _cursor.getString(0);
        }
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<String> getAllCustomerCategory() {
    final String _sql = "select categoryType from customer_category";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final List<String> _result = new ArrayList<String>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final String _item;
        if (_cursor.isNull(0)) {
          _item = null;
        } else {
          _item = _cursor.getString(0);
        }
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int getAddedCrossSellingProductsCount() {
    final String _sql = "select count(*) from AddedCrossSelling";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if (_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<OrderFilter> getFilterOrderList() {
    final String _sql = "select * from OrderFilter";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfDisplayName = CursorUtil.getColumnIndexOrThrow(_cursor, "displayName");
      final List<OrderFilter> _result = new ArrayList<OrderFilter>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final OrderFilter _item;
        final Integer _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getInt(_cursorIndexOfId);
        }
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        final String _tmpDisplayName;
        if (_cursor.isNull(_cursorIndexOfDisplayName)) {
          _tmpDisplayName = null;
        } else {
          _tmpDisplayName = _cursor.getString(_cursorIndexOfDisplayName);
        }
        _item = new OrderFilter(_tmpId,_tmpName,_tmpDisplayName);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public CustomerDetails getCustomerDetails(final String mobileNo) {
    final String _sql = "select * from customer_details where mobileNo= ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (mobileNo == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, mobileNo);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfCustomerId = CursorUtil.getColumnIndexOrThrow(_cursor, "customerId");
      final int _cursorIndexOfMobileNo = CursorUtil.getColumnIndexOrThrow(_cursor, "mobileNo");
      final int _cursorIndexOfEmailAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "emailAddress");
      final int _cursorIndexOfProfileImageUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "profileImageUrl");
      final int _cursorIndexOfCustomerName = CursorUtil.getColumnIndexOrThrow(_cursor, "customerName");
      final int _cursorIndexOfGenderName = CursorUtil.getColumnIndexOrThrow(_cursor, "genderName");
      final int _cursorIndexOfAge = CursorUtil.getColumnIndexOrThrow(_cursor, "age");
      final int _cursorIndexOfLanguageId = CursorUtil.getColumnIndexOrThrow(_cursor, "languageId");
      final int _cursorIndexOfCustomerLastName = CursorUtil.getColumnIndexOrThrow(_cursor, "customerLastName");
      final CustomerDetails _result;
      if (_cursor.moveToFirst()) {
        final Long _tmpCustomerId;
        if (_cursor.isNull(_cursorIndexOfCustomerId)) {
          _tmpCustomerId = null;
        } else {
          _tmpCustomerId = _cursor.getLong(_cursorIndexOfCustomerId);
        }
        final String _tmpMobileNo;
        if (_cursor.isNull(_cursorIndexOfMobileNo)) {
          _tmpMobileNo = null;
        } else {
          _tmpMobileNo = _cursor.getString(_cursorIndexOfMobileNo);
        }
        final String _tmpEmailAddress;
        if (_cursor.isNull(_cursorIndexOfEmailAddress)) {
          _tmpEmailAddress = null;
        } else {
          _tmpEmailAddress = _cursor.getString(_cursorIndexOfEmailAddress);
        }
        final String _tmpProfileImageUrl;
        if (_cursor.isNull(_cursorIndexOfProfileImageUrl)) {
          _tmpProfileImageUrl = null;
        } else {
          _tmpProfileImageUrl = _cursor.getString(_cursorIndexOfProfileImageUrl);
        }
        final String _tmpCustomerName;
        if (_cursor.isNull(_cursorIndexOfCustomerName)) {
          _tmpCustomerName = null;
        } else {
          _tmpCustomerName = _cursor.getString(_cursorIndexOfCustomerName);
        }
        final String _tmpGenderName;
        if (_cursor.isNull(_cursorIndexOfGenderName)) {
          _tmpGenderName = null;
        } else {
          _tmpGenderName = _cursor.getString(_cursorIndexOfGenderName);
        }
        final String _tmpAge;
        if (_cursor.isNull(_cursorIndexOfAge)) {
          _tmpAge = null;
        } else {
          _tmpAge = _cursor.getString(_cursorIndexOfAge);
        }
        final Integer _tmpLanguageId;
        if (_cursor.isNull(_cursorIndexOfLanguageId)) {
          _tmpLanguageId = null;
        } else {
          _tmpLanguageId = _cursor.getInt(_cursorIndexOfLanguageId);
        }
        final String _tmpCustomerLastName;
        if (_cursor.isNull(_cursorIndexOfCustomerLastName)) {
          _tmpCustomerLastName = null;
        } else {
          _tmpCustomerLastName = _cursor.getString(_cursorIndexOfCustomerLastName);
        }
        _result = new CustomerDetails(_tmpCustomerId,_tmpMobileNo,_tmpEmailAddress,_tmpProfileImageUrl,_tmpCustomerName,_tmpGenderName,_tmpAge,_tmpLanguageId,_tmpCustomerLastName);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int getSubOptReasonId(final String value) {
    final String _sql = "select reasonId from sub_opt_reasons where value= ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (value == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, value);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if (_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<LocalCartDBSellingPriceCalculations> getCartTotalSellingPrice() {
    final String _sql = "SELECT sp.sellingPrice, cart.addedQty FROM addedMedsTable12 cart INNER JOIN cart_item_price sp ON cart.medicineId = sp.productCode AND orgAvailable = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfSellingPrice = 0;
      final int _cursorIndexOfAddedQty = 1;
      final List<LocalCartDBSellingPriceCalculations> _result = new ArrayList<LocalCartDBSellingPriceCalculations>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final LocalCartDBSellingPriceCalculations _item;
        final double _tmpSellingPrice;
        _tmpSellingPrice = _cursor.getDouble(_cursorIndexOfSellingPrice);
        final int _tmpAddedQty;
        _tmpAddedQty = _cursor.getInt(_cursorIndexOfAddedQty);
        _item = new LocalCartDBSellingPriceCalculations(_tmpSellingPrice,_tmpAddedQty);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<LocalCartDBMrpCalculations> getCartTotalMrpPrice() {
    final String _sql = "SELECT cart.mrp, cart.addedQty FROM addedMedsTable12 cart INNER JOIN cart_item_price sp ON cart.medicineId = sp.productCode AND orgAvailable = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfMrp = 0;
      final int _cursorIndexOfAddedQty = 1;
      final List<LocalCartDBMrpCalculations> _result = new ArrayList<LocalCartDBMrpCalculations>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final LocalCartDBMrpCalculations _item;
        final double _tmpMrp;
        _tmpMrp = _cursor.getDouble(_cursorIndexOfMrp);
        final int _tmpAddedQty;
        _tmpAddedQty = _cursor.getInt(_cursorIndexOfAddedQty);
        _item = new LocalCartDBMrpCalculations(_tmpMrp,_tmpAddedQty);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public String getDuplicateSubsFoundMedCode() {
    final String _sql = "SELECT subsMedProductCode FROM addedMedsTable12 WHERE subsMedProductCode != NULL AND subsMedProductCode!='' AND subsMedProductCode!='null' AND subsMedProductCode!='NULL' GROUP BY subsMedProductCode HAVING COUNT(subsMedProductCode) > 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final String _result;
      if (_cursor.moveToFirst()) {
        if (_cursor.isNull(0)) {
          _result = null;
        } else {
          _result = _cursor.getString(0);
        }
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int getCountOfDuplicateSubsFound(final String subsMedProductCode) {
    final String _sql = "SELECT count(*) FROM addedMedsTable12 WHERE subsMedProductCode = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (subsMedProductCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, subsMedProductCode);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if (_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<CartMedicine> getMedicineListWIthSameSubs(final String subsProductCode) {
    final String _sql = "SELECT * FROM addedMedsTable12 WHERE subsMedProductCode = ? AND medicineId != ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (subsProductCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, subsProductCode);
    }
    _argIndex = 2;
    if (subsProductCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, subsProductCode);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfMedicineId = CursorUtil.getColumnIndexOrThrow(_cursor, "medicineId");
      final int _cursorIndexOfMedicineName = CursorUtil.getColumnIndexOrThrow(_cursor, "medicineName");
      final int _cursorIndexOfCompanyName = CursorUtil.getColumnIndexOrThrow(_cursor, "companyName");
      final int _cursorIndexOfDiscount = CursorUtil.getColumnIndexOrThrow(_cursor, "discount");
      final int _cursorIndexOfMrp = CursorUtil.getColumnIndexOrThrow(_cursor, "mrp");
      final int _cursorIndexOfAddedQty = CursorUtil.getColumnIndexOrThrow(_cursor, "addedQty");
      final int _cursorIndexOfComposition = CursorUtil.getColumnIndexOrThrow(_cursor, "composition");
      final int _cursorIndexOfSubsDiscountPercentage = CursorUtil.getColumnIndexOrThrow(_cursor, "subDiscountPercentage");
      final int _cursorIndexOfSubsSellingPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "subsSellingPrice");
      final int _cursorIndexOfSubsFound = CursorUtil.getColumnIndexOrThrow(_cursor, "isSubFound");
      final int _cursorIndexOfFromApi = CursorUtil.getColumnIndexOrThrow(_cursor, "isFromApi");
      final int _cursorIndexOfSubsMedProductCode = CursorUtil.getColumnIndexOrThrow(_cursor, "subsMedProductCode");
      final int _cursorIndexOfSubsMrp = CursorUtil.getColumnIndexOrThrow(_cursor, "subsMrp");
      final int _cursorIndexOfSubsMedName = CursorUtil.getColumnIndexOrThrow(_cursor, "subsMedName");
      final int _cursorIndexOfSubCompanyName = CursorUtil.getColumnIndexOrThrow(_cursor, "subCompanyName");
      final int _cursorIndexOfColdStorage = CursorUtil.getColumnIndexOrThrow(_cursor, "isColdStorage");
      final int _cursorIndexOfDrugType = CursorUtil.getColumnIndexOrThrow(_cursor, "drugType");
      final int _cursorIndexOfOriginalPackSize = CursorUtil.getColumnIndexOrThrow(_cursor, "originalPackSize");
      final int _cursorIndexOfSubstitutePackSize = CursorUtil.getColumnIndexOrThrow(_cursor, "substitutePackSize");
      final int _cursorIndexOfRxRequired = CursorUtil.getColumnIndexOrThrow(_cursor, "prescriptionRequired");
      final int _cursorIndexOfMaxCapped = CursorUtil.getColumnIndexOrThrow(_cursor, "maxCapped");
      final int _cursorIndexOfSubsRecommendedQty = CursorUtil.getColumnIndexOrThrow(_cursor, "subsReccommendedQty");
      final int _cursorIndexOfOriginalCountryNm = CursorUtil.getColumnIndexOrThrow(_cursor, "originalCountryNm");
      final int _cursorIndexOfSubsCountryNm = CursorUtil.getColumnIndexOrThrow(_cursor, "subs_country_nm");
      final int _cursorIndexOfSubsUnit = CursorUtil.getColumnIndexOrThrow(_cursor, "subs_unit");
      final int _cursorIndexOfOriginalUnit = CursorUtil.getColumnIndexOrThrow(_cursor, "original_unit");
      final int _cursorIndexOfProductImageUrls = CursorUtil.getColumnIndexOrThrow(_cursor, "product_image_urls");
      final int _cursorIndexOfOriginalCompanyAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "original_company_addr");
      final int _cursorIndexOfOrgAvailable = CursorUtil.getColumnIndexOrThrow(_cursor, "orgAvailable");
      final int _cursorIndexOfProductDetailsId = CursorUtil.getColumnIndexOrThrow(_cursor, "productDetailsId");
      final int _cursorIndexOfPrevOrderId = CursorUtil.getColumnIndexOrThrow(_cursor, "prevOrderId");
      final int _cursorIndexOfPrevOrgProductId = CursorUtil.getColumnIndexOrThrow(_cursor, "prevOrgProductId");
      final List<CartMedicine> _result = new ArrayList<CartMedicine>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final CartMedicine _item;
        final Long _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getLong(_cursorIndexOfId);
        }
        final String _tmpMedicineId;
        if (_cursor.isNull(_cursorIndexOfMedicineId)) {
          _tmpMedicineId = null;
        } else {
          _tmpMedicineId = _cursor.getString(_cursorIndexOfMedicineId);
        }
        final String _tmpMedicineName;
        if (_cursor.isNull(_cursorIndexOfMedicineName)) {
          _tmpMedicineName = null;
        } else {
          _tmpMedicineName = _cursor.getString(_cursorIndexOfMedicineName);
        }
        final String _tmpCompanyName;
        if (_cursor.isNull(_cursorIndexOfCompanyName)) {
          _tmpCompanyName = null;
        } else {
          _tmpCompanyName = _cursor.getString(_cursorIndexOfCompanyName);
        }
        final double _tmpDiscount;
        _tmpDiscount = _cursor.getDouble(_cursorIndexOfDiscount);
        final double _tmpMrp;
        _tmpMrp = _cursor.getDouble(_cursorIndexOfMrp);
        final int _tmpAddedQty;
        _tmpAddedQty = _cursor.getInt(_cursorIndexOfAddedQty);
        final String _tmpComposition;
        if (_cursor.isNull(_cursorIndexOfComposition)) {
          _tmpComposition = null;
        } else {
          _tmpComposition = _cursor.getString(_cursorIndexOfComposition);
        }
        final String _tmpSubsDiscountPercentage;
        if (_cursor.isNull(_cursorIndexOfSubsDiscountPercentage)) {
          _tmpSubsDiscountPercentage = null;
        } else {
          _tmpSubsDiscountPercentage = _cursor.getString(_cursorIndexOfSubsDiscountPercentage);
        }
        final double _tmpSubsSellingPrice;
        _tmpSubsSellingPrice = _cursor.getDouble(_cursorIndexOfSubsSellingPrice);
        final boolean _tmpSubsFound;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfSubsFound);
        _tmpSubsFound = _tmp != 0;
        final boolean _tmpFromApi;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfFromApi);
        _tmpFromApi = _tmp_1 != 0;
        final String _tmpSubsMedProductCode;
        if (_cursor.isNull(_cursorIndexOfSubsMedProductCode)) {
          _tmpSubsMedProductCode = null;
        } else {
          _tmpSubsMedProductCode = _cursor.getString(_cursorIndexOfSubsMedProductCode);
        }
        final double _tmpSubsMrp;
        _tmpSubsMrp = _cursor.getDouble(_cursorIndexOfSubsMrp);
        final String _tmpSubsMedName;
        if (_cursor.isNull(_cursorIndexOfSubsMedName)) {
          _tmpSubsMedName = null;
        } else {
          _tmpSubsMedName = _cursor.getString(_cursorIndexOfSubsMedName);
        }
        final String _tmpSubCompanyName;
        if (_cursor.isNull(_cursorIndexOfSubCompanyName)) {
          _tmpSubCompanyName = null;
        } else {
          _tmpSubCompanyName = _cursor.getString(_cursorIndexOfSubCompanyName);
        }
        final boolean _tmpColdStorage;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfColdStorage);
        _tmpColdStorage = _tmp_2 != 0;
        final String _tmpDrugType;
        if (_cursor.isNull(_cursorIndexOfDrugType)) {
          _tmpDrugType = null;
        } else {
          _tmpDrugType = _cursor.getString(_cursorIndexOfDrugType);
        }
        final double _tmpOriginalPackSize;
        _tmpOriginalPackSize = _cursor.getDouble(_cursorIndexOfOriginalPackSize);
        final double _tmpSubstitutePackSize;
        _tmpSubstitutePackSize = _cursor.getDouble(_cursorIndexOfSubstitutePackSize);
        final boolean _tmpRxRequired;
        final int _tmp_3;
        _tmp_3 = _cursor.getInt(_cursorIndexOfRxRequired);
        _tmpRxRequired = _tmp_3 != 0;
        final int _tmpMaxCapped;
        _tmpMaxCapped = _cursor.getInt(_cursorIndexOfMaxCapped);
        final int _tmpSubsRecommendedQty;
        _tmpSubsRecommendedQty = _cursor.getInt(_cursorIndexOfSubsRecommendedQty);
        final String _tmpOriginalCountryNm;
        if (_cursor.isNull(_cursorIndexOfOriginalCountryNm)) {
          _tmpOriginalCountryNm = null;
        } else {
          _tmpOriginalCountryNm = _cursor.getString(_cursorIndexOfOriginalCountryNm);
        }
        final String _tmpSubsCountryNm;
        if (_cursor.isNull(_cursorIndexOfSubsCountryNm)) {
          _tmpSubsCountryNm = null;
        } else {
          _tmpSubsCountryNm = _cursor.getString(_cursorIndexOfSubsCountryNm);
        }
        final String _tmpSubsUnit;
        if (_cursor.isNull(_cursorIndexOfSubsUnit)) {
          _tmpSubsUnit = null;
        } else {
          _tmpSubsUnit = _cursor.getString(_cursorIndexOfSubsUnit);
        }
        final String _tmpOriginalUnit;
        if (_cursor.isNull(_cursorIndexOfOriginalUnit)) {
          _tmpOriginalUnit = null;
        } else {
          _tmpOriginalUnit = _cursor.getString(_cursorIndexOfOriginalUnit);
        }
        final String _tmpProductImageUrls;
        if (_cursor.isNull(_cursorIndexOfProductImageUrls)) {
          _tmpProductImageUrls = null;
        } else {
          _tmpProductImageUrls = _cursor.getString(_cursorIndexOfProductImageUrls);
        }
        final String _tmpOriginalCompanyAddress;
        if (_cursor.isNull(_cursorIndexOfOriginalCompanyAddress)) {
          _tmpOriginalCompanyAddress = null;
        } else {
          _tmpOriginalCompanyAddress = _cursor.getString(_cursorIndexOfOriginalCompanyAddress);
        }
        final boolean _tmpOrgAvailable;
        final int _tmp_4;
        _tmp_4 = _cursor.getInt(_cursorIndexOfOrgAvailable);
        _tmpOrgAvailable = _tmp_4 != 0;
        final long _tmpProductDetailsId;
        _tmpProductDetailsId = _cursor.getLong(_cursorIndexOfProductDetailsId);
        final long _tmpPrevOrderId;
        _tmpPrevOrderId = _cursor.getLong(_cursorIndexOfPrevOrderId);
        final long _tmpPrevOrgProductId;
        _tmpPrevOrgProductId = _cursor.getLong(_cursorIndexOfPrevOrgProductId);
        _item = new CartMedicine(_tmpId,_tmpMedicineId,_tmpMedicineName,_tmpCompanyName,_tmpDiscount,_tmpMrp,_tmpAddedQty,_tmpComposition,_tmpSubsDiscountPercentage,_tmpSubsSellingPrice,_tmpSubsFound,_tmpFromApi,_tmpSubsMedProductCode,_tmpSubsMrp,_tmpSubsMedName,_tmpSubCompanyName,_tmpColdStorage,_tmpDrugType,_tmpOriginalPackSize,_tmpSubstitutePackSize,_tmpRxRequired,_tmpMaxCapped,_tmpSubsRecommendedQty,_tmpOriginalCountryNm,_tmpSubsCountryNm,_tmpSubsUnit,_tmpOriginalUnit,_tmpProductImageUrls,_tmpOriginalCompanyAddress,_tmpOrgAvailable,_tmpProductDetailsId,_tmpPrevOrderId,_tmpPrevOrgProductId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public long getLastDateForNameValidation() {
    final String _sql = "SELECT MAX(SaveDate) FROM patientName";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final long _result;
      if (_cursor.moveToFirst()) {
        _result = _cursor.getLong(0);
      } else {
        _result = 0L;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int checkNameExist(final String inputString) {
    final String _sql = "SELECT COUNT(*) FROM patientName WHERE PatientName = ? COLLATE NOCASE";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (inputString == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, inputString);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if (_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int getSwitchBackCount(final String medicineId) {
    final String _sql = "SELECT addedQty FROM addedSubsOrgInfo WHERE medicineId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (medicineId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, medicineId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if (_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<String> getAddedMedProductCode() {
    final String _sql = "SELECT medicineId FROM addedMedsTable12";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final List<String> _result = new ArrayList<String>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final String _item;
        if (_cursor.isNull(0)) {
          _item = null;
        } else {
          _item = _cursor.getString(0);
        }
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<String> getAddedMedNames() {
    final String _sql = "SELECT DISTINCT medicineName FROM addedMedsTable12";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final List<String> _result = new ArrayList<String>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final String _item;
        if (_cursor.isNull(0)) {
          _item = null;
        } else {
          _item = _cursor.getString(0);
        }
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public OrgSubsInfo getAddedOrgInfoByOrgCode(final String orgProductCode) {
    final String _sql = "select * from addedSubsOrgInfo WHERE medicineId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (orgProductCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, orgProductCode);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfMedicineId = CursorUtil.getColumnIndexOrThrow(_cursor, "medicineId");
      final int _cursorIndexOfMedicineName = CursorUtil.getColumnIndexOrThrow(_cursor, "medicineName");
      final int _cursorIndexOfCompanyName = CursorUtil.getColumnIndexOrThrow(_cursor, "companyName");
      final int _cursorIndexOfDiscount = CursorUtil.getColumnIndexOrThrow(_cursor, "discount");
      final int _cursorIndexOfMrp = CursorUtil.getColumnIndexOrThrow(_cursor, "mrp");
      final int _cursorIndexOfAddedQty = CursorUtil.getColumnIndexOrThrow(_cursor, "addedQty");
      final int _cursorIndexOfComposition = CursorUtil.getColumnIndexOrThrow(_cursor, "composition");
      final int _cursorIndexOfSubsDiscountPercentage = CursorUtil.getColumnIndexOrThrow(_cursor, "subDiscountPercentage");
      final int _cursorIndexOfSubsSellingPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "subsSellingPrice");
      final int _cursorIndexOfSubsFound = CursorUtil.getColumnIndexOrThrow(_cursor, "isSubFound");
      final int _cursorIndexOfFromApi = CursorUtil.getColumnIndexOrThrow(_cursor, "isFromApi");
      final int _cursorIndexOfSubsMedProductCode = CursorUtil.getColumnIndexOrThrow(_cursor, "subsMedProductCode");
      final int _cursorIndexOfSubsMrp = CursorUtil.getColumnIndexOrThrow(_cursor, "subsMrp");
      final int _cursorIndexOfSubsMedName = CursorUtil.getColumnIndexOrThrow(_cursor, "subsMedName");
      final int _cursorIndexOfSubCompanyName = CursorUtil.getColumnIndexOrThrow(_cursor, "subCompanyName");
      final int _cursorIndexOfColdStorage = CursorUtil.getColumnIndexOrThrow(_cursor, "isColdStorage");
      final int _cursorIndexOfDrugType = CursorUtil.getColumnIndexOrThrow(_cursor, "drugType");
      final int _cursorIndexOfOriginalPackSize = CursorUtil.getColumnIndexOrThrow(_cursor, "originalPackSize");
      final int _cursorIndexOfSubstitutePackSize = CursorUtil.getColumnIndexOrThrow(_cursor, "substitutePackSize");
      final int _cursorIndexOfRxRequired = CursorUtil.getColumnIndexOrThrow(_cursor, "prescriptionRequired");
      final int _cursorIndexOfMaxCapped = CursorUtil.getColumnIndexOrThrow(_cursor, "maxCapped");
      final int _cursorIndexOfSubsRecommendedQty = CursorUtil.getColumnIndexOrThrow(_cursor, "subsReccommendedQty");
      final int _cursorIndexOfOriginalCountryNm = CursorUtil.getColumnIndexOrThrow(_cursor, "originalCountryNm");
      final int _cursorIndexOfSubsCountryNm = CursorUtil.getColumnIndexOrThrow(_cursor, "subs_country_nm");
      final int _cursorIndexOfSubsUnit = CursorUtil.getColumnIndexOrThrow(_cursor, "subs_unit");
      final int _cursorIndexOfOriginalUnit = CursorUtil.getColumnIndexOrThrow(_cursor, "original_unit");
      final int _cursorIndexOfProductImageUrls = CursorUtil.getColumnIndexOrThrow(_cursor, "product_image_urls");
      final int _cursorIndexOfOriginalCompanyAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "original_company_addr");
      final int _cursorIndexOfOrgAvailable = CursorUtil.getColumnIndexOrThrow(_cursor, "orgAvailable");
      final OrgSubsInfo _result;
      if (_cursor.moveToFirst()) {
        final Long _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getLong(_cursorIndexOfId);
        }
        final String _tmpMedicineId;
        if (_cursor.isNull(_cursorIndexOfMedicineId)) {
          _tmpMedicineId = null;
        } else {
          _tmpMedicineId = _cursor.getString(_cursorIndexOfMedicineId);
        }
        final String _tmpMedicineName;
        if (_cursor.isNull(_cursorIndexOfMedicineName)) {
          _tmpMedicineName = null;
        } else {
          _tmpMedicineName = _cursor.getString(_cursorIndexOfMedicineName);
        }
        final String _tmpCompanyName;
        if (_cursor.isNull(_cursorIndexOfCompanyName)) {
          _tmpCompanyName = null;
        } else {
          _tmpCompanyName = _cursor.getString(_cursorIndexOfCompanyName);
        }
        final double _tmpDiscount;
        _tmpDiscount = _cursor.getDouble(_cursorIndexOfDiscount);
        final double _tmpMrp;
        _tmpMrp = _cursor.getDouble(_cursorIndexOfMrp);
        final int _tmpAddedQty;
        _tmpAddedQty = _cursor.getInt(_cursorIndexOfAddedQty);
        final String _tmpComposition;
        if (_cursor.isNull(_cursorIndexOfComposition)) {
          _tmpComposition = null;
        } else {
          _tmpComposition = _cursor.getString(_cursorIndexOfComposition);
        }
        final String _tmpSubsDiscountPercentage;
        if (_cursor.isNull(_cursorIndexOfSubsDiscountPercentage)) {
          _tmpSubsDiscountPercentage = null;
        } else {
          _tmpSubsDiscountPercentage = _cursor.getString(_cursorIndexOfSubsDiscountPercentage);
        }
        final double _tmpSubsSellingPrice;
        _tmpSubsSellingPrice = _cursor.getDouble(_cursorIndexOfSubsSellingPrice);
        final boolean _tmpSubsFound;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfSubsFound);
        _tmpSubsFound = _tmp != 0;
        final boolean _tmpFromApi;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfFromApi);
        _tmpFromApi = _tmp_1 != 0;
        final String _tmpSubsMedProductCode;
        if (_cursor.isNull(_cursorIndexOfSubsMedProductCode)) {
          _tmpSubsMedProductCode = null;
        } else {
          _tmpSubsMedProductCode = _cursor.getString(_cursorIndexOfSubsMedProductCode);
        }
        final double _tmpSubsMrp;
        _tmpSubsMrp = _cursor.getDouble(_cursorIndexOfSubsMrp);
        final String _tmpSubsMedName;
        if (_cursor.isNull(_cursorIndexOfSubsMedName)) {
          _tmpSubsMedName = null;
        } else {
          _tmpSubsMedName = _cursor.getString(_cursorIndexOfSubsMedName);
        }
        final String _tmpSubCompanyName;
        if (_cursor.isNull(_cursorIndexOfSubCompanyName)) {
          _tmpSubCompanyName = null;
        } else {
          _tmpSubCompanyName = _cursor.getString(_cursorIndexOfSubCompanyName);
        }
        final boolean _tmpColdStorage;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfColdStorage);
        _tmpColdStorage = _tmp_2 != 0;
        final String _tmpDrugType;
        if (_cursor.isNull(_cursorIndexOfDrugType)) {
          _tmpDrugType = null;
        } else {
          _tmpDrugType = _cursor.getString(_cursorIndexOfDrugType);
        }
        final double _tmpOriginalPackSize;
        _tmpOriginalPackSize = _cursor.getDouble(_cursorIndexOfOriginalPackSize);
        final double _tmpSubstitutePackSize;
        _tmpSubstitutePackSize = _cursor.getDouble(_cursorIndexOfSubstitutePackSize);
        final boolean _tmpRxRequired;
        final int _tmp_3;
        _tmp_3 = _cursor.getInt(_cursorIndexOfRxRequired);
        _tmpRxRequired = _tmp_3 != 0;
        final int _tmpMaxCapped;
        _tmpMaxCapped = _cursor.getInt(_cursorIndexOfMaxCapped);
        final int _tmpSubsRecommendedQty;
        _tmpSubsRecommendedQty = _cursor.getInt(_cursorIndexOfSubsRecommendedQty);
        final String _tmpOriginalCountryNm;
        if (_cursor.isNull(_cursorIndexOfOriginalCountryNm)) {
          _tmpOriginalCountryNm = null;
        } else {
          _tmpOriginalCountryNm = _cursor.getString(_cursorIndexOfOriginalCountryNm);
        }
        final String _tmpSubsCountryNm;
        if (_cursor.isNull(_cursorIndexOfSubsCountryNm)) {
          _tmpSubsCountryNm = null;
        } else {
          _tmpSubsCountryNm = _cursor.getString(_cursorIndexOfSubsCountryNm);
        }
        final String _tmpSubsUnit;
        if (_cursor.isNull(_cursorIndexOfSubsUnit)) {
          _tmpSubsUnit = null;
        } else {
          _tmpSubsUnit = _cursor.getString(_cursorIndexOfSubsUnit);
        }
        final String _tmpOriginalUnit;
        if (_cursor.isNull(_cursorIndexOfOriginalUnit)) {
          _tmpOriginalUnit = null;
        } else {
          _tmpOriginalUnit = _cursor.getString(_cursorIndexOfOriginalUnit);
        }
        final String _tmpProductImageUrls;
        if (_cursor.isNull(_cursorIndexOfProductImageUrls)) {
          _tmpProductImageUrls = null;
        } else {
          _tmpProductImageUrls = _cursor.getString(_cursorIndexOfProductImageUrls);
        }
        final String _tmpOriginalCompanyAddress;
        if (_cursor.isNull(_cursorIndexOfOriginalCompanyAddress)) {
          _tmpOriginalCompanyAddress = null;
        } else {
          _tmpOriginalCompanyAddress = _cursor.getString(_cursorIndexOfOriginalCompanyAddress);
        }
        final boolean _tmpOrgAvailable;
        final int _tmp_4;
        _tmp_4 = _cursor.getInt(_cursorIndexOfOrgAvailable);
        _tmpOrgAvailable = _tmp_4 != 0;
        _result = new OrgSubsInfo(_tmpId,_tmpMedicineId,_tmpMedicineName,_tmpCompanyName,_tmpDiscount,_tmpMrp,_tmpAddedQty,_tmpComposition,_tmpSubsDiscountPercentage,_tmpSubsSellingPrice,_tmpSubsFound,_tmpFromApi,_tmpSubsMedProductCode,_tmpSubsMrp,_tmpSubsMedName,_tmpSubCompanyName,_tmpColdStorage,_tmpDrugType,_tmpOriginalPackSize,_tmpSubstitutePackSize,_tmpRxRequired,_tmpMaxCapped,_tmpSubsRecommendedQty,_tmpOriginalCountryNm,_tmpSubsCountryNm,_tmpSubsUnit,_tmpOriginalUnit,_tmpProductImageUrls,_tmpOriginalCompanyAddress,_tmpOrgAvailable);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public OrgSubsInfo getAddedOrgInfoBySubsCode(final String subsMedCode) {
    final String _sql = "select * from addedSubsOrgInfo WHERE subsMedProductCode = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (subsMedCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, subsMedCode);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfMedicineId = CursorUtil.getColumnIndexOrThrow(_cursor, "medicineId");
      final int _cursorIndexOfMedicineName = CursorUtil.getColumnIndexOrThrow(_cursor, "medicineName");
      final int _cursorIndexOfCompanyName = CursorUtil.getColumnIndexOrThrow(_cursor, "companyName");
      final int _cursorIndexOfDiscount = CursorUtil.getColumnIndexOrThrow(_cursor, "discount");
      final int _cursorIndexOfMrp = CursorUtil.getColumnIndexOrThrow(_cursor, "mrp");
      final int _cursorIndexOfAddedQty = CursorUtil.getColumnIndexOrThrow(_cursor, "addedQty");
      final int _cursorIndexOfComposition = CursorUtil.getColumnIndexOrThrow(_cursor, "composition");
      final int _cursorIndexOfSubsDiscountPercentage = CursorUtil.getColumnIndexOrThrow(_cursor, "subDiscountPercentage");
      final int _cursorIndexOfSubsSellingPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "subsSellingPrice");
      final int _cursorIndexOfSubsFound = CursorUtil.getColumnIndexOrThrow(_cursor, "isSubFound");
      final int _cursorIndexOfFromApi = CursorUtil.getColumnIndexOrThrow(_cursor, "isFromApi");
      final int _cursorIndexOfSubsMedProductCode = CursorUtil.getColumnIndexOrThrow(_cursor, "subsMedProductCode");
      final int _cursorIndexOfSubsMrp = CursorUtil.getColumnIndexOrThrow(_cursor, "subsMrp");
      final int _cursorIndexOfSubsMedName = CursorUtil.getColumnIndexOrThrow(_cursor, "subsMedName");
      final int _cursorIndexOfSubCompanyName = CursorUtil.getColumnIndexOrThrow(_cursor, "subCompanyName");
      final int _cursorIndexOfColdStorage = CursorUtil.getColumnIndexOrThrow(_cursor, "isColdStorage");
      final int _cursorIndexOfDrugType = CursorUtil.getColumnIndexOrThrow(_cursor, "drugType");
      final int _cursorIndexOfOriginalPackSize = CursorUtil.getColumnIndexOrThrow(_cursor, "originalPackSize");
      final int _cursorIndexOfSubstitutePackSize = CursorUtil.getColumnIndexOrThrow(_cursor, "substitutePackSize");
      final int _cursorIndexOfRxRequired = CursorUtil.getColumnIndexOrThrow(_cursor, "prescriptionRequired");
      final int _cursorIndexOfMaxCapped = CursorUtil.getColumnIndexOrThrow(_cursor, "maxCapped");
      final int _cursorIndexOfSubsRecommendedQty = CursorUtil.getColumnIndexOrThrow(_cursor, "subsReccommendedQty");
      final int _cursorIndexOfOriginalCountryNm = CursorUtil.getColumnIndexOrThrow(_cursor, "originalCountryNm");
      final int _cursorIndexOfSubsCountryNm = CursorUtil.getColumnIndexOrThrow(_cursor, "subs_country_nm");
      final int _cursorIndexOfSubsUnit = CursorUtil.getColumnIndexOrThrow(_cursor, "subs_unit");
      final int _cursorIndexOfOriginalUnit = CursorUtil.getColumnIndexOrThrow(_cursor, "original_unit");
      final int _cursorIndexOfProductImageUrls = CursorUtil.getColumnIndexOrThrow(_cursor, "product_image_urls");
      final int _cursorIndexOfOriginalCompanyAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "original_company_addr");
      final int _cursorIndexOfOrgAvailable = CursorUtil.getColumnIndexOrThrow(_cursor, "orgAvailable");
      final OrgSubsInfo _result;
      if (_cursor.moveToFirst()) {
        final Long _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getLong(_cursorIndexOfId);
        }
        final String _tmpMedicineId;
        if (_cursor.isNull(_cursorIndexOfMedicineId)) {
          _tmpMedicineId = null;
        } else {
          _tmpMedicineId = _cursor.getString(_cursorIndexOfMedicineId);
        }
        final String _tmpMedicineName;
        if (_cursor.isNull(_cursorIndexOfMedicineName)) {
          _tmpMedicineName = null;
        } else {
          _tmpMedicineName = _cursor.getString(_cursorIndexOfMedicineName);
        }
        final String _tmpCompanyName;
        if (_cursor.isNull(_cursorIndexOfCompanyName)) {
          _tmpCompanyName = null;
        } else {
          _tmpCompanyName = _cursor.getString(_cursorIndexOfCompanyName);
        }
        final double _tmpDiscount;
        _tmpDiscount = _cursor.getDouble(_cursorIndexOfDiscount);
        final double _tmpMrp;
        _tmpMrp = _cursor.getDouble(_cursorIndexOfMrp);
        final int _tmpAddedQty;
        _tmpAddedQty = _cursor.getInt(_cursorIndexOfAddedQty);
        final String _tmpComposition;
        if (_cursor.isNull(_cursorIndexOfComposition)) {
          _tmpComposition = null;
        } else {
          _tmpComposition = _cursor.getString(_cursorIndexOfComposition);
        }
        final String _tmpSubsDiscountPercentage;
        if (_cursor.isNull(_cursorIndexOfSubsDiscountPercentage)) {
          _tmpSubsDiscountPercentage = null;
        } else {
          _tmpSubsDiscountPercentage = _cursor.getString(_cursorIndexOfSubsDiscountPercentage);
        }
        final double _tmpSubsSellingPrice;
        _tmpSubsSellingPrice = _cursor.getDouble(_cursorIndexOfSubsSellingPrice);
        final boolean _tmpSubsFound;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfSubsFound);
        _tmpSubsFound = _tmp != 0;
        final boolean _tmpFromApi;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfFromApi);
        _tmpFromApi = _tmp_1 != 0;
        final String _tmpSubsMedProductCode;
        if (_cursor.isNull(_cursorIndexOfSubsMedProductCode)) {
          _tmpSubsMedProductCode = null;
        } else {
          _tmpSubsMedProductCode = _cursor.getString(_cursorIndexOfSubsMedProductCode);
        }
        final double _tmpSubsMrp;
        _tmpSubsMrp = _cursor.getDouble(_cursorIndexOfSubsMrp);
        final String _tmpSubsMedName;
        if (_cursor.isNull(_cursorIndexOfSubsMedName)) {
          _tmpSubsMedName = null;
        } else {
          _tmpSubsMedName = _cursor.getString(_cursorIndexOfSubsMedName);
        }
        final String _tmpSubCompanyName;
        if (_cursor.isNull(_cursorIndexOfSubCompanyName)) {
          _tmpSubCompanyName = null;
        } else {
          _tmpSubCompanyName = _cursor.getString(_cursorIndexOfSubCompanyName);
        }
        final boolean _tmpColdStorage;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfColdStorage);
        _tmpColdStorage = _tmp_2 != 0;
        final String _tmpDrugType;
        if (_cursor.isNull(_cursorIndexOfDrugType)) {
          _tmpDrugType = null;
        } else {
          _tmpDrugType = _cursor.getString(_cursorIndexOfDrugType);
        }
        final double _tmpOriginalPackSize;
        _tmpOriginalPackSize = _cursor.getDouble(_cursorIndexOfOriginalPackSize);
        final double _tmpSubstitutePackSize;
        _tmpSubstitutePackSize = _cursor.getDouble(_cursorIndexOfSubstitutePackSize);
        final boolean _tmpRxRequired;
        final int _tmp_3;
        _tmp_3 = _cursor.getInt(_cursorIndexOfRxRequired);
        _tmpRxRequired = _tmp_3 != 0;
        final int _tmpMaxCapped;
        _tmpMaxCapped = _cursor.getInt(_cursorIndexOfMaxCapped);
        final int _tmpSubsRecommendedQty;
        _tmpSubsRecommendedQty = _cursor.getInt(_cursorIndexOfSubsRecommendedQty);
        final String _tmpOriginalCountryNm;
        if (_cursor.isNull(_cursorIndexOfOriginalCountryNm)) {
          _tmpOriginalCountryNm = null;
        } else {
          _tmpOriginalCountryNm = _cursor.getString(_cursorIndexOfOriginalCountryNm);
        }
        final String _tmpSubsCountryNm;
        if (_cursor.isNull(_cursorIndexOfSubsCountryNm)) {
          _tmpSubsCountryNm = null;
        } else {
          _tmpSubsCountryNm = _cursor.getString(_cursorIndexOfSubsCountryNm);
        }
        final String _tmpSubsUnit;
        if (_cursor.isNull(_cursorIndexOfSubsUnit)) {
          _tmpSubsUnit = null;
        } else {
          _tmpSubsUnit = _cursor.getString(_cursorIndexOfSubsUnit);
        }
        final String _tmpOriginalUnit;
        if (_cursor.isNull(_cursorIndexOfOriginalUnit)) {
          _tmpOriginalUnit = null;
        } else {
          _tmpOriginalUnit = _cursor.getString(_cursorIndexOfOriginalUnit);
        }
        final String _tmpProductImageUrls;
        if (_cursor.isNull(_cursorIndexOfProductImageUrls)) {
          _tmpProductImageUrls = null;
        } else {
          _tmpProductImageUrls = _cursor.getString(_cursorIndexOfProductImageUrls);
        }
        final String _tmpOriginalCompanyAddress;
        if (_cursor.isNull(_cursorIndexOfOriginalCompanyAddress)) {
          _tmpOriginalCompanyAddress = null;
        } else {
          _tmpOriginalCompanyAddress = _cursor.getString(_cursorIndexOfOriginalCompanyAddress);
        }
        final boolean _tmpOrgAvailable;
        final int _tmp_4;
        _tmp_4 = _cursor.getInt(_cursorIndexOfOrgAvailable);
        _tmpOrgAvailable = _tmp_4 != 0;
        _result = new OrgSubsInfo(_tmpId,_tmpMedicineId,_tmpMedicineName,_tmpCompanyName,_tmpDiscount,_tmpMrp,_tmpAddedQty,_tmpComposition,_tmpSubsDiscountPercentage,_tmpSubsSellingPrice,_tmpSubsFound,_tmpFromApi,_tmpSubsMedProductCode,_tmpSubsMrp,_tmpSubsMedName,_tmpSubCompanyName,_tmpColdStorage,_tmpDrugType,_tmpOriginalPackSize,_tmpSubstitutePackSize,_tmpRxRequired,_tmpMaxCapped,_tmpSubsRecommendedQty,_tmpOriginalCountryNm,_tmpSubsCountryNm,_tmpSubsUnit,_tmpOriginalUnit,_tmpProductImageUrls,_tmpOriginalCompanyAddress,_tmpOrgAvailable);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<OrgSubsInfo> getAddedOrgInfoByList() {
    final String _sql = "select * from addedSubsOrgInfo";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfMedicineId = CursorUtil.getColumnIndexOrThrow(_cursor, "medicineId");
      final int _cursorIndexOfMedicineName = CursorUtil.getColumnIndexOrThrow(_cursor, "medicineName");
      final int _cursorIndexOfCompanyName = CursorUtil.getColumnIndexOrThrow(_cursor, "companyName");
      final int _cursorIndexOfDiscount = CursorUtil.getColumnIndexOrThrow(_cursor, "discount");
      final int _cursorIndexOfMrp = CursorUtil.getColumnIndexOrThrow(_cursor, "mrp");
      final int _cursorIndexOfAddedQty = CursorUtil.getColumnIndexOrThrow(_cursor, "addedQty");
      final int _cursorIndexOfComposition = CursorUtil.getColumnIndexOrThrow(_cursor, "composition");
      final int _cursorIndexOfSubsDiscountPercentage = CursorUtil.getColumnIndexOrThrow(_cursor, "subDiscountPercentage");
      final int _cursorIndexOfSubsSellingPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "subsSellingPrice");
      final int _cursorIndexOfSubsFound = CursorUtil.getColumnIndexOrThrow(_cursor, "isSubFound");
      final int _cursorIndexOfFromApi = CursorUtil.getColumnIndexOrThrow(_cursor, "isFromApi");
      final int _cursorIndexOfSubsMedProductCode = CursorUtil.getColumnIndexOrThrow(_cursor, "subsMedProductCode");
      final int _cursorIndexOfSubsMrp = CursorUtil.getColumnIndexOrThrow(_cursor, "subsMrp");
      final int _cursorIndexOfSubsMedName = CursorUtil.getColumnIndexOrThrow(_cursor, "subsMedName");
      final int _cursorIndexOfSubCompanyName = CursorUtil.getColumnIndexOrThrow(_cursor, "subCompanyName");
      final int _cursorIndexOfColdStorage = CursorUtil.getColumnIndexOrThrow(_cursor, "isColdStorage");
      final int _cursorIndexOfDrugType = CursorUtil.getColumnIndexOrThrow(_cursor, "drugType");
      final int _cursorIndexOfOriginalPackSize = CursorUtil.getColumnIndexOrThrow(_cursor, "originalPackSize");
      final int _cursorIndexOfSubstitutePackSize = CursorUtil.getColumnIndexOrThrow(_cursor, "substitutePackSize");
      final int _cursorIndexOfRxRequired = CursorUtil.getColumnIndexOrThrow(_cursor, "prescriptionRequired");
      final int _cursorIndexOfMaxCapped = CursorUtil.getColumnIndexOrThrow(_cursor, "maxCapped");
      final int _cursorIndexOfSubsRecommendedQty = CursorUtil.getColumnIndexOrThrow(_cursor, "subsReccommendedQty");
      final int _cursorIndexOfOriginalCountryNm = CursorUtil.getColumnIndexOrThrow(_cursor, "originalCountryNm");
      final int _cursorIndexOfSubsCountryNm = CursorUtil.getColumnIndexOrThrow(_cursor, "subs_country_nm");
      final int _cursorIndexOfSubsUnit = CursorUtil.getColumnIndexOrThrow(_cursor, "subs_unit");
      final int _cursorIndexOfOriginalUnit = CursorUtil.getColumnIndexOrThrow(_cursor, "original_unit");
      final int _cursorIndexOfProductImageUrls = CursorUtil.getColumnIndexOrThrow(_cursor, "product_image_urls");
      final int _cursorIndexOfOriginalCompanyAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "original_company_addr");
      final int _cursorIndexOfOrgAvailable = CursorUtil.getColumnIndexOrThrow(_cursor, "orgAvailable");
      final List<OrgSubsInfo> _result = new ArrayList<OrgSubsInfo>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final OrgSubsInfo _item;
        final Long _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getLong(_cursorIndexOfId);
        }
        final String _tmpMedicineId;
        if (_cursor.isNull(_cursorIndexOfMedicineId)) {
          _tmpMedicineId = null;
        } else {
          _tmpMedicineId = _cursor.getString(_cursorIndexOfMedicineId);
        }
        final String _tmpMedicineName;
        if (_cursor.isNull(_cursorIndexOfMedicineName)) {
          _tmpMedicineName = null;
        } else {
          _tmpMedicineName = _cursor.getString(_cursorIndexOfMedicineName);
        }
        final String _tmpCompanyName;
        if (_cursor.isNull(_cursorIndexOfCompanyName)) {
          _tmpCompanyName = null;
        } else {
          _tmpCompanyName = _cursor.getString(_cursorIndexOfCompanyName);
        }
        final double _tmpDiscount;
        _tmpDiscount = _cursor.getDouble(_cursorIndexOfDiscount);
        final double _tmpMrp;
        _tmpMrp = _cursor.getDouble(_cursorIndexOfMrp);
        final int _tmpAddedQty;
        _tmpAddedQty = _cursor.getInt(_cursorIndexOfAddedQty);
        final String _tmpComposition;
        if (_cursor.isNull(_cursorIndexOfComposition)) {
          _tmpComposition = null;
        } else {
          _tmpComposition = _cursor.getString(_cursorIndexOfComposition);
        }
        final String _tmpSubsDiscountPercentage;
        if (_cursor.isNull(_cursorIndexOfSubsDiscountPercentage)) {
          _tmpSubsDiscountPercentage = null;
        } else {
          _tmpSubsDiscountPercentage = _cursor.getString(_cursorIndexOfSubsDiscountPercentage);
        }
        final double _tmpSubsSellingPrice;
        _tmpSubsSellingPrice = _cursor.getDouble(_cursorIndexOfSubsSellingPrice);
        final boolean _tmpSubsFound;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfSubsFound);
        _tmpSubsFound = _tmp != 0;
        final boolean _tmpFromApi;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfFromApi);
        _tmpFromApi = _tmp_1 != 0;
        final String _tmpSubsMedProductCode;
        if (_cursor.isNull(_cursorIndexOfSubsMedProductCode)) {
          _tmpSubsMedProductCode = null;
        } else {
          _tmpSubsMedProductCode = _cursor.getString(_cursorIndexOfSubsMedProductCode);
        }
        final double _tmpSubsMrp;
        _tmpSubsMrp = _cursor.getDouble(_cursorIndexOfSubsMrp);
        final String _tmpSubsMedName;
        if (_cursor.isNull(_cursorIndexOfSubsMedName)) {
          _tmpSubsMedName = null;
        } else {
          _tmpSubsMedName = _cursor.getString(_cursorIndexOfSubsMedName);
        }
        final String _tmpSubCompanyName;
        if (_cursor.isNull(_cursorIndexOfSubCompanyName)) {
          _tmpSubCompanyName = null;
        } else {
          _tmpSubCompanyName = _cursor.getString(_cursorIndexOfSubCompanyName);
        }
        final boolean _tmpColdStorage;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfColdStorage);
        _tmpColdStorage = _tmp_2 != 0;
        final String _tmpDrugType;
        if (_cursor.isNull(_cursorIndexOfDrugType)) {
          _tmpDrugType = null;
        } else {
          _tmpDrugType = _cursor.getString(_cursorIndexOfDrugType);
        }
        final double _tmpOriginalPackSize;
        _tmpOriginalPackSize = _cursor.getDouble(_cursorIndexOfOriginalPackSize);
        final double _tmpSubstitutePackSize;
        _tmpSubstitutePackSize = _cursor.getDouble(_cursorIndexOfSubstitutePackSize);
        final boolean _tmpRxRequired;
        final int _tmp_3;
        _tmp_3 = _cursor.getInt(_cursorIndexOfRxRequired);
        _tmpRxRequired = _tmp_3 != 0;
        final int _tmpMaxCapped;
        _tmpMaxCapped = _cursor.getInt(_cursorIndexOfMaxCapped);
        final int _tmpSubsRecommendedQty;
        _tmpSubsRecommendedQty = _cursor.getInt(_cursorIndexOfSubsRecommendedQty);
        final String _tmpOriginalCountryNm;
        if (_cursor.isNull(_cursorIndexOfOriginalCountryNm)) {
          _tmpOriginalCountryNm = null;
        } else {
          _tmpOriginalCountryNm = _cursor.getString(_cursorIndexOfOriginalCountryNm);
        }
        final String _tmpSubsCountryNm;
        if (_cursor.isNull(_cursorIndexOfSubsCountryNm)) {
          _tmpSubsCountryNm = null;
        } else {
          _tmpSubsCountryNm = _cursor.getString(_cursorIndexOfSubsCountryNm);
        }
        final String _tmpSubsUnit;
        if (_cursor.isNull(_cursorIndexOfSubsUnit)) {
          _tmpSubsUnit = null;
        } else {
          _tmpSubsUnit = _cursor.getString(_cursorIndexOfSubsUnit);
        }
        final String _tmpOriginalUnit;
        if (_cursor.isNull(_cursorIndexOfOriginalUnit)) {
          _tmpOriginalUnit = null;
        } else {
          _tmpOriginalUnit = _cursor.getString(_cursorIndexOfOriginalUnit);
        }
        final String _tmpProductImageUrls;
        if (_cursor.isNull(_cursorIndexOfProductImageUrls)) {
          _tmpProductImageUrls = null;
        } else {
          _tmpProductImageUrls = _cursor.getString(_cursorIndexOfProductImageUrls);
        }
        final String _tmpOriginalCompanyAddress;
        if (_cursor.isNull(_cursorIndexOfOriginalCompanyAddress)) {
          _tmpOriginalCompanyAddress = null;
        } else {
          _tmpOriginalCompanyAddress = _cursor.getString(_cursorIndexOfOriginalCompanyAddress);
        }
        final boolean _tmpOrgAvailable;
        final int _tmp_4;
        _tmp_4 = _cursor.getInt(_cursorIndexOfOrgAvailable);
        _tmpOrgAvailable = _tmp_4 != 0;
        _item = new OrgSubsInfo(_tmpId,_tmpMedicineId,_tmpMedicineName,_tmpCompanyName,_tmpDiscount,_tmpMrp,_tmpAddedQty,_tmpComposition,_tmpSubsDiscountPercentage,_tmpSubsSellingPrice,_tmpSubsFound,_tmpFromApi,_tmpSubsMedProductCode,_tmpSubsMrp,_tmpSubsMedName,_tmpSubCompanyName,_tmpColdStorage,_tmpDrugType,_tmpOriginalPackSize,_tmpSubstitutePackSize,_tmpRxRequired,_tmpMaxCapped,_tmpSubsRecommendedQty,_tmpOriginalCountryNm,_tmpSubsCountryNm,_tmpSubsUnit,_tmpOriginalUnit,_tmpProductImageUrls,_tmpOriginalCompanyAddress,_tmpOrgAvailable);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int getSavedContactsCount() {
    final String _sql = "SELECT Count(*) FROM TmContactVersion";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if (_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public ItemAddedEventAttributes getItemAddedAttributes(final String medicineId) {
    final String _sql = "select * from item_added_attributes where productCode = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (medicineId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, medicineId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfProductCode = CursorUtil.getColumnIndexOrThrow(_cursor, "productCode");
      final int _cursorIndexOfClickedPage = CursorUtil.getColumnIndexOrThrow(_cursor, "clicked_on_page");
      final int _cursorIndexOfPageSection = CursorUtil.getColumnIndexOrThrow(_cursor, "page_section");
      final int _cursorIndexOfSectionHeading = CursorUtil.getColumnIndexOrThrow(_cursor, "section_heading");
      final int _cursorIndexOfSectionIndex = CursorUtil.getColumnIndexOrThrow(_cursor, "section_index");
      final ItemAddedEventAttributes _result;
      if (_cursor.moveToFirst()) {
        final Integer _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getInt(_cursorIndexOfId);
        }
        final String _tmpProductCode;
        if (_cursor.isNull(_cursorIndexOfProductCode)) {
          _tmpProductCode = null;
        } else {
          _tmpProductCode = _cursor.getString(_cursorIndexOfProductCode);
        }
        final String _tmpClickedPage;
        if (_cursor.isNull(_cursorIndexOfClickedPage)) {
          _tmpClickedPage = null;
        } else {
          _tmpClickedPage = _cursor.getString(_cursorIndexOfClickedPage);
        }
        final String _tmpPageSection;
        if (_cursor.isNull(_cursorIndexOfPageSection)) {
          _tmpPageSection = null;
        } else {
          _tmpPageSection = _cursor.getString(_cursorIndexOfPageSection);
        }
        final String _tmpSectionHeading;
        if (_cursor.isNull(_cursorIndexOfSectionHeading)) {
          _tmpSectionHeading = null;
        } else {
          _tmpSectionHeading = _cursor.getString(_cursorIndexOfSectionHeading);
        }
        final int _tmpSectionIndex;
        _tmpSectionIndex = _cursor.getInt(_cursorIndexOfSectionIndex);
        _result = new ItemAddedEventAttributes(_tmpId,_tmpProductCode,_tmpClickedPage,_tmpPageSection,_tmpSectionHeading,_tmpSectionIndex);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<String> getTrayDetailsOfItemAddedAttributes() {
    final String _sql = "select section_heading from item_added_attributes";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final List<String> _result = new ArrayList<String>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final String _item;
        if (_cursor.isNull(0)) {
          _item = null;
        } else {
          _item = _cursor.getString(0);
        }
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<OrgSubsInfo> fetchOrgMedsFromDBWhooseSubsWereSame(final String subsProductCode) {
    final String _sql = "select * from addedSubsOrgInfo where subsMedProductCode = ? AND addedQty != 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (subsProductCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, subsProductCode);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfMedicineId = CursorUtil.getColumnIndexOrThrow(_cursor, "medicineId");
      final int _cursorIndexOfMedicineName = CursorUtil.getColumnIndexOrThrow(_cursor, "medicineName");
      final int _cursorIndexOfCompanyName = CursorUtil.getColumnIndexOrThrow(_cursor, "companyName");
      final int _cursorIndexOfDiscount = CursorUtil.getColumnIndexOrThrow(_cursor, "discount");
      final int _cursorIndexOfMrp = CursorUtil.getColumnIndexOrThrow(_cursor, "mrp");
      final int _cursorIndexOfAddedQty = CursorUtil.getColumnIndexOrThrow(_cursor, "addedQty");
      final int _cursorIndexOfComposition = CursorUtil.getColumnIndexOrThrow(_cursor, "composition");
      final int _cursorIndexOfSubsDiscountPercentage = CursorUtil.getColumnIndexOrThrow(_cursor, "subDiscountPercentage");
      final int _cursorIndexOfSubsSellingPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "subsSellingPrice");
      final int _cursorIndexOfSubsFound = CursorUtil.getColumnIndexOrThrow(_cursor, "isSubFound");
      final int _cursorIndexOfFromApi = CursorUtil.getColumnIndexOrThrow(_cursor, "isFromApi");
      final int _cursorIndexOfSubsMedProductCode = CursorUtil.getColumnIndexOrThrow(_cursor, "subsMedProductCode");
      final int _cursorIndexOfSubsMrp = CursorUtil.getColumnIndexOrThrow(_cursor, "subsMrp");
      final int _cursorIndexOfSubsMedName = CursorUtil.getColumnIndexOrThrow(_cursor, "subsMedName");
      final int _cursorIndexOfSubCompanyName = CursorUtil.getColumnIndexOrThrow(_cursor, "subCompanyName");
      final int _cursorIndexOfColdStorage = CursorUtil.getColumnIndexOrThrow(_cursor, "isColdStorage");
      final int _cursorIndexOfDrugType = CursorUtil.getColumnIndexOrThrow(_cursor, "drugType");
      final int _cursorIndexOfOriginalPackSize = CursorUtil.getColumnIndexOrThrow(_cursor, "originalPackSize");
      final int _cursorIndexOfSubstitutePackSize = CursorUtil.getColumnIndexOrThrow(_cursor, "substitutePackSize");
      final int _cursorIndexOfRxRequired = CursorUtil.getColumnIndexOrThrow(_cursor, "prescriptionRequired");
      final int _cursorIndexOfMaxCapped = CursorUtil.getColumnIndexOrThrow(_cursor, "maxCapped");
      final int _cursorIndexOfSubsRecommendedQty = CursorUtil.getColumnIndexOrThrow(_cursor, "subsReccommendedQty");
      final int _cursorIndexOfOriginalCountryNm = CursorUtil.getColumnIndexOrThrow(_cursor, "originalCountryNm");
      final int _cursorIndexOfSubsCountryNm = CursorUtil.getColumnIndexOrThrow(_cursor, "subs_country_nm");
      final int _cursorIndexOfSubsUnit = CursorUtil.getColumnIndexOrThrow(_cursor, "subs_unit");
      final int _cursorIndexOfOriginalUnit = CursorUtil.getColumnIndexOrThrow(_cursor, "original_unit");
      final int _cursorIndexOfProductImageUrls = CursorUtil.getColumnIndexOrThrow(_cursor, "product_image_urls");
      final int _cursorIndexOfOriginalCompanyAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "original_company_addr");
      final int _cursorIndexOfOrgAvailable = CursorUtil.getColumnIndexOrThrow(_cursor, "orgAvailable");
      final List<OrgSubsInfo> _result = new ArrayList<OrgSubsInfo>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final OrgSubsInfo _item;
        final Long _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getLong(_cursorIndexOfId);
        }
        final String _tmpMedicineId;
        if (_cursor.isNull(_cursorIndexOfMedicineId)) {
          _tmpMedicineId = null;
        } else {
          _tmpMedicineId = _cursor.getString(_cursorIndexOfMedicineId);
        }
        final String _tmpMedicineName;
        if (_cursor.isNull(_cursorIndexOfMedicineName)) {
          _tmpMedicineName = null;
        } else {
          _tmpMedicineName = _cursor.getString(_cursorIndexOfMedicineName);
        }
        final String _tmpCompanyName;
        if (_cursor.isNull(_cursorIndexOfCompanyName)) {
          _tmpCompanyName = null;
        } else {
          _tmpCompanyName = _cursor.getString(_cursorIndexOfCompanyName);
        }
        final double _tmpDiscount;
        _tmpDiscount = _cursor.getDouble(_cursorIndexOfDiscount);
        final double _tmpMrp;
        _tmpMrp = _cursor.getDouble(_cursorIndexOfMrp);
        final int _tmpAddedQty;
        _tmpAddedQty = _cursor.getInt(_cursorIndexOfAddedQty);
        final String _tmpComposition;
        if (_cursor.isNull(_cursorIndexOfComposition)) {
          _tmpComposition = null;
        } else {
          _tmpComposition = _cursor.getString(_cursorIndexOfComposition);
        }
        final String _tmpSubsDiscountPercentage;
        if (_cursor.isNull(_cursorIndexOfSubsDiscountPercentage)) {
          _tmpSubsDiscountPercentage = null;
        } else {
          _tmpSubsDiscountPercentage = _cursor.getString(_cursorIndexOfSubsDiscountPercentage);
        }
        final double _tmpSubsSellingPrice;
        _tmpSubsSellingPrice = _cursor.getDouble(_cursorIndexOfSubsSellingPrice);
        final boolean _tmpSubsFound;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfSubsFound);
        _tmpSubsFound = _tmp != 0;
        final boolean _tmpFromApi;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfFromApi);
        _tmpFromApi = _tmp_1 != 0;
        final String _tmpSubsMedProductCode;
        if (_cursor.isNull(_cursorIndexOfSubsMedProductCode)) {
          _tmpSubsMedProductCode = null;
        } else {
          _tmpSubsMedProductCode = _cursor.getString(_cursorIndexOfSubsMedProductCode);
        }
        final double _tmpSubsMrp;
        _tmpSubsMrp = _cursor.getDouble(_cursorIndexOfSubsMrp);
        final String _tmpSubsMedName;
        if (_cursor.isNull(_cursorIndexOfSubsMedName)) {
          _tmpSubsMedName = null;
        } else {
          _tmpSubsMedName = _cursor.getString(_cursorIndexOfSubsMedName);
        }
        final String _tmpSubCompanyName;
        if (_cursor.isNull(_cursorIndexOfSubCompanyName)) {
          _tmpSubCompanyName = null;
        } else {
          _tmpSubCompanyName = _cursor.getString(_cursorIndexOfSubCompanyName);
        }
        final boolean _tmpColdStorage;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfColdStorage);
        _tmpColdStorage = _tmp_2 != 0;
        final String _tmpDrugType;
        if (_cursor.isNull(_cursorIndexOfDrugType)) {
          _tmpDrugType = null;
        } else {
          _tmpDrugType = _cursor.getString(_cursorIndexOfDrugType);
        }
        final double _tmpOriginalPackSize;
        _tmpOriginalPackSize = _cursor.getDouble(_cursorIndexOfOriginalPackSize);
        final double _tmpSubstitutePackSize;
        _tmpSubstitutePackSize = _cursor.getDouble(_cursorIndexOfSubstitutePackSize);
        final boolean _tmpRxRequired;
        final int _tmp_3;
        _tmp_3 = _cursor.getInt(_cursorIndexOfRxRequired);
        _tmpRxRequired = _tmp_3 != 0;
        final int _tmpMaxCapped;
        _tmpMaxCapped = _cursor.getInt(_cursorIndexOfMaxCapped);
        final int _tmpSubsRecommendedQty;
        _tmpSubsRecommendedQty = _cursor.getInt(_cursorIndexOfSubsRecommendedQty);
        final String _tmpOriginalCountryNm;
        if (_cursor.isNull(_cursorIndexOfOriginalCountryNm)) {
          _tmpOriginalCountryNm = null;
        } else {
          _tmpOriginalCountryNm = _cursor.getString(_cursorIndexOfOriginalCountryNm);
        }
        final String _tmpSubsCountryNm;
        if (_cursor.isNull(_cursorIndexOfSubsCountryNm)) {
          _tmpSubsCountryNm = null;
        } else {
          _tmpSubsCountryNm = _cursor.getString(_cursorIndexOfSubsCountryNm);
        }
        final String _tmpSubsUnit;
        if (_cursor.isNull(_cursorIndexOfSubsUnit)) {
          _tmpSubsUnit = null;
        } else {
          _tmpSubsUnit = _cursor.getString(_cursorIndexOfSubsUnit);
        }
        final String _tmpOriginalUnit;
        if (_cursor.isNull(_cursorIndexOfOriginalUnit)) {
          _tmpOriginalUnit = null;
        } else {
          _tmpOriginalUnit = _cursor.getString(_cursorIndexOfOriginalUnit);
        }
        final String _tmpProductImageUrls;
        if (_cursor.isNull(_cursorIndexOfProductImageUrls)) {
          _tmpProductImageUrls = null;
        } else {
          _tmpProductImageUrls = _cursor.getString(_cursorIndexOfProductImageUrls);
        }
        final String _tmpOriginalCompanyAddress;
        if (_cursor.isNull(_cursorIndexOfOriginalCompanyAddress)) {
          _tmpOriginalCompanyAddress = null;
        } else {
          _tmpOriginalCompanyAddress = _cursor.getString(_cursorIndexOfOriginalCompanyAddress);
        }
        final boolean _tmpOrgAvailable;
        final int _tmp_4;
        _tmp_4 = _cursor.getInt(_cursorIndexOfOrgAvailable);
        _tmpOrgAvailable = _tmp_4 != 0;
        _item = new OrgSubsInfo(_tmpId,_tmpMedicineId,_tmpMedicineName,_tmpCompanyName,_tmpDiscount,_tmpMrp,_tmpAddedQty,_tmpComposition,_tmpSubsDiscountPercentage,_tmpSubsSellingPrice,_tmpSubsFound,_tmpFromApi,_tmpSubsMedProductCode,_tmpSubsMrp,_tmpSubsMedName,_tmpSubCompanyName,_tmpColdStorage,_tmpDrugType,_tmpOriginalPackSize,_tmpSubstitutePackSize,_tmpRxRequired,_tmpMaxCapped,_tmpSubsRecommendedQty,_tmpOriginalCountryNm,_tmpSubsCountryNm,_tmpSubsUnit,_tmpOriginalUnit,_tmpProductImageUrls,_tmpOriginalCompanyAddress,_tmpOrgAvailable);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public long getLastCustomerCategoryId() {
    final String _sql = "SELECT MAX(id) FROM customer_category";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final long _result;
      if (_cursor.moveToFirst()) {
        _result = _cursor.getLong(0);
      } else {
        _result = 0L;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
