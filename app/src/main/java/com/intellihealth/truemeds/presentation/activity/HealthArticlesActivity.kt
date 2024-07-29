package com.intellihealth.truemeds.presentation.activity

import android.content.Intent
import android.graphics.Paint
import android.graphics.Typeface
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.Spanned
import android.text.TextPaint
import android.text.style.RelativeSizeSpan
import android.text.style.TypefaceSpan
import android.view.View
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.core.os.bundleOf
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.salt.callbacks.BackArrowClickCallback
import com.intellihealth.salt.callbacks.ButtonClickCallback
import com.intellihealth.salt.callbacks.CloseIconClickCallback
import com.intellihealth.salt.models.MobileSectionHeadersModel
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.utils.HealthArticlesConstants.URL_FILTER_PARAMETERS
import com.intellihealth.truemeds.data.utils.HealthArticlesConstants.URL_PARAMETERS
import com.intellihealth.truemeds.data.utils.HealthArticlesConstants.URL_PARAMETERS_FILTER
import com.intellihealth.truemeds.data.utils.HealthArticlesConstants.USER_AGENT
import com.intellihealth.truemeds.data.utils.PROGRESS
import com.intellihealth.truemeds.data.utils.PopUpType
import com.intellihealth.truemeds.databinding.ActivityHealthArticlesBinding
import com.intellihealth.truemeds.domain.navigation.navigateToHealthArticleDetailActivity
import com.intellihealth.truemeds.presentation.bottomsheet.HealthArticleBottomSheet
import com.intellihealth.truemeds.presentation.callbacks.PopUpDialogCallback
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.utils.CommonFunc
import com.intellihealth.truemeds.presentation.utils.EventObserver
import com.intellihealth.truemeds.presentation.utils.viewBinding
import com.intellihealth.truemeds.presentation.viewmodel.HealthArticlesViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HealthArticlesActivity : BaseActivity() {

    private val binding by viewBinding(ActivityHealthArticlesBinding::inflate)
    private lateinit var healthArticlesViewModel: HealthArticlesViewModel
    private var pageCounter = 0
    private var isFilterApplied = false
    private var selectedCategoryId: String? = null
    private var selectedCategoryName: String? = null
    private var filterCategoryId: String? = null
    private var filterCategory: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.lifecycleOwner = this
        setHeaderData()//MobileSectionTypeConstants.TEXT_WITH_CTA
        healthArticlesViewModel = ViewModelProvider(this)[HealthArticlesViewModel::class.java]
        binding.healthArticlesViewModel = healthArticlesViewModel
        lifecycle.addObserver(healthArticlesViewModel)
        setEventListener()
        updateStatusBarColor()
        extractIntentData()
        pageCounter = 0
        healthArticleBottomSheet?.dismiss()
        healthArticlesViewModel.categoryListModels.clear()
        healthArticlesViewModel.healthArticleList.value = emptyList()
        if (!filterCategoryId.isNullOrEmpty()) {
            isFilterApplied = true
            selectedCategoryId = filterCategoryId
            selectedCategoryName = filterCategory
        }
        healthArticlesViewModel.showProgressBarState.postValue(PROGRESS.LOADING)
        healthArticlesViewModel.getHealthArticlesFilterCategory(USER_AGENT, URL_FILTER_PARAMETERS)

        getArticles()

        healthArticlesViewModel.healthArticleList.observe(this) {
            if (it.isNotEmpty()) {
                if (selectedCategoryName != null) {

                    val fontBold =
                        Typeface.createFromAsset(this.assets, "plus_jakarta_sans_semi_bold.ttf")
                    val fontRegular =
                        Typeface.createFromAsset(this.assets, "plus_jakarta_sans_regular.ttf")
                    val stringBuilder = SpannableStringBuilder()
                    stringBuilder.append("Showing ${it.filterNotNull().size} results for ")
                    stringBuilder.setSpan(
                        CustomTypefaceSpan("", fontRegular),
                        0,
                        stringBuilder.length,
                        Spanned.SPAN_EXCLUSIVE_INCLUSIVE
                    )

                    val start = stringBuilder.length
                    stringBuilder.append(selectedCategoryName)
                    val end = stringBuilder.length
                    stringBuilder.setSpan(
                        RelativeSizeSpan(1.0f),
                        start,
                        end,
                        Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
                    )
                    stringBuilder.setSpan(
                        CustomTypefaceSpan("", fontBold),
                        start,
                        end,
                        Spanned.SPAN_EXCLUSIVE_INCLUSIVE
                    )

                    binding.latestArticleHeading.text = stringBuilder
                }
            }
        }

        binding.rvArticles.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)

                with(healthArticlesViewModel) {
                    if (healthArticleList.value.isNullOrEmpty()) return
                    if (!hasMoreData) return

                }
                val articlesLayoutManager = binding.rvArticles.layoutManager as LinearLayoutManager
                val visibleItemCount: Int = articlesLayoutManager.childCount
                val totalItemCount: Int = articlesLayoutManager.itemCount
                val pastVisibleItems: Int = articlesLayoutManager.findFirstVisibleItemPosition()
                if (pastVisibleItems + visibleItemCount >= totalItemCount) {
                    if (!healthArticlesViewModel.isDataLoading) {
                        healthArticlesViewModel.addLoadingItem()
                        getArticles()
                    }
                }
            }
        })

        healthArticlesViewModel.progressState.observe(this) {
            when (it.state) {
                PROGRESS.LOADING.toString() -> {
                    binding.latestArticleHeading.visibility = View.GONE
                    binding.progressBar.visibility = View.VISIBLE
                    //binding.shimmerViewContainer.visibility = View.VISIBLE
                }

                PROGRESS.DISMISS.toString() -> {
                    binding.latestArticleHeading.visibility = View.VISIBLE
                    binding.progressBar.visibility = View.GONE
                    //binding.shimmerViewContainer.visibility = View.GONE
                }

                else -> {
                    binding.progressBar.visibility = View.GONE
                    //binding.shimmerViewContainer.visibility = View.GONE
                }
            }
        }

        binding.mobileSectionHeadersTextWithCTA.setDrawableEnd(R.drawable.filter_icon)
        binding.mobileSectionHeadersTextWithCTA.setCloseIconClickCallback(object :
            CloseIconClickCallback {
            override fun onCloseIconClick() {

                healthArticleBottomSheet = HealthArticleBottomSheet()
                healthArticleBottomSheet?.let { bs ->
                    bs.isCancelable = true
                    bs.openBottomSheet(true, 60, 6)
                    if (!bs.isVisible)
                        bs.show(
                            supportFragmentManager, "HealthArticleBottomSheet"
                        )
                }
            }

        })
        healthArticlesViewModel.healthArticleData.observe(this) {
            navigateToHealthArticleDetailActivity(
                params = bundleOf(
                    "slug" to it.slug,
                    "categoryChipList" to ArrayList(it.chipTitleList),
                    BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "article_section"
                ),
                flags = listOf(Intent.FLAG_ACTIVITY_SINGLE_TOP or Intent.FLAG_ACTIVITY_CLEAR_TOP)
            )
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
    }

    override fun extractIntentData(){
        intent.extras?.let { bundle ->
            filterCategoryId = bundle.getString("filterCategoryId")
            filterCategory = bundle.getString("filterCategory")
            healthArticlesViewModel.clickedOnPage = bundle.getString(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE).toString()
        }
    }

    private fun getArticles() {
        with(healthArticlesViewModel) {
            isDataLoading = true
            pageCounter++
            if (!isFilterApplied)
                getHealthArticles(USER_AGENT, "$URL_PARAMETERS$pageCounter")
            else {
                if (selectedCategoryId.isNullOrEmpty())
                    getHealthArticles(USER_AGENT, "$URL_PARAMETERS$pageCounter")
                else {
                    getHealthArticles(
                        USER_AGENT,
                        "$URL_PARAMETERS_FILTER&categories=$selectedCategoryId&page=$pageCounter"
                    )
                }
            }

        }


    }

    private var healthArticleBottomSheet: HealthArticleBottomSheet? = null

    private fun setEventListener() {
        binding.mobileSectionHeadersTextWithCTA.setButtonClickCallback(object :
            ButtonClickCallback {
            override fun buttonClick() {
                healthArticleBottomSheet = HealthArticleBottomSheet()
                healthArticleBottomSheet?.let { bs ->
                    bs.isCancelable = true
                    bs.openBottomSheet(true, 60, 6)
                    if (!bs.isVisible)
                        bs.show(
                            supportFragmentManager, "HealthArticleBottomSheet"
                        )
                }
            }

            override fun buttonClickWithParams(buttonType: String) {
            }
        })

        binding.latestArticleHeading.setOnClickListener {
            val healthArticleBottomSheet = HealthArticleBottomSheet()
            healthArticleBottomSheet.isCancelable = true
            healthArticleBottomSheet.openBottomSheet(true, 60, 6)
            if (!healthArticleBottomSheet.isVisible)
                healthArticleBottomSheet.show(
                    supportFragmentManager, "HealthArticleBottomSheet"
                )
        }

        binding.mobileSectionHeadersTextWithCTA.setBackArrowClickCallback(object :
            BackArrowClickCallback {
            override fun onBackArrowClick() {

                overridePendingTransition(0, R.anim.slide_out)
                finish()
            }
        })

        healthArticlesViewModel.eventSelectedCategory.observe(this, EventObserver { categoryData ->
            pageCounter = 0
            healthArticleBottomSheet?.dismiss()
            healthArticlesViewModel.categoryListModels.clear()
            healthArticlesViewModel.healthArticleList.value = emptyList()
            isFilterApplied = true
            selectedCategoryId = categoryData.catID
            selectedCategoryName = categoryData.category
            healthArticlesViewModel.showProgressBarState.postValue(PROGRESS.LOADING)
            getArticles()
        })
    }

    private fun setHeaderData() {
        binding.mobileSectionHeadersTextWithCTA.setUpMobileSectionHeadersData(
            MobileSectionHeadersModel(
                getString(R.string.health_articles), "", "", "", 0,
                buttonIconRight = ContextCompat.getDrawable(
                    this,
                    R.drawable.filter_icon
                )
            )
        )
    }

    override fun onDestroy() {
        super.onDestroy()
        CommonFunc.freeMemory()
    }

    class CustomTypefaceSpan(family: String?, private val newType: Typeface) :
        TypefaceSpan(family) {
        override fun updateDrawState(ds: TextPaint) {
            applyCustomTypeFace(ds, newType)
        }

        override fun updateMeasureState(paint: TextPaint) {
            applyCustomTypeFace(paint, newType)
        }

        companion object {
            private fun applyCustomTypeFace(paint: Paint, tf: Typeface) {
                val oldStyle: Int
                val old = paint.typeface
                oldStyle = old?.style ?: 0
                val fake = oldStyle and tf.style.inv()
                if (fake and Typeface.BOLD != 0) {
                    paint.isFakeBoldText = true
                }
                if (fake and Typeface.ITALIC != 0) {
                    paint.textSkewX = -0.25f
                }
                paint.typeface = tf
            }
        }
    }

}