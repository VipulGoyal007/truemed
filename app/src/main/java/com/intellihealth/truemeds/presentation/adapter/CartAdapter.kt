package com.intellihealth.truemeds.presentation.adapter

import android.annotation.SuppressLint
import android.os.SystemClock
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.viewModelScope
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson
import com.intellihealth.salt.callbacks.FullWidthProductCardCallback
import com.intellihealth.salt.callbacks.StepperCallback
import com.intellihealth.salt.constants.FullWidthProductCardConstants
import com.intellihealth.salt.views.Toast
import com.intellihealth.truemeds.data.callback.ProductBottomSheetCallback
import com.intellihealth.truemeds.data.model.mixpanel.MxSwitchBackClicked
import com.intellihealth.truemeds.databinding.AdapterCartItemBinding
import com.intellihealth.truemeds.presentation.bottomsheet.cart.SwitchBackOgBottomSheet
import com.intellihealth.truemeds.presentation.bottomsheet.productdetail.ProductDetailBottomSheet
import com.intellihealth.truemeds.presentation.model.CartMedicineModel
import com.intellihealth.truemeds.presentation.model.ProductInfoModel
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.CommonFunc.isSingleClickParam
import com.intellihealth.truemeds.presentation.viewmodel.CartViewModel
import com.intellihealth.truemeds.presentation.viewmodel.events.Event
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch

class CartAdapter(
    list: List<CartMedicineModel>,
    viewModel: CartViewModel,
    val fragmentManager: FragmentManager? = null
) : RecyclerView.Adapter<CartViewHolder>() {
    var items: List<CartMedicineModel> = list
    var viewmodel: CartViewModel = viewModel
    private var previousMap = HashMap<String, Int>()
    private var lastClickTime: Long = 0
    private val coolDownSeconds = 4
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder =
        CartViewHolder(
            AdapterCartItemBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )

    override fun onBindViewHolder(
        holder: CartViewHolder,
        @SuppressLint("RecyclerView") position: Int
    ) {

        var cartMedicine = items[position]
        var item = cartMedicine.orgInfoModel?.toSdkObject()
        var itemReplaced = cartMedicine.subsMedicineModel?.toSdkObject()


//        item.isReplaced = true

        val stepperCallbackProduct = object : StepperCallback {
            override fun deleteAlert() {
                viewmodel.selectedMedicineProductQty = 0
                viewmodel.selectedMedicineProductCode =
                    cartMedicine.orgInfoModel?.product?.productCode ?: ""
                viewmodel.selectedMedicineSwitchBackProductCode =
                    cartMedicine.orgInfoModel?.product?.switchBackProductCode ?: ""
                viewmodel.deleteProductEventListener.postValue(Event(true))
            }

            override fun cartItemPlus(qty: Int) {
//                if (qty == 1) viewmodel.sendItemAddedEvent(items[position],null,null)
                viewmodel.selectedMedicineProductQty = qty
                cartMedicine.orgInfoModel?.product?.qty = qty
                viewmodel.selectedMedicineProductCode =
                    cartMedicine.orgInfoModel?.product?.productCode ?: ""
                val list =
                    viewmodel.getEditOrderRequestData(
                        cartMedicine.orgInfoModel?.product?.productCode ?: "", qty
                    )
                viewmodel.editMedicine(
                    SharedPrefManager.getInstance().incompleteOrderId,
                    list,
                    false,
                    viewmodel.activePage,
                    ""
                )

                /*if (qty == 1) {
                    val orgCartItem = items[position].toCartItem(false, 1)
                    viewmodel.addMedicine(orgCartItem)
                } else {
                    viewmodel.updateCartMedicineQty(item.product?.productCode!!, qty)
                }*/
            }

            override fun cartItemMinus(qty: Int) {
                viewmodel.selectedMedicineProductQty = qty
                viewmodel.selectedMedicineProductCode =
                    cartMedicine.orgInfoModel?.product?.productCode ?: ""
                viewmodel.selectedMedicineSwitchBackProductCode =
                    cartMedicine.orgInfoModel?.product?.switchBackProductCode ?: ""
                if (qty == 0) {
                    viewmodel.deleteProductEventListener.postValue(Event(true))
                } else {
                    val list =
                        viewmodel.getEditOrderRequestData(
                            cartMedicine.orgInfoModel?.product?.productCode ?: "", qty
                        )
                    viewmodel.editMedicine(
                        SharedPrefManager.getInstance().incompleteOrderId,
                        list,
                        false,
                        viewmodel.activePage,
                        cartMedicine.orgInfoModel?.product?.switchBackProductCode ?: ""
                    )
                }

                /*if (qty == 0) {
                                    viewmodel.deleteMedicineFromCart(item.product?.productCode!!, false)
                                } else {
                                    viewmodel.updateCartMedicineQty(item.product?.productCode!!, qty)
                                }
                                
                */
            }

            override fun stepperError(msg: String?) {}
        }

        val stepperCallbackSuggestion = object : StepperCallback {
            override fun deleteAlert() {
                viewmodel.selectedMedicineProductQty = 0
                viewmodel.selectedMedicineProductCode =
                    cartMedicine.orgInfoModel?.suggestion?.productCode!!
                viewmodel.selectedMedicineSwitchBackProductCode =
                    cartMedicine.orgInfoModel?.product?.switchBackProductCode ?: ""
                viewmodel.deleteProductEventListener.postValue(Event(true))
            }

            override fun cartItemPlus(qty: Int) {
//                if (qty == 1) viewmodel.sendItemAddedEvent(items[position],null,null)
//                items[position].suggestion?.qty = qty
//                cartMedicine.orgInfoModel?.suggestion?.qty = qty
                viewmodel.selectedMedicineProductQty = qty
                cartMedicine.orgInfoModel?.suggestion?.qty = qty
                viewmodel.selectedMedicineProductCode =
                    cartMedicine.orgInfoModel?.suggestion?.productCode!!
                val list = viewmodel.getEditOrderRequestData(
                    cartMedicine.orgInfoModel?.suggestion?.productCode!!,
                    qty
                )
                viewmodel.editMedicine(
                    SharedPrefManager.getInstance().incompleteOrderId,
                    list,
                    false,
                    viewmodel.activePage,
                    cartMedicine.orgInfoModel?.product?.switchBackProductCode ?: ""
                )
            }

            override fun cartItemMinus(qty: Int) {
//                cartMedicine.orgInfoModel?.suggestion?.qty = qty
                viewmodel.selectedMedicineProductQty = qty
                viewmodel.selectedMedicineProductCode =
                    cartMedicine.orgInfoModel?.suggestion?.productCode!!
                viewmodel.selectedMedicineSwitchBackProductCode =
                    cartMedicine.orgInfoModel?.product?.switchBackProductCode ?: ""
                if (qty == 0) {
                    viewmodel.deleteProductEventListener.postValue(Event(true))
                } else {
                    val list = viewmodel.getEditOrderRequestData(
                        cartMedicine.orgInfoModel?.suggestion?.productCode!!,
                        qty
                    )
                    viewmodel.editMedicine(
                        SharedPrefManager.getInstance().incompleteOrderId,
                        list,
                        false,
                        viewmodel.activePage,
                        cartMedicine.orgInfoModel?.product?.switchBackProductCode ?: ""
                    )
                }
            }

            override fun stepperError(msg: String?) {}
        }

        val fullWidthCallback = object : FullWidthProductCardCallback {
            override fun removeButtonClick(productCode: String) {
                Log.d("qwerty", "$productCode")
                Log.e("Replaced clicked", "" + productCode)
                viewmodel.selectedMedicineProductQty = 0
                viewmodel.selectedMedicineProductCode =
                    cartMedicine.orgInfoModel?.product?.productCode ?: ""
                viewmodel.selectedMedicineSwitchBackProductCode =
                    cartMedicine.orgInfoModel?.product?.switchBackProductCode ?: ""

                val list =
                    viewmodel.getEditOrderRequestData(
                        cartMedicine.orgInfoModel?.product?.productCode ?: "", 0
                    )
                viewmodel.editMedicine(
                    SharedPrefManager.getInstance().incompleteOrderId,
                    list,
                    true,
                    viewmodel.activePage,
                    cartMedicine.orgInfoModel?.product?.switchBackProductCode ?: ""
                )
            }

            override fun removeButtonSubsClick(productCode: String) {
                val list = viewmodel.getEditOrderRequestData(
                    productCode,
                    0
                )
                viewmodel.editMedicine(
                    SharedPrefManager.getInstance().incompleteOrderId,
                    list,
                    true,
                    "CART",
                    cartMedicine.orgInfoModel?.suggestion?.switchBackProductCode ?: ""
                )
            }

            override fun switchBackOrg(productCode: String, switchBackAvailability: Boolean) {
                Log.e("suggestion_click::", "switchBackOrg")

                if (switchBackAvailability) {
                    viewmodel.viewModelScope.launch(IO) {
                        val searchResultObj = viewmodel.getProductDetails(productCode)
                        val list = searchResultObj?.elasticProductDetails
                        if (!list.isNullOrEmpty()) {
                            viewmodel.loaderValue.postValue(false)
                            var product = list[0]
                            product.suggestion = cartMedicine.orgInfoModel?.product
                            product.suggestion?.qty = cartMedicine.orgInfoModel?.product?.qty
                            product.product.qty = viewmodel.getSwitchBackProductQty(
                                cartMedicine.orgInfoModel?.product?.switchBackProductCode ?: ""
                            )
                            val bottomSheet = SwitchBackOgBottomSheet(
                                product,
                                cartMedicine.orgInfoModel?.product?.subsSavingPercentage.toString()
                            )
                            bottomSheet.isCancelable = false
                            if (!bottomSheet.isVisible && isSingleClickParam(800L)) fragmentManager?.let {
                                bottomSheet.show(
                                    it, "ProductDetailBottomsheet"
                                )
                            }
                            viewmodel.sendSwitchBackClickedEvent(
                                MxSwitchBackClicked(
                                    SharedPrefManager.getInstance().incompleteOrderId.toString(),
                                    item?.product?.switchBackSkuName,
                                    item?.product?.skuName
                                )
                            )
                        }
                    }
                } else {
                    var availabilityMessage = "Item out of stock"

                    if (!cartMedicine.orgInfoModel?.product?.switchBackAvailabilityStatus.isNullOrEmpty()) {
                        availabilityMessage =
                            "Item " + cartMedicine.orgInfoModel?.product?.switchBackAvailabilityStatus!!.lowercase()
                    }
                    Toast().showCustomToastMessage(holder.binding.root.context, availabilityMessage)
                }


                /*val list = viewmodel.getProductDetails(productCode)
                list?.let {
                    viewmodel.loaderValue.postValue(false)
                    if (it.isNotEmpty()) {
                        var product = list[0]
                        product.suggestion = cartMedicine.orgInfoModel?.product
                        product.suggestion?.qty = 1
                        product.product.qty = 1
                        val bottomSheet = SwitchBackOgBottomSheet(
                            product,
                            cartMedicine.orgInfoModel?.product.subsSavingPercentage.toString()
                        )
                        bottomSheet.isCancelable = false
                        if (!bottomSheet.isVisible) fragmentManager?.let {
                            bottomSheet.show(
                                it, "ProductDetailBottomsheet"
                            )
                        }
                    }
                }*/

            }

            override fun substituteCheck(productCode: String) {
                Log.e("suggestion_click::", "suggestion_clicked11")
                if (isSingleClickParam(500)) {
                    item?.suggestion?.subsSavingsPercentage = item?.product?.subsSavingsPercentage
                    viewmodel.selectedMedicineForReplace.postValue(item)
                    viewmodel.selectedProductInfoReplace = items[position].orgInfoModel
                    viewmodel.launchReplaceBottomSheet.postValue(Event(true))
                    lastClickTime = SystemClock.elapsedRealtime()
                }
            }

            override fun productClick(productCode: String) {
                if (isSingleClickParam()) {
                    viewmodel.viewModelScope.launch(IO) {
                        previousMap = viewmodel.getExistingCartMap()
                    }
                    val productDetailsBottomSheet =
                        ProductDetailBottomSheet(
                            item?.product?.productCode,
                            clickedOnPage = "Cart",
                            pageSection = "main"
                        , isBottomSheetBehaviour = false, isHideToolbar = true, isHideCart = true)
                    productDetailsBottomSheet.isCancelable = false
                    productDetailsBottomSheet.dataFromOrderStatus(
                        false,
                        cartMedicine.orgInfoModel!!,
                        false
                    )

                    productDetailsBottomSheet.setCallback(object : ProductBottomSheetCallback {
                        override fun closeClick() {
                            viewmodel.viewModelScope.launch(IO) {
                                val currentMap = viewmodel.getExistingCartMap()
                                if (previousMap != currentMap) {
                                    viewmodel.triggerSaveMeds(
                                        SharedPrefManager.getInstance().incompleteOrderId,
                                        false,
                                        "CART"
                                    )
                                }
                                viewmodel.isPDBottomsheetClosed.postValue(true)
                            }
//                        viewmodel.fetchCartDetails(false, "CART")
                        }
                    })
                    if (!productDetailsBottomSheet.isVisible) fragmentManager?.let {
                        viewmodel.sendProductDetailFirebaseEvent(
                            item?.product?.productCode,
                            item?.product?.skuName
                        )
                        productDetailsBottomSheet.show(
                            it, "ProductDetailBottomsheet"
                        )
                    }
                    lastClickTime = SystemClock.elapsedRealtime()
                }

            }

            override fun suggestionClick(productCode: String) {
                if (isSingleClickParam()) {
                    Log.d("suggestion_click::", "suggestion_clicked22")
                    val model = Gson().toJson(cartMedicine.orgInfoModel!!)
                    val productDetailsBottomSheet =
                        ProductDetailBottomSheet(
                            item?.suggestion?.productCode!!,
                            true,
                            switchBackSkuNameForBottomSheetSubs = item?.product?.skuName,
                            orgProductOfSubs = model,
                            clickedOnPage = "Cart",
                            pageSection = "main",
                            isHideToolbar = true
                        )
                    productDetailsBottomSheet.isCancelable = true
                    productDetailsBottomSheet.dataFromOrderStatus(false, null, false)

                    productDetailsBottomSheet.setCallback(object : ProductBottomSheetCallback {
                        override fun closeClick() {
                            viewmodel.triggerSaveMeds(
                                SharedPrefManager.getInstance().incompleteOrderId,
                                false,
                                "CART"
                            )
                            viewmodel.isPDBottomsheetClosed.postValue(true)
//                        viewmodel.fetchCartDetails(false, "CART")
                        }
                    })

                    if (!productDetailsBottomSheet.isVisible) fragmentManager?.let {
                        productDetailsBottomSheet.show(
                            it, "ProductDetailBottomsheet"
                        )
                    }
                    lastClickTime = SystemClock.elapsedRealtime()
                }
            }
        }

        item?.product.let {
            it?.callback = stepperCallbackProduct
            it?.productCallback = fullWidthCallback


            item?.cardType = FullWidthProductCardConstants.SEARCH
        }

        item?.suggestion?.let {
            if (it.qty!! > 0)
                item?.cardType = FullWidthProductCardConstants.SUBS_ADDED
//            else
//                item.isDisplayAddIcon = true

            it.callback = stepperCallbackSuggestion
            it.productCallback = fullWidthCallback

        }

        if (item?.isSubsAddedToCart == true) {
            item?.cardType = FullWidthProductCardConstants.SUBS_ADDED
        }

        item?.product?.showSavingTitleIcon = false
        if (item?.isAutoReplaced == true || item?.product?.cxAcceptedSubs == true) {
            item.cardType = FullWidthProductCardConstants.CART
            item.isAutoReplaced = true
        }


        holder.binding.clOriginal.animate().translationX(0f).translationY(0f).rotation(0f)
        holder.binding.clBlueBG.animate().translationX(0f).translationY(0f).rotation(0f)
        holder.binding.clReplacedSubs.animate().translationX(0f).translationY(0f).rotation(0f)

        holder.binding.productInfoModel = item
        holder.binding.productInfoModelReplaced = itemReplaced
        holder.binding.viewmodel = viewmodel
        holder.binding.index = position
        holder.binding.savings = cartMedicine.totalSavings

        holder.binding.fullWidthProductCard.shouldCallbackBeforeDelete(true)

//        holder.binding.executePendingBindings()

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
        return items[position].orgInfoModel?.product?.productCode.hashCode().toLong()
    }

    private var mLastClickTime = 0L
    private var mLastClickSuggestionTime = 0L
    private val MIN_DELAY_MS: Long = 1000L
    private fun isSingleClick(): Boolean {
        val lastClickTime: Long = mLastClickTime
        val now = System.currentTimeMillis()
        this.mLastClickTime = now
        return now - lastClickTime >= MIN_DELAY_MS
    }

    private fun isSuggestionSingleClick(): Boolean {
        val lastClickTime: Long = mLastClickSuggestionTime
        val now = System.currentTimeMillis()
        this.mLastClickSuggestionTime = now
        return now - lastClickTime >= MIN_DELAY_MS
    }
}


class CartViewHolder(val binding: AdapterCartItemBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: ProductInfoModel, position: Int) {
//        binding.fullWidthProductCard.call
        binding.fullWidthProductCard.shouldCallbackBeforeDelete(true)
    }


}