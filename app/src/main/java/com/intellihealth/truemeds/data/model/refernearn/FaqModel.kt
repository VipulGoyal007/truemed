package com.intellihealth.truemeds.data.model.refernearn

data class FaqModel(
    var payload: ArrayList<Payload> = arrayListOf()
) {

    data class Payload(

        var faqId: Int? = null,
        var categoryId: Int? = null,
        var question: String? = null,
        var answer: String? = null,
        var categoryName: String? = null,
        var status: Int? = null

    )
}