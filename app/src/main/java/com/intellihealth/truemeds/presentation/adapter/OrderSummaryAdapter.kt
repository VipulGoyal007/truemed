package com.intellihealth.truemeds.presentation.adapter

import android.os.SystemClock
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.viewModelScope
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.salt.callbacks.FullWidthProductCardCallback
import com.intellihealth.salt.callbacks.StepperCallback
import com.intellihealth.salt.constants.FullWidthProductCardConstants
import com.intellihealth.salt.views.Toast
import com.intellihealth.truemeds.databinding.AdapterCartItemBinding
import com.intellihealth.truemeds.presentation.bottomsheet.cart.SwitchBackOgBottomSheet
import com.intellihealth.truemeds.presentation.model.ProductInfoModel
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.CommonFunc.isSingleClickParam
import com.intellihealth.truemeds.presentation.utils.CommonFunc.toAppProductModel
import com.intellihealth.truemeds.presentation.viewmodel.CartViewModel
import com.intellihealth.truemeds.presentation.viewmodel.events.Event
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class OrderSummaryAdapter(
    list: List<ProductInfoModel>,
    viewModel: CartViewModel,
    val fragmentManager: FragmentManager? = null
) : RecyclerView.Adapter<OrderSummaryViewHolder>() {
    var items: List<ProductInfoModel> = list
    var viewmodel: CartViewModel = viewModel

    private var lastClickTime: Long = 0
    private val coolDownSeconds = 4
    
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrderSummaryViewHolder =
        OrderSummaryViewHolder(
            AdapterCartItemBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )

    override fun onBindViewHolder(holder: OrderSummaryViewHolder, position: Int) {

        var item = items[position].toSdkObject()
        if(!SharedPrefManager.getInstance().isReOrder)
            item.product.subsFound = false

//        item.isReplaced = true

        val stepperCallbackProduct = object : StepperCallback {

            override fun deleteAlert() {
                viewmodel.selectedMedicineProductQty = 0
                viewmodel.selectedMedicineProductCode = items[position].product.productCode
                viewmodel.selectedMedicineSwitchBackProductCode = items[position].product.switchBackProductCode ?: ""
                viewmodel.deleteProductEventListener.postValue(Event(true))
            }
            override fun cartItemPlus(qty: Int) {
//                if (qty == 1) viewmodel.sendItemAddedEvent(items[position],null,null)
                viewmodel.updateLastMinuteBuyQty(items[position].product.productCode,qty)

                viewmodel.selectedMedicineProductQty = qty
                items[position].product.qty = qty
                viewmodel.selectedMedicineProductCode = items[position].product.productCode
                val list =
                    viewmodel.getEditOrderRequestData(items[position].product.productCode, qty)
                viewmodel.editMedicine(SharedPrefManager.getInstance().incompleteOrderId,
                    list,
                    false,
                    viewmodel.activePage,
                    items[position].product.switchBackProductCode ?: "")

            }

            override fun cartItemMinus(qty: Int) {
                viewmodel.selectedMedicineProductQty = qty
                viewmodel.selectedMedicineProductCode = items[position].product.productCode
                viewmodel.selectedMedicineSwitchBackProductCode = items[position].product.switchBackProductCode ?: ""

                viewmodel.updateLastMinuteBuyQty(items[position].product.productCode,qty)

                if (qty == 0) {
                    viewmodel.deleteProductEventListener.postValue(Event(true))
                } else {
                    val list =
                        viewmodel.getEditOrderRequestData(items[position].product.productCode, qty)
                    viewmodel.editMedicine(SharedPrefManager.getInstance().incompleteOrderId,//
                        list,
                        false,
                        viewmodel.activePage,
                        items[position].product.switchBackProductCode ?: "")
                }

            }

            override fun stepperError(msg: String?) { }
        }

        val stepperCallbackSuggestion = object : StepperCallback {
            override fun deleteAlert() {
                viewmodel.selectedMedicineSwitchBackProductCode = items[position].product.switchBackProductCode ?: ""
                viewmodel.deleteProductEventListener.postValue(Event(true))
            }

            override fun cartItemPlus(qty: Int) {
//                if (qty == 1) viewmodel.sendItemAddedEvent(items[position],null,null)
//                items[position].suggestion?.qty = qty
                viewmodel.selectedMedicineProductQty = qty
                items[position].suggestion?.qty = qty
                viewmodel.selectedMedicineProductCode = items[position].suggestion?.productCode!!
                val list = viewmodel.getEditOrderRequestData(
                    items[position].suggestion?.productCode!!,
                    qty
                )
                viewmodel.editMedicine(SharedPrefManager.getInstance().incompleteOrderId,
                    list,
                    false,
                    viewmodel.activePage,
                    items[position].product.switchBackProductCode ?: "")
            }

            override fun cartItemMinus(qty: Int) {
//                items[position].suggestion?.qty = qty
                viewmodel.selectedMedicineProductQty = qty
                viewmodel.selectedMedicineProductCode = items[position].suggestion?.productCode!!
                viewmodel.selectedMedicineSwitchBackProductCode = items[position].product.switchBackProductCode ?: ""
                if (qty == 0) {
                    viewmodel.deleteProductEventListener.postValue(Event(true))
                } else {
                    val list = viewmodel.getEditOrderRequestData(
                        items[position].suggestion?.productCode!!,
                        qty
                    )
                    viewmodel.editMedicine(SharedPrefManager.getInstance().incompleteOrderId,
                        list,
                        false,
                        viewmodel.activePage,
                        items[position].product.switchBackProductCode ?: "")
                }
            }

            override fun stepperError(msg: String?) { }
        }

        val fullWidthCallback = object : FullWidthProductCardCallback {
            override fun removeButtonClick(productCode: String) {
                val list = viewmodel.getEditOrderRequestData(
                    productCode,
                    0
                )
                viewmodel.editMedicine(SharedPrefManager.getInstance().incompleteOrderId,
                    list,
                    true,
                    viewmodel.activePage,
                    items[position].product.switchBackProductCode ?: "")
            }

            /*override fun switchBackOrg(productCode: String) {
                val bottomSheet = SwitchBackOgBottomSheet(
                    items[position],
                    items[position].product.subsSavingPercentage.toString()
                )
                bottomSheet.isCancelable = true
                if (!bottomSheet.isVisible) fragmentManager?.let {
                    bottomSheet.show(
                        it, "ProductDetailBottomsheet"
                    )
                }
            }*/
    
            override fun switchBackOrg(productCode: String, switchBackAvailability: Boolean) {
                if (switchBackAvailability && isSingleClickParam()) {
                    viewmodel.viewModelScope.launch(Dispatchers.IO) {
                        val searchResultObj = viewmodel.getProductDetails(productCode)
                        val list = searchResultObj?.elasticProductDetails
                        if (!list.isNullOrEmpty()) {
                            viewmodel.loaderValue.postValue(false)
                            var product = list[0]
                            product.suggestion = items[position].product
                            product.suggestion?.qty = items[position].product.qty
                            product.product.qty = 1
                            val bottomSheet = SwitchBackOgBottomSheet(
                                product,
                                items[position].product.subsSavingPercentage.toString()
                            )
                            bottomSheet.isCancelable = false
                            if (!bottomSheet.isVisible) fragmentManager?.let {
                                bottomSheet.show(
                                    it, "SwitchBackBottomSheet"
                                )
                            }
                        }
                    }
                } else {
                    var availabilityMessage = "Item out of stock"

                    if (!items[position].product.switchBackAvailabilityStatus.isNullOrEmpty()) {
                        availabilityMessage =
                            "Item " + items[position].product.switchBackAvailabilityStatus!!.lowercase()
                    }
                    Toast().showCustomToastMessage(holder.binding.root.context, availabilityMessage)
                }
            }
    
    
            override fun substituteCheck(productCode: String) {

                if (isSingleClickParam()) {
                    item.suggestion?.subsSavingsPercentage = item.product.subsSavingsPercentage
                    viewmodel.selectedMedicineForReplace.postValue(item)
                    viewmodel.selectedProductInfoReplace = items[position]

                    viewmodel.launchReplaceBottomSheet.postValue(Event(true))
                }
                //unconmment below conditions and check entire flow properly from OrderSummaryActivity
                // now is reorder true condition is also added
              /*  if (SharedPrefManager.getInstance().isReOrder) {
                    Log.e("suggestion_click::","suggestion_clicked11")
                    item.suggestion?.subsSavingsPercentage = item.product.subsSavingsPercentage
                    viewmodel.selectedMedicineForReplace.postValue(item)
                    viewmodel.launchReplaceBottomSheet.postValue(Event(true))
                } else {*/



                /*val bundle = Bundle()
                val model = Gson().toJson(item)
                bundle.putString(BundleConstants.PRODUCT_SUBS_DETAIL, model)
                bundle.putString(BundleConstants.PRODUCT_SUBS_TITLE, item.product?.skuName)
                val subCompareFragment = SubsBottomSheet().newInstance()
                subCompareFragment.isCancelable = true
                subCompareFragment.arguments = bundle

                subCompareFragment.setCallback(object :
                    OrgSubCompareBottomSheetCallback {
                    override fun closeClick() {
//                        viewmodel.triggerSaveMeds(SharedPrefManager.getInstance().incompleteOrderId, false, "SUMMARY")
                    }
                })

                if (!subCompareFragment.isVisible)
                    fragmentManager?.let {
                        subCompareFragment.show(
                            fragmentManager,
                            "COMPARE_AND_UNDERSTAND"
                        )
                    }*/
           // }
            }

            override fun productClick(productCode:String) {
                if (isSingleClickParam()) {
                    Log.e("item_clicked", "1111::::came here::" + item.product.productCode)
                    val isSubs = !item.product.switchBackSkuName.isNullOrEmpty()
                    viewmodel.subsFoundEventOrderSummary= if (item.suggestion != null) "true" else "false"
                    var sdkComponent = item.toAppProductModel()
                    if (item.suggestion!=null && item.product.productCode != item.suggestion?.productCode) {
                        sdkComponent.product.subsFound = true
                    }
                    viewmodel.openPDBottomSheetFromOrderSummary(
                        sdkComponent,
                        item.product.productCode,
                        isSubs,
                        item.product.switchBackSkuName ?: "", items[position]
                    )
                    lastClickTime = SystemClock.elapsedRealtime()
                }
            }

            override fun suggestionClick(productCode:String) {
                Log.e("item_clicked","2222::::came here")

                viewmodel.openPDBottomSheetFromOrderSummary(item.toAppProductModel(),item.suggestion?.productCode!!,)


            }

        }

        item.product.let {
            it.callback = stepperCallbackProduct
            it.productCallback = fullWidthCallback


            item.cardType = FullWidthProductCardConstants.SEARCH
        }

        item.suggestion?.let {
            if (it.qty!! > 0)
                item.cardType = FullWidthProductCardConstants.SUBS_ADDED
//            else
//                item.isDisplayAddIcon = true

            it.callback = stepperCallbackSuggestion
            it.productCallback = fullWidthCallback

        }

        if (item.isSubsAddedToCart) {
            item.cardType = FullWidthProductCardConstants.SUBS_ADDED
        }

        if (SharedPrefManager.getInstance().isReOrder &&
            (item.isAutoReplaced || item.product.cxAcceptedSubs)) {

            item.cardType = FullWidthProductCardConstants.CART
            item.isAutoReplaced = true
        }


        holder.binding.productInfoModel = item

        holder.binding.viewmodel = viewmodel
        holder.binding.index = position
        holder.binding.fullWidthProductCard.shouldCallbackBeforeDelete(true)
        /*
                holder.apply {
                    val itemSdk = items?.get(position)?.toSdkObject()
                    itemSdk?.product?.callback = stepperCallbackProduct
                    itemSdk?.product?.productCallback = fullWidthCallback
                    itemSdk?.cardType =  FullWidthProductCardConstants.CART
                    binding.fullWidthProductCard.setCrossSellingData(itemSdk)
                }
        */


        /*items?.get(position)?.product?.let {
            items?.get(position)?.product?.callback = stepperCallbackProduct
            items?.get(position)?.product?.productCallback = fullWidthCallback

            items?.get(position)?.cardType = FullWidthProductCardConstants.CART
        }*/

    }

    override fun getItemCount(): Int = items.size

    override fun getItemId(position: Int): Long {
        return items[position].product.productCode.hashCode().toLong()
    }

    private fun isSingleClickHandle(): Boolean {
        val currentTime = SystemClock.elapsedRealtime()
        return currentTime - lastClickTime > coolDownSeconds * 1000
    }
}

class OrderSummaryViewHolder(val binding: AdapterCartItemBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: ProductInfoModel, position: Int) {
//        binding.fullWidthProductCard.call
        binding.fullWidthProductCard.shouldCallbackBeforeDelete(true)
    }


}