package com.intellihealth.truemeds.data.model.home


data class VideoFaqAllResponse(
    var message: String? = "",
    var statusValue: String? = "",
    var statusCode: Int = 0,
    var responseData: ResponseData? = null
) {
    data class ResponseData(
        val data: List<Video>?,
        val pages: Int?,
        val totalFaqs: Int?
    )

    data class Video(
        val categoryId: Int?,
        val categoryName: String?,
        val requestedBySource: String?,
        val video_url: List<VideoUrl>,

        var isSelected: Boolean = false,
        var isSelectedNext: Boolean = false,
        var playState: Boolean = false,
    ) {
        data class VideoUrl(
            val videoFaqId: Int?,
            val title: String?,
            val description: String?,
            val duration: String?,
            val language: String?,
            val thumbnailUrl: String?,
            val videoUrl: String?,
            val categoryId: String?,
            val categoryName: String?,
            val languageCode: String?,
            val requestedBySource: Any?,
            val videoOrientation: String?,
            val thumbnailUrl_portrait: String?,

            val gifUrl: Any?,//now added
            val verticalThumbnailUrl: Any?,//now added

        )
    }
}