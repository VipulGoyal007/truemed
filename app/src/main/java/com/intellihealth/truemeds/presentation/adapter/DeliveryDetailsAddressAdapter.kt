package com.intellihealth.truemeds.presentation.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson
import com.intellihealth.salt.constants.AddressPatientDetailsConstants
import com.intellihealth.salt.models.AddressPatientDetailsCardModel
import com.intellihealth.salt.views.cards.AddressPatientCallback
import com.intellihealth.salt.views.tooltip.DefaultExpandedTooltip
import com.intellihealth.salt.views.tooltip.ToolTypeType
import com.intellihealth.salt.views.tooltip.TooltipBuilder
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.callback.AddressClickCallback
import com.intellihealth.truemeds.data.model.user.GetAllAddressResponse
import com.intellihealth.truemeds.databinding.ManageAddressCardItemBinding
import com.intellihealth.truemeds.databinding.SavedAddressItemBinding
import com.intellihealth.truemeds.presentation.viewmodel.DeliveryDetailsViewModel

class DeliveryDetailsAddressAdapter(
    var manageAddressList: List<GetAllAddressResponse.ResponseObj?>,
    var viewModel: DeliveryDetailsViewModel,
    var callback: AddressClickCallback
) : RecyclerView.Adapter<DeliveryDetailsAddressAdapter.ManageAddressViewHolder>() {
//    private var toolTip: DefaultExpandedTooltip? = null
    private var mViewModel: DeliveryDetailsViewModel? = null

    init {
        mViewModel=viewModel
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ManageAddressViewHolder {
        val binding: SavedAddressItemBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.saved_address_item, parent, false
        )
        return ManageAddressViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ManageAddressViewHolder, @SuppressLint("RecyclerView") position: Int) {
        holder.binding.savedAddressData = manageAddressList[position]
        if (manageAddressList[position]?.selected == true){
            if(manageAddressList[position]?.isServicable == false){
                holder.binding.radioHeader.setChecked(false)
                holder.binding.radioHeader.setEnable(false)
                holder.binding.clSavedAddress.background = ContextCompat.getDrawable(
                    holder.binding.clSavedAddress.context,
                    R.drawable.bg_saved_addresses
                )
                holder.binding.ivEditSavedAddress.visibility = View.VISIBLE
                holder.binding.tvPinCodeUnserviceable.visibility = View.VISIBLE
                holder.binding.ivEditInfo.visibility = View.VISIBLE
                holder.binding.radioHeader.alpha = 0.6f
                holder.binding.tvAddress.alpha = 0.6f
                holder.binding.clSavedAddress.alpha = 0.6f

            }else {
                holder.binding.radioHeader.setChecked(true)
                holder.binding.radioHeader.setEnable(true)
                holder.binding.clSavedAddress.background = ContextCompat.getDrawable(
                    holder.binding.clSavedAddress.context,
                    R.drawable.bg_selected_addresses
                )
                holder.binding.ivEditSavedAddress.visibility = View.VISIBLE
                holder.binding.tvPinCodeUnserviceable.visibility = View.GONE
                holder.binding.ivEditInfo.visibility = View.GONE
                holder.binding.radioHeader.alpha = 1f
                holder.binding.tvAddress.alpha = 1f
                holder.binding.clSavedAddress.alpha = 1f
            }
        }
        else {
            holder.binding.radioHeader.setChecked(false)
            holder.binding.radioHeader.setEnable(false)
            holder.binding.clSavedAddress.background =  ContextCompat.getDrawable(holder.binding.clSavedAddress.context,R.drawable.bg_saved_addresses)
            holder.binding.ivEditSavedAddress.visibility = View.GONE
            holder.binding.tvPinCodeUnserviceable.visibility = View.GONE
            holder.binding.ivEditInfo.visibility = View.GONE
            holder.binding.radioHeader.alpha = 1f
            holder.binding.tvAddress.alpha = 1f
            holder.binding.clSavedAddress.alpha = 1f
        }
        if (manageAddressList[position]?.selected == true){
            holder.binding.tvAddress.maxLines = Integer.MAX_VALUE;
        }else{
            holder.binding.tvAddress.maxLines = 2;
        }
        //holder.binding.radioHeader.setRadioLabelRightColor(ContextCompat.getColor(binding.radioHeader.context,R.color.))
        //holder.binding.tvAddress.text = getAppendedAddressString(list[position]?.addressline1,list[position]?.addressline2,list[position]?.addressline3,list[position]?.cityName,list[position]?.pincode)
        holder.itemView.setOnClickListener {
            mViewModel?.sendAddressChangedEvent()
            manageAddressList[position]?.let { it1 -> callback.locationClicked(it1.cityName!!,it1.addressId!!,it1.pincode!!) }
        }
        holder.binding.ivEditSavedAddress.setOnClickListener {
            manageAddressList[position]?.let { item->callback.editClick(item) }
        }
        holder.binding.ivEditInfo.setOnClickListener {
//            toolTip = DefaultExpandedTooltip(it.context)
            val metrics = it.context.resources.displayMetrics
            val screenWidth = metrics.widthPixels
            val screenPos = IntArray(2)
            it.getLocationOnScreen(screenPos)
            /*toolTip?.isFocusable = true
            toolTip?.showTooltip(
                it,
                "Currently not delivering to this address",
                "Currently not delivering to this address",
                false,
                screenPos[0],
                screenWidth,0,true
            )
            callback.dismissToolTip(toolTip)*/

            TooltipBuilder()
                .with(it.context)
                .setHeading("Currently not delivering to this address")
                .setBody("Currently not delivering to this address")
                .setShowIconTop(false)
                .setHorizontalOffset(screenPos[0])
                .setAnchorView(it)
                .setScreenWidth(screenWidth)
                .setFocusable(true)
                .setType(ToolTypeType.DEFAULT)
                .show()


        }
//        val current = manageAddressList?.get(position)
//        current.let {
//            it?.toDeliveryDetailsPatientCardModel()?.let { it1 -> holder.bindManageAddress(position, it1) }

//            holder.managerAddressBinding.addressCard.setCallback(object : AddressPatientCallback {
//                override fun addressCardClick() {
//                    viewModel.addressBoxClicked(it,position)
//                }
//
//                override fun deleteClickedCallback(type: AddressPatientDetailsConstants) {
//
//                }
//
//                override fun editClickedCallback(type: AddressPatientDetailsConstants) {
//                    val addressJsonString = Gson().toJson(it)
////                     viewModel.editAddress(it,position)
//                    callback.editClick(current!!)
//                }
//
//                override fun patientCardClick() {
//
//                }
//
//            })
//        }
    }

    override fun getItemCount(): Int {
        return manageAddressList?.size!!
    }

    inner class ManageAddressViewHolder(binding: SavedAddressItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val binding: SavedAddressItemBinding

        init {
            this.binding = binding
        }
    }
}