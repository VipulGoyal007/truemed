package com.intellihealth.truemeds.data.model.home

import com.intellihealth.truemeds.presentation.utils.HomeSectionConstants

data class PatientAndMedicineListModel(
    var id:Int=11,
    var type :String= HomeSectionConstants.PATIENTANDMEDICINELIST,
  //  var productCardModel: ProductCardSectionModel?=null,
    var patientMedicinesListModel: CustomerMedicinesResponseModel?=null
)
