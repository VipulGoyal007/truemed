package com.intellihealth.truemeds.data.model.reminder

import com.intellihealth.salt.models.DropDownDefaultModel

data class PatientListModel(
    var patientList: ArrayList<PatientList> = arrayListOf()
) {
    data class PatientList(

        var patientId: Int? = null,
        var patientName: String? = null,
        var age: String? = null,
        var gender: Int? = null,
        var genderName: String? = null,
        var relationId: Int? = null,
        var relationName: String? = null,
        var emailId: String? = null,
        var firstName: String? = null

    ){
        fun toSdkObject(): DropDownDefaultModel {

            return DropDownDefaultModel(
                id = patientId!!,
                title = patientName!!,
                selected = false
            )

        }
    }
}
