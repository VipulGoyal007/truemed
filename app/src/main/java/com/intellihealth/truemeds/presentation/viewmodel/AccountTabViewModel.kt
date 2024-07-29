package com.intellihealth.truemeds.presentation.viewmodel

import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.intellihealth.truemeds.data.model.bottomnav.AccountTabModel
import com.intellihealth.truemeds.data.repository.datasource.local.entity.CustomerDetails

import com.intellihealth.truemeds.domain.usecase.HomePageUseCase
import com.intellihealth.truemeds.domain.usecase.LocalDbUseCase
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.viewmodel.events.Event
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AccountTabViewModel @Inject constructor(
    private val homePageUseCase: HomePageUseCase,
    //private val localDbUseCase: LocalDbUseCase
) :
    BaseViewModel(), DefaultLifecycleObserver {

    /*var userNavMenuList: MutableLiveData<List<AccountTabModel>> =
        MutableLiveData<List<AccountTabModel>>(Collections.emptyList())*/


    var userNavMenuList = MutableLiveData<List<AccountTabModel>>(emptyList())
//    var customerName = MutableLiveData("")
//    var customerEmail = MutableLiveData("")
//    var customerMobile = MutableLiveData("")
//    var userSaved = MutableLiveData("")
//    var anyOrderTab = MutableLiveData(false)
//    lateinit var customerDetail: CustomerDetails
    private val openAccountTabItem =
        MutableLiveData<Event<Pair<String, Int>>>()
    val eventOpenAccountTabItem: LiveData<Event<Pair<String, Int>>> get() = openAccountTabItem
    val tmWalletData = MutableLiveData("")

/*
    fun getUserData() {
        viewModelScope.launch(Dispatchers.IO) {
            if (SharedPrefManager.getInstance().loggedInUserMobile.isNotEmpty()) {
                localDbUseCase.getCustomerDetails(SharedPrefManager.getInstance().loggedInUserMobile)
                    ?.let {
                        customerDetail = it
                        if (::customerDetail.isInitialized) {
                            if (customerDetail.customerName != null) {
                                customerName.postValue(customerDetail.customerName)
                            }
                            if (customerDetail.emailAddress != null) {
                                customerEmail.postValue(customerDetail.emailAddress)
                            }
                            if (customerDetail.mobileNo != null) {
                                customerMobile.postValue(customerDetail.mobileNo)
                            }

                        }
                    }

                if (!SharedPrefManager.getInstance().totalSavingTillDate.isNullOrEmpty() && SharedPrefManager.getInstance().totalSavingTillDate.toDouble() > 0.0) {
                    anyOrderTab.postValue(true)
                    userSaved.postValue("You have saved " + SharedPrefManager.getInstance().totalSavingTillDate)
                }
            }
        }
    }
*/

    fun createNavMenuList() {

        userNavMenuList.postValue(homePageUseCase.getAccountTabMenus())
    }

    fun openAccountTabItem(item: String, position: Int) {
        openAccountTabItem.value = Event(Pair(item, position))
    }

    fun clearCustomerData() {
        viewModelScope.launch(Dispatchers.IO) {
            homePageUseCase.logout()
        }
    }

    fun logoutEvent() {
        sdkEventUseCase.sendLogOutEvent(SharedPrefManager.getInstance().loggedInUserId.toInt())
    }
    fun eventArticleSectionViewedEvent(clickedOnPage:String){
        sdkEventUseCase.sendArticleSectionViewedEvent(clickedOnPage)
    }
}