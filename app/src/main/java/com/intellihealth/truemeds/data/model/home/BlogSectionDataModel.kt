package com.intellihealth.truemeds.data.model.home

import com.intellihealth.truemeds.presentation.utils.HomeSectionConstants
import com.intellihealth.salt.models.BlogModel

data class BlogSectionDataModel(
    var id:Int=9,
    var type :String= HomeSectionConstants.BLOG_SECTION_CARD,
    var blogModel: BlogModel?=null
)
