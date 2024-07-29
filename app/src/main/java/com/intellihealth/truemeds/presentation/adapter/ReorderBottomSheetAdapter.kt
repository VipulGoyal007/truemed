package com.intellihealth.truemeds.presentation.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.home.HomeReorderBottomSheetModel
import com.intellihealth.truemeds.databinding.BottomsheetReorderFooterBinding
import com.intellihealth.truemeds.databinding.BottomsheetReorderHeaderBinding
import com.intellihealth.truemeds.databinding.BottomsheetReorderItemBinding


class ReorderBottomSheetAdapter(
    private val context: Context, // Take any list that matches your requirement.
    private var data: HomeReorderBottomSheetModel?
) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    // Define a constructor
    init {
        data = data
    }

    // Define a ViewHolder for Header view
    class HeaderViewHolder(binding: BottomsheetReorderHeaderBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val binding: BottomsheetReorderHeaderBinding

        init {
            this.binding = binding
        }
    }

    // Define a ViewHolder for Footer view
    class FooterViewHolder(binding:BottomsheetReorderFooterBinding,data: HomeReorderBottomSheetModel) :
        RecyclerView.ViewHolder(binding.root)  {
        val binding: BottomsheetReorderFooterBinding

        init {
            this.binding = binding
            Log.d("TAG", "data reorderData: "+data)
            this.binding.reorderData = data
        }
    }

    // Now define the ViewHolder for Normal list item
    class NormalViewHolder(binding: BottomsheetReorderItemBinding,data: HomeReorderBottomSheetModel) :
        RecyclerView.ViewHolder(binding.root)  {
        val binding: BottomsheetReorderItemBinding

        init {
            this.binding = binding

        }
    }

    // And now in onCreateViewHolder you have to pass the correct view
    // while populating the list item.
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecyclerView.ViewHolder {
        return when (viewType) {
           /*TODO: With footer,
              FOOTER_VIEW -> {
                val binding: BottomsheetReorderFooterBinding = DataBindingUtil.inflate(
                    LayoutInflater.from(parent.context),
                    R.layout.bottomsheet_reorder_footer,
                    parent, false
                )
                FooterViewHolder(binding,data!!)
            }*/
            HEADER_VIEW -> {
                val binding: BottomsheetReorderHeaderBinding = DataBindingUtil.inflate(
                    LayoutInflater.from(parent.context),
                    R.layout.bottomsheet_reorder_header,
                    parent, false
                )
                HeaderViewHolder(binding)
            }
            else -> {
                val binding: BottomsheetReorderItemBinding = DataBindingUtil.inflate(
                    LayoutInflater.from(parent.context),
                    R.layout.bottomsheet_reorder_item,
                    parent, false
                )
                NormalViewHolder(binding,data!!)
            }
        }
    }

    // Now bind the ViewHolder in onBindViewHolder
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        try {
            when (holder) {
                is NormalViewHolder -> {
                    if(position.minus(1) != -1){
                        holder.binding.reorderData = data!!.list[position.minus(1)]
                        Log.d("TAG", "data product info list size: "+data!!.list.size)
                    }

                }

                is FooterViewHolder -> {
                    val vh = holder
                }

                is HeaderViewHolder -> {
                    val vh = holder
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    // Now the critical part. You have return the exact item count of your list
    // I've only one footer. So I returned data.size() + 1
    // If you've multiple headers and footers, you've to return total count
    // like, headers.size() + data.size() + footers.size()
    override fun getItemCount(): Int {
        if (data == null) {
            return 0
        }
        return if (data!!.list.isEmpty()) {
            // Return 1 here to show nothing
            1
        } else data!!.list.size + 1 /*TODO: With footer, data!!.list.size + 2*/

        // Add extra view to show the header view
        // Add another extra view to show the footer view
        // So there are two extra views need to be populated
    }

    // Now define getItemViewType of your own.
    override fun getItemViewType(position: Int): Int {
        if (position == 0) {
            // This is where we'll add the header.
            return HEADER_VIEW
        } /* TODO: With footer,
           else if (position == data!!.list.size + 1) {
            // This is where we'll add footer.
            return FOOTER_VIEW
        }*/
        return super.getItemViewType(position)
    }

    // So you're done with adding a footer and its action on onClick.
    // Now set the default ViewHolder for NormalViewHolder
    open inner class ViewHolder  // Define elements of a row here
        (itemView: View?) : RecyclerView.ViewHolder(
        itemView!!
    ) {
        fun bindView(position: Int) {
            // bindView() method to implement actions
        }
    }

    companion object {
        private const val FOOTER_VIEW = 1
        private const val HEADER_VIEW = 2
    }
}