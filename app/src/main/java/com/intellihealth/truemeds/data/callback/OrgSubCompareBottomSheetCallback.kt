package com.intellihealth.truemeds.data.callback

import com.intellihealth.truemeds.presentation.model.ProductInfoModel

interface OrgSubCompareBottomSheetCallback{
        fun closeClick(isReload: Boolean = true)
        fun openPDPage(productCode: String?, subs: Boolean?) {}
        fun openPDPageCart(productCode: String?, subs: Boolean?, productInfoModel: ProductInfoModel) {}

}