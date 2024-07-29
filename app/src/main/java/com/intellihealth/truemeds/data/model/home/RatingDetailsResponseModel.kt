package com.intellihealth.truemeds.data.model.home

data class RatingDetailsResponseModel(
    val message: String,
    val responseData: ResponseData,
    val statusCode: Int,
    val statusValue: String,
    val timeTakenInMs: Any
) {
    data class ResponseData(
        val ratingDetails: List<RatingDetail>
    ) {
        data class RatingDetail(
            val emojiUrl: String,
            val rating: Int,
            val ratingId: Int,
            val ratingName: String,
            val ratingReasonHeader: String,
            val ratingReasonsList: List<RatingReasons>,
            val remarks: Any
        ) {
            data class RatingReasons(
                val activeUrl: String,
                val inActiveUrl: String,
                val reasonId: Int,
                val reasonName: String,
                val reasonPlacementPosition: Int,
                var isSelected:Boolean=false
            )
        }
    }
}