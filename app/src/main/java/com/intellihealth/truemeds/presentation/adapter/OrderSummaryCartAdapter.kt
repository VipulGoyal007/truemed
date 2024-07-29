package com.intellihealth.truemeds.presentation.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.salt.callbacks.FullWidthProductCardCallback
import com.intellihealth.salt.callbacks.StepperCallback
import com.intellihealth.salt.constants.FullWidthProductCardConstants
import com.intellihealth.truemeds.databinding.AdapterOrderSummaryCartItemBinding
import com.intellihealth.truemeds.presentation.model.ProductInfoModel
import com.intellihealth.truemeds.presentation.viewmodel.CartViewModel

class OrderSummaryCartAdapter(list: MutableList<ProductInfoModel>, viewModel: CartViewModel) : RecyclerView.Adapter<OrderSummaryCartViewHolder>() {
    var items: MutableList<ProductInfoModel> = list
    var viewmodel: CartViewModel = viewModel

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrderSummaryCartViewHolder = OrderSummaryCartViewHolder(AdapterOrderSummaryCartItemBinding.inflate(
        LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: OrderSummaryCartViewHolder, position: Int) {
//        holder.apply {
//            bind(items[position] ,position)
//        }
        
        val item = items[position].toSdkObject()
//        item.product.showRemove = true
//        item.product.showRemoved = false

        val stepperCallbackProduct = object : StepperCallback {
            override fun cartItemPlus(qty: Int) {
                /*if (qty == 1) viewmodel.sendItemAddedEvent(items[position],null,null)
                Log.d("qwerty", "${item.product?.skuName} Plus qty = $qty")*/
            }

            override fun cartItemMinus(qty: Int) {
                Log.d("qwerty", "${item.product?.skuName} Minus qty = $qty")
            }

            override fun stepperError(msg: String?) {
                msg?.let { Log.d("qwerty", "${item.product?.skuName} $it") }
            }
        }



        val fullWidthCallback = object : FullWidthProductCardCallback {
            override fun removeButtonClick(productCode: String) {
                /*val list = viewmodel.getEditOrderRequestData(
                    productCode,
                    0
                )*/
                Log.d("qwerty", "removeClick")
                viewmodel.loaderValue.postValue(true)
                val success = viewmodel.removeItemFromCart(items[position], !items[position].product.switchBackProductCode.isNullOrEmpty())
                viewmodel.loaderValue.postValue(false)

//                if (success) {
                    if (!items[position].product.switchBackProductCode.isNullOrEmpty()) {
                        items[position].suggestion?.showRemoved = true
                        items[position].suggestion?.showRemove = false
                    } else {
                        items[position].product.showRemoved = true
                        items[position].product.showRemove = false
                    }
                    viewmodel.listUnavailableItems.postValue(items)
//                }
                Log.e("Remove clicked", productCode)
                
                /*viewmodel.editMedicine(
                    SharedPrefManager.getInstance().incompleteOrderId,
                    list,
                    true,
                    viewmodel.activePage,
                    items[position].product.switchBackProductCode ?: "")*/
            }

            override fun switchBackOrg(productCode: String, switchBackAvailability: Boolean) {
                Log.d("qwerty", "$productCode")
            }

            override fun substituteCheck(productCode: String) {
                Log.d("qwerty", "$productCode")
            }

            override fun productClick(productCode:String) {

//                viewmodel.launchPDPage.value = Event(item)
                Log.d("qwerty", "productClick")
            }

            override fun suggestionClick(productCode:String) {
//                viewmodel.launchPDPage.value = Event(item)

                Log.d("qwerty", "suggestionClick")
            }
        }


        item.product?.let {
            it.callback = stepperCallbackProduct
            it.productCallback = fullWidthCallback

        }
        item.cardType = FullWidthProductCardConstants.CART
        item.product.isAvailable = true
        holder.binding.model = item
    }

    override fun getItemCount(): Int = items.size
}
class OrderSummaryCartViewHolder(val binding: AdapterOrderSummaryCartItemBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: ProductInfoModel, position: Int) {
        binding.model= item.toSdkObject()
    }


}