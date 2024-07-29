package com.intellihealth.truemeds.presentation.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.salt.callbacks.FullWidthProductCardCallback
import com.intellihealth.salt.callbacks.StepperCallback
import com.intellihealth.salt.constants.FullWidthProductCardConstants
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.callback.DeleteCallback
import com.intellihealth.truemeds.data.model.search.SearchBottomSheetModel
import com.intellihealth.truemeds.databinding.SearchResultRvItemBinding
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxItemAdded
import com.intellihealth.truemeds.presentation.bottomsheet.search.RemoveProductBottomSheet
import com.intellihealth.truemeds.presentation.model.ProductInfoModel
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.CommonFunc.isSingleClickParam
import com.intellihealth.truemeds.presentation.viewmodel.SearchViewModel
import com.intellihealth.truemeds.presentation.viewmodel.events.Event

class SearchResultAdapter(
    var items: List<ProductInfoModel>,
    var viewmodel: SearchViewModel,
    var fragmentManager: FragmentManager
) :
    RecyclerView.Adapter<SearchResultAdapter.MedicineViewHolder>() {

        init {
            setHasStableIds(true)
        }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MedicineViewHolder {
        val binding: SearchResultRvItemBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.search_result_rv_item, parent, false
        )
        return MedicineViewHolder(binding)
    }

    override fun getItemId(position: Int): Long {
        return (position+1).toLong()//(items[position].product.productCode).hashCode().toLong()
    }

    override fun onBindViewHolder(holder: MedicineViewHolder, position: Int) {

        val item = items[position].toSdkObject()
        item.product.switchBackProductCode = null

        val stepperCallbackProduct = object : StepperCallback {
            override fun deleteAlert() {
                val removeProductBottomSheet = RemoveProductBottomSheet(object : DeleteCallback {
                    override fun yesClick() {
                        if (SharedPrefManager.getInstance().incompleteOrderId > 0) {

                            viewmodel.selectedMedicineProductCode = item.product.productCode
                            viewmodel.isSubs = false
                            viewmodel.isDelete.postValue(Event(true))

                        } else {
                            viewmodel.deleteMedicineFromCart(item.product.productCode, false)
                        }
                    }

                })
                removeProductBottomSheet.isCancelable = true
                if (!removeProductBottomSheet.isVisible)
//                    removeProductBottomSheet.setBottomSheet(viewModel)
                    removeProductBottomSheet.show(
                        fragmentManager, "Discard unsaved details?"
                    )

            }

            override fun cartItemPlus(qty: Int) {
                var itemAdded = MxItemAdded()
                itemAdded.clickedOnPage = "search_result"
                itemAdded.sectionIndex = position + 1
                itemAdded.pageSection = "main"
//                itemAdded.clickedSuggestionType =
//                if (qty == 1) viewmodel.sendItemAddedEvent(items[position],null,null, itemAdded)
                if (qty == 0) {
                    /**
                     * ORG-SUBS compare bottom sheet
                     * **/

                    if (isSingleClickParam(800L)) {
                        viewmodel.selectedMedicineDetails = items[position]
                        viewmodel.selectedMedicineIndex = position
                        viewmodel.launchSearchBS(SearchBottomSheetModel(items, item, position))
                    }

                } else {
                    if (qty == 1) {
                        viewmodel.addMedicine(items[position], false, position)
                    } else {
                        viewmodel.updateCartMedicineQty(item.product?.productCode!!, qty)
                    }
                }
            }

            override fun cartItemMinus(qty: Int) {
                if (qty == 0) {
                    viewmodel.deleteMedicineFromCart(item.product?.productCode!!, false)
                } else {
                    viewmodel.updateCartMedicineQty(item.product?.productCode!!, qty)
                }
            }

            override fun stepperError(msg: String?) { }
        }
    
    
        val subStepperCallbackProduct = object : StepperCallback {

            override fun deleteAlert() {
                val removeProductBottomSheet = RemoveProductBottomSheet(object : DeleteCallback {
                    override fun yesClick() {
                        if (SharedPrefManager.getInstance().incompleteOrderId > 0) {

                            viewmodel.selectedMedicineProductCode = item.suggestion?.productCode!!
                            viewmodel.isSubs = true
                            viewmodel.isDelete.postValue(Event(true))

                        } else {
                            viewmodel.deleteMedicineFromCart(item.suggestion?.productCode!!, true)
                        }
                    }

                })
                removeProductBottomSheet.isCancelable = true
                if (!removeProductBottomSheet.isVisible)
//                    removeProductBottomSheet.setBottomSheet(viewModel)
                    removeProductBottomSheet.show(
                        fragmentManager, "Discard unsaved details?"
                    )

            }

            override fun cartItemPlus(qty: Int) {
                if (qty == 1) {
                    var itemAdded = MxItemAdded()
                    itemAdded.clickedOnPage = "search_result"
                    itemAdded.sectionIndex = position + 1
                    itemAdded.pageSection = "main"
                    viewmodel.addMedicine(items[position], true, position)
//                    viewmodel.sendItemAddedEvent(items[position],null,null, itemAdded)
                } else {
                    viewmodel.updateCartMedicineQty(item.suggestion?.productCode!!, qty)
                }
                viewmodel.updateOrgAvailableOfCartMedicine(item.suggestion?.productCode!!, item.suggestion?.isAvailable!!)
            }
        
            override fun cartItemMinus(qty: Int) {
                if (qty == 0) {
                    viewmodel.deleteMedicineFromCart(item.suggestion?.productCode!!, true)
                } else {
                    viewmodel.updateCartMedicineQty(item.suggestion?.productCode!!, qty)
                }
//                viewmodel.reloadSearchResultList(items)
            }
        
            override fun stepperError(msg: String?) { }
        }

        val fullWidthCallback = object : FullWidthProductCardCallback {
            override fun removeButtonClick(productCode: String) {
                Log.d("qwerty", "$productCode")
            }

            override fun switchBackOrg(productCode: String, switchBackAvailability: Boolean) {
                Log.d("qwerty", "$productCode")
            }

            override fun substituteCheck(productCode: String) {

                if (isSingleClickParam(800L)) {
                    viewmodel.selectedMedicineDetails = items[position]
                    viewmodel.selectedMedicineIndex = position
                    viewmodel.launchSearchSubsBS(SearchBottomSheetModel(items, item, position))
                }

            }

            override fun productClick(productCode:String) {
                viewmodel.isSubsClicked = false
                viewmodel.selectedMedicineDetails = items[position]
                viewmodel.selectedMedicineIndex = position
                viewmodel.launchPDPage.value = Event(item)
                Log.d("qwerty", "productClick")
            }

            override fun suggestionClick(productCode:String) {
                viewmodel.isSubsClicked = true
                viewmodel.selectedMedicineDetails = items[position]
                viewmodel.selectedMedicineIndex = position
                viewmodel.launchPDPage.value = Event(item)

                Log.d("qwerty", "suggestionClick")
            }
        }

        item.product?.let {
            it.callback = stepperCallbackProduct
            it.productCallback = fullWidthCallback

            item.cardType = FullWidthProductCardConstants.SEARCH
        }

        if (item.suggestion != null) {

            item.suggestion?.let {
                if (it.qty!! > 0)
                    item.cardType = FullWidthProductCardConstants.SUBS_ADDED

                item.isDisplayAddIcon = item.suggestion?.qty == 0

//                if (item.product?.productCode != it.productCode) {
//                    item.isDisplayAddIcon = true
//                } else {
//                    item.isDisplayAddIcon = false
//                }

                it.callback = subStepperCallbackProduct
                it.productCallback = fullWidthCallback

            }
        }

//        if (item.product.availabilityStatus != null &&
//            item.suggestion != null &&
//            item.suggestion?.availabilityStatus == null) {
//            item.product.availabilityStatus = null
//        }
        if (item.product.subsFound) {
            if (item.suggestion?.qty == 0)
                item.product.availabilityStatus = null
        }

        holder.binding.productInfoModel = item

        holder.binding.viewmodel = viewmodel
        holder.binding.index = position
//        holder.binding.executePendingBindings()
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class MedicineViewHolder(binding: SearchResultRvItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        var binding: SearchResultRvItemBinding

        init {
            this.binding = binding
            binding.fwcSRP.shouldCallbackBeforeDelete(true)
        }
    }
}