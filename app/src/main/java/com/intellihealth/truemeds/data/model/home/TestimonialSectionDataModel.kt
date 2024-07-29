package com.intellihealth.truemeds.data.model.home

import com.intellihealth.salt.models.TestimonialSectionModel
import com.intellihealth.truemeds.presentation.utils.HomeSectionConstants

data class TestimonialSectionDataModel(
    var id:Int=10,
    var type :String= HomeSectionConstants.TESTIMONIAL_SECTION_CARD,
    var testimonialModel: TestimonialSectionModel?=null
)
