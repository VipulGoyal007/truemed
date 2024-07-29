package com.intellihealth.truemeds.data.model.user

import com.intellihealth.salt.constants.AddressPatientDetailsConstants
import com.intellihealth.salt.models.AddressPatientDetailsCardModel
import com.intellihealth.salt.models.DropDownDefaultModel
import com.intellihealth.truemeds.presentation.viewmodel.DeliveryDetailsViewModel
import com.intellihealth.truemeds.presentation.viewmodel.ManagePatientViewModel

data class GetAllPatientResponse(
    val PatientList: List<Patient>?
) {
    data class Patient(
        var patientId: Long = 0,
        var patientName: String = "",
        var patientRelation: String = "",
        var age: String="",
        var type: String = "",
        var gender: Int = 0,
        var genderName: String?,
        var relationId: Int = 0,
        var relationName: String?,
        var selected: Boolean = false,
        var firstName: String?="",
        var lastName: String?="",
        var emailId: String?="",
        var isSelected: Int = 2,

        ) {
        fun toAddressPatientDetailsCardModel(viewModel: ManagePatientViewModel?): AddressPatientDetailsCardModel {
            val genderNameStr =
                genderName?.substring(0, 1)?.toUpperCase() + genderName?.substring(1)?.toLowerCase()
            var patientNameStr = ""
            if (viewModel?.patientExperiment?.value.equals("A")) {
                patientNameStr = patientName
            } else {
                if (lastName.isNullOrBlank()){
                    lastName = ""
                }
                patientNameStr = "$firstName ${if (lastName.isNullOrBlank()) "" else lastName}"
//                patientNameStr = patientName
            }
            var ageStr=""
            if(age.isNotEmpty()) {
                ageStr = try {
                    if (age.toInt() > 1) {
                        "$age yrs"
                    }else{
                        "$age yr"
                    }
                }catch (ex: Exception){
                    age ?: ""
                }

            }
            return AddressPatientDetailsCardModel(
                AddressPatientDetailsConstants.PATIENT_DETAILS_CARD,
                patientNameStr,
                ageStr+", "+ getGender(gender),
                true,
                if (relationName.equals("MYSELF", true)) "Myself" else "",

                )
        }

        private fun getGender(gender: Int): String{
           return when(gender) {
                8 -> "Male"
                9-> "Female"
                else ->"Other"
            }
        }

        fun toDeliveryDetailsPatientDetailsCardModel(viewmodel: DeliveryDetailsViewModel?): AddressPatientDetailsCardModel {
            var patientNameStr = ""
            if (viewmodel?.patientExperiment?.value.equals("A")) {
                patientNameStr = patientName
            } else {
               // patientNameStr = firstName + " " + lastName
                patientNameStr = patientName
            }
            return AddressPatientDetailsCardModel(
                AddressPatientDetailsConstants.PATIENT_DETAILS_CARD,
                patientNameStr, "", true, "",
                isSelectable = true, isSelected = selected,
            )
        }

        fun toSdkObject(): DropDownDefaultModel {

            return DropDownDefaultModel(
                id = patientId.toInt(),
                title = patientName,
                selected = false
            )

        }

    }
}