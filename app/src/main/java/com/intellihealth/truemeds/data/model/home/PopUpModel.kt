package com.intellihealth.truemeds.data.model.home

data class PopUpModel(
    var icon: Int,
    var header: String? = null,
    var message: String? = null,
    var buttonText: String? = null,
    var isSpannableText: Boolean = false, /** If this is true then pass HTML formatted string in spannableText **/
    var spannableText: String? = null, /** i.e. - "You got  "+ "<b>" + "₹200 " + "</b> " + "for your referral." **/
    var showCloseButton: Boolean = true,
    )
