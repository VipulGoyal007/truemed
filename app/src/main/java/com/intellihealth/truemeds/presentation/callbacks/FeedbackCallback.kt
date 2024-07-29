package com.intellihealth.truemeds.presentation.callbacks

import com.intellihealth.truemeds.data.model.orderflow.SaveRatingDetailsRequestDataModel

interface FeedbackCallback {
    fun onFeedbackSubmitted(ratings: Float, feedbackCategory: String?, userInput: String?, ratingName: String?
                            , ratingReasonHeader: String?,  ratingReasonsList: List<SaveRatingDetailsRequestDataModel.RatingReasonDataModel?>?)
}