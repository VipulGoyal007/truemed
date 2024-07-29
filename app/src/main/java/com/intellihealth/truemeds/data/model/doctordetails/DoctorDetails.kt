package com.intellihealth.truemeds.data.model.doctordetails
/**
 *This is used to showing doctor details against particular order
 * **/
data class DoctorDetails(
    var id: Int = 0,
    /**
     *This is used when submit rating for doctor
     * **/
    var doctorId: Int = 0,
    /**
     *This is used for showing number of customer count that consulted by doctor
     * **/
    var customerCount: Int = 0,
    /**
     *This is used for showing name of doctor
     * **/
    var doctorName: String?,
    var image: Any?,
    var healthMantra: String?,
    var experience: String?,
    var emailId: Any?,
    var degreeCertificate: Any?,
    var doctorSignature: Any?,
    /**
     *This is used to show rating of doctor eg five star, two star etc
     * **/
    var rating: Double = 0.0,
    var dob: Any?,
    var mobileNo: Any?,
    var registrationNo: Any?,
    var doctorInvoiceName: Any?,
    /**
     *This contains multiple speciality, used first item for showing doctor speciality
     * **/
    var specialist: ArrayList<String>?,
    /**
     *This contains multiple qualification, used first item for showing doctor qualification
     * **/
    var qualification: ArrayList<String>?,
    var specialistId: Any?,
    var qualificationId: Any?,
    var imgData: Any?,
    var certificateImg: Any?,
    var signatureImg: Any?,
    var imgType: Any?,
    var certificateImgType: Any?,
    var signatureImgType: Any?,
    var imgName: Any?,
    var certificateImgName: Any?,
    var signatureImgName: Any?,
    /**
     *This is used to show rating or experience about doctor against that order
     * **/
    var orderRating: Int = 0,
    var orderId: Long = 0,
    var approved: Boolean = false
)