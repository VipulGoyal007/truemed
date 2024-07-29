package com.intellihealth.truemeds.data.model.helpfaqtnc

/**
 * This is used for showing frequently ask question list
 * **/
data class FaqCategoryResponse(
    /**
     * This contains both faq category type and faq category question list
     * **/
    val payload: List<Payload?>?
) {
    data class Payload(
        /**
         * This is used to show to answer
         * **/
        val answer: String?,
        /**
         * This is used to show to question
         * **/
        val categoryId: Int?,
        /**
         * This is parent category type name eg Refer And Earn,TM Credit etc
         * **/
        val categoryName: String?,
        val faqId: Int?,
        /**
         * This is used to show to question
         * **/
        val question: String?,
        val status: Int?,
        /**
         * This is category id related FAQ
         * **/
        val id: Int?,
        /**
         * This is category type name eg Refer And Earn,TM Credit etc
         * **/
        val name: String?,
    )
}