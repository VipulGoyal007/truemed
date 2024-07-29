package com.intellihealth.truemeds.data.model.bottomnav

import android.graphics.drawable.Drawable

data class AccountTabModel(
    var id: Int = 0,
    var menuName: String? = null,
    var activityName: String? = null,
    var drawable: Drawable? = null,
    var showWalletAmount: Boolean = false,
    var userName : String?,
    var userMobile : String?,
    var userEmail : String?
)

