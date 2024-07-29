package com.intellihealth.truemeds.data.model.orderflow

data class SaveRatingDetailsRequestDataModel(
    var rating: Int = 0,
    var ratingName: String?,
    var ratingReasonHeader: String?,
    var remarks: String?,
    var ratingReasonsList: List<RatingReasonDataModel?>?

) {
    data class RatingReasonDataModel(
        var reasonName: String?,
        var activeUrl: String?,
        var inactiveUrl: String?,
        var reasonPlacementPosition: Int = 0,
        var reasonId: Int = 0

    )
}
