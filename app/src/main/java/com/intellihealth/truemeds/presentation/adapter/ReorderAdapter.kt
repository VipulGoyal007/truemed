package com.intellihealth.truemeds.presentation.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.viewModelScope
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.salt.callbacks.ReadMoreCallback
import com.intellihealth.salt.callbacks.ReorderCallback
import com.intellihealth.salt.models.ReorderModel
import com.intellihealth.truemeds.databinding.AdapterReorderBinding
import com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel
import com.intellihealth.truemeds.data.model.home.SuperCategoryModel
import com.intellihealth.truemeds.domain.model.mapToReorderModelList
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch

class ReorderAdapter(
    var list: AllCustomersOrdersResponseModel.ResponseData?,
    private val reOrderCallback: ReorderCallback,
    private val width: Int,
    var homeViewModel: HomeViewModel
) : RecyclerView.Adapter<ReorderAdapter.ViewHolder>() {
    var orderList: ArrayList<ReorderModel> = ArrayList()
    private var moreOrderList: ArrayList<ReorderModel> = arrayListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(
        AdapterReorderBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
    )

    override fun getItemCount() = 1

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.apply {
            if (orderList.size == 0) {
                orderList = list?.ordersList?.mapToReorderModelList()!!
                binding.reorderSection.visibility = View.GONE
            } else {
                binding.reorderSection.visibility = View.VISIBLE
            }
            binding.reorderSection.setMaxPageSize(SharedPrefManager.getInstance().deliveredOrderCount?: 0)
            Log.d("REORDER", "setMaxPageSize " + SharedPrefManager.getInstance().deliveredOrderCount)
            binding.reorderSection.setLoadMoreCallback(object : ReadMoreCallback {
                override fun reachedToLastItem() {
                    Log.d("REORDER", "reachedToLastItem() " + orderList.size)
                    if (orderList.size < (SharedPrefManager.getInstance().deliveredOrderCount ?: 0)) {
                        Log.d("REORDER", "recordsCount " + SharedPrefManager.getInstance().deliveredOrderCount)
                        homeViewModel.isFirstTimeReOrderApiCall = false
                        homeViewModel.customerOrderPageCount++
                        homeViewModel.viewModelScope.launch(IO) { homeViewModel.getAllCustomerOrdersForDeliverDetails() }
                        Log.d("REORDER", "reachedToLastItem() Api called " + orderList.size)

                    }
                }
            })
            binding.reorderSection.setReorderCallback(reOrderCallback)
            if (homeViewModel.isFirstTimeReOrderApiCall) {
                bind(orderList, width)
                Log.d("REORDER", "bind fun called" + orderList.size)

            } else {
                setMoreReorderList(moreOrderList, width)
                Log.d("REORDER", "setMoreReorderList fun called" + moreOrderList.size)
            }


        }


    }

    override fun getItemId(position: Int): Long = if ((list?.ordersList?.size ?: 0) > position + 1)
        list?.ordersList?.get(position)?.orderId!!
    else 0

    class ViewHolder(val binding: AdapterReorderBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(list: List<ReorderModel>, width: Int) {
            Log.d("REORDER", "bind: orderlost " + list.size)
            binding.reorderSection.setUpCardData(list, width)

        }

        fun setMoreReorderList(list: List<ReorderModel>, width: Int) {
            Log.d("REORDER", "setMoreReorderList" + list.size)
            binding.reorderSection.setMoreReorderList(
                reorderData = list
            )
        }

    }

    fun setData(orderList: ArrayList<ReorderModel>) {
        this.orderList = orderList
        if (!homeViewModel.isFirstTimeReOrderApiCall) {
            if (this.moreOrderList.isNotEmpty()) {
                this.moreOrderList.clear()
            }
            this.moreOrderList.addAll(orderList)
            //this.orderList.addAll(orderList)
        }
        notifyDataSetChanged()

    }
}