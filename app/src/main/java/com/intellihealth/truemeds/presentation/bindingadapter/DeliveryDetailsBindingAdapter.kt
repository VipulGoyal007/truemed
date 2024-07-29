package com.intellihealth.truemeds.presentation.bindingadapter

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.salt.models.AddressPatientDetailsCardModel
import com.intellihealth.salt.views.TextView
import com.intellihealth.salt.views.buttons.Button
import com.intellihealth.salt.views.edittext.InputFieldLayout
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.callback.AddressClickCallback
import com.intellihealth.truemeds.data.callback.PatientClickCallback
import com.intellihealth.truemeds.data.model.user.GetAllAddressResponse
import com.intellihealth.truemeds.data.model.user.GetAllPatientResponse
import com.intellihealth.truemeds.presentation.adapter.AddressListAdapter
import com.intellihealth.truemeds.presentation.adapter.DeliveryDetailsAddressAdapter
import com.intellihealth.truemeds.presentation.adapter.DeliveryDetailsPatientAdapter
import com.intellihealth.truemeds.presentation.viewmodel.DeliveryDetailsViewModel

@BindingAdapter("setDeliveryDetailsPatientsList", "viewmodel", "callback")
fun setDeliveryDetailsPatientsList(
    view: RecyclerView,
    list: MutableList<GetAllPatientResponse.Patient?>?,
    viewModel: DeliveryDetailsViewModel,
    callback: PatientClickCallback
) {
    view.adapter?.run {
        //notify
        if (this is DeliveryDetailsPatientAdapter) {
            this.items = list
            this.viewmodel = viewModel
            this.notifyDataSetChanged()
        }
    } ?: run {
        view.adapter?.setHasStableIds(true)
        view.adapter = DeliveryDetailsPatientAdapter(list, viewModel, callback)
    }
}

@BindingAdapter("setAddressList", "viewmodel")
fun setAddressList(
    view: RecyclerView,
    list: MutableList<AddressPatientDetailsCardModel>,
    viewModel: DeliveryDetailsViewModel
) {
    view.adapter?.run {
        if (this is AddressListAdapter) {
            this.itemList = list
            this.viewModel = viewModel
            this.notifyDataSetChanged()
        }
    } ?: run {
        view.adapter = AddressListAdapter(list, viewModel)
    }
}


//@SuppressLint("NotifyDataSetChanged")
@BindingAdapter("setDeliveryDetailsAddressList", "viewmodel", "callback")
fun setDeliveryDetailsAddressList(
    view: RecyclerView,
    list: List<GetAllAddressResponse.ResponseObj?>,
    viewModel: DeliveryDetailsViewModel,
    callback: AddressClickCallback
) {
    view.adapter?.run {
        //notify
        if (this is DeliveryDetailsAddressAdapter) {
            this.manageAddressList = list
            this.viewModel = viewModel
            this.notifyDataSetChanged()
        }
    } ?: run {
        view.adapter?.setHasStableIds(true)
        view.adapter = list?.let { DeliveryDetailsAddressAdapter(it, viewModel, callback) }
    }
}

@BindingAdapter("setListStatus")
fun setListStatus(
    view: Button,
    expanded: Boolean
) {
    view?.run {
        if (expanded) {
            this.setTitle("View less")
            this.setButtonDrawableRight(resources.getDrawable(R.drawable.up_arrow))
        } else {
            this.setTitle("View more")
            this.setButtonDrawableRight(resources.getDrawable(R.drawable.down_arrow))
        }
    }
}

@BindingAdapter("setPatientLabel")
fun setPatientLabel(
    view: InputFieldLayout,
    experiment: String
) {
    if (experiment == "A") {
        view.setLabel(view.context.getString(R.string.patientName_label))
    } else {
        view.setLabel(view.context.getString(R.string.firstname_label))
    }
}

