package com.intellihealth.truemeds.presentation.activity


import android.content.Intent
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.mixpanel.MxLoginPageViewed
import com.intellihealth.truemeds.data.utils.PopUpType
import com.intellihealth.truemeds.data.utils.hideKeyboard
import com.intellihealth.truemeds.databinding.ActivityPrescriptionBinding
import com.intellihealth.truemeds.databinding.ActivityProductDetailBinding
import com.intellihealth.truemeds.mvvm.data.appsflyer.AFLoginPageViewed
import com.intellihealth.truemeds.presentation.bottomsheet.login.LoginBottomSheet
import com.intellihealth.truemeds.presentation.bottomsheet.productdetail.ProductDetailBottomSheet
import com.intellihealth.truemeds.presentation.callbacks.PopUpDialogCallback
import com.intellihealth.truemeds.presentation.fragment.InternalServerErrorCallback
import com.intellihealth.truemeds.presentation.fragment.ProductDetailFragment
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.utils.viewBinding
import com.truecaller.android.sdk.oAuth.TcSdk
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class ProductDetailActivity : BaseActivityWithLogin(),
    InternalServerErrorCallback {

    private val binding by viewBinding(ActivityProductDetailBinding::inflate)
    private var isSubs: Boolean = false
    private var searchText = ""
    private var searchType = ""
    private var pdCode = ""
    private var item_qc :String?=null
    private var item_rt :String?=null
    private var term_searched :String?=null
    private var suggestion_term_clicked :String?=null
    private var elastic_search_type :String?=null
    private var clickedOnPage :String?=null
    private var suggestion_term_clicked_position :Int?=null
    private var productDetailFragment: ProductDetailFragment? = null
    private var orgProductOfSubs: String? = null //When 'isSubs' true
    private var sectionHeading: String? = null
    private var isAlreadyAddedToCart: String? = null //When 'isSubs' true
    private var listener: ProductDetailBottomSheet.CrossSellingProductBSCallback? = null
    private var isFromCrossSelling: Boolean = false
    private var isFromSearch: Boolean = false
    private var section :String?=null
    private var clickedSuggestionType :String?=null
    private var deepLinkActionType :String?=null
    private var sectionIndex:Int?=null
    private var sectionRow:Int?=0
    var resultPosition:Int = 0
    private lateinit var bottomSheet : LoginBottomSheet
    override fun extractIntentData(){

        intent.extras?.let { bundle ->

            isSubs = bundle.getBoolean(BundleConstants.IS_SUBS, false)
            //  searchText = intent.getStringExtra(BundleConstants.SEARCH_TEXT) ?: ""
            searchType = bundle.getString(BundleConstants.SEARCH_TYPE) ?: ""
            pdCode = bundle.getString(BundleConstants.PRODUCT_CODE) ?: ""
            orgProductOfSubs = bundle.getString(BundleConstants.ORG_PRODUCT_OF_SUBS) ?: null
            isAlreadyAddedToCart =
                bundle.getString(BundleConstants.IS_ORG_ADDED_TO_CART) ?: null
            isFromCrossSelling =
                bundle.getBoolean(BundleConstants.IS_FROM_CROSS_SELLING, false)
            isFromSearch = bundle.getBoolean(BundleConstants.IS_FROM_SEARCH, false)

            item_qc = bundle.getString(BundleConstants.BUNDLE_KEY_ITEM_QC)
            item_rt = bundle.getString(BundleConstants.BUNDLE_KEY_ITEM_RT)
            term_searched = bundle.getString(BundleConstants.BUNDLE_KEY_TERM_SEARCHED)
            suggestion_term_clicked =
                bundle.getString(BundleConstants.BUNDLE_KEY_SUGGESTION_TERM_CLICKED)
            resultPosition = bundle.getInt(BundleConstants.POSITION, 0)
            suggestion_term_clicked_position =
                bundle.getInt(BundleConstants.BUNDLE_KEY_SUGGESTION_TERM_CLICKED_POSITION, 0)
            elastic_search_type = bundle.getString(BundleConstants.BUNDLE_KEY_ELASTIC_SEARCH_TYPE)
            clickedOnPage = bundle.getString(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE)
            section = bundle.getString(BundleConstants.BUNDLE_KEY_PAGE_SECTION)
            section = if (section == "") "main" else section
            sectionIndex = bundle.getInt(BundleConstants.BUNDLE_KEY_SECTION_INDEX, 0)
            sectionHeading = bundle.getString(BundleConstants.BUNDLE_KEY_SECTION_HEADING) ?: ""
            sectionRow = bundle.getInt(BundleConstants.BUNDLE_KEY_SECTION_ROW, 0)
            clickedSuggestionType =
                bundle.getString(BundleConstants.BUNDLE_KEY_CLICKED_SUGGESTION_TYPE)
            deepLinkActionType = bundle.getString(BundleConstants.ACTION_TYPE) ?: ""

        }

    }
    override fun sendLoginPageViewedEvent() {
        productDetailFragment?.sendLoginPageViewedEvent()
    }

    override fun setIsTruecaller(isTruecaller: Boolean) {
        productDetailFragment?.setIsTruecaller(isTruecaller)
    }

    fun setHomeCrossSellingListener(mListener: ProductDetailBottomSheet.CrossSellingProductBSCallback) {
        this.listener = mListener
    }

    override fun getTrueCallerUserDetails() {
        productDetailFragment?.getTrueCallerUserDetails(
            textAuthorizationCode = "authorization_code",
            clientId = resources.getString(R.string.truecaller_client_id),
            authorizationCode,
            codeVerifier,
            this@ProductDetailActivity
        )
    }

    override fun openLoginBottomSheet() {
        bottomSheet = LoginBottomSheet("product_detail_page", pageSection)
        bottomSheet.isCancelable = false
        if (!bottomSheet.isVisible)
            bottomSheet.show(supportFragmentManager, "LocationBottomSheet")
    }

    override fun closeLoginBottomSheet() {
        if (this::bottomSheet.isInitialized && bottomSheet.isVisible) {
            bottomSheet.dismiss()
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        hideKeyboard(this@ProductDetailActivity)
        initArguments()
        initView()

        updateStatusBarColor()
    }

    private fun initArguments() {
        supportActionBar?.hide()
        extractIntentData()

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == TcSdk.SHARE_PROFILE_REQUEST_CODE) {
            try {
                TcSdk.getInstance().onActivityResultObtained(this, requestCode, resultCode, data)
            } catch (ignore: Exception) {
            }
        }
    }

    private fun initView() {
        productDetailFragment = ProductDetailFragment.getInstance(
            isSubs = isSubs,
            isBottomSheetBahaviour = false,
            searchType = searchType,
            productCode = pdCode,
            orgProductOfSubs = orgProductOfSubs,
            isAlreadyAddedToCart = isAlreadyAddedToCart,
            isFromSearch = isFromSearch,
            item_qc = item_qc,
            item_rt = item_rt,
            term_searched = term_searched,
            suggestion_term_clicked = suggestion_term_clicked,
            suggestion_term_clicked_position = suggestion_term_clicked_position,
            elastic_search_type=elastic_search_type,
            clickedOnPage=clickedOnPage,
            section=section,
            sectionIndex=sectionIndex,
            crossSellingSectionHeadingEvent= sectionHeading, sectionRow = sectionRow,
            clickedSuggestionType= clickedSuggestionType,
            deepLinkActionType= deepLinkActionType
        )
        productDetailFragment?.setInternalServerErrorCallback(this)
        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragProductDetail, productDetailFragment!!, "PRODUCT_DETAIL_FRAGMENT")
            .commit()
    }

    fun closeActivity() {
        finish()
    }

    override fun onDestroy() {
        super.onDestroy()
        if (isFromCrossSelling) {
            listener?.dismissProductDetailBottomsheet(pdCode ?: "")
        }
    }

    private fun showInternalServerError() {
        showDialogBox(PopUpType.API_FAILURE, object :
            PopUpDialogCallback {
            override fun onActionButtonClicked() {
                finish()
            }

            override fun onCloseButtonClicked() {
                finish()

            }

            override fun onDismissOutside() {
                super.onDismissOutside()
                finish()
            }
        }, true, "Internal Server Error", "Internal Server Error")
    }

    override fun showInternalServerErrorDialogActivity() {
        showInternalServerError()
    }

    override fun showInternalServerErrorDialogBottomsheet() {
        // do nothing
    }


}