package com.intellihealth.truemeds.presentation.activity

import android.content.Context
import android.content.Intent
import android.content.res.Resources
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.text.style.RelativeSizeSpan
import android.text.style.StyleSpan
import androidx.core.os.bundleOf
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.intellihealth.salt.callbacks.BackArrowClickCallback
import com.intellihealth.salt.callbacks.CartIconClickCallback
import com.intellihealth.salt.callbacks.SearchBarCallback
import com.intellihealth.salt.constants.CustomTypefaceSpan
import com.intellihealth.salt.models.MobileSectionHeadersModel
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.mixpanel.MxLoginPageViewed
import com.intellihealth.truemeds.data.model.subs.SubsMedModel
import com.intellihealth.truemeds.data.model.subs.SubsModel
import com.intellihealth.truemeds.databinding.ActivitySubstitutesBinding
import com.intellihealth.truemeds.domain.navigation.navigateToCartActivity
import com.intellihealth.truemeds.domain.navigation.navigateToOrderSummaryActivity
import com.intellihealth.truemeds.domain.navigation.navigateToPrescriptionActivity
import com.intellihealth.truemeds.domain.navigation.navigateToSearchSuggestionActivity
import com.intellihealth.truemeds.mvvm.data.appsflyer.AFLoginPageViewed
import com.intellihealth.truemeds.presentation.adapter.SubsItemAdapter
import com.intellihealth.truemeds.presentation.adapter.SubsMedAdapter
import com.intellihealth.truemeds.presentation.bottomsheet.login.LoginBottomSheet
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.utils.viewBinding
import com.intellihealth.truemeds.presentation.viewmodel.SubstitutePageViewModel
import com.intellihealth.truemeds.presentation.viewmodel.events.EventObserver
import com.truecaller.android.sdk.oAuth.TcSdk
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


@AndroidEntryPoint
class SubstitutesActivity : BaseActivityWithLogin() {
    private lateinit var context: Context
    private val binding by viewBinding(ActivitySubstitutesBinding::inflate)
    private var subsList = ArrayList<SubsModel>()
    private var subsMedList = ArrayList<SubsMedModel>()
    private val viewModel by lazy { ViewModelProvider(this)[SubstitutePageViewModel::class.java] }
    private lateinit var bottomSheet : LoginBottomSheet
    override fun sendLoginPageViewedEvent() {
        val mxLoginPageViewed = MxLoginPageViewed(
            login_clicked_on_page,
            "main",
            viewModel.isTruecaller
        )
        val afLoginPageViewed = AFLoginPageViewed(viewModel.isTruecaller)
        viewModel.loginPageViewedEvent(mxLoginPageViewed, afLoginPageViewed)
    }

    override fun setIsTruecaller(isTruecaller: Boolean) {
        viewModel.isTruecaller = isTruecaller
    }

    override fun getTrueCallerUserDetails() {
        viewModel.currentPageNameForSignup = "homepage"
        viewModel.getTrueCallerUserDetails(
            textAuthorizationCode = "authorization_code",
            clientId = resources.getString(R.string.truecaller_client_id),
            authorizationCode,
            codeVerifier,
            context
        )
    }

    override fun openLoginBottomSheet() {
        bottomSheet = LoginBottomSheet("substitute_page", pageSection)
        bottomSheet.isCancelable = false
        if (!bottomSheet.isVisible)
            bottomSheet.show(supportFragmentManager, "LocationBottomSheet")
    }

    override fun closeLoginBottomSheet() {
        if (this::bottomSheet.isInitialized && bottomSheet.isVisible) {
            bottomSheet.dismiss()
        }
    }
    override fun extractIntentData(){

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        context = this

        binding.rvSubsList.adapter = SubsItemAdapter(getSubList())
        binding.rvMedList.adapter = SubsMedAdapter(getSubMedList())

        updateStatusBarColor()
        getSpanableString()
        getsafeSpanable()
        getMedTitle()
        getSaveTitle()
        gettvPlace()

        val header = MobileSectionHeadersModel(
            headerText = getString(R.string.substitutes),
            cartCount = 0,
            buttonText = null,
            subHeaderText = null,
            subHeaderTextTwo = null,
        )
        binding.msHeader.setUpMobileSectionHeadersData(header)
//        handleBottomCartVisibility(pdpHeaderData)
        clickListner()
        setListener()

        setDataObserver()
    }

    private fun setDataObserver() {

        viewModel.eventInitiateLogin.observe(
            this,
            EventObserver { initializationTrueCallerOAuth() })

        viewModel.eventOpenOrderSummaryActivity.observe(this,
            EventObserver {
                navigateToOrderSummaryActivity(
                    params = bundleOf(
                        BundleConstants.BUNDLE_KEY_ORDER_ID to SharedPrefManager.getInstance().incompleteOrderId.toString(),
                        BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "search_result",
                        BundleConstants.BUNDLE_KEY_PAGE_SECTION to "view_cart"
                    ),
                    flags= listOf(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                )
            })

        viewModel.eventOpenPrescriptionActivity.observe(this,
            EventObserver {
                navigateToPrescriptionActivity(
                    params = bundleOf(
                        BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "homepage",
                        BundleConstants.BUNDLE_KEY_PAGE_SECTION to "main"
                    ),
                    isFlagAdded = true
                )
            })

        //event to launch CartActivity
        viewModel.eventOpenCartActivity.observe(this,
            EventObserver {
                navigateToCartActivity(
                    params = bundleOf(
                        BundleConstants.BUNDLE_KEY_ORDER_ID to SharedPrefManager.getInstance().incompleteOrderId.toString(),
                        BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "search_result",
                        BundleConstants.BUNDLE_KEY_PAGE_SECTION to "view_cart"
                    ),
                    flags= listOf(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                )
            })


        viewModel.cartModel.observe(this) {
            lifecycleScope.launch(Dispatchers.IO) { viewModel.setCartCount() }
            binding.msHeader.updateHeaderChipCount((it?.count ?: 0))
        }

        //event to finish activity
        viewModel.eventFinishActivity.observe(this,
            EventObserver {
                finish()
            })

        //event to launch OrderSummaryActivity
        viewModel.eventOpenOrderSummaryActivity.observe(this,
            EventObserver {
                navigateToOrderSummaryActivity(
                    params = bundleOf(
                        BundleConstants.BUNDLE_KEY_ORDER_ID to SharedPrefManager.getInstance().incompleteOrderId.toString(),
                        BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "search_result",
                        BundleConstants.BUNDLE_KEY_PAGE_SECTION to "view_cart"
                    ),
                    flags= listOf(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                )
            })
    }

    private fun setListener() {
        val searchCallback = object : SearchBarCallback {
            override fun onClearClick() {
                TODO("Not yet implemented")
            }

            override fun onIconClick() {
                /*startActivity(
                    Intent(
                        this@SubstitutesActivity,
                        SearchSuggestionActivity::class.java
                    ).putExtra(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE, "substitute_information_page")
                        .putExtra(BundleConstants.BUNDLE_KEY_PAGE_SECTION, "search_bar")
                            .addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                )*/

                navigateToSearchSuggestionActivity(
                    params = bundleOf(
                        BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "substitute_information_page",
                        BundleConstants.BUNDLE_KEY_PAGE_SECTION to "search_bar"
                    ),
                    flags= listOf(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                )
            }

            override fun onViewClick() {

            }

        }
        val backArrowClickCallback = object : BackArrowClickCallback {
            override fun onBackArrowClick() {
                finish()
            }
        }
        val cartIconClickCallback = object : CartIconClickCallback {
            override fun onCartIconClick() {
                viewModel.onViewCartClicked("view_cart")
            }

        }

        binding.msHeader.setSearchIconClickCallBack(searchCallback)
        binding.msHeader.setBackArrowClickCallback(backArrowClickCallback)
        binding.msHeader.setCartIconClickCallBack(cartIconClickCallback)

    }

    private fun clickListner() {
        binding.startOrderingNow.setOnClickListener {
           /* startActivity(Intent(applicationContext, SearchSuggestionActivity::class.java).
            putExtra(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE, "substitute_information_page")
                .putExtra(BundleConstants.BUNDLE_KEY_PAGE_SECTION, "start_ordering_now")
                    .addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
            )*/

            navigateToSearchSuggestionActivity(
                params = bundleOf(
                    BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "substitute_information_page",
                    BundleConstants.BUNDLE_KEY_PAGE_SECTION to "start_ordering_now"
                ),
                flags= listOf(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
            )
        }
    }

    private fun gettvPlace() {


        val fontBold = resources.getFont(R.font.plus_jakarta_sans_bold)
        val fontRegular = resources.getFont(R.font.plus_jakarta_sans_regular)
        val stringBuilder = SpannableStringBuilder()
        stringBuilder.append(getString(R.string.the_substitutes_are_upto))

// Set style, typeface, and color for the first part
        stringBuilder.setSpan(
            StyleSpan(Typeface.NORMAL),
            0,
            stringBuilder.length,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        stringBuilder.setSpan(
            CustomTypefaceSpan("", fontRegular),
            0,
            stringBuilder.length,
            Spanned.SPAN_EXCLUSIVE_INCLUSIVE
        )
        stringBuilder.setSpan(
            ForegroundColorSpan(Color.parseColor("#40464D")),
            0,
            stringBuilder.length,
            Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        )

        val start = stringBuilder.length
        stringBuilder.append(getString(R.string._51_cheaper))
        val end = stringBuilder.length
        stringBuilder.append(getString(R.string.than_your_medicines))

// Set style, size, color, and typeface for the second part
        stringBuilder.setSpan(
            StyleSpan(Typeface.BOLD),
            start,
            end,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        stringBuilder.setSpan(
            RelativeSizeSpan(1.0f),
            start,
            end,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        stringBuilder.setSpan(
            ForegroundColorSpan(Color.parseColor("#56A47F")),
            start,
            end,
            Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        stringBuilder.setSpan(
            CustomTypefaceSpan("", fontBold),
            start,
            end,
            Spanned.SPAN_EXCLUSIVE_INCLUSIVE
        )

        binding.tvPlace.text = stringBuilder
    }

    private fun getSaveTitle() {
//        You save more on medicines
        //val fontRegular = resources.getFont(R.font.plus_jakarta_sans_semi_bold)
        val fontSemiBold =
            Typeface.createFromAsset(this.assets, "plus_jakarta_sans_semi_bold.ttf")
        val stringBuilder = SpannableStringBuilder()
        stringBuilder.append(getString(R.string.you))
        val start = stringBuilder.length
        stringBuilder.setSpan(
            StyleSpan(Typeface.NORMAL),
            0,
            stringBuilder.length,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        stringBuilder.setSpan(
            CustomTypefaceSpan("", fontSemiBold),
            0,
            stringBuilder.length,
            Spanned.SPAN_EXCLUSIVE_INCLUSIVE
        )
        stringBuilder.append("save ")
        val end = stringBuilder.length
        stringBuilder.setSpan(
            StyleSpan(Typeface.NORMAL),
            0,
            stringBuilder.length,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        stringBuilder.setSpan(
            CustomTypefaceSpan("", fontSemiBold),
            0,
            stringBuilder.length,
            Spanned.SPAN_EXCLUSIVE_INCLUSIVE
        )
        stringBuilder.setSpan(
            ForegroundColorSpan(Color.parseColor("#178755")),
            start,
            end,
            Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        );

        stringBuilder.append(getString(R.string.more_on_medicines))
        stringBuilder.setSpan(
            StyleSpan(Typeface.NORMAL),
            0,
            stringBuilder.length,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        stringBuilder.setSpan(
            CustomTypefaceSpan("", fontSemiBold),
            0,
            stringBuilder.length,
            Spanned.SPAN_EXCLUSIVE_INCLUSIVE
        )

        binding.tvSaveMore.text = stringBuilder
    }

    private fun getMedTitle() {
//        They are the same as your medicines
        //val fontRegular = resources.getFont(R.font.plus_jakarta_sans_semi_bold)
        val fontSemiBold =
            Typeface.createFromAsset(this.assets, "plus_jakarta_sans_semi_bold.ttf")
        val stringBuilder = SpannableStringBuilder()
        stringBuilder.append("They are the ")
        val start = stringBuilder.length
        stringBuilder.setSpan(
            StyleSpan(Typeface.NORMAL),
            0,
            stringBuilder.length,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        stringBuilder.setSpan(
            CustomTypefaceSpan("", fontSemiBold),
            0,
            stringBuilder.length,
            Spanned.SPAN_EXCLUSIVE_INCLUSIVE
        )
        stringBuilder.append("same ")
        val end = stringBuilder.length
        stringBuilder.setSpan(
            StyleSpan(Typeface.NORMAL),
            0,
            stringBuilder.length,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        stringBuilder.setSpan(
            CustomTypefaceSpan("", fontSemiBold),
            0,
            stringBuilder.length,
            Spanned.SPAN_EXCLUSIVE_INCLUSIVE
        )
        stringBuilder.setSpan(
            ForegroundColorSpan(Color.parseColor("#178755")),
            start,
            end,
            Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        );

        stringBuilder.append(getString(R.string.as_your_medicines))
        stringBuilder.setSpan(
            StyleSpan(Typeface.NORMAL),
            0,
            stringBuilder.length,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        stringBuilder.setSpan(
            CustomTypefaceSpan("", fontSemiBold),
            0,
            stringBuilder.length,
            Spanned.SPAN_EXCLUSIVE_INCLUSIVE
        )

        binding.tvMedTitle.text = stringBuilder
    }

    private fun getsafeSpanable() {
//        Substitutes are safe
        //val fontRegular = resources.getFont(R.font.plus_jakarta_sans_semi_bold)
        val fontSemiBold =
            Typeface.createFromAsset(this.assets, "plus_jakarta_sans_semi_bold.ttf")
        val stringBuilder = SpannableStringBuilder()
        stringBuilder.append(getString(R.string.substitutes_are))
        val start = stringBuilder.length
        stringBuilder.setSpan(
            StyleSpan(Typeface.NORMAL),
            0,
            stringBuilder.length,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        stringBuilder.setSpan(
            CustomTypefaceSpan("", fontSemiBold),
            0,
            stringBuilder.length,
            Spanned.SPAN_EXCLUSIVE_INCLUSIVE
        )

        stringBuilder.append(getString(R.string.safe))
        val end = stringBuilder.length
        stringBuilder.setSpan(
            CustomTypefaceSpan("", fontSemiBold),
            start,
            end,
            Spanned.SPAN_EXCLUSIVE_INCLUSIVE
        )
        stringBuilder.setSpan(
            ForegroundColorSpan(Color.parseColor("#178755")),
            start,
            end,
            Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        );
        binding.tvSubstituteSafe.text = stringBuilder
    }

    private fun getSpanableString() {
        val height = Resources.getSystem().displayMetrics.widthPixels * 0.589
        binding.ivHeaderImage.layoutParams.height = height.toInt()

        /*val fontBold = resources.getFont(R.font.plus_jakarta_sans_bold)
        val fontRegular = resources.getFont(R.font.plus_jakarta_sans_semi_bold)
        val stringBuilder = SpannableStringBuilder()
        stringBuilder.append(getString(R.string.understand_why_substitutes_are_the))
        val start = stringBuilder.length

        stringBuilder.setSpan(
            CustomTypefaceSpan("", fontRegular),
            0,
            stringBuilder.length,
            Spanned.SPAN_EXCLUSIVE_INCLUSIVE
        )
        stringBuilder.setSpan(RelativeSizeSpan(1f), 0, stringBuilder.length, 0)

        stringBuilder.append(getString(R.string.smarter_choice))
        val end = stringBuilder.length
        stringBuilder.setSpan(
            CustomTypefaceSpan("", fontBold),
            start,
            end,
            Spanned.SPAN_EXCLUSIVE_INCLUSIVE
        )
        stringBuilder.setSpan(RelativeSizeSpan(2f), 34, stringBuilder.length, 0)

        binding.tvTitle.text = stringBuilder*/

    }

    private fun getSubList(): ArrayList<SubsModel> {
        subsList.add(
            SubsModel(
                R.drawable.ic_absorption,
                getString(R.string.absorption),
                getString(R.string.happens_when_the_patient_consumes_the_medicine)
            )
        )
        subsList.add(
            SubsModel(
                R.drawable.ic_distribution,
                getString(R.string.distribution),
                getString(R.string.drug_is_distributed_in_the_blood)
            )
        )
        subsList.add(
            SubsModel(
                R.drawable.ic_metabolism,
                getString(R.string.metabolism),
                getString(R.string.body_s_metabolism_reacts_to_the_drug)
            )
        )
        subsList.add(
            SubsModel(
                R.drawable.ic_excretion,
                getString(R.string.excretion),
                getString(R.string.waste_that_is_excreted_from_the_body)
            )
        )
        subsList.add(
            SubsModel(
                R.drawable.ic_mec,
                getString(R.string.mec),
                getString(R.string.minimum_effective_concentration)
            )
        )
        subsList.add(
            SubsModel(
                R.drawable.ic_msc,
                getString(R.string.msc),
                getString(R.string.maximum_safe_concentration)
            )
        )

        return subsList
    }

    private fun getSubMedList(): ArrayList<SubsMedModel> {

        subsMedList.add(
            SubsMedModel(
                R.drawable.ic_med_molecules,
                getString(R.string.these_medicines_have_the_same_molecule_salt_composition)
            )
        )
        subsMedList.add(
            SubsMedModel(
                R.drawable.ic_capsule,
                getString(R.string.they_have_the_same_dosage)
            )
        )
        subsMedList.add(
            SubsMedModel(
                R.drawable.ic_metabolism,
                getString(R.string.they_have_the_same_medicinal_effect)
            )
        )

        return subsMedList
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
}