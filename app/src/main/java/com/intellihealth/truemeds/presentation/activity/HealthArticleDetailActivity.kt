package com.intellihealth.truemeds.presentation.activity

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.text.Html
import android.webkit.WebChromeClient
import android.webkit.WebResourceRequest
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.core.os.bundleOf
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.intellihealth.salt.callbacks.BackArrowClickCallback
import com.intellihealth.salt.models.HealthArticleChipCategoryData
import com.intellihealth.salt.models.MobileSectionHeadersModel
import com.intellihealth.salt.utils.calculateHeight
import com.intellihealth.salt.utils.toPx
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.utils.HealthArticlesConstants
import com.intellihealth.truemeds.data.utils.PopUpType
import com.intellihealth.truemeds.databinding.ActivityHealthArticleDetailBinding
import com.intellihealth.truemeds.domain.enums.ElasticSearchType
import com.intellihealth.truemeds.domain.navigation.navigateToProductDetailActivity
import com.intellihealth.truemeds.domain.navigation.navigateToHealthArticleDetailActivity
import com.intellihealth.truemeds.domain.navigation.navigateToHealthArticlesActivity
import com.intellihealth.truemeds.domain.usecase.analytics.FirebaseEventUseCase
import com.intellihealth.truemeds.presentation.analytics.model.firebase.FbHomePageHealthArticle
import com.intellihealth.truemeds.presentation.callbacks.PopUpDialogCallback
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.utils.CommonFunc
import com.intellihealth.truemeds.presentation.utils.viewBinding
import com.intellihealth.truemeds.presentation.viewmodel.HealthArticlesViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class HealthArticleDetailActivity : BaseActivity() {

    private val binding by viewBinding(ActivityHealthArticleDetailBinding::inflate)
    private lateinit var healthArticlesViewModel: HealthArticlesViewModel
    private var slug = ""
    private var categoryChipList : MutableList<HealthArticleChipCategoryData> = mutableListOf()// ArrayList<com.intellihealth.salt.models.HealthArticleChipCategoryData>()
    private var mLastClickTime = 0L
    private val minDelayMs: Long = 500L
    @Inject
    lateinit var firebaseEventUseCase: FirebaseEventUseCase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        healthArticlesViewModel = ViewModelProvider(this)[HealthArticlesViewModel::class.java]
        binding.healthArticlesViewModel = healthArticlesViewModel
        binding.lifecycleOwner = this
        lifecycle.addObserver(healthArticlesViewModel)

        updateStatusBarColor()
        extractIntentData()

        // Check if the intent is not null
        healthArticlesViewModel.categoryChipList = categoryChipList

        firebaseEventUseCase.homePageHealthArticle(
            FbHomePageHealthArticle(
                mobile = SharedPrefManager.getInstance().loggedInUserMobile,
                customerId = SharedPrefManager.getInstance().loggedInUserId,
                categoryId = slug

            )
        )


        binding.healthArticleHeader.setUpMobileSectionHeadersData(
            MobileSectionHeadersModel(
                getString(R.string.health_articles), "", "",
                "", 0
            )
        )

        binding.healthArticleHeader.setBackArrowClickCallback(object : BackArrowClickCallback {
            override fun onBackArrowClick() {
                finish()
            }
        })
        healthArticlesViewModel.isItemClick.observe(this) {
            navigateToHealthArticlesActivity(
                params = bundleOf(
                    "filterCategoryId" to it.id,
                    "filterCategory" to it.category
                )
            )
        }

        healthArticlesViewModel.getHealthArticleDetail(
            HealthArticlesConstants.USER_AGENT,
            HealthArticlesConstants.URL_PARAMETERS, slug
        )
        healthArticlesViewModel.showImageUrl.observe(this) {
            val paddingStartEnd = (16 * 2).toPx
            val ivWidth = resources.displayMetrics.widthPixels - paddingStartEnd
            val ivHeight = calculateHeight(ivWidth, 55f)
            binding.imgCover.layoutParams.height = ivHeight
            Glide.with(this).load(it).into(binding.imgCover)
        }
        loadWebView()
        binding.imgShare.setOnClickListener {
            if (isSingleClick()) {
                btnShare()
            }
        }

        healthArticlesViewModel.callHealthArticlesListApi(
            HealthArticlesConstants.USER_AGENT,
            "${HealthArticlesConstants.URL_PARAMETERS}1"
        )


        healthArticlesViewModel.healthArticleData.observe(this) {
            navigateToHealthArticleDetailActivity(
                params = bundleOf(
                    "categoryChipList" to java.util.ArrayList(it.chipTitleList),
                    "slug" to it.slug
                )
            )
            finish()
        }

        healthArticlesViewModel.showInternalServerError.observe(this) { message ->
            if (message.isNotEmpty()) {
                showDialogBox(PopUpType.API_FAILURE, object : PopUpDialogCallback {
                    override fun onActionButtonClicked() {
                        finish()
                    }

                    override fun onCloseButtonClicked() {
                        finish()
                    }
                }, false, "Internal Server Error", message)
            }
        }

        healthArticlesViewModel.healthArticleData2.observe(this){
            navigateToHealthArticleDetailActivity(
                params = bundleOf(
                    "categoryChipList" to ArrayList(it.chipList),
                    "slug" to it.slug,
                    BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "related_articles"
                )
            )
            finish()
        }

    }

    override fun extractIntentData() {
        intent.extras?.let { bundle ->
            slug = bundle.getString("slug").toString()
            if (bundle.containsKey("categoryChipList")) {
                if (bundle.containsKey("categoryChipList")) {
                    val chipList: List<HealthArticleChipCategoryData>? =
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                            @Suppress("UNCHECKED_CAST")
                            bundle.getSerializable(
                                "categoryChipList",
                                ArrayList::class.java
                            ) as? ArrayList<HealthArticleChipCategoryData>
                        } else {
                            @Suppress("DEPRECATION")
                            bundle.getSerializable("categoryChipList") as? ArrayList<HealthArticleChipCategoryData>
                        }
                    categoryChipList = chipList?.toMutableList() ?: mutableListOf()
                }
            }
            healthArticlesViewModel.clickedOnPage = bundle.getString(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE).toString()
        }
    }

    @SuppressLint("SetJavaScriptEnabled")
    private fun loadWebView() {
        //binding.wvContainer.setInitialScale(1)
        val settings: WebSettings = binding.wvContainer.settings
        settings.defaultTextEncodingName = "utf-8"
        settings.domStorageEnabled = true
        settings.javaScriptEnabled = true
        settings.useWideViewPort = true
        settings.setSupportZoom(true)
        settings.builtInZoomControls = true
        settings.displayZoomControls = false
        settings.cacheMode = WebSettings.LOAD_NO_CACHE
        settings.userAgentString = "Android"//HealthArticlesConstants.USER_AGENT
        // Disable horizontal scrolling
        binding.wvContainer.isHorizontalScrollBarEnabled = false
        val maxWidth2 = resources.displayMetrics.widthPixels

        healthArticlesViewModel.description.observe(this) {
            val htmlContent =
                "<html><head><meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\"><style>@font-face { font-family: 'CustomFont'; src: url('font/CustomFont.ttf'); } #font { font-family: 'plus_jakarta_sans_regular'; } body { max-width: resources.displayMetrics.widthPixels" +
                        "; overflow-x: hidden; }img { max-width: 80%; height: auto; }</style></head><body>$it</body></html>"

            //"<html><head><style>@font-face { font-family: 'CustomFont'; src: url('font/CustomFont.ttf'); } #font { font-family: 'plus_jakarta_sans_regular'; }</style></head><body>$it</body></html>"
            binding.wvContainer.loadDataWithBaseURL(null, htmlContent, "text/html", "UTF-8", null)

        }

        binding.wvContainer.setInitialScale(maxWidth2)

        binding.wvContainer.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(
                view: WebView?,
                request: WebResourceRequest?
            ): Boolean {
                val uri: Uri = request?.url!!
                handleUri(uri)
                return true
            }
        }

        binding.wvContainer.webChromeClient = WebChromeClient()
    }

    private fun handleUri(uri: Uri) {
        val host = uri.host
        val pathSegments = uri.pathSegments

        if (host != null && host.contains("truemeds.in") && !pathSegments.isNullOrEmpty() && pathSegments.first() == "otc" || !pathSegments.isNullOrEmpty() && pathSegments.first() == "medicine") {
            val lastSegment = pathSegments.lastOrNull()
            if (lastSegment != null && lastSegment.contains("tm-")) {
                //val productCode = lastSegment.substringAfter("tm-")
                if (lastSegment.lastIndexOf("tm-") > -1) {
                    val productCode = lastSegment.substring(lastSegment.lastIndexOf("tm-"))
                    //open product detail screen
                   /* val myIntent = Intent(this, ProductDetailActivity::class.java)
                    myIntent.putExtra(BundleConstants.IS_SUBS, true)
                    myIntent.putExtra(
                        BundleConstants.PRODUCT_CODE,
                        productCode
                    )
                    startActivity(myIntent)*/

                    navigateToProductDetailActivity(
                        params = bundleOf(
                            BundleConstants.IS_SUBS to true,
                            BundleConstants.PRODUCT_CODE to productCode
                        )
                    )


                }
            }
        } else {
            // open web page in a Browser
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
    }


    private fun btnShare() {
        val sp = Html.fromHtml(healthArticlesViewModel.description.value)
        var Body: String = sp.toString()
        if (Body.length > 250) {
            Body = Body.substring(0, 250) + "..."
        }
        val truemedsDownloadUrl = "http://bit.ly/TruemedsDL"
        Body = healthArticlesViewModel.author.value
            .toString() + " Says...\n" + Body + "\n\nRead more at Truemeds App:\n" + truemedsDownloadUrl
        val sharingIntent = Intent(Intent.ACTION_SEND)
        sharingIntent.setType("text/plain")
        val shareBody = Body
        val shareSub = ""
        sharingIntent.putExtra(Intent.EXTRA_SUBJECT, shareSub)
        sharingIntent.putExtra(Intent.EXTRA_TEXT, shareBody)
        startActivity(Intent.createChooser(sharingIntent, "Share with..."))
         try {

             healthArticlesViewModel.sendArticlesSharedEventToMixpanel(
                 healthArticlesViewModel.id.value.toString(),healthArticlesViewModel.title.value.toString(),
             )

         } catch (e: Exception) {
             e.printStackTrace()
         }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }

    private fun isSingleClick(): Boolean {
        val lastClickTime: Long = mLastClickTime
        val now = System.currentTimeMillis()
        this.mLastClickTime = now
        return now - lastClickTime >= minDelayMs
    }

    override fun onDestroy() {
        super.onDestroy()
        CommonFunc.freeMemory()
    }
}