package com.intellihealth.truemeds.presentation.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.databinding.ManageAddressCardItemBinding
import com.intellihealth.truemeds.presentation.viewmodel.ManageAddressViewModel
import com.intellihealth.salt.constants.AddressPatientDetailsConstants
import com.intellihealth.salt.models.AddressPatientDetailsCardModel
import com.intellihealth.salt.views.cards.AddressPatientCallback
import com.intellihealth.truemeds.data.model.user.GetAllAddressResponse
import com.intellihealth.truemeds.data.utils.MESSAGES
import com.intellihealth.truemeds.data.utils.MessageConstant
import com.intellihealth.truemeds.presentation.viewmodel.events.Event

class ManageAddressAdapter(
    var manageAddressList: List<GetAllAddressResponse.ResponseObj?>?,
    var viewModel: ManageAddressViewModel
) : RecyclerView.Adapter<ManageAddressAdapter.ManageAddressViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ManageAddressViewHolder {
        val binding: ManageAddressCardItemBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.manage_address_card_item, parent, false
        )
        return ManageAddressViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ManageAddressViewHolder, position: Int) {
        val current = manageAddressList?.get(position)
        current.let {
            it?.toAddressPatientCardModel()?.let { it1 -> holder.bindManageAddress(position, it1) }
            holder.managerAddressBinding.addressCard.setCallback(object : AddressPatientCallback {
                override fun addressCardClick() {

                }

                override fun deleteClickedCallback(type: AddressPatientDetailsConstants) {
                    viewModel.showMessage.postValue(Event(MessageConstant(MESSAGES.DELETE_ADDRESS_CLICK)))
                    viewModel._addressItemList.postValue(it)
                    viewModel.isEditClick.postValue(false)
//                    viewModel.deleteAddressEventListener(it)
                }

                override fun editClickedCallback(type: AddressPatientDetailsConstants) {
                    viewModel._addressItemList.postValue(it)
                    viewModel.isEditClick.postValue(true)
                    viewModel.showMessage.postValue(Event(MessageConstant(MESSAGES.EDIT_ADDRESS_CLICK)))

//                    viewModel.editAddress(it)
//                    var intent = Intent(this@ManageAddressAdapter, AddAddressActivity::class.java)
//                    intent.put
                }

                override fun patientCardClick() {
                    Log.d("TAG", "patient card clicked: ")
                }

            })
        }
    }

    override fun getItemCount(): Int {
        return manageAddressList?.size!!
    }

    inner class ManageAddressViewHolder(private val binding: ManageAddressCardItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        var managerAddressBinding: ManageAddressCardItemBinding = binding
        fun bindManageAddress(itemPosition: Int, data: AddressPatientDetailsCardModel) =
            with(binding) {
                binding.addressCardData = data
            }
    }
}