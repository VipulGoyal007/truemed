package com.intellihealth.truemeds.presentation.viewmodel

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.intellihealth.salt.models.AddressPatientDetailsCardModel
import com.intellihealth.salt.models.DropDownDefaultModel
import com.intellihealth.salt.models.OrderStatusCardModel
import com.intellihealth.truemeds.data.model.ChipSelectionModel
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.model.mixpanel.MxReminderBottomSheetViewed
import com.intellihealth.truemeds.data.model.mixpanel.MxReminderDeleted
import com.intellihealth.truemeds.data.model.mixpanel.MxReminderSuccessfullySet
import com.intellihealth.truemeds.data.model.mixpanel.MxReminderUpdate
import com.intellihealth.truemeds.data.model.orderreminder.GetReminderResponse
import com.intellihealth.truemeds.data.model.orderreminder.ReminderRequestModel
import com.intellihealth.truemeds.data.model.reminder.FrequencyListModel
import com.intellihealth.truemeds.data.model.reminder.ReminderListModel
import com.intellihealth.truemeds.data.utils.MESSAGES
import com.intellihealth.truemeds.data.utils.isNetworkAvailable
import com.intellihealth.truemeds.domain.usecase.ReminderUseCase
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.viewmodel.events.Event
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.Locale
import java.util.TimeZone
import javax.inject.Inject

@HiltViewModel
class ReminderViewModel @Inject constructor(
    private val reminderUseCase: ReminderUseCase,
    @SuppressLint("StaticFieldLeak") @ApplicationContext private val context: Context
) :
    BaseViewModel() {


    var reminderAdapterList = MutableLiveData<List<ReminderListModel.ReminderList>>(emptyList())
    var showReminderPatientList = MutableLiveData<Boolean>(false)
    var patientName = MutableLiveData<List<DropDownDefaultModel>>(emptyList())
    var patientNameList = MutableLiveData<Event<List<DropDownDefaultModel>>>()
    var reminderFrequencyListData =
        MutableLiveData<List<FrequencyListModel.FrequencyList>>(emptyList())
    var orderProcess = MutableLiveData<OrderStatusCardModel>()
    val showMessage = MutableLiveData<Event<MESSAGES>>()
    val eventMessage: LiveData<Event<MESSAGES>> get() = showMessage
    private val deleteReminder = MutableLiveData<Event<Long>>()

    val specialShatabdiToDismissPopup = MutableLiveData<Boolean>(false)
    val deleteReminderForOrderStatus = MutableLiveData<Boolean>(false)
    val  closeAddReminder = MutableLiveData<Boolean>(false)
    val eventSpecialShatabdiToDismissPopup: LiveData<Boolean> get() = specialShatabdiToDismissPopup
    val eventDeleteReminder: LiveData<Event<Long>> get() = deleteReminder

    private val editReminder = MutableLiveData<Event<Any>>()
    private val defaultNameDropDown = MutableLiveData<Event<Boolean>>()
    val eventDefaultNameDropDown: LiveData<Event<Boolean>> get() = defaultNameDropDown
    private val requestModel = MutableLiveData<ReminderRequestModel>()
    val editReminderId = MutableLiveData<Long>()
    val eventEditReminder: LiveData<Event<Any>> get() = editReminder


    val reminderFrequency = MutableLiveData<Int>(0)
    var reminderdate = MutableLiveData<String>("")
    var chipsAdapterPosition = MutableLiveData<Int>(0)
    var listPositionForDelete = MutableLiveData<Int>(0)
    var editReminderDateValue: String = ""
    var editReminderDateValueInMs: Long = 0L
    var editReminderNameValue = MutableLiveData<String>("")
    var alertReminderNameValue = MutableLiveData<String>("")
    var editReminderFrequency = MutableLiveData<Int>(0)
    var editReminderPatientId = MutableLiveData<Long>(0L)
    var editReminderOrderId = MutableLiveData<Int>(0)
    var addPatientId = MutableLiveData<Int>(0)
    var addReminderFromOrderStatusActivity = MutableLiveData<Boolean>()
    var addReminderTitle = MutableLiveData("")
    var previousReminderFrequency = 0
    var previousReminderDateValue: String = ""
    private val _isLoading = MutableLiveData(false)
    val isLoading: LiveData<Boolean> get() = _isLoading

    private var chipData = MutableLiveData<List<ChipSelectionModel>>(emptyList())
    var mxInternalErrorOccurred=MxInternalErrorOccurred()

    var currentPage = ""
    
    var mxReminderSuccessfullySet: MxReminderSuccessfullySet = MxReminderSuccessfullySet()
    
    
    fun getReminderList() {
//        TODO need to check patient id
        if (isNetworkAvailable(context)) {
            _isLoading.postValue(true)
            viewModelScope.launch(IO) {
                val reminderList: ArrayList<ReminderListModel.ReminderList> = arrayListOf()
                val response = reminderUseCase.getReminderData(
                    mxInternalErrorOccurred,SharedPrefManager.getInstance().loggedInUserId,
                    null
                )
                if (response != null) {
                    _isLoading.postValue(false)
                    val list: List<GetReminderResponse.ResponseData> = response.responseData
                    if (!list.isNullOrEmpty()) {
                        list.forEach {
                            reminderList.add(it.toReminderListModel())
                        }
                            reminderAdapterList.postValue(reminderList)
                            showReminderPatientList.postValue(true)

                    } else {
                        showReminderPatientList.postValue(false)
                    }
                }else {
                    _isLoading.postValue(false)
                }
            }
        }else{
            showMessage.postValue(Event(MESSAGES.NO_NETWORK))
        }
    }

    fun setReminder() {
        viewModelScope.launch(IO) {
            val requestModel = ReminderRequestModel(
                SharedPrefManager.getInstance().loggedInUserId.toLong(),
                editReminderPatientId.value!!,
                editReminderDateValue,
                editReminderFrequency.value!!,
                false
            )
            Log.e("DATATA==>",requestModel.toString())
            val response = reminderUseCase.setReminder(
                mxInternalErrorOccurred,requestModel
            )
            if (response!=null){
                showMessage.postValue(Event(MESSAGES.SET_REMINDER_SUCCESSFULLY))
//                mxReminderSuccessfullySet.reminderFrequency = editReminderFrequency.value!!.toDouble()
//                sendReminderSuccessfullySetEvent(mxReminderSuccessfullySet)

            }else{
                showMessage.postValue(Event(MESSAGES.SET_REMINDER_FAILED))
            }

        }

    }
    fun addReminder(mxReminderSuccessfullySet: MxReminderSuccessfullySet) {
        viewModelScope.launch(IO) {
        //val dateFormat = SimpleDateFormat("dd-MM-yyyy", Locale.getDefault())
        //val currentDate= dateFormat.format(Calendar.getInstance().time)
        val data = ReminderRequestModel(
            SharedPrefManager.getInstance().loggedInUserId.toLong(),
            addPatientId.value?.toLong()!!,
            editReminderDateValue!!,
            frequency = reminderFrequency.value?.toInt() ?: 0,
            false
        )
            val response = reminderUseCase.setReminder(
                mxInternalErrorOccurred,data
            )
            Log.i("setRemindertarun",""+response?.responseData?.reminderId)
            if (response!=null){
                editReminderId.postValue(response.responseData.reminderId)
                showMessage.postValue(Event(MESSAGES.SET_REMINDER_SUCCESSFULLY))
                sendReminderSuccessfullySetEvent(mxReminderSuccessfullySet)
                specialShatabdiToDismissPopup.postValue(false)
            }else{
                showMessage.postValue(Event(MESSAGES.SET_REMINDER_FAILED))
            }

        }

    }

    fun getPatientNameList() {
        viewModelScope.launch(IO) {
            val nameList : ArrayList<DropDownDefaultModel> = reminderUseCase.getPatientNameData(mxInternalErrorOccurred,true,
                SharedPrefManager.getInstance().loggedInUserId.toLong())
            //reminderAdapterList.value.isNullOrEmpty()
            val result: List<DropDownDefaultModel> = nameList.filter { nameModel ->
                reminderAdapterList.value!!.none { remidnerListModel ->
                    remidnerListModel.patientId == nameModel.id
                }
            }
            patientNameList.postValue(Event(result))
            patientName.postValue(result)
            if (patientName.value != null){
                defaultNameDropDown.postValue(Event(true))
            }
        }
    }

    fun getFrequencyList() {
        reminderFrequencyListData.postValue(reminderUseCase.getFrequencyList())
    }

    fun setOrderProcess() {
        orderProcess.postValue(reminderUseCase.getUserProcessData())
    }

    fun deleteReminder(
        id: Long
    ) {
        deleteReminder.value = Event(id)
        defaultNameDropDown.postValue(Event(true))
        specialShatabdiToDismissPopup.postValue(false)
    }

    fun editReminder(
        addressPatientDetailsCardModel: AddressPatientDetailsCardModel,
        position: Int
    ) {
        editReminderPatientId.value = reminderAdapterList.value?.get(position)?.patientId?.toLong()
        editReminderDateValue = reminderAdapterList.value?.get(position)?.reminderDate!!
        editReminderNameValue.value = reminderAdapterList.value?.get(position)?.patientName!!
        editReminderFrequency.value = reminderAdapterList.value?.get(position)?.frequency!!
        //editReminderOrderId.value = reminderAdapterList.value?.get(position)?.
        editReminderId.postValue(reminderAdapterList.value?.get(position)?.id!!)
        editReminder.value = Event(addressPatientDetailsCardModel)
        previousReminderDateValue = reminderAdapterList.value?.get(position)?.reminderDate ?: ""
        previousReminderFrequency = reminderAdapterList.value?.get(position)?.frequency ?: 0
        editReminderDateValueInMs = reminderAdapterList.value?.get(position)?.reminderOn ?: 0L
        requestModel.postValue(ReminderRequestModel(
            SharedPrefManager.getInstance().loggedInUserId.toLong(),
            reminderAdapterList.value?.get(position)?.patientId?.toLong() ?: 0,
            reminderAdapterList.value?.get(position)?.reminderDate.toString(),
            frequency = reminderFrequency.value?.toInt() ?: 0,
            false
        )
        )
    }

    fun deleteSetReminder(id:Long) {
        viewModelScope.launch(IO) {
            val response = reminderUseCase.deletePillReminderData(
                mxInternalErrorOccurred,customerId = SharedPrefManager.getInstance().loggedInUserId.toString(),
                        reminderId =id
            )
            if (response!=null){
                showMessage.postValue(Event(MESSAGES.DELETE_REMINDER_SUCCESSFULLY))
                specialShatabdiToDismissPopup.postValue(true)
                deleteReminderForOrderStatus.postValue(true)
                sendReminderDeletedEvent()
            }else{
                showMessage.postValue(Event(MESSAGES.DELETE_REMINDER_FAILED))
            }

        }

    }

    fun getFrequencyItem(frequency: Int) {
        reminderFrequency.postValue(frequency)
    }

    fun setChipsData() {
        chipData.postValue(reminderUseCase.getChipData())

    }

    fun sendReminderBottomSheetViewedEvent(){
        val mxReminderBottomSheetViewed = MxReminderBottomSheetViewed(
            whId = SharedPrefManager.getInstance().selectedWarehouseID ?: "",
            viewedOnPage = "account_screen",
            variantName = "A" ,// as discussed set A
            cashHandlingCharge = null // as discussed set value null- in this case
        )
        sdkEventUseCase.sendReminderBottomSheetViewedEvent(mxReminderBottomSheetViewed)
    }

    fun sendReminderSuccessfullySetEvent(mxReminderSuccessfullySet: MxReminderSuccessfullySet){
//        val mxReminderSuccessfullySet = MxReminderSuccessfullySet(
//            clickedOnPage = currentPage,
//            reminderFrequency = editReminderFrequency.value?.toDouble() ?:0.0,
//            reminderDate = convertStringToDate(editReminderDateValue),
//            variantName = "A" // as discussed set A
//        )
        sdkEventUseCase.sendReminderSuccessfullySetEvent(mxReminderSuccessfullySet)
    }

    fun sendReminderEditClickedEvent() {
        if (mxReminderSuccessfullySet != null && mxReminderSuccessfullySet.orderId != null) {
            sdkEventUseCase.sendReminderEditClickedEvent(mxReminderSuccessfullySet)
        } else {
            val mxReminderSuccessfullySet = MxReminderSuccessfullySet(
                clickedOnPage = currentPage,
                reminderFrequency = editReminderFrequency.value?.toDouble() ?: 0.0,
                reminderDate = convertMillisToDateFormat(editReminderDateValue),//CommonFunc.parseReminderDate(editReminderDateValue),
                variantName = "A" // as discussed set A
            )
            sdkEventUseCase.sendReminderEditClickedEvent(mxReminderSuccessfullySet)
        }
    }

    fun sendReminderUpdatedClickedEvent(){
        //Mixpanel reminder_updated


        val mxReminderUpdate = MxReminderUpdate(
            reminderDate = convertMillisToDateFormat(editReminderDateValue),
            reminderFrequency = editReminderFrequency.value?.toDouble() ?:0.0,
            previousReminderDate = convertMillisToDateFormat(previousReminderDateValue),
            previousReminderFrequency = previousReminderFrequency.toDouble(),
            variantName = "A", // as discussed set A
            cashHandlingCharge = mxReminderSuccessfullySet.cashHandlingCharge,
            cashHandlingChargeApplicable = mxReminderSuccessfullySet.cashHandlingChargeApplicable

        )
        sdkEventUseCase.sendReminderUpdatedClickedEvent(mxReminderUpdate)
        Log.d("convertDat",convertMillisToDateFormat(previousReminderDateValue).toString())
    }




    fun sendReminderDeletedEvent(){
        val mxReminderDeleted = MxReminderDeleted(
             clickedOnPage = currentPage,
            variantName = "A" // as discussed set A
        )
        sdkEventUseCase.sendReminderDeletedEvent(mxReminderDeleted)
    }

    fun convertStringToDate(date:String):Date?{
        var reminderDate: Date? = null
        try {
            reminderDate = SimpleDateFormat("dd-MM-yyyy", Locale.getDefault())
                .parse(date)
            return reminderDate
        } catch (e: ParseException) {
            e.printStackTrace()
            return null
        }
    }

    fun getCalendarData(millis: Long): Calendar? {
        val cal = Calendar.getInstance()
        cal.timeInMillis = millis * 1000L
        cal.timeZone = TimeZone.getTimeZone("UTC")
        return cal
    }

    fun mxReminderSuccessfullySetData() : MxReminderSuccessfullySet{
        return MxReminderSuccessfullySet(
            clickedOnPage = currentPage,
            reminderFrequency = editReminderFrequency.value?.toDouble() ?:0.0,
            reminderDate = convertMillisToDateFormat(editReminderDateValue),
            variantName = "A" // as discussed set A
        )
    }

}