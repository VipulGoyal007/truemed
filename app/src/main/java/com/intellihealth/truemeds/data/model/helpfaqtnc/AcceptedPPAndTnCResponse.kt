package com.intellihealth.truemeds.data.model.helpfaqtnc

/**
 * This is used for check whether privacy policy and terms and condition is accepted or not
 * **/
data class AcceptedPPAndTnCResponse(
    /**
     * This is check whether new privacy policy is accepted or not
     * **/
    val accpetedPrivacyPolicy: Boolean?,
    /**
     * This is check whether terms and condition is accepted or not
     * **/
    val accpetedTermsConditions: Boolean?
)