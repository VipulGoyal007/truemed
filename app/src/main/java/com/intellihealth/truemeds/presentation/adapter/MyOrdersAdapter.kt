package com.intellihealth.truemeds.presentation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.salt.callbacks.OrderStatusCardsCallback
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel
import com.intellihealth.truemeds.databinding.HealthArticlesItemBinding
import com.intellihealth.truemeds.databinding.MyOrdersItemBinding
import com.intellihealth.truemeds.databinding.ProgressBarItemBinding
import com.intellihealth.truemeds.presentation.model.DeliveredOrders
import com.intellihealth.truemeds.presentation.viewmodel.HealthArticlesViewModel
import com.intellihealth.truemeds.presentation.viewmodel.OrdersTabViewModel


class MyOrdersAdapter() : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    var items: MutableList<AllCustomersOrdersResponseModel.ResponseData.Orders>? = null
    var viewmodel: OrdersTabViewModel? = null
    lateinit var binding: MyOrdersItemBinding
    lateinit var bindingLoad: ProgressBarItemBinding


    constructor (
        items: MutableList<AllCustomersOrdersResponseModel.ResponseData.Orders>?,
        viewmodel: OrdersTabViewModel?
    ) : this() {
        this.viewmodel = viewmodel
        this.items = items
    }

    companion object {
        private const val VIEW_TYPE_ITEM = 1
        private const val VIEW_TYPE_LOADING = 2
    }

    /* override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder =
         MyViewHolder(
             DataBindingUtil.inflate(
                 LayoutInflater.from(parent.context),
                 R.layout.my_orders_item,
                 parent,
                 false
             )
         )
 */

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            VIEW_TYPE_ITEM -> {
                binding = DataBindingUtil.inflate(
                    LayoutInflater.from(parent.context),
                    R.layout.my_orders_item, parent, false
                );
                ViewHolderOne(binding, viewmodel)
            }

            VIEW_TYPE_LOADING -> {
                bindingLoad = DataBindingUtil.inflate(
                    LayoutInflater.from(parent.context),
                    R.layout.progress_bar_item, parent, false
                );
                ViewHolderTwo(bindingLoad)
            }

            else -> throw IllegalArgumentException("Invalid view type")
        }
    }


    class ViewHolderOne(binding: MyOrdersItemBinding, viewmodel: OrdersTabViewModel?) :
        RecyclerView.ViewHolder(binding.root) {
        val binding: MyOrdersItemBinding

        init {
            this.binding = binding
        }
    }


    class ViewHolderTwo(private var binding: ProgressBarItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind() =
            with(binding) {
                progressBar.visibility = View.VISIBLE
            }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is ViewHolderOne -> {
                with(holder.binding) {
                    if (!items.isNullOrEmpty() && position < items?.size!!) {
                        val itemSdk = items?.get(position)?.toOrderStatusCardsModel()
                        this.orderStatusCardsModel = itemSdk




                        val callback=object : OrderStatusCardsCallback {
                            override fun getOrderStatusCardButtonClick() {
                                viewmodel!!.orderListItemButtonClick(position)
                            }

                            override fun moreButtonCallback() {
                                viewmodel!!.orderListItemMoreClick(position)
                            }

                            override fun orderStatusCardClick() {
                                viewmodel!!.orderListItemClick(position)
                            }

                        }
                            orderStatusCard.setOrderStatusCallback(callback)
                         this.orderStatusCardsCallback=callback

                        viewModel = viewmodel
                        itemPosition = position

                    }
                }
            }
            is ViewHolderTwo -> holder.bind()
        }
    }


    override fun getItemCount(): Int = items!!.size

    override fun getItemViewType(position: Int): Int {
        return if (items!![position] == null) VIEW_TYPE_LOADING else VIEW_TYPE_ITEM
    }

    /*  class MyViewHolder(binding: MyOrdersItemBinding) :
          RecyclerView.ViewHolder(binding.root) {
          val binding: MyOrdersItemBinding

          init {
              this.binding = binding
          }
      }
  */
}