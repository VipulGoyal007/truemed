package com.intellihealth.truemeds.domain.usecase

import android.content.Context
import android.util.Log
import com.google.gson.Gson
import com.intellihealth.salt.constants.OrderStatusConstants
import com.intellihealth.salt.models.DropDownDefaultModel
import com.intellihealth.salt.models.OrderStatusCardModel
import com.intellihealth.salt.models.ProductCardSectionChipModel
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.ChipSelectionModel
import com.intellihealth.truemeds.data.model.home.ApiCoreResponse
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.model.orderreminder.GetReminderResponse
import com.intellihealth.truemeds.data.model.orderreminder.ReminderRequestModel
import com.intellihealth.truemeds.data.model.orderreminder.SetReminderResponse
import com.intellihealth.truemeds.data.model.reminder.FrequencyListModel
import com.intellihealth.truemeds.data.model.reminder.ReminderListModel
import com.intellihealth.truemeds.data.model.user.GetAllPatientResponse
import com.intellihealth.truemeds.data.utils.Resource
import com.intellihealth.truemeds.domain.repository.OrderReminderRepository
import com.intellihealth.truemeds.domain.repository.UserDataRepository
import com.intellihealth.truemeds.domain.usecase.analytics.SdkEventUseCase
import dagger.hilt.android.qualifiers.ApplicationContext
import okhttp3.ResponseBody
import org.json.JSONObject
import javax.inject.Inject

class ReminderUseCase @Inject constructor(
    @ApplicationContext private val context: Context,
    private val orderReminderRepository: OrderReminderRepository,
    private val userDataRepository: UserDataRepository,
    private val sdkEventUseCase: SdkEventUseCase
) {

    //ArrayList<ReminderListModel.ReminderList>
    suspend fun getReminderData(
        mxInternalErrorOccurred: MxInternalErrorOccurred, customerId: String, patientId: Long?
    ): GetReminderResponse? {

        var response: GetReminderResponse? = null
        var patientData: ReminderListModel.ReminderList
        val res =
            orderReminderRepository.getReminders(mxInternalErrorOccurred, customerId, patientId)
        when (res) {
            is Resource.Success -> {
                res.value?.let {
                    if (it.isSuccessful) {
                        response = it.body()
                    } else {
                        try {
                            mxInternalErrorOccurred.errorCode = it.code()
                            mxInternalErrorOccurred.errorStatement = Gson().fromJson(
                                it.errorBody()?.string(),
                                ApiCoreResponse::class.java
                            ).message
                            sdkEventUseCase.sendInternalErrorOccurred(mxInternalErrorOccurred)
                        } catch (_: Exception) {
                        }
                    }
                }

            }

            is Resource.Failure -> {
                Log.e("Error==>>", res.errorBody.toString())
            }

            else -> {
                Log.e("ElseError", "Elseerror")

            }
        }
        return response
    }

    suspend fun setReminder(
        mxInternalErrorOccurred: MxInternalErrorOccurred, reminderRequestModel: ReminderRequestModel
    ): SetReminderResponse? {
        var responseBody: SetReminderResponse? = null
        when (val res =
            orderReminderRepository.setReminder(mxInternalErrorOccurred, reminderRequestModel)) {
            is Resource.Success -> {
                res.value?.let {
                    if (it.isSuccessful) {
                        responseBody = it.body()
                    }else{
                        try {
                            mxInternalErrorOccurred.errorCode = it.code()
                            mxInternalErrorOccurred.errorStatement = Gson().fromJson(
                                it.errorBody()?.string(),
                                ApiCoreResponse::class.java
                            ).message
                            sdkEventUseCase.sendInternalErrorOccurred(mxInternalErrorOccurred)
                        } catch (_: Exception) {
                        }
                    }
                }
            }

            is Resource.Failure -> {

            }

            else -> {

            }
        }
        return responseBody
    }

    suspend fun deletePillReminderData(
        mxInternalErrorOccurred: MxInternalErrorOccurred, customerId: String,
        reminderId: Long
    ): ResponseBody? {
        var responseBody: ResponseBody? = null
        when (val res = orderReminderRepository.deletePillReminderData(
            mxInternalErrorOccurred,
            customerId,
            reminderId
        )) {
            is Resource.Success -> {
                res.value?.let {
                    if (it.isSuccessful) {
                        responseBody = it.body()
                    }else{
                        try {
                            mxInternalErrorOccurred.errorCode = it.code()
                            mxInternalErrorOccurred.errorStatement = Gson().fromJson(
                                it.errorBody()?.string(),
                                ApiCoreResponse::class.java
                            ).message
                            sdkEventUseCase.sendInternalErrorOccurred(mxInternalErrorOccurred)
                        } catch (_: Exception) {
                        }
                    }
                }
            }

            is Resource.Failure -> {

            }

            else -> {

            }
        }
        return responseBody
    }

    suspend fun getPatientNameData(
        mxInternalErrorOccurred: MxInternalErrorOccurred, showMyself: Boolean,
        customerId: Long
    ): ArrayList<DropDownDefaultModel> {
        var response: GetAllPatientResponse? = null
        val dropDown = ArrayList<DropDownDefaultModel>()
        val res = userDataRepository.getAllPatient(mxInternalErrorOccurred, showMyself, customerId)
        when (res) {
            is Resource.Success -> {
                res.value?.let {
                    response = it.body()
                    if (response != null) {
                        if (!response!!.PatientList.isNullOrEmpty()) {
                            response?.PatientList?.forEach { item ->
                                dropDown.add(item.toSdkObject())
                            }
                        }
                    }
                    if (!it.isSuccessful) {
                        try {
                            mxInternalErrorOccurred.errorCode = it.code()
                            mxInternalErrorOccurred.errorStatement = Gson().fromJson(
                                it.errorBody()?.string(),
                                ApiCoreResponse::class.java
                            ).message
                            sdkEventUseCase.sendInternalErrorOccurred(mxInternalErrorOccurred)
                        } catch (_: Exception) {
                        }
                    }
                }

            }

            is Resource.Failure -> {
                Log.e("Error==>>", res.errorBody.toString())
            }

            else -> {
                Log.e("ElseError", "Elseerror")

            }
        }
        return dropDown
    }

    fun getFrequencyList(): ArrayList<FrequencyListModel.FrequencyList> {

        val fileInString: String =
            context.assets.open("frequencyList.json").bufferedReader()
                .use { it.readText() }

        val jsonObject = JSONObject(fileInString)

        val jsonArray = jsonObject.getJSONArray("frequencyList")

        val frequencyList = ArrayList<FrequencyListModel.FrequencyList>()
        var patientData: FrequencyListModel.FrequencyList
        for (i in 0 until jsonArray.length()) {
            val item = jsonArray.getJSONObject(i)
            patientData = Gson().fromJson(
                item.toString(),
                FrequencyListModel.FrequencyList::class.java
            )
            frequencyList.add(patientData)
        }
        return frequencyList
    }

    fun getUserProcessData(): OrderStatusCardModel {
        return OrderStatusCardModel(
            context.getString(R.string.pharmacist_call),
            context.getString(R.string.you_will_receive_a_reminder_call_from_our_pharmacist_on_your_scheduled_date),
            OrderStatusConstants.CardColor.CARD_COLOR_BLUE, false, "", "",
            R.drawable.pharmacist_doctor_call, false, 0L, 0.0, false, false
        )

    }


    fun getChipData(): List<ChipSelectionModel> {
        val chip = ArrayList<ChipSelectionModel>()

        chip.add(ChipSelectionModel(ProductCardSectionChipModel("Every 15 days", 0)))
        chip.add(ChipSelectionModel(ProductCardSectionChipModel("Every 30 days", 1)))
        chip.add(ChipSelectionModel(ProductCardSectionChipModel("Every 45 days", 2)))
        chip.add(ChipSelectionModel(ProductCardSectionChipModel("Every 60 days", 3)))
        chip.add(ChipSelectionModel(ProductCardSectionChipModel("Every 75 days", 4)))
        chip.add(ChipSelectionModel(ProductCardSectionChipModel("Every 90 days", 5)))


        return chip

    }
}