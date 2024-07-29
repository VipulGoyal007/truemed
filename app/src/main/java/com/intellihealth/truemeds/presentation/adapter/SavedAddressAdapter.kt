package com.intellihealth.truemeds.presentation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.salt.views.tooltip.DefaultExpandedTooltipWithMargin
import com.intellihealth.salt.views.tooltip.ToolTypeType
import com.intellihealth.salt.views.tooltip.TooltipBuilder
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.callback.ChooseLocationCallback
import com.intellihealth.truemeds.data.model.user.GetAllAddressResponse
import com.intellihealth.truemeds.databinding.SavedAddressItemBinding

class SavedAddressAdapter(
    var list: List<GetAllAddressResponse.ResponseObj?> = ArrayList(),
    var callback: ChooseLocationCallback,
) : RecyclerView.Adapter<SavedAddressAdapter.ItemViewHolder>() {

    private lateinit var binding: SavedAddressItemBinding
    private var toolTip: DefaultExpandedTooltipWithMargin? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        binding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.saved_address_item,
            parent, false
        )
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
       holder.binding.savedAddressData = list[position]
        if (list[position]?.selected == true){
            if(list[position]?.isServicable == false){
                holder.binding.radioHeader.setChecked(false)
                holder.binding.radioHeader.setEnable(false)
                holder.binding.clSavedAddress.background = ContextCompat.getDrawable(
                    holder.binding.clSavedAddress.context,
                    R.drawable.bg_saved_addresses
                )
                holder.binding.ivEditSavedAddress.visibility = View.VISIBLE
                holder.binding.tvPinCodeUnserviceable.visibility = View.VISIBLE
                holder.binding.ivEditInfo.visibility = View.VISIBLE

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
            }
        }
        else {
            holder.binding.radioHeader.setChecked(false)
            holder.binding.radioHeader.setEnable(false)
            holder.binding.clSavedAddress.background =  ContextCompat.getDrawable(holder.binding.clSavedAddress.context,R.drawable.bg_saved_addresses)
            holder.binding.ivEditSavedAddress.visibility = View.GONE
            holder.binding.tvPinCodeUnserviceable.visibility = View.GONE
            holder.binding.ivEditInfo.visibility = View.GONE
        }
        if (list[position]?.selected == true){
            holder.binding.tvAddress.maxLines = Integer.MAX_VALUE;
        }else{
            holder.binding.tvAddress.maxLines = 2;
        }
        //holder.binding.radioHeader.setRadioLabelRightColor(ContextCompat.getColor(binding.radioHeader.context,R.color.))
        //holder.binding.tvAddress.text = getAppendedAddressString(list[position]?.addressline1,list[position]?.addressline2,list[position]?.addressline3,list[position]?.cityName,list[position]?.pincode)
        holder.itemView.setOnClickListener {
            list[position]?.let { it1 ->
                callback.locationClicked(
                    it1.cityName!!,
                    it1.addressId!!,
                    it1.pincode!!
                )

            }
        }
        holder.binding.ivEditSavedAddress.setOnClickListener {
            list[position]?.let { item->callback.editAddressClicked(item) }
        }
        holder.binding.ivEditInfo.setOnClickListener {
            toolTip = DefaultExpandedTooltipWithMargin(it.context)
            val metrics = it.context.resources.displayMetrics
            val screenWidth = metrics.widthPixels
            val screenPos = IntArray(2)
            it.getLocationOnScreen(screenPos)
            toolTip?.isFocusable = true
//            toolTip?.showTooltip(
//                it,
//                "Currently not delivering to this address",
//                "Currently not delivering to this address",
//                false,
//                screenPos[0],
//                screenWidth
//            )


            TooltipBuilder()
                .with(it.context)
                .setHeading("Currently not delivering to this address")
                .setBody("Currently not delivering to this address")
                .setShowIconTop(false)
                .setHorizontalOffset(screenPos[0])
                .setAnchorView(it)
                .setScreenWidth(screenWidth)
                .setFocusable(true)
                .setType(ToolTypeType.DEFAULT_MARGIN)
                .show()


//            callback.dismissToolTip(toolTip)
        }
    }



    private fun getAppendedAddressString(addressline1: String?, addressline2: String?, addressline3: String?, cityName: String?,pinCode:String?): String {
        var addressDescription : String = ""
        if(addressline1?.isNotEmpty()!!){
            addressDescription = addressline1
        }
        if(addressline2?.isNotEmpty()!!){
            addressDescription += ",$addressline2"
        }
        if(addressline3?.isNotEmpty()!!){
            addressDescription += ",$addressline3"
        }
        if(cityName?.isNotEmpty()!!){
            addressDescription += ",$cityName"
        }
        if(pinCode?.isNotEmpty()!!){
            addressDescription += " $pinCode"
        }
        return addressDescription
    }

    override fun getItemCount(): Int = list.size

    override fun getItemId(position: Int): Long {
        return list?.get(position)?.addressId!!.toLong()
    }
    class ItemViewHolder(binding: SavedAddressItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val binding: SavedAddressItemBinding

        init {
            this.binding = binding
        }
    }
}