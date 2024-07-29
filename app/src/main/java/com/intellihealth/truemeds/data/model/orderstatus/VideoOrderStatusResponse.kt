package com.intellihealth.truemeds.data.model.orderstatus

class VideoOrderStatusResponse :
    ArrayList<VideoOrderStatusResponse.VideoOnOrderStatusResponseItem>() {
    data class VideoOnOrderStatusResponseItem(
        val categoryId: Int?,
        val categoryName: Any?,
        val description: String?,
        val duration: String?,
        val gifUrl: String?,
        val language: String?,
        val languageCode: String?,
        val requestedBySource: Any?,
        val thumbnailUrl: String?,
        val thumbnailUrl_portrait: Any?,
        val title: String?,
        val verticalThumbnailUrl: String?,
        val videoFaqId: Int?,
        val videoOrientation: String?,
        val videoUrl: String?
    )
}