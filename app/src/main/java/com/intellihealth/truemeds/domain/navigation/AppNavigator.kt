package com.intellihealth.truemeds.domain.navigation

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.result.ActivityResultLauncher
import androidx.fragment.app.Fragment
import com.intellihealth.truemeds.presentation.activity.AddAddressActivity
import com.intellihealth.truemeds.presentation.activity.AddPatientActivity
import com.intellihealth.truemeds.presentation.activity.BaseActivity
import com.intellihealth.truemeds.presentation.activity.CancelOrderActivity
import com.intellihealth.truemeds.presentation.activity.CancelOrderSubActivity
import com.intellihealth.truemeds.presentation.activity.CartActivity
import com.intellihealth.truemeds.presentation.activity.CouponActivity
import com.intellihealth.truemeds.presentation.activity.DeliveryDetailsActivity
import com.intellihealth.truemeds.presentation.activity.EditProfileActivity
import com.intellihealth.truemeds.presentation.activity.FaqViewAllActivity
import com.intellihealth.truemeds.presentation.activity.HealthArticleDetailActivity
import com.intellihealth.truemeds.presentation.activity.HealthArticlesActivity
import com.intellihealth.truemeds.presentation.activity.HelpActivity
import com.intellihealth.truemeds.presentation.activity.HelpSubCategoryActivity
import com.intellihealth.truemeds.presentation.activity.HelpSubCategoryDetailActivity
import com.intellihealth.truemeds.presentation.activity.HomePageActivity
import com.intellihealth.truemeds.presentation.activity.LoginActivity
import com.intellihealth.truemeds.presentation.activity.ManageAddressActivity
import com.intellihealth.truemeds.presentation.activity.ManagePatientActivity
import com.intellihealth.truemeds.presentation.activity.MyOrdersActivity
import com.intellihealth.truemeds.presentation.activity.NonActiveOrderStatusActivity
import com.intellihealth.truemeds.presentation.activity.OrderStatusActivity
import com.intellihealth.truemeds.presentation.activity.OrderSummaryActivity
import com.intellihealth.truemeds.presentation.activity.OtcCategoryActivity
import com.intellihealth.truemeds.presentation.activity.PatientReminderActivity
import com.intellihealth.truemeds.presentation.activity.PaymentActivity
import com.intellihealth.truemeds.presentation.activity.PaymentOptionActivity
import com.intellihealth.truemeds.presentation.activity.PoliciesPageActivity
import com.intellihealth.truemeds.presentation.activity.PolicyDetailActivity
import com.intellihealth.truemeds.presentation.activity.PrescriptionActivity
import com.intellihealth.truemeds.presentation.activity.ProductDetailActivity
import com.intellihealth.truemeds.presentation.activity.ProductListViewAllActivity
import com.intellihealth.truemeds.presentation.activity.ReferAndEarnActivity
import com.intellihealth.truemeds.presentation.activity.SearchResultActivity
import com.intellihealth.truemeds.presentation.activity.SearchSuggestionActivity
import com.intellihealth.truemeds.presentation.activity.SubstitutesActivity
import com.intellihealth.truemeds.presentation.activity.VideoFaqActivity
import com.intellihealth.truemeds.presentation.activity.WalletActivity
import com.intellihealth.truemeds.presentation.activity.WalletTransactionsActivity
import com.intellihealth.truemeds.presentation.activity.WebBrowser

fun Fragment.navigateToOrderStatusActivity(params: Bundle? = null, isFlagAdded: Boolean = false) {
    (requireActivity() as BaseActivity).navigateToOrderStatusActivity(params, isFlagAdded)
}

fun Fragment.navigateToPrescriptionActivity(params: Bundle? = null, isFlagAdded: Boolean = false) {
    (requireActivity() as BaseActivity).navigateToPrescriptionActivity(params, isFlagAdded)
}

fun Fragment.navigateToVideoFaqActivity(params: Bundle? = null) {
    (requireActivity() as BaseActivity).navigateToVideoFaqActivity(params)
}
fun Fragment.navigateToSubstitutesActivity(params: Bundle? = null) {
    (requireActivity() as BaseActivity).navigateToSubstitutesActivity(params)
}

fun Fragment.navigateToSearchSuggestionActivity(params: Bundle? = null,   flags: List<Int>? = null) {
    (requireActivity() as BaseActivity).navigateToSearchSuggestionActivity(params, flags)
}

fun Fragment.navigateToSearchResultActivity(params: Bundle? = null,   flags: List<Int>? = null,launcher: ActivityResultLauncher<Intent>? = null) {
    (requireActivity() as BaseActivity).navigateToSearchResultActivity(params, flags,launcher)
}

fun Fragment.navigateToAddAddressActivity(
    params: Bundle? = null,
    launcher: ActivityResultLauncher<Intent>? = null
) {
    (requireActivity() as BaseActivity).navigateToAddAddressActivity(params,launcher)
}

fun Fragment.navigateToCartActivity(
    params: Bundle? = null,
    flags: List<Int>? = null
    ) {
    (requireActivity() as BaseActivity).navigateToCartActivity(params,flags)
}

fun Fragment.navigateToOrderSummaryActivity(
    params: Bundle? = null,
    flags: List<Int>? = null,
    resultCode: Int?= null,
    resultData: Intent? = null
) {
    (requireActivity() as BaseActivity).navigateToOrderSummaryActivity(params,flags,resultCode,resultData)
}

fun BaseActivity.navigateToOrderStatusActivity(
    params: Bundle? = null,
    isFlagAdded: Boolean = false
) {
    startActivity(
        Intent(this, OrderStatusActivity::class.java).apply {
            params?.let { putExtras(it) }

             if(isFlagAdded){
                 flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
                 flags = Intent.FLAG_ACTIVITY_CLEAR_TASK
                 flags = Intent.FLAG_ACTIVITY_NEW_TASK
             }
         }
     )
 }

fun BaseActivity.navigateToOrderSummaryActivity(
    params: Bundle? = null,
    flags: List<Int>? = null,
    resultCode: Int? = null,
    resultData: Intent? = null
){
     startActivity(
         Intent(this, OrderSummaryActivity::class.java).apply {
             params?.let { putExtras(it) }

             if(!flags.isNullOrEmpty()){
                 flags.forEach {
                     addFlags(it)
                 }
             }
             resultCode?.let { setResult(resultCode,resultData) }
         }
     )
 }

fun BaseActivity.navigateToCartActivity(
    params: Bundle? = null,
    flags: List<Int>? = null
) {
    startActivity(
        Intent(this, CartActivity::class.java).apply {
            params?.let { putExtras(it) }

            if(!flags.isNullOrEmpty()){
                flags.forEach {
                    addFlags(it)
                }
            }
        }
    )
}

fun BaseActivity.navigateToPrescriptionActivity(params: Bundle?=null, isFlagAdded: Boolean = false){
    startActivity(
        Intent(this, PrescriptionActivity::class.java).apply {

            params?.let { putExtras(it) }

            if(isFlagAdded) {
                setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP or Intent.FLAG_ACTIVITY_CLEAR_TOP)
            }
        }
    )
}

fun BaseActivity.navigateToWebBrowser(params: Bundle?=null){
    startActivity(
        Intent(this, WebBrowser::class.java).apply {
            params?.let { putExtras(it) }
        }
    )
}

fun BaseActivity.navigateToAddAddressActivity(
    params: Bundle? = null,
    activityLauncher: ActivityResultLauncher<Intent>? = null
){
    val intent = Intent(this, AddAddressActivity::class.java).apply {
        params?.let { putExtras(it) }
    }
    activityLauncher?.launch(intent) ?: startActivity(intent)
}

fun BaseActivity.navigateToAddPatientActivity(
    params: Bundle? = null,
    activityLauncher: ActivityResultLauncher<Intent>? = null
){
    val intent = Intent(this, AddPatientActivity::class.java).apply {
        params?.let { putExtras(it) }
    }
    activityLauncher?.launch(intent) ?: startActivity(intent)
}

fun BaseActivity.navigateToCancelOrderActivity(
    params: Bundle? = null
){
   startActivity(Intent(this, CancelOrderActivity::class.java).apply {
       params?.let { putExtras(it) }
   })
}

fun BaseActivity.navigateToWalletTransactionActivity(
    params: Bundle? = null,
) {
    startActivity(
        Intent(this, WalletTransactionsActivity::class.java).apply {
            params?.let { putExtras(it) }
        }
    )
}

fun BaseActivity.navigateToVideoFaqActivity(
    params: Bundle? = null,
) {
    startActivity(
        Intent(this, VideoFaqActivity::class.java).apply {
            params?.let { putExtras(it) }
        }
    )
}

fun BaseActivity.navigateToSubstitutesActivity(
    params: Bundle? = null,
) {
    startActivity(
        Intent(this, SubstitutesActivity::class.java).apply {
            params?.let { putExtras(it) }
        }
    )
}

fun BaseActivity.navigateToCancelOrderSubActivity(
    params: Bundle? = null,
    activityLauncher: ActivityResultLauncher<Intent>? = null
) {
    val intent = Intent(this, CancelOrderSubActivity::class.java).apply {
        params?.let { putExtras(it) }
    }
    activityLauncher?.launch(intent) ?: startActivity(intent)
}

fun BaseActivity.navigateToCouponActivity(
    params: Bundle? = null,
    activityLauncher: ActivityResultLauncher<Intent>? = null
) {
    val intent = Intent(this, CouponActivity::class.java).apply {
        params?.let { putExtras(it) }
    }
    activityLauncher?.launch(intent) ?: startActivity(intent)
}

fun BaseActivity.navigateToDeliveryDetailsActivity(
    params: Bundle? = null,
    activityLauncher: ActivityResultLauncher<Intent>? = null
) {
    val intent = Intent(this, DeliveryDetailsActivity::class.java).apply {
        params?.let { putExtras(it) }
    }
    activityLauncher?.launch(intent) ?: startActivity(intent)
}

fun Context.navigateToSearchSuggestionActivity(
    params: Bundle? = null,
    flags: List<Int>? = null
) {
    startActivity(
        Intent(this, SearchSuggestionActivity::class.java).apply {
            params?.let { putExtras(it) }

            if (!flags.isNullOrEmpty()) {
                flags.forEach {
                    addFlags(it)
                }
            }
        }
    )
}

fun BaseActivity.navigateToSearchResultActivity(
    params: Bundle? = null,
    flags: List<Int>? = null,
    activityLauncher: ActivityResultLauncher<Intent>? = null
) {

       val intent = Intent(this, SearchResultActivity::class.java).apply {
            params?.let { putExtras(it) }

            if (!flags.isNullOrEmpty()) {
                flags.forEach {
                    addFlags(it)
                }
            }
        }

    activityLauncher?.launch(intent) ?: startActivity(intent)
}

fun Fragment.navigateToReferAndEarnActivity(params: Bundle? = null) {
    (requireActivity() as BaseActivity).navigateToReferAndEarnActivity(params)
}
fun BaseActivity.navigateToReferAndEarnActivity(
    params: Bundle? = null,
) {
    startActivity(
        Intent(this, ReferAndEarnActivity::class.java).apply {
            params?.let { putExtras(it) }
        }
    )
}

fun Fragment.navigateToProductListViewAllActivity(params: Bundle? = null) {
    (requireActivity() as BaseActivity).navigateToProductListViewAllActivity(params)
}
fun BaseActivity.navigateToProductListViewAllActivity(
    params: Bundle? = null,
) {
    startActivity(
        Intent(this, ProductListViewAllActivity::class.java).apply {
            params?.let { putExtras(it) }
        }
    )
}

fun Fragment.navigateToProductDetailActivity(params: Bundle? = null,   flags: List<Int>? = null,launcher: ActivityResultLauncher<Intent>? = null) {
    (requireActivity() as BaseActivity).navigateToProductDetailActivity(params, flags,launcher)
}

fun BaseActivity.navigateToProductDetailActivity(
    params: Bundle? = null,
    flags: List<Int>? = null,
    activityLauncher: ActivityResultLauncher<Intent>? = null
) {

    val intent = Intent(this, ProductDetailActivity::class.java).apply {
        params?.let { putExtras(it) }

        if (!flags.isNullOrEmpty()) {
            flags.forEach {
                addFlags(it)
            }
        }
    }

    activityLauncher?.launch(intent) ?: startActivity(intent)
}

fun Fragment.navigateToPolicyDetailActivity(params: Bundle? = null) {
    (requireActivity() as BaseActivity).navigateToPolicyDetailActivity(params)
}
fun BaseActivity.navigateToPolicyDetailActivity(
    params: Bundle? = null,
) {
    startActivity(
        Intent(this, PolicyDetailActivity::class.java).apply {
            params?.let { putExtras(it) }
        }
    )
}

fun Fragment.navigateToPoliciesPageActivity(params: Bundle? = null) {
    (requireActivity() as BaseActivity).navigateToPoliciesPageActivity(params)
}
fun BaseActivity.navigateToPoliciesPageActivity(
    params: Bundle? = null,
) {
    startActivity(
        Intent(this, PoliciesPageActivity::class.java).apply {
            params?.let { putExtras(it) }
        }
    )
}


fun Fragment.navigateToEditProfileActivity(params: Bundle? = null) {
    (requireActivity() as BaseActivity).navigateToEditProfileActivity(params)
}

fun BaseActivity.navigateToEditProfileActivity(
    params: Bundle? = null,
) {
    startActivity(
        Intent(this, EditProfileActivity::class.java).apply {
            params?.let { putExtras(it) }
        }
    )
}

fun Fragment.navigateToFaqViewAllActivity(params: Bundle? = null) {
    (requireActivity() as BaseActivity).navigateToFaqViewAllActivity(params)
}

fun BaseActivity.navigateToFaqViewAllActivity(
    params: Bundle? = null,
) {
    startActivity(
        Intent(this, FaqViewAllActivity::class.java).apply {
            params?.let { putExtras(it) }
        }
    )
}

fun Fragment.navigateToHealthArticleDetailActivity(params: Bundle? = null, flags: List<Int>? = null) {
    (requireActivity() as BaseActivity).navigateToHealthArticleDetailActivity(params,flags)
}
fun BaseActivity.navigateToHealthArticleDetailActivity(
    params: Bundle? = null,
    flags: List<Int>? = null
) {
    startActivity(
        Intent(this, HealthArticleDetailActivity::class.java).apply {
            params?.let { putExtras(it) }

            if (!flags.isNullOrEmpty()) {
                flags.forEach {
                    addFlags(it)
                }
            }
        }
    )
}


fun Fragment.navigateToHealthArticlesActivity(params: Bundle? = null, flags: List<Int>? = null) {
    (requireActivity() as BaseActivity).navigateToHealthArticlesActivity(params,flags)
}
fun BaseActivity.navigateToHealthArticlesActivity(
    params: Bundle? = null,
    flags: List<Int>? = null
) {
    startActivity(
        Intent(this, HealthArticlesActivity::class.java).apply {
            params?.let { putExtras(it) }

            if (!flags.isNullOrEmpty()) {
                flags.forEach {
                    addFlags(it)
                }
            }
        }
    )
}

fun Fragment.navigateToHelpActivity(params: Bundle? = null) {
    (requireActivity() as BaseActivity).navigateToHelpActivity(params)
}
fun BaseActivity.navigateToHelpActivity(
    params: Bundle? = null
) {
    startActivity(
        Intent(this, HelpActivity::class.java).apply {
            params?.let { putExtras(it) }
        }
    )
}

fun BaseActivity.navigateToHelpSubCategoryActivity(
    params: Bundle? = null
) {
    startActivity(
        Intent(this, HelpSubCategoryActivity::class.java).apply {
            params?.let { putExtras(it) }
        }
    )
}

fun BaseActivity.navigateToHelpSubCategoryDetailActivity(
    params: Bundle? = null
) {
    startActivity(
        Intent(this, HelpSubCategoryDetailActivity::class.java).apply {
            params?.let { putExtras(it) }
        }
    )
}

fun Fragment.navigateToHomePageActivity(
    params: Bundle? = null,
    flags: List<Int>? = null,
    uri: Uri? = null) {
    (requireActivity() as BaseActivity).navigateToHomePageActivity(params, flags, uri)
}

fun BaseActivity.navigateToHomePageActivity(
    params: Bundle? = null,
    flags: List<Int>? = null,
    uri: Uri? = null
) {
    startActivity(
        Intent(this, HomePageActivity::class.java).apply {
            params?.let { putExtras(it) }

            if (!flags.isNullOrEmpty()) {
                flags.forEach {
                    addFlags(it)
                }
            }

            uri?.let { setData(it) }
        }
    )
}

fun BaseActivity.navigateToLoginActivity(
    params: Bundle? = null,
    data: Uri? = null
) {
    startActivity(
        Intent(this, LoginActivity::class.java).apply {
            params?.let { putExtras(it) }
            data?.let { setData(it) }
        }
    )
}

fun Fragment.navigateToManageAddressActivity(
    params: Bundle? = null,
    data: Uri? = null) {
    (requireActivity() as BaseActivity).navigateToManageAddressActivity(params, data)
}


fun BaseActivity.navigateToManageAddressActivity(
    params: Bundle? = null,
    data: Uri? = null
) {
    startActivity(
        Intent(this, ManageAddressActivity::class.java).apply {
            params?.let { putExtras(it) }
            data?.let { setData(it) }
        }
    )
}

fun Fragment.navigateToManagePatientActivity(
    params: Bundle? = null
) {
    (requireActivity() as BaseActivity).navigateToManagePatientActivity(params)
}
fun BaseActivity.navigateToManagePatientActivity(
    params: Bundle? = null
) {
    startActivity(
        Intent(this, ManagePatientActivity::class.java).apply {
            params?.let { putExtras(it) }
        }
    )
}


fun Fragment.navigateToMyOrdersActivity(
    params: Bundle? = null
) {
    (requireActivity() as BaseActivity).navigateToMyOrdersActivity(params)
}
fun BaseActivity.navigateToMyOrdersActivity(
    params: Bundle? = null
) {
    startActivity(
        Intent(this, MyOrdersActivity::class.java).apply {
            params?.let { putExtras(it) }
        }
    )
}

fun Fragment.navigateToNonActiveOrderStatusActivity(
    params: Bundle? = null
) {
    (requireActivity() as BaseActivity).navigateToNonActiveOrderStatusActivity(params)
}
fun Context.navigateToNonActiveOrderStatusActivity(
    params: Bundle? = null
) {
startActivity(
        Intent(this, NonActiveOrderStatusActivity::class.java).apply {
            params?.let { putExtras(it) }
        }
    )
}

fun BaseActivity.navigateToPaymentActivity(
    params: Bundle? = null,
    activityLauncher: ActivityResultLauncher<Intent>? = null
) {

    val intent = Intent(this, PaymentActivity::class.java).apply {
        params?.let { putExtras(it) }
    }

    activityLauncher?.launch(intent) ?: startActivity(intent)
}


fun Fragment.navigateToOtcCategoryActivity(
    params: Bundle? = null
) {
    (requireActivity() as BaseActivity).navigateToOtcCategoryActivity(params)
}
fun Fragment.navigateToPatientReminderActivity(
    params: Bundle? = null
) {
    startActivity(
        Intent(requireActivity(), PatientReminderActivity::class.java).apply {
            params?.let { putExtras(it) }
        }
    )
}

fun Fragment.navigateToWalletActivity(
    params: Bundle? = null
) {
    startActivity(
        Intent(requireActivity(), WalletActivity::class.java).apply {
            params?.let { putExtras(it) }
        }
    )
}

fun Context.navigateToOtcCategoryActivity(
    params: Bundle? = null
) {
    startActivity(
        Intent(this, OtcCategoryActivity::class.java).apply {
            params?.let { putExtras(it) }
        }
    )
}

fun Fragment.navigateToPaymentOptionActivity(
    params: Bundle? = null,
    activityLauncher: ActivityResultLauncher<Intent>? = null
) {
    (requireActivity() as BaseActivity).navigateToPaymentOptionActivity(params,activityLauncher)
}
fun BaseActivity.navigateToPaymentOptionActivity(
    params: Bundle? = null,
    activityLauncher: ActivityResultLauncher<Intent>? = null
) {
    val intent = Intent(this, PaymentOptionActivity::class.java).apply {
        params?.let { putExtras(it) }
    }

    activityLauncher?.launch(intent) ?: startActivity(intent)
}