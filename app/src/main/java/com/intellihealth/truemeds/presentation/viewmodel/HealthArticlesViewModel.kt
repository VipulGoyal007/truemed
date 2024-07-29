package com.intellihealth.truemeds.presentation.viewmodel

import android.text.Html
import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.gson.Gson
import com.intellihealth.salt.models.BlogModel
import com.intellihealth.truemeds.data.model.healtharticles.HealthArticleChipCategoryData
import com.intellihealth.truemeds.data.model.home.ApiCoreResponse
import com.intellihealth.truemeds.data.model.home.BlogSectionDataModel
import com.intellihealth.truemeds.data.model.home.CategoryListModel
import com.intellihealth.truemeds.data.model.mixpanel.MxArticleViewed
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.utils.PROGRESS
import com.intellihealth.truemeds.data.utils.getJsonResponseFromRaw
import com.intellihealth.truemeds.data.utils.strDateTimeToDate
import com.intellihealth.truemeds.domain.usecase.HomePageUseCase
import com.intellihealth.truemeds.domain.usecase.analytics.SdkEventUseCase
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxArticleShared
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxArticlesCategorySectionViewed
import com.intellihealth.truemeds.presentation.model.BlogCardModel
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.Event
import com.intellihealth.truemeds.presentation.utils.HomeSectionConstants
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.Date
import javax.inject.Inject


@HiltViewModel
class HealthArticlesViewModel @Inject constructor(private val homePageUseCase: HomePageUseCase,private val sdkEventUseCase: SdkEventUseCase) :
    ViewModel(), DefaultLifecycleObserver {

    var blogs = arrayListOf<com.intellihealth.salt.models.BlogCardModel>()
    lateinit var blogDataModel: BlogModel
    var healthArticleBlogModel = MutableLiveData<BlogSectionDataModel>()
    val healthArticleList = MutableLiveData<List<BlogCardModel?>>()
    //val getHealthArticleCategoryList: LiveData<List<BlogCardModel?>> = healthArticleList

    private val healthArticleFilterCategoryList = MutableLiveData<List<CategoryListModel>>()
    val getHealthArticleFilterCategoryList: LiveData<List<CategoryListModel>> =
        healthArticleFilterCategoryList

    val showProgressBarState = MutableLiveData<PROGRESS>()
    val progressState: LiveData<PROGRESS> = showProgressBarState

    private val healthArticleDetailsMutableLiveData = MutableLiveData<List<CategoryListModel>>()
    val healthArticleDetailsLiveData: LiveData<List<CategoryListModel>> =
        healthArticleDetailsMutableLiveData

    private val selectedCategory = MutableLiveData<Event<CategoryListModel>>()
    var categoryChipList = mutableListOf<com.intellihealth.salt.models.HealthArticleChipCategoryData>() //ArrayList<com.intellihealth.salt.models.HealthArticleChipCategoryData>()
    val eventSelectedCategory: LiveData<Event<CategoryListModel>> get() = selectedCategory

    private var categoryName = ""
    var categoryNameChipList = ArrayList<com.intellihealth.salt.models.HealthArticleChipCategoryData>()
    var categoryNameChipListSdk = ArrayList<com.intellihealth.salt.models.HealthArticleChipCategoryData>()
    private var sourceUrl = ""
    private var aname = ""
     var clickedOnPage = ""
    var categoryListModels = arrayListOf<BlogCardModel?>()
    var hasMoreData = true
    var isDataLoading = false

    var title = MutableLiveData<String>("")
    var category = MutableLiveData<String?>("")
    var categoryId = MutableLiveData<String?>("")
    var author = MutableLiveData<String>("")

    //var imageUrl:MutableLiveData<String> = MutableLiveData("")
    var date = MutableLiveData<String>("")
    var type = MutableLiveData<String>("")
    var id = MutableLiveData<String>("")
    var description = MutableLiveData<String>("")
    var loaderValue = MutableLiveData(false)
    val showImageUrl = MutableLiveData<String>("")

    //val healthArticleData = MutableLiveData<String>("")
    private val _showInternalServerError = MutableLiveData("")
    val showInternalServerError: LiveData<String> get() = _showInternalServerError
    var healthArticleData = MutableLiveData<BlogCardModel>()
    var healthArticleData2 = MutableLiveData<com.intellihealth.salt.models.BlogCardModel>()
    var isItemClick = MutableLiveData<HealthArticleChipCategoryData>()
    var rendered: String? = null
    var slug: String? = null
    var mxInternalErrorOccurred=MxInternalErrorOccurred()

    fun getHealthArticles(userAgent: String, urlParam: String) {
        viewModelScope.launch(IO) {
            val data = homePageUseCase.getHealthArticlesResult(mxInternalErrorOccurred,userAgent, urlParam)
            if (data?.isSuccessful == false) {
                removeLoadingItemAndPostResult()
                if ((healthArticleList.value?.size ?: 0) == 0) {
                    var errorResponse =
                        Gson().fromJson(data.errorBody()?.string(), ApiCoreResponse::class.java)
                    try {
                        mxInternalErrorOccurred.errorCode = data.code()
                        mxInternalErrorOccurred.errorStatement = errorResponse.message
                        sdkEventUseCase.sendInternalErrorOccurred(mxInternalErrorOccurred)
                        _showInternalServerError.postValue(errorResponse.message)
                    } catch (_: Exception) {
                    }
                    showProgressBarState.postValue(PROGRESS.DISMISS)
                }
            } else {
                //removeLoadingItem()
                //todo move into a usecase
                data?.let {
                    val jsonObject = getJsonResponseFromRaw(data) ?: return@let


                    if (jsonObject.has("array")) {

                        val array = jsonObject.getJSONArray("array")
                        var rend: String? = null
                        var slug: String? = null
                        var author: String? = null
                        var createdOn: String? = null
                        var id: String? = null
                        val date1: Date? = null
                        var wp_id: String? = null
                        var date: Date
                        for (i in 0 until array.length()) {
                            val jsonObject1 = array.getJSONObject(i)
                            if (jsonObject1.has("title")) {
                                val titleObject = jsonObject1.getJSONObject("title")
                                rend = titleObject.getString("rendered")
                                slug = jsonObject1.getString("slug")
                                val createddate = jsonObject1.getString("date")
                                val createdOnN = createddate.substring(0, createddate.length - 9)
                                val date2: Date = strDateTimeToDate(createdOnN)!!
                                val formatter5 = SimpleDateFormat("dd MMM yyyy")
                                createdOn = formatter5.format(date2)
                                id = jsonObject1.getString("id")
                            }
                            if (jsonObject1.has("_embedded")) {
                                val embeddedObjec = jsonObject1.getJSONObject("_embedded")
                                val arrayAuthor = embeddedObjec.getJSONArray("author")
                                val athoritem = arrayAuthor.getJSONObject(0)
                                author = athoritem.getString("name")
                                if (embeddedObjec.has("wp:featuredmedia")) {
                                    val featuremedia =
                                        embeddedObjec.getJSONArray("wp:featuredmedia")
                                    val jsomedia = featuremedia.getJSONObject(0)
                                    sourceUrl = jsomedia.getString("source_url")
                                }
                                if (embeddedObjec.has("wp:term")) {
                                    val jsonArray = embeddedObjec.getJSONArray("wp:term")
                                    val wparray = jsonArray.getJSONArray(0)
                                    val wparray_lent = wparray.length()
                                    categoryNameChipList =
                                        ArrayList<com.intellihealth.salt.models.HealthArticleChipCategoryData>()
                                    for (k in 0 until wparray_lent) {
                                        val wptermobject = wparray.getJSONObject(k)
                                        Log.e("datat", wptermobject.toString())
                                        if (k == 0)
                                            categoryName =
                                                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                                                    Html.fromHtml(
                                                        wptermobject.getString("name"),
                                                        Html.FROM_HTML_MODE_LEGACY
                                                    ).toString()
                                                } else {
                                                    Html.fromHtml(wptermobject.getString("name"))
                                                        .toString()
                                                }
                                        wp_id = wptermobject.getString("id")
                                        val chipTitle =
                                            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                                                Html.fromHtml(
                                                    wptermobject.getString("name"),
                                                    Html.FROM_HTML_MODE_LEGACY
                                                ).toString()
                                            } else {
                                                Html.fromHtml(wptermobject.getString("name"))
                                                    .toString()
                                            }
                                        categoryNameChipList.add(
                                            com.intellihealth.salt.models.HealthArticleChipCategoryData(
                                                wptermobject.getString("id"),
                                                chipTitle
                                            )
                                        )
                                        //todo this is passed from intent
                                        if (aname.equals(wp_id) || aname === "2") {
//                                        tvCateHeadline.setText("Showing $category_name Articles")
                                        }
                                    }
                                }
                                Log.e("data1==>", slug.toString())
                                Log.e("data2==>", rend.toString())
                                categoryListModels.add(
                                    BlogCardModel(
                                        id=wp_id?.toInt(),
                                        date = createdOn ?: "",
                                        chipTitle = categoryName ?: "",
                                        title = rend ?: "",
                                        imgUrl = sourceUrl,
                                        writtenBy = author ?: "",
                                        slug = slug,
                                        chipTitleList = categoryNameChipList
                                    )
                                )
                            }


                        }

                        //categoryListModels.let { healthArticleCategoryList.postValue(it) }
                        removeLoadingItemAndPostResult()

                        if (array.length() == 0) {
                            hasMoreData = false
                        } else showProgressBarState.postValue(PROGRESS.DISMISS)


                    } else {
                        hasMoreData = false
                    }

                    isDataLoading = false
                    showProgressBarState.postValue(PROGRESS.DISMISS)
                }

            }
        }
    }

    fun addLoadingItem() {
        categoryListModels.add(null)
        categoryListModels.let { healthArticleList.postValue(it) }
    }

    private fun removeLoadingItemAndPostResult() {
        if (!categoryListModels.isNullOrEmpty()) {
            categoryListModels = categoryListModels.filterNotNull() as ArrayList<BlogCardModel?>
            healthArticleList.postValue(categoryListModels)
        }
    }

    fun getHealthArticlesFilterCategory(userAgent: String, urlParam: String) {
        viewModelScope.launch(IO) {
            healthArticleFilterCategoryList.postValue(
                homePageUseCase.getHealthArticlesFilterCategoryList(
                    mxInternalErrorOccurred,userAgent,
                    urlParam
                )
            )
        }
    }

    fun getHealthArticlesCategoryDetails(data: CategoryListModel) {
        selectedCategory.postValue(Event(data))
        sendArticlesCategorySectionViewedEventToMixpanel("filter_page",data.category?:"",data.catID?:"")
    }


    /*fun getHealthArticlesDetailsCategory(userAgent: String, urlParam: String) {
        viewModelScope.launch(IO) {
            loadMoreHealthArticles(userAgent, urlParam)
        }
    }*/

    fun getHealthArticleDetail(userAgent: String, urlParam: String, slug: String) {
        loaderValue.postValue(true)

        viewModelScope.launch(IO) {
            val sl = "posts?_embed&order=desc&slug=$slug"
            //val data  = homePageUseCase.getWordpressArticle(userAgent, sl)
            val resDetails = homePageUseCase.getWordpressArticle(mxInternalErrorOccurred,userAgent, sl)
            if (!resDetails.isNullOrEmpty()) {
                if (!resDetails[0].isSuccess) {
                    /*var errorResponse =
                        Gson().fromJson(data.errorBody()?.string(), ApiCoreResponse::class.java)*/
                    _showInternalServerError.postValue(resDetails[0].message)
                } else {
                    resDetails[0].let { response ->
                        if (response.toString().isNullOrEmpty()) {
                            loaderValue.postValue(false)
                        } else {
                            loaderValue.postValue(false)
                            Log.e("data1==>", response.toString())
                            title.postValue(response.title!!)
                            author.postValue(response.author!!)
                            date.postValue(response.date!!)
                            type.postValue(response.type!!)
                            id.postValue(response.id.toString())
                            description.postValue(response.content!!)
                            showImageUrl.postValue(response.url!!)

                            val categoryArr = ArrayList<String>()
                            val categoryIdsArr = ArrayList<String>()

                            for (k in response.categoryNameChipList.indices) {
                                if (response.categoryNameChipList[k].category != null) {
                                    categoryIdsArr.add(response.categoryNameChipList[k].id)
                                    categoryArr.add(response.categoryNameChipList[k].category!!)
                                }
                            }

                            sdkEventUseCase.sendArticleViewedEvent(MxArticleViewed(
                                articleAuthor=response.author,
                                articleDate=response.date,
                                articleId=response.id.toString(),
                                articleTitle=response.title,
                                categories= categoryArr,
                                categoryIds= categoryIdsArr,
                                clickedOnPage=clickedOnPage,
                            ))
                        }
                    }
                }
            }else{
                _showInternalServerError.postValue("Data not found")
            }
        }

    }

    fun healthArticleClick(item: BlogCardModel?) {
        healthArticleData.postValue(item!!)
        Log.e("DATATA==>", item.toString())

    }

    fun healthArticleClick(item: com.intellihealth.salt.models.BlogCardModel?) {
        healthArticleData2.postValue(item!!)
        Log.e("DATATA==>", item.toString())

    }

    fun callHealthArticlesListApi(userAgent: String, urlParam: String) {
        viewModelScope.launch {

            val data = homePageUseCase.getHealthArticlesResult(mxInternalErrorOccurred,userAgent, urlParam)
            Log.e("data_blogsDetails:::==>", "11:::" + data.toString())

            data?.let {
                val jsonObject = getJsonResponseFromRaw(data) ?: return@let


                if (jsonObject.has("array")) {

                    val array = jsonObject.getJSONArray("array")
                    var author: String? = null
                    var createdOn: String? = null
                    var id: String? = null
                    val date1: Date? = null
                    var wp_id: String? = null
                    var date: Date

                    val listSize = if (array.length() >= 5) 5 else array.length()
                    for (i in 0 until listSize) {
                        val jsonObject1 = array.getJSONObject(i)
                        if (jsonObject1.has("title")) {
                            val titleObject = jsonObject1.getJSONObject("title")
                            rendered = titleObject.getString("rendered")
                            slug = jsonObject1.getString("slug")
                            val createddate = jsonObject1.getString("date")
                            val createdOnN = createddate.substring(0, createddate.length - 9)
                            val date2: Date = strDateTimeToDate(createdOnN)!!
                            val formatter5 = SimpleDateFormat("dd MMM yyyy")
                            createdOn = formatter5.format(date2)
                            id = jsonObject1.getString("id")
                        }
                        if (jsonObject1.has("_embedded")) {
                            val embeddedObjec = jsonObject1.getJSONObject("_embedded")
                            val arrayAuthor = embeddedObjec.getJSONArray("author")
                            val athoritem = arrayAuthor.getJSONObject(0)
                            author = athoritem.getString("name")
                            if (embeddedObjec.has("wp:featuredmedia")) {
                                val featuremedia = embeddedObjec.getJSONArray("wp:featuredmedia")
                                val jsomedia = featuremedia.getJSONObject(0)
                                sourceUrl = jsomedia.getString("source_url")
                            }
                            if (embeddedObjec.has("wp:term")) {
                                val jsonArray = embeddedObjec.getJSONArray("wp:term")
                                val wparray = jsonArray.getJSONArray(0)
                                val wparray_lent = wparray.length()
                                categoryChipList = mutableListOf<com.intellihealth.salt.models.HealthArticleChipCategoryData>()
                                
                                for (k in 0 until wparray_lent) {
                                    val wptermobject = wparray.getJSONObject(k)
                                    if (k == 0)
                                        categoryName =
                                            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                                                Html.fromHtml(
                                                    wptermobject.getString("name"),
                                                    Html.FROM_HTML_MODE_LEGACY
                                                ).toString()
                                            } else {
                                                Html.fromHtml(wptermobject.getString("name"))
                                                    .toString()
                                            }
                                    wp_id = wptermobject.getString("id")

                                    categoryChipList.add(
                                        com.intellihealth.salt.models.HealthArticleChipCategoryData(
                                            wptermobject.getString("id"),
                                            wptermobject.getString("name")
                                        )
                                    )
                                    //todo this is passed from intent
                                    if (aname.equals(wp_id) || aname === "2") {
//                                        tvCateHeadline.setText("Showing $category_name Articles")
                                    }
                                }
                            }

                            blogs.add(
                                com.intellihealth.salt.models.BlogCardModel(
                                    date = createdOn ?: "",
                                    chipTitle = categoryName ?: "",
                                    title = rendered ?: "",
                                    imgUrl = sourceUrl,
                                    writtenBy = author ?: "",
                                    slug = slug,
                                    chipList = categoryChipList
                                )
                            )
                        }

                    }

                    Log.e("data_blogsDetails:::==>", blogs.toString())

                    blogDataModel = BlogModel(
                        heading = "Related Articles",
                        description = "Read about health tips and guidance",
                        blogCardModel = blogs,
                        slug
                    )

                    healthArticleBlogModel.postValue(
                        BlogSectionDataModel(
                            id = 9,
                            type = HomeSectionConstants.BLOG_SECTION_CARD,
                            blogModel = blogDataModel
                        )
                    )
                    /*if (!blogs.isNullOrEmpty())
                        showMessageBlogListFragment.postValue(HomeFragmentData(MESSAGES.HEALTHARTICLE_LIST_RESPONSE))
*/
                }
            }


            // showMessageFragment.postValue(HomeFragmentData(MESSAGES.PATIENT_LIST_MEDICINE_LIST_RESPONSE))


        }
    }

    fun sendArticlesCategorySectionViewedEventToMixpanel(page: String, category:String?, id:String) {
        sdkEventUseCase.sendArticlesCategorySectionViewedEvent(
            MxArticlesCategorySectionViewed( if(category.isNullOrEmpty()) null else category, id, if(title.value.isNullOrEmpty()) null else title.value, page, SharedPrefManager.getInstance().selectedWarehouseID))
    }

    fun sendArticlesSharedEventToMixpanel(id: String, title: String) {
        sdkEventUseCase.sendArticleSharedEvent(MxArticleShared(id, title, SharedPrefManager.getInstance().selectedWarehouseID))
    }


}