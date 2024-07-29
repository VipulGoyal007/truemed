package com.intellihealth.truemeds.presentation.viewmodel

import android.content.Context
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.MutableLiveData
import com.intellihealth.salt.constants.InputFieldConstants
import com.intellihealth.salt.models.MobileSectionHeadersModel
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData
import com.intellihealth.truemeds.presentation.utils.Validator
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

@HiltViewModel
class AddAddressViewModel  @Inject constructor(
    @ApplicationContext private val context: Context
) : BaseViewModel(), DefaultLifecycleObserver {
    var address: MutableLiveData<String> = MutableLiveData("")
    var address2: MutableLiveData<String> = MutableLiveData("")
    var pincode: MutableLiveData<String> = MutableLiveData("")
    var validator = Validator()

    var addressData: MutableLiveData<ErrorMessageData> =
        MutableLiveData(ErrorMessageData("", InputFieldConstants.STATE_DEFAULT))

    var address2Data: MutableLiveData<ErrorMessageData> =
        MutableLiveData(ErrorMessageData("", InputFieldConstants.STATE_DEFAULT))

    var pincodeData: MutableLiveData<ErrorMessageData> =
        MutableLiveData(ErrorMessageData("", InputFieldConstants.STATE_DEFAULT))

    var headerType: MutableLiveData<MobileSectionHeadersModel> = MutableLiveData(
        MobileSectionHeadersModel("Manage Addresses","","",
            "",0, null))

    fun onSaveButtonClicked() {
        if (!validator.isValidAddress(address.value.toString())) {
            addressData.postValue(
                ErrorMessageData(
                    context.getString(R.string.enterAddress),
                    InputFieldConstants.STATE_ERROR
                )
            )
        } else if (!validator.isValidAddress(address2.value.toString())) {
            address2Data.postValue(
                ErrorMessageData(
                    context.getString(R.string.enterLocality),
                    InputFieldConstants.STATE_ERROR
                )
            )
        }else if (!validator.isValidPinCode(pincode.value.toString())) {
            pincodeData.postValue(
                ErrorMessageData(
                    context.getString(R.string.enterValidPinCode),
                    InputFieldConstants.STATE_ERROR
                )
            )
        }
    }
}