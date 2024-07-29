package com.intellihealth.truemeds.presentation.viewmodel

import android.content.Context
import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.intellihealth.truemeds.data.model.helpfaqtnc.HelpCategoryResponse
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.utils.ERRORS
import com.intellihealth.truemeds.data.utils.MESSAGES
import com.intellihealth.truemeds.data.utils.isNetworkAvailable
import com.intellihealth.truemeds.domain.usecase.HelpFaqTncUseCase
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.viewmodel.events.Event
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HelpViewModel @Inject constructor(private val helpFaqTncUseCase: HelpFaqTncUseCase) :
    ViewModel(),
    DefaultLifecycleObserver {

    var selectedCategory: HelpCategoryResponse.CategoryList? = null

    //help activity
    private val showError = MutableLiveData<Event<ERRORS>>()
    val eventShowError: LiveData<Event<ERRORS>> get() = showError

    val helpList: MutableLiveData<MutableList<HelpCategoryResponse.CategoryList>> = MutableLiveData(
        mutableListOf()
    )
    var helpListOriginal: List<HelpCategoryResponse.CategoryList> = listOf()
    var filteredlist: MutableList<HelpCategoryResponse.CategoryList> = mutableListOf()
    var showHelpListView = MutableLiveData(false)
    var showShimmer = MutableLiveData(true)
    val showShimmerLiveData: LiveData<Boolean> get() = showShimmer

    private val showMessage = MutableLiveData<Event<MESSAGES>>()
    val eventMessage: LiveData<Event<MESSAGES>> get() = showMessage
    var itemClickedPosition: Int = -1
    var helpContactNo: String = SharedPrefManager.getInstance().customerCareNumber
    var helpEmailAddress: String = SharedPrefManager.getInstance().supportEmailId

    //help sub category activity
    var helpListApiResponse: MutableList<HelpCategoryResponse.CategoryList?> = mutableListOf()
    var categoryId: String = ""
    //private lateinit var context: Context
    var apiType: Int = 0
    var mxInternalErrorOccurred= MxInternalErrorOccurred()

    //help sub category detail activity


    fun contactCustomerSupportClick() {

        showMessage.postValue(Event(MESSAGES.CONTACT_CUSTOMER_SUPPORT_CLICK))
    }


    fun helpListItemClick(position: Int) {
        itemClickedPosition = position
        showMessage.postValue(Event(MESSAGES.HELP_ITEM_CLICK))
    }


    fun getAllHelpCategory(mContext: Context) {
        //mContext = mContext
        apiType = 1
        if (isNetworkAvailable(mContext)) {
            viewModelScope.launch {
                val response = helpFaqTncUseCase.getAllHelpCategory(mxInternalErrorOccurred)

                response?.responseData?.let { helpCategoryList ->
                    helpCategoryList.forEach {
                        it?.run {
                            helpList.value!!.add(it)
                            /*HelpCategoriesItemModel(
                                categoryName!!,
                                description ?: "",
                                categoryId.toString(),
                                icon ?: ""
                            )*/
                        }
                    }


                    helpListOriginal = helpList.value!!
                    filteredlist.addAll(helpList.value!!)
                    when {
                        !helpList.value.isNullOrEmpty() -> {
                            showShimmer.value = false
                            showHelpListView.value = true

                        }

                        else -> {
                            showShimmer.value = false
                            showHelpListView.value = false
                            // showError.postValue(Event(ERRORS.NO_HELP_CATEGORY_FOUND))
                        }
                    }
                }
            }
        } else
            showMessage.postValue(
                Event(
                    MESSAGES.NO_NETWORK
                )
            )
    }

    fun performFilterOperation(text: String) {
        filteredlist.clear()

        for (item in helpListOriginal) {
            if (text.isNotEmpty()) {
                if (!item.helpCategoryDetailsDTOs.isNullOrEmpty()) {
                    for (subCategory in item.helpCategoryDetailsDTOs) {
                        if (subCategory?.issues!!.lowercase().contains(text.lowercase())) {
                            val filterObj = HelpCategoryResponse.CategoryList(
                                item.categoryId,
                                item.categoryName,
                                item.description,
                                item.icon,
                                subCategory.answers,
                                null,
                                subCategory.issues,
                                subCategory.issuesId,
                                true
                            )
                            filteredlist.add(filterObj)
                        }
                    }
                }
            } else {
                filteredlist.add(item)
            }
        }
        helpList.postValue(filteredlist)
    }

    //help sub category activity
    fun helpSubCategoryListItemClick(position: Int) {

        itemClickedPosition = position

        showMessage.postValue(Event(MESSAGES.HELP_SUB_ITEM_CLICK))

    }

    fun helpSubCategoryListItemClick(category: HelpCategoryResponse.CategoryList) {
        selectedCategory = category
        showMessage.postValue(Event(MESSAGES.HELP_SUB_ITEM_CLICK_HELP_PAGE))

    }

    fun subCategoryApiCalling(mContext: Context) {
        //context = mContext
        apiType = 2
        if (isNetworkAvailable(mContext)) {
            viewModelScope.launch {
                val response = helpFaqTncUseCase.getAllHelpSubCategory(mxInternalErrorOccurred, categoryId)
                response?.responseData?.let { helpCategoryList ->
                    helpListApiResponse.addAll(helpCategoryList)
                    when {
                        !helpListApiResponse.isNullOrEmpty() -> {
                            Log.e("helpsub_list::", "success_response")
                            showShimmer.value = false
                            showHelpListView.value = true

                        }

                        else -> {
                            Log.e("helpsub_list::", "failure_response")
                            showShimmer.value = false
                            showHelpListView.value = false
                            showError.postValue(Event(ERRORS.NO_HELP_CATEGORY_FOUND))
                        }
                    }
                }
            }
        } else
            showMessage.postValue(
                Event(
                    MESSAGES.NO_NETWORK
                )
            )
    }

}