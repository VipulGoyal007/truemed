package com.intellihealth.truemeds.data.model.productlistanddetails


data class MedicineDetailsResponse(
    val DoctorList: List<Doctor?>?,
    val doctorProfileList: List<DoctorProfile?>?,
    val MedicineDetails: MedicineDetailsRes?
) {
    data class Doctor(
        val aadharBack: Any?,
        val aadharBackImg: Any?,
        val aadharBackImgName: Any?,
        val aadharBackImgType: Any?,
        val aadharFront: Any?,
        val aadharFrontImg: Any?,
        val aadharFrontImgName: Any?,
        val aadharFrontImgType: Any?,
        val accountHolderName: Any?,
        val accountNumber: Any?,
        val approved: Boolean?,
        val biometricImageDtoList: Any?,
        val cancelledCheque: Any?,
        val cancelledChequeImg: Any?,
        val cancelledChequeImgName: Any?,
        val cancelledChequeImgType: Any?,
        val certificateImg: Any?,
        val certificateImgName: Any?,
        val certificateImgType: Any?,
        val customerCount: Int?,
        val degreeCertificate: Any?,
        val dob: Any?,
        val doctorAgreement: Any?,
        val doctorAgreementImg: Any?,
        val doctorAgreementImgName: Any?,
        val doctorAgreementImgType: Any?,
        val doctorId: Int?,
        val doctorInvoiceName: Any?,
        val doctorName: String?,
        val doctorSignature: Any?,
        val drVoiceList: Any?,
        val emailId: Any?,
        val experience: String?,
        val firstName: Any?,
        val healthMantra: String?,
        val ifscCode: Any?,
        val image: String?,
        val imageUrlList: Any?,
        val imgData: Any?,
        val imgName: Any?,
        val imgType: Any?,
        val lastName: Any?,
        val middleName: Any?,
        val mobileNo: Any?,
        val orderId: Any?,
        val orderRating: Int?,
        val panCard: Any?,
        val panCardImg: Any?,
        val panCardImgName: Any?,
        val panCardImgType: Any?,
        val panCardNumber: Any?,
        val qualification: List<String?>?,
        val qualificationId: Any?,
        val rating: Double?,
        val registrationCertificate: Any?,
        val registrationCertificateImg: Any?,
        val registrationCertificateImgName: Any?,
        val registrationCertificateImgType: Any?,
        val registrationNo: Any?,
        val signatureImg: Any?,
        val signatureImgName: Any?,
        val signatureImgType: Any?,
        val specialist: List<String?>?,
        val specialistId: Any?,
        val truemedsEmailId: Any?,
        val voiceUrlList: Any?
    )

    data class DoctorProfile(
        val about: String?,
        val authorWordpressId: Int?,
        val awards: String?,
        val degree: String?,
        val designation: String?,
        val doctorAuthorId: Int?,
        val education: String?,
        val emailId: String?,
        val firstName: String?,
        val lastName: String?,
        val linkedIn: String?,
        val metaDescription: String?,
        val metaTitle: String?,
        val modifiedById: Int?,
        val modifiedByName: String?,
        val modifiedOn: Long?,
        val profilePicture: String?,
        val publications: List<Publication?>?,
        val quora: String?,
        val totalExperience: String?,
        val urlSuffix: String?
    ) {
        data class Publication(
            val description: String?,
            val link: String?
        )
    }

    data class MedicineDetailsRes(
        val altDisease1: String?,
        val altDisease2: Any?,
        val alternateMedicineName1: String?,
        val alternateMedicineName2: String?,
        val approvedDate: Any?,
        val assignmentId: Any?,
        val assignmentIdEncoded: Any?,
        val assignmentTitle: Any?,
        val category: Any?,
        val companyAddress: String?,
        val companyName: String?,
        val dietAndLifestyleGuidance: Any?,
        val disease1: String?,
        val disease2: String?,
        val disease3: String?,
        val documentSrc: Any?,
        val dosageInformation: List<DosageInformation?>?,
        val factBox: List<FactBox?>?,
        val genre: Any?,
        val groupAssignment: Any?,
        val interaction: List<Interaction?>?,
        val language: Any?,
        val managingSideEffects: Any?,
        val medActivity: String?,
        val medDirectionForUse: String?,
        val medFaqs: String?,
        val medIntroduction: String?,
        val medSideEffects: String?,
        val medUses: String?,
        val precautions: List<Precaution?>?,
        val primaryIndustry: Any?,
        val productCd: String?,
        val productName: Any?,
        val projectId: Any?,
        val qualityAssured: String?,
        val quickTips: Any?,
        val recommendedDescription: String?,
        val recommendedTitle: String?,
        val reference: Any?,
        val reviewer: Any?,
        val routeOfAdministration: Any?,
        val skuName: String?,
        val storage: Any?,
        val templateId: Int?,
        val userId: Int?,
        val userName: String?,
        val wordCount: Any?,
        val writer: Any?
    )
    {
        data class DosageInformation(
            val dailyDose: Any?,
            val missedDose: Any?,
            val overDose: Any?
        )

        data class FactBox(
            val ailment: Any?,
            val availableDosageTypes: Any?,
            val drugCategory: Any?,
            val habitForming: Any?,
            val therapeuticCategory: Any?
        )

        data class Interaction(
            val drugDiseaseInteractions: Any?,
            val drugDrugInteractions: Any?,
            val drugFoodInteractions: Any?
        )

        data class Precaution(
            val alcohol: Any?,
            val allergy: Any?,
            val breastfeeding: Any?,
            val kidney: Any?,
            val liver: Any?,
            val pregnancy: Any?,
            val useInChildren: Any?,
            val useInOlderPatients: Any?,
            val usingMachinesAndDriving: Any?
        )
    }
}