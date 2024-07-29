package com.intellihealth.truemeds.data.model.home

import com.intellihealth.salt.models.AuthorCardModel


data class WrittenReviewBy(
    var sequence: Int? = null,
    var iconUrl: String? = null,
    var header: String? = null,
    var description: String? = null,
    var tag: String? = null

) {
    fun toAuthorCardModel(): AuthorCardModel {
        return AuthorCardModel(
            authorLabel = tag,
            authorTitle = header,
            authorDescription = description,
            authorProfileImage = iconUrl

        )
    }
}