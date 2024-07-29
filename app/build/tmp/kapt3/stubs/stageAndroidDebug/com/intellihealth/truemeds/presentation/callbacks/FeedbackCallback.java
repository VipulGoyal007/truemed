package com.intellihealth.truemeds.presentation.callbacks;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001JJ\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u00072\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\fH&\u00a8\u0006\u000e"}, d2 = {"Lcom/intellihealth/truemeds/presentation/callbacks/FeedbackCallback;", "", "onFeedbackSubmitted", "", "ratings", "", "feedbackCategory", "", "userInput", "ratingName", "ratingReasonHeader", "ratingReasonsList", "", "Lcom/intellihealth/truemeds/data/model/orderflow/SaveRatingDetailsRequestDataModel$RatingReasonDataModel;", "app_stageAndroidDebug"})
public abstract interface FeedbackCallback {
    
    public abstract void onFeedbackSubmitted(float ratings, @org.jetbrains.annotations.Nullable()
    java.lang.String feedbackCategory, @org.jetbrains.annotations.Nullable()
    java.lang.String userInput, @org.jetbrains.annotations.Nullable()
    java.lang.String ratingName, @org.jetbrains.annotations.Nullable()
    java.lang.String ratingReasonHeader, @org.jetbrains.annotations.Nullable()
    java.util.List<com.intellihealth.truemeds.data.model.orderflow.SaveRatingDetailsRequestDataModel.RatingReasonDataModel> ratingReasonsList);
}