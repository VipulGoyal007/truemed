package com.intellihealth.truemeds.presentation.adapter
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.orderflow.OrderRxInfo
import com.intellihealth.truemeds.databinding.AdapterViewPrescriptionBinding
import com.intellihealth.truemeds.presentation.callbacks.ViewPrescriptionCallback
import javax.inject.Inject

class RxPrescriptionAdapter @Inject constructor(
    list: List<OrderRxInfo>,
    val callback: ViewPrescriptionCallback,
    val context: Context,
    val index: Int
) :
    RecyclerView.Adapter<RxPrescriptionViewHolder>() {
    var items: List<OrderRxInfo> = list
    private var selectedIndex = index

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RxPrescriptionViewHolder = RxPrescriptionViewHolder(
        AdapterViewPrescriptionBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
    )

    override fun onBindViewHolder(holder: RxPrescriptionViewHolder, position: Int) {
        holder.apply {
            bind(items[position])
            if (position == selectedIndex){
                binding.cardRoot.strokeWidth = 1
                //binding.cardRoot.cardElevation = 0F
                binding.cardRoot.strokeColor = ContextCompat.getColor(context, R.color.tm_semantic_color_border_selection_yes)
            }
            else {
                binding.cardRoot.strokeWidth = 1
                //binding.cardRoot.cardElevation = 0F
                binding.cardRoot.strokeColor = ContextCompat.getColor(context, R.color.tm_semantic_color_border_main_tertiary_dark)
            }
            binding.cardRoot.invalidate()

            itemView.setOnClickListener {
                selectedIndex = position
                callback.onViewPrescriptionClicked(position, items[position].imageUrl!!)
                notifyDataSetChanged()
            }
        }
    }

    override fun getItemCount(): Int = items.size

    public fun updateSelectedItemIndex(position: Int){
        selectedIndex = position
        notifyDataSetChanged()
    }
}



class RxPrescriptionViewHolder(val binding: AdapterViewPrescriptionBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(item: OrderRxInfo) {
        binding.url = item.imageUrl
    }
}