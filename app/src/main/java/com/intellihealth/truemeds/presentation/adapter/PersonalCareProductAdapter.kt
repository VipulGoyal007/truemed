package com.intellihealth.truemeds.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.salt.callbacks.ProductCardCallback
import com.intellihealth.salt.callbacks.StepperCallback
import com.intellihealth.salt.views.Toast
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.callback.DeleteCallback
import com.intellihealth.truemeds.databinding.AdapterPersonalCareProductBinding
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxItemAdded
import com.intellihealth.truemeds.presentation.bottomsheet.search.RemoveProductBottomSheet
import com.intellihealth.truemeds.presentation.model.ProductInfoModel
import com.intellihealth.truemeds.presentation.utils.CommonFunc.isSingleClickParam
import com.intellihealth.truemeds.presentation.viewmodel.MyOrderViewModel

class PersonalCareProductAdapter(
    private val productList: List<ProductInfoModel> = ArrayList(),
    private val productCardCallback: ProductCardCallback,
    private val viewModel: MyOrderViewModel,
    val fragmentManager: FragmentManager,
) : RecyclerView.Adapter<PersonalCareProductAdapter.ItemViewHolder>() {
    var items: List<ProductInfoModel> = productList


    init {
        setHasStableIds(true)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            ItemViewHolder = ItemViewHolder(
        AdapterPersonalCareProductBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
    )

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.apply {
            val stepperCallback = object : StepperCallback {
                override fun cartItemMinus(qty: Int) {
                    if (qty == 0) {
                        viewModel.removeItemFromCart( items[position], false)
                    } else {
                        viewModel.updateQuantity( items[position], qty)
                    }
                    viewModel.adapterCartModel =  items[position]
                }

                override fun cartItemPlus(qty: Int) {
    
                    var itemAdded = MxItemAdded()
    
                    var sectionHeading = ""
                    if (!viewModel.childCategoryList.value.isNullOrEmpty()) {
                        val categoriesList = viewModel.childCategoryList.value!!
                        if (categoriesList.size > viewModel.highLightPosition) {
                            val dataModel = categoriesList[viewModel.otcHighLightedCategoryPosition]
                            sectionHeading = dataModel.name ?: ""
                        }
                    }
                    itemAdded.clickedOnPage = "product_list_page"
                    itemAdded.categoryName = sectionHeading
                    itemAdded.superCategoryName = HomeOtcCategoryAdapter.superCategoryName
                    itemAdded.sectionHeading =  if(sectionHeading.equals("all", true)) HomeOtcCategoryAdapter.superCategoryName else sectionHeading
                    itemAdded.sectionIndex = position + 1
                    itemAdded.pageSection = "main"
                    itemAdded.sectionRow = 0
                    
                    
//                    if (qty == 1) viewModel.sendItemAddedEvent(items[position],null,null, itemAdded)
                    if (qty == 1) {
                        Toast().showCustomToastMessage(holder.itemView.context, holder.itemView.context.resources.getString(R.string.item_added))
                        viewModel.addToCart(items[position], false, qty, itemAdded)
                    } else {
                        viewModel.updateQuantity(items[position], qty)
                    }
                    items[position].product.qty = qty
                    viewModel.adapterCartModel =  items[position]
                }

                override fun stepperError(msg: String?) {

                }

                override fun deleteAlert() {
                    val removeProductBottomSheet =
                        RemoveProductBottomSheet(object : DeleteCallback {
                            override fun yesClick() {
                                viewModel.removeItemFromCart(items[position], false)
                                items[position].product.qty = 0
                                notifyItemChanged(position)
                            }

                        })
                    removeProductBottomSheet.isCancelable = true
                    if (!removeProductBottomSheet.isVisible && fragmentManager != null && isSingleClickParam())
                        removeProductBottomSheet.show(fragmentManager, "remove product")
                    viewModel.adapterCartModel = items[position]
                }

            }
            binding.productCard.setStepperCallback(stepperCallback)
            bind(items[position], productCardCallback)
        }
    }

    override fun getItemCount(): Int = items.size

    class ItemViewHolder(val binding: AdapterPersonalCareProductBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(productDetailModel: ProductInfoModel, productCardCallback: ProductCardCallback) {
            binding.data = productDetailModel.toSdkObject()
            binding.productCardCallback = productCardCallback
        }
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }
}