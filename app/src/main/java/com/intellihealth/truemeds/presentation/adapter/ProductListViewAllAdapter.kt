package com.intellihealth.truemeds.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.salt.callbacks.ProductCardCallback
import com.intellihealth.salt.callbacks.StepperCallback
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.callback.DeleteCallback
import com.intellihealth.truemeds.databinding.ProductListViewAllItemBinding
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxItemAdded
import com.intellihealth.truemeds.presentation.bottomsheet.search.RemoveProductBottomSheet
import com.intellihealth.truemeds.presentation.utils.CommonFunc.isSingleClickParam
import com.intellihealth.truemeds.presentation.viewmodel.ProductListViewAllViewModel


class ProductListViewAllAdapter() : RecyclerView.Adapter<ProductListViewAllAdapter.MyViewHolder>() {


    var items: List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> = emptyList()
    var viewmodel: ProductListViewAllViewModel? = null
    var productCardCallback: ProductCardCallback? = null
    var fragmentManager: FragmentManager? = null

    constructor (
        items: List<com.intellihealth.truemeds.presentation.model.ProductInfoModel>,
        viewmodel: ProductListViewAllViewModel?,productCardCallback : ProductCardCallback,
        fragmentManager: FragmentManager

    ) : this() {
        this.viewmodel = viewmodel
        this.items = items
        this.productCardCallback = productCardCallback
        this.fragmentManager = fragmentManager
    }

    init {
        setHasStableIds(true)
    }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder =
        MyViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.product_list_view_all_item,
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.apply {
            val stepperCallback = object : StepperCallback {
                override fun cartItemMinus(qty: Int) {
                    viewmodel?.adapterCartModel =  items[position]
                    if (qty == 0) {
                        viewmodel?.removeItemFromCart( items[position], false)
                    } else {
                        viewmodel?.updateQuantity( items[position], qty)
                    }
                    items[position].product.qty = qty
                    notifyItemChanged(position)
                }

                override fun cartItemPlus(qty: Int) {
                    var itemAdded = MxItemAdded()
                    itemAdded.clickedOnPage = "product_list_page"
                    itemAdded.sectionIndex = position + 1
                    itemAdded.pageSection = "main"
                    itemAdded.sectionHeading = viewmodel?.sectionHeading
                    
                    viewmodel?.adapterCartModel = items[position]
//                    if (qty == 1) viewmodel?.sendItemAddedEvent(items[position],null,null, itemAdded)
                    if (qty == 1) {
                        viewmodel?.addToCart(items[position], false, qty, itemAdded)
                    } else {
                        viewmodel?.updateQuantity(items[position], qty)
                    }
                    items[position].product.qty = qty
                    notifyItemChanged(position)
                }

                override fun stepperError(msg: String?) {

                }

                override fun deleteAlert() {
                    viewmodel?.adapterCartModel = items[position]
                    val removeProductBottomSheet =
                        RemoveProductBottomSheet(object : DeleteCallback {
                            override fun yesClick() {
                                viewmodel?.removeItemFromCart(items[position], false)
                                items[position].product.qty = 0
                                notifyItemChanged(position)
                            }

                        })
                    removeProductBottomSheet.isCancelable = true
                    if (!removeProductBottomSheet.isVisible && fragmentManager != null && isSingleClickParam())
                        removeProductBottomSheet.show(fragmentManager!!, "remove product")
                }

            }

            binding.productCardView.setStepperCallback(stepperCallback)
            bind(items[position], productCardCallback!!)
        }
    }


    override fun getItemCount(): Int = items.size

    class MyViewHolder(binding: ProductListViewAllItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val binding: ProductListViewAllItemBinding
        init {
            this.binding = binding
        }
        fun bind(productDetailModel: com.intellihealth.truemeds.presentation.model.ProductInfoModel, productCardCallback: ProductCardCallback) {
            /*binding.data = productDetailModel.toSdkObject()
            binding.productCardCallback = productCardCallback
            binding.productCardView.setCrossSellingCallback(productCardCallback)*/
            binding.data = productDetailModel.toSdkObject()
            binding.productCardCallback = productCardCallback
        }
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }
}