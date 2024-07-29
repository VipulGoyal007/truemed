package com.intellihealth.truemeds.presentation.adapter
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.databinding.AdapterViewPrescriptionBinding
import com.intellihealth.truemeds.presentation.callbacks.ViewPrescriptionCallback
import javax.inject.Inject

class ViewPrescriptionAdapter @Inject constructor(
    list: List<String>,
    val callback: ViewPrescriptionCallback,
    val context: Context,
    val index: Int, val isFromPDPage:Boolean= false, val title:String?=""
) :
    RecyclerView.Adapter<ViewPrescriptionViewHolder>() {
    var items: List<String> = list
    private var selectedIndex = index

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewPrescriptionViewHolder = ViewPrescriptionViewHolder(
        AdapterViewPrescriptionBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
    )

    override fun onBindViewHolder(holder: ViewPrescriptionViewHolder, position: Int) {
        holder.apply {
            bind(items[position], isFromPDPage, title)
            if (position == selectedIndex){
                binding.cardRoot.strokeWidth = 1
                binding.cardRoot.cardElevation = 0F
                binding.cardRoot.strokeColor = ContextCompat.getColor(context, R.color.tm_semantic_color_border_selection_yes)
            }
            else {
                binding.cardRoot.strokeWidth = 1
                binding.cardRoot.cardElevation = 0F
                binding.cardRoot.strokeColor = ContextCompat.getColor(context, R.color.tm_semantic_color_border_main_tertiary_dark2)
            }
            binding.cardRoot.invalidate()

            itemView.setOnClickListener {
                selectedIndex = position
                callback.onViewPrescriptionClicked(position, items[position])
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



class ViewPrescriptionViewHolder(val binding: AdapterViewPrescriptionBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(item: String, isFromPDPage: Boolean= false, title: String?="") {
        binding.url = item
        binding.isFromPDPage= isFromPDPage
        binding.title = title
    }
}